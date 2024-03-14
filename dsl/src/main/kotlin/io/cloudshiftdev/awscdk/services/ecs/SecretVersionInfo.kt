package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface SecretVersionInfo {
    /**
     * version id of the secret.
     *
     * Default: - use default version id
     */
    public fun versionId(): String? = unwrap(this).getVersionId()

    /**
     * version stage of the secret.
     *
     * Default: - use default version stage
     */
    public fun versionStage(): String? = unwrap(this).getVersionStage()

    /** A builder for [SecretVersionInfo] */
    @CdkDslMarker
    public interface Builder {
        /** @param versionId version id of the secret. */
        public fun versionId(versionId: String)

        /** @param versionStage version stage of the secret. */
        public fun versionStage(versionStage: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.SecretVersionInfo.Builder =
            software.amazon.awscdk.services.ecs.SecretVersionInfo.builder()

        /** @param versionId version id of the secret. */
        override fun versionId(versionId: String) {
            cdkBuilder.versionId(versionId)
        }

        /** @param versionStage version stage of the secret. */
        override fun versionStage(versionStage: String) {
            cdkBuilder.versionStage(versionStage)
        }

        public fun build(): software.amazon.awscdk.services.ecs.SecretVersionInfo =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.SecretVersionInfo,
    ) : SecretVersionInfo {
        /**
         * version id of the secret.
         *
         * Default: - use default version id
         */
        override fun versionId(): String? = unwrap(this).getVersionId()

        /**
         * version stage of the secret.
         *
         * Default: - use default version stage
         */
        override fun versionStage(): String? = unwrap(this).getVersionStage()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): SecretVersionInfo {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.SecretVersionInfo
        ): SecretVersionInfo = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: SecretVersionInfo
        ): software.amazon.awscdk.services.ecs.SecretVersionInfo = (wrapped as Wrapper).cdkObject
    }
}
