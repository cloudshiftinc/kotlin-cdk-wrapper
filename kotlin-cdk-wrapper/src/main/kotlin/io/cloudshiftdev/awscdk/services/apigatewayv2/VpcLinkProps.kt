@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for a VpcLink.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration;
 * Vpc vpc = new Vpc(this, "VPC");
 * ApplicationLoadBalancer alb = ApplicationLoadBalancer.Builder.create(this,
 * "AppLoadBalancer").vpc(vpc).build();
 * VpcLink vpcLink = VpcLink.Builder.create(this, "VpcLink").vpc(vpc).build();
 * // Creating an HTTP ALB Integration:
 * HttpAlbIntegration albIntegration = HttpAlbIntegration.Builder.create("ALBIntegration",
 * alb.getListeners()[0]).build();
 * ```
 */
public interface VpcLinkProps {
  /**
   * A list of security groups for the VPC link.
   *
   * Default: - no security groups. Use `addSecurityGroups` to add security groups
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * A list of subnets for the VPC link.
   *
   * Default: - private subnets of the provided VPC. Use `addSubnets` to add more subnets
   */
  public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

  /**
   * The VPC in which the private resources reside.
   */
  public fun vpc(): IVpc

  /**
   * The name used to label and identify the VPC link.
   *
   * Default: - automatically generated name
   */
  public fun vpcLinkName(): String? = unwrap(this).getVpcLinkName()

  /**
   * A builder for [VpcLinkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param securityGroups A list of security groups for the VPC link.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups A list of security groups for the VPC link.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param subnets A list of subnets for the VPC link.
     */
    public fun subnets(subnets: SubnetSelection)

    /**
     * @param subnets A list of subnets for the VPC link.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e860511c74b7bbc023d3141652ef1a77b25092644e6854afbf2c6f6f6b4a6a9b")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param vpc The VPC in which the private resources reside. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcLinkName The name used to label and identify the VPC link.
     */
    public fun vpcLinkName(vpcLinkName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.VpcLinkProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.VpcLinkProps.builder()

    /**
     * @param securityGroups A list of security groups for the VPC link.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups A list of security groups for the VPC link.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnets A list of subnets for the VPC link.
     */
    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnets A list of subnets for the VPC link.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e860511c74b7bbc023d3141652ef1a77b25092644e6854afbf2c6f6f6b4a6a9b")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    /**
     * @param vpc The VPC in which the private resources reside. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcLinkName The name used to label and identify the VPC link.
     */
    override fun vpcLinkName(vpcLinkName: String) {
      cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.VpcLinkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkProps,
  ) : CdkObject(cdkObject), VpcLinkProps {
    /**
     * A list of security groups for the VPC link.
     *
     * Default: - no security groups. Use `addSecurityGroups` to add security groups
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * A list of subnets for the VPC link.
     *
     * Default: - private subnets of the provided VPC. Use `addSubnets` to add more subnets
     */
    override fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    /**
     * The VPC in which the private resources reside.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * The name used to label and identify the VPC link.
     *
     * Default: - automatically generated name
     */
    override fun vpcLinkName(): String? = unwrap(this).getVpcLinkName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkProps):
        VpcLinkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcLinkProps):
        software.amazon.awscdk.services.apigatewayv2.VpcLinkProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.VpcLinkProps
  }
}
