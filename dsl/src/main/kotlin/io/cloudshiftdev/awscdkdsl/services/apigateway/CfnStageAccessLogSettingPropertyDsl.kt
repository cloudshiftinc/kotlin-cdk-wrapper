@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnStage

/**
 * The `AccessLogSetting` property type specifies settings for logging access in this stage.
 *
 * `AccessLogSetting` is a property of the
 * [AWS::ApiGateway::Stage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * AccessLogSettingProperty accessLogSettingProperty = AccessLogSettingProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html)
 */
@CdkDslMarker
public class CfnStageAccessLogSettingPropertyDsl {
    private val cdkBuilder: CfnStage.AccessLogSettingProperty.Builder =
        CfnStage.AccessLogSettingProperty.builder()

    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
     *   Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data
     *   Firehose delivery stream, the stream name must begin with `amazon-apigateway-` . This
     *   parameter is required to enable access logging.
     */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * @param format A single line format of the access logs of data, as specified by selected
     *   [$context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference)
     *   . The format must include at least `$context.requestId` . This parameter is required to
     *   enable access logging.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnStage.AccessLogSettingProperty = cdkBuilder.build()
}
