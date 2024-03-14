package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnResolverRuleAssociationProps {
  /**
   * The name of an association between a Resolver rule and a VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The ID of the Resolver rule that you associated with the VPC that is specified by `VPCId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-resolverruleid)
   */
  public fun resolverRuleId(): String

  /**
   * The ID of the VPC that you associated the Resolver rule with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnResolverRuleAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of an association between a Resolver rule and a VPC.
     */
    public fun name(name: String)

    /**
     * @param resolverRuleId The ID of the Resolver rule that you associated with the VPC that is
     * specified by `VPCId` . 
     */
    public fun resolverRuleId(resolverRuleId: String)

    /**
     * @param vpcId The ID of the VPC that you associated the Resolver rule with. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.builder()

    /**
     * @param name The name of an association between a Resolver rule and a VPC.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resolverRuleId The ID of the Resolver rule that you associated with the VPC that is
     * specified by `VPCId` . 
     */
    override fun resolverRuleId(resolverRuleId: String) {
      cdkBuilder.resolverRuleId(resolverRuleId)
    }

    /**
     * @param vpcId The ID of the VPC that you associated the Resolver rule with. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps,
  ) : CdkObject(cdkObject), CfnResolverRuleAssociationProps {
    /**
     * The name of an association between a Resolver rule and a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The ID of the Resolver rule that you associated with the VPC that is specified by `VPCId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-resolverruleid)
     */
    override fun resolverRuleId(): String = unwrap(this).getResolverRuleId()

    /**
     * The ID of the VPC that you associated the Resolver rule with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverRuleAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps):
        CfnResolverRuleAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverRuleAssociationProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps
  }
}
