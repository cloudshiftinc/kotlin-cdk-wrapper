package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Version
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.lambda.Version,
) : QualifiedFunctionBase(cdkObject), IVersion {
    /**
     * (deprecated) Defines an alias for this version.
     *
     * @param aliasName The name of the alias (e.g. "live").
     * @param options Alias options.
     * @deprecated Calling `addAlias` on a `Version` object will cause the Alias to be replaced on
     *   every function update. Call `function.addAlias()` or `new Alias()` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    public override fun addAlias(aliasName: String): Alias =
        unwrap(this).addAlias(aliasName).let(Alias::wrap)

    /**
     * (deprecated) Defines an alias for this version.
     *
     * @param aliasName The name of the alias (e.g. "live").
     * @param options Alias options.
     * @deprecated Calling `addAlias` on a `Version` object will cause the Alias to be replaced on
     *   every function update. Call `function.addAlias()` or `new Alias()` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    public override fun addAlias(aliasName: String, options: AliasOptions): Alias =
        unwrap(this).addAlias(aliasName, options.let(AliasOptions::unwrap)).let(Alias::wrap)

    /**
     * (deprecated) Defines an alias for this version.
     *
     * @param aliasName The name of the alias (e.g. "live").
     * @param options Alias options.
     * @deprecated Calling `addAlias` on a `Version` object will cause the Alias to be replaced on
     *   every function update. Call `function.addAlias()` or `new Alias()` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ff57343b4e1566ac76515fa826125e96564152d30ba0ef3d24569a9cf452484")
    public override fun addAlias(
        aliasName: String,
        options: AliasOptions.Builder.() -> Unit
    ): Alias = addAlias(aliasName, AliasOptions(options))

    /** The architecture of this Lambda Function. */
    public override fun architecture(): Architecture =
        unwrap(this).getArchitecture().let(Architecture::wrap)

    /** The ARN of the version for Lambda&#64;Edge. */
    public override fun edgeArn(): String = unwrap(this).getEdgeArn()

    /** The ARN fo the function. */
    public override fun functionArn(): String = unwrap(this).getFunctionArn()

    /** The name of the function. */
    public override fun functionName(): String = unwrap(this).getFunctionName()

    /** The principal this Lambda Function is running as. */
    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /** The underlying `IFunction`. */
    public override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

    /**
     * Return the given named metric for this Function.
     *
     * @param metricName
     * @param props
     */
    public override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this Function.
     *
     * @param metricName
     * @param props
     */
    public override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this Function.
     *
     * @param metricName
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    public override fun metric(
        metricName: String,
        props: MetricOptions.Builder.() -> Unit
    ): Metric = metric(metricName, MetricOptions(props))

    /**
     * The IAM role associated with this function.
     *
     * Undefined if the function was imported without a role.
     */
    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /** The most recently deployed version of this function. */
    public override fun version(): String = unwrap(this).getVersion()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.Version]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * SHA256 of the version of the Lambda source code.
         *
         * Specify to validate that you're deploying the right version.
         *
         * Default: No validation is performed
         *
         * @param codeSha256 SHA256 of the version of the Lambda source code.
         */
        public fun codeSha256(codeSha256: String)

        /**
         * Description of the version.
         *
         * Default: Description of the Lambda
         *
         * @param description Description of the version.
         */
        public fun description(description: String)

        /**
         * Function to get the value of.
         *
         * @param lambda Function to get the value of.
         */
        public fun lambda(lambda: IFunction)

        /**
         * The maximum age of a request that Lambda sends to a function for processing.
         *
         * Minimum: 60 seconds Maximum: 6 hours
         *
         * Default: Duration.hours(6)
         *
         * @param maxEventAge The maximum age of a request that Lambda sends to a function for
         *   processing.
         */
        public fun maxEventAge(maxEventAge: Duration)

        /**
         * The destination for failed invocations.
         *
         * Default: - no destination
         *
         * @param onFailure The destination for failed invocations.
         */
        public fun onFailure(onFailure: IDestination)

        /**
         * The destination for successful invocations.
         *
         * Default: - no destination
         *
         * @param onSuccess The destination for successful invocations.
         */
        public fun onSuccess(onSuccess: IDestination)

        /**
         * Specifies a provisioned concurrency configuration for a function's version.
         *
         * Default: No provisioned concurrency
         *
         * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration
         *   for a function's version.
         */
        public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)

        /**
         * Whether to retain old versions of this function when a new version is created.
         *
         * Default: RemovalPolicy.DESTROY
         *
         * @param removalPolicy Whether to retain old versions of this function when a new version
         *   is created.
         */
        public fun removalPolicy(removalPolicy: RemovalPolicy)

        /**
         * The maximum number of times to retry when the function returns an error.
         *
         * Minimum: 0 Maximum: 2
         *
         * Default: 2
         *
         * @param retryAttempts The maximum number of times to retry when the function returns an
         *   error.
         */
        public fun retryAttempts(retryAttempts: Number)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.lambda.Version.Builder =
            software.amazon.awscdk.services.lambda.Version.Builder.create(scope, id)

        /**
         * SHA256 of the version of the Lambda source code.
         *
         * Specify to validate that you're deploying the right version.
         *
         * Default: No validation is performed
         *
         * @param codeSha256 SHA256 of the version of the Lambda source code.
         */
        override fun codeSha256(codeSha256: String) {
            cdkBuilder.codeSha256(codeSha256)
        }

        /**
         * Description of the version.
         *
         * Default: Description of the Lambda
         *
         * @param description Description of the version.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * Function to get the value of.
         *
         * @param lambda Function to get the value of.
         */
        override fun lambda(lambda: IFunction) {
            cdkBuilder.lambda(lambda.let(IFunction::unwrap))
        }

        /**
         * The maximum age of a request that Lambda sends to a function for processing.
         *
         * Minimum: 60 seconds Maximum: 6 hours
         *
         * Default: Duration.hours(6)
         *
         * @param maxEventAge The maximum age of a request that Lambda sends to a function for
         *   processing.
         */
        override fun maxEventAge(maxEventAge: Duration) {
            cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
        }

        /**
         * The destination for failed invocations.
         *
         * Default: - no destination
         *
         * @param onFailure The destination for failed invocations.
         */
        override fun onFailure(onFailure: IDestination) {
            cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
        }

        /**
         * The destination for successful invocations.
         *
         * Default: - no destination
         *
         * @param onSuccess The destination for successful invocations.
         */
        override fun onSuccess(onSuccess: IDestination) {
            cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
        }

        /**
         * Specifies a provisioned concurrency configuration for a function's version.
         *
         * Default: No provisioned concurrency
         *
         * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration
         *   for a function's version.
         */
        override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
            cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
        }

        /**
         * Whether to retain old versions of this function when a new version is created.
         *
         * Default: RemovalPolicy.DESTROY
         *
         * @param removalPolicy Whether to retain old versions of this function when a new version
         *   is created.
         */
        override fun removalPolicy(removalPolicy: RemovalPolicy) {
            cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
        }

        /**
         * The maximum number of times to retry when the function returns an error.
         *
         * Minimum: 0 Maximum: 2
         *
         * Default: 2
         *
         * @param retryAttempts The maximum number of times to retry when the function returns an
         *   error.
         */
        override fun retryAttempts(retryAttempts: Number) {
            cdkBuilder.retryAttempts(retryAttempts)
        }

        public fun build(): software.amazon.awscdk.services.lambda.Version = cdkBuilder.build()
    }

    public companion object {
        public fun fromVersionArn(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            versionArn: String,
        ): IVersion =
            software.amazon.awscdk.services.lambda.Version.fromVersionArn(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    versionArn
                )
                .let(IVersion::wrap)

        public fun fromVersionAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: VersionAttributes,
        ): IVersion =
            software.amazon.awscdk.services.lambda.Version.fromVersionAttributes(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    attrs.let(VersionAttributes::unwrap)
                )
                .let(IVersion::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("eb465a0d3cfc3652ccdc9929ccc263eba569adee02088db50e59eb21d89d2830")
        public fun fromVersionAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: VersionAttributes.Builder.() -> Unit,
        ): IVersion = fromVersionAttributes(scope, id, VersionAttributes(attrs))

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): Version {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return Version(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Version): Version =
            Version(cdkObject)

        internal fun unwrap(wrapped: Version): software.amazon.awscdk.services.lambda.Version =
            wrapped.cdkObject
    }
}
