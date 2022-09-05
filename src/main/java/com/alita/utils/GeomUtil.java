package com.alita.utils;

import org.geolatte.geom.ByteBuffer;
import org.geolatte.geom.ByteOrder;
import org.geolatte.geom.Geometry;
import org.geolatte.geom.codec.Wkb;
import org.geolatte.geom.codec.WkbDecoder;
import org.geolatte.geom.codec.WkbEncoder;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKBWriter;
import org.locationtech.jts.io.WKTReader;

/**
 * @description: geom工具类
 * @author: Luancx
 * @date: 2022/9/5
 */
public class GeomUtil {
    private static WKTReader reader = new WKTReader();
    private static WKBWriter writer = new WKBWriter();
    private static WkbEncoder wkbEncoder = Wkb.newEncoder(Wkb.Dialect.POSTGIS_EWKB_1);
    private static WkbDecoder decoder = Wkb.newDecoder(Wkb.Dialect.POSTGIS_EWKB_1);

    /**
     * 根据经纬度生成字符串点位
     *
     * @param x 经度
     * @param y 纬度
     * @return 点位
     * @throws ParseException 格式异常
     */
    public static Geometry<?> getPointGeom(double x, double y) throws ParseException {
        org.locationtech.jts.geom.Geometry read = reader.read("POINT(" + x + " " + y + ")");
        byte[] write1 = writer.write(read);
        return Wkb.fromWkb(ByteBuffer.from(write1));
    }

    /**
     * 编码
     *
     * @param geom geom
     * @return 二进制点位
     */
    public static String geomEncode(Geometry<?> geom) {
        ByteBuffer encode = wkbEncoder.encode(geom, ByteOrder.NDR);
        return encode.toString();
    }

    /**
     * 二进制点位转换为Geom
     *
     * @param geomStr 点位
     * @return geom
     */
    public static Geometry<?> geomDecode(String geomStr) {
        return decoder.decode(ByteBuffer.from(geomStr));
    }

    public static String getGeomStr(double x, double y) throws ParseException {
        return geomEncode(getPointGeom(x, y));
    }
}
