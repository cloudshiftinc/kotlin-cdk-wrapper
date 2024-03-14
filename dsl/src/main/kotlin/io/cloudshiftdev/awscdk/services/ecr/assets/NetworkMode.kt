package io.cloudshiftdev.awscdk.services.ecr.assets

import kotlin.String

public open class NetworkMode
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecr.assets.NetworkMode,
) {
    /** The networking mode to use for docker build. */
    public open fun mode(): String = unwrap(this).getMode()

    public companion object {
        public fun custom(mode: String): NetworkMode =
            software.amazon.awscdk.services.ecr.assets.NetworkMode.custom(mode)
                .let(NetworkMode::wrap)

        public fun fromContainer(containerId: String): NetworkMode =
            software.amazon.awscdk.services.ecr.assets.NetworkMode.fromContainer(containerId)
                .let(NetworkMode::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecr.assets.NetworkMode
        ): NetworkMode = NetworkMode(cdkObject)

        internal fun unwrap(
            wrapped: NetworkMode
        ): software.amazon.awscdk.services.ecr.assets.NetworkMode = wrapped.cdkObject
    }
}
