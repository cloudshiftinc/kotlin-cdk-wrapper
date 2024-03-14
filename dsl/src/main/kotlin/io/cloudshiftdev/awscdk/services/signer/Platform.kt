package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class Platform internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.signer.Platform,
) : CdkObject(cdkObject) {
  /**
   * * The id of signing platform.
   */
  public open fun platformId(): String = unwrap(this).getPlatformId()

  public companion object {
    public fun of(platformId: String): Platform =
        software.amazon.awscdk.services.signer.Platform.of(platformId).let(Platform::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.Platform): Platform =
        Platform(cdkObject)

    internal fun unwrap(wrapped: Platform): software.amazon.awscdk.services.signer.Platform =
        wrapped.cdkObject
  }
}