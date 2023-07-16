@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.s3.LocationDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.RemovalPolicy
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
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.amazon.awscdk.services.lambda.CfnParametersCode
import software.amazon.awscdk.services.lambda.CfnPermission
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.DockerImageFunction
import software.amazon.awscdk.services.lambda.EcrImageCode
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.services.lambda.IScalableFunctionAttribute
import software.amazon.awscdk.services.lambda.InlineCode
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.S3Code
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.Version

public inline fun Alias.addAutoScaling(block: AutoScalingOptionsDsl.() -> Unit = {}):
    IScalableFunctionAttribute {
  val builder = AutoScalingOptionsDsl()
  builder.apply(block)
  return addAutoScaling(builder.build())
}

public inline fun Alias.addEventSourceMapping(arg0: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(arg0,builder.build())
}

public inline fun Alias.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}): FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

public inline fun Alias.addPermission(arg0: String, block: PermissionDsl.() -> Unit = {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}

public inline fun Alias.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun Alias.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit = {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun Alias.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun Alias.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun Alias.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

public inline fun Alias.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

public inline fun Alias.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}

public inline fun AssetCode.bindToResource(arg0: CfnResource,
    block: ResourceBindOptionsDsl.() -> Unit = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(arg0,builder.build())
}

public inline fun AssetImageCode.bindToResource(arg0: CfnResource,
    block: ResourceBindOptionsDsl.() -> Unit = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(arg0,builder.build())
}

public inline fun CfnAlias.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAlias.setProvisionedConcurrencyConfig(block: CfnAliasProvisionedConcurrencyConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAliasProvisionedConcurrencyConfigurationPropertyDsl()
  builder.apply(block)
  return setProvisionedConcurrencyConfig(builder.build())
}

public inline
    fun CfnAlias.setRoutingConfig(block: CfnAliasAliasRoutingConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAliasAliasRoutingConfigurationPropertyDsl()
  builder.apply(block)
  return setRoutingConfig(builder.build())
}

public inline fun CfnCodeSigningConfig.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCodeSigningConfig.setAllowedPublishers(block: CfnCodeSigningConfigAllowedPublishersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCodeSigningConfigAllowedPublishersPropertyDsl()
  builder.apply(block)
  return setAllowedPublishers(builder.build())
}

public inline
    fun CfnCodeSigningConfig.setCodeSigningPolicies(block: CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl()
  builder.apply(block)
  return setCodeSigningPolicies(builder.build())
}

public inline fun CfnEventInvokeConfig.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnEventInvokeConfig.setDestinationConfig(block: CfnEventInvokeConfigDestinationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventInvokeConfigDestinationConfigPropertyDsl()
  builder.apply(block)
  return setDestinationConfig(builder.build())
}

public inline fun CfnEventSourceMapping.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnEventSourceMapping.setAmazonManagedKafkaEventSourceConfig(block: CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl()
  builder.apply(block)
  return setAmazonManagedKafkaEventSourceConfig(builder.build())
}

public inline
    fun CfnEventSourceMapping.setDestinationConfig(block: CfnEventSourceMappingDestinationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingDestinationConfigPropertyDsl()
  builder.apply(block)
  return setDestinationConfig(builder.build())
}

public inline
    fun CfnEventSourceMapping.setDocumentDbEventSourceConfig(block: CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl()
  builder.apply(block)
  return setDocumentDbEventSourceConfig(builder.build())
}

public inline
    fun CfnEventSourceMapping.setFilterCriteria(block: CfnEventSourceMappingFilterCriteriaPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingFilterCriteriaPropertyDsl()
  builder.apply(block)
  return setFilterCriteria(builder.build())
}

public inline
    fun CfnEventSourceMapping.setScalingConfig(block: CfnEventSourceMappingScalingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingScalingConfigPropertyDsl()
  builder.apply(block)
  return setScalingConfig(builder.build())
}

public inline
    fun CfnEventSourceMapping.setSelfManagedEventSource(block: CfnEventSourceMappingSelfManagedEventSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingSelfManagedEventSourcePropertyDsl()
  builder.apply(block)
  return setSelfManagedEventSource(builder.build())
}

public inline
    fun CfnEventSourceMapping.setSelfManagedKafkaEventSourceConfig(block: CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl()
  builder.apply(block)
  return setSelfManagedKafkaEventSourceConfig(builder.build())
}

public inline fun CfnFunction.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFunction.setCode(block: CfnFunctionCodePropertyDsl.() -> Unit = {}) {
  val builder = CfnFunctionCodePropertyDsl()
  builder.apply(block)
  return setCode(builder.build())
}

public inline
    fun CfnFunction.setDeadLetterConfig(block: CfnFunctionDeadLetterConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionDeadLetterConfigPropertyDsl()
  builder.apply(block)
  return setDeadLetterConfig(builder.build())
}

public inline fun CfnFunction.setEnvironment(block: CfnFunctionEnvironmentPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionEnvironmentPropertyDsl()
  builder.apply(block)
  return setEnvironment(builder.build())
}

public inline
    fun CfnFunction.setEphemeralStorage(block: CfnFunctionEphemeralStoragePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionEphemeralStoragePropertyDsl()
  builder.apply(block)
  return setEphemeralStorage(builder.build())
}

public inline fun CfnFunction.setImageConfig(block: CfnFunctionImageConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionImageConfigPropertyDsl()
  builder.apply(block)
  return setImageConfig(builder.build())
}

public inline
    fun CfnFunction.setRuntimeManagementConfig(block: CfnFunctionRuntimeManagementConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionRuntimeManagementConfigPropertyDsl()
  builder.apply(block)
  return setRuntimeManagementConfig(builder.build())
}

public inline fun CfnFunction.setSnapStart(block: CfnFunctionSnapStartPropertyDsl.() -> Unit = {}) {
  val builder = CfnFunctionSnapStartPropertyDsl()
  builder.apply(block)
  return setSnapStart(builder.build())
}

public inline fun CfnFunction.setTracingConfig(block: CfnFunctionTracingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionTracingConfigPropertyDsl()
  builder.apply(block)
  return setTracingConfig(builder.build())
}

public inline fun CfnFunction.setVpcConfig(block: CfnFunctionVpcConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnFunctionVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline fun CfnLayerVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLayerVersion.setContent(block: CfnLayerVersionContentPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLayerVersionContentPropertyDsl()
  builder.apply(block)
  return setContent(builder.build())
}

public inline fun CfnLayerVersionPermission.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnParametersCode.assign(block: LocationDsl.() -> Unit = {}): Map<String, Any> {
  val builder = LocationDsl()
  builder.apply(block)
  return assign(builder.build())
}

public inline fun CfnParametersCode.bindToResource(arg0: CfnResource,
    block: ResourceBindOptionsDsl.() -> Unit = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(arg0,builder.build())
}

public inline fun CfnPermission.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnUrl.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnUrl.setCors(block: CfnUrlCorsPropertyDsl.() -> Unit = {}) {
  val builder = CfnUrlCorsPropertyDsl()
  builder.apply(block)
  return setCors(builder.build())
}

public inline fun CfnVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVersion.setProvisionedConcurrencyConfig(block: CfnVersionProvisionedConcurrencyConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVersionProvisionedConcurrencyConfigurationPropertyDsl()
  builder.apply(block)
  return setProvisionedConcurrencyConfig(builder.build())
}

public inline fun DockerImageFunction.addAlias(arg0: String, block: AliasOptionsDsl.() -> Unit =
    {}): Alias {
  val builder = AliasOptionsDsl()
  builder.apply(block)
  return addAlias(arg0,builder.build())
}

public inline fun DockerImageFunction.addEnvironment(
  arg0: String,
  arg1: String,
  block: EnvironmentOptionsDsl.() -> Unit = {},
): Function {
  val builder = EnvironmentOptionsDsl()
  builder.apply(block)
  return addEnvironment(arg0,arg1,builder.build())
}

public inline fun DockerImageFunction.addEventSourceMapping(arg0: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(arg0,builder.build())
}

public inline fun DockerImageFunction.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}):
    FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

