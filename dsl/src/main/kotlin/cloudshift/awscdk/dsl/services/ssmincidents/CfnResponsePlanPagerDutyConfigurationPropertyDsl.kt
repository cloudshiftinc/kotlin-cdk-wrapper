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

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * Details about the PagerDuty configuration for a response plan.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * PagerDutyConfigurationProperty pagerDutyConfigurationProperty =
 * PagerDutyConfigurationProperty.builder()
 * .name("name")
 * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
 * .serviceId("serviceId")
 * .build())
 * .secretId("secretId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html)
 */
@CdkDslMarker
public class CfnResponsePlanPagerDutyConfigurationPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.PagerDutyConfigurationProperty.Builder =
        CfnResponsePlan.PagerDutyConfigurationProperty.builder()

    /** @param name The name of the PagerDuty configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param pagerDutyIncidentConfiguration Details about the PagerDuty service associated with the
     *   configuration.
     */
    public fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: IResolvable) {
        cdkBuilder.pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration)
    }

    /**
     * @param pagerDutyIncidentConfiguration Details about the PagerDuty service associated with the
     *   configuration.
     */
    public fun pagerDutyIncidentConfiguration(
        pagerDutyIncidentConfiguration: CfnResponsePlan.PagerDutyIncidentConfigurationProperty
    ) {
        cdkBuilder.pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration)
    }

    /**
     * @param secretId The ID of the AWS Secrets Manager secret that stores your PagerDuty key,
     *   either a General Access REST API Key or User Token REST API Key, and other user
     *   credentials.
     */
    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    public fun build(): CfnResponsePlan.PagerDutyConfigurationProperty = cdkBuilder.build()
}
