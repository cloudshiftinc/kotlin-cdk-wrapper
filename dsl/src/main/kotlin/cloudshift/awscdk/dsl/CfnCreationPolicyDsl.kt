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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnCreationPolicy
import software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy
import software.amazon.awscdk.CfnResourceSignal
import kotlin.Boolean
import kotlin.Unit

@CdkDslMarker
public class CfnCreationPolicyDsl {
    private val cdkBuilder: CfnCreationPolicy.Builder = CfnCreationPolicy.builder()

    public fun autoScalingCreationPolicy(
        block: CfnResourceAutoScalingCreationPolicyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnResourceAutoScalingCreationPolicyDsl()
        builder.apply(block)
        cdkBuilder.autoScalingCreationPolicy(builder.build())
    }

    public fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy) {
        cdkBuilder.autoScalingCreationPolicy(autoScalingCreationPolicy)
    }

    public fun resourceSignal(block: CfnResourceSignalDsl.() -> Unit = {}) {
        val builder = CfnResourceSignalDsl()
        builder.apply(block)
        cdkBuilder.resourceSignal(builder.build())
    }

    public fun resourceSignal(resourceSignal: CfnResourceSignal) {
        cdkBuilder.resourceSignal(resourceSignal)
    }

    public fun startFleet(startFleet: Boolean) {
        cdkBuilder.startFleet(startFleet)
    }

    public fun build(): CfnCreationPolicy = cdkBuilder.build()
}
