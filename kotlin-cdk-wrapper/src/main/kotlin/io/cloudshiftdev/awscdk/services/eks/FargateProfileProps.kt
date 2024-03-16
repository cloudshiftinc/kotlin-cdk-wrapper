@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Configuration props for EKS Fargate Profiles.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * FargateProfile.Builder.create(this, "MyProfile")
 * .cluster(cluster)
 * .selectors(List.of(Selector.builder().namespace("default").build()))
 * .build();
 * ```
 */
public interface FargateProfileProps : FargateProfileOptions {
  /**
   * The EKS cluster to apply the Fargate profile to.
   *
   * [disable-awslint:ref-via-interface]
   */
  public fun cluster(): Cluster

  /**
   * A builder for [FargateProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The EKS cluster to apply the Fargate profile to. 
     * [disable-awslint:ref-via-interface]
     */
    public fun cluster(cluster: Cluster)

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
    @JvmName("9a997a48a3638c6ff919a08dcc1c5b303d38fa9a7324399264409bcfc62ce5ac")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param vpc The VPC from which to select subnets to launch your pods into.
     * By default, all private subnets are selected. You can customize this using
     * `subnetSelection`.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.FargateProfileProps.Builder =
        software.amazon.awscdk.services.eks.FargateProfileProps.builder()

    /**
     * @param cluster The EKS cluster to apply the Fargate profile to. 
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

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
    @JvmName("9a997a48a3638c6ff919a08dcc1c5b303d38fa9a7324399264409bcfc62ce5ac")
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

    public fun build(): software.amazon.awscdk.services.eks.FargateProfileProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.FargateProfileProps,
  ) : CdkObject(cdkObject), FargateProfileProps {
    /**
     * The EKS cluster to apply the Fargate profile to.
     *
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(): Cluster = unwrap(this).getCluster().let(Cluster::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): FargateProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.FargateProfileProps):
        FargateProfileProps = CdkObjectWrappers.wrap(cdkObject) as FargateProfileProps

    internal fun unwrap(wrapped: FargateProfileProps):
        software.amazon.awscdk.services.eks.FargateProfileProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.FargateProfileProps
  }
}
