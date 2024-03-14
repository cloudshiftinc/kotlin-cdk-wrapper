package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class Platform internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.assets.Platform,
) : CdkObject(cdkObject) {
  /**
   * The platform to use for docker build.
   */
  public open fun platform(): String = unwrap(this).getPlatform()

  public companion object {
    public fun custom(platform: String): Platform =
        software.amazon.awscdk.services.ecr.assets.Platform.custom(platform).let(Platform::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.Platform): Platform =
        Platform(cdkObject)

    internal fun unwrap(wrapped: Platform): software.amazon.awscdk.services.ecr.assets.Platform =
        wrapped.cdkObject
  }
}
