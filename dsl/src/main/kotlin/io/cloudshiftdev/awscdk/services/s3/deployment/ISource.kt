package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ISource {
    /**
     * Binds the source to a bucket deployment.
     *
     * @param scope The construct tree context.
     * @param context
     */
    public fun bind(scope: Construct): SourceConfig

    /**
     * Binds the source to a bucket deployment.
     *
     * @param scope The construct tree context.
     * @param context
     */
    public fun bind(scope: Construct, context: DeploymentSourceContext): SourceConfig

    /**
     * Binds the source to a bucket deployment.
     *
     * @param scope The construct tree context.
     * @param context
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c74ab7b3dbc4afb550f71f4c55a9031c91cd50dd6eb18151c81c70e8d6e8f10f")
    public fun bind(
        scope: Construct,
        context: DeploymentSourceContext.Builder.() -> Unit
    ): SourceConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.deployment.ISource,
    ) : ISource {
        /**
         * Binds the source to a bucket deployment.
         *
         * @param scope The construct tree context.
         * @param context
         */
        override fun bind(scope: Construct): SourceConfig =
            unwrap(this).bind(scope.let(Construct::unwrap)).let(SourceConfig::wrap)

        /**
         * Binds the source to a bucket deployment.
         *
         * @param scope The construct tree context.
         * @param context
         */
        override fun bind(scope: Construct, context: DeploymentSourceContext): SourceConfig =
            unwrap(this)
                .bind(scope.let(Construct::unwrap), context.let(DeploymentSourceContext::unwrap))
                .let(SourceConfig::wrap)

        /**
         * Binds the source to a bucket deployment.
         *
         * @param scope The construct tree context.
         * @param context
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c74ab7b3dbc4afb550f71f4c55a9031c91cd50dd6eb18151c81c70e8d6e8f10f")
        override fun bind(
            scope: Construct,
            context: DeploymentSourceContext.Builder.() -> Unit
        ): SourceConfig = bind(scope, DeploymentSourceContext(context))
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.deployment.ISource
        ): ISource = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ISource
        ): software.amazon.awscdk.services.s3.deployment.ISource = (wrapped as Wrapper).cdkObject
    }
}
