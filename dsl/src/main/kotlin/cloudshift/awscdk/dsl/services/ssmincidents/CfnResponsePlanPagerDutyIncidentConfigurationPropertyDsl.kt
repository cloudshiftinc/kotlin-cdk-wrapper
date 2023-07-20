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
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import kotlin.String

@CdkDslMarker
public class CfnResponsePlanPagerDutyIncidentConfigurationPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.PagerDutyIncidentConfigurationProperty.Builder =
        CfnResponsePlan.PagerDutyIncidentConfigurationProperty.builder()

    public fun serviceId(serviceId: String) {
        cdkBuilder.serviceId(serviceId)
    }

    public fun build(): CfnResponsePlan.PagerDutyIncidentConfigurationProperty = cdkBuilder.build()
}
