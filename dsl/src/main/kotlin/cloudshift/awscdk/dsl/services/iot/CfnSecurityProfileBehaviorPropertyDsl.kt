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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnSecurityProfileBehaviorPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.BehaviorProperty.Builder =
        CfnSecurityProfile.BehaviorProperty.builder()

    public fun criteria(criteria: IResolvable) {
        cdkBuilder.criteria(criteria)
    }

    public fun criteria(criteria: CfnSecurityProfile.BehaviorCriteriaProperty) {
        cdkBuilder.criteria(criteria)
    }

    public fun metric(metric: String) {
        cdkBuilder.metric(metric)
    }

    public fun metricDimension(metricDimension: IResolvable) {
        cdkBuilder.metricDimension(metricDimension)
    }

    public fun metricDimension(metricDimension: CfnSecurityProfile.MetricDimensionProperty) {
        cdkBuilder.metricDimension(metricDimension)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun suppressAlerts(suppressAlerts: Boolean) {
        cdkBuilder.suppressAlerts(suppressAlerts)
    }

    public fun suppressAlerts(suppressAlerts: IResolvable) {
        cdkBuilder.suppressAlerts(suppressAlerts)
    }

    public fun build(): CfnSecurityProfile.BehaviorProperty = cdkBuilder.build()
}
