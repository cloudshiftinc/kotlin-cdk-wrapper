@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction
import software.amazon.awscdk.services.sam.CfnFunctionProps

/**
 * Properties for defining a `CfnFunction`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object assumeRolePolicyDocument;
 * CfnFunctionProps cfnFunctionProps = CfnFunctionProps.builder()
 * .architectures(List.of("architectures"))
 * .assumeRolePolicyDocument(assumeRolePolicyDocument)
 * .autoPublishAlias("autoPublishAlias")
 * .autoPublishCodeSha256("autoPublishCodeSha256")
 * .codeSigningConfigArn("codeSigningConfigArn")
 * .codeUri("codeUri")
 * .deadLetterQueue(DeadLetterQueueProperty.builder()
 * .targetArn("targetArn")
 * .type("type")
 * .build())
 * .deploymentPreference(DeploymentPreferenceProperty.builder()
 * .alarms(List.of("alarms"))
 * .enabled(false)
 * .hooks(HooksProperty.builder()
 * .postTraffic("postTraffic")
 * .preTraffic("preTraffic")
 * .build())
 * .role("role")
 * .type("type")
 * .build())
 * .description("description")
 * .environment(FunctionEnvironmentProperty.builder()
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build())
 * .eventInvokeConfig(EventInvokeConfigProperty.builder()
 * .destinationConfig(EventInvokeDestinationConfigProperty.builder()
 * .onFailure(DestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .type("type")
 * .build())
 * .onSuccess(DestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .type("type")
 * .build())
 * .build())
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build())
 * .events(Map.of(
 * "eventsKey", EventSourceProperty.builder()
 * .properties(AlexaSkillEventProperty.builder()
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build())
 * .type("type")
 * .build()))
 * .fileSystemConfigs(List.of(FileSystemConfigProperty.builder()
 * .arn("arn")
 * .localMountPath("localMountPath")
 * .build()))
 * .functionName("functionName")
 * .handler("handler")
 * .imageConfig(ImageConfigProperty.builder()
 * .command(List.of("command"))
 * .entryPoint(List.of("entryPoint"))
 * .workingDirectory("workingDirectory")
 * .build())
 * .imageUri("imageUri")
 * .inlineCode("inlineCode")
 * .kmsKeyArn("kmsKeyArn")
 * .layers(List.of("layers"))
 * .memorySize(123)
 * .packageType("packageType")
 * .permissionsBoundary("permissionsBoundary")
 * .policies("policies")
 * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigProperty.builder()
 * .provisionedConcurrentExecutions("provisionedConcurrentExecutions")
 * .build())
 * .reservedConcurrentExecutions(123)
 * .role("role")
 * .runtime("runtime")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .timeout(123)
 * .tracing("tracing")
 * .versionDescription("versionDescription")
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html)
 */
@CdkDslMarker
public class CfnFunctionPropsDsl {
    private val cdkBuilder: CfnFunctionProps.Builder = CfnFunctionProps.builder()

    private val _architectures: MutableList<String> = mutableListOf()

    private val _fileSystemConfigs: MutableList<Any> = mutableListOf()

    private val _layers: MutableList<String> = mutableListOf()

    private val _policies: MutableList<Any> = mutableListOf()

    /** @param architectures the value to be set. */
    public fun architectures(vararg architectures: String) {
        _architectures.addAll(listOf(*architectures))
    }

    /** @param architectures the value to be set. */
    public fun architectures(architectures: Collection<String>) {
        _architectures.addAll(architectures)
    }

