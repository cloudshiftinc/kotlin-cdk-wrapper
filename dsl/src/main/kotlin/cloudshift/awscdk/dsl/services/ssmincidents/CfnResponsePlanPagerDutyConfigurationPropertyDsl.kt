@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import kotlin.String

@CdkDslMarker
public class CfnResponsePlanPagerDutyConfigurationPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.PagerDutyConfigurationProperty.Builder =
        CfnResponsePlan.PagerDutyConfigurationProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: IResolvable) {
        cdkBuilder.pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration)
    }

    public fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: CfnResponsePlan.PagerDutyIncidentConfigurationProperty) {
        cdkBuilder.pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration)
    }

    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    public fun build(): CfnResponsePlan.PagerDutyConfigurationProperty = cdkBuilder.build()
}
