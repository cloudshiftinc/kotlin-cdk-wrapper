@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codeguruprofiler.IProfilingGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a lambda function where the handler is a docker image.
 *
 * Example:
 *
 * ```
 * DockerImageFunction.Builder.create(this, "AssetFunction")
 * .code(DockerImageCode.fromImageAsset(join(__dirname, "docker-handler")))
 * .build();
 * ```
 */
public open class DockerImageFunction(
  cdkObject: software.amazon.awscdk.services.lambda.DockerImageFunction,
) : Function(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DockerImageFunctionProps,
  ) :
      this(software.amazon.awscdk.services.lambda.DockerImageFunction(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(DockerImageFunctionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DockerImageFunctionProps.Builder.() -> Unit,
  ) : this(scope, id, DockerImageFunctionProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.DockerImageFunction].
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("472174091f97e68a8d2946adcb1ec74e01aaab7f5aba74c9e2d3dbbe276ff010")
    public
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit)

    /**
     * Whether to allow the Lambda to send all ipv6 network traffic.
     *
     * If set to true, there will only be a single egress rule which allows all
     * outbound ipv6 traffic. If set to false, you must individually add traffic rules to allow the
     * Lambda to connect to network targets using ipv6.
     *
     * Do not specify this property if the `securityGroups` or `securityGroup` property is set.
     * Instead, configure `allowAllIpv6Outbound` directly on the security group.
     *
     * Default: false
     *
     * @param allowAllIpv6Outbound Whether to allow the Lambda to send all ipv6 network traffic. 
     */
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    /**
     * Whether to allow the Lambda to send all network traffic (except ipv6).
     *
     * If set to false, you must individually add traffic rules to allow the
     * Lambda to connect to network targets.
     *
     * Do not specify this property if the `securityGroups` or `securityGroup` property is set.
     * Instead, configure `allowAllOutbound` directly on the security group.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether to allow the Lambda to send all network traffic (except
     * ipv6). 
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
     * (deprecated) Sets the application log level for the function.
     *
     * Default: "INFO"
     *
     * @deprecated Use `applicationLogLevelV2` as a property instead.
     * @param applicationLogLevel Sets the application log level for the function. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun applicationLogLevel(applicationLogLevel: String)

    /**
     * Sets the application log level for the function.
     *
     * Default: ApplicationLogLevel.INFO
     *
     * @param applicationLogLevelV2 Sets the application log level for the function. 
     */
    public fun applicationLogLevelV2(applicationLogLevelV2: ApplicationLogLevel)

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
    public fun code(code: DockerImageCode)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d263a4a89aa43d109a53ce62273a92f506752abf67bf6e0b360365553608abaa")
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
     * (deprecated) Sets the logFormat for the function.
     *
     * Default: "Text"
     *
     * @deprecated Use `loggingFormat` as a property instead.
     * @param logFormat Sets the logFormat for the function. 
     */
    @Deprecated(message = "deprecated in CDK")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06e5a1ecc5c5ec4420a79407a42d18e93559619f170f3fc849fb2fcce216cddd")
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
     * Sets the Recursive Loop Protection for Lambda Function.
     *
     * It lets Lambda detect and terminate unintended recusrive loops.
     *
     * Default: RecursiveLoop.Terminate
     *
     * @param recursiveLoop Sets the Recursive Loop Protection for Lambda Function. 
     */
    public fun recursiveLoop(recursiveLoop: RecursiveLoop)

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
     * (deprecated) Sets the system log level for the function.
     *
     * Default: "INFO"
     *
     * @deprecated Use `systemLogLevelV2` as a property instead.
     * @param systemLogLevel Sets the system log level for the function. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun systemLogLevel(systemLogLevel: String)

    /**
     * Sets the system log level for the function.
     *
     * Default: SystemLogLevel.INFO
     *
     * @param systemLogLevelV2 Sets the system log level for the function. 
     */
    public fun systemLogLevelV2(systemLogLevelV2: SystemLogLevel)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3ff5ff56911d0947ea6e5e54f14d5269f22c491140dda049d3f3955e02fe9f3")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DockerImageFunction.Builder =
        software.amazon.awscdk.services.lambda.DockerImageFunction.Builder.create(scope, id)

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
      cdkBuilder.adotInstrumentation(adotInstrumentation.let(AdotInstrumentationConfig.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("472174091f97e68a8d2946adcb1ec74e01aaab7f5aba74c9e2d3dbbe276ff010")
    override
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit):
        Unit = adotInstrumentation(AdotInstrumentationConfig(adotInstrumentation))

    /**
     * Whether to allow the Lambda to send all ipv6 network traffic.
     *
     * If set to true, there will only be a single egress rule which allows all
     * outbound ipv6 traffic. If set to false, you must individually add traffic rules to allow the
     * Lambda to connect to network targets using ipv6.
     *
     * Do not specify this property if the `securityGroups` or `securityGroup` property is set.
     * Instead, configure `allowAllIpv6Outbound` directly on the security group.
     *
     * Default: false
     *
     * @param allowAllIpv6Outbound Whether to allow the Lambda to send all ipv6 network traffic. 
     */
    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    /**
     * Whether to allow the Lambda to send all network traffic (except ipv6).
     *
     * If set to false, you must individually add traffic rules to allow the
     * Lambda to connect to network targets.
     *
     * Do not specify this property if the `securityGroups` or `securityGroup` property is set.
     * Instead, configure `allowAllOutbound` directly on the security group.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether to allow the Lambda to send all network traffic (except
     * ipv6). 
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
     * (deprecated) Sets the application log level for the function.
     *
     * Default: "INFO"
     *
     * @deprecated Use `applicationLogLevelV2` as a property instead.
     * @param applicationLogLevel Sets the application log level for the function. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun applicationLogLevel(applicationLogLevel: String) {
      cdkBuilder.applicationLogLevel(applicationLogLevel)
    }

    /**
     * Sets the application log level for the function.
     *
     * Default: ApplicationLogLevel.INFO
     *
     * @param applicationLogLevelV2 Sets the application log level for the function. 
     */
    override fun applicationLogLevelV2(applicationLogLevelV2: ApplicationLogLevel) {
      cdkBuilder.applicationLogLevelV2(applicationLogLevelV2.let(ApplicationLogLevel.Companion::unwrap))
    }

    /**
     * The system architectures compatible with this lambda function.
     *
     * Default: Architecture.X86_64
     *
     * @param architecture The system architectures compatible with this lambda function. 
     */
    override fun architecture(architecture: Architecture) {
      cdkBuilder.architecture(architecture.let(Architecture.Companion::unwrap))
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
    override fun code(code: DockerImageCode) {
      cdkBuilder.code(code.let(DockerImageCode.Companion::unwrap))
    }

    /**
     * Code signing config associated with this function.
     *
     * Default: - Not Sign the Code
     *
     * @param codeSigningConfig Code signing config associated with this function. 
     */
    override fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
      cdkBuilder.codeSigningConfig(codeSigningConfig.let(ICodeSigningConfig.Companion::unwrap))
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
      cdkBuilder.currentVersionOptions(currentVersionOptions.let(VersionOptions.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d263a4a89aa43d109a53ce62273a92f506752abf67bf6e0b360365553608abaa")
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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
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
      cdkBuilder.deadLetterTopic(deadLetterTopic.let(ITopic.Companion::unwrap))
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
      cdkBuilder.environmentEncryption(environmentEncryption.let(IKey.Companion::unwrap))
    }

    /**
     * The size of the function’s /tmp directory in MiB.
     *
     * Default: 512 MiB
     *
     * @param ephemeralStorageSize The size of the function’s /tmp directory in MiB. 
     */
    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size.Companion::unwrap))
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
      cdkBuilder.events(events.map(IEventSource.Companion::unwrap))
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
      cdkBuilder.filesystem(filesystem.let(FileSystem.Companion::unwrap))
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
     * Initial policy statements to add to the created Lambda Role.
     *
     * You can call `addToRolePolicy` to the created lambda to add statements post creation.
     *
     * Default: - No policy statements are added to the created Lambda role.
     *
     * @param initialPolicy Initial policy statements to add to the created Lambda Role. 
     */
    override fun initialPolicy(initialPolicy: List<PolicyStatement>) {
      cdkBuilder.initialPolicy(initialPolicy.map(PolicyStatement.Companion::unwrap))
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
      cdkBuilder.insightsVersion(insightsVersion.let(LambdaInsightsVersion.Companion::unwrap))
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
      cdkBuilder.layers(layers.map(ILayerVersion.Companion::unwrap))
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
     * (deprecated) Sets the logFormat for the function.
     *
     * Default: "Text"
     *
     * @deprecated Use `loggingFormat` as a property instead.
     * @param logFormat Sets the logFormat for the function. 
     */
    @Deprecated(message = "deprecated in CDK")
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
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
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
      cdkBuilder.logRetention(logRetention.let(RetentionDays.Companion::unwrap))
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
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06e5a1ecc5c5ec4420a79407a42d18e93559619f170f3fc849fb2fcce216cddd")
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
      cdkBuilder.logRetentionRole(logRetentionRole.let(IRole.Companion::unwrap))
    }

    /**
     * Sets the loggingFormat for the function.
     *
     * Default: LoggingFormat.TEXT
     *
     * @param loggingFormat Sets the loggingFormat for the function. 
     */
    override fun loggingFormat(loggingFormat: LoggingFormat) {
      cdkBuilder.loggingFormat(loggingFormat.let(LoggingFormat.Companion::unwrap))
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
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
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
      cdkBuilder.onFailure(onFailure.let(IDestination.Companion::unwrap))
    }

    /**
     * The destination for successful invocations.
     *
     * Default: - no destination
     *
     * @param onSuccess The destination for successful invocations. 
     */
    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination.Companion::unwrap))
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
      cdkBuilder.paramsAndSecrets(paramsAndSecrets.let(ParamsAndSecretsLayerVersion.Companion::unwrap))
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
      cdkBuilder.profilingGroup(profilingGroup.let(IProfilingGroup.Companion::unwrap))
    }

    /**
     * Sets the Recursive Loop Protection for Lambda Function.
     *
     * It lets Lambda detect and terminate unintended recusrive loops.
     *
     * Default: RecursiveLoop.Terminate
     *
     * @param recursiveLoop Sets the Recursive Loop Protection for Lambda Function. 
     */
    override fun recursiveLoop(recursiveLoop: RecursiveLoop) {
      cdkBuilder.recursiveLoop(recursiveLoop.let(RecursiveLoop.Companion::unwrap))
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
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
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
      cdkBuilder.runtimeManagementMode(runtimeManagementMode.let(RuntimeManagementMode.Companion::unwrap))
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
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
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
      cdkBuilder.snapStart(snapStart.let(SnapStartConf.Companion::unwrap))
    }

    /**
     * (deprecated) Sets the system log level for the function.
     *
     * Default: "INFO"
     *
     * @deprecated Use `systemLogLevelV2` as a property instead.
     * @param systemLogLevel Sets the system log level for the function. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun systemLogLevel(systemLogLevel: String) {
      cdkBuilder.systemLogLevel(systemLogLevel)
    }

    /**
     * Sets the system log level for the function.
     *
     * Default: SystemLogLevel.INFO
     *
     * @param systemLogLevelV2 Sets the system log level for the function. 
     */
    override fun systemLogLevelV2(systemLogLevelV2: SystemLogLevel) {
      cdkBuilder.systemLogLevelV2(systemLogLevelV2.let(SystemLogLevel.Companion::unwrap))
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
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * Enable AWS X-Ray Tracing for Lambda Function.
     *
     * Default: Tracing.Disabled
     *
     * @param tracing Enable AWS X-Ray Tracing for Lambda Function. 
     */
    override fun tracing(tracing: Tracing) {
      cdkBuilder.tracing(tracing.let(Tracing.Companion::unwrap))
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
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
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
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3ff5ff56911d0947ea6e5e54f14d5269f22c491140dda049d3f3955e02fe9f3")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.lambda.DockerImageFunction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DockerImageFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DockerImageFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DockerImageFunction):
        DockerImageFunction = DockerImageFunction(cdkObject)

    internal fun unwrap(wrapped: DockerImageFunction):
        software.amazon.awscdk.services.lambda.DockerImageFunction = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.DockerImageFunction
  }
}
