package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.Duration
import kotlin.Any
import kotlin.String

public open class CacheControl internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.deployment.CacheControl,
) {
  public open fun `value`(): Any = unwrap(this).getValue()

  public companion object {
    public open fun fromString(s: String): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.fromString(s).let(CacheControl::wrap)

    public open fun immutable(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.immutable().let(CacheControl::wrap)

    public open fun maxAge(t: Duration): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.maxAge(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public open fun mustRevalidate(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.mustRevalidate().let(CacheControl::wrap)

    public open fun mustUnderstand(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.mustUnderstand().let(CacheControl::wrap)

    public open fun noCache(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.noCache().let(CacheControl::wrap)

    public open fun noStore(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.noStore().let(CacheControl::wrap)

    public open fun noTransform(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.noTransform().let(CacheControl::wrap)

    public open fun `private`(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.setPrivate().let(CacheControl::wrap)

    public open fun proxyRevalidate(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.proxyRevalidate().let(CacheControl::wrap)

    public open fun `public`(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.setPublic().let(CacheControl::wrap)

    public open fun sMaxAge(t: Duration): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.sMaxAge(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public open fun staleIfError(t: Duration): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.staleIfError(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public open fun staleWhileRevalidate(t: Duration): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.staleWhileRevalidate(t.let(Duration::unwrap)).let(CacheControl::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.CacheControl):
        CacheControl = CacheControl(cdkObject)

    internal fun unwrap(wrapped: CacheControl):
        software.amazon.awscdk.services.s3.deployment.CacheControl = wrapped.cdkObject
  }
}
