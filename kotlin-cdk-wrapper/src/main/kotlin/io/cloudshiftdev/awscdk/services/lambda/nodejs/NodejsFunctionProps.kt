@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.nodejs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codeguruprofiler.IProfilingGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.AdotInstrumentationConfig
import io.cloudshiftdev.awscdk.services.lambda.Architecture
import io.cloudshiftdev.awscdk.services.lambda.FileSystem
import io.cloudshiftdev.awscdk.services.lambda.FunctionOptions
import io.cloudshiftdev.awscdk.services.lambda.ICodeSigningConfig
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import io.cloudshiftdev.awscdk.services.lambda.LambdaInsightsVersion
import io.cloudshiftdev.awscdk.services.lambda.LogRetentionRetryOptions
import io.cloudshiftdev.awscdk.services.lambda.LoggingFormat
import io.cloudshiftdev.awscdk.services.lambda.ParamsAndSecretsLayerVersion
import io.cloudshiftdev.awscdk.services.lambda.Runtime
import io.cloudshiftdev.awscdk.services.lambda.RuntimeManagementMode
import io.cloudshiftdev.awscdk.services.lambda.SnapStartConf
import io.cloudshiftdev.awscdk.services.lambda.Tracing
import io.cloudshiftdev.awscdk.services.lambda.VersionOptions
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for a NodejsFunction.
 *
 * Example:
 *
 * ```
 * NodejsFunction.Builder.create(this, "my-handler")
 * .bundling(BundlingOptions.builder()
 * .network("host")
 * .securityOpt("no-new-privileges")
 * .user("user:group")
 * .volumesFrom(List.of("777f7dc92da7"))
 * .volumes(List.of(DockerVolume.builder().hostPath("/host-path").containerPath("/container-path").build()))
 * .build())
 * .build();
 * ```
 */
public interface NodejsFunctionProps : FunctionOptions {
  /**
   * Whether to automatically reuse TCP connections when working with the AWS SDK for JavaScript.
   *
   * This sets the `AWS_NODEJS_CONNECTION_REUSE_ENABLED` environment variable
   * to `1`.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/node-reusing-connections.html)
   */
  public fun awsSdkConnectionReuse(): Boolean? = unwrap(this).getAwsSdkConnectionReuse()

  /**
   * Bundling options.
   *
   * Default: - use default bundling options: no minify, no sourcemap, all
   * modules are bundled.
   */
  public fun bundling(): BundlingOptions? = unwrap(this).getBundling()?.let(BundlingOptions::wrap)

  /**
   * The path to the dependencies lock file (`yarn.lock`, `pnpm-lock.yaml` or `package-lock.json`).
   *
   * This will be used as the source for the volume mounted in the Docker
   * container.
   *
   * Modules specified in `nodeModules` will be installed using the right
   * installer (`yarn`, `pnpm` or `npm`) along with this lock file.
   *
   * Default: - the path is found by walking up parent directories searching for
   * a `yarn.lock`, `pnpm-lock.yaml` or `package-lock.json` file
   */
  public fun depsLockFilePath(): String? = unwrap(this).getDepsLockFilePath()

  /**
   * Path to the entry file (JavaScript or TypeScript).
   *
   * Default: - Derived from the name of the defining file and the construct's id.
   * If the `NodejsFunction` is defined in `stack.ts` with `my-handler` as id
   * (`new NodejsFunction(this, 'my-handler')`), the construct will look at `stack.my-handler.ts`
   * and `stack.my-handler.js`.
   */
  public fun entry(): String? = unwrap(this).getEntry()

  /**
   * The name of the exported handler in the entry file.
   *
   * The handler is prefixed with `index.` unless the specified handler value contains a `.`,
   * in which case it is used as-is.
   *
   * Default: handler
   */
  public fun handler(): String? = unwrap(this).getHandler()

  /**
   * The path to the directory containing project config files (`package.json` or `tsconfig.json`).
   *
   * Default: - the directory containing the `depsLockFilePath`
   */
  public fun projectRoot(): String? = unwrap(this).getProjectRoot()

  /**
   * The runtime environment.
   *
   * Only runtimes of the Node.js family are
   * supported.
   *
   * Default: `Runtime.NODEJS_LATEST` if the `@aws-cdk/aws-lambda-nodejs:useLatestRuntimeVersion`
   * feature flag is enabled, otherwise `Runtime.NODEJS_16_X`
   */
  public fun runtime(): Runtime? = unwrap(this).getRuntime()?.let(Runtime::wrap)

