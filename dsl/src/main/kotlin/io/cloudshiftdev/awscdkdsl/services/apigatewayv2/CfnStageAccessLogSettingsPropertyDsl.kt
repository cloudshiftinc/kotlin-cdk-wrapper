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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnStage

/**
 * Settings for logging access in a stage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * AccessLogSettingsProperty accessLogSettingsProperty = AccessLogSettingsProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html)
 */
@CdkDslMarker
public class CfnStageAccessLogSettingsPropertyDsl {
    private val cdkBuilder: CfnStage.AccessLogSettingsProperty.Builder =
        CfnStage.AccessLogSettingsProperty.builder()

    /**
     * @param destinationArn The ARN of the CloudWatch Logs log group to receive access logs. This
     *   parameter is required to enable access logging.
     */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * @param format A single line format of the access logs of data, as specified by selected
     *   $context variables. The format must include at least $context.requestId. This parameter is
     *   required to enable access logging.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnStage.AccessLogSettingsProperty = cdkBuilder.build()
}
