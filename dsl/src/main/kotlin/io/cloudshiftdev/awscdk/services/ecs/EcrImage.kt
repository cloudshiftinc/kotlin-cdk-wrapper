package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class EcrImage
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.EcrImage,
) : ContainerImage(cdkObject) {
    /**
     * Called when the image is used by a ContainerDefinition.
     *
     * @param _scope
     * @param containerDefinition
     */
    public override fun bind(
        _scope: Construct,
        containerDefinition: ContainerDefinition
    ): ContainerImageConfig =
        unwrap(this)
            .bind(
                _scope.let(Construct::unwrap),
                containerDefinition.let(ContainerDefinition::unwrap)
            )
            .let(ContainerImageConfig::wrap)

    /**
     * The image name. Images in Amazon ECR repositories can be specified by either using the full
     * registry/repository:tag or registry/repository&#64;digest.
     *
     * For example, 012345678910.dkr.ecr.<region-name>.amazonaws.com/<repository-name>:latest or
     * 012345678910.dkr.ecr.<region-name>.amazonaws.com/<repository-name>&#64;sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE.
     */
    public open fun imageName(): String = unwrap(this).getImageName()

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcrImage): EcrImage =
            EcrImage(cdkObject)

        internal fun unwrap(wrapped: EcrImage): software.amazon.awscdk.services.ecs.EcrImage =
            wrapped.cdkObject
    }
}
