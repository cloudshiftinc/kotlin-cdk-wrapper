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
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTargetGroupTargetDescriptionPropertyDsl {
    private val cdkBuilder: CfnTargetGroup.TargetDescriptionProperty.Builder =
        CfnTargetGroup.TargetDescriptionProperty.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnTargetGroup.TargetDescriptionProperty = cdkBuilder.build()
}
