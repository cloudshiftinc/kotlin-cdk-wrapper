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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnListenerForwardConfigPropertyDsl {
    private val cdkBuilder: CfnListener.ForwardConfigProperty.Builder =
        CfnListener.ForwardConfigProperty.builder()

    private val _targetGroups: MutableList<Any> = mutableListOf()

    public fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig)
    }

    public fun targetGroupStickinessConfig(targetGroupStickinessConfig: CfnListener.TargetGroupStickinessConfigProperty) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig)
    }

    public fun targetGroups(vararg targetGroups: Any) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    public fun targetGroups(targetGroups: Collection<Any>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups)
    }

    public fun build(): CfnListener.ForwardConfigProperty {
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
