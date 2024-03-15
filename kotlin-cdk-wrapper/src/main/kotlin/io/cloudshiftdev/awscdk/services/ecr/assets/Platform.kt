@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * platform supported by docker.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAsset;
 * import io.cloudshiftdev.awscdk.services.ecr.assets.Platform;
 * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
 * .directory(join(__dirname, "my-image"))
 * .platform(Platform.LINUX_ARM64)
 * .build();
 * ```
 */
public open class Platform internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.assets.Platform,
) : CdkObject(cdkObject) {
  /**
   * The platform to use for docker build.
   */
  public open fun platform(): String = unwrap(this).getPlatform()

  public companion object {
    public val LINUX_AMD64: Platform =
        Platform.wrap(software.amazon.awscdk.services.ecr.assets.Platform.LINUX_AMD64)

    public val LINUX_ARM64: Platform =
        Platform.wrap(software.amazon.awscdk.services.ecr.assets.Platform.LINUX_ARM64)

    public fun custom(platform: String): Platform =
        software.amazon.awscdk.services.ecr.assets.Platform.custom(platform).let(Platform::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.Platform): Platform =
        Platform(cdkObject)

    internal fun unwrap(wrapped: Platform): software.amazon.awscdk.services.ecr.assets.Platform =
        wrapped.cdkObject
  }
}
