package io.cloudshiftdev.awscdk.services.batch

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class EksVolume
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.batch.EksVolume,
) {
    /**
     * The path on the container where the container is mounted.
     *
     * Default: - the container is not mounted
     */
    public open fun containerPath(): String? = unwrap(this).getContainerPath()

    /**
     * The name of this volume.
     *
     * The name must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     */
    public open fun name(): String = unwrap(this).getName()

    /**
     * If specified, the container has readonly access to the volume.
     *
     * Otherwise, the container has read/write access.
     *
     * Default: false
     */
    public open fun readonly(): Boolean? = unwrap(this).getReadonly()

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.batch.EksVolume,
    ) : EksVolume(cdkObject)

    public companion object {
        public fun emptyDir(options: EmptyDirVolumeOptions): EmptyDirVolume =
            software.amazon.awscdk.services.batch.EksVolume.emptyDir(
                    options.let(EmptyDirVolumeOptions::unwrap)
                )
                .let(EmptyDirVolume::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0ae1832762c3127e0e05d541ea4cba3764c37519105a107aad48b067132a74d4")
        public fun emptyDir(options: EmptyDirVolumeOptions.Builder.() -> Unit): EmptyDirVolume =
            emptyDir(EmptyDirVolumeOptions(options))

        public fun hostPath(options: HostPathVolumeOptions): HostPathVolume =
            software.amazon.awscdk.services.batch.EksVolume.hostPath(
                    options.let(HostPathVolumeOptions::unwrap)
                )
                .let(HostPathVolume::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("692a144b01fcc0811c2286d0149b788499597a81b3e35cc359a858dad73286ea")
        public fun hostPath(options: HostPathVolumeOptions.Builder.() -> Unit): HostPathVolume =
            hostPath(HostPathVolumeOptions(options))

        public fun secret(options: SecretPathVolumeOptions): SecretPathVolume =
            software.amazon.awscdk.services.batch.EksVolume.secret(
                    options.let(SecretPathVolumeOptions::unwrap)
                )
                .let(SecretPathVolume::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9bd0e018010b8d5a5e4df6bae9a74a65f9da8a9df40bd564d76983979797c0b1")
        public fun secret(options: SecretPathVolumeOptions.Builder.() -> Unit): SecretPathVolume =
            secret(SecretPathVolumeOptions(options))

        internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksVolume): EksVolume =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: EksVolume): software.amazon.awscdk.services.batch.EksVolume =
            (wrapped as Wrapper).cdkObject
    }
}
