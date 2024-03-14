package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverRuleAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of an association between a resolver rule and a VPC, such as `test.example.com in beta
   * VPC` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The ID of the resolver rule association that you want to get information about, such as
   * `rslvr-rrassoc-97242eaf88example` .
   */
  public open fun attrResolverRuleAssociationId(): String =
      unwrap(this).getAttrResolverRuleAssociationId()

  /**
   * The ID of the resolver rule that you associated with the VPC that is specified by `VPCId` ,
   * such as `rslvr-rr-5328a0899example` .
   */
  public open fun attrResolverRuleId(): String = unwrap(this).getAttrResolverRuleId()

  /**
   * The ID of the VPC that you associated the resolver rule with, such as `vpc-03cf94c75cexample` .
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of an association between a Resolver rule and a VPC.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of an association between a Resolver rule and a VPC.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ID of the Resolver rule that you associated with the VPC that is specified by `VPCId` .
   */
  public open fun resolverRuleId(): String = unwrap(this).getResolverRuleId()

  /**
   * The ID of the Resolver rule that you associated with the VPC that is specified by `VPCId` .
   */
  public open fun resolverRuleId(`value`: String) {
    unwrap(this).setResolverRuleId(`value`)
  }

  /**
   * The ID of the VPC that you associated the Resolver rule with.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC that you associated the Resolver rule with.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53resolver.CfnResolverRuleAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of an association between a Resolver rule and a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-name)
     * @param name The name of an association between a Resolver rule and a VPC. 
     */
    public fun name(name: String)

    /**
     * The ID of the Resolver rule that you associated with the VPC that is specified by `VPCId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-resolverruleid)
     * @param resolverRuleId The ID of the Resolver rule that you associated with the VPC that is
     * specified by `VPCId` . 
     */
    public fun resolverRuleId(resolverRuleId: String)

    /**
     * The ID of the VPC that you associated the Resolver rule with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-vpcid)
     * @param vpcId The ID of the VPC that you associated the Resolver rule with. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation.Builder.create(scope,
        id)

    /**
     * The name of an association between a Resolver rule and a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-name)
     * @param name The name of an association between a Resolver rule and a VPC. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ID of the Resolver rule that you associated with the VPC that is specified by `VPCId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-resolverruleid)
     * @param resolverRuleId The ID of the Resolver rule that you associated with the VPC that is
     * specified by `VPCId` . 
     */
    override fun resolverRuleId(resolverRuleId: String) {
      cdkBuilder.resolverRuleId(resolverRuleId)
    }

    /**
     * The ID of the VPC that you associated the Resolver rule with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-vpcid)
     * @param vpcId The ID of the VPC that you associated the Resolver rule with. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverRuleAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverRuleAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation):
        CfnResolverRuleAssociation = CfnResolverRuleAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnResolverRuleAssociation):
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation =
        wrapped.cdkObject
  }
}
