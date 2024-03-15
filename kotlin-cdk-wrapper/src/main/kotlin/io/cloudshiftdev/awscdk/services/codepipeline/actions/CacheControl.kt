@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class CacheControl internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CacheControl,
) : CdkObject(cdkObject) {
  public open fun `value`(): String = unwrap(this).getValue()

  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  public companion object {
    public fun fromString(s: String): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.fromString(s).let(CacheControl::wrap)

    public fun immutable(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.immutable().let(CacheControl::wrap)

    public fun maxAge(t: Duration): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.maxAge(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public fun mustRevalidate(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.mustRevalidate().let(CacheControl::wrap)

    public fun mustUnderstand(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.mustUnderstand().let(CacheControl::wrap)

    public fun noCache(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.noCache().let(CacheControl::wrap)

    public fun noStore(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.noStore().let(CacheControl::wrap)

    public fun noTransform(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.noTransform().let(CacheControl::wrap)

    public fun `private`(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.setPrivate().let(CacheControl::wrap)

    public fun proxyRevalidate(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.proxyRevalidate().let(CacheControl::wrap)

    public fun `public`(): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.setPublic().let(CacheControl::wrap)

    public fun sMaxAge(t: Duration): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.sMaxAge(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public fun staleIfError(t: Duration): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.staleIfError(t.let(Duration::unwrap)).let(CacheControl::wrap)

    public fun staleWhileRevalidate(t: Duration): CacheControl =
        software.amazon.awscdk.services.codepipeline.actions.CacheControl.staleWhileRevalidate(t.let(Duration::unwrap)).let(CacheControl::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CacheControl):
        CacheControl = CacheControl(cdkObject)

    internal fun unwrap(wrapped: CacheControl):
        software.amazon.awscdk.services.codepipeline.actions.CacheControl = wrapped.cdkObject
  }
}
