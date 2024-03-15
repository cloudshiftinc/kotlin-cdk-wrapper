@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Options for defining EKS Fargate Profiles.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * cluster.addFargateProfile("MyProfile", FargateProfileOptions.builder()
 * .selectors(List.of(Selector.builder().namespace("default").build()))
 * .build());
 * ```
 */
public interface FargateProfileOptions {
  /**
   * The name of the Fargate profile.
   *
   * Default: - generated
   */
  public fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

  /**
   * The pod execution role to use for pods that match the selectors in the Fargate profile.
   *
   * The pod execution role allows Fargate infrastructure to
   * register with your cluster as a node, and it provides read access to Amazon
   * ECR image repositories.
   *
   * Default: - a role will be automatically created
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
   */
  public fun podExecutionRole(): IRole? = unwrap(this).getPodExecutionRole()?.let(IRole::wrap)

  /**
   * The selectors to match for pods to use this Fargate profile.
   *
   * Each selector
   * must have an associated namespace. Optionally, you can also specify labels
   * for a namespace.
   *
   * At least one selector is required and you may specify up to five selectors.
   */
  public fun selectors(): List<Selector>

  /**
   * Select which subnets to launch your pods into.
   *
   * At this time, pods running
   * on Fargate are not assigned public IP addresses, so only private subnets
   * (with no direct route to an Internet Gateway) are allowed.
   *
   * You must specify the VPC to customize the subnet selection
   *
   * Default: - all private subnets of the VPC are selected.
   */
  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  /**
   * The VPC from which to select subnets to launch your pods into.
   *
   * By default, all private subnets are selected. You can customize this using
   * `subnetSelection`.
   *
   * Default: - all private subnets used by the EKS cluster
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [FargateProfileOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fargateProfileName The name of the Fargate profile.
     */
    public fun fargateProfileName(fargateProfileName: String)

    /**
     * @param podExecutionRole The pod execution role to use for pods that match the selectors in
     * the Fargate profile.
     * The pod execution role allows Fargate infrastructure to
     * register with your cluster as a node, and it provides read access to Amazon
     * ECR image repositories.
     */
    public fun podExecutionRole(podExecutionRole: IRole)

    /**
     * @param selectors The selectors to match for pods to use this Fargate profile. 
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     */
    public fun selectors(selectors: List<Selector>)

    /**
     * @param selectors The selectors to match for pods to use this Fargate profile. 
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     */
    public fun selectors(vararg selectors: Selector)

    /**
     * @param subnetSelection Select which subnets to launch your pods into.
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection Select which subnets to launch your pods into.
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db16441754435e26f78724e7bd2f2f0fd32b678b39e2d709a60c4eaba05aa400")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param vpc The VPC from which to select subnets to launch your pods into.
     * By default, all private subnets are selected. You can customize this using
     * `subnetSelection`.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.FargateProfileOptions.Builder =
        software.amazon.awscdk.services.eks.FargateProfileOptions.builder()

    /**
     * @param fargateProfileName The name of the Fargate profile.
     */
    override fun fargateProfileName(fargateProfileName: String) {
      cdkBuilder.fargateProfileName(fargateProfileName)
    }

    /**
     * @param podExecutionRole The pod execution role to use for pods that match the selectors in
     * the Fargate profile.
     * The pod execution role allows Fargate infrastructure to
     * register with your cluster as a node, and it provides read access to Amazon
     * ECR image repositories.
     */
    override fun podExecutionRole(podExecutionRole: IRole) {
      cdkBuilder.podExecutionRole(podExecutionRole.let(IRole::unwrap))
    }

    /**
     * @param selectors The selectors to match for pods to use this Fargate profile. 
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     */
    override fun selectors(selectors: List<Selector>) {
      cdkBuilder.selectors(selectors.map(Selector::unwrap))
    }

    /**
     * @param selectors The selectors to match for pods to use this Fargate profile. 
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     */
    override fun selectors(vararg selectors: Selector): Unit = selectors(selectors.toList())

    /**
     * @param subnetSelection Select which subnets to launch your pods into.
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnetSelection Select which subnets to launch your pods into.
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db16441754435e26f78724e7bd2f2f0fd32b678b39e2d709a60c4eaba05aa400")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param vpc The VPC from which to select subnets to launch your pods into.
     * By default, all private subnets are selected. You can customize this using
     * `subnetSelection`.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.FargateProfileOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.FargateProfileOptions,
  ) : CdkObject(cdkObject), FargateProfileOptions {
    /**
     * The name of the Fargate profile.
     *
     * Default: - generated
     */
    override fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

    /**
     * The pod execution role to use for pods that match the selectors in the Fargate profile.
     *
     * The pod execution role allows Fargate infrastructure to
     * register with your cluster as a node, and it provides read access to Amazon
     * ECR image repositories.
     *
     * Default: - a role will be automatically created
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     */
    override fun podExecutionRole(): IRole? = unwrap(this).getPodExecutionRole()?.let(IRole::wrap)

    /**
     * The selectors to match for pods to use this Fargate profile.
     *
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     */
    override fun selectors(): List<Selector> = unwrap(this).getSelectors().map(Selector::wrap)

    /**
     * Select which subnets to launch your pods into.
     *
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     *
     * Default: - all private subnets of the VPC are selected.
     */
    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    /**
     * The VPC from which to select subnets to launch your pods into.
     *
     * By default, all private subnets are selected. You can customize this using
     * `subnetSelection`.
     *
     * Default: - all private subnets used by the EKS cluster
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FargateProfileOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.FargateProfileOptions):
        FargateProfileOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateProfileOptions):
        software.amazon.awscdk.services.eks.FargateProfileOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.FargateProfileOptions
  }
}
