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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTargetGroupTargetPropertyDsl {
    private val cdkBuilder: CfnTargetGroup.TargetProperty.Builder =
        CfnTargetGroup.TargetProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnTargetGroup.TargetProperty = cdkBuilder.build()
}
