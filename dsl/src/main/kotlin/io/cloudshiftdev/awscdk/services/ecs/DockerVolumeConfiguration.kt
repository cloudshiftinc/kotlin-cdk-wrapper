package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface DockerVolumeConfiguration {
    /**
     * Specifies whether the Docker volume should be created if it does not already exist.
     *
     * If true is specified, the Docker volume will be created for you.
     *
     * Default: false
     */
    public fun autoprovision(): Boolean? = unwrap(this).getAutoprovision()

    /** The Docker volume driver to use. */
    public fun driver(): String

    /**
     * A map of Docker driver-specific options passed through.
     *
     * Default: No options
     */
    public fun driverOpts(): Map<String, String> = unwrap(this).getDriverOpts() ?: emptyMap()

    /**
     * Custom metadata to add to your Docker volume.
     *
     * Default: No labels
     */
    public fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    /** The scope for the Docker volume that determines its lifecycle. */
    public fun scope(): Scope

    /** A builder for [DockerVolumeConfiguration] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param autoprovision Specifies whether the Docker volume should be created if it does not
         *   already exist. If true is specified, the Docker volume will be created for you.
         */
        public fun autoprovision(autoprovision: Boolean)

        /** @param driver The Docker volume driver to use. */
        public fun driver(driver: String)

        /** @param driverOpts A map of Docker driver-specific options passed through. */
        public fun driverOpts(driverOpts: Map<String, String>)

        /** @param labels Custom metadata to add to your Docker volume. */
        public fun labels(labels: Map<String, String>)

        /** @param scope The scope for the Docker volume that determines its lifecycle. */
        public fun scope(scope: Scope)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder =
            software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.builder()

        /**
         * @param autoprovision Specifies whether the Docker volume should be created if it does not
         *   already exist. If true is specified, the Docker volume will be created for you.
         */
        override fun autoprovision(autoprovision: Boolean) {
            cdkBuilder.autoprovision(autoprovision)
        }

        /** @param driver The Docker volume driver to use. */
        override fun driver(driver: String) {
            cdkBuilder.driver(driver)
        }

        /** @param driverOpts A map of Docker driver-specific options passed through. */
        override fun driverOpts(driverOpts: Map<String, String>) {
            cdkBuilder.driverOpts(driverOpts)
        }

        /** @param labels Custom metadata to add to your Docker volume. */
        override fun labels(labels: Map<String, String>) {
            cdkBuilder.labels(labels)
        }

        /** @param scope The scope for the Docker volume that determines its lifecycle. */
        override fun scope(scope: Scope) {
            cdkBuilder.scope(scope.let(Scope::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ecs.DockerVolumeConfiguration =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.DockerVolumeConfiguration,
    ) : DockerVolumeConfiguration {
        /**
         * Specifies whether the Docker volume should be created if it does not already exist.
         *
         * If true is specified, the Docker volume will be created for you.
         *
         * Default: false
         */
        override fun autoprovision(): Boolean? = unwrap(this).getAutoprovision()

        /** The Docker volume driver to use. */
        override fun driver(): String = unwrap(this).getDriver()

        /**
         * A map of Docker driver-specific options passed through.
         *
         * Default: No options
         */
        override fun driverOpts(): Map<String, String> = unwrap(this).getDriverOpts() ?: emptyMap()

        /**
         * Custom metadata to add to your Docker volume.
         *
         * Default: No labels
         */
        override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

        /** The scope for the Docker volume that determines its lifecycle. */
        override fun scope(): Scope = unwrap(this).getScope().let(Scope::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DockerVolumeConfiguration {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.DockerVolumeConfiguration
        ): DockerVolumeConfiguration = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DockerVolumeConfiguration
        ): software.amazon.awscdk.services.ecs.DockerVolumeConfiguration =
            (wrapped as Wrapper).cdkObject
    }
}
