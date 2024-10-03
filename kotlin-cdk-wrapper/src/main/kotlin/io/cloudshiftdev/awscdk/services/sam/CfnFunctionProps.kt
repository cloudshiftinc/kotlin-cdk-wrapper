@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFunction`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
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
 * .ephemeralStorage(EphemeralStorageProperty.builder()
 * .size(123)
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
 * .skillId("skillId")
 * .build())
 * .type("type")
 * .build()))
 * .fileSystemConfigs(List.of(FileSystemConfigProperty.builder()
 * .arn("arn")
 * .localMountPath("localMountPath")
 * .build()))
 * .functionName("functionName")
 * .functionUrlConfig(FunctionUrlConfigProperty.builder()
 * .authType("authType")
 * // the properties below are optional
 * .cors("cors")
 * .invokeMode("invokeMode")
 * .build())
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
public interface CfnFunctionProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-architectures)
   */
  public fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-assumerolepolicydocument)
   */
  public fun assumeRolePolicyDocument(): Any? = unwrap(this).getAssumeRolePolicyDocument()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishalias)
   */
  public fun autoPublishAlias(): String? = unwrap(this).getAutoPublishAlias()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishcodesha256)
   */
  public fun autoPublishCodeSha256(): String? = unwrap(this).getAutoPublishCodeSha256()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codesigningconfigarn)
   */
  public fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
   */
  public fun codeUri(): Any? = unwrap(this).getCodeUri()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
   */
  public fun deadLetterQueue(): Any? = unwrap(this).getDeadLetterQueue()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
   */
  public fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
   */
  public fun environment(): Any? = unwrap(this).getEnvironment()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-ephemeralstorage)
   */
  public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
   */
  public fun eventInvokeConfig(): Any? = unwrap(this).getEventInvokeConfig()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
   */
  public fun events(): Any? = unwrap(this).getEvents()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
   */
  public fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionname)
   */
  public fun functionName(): String? = unwrap(this).getFunctionName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionurlconfig)
   */
  public fun functionUrlConfig(): Any? = unwrap(this).getFunctionUrlConfig()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-handler)
   */
  public fun handler(): String? = unwrap(this).getHandler()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
   */
  public fun imageConfig(): Any? = unwrap(this).getImageConfig()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageuri)
   */
  public fun imageUri(): String? = unwrap(this).getImageUri()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-inlinecode)
   */
  public fun inlineCode(): String? = unwrap(this).getInlineCode()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-layers)
   */
  public fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-memorysize)
   */
  public fun memorySize(): Number? = unwrap(this).getMemorySize()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-packagetype)
   */
  public fun packageType(): String? = unwrap(this).getPackageType()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-permissionsboundary)
   */
  public fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
   */
  public fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
   */
  public fun provisionedConcurrencyConfig(): Any? = unwrap(this).getProvisionedConcurrencyConfig()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-reservedconcurrentexecutions)
   */
  public fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-role)
   */
  public fun role(): String? = unwrap(this).getRole()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-runtime)
   */
  public fun runtime(): String? = unwrap(this).getRuntime()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-timeout)
   */
  public fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tracing)
   */
  public fun tracing(): String? = unwrap(this).getTracing()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-versiondescription)
   */
  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnFunctionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param architectures the value to be set.
     */
    public fun architectures(architectures: List<String>)

    /**
     * @param architectures the value to be set.
     */
    public fun architectures(vararg architectures: String)

    /**
     * @param assumeRolePolicyDocument the value to be set.
     */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any)

    /**
     * @param autoPublishAlias the value to be set.
     */
    public fun autoPublishAlias(autoPublishAlias: String)

    /**
     * @param autoPublishCodeSha256 the value to be set.
     */
    public fun autoPublishCodeSha256(autoPublishCodeSha256: String)

    /**
     * @param codeSigningConfigArn the value to be set.
     */
    public fun codeSigningConfigArn(codeSigningConfigArn: String)

    /**
     * @param codeUri the value to be set.
     */
    public fun codeUri(codeUri: String)

    /**
     * @param codeUri the value to be set.
     */
    public fun codeUri(codeUri: IResolvable)

    /**
     * @param codeUri the value to be set.
     */
    public fun codeUri(codeUri: CfnFunction.S3LocationProperty)

    /**
     * @param codeUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("294ebaee736feaf44051334bbc57ae839cac56bdf9eccfa2a4ff5af612ac9920")
    public fun codeUri(codeUri: CfnFunction.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param deadLetterQueue the value to be set.
     */
    public fun deadLetterQueue(deadLetterQueue: IResolvable)

    /**
     * @param deadLetterQueue the value to be set.
     */
    public fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty)

    /**
     * @param deadLetterQueue the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3d14bd50d18de42012e92a0f284c7d53ea53a15c76945a69e4eea5d4fb687d7")
    public
        fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty.Builder.() -> Unit)

    /**
     * @param deploymentPreference the value to be set.
     */
    public fun deploymentPreference(deploymentPreference: IResolvable)

    /**
     * @param deploymentPreference the value to be set.
     */
    public fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty)

    /**
     * @param deploymentPreference the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5642600f88e14f064f41c069596ee5918418e7912a7e93e2a5271a539d03f156")
    public
        fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty.Builder.() -> Unit)

    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param environment the value to be set.
     */
    public fun environment(environment: IResolvable)

    /**
     * @param environment the value to be set.
     */
    public fun environment(environment: CfnFunction.FunctionEnvironmentProperty)

    /**
     * @param environment the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1153b61be94ec1b717c07c54d40366a9b233f429b7e4c32262039ef6a7d9e536")
    public fun environment(environment: CfnFunction.FunctionEnvironmentProperty.Builder.() -> Unit)

    /**
     * @param ephemeralStorage the value to be set.
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    /**
     * @param ephemeralStorage the value to be set.
     */
    public fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty)

    /**
     * @param ephemeralStorage the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5965124cde2e56d7430f8dc489b13a35ef4c3f727f4d376c2fb71de0005a118c")
    public
        fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit)

    /**
     * @param eventInvokeConfig the value to be set.
     */
    public fun eventInvokeConfig(eventInvokeConfig: IResolvable)

    /**
     * @param eventInvokeConfig the value to be set.
     */
    public fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty)

    /**
     * @param eventInvokeConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67b17410917bed0924700926badc7040dce0635b4f8e8835275a585e15d6b985")
    public
        fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty.Builder.() -> Unit)

    /**
     * @param events the value to be set.
     */
    public fun events(events: IResolvable)

    /**
     * @param events the value to be set.
     */
    public fun events(events: Map<String, Any>)

    /**
     * @param fileSystemConfigs the value to be set.
     */
    public fun fileSystemConfigs(fileSystemConfigs: IResolvable)

    /**
     * @param fileSystemConfigs the value to be set.
     */
    public fun fileSystemConfigs(fileSystemConfigs: List<Any>)

    /**
     * @param fileSystemConfigs the value to be set.
     */
    public fun fileSystemConfigs(vararg fileSystemConfigs: Any)

    /**
     * @param functionName the value to be set.
     */
    public fun functionName(functionName: String)

    /**
     * @param functionUrlConfig the value to be set.
     */
    public fun functionUrlConfig(functionUrlConfig: IResolvable)

    /**
     * @param functionUrlConfig the value to be set.
     */
    public fun functionUrlConfig(functionUrlConfig: CfnFunction.FunctionUrlConfigProperty)

    /**
     * @param functionUrlConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74bf88d89227913cfde005806270c9dac6fe075c3cc9b926895aaf05e33d176f")
    public
        fun functionUrlConfig(functionUrlConfig: CfnFunction.FunctionUrlConfigProperty.Builder.() -> Unit)

    /**
     * @param handler the value to be set.
     */
    public fun handler(handler: String)

    /**
     * @param imageConfig the value to be set.
     */
    public fun imageConfig(imageConfig: IResolvable)

    /**
     * @param imageConfig the value to be set.
     */
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty)

    /**
     * @param imageConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7869f213627b20449370946c690e74ba2f83aac3f5f056ed06f198b7c40b60ee")
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty.Builder.() -> Unit)

    /**
     * @param imageUri the value to be set.
     */
    public fun imageUri(imageUri: String)

    /**
     * @param inlineCode the value to be set.
     */
    public fun inlineCode(inlineCode: String)

    /**
     * @param kmsKeyArn the value to be set.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param layers the value to be set.
     */
    public fun layers(layers: List<String>)

    /**
     * @param layers the value to be set.
     */
    public fun layers(vararg layers: String)

    /**
     * @param memorySize the value to be set.
     */
    public fun memorySize(memorySize: Number)

    /**
     * @param packageType the value to be set.
     */
    public fun packageType(packageType: String)

    /**
     * @param permissionsBoundary the value to be set.
     */
    public fun permissionsBoundary(permissionsBoundary: String)

    /**
     * @param policies the value to be set.
     */
    public fun policies(policies: String)

    /**
     * @param policies the value to be set.
     */
    public fun policies(policies: IResolvable)

    /**
     * @param policies the value to be set.
     */
    public fun policies(policies: CfnFunction.IAMPolicyDocumentProperty)

    /**
     * @param policies the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bc3e27934df64cb11a6c8f83c994cb7f58256691518990bb7e14a35353d3648")
    public fun policies(policies: CfnFunction.IAMPolicyDocumentProperty.Builder.() -> Unit)

    /**
     * @param policies the value to be set.
     */
    public fun policies(policies: List<Any>)

    /**
     * @param policies the value to be set.
     */
    public fun policies(vararg policies: Any)

    /**
     * @param provisionedConcurrencyConfig the value to be set.
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    /**
     * @param provisionedConcurrencyConfig the value to be set.
     */
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty)

    /**
     * @param provisionedConcurrencyConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14bb1c0e7c2014ebe881010ea350b4a4672ea2d724f67b2142b79628c04b5ed4")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty.Builder.() -> Unit)

    /**
     * @param reservedConcurrentExecutions the value to be set.
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    /**
     * @param role the value to be set.
     */
    public fun role(role: String)

    /**
     * @param runtime the value to be set.
     */
    public fun runtime(runtime: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param timeout the value to be set.
     */
    public fun timeout(timeout: Number)

    /**
     * @param tracing the value to be set.
     */
    public fun tracing(tracing: String)

    /**
     * @param versionDescription the value to be set.
     */
    public fun versionDescription(versionDescription: String)

    /**
     * @param vpcConfig the value to be set.
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig the value to be set.
     */
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty)

    /**
     * @param vpcConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b009c7c368211318a9d8ad5e5e4f1ec709b666865b571e926d000052c619083")
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnFunctionProps.Builder =
        software.amazon.awscdk.services.sam.CfnFunctionProps.builder()

    /**
     * @param architectures the value to be set.
     */
    override fun architectures(architectures: List<String>) {
      cdkBuilder.architectures(architectures)
    }

    /**
     * @param architectures the value to be set.
     */
    override fun architectures(vararg architectures: String): Unit =
        architectures(architectures.toList())

    /**
     * @param assumeRolePolicyDocument the value to be set.
     */
    override fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
      cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    /**
     * @param autoPublishAlias the value to be set.
     */
    override fun autoPublishAlias(autoPublishAlias: String) {
      cdkBuilder.autoPublishAlias(autoPublishAlias)
    }

    /**
     * @param autoPublishCodeSha256 the value to be set.
     */
    override fun autoPublishCodeSha256(autoPublishCodeSha256: String) {
      cdkBuilder.autoPublishCodeSha256(autoPublishCodeSha256)
    }

    /**
     * @param codeSigningConfigArn the value to be set.
     */
    override fun codeSigningConfigArn(codeSigningConfigArn: String) {
      cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    /**
     * @param codeUri the value to be set.
     */
    override fun codeUri(codeUri: String) {
      cdkBuilder.codeUri(codeUri)
    }

    /**
     * @param codeUri the value to be set.
     */
    override fun codeUri(codeUri: IResolvable) {
      cdkBuilder.codeUri(codeUri.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param codeUri the value to be set.
     */
    override fun codeUri(codeUri: CfnFunction.S3LocationProperty) {
      cdkBuilder.codeUri(codeUri.let(CfnFunction.S3LocationProperty.Companion::unwrap))
    }

    /**
     * @param codeUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("294ebaee736feaf44051334bbc57ae839cac56bdf9eccfa2a4ff5af612ac9920")
    override fun codeUri(codeUri: CfnFunction.S3LocationProperty.Builder.() -> Unit): Unit =
        codeUri(CfnFunction.S3LocationProperty(codeUri))

    /**
     * @param deadLetterQueue the value to be set.
     */
    override fun deadLetterQueue(deadLetterQueue: IResolvable) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deadLetterQueue the value to be set.
     */
    override fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(CfnFunction.DeadLetterQueueProperty.Companion::unwrap))
    }

    /**
     * @param deadLetterQueue the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3d14bd50d18de42012e92a0f284c7d53ea53a15c76945a69e4eea5d4fb687d7")
    override
        fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty.Builder.() -> Unit):
        Unit = deadLetterQueue(CfnFunction.DeadLetterQueueProperty(deadLetterQueue))

    /**
     * @param deploymentPreference the value to be set.
     */
    override fun deploymentPreference(deploymentPreference: IResolvable) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deploymentPreference the value to be set.
     */
    override
        fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(CfnFunction.DeploymentPreferenceProperty.Companion::unwrap))
    }

    /**
     * @param deploymentPreference the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5642600f88e14f064f41c069596ee5918418e7912a7e93e2a5271a539d03f156")
    override
        fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty.Builder.() -> Unit):
        Unit = deploymentPreference(CfnFunction.DeploymentPreferenceProperty(deploymentPreference))

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param environment the value to be set.
     */
    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param environment the value to be set.
     */
    override fun environment(environment: CfnFunction.FunctionEnvironmentProperty) {
      cdkBuilder.environment(environment.let(CfnFunction.FunctionEnvironmentProperty.Companion::unwrap))
    }

    /**
     * @param environment the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1153b61be94ec1b717c07c54d40366a9b233f429b7e4c32262039ef6a7d9e536")
    override
        fun environment(environment: CfnFunction.FunctionEnvironmentProperty.Builder.() -> Unit):
        Unit = environment(CfnFunction.FunctionEnvironmentProperty(environment))

    /**
     * @param ephemeralStorage the value to be set.
     */
    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ephemeralStorage the value to be set.
     */
    override fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(CfnFunction.EphemeralStorageProperty.Companion::unwrap))
    }

    /**
     * @param ephemeralStorage the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5965124cde2e56d7430f8dc489b13a35ef4c3f727f4d376c2fb71de0005a118c")
    override
        fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(CfnFunction.EphemeralStorageProperty(ephemeralStorage))

    /**
     * @param eventInvokeConfig the value to be set.
     */
    override fun eventInvokeConfig(eventInvokeConfig: IResolvable) {
      cdkBuilder.eventInvokeConfig(eventInvokeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventInvokeConfig the value to be set.
     */
    override fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty) {
      cdkBuilder.eventInvokeConfig(eventInvokeConfig.let(CfnFunction.EventInvokeConfigProperty.Companion::unwrap))
    }

    /**
     * @param eventInvokeConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67b17410917bed0924700926badc7040dce0635b4f8e8835275a585e15d6b985")
    override
        fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty.Builder.() -> Unit):
        Unit = eventInvokeConfig(CfnFunction.EventInvokeConfigProperty(eventInvokeConfig))

    /**
     * @param events the value to be set.
     */
    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param events the value to be set.
     */
    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param fileSystemConfigs the value to be set.
     */
    override fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fileSystemConfigs the value to be set.
     */
    override fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param fileSystemConfigs the value to be set.
     */
    override fun fileSystemConfigs(vararg fileSystemConfigs: Any): Unit =
        fileSystemConfigs(fileSystemConfigs.toList())

    /**
     * @param functionName the value to be set.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param functionUrlConfig the value to be set.
     */
    override fun functionUrlConfig(functionUrlConfig: IResolvable) {
      cdkBuilder.functionUrlConfig(functionUrlConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param functionUrlConfig the value to be set.
     */
    override fun functionUrlConfig(functionUrlConfig: CfnFunction.FunctionUrlConfigProperty) {
      cdkBuilder.functionUrlConfig(functionUrlConfig.let(CfnFunction.FunctionUrlConfigProperty.Companion::unwrap))
    }

    /**
     * @param functionUrlConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74bf88d89227913cfde005806270c9dac6fe075c3cc9b926895aaf05e33d176f")
    override
        fun functionUrlConfig(functionUrlConfig: CfnFunction.FunctionUrlConfigProperty.Builder.() -> Unit):
        Unit = functionUrlConfig(CfnFunction.FunctionUrlConfigProperty(functionUrlConfig))

    /**
     * @param handler the value to be set.
     */
    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    /**
     * @param imageConfig the value to be set.
     */
    override fun imageConfig(imageConfig: IResolvable) {
      cdkBuilder.imageConfig(imageConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param imageConfig the value to be set.
     */
    override fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty) {
      cdkBuilder.imageConfig(imageConfig.let(CfnFunction.ImageConfigProperty.Companion::unwrap))
    }

    /**
     * @param imageConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7869f213627b20449370946c690e74ba2f83aac3f5f056ed06f198b7c40b60ee")
    override fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty.Builder.() -> Unit): Unit
        = imageConfig(CfnFunction.ImageConfigProperty(imageConfig))

    /**
     * @param imageUri the value to be set.
     */
    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    /**
     * @param inlineCode the value to be set.
     */
    override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    /**
     * @param kmsKeyArn the value to be set.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param layers the value to be set.
     */
    override fun layers(layers: List<String>) {
      cdkBuilder.layers(layers)
    }

    /**
     * @param layers the value to be set.
     */
    override fun layers(vararg layers: String): Unit = layers(layers.toList())

    /**
     * @param memorySize the value to be set.
     */
    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    /**
     * @param packageType the value to be set.
     */
    override fun packageType(packageType: String) {
      cdkBuilder.packageType(packageType)
    }

    /**
     * @param permissionsBoundary the value to be set.
     */
    override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * @param policies the value to be set.
     */
    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    /**
     * @param policies the value to be set.
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param policies the value to be set.
     */
    override fun policies(policies: CfnFunction.IAMPolicyDocumentProperty) {
      cdkBuilder.policies(policies.let(CfnFunction.IAMPolicyDocumentProperty.Companion::unwrap))
    }

    /**
     * @param policies the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bc3e27934df64cb11a6c8f83c994cb7f58256691518990bb7e14a35353d3648")
    override fun policies(policies: CfnFunction.IAMPolicyDocumentProperty.Builder.() -> Unit): Unit
        = policies(CfnFunction.IAMPolicyDocumentProperty(policies))

    /**
     * @param policies the value to be set.
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param policies the value to be set.
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * @param provisionedConcurrencyConfig the value to be set.
     */
    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param provisionedConcurrencyConfig the value to be set.
     */
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(CfnFunction.ProvisionedConcurrencyConfigProperty.Companion::unwrap))
    }

    /**
     * @param provisionedConcurrencyConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14bb1c0e7c2014ebe881010ea350b4a4672ea2d724f67b2142b79628c04b5ed4")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(CfnFunction.ProvisionedConcurrencyConfigProperty(provisionedConcurrencyConfig))

    /**
     * @param reservedConcurrentExecutions the value to be set.
     */
    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * @param role the value to be set.
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param runtime the value to be set.
     */
    override fun runtime(runtime: String) {
      cdkBuilder.runtime(runtime)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param timeout the value to be set.
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * @param tracing the value to be set.
     */
    override fun tracing(tracing: String) {
      cdkBuilder.tracing(tracing)
    }

    /**
     * @param versionDescription the value to be set.
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    /**
     * @param vpcConfig the value to be set.
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfig the value to be set.
     */
    override fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnFunction.VpcConfigProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b009c7c368211318a9d8ad5e5e4f1ec709b666865b571e926d000052c619083")
    override fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnFunction.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sam.CfnFunctionProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sam.CfnFunctionProps,
  ) : CdkObject(cdkObject),
      CfnFunctionProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-architectures)
     */
    override fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-assumerolepolicydocument)
     */
    override fun assumeRolePolicyDocument(): Any? = unwrap(this).getAssumeRolePolicyDocument()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishalias)
     */
    override fun autoPublishAlias(): String? = unwrap(this).getAutoPublishAlias()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishcodesha256)
     */
    override fun autoPublishCodeSha256(): String? = unwrap(this).getAutoPublishCodeSha256()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codesigningconfigarn)
     */
    override fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     */
    override fun codeUri(): Any? = unwrap(this).getCodeUri()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     */
    override fun deadLetterQueue(): Any? = unwrap(this).getDeadLetterQueue()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     */
    override fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     */
    override fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-ephemeralstorage)
     */
    override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     */
    override fun eventInvokeConfig(): Any? = unwrap(this).getEventInvokeConfig()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
     */
    override fun events(): Any? = unwrap(this).getEvents()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     */
    override fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionname)
     */
    override fun functionName(): String? = unwrap(this).getFunctionName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionurlconfig)
     */
    override fun functionUrlConfig(): Any? = unwrap(this).getFunctionUrlConfig()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-handler)
     */
    override fun handler(): String? = unwrap(this).getHandler()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     */
    override fun imageConfig(): Any? = unwrap(this).getImageConfig()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageuri)
     */
    override fun imageUri(): String? = unwrap(this).getImageUri()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-inlinecode)
     */
    override fun inlineCode(): String? = unwrap(this).getInlineCode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-layers)
     */
    override fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-memorysize)
     */
    override fun memorySize(): Number? = unwrap(this).getMemorySize()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-packagetype)
     */
    override fun packageType(): String? = unwrap(this).getPackageType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-permissionsboundary)
     */
    override fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     */
    override fun policies(): Any? = unwrap(this).getPolicies()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     */
    override fun provisionedConcurrencyConfig(): Any? =
        unwrap(this).getProvisionedConcurrencyConfig()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-reservedconcurrentexecutions)
     */
    override fun reservedConcurrentExecutions(): Number? =
        unwrap(this).getReservedConcurrentExecutions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-role)
     */
    override fun role(): String? = unwrap(this).getRole()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-runtime)
     */
    override fun runtime(): String? = unwrap(this).getRuntime()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-timeout)
     */
    override fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tracing)
     */
    override fun tracing(): String? = unwrap(this).getTracing()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-versiondescription)
     */
    override fun versionDescription(): String? = unwrap(this).getVersionDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunctionProps):
        CfnFunctionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFunctionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionProps):
        software.amazon.awscdk.services.sam.CfnFunctionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sam.CfnFunctionProps
  }
}
