@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
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
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.FileSystem
import software.amazon.awscdk.services.lambda.Function
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
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sqs.IQueue
import software.constructs.Construct

@CdkDslMarker
public class FunctionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Function.Builder = Function.Builder.create(scope, id)

  private val _events: MutableList<IEventSource> = mutableListOf()

  private val _initialPolicy: MutableList<PolicyStatement> = mutableListOf()

  private val _layers: MutableList<ILayerVersion> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun adotInstrumentation(block: AdotInstrumentationConfigDsl.() -> Unit = {}) {
    val builder = AdotInstrumentationConfigDsl()
    builder.apply(block)
    cdkBuilder.adotInstrumentation(builder.build())
  }

  public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
    cdkBuilder.adotInstrumentation(adotInstrumentation)
  }

  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  public fun allowPublicSubnet(allowPublicSubnet: Boolean) {
    cdkBuilder.allowPublicSubnet(allowPublicSubnet)
  }

  public fun architecture(architecture: Architecture) {
    cdkBuilder.architecture(architecture)
  }

  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
    cdkBuilder.codeSigningConfig(codeSigningConfig)
  }

  public fun currentVersionOptions(block: VersionOptionsDsl.() -> Unit = {}) {
    val builder = VersionOptionsDsl()
    builder.apply(block)
    cdkBuilder.currentVersionOptions(builder.build())
  }

  public fun currentVersionOptions(currentVersionOptions: VersionOptions) {
    cdkBuilder.currentVersionOptions(currentVersionOptions)
  }

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean) {
    cdkBuilder.deadLetterQueueEnabled(deadLetterQueueEnabled)
  }

  public fun deadLetterTopic(deadLetterTopic: ITopic) {
    cdkBuilder.deadLetterTopic(deadLetterTopic)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  public fun environmentEncryption(environmentEncryption: IKey) {
    cdkBuilder.environmentEncryption(environmentEncryption)
  }

  public fun ephemeralStorageSize(ephemeralStorageSize: Size) {
    cdkBuilder.ephemeralStorageSize(ephemeralStorageSize)
  }

  public fun events(vararg events: IEventSource) {
    _events.addAll(listOf(*events))
  }

  public fun events(events: Collection<IEventSource>) {
    _events.addAll(events)
  }

  public fun filesystem(filesystem: FileSystem) {
    cdkBuilder.filesystem(filesystem)
  }

  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun handler(handler: String) {
    cdkBuilder.handler(handler)
  }

  public fun initialPolicy(initialPolicy: PolicyStatementDsl.() -> Unit) {
    _initialPolicy.add(PolicyStatementDsl().apply(initialPolicy).build())
  }

  public fun initialPolicy(initialPolicy: Collection<PolicyStatement>) {
    _initialPolicy.addAll(initialPolicy)
  }

  public fun insightsVersion(insightsVersion: LambdaInsightsVersion) {
    cdkBuilder.insightsVersion(insightsVersion)
  }

  public fun layers(vararg layers: ILayerVersion) {
    _layers.addAll(listOf(*layers))
  }

  public fun layers(layers: Collection<ILayerVersion>) {
    _layers.addAll(layers)
  }

  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  public fun logRetentionRetryOptions(block: LogRetentionRetryOptionsDsl.() -> Unit = {}) {
    val builder = LogRetentionRetryOptionsDsl()
    builder.apply(block)
    cdkBuilder.logRetentionRetryOptions(builder.build())
  }

  public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
  }

  public fun logRetentionRole(logRetentionRole: IRole) {
    cdkBuilder.logRetentionRole(logRetentionRole)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun memorySize(memorySize: Number) {
    cdkBuilder.memorySize(memorySize)
  }

  public fun onFailure(onFailure: IDestination) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun onSuccess(onSuccess: IDestination) {
    cdkBuilder.onSuccess(onSuccess)
  }

  public fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion) {
    cdkBuilder.paramsAndSecrets(paramsAndSecrets)
  }

  public fun profiling(profiling: Boolean) {
    cdkBuilder.profiling(profiling)
  }

  public fun profilingGroup(profilingGroup: IProfilingGroup) {
    cdkBuilder.profilingGroup(profilingGroup)
  }

  public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
    cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun runtime(runtime: Runtime) {
    cdkBuilder.runtime(runtime)
  }

  public fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode) {
    cdkBuilder.runtimeManagementMode(runtimeManagementMode)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun tracing(tracing: Tracing) {
    cdkBuilder.tracing(tracing)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.vpcSubnets(builder.build())
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): Function {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    if(_initialPolicy.isNotEmpty()) cdkBuilder.initialPolicy(_initialPolicy)
    if(_layers.isNotEmpty()) cdkBuilder.layers(_layers)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
