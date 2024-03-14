package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class HostPathVolume
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.batch.HostPathVolume,
) : EksVolume(cdkObject) {
    /**
     * The path of the file or directory on the host to mount into containers on the pod.
     *
     * *Note*: HothPath Volumes present many security risks, and should be avoided when possible.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
     */
    public open fun path(): String = unwrap(this).getPath()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.batch.HostPathVolume]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The path of the file or directory on the host to mount into containers on the pod.
         *
         * *Note*: HothPath Volumes present many security risks, and should be avoided when
         * possible.
         *
         * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
         *
         * @param hostPath The path of the file or directory on the host to mount into containers on
         *   the pod.
         */
        public fun hostPath(hostPath: String)

        /**
         * The path on the container where the volume is mounted.
         *
         * Default: - the volume is not mounted
         *
         * @param mountPath The path on the container where the volume is mounted.
         */
        public fun mountPath(mountPath: String)

        /**
         * The name of this volume.
         *
         * The name must be a valid DNS subdomain name.
         *
         * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
         *
         * @param name The name of this volume.
         */
        public fun name(name: String)

        /**
         * If specified, the container has readonly access to the volume.
         *
         * Otherwise, the container has read/write access.
         *
         * Default: false
         *
         * @param readonly If specified, the container has readonly access to the volume.
         */
        public fun readonly(readonly: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.batch.HostPathVolume.Builder =
            software.amazon.awscdk.services.batch.HostPathVolume.Builder.create()

        /**
         * The path of the file or directory on the host to mount into containers on the pod.
         *
         * *Note*: HothPath Volumes present many security risks, and should be avoided when
         * possible.
         *
         * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
         *
         * @param hostPath The path of the file or directory on the host to mount into containers on
         *   the pod.
         */
        override fun hostPath(hostPath: String) {
            cdkBuilder.hostPath(hostPath)
        }

        /**
         * The path on the container where the volume is mounted.
         *
         * Default: - the volume is not mounted
         *
         * @param mountPath The path on the container where the volume is mounted.
         */
        override fun mountPath(mountPath: String) {
            cdkBuilder.mountPath(mountPath)
        }

        /**
         * The name of this volume.
         *
         * The name must be a valid DNS subdomain name.
         *
         * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
         *
         * @param name The name of this volume.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * If specified, the container has readonly access to the volume.
         *
         * Otherwise, the container has read/write access.
         *
         * Default: false
         *
         * @param readonly If specified, the container has readonly access to the volume.
         */
        override fun readonly(readonly: Boolean) {
            cdkBuilder.readonly(readonly)
        }

        public fun build(): software.amazon.awscdk.services.batch.HostPathVolume =
            cdkBuilder.build()
    }

    public companion object {
        public fun isHostPathVolume(x: Any): Boolean =
            software.amazon.awscdk.services.batch.HostPathVolume.isHostPathVolume(x)

        public operator fun invoke(block: Builder.() -> Unit = {}): HostPathVolume {
            val builderImpl = BuilderImpl()
            return HostPathVolume(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.batch.HostPathVolume
        ): HostPathVolume = HostPathVolume(cdkObject)

        internal fun unwrap(
            wrapped: HostPathVolume
        ): software.amazon.awscdk.services.batch.HostPathVolume = wrapped.cdkObject
    }
}
