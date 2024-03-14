package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverRuleAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrResolverRuleAssociationId(): String =
      unwrap(this).getAttrResolverRuleAssociationId()

  public open fun attrResolverRuleId(): String = unwrap(this).getAttrResolverRuleId()

  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun resolverRuleId(): String = unwrap(this).getResolverRuleId()

  public open fun resolverRuleId(`value`: String) {
    unwrap(this).setResolverRuleId(`value`)
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun name(name: String)

    public fun resolverRuleId(resolverRuleId: String)

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

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resolverRuleId(resolverRuleId: String) {
      cdkBuilder.resolverRuleId(resolverRuleId)
    }

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
