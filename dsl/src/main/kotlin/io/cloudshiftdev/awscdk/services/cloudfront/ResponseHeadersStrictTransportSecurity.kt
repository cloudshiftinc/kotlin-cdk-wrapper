package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersStrictTransportSecurity {
  public fun accessControlMaxAge(): Duration

  public fun includeSubdomains(): Boolean? = unwrap(this).getIncludeSubdomains()

  public fun `override`(): Boolean

  public fun preload(): Boolean? = unwrap(this).getPreload()

  public interface Builder {
    public fun accessControlMaxAge(accessControlMaxAge: Duration) {
    }

    public fun includeSubdomains(includeSubdomains: Boolean) {
    }

    public fun `override`(`override`: Boolean) {
    }

    public fun preload(preload: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.builder()

    public override fun accessControlMaxAge(accessControlMaxAge: Duration) {
      cdkBuilder.accessControlMaxAge(accessControlMaxAge.let(Duration::unwrap))
    }

    public override fun includeSubdomains(includeSubdomains: Boolean) {
      cdkBuilder.includeSubdomains(includeSubdomains)
    }

    public override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    public override fun preload(preload: Boolean) {
      cdkBuilder.preload(preload)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity,
  ) : ResponseHeadersStrictTransportSecurity {
    public override fun accessControlMaxAge(): Duration =
        unwrap(this).getAccessControlMaxAge().let(Duration::wrap)

    public override fun includeSubdomains(): Boolean? = unwrap(this).getIncludeSubdomains()

    public override fun `override`(): Boolean = unwrap(this).getOverride()

    public override fun preload(): Boolean? = unwrap(this).getPreload()
  }

  public companion object {
    init {

    }

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
        as Wrapper).cdkObject
  }
}
