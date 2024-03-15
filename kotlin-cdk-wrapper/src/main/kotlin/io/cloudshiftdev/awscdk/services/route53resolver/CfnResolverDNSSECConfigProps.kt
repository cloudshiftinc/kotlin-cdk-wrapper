@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResolverDNSSECConfigProps {
  public fun resourceId(): String? = unwrap(this).getResourceId()

  @CdkDslMarker
  public interface Builder {
    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps.builder()

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps,
  ) : CdkObject(cdkObject), CfnResolverDNSSECConfigProps {
    override fun resourceId(): String? = unwrap(this).getResourceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverDNSSECConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps):
        CfnResolverDNSSECConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverDNSSECConfigProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps
  }
}
