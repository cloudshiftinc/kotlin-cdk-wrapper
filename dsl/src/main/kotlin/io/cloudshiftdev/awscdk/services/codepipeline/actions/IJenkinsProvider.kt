package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IJenkinsProvider : IConstruct {
    /**  */
    public fun providerName(): String

    /**  */
    public fun serverUrl(): String

    /**  */
    public fun version(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider,
    ) : IJenkinsProvider {
        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /**  */
        override fun providerName(): String = unwrap(this).getProviderName()

        /**  */
        override fun serverUrl(): String = unwrap(this).getServerUrl()

        /**  */
        override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider
        ): IJenkinsProvider = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IJenkinsProvider
        ): software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider =
            (wrapped as Wrapper).cdkObject
    }
}
