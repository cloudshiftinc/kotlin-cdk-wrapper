package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ContainerImageConfig {
    /** Specifies the name of the container image. */
    public fun imageName(): String

    /** Specifies the credentials used to access the image repository. */
    public fun repositoryCredentials(): CfnTaskDefinition.RepositoryCredentialsProperty? =
        unwrap(this)
            .getRepositoryCredentials()
            ?.let(CfnTaskDefinition.RepositoryCredentialsProperty::wrap)

    /** A builder for [ContainerImageConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param imageName Specifies the name of the container image. */
        public fun imageName(imageName: String)

        /**
         * @param repositoryCredentials Specifies the credentials used to access the image
         *   repository.
         */
        public fun repositoryCredentials(
            repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty
        )

        /**
         * @param repositoryCredentials Specifies the credentials used to access the image
         *   repository.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("704681dd811a822b2e0438e0f17288bbcba9e6e94dc71bd6d03cc13fa5434d08")
        public fun repositoryCredentials(
            repositoryCredentials:
                CfnTaskDefinition.RepositoryCredentialsProperty.Builder.() -> Unit
        )
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerImageConfig.Builder =
            software.amazon.awscdk.services.ecs.ContainerImageConfig.builder()

        /** @param imageName Specifies the name of the container image. */
        override fun imageName(imageName: String) {
            cdkBuilder.imageName(imageName)
        }

        /**
         * @param repositoryCredentials Specifies the credentials used to access the image
         *   repository.
         */
        override fun repositoryCredentials(
            repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty
        ) {
            cdkBuilder.repositoryCredentials(
                repositoryCredentials.let(CfnTaskDefinition.RepositoryCredentialsProperty::unwrap)
            )
        }

        /**
         * @param repositoryCredentials Specifies the credentials used to access the image
         *   repository.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("704681dd811a822b2e0438e0f17288bbcba9e6e94dc71bd6d03cc13fa5434d08")
        override fun repositoryCredentials(
            repositoryCredentials:
                CfnTaskDefinition.RepositoryCredentialsProperty.Builder.() -> Unit
        ): Unit =
            repositoryCredentials(
                CfnTaskDefinition.RepositoryCredentialsProperty(repositoryCredentials)
            )

        public fun build(): software.amazon.awscdk.services.ecs.ContainerImageConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.ContainerImageConfig,
    ) : ContainerImageConfig {
        /** Specifies the name of the container image. */
        override fun imageName(): String = unwrap(this).getImageName()

        /** Specifies the credentials used to access the image repository. */
        override fun repositoryCredentials(): CfnTaskDefinition.RepositoryCredentialsProperty? =
            unwrap(this)
                .getRepositoryCredentials()
                ?.let(CfnTaskDefinition.RepositoryCredentialsProperty::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ContainerImageConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.ContainerImageConfig
        ): ContainerImageConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ContainerImageConfig
        ): software.amazon.awscdk.services.ecs.ContainerImageConfig = (wrapped as Wrapper).cdkObject
    }
}
