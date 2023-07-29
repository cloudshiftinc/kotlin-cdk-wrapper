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

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

/**
 * The `AccessLogSettings` property overrides the access log settings for an API Gateway-managed
 * stage.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings.html)
 */
@CdkDslMarker
public class CfnApiGatewayManagedOverridesAccessLogSettingsPropertyDsl {
    private val cdkBuilder: CfnApiGatewayManagedOverrides.AccessLogSettingsProperty.Builder =
        CfnApiGatewayManagedOverrides.AccessLogSettingsProperty.builder()

    /** @param destinationArn The ARN of the CloudWatch Logs log group to receive access logs. */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * @param format A single line format of the access logs of data, as specified by selected
     *   $context variables. The format must include at least $context.requestId.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnApiGatewayManagedOverrides.AccessLogSettingsProperty = cdkBuilder.build()
}
