@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResolverQueryLoggingConfigAssociationProps {
  public fun resolverQueryLogConfigId(): String? = unwrap(this).getResolverQueryLogConfigId()

  public fun resourceId(): String? = unwrap(this).getResourceId()

  @CdkDslMarker
  public interface Builder {
    public fun resolverQueryLogConfigId(resolverQueryLogConfigId: String)

    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps.Builder
        =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps.builder()

    override fun resolverQueryLogConfigId(resolverQueryLogConfigId: String) {
      cdkBuilder.resolverQueryLogConfigId(resolverQueryLogConfigId)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps,
  ) : CdkObject(cdkObject), CfnResolverQueryLoggingConfigAssociationProps {
    override fun resolverQueryLogConfigId(): String? = unwrap(this).getResolverQueryLogConfigId()

    override fun resourceId(): String? = unwrap(this).getResourceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnResolverQueryLoggingConfigAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps):
        CfnResolverQueryLoggingConfigAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverQueryLoggingConfigAssociationProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
  }
}
