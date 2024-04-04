package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema to hold response ìnormation"
)
@Data @AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status code in the reponse"
    )
    private String statusCode;

    @Schema(
            description = "Status message in the reponse"
    )
    private String statusMsg;

}
