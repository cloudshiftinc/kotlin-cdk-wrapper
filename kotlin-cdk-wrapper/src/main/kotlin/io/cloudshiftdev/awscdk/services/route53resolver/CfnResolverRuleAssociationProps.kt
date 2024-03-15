@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResolverRuleAssociationProps {
  public fun name(): String? = unwrap(this).getName()

  public fun resolverRuleId(): String

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun resolverRuleId(resolverRuleId: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resolverRuleId(resolverRuleId: String) {
      cdkBuilder.resolverRuleId(resolverRuleId)
    }

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
    override fun name(): String? = unwrap(this).getName()

    override fun resolverRuleId(): String = unwrap(this).getResolverRuleId()

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
