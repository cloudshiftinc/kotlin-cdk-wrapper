package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ContainerMountPoint : BaseMountPoint {
    /** A builder for [ContainerMountPoint] */
    @CdkDslMarker
    public interface Builder {
        /** @param containerPath The path on the container to mount the host volume at. */
        public fun containerPath(containerPath: String)

        /**
         * @param readOnly Specifies whether to give the container read-only access to the volume.
         *   If this value is true, the container has read-only access to the volume. If this value
         *   is false, then the container can write to the volume.
         */
        public fun readOnly(readOnly: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerMountPoint.Builder =
            software.amazon.awscdk.services.ecs.ContainerMountPoint.builder()

        /** @param containerPath The path on the container to mount the host volume at. */
        override fun containerPath(containerPath: String) {
            cdkBuilder.containerPath(containerPath)
        }

        /**
         * @param readOnly Specifies whether to give the container read-only access to the volume.
         *   If this value is true, the container has read-only access to the volume. If this value
         *   is false, then the container can write to the volume.
         */
        override fun readOnly(readOnly: Boolean) {
            cdkBuilder.readOnly(readOnly)
        }

        public fun build(): software.amazon.awscdk.services.ecs.ContainerMountPoint =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.ContainerMountPoint,
    ) : ContainerMountPoint {
        /** The path on the container to mount the host volume at. */
        override fun containerPath(): String = unwrap(this).getContainerPath()

        /**
         * Specifies whether to give the container read-only access to the volume.
         *
         * If this value is true, the container has read-only access to the volume. If this value is
         * false, then the container can write to the volume.
         */
        override fun readOnly(): Boolean = unwrap(this).getReadOnly()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ContainerMountPoint {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.ContainerMountPoint
        ): ContainerMountPoint = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ContainerMountPoint
        ): software.amazon.awscdk.services.ecs.ContainerMountPoint = (wrapped as Wrapper).cdkObject
    }
}
