package cn.iocoder.yudao.module.system.controller.admin.dict.vo.type;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 字典类型分页列表 Request VO")
@Data
public class DictTypeExportReqVO {

    @Schema(description = "字典类型名称", example = "芋道", notes = "模糊匹配")
    private String name;

    @Schema(description = "字典类型", example = "sys_common_sex", notes = "模糊匹配")
    private String type;

    @Schema(description = "展示状态", example = "1", notes = "参见 CommonStatusEnum 枚举类")
    private Integer status;

    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @Schema(description = "创建时间")
    private LocalDateTime[] createTime;

}