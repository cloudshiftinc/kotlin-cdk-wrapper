@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String

public open class CacheControl internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.deployment.CacheControl,
) : CdkObject(cdkObject) {
  public open fun `value`(): Any = unwrap(this).getValue()

  public companion object {
    public fun fromString(s: String): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.fromString(s).let(CacheControl::wrap)

    public fun immutable(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.immutable().let(CacheControl::wrap)

    public fun maxAge(t: Duration): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.maxAge(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public fun mustRevalidate(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.mustRevalidate().let(CacheControl::wrap)

    public fun mustUnderstand(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.mustUnderstand().let(CacheControl::wrap)

    public fun noCache(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.noCache().let(CacheControl::wrap)

    public fun noStore(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.noStore().let(CacheControl::wrap)

    public fun noTransform(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.noTransform().let(CacheControl::wrap)

    public fun `private`(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.setPrivate().let(CacheControl::wrap)

    public fun proxyRevalidate(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.proxyRevalidate().let(CacheControl::wrap)

    public fun `public`(): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.setPublic().let(CacheControl::wrap)

    public fun sMaxAge(t: Duration): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.sMaxAge(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public fun staleIfError(t: Duration): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.staleIfError(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public fun staleWhileRevalidate(t: Duration): CacheControl =
        software.amazon.awscdk.services.s3.deployment.CacheControl.staleWhileRevalidate(t.let(Duration::unwrap)).let(CacheControl::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.CacheControl):
        CacheControl = CacheControl(cdkObject)

    internal fun unwrap(wrapped: CacheControl):
        software.amazon.awscdk.services.s3.deployment.CacheControl = wrapped.cdkObject
  }
}
