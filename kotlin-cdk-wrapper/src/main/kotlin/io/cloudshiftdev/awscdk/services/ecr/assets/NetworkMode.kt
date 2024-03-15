@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class NetworkMode internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.assets.NetworkMode,
) : CdkObject(cdkObject) {
  public open fun mode(): String = unwrap(this).getMode()

  public companion object {
    public val DEFAULT: NetworkMode =
        NetworkMode.wrap(software.amazon.awscdk.services.ecr.assets.NetworkMode.DEFAULT)

    public val HOST: NetworkMode =
        NetworkMode.wrap(software.amazon.awscdk.services.ecr.assets.NetworkMode.HOST)

    public val NONE: NetworkMode =
        NetworkMode.wrap(software.amazon.awscdk.services.ecr.assets.NetworkMode.NONE)

    public fun custom(mode: String): NetworkMode =
        software.amazon.awscdk.services.ecr.assets.NetworkMode.custom(mode).let(NetworkMode::wrap)

    public fun fromContainer(containerId: String): NetworkMode =
        software.amazon.awscdk.services.ecr.assets.NetworkMode.fromContainer(containerId).let(NetworkMode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.NetworkMode):
        NetworkMode = NetworkMode(cdkObject)

    internal fun unwrap(wrapped: NetworkMode):
        software.amazon.awscdk.services.ecr.assets.NetworkMode = wrapped.cdkObject
  }
}
