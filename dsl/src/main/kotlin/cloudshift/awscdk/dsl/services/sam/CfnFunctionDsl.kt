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

/**
 * Definition of AWS::Serverless::Function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object assumeRolePolicyDocument;
 * CfnFunction cfnFunction = CfnFunction.Builder.create(this, "MyCfnFunction")
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
public class CfnFunctionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFunction.Builder = CfnFunction.Builder.create(scope, id)

    private val _architectures: MutableList<String> = mutableListOf()

    private val _fileSystemConfigs: MutableList<Any> = mutableListOf()

    private val _layers: MutableList<String> = mutableListOf()

    private val _policies: MutableList<Any> = mutableListOf()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-architectures)
     *
     * @param architectures
     */
    public fun architectures(vararg architectures: String) {
        _architectures.addAll(listOf(*architectures))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-architectures)
     *
     * @param architectures
     */
    public fun architectures(architectures: Collection<String>) {
        _architectures.addAll(architectures)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-assumerolepolicydocument)
     *
     * @param assumeRolePolicyDocument
     */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(assumeRolePolicyDocument)
        cdkBuilder.assumeRolePolicyDocument(builder.map)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-assumerolepolicydocument)
     *
     * @param assumeRolePolicyDocument
     */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
        cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishalias)
     *
     * @param autoPublishAlias
     */
    public fun autoPublishAlias(autoPublishAlias: String) {
        cdkBuilder.autoPublishAlias(autoPublishAlias)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishcodesha256)
     *
     * @param autoPublishCodeSha256
     */
    public fun autoPublishCodeSha256(autoPublishCodeSha256: String) {
        cdkBuilder.autoPublishCodeSha256(autoPublishCodeSha256)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codesigningconfigarn)
     *
     * @param codeSigningConfigArn
     */
    public fun codeSigningConfigArn(codeSigningConfigArn: String) {
        cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     *
     * @param codeUri
     */
    public fun codeUri(codeUri: String) {
        cdkBuilder.codeUri(codeUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     *
     * @param codeUri
     */
    public fun codeUri(codeUri: IResolvable) {
        cdkBuilder.codeUri(codeUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     *
     * @param codeUri
     */
    public fun codeUri(codeUri: CfnFunction.S3LocationProperty) {
        cdkBuilder.codeUri(codeUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     *
     * @param deadLetterQueue
     */
    public fun deadLetterQueue(deadLetterQueue: IResolvable) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     *
     * @param deadLetterQueue
     */
    public fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     *
     * @param deploymentPreference
     */
    public fun deploymentPreference(deploymentPreference: IResolvable) {
        cdkBuilder.deploymentPreference(deploymentPreference)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     *
     * @param deploymentPreference
     */
    public fun deploymentPreference(
        deploymentPreference: CfnFunction.DeploymentPreferenceProperty
    ) {
        cdkBuilder.deploymentPreference(deploymentPreference)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-description)
     *
     * @param description
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     *
     * @param environment
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     *
     * @param environment
     */
    public fun environment(environment: CfnFunction.FunctionEnvironmentProperty) {
        cdkBuilder.environment(environment)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     *
     * @param eventInvokeConfig
     */
    public fun eventInvokeConfig(eventInvokeConfig: IResolvable) {
        cdkBuilder.eventInvokeConfig(eventInvokeConfig)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     *
     * @param eventInvokeConfig
     */
    public fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty) {
        cdkBuilder.eventInvokeConfig(eventInvokeConfig)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
     *
     * @param events
     */
    public fun events(events: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(events)
        cdkBuilder.events(builder.map)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
     *
     * @param events
     */
    public fun events(events: Map<String, Any>) {
        cdkBuilder.events(events)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
     *
     * @param events
     */
    public fun events(events: IResolvable) {
        cdkBuilder.events(events)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     *
     * @param fileSystemConfigs
     */
    public fun fileSystemConfigs(vararg fileSystemConfigs: Any) {
        _fileSystemConfigs.addAll(listOf(*fileSystemConfigs))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     *
     * @param fileSystemConfigs
     */
    public fun fileSystemConfigs(fileSystemConfigs: Collection<Any>) {
        _fileSystemConfigs.addAll(fileSystemConfigs)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     *
     * @param fileSystemConfigs
     */
    public fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
        cdkBuilder.fileSystemConfigs(fileSystemConfigs)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionname)
     *
     * @param functionName
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-handler)
     *
     * @param handler
     */
    public fun handler(handler: String) {
        cdkBuilder.handler(handler)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     *
     * @param imageConfig
     */
    public fun imageConfig(imageConfig: IResolvable) {
        cdkBuilder.imageConfig(imageConfig)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     *
     * @param imageConfig
     */
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty) {
        cdkBuilder.imageConfig(imageConfig)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageuri)
     *
     * @param imageUri
     */
    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-inlinecode)
     *
     * @param inlineCode
     */
    public fun inlineCode(inlineCode: String) {
        cdkBuilder.inlineCode(inlineCode)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-kmskeyarn)
     *
     * @param kmsKeyArn
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-layers)
     *
     * @param layers
     */
    public fun layers(vararg layers: String) {
        _layers.addAll(listOf(*layers))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-layers)
     *
     * @param layers
     */
    public fun layers(layers: Collection<String>) {
        _layers.addAll(layers)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-memorysize)
     *
     * @param memorySize
     */
    public fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-packagetype)
     *
     * @param packageType
     */
    public fun packageType(packageType: String) {
        cdkBuilder.packageType(packageType)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-permissionsboundary)
     *
     * @param permissionsBoundary
     */
    public fun permissionsBoundary(permissionsBoundary: String) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     *
     * @param policies
     */
    public fun policies(policies: String) {
        cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     *
     * @param policies
     */
    public fun policies(vararg policies: Any) {
        _policies.addAll(listOf(*policies))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     *
     * @param policies
     */
    public fun policies(policies: Collection<Any>) {
        _policies.addAll(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     *
     * @param policies
     */
    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     *
     * @param policies
     */
    public fun policies(policies: CfnFunction.IAMPolicyDocumentProperty) {
        cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     *
     * @param provisionedConcurrencyConfig
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     *
     * @param provisionedConcurrencyConfig
     */
    public fun provisionedConcurrencyConfig(
        provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty
    ) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-reservedconcurrentexecutions)
     *
     * @param reservedConcurrentExecutions
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
        cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-role)
     *
     * @param role
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-runtime)
     *
     * @param runtime
     */
    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tags)
     *
     * @param tags
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-timeout)
     *
     * @param timeout
     */
    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tracing)
     *
     * @param tracing
     */
    public fun tracing(tracing: String) {
        cdkBuilder.tracing(tracing)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-versiondescription)
     *
     * @param versionDescription
     */
    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     *
     * @param vpcConfig
     */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     *
     * @param vpcConfig
     */
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnFunction {
        if (_architectures.isNotEmpty()) cdkBuilder.architectures(_architectures)
        if (_fileSystemConfigs.isNotEmpty()) cdkBuilder.fileSystemConfigs(_fileSystemConfigs)
        if (_layers.isNotEmpty()) cdkBuilder.layers(_layers)
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        return cdkBuilder.build()
    }
}
