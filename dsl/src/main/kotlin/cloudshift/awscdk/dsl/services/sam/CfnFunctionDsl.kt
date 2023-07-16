@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction
import software.constructs.Construct

@CdkDslMarker
public class CfnFunctionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFunction.Builder = CfnFunction.Builder.create(scope, id)

  private val _architectures: MutableList<String> = mutableListOf()

  private val _fileSystemConfigs: MutableList<Any> = mutableListOf()

  private val _layers: MutableList<String> = mutableListOf()

  private val _policies: MutableList<Any> = mutableListOf()

  public fun architectures(vararg architectures: String) {
    _architectures.addAll(listOf(*architectures))
  }

  public fun architectures(architectures: Collection<String>) {
    _architectures.addAll(architectures)
  }

  public fun assumeRolePolicyDocument(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.assumeRolePolicyDocument(builder.map)
  }

  public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
    cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
  }

  public fun autoPublishAlias(autoPublishAlias: String) {
    cdkBuilder.autoPublishAlias(autoPublishAlias)
  }

  public fun autoPublishCodeSha256(autoPublishCodeSha256: String) {
    cdkBuilder.autoPublishCodeSha256(autoPublishCodeSha256)
  }

  public fun codeSigningConfigArn(codeSigningConfigArn: String) {
    cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
  }

  public fun codeUri(codeUri: String) {
    cdkBuilder.codeUri(codeUri)
  }

  public fun codeUri(codeUri: IResolvable) {
    cdkBuilder.codeUri(codeUri)
  }

  public fun codeUri(codeUri: CfnFunction.S3LocationProperty) {
    cdkBuilder.codeUri(codeUri)
  }

  public fun deadLetterQueue(deadLetterQueue: IResolvable) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun deploymentPreference(deploymentPreference: IResolvable) {
    cdkBuilder.deploymentPreference(deploymentPreference)
  }

  public fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty) {
    cdkBuilder.deploymentPreference(deploymentPreference)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  public fun environment(environment: CfnFunction.FunctionEnvironmentProperty) {
    cdkBuilder.environment(environment)
  }

  public fun eventInvokeConfig(eventInvokeConfig: IResolvable) {
    cdkBuilder.eventInvokeConfig(eventInvokeConfig)
  }

  public fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty) {
    cdkBuilder.eventInvokeConfig(eventInvokeConfig)
  }

  public fun events(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.events(builder.map)
  }

  public fun events(events: Map<String, *>) {
    cdkBuilder.events(events)
  }

  public fun events(events: IResolvable) {
    cdkBuilder.events(events)
  }

  public fun fileSystemConfigs(vararg fileSystemConfigs: Any) {
    _fileSystemConfigs.addAll(listOf(*fileSystemConfigs))
  }

  public fun fileSystemConfigs(fileSystemConfigs: Collection<Any>) {
    _fileSystemConfigs.addAll(fileSystemConfigs)
  }

  public fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
    cdkBuilder.fileSystemConfigs(fileSystemConfigs)
  }

  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun handler(handler: String) {
    cdkBuilder.handler(handler)
  }

  public fun imageConfig(imageConfig: IResolvable) {
    cdkBuilder.imageConfig(imageConfig)
  }

  public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty) {
    cdkBuilder.imageConfig(imageConfig)
  }

  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  public fun inlineCode(inlineCode: String) {
    cdkBuilder.inlineCode(inlineCode)
  }

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun layers(vararg layers: String) {
    _layers.addAll(listOf(*layers))
  }

  public fun layers(layers: Collection<String>) {
    _layers.addAll(layers)
  }

  public fun memorySize(memorySize: Number) {
    cdkBuilder.memorySize(memorySize)
  }

  public fun packageType(packageType: String) {
    cdkBuilder.packageType(packageType)
  }

  public fun permissionsBoundary(permissionsBoundary: String) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  public fun policies(policies: String) {
    cdkBuilder.policies(policies)
  }

  public fun policies(vararg policies: Any) {
    _policies.addAll(listOf(*policies))
  }

  public fun policies(policies: Collection<Any>) {
    _policies.addAll(policies)
  }

  public fun policies(policies: IResolvable) {
    cdkBuilder.policies(policies)
  }

  public fun policies(policies: CfnFunction.IAMPolicyDocumentProperty) {
    cdkBuilder.policies(policies)
  }

  public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
    cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
  }

  public
      fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty) {
    cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
  }

  public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
    cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
  }

  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun runtime(runtime: String) {
    cdkBuilder.runtime(runtime)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  public fun tracing(tracing: String) {
    cdkBuilder.tracing(tracing)
  }

  public fun versionDescription(versionDescription: String) {
    cdkBuilder.versionDescription(versionDescription)
  }

  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnFunction {
    if(_architectures.isNotEmpty()) cdkBuilder.architectures(_architectures)
    if(_fileSystemConfigs.isNotEmpty()) cdkBuilder.fileSystemConfigs(_fileSystemConfigs)
    if(_layers.isNotEmpty()) cdkBuilder.layers(_layers)
    if(_policies.isNotEmpty()) cdkBuilder.policies(_policies)
    return cdkBuilder.build()
  }
}
