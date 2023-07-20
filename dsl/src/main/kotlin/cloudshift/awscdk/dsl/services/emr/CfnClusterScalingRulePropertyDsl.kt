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
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterScalingRulePropertyDsl {
    private val cdkBuilder: CfnCluster.ScalingRuleProperty.Builder =
        CfnCluster.ScalingRuleProperty.builder()

    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    public fun action(action: CfnCluster.ScalingActionProperty) {
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

    public fun trigger(trigger: CfnCluster.ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): CfnCluster.ScalingRuleProperty = cdkBuilder.build()
}
