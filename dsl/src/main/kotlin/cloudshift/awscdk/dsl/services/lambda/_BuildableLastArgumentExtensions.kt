@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.dsl.services.applicationautoscaling.ScalingScheduleDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.s3.LocationDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.AssetCode
import software.amazon.awscdk.services.lambda.AssetImageCode
import software.amazon.awscdk.services.lambda.CfnAlias
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnFunction
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.amazon.awscdk.services.lambda.CfnParametersCode
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.DestinationConfig
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionBase
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.ILayerVersion
import software.amazon.awscdk.services.lambda.IScalableFunctionAttribute
import software.amazon.awscdk.services.lambda.IVersion
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.QualifiedFunctionBase
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.Version
import software.constructs.Construct

/**
 * Specifies a provisioned concurrency configuration for a function's version.
 */
public inline
    fun CfnVersion.setProvisionedConcurrencyConfig(block: CfnVersionProvisionedConcurrencyConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVersionProvisionedConcurrencyConfigurationPropertyDsl()
  builder.apply(block)
  return setProvisionedConcurrencyConfig(builder.build())
}

/**
 * The function layer archive.
 */
public inline fun CfnLayerVersion.setContent(block: CfnLayerVersionContentPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLayerVersionContentPropertyDsl()
  builder.apply(block)
  return setContent(builder.build())
}

public inline fun ILayerVersion.addPermission(arg0: String,
    block: LayerVersionPermissionDsl.() -> Unit = {}) {
  val builder = LayerVersionPermissionDsl()
  builder.apply(block)
  return addPermission(arg0, builder.build())
}

/**
 * Configures options for asynchronous invocation.
 *
 * @param options 
 */
public inline
    fun QualifiedFunctionBase.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit =
    {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun IFunction.addEventSourceMapping(arg0: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(arg0, builder.build())
}

public inline fun IFunction.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}):
    FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

