package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface RequestValidatorOptions {
    /**
     * The name of this request validator.
     *
     * Default: None
     */
    public fun requestValidatorName(): String? = unwrap(this).getRequestValidatorName()

    /**
     * Indicates whether to validate the request body according to the configured schema for the
     * targeted API and method.
     *
     * Default: false
     */
    public fun validateRequestBody(): Boolean? = unwrap(this).getValidateRequestBody()

    /**
     * Indicates whether to validate request parameters.
     *
     * Default: false
     */
    public fun validateRequestParameters(): Boolean? = unwrap(this).getValidateRequestParameters()

    /** A builder for [RequestValidatorOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param requestValidatorName The name of this request validator. */
        public fun requestValidatorName(requestValidatorName: String)

        /**
         * @param validateRequestBody Indicates whether to validate the request body according to
         *   the configured schema for the targeted API and method.
         */
        public fun validateRequestBody(validateRequestBody: Boolean)

        /** @param validateRequestParameters Indicates whether to validate request parameters. */
        public fun validateRequestParameters(validateRequestParameters: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigateway.RequestValidatorOptions.Builder =
            software.amazon.awscdk.services.apigateway.RequestValidatorOptions.builder()

        /** @param requestValidatorName The name of this request validator. */
        override fun requestValidatorName(requestValidatorName: String) {
            cdkBuilder.requestValidatorName(requestValidatorName)
        }

        /**
         * @param validateRequestBody Indicates whether to validate the request body according to
         *   the configured schema for the targeted API and method.
         */
        override fun validateRequestBody(validateRequestBody: Boolean) {
            cdkBuilder.validateRequestBody(validateRequestBody)
        }

        /** @param validateRequestParameters Indicates whether to validate request parameters. */
        override fun validateRequestParameters(validateRequestParameters: Boolean) {
            cdkBuilder.validateRequestParameters(validateRequestParameters)
        }

        public fun build(): software.amazon.awscdk.services.apigateway.RequestValidatorOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigateway.RequestValidatorOptions,
    ) : RequestValidatorOptions {
        /**
         * The name of this request validator.
         *
         * Default: None
         */
        override fun requestValidatorName(): String? = unwrap(this).getRequestValidatorName()

        /**
         * Indicates whether to validate the request body according to the configured schema for the
         * targeted API and method.
         *
         * Default: false
         */
        override fun validateRequestBody(): Boolean? = unwrap(this).getValidateRequestBody()

        /**
         * Indicates whether to validate request parameters.
         *
         * Default: false
         */
        override fun validateRequestParameters(): Boolean? =
            unwrap(this).getValidateRequestParameters()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): RequestValidatorOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.RequestValidatorOptions
        ): RequestValidatorOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: RequestValidatorOptions
        ): software.amazon.awscdk.services.apigateway.RequestValidatorOptions =
            (wrapped as Wrapper).cdkObject
    }
}
