@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersStrictTransportSecurity {
  public fun accessControlMaxAge(): Duration

  public fun includeSubdomains(): Boolean? = unwrap(this).getIncludeSubdomains()

  public fun `override`(): Boolean

  public fun preload(): Boolean? = unwrap(this).getPreload()

  @CdkDslMarker
  public interface Builder {
    public fun accessControlMaxAge(accessControlMaxAge: Duration)

    public fun includeSubdomains(includeSubdomains: Boolean)

    public fun `override`(`override`: Boolean)

    public fun preload(preload: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.builder()

    override fun accessControlMaxAge(accessControlMaxAge: Duration) {
      cdkBuilder.accessControlMaxAge(accessControlMaxAge.let(Duration::unwrap))
    }

    override fun includeSubdomains(includeSubdomains: Boolean) {
      cdkBuilder.includeSubdomains(includeSubdomains)
    }

    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    override fun preload(preload: Boolean) {
      cdkBuilder.preload(preload)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity,
  ) : CdkObject(cdkObject), ResponseHeadersStrictTransportSecurity {
    override fun accessControlMaxAge(): Duration =
        unwrap(this).getAccessControlMaxAge().let(Duration::wrap)

    override fun includeSubdomains(): Boolean? = unwrap(this).getIncludeSubdomains()

    override fun `override`(): Boolean = unwrap(this).getOverride()

    override fun preload(): Boolean? = unwrap(this).getPreload()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ResponseHeadersStrictTransportSecurity {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity):
        ResponseHeadersStrictTransportSecurity = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersStrictTransportSecurity):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity
  }
}
