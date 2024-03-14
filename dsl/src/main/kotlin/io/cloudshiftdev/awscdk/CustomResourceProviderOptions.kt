package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CustomResourceProviderOptions {
    /**
     * A description of the function.
     *
     * Default: - No description.
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Key-value pairs that are passed to Lambda as Environment.
     *
     * Default: - No environment variables.
     */
    public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The amount of memory that your function has access to.
     *
     * Increasing the function's memory also increases its CPU allocation.
     *
     * Default: Size.mebibytes(128)
     */
    public fun memorySize(): Size? = unwrap(this).getMemorySize()?.let(Size::wrap)

    /**
     * A set of IAM policy statements to include in the inline policy of the provider's lambda
     * function.
     *
     * **Please note**: these are direct IAM JSON policy blobs, *not* `iam.PolicyStatement` objects
     * like you will see in the rest of the CDK.
     *
     * Default: - no additional inline policy
     *
     * Example:
     * ```
     * CustomResourceProvider provider = CustomResourceProvider.getOrCreateProvider(this,
     * "Custom::MyCustomResourceType", CustomResourceProviderProps.builder()
     * .codeDirectory(String.format("%s/my-handler", __dirname))
     * .runtime(CustomResourceProviderRuntime.NODEJS_18_X)
     * .policyStatements(List.of(Map.of(
     * "Effect", "Allow",
     * "Action", "s3:PutObject*",
     * "Resource", "*")))
     * .build());
     * ```
     */
    public fun policyStatements(): List<Any> = unwrap(this).getPolicyStatements() ?: emptyList()

    /**
     * AWS Lambda timeout for the provider.
     *
     * Default: Duration.minutes(15)
     */
    public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * Whether or not the cloudformation response wrapper (`nodejs-entrypoint.ts`) is used. If set
     * to `true`, `nodejs-entrypoint.js` is bundled in the same asset as the custom resource and set
     * as the entrypoint. If set to `false`, the custom resource provided is the entrypoint.
     *
     * Default: - `true` if `inlineCode: false` and `false` otherwise.
     */
    public fun useCfnResponseWrapper(): Boolean? = unwrap(this).getUseCfnResponseWrapper()

    /** A builder for [CustomResourceProviderOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param description A description of the function. */
        public fun description(description: String)

        /** @param environment Key-value pairs that are passed to Lambda as Environment. */
        public fun environment(environment: Map<String, String>)

        /**
         * @param memorySize The amount of memory that your function has access to. Increasing the
         *   function's memory also increases its CPU allocation.
         */
        public fun memorySize(memorySize: Size)

        /**
         * @param policyStatements A set of IAM policy statements to include in the inline policy of
         *   the provider's lambda function. **Please note**: these are direct IAM JSON policy
         *   blobs, *not* `iam.PolicyStatement` objects like you will see in the rest of the CDK.
         */
        public fun policyStatements(policyStatements: List<Any>)

        /**
         * @param policyStatements A set of IAM policy statements to include in the inline policy of
         *   the provider's lambda function. **Please note**: these are direct IAM JSON policy
         *   blobs, *not* `iam.PolicyStatement` objects like you will see in the rest of the CDK.
         */
        public fun policyStatements(vararg policyStatements: Any)

        /** @param timeout AWS Lambda timeout for the provider. */
        public fun timeout(timeout: Duration)

        /**
         * @param useCfnResponseWrapper Whether or not the cloudformation response wrapper
         *   (`nodejs-entrypoint.ts`) is used. If set to `true`, `nodejs-entrypoint.js` is bundled
         *   in the same asset as the custom resource and set as the entrypoint. If set to `false`,
         *   the custom resource provided is the entrypoint.
         */
        public fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.CustomResourceProviderOptions.Builder =
            software.amazon.awscdk.CustomResourceProviderOptions.builder()

        /** @param description A description of the function. */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /** @param environment Key-value pairs that are passed to Lambda as Environment. */
        override fun environment(environment: Map<String, String>) {
            cdkBuilder.environment(environment)
        }

        /**
         * @param memorySize The amount of memory that your function has access to. Increasing the
         *   function's memory also increases its CPU allocation.
         */
        override fun memorySize(memorySize: Size) {
            cdkBuilder.memorySize(memorySize.let(Size::unwrap))
        }

        /**
         * @param policyStatements A set of IAM policy statements to include in the inline policy of
         *   the provider's lambda function. **Please note**: these are direct IAM JSON policy
         *   blobs, *not* `iam.PolicyStatement` objects like you will see in the rest of the CDK.
         */
        override fun policyStatements(policyStatements: List<Any>) {
            cdkBuilder.policyStatements(policyStatements)
        }

        /**
         * @param policyStatements A set of IAM policy statements to include in the inline policy of
         *   the provider's lambda function. **Please note**: these are direct IAM JSON policy
         *   blobs, *not* `iam.PolicyStatement` objects like you will see in the rest of the CDK.
         */
        override fun policyStatements(vararg policyStatements: Any): Unit =
            policyStatements(policyStatements.toList())

        /** @param timeout AWS Lambda timeout for the provider. */
        override fun timeout(timeout: Duration) {
            cdkBuilder.timeout(timeout.let(Duration::unwrap))
        }

        /**
         * @param useCfnResponseWrapper Whether or not the cloudformation response wrapper
         *   (`nodejs-entrypoint.ts`) is used. If set to `true`, `nodejs-entrypoint.js` is bundled
         *   in the same asset as the custom resource and set as the entrypoint. If set to `false`,
         *   the custom resource provided is the entrypoint.
         */
        override fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
            cdkBuilder.useCfnResponseWrapper(useCfnResponseWrapper)
        }

        public fun build(): software.amazon.awscdk.CustomResourceProviderOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.CustomResourceProviderOptions,
    ) : CustomResourceProviderOptions {
        /**
         * A description of the function.
         *
         * Default: - No description.
         */
        override fun description(): String? = unwrap(this).getDescription()

        /**
         * Key-value pairs that are passed to Lambda as Environment.
         *
         * Default: - No environment variables.
         */
        override fun environment(): Map<String, String> =
            unwrap(this).getEnvironment() ?: emptyMap()

        /**
         * The amount of memory that your function has access to.
         *
         * Increasing the function's memory also increases its CPU allocation.
         *
         * Default: Size.mebibytes(128)
         */
        override fun memorySize(): Size? = unwrap(this).getMemorySize()?.let(Size::wrap)

        /**
         * A set of IAM policy statements to include in the inline policy of the provider's lambda
         * function.
         *
         * **Please note**: these are direct IAM JSON policy blobs, *not* `iam.PolicyStatement`
         * objects like you will see in the rest of the CDK.
         *
         * Default: - no additional inline policy
         *
         * Example:
         * ```
         * CustomResourceProvider provider = CustomResourceProvider.getOrCreateProvider(this,
         * "Custom::MyCustomResourceType", CustomResourceProviderProps.builder()
         * .codeDirectory(String.format("%s/my-handler", __dirname))
         * .runtime(CustomResourceProviderRuntime.NODEJS_18_X)
         * .policyStatements(List.of(Map.of(
         * "Effect", "Allow",
         * "Action", "s3:PutObject*",
         * "Resource", "*")))
         * .build());
         * ```
         */
        override fun policyStatements(): List<Any> =
            unwrap(this).getPolicyStatements() ?: emptyList()

        /**
         * AWS Lambda timeout for the provider.
         *
         * Default: Duration.minutes(15)
         */
        override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

        /**
         * Whether or not the cloudformation response wrapper (`nodejs-entrypoint.ts`) is used. If
         * set to `true`, `nodejs-entrypoint.js` is bundled in the same asset as the custom resource
         * and set as the entrypoint. If set to `false`, the custom resource provided is the
         * entrypoint.
         *
         * Default: - `true` if `inlineCode: false` and `false` otherwise.
         */
        override fun useCfnResponseWrapper(): Boolean? = unwrap(this).getUseCfnResponseWrapper()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): CustomResourceProviderOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.CustomResourceProviderOptions
        ): CustomResourceProviderOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: CustomResourceProviderOptions
        ): software.amazon.awscdk.CustomResourceProviderOptions = (wrapped as Wrapper).cdkObject
    }
}
