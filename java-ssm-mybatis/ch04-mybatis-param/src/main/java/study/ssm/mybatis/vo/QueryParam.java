package study.ssm.mybatis.vo;

/**
 * @author dhl
 * @datetime 2021/7/22  16:02
 */
public class QueryParam {
    private String paramName;
    private Integer paramAge;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public Integer getParamAge() {
        return paramAge;
    }

    public void setParamAge(Integer paramAge) {
        this.paramAge = paramAge;
    }
}