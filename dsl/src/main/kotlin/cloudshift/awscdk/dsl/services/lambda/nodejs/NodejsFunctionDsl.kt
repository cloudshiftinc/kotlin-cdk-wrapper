@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.nodejs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.lambda.AdotInstrumentationConfigDsl
import cloudshift.awscdk.dsl.services.lambda.LogRetentionRetryOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.VersionOptionsDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.AdotInstrumentationConfig
import software.amazon.awscdk.services.lambda.Architecture
import software.amazon.awscdk.services.lambda.FileSystem
import software.amazon.awscdk.services.lambda.ICodeSigningConfig
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IEventSource
import software.amazon.awscdk.services.lambda.ILayerVersion
import software.amazon.awscdk.services.lambda.LambdaInsightsVersion
import software.amazon.awscdk.services.lambda.LogRetentionRetryOptions
import software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.lambda.RuntimeManagementMode
import software.amazon.awscdk.services.lambda.Tracing
import software.amazon.awscdk.services.lambda.VersionOptions
import software.amazon.awscdk.services.lambda.nodejs.BundlingOptions
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunction
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sqs.IQueue
import software.constructs.Construct

/**
 * A Node.js Lambda function bundled using esbuild.
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
@CdkDslMarker
public class NodejsFunctionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NodejsFunction.Builder = NodejsFunction.Builder.create(scope, id)

  private val _events: MutableList<IEventSource> = mutableListOf()

  private val _initialPolicy: MutableList<PolicyStatement> = mutableListOf()

  private val _layers: MutableList<ILayerVersion> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * Specify the configuration of AWS Distro for OpenTelemetry (ADOT) instrumentation.
   *
   * Default: - No ADOT instrumentation
   *
   * [Documentation](https://aws-otel.github.io/docs/getting-started/lambda)
   * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
   * instrumentation. 
   */
  public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfigDsl.() -> Unit =
      {}) {
    val builder = AdotInstrumentationConfigDsl()
    builder.apply(adotInstrumentation)
    cdkBuilder.adotInstrumentation(builder.build())
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
  public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
    cdkBuilder.adotInstrumentation(adotInstrumentation)
  }

  /**
   * Whether to allow the Lambda to send all network traffic.
   *
   * If set to false, you must individually add traffic rules to allow the
   * Lambda to connect to network targets.
   *
   * Default: true
   *
   * @param allowAllOutbound Whether to allow the Lambda to send all network traffic. 
   */
  public fun allowAllOutbound(allowAllOutbound: Boolean) {
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
  public fun allowPublicSubnet(allowPublicSubnet: Boolean) {
    cdkBuilder.allowPublicSubnet(allowPublicSubnet)
  }

  /**
   * The system architectures compatible with this lambda function.
   *
   * Default: Architecture.X86_64
   *
   * @param architecture The system architectures compatible with this lambda function. 
   */
  public fun architecture(architecture: Architecture) {
    cdkBuilder.architecture(architecture)
  }

  /**
   * Whether to automatically reuse TCP connections when working with the AWS SDK for JavaScript.
   *
   * This sets the `AWS_NODEJS_CONNECTION_REUSE_ENABLED` environment variable
   * to `1`.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/node-reusing-connections.html)
   * @param awsSdkConnectionReuse Whether to automatically reuse TCP connections when working with
   * the AWS SDK for JavaScript. 
   */
  public fun awsSdkConnectionReuse(awsSdkConnectionReuse: Boolean) {
    cdkBuilder.awsSdkConnectionReuse(awsSdkConnectionReuse)
  }

  /**
   * Bundling options.
   *
   * Default: - use default bundling options: no minify, no sourcemap, all
   * modules are bundled.
   *
   * @param bundling Bundling options. 
   */
  public fun bundling(bundling: BundlingOptionsDsl.() -> Unit = {}) {
    val builder = BundlingOptionsDsl()
    builder.apply(bundling)
    cdkBuilder.bundling(builder.build())
  }

  /**
   * Bundling options.
   *
   * Default: - use default bundling options: no minify, no sourcemap, all
   * modules are bundled.
   *
   * @param bundling Bundling options. 
   */
  public fun bundling(bundling: BundlingOptions) {
    cdkBuilder.bundling(bundling)
  }

  /**
   * Code signing config associated with this function.
   *
   * Default: - Not Sign the Code
   *
   * @param codeSigningConfig Code signing config associated with this function. 
   */
  public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
    cdkBuilder.codeSigningConfig(codeSigningConfig)
  }

  /**
   * Options for the `lambda.Version` resource automatically created by the `fn.currentVersion`
   * method.
   *
   * Default: - default options as described in `VersionOptions`
   *
   * @param currentVersionOptions Options for the `lambda.Version` resource automatically created by
   * the `fn.currentVersion` method. 
   */
  public fun currentVersionOptions(currentVersionOptions: VersionOptionsDsl.() -> Unit = {}) {
    val builder = VersionOptionsDsl()
    builder.apply(currentVersionOptions)
    cdkBuilder.currentVersionOptions(builder.build())
  }

  /**
   * Options for the `lambda.Version` resource automatically created by the `fn.currentVersion`
   * method.
   *
   * Default: - default options as described in `VersionOptions`
   *
   * @param currentVersionOptions Options for the `lambda.Version` resource automatically created by
   * the `fn.currentVersion` method. 
   */
  public fun currentVersionOptions(currentVersionOptions: VersionOptions) {
    cdkBuilder.currentVersionOptions(currentVersionOptions)
  }

  /**
   * The SQS queue to use if DLQ is enabled.
   *
   * If SNS topic is desired, specify `deadLetterTopic` property instead.
   *
   * Default: - SQS queue with 14 day retention period if `deadLetterQueueEnabled` is `true`
   *
   * @param deadLetterQueue The SQS queue to use if DLQ is enabled. 
   */
  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
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
  public fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean) {
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
  public fun deadLetterTopic(deadLetterTopic: ITopic) {
    cdkBuilder.deadLetterTopic(deadLetterTopic)
  }

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
   *
   * @param depsLockFilePath The path to the dependencies lock file (`yarn.lock`, `pnpm-lock.yaml`
   * or `package-lock.json`). 
   */
  public fun depsLockFilePath(depsLockFilePath: String) {
    cdkBuilder.depsLockFilePath(depsLockFilePath)
  }

  /**
   * A description of the function.
   *
   * Default: - No description.
   *
   * @param description A description of the function. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Path to the entry file (JavaScript or TypeScript).
   *
   * Default: - Derived from the name of the defining file and the construct's id.
   * If the `NodejsFunction` is defined in `stack.ts` with `my-handler` as id
   * (`new NodejsFunction(this, 'my-handler')`), the construct will look at `stack.my-handler.ts`
   * and `stack.my-handler.js`.
   *
   * @param entry Path to the entry file (JavaScript or TypeScript). 
   */
  public fun entry(entry: String) {
    cdkBuilder.entry(entry)
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
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * The AWS KMS key that's used to encrypt your function's environment variables.
   *
   * Default: - AWS Lambda creates and uses an AWS managed customer master key (CMK).
   *
   * @param environmentEncryption The AWS KMS key that's used to encrypt your function's environment
   * variables. 
   */
  public fun environmentEncryption(environmentEncryption: IKey) {
    cdkBuilder.environmentEncryption(environmentEncryption)
  }

  /**
   * The size of the function’s /tmp directory in MiB.
   *
   * Default: 512 MiB
   *
   * @param ephemeralStorageSize The size of the function’s /tmp directory in MiB. 
   */
  public fun ephemeralStorageSize(ephemeralStorageSize: Size) {
    cdkBuilder.ephemeralStorageSize(ephemeralStorageSize)
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
  public fun events(vararg events: IEventSource) {
    _events.addAll(listOf(*events))
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
  public fun events(events: Collection<IEventSource>) {
    _events.addAll(events)
  }

  /**
   * The filesystem configuration for the lambda function.
   *
   * Default: - will not mount any filesystem
   *
   * @param filesystem The filesystem configuration for the lambda function. 
   */
  public fun filesystem(filesystem: FileSystem) {
    cdkBuilder.filesystem(filesystem)
  }

  /**
   * A name for the function.
   *
   * Default: - AWS CloudFormation generates a unique physical ID and uses that
   * ID for the function's name. For more information, see Name Type.
   *
   * @param functionName A name for the function. 
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  /**
   * The name of the exported handler in the entry file.
   *
   * The handler is prefixed with `index.` unless the specified handler value contains a `.`,
   * in which case it is used as-is.
   *
   * Default: handler
   *
   * @param handler The name of the exported handler in the entry file. 
   */
  public fun handler(handler: String) {
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
  public fun initialPolicy(initialPolicy: PolicyStatementDsl.() -> Unit) {
    _initialPolicy.add(PolicyStatementDsl().apply(initialPolicy).build())
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
  public fun initialPolicy(initialPolicy: Collection<PolicyStatement>) {
    _initialPolicy.addAll(initialPolicy)
  }

  /**
   * Specify the version of CloudWatch Lambda insights to use for monitoring.
   *
   * Default: - No Lambda Insights
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Lambda-Insights-Getting-Started-docker.html)
   * @param insightsVersion Specify the version of CloudWatch Lambda insights to use for monitoring.
   * 
   */
  public fun insightsVersion(insightsVersion: LambdaInsightsVersion) {
    cdkBuilder.insightsVersion(insightsVersion)
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
  public fun layers(vararg layers: ILayerVersion) {
    _layers.addAll(listOf(*layers))
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
  public fun layers(layers: Collection<ILayerVersion>) {
    _layers.addAll(layers)
  }

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * When updating
   * this property, unsetting it doesn't remove the log retention policy. To
   * remove the retention policy, set the value to `INFINITE`.
   *
   * Default: logs.RetentionDays.INFINITE
   *
   * @param logRetention The number of days log events are kept in CloudWatch Logs. 
   */
  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  /**
   * When log retention is specified, a custom resource attempts to create the CloudWatch log group.
   *
   * These options control the retry policy when interacting with CloudWatch APIs.
   *
   * Default: - Default AWS SDK retry options.
   *
   * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts to
   * create the CloudWatch log group. 
   */
  public
      fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptionsDsl.() -> Unit
      = {}) {
    val builder = LogRetentionRetryOptionsDsl()
    builder.apply(logRetentionRetryOptions)
    cdkBuilder.logRetentionRetryOptions(builder.build())
  }

  /**
   * When log retention is specified, a custom resource attempts to create the CloudWatch log group.
   *
   * These options control the retry policy when interacting with CloudWatch APIs.
   *
   * Default: - Default AWS SDK retry options.
   *
   * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts to
   * create the CloudWatch log group. 
   */
  public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
  }

  /**
   * The IAM role for the Lambda function associated with the custom resource that sets the
   * retention policy.
   *
   * Default: - A new role is created.
   *
   * @param logRetentionRole The IAM role for the Lambda function associated with the custom
   * resource that sets the retention policy. 
   */
  public fun logRetentionRole(logRetentionRole: IRole) {
    cdkBuilder.logRetentionRole(logRetentionRole)
  }

  /**
   * The maximum age of a request that Lambda sends to a function for processing.
   *
   * Minimum: 60 seconds
   * Maximum: 6 hours
   *
   * Default: Duration.hours(6)
   *
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * 
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
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
  public fun memorySize(memorySize: Number) {
    cdkBuilder.memorySize(memorySize)
  }

  /**
   * The destination for failed invocations.
   *
   * Default: - no destination
   *
   * @param onFailure The destination for failed invocations. 
   */
  public fun onFailure(onFailure: IDestination) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * The destination for successful invocations.
   *
   * Default: - no destination
   *
   * @param onSuccess The destination for successful invocations. 
   */
  public fun onSuccess(onSuccess: IDestination) {
    cdkBuilder.onSuccess(onSuccess)
  }

  /**
   * Specify the configuration of Parameters and Secrets Extension.
   *
   * Default: - No Parameters and Secrets Extension
   *
   * [Documentation](https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-integration-lambda-extensions.html)
   * @param paramsAndSecrets Specify the configuration of Parameters and Secrets Extension. 
   */
  public fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion) {
    cdkBuilder.paramsAndSecrets(paramsAndSecrets)
  }

  /**
   * Enable profiling.
   *
   * Default: - No profiling.
   *
   * [Documentation](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/setting-up-lambda.html)
   * @param profiling Enable profiling. 
   */
  public fun profiling(profiling: Boolean) {
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
  public fun profilingGroup(profilingGroup: IProfilingGroup) {
    cdkBuilder.profilingGroup(profilingGroup)
  }

  /**
   * The path to the directory containing project config files (`package.json` or `tsconfig.json`).
   *
   * Default: - the directory containing the `depsLockFilePath`
   *
   * @param projectRoot The path to the directory containing project config files (`package.json` or
   * `tsconfig.json`). 
   */
  public fun projectRoot(projectRoot: String) {
    cdkBuilder.projectRoot(projectRoot)
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
  public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
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
   */
  public fun retryAttempts(retryAttempts: Number) {
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
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * The runtime environment.
   *
   * Only runtimes of the Node.js family are
   * supported.
   *
   * Default: Runtime.NODEJS_14_X
   *
   * @param runtime The runtime environment. 
   */
  public fun runtime(runtime: Runtime) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * Sets the runtime management configuration for a function's version.
   *
   * Default: Auto
   *
   * @param runtimeManagementMode Sets the runtime management configuration for a function's
   * version. 
   */
  public fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode) {
    cdkBuilder.runtimeManagementMode(runtimeManagementMode)
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
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
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
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
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
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * Enable AWS X-Ray Tracing for Lambda Function.
   *
   * Default: Tracing.Disabled
   *
   * @param tracing Enable AWS X-Ray Tracing for Lambda Function. 
   */
  public fun tracing(tracing: Tracing) {
    cdkBuilder.tracing(tracing)
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
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
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
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
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
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): NodejsFunction {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    if(_initialPolicy.isNotEmpty()) cdkBuilder.initialPolicy(_initialPolicy)
    if(_layers.isNotEmpty()) cdkBuilder.layers(_layers)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
