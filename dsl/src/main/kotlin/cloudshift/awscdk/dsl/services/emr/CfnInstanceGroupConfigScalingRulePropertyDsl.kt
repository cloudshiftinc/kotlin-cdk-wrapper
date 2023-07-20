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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import kotlin.String

@CdkDslMarker
public class CfnInstanceGroupConfigScalingRulePropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.ScalingRuleProperty.Builder =
        CfnInstanceGroupConfig.ScalingRuleProperty.builder()

    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    public fun action(action: CfnInstanceGroupConfig.ScalingActionProperty) {
        cdkBuilder.action(action)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun trigger(trigger: IResolvable) {
        cdkBuilder.trigger(trigger)
    }

    public fun trigger(trigger: CfnInstanceGroupConfig.ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): CfnInstanceGroupConfig.ScalingRuleProperty = cdkBuilder.build()
}
