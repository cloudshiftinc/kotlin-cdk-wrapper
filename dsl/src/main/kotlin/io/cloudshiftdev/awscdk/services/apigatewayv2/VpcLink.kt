package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VpcLink internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLink,
) : Resource(cdkObject), IVpcLink {
  /**
   * Adds the provided security groups to the vpc link.
   *
   * @param groups 
   */
  public open fun addSecurityGroups(groups: ISecurityGroup) {
    unwrap(this).addSecurityGroups(groups.let(ISecurityGroup::unwrap))
  }

  /**
   * Adds the provided subnets to the vpc link.
   *
   * @param subnets 
   */
  public open fun addSubnets(subnets: ISubnet) {
    unwrap(this).addSubnets(subnets.let(ISubnet::unwrap))
  }

  /**
   * The VPC to which this VPC Link is associated with.
   */
  public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  /**
   * Physical ID of the VpcLink resource.
   */
  public override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.VpcLink].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of security groups for the VPC link.
     *
     * Default: - no security groups. Use `addSecurityGroups` to add security groups
     *
     * @param securityGroups A list of security groups for the VPC link. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * A list of security groups for the VPC link.
     *
     * Default: - no security groups. Use `addSecurityGroups` to add security groups
     *
     * @param securityGroups A list of security groups for the VPC link. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * A list of subnets for the VPC link.
     *
     * Default: - private subnets of the provided VPC. Use `addSubnets` to add more subnets
     *
     * @param subnets A list of subnets for the VPC link. 
     */
    public fun subnets(subnets: SubnetSelection)

    /**
     * A list of subnets for the VPC link.
     *
     * Default: - private subnets of the provided VPC. Use `addSubnets` to add more subnets
     *
     * @param subnets A list of subnets for the VPC link. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e9a30b66ec339f577be96e7497ab4fa16491a572bfd3f02c33f8af0ec3021eb")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    /**
     * The VPC in which the private resources reside.
     *
     * @param vpc The VPC in which the private resources reside. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * The name used to label and identify the VPC link.
     *
     * Default: - automatically generated name
     *
     * @param vpcLinkName The name used to label and identify the VPC link. 
     */
    public fun vpcLinkName(vpcLinkName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.VpcLink.Builder =
        software.amazon.awscdk.services.apigatewayv2.VpcLink.Builder.create(scope, id)

    /**
     * A list of security groups for the VPC link.
     *
     * Default: - no security groups. Use `addSecurityGroups` to add security groups
     *
     * @param securityGroups A list of security groups for the VPC link. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * A list of security groups for the VPC link.
     *
     * Default: - no security groups. Use `addSecurityGroups` to add security groups
     *
     * @param securityGroups A list of security groups for the VPC link. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * A list of subnets for the VPC link.
     *
     * Default: - private subnets of the provided VPC. Use `addSubnets` to add more subnets
     *
     * @param subnets A list of subnets for the VPC link. 
     */
    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    /**
     * A list of subnets for the VPC link.
     *
     * Default: - private subnets of the provided VPC. Use `addSubnets` to add more subnets
     *
     * @param subnets A list of subnets for the VPC link. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e9a30b66ec339f577be96e7497ab4fa16491a572bfd3f02c33f8af0ec3021eb")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    /**
     * The VPC in which the private resources reside.
     *
     * @param vpc The VPC in which the private resources reside. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * The name used to label and identify the VPC link.
     *
     * Default: - automatically generated name
     *
     * @param vpcLinkName The name used to label and identify the VPC link. 
     */
    override fun vpcLinkName(vpcLinkName: String) {
      cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.VpcLink = cdkBuilder.build()
  }

  public companion object {
    public fun fromVpcLinkAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcLinkAttributes,
    ): IVpcLink =
        software.amazon.awscdk.services.apigatewayv2.VpcLink.fromVpcLinkAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VpcLinkAttributes::unwrap)).let(IVpcLink::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9e78863e3435398a013c3a0826c825227d2aed3794e9cb063278a04cc32533a")
    public fun fromVpcLinkAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcLinkAttributes.Builder.() -> Unit,
    ): IVpcLink = fromVpcLinkAttributes(scope, id, VpcLinkAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpcLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpcLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLink): VpcLink =
        VpcLink(cdkObject)

    internal fun unwrap(wrapped: VpcLink): software.amazon.awscdk.services.apigatewayv2.VpcLink =
        wrapped.cdkObject
  }
}
