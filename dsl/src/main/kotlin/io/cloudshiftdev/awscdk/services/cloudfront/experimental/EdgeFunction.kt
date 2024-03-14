package io.cloudshiftdev.awscdk.services.cloudfront.experimental

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codeguruprofiler.IProfilingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.CompositePrincipal
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.AdotInstrumentationConfig
import io.cloudshiftdev.awscdk.services.lambda.Alias
import io.cloudshiftdev.awscdk.services.lambda.AliasOptions
import io.cloudshiftdev.awscdk.services.lambda.Architecture
import io.cloudshiftdev.awscdk.services.lambda.Code
import io.cloudshiftdev.awscdk.services.lambda.EventInvokeConfigOptions
import io.cloudshiftdev.awscdk.services.lambda.EventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.EventSourceMappingOptions
import io.cloudshiftdev.awscdk.services.lambda.FileSystem
import io.cloudshiftdev.awscdk.services.lambda.FunctionUrl
import io.cloudshiftdev.awscdk.services.lambda.FunctionUrlOptions
import io.cloudshiftdev.awscdk.services.lambda.ICodeSigningConfig
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import io.cloudshiftdev.awscdk.services.lambda.IVersion
import io.cloudshiftdev.awscdk.services.lambda.LambdaInsightsVersion
import io.cloudshiftdev.awscdk.services.lambda.LogRetentionRetryOptions
import io.cloudshiftdev.awscdk.services.lambda.LoggingFormat
import io.cloudshiftdev.awscdk.services.lambda.ParamsAndSecretsLayerVersion
import io.cloudshiftdev.awscdk.services.lambda.Permission
import io.cloudshiftdev.awscdk.services.lambda.Runtime
import io.cloudshiftdev.awscdk.services.lambda.RuntimeManagementMode
import io.cloudshiftdev.awscdk.services.lambda.SnapStartConf
import io.cloudshiftdev.awscdk.services.lambda.Tracing
import io.cloudshiftdev.awscdk.services.lambda.VersionOptions
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EdgeFunction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction,
) : Resource(cdkObject), IVersion {
  /**
   * Defines an alias for this version.
   *
   * @param aliasName 
   * @param options
   */
  public override fun addAlias(aliasName: String): Alias =
      unwrap(this).addAlias(aliasName).let(Alias::wrap)

  /**
   * Defines an alias for this version.
   *
   * @param aliasName 
   * @param options
   */
  public override fun addAlias(aliasName: String, options: AliasOptions): Alias =
      unwrap(this).addAlias(aliasName, options.let(AliasOptions::unwrap)).let(Alias::wrap)

  /**
   * Defines an alias for this version.
   *
   * @param aliasName 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ff57343b4e1566ac76515fa826125e96564152d30ba0ef3d24569a9cf452484")
  public override fun addAlias(aliasName: String, options: AliasOptions.Builder.() -> Unit): Alias =
      addAlias(aliasName, AliasOptions(options))

  /**
   * Adds an event source to this function.
   *
   * @param source 
   */
  public override fun addEventSource(source: IEventSource) {
    unwrap(this).addEventSource(source.let(IEventSource::unwrap))
  }

  /**
   * Adds an event source that maps to this AWS Lambda function.
   *
   * @param id 
   * @param options 
   */
  public override fun addEventSourceMapping(id: String, options: EventSourceMappingOptions):
      EventSourceMapping = unwrap(this).addEventSourceMapping(id,
      options.let(EventSourceMappingOptions::unwrap)).let(EventSourceMapping::wrap)

  /**
   * Adds an event source that maps to this AWS Lambda function.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1a42ee4d3635728f011b89020cb9e266d5ec086cc3638388b952c384adc89b9")
  public override fun addEventSourceMapping(id: String,
      options: EventSourceMappingOptions.Builder.() -> Unit): EventSourceMapping =
      addEventSourceMapping(id, EventSourceMappingOptions(options))

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  public override fun addFunctionUrl(): FunctionUrl =
      unwrap(this).addFunctionUrl().let(FunctionUrl::wrap)

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  public override fun addFunctionUrl(options: FunctionUrlOptions): FunctionUrl =
      unwrap(this).addFunctionUrl(options.let(FunctionUrlOptions::unwrap)).let(FunctionUrl::wrap)

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc489a994cc127e25ae321702e1246a654ec80f2c2c2c9c9399e6bdb53dab162")
  public override fun addFunctionUrl(options: FunctionUrlOptions.Builder.() -> Unit): FunctionUrl =
      addFunctionUrl(FunctionUrlOptions(options))

  /**
   * Adds a permission to the Lambda resource policy.
   *
   * @param id 
   * @param permission 
   */
  public override fun addPermission(id: String, permission: Permission) {
    unwrap(this).addPermission(id, permission.let(Permission::unwrap))
  }

  /**
   * Adds a permission to the Lambda resource policy.
   *
   * @param id 
   * @param permission 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab1e13b50521b14748449d1cedaddd4f97568ffa4bbbeb7d2cea25e84b0ce6c2")
  public override fun addPermission(id: String, permission: Permission.Builder.() -> Unit): Unit =
      addPermission(id, Permission(permission))

  /**
   * Adds a statement to the IAM role assumed by the instance.
   *
   * @param statement 
   */
  public override fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  /**
   * Adds a statement to the IAM role assumed by the instance.
   *
   * @param statement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  /**
   * The system architectures compatible with this lambda function.
   */
  public override fun architecture(): Architecture =
      unwrap(this).getArchitecture().let(Architecture::wrap)

  /**
   * Configures options for asynchronous invocation.
   *
   * @param options 
   */
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions) {
    unwrap(this).configureAsyncInvoke(options.let(EventInvokeConfigOptions::unwrap))
  }

  /**
   * Configures options for asynchronous invocation.
   *
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b85c1a6f6a657150d5fca517e75d094e687b3217c04d318f2be78e23e7c059ee")
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions.Builder.() -> Unit):
      Unit = configureAsyncInvoke(EventInvokeConfigOptions(options))

  /**
   * Not supported.
   *
   * Connections are only applicable to VPC-enabled functions.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Convenience method to make `EdgeFunction` conform to the same interface as `Function`.
   */
  public open fun currentVersion(): IVersion = unwrap(this).getCurrentVersion().let(IVersion::wrap)

  /**
   * The ARN of the version for Lambda&#64;Edge.
   */
  public override fun edgeArn(): String = unwrap(this).getEdgeArn()

  /**
   * The ARN of the function.
   */
  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  /**
   * The name of the function.
   */
  public override fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * Grant the given identity permissions to invoke this Lambda.
   *
   * @param identity 
   */
  public override fun grantInvoke(identity: IGrantable): Grant =
      unwrap(this).grantInvoke(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant multiple principals the ability to invoke this Lambda via CompositePrincipal.
   *
   * @param compositePrincipal 
   */
  public override fun grantInvokeCompositePrincipal(compositePrincipal: CompositePrincipal):
      List<Grant> =
      unwrap(this).grantInvokeCompositePrincipal(compositePrincipal.let(CompositePrincipal::unwrap)).map(Grant::wrap)

  /**
   * Grant the given identity permissions to invoke this Lambda Function URL.
   *
   * @param identity 
   */
  public override fun grantInvokeUrl(identity: IGrantable): Grant =
      unwrap(this).grantInvokeUrl(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Whether or not this Lambda function was bound to a VPC.
   *
   * If this is is `false`, trying to access the `connections` object will fail.
   */
  public override fun isBoundToVpc(): Boolean = unwrap(this).getIsBoundToVpc()

  /**
   * The underlying AWS Lambda function.
   */
  public override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

  /**
   * The `$LATEST` version of this function.
   *
   * Note that this is reference to a non-specific AWS Lambda version, which
   * means the function this version refers to can return different results in
   * different invocations.
   *
   * To obtain a reference to an explicit version which references the current
   * function configuration, use `lambdaFunction.currentVersion` instead.
   */
  public override fun latestVersion(): IVersion =
      unwrap(this).getLatestVersion().let(IVersion::wrap)

  /**
   * Return the given named metric for this Lambda Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Lambda Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Lambda Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for the Duration of this Lambda How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

  /**
   * Metric for the Duration of this Lambda How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricDuration(props: MetricOptions): Metric =
      unwrap(this).metricDuration(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the Duration of this Lambda How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public override fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDuration(MetricOptions(props))

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricErrors(): Metric = unwrap(this).metricErrors().let(Metric::wrap)

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricErrors(props: MetricOptions): Metric =
      unwrap(this).metricErrors(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35a6413eeb4163b1b71b829794e56c9dcdd5a733bbb4fad94ee2cb3a0267d941")
  public override fun metricErrors(props: MetricOptions.Builder.() -> Unit): Metric =
      metricErrors(MetricOptions(props))

  /**
   * Metric for the number of invocations of this Lambda How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricInvocations(): Metric =
      unwrap(this).metricInvocations().let(Metric::wrap)

  /**
   * Metric for the number of invocations of this Lambda How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricInvocations(props: MetricOptions): Metric =
      unwrap(this).metricInvocations(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of invocations of this Lambda How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6a03faa9f4e6ab06d879372d43628c35937b122c9853c734195167cad56a2614")
  public override fun metricInvocations(props: MetricOptions.Builder.() -> Unit): Metric =
      metricInvocations(MetricOptions(props))

  /**
   * Metric for the number of throttled invocations of this Lambda How often this Lambda is
   * throttled.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricThrottles(): Metric = unwrap(this).metricThrottles().let(Metric::wrap)

  /**
   * Metric for the number of throttled invocations of this Lambda How often this Lambda is
   * throttled.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricThrottles(props: MetricOptions): Metric =
      unwrap(this).metricThrottles(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of throttled invocations of this Lambda How often this Lambda is
   * throttled.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c66b543d0ee791c9157b75f01987fb80ab6ef611d23006ace8925909dc84e3f")
  public override fun metricThrottles(props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottles(MetricOptions(props))

  /**
   * The construct node where permissions are attached.
   */
  public override fun permissionsNode(): Node = unwrap(this).getPermissionsNode().let(Node::wrap)

  /**
   * The ARN(s) to put into the resource field of the generated IAM policy for grantInvoke().
   *
   * This property is for cdk modules to consume only. You should not need to use this property.
   * Instead, use grantInvoke() directly.
   */
  public override fun resourceArnsForGrantInvoke(): List<String> =
      unwrap(this).getResourceArnsForGrantInvoke()

  /**
   * The IAM role associated with this function.
   */
  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The most recently deployed version of this function.
   */
  public override fun version(): String = unwrap(this).getVersion()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.experimental.EdgeFunction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify the configuration of AWS Distro for OpenTelemetry (ADOT) instrumentation.
     *
     * Default: - No ADOT instrumentation
     *
     * [Documentation](https://aws-otel.github.io/docs/getting-started/lambda)
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     * instrumentation. 
     */
    public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig)

    /**
     * Specify the configuration of AWS Distro for OpenTelemetry (ADOT) instrumentation.
     *
     * Default: - No ADOT instrumentation
     *
     * [Documentation](https://aws-otel.github.io/docs/getting-started/lambda)
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     * instrumentation. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11afc5224e0d8b34bdea940ce497bf0fb2e2d0c9c657e024f606318e82f06bfa")
    public
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit)

    /**
     * Whether to allow the Lambda to send all network traffic.
     *
     * If set to false, you must individually add traffic rules to allow the
     * Lambda to connect to network targets.
     *
     * Do not specify this property if the `securityGroups` or `securityGroup` property is set.
     * Instead, configure `allowAllOutbound` directly on the security group.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether to allow the Lambda to send all network traffic. 
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * Lambda Functions in a public subnet can NOT access the internet.
     *
     * Use this property to acknowledge this limitation and still place the function in a public
     * subnet.
     *
     * Default: false
     *
     * [Documentation](https://stackoverflow.com/questions/52992085/why-cant-an-aws-lambda-function-inside-a-public-subnet-in-a-vpc-connect-to-the/52994841#52994841)
     * @param allowPublicSubnet Lambda Functions in a public subnet can NOT access the internet. 
     */
    public fun allowPublicSubnet(allowPublicSubnet: Boolean)

    /**
     * Sets the application log level for the function.
     *
     * Default: "INFO"
     *
     * @param applicationLogLevel Sets the application log level for the function. 
     */
    public fun applicationLogLevel(applicationLogLevel: String)

    /**
     * The system architectures compatible with this lambda function.
     *
     * Default: Architecture.X86_64
     *
     * @param architecture The system architectures compatible with this lambda function. 
     */
    public fun architecture(architecture: Architecture)

    /**
     * The source code of your Lambda function.
     *
     * You can point to a file in an
     * Amazon Simple Storage Service (Amazon S3) bucket or specify your source
     * code as inline text.
     *
     * @param code The source code of your Lambda function. 
     */
    public fun code(code: Code)

    /**
     * Code signing config associated with this function.
     *
     * Default: - Not Sign the Code
     *
     * @param codeSigningConfig Code signing config associated with this function. 
     */
    public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig)

    /**
     * Options for the `lambda.Version` resource automatically created by the `fn.currentVersion`
     * method.
     *
     * Default: - default options as described in `VersionOptions`
     *
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     * by the `fn.currentVersion` method. 
     */
    public fun currentVersionOptions(currentVersionOptions: VersionOptions)

    /**
     * Options for the `lambda.Version` resource automatically created by the `fn.currentVersion`
     * method.
     *
     * Default: - default options as described in `VersionOptions`
     *
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     * by the `fn.currentVersion` method. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa807d37f25a69a10159f145b1c872cfc34de53a224f8161fe2e617ce59dea30")
    public fun currentVersionOptions(currentVersionOptions: VersionOptions.Builder.() -> Unit)

    /**
     * The SQS queue to use if DLQ is enabled.
     *
     * If SNS topic is desired, specify `deadLetterTopic` property instead.
     *
     * Default: - SQS queue with 14 day retention period if `deadLetterQueueEnabled` is `true`
     *
     * @param deadLetterQueue The SQS queue to use if DLQ is enabled. 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * Enabled DLQ.
     *
     * If `deadLetterQueue` is undefined,
     * an SQS queue with default options will be defined for your Function.
     *
     * Default: - false unless `deadLetterQueue` is set, which implies DLQ is enabled.
     *
     * @param deadLetterQueueEnabled Enabled DLQ. 
     */
    public fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean)

    /**
     * The SNS topic to use as a DLQ.
     *
     * Note that if `deadLetterQueueEnabled` is set to `true`, an SQS queue will be created
     * rather than an SNS topic. Using an SNS topic as a DLQ requires this property to be set
     * explicitly.
     *
     * Default: - no SNS topic
     *
     * @param deadLetterTopic The SNS topic to use as a DLQ. 
     */
    public fun deadLetterTopic(deadLetterTopic: ITopic)

    /**
     * A description of the function.
     *
     * Default: - No description.
     *
     * @param description A description of the function. 
     */
    public fun description(description: String)

    /**
     * Key-value pairs that Lambda caches and makes available for your Lambda functions.
     *
     * Use environment variables to apply configuration changes, such
     * as test and production environment configurations, without changing your
     * Lambda function source code.
     *
     * Default: - No environment variables.
     *
     * @param environment Key-value pairs that Lambda caches and makes available for your Lambda
     * functions. 
     */
    public fun environment(environment: Map<String, String>)

    /**
     * The AWS KMS key that's used to encrypt your function's environment variables.
     *
     * Default: - AWS Lambda creates and uses an AWS managed customer master key (CMK).
     *
     * @param environmentEncryption The AWS KMS key that's used to encrypt your function's
     * environment variables. 
     */
    public fun environmentEncryption(environmentEncryption: IKey)

    /**
     * The size of the function’s /tmp directory in MiB.
     *
     * Default: 512 MiB
     *
     * @param ephemeralStorageSize The size of the function’s /tmp directory in MiB. 
     */
    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    /**
     * Event sources for this function.
     *
     * You can also add event sources using `addEventSource`.
     *
     * Default: - No event sources.
     *
     * @param events Event sources for this function. 
     */
    public fun events(events: List<IEventSource>)

    /**
     * Event sources for this function.
     *
     * You can also add event sources using `addEventSource`.
     *
     * Default: - No event sources.
     *
     * @param events Event sources for this function. 
     */
    public fun events(vararg events: IEventSource)

    /**
     * The filesystem configuration for the lambda function.
     *
     * Default: - will not mount any filesystem
     *
     * @param filesystem The filesystem configuration for the lambda function. 
     */
    public fun filesystem(filesystem: FileSystem)

    /**
     * A name for the function.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that
     * ID for the function's name. For more information, see Name Type.
     *
     * @param functionName A name for the function. 
     */
    public fun functionName(functionName: String)

    /**
     * The name of the method within your code that Lambda calls to execute your function.
     *
     * The format includes the file name. It can also include
     * namespaces and other qualifiers, depending on the runtime.
     * For more information, see
     * https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html.
     *
     * Use `Handler.FROM_IMAGE` when defining a function from a Docker image.
     *
     * NOTE: If you specify your source code as inline text by specifying the
     * ZipFile property within the Code property, specify index.function_name as
     * the handler.
     *
     * @param handler The name of the method within your code that Lambda calls to execute your
     * function. 
     */
    public fun handler(handler: String)

    /**
     * Initial policy statements to add to the created Lambda Role.
     *
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     *
     * Default: - No policy statements are added to the created Lambda role.
     *
     * @param initialPolicy Initial policy statements to add to the created Lambda Role. 
     */
    public fun initialPolicy(initialPolicy: List<PolicyStatement>)

    /**
     * Initial policy statements to add to the created Lambda Role.
     *
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     *
     * Default: - No policy statements are added to the created Lambda role.
     *
     * @param initialPolicy Initial policy statements to add to the created Lambda Role. 
     */
    public fun initialPolicy(vararg initialPolicy: PolicyStatement)

    /**
     * Specify the version of CloudWatch Lambda insights to use for monitoring.
     *
     * Default: - No Lambda Insights
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Lambda-Insights-Getting-Started-docker.html)
     * @param insightsVersion Specify the version of CloudWatch Lambda insights to use for
     * monitoring. 
     */
    public fun insightsVersion(insightsVersion: LambdaInsightsVersion)

    /**
     * Allows outbound IPv6 traffic on VPC functions that are connected to dual-stack subnets.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: false
     *
     * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
     * connected to dual-stack subnets. 
     */
    public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean)

    /**
     * A list of layers to add to the function's execution environment.
     *
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     *
     * Default: - No layers.
     *
     * @param layers A list of layers to add to the function's execution environment. 
     */
    public fun layers(layers: List<ILayerVersion>)

    /**
     * A list of layers to add to the function's execution environment.
     *
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     *
     * Default: - No layers.
     *
     * @param layers A list of layers to add to the function's execution environment. 
     */
    public fun layers(vararg layers: ILayerVersion)

    /**
     * Sets the logFormat for the function.
     *
     * Default: "Text"
     *
     * @param logFormat Sets the logFormat for the function. 
     */
    public fun logFormat(logFormat: String)

    /**
     * The log group the function sends logs to.
     *
     * By default, Lambda functions send logs to an automatically created default log group named
     * /aws/lambda/<function name>.
     * However you cannot change the properties of this auto-created log group using the AWS CDK,
     * e.g. you cannot set a different log retention.
     *
     * Use the `logGroup` property to create a fully customizable LogGroup ahead of time, and
     * instruct the Lambda function to send logs to it.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: `/aws/lambda/${this.functionName}` - default log group created by Lambda
     *
     * @param logGroup The log group the function sends logs to. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you move away from it if you can.
     * Instead create a fully customizable log group with `logs.LogGroup` and use the `logGroup`
     * property
     * to instruct the Lambda function to send logs to it.
     * Migrating from `logRetention` to `logGroup` will cause the name of the log group to change.
     * Users and code and referencing the name verbatim will have to adjust.
     *
     * In AWS CDK code, you can access the log group name directly from the LogGroup construct:
     *
     * ```
     * import io.cloudshiftdev.awscdk.services.logs.*;
     * LogGroup myLogGroup;
     * myLogGroup.getLogGroupName();
     * ```
     *
     * Default: logs.RetentionDays.INFINITE
     *
     * @param logRetention The number of days log events are kept in CloudWatch Logs. 
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: - Default AWS SDK retry options.
     *
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group. 
     */
    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: - Default AWS SDK retry options.
     *
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b2d86c2ccaf3f195f0f2849426d47e7323bbe5c1c0b223944e7e281d8fb4629")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: - A new role is created.
     *
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     * resource that sets the retention policy. 
     */
    public fun logRetentionRole(logRetentionRole: IRole)

    /**
     * Sets the loggingFormat for the function.
     *
     * Default: LoggingFormat.TEXT
     *
     * @param loggingFormat Sets the loggingFormat for the function. 
     */
    public fun loggingFormat(loggingFormat: LoggingFormat)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The amount of memory, in MB, that is allocated to your Lambda function.
     *
     * Lambda uses this value to proportionally allocate the amount of CPU
     * power. For more information, see Resource Model in the AWS Lambda
     * Developer Guide.
     *
     * Default: 128
     *
     * @param memorySize The amount of memory, in MB, that is allocated to your Lambda function. 
     */
    public fun memorySize(memorySize: Number)

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
     * Specify the configuration of Parameters and Secrets Extension.
     *
     * Default: - No Parameters and Secrets Extension
     *
     * [Documentation](https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-integration-lambda-extensions.html)
     * @param paramsAndSecrets Specify the configuration of Parameters and Secrets Extension. 
     */
    public fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion)

    /**
     * Enable profiling.
     *
     * Default: - No profiling.
     *
     * [Documentation](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/setting-up-lambda.html)
     * @param profiling Enable profiling. 
     */
    public fun profiling(profiling: Boolean)

    /**
     * Profiling Group.
     *
     * Default: - A new profiling group will be created if `profiling` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/setting-up-lambda.html)
     * @param profilingGroup Profiling Group. 
     */
    public fun profilingGroup(profilingGroup: IProfilingGroup)

    /**
     * The maximum of concurrent executions you want to reserve for the function.
     *
     * Default: - No specific limit - account limit.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)
     * @param reservedConcurrentExecutions The maximum of concurrent executions you want to reserve
     * for the function. 
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * Lambda execution role.
     *
     * This is the role that will be assumed by the function upon execution.
     * It controls the permissions that the function will have. The Role must
     * be assumable by the 'lambda.amazonaws.com' service principal.
     *
     * The default Role automatically has permissions granted for Lambda execution. If you
     * provide a Role, you must add the relevant AWS managed policies yourself.
     *
     * The relevant managed policies are "service-role/AWSLambdaBasicExecutionRole" and
     * "service-role/AWSLambdaVPCAccessExecutionRole".
     *
     * Default: - A unique role will be generated for this lambda function.
     * Both supplied and generated roles can always be changed by calling `addToRolePolicy`.
     *
     * @param role Lambda execution role. 
     */
    public fun role(role: IRole)

    /**
     * The runtime environment for the Lambda function that you are uploading.
     *
     * For valid values, see the Runtime property in the AWS Lambda Developer
     * Guide.
     *
     * Use `Runtime.FROM_IMAGE` when defining a function from a Docker image.
     *
     * @param runtime The runtime environment for the Lambda function that you are uploading. 
     */
    public fun runtime(runtime: Runtime)

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * Default: Auto
     *
     * @param runtimeManagementMode Sets the runtime management configuration for a function's
     * version. 
     */
    public fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode)

    /**
     * The list of security groups to associate with the Lambda's network interfaces.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - If the function is placed within a VPC and a security group is
     * not specified, either by this or securityGroup prop, a dedicated security
     * group will be created for this function.
     *
     * @param securityGroups The list of security groups to associate with the Lambda's network
     * interfaces. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The list of security groups to associate with the Lambda's network interfaces.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - If the function is placed within a VPC and a security group is
     * not specified, either by this or securityGroup prop, a dedicated security
     * group will be created for this function.
     *
     * @param securityGroups The list of security groups to associate with the Lambda's network
     * interfaces. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Enable SnapStart for Lambda Function.
     *
     * SnapStart is currently supported only for Java 11, 17 runtime
     *
     * Default: - No snapstart
     *
     * @param snapStart Enable SnapStart for Lambda Function. 
     */
    public fun snapStart(snapStart: SnapStartConf)

    /**
     * The stack ID of Lambda&#64;Edge function.
     *
     * Default: - `edge-lambda-stack-${region}`
     *
     * @param stackId The stack ID of Lambda&#64;Edge function. 
     */
    public fun stackId(stackId: String)

    /**
     * Sets the system log level for the function.
     *
     * Default: "INFO"
     *
     * @param systemLogLevel Sets the system log level for the function. 
     */
    public fun systemLogLevel(systemLogLevel: String)

    /**
     * The function execution time (in seconds) after which Lambda terminates the function.
     *
     * Because the execution time affects cost, set this value
     * based on the function's expected execution time.
     *
     * Default: Duration.seconds(3)
     *
     * @param timeout The function execution time (in seconds) after which Lambda terminates the
     * function. 
     */
    public fun timeout(timeout: Duration)

    /**
     * Enable AWS X-Ray Tracing for Lambda Function.
     *
     * Default: Tracing.Disabled
     *
     * @param tracing Enable AWS X-Ray Tracing for Lambda Function. 
     */
    public fun tracing(tracing: Tracing)

    /**
     * VPC network to place Lambda network interfaces.
     *
     * Specify this if the Lambda function needs to access resources in a VPC.
     * This is required when `vpcSubnets` is specified.
     *
     * Default: - Function is not placed within a VPC.
     *
     * @param vpc VPC network to place Lambda network interfaces. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Where to place the network interfaces within the VPC.
     *
     * This requires `vpc` to be specified in order for interfaces to actually be
     * placed in the subnets. If `vpc` is not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking
     * public subnets is not allowed (unless `allowPublicSubnet` is set to `true`).
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where to place the network interfaces within the VPC. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Where to place the network interfaces within the VPC.
     *
     * This requires `vpc` to be specified in order for interfaces to actually be
     * placed in the subnets. If `vpc` is not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking
     * public subnets is not allowed (unless `allowPublicSubnet` is set to `true`).
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where to place the network interfaces within the VPC. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c19505a61d3eceb02b57a086ff4393c8f46f9c59acbf9f7480ca6486d3836854")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction.Builder =
        software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction.Builder.create(scope,
        id)

    /**
     * Specify the configuration of AWS Distro for OpenTelemetry (ADOT) instrumentation.
     *
     * Default: - No ADOT instrumentation
     *
     * [Documentation](https://aws-otel.github.io/docs/getting-started/lambda)
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     * instrumentation. 
     */
    override fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
      cdkBuilder.adotInstrumentation(adotInstrumentation.let(AdotInstrumentationConfig::unwrap))
    }

    /**
     * Specify the configuration of AWS Distro for OpenTelemetry (ADOT) instrumentation.
     *
     * Default: - No ADOT instrumentation
     *
     * [Documentation](https://aws-otel.github.io/docs/getting-started/lambda)
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     * instrumentation. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11afc5224e0d8b34bdea940ce497bf0fb2e2d0c9c657e024f606318e82f06bfa")
    override
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit):
        Unit = adotInstrumentation(AdotInstrumentationConfig(adotInstrumentation))

    /**
     * Whether to allow the Lambda to send all network traffic.
     *
     * If set to false, you must individually add traffic rules to allow the
     * Lambda to connect to network targets.
     *
     * Do not specify this property if the `securityGroups` or `securityGroup` property is set.
     * Instead, configure `allowAllOutbound` directly on the security group.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether to allow the Lambda to send all network traffic. 
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * Lambda Functions in a public subnet can NOT access the internet.
     *
     * Use this property to acknowledge this limitation and still place the function in a public
     * subnet.
     *
     * Default: false
     *
     * [Documentation](https://stackoverflow.com/questions/52992085/why-cant-an-aws-lambda-function-inside-a-public-subnet-in-a-vpc-connect-to-the/52994841#52994841)
     * @param allowPublicSubnet Lambda Functions in a public subnet can NOT access the internet. 
     */
    override fun allowPublicSubnet(allowPublicSubnet: Boolean) {
      cdkBuilder.allowPublicSubnet(allowPublicSubnet)
    }

    /**
     * Sets the application log level for the function.
     *
     * Default: "INFO"
     *
     * @param applicationLogLevel Sets the application log level for the function. 
     */
    override fun applicationLogLevel(applicationLogLevel: String) {
      cdkBuilder.applicationLogLevel(applicationLogLevel)
    }

    /**
     * The system architectures compatible with this lambda function.
     *
     * Default: Architecture.X86_64
     *
     * @param architecture The system architectures compatible with this lambda function. 
     */
    override fun architecture(architecture: Architecture) {
      cdkBuilder.architecture(architecture.let(Architecture::unwrap))
    }

    /**
     * The source code of your Lambda function.
     *
     * You can point to a file in an
     * Amazon Simple Storage Service (Amazon S3) bucket or specify your source
     * code as inline text.
     *
     * @param code The source code of your Lambda function. 
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * Code signing config associated with this function.
     *
     * Default: - Not Sign the Code
     *
     * @param codeSigningConfig Code signing config associated with this function. 
     */
    override fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
      cdkBuilder.codeSigningConfig(codeSigningConfig.let(ICodeSigningConfig::unwrap))
    }

    /**
     * Options for the `lambda.Version` resource automatically created by the `fn.currentVersion`
     * method.
     *
     * Default: - default options as described in `VersionOptions`
     *
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     * by the `fn.currentVersion` method. 
     */
    override fun currentVersionOptions(currentVersionOptions: VersionOptions) {
      cdkBuilder.currentVersionOptions(currentVersionOptions.let(VersionOptions::unwrap))
    }

    /**
     * Options for the `lambda.Version` resource automatically created by the `fn.currentVersion`
     * method.
     *
     * Default: - default options as described in `VersionOptions`
     *
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     * by the `fn.currentVersion` method. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa807d37f25a69a10159f145b1c872cfc34de53a224f8161fe2e617ce59dea30")
    override fun currentVersionOptions(currentVersionOptions: VersionOptions.Builder.() -> Unit):
        Unit = currentVersionOptions(VersionOptions(currentVersionOptions))

    /**
     * The SQS queue to use if DLQ is enabled.
     *
     * If SNS topic is desired, specify `deadLetterTopic` property instead.
     *
     * Default: - SQS queue with 14 day retention period if `deadLetterQueueEnabled` is `true`
     *
     * @param deadLetterQueue The SQS queue to use if DLQ is enabled. 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * Enabled DLQ.
     *
     * If `deadLetterQueue` is undefined,
     * an SQS queue with default options will be defined for your Function.
     *
     * Default: - false unless `deadLetterQueue` is set, which implies DLQ is enabled.
     *
     * @param deadLetterQueueEnabled Enabled DLQ. 
     */
    override fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean) {
      cdkBuilder.deadLetterQueueEnabled(deadLetterQueueEnabled)
    }

    /**
     * The SNS topic to use as a DLQ.
     *
     * Note that if `deadLetterQueueEnabled` is set to `true`, an SQS queue will be created
     * rather than an SNS topic. Using an SNS topic as a DLQ requires this property to be set
     * explicitly.
     *
     * Default: - no SNS topic
     *
     * @param deadLetterTopic The SNS topic to use as a DLQ. 
     */
    override fun deadLetterTopic(deadLetterTopic: ITopic) {
      cdkBuilder.deadLetterTopic(deadLetterTopic.let(ITopic::unwrap))
    }

    /**
     * A description of the function.
     *
     * Default: - No description.
     *
     * @param description A description of the function. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Key-value pairs that Lambda caches and makes available for your Lambda functions.
     *
     * Use environment variables to apply configuration changes, such
     * as test and production environment configurations, without changing your
     * Lambda function source code.
     *
     * Default: - No environment variables.
     *
     * @param environment Key-value pairs that Lambda caches and makes available for your Lambda
     * functions. 
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * The AWS KMS key that's used to encrypt your function's environment variables.
     *
     * Default: - AWS Lambda creates and uses an AWS managed customer master key (CMK).
     *
     * @param environmentEncryption The AWS KMS key that's used to encrypt your function's
     * environment variables. 
     */
    override fun environmentEncryption(environmentEncryption: IKey) {
      cdkBuilder.environmentEncryption(environmentEncryption.let(IKey::unwrap))
    }

    /**
     * The size of the function’s /tmp directory in MiB.
     *
     * Default: 512 MiB
     *
     * @param ephemeralStorageSize The size of the function’s /tmp directory in MiB. 
     */
    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

    /**
     * Event sources for this function.
     *
     * You can also add event sources using `addEventSource`.
     *
     * Default: - No event sources.
     *
     * @param events Event sources for this function. 
     */
    override fun events(events: List<IEventSource>) {
      cdkBuilder.events(events.map(IEventSource::unwrap))
    }

    /**
     * Event sources for this function.
     *
     * You can also add event sources using `addEventSource`.
     *
     * Default: - No event sources.
     *
     * @param events Event sources for this function. 
     */
    override fun events(vararg events: IEventSource): Unit = events(events.toList())

    /**
     * The filesystem configuration for the lambda function.
     *
     * Default: - will not mount any filesystem
     *
     * @param filesystem The filesystem configuration for the lambda function. 
     */
    override fun filesystem(filesystem: FileSystem) {
      cdkBuilder.filesystem(filesystem.let(FileSystem::unwrap))
    }

    /**
     * A name for the function.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that
     * ID for the function's name. For more information, see Name Type.
     *
     * @param functionName A name for the function. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * The name of the method within your code that Lambda calls to execute your function.
     *
     * The format includes the file name. It can also include
     * namespaces and other qualifiers, depending on the runtime.
     * For more information, see
     * https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html.
     *
     * Use `Handler.FROM_IMAGE` when defining a function from a Docker image.
     *
     * NOTE: If you specify your source code as inline text by specifying the
     * ZipFile property within the Code property, specify index.function_name as
     * the handler.
     *
     * @param handler The name of the method within your code that Lambda calls to execute your
     * function. 
     */
    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    /**
     * Initial policy statements to add to the created Lambda Role.
     *
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     *
     * Default: - No policy statements are added to the created Lambda role.
     *
     * @param initialPolicy Initial policy statements to add to the created Lambda Role. 
     */
    override fun initialPolicy(initialPolicy: List<PolicyStatement>) {
      cdkBuilder.initialPolicy(initialPolicy.map(PolicyStatement::unwrap))
    }

    /**
     * Initial policy statements to add to the created Lambda Role.
     *
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     *
     * Default: - No policy statements are added to the created Lambda role.
     *
     * @param initialPolicy Initial policy statements to add to the created Lambda Role. 
     */
    override fun initialPolicy(vararg initialPolicy: PolicyStatement): Unit =
        initialPolicy(initialPolicy.toList())

    /**
     * Specify the version of CloudWatch Lambda insights to use for monitoring.
     *
     * Default: - No Lambda Insights
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Lambda-Insights-Getting-Started-docker.html)
     * @param insightsVersion Specify the version of CloudWatch Lambda insights to use for
     * monitoring. 
     */
    override fun insightsVersion(insightsVersion: LambdaInsightsVersion) {
      cdkBuilder.insightsVersion(insightsVersion.let(LambdaInsightsVersion::unwrap))
    }

    /**
     * Allows outbound IPv6 traffic on VPC functions that are connected to dual-stack subnets.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: false
     *
     * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
     * connected to dual-stack subnets. 
     */
    override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean) {
      cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack)
    }

    /**
     * A list of layers to add to the function's execution environment.
     *
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     *
     * Default: - No layers.
     *
     * @param layers A list of layers to add to the function's execution environment. 
     */
    override fun layers(layers: List<ILayerVersion>) {
      cdkBuilder.layers(layers.map(ILayerVersion::unwrap))
    }

    /**
     * A list of layers to add to the function's execution environment.
     *
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     *
     * Default: - No layers.
     *
     * @param layers A list of layers to add to the function's execution environment. 
     */
    override fun layers(vararg layers: ILayerVersion): Unit = layers(layers.toList())

    /**
     * Sets the logFormat for the function.
     *
     * Default: "Text"
     *
     * @param logFormat Sets the logFormat for the function. 
     */
    override fun logFormat(logFormat: String) {
      cdkBuilder.logFormat(logFormat)
    }

    /**
     * The log group the function sends logs to.
     *
     * By default, Lambda functions send logs to an automatically created default log group named
     * /aws/lambda/<function name>.
     * However you cannot change the properties of this auto-created log group using the AWS CDK,
     * e.g. you cannot set a different log retention.
     *
     * Use the `logGroup` property to create a fully customizable LogGroup ahead of time, and
     * instruct the Lambda function to send logs to it.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: `/aws/lambda/${this.functionName}` - default log group created by Lambda
     *
     * @param logGroup The log group the function sends logs to. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you move away from it if you can.
     * Instead create a fully customizable log group with `logs.LogGroup` and use the `logGroup`
     * property
     * to instruct the Lambda function to send logs to it.
     * Migrating from `logRetention` to `logGroup` will cause the name of the log group to change.
     * Users and code and referencing the name verbatim will have to adjust.
     *
     * In AWS CDK code, you can access the log group name directly from the LogGroup construct:
     *
     * ```
     * import io.cloudshiftdev.awscdk.services.logs.*;
     * LogGroup myLogGroup;
     * myLogGroup.getLogGroupName();
     * ```
     *
     * Default: logs.RetentionDays.INFINITE
     *
     * @param logRetention The number of days log events are kept in CloudWatch Logs. 
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: - Default AWS SDK retry options.
     *
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group. 
     */
    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: - Default AWS SDK retry options.
     *
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b2d86c2ccaf3f195f0f2849426d47e7323bbe5c1c0b223944e7e281d8fb4629")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: - A new role is created.
     *
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     * resource that sets the retention policy. 
     */
    override fun logRetentionRole(logRetentionRole: IRole) {
      cdkBuilder.logRetentionRole(logRetentionRole.let(IRole::unwrap))
    }

    /**
     * Sets the loggingFormat for the function.
     *
     * Default: LoggingFormat.TEXT
     *
     * @param loggingFormat Sets the loggingFormat for the function. 
     */
    override fun loggingFormat(loggingFormat: LoggingFormat) {
      cdkBuilder.loggingFormat(loggingFormat.let(LoggingFormat::unwrap))
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    /**
     * The amount of memory, in MB, that is allocated to your Lambda function.
     *
     * Lambda uses this value to proportionally allocate the amount of CPU
     * power. For more information, see Resource Model in the AWS Lambda
     * Developer Guide.
     *
     * Default: 128
     *
     * @param memorySize The amount of memory, in MB, that is allocated to your Lambda function. 
     */
    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
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
     * Specify the configuration of Parameters and Secrets Extension.
     *
     * Default: - No Parameters and Secrets Extension
     *
     * [Documentation](https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-integration-lambda-extensions.html)
     * @param paramsAndSecrets Specify the configuration of Parameters and Secrets Extension. 
     */
    override fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion) {
      cdkBuilder.paramsAndSecrets(paramsAndSecrets.let(ParamsAndSecretsLayerVersion::unwrap))
    }

    /**
     * Enable profiling.
     *
     * Default: - No profiling.
     *
     * [Documentation](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/setting-up-lambda.html)
     * @param profiling Enable profiling. 
     */
    override fun profiling(profiling: Boolean) {
      cdkBuilder.profiling(profiling)
    }

    /**
     * Profiling Group.
     *
     * Default: - A new profiling group will be created if `profiling` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/setting-up-lambda.html)
     * @param profilingGroup Profiling Group. 
     */
    override fun profilingGroup(profilingGroup: IProfilingGroup) {
      cdkBuilder.profilingGroup(profilingGroup.let(IProfilingGroup::unwrap))
    }

    /**
     * The maximum of concurrent executions you want to reserve for the function.
     *
     * Default: - No specific limit - account limit.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)
     * @param reservedConcurrentExecutions The maximum of concurrent executions you want to reserve
     * for the function. 
     */
    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * Lambda execution role.
     *
     * This is the role that will be assumed by the function upon execution.
     * It controls the permissions that the function will have. The Role must
     * be assumable by the 'lambda.amazonaws.com' service principal.
     *
     * The default Role automatically has permissions granted for Lambda execution. If you
     * provide a Role, you must add the relevant AWS managed policies yourself.
     *
     * The relevant managed policies are "service-role/AWSLambdaBasicExecutionRole" and
     * "service-role/AWSLambdaVPCAccessExecutionRole".
     *
     * Default: - A unique role will be generated for this lambda function.
     * Both supplied and generated roles can always be changed by calling `addToRolePolicy`.
     *
     * @param role Lambda execution role. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The runtime environment for the Lambda function that you are uploading.
     *
     * For valid values, see the Runtime property in the AWS Lambda Developer
     * Guide.
     *
     * Use `Runtime.FROM_IMAGE` when defining a function from a Docker image.
     *
     * @param runtime The runtime environment for the Lambda function that you are uploading. 
     */
    override fun runtime(runtime: Runtime) {
      cdkBuilder.runtime(runtime.let(Runtime::unwrap))
    }

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * Default: Auto
     *
     * @param runtimeManagementMode Sets the runtime management configuration for a function's
     * version. 
     */
    override fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode) {
      cdkBuilder.runtimeManagementMode(runtimeManagementMode.let(RuntimeManagementMode::unwrap))
    }

    /**
     * The list of security groups to associate with the Lambda's network interfaces.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - If the function is placed within a VPC and a security group is
     * not specified, either by this or securityGroup prop, a dedicated security
     * group will be created for this function.
     *
     * @param securityGroups The list of security groups to associate with the Lambda's network
     * interfaces. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * The list of security groups to associate with the Lambda's network interfaces.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - If the function is placed within a VPC and a security group is
     * not specified, either by this or securityGroup prop, a dedicated security
     * group will be created for this function.
     *
     * @param securityGroups The list of security groups to associate with the Lambda's network
     * interfaces. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Enable SnapStart for Lambda Function.
     *
     * SnapStart is currently supported only for Java 11, 17 runtime
     *
     * Default: - No snapstart
     *
     * @param snapStart Enable SnapStart for Lambda Function. 
     */
    override fun snapStart(snapStart: SnapStartConf) {
      cdkBuilder.snapStart(snapStart.let(SnapStartConf::unwrap))
    }

    /**
     * The stack ID of Lambda&#64;Edge function.
     *
     * Default: - `edge-lambda-stack-${region}`
     *
     * @param stackId The stack ID of Lambda&#64;Edge function. 
     */
    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    /**
     * Sets the system log level for the function.
     *
     * Default: "INFO"
     *
     * @param systemLogLevel Sets the system log level for the function. 
     */
    override fun systemLogLevel(systemLogLevel: String) {
      cdkBuilder.systemLogLevel(systemLogLevel)
    }

    /**
     * The function execution time (in seconds) after which Lambda terminates the function.
     *
     * Because the execution time affects cost, set this value
     * based on the function's expected execution time.
     *
     * Default: Duration.seconds(3)
     *
     * @param timeout The function execution time (in seconds) after which Lambda terminates the
     * function. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * Enable AWS X-Ray Tracing for Lambda Function.
     *
     * Default: Tracing.Disabled
     *
     * @param tracing Enable AWS X-Ray Tracing for Lambda Function. 
     */
    override fun tracing(tracing: Tracing) {
      cdkBuilder.tracing(tracing.let(Tracing::unwrap))
    }

    /**
     * VPC network to place Lambda network interfaces.
     *
     * Specify this if the Lambda function needs to access resources in a VPC.
     * This is required when `vpcSubnets` is specified.
     *
     * Default: - Function is not placed within a VPC.
     *
     * @param vpc VPC network to place Lambda network interfaces. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Where to place the network interfaces within the VPC.
     *
     * This requires `vpc` to be specified in order for interfaces to actually be
     * placed in the subnets. If `vpc` is not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking
     * public subnets is not allowed (unless `allowPublicSubnet` is set to `true`).
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where to place the network interfaces within the VPC. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Where to place the network interfaces within the VPC.
     *
     * This requires `vpc` to be specified in order for interfaces to actually be
     * placed in the subnets. If `vpc` is not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking
     * public subnets is not allowed (unless `allowPublicSubnet` is set to `true`).
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where to place the network interfaces within the VPC. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c19505a61d3eceb02b57a086ff4393c8f46f9c59acbf9f7480ca6486d3836854")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EdgeFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EdgeFunction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction):
        EdgeFunction = EdgeFunction(cdkObject)

    internal fun unwrap(wrapped: EdgeFunction):
        software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction = wrapped.cdkObject
  }
}
