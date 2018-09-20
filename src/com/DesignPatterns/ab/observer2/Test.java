package com.DesignPatterns.ab.observer2;

/**
 * 
 * @author 88403097
 * @date 2018��9��20�� �Աȼ����裺 һ��ע�������Ĳ�ֻ࣬�����ǽӿڸĳɳ������� ���������޸�֪ͨ�۲���
 *       ���ڹ۲����Ѿ�ע������ˣ��������ǵ��������ʵ��������Ĳ����޸ĵķ������޸Ļ����ͳһ����ķ�����update����
 *       ֻ�������ʱ��update�ķ������������ʵ�������˶���������ĳ����ࣨ���ࣩ�У���Ϊ����Ե�����������ʵ�ֵ��ǽӿ�
 *       �����������Ǽ̳е��ǳ����࣬�۲�������ȫ������list�У�
 *       �������ʱ�����ǿ���ֱ�ӵ��ù۲��ߵ�ͳһ����ķ�����ʵ��֪ͨ�۲��ߵ�Ŀ���� �����������ǿ���ͨ��this�ؼ��֣�
 *       ��������ʵ���࣬�Ѳ�������ȥ�ˡ�
 *       
 *       
 *       1��������������ע�ᣬ�������list�з���۲���,
 *       2��Ȼ��������ⷢ���仯�����list��ȡ���۲��߲�����ͳһ����ķ���(update)��֪ͨ�۲��ߡ�
 */
public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // ������������
        // ��һ���൱��ע�ᣬͨ�����췽��
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        /*
         * ������������壬����WeatherData���󴫸����ǡ�
         */
        // ����仯��weatherData�仯֪ͨCurrentConditionsDisplay��StatisticsDisplay��ForecastDisplay�����仯
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
