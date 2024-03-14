package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface DeploymentController {
    /**
     * The deployment controller type to use.
     *
     * Default: DeploymentControllerType.ECS
     */
    public fun type(): DeploymentControllerType? =
        unwrap(this).getType()?.let(DeploymentControllerType::wrap)

    /** A builder for [DeploymentController] */
    @CdkDslMarker
    public interface Builder {
        /** @param type The deployment controller type to use. */
        public fun type(type: DeploymentControllerType)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentController.Builder =
            software.amazon.awscdk.services.ecs.DeploymentController.builder()

        /** @param type The deployment controller type to use. */
        override fun type(type: DeploymentControllerType) {
            cdkBuilder.type(type.let(DeploymentControllerType::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ecs.DeploymentController =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.DeploymentController,
    ) : DeploymentController {
        /**
         * The deployment controller type to use.
         *
         * Default: DeploymentControllerType.ECS
         */
        override fun type(): DeploymentControllerType? =
            unwrap(this).getType()?.let(DeploymentControllerType::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentController {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.DeploymentController
        ): DeploymentController = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DeploymentController
        ): software.amazon.awscdk.services.ecs.DeploymentController = (wrapped as Wrapper).cdkObject
    }
}