public inline fun IFunction.addPermission(arg0: String, block: PermissionDsl.() -> Unit = {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(arg0, builder.build())
}

public inline fun IFunction.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun IFunction.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit =
    {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun IFunction.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun IFunction.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun IFunction.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

public inline fun IFunction.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

public inline fun IFunction.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}

/**
 * Create a parameters map from this instance's CloudFormation parameters.
 *
 * It returns a map with 2 keys that correspond to the names of the parameters defined in this
 * Lambda code,
 * and as values it contains the appropriate expressions pointing at the provided S3 location
 * (most likely, obtained from a CodePipeline Artifact by calling the `artifact.s3Location` method).
 * The result should be provided to the CloudFormation Action
 * that is deploying the Stack that the Lambda with this code is part of,
 * in the `parameterOverrides` property.
 *
 * @param location the location of the object in S3 that represents the Lambda code. 
 */
public inline fun CfnParametersCode.assign(block: LocationDsl.() -> Unit = {}): Map<String, Any> {
  val builder = LocationDsl()
  builder.apply(block)
  return assign(builder.build())
}

/**
 * List of allowed publishers.
 */
public inline
    fun CfnCodeSigningConfig.setAllowedPublishers(block: CfnCodeSigningConfigAllowedPublishersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCodeSigningConfigAllowedPublishersPropertyDsl()
  builder.apply(block)
  return setAllowedPublishers(builder.build())
}

/**
 * The code signing policy controls the validation failure action for signature mismatch or expiry.
 */
public inline
    fun CfnCodeSigningConfig.setCodeSigningPolicies(block: CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl()
  builder.apply(block)
  return setCodeSigningPolicies(builder.build())
}

public inline fun IScalableFunctionAttribute.scaleOnSchedule(arg0: String,
    block: ScalingScheduleDsl.() -> Unit = {}) {
  val builder = ScalingScheduleDsl()
  builder.apply(block)
  return scaleOnSchedule(arg0, builder.build())
}

public inline
    fun IScalableFunctionAttribute.scaleOnUtilization(block: UtilizationScalingOptionsDsl.() -> Unit
    = {}) {
  val builder = UtilizationScalingOptionsDsl()
  builder.apply(block)
  return scaleOnUtilization(builder.build())
}

/**
 * A destination for events after they have been sent to a function for processing.
 */
public inline
    fun CfnEventInvokeConfig.setDestinationConfig(block: CfnEventInvokeConfigDestinationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventInvokeConfigDestinationConfigPropertyDsl()
  builder.apply(block)
  return setDestinationConfig(builder.build())
}

/**
 * Adds an environment variable to this Lambda function.
 *
 * If this is a ref to a Lambda function, this operation results in a no-op.
 *
 * @param key The environment variable key. 
 * @param value The environment variable's value. 
 * @param options Environment variable options.
 */
public inline fun SingletonFunction.addEnvironment(
  key: String,
  `value`: String,
  block: EnvironmentOptionsDsl.() -> Unit = {},
): Function {
  val builder = EnvironmentOptionsDsl()
  builder.apply(block)
  return addEnvironment(key, value, builder.build())
}

/**
 * Adds a permission to the Lambda resource policy.
 *
 * @param name 
 * @param permission 
 */
public inline fun SingletonFunction.addPermission(name: String, block: PermissionDsl.() -> Unit =
    {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(name, builder.build())
}

/**
 * Defines an alias for this function.
 *
 * The alias will automatically be updated to point to the latest version of
 * the function as it is being updated during a deployment.
 *
 * ```
 * Function fn;
 * fn.addAlias("Live");
 * // Is equivalent to
 * // Is equivalent to
 * Alias.Builder.create(this, "AliasLive")
 * .aliasName("Live")
 * .version(fn.getCurrentVersion())
 * .build();
 * ```
 *
 * @param aliasName The name of the alias. 
 * @param options Alias options.
 */
public inline fun Function.addAlias(aliasName: String, block: AliasOptionsDsl.() -> Unit = {}):
    Alias {
  val builder = AliasOptionsDsl()
  builder.apply(block)
  return addAlias(aliasName, builder.build())
}

/**
 * Adds an environment variable to this Lambda function.
 *
 * If this is a ref to a Lambda function, this operation results in a no-op.
 *
 * @param key The environment variable key. 
 * @param value The environment variable's value. 
 * @param options Environment variable options.
 */
public inline fun Function.addEnvironment(
  key: String,
  `value`: String,
  block: EnvironmentOptionsDsl.() -> Unit = {},
): Function {
  val builder = EnvironmentOptionsDsl()
  builder.apply(block)
  return addEnvironment(key, value, builder.build())
}

public inline fun IVersion.addAlias(arg0: String, block: AliasOptionsDsl.() -> Unit = {}): Alias {
  val builder = AliasOptionsDsl()
  builder.apply(block)
  return addAlias(arg0, builder.build())
}

/**
 * Adds an event source that maps to this AWS Lambda function.
 *
 * @param id 
 * @param options 
 */
public inline fun FunctionBase.addEventSourceMapping(id: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(id, builder.build())
}

/**
 * Adds a url to this lambda function.
 *
 * @param options
 */
public inline fun FunctionBase.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}):
    FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

/**
 * Adds a permission to the Lambda resource policy.
 *
 * [Documentation](Permission for details.)
 * @param id The id for the permission construct. 
 * @param permission The permission to grant to this Lambda function. 
 */
