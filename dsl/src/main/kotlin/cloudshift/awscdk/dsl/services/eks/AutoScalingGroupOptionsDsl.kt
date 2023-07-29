@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import software.amazon.awscdk.services.eks.AutoScalingGroupOptions
import software.amazon.awscdk.services.eks.BootstrapOptions
import software.amazon.awscdk.services.eks.MachineImageType

/**
 * Options for adding an AutoScalingGroup as capacity.
 *
 * Example:
 * ```
 * Cluster cluster;
 * AutoScalingGroup asg;
 * cluster.connectAutoScalingGroupCapacity(asg, AutoScalingGroupOptions.builder().build());
 * ```
 */
@CdkDslMarker
public class AutoScalingGroupOptionsDsl {
    private val cdkBuilder: AutoScalingGroupOptions.Builder = AutoScalingGroupOptions.builder()

    /**
     * @param bootstrapEnabled Configures the EC2 user-data script for instances in this autoscaling
     *   group to bootstrap the node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS
     *   cluster. If you wish to provide a custom user data script, set this to `false` and manually
     *   invoke `autoscalingGroup.addUserData()`.
     */
    public fun bootstrapEnabled(bootstrapEnabled: Boolean) {
        cdkBuilder.bootstrapEnabled(bootstrapEnabled)
    }

    /** @param bootstrapOptions Allows options for node bootstrapping through EC2 user data. */
    public fun bootstrapOptions(bootstrapOptions: BootstrapOptionsDsl.() -> Unit = {}) {
        val builder = BootstrapOptionsDsl()
        builder.apply(bootstrapOptions)
        cdkBuilder.bootstrapOptions(builder.build())
    }

    /** @param bootstrapOptions Allows options for node bootstrapping through EC2 user data. */
    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
        cdkBuilder.bootstrapOptions(bootstrapOptions)
    }

    /** @param machineImageType Allow options to specify different machine image type. */
    public fun machineImageType(machineImageType: MachineImageType) {
        cdkBuilder.machineImageType(machineImageType)
    }

    /**
     * @param mapRole Will automatically update the aws-auth ConfigMap to map the IAM instance role
     *   to RBAC. This cannot be explicitly set to `true` if the cluster has kubectl disabled.
     */
    public fun mapRole(mapRole: Boolean) {
        cdkBuilder.mapRole(mapRole)
    }

    /**
     * @param spotInterruptHandler Installs the AWS spot instance interrupt handler on the cluster
     *   if it's not already added. Only relevant if `spotPrice` is configured on the auto-scaling
     *   group.
     */
    public fun spotInterruptHandler(spotInterruptHandler: Boolean) {
        cdkBuilder.spotInterruptHandler(spotInterruptHandler)
    }

    public fun build(): AutoScalingGroupOptions = cdkBuilder.build()
}
