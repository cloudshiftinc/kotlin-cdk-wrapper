package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

public interface DeploymentSourceContext {
    /** The role for the handler. */
    public fun handlerRole(): IRole

    /** A builder for [DeploymentSourceContext] */
    @CdkDslMarker
    public interface Builder {
        /** @param handlerRole The role for the handler. */
        public fun handlerRole(handlerRole: IRole)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext.Builder =
            software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext.builder()

        /** @param handlerRole The role for the handler. */
        override fun handlerRole(handlerRole: IRole) {
            cdkBuilder.handlerRole(handlerRole.let(IRole::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext,
    ) : DeploymentSourceContext {
        /** The role for the handler. */
        override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentSourceContext {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext
        ): DeploymentSourceContext = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DeploymentSourceContext
        ): software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext =
            (wrapped as Wrapper).cdkObject
    }
}