public inline fun DockerImageFunction.addPermission(arg0: String, block: PermissionDsl.() -> Unit =
    {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}

public inline fun DockerImageFunction.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline
    fun DockerImageFunction.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit =
    {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun DockerImageFunction.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun DockerImageFunction.metricDuration(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun DockerImageFunction.metricErrors(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

public inline fun DockerImageFunction.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

public inline fun DockerImageFunction.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}

public inline fun EcrImageCode.bindToResource(arg0: CfnResource,
    block: ResourceBindOptionsDsl.() -> Unit = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(arg0,builder.build())
}

public inline fun Function.addAlias(arg0: String, block: AliasOptionsDsl.() -> Unit = {}): Alias {
  val builder = AliasOptionsDsl()
  builder.apply(block)
  return addAlias(arg0,builder.build())
}

public inline fun Function.addEnvironment(
  arg0: String,
  arg1: String,
  block: EnvironmentOptionsDsl.() -> Unit = {},
): Function {
  val builder = EnvironmentOptionsDsl()
  builder.apply(block)
  return addEnvironment(arg0,arg1,builder.build())
}

public inline fun Function.addEventSourceMapping(arg0: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(arg0,builder.build())
}

public inline fun Function.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}):
    FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

public inline fun Function.addPermission(arg0: String, block: PermissionDsl.() -> Unit = {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}

public inline fun Function.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun Function.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit =
    {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun Function.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun Function.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun Function.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

public inline fun Function.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

public inline fun Function.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}

public inline fun InlineCode.bindToResource(arg0: CfnResource,
    block: ResourceBindOptionsDsl.() -> Unit = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(arg0,builder.build())
}

public inline fun LayerVersion.addPermission(arg0: String,
    block: LayerVersionPermissionDsl.() -> Unit = {}) {
  val builder = LayerVersionPermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}

public inline fun S3Code.bindToResource(arg0: CfnResource, block: ResourceBindOptionsDsl.() -> Unit
    = {}) {
  val builder = ResourceBindOptionsDsl()
  builder.apply(block)
  return bindToResource(arg0,builder.build())
}

public inline fun SingletonFunction.addEnvironment(
  arg0: String,
  arg1: String,
  block: EnvironmentOptionsDsl.() -> Unit = {},
): Function {
  val builder = EnvironmentOptionsDsl()
  builder.apply(block)
  return addEnvironment(arg0,arg1,builder.build())
}

public inline fun SingletonFunction.addEventSourceMapping(arg0: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(arg0,builder.build())
}

public inline fun SingletonFunction.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}):
    FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

public inline fun SingletonFunction.addPermission(arg0: String, block: PermissionDsl.() -> Unit =
    {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}

public inline fun SingletonFunction.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline
    fun SingletonFunction.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit = {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun SingletonFunction.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun SingletonFunction.metricDuration(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun SingletonFunction.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

public inline fun SingletonFunction.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

public inline fun SingletonFunction.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}

public inline fun Version.addAlias(arg0: String, block: AliasOptionsDsl.() -> Unit = {}): Alias {
  val builder = AliasOptionsDsl()
  builder.apply(block)
  return addAlias(arg0,builder.build())
}

public inline fun Version.addEventSourceMapping(arg0: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(arg0,builder.build())
}

public inline fun Version.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}):
    FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

public inline fun Version.addPermission(arg0: String, block: PermissionDsl.() -> Unit = {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}

public inline fun Version.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun Version.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit = {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun Version.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun Version.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun Version.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

public inline fun Version.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

public inline fun Version.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}
