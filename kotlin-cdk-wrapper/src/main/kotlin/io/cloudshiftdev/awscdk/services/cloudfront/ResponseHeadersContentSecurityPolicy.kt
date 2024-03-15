@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ResponseHeadersContentSecurityPolicy {
  public fun contentSecurityPolicy(): String

  public fun `override`(): Boolean

  @CdkDslMarker
  public interface Builder {
    public fun contentSecurityPolicy(contentSecurityPolicy: String)

    public fun `override`(`override`: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy.builder()

    override fun contentSecurityPolicy(contentSecurityPolicy: String) {
      cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
    }

    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy,
  ) : CdkObject(cdkObject), ResponseHeadersContentSecurityPolicy {
    override fun contentSecurityPolicy(): String = unwrap(this).getContentSecurityPolicy()

    override fun `override`(): Boolean = unwrap(this).getOverride()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ResponseHeadersContentSecurityPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy):
        ResponseHeadersContentSecurityPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersContentSecurityPolicy):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy
  }
}
