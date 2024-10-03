@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options for adding an AutoScalingGroup as capacity.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * AutoScalingGroup asg;
 * cluster.connectAutoScalingGroupCapacity(asg, AutoScalingGroupOptions.builder().build());
 * ```
 */
public interface AutoScalingGroupOptions {
  /**
   * Configures the EC2 user-data script for instances in this autoscaling group to bootstrap the
   * node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS cluster.
   *
   * If you wish to provide a custom user data script, set this to `false` and
   * manually invoke `autoscalingGroup.addUserData()`.
   *
   * Default: true
   */
  public fun bootstrapEnabled(): Boolean? = unwrap(this).getBootstrapEnabled()

  /**
   * Allows options for node bootstrapping through EC2 user data.
   *
   * Default: - default options
   */
  public fun bootstrapOptions(): BootstrapOptions? =
      unwrap(this).getBootstrapOptions()?.let(BootstrapOptions::wrap)

  /**
   * Allow options to specify different machine image type.
   *
   * Default: MachineImageType.AMAZON_LINUX_2
   */
  public fun machineImageType(): MachineImageType? =
      unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

  /**
   * Will automatically update the aws-auth ConfigMap to map the IAM instance role to RBAC.
   *
   * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
   *
   * Default: - true if the cluster has kubectl enabled (which is the default).
   */
  public fun mapRole(): Boolean? = unwrap(this).getMapRole()

  /**
   * Installs the AWS spot instance interrupt handler on the cluster if it's not already added.
   *
   * Only relevant if `spotPrice` is configured on the auto-scaling group.
   *
   * Default: true
   */
  public fun spotInterruptHandler(): Boolean? = unwrap(this).getSpotInterruptHandler()

  /**
   * A builder for [AutoScalingGroupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bootstrapEnabled Configures the EC2 user-data script for instances in this autoscaling
     * group to bootstrap the node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS
     * cluster.
     * If you wish to provide a custom user data script, set this to `false` and
     * manually invoke `autoscalingGroup.addUserData()`.
     */
    public fun bootstrapEnabled(bootstrapEnabled: Boolean)

    /**
     * @param bootstrapOptions Allows options for node bootstrapping through EC2 user data.
     */
    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions)

    /**
     * @param bootstrapOptions Allows options for node bootstrapping through EC2 user data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d4cc298e1a141bfe30c0688c4d52933f953d9ee9faabe7dce5297672fcb2ea6")
    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions.Builder.() -> Unit)

    /**
     * @param machineImageType Allow options to specify different machine image type.
     */
    public fun machineImageType(machineImageType: MachineImageType)

    /**
     * @param mapRole Will automatically update the aws-auth ConfigMap to map the IAM instance role
     * to RBAC.
     * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
     */
    public fun mapRole(mapRole: Boolean)

    /**
     * @param spotInterruptHandler Installs the AWS spot instance interrupt handler on the cluster
     * if it's not already added.
     * Only relevant if `spotPrice` is configured on the auto-scaling group.
     */
    public fun spotInterruptHandler(spotInterruptHandler: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AutoScalingGroupOptions.Builder =
        software.amazon.awscdk.services.eks.AutoScalingGroupOptions.builder()

    /**
     * @param bootstrapEnabled Configures the EC2 user-data script for instances in this autoscaling
     * group to bootstrap the node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS
     * cluster.
     * If you wish to provide a custom user data script, set this to `false` and
     * manually invoke `autoscalingGroup.addUserData()`.
     */
    override fun bootstrapEnabled(bootstrapEnabled: Boolean) {
      cdkBuilder.bootstrapEnabled(bootstrapEnabled)
    }

    /**
     * @param bootstrapOptions Allows options for node bootstrapping through EC2 user data.
     */
    override fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
      cdkBuilder.bootstrapOptions(bootstrapOptions.let(BootstrapOptions.Companion::unwrap))
    }

    /**
     * @param bootstrapOptions Allows options for node bootstrapping through EC2 user data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d4cc298e1a141bfe30c0688c4d52933f953d9ee9faabe7dce5297672fcb2ea6")
    override fun bootstrapOptions(bootstrapOptions: BootstrapOptions.Builder.() -> Unit): Unit =
        bootstrapOptions(BootstrapOptions(bootstrapOptions))

    /**
     * @param machineImageType Allow options to specify different machine image type.
     */
    override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType.Companion::unwrap))
    }

    /**
     * @param mapRole Will automatically update the aws-auth ConfigMap to map the IAM instance role
     * to RBAC.
     * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
     */
    override fun mapRole(mapRole: Boolean) {
      cdkBuilder.mapRole(mapRole)
    }

    /**
     * @param spotInterruptHandler Installs the AWS spot instance interrupt handler on the cluster
     * if it's not already added.
     * Only relevant if `spotPrice` is configured on the auto-scaling group.
     */
    override fun spotInterruptHandler(spotInterruptHandler: Boolean) {
      cdkBuilder.spotInterruptHandler(spotInterruptHandler)
    }

    public fun build(): software.amazon.awscdk.services.eks.AutoScalingGroupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AutoScalingGroupOptions,
  ) : CdkObject(cdkObject),
      AutoScalingGroupOptions {
    /**
     * Configures the EC2 user-data script for instances in this autoscaling group to bootstrap the
     * node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS cluster.
     *
     * If you wish to provide a custom user data script, set this to `false` and
     * manually invoke `autoscalingGroup.addUserData()`.
     *
     * Default: true
     */
    override fun bootstrapEnabled(): Boolean? = unwrap(this).getBootstrapEnabled()

    /**
     * Allows options for node bootstrapping through EC2 user data.
     *
     * Default: - default options
     */
    override fun bootstrapOptions(): BootstrapOptions? =
        unwrap(this).getBootstrapOptions()?.let(BootstrapOptions::wrap)

    /**
     * Allow options to specify different machine image type.
     *
     * Default: MachineImageType.AMAZON_LINUX_2
     */
    override fun machineImageType(): MachineImageType? =
        unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

    /**
     * Will automatically update the aws-auth ConfigMap to map the IAM instance role to RBAC.
     *
     * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
     *
     * Default: - true if the cluster has kubectl enabled (which is the default).
     */
    override fun mapRole(): Boolean? = unwrap(this).getMapRole()

    /**
     * Installs the AWS spot instance interrupt handler on the cluster if it's not already added.
     *
     * Only relevant if `spotPrice` is configured on the auto-scaling group.
     *
     * Default: true
     */
    override fun spotInterruptHandler(): Boolean? = unwrap(this).getSpotInterruptHandler()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingGroupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AutoScalingGroupOptions):
        AutoScalingGroupOptions = CdkObjectWrappers.wrap(cdkObject) as? AutoScalingGroupOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoScalingGroupOptions):
        software.amazon.awscdk.services.eks.AutoScalingGroupOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.AutoScalingGroupOptions
  }
}
