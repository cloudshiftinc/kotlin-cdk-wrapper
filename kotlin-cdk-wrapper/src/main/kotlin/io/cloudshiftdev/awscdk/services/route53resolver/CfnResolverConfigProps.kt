@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResolverConfigProps {
  public fun autodefinedReverseFlag(): String

  public fun resourceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun autodefinedReverseFlag(autodefinedReverseFlag: String)

    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps.builder()

    override fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
      cdkBuilder.autodefinedReverseFlag(autodefinedReverseFlag)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps,
  ) : CdkObject(cdkObject), CfnResolverConfigProps {
    override fun autodefinedReverseFlag(): String = unwrap(this).getAutodefinedReverseFlag()

    override fun resourceId(): String = unwrap(this).getResourceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps):
        CfnResolverConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverConfigProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps
  }
}
