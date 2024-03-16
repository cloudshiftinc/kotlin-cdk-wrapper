@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for configuring an EKS cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * KubernetesVersion kubernetesVersion;
 * Role role;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * CommonClusterOptions commonClusterOptions = CommonClusterOptions.builder()
 * .version(kubernetesVersion)
 * // the properties below are optional
 * .clusterName("clusterName")
 * .outputClusterName(false)
 * .outputConfigCommand(false)
 * .role(role)
 * .securityGroup(securityGroup)
 * .vpc(vpc)
 * .vpcSubnets(List.of(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build()))
 * .build();
 * ```
 */
public interface CommonClusterOptions {
  /**
   * Name for the cluster.
   *
   * Default: - Automatically generated name
   */
  public fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * Determines whether a CloudFormation output with the name of the cluster will be synthesized.
   *
   * Default: false
   */
  public fun outputClusterName(): Boolean? = unwrap(this).getOutputClusterName()

  /**
   * Determines whether a CloudFormation output with the `aws eks update-kubeconfig` command will be
   * synthesized.
   *
   * This command will include
   * the cluster name and, if applicable, the ARN of the masters IAM role.
   *
   * Default: true
   */
  public fun outputConfigCommand(): Boolean? = unwrap(this).getOutputConfigCommand()

  /**
   * Role that provides permissions for the Kubernetes control plane to make calls to AWS API
   * operations on your behalf.
   *
   * Default: - A role is automatically created for you
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Security Group to use for Control Plane ENIs.
   *
   * Default: - A security group is automatically created
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * The Kubernetes version to run in the cluster.
   */
  public fun version(): KubernetesVersion

  /**
   * The VPC in which to create the Cluster.
   *
   * Default: - a VPC with default configuration will be created and can be accessed through
   * `cluster.vpc`.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * Where to place EKS Control Plane ENIs.
   *
   * For example, to only select private subnets, supply the following:
   *
   * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
   *
   * Default: - All public and private subnets
   */
  public fun vpcSubnets(): List<SubnetSelection> =
      unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

  /**
   * A builder for [CommonClusterOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterName Name for the cluster.
     */
    public fun clusterName(clusterName: String)

    /**
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     * cluster will be synthesized.
     */
    public fun outputClusterName(outputClusterName: Boolean)

    /**
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     * update-kubeconfig` command will be synthesized.
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     */
    public fun outputConfigCommand(outputConfigCommand: Boolean)

    /**
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     * AWS API operations on your behalf.
     */
    public fun role(role: IRole)

    /**
     * @param securityGroup Security Group to use for Control Plane ENIs.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param version The Kubernetes version to run in the cluster. 
     */
    public fun version(version: KubernetesVersion)

    /**
     * @param vpc The VPC in which to create the Cluster.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CommonClusterOptions.Builder =
        software.amazon.awscdk.services.eks.CommonClusterOptions.builder()

    /**
     * @param clusterName Name for the cluster.
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     * cluster will be synthesized.
     */
    override fun outputClusterName(outputClusterName: Boolean) {
      cdkBuilder.outputClusterName(outputClusterName)
    }

    /**
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     * update-kubeconfig` command will be synthesized.
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     */
    override fun outputConfigCommand(outputConfigCommand: Boolean) {
      cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    /**
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     * AWS API operations on your behalf.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param securityGroup Security Group to use for Control Plane ENIs.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param version The Kubernetes version to run in the cluster. 
     */
    override fun version(version: KubernetesVersion) {
      cdkBuilder.version(version.let(KubernetesVersion::unwrap))
    }

    /**
     * @param vpc The VPC in which to create the Cluster.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.eks.CommonClusterOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CommonClusterOptions,
  ) : CdkObject(cdkObject), CommonClusterOptions {
    /**
     * Name for the cluster.
     *
     * Default: - Automatically generated name
     */
    override fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * Determines whether a CloudFormation output with the name of the cluster will be synthesized.
     *
     * Default: false
     */
    override fun outputClusterName(): Boolean? = unwrap(this).getOutputClusterName()

    /**
     * Determines whether a CloudFormation output with the `aws eks update-kubeconfig` command will
     * be synthesized.
     *
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     *
     * Default: true
     */
    override fun outputConfigCommand(): Boolean? = unwrap(this).getOutputConfigCommand()

    /**
     * Role that provides permissions for the Kubernetes control plane to make calls to AWS API
     * operations on your behalf.
     *
     * Default: - A role is automatically created for you
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Security Group to use for Control Plane ENIs.
     *
     * Default: - A security group is automatically created
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The Kubernetes version to run in the cluster.
     */
    override fun version(): KubernetesVersion =
        unwrap(this).getVersion().let(KubernetesVersion::wrap)

    /**
     * The VPC in which to create the Cluster.
     *
     * Default: - a VPC with default configuration will be created and can be accessed through
     * `cluster.vpc`.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Where to place EKS Control Plane ENIs.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     *
     * Default: - All public and private subnets
     */
    override fun vpcSubnets(): List<SubnetSelection> =
        unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonClusterOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CommonClusterOptions):
        CommonClusterOptions = CdkObjectWrappers.wrap(cdkObject) as CommonClusterOptions

    internal fun unwrap(wrapped: CommonClusterOptions):
        software.amazon.awscdk.services.eks.CommonClusterOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.CommonClusterOptions
  }
}