    /** @param assumeRolePolicyDocument the value to be set. */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(assumeRolePolicyDocument)
        cdkBuilder.assumeRolePolicyDocument(builder.map)
    }

    /** @param assumeRolePolicyDocument the value to be set. */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
        cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    /** @param autoPublishAlias the value to be set. */
    public fun autoPublishAlias(autoPublishAlias: String) {
        cdkBuilder.autoPublishAlias(autoPublishAlias)
    }

    /** @param autoPublishCodeSha256 the value to be set. */
    public fun autoPublishCodeSha256(autoPublishCodeSha256: String) {
        cdkBuilder.autoPublishCodeSha256(autoPublishCodeSha256)
    }

    /** @param codeSigningConfigArn the value to be set. */
    public fun codeSigningConfigArn(codeSigningConfigArn: String) {
        cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    /** @param codeUri the value to be set. */
    public fun codeUri(codeUri: String) {
        cdkBuilder.codeUri(codeUri)
    }

    /** @param codeUri the value to be set. */
    public fun codeUri(codeUri: IResolvable) {
        cdkBuilder.codeUri(codeUri)
    }

    /** @param codeUri the value to be set. */
    public fun codeUri(codeUri: CfnFunction.S3LocationProperty) {
        cdkBuilder.codeUri(codeUri)
    }

    /** @param deadLetterQueue the value to be set. */
    public fun deadLetterQueue(deadLetterQueue: IResolvable) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /** @param deadLetterQueue the value to be set. */
    public fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /** @param deploymentPreference the value to be set. */
    public fun deploymentPreference(deploymentPreference: IResolvable) {
        cdkBuilder.deploymentPreference(deploymentPreference)
    }

    /** @param deploymentPreference the value to be set. */
    public fun deploymentPreference(
        deploymentPreference: CfnFunction.DeploymentPreferenceProperty
    ) {
        cdkBuilder.deploymentPreference(deploymentPreference)
    }

    /** @param description the value to be set. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param environment the value to be set. */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /** @param environment the value to be set. */
    public fun environment(environment: CfnFunction.FunctionEnvironmentProperty) {
        cdkBuilder.environment(environment)
    }

    /** @param eventInvokeConfig the value to be set. */
    public fun eventInvokeConfig(eventInvokeConfig: IResolvable) {
        cdkBuilder.eventInvokeConfig(eventInvokeConfig)
    }

    /** @param eventInvokeConfig the value to be set. */
    public fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty) {
        cdkBuilder.eventInvokeConfig(eventInvokeConfig)
    }

    /** @param events the value to be set. */
    public fun events(events: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(events)
        cdkBuilder.events(builder.map)
    }

    /** @param events the value to be set. */
    public fun events(events: Map<String, Any>) {
        cdkBuilder.events(events)
    }

    /** @param events the value to be set. */
    public fun events(events: IResolvable) {
        cdkBuilder.events(events)
    }

    /** @param fileSystemConfigs the value to be set. */
    public fun fileSystemConfigs(vararg fileSystemConfigs: Any) {
        _fileSystemConfigs.addAll(listOf(*fileSystemConfigs))
    }

    /** @param fileSystemConfigs the value to be set. */
    public fun fileSystemConfigs(fileSystemConfigs: Collection<Any>) {
        _fileSystemConfigs.addAll(fileSystemConfigs)
    }

    /** @param fileSystemConfigs the value to be set. */
    public fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
        cdkBuilder.fileSystemConfigs(fileSystemConfigs)
    }

    /** @param functionName the value to be set. */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /** @param handler the value to be set. */
    public fun handler(handler: String) {
        cdkBuilder.handler(handler)
    }

    /** @param imageConfig the value to be set. */
    public fun imageConfig(imageConfig: IResolvable) {
        cdkBuilder.imageConfig(imageConfig)
    }

    /** @param imageConfig the value to be set. */
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty) {
        cdkBuilder.imageConfig(imageConfig)
    }

    /** @param imageUri the value to be set. */
    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    /** @param inlineCode the value to be set. */
    public fun inlineCode(inlineCode: String) {
        cdkBuilder.inlineCode(inlineCode)
    }

    /** @param kmsKeyArn the value to be set. */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /** @param layers the value to be set. */
    public fun layers(vararg layers: String) {
        _layers.addAll(listOf(*layers))
    }

    /** @param layers the value to be set. */
    public fun layers(layers: Collection<String>) {
        _layers.addAll(layers)
    }

    /** @param memorySize the value to be set. */
    public fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
    }

    /** @param packageType the value to be set. */
    public fun packageType(packageType: String) {
        cdkBuilder.packageType(packageType)
    }

    /** @param permissionsBoundary the value to be set. */
    public fun permissionsBoundary(permissionsBoundary: String) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /** @param policies the value to be set. */
    public fun policies(policies: String) {
        cdkBuilder.policies(policies)
    }

    /** @param policies the value to be set. */
    public fun policies(vararg policies: Any) {
        _policies.addAll(listOf(*policies))
    }

    /** @param policies the value to be set. */
    public fun policies(policies: Collection<Any>) {
        _policies.addAll(policies)
    }

    /** @param policies the value to be set. */
    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    /** @param policies the value to be set. */
    public fun policies(policies: CfnFunction.IAMPolicyDocumentProperty) {
        cdkBuilder.policies(policies)
    }

    /** @param provisionedConcurrencyConfig the value to be set. */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    /** @param provisionedConcurrencyConfig the value to be set. */
    public fun provisionedConcurrencyConfig(
        provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty
    ) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    /** @param reservedConcurrentExecutions the value to be set. */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
        cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /** @param role the value to be set. */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /** @param runtime the value to be set. */
    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    /** @param tags the value to be set. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param timeout the value to be set. */
    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    /** @param tracing the value to be set. */
    public fun tracing(tracing: String) {
        cdkBuilder.tracing(tracing)
    }

    /** @param versionDescription the value to be set. */
    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    /** @param vpcConfig the value to be set. */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /** @param vpcConfig the value to be set. */
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnFunctionProps {
        if (_architectures.isNotEmpty()) cdkBuilder.architectures(_architectures)
        if (_fileSystemConfigs.isNotEmpty()) cdkBuilder.fileSystemConfigs(_fileSystemConfigs)
        if (_layers.isNotEmpty()) cdkBuilder.layers(_layers)
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        return cdkBuilder.build()
    }
}