public inline fun FunctionBase.addPermission(id: String, block: PermissionDsl.() -> Unit = {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(id, builder.build())
}

/**
 * Adds a statement to the IAM role assumed by the instance.
 *
 * @param statement 
 */
public inline fun FunctionBase.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

/**
 * Configures options for asynchronous invocation.
 *
 * @param options 
 */
public inline fun FunctionBase.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit =
    {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

/**
 * Return the given named metric for this Function.
 *
 * @param metricName 
 * @param props
 */
public inline fun FunctionBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

/**
 * How long execution of this Lambda takes.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun FunctionBase.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

/**
 * How many invocations of this Lambda fail.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun FunctionBase.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

/**
 * How often this Lambda is invoked.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun FunctionBase.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

/**
 * How often this Lambda is throttled.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun FunctionBase.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}

/**
 * (deprecated) Defines an alias for this version.
 *
 * @deprecated Calling `addAlias` on a `Version` object will cause the Alias to be replaced on every
 * function update. Call `function.addAlias()` or `new Alias()` instead.
 * @param aliasName The name of the alias (e.g. "live"). 
 * @param options Alias options.
 */
public inline fun Version.addAlias(aliasName: String, block: AliasOptionsDsl.() -> Unit = {}):
    Alias {
  val builder = AliasOptionsDsl()
  builder.apply(block)
  return addAlias(aliasName, builder.build())
}

/**
 * Return the given named metric for this Function.
 *
 * @param metricName 
 * @param props
 */
public inline fun Version.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

/**
 * Called after the CFN function resource has been created to allow the code class to bind to it.
 *
 * Specifically it's required to allow assets to add
 * metadata for tooling like SAM CLI to be able to find their origins.
 *
 * @param resource 
 * @param options
 */
public inline fun AssetImageCode.bindToResource(resource: CfnResource,
    block: ResourceBindOptionsDsl.() -> Unit = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(resource, builder.build())
}

/**
 * The [Cross-Origin Resource Sharing
 * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings
 * for your function URL.
 */
public inline fun CfnUrl.setCors(block: CfnUrlCorsPropertyDsl.() -> Unit = {}) {
  val builder = CfnUrlCorsPropertyDsl()
  builder.apply(block)
  return setCors(builder.build())
}

public inline fun IDestination.bind(
  arg0: Construct,
  arg1: IFunction,
  block: DestinationOptionsDsl.() -> Unit = {},
): DestinationConfig {
  val builder = DestinationOptionsDsl()
  builder.apply(block)
  return bind(arg0, arg1, builder.build())
}

/**
 * Configure provisioned concurrency autoscaling on a function alias.
 *
 * Returns a scalable attribute that can call
 * `scaleOnUtilization()` and `scaleOnSchedule()`.
 *
 * @param options Autoscaling options. 
 */
public inline fun Alias.addAutoScaling(block: AutoScalingOptionsDsl.() -> Unit = {}):
    IScalableFunctionAttribute {
  val builder = AutoScalingOptionsDsl()
  builder.apply(block)
  return addAutoScaling(builder.build())
}

/**
 * Return the given named metric for this Function.
 *
 * @param metricName 
 * @param props
 */
public inline fun Alias.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

/**
 * Called after the CFN function resource has been created to allow the code class to bind to it.
 *
 * Specifically it's required to allow assets to add
 * metadata for tooling like SAM CLI to be able to find their origins.
 *
 * @param _resource 
 * @param _options
 */
public inline fun Code.bindToResource(_resource: CfnResource,
    block: ResourceBindOptionsDsl.() -> Unit = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(_resource, builder.build())
}

/**
 * The code for the function.
 */
public inline fun CfnFunction.setCode(block: CfnFunctionCodePropertyDsl.() -> Unit = {}) {
  val builder = CfnFunctionCodePropertyDsl()
  builder.apply(block)
  return setCode(builder.build())
}

/**
 * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
 * asynchronous events when they fail processing.
 */
public inline
    fun CfnFunction.setDeadLetterConfig(block: CfnFunctionDeadLetterConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionDeadLetterConfigPropertyDsl()
  builder.apply(block)
  return setDeadLetterConfig(builder.build())
}

/**
 * Environment variables that are accessible from function code during execution.
 */
public inline fun CfnFunction.setEnvironment(block: CfnFunctionEnvironmentPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionEnvironmentPropertyDsl()
  builder.apply(block)
  return setEnvironment(builder.build())
}

/**
 * The size of the function's `/tmp` directory in MB.
 */
public inline
    fun CfnFunction.setEphemeralStorage(block: CfnFunctionEphemeralStoragePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionEphemeralStoragePropertyDsl()
  builder.apply(block)
  return setEphemeralStorage(builder.build())
}

/**
 * Configuration values that override the container image Dockerfile settings.
 */
public inline fun CfnFunction.setImageConfig(block: CfnFunctionImageConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionImageConfigPropertyDsl()
  builder.apply(block)
  return setImageConfig(builder.build())
}

/**
 * Sets the runtime management configuration for a function's version.
 */
public inline
    fun CfnFunction.setRuntimeManagementConfig(block: CfnFunctionRuntimeManagementConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionRuntimeManagementConfigPropertyDsl()
  builder.apply(block)
  return setRuntimeManagementConfig(builder.build())
}

/**
 * The function's [AWS Lambda
 * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
 */
public inline fun CfnFunction.setSnapStart(block: CfnFunctionSnapStartPropertyDsl.() -> Unit = {}) {
  val builder = CfnFunctionSnapStartPropertyDsl()
  builder.apply(block)
  return setSnapStart(builder.build())
}

/**
 * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
 * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
 */
public inline fun CfnFunction.setTracingConfig(block: CfnFunctionTracingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionTracingConfigPropertyDsl()
  builder.apply(block)
  return setTracingConfig(builder.build())
}

/**
 * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets
 * in the VPC.
 */
public inline fun CfnFunction.setVpcConfig(block: CfnFunctionVpcConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnFunctionVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

/**
 * Add permission for this layer version to specific entities.
 *
 * Usage within
 * the same account where the layer is defined is always allowed and does not
 * require calling this method. Note that the principal that creates the
 * Lambda function using the layer (for example, a CloudFormation changeset
 * execution role) also needs to have the `lambda:GetLayerVersion`
 * permission on the layer version.
 *
 * @param id 
 * @param permission 
 */
public inline fun LayerVersion.addPermission(id: String, block: LayerVersionPermissionDsl.() -> Unit
    = {}) {
  val builder = LayerVersionPermissionDsl()
  builder.apply(block)
  return addPermission(id, builder.build())
}

/**
 * Called after the CFN function resource has been created to allow the code class to bind to it.
 *
 * Specifically it's required to allow assets to add
 * metadata for tooling like SAM CLI to be able to find their origins.
 *
 * @param resource 
 * @param options
 */
public inline fun AssetCode.bindToResource(resource: CfnResource,
    block: ResourceBindOptionsDsl.() -> Unit = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(resource, builder.build())
}

/**
 * Specifies a [provisioned
 * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
 * configuration for a function's alias.
 */
public inline
    fun CfnAlias.setProvisionedConcurrencyConfig(block: CfnAliasProvisionedConcurrencyConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAliasProvisionedConcurrencyConfigurationPropertyDsl()
  builder.apply(block)
  return setProvisionedConcurrencyConfig(builder.build())
}

/**
 * The [routing
 * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
 * of the alias.
 */
public inline
    fun CfnAlias.setRoutingConfig(block: CfnAliasAliasRoutingConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAliasAliasRoutingConfigurationPropertyDsl()
  builder.apply(block)
  return setRoutingConfig(builder.build())
}

/**
 * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
 * event source.
 */
public inline
    fun CfnEventSourceMapping.setAmazonManagedKafkaEventSourceConfig(block: CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl()
  builder.apply(block)
  return setAmazonManagedKafkaEventSourceConfig(builder.build())
}

/**
 * (Kinesis and DynamoDB Streams only) An Amazon SQS queue or Amazon SNS topic destination for
 * discarded records.
 */
public inline
    fun CfnEventSourceMapping.setDestinationConfig(block: CfnEventSourceMappingDestinationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingDestinationConfigPropertyDsl()
  builder.apply(block)
  return setDestinationConfig(builder.build())
}

/**
 * Specific configuration settings for a DocumentDB event source.
 */
public inline
    fun CfnEventSourceMapping.setDocumentDbEventSourceConfig(block: CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl()
  builder.apply(block)
  return setDocumentDbEventSourceConfig(builder.build())
}

/**
 * An object that defines the filter criteria that determine whether Lambda should process an event.
 */
public inline
    fun CfnEventSourceMapping.setFilterCriteria(block: CfnEventSourceMappingFilterCriteriaPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingFilterCriteriaPropertyDsl()
  builder.apply(block)
  return setFilterCriteria(builder.build())
}

/**
 * (Amazon SQS only) The scaling configuration for the event source.
 */
public inline
    fun CfnEventSourceMapping.setScalingConfig(block: CfnEventSourceMappingScalingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingScalingConfigPropertyDsl()
  builder.apply(block)
  return setScalingConfig(builder.build())
}

/**
 * The self-managed Apache Kafka cluster for your event source.
 */
public inline
    fun CfnEventSourceMapping.setSelfManagedEventSource(block: CfnEventSourceMappingSelfManagedEventSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingSelfManagedEventSourcePropertyDsl()
  builder.apply(block)
  return setSelfManagedEventSource(builder.build())
}

/**
 * Specific configuration settings for a self-managed Apache Kafka event source.
 */
public inline
    fun CfnEventSourceMapping.setSelfManagedKafkaEventSourceConfig(block: CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl()
  builder.apply(block)
  return setSelfManagedKafkaEventSourceConfig(builder.build())
}
