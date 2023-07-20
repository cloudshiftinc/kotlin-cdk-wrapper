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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.AutoScalingGroupOptions
import software.amazon.awscdk.services.eks.BootstrapOptions
import software.amazon.awscdk.services.eks.MachineImageType
import kotlin.Boolean
import kotlin.Unit

@CdkDslMarker
public class AutoScalingGroupOptionsDsl {
    private val cdkBuilder: AutoScalingGroupOptions.Builder = AutoScalingGroupOptions.builder()

    public fun bootstrapEnabled(bootstrapEnabled: Boolean) {
        cdkBuilder.bootstrapEnabled(bootstrapEnabled)
    }

    public fun bootstrapOptions(block: BootstrapOptionsDsl.() -> Unit = {}) {
        val builder = BootstrapOptionsDsl()
        builder.apply(block)
        cdkBuilder.bootstrapOptions(builder.build())
    }

    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
        cdkBuilder.bootstrapOptions(bootstrapOptions)
    }

    public fun machineImageType(machineImageType: MachineImageType) {
        cdkBuilder.machineImageType(machineImageType)
    }

    public fun mapRole(mapRole: Boolean) {
        cdkBuilder.mapRole(mapRole)
    }

    public fun spotInterruptHandler(spotInterruptHandler: Boolean) {
        cdkBuilder.spotInterruptHandler(spotInterruptHandler)
    }

    public fun build(): AutoScalingGroupOptions = cdkBuilder.build()
}