  /**
   * A builder for [NodejsFunctionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     * instrumentation.
     */
    public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig)

    /**
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     * instrumentation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41c9787c3f63516eb7d582a6006302c8a920fc427ee513e2ed6615343a194d0a")
    public
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit)

    /**
     * @param allowAllOutbound Whether to allow the Lambda to send all network traffic.
     * If set to false, you must individually add traffic rules to allow the
     * Lambda to connect to network targets.
     *
     * Do not specify this property if the `securityGroups` or `securityGroup` property is set.
     * Instead, configure `allowAllOutbound` directly on the security group.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * @param allowPublicSubnet Lambda Functions in a public subnet can NOT access the internet.
     * Use this property to acknowledge this limitation and still place the function in a public
     * subnet.
     */
    public fun allowPublicSubnet(allowPublicSubnet: Boolean)

    /**
     * @param applicationLogLevel Sets the application log level for the function.
     */
    public fun applicationLogLevel(applicationLogLevel: String)

    /**
     * @param architecture The system architectures compatible with this lambda function.
     */
    public fun architecture(architecture: Architecture)

    /**
     * @param awsSdkConnectionReuse Whether to automatically reuse TCP connections when working with
     * the AWS SDK for JavaScript.
     * This sets the `AWS_NODEJS_CONNECTION_REUSE_ENABLED` environment variable
     * to `1`.
     */
    public fun awsSdkConnectionReuse(awsSdkConnectionReuse: Boolean)

    /**
     * @param bundling Bundling options.
     */
    public fun bundling(bundling: BundlingOptions)

    /**
     * @param bundling Bundling options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fec5c093b7551151b6568be2469be28314c7f7ca63b3e3786c7263e5ece561a")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    /**
     * @param codeSigningConfig Code signing config associated with this function.
     */
    public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig)

    /**
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     * by the `fn.currentVersion` method.
     */
    public fun currentVersionOptions(currentVersionOptions: VersionOptions)

    /**
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     * by the `fn.currentVersion` method.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61630b285fb2a9b4c0f07f254c7c1fc611e3b171ba20d384697504650bf8ebd1")
    public fun currentVersionOptions(currentVersionOptions: VersionOptions.Builder.() -> Unit)

    /**
     * @param deadLetterQueue The SQS queue to use if DLQ is enabled.
     * If SNS topic is desired, specify `deadLetterTopic` property instead.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param deadLetterQueueEnabled Enabled DLQ.
     * If `deadLetterQueue` is undefined,
     * an SQS queue with default options will be defined for your Function.
     */
    public fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean)

    /**
     * @param deadLetterTopic The SNS topic to use as a DLQ.
     * Note that if `deadLetterQueueEnabled` is set to `true`, an SQS queue will be created
     * rather than an SNS topic. Using an SNS topic as a DLQ requires this property to be set
     * explicitly.
     */
    public fun deadLetterTopic(deadLetterTopic: ITopic)

    /**
     * @param depsLockFilePath The path to the dependencies lock file (`yarn.lock`, `pnpm-lock.yaml`
     * or `package-lock.json`).
     * This will be used as the source for the volume mounted in the Docker
     * container.
     *
     * Modules specified in `nodeModules` will be installed using the right
     * installer (`yarn`, `pnpm` or `npm`) along with this lock file.
     */
    public fun depsLockFilePath(depsLockFilePath: String)

    /**
     * @param description A description of the function.
     */
    public fun description(description: String)

    /**
     * @param entry Path to the entry file (JavaScript or TypeScript).
     */
    public fun entry(entry: String)

    /**
     * @param environment Key-value pairs that Lambda caches and makes available for your Lambda
     * functions.
     * Use environment variables to apply configuration changes, such
     * as test and production environment configurations, without changing your
     * Lambda function source code.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param environmentEncryption The AWS KMS key that's used to encrypt your function's
     * environment variables.
     */
    public fun environmentEncryption(environmentEncryption: IKey)

    /**
     * @param ephemeralStorageSize The size of the function’s /tmp directory in MiB.
     */
    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    /**
     * @param events Event sources for this function.
     * You can also add event sources using `addEventSource`.
     */
    public fun events(events: List<IEventSource>)

    /**
     * @param events Event sources for this function.
     * You can also add event sources using `addEventSource`.
     */
    public fun events(vararg events: IEventSource)

    /**
     * @param filesystem The filesystem configuration for the lambda function.
     */
    public fun filesystem(filesystem: FileSystem)

    /**
     * @param functionName A name for the function.
     */
    public fun functionName(functionName: String)

    /**
     * @param handler The name of the exported handler in the entry file.
     * The handler is prefixed with `index.` unless the specified handler value contains a `.`,
     * in which case it is used as-is.
     */
    public fun handler(handler: String)

    /**
     * @param initialPolicy Initial policy statements to add to the created Lambda Role.
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     */
    public fun initialPolicy(initialPolicy: List<PolicyStatement>)

    /**
     * @param initialPolicy Initial policy statements to add to the created Lambda Role.
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     */
    public fun initialPolicy(vararg initialPolicy: PolicyStatement)

    /**
     * @param insightsVersion Specify the version of CloudWatch Lambda insights to use for
     * monitoring.
     */
    public fun insightsVersion(insightsVersion: LambdaInsightsVersion)

    /**
     * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
     * connected to dual-stack subnets.
     * Only used if 'vpc' is supplied.
     */
    public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean)

    /**
     * @param layers A list of layers to add to the function's execution environment.
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     */
    public fun layers(layers: List<ILayerVersion>)

    /**
     * @param layers A list of layers to add to the function's execution environment.
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     */
    public fun layers(vararg layers: ILayerVersion)

    /**
     * @param logFormat Sets the logFormat for the function.
     */
    public fun logFormat(logFormat: String)

    /**
     * @param logGroup The log group the function sends logs to.
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
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logRetention The number of days log events are kept in CloudWatch Logs.
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
     * *
     * LogGroup myLogGroup;
     * *
     * myLogGroup.getLogGroupName();
     * ```
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group.
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group.
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40e843ee188fb963cd1f6c2ba55407f352000be451c9d0c88122eb74d2ced8b0")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    /**
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     * resource that sets the retention policy.
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    public fun logRetentionRole(logRetentionRole: IRole)

    /**
     * @param loggingFormat Sets the loggingFormat for the function.
     */
    public fun loggingFormat(loggingFormat: LoggingFormat)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum: 60 seconds
     * Maximum: 6 hours
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param memorySize The amount of memory, in MB, that is allocated to your Lambda function.
     * Lambda uses this value to proportionally allocate the amount of CPU
     * power. For more information, see Resource Model in the AWS Lambda
     * Developer Guide.
     */
    public fun memorySize(memorySize: Number)

    /**
     * @param onFailure The destination for failed invocations.
     */
    public fun onFailure(onFailure: IDestination)

    /**
     * @param onSuccess The destination for successful invocations.
     */
    public fun onSuccess(onSuccess: IDestination)

    /**
     * @param paramsAndSecrets Specify the configuration of Parameters and Secrets Extension.
     */
    public fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion)

    /**
     * @param profiling Enable profiling.
     */
    public fun profiling(profiling: Boolean)

    /**
     * @param profilingGroup Profiling Group.
     */
    public fun profilingGroup(profilingGroup: IProfilingGroup)

    /**
     * @param projectRoot The path to the directory containing project config files (`package.json`
     * or `tsconfig.json`).
     */
    public fun projectRoot(projectRoot: String)

    /**
     * @param reservedConcurrentExecutions The maximum of concurrent executions you want to reserve
     * for the function.
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param role Lambda execution role.
     * This is the role that will be assumed by the function upon execution.
     * It controls the permissions that the function will have. The Role must
     * be assumable by the 'lambda.amazonaws.com' service principal.
     *
     * The default Role automatically has permissions granted for Lambda execution. If you
     * provide a Role, you must add the relevant AWS managed policies yourself.
     *
     * The relevant managed policies are "service-role/AWSLambdaBasicExecutionRole" and
     * "service-role/AWSLambdaVPCAccessExecutionRole".
     */
    public fun role(role: IRole)

    /**
     * @param runtime The runtime environment.
     * Only runtimes of the Node.js family are
     * supported.
     */
    public fun runtime(runtime: Runtime)

    /**
     * @param runtimeManagementMode Sets the runtime management configuration for a function's
     * version.
     */
    public fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode)

    /**
     * @param securityGroups The list of security groups to associate with the Lambda's network
     * interfaces.
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The list of security groups to associate with the Lambda's network
     * interfaces.
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param snapStart Enable SnapStart for Lambda Function.
     * SnapStart is currently supported only for Java 11, 17 runtime
     */
    public fun snapStart(snapStart: SnapStartConf)

    /**
     * @param systemLogLevel Sets the system log level for the function.
     */
    public fun systemLogLevel(systemLogLevel: String)

    /**
     * @param timeout The function execution time (in seconds) after which Lambda terminates the
     * function.
     * Because the execution time affects cost, set this value
     * based on the function's expected execution time.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param tracing Enable AWS X-Ray Tracing for Lambda Function.
     */
    public fun tracing(tracing: Tracing)

    /**
     * @param vpc VPC network to place Lambda network interfaces.
     * Specify this if the Lambda function needs to access resources in a VPC.
     * This is required when `vpcSubnets` is specified.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC.
     * This requires `vpc` to be specified in order for interfaces to actually be
     * placed in the subnets. If `vpc` is not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking
     * public subnets is not allowed (unless `allowPublicSubnet` is set to `true`).
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC.
     * This requires `vpc` to be specified in order for interfaces to actually be
     * placed in the subnets. If `vpc` is not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking
     * public subnets is not allowed (unless `allowPublicSubnet` is set to `true`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee85b75cc87c5bec4a3d204741c061e9a4936828437011d2e6c02cd769f1b7e0")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps.Builder =
        software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps.builder()

    /**
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     * instrumentation.
     */
    override fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
      cdkBuilder.adotInstrumentation(adotInstrumentation.let(AdotInstrumentationConfig.Companion::unwrap))
    }

    /**
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     * instrumentation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41c9787c3f63516eb7d582a6006302c8a920fc427ee513e2ed6615343a194d0a")
    override
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit):
        Unit = adotInstrumentation(AdotInstrumentationConfig(adotInstrumentation))

    /**
     * @param allowAllOutbound Whether to allow the Lambda to send all network traffic.
     * If set to false, you must individually add traffic rules to allow the
     * Lambda to connect to network targets.
     *
     * Do not specify this property if the `securityGroups` or `securityGroup` property is set.
     * Instead, configure `allowAllOutbound` directly on the security group.
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param allowPublicSubnet Lambda Functions in a public subnet can NOT access the internet.
     * Use this property to acknowledge this limitation and still place the function in a public
     * subnet.
     */
    override fun allowPublicSubnet(allowPublicSubnet: Boolean) {
      cdkBuilder.allowPublicSubnet(allowPublicSubnet)
    }

    /**
     * @param applicationLogLevel Sets the application log level for the function.
     */
    override fun applicationLogLevel(applicationLogLevel: String) {
      cdkBuilder.applicationLogLevel(applicationLogLevel)
    }

    /**
     * @param architecture The system architectures compatible with this lambda function.
     */
    override fun architecture(architecture: Architecture) {
      cdkBuilder.architecture(architecture.let(Architecture.Companion::unwrap))
    }

    /**
     * @param awsSdkConnectionReuse Whether to automatically reuse TCP connections when working with
     * the AWS SDK for JavaScript.
     * This sets the `AWS_NODEJS_CONNECTION_REUSE_ENABLED` environment variable
     * to `1`.
     */
    override fun awsSdkConnectionReuse(awsSdkConnectionReuse: Boolean) {
      cdkBuilder.awsSdkConnectionReuse(awsSdkConnectionReuse)
    }

    /**
     * @param bundling Bundling options.
     */
    override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions.Companion::unwrap))
    }

    /**
     * @param bundling Bundling options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fec5c093b7551151b6568be2469be28314c7f7ca63b3e3786c7263e5ece561a")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    /**
     * @param codeSigningConfig Code signing config associated with this function.
     */
    override fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
      cdkBuilder.codeSigningConfig(codeSigningConfig.let(ICodeSigningConfig.Companion::unwrap))
    }

    /**
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     * by the `fn.currentVersion` method.
     */
    override fun currentVersionOptions(currentVersionOptions: VersionOptions) {
      cdkBuilder.currentVersionOptions(currentVersionOptions.let(VersionOptions.Companion::unwrap))
    }

    /**
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     * by the `fn.currentVersion` method.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61630b285fb2a9b4c0f07f254c7c1fc611e3b171ba20d384697504650bf8ebd1")
    override fun currentVersionOptions(currentVersionOptions: VersionOptions.Builder.() -> Unit):
        Unit = currentVersionOptions(VersionOptions(currentVersionOptions))

    /**
     * @param deadLetterQueue The SQS queue to use if DLQ is enabled.
     * If SNS topic is desired, specify `deadLetterTopic` property instead.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param deadLetterQueueEnabled Enabled DLQ.
     * If `deadLetterQueue` is undefined,
     * an SQS queue with default options will be defined for your Function.
     */
    override fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean) {
      cdkBuilder.deadLetterQueueEnabled(deadLetterQueueEnabled)
    }

    /**
     * @param deadLetterTopic The SNS topic to use as a DLQ.
     * Note that if `deadLetterQueueEnabled` is set to `true`, an SQS queue will be created
     * rather than an SNS topic. Using an SNS topic as a DLQ requires this property to be set
     * explicitly.
     */
    override fun deadLetterTopic(deadLetterTopic: ITopic) {
      cdkBuilder.deadLetterTopic(deadLetterTopic.let(ITopic.Companion::unwrap))
    }

    /**
     * @param depsLockFilePath The path to the dependencies lock file (`yarn.lock`, `pnpm-lock.yaml`
     * or `package-lock.json`).
     * This will be used as the source for the volume mounted in the Docker
     * container.
     *
     * Modules specified in `nodeModules` will be installed using the right
     * installer (`yarn`, `pnpm` or `npm`) along with this lock file.
     */
    override fun depsLockFilePath(depsLockFilePath: String) {
      cdkBuilder.depsLockFilePath(depsLockFilePath)
    }

    /**
     * @param description A description of the function.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param entry Path to the entry file (JavaScript or TypeScript).
     */
    override fun entry(entry: String) {
      cdkBuilder.entry(entry)
    }

    /**
     * @param environment Key-value pairs that Lambda caches and makes available for your Lambda
     * functions.
     * Use environment variables to apply configuration changes, such
     * as test and production environment configurations, without changing your
     * Lambda function source code.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param environmentEncryption The AWS KMS key that's used to encrypt your function's
     * environment variables.
     */
    override fun environmentEncryption(environmentEncryption: IKey) {
      cdkBuilder.environmentEncryption(environmentEncryption.let(IKey.Companion::unwrap))
    }

    /**
     * @param ephemeralStorageSize The size of the function’s /tmp directory in MiB.
     */
    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size.Companion::unwrap))
    }

    /**
     * @param events Event sources for this function.
     * You can also add event sources using `addEventSource`.
     */
    override fun events(events: List<IEventSource>) {
      cdkBuilder.events(events.map(IEventSource.Companion::unwrap))
    }

    /**
     * @param events Event sources for this function.
     * You can also add event sources using `addEventSource`.
     */
    override fun events(vararg events: IEventSource): Unit = events(events.toList())

    /**
     * @param filesystem The filesystem configuration for the lambda function.
     */
    override fun filesystem(filesystem: FileSystem) {
      cdkBuilder.filesystem(filesystem.let(FileSystem.Companion::unwrap))
    }

    /**
     * @param functionName A name for the function.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param handler The name of the exported handler in the entry file.
     * The handler is prefixed with `index.` unless the specified handler value contains a `.`,
     * in which case it is used as-is.
     */
    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    /**
     * @param initialPolicy Initial policy statements to add to the created Lambda Role.
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     */
    override fun initialPolicy(initialPolicy: List<PolicyStatement>) {
      cdkBuilder.initialPolicy(initialPolicy.map(PolicyStatement.Companion::unwrap))
    }

    /**
     * @param initialPolicy Initial policy statements to add to the created Lambda Role.
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     */
    override fun initialPolicy(vararg initialPolicy: PolicyStatement): Unit =
        initialPolicy(initialPolicy.toList())

    /**
     * @param insightsVersion Specify the version of CloudWatch Lambda insights to use for
     * monitoring.
     */
    override fun insightsVersion(insightsVersion: LambdaInsightsVersion) {
      cdkBuilder.insightsVersion(insightsVersion.let(LambdaInsightsVersion.Companion::unwrap))
    }

    /**
     * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
     * connected to dual-stack subnets.
     * Only used if 'vpc' is supplied.
     */
    override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean) {
      cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack)
    }

    /**
     * @param layers A list of layers to add to the function's execution environment.
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     */
    override fun layers(layers: List<ILayerVersion>) {
      cdkBuilder.layers(layers.map(ILayerVersion.Companion::unwrap))
    }

    /**
     * @param layers A list of layers to add to the function's execution environment.
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     */
    override fun layers(vararg layers: ILayerVersion): Unit = layers(layers.toList())

    /**
     * @param logFormat Sets the logFormat for the function.
     */
    override fun logFormat(logFormat: String) {
      cdkBuilder.logFormat(logFormat)
    }

    /**
     * @param logGroup The log group the function sends logs to.
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
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
    }

    /**
     * @param logRetention The number of days log events are kept in CloudWatch Logs.
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
     * *
     * LogGroup myLogGroup;
     * *
     * myLogGroup.getLogGroupName();
     * ```
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays.Companion::unwrap))
    }

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group.
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions.Companion::unwrap))
    }

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group.
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40e843ee188fb963cd1f6c2ba55407f352000be451c9d0c88122eb74d2ced8b0")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    /**
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     * resource that sets the retention policy.
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    override fun logRetentionRole(logRetentionRole: IRole) {
      cdkBuilder.logRetentionRole(logRetentionRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param loggingFormat Sets the loggingFormat for the function.
     */
    override fun loggingFormat(loggingFormat: LoggingFormat) {
      cdkBuilder.loggingFormat(loggingFormat.let(LoggingFormat.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum: 60 seconds
     * Maximum: 6 hours
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param memorySize The amount of memory, in MB, that is allocated to your Lambda function.
     * Lambda uses this value to proportionally allocate the amount of CPU
     * power. For more information, see Resource Model in the AWS Lambda
     * Developer Guide.
     */
    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    /**
     * @param onFailure The destination for failed invocations.
     */
    override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination.Companion::unwrap))
    }

    /**
     * @param onSuccess The destination for successful invocations.
     */
    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination.Companion::unwrap))
    }

    /**
     * @param paramsAndSecrets Specify the configuration of Parameters and Secrets Extension.
     */
    override fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion) {
      cdkBuilder.paramsAndSecrets(paramsAndSecrets.let(ParamsAndSecretsLayerVersion.Companion::unwrap))
    }

    /**
     * @param profiling Enable profiling.
     */
    override fun profiling(profiling: Boolean) {
      cdkBuilder.profiling(profiling)
    }

    /**
     * @param profilingGroup Profiling Group.
     */
    override fun profilingGroup(profilingGroup: IProfilingGroup) {
      cdkBuilder.profilingGroup(profilingGroup.let(IProfilingGroup.Companion::unwrap))
    }

    /**
     * @param projectRoot The path to the directory containing project config files (`package.json`
     * or `tsconfig.json`).
     */
    override fun projectRoot(projectRoot: String) {
      cdkBuilder.projectRoot(projectRoot)
    }

    /**
     * @param reservedConcurrentExecutions The maximum of concurrent executions you want to reserve
     * for the function.
     */
    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role Lambda execution role.
     * This is the role that will be assumed by the function upon execution.
     * It controls the permissions that the function will have. The Role must
     * be assumable by the 'lambda.amazonaws.com' service principal.
     *
     * The default Role automatically has permissions granted for Lambda execution. If you
     * provide a Role, you must add the relevant AWS managed policies yourself.
     *
     * The relevant managed policies are "service-role/AWSLambdaBasicExecutionRole" and
     * "service-role/AWSLambdaVPCAccessExecutionRole".
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runtime The runtime environment.
     * Only runtimes of the Node.js family are
     * supported.
     */
    override fun runtime(runtime: Runtime) {
      cdkBuilder.runtime(runtime.let(Runtime.Companion::unwrap))
    }

    /**
     * @param runtimeManagementMode Sets the runtime management configuration for a function's
     * version.
     */
    override fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode) {
      cdkBuilder.runtimeManagementMode(runtimeManagementMode.let(RuntimeManagementMode.Companion::unwrap))
    }

    /**
     * @param securityGroups The list of security groups to associate with the Lambda's network
     * interfaces.
     * Only used if 'vpc' is supplied.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups The list of security groups to associate with the Lambda's network
     * interfaces.
     * Only used if 'vpc' is supplied.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param snapStart Enable SnapStart for Lambda Function.
     * SnapStart is currently supported only for Java 11, 17 runtime
     */
    override fun snapStart(snapStart: SnapStartConf) {
      cdkBuilder.snapStart(snapStart.let(SnapStartConf.Companion::unwrap))
    }

    /**
     * @param systemLogLevel Sets the system log level for the function.
     */
    override fun systemLogLevel(systemLogLevel: String) {
      cdkBuilder.systemLogLevel(systemLogLevel)
    }

    /**
     * @param timeout The function execution time (in seconds) after which Lambda terminates the
     * function.
     * Because the execution time affects cost, set this value
     * based on the function's expected execution time.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param tracing Enable AWS X-Ray Tracing for Lambda Function.
     */
    override fun tracing(tracing: Tracing) {
      cdkBuilder.tracing(tracing.let(Tracing.Companion::unwrap))
    }

    /**
     * @param vpc VPC network to place Lambda network interfaces.
     * Specify this if the Lambda function needs to access resources in a VPC.
     * This is required when `vpcSubnets` is specified.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC.
     * This requires `vpc` to be specified in order for interfaces to actually be
     * placed in the subnets. If `vpc` is not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking
     * public subnets is not allowed (unless `allowPublicSubnet` is set to `true`).
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC.
     * This requires `vpc` to be specified in order for interfaces to actually be
     * placed in the subnets. If `vpc` is not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking
     * public subnets is not allowed (unless `allowPublicSubnet` is set to `true`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee85b75cc87c5bec4a3d204741c061e9a4936828437011d2e6c02cd769f1b7e0")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps,
  ) : CdkObject(cdkObject), NodejsFunctionProps {
    /**
     * Specify the configuration of AWS Distro for OpenTelemetry (ADOT) instrumentation.
     *
     * Default: - No ADOT instrumentation
     *
     * [Documentation](https://aws-otel.github.io/docs/getting-started/lambda)
     */
    override fun adotInstrumentation(): AdotInstrumentationConfig? =
        unwrap(this).getAdotInstrumentation()?.let(AdotInstrumentationConfig::wrap)

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
     */
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    /**
     * Lambda Functions in a public subnet can NOT access the internet.
     *
     * Use this property to acknowledge this limitation and still place the function in a public
     * subnet.
     *
     * Default: false
     *
     * [Documentation](https://stackoverflow.com/questions/52992085/why-cant-an-aws-lambda-function-inside-a-public-subnet-in-a-vpc-connect-to-the/52994841#52994841)
     */
    override fun allowPublicSubnet(): Boolean? = unwrap(this).getAllowPublicSubnet()

    /**
     * Sets the application log level for the function.
     *
     * Default: "INFO"
     */
    override fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

    /**
     * The system architectures compatible with this lambda function.
     *
     * Default: Architecture.X86_64
     */
    override fun architecture(): Architecture? =
        unwrap(this).getArchitecture()?.let(Architecture::wrap)

    /**
     * Whether to automatically reuse TCP connections when working with the AWS SDK for JavaScript.
     *
     * This sets the `AWS_NODEJS_CONNECTION_REUSE_ENABLED` environment variable
     * to `1`.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/node-reusing-connections.html)
     */
    override fun awsSdkConnectionReuse(): Boolean? = unwrap(this).getAwsSdkConnectionReuse()

    /**
     * Bundling options.
     *
     * Default: - use default bundling options: no minify, no sourcemap, all
     * modules are bundled.
     */
    override fun bundling(): BundlingOptions? =
        unwrap(this).getBundling()?.let(BundlingOptions::wrap)

    /**
     * Code signing config associated with this function.
     *
     * Default: - Not Sign the Code
     */
    override fun codeSigningConfig(): ICodeSigningConfig? =
        unwrap(this).getCodeSigningConfig()?.let(ICodeSigningConfig::wrap)

    /**
     * Options for the `lambda.Version` resource automatically created by the `fn.currentVersion`
     * method.
     *
     * Default: - default options as described in `VersionOptions`
     */
    override fun currentVersionOptions(): VersionOptions? =
        unwrap(this).getCurrentVersionOptions()?.let(VersionOptions::wrap)

    /**
     * The SQS queue to use if DLQ is enabled.
     *
     * If SNS topic is desired, specify `deadLetterTopic` property instead.
     *
     * Default: - SQS queue with 14 day retention period if `deadLetterQueueEnabled` is `true`
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * Enabled DLQ.
     *
     * If `deadLetterQueue` is undefined,
     * an SQS queue with default options will be defined for your Function.
     *
     * Default: - false unless `deadLetterQueue` is set, which implies DLQ is enabled.
     */
    override fun deadLetterQueueEnabled(): Boolean? = unwrap(this).getDeadLetterQueueEnabled()

    /**
     * The SNS topic to use as a DLQ.
     *
     * Note that if `deadLetterQueueEnabled` is set to `true`, an SQS queue will be created
     * rather than an SNS topic. Using an SNS topic as a DLQ requires this property to be set
     * explicitly.
     *
     * Default: - no SNS topic
     */
    override fun deadLetterTopic(): ITopic? = unwrap(this).getDeadLetterTopic()?.let(ITopic::wrap)

    /**
     * The path to the dependencies lock file (`yarn.lock`, `pnpm-lock.yaml` or
     * `package-lock.json`).
     *
     * This will be used as the source for the volume mounted in the Docker
     * container.
     *
     * Modules specified in `nodeModules` will be installed using the right
     * installer (`yarn`, `pnpm` or `npm`) along with this lock file.
     *
     * Default: - the path is found by walking up parent directories searching for
     * a `yarn.lock`, `pnpm-lock.yaml` or `package-lock.json` file
     */
    override fun depsLockFilePath(): String? = unwrap(this).getDepsLockFilePath()

    /**
     * A description of the function.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Path to the entry file (JavaScript or TypeScript).
     *
     * Default: - Derived from the name of the defining file and the construct's id.
     * If the `NodejsFunction` is defined in `stack.ts` with `my-handler` as id
     * (`new NodejsFunction(this, 'my-handler')`), the construct will look at `stack.my-handler.ts`
     * and `stack.my-handler.js`.
     */
    override fun entry(): String? = unwrap(this).getEntry()

    /**
     * Key-value pairs that Lambda caches and makes available for your Lambda functions.
     *
     * Use environment variables to apply configuration changes, such
     * as test and production environment configurations, without changing your
     * Lambda function source code.
     *
     * Default: - No environment variables.
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The AWS KMS key that's used to encrypt your function's environment variables.
     *
     * Default: - AWS Lambda creates and uses an AWS managed customer master key (CMK).
     */
    override fun environmentEncryption(): IKey? =
        unwrap(this).getEnvironmentEncryption()?.let(IKey::wrap)

    /**
     * The size of the function’s /tmp directory in MiB.
     *
     * Default: 512 MiB
     */
    override fun ephemeralStorageSize(): Size? =
        unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

    /**
     * Event sources for this function.
     *
     * You can also add event sources using `addEventSource`.
     *
     * Default: - No event sources.
     */
    override fun events(): List<IEventSource> = unwrap(this).getEvents()?.map(IEventSource::wrap) ?:
        emptyList()

    /**
     * The filesystem configuration for the lambda function.
     *
     * Default: - will not mount any filesystem
     */
    override fun filesystem(): FileSystem? = unwrap(this).getFilesystem()?.let(FileSystem::wrap)

    /**
     * A name for the function.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that
     * ID for the function's name. For more information, see Name Type.
     */
    override fun functionName(): String? = unwrap(this).getFunctionName()

    /**
     * The name of the exported handler in the entry file.
     *
     * The handler is prefixed with `index.` unless the specified handler value contains a `.`,
     * in which case it is used as-is.
     *
     * Default: handler
     */
    override fun handler(): String? = unwrap(this).getHandler()

    /**
     * Initial policy statements to add to the created Lambda Role.
     *
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     *
     * Default: - No policy statements are added to the created Lambda role.
     */
    override fun initialPolicy(): List<PolicyStatement> =
        unwrap(this).getInitialPolicy()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * Specify the version of CloudWatch Lambda insights to use for monitoring.
     *
     * Default: - No Lambda Insights
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Lambda-Insights-Getting-Started-docker.html)
     */
    override fun insightsVersion(): LambdaInsightsVersion? =
        unwrap(this).getInsightsVersion()?.let(LambdaInsightsVersion::wrap)

    /**
     * Allows outbound IPv6 traffic on VPC functions that are connected to dual-stack subnets.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: false
     */
    override fun ipv6AllowedForDualStack(): Boolean? = unwrap(this).getIpv6AllowedForDualStack()

    /**
     * A list of layers to add to the function's execution environment.
     *
     * You can configure your Lambda function to pull in
     * additional code during initialization in the form of layers. Layers are packages of libraries
     * or other dependencies
     * that can be used by multiple functions.
     *
     * Default: - No layers.
     */
    override fun layers(): List<ILayerVersion> = unwrap(this).getLayers()?.map(ILayerVersion::wrap)
        ?: emptyList()

    /**
     * Sets the logFormat for the function.
     *
     * Default: "Text"
     */
    override fun logFormat(): String? = unwrap(this).getLogFormat()

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
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

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
     */
    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

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
     */
    override fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
        unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: - A new role is created.
     */
    override fun logRetentionRole(): IRole? = unwrap(this).getLogRetentionRole()?.let(IRole::wrap)

    /**
     * Sets the loggingFormat for the function.
     *
     * Default: LoggingFormat.TEXT
     */
    override fun loggingFormat(): LoggingFormat? =
        unwrap(this).getLoggingFormat()?.let(LoggingFormat::wrap)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The amount of memory, in MB, that is allocated to your Lambda function.
     *
     * Lambda uses this value to proportionally allocate the amount of CPU
     * power. For more information, see Resource Model in the AWS Lambda
     * Developer Guide.
     *
     * Default: 128
     */
    override fun memorySize(): Number? = unwrap(this).getMemorySize()

    /**
     * The destination for failed invocations.
     *
     * Default: - no destination
     */
    override fun onFailure(): IDestination? = unwrap(this).getOnFailure()?.let(IDestination::wrap)

    /**
     * The destination for successful invocations.
     *
     * Default: - no destination
     */
    override fun onSuccess(): IDestination? = unwrap(this).getOnSuccess()?.let(IDestination::wrap)

    /**
     * Specify the configuration of Parameters and Secrets Extension.
     *
     * Default: - No Parameters and Secrets Extension
     *
     * [Documentation](https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-integration-lambda-extensions.html)
     */
    override fun paramsAndSecrets(): ParamsAndSecretsLayerVersion? =
        unwrap(this).getParamsAndSecrets()?.let(ParamsAndSecretsLayerVersion::wrap)

    /**
     * Enable profiling.
     *
     * Default: - No profiling.
     *
     * [Documentation](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/setting-up-lambda.html)
     */
    override fun profiling(): Boolean? = unwrap(this).getProfiling()

    /**
     * Profiling Group.
     *
     * Default: - A new profiling group will be created if `profiling` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/setting-up-lambda.html)
     */
    override fun profilingGroup(): IProfilingGroup? =
        unwrap(this).getProfilingGroup()?.let(IProfilingGroup::wrap)

    /**
     * The path to the directory containing project config files (`package.json` or
     * `tsconfig.json`).
     *
     * Default: - the directory containing the `depsLockFilePath`
     */
    override fun projectRoot(): String? = unwrap(this).getProjectRoot()

    /**
     * The maximum of concurrent executions you want to reserve for the function.
     *
     * Default: - No specific limit - account limit.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)
     */
    override fun reservedConcurrentExecutions(): Number? =
        unwrap(this).getReservedConcurrentExecutions()

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runtime environment.
     *
     * Only runtimes of the Node.js family are
     * supported.
     *
     * Default: `Runtime.NODEJS_LATEST` if the `@aws-cdk/aws-lambda-nodejs:useLatestRuntimeVersion`
     * feature flag is enabled, otherwise `Runtime.NODEJS_16_X`
     */
    override fun runtime(): Runtime? = unwrap(this).getRuntime()?.let(Runtime::wrap)

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * Default: Auto
     */
    override fun runtimeManagementMode(): RuntimeManagementMode? =
        unwrap(this).getRuntimeManagementMode()?.let(RuntimeManagementMode::wrap)

    /**
     * The list of security groups to associate with the Lambda's network interfaces.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - If the function is placed within a VPC and a security group is
     * not specified, either by this or securityGroup prop, a dedicated security
     * group will be created for this function.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Enable SnapStart for Lambda Function.
     *
     * SnapStart is currently supported only for Java 11, 17 runtime
     *
     * Default: - No snapstart
     */
    override fun snapStart(): SnapStartConf? = unwrap(this).getSnapStart()?.let(SnapStartConf::wrap)

    /**
     * Sets the system log level for the function.
     *
     * Default: "INFO"
     */
    override fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()

    /**
     * The function execution time (in seconds) after which Lambda terminates the function.
     *
     * Because the execution time affects cost, set this value
     * based on the function's expected execution time.
     *
     * Default: Duration.seconds(3)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * Enable AWS X-Ray Tracing for Lambda Function.
     *
     * Default: Tracing.Disabled
     */
    override fun tracing(): Tracing? = unwrap(this).getTracing()?.let(Tracing::wrap)

    /**
     * VPC network to place Lambda network interfaces.
     *
     * Specify this if the Lambda function needs to access resources in a VPC.
     * This is required when `vpcSubnets` is specified.
     *
     * Default: - Function is not placed within a VPC.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

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
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NodejsFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps):
        NodejsFunctionProps = CdkObjectWrappers.wrap(cdkObject) as? NodejsFunctionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodejsFunctionProps):
        software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps
  }
}
