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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

/**
 * `QuotaSettings` is a property of the
 * [AWS::ApiGateway::UsagePlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
 * resource that specifies a target for the maximum number of requests users can make to your REST
 * APIs.
 *
 * In some cases clients can exceed the targets that you set. Don’t rely on usage plans to control
 * costs. Consider using
 * [AWS Budgets](https://docs.aws.amazon.com/cost-management/latest/userguide/budgets-managing-costs.html)
 * to monitor costs and
 * [AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) to manage API
 * requests.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * QuotaSettingsProperty quotaSettingsProperty = QuotaSettingsProperty.builder()
 * .limit(123)
 * .offset(123)
 * .period("period")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html)
 */
@CdkDslMarker
public class CfnUsagePlanQuotaSettingsPropertyDsl {
    private val cdkBuilder: CfnUsagePlan.QuotaSettingsProperty.Builder =
        CfnUsagePlan.QuotaSettingsProperty.builder()

    /**
     * @param limit The target maximum number of requests that can be made in a given time period.
     */
    public fun limit(limit: Number) {
        cdkBuilder.limit(limit)
    }

    /**
     * @param offset The number of requests subtracted from the given limit in the initial time
     *   period.
     */
    public fun offset(offset: Number) {
        cdkBuilder.offset(offset)
    }

    /**
     * @param period The time period in which the limit applies. Valid values are "DAY", "WEEK" or
     *   "MONTH".
     */
    public fun period(period: String) {
        cdkBuilder.period(period)
    }

    public fun build(): CfnUsagePlan.QuotaSettingsProperty = cdkBuilder.build()
}
