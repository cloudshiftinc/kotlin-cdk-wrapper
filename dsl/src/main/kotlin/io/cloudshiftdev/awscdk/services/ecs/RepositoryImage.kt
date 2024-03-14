package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

public open class RepositoryImage
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.RepositoryImage,
) : ContainerImage(cdkObject) {
    /**
     * Called when the image is used by a ContainerDefinition.
     *
     * @param scope
     * @param containerDefinition
     */
    public override fun bind(
        scope: Construct,
        containerDefinition: ContainerDefinition
    ): ContainerImageConfig =
        unwrap(this)
            .bind(
                scope.let(Construct::unwrap),
                containerDefinition.let(ContainerDefinition::unwrap)
            )
            .let(ContainerImageConfig::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.RepositoryImage]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The secret to expose to the container that contains the credentials for the image
         * repository.
         *
         * The supported value is the full ARN of an AWS Secrets Manager secret.
         *
         * @param credentials The secret to expose to the container that contains the credentials
         *   for the image repository.
         */
        public fun credentials(credentials: ISecret)
    }

    private class BuilderImpl(
        imageName: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.RepositoryImage.Builder =
            software.amazon.awscdk.services.ecs.RepositoryImage.Builder.create(imageName)

        /**
         * The secret to expose to the container that contains the credentials for the image
         * repository.
         *
         * The supported value is the full ARN of an AWS Secrets Manager secret.
         *
         * @param credentials The secret to expose to the container that contains the credentials
         *   for the image repository.
         */
        override fun credentials(credentials: ISecret) {
            cdkBuilder.credentials(credentials.let(ISecret::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ecs.RepositoryImage = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            imageName: String,
            block: Builder.() -> Unit = {}
        ): RepositoryImage {
            val builderImpl = BuilderImpl(imageName)
            return RepositoryImage(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.RepositoryImage
        ): RepositoryImage = RepositoryImage(cdkObject)

        internal fun unwrap(
            wrapped: RepositoryImage
        ): software.amazon.awscdk.services.ecs.RepositoryImage = wrapped.cdkObject
    }
}
