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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class LoadBalancerTargetPropsDsl {
    private val cdkBuilder: LoadBalancerTargetProps.Builder = LoadBalancerTargetProps.builder()

    public fun targetJson(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.targetJson(builder.map)
    }

    public fun targetJson(targetJson: Any) {
        cdkBuilder.targetJson(targetJson)
    }

    public fun targetType(targetType: TargetType) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): LoadBalancerTargetProps = cdkBuilder.build()
}
