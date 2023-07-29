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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

/**
 * `ThrottleSettings` is a property of the
 * [AWS::ApiGateway::UsagePlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
 * resource that specifies the overall request rate (average requests per second) and burst capacity
 * when users call your REST APIs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * ThrottleSettingsProperty throttleSettingsProperty = ThrottleSettingsProperty.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html)
 */
@CdkDslMarker
public class CfnUsagePlanThrottleSettingsPropertyDsl {
    private val cdkBuilder: CfnUsagePlan.ThrottleSettingsProperty.Builder =
        CfnUsagePlan.ThrottleSettingsProperty.builder()

    /**
     * @param burstLimit The API target request burst rate limit. This allows more requests through
     *   for a period of time than the target rate limit.
     */
    public fun burstLimit(burstLimit: Number) {
        cdkBuilder.burstLimit(burstLimit)
    }

    /** @param rateLimit The API target request rate limit. */
    public fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): CfnUsagePlan.ThrottleSettingsProperty = cdkBuilder.build()
}
