package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit
import kotlin.collections.List

public interface EcrDockerCredentialOptions {
    /**
     * An IAM role to assume prior to accessing the secret.
     *
     * Default: - none. The current execution role will be used.
     */
    public fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

    /**
     * Defines which stages of the pipeline should be granted access to these credentials.
     *
     * Default: - all relevant stages (synth, self-update, asset publishing) are granted access.
     */
    public fun usages(): List<DockerCredentialUsage> =
        unwrap(this).getUsages()?.map(DockerCredentialUsage::wrap) ?: emptyList()

    /** A builder for [EcrDockerCredentialOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param assumeRole An IAM role to assume prior to accessing the secret. */
        public fun assumeRole(assumeRole: IRole)

        /**
         * @param usages Defines which stages of the pipeline should be granted access to these
         *   credentials.
         */
        public fun usages(usages: List<DockerCredentialUsage>)

        /**
         * @param usages Defines which stages of the pipeline should be granted access to these
         *   credentials.
         */
        public fun usages(vararg usages: DockerCredentialUsage)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.pipelines.EcrDockerCredentialOptions.Builder =
            software.amazon.awscdk.pipelines.EcrDockerCredentialOptions.builder()

        /** @param assumeRole An IAM role to assume prior to accessing the secret. */
        override fun assumeRole(assumeRole: IRole) {
            cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
        }

        /**
         * @param usages Defines which stages of the pipeline should be granted access to these
         *   credentials.
         */
        override fun usages(usages: List<DockerCredentialUsage>) {
            cdkBuilder.usages(usages.map(DockerCredentialUsage::unwrap))
        }

        /**
         * @param usages Defines which stages of the pipeline should be granted access to these
         *   credentials.
         */
        override fun usages(vararg usages: DockerCredentialUsage): Unit = usages(usages.toList())

        public fun build(): software.amazon.awscdk.pipelines.EcrDockerCredentialOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.pipelines.EcrDockerCredentialOptions,
    ) : EcrDockerCredentialOptions {
        /**
         * An IAM role to assume prior to accessing the secret.
         *
         * Default: - none. The current execution role will be used.
         */
        override fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

        /**
         * Defines which stages of the pipeline should be granted access to these credentials.
         *
         * Default: - all relevant stages (synth, self-update, asset publishing) are granted access.
         */
        override fun usages(): List<DockerCredentialUsage> =
            unwrap(this).getUsages()?.map(DockerCredentialUsage::wrap) ?: emptyList()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): EcrDockerCredentialOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.pipelines.EcrDockerCredentialOptions
        ): EcrDockerCredentialOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: EcrDockerCredentialOptions
        ): software.amazon.awscdk.pipelines.EcrDockerCredentialOptions =
            (wrapped as Wrapper).cdkObject
    }
}
