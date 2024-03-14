package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CognitoDomainOptions {
    /** The prefix to the Cognito hosted domain name that will be associated with the user pool. */
    public fun domainPrefix(): String

    /** A builder for [CognitoDomainOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param domainPrefix The prefix to the Cognito hosted domain name that will be associated
         *   with the user pool.
         */
        public fun domainPrefix(domainPrefix: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cognito.CognitoDomainOptions.Builder =
            software.amazon.awscdk.services.cognito.CognitoDomainOptions.builder()

        /**
         * @param domainPrefix The prefix to the Cognito hosted domain name that will be associated
         *   with the user pool.
         */
        override fun domainPrefix(domainPrefix: String) {
            cdkBuilder.domainPrefix(domainPrefix)
        }

        public fun build(): software.amazon.awscdk.services.cognito.CognitoDomainOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cognito.CognitoDomainOptions,
    ) : CognitoDomainOptions {
        /**
         * The prefix to the Cognito hosted domain name that will be associated with the user pool.
         */
        override fun domainPrefix(): String = unwrap(this).getDomainPrefix()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): CognitoDomainOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.CognitoDomainOptions
        ): CognitoDomainOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: CognitoDomainOptions
        ): software.amazon.awscdk.services.cognito.CognitoDomainOptions =
            (wrapped as Wrapper).cdkObject
    }
}
