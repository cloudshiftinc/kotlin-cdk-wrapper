@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
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
public open class CfnFunction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sam.CfnFunction(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFunctionProps,
  ) :
      this(software.amazon.awscdk.services.sam.CfnFunction(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnFunctionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFunctionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFunctionProps(props)
  )

  /**
   *
   */
  public open fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

  /**
   *
   */
  public open fun architectures(`value`: List<String>) {
    unwrap(this).setArchitectures(`value`)
  }

  /**
   *
   */
  public open fun architectures(vararg `value`: String): Unit = architectures(`value`.toList())

  /**
   *
   */
  public open fun assumeRolePolicyDocument(): Any? = unwrap(this).getAssumeRolePolicyDocument()

  /**
   *
   */
  public open fun assumeRolePolicyDocument(`value`: Any) {
    unwrap(this).setAssumeRolePolicyDocument(`value`)
  }

  /**
   *
   */
  public open fun autoPublishAlias(): String? = unwrap(this).getAutoPublishAlias()

  /**
   *
   */
  public open fun autoPublishAlias(`value`: String) {
    unwrap(this).setAutoPublishAlias(`value`)
  }

  /**
   *
   */
  public open fun autoPublishCodeSha256(): String? = unwrap(this).getAutoPublishCodeSha256()

  /**
   *
   */
  public open fun autoPublishCodeSha256(`value`: String) {
    unwrap(this).setAutoPublishCodeSha256(`value`)
  }

  /**
   *
   */
  public open fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

  /**
   *
   */
  public open fun codeSigningConfigArn(`value`: String) {
    unwrap(this).setCodeSigningConfigArn(`value`)
  }

  /**
   *
   */
  public open fun codeUri(): Any? = unwrap(this).getCodeUri()

  /**
   *
   */
  public open fun codeUri(`value`: String) {
    unwrap(this).setCodeUri(`value`)
  }

  /**
   *
   */
  public open fun codeUri(`value`: IResolvable) {
    unwrap(this).setCodeUri(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun codeUri(`value`: S3LocationProperty) {
    unwrap(this).setCodeUri(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0683f6d8fd732d59d21e4c10b810c50d159271f16599387be88954015ea63c75")
  public open fun codeUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      codeUri(S3LocationProperty(`value`))

  /**
   *
   */
  public open fun deadLetterQueue(): Any? = unwrap(this).getDeadLetterQueue()

  /**
   *
   */
  public open fun deadLetterQueue(`value`: IResolvable) {
    unwrap(this).setDeadLetterQueue(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun deadLetterQueue(`value`: DeadLetterQueueProperty) {
    unwrap(this).setDeadLetterQueue(`value`.let(DeadLetterQueueProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("802d999666b699da2b274eb7fb76602491a473e4b46ea8e281bea9211374eead")
  public open fun deadLetterQueue(`value`: DeadLetterQueueProperty.Builder.() -> Unit): Unit =
      deadLetterQueue(DeadLetterQueueProperty(`value`))

  /**
   *
   */
  public open fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

  /**
   *
   */
  public open fun deploymentPreference(`value`: IResolvable) {
    unwrap(this).setDeploymentPreference(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun deploymentPreference(`value`: DeploymentPreferenceProperty) {
    unwrap(this).setDeploymentPreference(`value`.let(DeploymentPreferenceProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a65b670971e344005d08ac13683c00f526825956712a7989ea9fa0933d8fccfc")
  public open fun deploymentPreference(`value`: DeploymentPreferenceProperty.Builder.() -> Unit):
      Unit = deploymentPreference(DeploymentPreferenceProperty(`value`))

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun environment(): Any? = unwrap(this).getEnvironment()

  /**
   *
   */
  public open fun environment(`value`: IResolvable) {
    unwrap(this).setEnvironment(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun environment(`value`: FunctionEnvironmentProperty) {
    unwrap(this).setEnvironment(`value`.let(FunctionEnvironmentProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a87a85695306b2e0f444b19b059b250babeec08b3612f994c37d3df3f9c9755")
  public open fun environment(`value`: FunctionEnvironmentProperty.Builder.() -> Unit): Unit =
      environment(FunctionEnvironmentProperty(`value`))

  /**
   *
   */
  public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  /**
   *
   */
  public open fun ephemeralStorage(`value`: IResolvable) {
    unwrap(this).setEphemeralStorage(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty) {
    unwrap(this).setEphemeralStorage(`value`.let(EphemeralStorageProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1e52d0582ee5cffc84ff9f32e3e3a53aaf32b548298660474716d364aa993cf")
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty.Builder.() -> Unit): Unit =
      ephemeralStorage(EphemeralStorageProperty(`value`))

  /**
   *
   */
  public open fun eventInvokeConfig(): Any? = unwrap(this).getEventInvokeConfig()

  /**
   *
   */
  public open fun eventInvokeConfig(`value`: IResolvable) {
    unwrap(this).setEventInvokeConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun eventInvokeConfig(`value`: EventInvokeConfigProperty) {
    unwrap(this).setEventInvokeConfig(`value`.let(EventInvokeConfigProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f2f997bd7eb2f13acc408f94155ed1770bf8b1ef62732a9cf16d942856dc5683")
  public open fun eventInvokeConfig(`value`: EventInvokeConfigProperty.Builder.() -> Unit): Unit =
      eventInvokeConfig(EventInvokeConfigProperty(`value`))

  /**
   *
   */
  public open fun events(): Any? = unwrap(this).getEvents()

  /**
   *
   */
  public open fun events(`value`: IResolvable) {
    unwrap(this).setEvents(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun events(`value`: Map<String, Any>) {
    unwrap(this).setEvents(`value`)
  }

  /**
   *
   */
  public open fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

  /**
   *
   */
  public open fun fileSystemConfigs(`value`: IResolvable) {
    unwrap(this).setFileSystemConfigs(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun fileSystemConfigs(`value`: List<Any>) {
    unwrap(this).setFileSystemConfigs(`value`)
  }

  /**
   *
   */
  public open fun fileSystemConfigs(vararg `value`: Any): Unit = fileSystemConfigs(`value`.toList())

  /**
   *
   */
  public open fun functionName(): String? = unwrap(this).getFunctionName()

  /**
   *
   */
  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  /**
   *
   */
  public open fun functionUrlConfig(): Any? = unwrap(this).getFunctionUrlConfig()

  /**
   *
   */
  public open fun functionUrlConfig(`value`: IResolvable) {
    unwrap(this).setFunctionUrlConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun functionUrlConfig(`value`: FunctionUrlConfigProperty) {
    unwrap(this).setFunctionUrlConfig(`value`.let(FunctionUrlConfigProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8877167acf34796909a0c3f74d0400cadb61462ff93e4dc0d980e3a22f2b10d")
  public open fun functionUrlConfig(`value`: FunctionUrlConfigProperty.Builder.() -> Unit): Unit =
      functionUrlConfig(FunctionUrlConfigProperty(`value`))

  /**
   *
   */
  public open fun handler(): String? = unwrap(this).getHandler()

  /**
   *
   */
  public open fun handler(`value`: String) {
    unwrap(this).setHandler(`value`)
  }

  /**
   *
   */
  public open fun imageConfig(): Any? = unwrap(this).getImageConfig()

  /**
   *
   */
  public open fun imageConfig(`value`: IResolvable) {
    unwrap(this).setImageConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun imageConfig(`value`: ImageConfigProperty) {
    unwrap(this).setImageConfig(`value`.let(ImageConfigProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("715ab2f07be6af322afae70e32fc6a6b0591b0afa604039144a9fad0453fa317")
  public open fun imageConfig(`value`: ImageConfigProperty.Builder.() -> Unit): Unit =
      imageConfig(ImageConfigProperty(`value`))

  /**
   *
   */
  public open fun imageUri(): String? = unwrap(this).getImageUri()

  /**
   *
   */
  public open fun imageUri(`value`: String) {
    unwrap(this).setImageUri(`value`)
  }

  /**
   *
   */
  public open fun inlineCode(): String? = unwrap(this).getInlineCode()

  /**
   *
   */
  public open fun inlineCode(`value`: String) {
    unwrap(this).setInlineCode(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   *
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   *
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   *
   */
  public open fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

  /**
   *
   */
  public open fun layers(`value`: List<String>) {
    unwrap(this).setLayers(`value`)
  }

  /**
   *
   */
  public open fun layers(vararg `value`: String): Unit = layers(`value`.toList())

  /**
   *
   */
  public open fun memorySize(): Number? = unwrap(this).getMemorySize()

  /**
   *
   */
  public open fun memorySize(`value`: Number) {
    unwrap(this).setMemorySize(`value`)
  }

  /**
   *
   */
  public open fun packageType(): String? = unwrap(this).getPackageType()

  /**
   *
   */
  public open fun packageType(`value`: String) {
    unwrap(this).setPackageType(`value`)
  }

  /**
   *
   */
  public open fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  /**
   *
   */
  public open fun permissionsBoundary(`value`: String) {
    unwrap(this).setPermissionsBoundary(`value`)
  }

  /**
   *
   */
  public open fun policies(): Any? = unwrap(this).getPolicies()

  /**
   *
   */
  public open fun policies(`value`: String) {
    unwrap(this).setPolicies(`value`)
  }

  /**
   *
   */
  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun policies(`value`: IAMPolicyDocumentProperty) {
    unwrap(this).setPolicies(`value`.let(IAMPolicyDocumentProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7384f0fdee3126b9bb6d9844b4782614cc04a9e5538100547085b826a3b25d90")
  public open fun policies(`value`: IAMPolicyDocumentProperty.Builder.() -> Unit): Unit =
      policies(IAMPolicyDocumentProperty(`value`))

  /**
   *
   */
  public open fun policies(`value`: List<Any>) {
    unwrap(this).setPolicies(`value`)
  }

  /**
   *
   */
  public open fun policies(vararg `value`: Any): Unit = policies(`value`.toList())

  /**
   *
   */
  public open fun provisionedConcurrencyConfig(): Any? =
      unwrap(this).getProvisionedConcurrencyConfig()

  /**
   *
   */
  public open fun provisionedConcurrencyConfig(`value`: IResolvable) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigProperty) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(ProvisionedConcurrencyConfigProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8a3e662e6f38c49718ce0185ec66035f2582e492736f4df761c48afbe7037f3")
  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigProperty.Builder.() -> Unit):
      Unit = provisionedConcurrencyConfig(ProvisionedConcurrencyConfigProperty(`value`))

  /**
   *
   */
  public open fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  /**
   *
   */
  public open fun reservedConcurrentExecutions(`value`: Number) {
    unwrap(this).setReservedConcurrentExecutions(`value`)
  }

  /**
   *
   */
  public open fun role(): String? = unwrap(this).getRole()

  /**
   *
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   *
   */
  public open fun runtime(): String? = unwrap(this).getRuntime()

  /**
   *
   */
  public open fun runtime(`value`: String) {
    unwrap(this).setRuntime(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   *
   */
  public open fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   *
   */
  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  /**
   *
   */
  public open fun tracing(): String? = unwrap(this).getTracing()

  /**
   *
   */
  public open fun tracing(`value`: String) {
    unwrap(this).setTracing(`value`)
  }

  /**
   *
   */
  public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   *
   */
  public open fun versionDescription(`value`: String) {
    unwrap(this).setVersionDescription(`value`)
  }

  /**
   *
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   *
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b100794bd221908a25f839dbd0e4383741fb0ccc87f5a05364f50b3e477f52f4")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sam.CfnFunction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-architectures)
     * @param architectures 
     */
    public fun architectures(architectures: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-architectures)
     * @param architectures 
     */
    public fun architectures(vararg architectures: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-assumerolepolicydocument)
     * @param assumeRolePolicyDocument 
     */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishalias)
     * @param autoPublishAlias 
     */
    public fun autoPublishAlias(autoPublishAlias: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishcodesha256)
     * @param autoPublishCodeSha256 
     */
    public fun autoPublishCodeSha256(autoPublishCodeSha256: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codesigningconfigarn)
     * @param codeSigningConfigArn 
     */
    public fun codeSigningConfigArn(codeSigningConfigArn: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     * @param codeUri 
     */
    public fun codeUri(codeUri: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     * @param codeUri 
     */
    public fun codeUri(codeUri: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     * @param codeUri 
     */
    public fun codeUri(codeUri: S3LocationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     * @param codeUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4871239b60311b46074f506627f0ac7733fbe2168d2d7063fd8558b02724347f")
    public fun codeUri(codeUri: S3LocationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     * @param deadLetterQueue 
     */
    public fun deadLetterQueue(deadLetterQueue: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     * @param deadLetterQueue 
     */
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueueProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     * @param deadLetterQueue 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a22499d0d5d300fe602ce133ac5a91aa241c16c9393e4a226f9d9ba2e4179a3")
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueueProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     * @param deploymentPreference 
     */
    public fun deploymentPreference(deploymentPreference: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     * @param deploymentPreference 
     */
    public fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     * @param deploymentPreference 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46d0d192264a9c529481aa082ec6a85dca8a2248318ea57e00256ff2a42c9c5d")
    public
        fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     * @param environment 
     */
    public fun environment(environment: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     * @param environment 
     */
    public fun environment(environment: FunctionEnvironmentProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     * @param environment 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2303472727077542dfb82404d318ee81127aa74ec08e765b55d1e53fde3aa4d9")
    public fun environment(environment: FunctionEnvironmentProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-ephemeralstorage)
     * @param ephemeralStorage 
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-ephemeralstorage)
     * @param ephemeralStorage 
     */
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-ephemeralstorage)
     * @param ephemeralStorage 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d867867365018acc988f24271bbaa19b578a32c1d73cc95e8e30f6ed14e2d5a")
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     * @param eventInvokeConfig 
     */
    public fun eventInvokeConfig(eventInvokeConfig: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     * @param eventInvokeConfig 
     */
    public fun eventInvokeConfig(eventInvokeConfig: EventInvokeConfigProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     * @param eventInvokeConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3821cfcfd762505325ced6e903526368e05159f2232d3d4f76cef82b5c71687e")
    public fun eventInvokeConfig(eventInvokeConfig: EventInvokeConfigProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
     * @param events 
     */
    public fun events(events: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
     * @param events 
     */
    public fun events(events: Map<String, Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     * @param fileSystemConfigs 
     */
    public fun fileSystemConfigs(fileSystemConfigs: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     * @param fileSystemConfigs 
     */
    public fun fileSystemConfigs(fileSystemConfigs: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     * @param fileSystemConfigs 
     */
    public fun fileSystemConfigs(vararg fileSystemConfigs: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionname)
     * @param functionName 
     */
    public fun functionName(functionName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionurlconfig)
     * @param functionUrlConfig 
     */
    public fun functionUrlConfig(functionUrlConfig: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionurlconfig)
     * @param functionUrlConfig 
     */
    public fun functionUrlConfig(functionUrlConfig: FunctionUrlConfigProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionurlconfig)
     * @param functionUrlConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84eb96603668413b2ee852af53152e3e21d22bd84c425e7922b7a5a10bba1fe8")
    public fun functionUrlConfig(functionUrlConfig: FunctionUrlConfigProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-handler)
     * @param handler 
     */
    public fun handler(handler: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     * @param imageConfig 
     */
    public fun imageConfig(imageConfig: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     * @param imageConfig 
     */
    public fun imageConfig(imageConfig: ImageConfigProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     * @param imageConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a956703e7a6a8c061d23987cc189d76597162df71eaa5d28e273a600a26ccd4")
    public fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageuri)
     * @param imageUri 
     */
    public fun imageUri(imageUri: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-inlinecode)
     * @param inlineCode 
     */
    public fun inlineCode(inlineCode: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-kmskeyarn)
     * @param kmsKeyArn 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-layers)
     * @param layers 
     */
    public fun layers(layers: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-layers)
     * @param layers 
     */
    public fun layers(vararg layers: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-memorysize)
     * @param memorySize 
     */
    public fun memorySize(memorySize: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-packagetype)
     * @param packageType 
     */
    public fun packageType(packageType: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-permissionsboundary)
     * @param permissionsBoundary 
     */
    public fun permissionsBoundary(permissionsBoundary: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    public fun policies(policies: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    public fun policies(policies: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    public fun policies(policies: IAMPolicyDocumentProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3c25e87554f5348a424767353218f56f8a5a5f39790b1b8db3d6785fb2822ae")
    public fun policies(policies: IAMPolicyDocumentProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    public fun policies(policies: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    public fun policies(vararg policies: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig 
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig 
     */
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eedfbfb9f63db904e70149a8c7fd30ac7e186193749c033e78fd91377cebb00")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-reservedconcurrentexecutions)
     * @param reservedConcurrentExecutions 
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-role)
     * @param role 
     */
    public fun role(role: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-runtime)
     * @param runtime 
     */
    public fun runtime(runtime: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-timeout)
     * @param timeout 
     */
    public fun timeout(timeout: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tracing)
     * @param tracing 
     */
    public fun tracing(tracing: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-versiondescription)
     * @param versionDescription 
     */
    public fun versionDescription(versionDescription: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     * @param vpcConfig 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     * @param vpcConfig 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     * @param vpcConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cae21c65a58a9ee7ff7c9656e045e22b4e7c871d606049fc3cc9ba222097da8")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnFunction.Builder =
        software.amazon.awscdk.services.sam.CfnFunction.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-architectures)
     * @param architectures 
     */
    override fun architectures(architectures: List<String>) {
      cdkBuilder.architectures(architectures)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-architectures)
     * @param architectures 
     */
    override fun architectures(vararg architectures: String): Unit =
        architectures(architectures.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-assumerolepolicydocument)
     * @param assumeRolePolicyDocument 
     */
    override fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
      cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishalias)
     * @param autoPublishAlias 
     */
    override fun autoPublishAlias(autoPublishAlias: String) {
      cdkBuilder.autoPublishAlias(autoPublishAlias)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-autopublishcodesha256)
     * @param autoPublishCodeSha256 
     */
    override fun autoPublishCodeSha256(autoPublishCodeSha256: String) {
      cdkBuilder.autoPublishCodeSha256(autoPublishCodeSha256)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codesigningconfigarn)
     * @param codeSigningConfigArn 
     */
    override fun codeSigningConfigArn(codeSigningConfigArn: String) {
      cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     * @param codeUri 
     */
    override fun codeUri(codeUri: String) {
      cdkBuilder.codeUri(codeUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     * @param codeUri 
     */
    override fun codeUri(codeUri: IResolvable) {
      cdkBuilder.codeUri(codeUri.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     * @param codeUri 
     */
    override fun codeUri(codeUri: S3LocationProperty) {
      cdkBuilder.codeUri(codeUri.let(S3LocationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-codeuri)
     * @param codeUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4871239b60311b46074f506627f0ac7733fbe2168d2d7063fd8558b02724347f")
    override fun codeUri(codeUri: S3LocationProperty.Builder.() -> Unit): Unit =
        codeUri(S3LocationProperty(codeUri))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     * @param deadLetterQueue 
     */
    override fun deadLetterQueue(deadLetterQueue: IResolvable) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     * @param deadLetterQueue 
     */
    override fun deadLetterQueue(deadLetterQueue: DeadLetterQueueProperty) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(DeadLetterQueueProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deadletterqueue)
     * @param deadLetterQueue 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a22499d0d5d300fe602ce133ac5a91aa241c16c9393e4a226f9d9ba2e4179a3")
    override fun deadLetterQueue(deadLetterQueue: DeadLetterQueueProperty.Builder.() -> Unit): Unit
        = deadLetterQueue(DeadLetterQueueProperty(deadLetterQueue))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     * @param deploymentPreference 
     */
    override fun deploymentPreference(deploymentPreference: IResolvable) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     * @param deploymentPreference 
     */
    override fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(DeploymentPreferenceProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-deploymentpreference)
     * @param deploymentPreference 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46d0d192264a9c529481aa082ec6a85dca8a2248318ea57e00256ff2a42c9c5d")
    override
        fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty.Builder.() -> Unit):
        Unit = deploymentPreference(DeploymentPreferenceProperty(deploymentPreference))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     * @param environment 
     */
    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     * @param environment 
     */
    override fun environment(environment: FunctionEnvironmentProperty) {
      cdkBuilder.environment(environment.let(FunctionEnvironmentProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-environment)
     * @param environment 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2303472727077542dfb82404d318ee81127aa74ec08e765b55d1e53fde3aa4d9")
    override fun environment(environment: FunctionEnvironmentProperty.Builder.() -> Unit): Unit =
        environment(FunctionEnvironmentProperty(environment))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-ephemeralstorage)
     * @param ephemeralStorage 
     */
    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-ephemeralstorage)
     * @param ephemeralStorage 
     */
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-ephemeralstorage)
     * @param ephemeralStorage 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d867867365018acc988f24271bbaa19b578a32c1d73cc95e8e30f6ed14e2d5a")
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     * @param eventInvokeConfig 
     */
    override fun eventInvokeConfig(eventInvokeConfig: IResolvable) {
      cdkBuilder.eventInvokeConfig(eventInvokeConfig.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     * @param eventInvokeConfig 
     */
    override fun eventInvokeConfig(eventInvokeConfig: EventInvokeConfigProperty) {
      cdkBuilder.eventInvokeConfig(eventInvokeConfig.let(EventInvokeConfigProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-eventinvokeconfig)
     * @param eventInvokeConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3821cfcfd762505325ced6e903526368e05159f2232d3d4f76cef82b5c71687e")
    override fun eventInvokeConfig(eventInvokeConfig: EventInvokeConfigProperty.Builder.() -> Unit):
        Unit = eventInvokeConfig(EventInvokeConfigProperty(eventInvokeConfig))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
     * @param events 
     */
    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-events)
     * @param events 
     */
    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     * @param fileSystemConfigs 
     */
    override fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     * @param fileSystemConfigs 
     */
    override fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-filesystemconfigs)
     * @param fileSystemConfigs 
     */
    override fun fileSystemConfigs(vararg fileSystemConfigs: Any): Unit =
        fileSystemConfigs(fileSystemConfigs.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionname)
     * @param functionName 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionurlconfig)
     * @param functionUrlConfig 
     */
    override fun functionUrlConfig(functionUrlConfig: IResolvable) {
      cdkBuilder.functionUrlConfig(functionUrlConfig.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionurlconfig)
     * @param functionUrlConfig 
     */
    override fun functionUrlConfig(functionUrlConfig: FunctionUrlConfigProperty) {
      cdkBuilder.functionUrlConfig(functionUrlConfig.let(FunctionUrlConfigProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-functionurlconfig)
     * @param functionUrlConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84eb96603668413b2ee852af53152e3e21d22bd84c425e7922b7a5a10bba1fe8")
    override fun functionUrlConfig(functionUrlConfig: FunctionUrlConfigProperty.Builder.() -> Unit):
        Unit = functionUrlConfig(FunctionUrlConfigProperty(functionUrlConfig))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-handler)
     * @param handler 
     */
    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     * @param imageConfig 
     */
    override fun imageConfig(imageConfig: IResolvable) {
      cdkBuilder.imageConfig(imageConfig.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     * @param imageConfig 
     */
    override fun imageConfig(imageConfig: ImageConfigProperty) {
      cdkBuilder.imageConfig(imageConfig.let(ImageConfigProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageconfig)
     * @param imageConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a956703e7a6a8c061d23987cc189d76597162df71eaa5d28e273a600a26ccd4")
    override fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit): Unit =
        imageConfig(ImageConfigProperty(imageConfig))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-imageuri)
     * @param imageUri 
     */
    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-inlinecode)
     * @param inlineCode 
     */
    override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-kmskeyarn)
     * @param kmsKeyArn 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-layers)
     * @param layers 
     */
    override fun layers(layers: List<String>) {
      cdkBuilder.layers(layers)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-layers)
     * @param layers 
     */
    override fun layers(vararg layers: String): Unit = layers(layers.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-memorysize)
     * @param memorySize 
     */
    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-packagetype)
     * @param packageType 
     */
    override fun packageType(packageType: String) {
      cdkBuilder.packageType(packageType)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-permissionsboundary)
     * @param permissionsBoundary 
     */
    override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    override fun policies(policies: IAMPolicyDocumentProperty) {
      cdkBuilder.policies(policies.let(IAMPolicyDocumentProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3c25e87554f5348a424767353218f56f8a5a5f39790b1b8db3d6785fb2822ae")
    override fun policies(policies: IAMPolicyDocumentProperty.Builder.() -> Unit): Unit =
        policies(IAMPolicyDocumentProperty(policies))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-policies)
     * @param policies 
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig 
     */
    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig 
     */
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(ProvisionedConcurrencyConfigProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eedfbfb9f63db904e70149a8c7fd30ac7e186193749c033e78fd91377cebb00")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(ProvisionedConcurrencyConfigProperty(provisionedConcurrencyConfig))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-reservedconcurrentexecutions)
     * @param reservedConcurrentExecutions 
     */
    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-role)
     * @param role 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-runtime)
     * @param runtime 
     */
    override fun runtime(runtime: String) {
      cdkBuilder.runtime(runtime)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-timeout)
     * @param timeout 
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-tracing)
     * @param tracing 
     */
    override fun tracing(tracing: String) {
      cdkBuilder.tracing(tracing)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-versiondescription)
     * @param versionDescription 
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     * @param vpcConfig 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     * @param vpcConfig 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html#cfn-serverless-function-vpcconfig)
     * @param vpcConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cae21c65a58a9ee7ff7c9656e045e22b4e7c871d606049fc3cc9ba222097da8")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sam.CfnFunction = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnFunction.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnFunction.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction): CfnFunction =
        CfnFunction(cdkObject)

    internal fun unwrap(wrapped: CfnFunction): software.amazon.awscdk.services.sam.CfnFunction =
        wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * AlexaSkillEventProperty alexaSkillEventProperty = AlexaSkillEventProperty.builder()
   * .skillId("skillId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-alexaskillevent.html)
   */
  public interface AlexaSkillEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-alexaskillevent.html#cfn-serverless-function-alexaskillevent-skillid)
     */
    public fun skillId(): String

    /**
     * A builder for [AlexaSkillEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param skillId the value to be set. 
       */
      public fun skillId(skillId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.builder()

      /**
       * @param skillId the value to be set. 
       */
      override fun skillId(skillId: String) {
        cdkBuilder.skillId(skillId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty,
    ) : CdkObject(cdkObject), AlexaSkillEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-alexaskillevent.html#cfn-serverless-function-alexaskillevent-skillid)
       */
      override fun skillId(): String = unwrap(this).getSkillId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlexaSkillEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty):
          AlexaSkillEventProperty = CdkObjectWrappers.wrap(cdkObject) as? AlexaSkillEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlexaSkillEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object customStatements;
   * ApiEventProperty apiEventProperty = ApiEventProperty.builder()
   * .method("method")
   * .path("path")
   * // the properties below are optional
   * .auth(AuthProperty.builder()
   * .apiKeyRequired(false)
   * .authorizationScopes(List.of("authorizationScopes"))
   * .authorizer("authorizer")
   * .resourcePolicy(AuthResourcePolicyProperty.builder()
   * .awsAccountBlacklist(List.of("awsAccountBlacklist"))
   * .awsAccountWhitelist(List.of("awsAccountWhitelist"))
   * .customStatements(List.of(customStatements))
   * .intrinsicVpcBlacklist(List.of("intrinsicVpcBlacklist"))
   * .intrinsicVpceBlacklist(List.of("intrinsicVpceBlacklist"))
   * .intrinsicVpceWhitelist(List.of("intrinsicVpceWhitelist"))
   * .intrinsicVpcWhitelist(List.of("intrinsicVpcWhitelist"))
   * .ipRangeBlacklist(List.of("ipRangeBlacklist"))
   * .ipRangeWhitelist(List.of("ipRangeWhitelist"))
   * .sourceVpcBlacklist(List.of("sourceVpcBlacklist"))
   * .sourceVpcWhitelist(List.of("sourceVpcWhitelist"))
   * .build())
   * .build())
   * .requestModel(RequestModelProperty.builder()
   * .model("model")
   * // the properties below are optional
   * .required(false)
   * .validateBody(false)
   * .validateParameters(false)
   * .build())
   * .requestParameters(List.of("requestParameters"))
   * .restApiId("restApiId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html)
   */
  public interface ApiEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-auth)
     */
    public fun auth(): Any? = unwrap(this).getAuth()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-method)
     */
    public fun method(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-path)
     */
    public fun path(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-requestmodel)
     */
    public fun requestModel(): Any? = unwrap(this).getRequestModel()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-requestparameters)
     */
    public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-restapiid)
     */
    public fun restApiId(): String? = unwrap(this).getRestApiId()

    /**
     * A builder for [ApiEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param auth the value to be set.
       */
      public fun auth(auth: IResolvable)

      /**
       * @param auth the value to be set.
       */
      public fun auth(auth: AuthProperty)

      /**
       * @param auth the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("589a0e2ee65f9fb0a050563bd1dcbbd68692bf4d0c4e884d6d65cc546d27d8d2")
      public fun auth(auth: AuthProperty.Builder.() -> Unit)

      /**
       * @param method the value to be set. 
       */
      public fun method(method: String)

      /**
       * @param path the value to be set. 
       */
      public fun path(path: String)

      /**
       * @param requestModel the value to be set.
       */
      public fun requestModel(requestModel: IResolvable)

      /**
       * @param requestModel the value to be set.
       */
      public fun requestModel(requestModel: RequestModelProperty)

      /**
       * @param requestModel the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e619423cfa57e3e91d2a78d27f5572978ed94902f4098b693b00608cd894ad6")
      public fun requestModel(requestModel: RequestModelProperty.Builder.() -> Unit)

      /**
       * @param requestParameters the value to be set.
       */
      public fun requestParameters(requestParameters: IResolvable)

      /**
       * @param requestParameters the value to be set.
       */
      public fun requestParameters(requestParameters: List<Any>)

      /**
       * @param requestParameters the value to be set.
       */
      public fun requestParameters(vararg requestParameters: Any)

      /**
       * @param restApiId the value to be set.
       */
      public fun restApiId(restApiId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.builder()

      /**
       * @param auth the value to be set.
       */
      override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      /**
       * @param auth the value to be set.
       */
      override fun auth(auth: AuthProperty) {
        cdkBuilder.auth(auth.let(AuthProperty::unwrap))
      }

      /**
       * @param auth the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("589a0e2ee65f9fb0a050563bd1dcbbd68692bf4d0c4e884d6d65cc546d27d8d2")
      override fun auth(auth: AuthProperty.Builder.() -> Unit): Unit = auth(AuthProperty(auth))

      /**
       * @param method the value to be set. 
       */
      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      /**
       * @param path the value to be set. 
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param requestModel the value to be set.
       */
      override fun requestModel(requestModel: IResolvable) {
        cdkBuilder.requestModel(requestModel.let(IResolvable::unwrap))
      }

      /**
       * @param requestModel the value to be set.
       */
      override fun requestModel(requestModel: RequestModelProperty) {
        cdkBuilder.requestModel(requestModel.let(RequestModelProperty::unwrap))
      }

      /**
       * @param requestModel the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e619423cfa57e3e91d2a78d27f5572978ed94902f4098b693b00608cd894ad6")
      override fun requestModel(requestModel: RequestModelProperty.Builder.() -> Unit): Unit =
          requestModel(RequestModelProperty(requestModel))

      /**
       * @param requestParameters the value to be set.
       */
      override fun requestParameters(requestParameters: IResolvable) {
        cdkBuilder.requestParameters(requestParameters.let(IResolvable::unwrap))
      }

      /**
       * @param requestParameters the value to be set.
       */
      override fun requestParameters(requestParameters: List<Any>) {
        cdkBuilder.requestParameters(requestParameters)
      }

      /**
       * @param requestParameters the value to be set.
       */
      override fun requestParameters(vararg requestParameters: Any): Unit =
          requestParameters(requestParameters.toList())

      /**
       * @param restApiId the value to be set.
       */
      override fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty,
    ) : CdkObject(cdkObject), ApiEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-auth)
       */
      override fun auth(): Any? = unwrap(this).getAuth()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-method)
       */
      override fun method(): String = unwrap(this).getMethod()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-path)
       */
      override fun path(): String = unwrap(this).getPath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-requestmodel)
       */
      override fun requestModel(): Any? = unwrap(this).getRequestModel()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-requestparameters)
       */
      override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html#cfn-serverless-function-apievent-restapiid)
       */
      override fun restApiId(): String? = unwrap(this).getRestApiId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty):
          ApiEventProperty = CdkObjectWrappers.wrap(cdkObject) as? ApiEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object customStatements;
   * AuthProperty authProperty = AuthProperty.builder()
   * .apiKeyRequired(false)
   * .authorizationScopes(List.of("authorizationScopes"))
   * .authorizer("authorizer")
   * .resourcePolicy(AuthResourcePolicyProperty.builder()
   * .awsAccountBlacklist(List.of("awsAccountBlacklist"))
   * .awsAccountWhitelist(List.of("awsAccountWhitelist"))
   * .customStatements(List.of(customStatements))
   * .intrinsicVpcBlacklist(List.of("intrinsicVpcBlacklist"))
   * .intrinsicVpceBlacklist(List.of("intrinsicVpceBlacklist"))
   * .intrinsicVpceWhitelist(List.of("intrinsicVpceWhitelist"))
   * .intrinsicVpcWhitelist(List.of("intrinsicVpcWhitelist"))
   * .ipRangeBlacklist(List.of("ipRangeBlacklist"))
   * .ipRangeWhitelist(List.of("ipRangeWhitelist"))
   * .sourceVpcBlacklist(List.of("sourceVpcBlacklist"))
   * .sourceVpcWhitelist(List.of("sourceVpcWhitelist"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html)
   */
  public interface AuthProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html#cfn-serverless-function-auth-apikeyrequired)
     */
    public fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html#cfn-serverless-function-auth-authorizationscopes)
     */
    public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html#cfn-serverless-function-auth-authorizer)
     */
    public fun authorizer(): String? = unwrap(this).getAuthorizer()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html#cfn-serverless-function-auth-resourcepolicy)
     */
    public fun resourcePolicy(): Any? = unwrap(this).getResourcePolicy()

    /**
     * A builder for [AuthProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiKeyRequired the value to be set.
       */
      public fun apiKeyRequired(apiKeyRequired: Boolean)

      /**
       * @param apiKeyRequired the value to be set.
       */
      public fun apiKeyRequired(apiKeyRequired: IResolvable)

      /**
       * @param authorizationScopes the value to be set.
       */
      public fun authorizationScopes(authorizationScopes: List<String>)

      /**
       * @param authorizationScopes the value to be set.
       */
      public fun authorizationScopes(vararg authorizationScopes: String)

      /**
       * @param authorizer the value to be set.
       */
      public fun authorizer(authorizer: String)

      /**
       * @param resourcePolicy the value to be set.
       */
      public fun resourcePolicy(resourcePolicy: IResolvable)

      /**
       * @param resourcePolicy the value to be set.
       */
      public fun resourcePolicy(resourcePolicy: AuthResourcePolicyProperty)

      /**
       * @param resourcePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9529cdb1fed6991be410cd02514de78b43eac83f9f8a181328666094daef357")
      public fun resourcePolicy(resourcePolicy: AuthResourcePolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.sam.CfnFunction.AuthProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.AuthProperty.builder()

      /**
       * @param apiKeyRequired the value to be set.
       */
      override fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
      }

      /**
       * @param apiKeyRequired the value to be set.
       */
      override fun apiKeyRequired(apiKeyRequired: IResolvable) {
        cdkBuilder.apiKeyRequired(apiKeyRequired.let(IResolvable::unwrap))
      }

      /**
       * @param authorizationScopes the value to be set.
       */
      override fun authorizationScopes(authorizationScopes: List<String>) {
        cdkBuilder.authorizationScopes(authorizationScopes)
      }

      /**
       * @param authorizationScopes the value to be set.
       */
      override fun authorizationScopes(vararg authorizationScopes: String): Unit =
          authorizationScopes(authorizationScopes.toList())

      /**
       * @param authorizer the value to be set.
       */
      override fun authorizer(authorizer: String) {
        cdkBuilder.authorizer(authorizer)
      }

      /**
       * @param resourcePolicy the value to be set.
       */
      override fun resourcePolicy(resourcePolicy: IResolvable) {
        cdkBuilder.resourcePolicy(resourcePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param resourcePolicy the value to be set.
       */
      override fun resourcePolicy(resourcePolicy: AuthResourcePolicyProperty) {
        cdkBuilder.resourcePolicy(resourcePolicy.let(AuthResourcePolicyProperty::unwrap))
      }

      /**
       * @param resourcePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9529cdb1fed6991be410cd02514de78b43eac83f9f8a181328666094daef357")
      override fun resourcePolicy(resourcePolicy: AuthResourcePolicyProperty.Builder.() -> Unit):
          Unit = resourcePolicy(AuthResourcePolicyProperty(resourcePolicy))

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.AuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.AuthProperty,
    ) : CdkObject(cdkObject), AuthProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html#cfn-serverless-function-auth-apikeyrequired)
       */
      override fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html#cfn-serverless-function-auth-authorizationscopes)
       */
      override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
          emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html#cfn-serverless-function-auth-authorizer)
       */
      override fun authorizer(): String? = unwrap(this).getAuthorizer()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html#cfn-serverless-function-auth-resourcepolicy)
       */
      override fun resourcePolicy(): Any? = unwrap(this).getResourcePolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.AuthProperty):
          AuthProperty = CdkObjectWrappers.wrap(cdkObject) as? AuthProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthProperty):
          software.amazon.awscdk.services.sam.CfnFunction.AuthProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.AuthProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object customStatements;
   * AuthResourcePolicyProperty authResourcePolicyProperty = AuthResourcePolicyProperty.builder()
   * .awsAccountBlacklist(List.of("awsAccountBlacklist"))
   * .awsAccountWhitelist(List.of("awsAccountWhitelist"))
   * .customStatements(List.of(customStatements))
   * .intrinsicVpcBlacklist(List.of("intrinsicVpcBlacklist"))
   * .intrinsicVpceBlacklist(List.of("intrinsicVpceBlacklist"))
   * .intrinsicVpceWhitelist(List.of("intrinsicVpceWhitelist"))
   * .intrinsicVpcWhitelist(List.of("intrinsicVpcWhitelist"))
   * .ipRangeBlacklist(List.of("ipRangeBlacklist"))
   * .ipRangeWhitelist(List.of("ipRangeWhitelist"))
   * .sourceVpcBlacklist(List.of("sourceVpcBlacklist"))
   * .sourceVpcWhitelist(List.of("sourceVpcWhitelist"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html)
   */
  public interface AuthResourcePolicyProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-awsaccountblacklist)
     */
    public fun awsAccountBlacklist(): List<String> = unwrap(this).getAwsAccountBlacklist() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-awsaccountwhitelist)
     */
    public fun awsAccountWhitelist(): List<String> = unwrap(this).getAwsAccountWhitelist() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-customstatements)
     */
    public fun customStatements(): Any? = unwrap(this).getCustomStatements()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-intrinsicvpcblacklist)
     */
    public fun intrinsicVpcBlacklist(): List<String> = unwrap(this).getIntrinsicVpcBlacklist() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-intrinsicvpcwhitelist)
     */
    public fun intrinsicVpcWhitelist(): List<String> = unwrap(this).getIntrinsicVpcWhitelist() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-intrinsicvpceblacklist)
     */
    public fun intrinsicVpceBlacklist(): List<String> = unwrap(this).getIntrinsicVpceBlacklist() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-intrinsicvpcewhitelist)
     */
    public fun intrinsicVpceWhitelist(): List<String> = unwrap(this).getIntrinsicVpceWhitelist() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-iprangeblacklist)
     */
    public fun ipRangeBlacklist(): List<String> = unwrap(this).getIpRangeBlacklist() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-iprangewhitelist)
     */
    public fun ipRangeWhitelist(): List<String> = unwrap(this).getIpRangeWhitelist() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-sourcevpcblacklist)
     */
    public fun sourceVpcBlacklist(): List<String> = unwrap(this).getSourceVpcBlacklist() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-sourcevpcwhitelist)
     */
    public fun sourceVpcWhitelist(): List<String> = unwrap(this).getSourceVpcWhitelist() ?:
        emptyList()

    /**
     * A builder for [AuthResourcePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccountBlacklist the value to be set.
       */
      public fun awsAccountBlacklist(awsAccountBlacklist: List<String>)

      /**
       * @param awsAccountBlacklist the value to be set.
       */
      public fun awsAccountBlacklist(vararg awsAccountBlacklist: String)

      /**
       * @param awsAccountWhitelist the value to be set.
       */
      public fun awsAccountWhitelist(awsAccountWhitelist: List<String>)

      /**
       * @param awsAccountWhitelist the value to be set.
       */
      public fun awsAccountWhitelist(vararg awsAccountWhitelist: String)

      /**
       * @param customStatements the value to be set.
       */
      public fun customStatements(customStatements: List<Any>)

      /**
       * @param customStatements the value to be set.
       */
      public fun customStatements(vararg customStatements: Any)

      /**
       * @param customStatements the value to be set.
       */
      public fun customStatements(customStatements: IResolvable)

      /**
       * @param intrinsicVpcBlacklist the value to be set.
       */
      public fun intrinsicVpcBlacklist(intrinsicVpcBlacklist: List<String>)

      /**
       * @param intrinsicVpcBlacklist the value to be set.
       */
      public fun intrinsicVpcBlacklist(vararg intrinsicVpcBlacklist: String)

      /**
       * @param intrinsicVpcWhitelist the value to be set.
       */
      public fun intrinsicVpcWhitelist(intrinsicVpcWhitelist: List<String>)

      /**
       * @param intrinsicVpcWhitelist the value to be set.
       */
      public fun intrinsicVpcWhitelist(vararg intrinsicVpcWhitelist: String)

      /**
       * @param intrinsicVpceBlacklist the value to be set.
       */
      public fun intrinsicVpceBlacklist(intrinsicVpceBlacklist: List<String>)

      /**
       * @param intrinsicVpceBlacklist the value to be set.
       */
      public fun intrinsicVpceBlacklist(vararg intrinsicVpceBlacklist: String)

      /**
       * @param intrinsicVpceWhitelist the value to be set.
       */
      public fun intrinsicVpceWhitelist(intrinsicVpceWhitelist: List<String>)

      /**
       * @param intrinsicVpceWhitelist the value to be set.
       */
      public fun intrinsicVpceWhitelist(vararg intrinsicVpceWhitelist: String)

      /**
       * @param ipRangeBlacklist the value to be set.
       */
      public fun ipRangeBlacklist(ipRangeBlacklist: List<String>)

      /**
       * @param ipRangeBlacklist the value to be set.
       */
      public fun ipRangeBlacklist(vararg ipRangeBlacklist: String)

      /**
       * @param ipRangeWhitelist the value to be set.
       */
      public fun ipRangeWhitelist(ipRangeWhitelist: List<String>)

      /**
       * @param ipRangeWhitelist the value to be set.
       */
      public fun ipRangeWhitelist(vararg ipRangeWhitelist: String)

      /**
       * @param sourceVpcBlacklist the value to be set.
       */
      public fun sourceVpcBlacklist(sourceVpcBlacklist: List<String>)

      /**
       * @param sourceVpcBlacklist the value to be set.
       */
      public fun sourceVpcBlacklist(vararg sourceVpcBlacklist: String)

      /**
       * @param sourceVpcWhitelist the value to be set.
       */
      public fun sourceVpcWhitelist(sourceVpcWhitelist: List<String>)

      /**
       * @param sourceVpcWhitelist the value to be set.
       */
      public fun sourceVpcWhitelist(vararg sourceVpcWhitelist: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty.builder()

      /**
       * @param awsAccountBlacklist the value to be set.
       */
      override fun awsAccountBlacklist(awsAccountBlacklist: List<String>) {
        cdkBuilder.awsAccountBlacklist(awsAccountBlacklist)
      }

      /**
       * @param awsAccountBlacklist the value to be set.
       */
      override fun awsAccountBlacklist(vararg awsAccountBlacklist: String): Unit =
          awsAccountBlacklist(awsAccountBlacklist.toList())

      /**
       * @param awsAccountWhitelist the value to be set.
       */
      override fun awsAccountWhitelist(awsAccountWhitelist: List<String>) {
        cdkBuilder.awsAccountWhitelist(awsAccountWhitelist)
      }

      /**
       * @param awsAccountWhitelist the value to be set.
       */
      override fun awsAccountWhitelist(vararg awsAccountWhitelist: String): Unit =
          awsAccountWhitelist(awsAccountWhitelist.toList())

      /**
       * @param customStatements the value to be set.
       */
      override fun customStatements(customStatements: List<Any>) {
        cdkBuilder.customStatements(customStatements)
      }

      /**
       * @param customStatements the value to be set.
       */
      override fun customStatements(vararg customStatements: Any): Unit =
          customStatements(customStatements.toList())

      /**
       * @param customStatements the value to be set.
       */
      override fun customStatements(customStatements: IResolvable) {
        cdkBuilder.customStatements(customStatements.let(IResolvable::unwrap))
      }

      /**
       * @param intrinsicVpcBlacklist the value to be set.
       */
      override fun intrinsicVpcBlacklist(intrinsicVpcBlacklist: List<String>) {
        cdkBuilder.intrinsicVpcBlacklist(intrinsicVpcBlacklist)
      }

      /**
       * @param intrinsicVpcBlacklist the value to be set.
       */
      override fun intrinsicVpcBlacklist(vararg intrinsicVpcBlacklist: String): Unit =
          intrinsicVpcBlacklist(intrinsicVpcBlacklist.toList())

      /**
       * @param intrinsicVpcWhitelist the value to be set.
       */
      override fun intrinsicVpcWhitelist(intrinsicVpcWhitelist: List<String>) {
        cdkBuilder.intrinsicVpcWhitelist(intrinsicVpcWhitelist)
      }

      /**
       * @param intrinsicVpcWhitelist the value to be set.
       */
      override fun intrinsicVpcWhitelist(vararg intrinsicVpcWhitelist: String): Unit =
          intrinsicVpcWhitelist(intrinsicVpcWhitelist.toList())

      /**
       * @param intrinsicVpceBlacklist the value to be set.
       */
      override fun intrinsicVpceBlacklist(intrinsicVpceBlacklist: List<String>) {
        cdkBuilder.intrinsicVpceBlacklist(intrinsicVpceBlacklist)
      }

      /**
       * @param intrinsicVpceBlacklist the value to be set.
       */
      override fun intrinsicVpceBlacklist(vararg intrinsicVpceBlacklist: String): Unit =
          intrinsicVpceBlacklist(intrinsicVpceBlacklist.toList())

      /**
       * @param intrinsicVpceWhitelist the value to be set.
       */
      override fun intrinsicVpceWhitelist(intrinsicVpceWhitelist: List<String>) {
        cdkBuilder.intrinsicVpceWhitelist(intrinsicVpceWhitelist)
      }

      /**
       * @param intrinsicVpceWhitelist the value to be set.
       */
      override fun intrinsicVpceWhitelist(vararg intrinsicVpceWhitelist: String): Unit =
          intrinsicVpceWhitelist(intrinsicVpceWhitelist.toList())

      /**
       * @param ipRangeBlacklist the value to be set.
       */
      override fun ipRangeBlacklist(ipRangeBlacklist: List<String>) {
        cdkBuilder.ipRangeBlacklist(ipRangeBlacklist)
      }

      /**
       * @param ipRangeBlacklist the value to be set.
       */
      override fun ipRangeBlacklist(vararg ipRangeBlacklist: String): Unit =
          ipRangeBlacklist(ipRangeBlacklist.toList())

      /**
       * @param ipRangeWhitelist the value to be set.
       */
      override fun ipRangeWhitelist(ipRangeWhitelist: List<String>) {
        cdkBuilder.ipRangeWhitelist(ipRangeWhitelist)
      }

      /**
       * @param ipRangeWhitelist the value to be set.
       */
      override fun ipRangeWhitelist(vararg ipRangeWhitelist: String): Unit =
          ipRangeWhitelist(ipRangeWhitelist.toList())

      /**
       * @param sourceVpcBlacklist the value to be set.
       */
      override fun sourceVpcBlacklist(sourceVpcBlacklist: List<String>) {
        cdkBuilder.sourceVpcBlacklist(sourceVpcBlacklist)
      }

      /**
       * @param sourceVpcBlacklist the value to be set.
       */
      override fun sourceVpcBlacklist(vararg sourceVpcBlacklist: String): Unit =
          sourceVpcBlacklist(sourceVpcBlacklist.toList())

      /**
       * @param sourceVpcWhitelist the value to be set.
       */
      override fun sourceVpcWhitelist(sourceVpcWhitelist: List<String>) {
        cdkBuilder.sourceVpcWhitelist(sourceVpcWhitelist)
      }

      /**
       * @param sourceVpcWhitelist the value to be set.
       */
      override fun sourceVpcWhitelist(vararg sourceVpcWhitelist: String): Unit =
          sourceVpcWhitelist(sourceVpcWhitelist.toList())

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty,
    ) : CdkObject(cdkObject), AuthResourcePolicyProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-awsaccountblacklist)
       */
      override fun awsAccountBlacklist(): List<String> = unwrap(this).getAwsAccountBlacklist() ?:
          emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-awsaccountwhitelist)
       */
      override fun awsAccountWhitelist(): List<String> = unwrap(this).getAwsAccountWhitelist() ?:
          emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-customstatements)
       */
      override fun customStatements(): Any? = unwrap(this).getCustomStatements()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-intrinsicvpcblacklist)
       */
      override fun intrinsicVpcBlacklist(): List<String> = unwrap(this).getIntrinsicVpcBlacklist()
          ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-intrinsicvpcwhitelist)
       */
      override fun intrinsicVpcWhitelist(): List<String> = unwrap(this).getIntrinsicVpcWhitelist()
          ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-intrinsicvpceblacklist)
       */
      override fun intrinsicVpceBlacklist(): List<String> = unwrap(this).getIntrinsicVpceBlacklist()
          ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-intrinsicvpcewhitelist)
       */
      override fun intrinsicVpceWhitelist(): List<String> = unwrap(this).getIntrinsicVpceWhitelist()
          ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-iprangeblacklist)
       */
      override fun ipRangeBlacklist(): List<String> = unwrap(this).getIpRangeBlacklist() ?:
          emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-iprangewhitelist)
       */
      override fun ipRangeWhitelist(): List<String> = unwrap(this).getIpRangeWhitelist() ?:
          emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-sourcevpcblacklist)
       */
      override fun sourceVpcBlacklist(): List<String> = unwrap(this).getSourceVpcBlacklist() ?:
          emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html#cfn-serverless-function-authresourcepolicy-sourcevpcwhitelist)
       */
      override fun sourceVpcWhitelist(): List<String> = unwrap(this).getSourceVpcWhitelist() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthResourcePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty):
          AuthResourcePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthResourcePolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthResourcePolicyProperty):
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * BucketSAMPTProperty bucketSAMPTProperty = BucketSAMPTProperty.builder()
   * .bucketName("bucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-bucketsampt.html)
   */
  public interface BucketSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-bucketsampt.html#cfn-serverless-function-bucketsampt-bucketname)
     */
    public fun bucketName(): String

    /**
     * A builder for [BucketSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName the value to be set. 
       */
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty.builder()

      /**
       * @param bucketName the value to be set. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty,
    ) : CdkObject(cdkObject), BucketSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-bucketsampt.html#cfn-serverless-function-bucketsampt-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BucketSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty):
          BucketSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? BucketSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BucketSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object pattern;
   * CloudWatchEventEventProperty cloudWatchEventEventProperty =
   * CloudWatchEventEventProperty.builder()
   * .pattern(pattern)
   * // the properties below are optional
   * .input("input")
   * .inputPath("inputPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatcheventevent.html)
   */
  public interface CloudWatchEventEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatcheventevent.html#cfn-serverless-function-cloudwatcheventevent-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatcheventevent.html#cfn-serverless-function-cloudwatcheventevent-inputpath)
     */
    public fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatcheventevent.html#cfn-serverless-function-cloudwatcheventevent-pattern)
     */
    public fun pattern(): Any

    /**
     * A builder for [CloudWatchEventEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param input the value to be set.
       */
      public fun input(input: String)

      /**
       * @param inputPath the value to be set.
       */
      public fun inputPath(inputPath: String)

      /**
       * @param pattern the value to be set. 
       */
      public fun pattern(pattern: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.builder()

      /**
       * @param input the value to be set.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param inputPath the value to be set.
       */
      override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      /**
       * @param pattern the value to be set. 
       */
      override fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty,
    ) : CdkObject(cdkObject), CloudWatchEventEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatcheventevent.html#cfn-serverless-function-cloudwatcheventevent-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatcheventevent.html#cfn-serverless-function-cloudwatcheventevent-inputpath)
       */
      override fun inputPath(): String? = unwrap(this).getInputPath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatcheventevent.html#cfn-serverless-function-cloudwatcheventevent-pattern)
       */
      override fun pattern(): Any = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchEventEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty):
          CloudWatchEventEventProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchEventEventProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchEventEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * CloudWatchLogsEventProperty cloudWatchLogsEventProperty = CloudWatchLogsEventProperty.builder()
   * .filterPattern("filterPattern")
   * .logGroupName("logGroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatchlogsevent.html)
   */
  public interface CloudWatchLogsEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatchlogsevent.html#cfn-serverless-function-cloudwatchlogsevent-filterpattern)
     */
    public fun filterPattern(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatchlogsevent.html#cfn-serverless-function-cloudwatchlogsevent-loggroupname)
     */
    public fun logGroupName(): String

    /**
     * A builder for [CloudWatchLogsEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filterPattern the value to be set. 
       */
      public fun filterPattern(filterPattern: String)

      /**
       * @param logGroupName the value to be set. 
       */
      public fun logGroupName(logGroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty.builder()

      /**
       * @param filterPattern the value to be set. 
       */
      override fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
      }

      /**
       * @param logGroupName the value to be set. 
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatchlogsevent.html#cfn-serverless-function-cloudwatchlogsevent-filterpattern)
       */
      override fun filterPattern(): String = unwrap(this).getFilterPattern()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatchlogsevent.html#cfn-serverless-function-cloudwatchlogsevent-loggroupname)
       */
      override fun logGroupName(): String = unwrap(this).getLogGroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty):
          CloudWatchLogsEventProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogsEventProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * CognitoEventProperty cognitoEventProperty = CognitoEventProperty.builder()
   * .trigger("trigger")
   * .userPool("userPool")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cognitoevent.html)
   */
  public interface CognitoEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cognitoevent.html#cfn-serverless-function-cognitoevent-trigger)
     */
    public fun trigger(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cognitoevent.html#cfn-serverless-function-cognitoevent-userpool)
     */
    public fun userPool(): String

    /**
     * A builder for [CognitoEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param trigger the value to be set. 
       */
      public fun trigger(trigger: String)

      /**
       * @param userPool the value to be set. 
       */
      public fun userPool(userPool: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty.builder()

      /**
       * @param trigger the value to be set. 
       */
      override fun trigger(trigger: String) {
        cdkBuilder.trigger(trigger)
      }

      /**
       * @param userPool the value to be set. 
       */
      override fun userPool(userPool: String) {
        cdkBuilder.userPool(userPool)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty,
    ) : CdkObject(cdkObject), CognitoEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cognitoevent.html#cfn-serverless-function-cognitoevent-trigger)
       */
      override fun trigger(): String = unwrap(this).getTrigger()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cognitoevent.html#cfn-serverless-function-cognitoevent-userpool)
       */
      override fun userPool(): String = unwrap(this).getUserPool()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty):
          CognitoEventProperty = CdkObjectWrappers.wrap(cdkObject) as? CognitoEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * CollectionSAMPTProperty collectionSAMPTProperty = CollectionSAMPTProperty.builder()
   * .collectionId("collectionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-collectionsampt.html)
   */
  public interface CollectionSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-collectionsampt.html#cfn-serverless-function-collectionsampt-collectionid)
     */
    public fun collectionId(): String

    /**
     * A builder for [CollectionSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param collectionId the value to be set. 
       */
      public fun collectionId(collectionId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty.builder()

      /**
       * @param collectionId the value to be set. 
       */
      override fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty,
    ) : CdkObject(cdkObject), CollectionSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-collectionsampt.html#cfn-serverless-function-collectionsampt-collectionid)
       */
      override fun collectionId(): String = unwrap(this).getCollectionId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CollectionSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty):
          CollectionSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? CollectionSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CollectionSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * CorsConfigurationProperty corsConfigurationProperty = CorsConfigurationProperty.builder()
   * .allowOrigin("allowOrigin")
   * // the properties below are optional
   * .allowCredentials(false)
   * .allowHeaders("allowHeaders")
   * .allowMethods("allowMethods")
   * .maxAge("maxAge")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html)
   */
  public interface CorsConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-allowcredentials)
     */
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-allowheaders)
     */
    public fun allowHeaders(): String? = unwrap(this).getAllowHeaders()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-allowmethods)
     */
    public fun allowMethods(): String? = unwrap(this).getAllowMethods()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-alloworigin)
     */
    public fun allowOrigin(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-maxage)
     */
    public fun maxAge(): String? = unwrap(this).getMaxAge()

    /**
     * A builder for [CorsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowCredentials the value to be set.
       */
      public fun allowCredentials(allowCredentials: Boolean)

      /**
       * @param allowCredentials the value to be set.
       */
      public fun allowCredentials(allowCredentials: IResolvable)

      /**
       * @param allowHeaders the value to be set.
       */
      public fun allowHeaders(allowHeaders: String)

      /**
       * @param allowMethods the value to be set.
       */
      public fun allowMethods(allowMethods: String)

      /**
       * @param allowOrigin the value to be set. 
       */
      public fun allowOrigin(allowOrigin: String)

      /**
       * @param maxAge the value to be set.
       */
      public fun maxAge(maxAge: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty.builder()

      /**
       * @param allowCredentials the value to be set.
       */
      override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      /**
       * @param allowCredentials the value to be set.
       */
      override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param allowHeaders the value to be set.
       */
      override fun allowHeaders(allowHeaders: String) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      /**
       * @param allowMethods the value to be set.
       */
      override fun allowMethods(allowMethods: String) {
        cdkBuilder.allowMethods(allowMethods)
      }

      /**
       * @param allowOrigin the value to be set. 
       */
      override fun allowOrigin(allowOrigin: String) {
        cdkBuilder.allowOrigin(allowOrigin)
      }

      /**
       * @param maxAge the value to be set.
       */
      override fun maxAge(maxAge: String) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty,
    ) : CdkObject(cdkObject), CorsConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-allowcredentials)
       */
      override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-allowheaders)
       */
      override fun allowHeaders(): String? = unwrap(this).getAllowHeaders()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-allowmethods)
       */
      override fun allowMethods(): String? = unwrap(this).getAllowMethods()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-alloworigin)
       */
      override fun allowOrigin(): String = unwrap(this).getAllowOrigin()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-corsconfiguration.html#cfn-serverless-function-corsconfiguration-maxage)
       */
      override fun maxAge(): String? = unwrap(this).getMaxAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty):
          CorsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CorsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * DeadLetterQueueProperty deadLetterQueueProperty = DeadLetterQueueProperty.builder()
   * .targetArn("targetArn")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deadletterqueue.html)
   */
  public interface DeadLetterQueueProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deadletterqueue.html#cfn-serverless-function-deadletterqueue-targetarn)
     */
    public fun targetArn(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deadletterqueue.html#cfn-serverless-function-deadletterqueue-type)
     */
    public fun type(): String

    /**
     * A builder for [DeadLetterQueueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetArn the value to be set. 
       */
      public fun targetArn(targetArn: String)

      /**
       * @param type the value to be set. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.builder()

      /**
       * @param targetArn the value to be set. 
       */
      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      /**
       * @param type the value to be set. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty,
    ) : CdkObject(cdkObject), DeadLetterQueueProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deadletterqueue.html#cfn-serverless-function-deadletterqueue-targetarn)
       */
      override fun targetArn(): String = unwrap(this).getTargetArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deadletterqueue.html#cfn-serverless-function-deadletterqueue-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterQueueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty):
          DeadLetterQueueProperty = CdkObjectWrappers.wrap(cdkObject) as? DeadLetterQueueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterQueueProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * DeploymentPreferenceProperty deploymentPreferenceProperty =
   * DeploymentPreferenceProperty.builder()
   * .alarms(List.of("alarms"))
   * .enabled(false)
   * .hooks(HooksProperty.builder()
   * .postTraffic("postTraffic")
   * .preTraffic("preTraffic")
   * .build())
   * .role("role")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html)
   */
  public interface DeploymentPreferenceProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-alarms)
     */
    public fun alarms(): List<String> = unwrap(this).getAlarms() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-hooks)
     */
    public fun hooks(): Any? = unwrap(this).getHooks()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-role)
     */
    public fun role(): String? = unwrap(this).getRole()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [DeploymentPreferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarms the value to be set.
       */
      public fun alarms(alarms: List<String>)

      /**
       * @param alarms the value to be set.
       */
      public fun alarms(vararg alarms: String)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param hooks the value to be set.
       */
      public fun hooks(hooks: IResolvable)

      /**
       * @param hooks the value to be set.
       */
      public fun hooks(hooks: HooksProperty)

      /**
       * @param hooks the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fc0537ee41f9f3a667818f4fc6b33c1a2b84bd73a3fd37afe20f77762896adf")
      public fun hooks(hooks: HooksProperty.Builder.() -> Unit)

      /**
       * @param role the value to be set.
       */
      public fun role(role: String)

      /**
       * @param type the value to be set.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.builder()

      /**
       * @param alarms the value to be set.
       */
      override fun alarms(alarms: List<String>) {
        cdkBuilder.alarms(alarms)
      }

      /**
       * @param alarms the value to be set.
       */
      override fun alarms(vararg alarms: String): Unit = alarms(alarms.toList())

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param hooks the value to be set.
       */
      override fun hooks(hooks: IResolvable) {
        cdkBuilder.hooks(hooks.let(IResolvable::unwrap))
      }

      /**
       * @param hooks the value to be set.
       */
      override fun hooks(hooks: HooksProperty) {
        cdkBuilder.hooks(hooks.let(HooksProperty::unwrap))
      }

      /**
       * @param hooks the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fc0537ee41f9f3a667818f4fc6b33c1a2b84bd73a3fd37afe20f77762896adf")
      override fun hooks(hooks: HooksProperty.Builder.() -> Unit): Unit =
          hooks(HooksProperty(hooks))

      /**
       * @param role the value to be set.
       */
      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      /**
       * @param type the value to be set.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty,
    ) : CdkObject(cdkObject), DeploymentPreferenceProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-alarms)
       */
      override fun alarms(): List<String> = unwrap(this).getAlarms() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-hooks)
       */
      override fun hooks(): Any? = unwrap(this).getHooks()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-role)
       */
      override fun role(): String? = unwrap(this).getRole()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html#cfn-serverless-function-deploymentpreference-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentPreferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty):
          DeploymentPreferenceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentPreferenceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentPreferenceProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
   * .onFailure(DestinationProperty.builder()
   * .destination("destination")
   * // the properties below are optional
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destinationconfig.html)
   */
  public interface DestinationConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destinationconfig.html#cfn-serverless-function-destinationconfig-onfailure)
     */
    public fun onFailure(): Any

    /**
     * A builder for [DestinationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onFailure the value to be set. 
       */
      public fun onFailure(onFailure: IResolvable)

      /**
       * @param onFailure the value to be set. 
       */
      public fun onFailure(onFailure: DestinationProperty)

      /**
       * @param onFailure the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e3e496c57c72b0b152178f134f6b93c1761e61cdb20b9785675b0699fdaf5db")
      public fun onFailure(onFailure: DestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty.builder()

      /**
       * @param onFailure the value to be set. 
       */
      override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable::unwrap))
      }

      /**
       * @param onFailure the value to be set. 
       */
      override fun onFailure(onFailure: DestinationProperty) {
        cdkBuilder.onFailure(onFailure.let(DestinationProperty::unwrap))
      }

      /**
       * @param onFailure the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e3e496c57c72b0b152178f134f6b93c1761e61cdb20b9785675b0699fdaf5db")
      override fun onFailure(onFailure: DestinationProperty.Builder.() -> Unit): Unit =
          onFailure(DestinationProperty(onFailure))

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty,
    ) : CdkObject(cdkObject), DestinationConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destinationconfig.html#cfn-serverless-function-destinationconfig-onfailure)
       */
      override fun onFailure(): Any = unwrap(this).getOnFailure()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty):
          DestinationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * DestinationProperty destinationProperty = DestinationProperty.builder()
   * .destination("destination")
   * // the properties below are optional
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destination.html)
   */
  public interface DestinationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destination.html#cfn-serverless-function-destination-destination)
     */
    public fun destination(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destination.html#cfn-serverless-function-destination-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [DestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination the value to be set. 
       */
      public fun destination(destination: String)

      /**
       * @param type the value to be set.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty.builder()

      /**
       * @param destination the value to be set. 
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param type the value to be set.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty,
    ) : CdkObject(cdkObject), DestinationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destination.html#cfn-serverless-function-destination-destination)
       */
      override fun destination(): String = unwrap(this).getDestination()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destination.html#cfn-serverless-function-destination-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty):
          DestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? DestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * DomainSAMPTProperty domainSAMPTProperty = DomainSAMPTProperty.builder()
   * .domainName("domainName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-domainsampt.html)
   */
  public interface DomainSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-domainsampt.html#cfn-serverless-function-domainsampt-domainname)
     */
    public fun domainName(): String

    /**
     * A builder for [DomainSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainName the value to be set. 
       */
      public fun domainName(domainName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty.builder()

      /**
       * @param domainName the value to be set. 
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty,
    ) : CdkObject(cdkObject), DomainSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-domainsampt.html#cfn-serverless-function-domainsampt-domainname)
       */
      override fun domainName(): String = unwrap(this).getDomainName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty):
          DomainSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? DomainSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * DynamoDBEventProperty dynamoDBEventProperty = DynamoDBEventProperty.builder()
   * .startingPosition("startingPosition")
   * .stream("stream")
   * // the properties below are optional
   * .batchSize(123)
   * .bisectBatchOnFunctionError(false)
   * .destinationConfig(DestinationConfigProperty.builder()
   * .onFailure(DestinationProperty.builder()
   * .destination("destination")
   * // the properties below are optional
   * .type("type")
   * .build())
   * .build())
   * .enabled(false)
   * .maximumBatchingWindowInSeconds(123)
   * .maximumRecordAgeInSeconds(123)
   * .maximumRetryAttempts(123)
   * .parallelizationFactor(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html)
   */
  public interface DynamoDBEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-bisectbatchonfunctionerror)
     */
    public fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-destinationconfig)
     */
    public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-maximumbatchingwindowinseconds)
     */
    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-maximumrecordageinseconds)
     */
    public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-maximumretryattempts)
     */
    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-parallelizationfactor)
     */
    public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-startingposition)
     */
    public fun startingPosition(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-stream)
     */
    public fun stream(): String

    /**
     * A builder for [DynamoDBEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize the value to be set.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param bisectBatchOnFunctionError the value to be set.
       */
      public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean)

      /**
       * @param bisectBatchOnFunctionError the value to be set.
       */
      public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable)

      /**
       * @param destinationConfig the value to be set.
       */
      public fun destinationConfig(destinationConfig: IResolvable)

      /**
       * @param destinationConfig the value to be set.
       */
      public fun destinationConfig(destinationConfig: DestinationConfigProperty)

      /**
       * @param destinationConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd610d4ec286a5d97e944a76a30a2a842fafee8146a6190f9fce1fc989ef56bd")
      public fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param maximumBatchingWindowInSeconds the value to be set.
       */
      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      /**
       * @param maximumRecordAgeInSeconds the value to be set.
       */
      public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

      /**
       * @param maximumRetryAttempts the value to be set.
       */
      public fun maximumRetryAttempts(maximumRetryAttempts: Number)

      /**
       * @param parallelizationFactor the value to be set.
       */
      public fun parallelizationFactor(parallelizationFactor: Number)

      /**
       * @param startingPosition the value to be set. 
       */
      public fun startingPosition(startingPosition: String)

      /**
       * @param stream the value to be set. 
       */
      public fun stream(stream: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.builder()

      /**
       * @param batchSize the value to be set.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param bisectBatchOnFunctionError the value to be set.
       */
      override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
      }

      /**
       * @param bisectBatchOnFunctionError the value to be set.
       */
      override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError.let(IResolvable::unwrap))
      }

      /**
       * @param destinationConfig the value to be set.
       */
      override fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param destinationConfig the value to be set.
       */
      override fun destinationConfig(destinationConfig: DestinationConfigProperty) {
        cdkBuilder.destinationConfig(destinationConfig.let(DestinationConfigProperty::unwrap))
      }

      /**
       * @param destinationConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd610d4ec286a5d97e944a76a30a2a842fafee8146a6190f9fce1fc989ef56bd")
      override
          fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit):
          Unit = destinationConfig(DestinationConfigProperty(destinationConfig))

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param maximumBatchingWindowInSeconds the value to be set.
       */
      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      /**
       * @param maximumRecordAgeInSeconds the value to be set.
       */
      override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
      }

      /**
       * @param maximumRetryAttempts the value to be set.
       */
      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      /**
       * @param parallelizationFactor the value to be set.
       */
      override fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
      }

      /**
       * @param startingPosition the value to be set. 
       */
      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      /**
       * @param stream the value to be set. 
       */
      override fun stream(stream: String) {
        cdkBuilder.stream(stream)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty,
    ) : CdkObject(cdkObject), DynamoDBEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-bisectbatchonfunctionerror)
       */
      override fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-destinationconfig)
       */
      override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-maximumbatchingwindowinseconds)
       */
      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-maximumrecordageinseconds)
       */
      override fun maximumRecordAgeInSeconds(): Number? =
          unwrap(this).getMaximumRecordAgeInSeconds()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-maximumretryattempts)
       */
      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-parallelizationfactor)
       */
      override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-startingposition)
       */
      override fun startingPosition(): String = unwrap(this).getStartingPosition()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html#cfn-serverless-function-dynamodbevent-stream)
       */
      override fun stream(): String = unwrap(this).getStream()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty):
          DynamoDBEventProperty = CdkObjectWrappers.wrap(cdkObject) as? DynamoDBEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * EmptySAMPTProperty emptySAMPTProperty = EmptySAMPTProperty.builder().build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-emptysampt.html)
   */
  public interface EmptySAMPTProperty {
    /**
     * A builder for [EmptySAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty.builder()

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty,
    ) : CdkObject(cdkObject), EmptySAMPTProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EmptySAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty):
          EmptySAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? EmptySAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmptySAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
   * .size(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-ephemeralstorage.html)
   */
  public interface EphemeralStorageProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-ephemeralstorage.html#cfn-serverless-function-ephemeralstorage-size)
     */
    public fun size(): Number

    /**
     * A builder for [EphemeralStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param size the value to be set. 
       */
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty.builder()

      /**
       * @param size the value to be set. 
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty,
    ) : CdkObject(cdkObject), EphemeralStorageProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-ephemeralstorage.html#cfn-serverless-function-ephemeralstorage-size)
       */
      override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty):
          EphemeralStorageProperty = CdkObjectWrappers.wrap(cdkObject) as? EphemeralStorageProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object pattern;
   * EventBridgeRuleEventProperty eventBridgeRuleEventProperty =
   * EventBridgeRuleEventProperty.builder()
   * .pattern(pattern)
   * // the properties below are optional
   * .eventBusName("eventBusName")
   * .input("input")
   * .inputPath("inputPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html)
   */
  public interface EventBridgeRuleEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html#cfn-serverless-function-eventbridgeruleevent-eventbusname)
     */
    public fun eventBusName(): String? = unwrap(this).getEventBusName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html#cfn-serverless-function-eventbridgeruleevent-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html#cfn-serverless-function-eventbridgeruleevent-inputpath)
     */
    public fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html#cfn-serverless-function-eventbridgeruleevent-pattern)
     */
    public fun pattern(): Any

    /**
     * A builder for [EventBridgeRuleEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventBusName the value to be set.
       */
      public fun eventBusName(eventBusName: String)

      /**
       * @param input the value to be set.
       */
      public fun input(input: String)

      /**
       * @param inputPath the value to be set.
       */
      public fun inputPath(inputPath: String)

      /**
       * @param pattern the value to be set. 
       */
      public fun pattern(pattern: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty.builder()

      /**
       * @param eventBusName the value to be set.
       */
      override fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
      }

      /**
       * @param input the value to be set.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param inputPath the value to be set.
       */
      override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      /**
       * @param pattern the value to be set. 
       */
      override fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty,
    ) : CdkObject(cdkObject), EventBridgeRuleEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html#cfn-serverless-function-eventbridgeruleevent-eventbusname)
       */
      override fun eventBusName(): String? = unwrap(this).getEventBusName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html#cfn-serverless-function-eventbridgeruleevent-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html#cfn-serverless-function-eventbridgeruleevent-inputpath)
       */
      override fun inputPath(): String? = unwrap(this).getInputPath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html#cfn-serverless-function-eventbridgeruleevent-pattern)
       */
      override fun pattern(): Any = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeRuleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty):
          EventBridgeRuleEventProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventBridgeRuleEventProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeRuleEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * EventInvokeConfigProperty eventInvokeConfigProperty = EventInvokeConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html)
   */
  public interface EventInvokeConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html#cfn-serverless-function-eventinvokeconfig-destinationconfig)
     */
    public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html#cfn-serverless-function-eventinvokeconfig-maximumeventageinseconds)
     */
    public fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html#cfn-serverless-function-eventinvokeconfig-maximumretryattempts)
     */
    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * A builder for [EventInvokeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationConfig the value to be set.
       */
      public fun destinationConfig(destinationConfig: IResolvable)

      /**
       * @param destinationConfig the value to be set.
       */
      public fun destinationConfig(destinationConfig: EventInvokeDestinationConfigProperty)

      /**
       * @param destinationConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69af1f321f9864f4c1998824f84744ef5d25848eacf880f28156352c8caffe12")
      public
          fun destinationConfig(destinationConfig: EventInvokeDestinationConfigProperty.Builder.() -> Unit)

      /**
       * @param maximumEventAgeInSeconds the value to be set.
       */
      public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number)

      /**
       * @param maximumRetryAttempts the value to be set.
       */
      public fun maximumRetryAttempts(maximumRetryAttempts: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty.builder()

      /**
       * @param destinationConfig the value to be set.
       */
      override fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param destinationConfig the value to be set.
       */
      override fun destinationConfig(destinationConfig: EventInvokeDestinationConfigProperty) {
        cdkBuilder.destinationConfig(destinationConfig.let(EventInvokeDestinationConfigProperty::unwrap))
      }

      /**
       * @param destinationConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69af1f321f9864f4c1998824f84744ef5d25848eacf880f28156352c8caffe12")
      override
          fun destinationConfig(destinationConfig: EventInvokeDestinationConfigProperty.Builder.() -> Unit):
          Unit = destinationConfig(EventInvokeDestinationConfigProperty(destinationConfig))

      /**
       * @param maximumEventAgeInSeconds the value to be set.
       */
      override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
      }

      /**
       * @param maximumRetryAttempts the value to be set.
       */
      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty,
    ) : CdkObject(cdkObject), EventInvokeConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html#cfn-serverless-function-eventinvokeconfig-destinationconfig)
       */
      override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html#cfn-serverless-function-eventinvokeconfig-maximumeventageinseconds)
       */
      override fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html#cfn-serverless-function-eventinvokeconfig-maximumretryattempts)
       */
      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventInvokeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty):
          EventInvokeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventInvokeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventInvokeConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * EventInvokeDestinationConfigProperty eventInvokeDestinationConfigProperty =
   * EventInvokeDestinationConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokedestinationconfig.html)
   */
  public interface EventInvokeDestinationConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokedestinationconfig.html#cfn-serverless-function-eventinvokedestinationconfig-onfailure)
     */
    public fun onFailure(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokedestinationconfig.html#cfn-serverless-function-eventinvokedestinationconfig-onsuccess)
     */
    public fun onSuccess(): Any

    /**
     * A builder for [EventInvokeDestinationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onFailure the value to be set. 
       */
      public fun onFailure(onFailure: IResolvable)

      /**
       * @param onFailure the value to be set. 
       */
      public fun onFailure(onFailure: DestinationProperty)

      /**
       * @param onFailure the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a9d13c329da9f88dd72665dc6318be4fedea1db0205e930e98a0c5148e68d6f")
      public fun onFailure(onFailure: DestinationProperty.Builder.() -> Unit)

      /**
       * @param onSuccess the value to be set. 
       */
      public fun onSuccess(onSuccess: IResolvable)

      /**
       * @param onSuccess the value to be set. 
       */
      public fun onSuccess(onSuccess: DestinationProperty)

      /**
       * @param onSuccess the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2bc0ff153db19c5fb4d4bbabb8ee31c99d5f4945eeecddfa3c418aabafcd5c19")
      public fun onSuccess(onSuccess: DestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty.builder()

      /**
       * @param onFailure the value to be set. 
       */
      override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable::unwrap))
      }

      /**
       * @param onFailure the value to be set. 
       */
      override fun onFailure(onFailure: DestinationProperty) {
        cdkBuilder.onFailure(onFailure.let(DestinationProperty::unwrap))
      }

      /**
       * @param onFailure the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a9d13c329da9f88dd72665dc6318be4fedea1db0205e930e98a0c5148e68d6f")
      override fun onFailure(onFailure: DestinationProperty.Builder.() -> Unit): Unit =
          onFailure(DestinationProperty(onFailure))

      /**
       * @param onSuccess the value to be set. 
       */
      override fun onSuccess(onSuccess: IResolvable) {
        cdkBuilder.onSuccess(onSuccess.let(IResolvable::unwrap))
      }

      /**
       * @param onSuccess the value to be set. 
       */
      override fun onSuccess(onSuccess: DestinationProperty) {
        cdkBuilder.onSuccess(onSuccess.let(DestinationProperty::unwrap))
      }

      /**
       * @param onSuccess the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2bc0ff153db19c5fb4d4bbabb8ee31c99d5f4945eeecddfa3c418aabafcd5c19")
      override fun onSuccess(onSuccess: DestinationProperty.Builder.() -> Unit): Unit =
          onSuccess(DestinationProperty(onSuccess))

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty,
    ) : CdkObject(cdkObject), EventInvokeDestinationConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokedestinationconfig.html#cfn-serverless-function-eventinvokedestinationconfig-onfailure)
       */
      override fun onFailure(): Any = unwrap(this).getOnFailure()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokedestinationconfig.html#cfn-serverless-function-eventinvokedestinationconfig-onsuccess)
       */
      override fun onSuccess(): Any = unwrap(this).getOnSuccess()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EventInvokeDestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty):
          EventInvokeDestinationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventInvokeDestinationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventInvokeDestinationConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * EventSourceProperty eventSourceProperty = EventSourceProperty.builder()
   * .properties(AlexaSkillEventProperty.builder()
   * .skillId("skillId")
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventsource.html)
   */
  public interface EventSourceProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventsource.html#cfn-serverless-function-eventsource-properties)
     */
    public fun properties(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventsource.html#cfn-serverless-function-eventsource-type)
     */
    public fun type(): String

    /**
     * A builder for [EventSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: AlexaSkillEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e4341459b5285be4edc292fdf5e0a9835d2bbbde1d4e6cb6c2e2c58b1da79e8")
      public fun properties(properties: AlexaSkillEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: ApiEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85197a7edf593969c1761053510c4190a15f2263ef87e60f5b7e3abe34b6e79")
      public fun properties(properties: ApiEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: CloudWatchEventEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78914787b575883a35149d4bc48479c888ac685bc7372819586ca69f5f65ef1c")
      public fun properties(properties: CloudWatchEventEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: CloudWatchLogsEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a460abbc4b08de60a9fc8f775db50083dd38c0577e5b4dc0e4eee4997d5af7a1")
      public fun properties(properties: CloudWatchLogsEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: CognitoEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d399853612ecfb2d22734b5c2ee3da39994f600a74b3cd34841ff2c72560bb9")
      public fun properties(properties: CognitoEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: DynamoDBEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea2544eb37312570c071a182ec455d362eb5ee60e3e0fcf8a974a8ccd0e4fc96")
      public fun properties(properties: DynamoDBEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: EventBridgeRuleEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd2be02483c2feb079e3dec9d5ef9ab12ec0b60f1eda4a2d19cbc34ebf0f9fd4")
      public fun properties(properties: EventBridgeRuleEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: HttpApiEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("227b555231f7875a6a5338b4730418eeaaa47ca6f8a6ab86bbd8d9e1cff39f96")
      public fun properties(properties: HttpApiEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: IoTRuleEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf0b11a26432d20648e1f20fa3d3904e695d11b89cfdf608211253a4b9e22e7f")
      public fun properties(properties: IoTRuleEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: KinesisEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("875e9cf818eb6593851d6c00e003c6ecfccb1567c7c0af0ae03b664a7c1d2d87")
      public fun properties(properties: KinesisEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: S3EventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebb29ec4b27921024830e47d56c34a44fab5136dc71469b6ed5dff61c308172c")
      public fun properties(properties: S3EventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: ScheduleEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc79f595a2d2da930c7895e7658457142118a75ea069df1b70d72bf63005a72")
      public fun properties(properties: ScheduleEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: SNSEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6289b442457421ec8d22b57ab38e25d36634a6ca1e53946463b9add9c5b7620")
      public fun properties(properties: SNSEventProperty.Builder.() -> Unit)

      /**
       * @param properties the value to be set. 
       */
      public fun properties(properties: SQSEventProperty)

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccc89d1369e3cc95f6a011c7f055135827c4fd3fdf5b6fe0f99160270fd831bc")
      public fun properties(properties: SQSEventProperty.Builder.() -> Unit)

      /**
       * @param type the value to be set. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.builder()

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: AlexaSkillEventProperty) {
        cdkBuilder.properties(properties.let(AlexaSkillEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e4341459b5285be4edc292fdf5e0a9835d2bbbde1d4e6cb6c2e2c58b1da79e8")
      override fun properties(properties: AlexaSkillEventProperty.Builder.() -> Unit): Unit =
          properties(AlexaSkillEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: ApiEventProperty) {
        cdkBuilder.properties(properties.let(ApiEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85197a7edf593969c1761053510c4190a15f2263ef87e60f5b7e3abe34b6e79")
      override fun properties(properties: ApiEventProperty.Builder.() -> Unit): Unit =
          properties(ApiEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: CloudWatchEventEventProperty) {
        cdkBuilder.properties(properties.let(CloudWatchEventEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78914787b575883a35149d4bc48479c888ac685bc7372819586ca69f5f65ef1c")
      override fun properties(properties: CloudWatchEventEventProperty.Builder.() -> Unit): Unit =
          properties(CloudWatchEventEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: CloudWatchLogsEventProperty) {
        cdkBuilder.properties(properties.let(CloudWatchLogsEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a460abbc4b08de60a9fc8f775db50083dd38c0577e5b4dc0e4eee4997d5af7a1")
      override fun properties(properties: CloudWatchLogsEventProperty.Builder.() -> Unit): Unit =
          properties(CloudWatchLogsEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: CognitoEventProperty) {
        cdkBuilder.properties(properties.let(CognitoEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d399853612ecfb2d22734b5c2ee3da39994f600a74b3cd34841ff2c72560bb9")
      override fun properties(properties: CognitoEventProperty.Builder.() -> Unit): Unit =
          properties(CognitoEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: DynamoDBEventProperty) {
        cdkBuilder.properties(properties.let(DynamoDBEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea2544eb37312570c071a182ec455d362eb5ee60e3e0fcf8a974a8ccd0e4fc96")
      override fun properties(properties: DynamoDBEventProperty.Builder.() -> Unit): Unit =
          properties(DynamoDBEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: EventBridgeRuleEventProperty) {
        cdkBuilder.properties(properties.let(EventBridgeRuleEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd2be02483c2feb079e3dec9d5ef9ab12ec0b60f1eda4a2d19cbc34ebf0f9fd4")
      override fun properties(properties: EventBridgeRuleEventProperty.Builder.() -> Unit): Unit =
          properties(EventBridgeRuleEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: HttpApiEventProperty) {
        cdkBuilder.properties(properties.let(HttpApiEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("227b555231f7875a6a5338b4730418eeaaa47ca6f8a6ab86bbd8d9e1cff39f96")
      override fun properties(properties: HttpApiEventProperty.Builder.() -> Unit): Unit =
          properties(HttpApiEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: IoTRuleEventProperty) {
        cdkBuilder.properties(properties.let(IoTRuleEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf0b11a26432d20648e1f20fa3d3904e695d11b89cfdf608211253a4b9e22e7f")
      override fun properties(properties: IoTRuleEventProperty.Builder.() -> Unit): Unit =
          properties(IoTRuleEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: KinesisEventProperty) {
        cdkBuilder.properties(properties.let(KinesisEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("875e9cf818eb6593851d6c00e003c6ecfccb1567c7c0af0ae03b664a7c1d2d87")
      override fun properties(properties: KinesisEventProperty.Builder.() -> Unit): Unit =
          properties(KinesisEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: S3EventProperty) {
        cdkBuilder.properties(properties.let(S3EventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebb29ec4b27921024830e47d56c34a44fab5136dc71469b6ed5dff61c308172c")
      override fun properties(properties: S3EventProperty.Builder.() -> Unit): Unit =
          properties(S3EventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: ScheduleEventProperty) {
        cdkBuilder.properties(properties.let(ScheduleEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc79f595a2d2da930c7895e7658457142118a75ea069df1b70d72bf63005a72")
      override fun properties(properties: ScheduleEventProperty.Builder.() -> Unit): Unit =
          properties(ScheduleEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: SNSEventProperty) {
        cdkBuilder.properties(properties.let(SNSEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6289b442457421ec8d22b57ab38e25d36634a6ca1e53946463b9add9c5b7620")
      override fun properties(properties: SNSEventProperty.Builder.() -> Unit): Unit =
          properties(SNSEventProperty(properties))

      /**
       * @param properties the value to be set. 
       */
      override fun properties(properties: SQSEventProperty) {
        cdkBuilder.properties(properties.let(SQSEventProperty::unwrap))
      }

      /**
       * @param properties the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccc89d1369e3cc95f6a011c7f055135827c4fd3fdf5b6fe0f99160270fd831bc")
      override fun properties(properties: SQSEventProperty.Builder.() -> Unit): Unit =
          properties(SQSEventProperty(properties))

      /**
       * @param type the value to be set. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty,
    ) : CdkObject(cdkObject), EventSourceProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventsource.html#cfn-serverless-function-eventsource-properties)
       */
      override fun properties(): Any = unwrap(this).getProperties()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventsource.html#cfn-serverless-function-eventsource-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty):
          EventSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? EventSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSourceProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * FileSystemConfigProperty fileSystemConfigProperty = FileSystemConfigProperty.builder()
   * .arn("arn")
   * .localMountPath("localMountPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-filesystemconfig.html)
   */
  public interface FileSystemConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-filesystemconfig.html#cfn-serverless-function-filesystemconfig-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-filesystemconfig.html#cfn-serverless-function-filesystemconfig-localmountpath)
     */
    public fun localMountPath(): String? = unwrap(this).getLocalMountPath()

    /**
     * A builder for [FileSystemConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn the value to be set.
       */
      public fun arn(arn: String)

      /**
       * @param localMountPath the value to be set.
       */
      public fun localMountPath(localMountPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty.builder()

      /**
       * @param arn the value to be set.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param localMountPath the value to be set.
       */
      override fun localMountPath(localMountPath: String) {
        cdkBuilder.localMountPath(localMountPath)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty,
    ) : CdkObject(cdkObject), FileSystemConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-filesystemconfig.html#cfn-serverless-function-filesystemconfig-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-filesystemconfig.html#cfn-serverless-function-filesystemconfig-localmountpath)
       */
      override fun localMountPath(): String? = unwrap(this).getLocalMountPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty):
          FileSystemConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? FileSystemConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * FunctionEnvironmentProperty functionEnvironmentProperty = FunctionEnvironmentProperty.builder()
   * .variables(Map.of(
   * "variablesKey", "variables"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionenvironment.html)
   */
  public interface FunctionEnvironmentProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionenvironment.html#cfn-serverless-function-functionenvironment-variables)
     */
    public fun variables(): Any

    /**
     * A builder for [FunctionEnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param variables the value to be set. 
       */
      public fun variables(variables: IResolvable)

      /**
       * @param variables the value to be set. 
       */
      public fun variables(variables: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.builder()

      /**
       * @param variables the value to be set. 
       */
      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      /**
       * @param variables the value to be set. 
       */
      override fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty,
    ) : CdkObject(cdkObject), FunctionEnvironmentProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionenvironment.html#cfn-serverless-function-functionenvironment-variables)
       */
      override fun variables(): Any = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty):
          FunctionEnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FunctionEnvironmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionEnvironmentProperty):
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * FunctionSAMPTProperty functionSAMPTProperty = FunctionSAMPTProperty.builder()
   * .functionName("functionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionsampt.html)
   */
  public interface FunctionSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionsampt.html#cfn-serverless-function-functionsampt-functionname)
     */
    public fun functionName(): String

    /**
     * A builder for [FunctionSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionName the value to be set. 
       */
      public fun functionName(functionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty.builder()

      /**
       * @param functionName the value to be set. 
       */
      override fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty,
    ) : CdkObject(cdkObject), FunctionSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionsampt.html#cfn-serverless-function-functionsampt-functionname)
       */
      override fun functionName(): String = unwrap(this).getFunctionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty):
          FunctionSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? FunctionSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * FunctionUrlConfigProperty functionUrlConfigProperty = FunctionUrlConfigProperty.builder()
   * .authType("authType")
   * // the properties below are optional
   * .cors("cors")
   * .invokeMode("invokeMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionurlconfig.html)
   */
  public interface FunctionUrlConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionurlconfig.html#cfn-serverless-function-functionurlconfig-authtype)
     */
    public fun authType(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionurlconfig.html#cfn-serverless-function-functionurlconfig-cors)
     */
    public fun cors(): Any? = unwrap(this).getCors()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionurlconfig.html#cfn-serverless-function-functionurlconfig-invokemode)
     */
    public fun invokeMode(): String? = unwrap(this).getInvokeMode()

    /**
     * A builder for [FunctionUrlConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authType the value to be set. 
       */
      public fun authType(authType: String)

      /**
       * @param cors the value to be set.
       */
      public fun cors(cors: String)

      /**
       * @param cors the value to be set.
       */
      public fun cors(cors: IResolvable)

      /**
       * @param cors the value to be set.
       */
      public fun cors(cors: CorsConfigurationProperty)

      /**
       * @param cors the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d30674ec45e53ed15b1981ab571102ac0f917e5c3cec461a38762d52f98534ca")
      public fun cors(cors: CorsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param invokeMode the value to be set.
       */
      public fun invokeMode(invokeMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty.builder()

      /**
       * @param authType the value to be set. 
       */
      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      /**
       * @param cors the value to be set.
       */
      override fun cors(cors: String) {
        cdkBuilder.cors(cors)
      }

      /**
       * @param cors the value to be set.
       */
      override fun cors(cors: IResolvable) {
        cdkBuilder.cors(cors.let(IResolvable::unwrap))
      }

      /**
       * @param cors the value to be set.
       */
      override fun cors(cors: CorsConfigurationProperty) {
        cdkBuilder.cors(cors.let(CorsConfigurationProperty::unwrap))
      }

      /**
       * @param cors the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d30674ec45e53ed15b1981ab571102ac0f917e5c3cec461a38762d52f98534ca")
      override fun cors(cors: CorsConfigurationProperty.Builder.() -> Unit): Unit =
          cors(CorsConfigurationProperty(cors))

      /**
       * @param invokeMode the value to be set.
       */
      override fun invokeMode(invokeMode: String) {
        cdkBuilder.invokeMode(invokeMode)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty,
    ) : CdkObject(cdkObject), FunctionUrlConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionurlconfig.html#cfn-serverless-function-functionurlconfig-authtype)
       */
      override fun authType(): String = unwrap(this).getAuthType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionurlconfig.html#cfn-serverless-function-functionurlconfig-cors)
       */
      override fun cors(): Any? = unwrap(this).getCors()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionurlconfig.html#cfn-serverless-function-functionurlconfig-invokemode)
       */
      override fun invokeMode(): String? = unwrap(this).getInvokeMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty):
          FunctionUrlConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FunctionUrlConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionUrlConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * HooksProperty hooksProperty = HooksProperty.builder()
   * .postTraffic("postTraffic")
   * .preTraffic("preTraffic")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-hooks.html)
   */
  public interface HooksProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-hooks.html#cfn-serverless-function-hooks-posttraffic)
     */
    public fun postTraffic(): String? = unwrap(this).getPostTraffic()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-hooks.html#cfn-serverless-function-hooks-pretraffic)
     */
    public fun preTraffic(): String? = unwrap(this).getPreTraffic()

    /**
     * A builder for [HooksProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param postTraffic the value to be set.
       */
      public fun postTraffic(postTraffic: String)

      /**
       * @param preTraffic the value to be set.
       */
      public fun preTraffic(preTraffic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.sam.CfnFunction.HooksProperty.Builder
          = software.amazon.awscdk.services.sam.CfnFunction.HooksProperty.builder()

      /**
       * @param postTraffic the value to be set.
       */
      override fun postTraffic(postTraffic: String) {
        cdkBuilder.postTraffic(postTraffic)
      }

      /**
       * @param preTraffic the value to be set.
       */
      override fun preTraffic(preTraffic: String) {
        cdkBuilder.preTraffic(preTraffic)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.HooksProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HooksProperty,
    ) : CdkObject(cdkObject), HooksProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-hooks.html#cfn-serverless-function-hooks-posttraffic)
       */
      override fun postTraffic(): String? = unwrap(this).getPostTraffic()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-hooks.html#cfn-serverless-function-hooks-pretraffic)
       */
      override fun preTraffic(): String? = unwrap(this).getPreTraffic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HooksProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HooksProperty):
          HooksProperty = CdkObjectWrappers.wrap(cdkObject) as? HooksProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HooksProperty):
          software.amazon.awscdk.services.sam.CfnFunction.HooksProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.HooksProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * HttpApiEventProperty httpApiEventProperty = HttpApiEventProperty.builder()
   * .apiId("apiId")
   * .auth(HttpApiFunctionAuthProperty.builder()
   * .authorizationScopes(List.of("authorizationScopes"))
   * .authorizer("authorizer")
   * .build())
   * .method("method")
   * .path("path")
   * .payloadFormatVersion("payloadFormatVersion")
   * .routeSettings(RouteSettingsProperty.builder()
   * .dataTraceEnabled(false)
   * .detailedMetricsEnabled(false)
   * .loggingLevel("loggingLevel")
   * .throttlingBurstLimit(123)
   * .throttlingRateLimit(123)
   * .build())
   * .timeoutInMillis(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html)
   */
  public interface HttpApiEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-apiid)
     */
    public fun apiId(): String? = unwrap(this).getApiId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-auth)
     */
    public fun auth(): Any? = unwrap(this).getAuth()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-method)
     */
    public fun method(): String? = unwrap(this).getMethod()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-payloadformatversion)
     */
    public fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-routesettings)
     */
    public fun routeSettings(): Any? = unwrap(this).getRouteSettings()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-timeoutinmillis)
     */
    public fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

    /**
     * A builder for [HttpApiEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiId the value to be set.
       */
      public fun apiId(apiId: String)

      /**
       * @param auth the value to be set.
       */
      public fun auth(auth: IResolvable)

      /**
       * @param auth the value to be set.
       */
      public fun auth(auth: HttpApiFunctionAuthProperty)

      /**
       * @param auth the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7880c1c59451ea9b0cf00daab4573f9bbadaadcde367c1eb49eda06887c992bf")
      public fun auth(auth: HttpApiFunctionAuthProperty.Builder.() -> Unit)

      /**
       * @param method the value to be set.
       */
      public fun method(method: String)

      /**
       * @param path the value to be set.
       */
      public fun path(path: String)

      /**
       * @param payloadFormatVersion the value to be set.
       */
      public fun payloadFormatVersion(payloadFormatVersion: String)

      /**
       * @param routeSettings the value to be set.
       */
      public fun routeSettings(routeSettings: IResolvable)

      /**
       * @param routeSettings the value to be set.
       */
      public fun routeSettings(routeSettings: RouteSettingsProperty)

      /**
       * @param routeSettings the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c12331917e0d3c3c11aaf58c0847e612ed26fe70577b1af8ec4cb4117f4ea95")
      public fun routeSettings(routeSettings: RouteSettingsProperty.Builder.() -> Unit)

      /**
       * @param timeoutInMillis the value to be set.
       */
      public fun timeoutInMillis(timeoutInMillis: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty.builder()

      /**
       * @param apiId the value to be set.
       */
      override fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
      }

      /**
       * @param auth the value to be set.
       */
      override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      /**
       * @param auth the value to be set.
       */
      override fun auth(auth: HttpApiFunctionAuthProperty) {
        cdkBuilder.auth(auth.let(HttpApiFunctionAuthProperty::unwrap))
      }

      /**
       * @param auth the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7880c1c59451ea9b0cf00daab4573f9bbadaadcde367c1eb49eda06887c992bf")
      override fun auth(auth: HttpApiFunctionAuthProperty.Builder.() -> Unit): Unit =
          auth(HttpApiFunctionAuthProperty(auth))

      /**
       * @param method the value to be set.
       */
      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      /**
       * @param path the value to be set.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param payloadFormatVersion the value to be set.
       */
      override fun payloadFormatVersion(payloadFormatVersion: String) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
      }

      /**
       * @param routeSettings the value to be set.
       */
      override fun routeSettings(routeSettings: IResolvable) {
        cdkBuilder.routeSettings(routeSettings.let(IResolvable::unwrap))
      }

      /**
       * @param routeSettings the value to be set.
       */
      override fun routeSettings(routeSettings: RouteSettingsProperty) {
        cdkBuilder.routeSettings(routeSettings.let(RouteSettingsProperty::unwrap))
      }

      /**
       * @param routeSettings the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c12331917e0d3c3c11aaf58c0847e612ed26fe70577b1af8ec4cb4117f4ea95")
      override fun routeSettings(routeSettings: RouteSettingsProperty.Builder.() -> Unit): Unit =
          routeSettings(RouteSettingsProperty(routeSettings))

      /**
       * @param timeoutInMillis the value to be set.
       */
      override fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty,
    ) : CdkObject(cdkObject), HttpApiEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-apiid)
       */
      override fun apiId(): String? = unwrap(this).getApiId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-auth)
       */
      override fun auth(): Any? = unwrap(this).getAuth()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-method)
       */
      override fun method(): String? = unwrap(this).getMethod()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-payloadformatversion)
       */
      override fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-routesettings)
       */
      override fun routeSettings(): Any? = unwrap(this).getRouteSettings()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html#cfn-serverless-function-httpapievent-timeoutinmillis)
       */
      override fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty):
          HttpApiEventProperty = CdkObjectWrappers.wrap(cdkObject) as? HttpApiEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpApiEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * HttpApiFunctionAuthProperty httpApiFunctionAuthProperty = HttpApiFunctionAuthProperty.builder()
   * .authorizationScopes(List.of("authorizationScopes"))
   * .authorizer("authorizer")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapifunctionauth.html)
   */
  public interface HttpApiFunctionAuthProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapifunctionauth.html#cfn-serverless-function-httpapifunctionauth-authorizationscopes)
     */
    public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapifunctionauth.html#cfn-serverless-function-httpapifunctionauth-authorizer)
     */
    public fun authorizer(): String? = unwrap(this).getAuthorizer()

    /**
     * A builder for [HttpApiFunctionAuthProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationScopes the value to be set.
       */
      public fun authorizationScopes(authorizationScopes: List<String>)

      /**
       * @param authorizationScopes the value to be set.
       */
      public fun authorizationScopes(vararg authorizationScopes: String)

      /**
       * @param authorizer the value to be set.
       */
      public fun authorizer(authorizer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty.builder()

      /**
       * @param authorizationScopes the value to be set.
       */
      override fun authorizationScopes(authorizationScopes: List<String>) {
        cdkBuilder.authorizationScopes(authorizationScopes)
      }

      /**
       * @param authorizationScopes the value to be set.
       */
      override fun authorizationScopes(vararg authorizationScopes: String): Unit =
          authorizationScopes(authorizationScopes.toList())

      /**
       * @param authorizer the value to be set.
       */
      override fun authorizer(authorizer: String) {
        cdkBuilder.authorizer(authorizer)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty,
    ) : CdkObject(cdkObject), HttpApiFunctionAuthProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapifunctionauth.html#cfn-serverless-function-httpapifunctionauth-authorizationscopes)
       */
      override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
          emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapifunctionauth.html#cfn-serverless-function-httpapifunctionauth-authorizer)
       */
      override fun authorizer(): String? = unwrap(this).getAuthorizer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiFunctionAuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty):
          HttpApiFunctionAuthProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpApiFunctionAuthProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpApiFunctionAuthProperty):
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object statement;
   * IAMPolicyDocumentProperty iAMPolicyDocumentProperty = Map.of(
   * "statement", statement,
   * // the properties below are optional
   * "version", "version");
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iampolicydocument.html)
   */
  public interface IAMPolicyDocumentProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iampolicydocument.html#cfn-serverless-function-iampolicydocument-statement)
     */
    public fun statement(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iampolicydocument.html#cfn-serverless-function-iampolicydocument-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [IAMPolicyDocumentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statement the value to be set. 
       */
      public fun statement(statement: Any)

      /**
       * @param version the value to be set.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty.builder()

      /**
       * @param statement the value to be set. 
       */
      override fun statement(statement: Any) {
        cdkBuilder.statement(statement)
      }

      /**
       * @param version the value to be set.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty,
    ) : CdkObject(cdkObject), IAMPolicyDocumentProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iampolicydocument.html#cfn-serverless-function-iampolicydocument-statement)
       */
      override fun statement(): Any = unwrap(this).getStatement()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iampolicydocument.html#cfn-serverless-function-iampolicydocument-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IAMPolicyDocumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty):
          IAMPolicyDocumentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IAMPolicyDocumentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IAMPolicyDocumentProperty):
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * IdentitySAMPTProperty identitySAMPTProperty = IdentitySAMPTProperty.builder()
   * .identityName("identityName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-identitysampt.html)
   */
  public interface IdentitySAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-identitysampt.html#cfn-serverless-function-identitysampt-identityname)
     */
    public fun identityName(): String

    /**
     * A builder for [IdentitySAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param identityName the value to be set. 
       */
      public fun identityName(identityName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty.builder()

      /**
       * @param identityName the value to be set. 
       */
      override fun identityName(identityName: String) {
        cdkBuilder.identityName(identityName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty,
    ) : CdkObject(cdkObject), IdentitySAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-identitysampt.html#cfn-serverless-function-identitysampt-identityname)
       */
      override fun identityName(): String = unwrap(this).getIdentityName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdentitySAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty):
          IdentitySAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? IdentitySAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentitySAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * ImageConfigProperty imageConfigProperty = ImageConfigProperty.builder()
   * .command(List.of("command"))
   * .entryPoint(List.of("entryPoint"))
   * .workingDirectory("workingDirectory")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html)
   */
  public interface ImageConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html#cfn-serverless-function-imageconfig-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html#cfn-serverless-function-imageconfig-entrypoint)
     */
    public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html#cfn-serverless-function-imageconfig-workingdirectory)
     */
    public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

    /**
     * A builder for [ImageConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command the value to be set.
       */
      public fun command(command: List<String>)

      /**
       * @param command the value to be set.
       */
      public fun command(vararg command: String)

      /**
       * @param entryPoint the value to be set.
       */
      public fun entryPoint(entryPoint: List<String>)

      /**
       * @param entryPoint the value to be set.
       */
      public fun entryPoint(vararg entryPoint: String)

      /**
       * @param workingDirectory the value to be set.
       */
      public fun workingDirectory(workingDirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty.builder()

      /**
       * @param command the value to be set.
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command the value to be set.
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param entryPoint the value to be set.
       */
      override fun entryPoint(entryPoint: List<String>) {
        cdkBuilder.entryPoint(entryPoint)
      }

      /**
       * @param entryPoint the value to be set.
       */
      override fun entryPoint(vararg entryPoint: String): Unit = entryPoint(entryPoint.toList())

      /**
       * @param workingDirectory the value to be set.
       */
      override fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty,
    ) : CdkObject(cdkObject), ImageConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html#cfn-serverless-function-imageconfig-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html#cfn-serverless-function-imageconfig-entrypoint)
       */
      override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html#cfn-serverless-function-imageconfig-workingdirectory)
       */
      override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty):
          ImageConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ImageConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * IoTRuleEventProperty ioTRuleEventProperty = IoTRuleEventProperty.builder()
   * .sql("sql")
   * // the properties below are optional
   * .awsIotSqlVersion("awsIotSqlVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iotruleevent.html)
   */
  public interface IoTRuleEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iotruleevent.html#cfn-serverless-function-iotruleevent-awsiotsqlversion)
     */
    public fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iotruleevent.html#cfn-serverless-function-iotruleevent-sql)
     */
    public fun sql(): String

    /**
     * A builder for [IoTRuleEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsIotSqlVersion the value to be set.
       */
      public fun awsIotSqlVersion(awsIotSqlVersion: String)

      /**
       * @param sql the value to be set. 
       */
      public fun sql(sql: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.builder()

      /**
       * @param awsIotSqlVersion the value to be set.
       */
      override fun awsIotSqlVersion(awsIotSqlVersion: String) {
        cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
      }

      /**
       * @param sql the value to be set. 
       */
      override fun sql(sql: String) {
        cdkBuilder.sql(sql)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty,
    ) : CdkObject(cdkObject), IoTRuleEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iotruleevent.html#cfn-serverless-function-iotruleevent-awsiotsqlversion)
       */
      override fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iotruleevent.html#cfn-serverless-function-iotruleevent-sql)
       */
      override fun sql(): String = unwrap(this).getSql()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IoTRuleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty):
          IoTRuleEventProperty = CdkObjectWrappers.wrap(cdkObject) as? IoTRuleEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTRuleEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * KeySAMPTProperty keySAMPTProperty = KeySAMPTProperty.builder()
   * .keyId("keyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-keysampt.html)
   */
  public interface KeySAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-keysampt.html#cfn-serverless-function-keysampt-keyid)
     */
    public fun keyId(): String

    /**
     * A builder for [KeySAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyId the value to be set. 
       */
      public fun keyId(keyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty.builder()

      /**
       * @param keyId the value to be set. 
       */
      override fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty,
    ) : CdkObject(cdkObject), KeySAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-keysampt.html#cfn-serverless-function-keysampt-keyid)
       */
      override fun keyId(): String = unwrap(this).getKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeySAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty):
          KeySAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? KeySAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeySAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * KinesisEventProperty kinesisEventProperty = KinesisEventProperty.builder()
   * .startingPosition("startingPosition")
   * .stream("stream")
   * // the properties below are optional
   * .batchSize(123)
   * .enabled(false)
   * .functionResponseTypes(List.of("functionResponseTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html)
   */
  public interface KinesisEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-functionresponsetypes)
     */
    public fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-startingposition)
     */
    public fun startingPosition(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-stream)
     */
    public fun stream(): String

    /**
     * A builder for [KinesisEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize the value to be set.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param functionResponseTypes the value to be set.
       */
      public fun functionResponseTypes(functionResponseTypes: List<String>)

      /**
       * @param functionResponseTypes the value to be set.
       */
      public fun functionResponseTypes(vararg functionResponseTypes: String)

      /**
       * @param startingPosition the value to be set. 
       */
      public fun startingPosition(startingPosition: String)

      /**
       * @param stream the value to be set. 
       */
      public fun stream(stream: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.builder()

      /**
       * @param batchSize the value to be set.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param functionResponseTypes the value to be set.
       */
      override fun functionResponseTypes(functionResponseTypes: List<String>) {
        cdkBuilder.functionResponseTypes(functionResponseTypes)
      }

      /**
       * @param functionResponseTypes the value to be set.
       */
      override fun functionResponseTypes(vararg functionResponseTypes: String): Unit =
          functionResponseTypes(functionResponseTypes.toList())

      /**
       * @param startingPosition the value to be set. 
       */
      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      /**
       * @param stream the value to be set. 
       */
      override fun stream(stream: String) {
        cdkBuilder.stream(stream)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty,
    ) : CdkObject(cdkObject), KinesisEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-functionresponsetypes)
       */
      override fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes()
          ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-startingposition)
       */
      override fun startingPosition(): String = unwrap(this).getStartingPosition()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html#cfn-serverless-function-kinesisevent-stream)
       */
      override fun stream(): String = unwrap(this).getStream()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty):
          KinesisEventProperty = CdkObjectWrappers.wrap(cdkObject) as? KinesisEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * LogGroupSAMPTProperty logGroupSAMPTProperty = LogGroupSAMPTProperty.builder()
   * .logGroupName("logGroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-loggroupsampt.html)
   */
  public interface LogGroupSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-loggroupsampt.html#cfn-serverless-function-loggroupsampt-loggroupname)
     */
    public fun logGroupName(): String

    /**
     * A builder for [LogGroupSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupName the value to be set. 
       */
      public fun logGroupName(logGroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty.builder()

      /**
       * @param logGroupName the value to be set. 
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty,
    ) : CdkObject(cdkObject), LogGroupSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-loggroupsampt.html#cfn-serverless-function-loggroupsampt-loggroupname)
       */
      override fun logGroupName(): String = unwrap(this).getLogGroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogGroupSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty):
          LogGroupSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? LogGroupSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogGroupSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * ParameterNameSAMPTProperty parameterNameSAMPTProperty = ParameterNameSAMPTProperty.builder()
   * .parameterName("parameterName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-parameternamesampt.html)
   */
  public interface ParameterNameSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-parameternamesampt.html#cfn-serverless-function-parameternamesampt-parametername)
     */
    public fun parameterName(): String

    /**
     * A builder for [ParameterNameSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterName the value to be set. 
       */
      public fun parameterName(parameterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty.builder()

      /**
       * @param parameterName the value to be set. 
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty,
    ) : CdkObject(cdkObject), ParameterNameSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-parameternamesampt.html#cfn-serverless-function-parameternamesampt-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterNameSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty):
          ParameterNameSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ParameterNameSAMPTProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterNameSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * ProvisionedConcurrencyConfigProperty provisionedConcurrencyConfigProperty =
   * ProvisionedConcurrencyConfigProperty.builder()
   * .provisionedConcurrentExecutions("provisionedConcurrentExecutions")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-provisionedconcurrencyconfig.html)
   */
  public interface ProvisionedConcurrencyConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-provisionedconcurrencyconfig.html#cfn-serverless-function-provisionedconcurrencyconfig-provisionedconcurrentexecutions)
     */
    public fun provisionedConcurrentExecutions(): String

    /**
     * A builder for [ProvisionedConcurrencyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisionedConcurrentExecutions the value to be set. 
       */
      public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty.Builder
          =
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty.builder()

      /**
       * @param provisionedConcurrentExecutions the value to be set. 
       */
      override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: String) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty,
    ) : CdkObject(cdkObject), ProvisionedConcurrencyConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-provisionedconcurrencyconfig.html#cfn-serverless-function-provisionedconcurrencyconfig-provisionedconcurrentexecutions)
       */
      override fun provisionedConcurrentExecutions(): String =
          unwrap(this).getProvisionedConcurrentExecutions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisionedConcurrencyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty):
          ProvisionedConcurrencyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisionedConcurrencyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedConcurrencyConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * QueueSAMPTProperty queueSAMPTProperty = QueueSAMPTProperty.builder()
   * .queueName("queueName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-queuesampt.html)
   */
  public interface QueueSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-queuesampt.html#cfn-serverless-function-queuesampt-queuename)
     */
    public fun queueName(): String

    /**
     * A builder for [QueueSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queueName the value to be set. 
       */
      public fun queueName(queueName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty.builder()

      /**
       * @param queueName the value to be set. 
       */
      override fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty,
    ) : CdkObject(cdkObject), QueueSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-queuesampt.html#cfn-serverless-function-queuesampt-queuename)
       */
      override fun queueName(): String = unwrap(this).getQueueName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueueSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty):
          QueueSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? QueueSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueueSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * RequestModelProperty requestModelProperty = RequestModelProperty.builder()
   * .model("model")
   * // the properties below are optional
   * .required(false)
   * .validateBody(false)
   * .validateParameters(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html)
   */
  public interface RequestModelProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html#cfn-serverless-function-requestmodel-model)
     */
    public fun model(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html#cfn-serverless-function-requestmodel-required)
     */
    public fun required(): Any? = unwrap(this).getRequired()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html#cfn-serverless-function-requestmodel-validatebody)
     */
    public fun validateBody(): Any? = unwrap(this).getValidateBody()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html#cfn-serverless-function-requestmodel-validateparameters)
     */
    public fun validateParameters(): Any? = unwrap(this).getValidateParameters()

    /**
     * A builder for [RequestModelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param model the value to be set. 
       */
      public fun model(model: String)

      /**
       * @param required the value to be set.
       */
      public fun required(required: Boolean)

      /**
       * @param required the value to be set.
       */
      public fun required(required: IResolvable)

      /**
       * @param validateBody the value to be set.
       */
      public fun validateBody(validateBody: Boolean)

      /**
       * @param validateBody the value to be set.
       */
      public fun validateBody(validateBody: IResolvable)

      /**
       * @param validateParameters the value to be set.
       */
      public fun validateParameters(validateParameters: Boolean)

      /**
       * @param validateParameters the value to be set.
       */
      public fun validateParameters(validateParameters: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty.builder()

      /**
       * @param model the value to be set. 
       */
      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      /**
       * @param required the value to be set.
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required the value to be set.
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      /**
       * @param validateBody the value to be set.
       */
      override fun validateBody(validateBody: Boolean) {
        cdkBuilder.validateBody(validateBody)
      }

      /**
       * @param validateBody the value to be set.
       */
      override fun validateBody(validateBody: IResolvable) {
        cdkBuilder.validateBody(validateBody.let(IResolvable::unwrap))
      }

      /**
       * @param validateParameters the value to be set.
       */
      override fun validateParameters(validateParameters: Boolean) {
        cdkBuilder.validateParameters(validateParameters)
      }

      /**
       * @param validateParameters the value to be set.
       */
      override fun validateParameters(validateParameters: IResolvable) {
        cdkBuilder.validateParameters(validateParameters.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty,
    ) : CdkObject(cdkObject), RequestModelProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html#cfn-serverless-function-requestmodel-model)
       */
      override fun model(): String = unwrap(this).getModel()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html#cfn-serverless-function-requestmodel-required)
       */
      override fun required(): Any? = unwrap(this).getRequired()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html#cfn-serverless-function-requestmodel-validatebody)
       */
      override fun validateBody(): Any? = unwrap(this).getValidateBody()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html#cfn-serverless-function-requestmodel-validateparameters)
       */
      override fun validateParameters(): Any? = unwrap(this).getValidateParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RequestModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty):
          RequestModelProperty = CdkObjectWrappers.wrap(cdkObject) as? RequestModelProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestModelProperty):
          software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * RequestParameterProperty requestParameterProperty = RequestParameterProperty.builder()
   * .caching(false)
   * .required(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestparameter.html)
   */
  public interface RequestParameterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestparameter.html#cfn-serverless-function-requestparameter-caching)
     */
    public fun caching(): Any? = unwrap(this).getCaching()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestparameter.html#cfn-serverless-function-requestparameter-required)
     */
    public fun required(): Any? = unwrap(this).getRequired()

    /**
     * A builder for [RequestParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param caching the value to be set.
       */
      public fun caching(caching: Boolean)

      /**
       * @param caching the value to be set.
       */
      public fun caching(caching: IResolvable)

      /**
       * @param required the value to be set.
       */
      public fun required(required: Boolean)

      /**
       * @param required the value to be set.
       */
      public fun required(required: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty.builder()

      /**
       * @param caching the value to be set.
       */
      override fun caching(caching: Boolean) {
        cdkBuilder.caching(caching)
      }

      /**
       * @param caching the value to be set.
       */
      override fun caching(caching: IResolvable) {
        cdkBuilder.caching(caching.let(IResolvable::unwrap))
      }

      /**
       * @param required the value to be set.
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required the value to be set.
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty,
    ) : CdkObject(cdkObject), RequestParameterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestparameter.html#cfn-serverless-function-requestparameter-caching)
       */
      override fun caching(): Any? = unwrap(this).getCaching()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestparameter.html#cfn-serverless-function-requestparameter-required)
       */
      override fun required(): Any? = unwrap(this).getRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RequestParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty):
          RequestParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? RequestParameterProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestParameterProperty):
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
   * .dataTraceEnabled(false)
   * .detailedMetricsEnabled(false)
   * .loggingLevel("loggingLevel")
   * .throttlingBurstLimit(123)
   * .throttlingRateLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html)
   */
  public interface RouteSettingsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-datatraceenabled)
     */
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-detailedmetricsenabled)
     */
    public fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-logginglevel)
     */
    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-throttlingburstlimit)
     */
    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-throttlingratelimit)
     */
    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    /**
     * A builder for [RouteSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataTraceEnabled the value to be set.
       */
      public fun dataTraceEnabled(dataTraceEnabled: Boolean)

      /**
       * @param dataTraceEnabled the value to be set.
       */
      public fun dataTraceEnabled(dataTraceEnabled: IResolvable)

      /**
       * @param detailedMetricsEnabled the value to be set.
       */
      public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean)

      /**
       * @param detailedMetricsEnabled the value to be set.
       */
      public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable)

      /**
       * @param loggingLevel the value to be set.
       */
      public fun loggingLevel(loggingLevel: String)

      /**
       * @param throttlingBurstLimit the value to be set.
       */
      public fun throttlingBurstLimit(throttlingBurstLimit: Number)

      /**
       * @param throttlingRateLimit the value to be set.
       */
      public fun throttlingRateLimit(throttlingRateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty.builder()

      /**
       * @param dataTraceEnabled the value to be set.
       */
      override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      /**
       * @param dataTraceEnabled the value to be set.
       */
      override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param detailedMetricsEnabled the value to be set.
       */
      override fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
      }

      /**
       * @param detailedMetricsEnabled the value to be set.
       */
      override fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param loggingLevel the value to be set.
       */
      override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      /**
       * @param throttlingBurstLimit the value to be set.
       */
      override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      /**
       * @param throttlingRateLimit the value to be set.
       */
      override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty,
    ) : CdkObject(cdkObject), RouteSettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-datatraceenabled)
       */
      override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-detailedmetricsenabled)
       */
      override fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-logginglevel)
       */
      override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-throttlingburstlimit)
       */
      override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html#cfn-serverless-function-routesettings-throttlingratelimit)
       */
      override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RouteSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty):
          RouteSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? RouteSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSettingsProperty):
          software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * S3EventProperty s3EventProperty = S3EventProperty.builder()
   * .bucket("bucket")
   * .events("events")
   * // the properties below are optional
   * .filter(S3NotificationFilterProperty.builder()
   * .s3Key(S3KeyFilterProperty.builder()
   * .rules(List.of(S3KeyFilterRuleProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html)
   */
  public interface S3EventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html#cfn-serverless-function-s3event-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html#cfn-serverless-function-s3event-events)
     */
    public fun events(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html#cfn-serverless-function-s3event-filter)
     */
    public fun filter(): Any? = unwrap(this).getFilter()

    /**
     * A builder for [S3EventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket the value to be set. 
       */
      public fun bucket(bucket: String)

      /**
       * @param events the value to be set. 
       */
      public fun events(events: String)

      /**
       * @param filter the value to be set.
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter the value to be set.
       */
      public fun filter(filter: S3NotificationFilterProperty)

      /**
       * @param filter the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("316f1c535f3337dcd9b307d8d134a3cd7e3727f8d5e1766c5a9a619ef796156d")
      public fun filter(filter: S3NotificationFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.builder()

      /**
       * @param bucket the value to be set. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param events the value to be set. 
       */
      override fun events(events: String) {
        cdkBuilder.events(events)
      }

      /**
       * @param filter the value to be set.
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      /**
       * @param filter the value to be set.
       */
      override fun filter(filter: S3NotificationFilterProperty) {
        cdkBuilder.filter(filter.let(S3NotificationFilterProperty::unwrap))
      }

      /**
       * @param filter the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("316f1c535f3337dcd9b307d8d134a3cd7e3727f8d5e1766c5a9a619ef796156d")
      override fun filter(filter: S3NotificationFilterProperty.Builder.() -> Unit): Unit =
          filter(S3NotificationFilterProperty(filter))

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty,
    ) : CdkObject(cdkObject), S3EventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html#cfn-serverless-function-s3event-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html#cfn-serverless-function-s3event-events)
       */
      override fun events(): String = unwrap(this).getEvents()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html#cfn-serverless-function-s3event-filter)
       */
      override fun filter(): Any? = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3EventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty):
          S3EventProperty = CdkObjectWrappers.wrap(cdkObject) as? S3EventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3EventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * S3KeyFilterProperty s3KeyFilterProperty = S3KeyFilterProperty.builder()
   * .rules(List.of(S3KeyFilterRuleProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilter.html)
   */
  public interface S3KeyFilterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilter.html#cfn-serverless-function-s3keyfilter-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [S3KeyFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rules the value to be set. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules the value to be set. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules the value to be set. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty.builder()

      /**
       * @param rules the value to be set. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules the value to be set. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules the value to be set. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty,
    ) : CdkObject(cdkObject), S3KeyFilterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilter.html#cfn-serverless-function-s3keyfilter-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3KeyFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty):
          S3KeyFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? S3KeyFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3KeyFilterProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * S3KeyFilterRuleProperty s3KeyFilterRuleProperty = S3KeyFilterRuleProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilterrule.html)
   */
  public interface S3KeyFilterRuleProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilterrule.html#cfn-serverless-function-s3keyfilterrule-name)
     */
    public fun name(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilterrule.html#cfn-serverless-function-s3keyfilterrule-value)
     */
    public fun `value`(): String

    /**
     * A builder for [S3KeyFilterRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set. 
       */
      public fun name(name: String)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty.builder()

      /**
       * @param name the value to be set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty,
    ) : CdkObject(cdkObject), S3KeyFilterRuleProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilterrule.html#cfn-serverless-function-s3keyfilterrule-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilterrule.html#cfn-serverless-function-s3keyfilterrule-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3KeyFilterRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty):
          S3KeyFilterRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? S3KeyFilterRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3KeyFilterRuleProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3location.html#cfn-serverless-function-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3location.html#cfn-serverless-function-s3location-key)
     */
    public fun key(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3location.html#cfn-serverless-function-s3location-version)
     */
    public fun version(): Number? = unwrap(this).getVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket the value to be set. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key the value to be set. 
       */
      public fun key(key: String)

      /**
       * @param version the value to be set.
       */
      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.builder()

      /**
       * @param bucket the value to be set. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key the value to be set. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version the value to be set.
       */
      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3location.html#cfn-serverless-function-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3location.html#cfn-serverless-function-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3location.html#cfn-serverless-function-s3location-version)
       */
      override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * S3NotificationFilterProperty s3NotificationFilterProperty =
   * S3NotificationFilterProperty.builder()
   * .s3Key(S3KeyFilterProperty.builder()
   * .rules(List.of(S3KeyFilterRuleProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3notificationfilter.html)
   */
  public interface S3NotificationFilterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3notificationfilter.html#cfn-serverless-function-s3notificationfilter-s3key)
     */
    public fun s3Key(): Any

    /**
     * A builder for [S3NotificationFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Key the value to be set. 
       */
      public fun s3Key(s3Key: IResolvable)

      /**
       * @param s3Key the value to be set. 
       */
      public fun s3Key(s3Key: S3KeyFilterProperty)

      /**
       * @param s3Key the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83604b89d8c3db43eebe5c4bdaca486d63b7df57626bba66afb71001f4505f66")
      public fun s3Key(s3Key: S3KeyFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.builder()

      /**
       * @param s3Key the value to be set. 
       */
      override fun s3Key(s3Key: IResolvable) {
        cdkBuilder.s3Key(s3Key.let(IResolvable::unwrap))
      }

      /**
       * @param s3Key the value to be set. 
       */
      override fun s3Key(s3Key: S3KeyFilterProperty) {
        cdkBuilder.s3Key(s3Key.let(S3KeyFilterProperty::unwrap))
      }

      /**
       * @param s3Key the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83604b89d8c3db43eebe5c4bdaca486d63b7df57626bba66afb71001f4505f66")
      override fun s3Key(s3Key: S3KeyFilterProperty.Builder.() -> Unit): Unit =
          s3Key(S3KeyFilterProperty(s3Key))

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty,
    ) : CdkObject(cdkObject), S3NotificationFilterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3notificationfilter.html#cfn-serverless-function-s3notificationfilter-s3key)
       */
      override fun s3Key(): Any = unwrap(this).getS3Key()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3NotificationFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty):
          S3NotificationFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3NotificationFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3NotificationFilterProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * SAMPolicyTemplateProperty sAMPolicyTemplateProperty = SAMPolicyTemplateProperty.builder()
   * .amiDescribePolicy(EmptySAMPTProperty.builder().build())
   * .awsSecretsManagerGetSecretValuePolicy(SecretArnSAMPTProperty.builder()
   * .secretArn("secretArn")
   * .build())
   * .cloudFormationDescribeStacksPolicy(EmptySAMPTProperty.builder().build())
   * .cloudWatchPutMetricPolicy(EmptySAMPTProperty.builder().build())
   * .dynamoDbCrudPolicy(TableSAMPTProperty.builder()
   * .tableName("tableName")
   * .build())
   * .dynamoDbReadPolicy(TableSAMPTProperty.builder()
   * .tableName("tableName")
   * .build())
   * .dynamoDbStreamReadPolicy(TableStreamSAMPTProperty.builder()
   * .streamName("streamName")
   * .tableName("tableName")
   * .build())
   * .dynamoDbWritePolicy(TableSAMPTProperty.builder()
   * .tableName("tableName")
   * .build())
   * .ec2DescribePolicy(EmptySAMPTProperty.builder().build())
   * .elasticsearchHttpPostPolicy(DomainSAMPTProperty.builder()
   * .domainName("domainName")
   * .build())
   * .filterLogEventsPolicy(LogGroupSAMPTProperty.builder()
   * .logGroupName("logGroupName")
   * .build())
   * .kinesisCrudPolicy(StreamSAMPTProperty.builder()
   * .streamName("streamName")
   * .build())
   * .kinesisStreamReadPolicy(StreamSAMPTProperty.builder()
   * .streamName("streamName")
   * .build())
   * .kmsDecryptPolicy(KeySAMPTProperty.builder()
   * .keyId("keyId")
   * .build())
   * .lambdaInvokePolicy(FunctionSAMPTProperty.builder()
   * .functionName("functionName")
   * .build())
   * .rekognitionDetectOnlyPolicy(EmptySAMPTProperty.builder().build())
   * .rekognitionLabelsPolicy(EmptySAMPTProperty.builder().build())
   * .rekognitionNoDataAccessPolicy(CollectionSAMPTProperty.builder()
   * .collectionId("collectionId")
   * .build())
   * .rekognitionReadPolicy(CollectionSAMPTProperty.builder()
   * .collectionId("collectionId")
   * .build())
   * .rekognitionWriteOnlyAccessPolicy(CollectionSAMPTProperty.builder()
   * .collectionId("collectionId")
   * .build())
   * .s3CrudPolicy(BucketSAMPTProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .s3ReadPolicy(BucketSAMPTProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .s3WritePolicy(BucketSAMPTProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .sesBulkTemplatedCrudPolicy(IdentitySAMPTProperty.builder()
   * .identityName("identityName")
   * .build())
   * .sesCrudPolicy(IdentitySAMPTProperty.builder()
   * .identityName("identityName")
   * .build())
   * .sesEmailTemplateCrudPolicy(EmptySAMPTProperty.builder().build())
   * .sesSendBouncePolicy(IdentitySAMPTProperty.builder()
   * .identityName("identityName")
   * .build())
   * .snsCrudPolicy(TopicSAMPTProperty.builder()
   * .topicName("topicName")
   * .build())
   * .snsPublishMessagePolicy(TopicSAMPTProperty.builder()
   * .topicName("topicName")
   * .build())
   * .sqsPollerPolicy(QueueSAMPTProperty.builder()
   * .queueName("queueName")
   * .build())
   * .sqsSendMessagePolicy(QueueSAMPTProperty.builder()
   * .queueName("queueName")
   * .build())
   * .ssmParameterReadPolicy(ParameterNameSAMPTProperty.builder()
   * .parameterName("parameterName")
   * .build())
   * .stepFunctionsExecutionPolicy(StateMachineSAMPTProperty.builder()
   * .stateMachineName("stateMachineName")
   * .build())
   * .vpcAccessPolicy(EmptySAMPTProperty.builder().build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html)
   */
  public interface SAMPolicyTemplateProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-amidescribepolicy)
     */
    public fun amiDescribePolicy(): Any? = unwrap(this).getAmiDescribePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-awssecretsmanagergetsecretvaluepolicy)
     */
    public fun awsSecretsManagerGetSecretValuePolicy(): Any? =
        unwrap(this).getAwsSecretsManagerGetSecretValuePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-cloudformationdescribestackspolicy)
     */
    public fun cloudFormationDescribeStacksPolicy(): Any? =
        unwrap(this).getCloudFormationDescribeStacksPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-cloudwatchputmetricpolicy)
     */
    public fun cloudWatchPutMetricPolicy(): Any? = unwrap(this).getCloudWatchPutMetricPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-dynamodbcrudpolicy)
     */
    public fun dynamoDbCrudPolicy(): Any? = unwrap(this).getDynamoDbCrudPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-dynamodbreadpolicy)
     */
    public fun dynamoDbReadPolicy(): Any? = unwrap(this).getDynamoDbReadPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-dynamodbstreamreadpolicy)
     */
    public fun dynamoDbStreamReadPolicy(): Any? = unwrap(this).getDynamoDbStreamReadPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-dynamodbwritepolicy)
     */
    public fun dynamoDbWritePolicy(): Any? = unwrap(this).getDynamoDbWritePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-ec2describepolicy)
     */
    public fun ec2DescribePolicy(): Any? = unwrap(this).getEc2DescribePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-elasticsearchhttppostpolicy)
     */
    public fun elasticsearchHttpPostPolicy(): Any? = unwrap(this).getElasticsearchHttpPostPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-filterlogeventspolicy)
     */
    public fun filterLogEventsPolicy(): Any? = unwrap(this).getFilterLogEventsPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-kinesiscrudpolicy)
     */
    public fun kinesisCrudPolicy(): Any? = unwrap(this).getKinesisCrudPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-kinesisstreamreadpolicy)
     */
    public fun kinesisStreamReadPolicy(): Any? = unwrap(this).getKinesisStreamReadPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-kmsdecryptpolicy)
     */
    public fun kmsDecryptPolicy(): Any? = unwrap(this).getKmsDecryptPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-lambdainvokepolicy)
     */
    public fun lambdaInvokePolicy(): Any? = unwrap(this).getLambdaInvokePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitiondetectonlypolicy)
     */
    public fun rekognitionDetectOnlyPolicy(): Any? = unwrap(this).getRekognitionDetectOnlyPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitionlabelspolicy)
     */
    public fun rekognitionLabelsPolicy(): Any? = unwrap(this).getRekognitionLabelsPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitionnodataaccesspolicy)
     */
    public fun rekognitionNoDataAccessPolicy(): Any? =
        unwrap(this).getRekognitionNoDataAccessPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitionreadpolicy)
     */
    public fun rekognitionReadPolicy(): Any? = unwrap(this).getRekognitionReadPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitionwriteonlyaccesspolicy)
     */
    public fun rekognitionWriteOnlyAccessPolicy(): Any? =
        unwrap(this).getRekognitionWriteOnlyAccessPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-s3crudpolicy)
     */
    public fun s3CrudPolicy(): Any? = unwrap(this).getS3CrudPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-s3readpolicy)
     */
    public fun s3ReadPolicy(): Any? = unwrap(this).getS3ReadPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-s3writepolicy)
     */
    public fun s3WritePolicy(): Any? = unwrap(this).getS3WritePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sesbulktemplatedcrudpolicy)
     */
    public fun sesBulkTemplatedCrudPolicy(): Any? = unwrap(this).getSesBulkTemplatedCrudPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sescrudpolicy)
     */
    public fun sesCrudPolicy(): Any? = unwrap(this).getSesCrudPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sesemailtemplatecrudpolicy)
     */
    public fun sesEmailTemplateCrudPolicy(): Any? = unwrap(this).getSesEmailTemplateCrudPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sessendbouncepolicy)
     */
    public fun sesSendBouncePolicy(): Any? = unwrap(this).getSesSendBouncePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-snscrudpolicy)
     */
    public fun snsCrudPolicy(): Any? = unwrap(this).getSnsCrudPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-snspublishmessagepolicy)
     */
    public fun snsPublishMessagePolicy(): Any? = unwrap(this).getSnsPublishMessagePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sqspollerpolicy)
     */
    public fun sqsPollerPolicy(): Any? = unwrap(this).getSqsPollerPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sqssendmessagepolicy)
     */
    public fun sqsSendMessagePolicy(): Any? = unwrap(this).getSqsSendMessagePolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-ssmparameterreadpolicy)
     */
    public fun ssmParameterReadPolicy(): Any? = unwrap(this).getSsmParameterReadPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-stepfunctionsexecutionpolicy)
     */
    public fun stepFunctionsExecutionPolicy(): Any? = unwrap(this).getStepFunctionsExecutionPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-vpcaccesspolicy)
     */
    public fun vpcAccessPolicy(): Any? = unwrap(this).getVpcAccessPolicy()

    /**
     * A builder for [SAMPolicyTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amiDescribePolicy the value to be set.
       */
      public fun amiDescribePolicy(amiDescribePolicy: IResolvable)

      /**
       * @param amiDescribePolicy the value to be set.
       */
      public fun amiDescribePolicy(amiDescribePolicy: EmptySAMPTProperty)

      /**
       * @param amiDescribePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ffbd4cd9871a2be4e64ab12e63267fa255c166e0b0d6ef43ecc8cbe033bad09")
      public fun amiDescribePolicy(amiDescribePolicy: EmptySAMPTProperty.Builder.() -> Unit)

      /**
       * @param awsSecretsManagerGetSecretValuePolicy the value to be set.
       */
      public
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: IResolvable)

      /**
       * @param awsSecretsManagerGetSecretValuePolicy the value to be set.
       */
      public
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: SecretArnSAMPTProperty)

      /**
       * @param awsSecretsManagerGetSecretValuePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a2345d8393a346bbb89efc5395a05f6fe82c03921eaf01f9d006067d67affbe")
      public
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: SecretArnSAMPTProperty.Builder.() -> Unit)

      /**
       * @param cloudFormationDescribeStacksPolicy the value to be set.
       */
      public fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: IResolvable)

      /**
       * @param cloudFormationDescribeStacksPolicy the value to be set.
       */
      public
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: EmptySAMPTProperty)

      /**
       * @param cloudFormationDescribeStacksPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57b3f53bf1c96447254b75f60d11f92e106e000ca0cacd02c1e0a9d4f88e99a8")
      public
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: EmptySAMPTProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchPutMetricPolicy the value to be set.
       */
      public fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: IResolvable)

      /**
       * @param cloudWatchPutMetricPolicy the value to be set.
       */
      public fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: EmptySAMPTProperty)

      /**
       * @param cloudWatchPutMetricPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9509da69caaf16883156121d17c04d7a05b63271a89a81c0cc4ba271be1c2c98")
      public
          fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: EmptySAMPTProperty.Builder.() -> Unit)

      /**
       * @param dynamoDbCrudPolicy the value to be set.
       */
      public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: IResolvable)

      /**
       * @param dynamoDbCrudPolicy the value to be set.
       */
      public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: TableSAMPTProperty)

      /**
       * @param dynamoDbCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("935113a164f96629c0c70d4723120e6b862e21b36e8250e787beac4a4fed1d66")
      public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: TableSAMPTProperty.Builder.() -> Unit)

      /**
       * @param dynamoDbReadPolicy the value to be set.
       */
      public fun dynamoDbReadPolicy(dynamoDbReadPolicy: IResolvable)

      /**
       * @param dynamoDbReadPolicy the value to be set.
       */
      public fun dynamoDbReadPolicy(dynamoDbReadPolicy: TableSAMPTProperty)

      /**
       * @param dynamoDbReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df795775dcd23f51c2eb78dea9cb327e0597c5493449edba8fe0fee8d2ac2f6c")
      public fun dynamoDbReadPolicy(dynamoDbReadPolicy: TableSAMPTProperty.Builder.() -> Unit)

      /**
       * @param dynamoDbStreamReadPolicy the value to be set.
       */
      public fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: IResolvable)

      /**
       * @param dynamoDbStreamReadPolicy the value to be set.
       */
      public fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: TableStreamSAMPTProperty)

      /**
       * @param dynamoDbStreamReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1d54a973657e8451185f807dd630704511afacab8b2bb1b4152eb47dcd38ab4")
      public
          fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: TableStreamSAMPTProperty.Builder.() -> Unit)

      /**
       * @param dynamoDbWritePolicy the value to be set.
       */
      public fun dynamoDbWritePolicy(dynamoDbWritePolicy: IResolvable)

      /**
       * @param dynamoDbWritePolicy the value to be set.
       */
      public fun dynamoDbWritePolicy(dynamoDbWritePolicy: TableSAMPTProperty)

      /**
       * @param dynamoDbWritePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eac4f77957069da0c1d7201b01975d528d40209d8ec22ee408099551bbb26235")
      public fun dynamoDbWritePolicy(dynamoDbWritePolicy: TableSAMPTProperty.Builder.() -> Unit)

      /**
       * @param ec2DescribePolicy the value to be set.
       */
      public fun ec2DescribePolicy(ec2DescribePolicy: IResolvable)

      /**
       * @param ec2DescribePolicy the value to be set.
       */
      public fun ec2DescribePolicy(ec2DescribePolicy: EmptySAMPTProperty)

      /**
       * @param ec2DescribePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3358ae2a6b4a141aadf79d37e9687c3ecb3dff683100b85b1fe87d041b849249")
      public fun ec2DescribePolicy(ec2DescribePolicy: EmptySAMPTProperty.Builder.() -> Unit)

      /**
       * @param elasticsearchHttpPostPolicy the value to be set.
       */
      public fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: IResolvable)

      /**
       * @param elasticsearchHttpPostPolicy the value to be set.
       */
      public fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: DomainSAMPTProperty)

      /**
       * @param elasticsearchHttpPostPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d85413000df607b8481ea8f950f3190dd708f838ccf849964969a6ffdfc3b3a")
      public
          fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: DomainSAMPTProperty.Builder.() -> Unit)

      /**
       * @param filterLogEventsPolicy the value to be set.
       */
      public fun filterLogEventsPolicy(filterLogEventsPolicy: IResolvable)

      /**
       * @param filterLogEventsPolicy the value to be set.
       */
      public fun filterLogEventsPolicy(filterLogEventsPolicy: LogGroupSAMPTProperty)

      /**
       * @param filterLogEventsPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b037880f8ddba38d13afb75f8992889a5dc271580beda09b797f881a7b168ecb")
      public
          fun filterLogEventsPolicy(filterLogEventsPolicy: LogGroupSAMPTProperty.Builder.() -> Unit)

      /**
       * @param kinesisCrudPolicy the value to be set.
       */
      public fun kinesisCrudPolicy(kinesisCrudPolicy: IResolvable)

      /**
       * @param kinesisCrudPolicy the value to be set.
       */
      public fun kinesisCrudPolicy(kinesisCrudPolicy: StreamSAMPTProperty)

      /**
       * @param kinesisCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8eb2a5ca2130fbb3f6a2e49cecef8a2bb4dca12059bf88b8ae43d7e4fbac3658")
      public fun kinesisCrudPolicy(kinesisCrudPolicy: StreamSAMPTProperty.Builder.() -> Unit)

      /**
       * @param kinesisStreamReadPolicy the value to be set.
       */
      public fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: IResolvable)

      /**
       * @param kinesisStreamReadPolicy the value to be set.
       */
      public fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: StreamSAMPTProperty)

      /**
       * @param kinesisStreamReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("978ef2b190e14336006a6f3967e5b88ea48a5ba0f1f65acc399d581b76eb8542")
      public
          fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: StreamSAMPTProperty.Builder.() -> Unit)

      /**
       * @param kmsDecryptPolicy the value to be set.
       */
      public fun kmsDecryptPolicy(kmsDecryptPolicy: IResolvable)

      /**
       * @param kmsDecryptPolicy the value to be set.
       */
      public fun kmsDecryptPolicy(kmsDecryptPolicy: KeySAMPTProperty)

      /**
       * @param kmsDecryptPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7168eccd84da56f444b947c5e61df8d009f286e3dfeb6639ec02e18448b0062b")
      public fun kmsDecryptPolicy(kmsDecryptPolicy: KeySAMPTProperty.Builder.() -> Unit)

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      public fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable)

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      public fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty)

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70b8621f04d22d6fb0e05b959568232c57dc4031b9d573f85cf08b14099a96b9")
      public fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty.Builder.() -> Unit)

      /**
       * @param rekognitionDetectOnlyPolicy the value to be set.
       */
      public fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: IResolvable)

      /**
       * @param rekognitionDetectOnlyPolicy the value to be set.
       */
      public fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: EmptySAMPTProperty)

      /**
       * @param rekognitionDetectOnlyPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6afc4b90e6f9b0d3aea86275e2dbdb3b4b413749de97821f3a281f60a9913e35")
      public
          fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: EmptySAMPTProperty.Builder.() -> Unit)

      /**
       * @param rekognitionLabelsPolicy the value to be set.
       */
      public fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: IResolvable)

      /**
       * @param rekognitionLabelsPolicy the value to be set.
       */
      public fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: EmptySAMPTProperty)

      /**
       * @param rekognitionLabelsPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00868a429833f1f938aecab92ea63af6c38b398667dfc9e694dc40bee5036e5b")
      public
          fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: EmptySAMPTProperty.Builder.() -> Unit)

      /**
       * @param rekognitionNoDataAccessPolicy the value to be set.
       */
      public fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: IResolvable)

      /**
       * @param rekognitionNoDataAccessPolicy the value to be set.
       */
      public
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CollectionSAMPTProperty)

      /**
       * @param rekognitionNoDataAccessPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82d63909262dc296dc91d922790da301248e7ef6a77b9cab6447cedc6a512f7e")
      public
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CollectionSAMPTProperty.Builder.() -> Unit)

      /**
       * @param rekognitionReadPolicy the value to be set.
       */
      public fun rekognitionReadPolicy(rekognitionReadPolicy: IResolvable)

      /**
       * @param rekognitionReadPolicy the value to be set.
       */
      public fun rekognitionReadPolicy(rekognitionReadPolicy: CollectionSAMPTProperty)

      /**
       * @param rekognitionReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76955e3338f2d42c224a77804af6c2279ff219c8e3284b60e4b44dbc05e3c493")
      public
          fun rekognitionReadPolicy(rekognitionReadPolicy: CollectionSAMPTProperty.Builder.() -> Unit)

      /**
       * @param rekognitionWriteOnlyAccessPolicy the value to be set.
       */
      public fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: IResolvable)

      /**
       * @param rekognitionWriteOnlyAccessPolicy the value to be set.
       */
      public
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CollectionSAMPTProperty)

      /**
       * @param rekognitionWriteOnlyAccessPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dcf824084a195755b530bad0e13ac7ebd83c47a4f7456dbcb1b3726c0abc52b")
      public
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CollectionSAMPTProperty.Builder.() -> Unit)

      /**
       * @param s3CrudPolicy the value to be set.
       */
      public fun s3CrudPolicy(s3CrudPolicy: IResolvable)

      /**
       * @param s3CrudPolicy the value to be set.
       */
      public fun s3CrudPolicy(s3CrudPolicy: BucketSAMPTProperty)

      /**
       * @param s3CrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a0aa5c24326aaa2f99289e200cc39d7c3b4711841dee43e06705ed9577a97c")
      public fun s3CrudPolicy(s3CrudPolicy: BucketSAMPTProperty.Builder.() -> Unit)

      /**
       * @param s3ReadPolicy the value to be set.
       */
      public fun s3ReadPolicy(s3ReadPolicy: IResolvable)

      /**
       * @param s3ReadPolicy the value to be set.
       */
      public fun s3ReadPolicy(s3ReadPolicy: BucketSAMPTProperty)

      /**
       * @param s3ReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a30954145aa23934ced20050b142a673ffdecb35052905f4af3e824ba34ecf5")
      public fun s3ReadPolicy(s3ReadPolicy: BucketSAMPTProperty.Builder.() -> Unit)

      /**
       * @param s3WritePolicy the value to be set.
       */
      public fun s3WritePolicy(s3WritePolicy: IResolvable)

      /**
       * @param s3WritePolicy the value to be set.
       */
      public fun s3WritePolicy(s3WritePolicy: BucketSAMPTProperty)

      /**
       * @param s3WritePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56ad47ffacff3038b135034d03ac92e054cd8c281fcf23a0ec23ceaebe9ccab9")
      public fun s3WritePolicy(s3WritePolicy: BucketSAMPTProperty.Builder.() -> Unit)

      /**
       * @param sesBulkTemplatedCrudPolicy the value to be set.
       */
      public fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IResolvable)

      /**
       * @param sesBulkTemplatedCrudPolicy the value to be set.
       */
      public fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IdentitySAMPTProperty)

      /**
       * @param sesBulkTemplatedCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94372465dc46ef31785a5c03336ac051177bd3f352e650439143d72233a164d5")
      public
          fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IdentitySAMPTProperty.Builder.() -> Unit)

      /**
       * @param sesCrudPolicy the value to be set.
       */
      public fun sesCrudPolicy(sesCrudPolicy: IResolvable)

      /**
       * @param sesCrudPolicy the value to be set.
       */
      public fun sesCrudPolicy(sesCrudPolicy: IdentitySAMPTProperty)

      /**
       * @param sesCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44a25b433cf529a3f59b068141b038b318af9e4b8765e69d3bd049f5eda4bcef")
      public fun sesCrudPolicy(sesCrudPolicy: IdentitySAMPTProperty.Builder.() -> Unit)

      /**
       * @param sesEmailTemplateCrudPolicy the value to be set.
       */
      public fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: IResolvable)

      /**
       * @param sesEmailTemplateCrudPolicy the value to be set.
       */
      public fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: EmptySAMPTProperty)

      /**
       * @param sesEmailTemplateCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc0dada99f25e7bcf2339fb0e751e1ad935c49179d4f5bde8500ab67e85ad0ce")
      public
          fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: EmptySAMPTProperty.Builder.() -> Unit)

      /**
       * @param sesSendBouncePolicy the value to be set.
       */
      public fun sesSendBouncePolicy(sesSendBouncePolicy: IResolvable)

      /**
       * @param sesSendBouncePolicy the value to be set.
       */
      public fun sesSendBouncePolicy(sesSendBouncePolicy: IdentitySAMPTProperty)

      /**
       * @param sesSendBouncePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ae1e7a4c749d08f5b447e467c03f1402fb93d49c00957bee69bd2cd34d38ac3")
      public fun sesSendBouncePolicy(sesSendBouncePolicy: IdentitySAMPTProperty.Builder.() -> Unit)

      /**
       * @param snsCrudPolicy the value to be set.
       */
      public fun snsCrudPolicy(snsCrudPolicy: IResolvable)

      /**
       * @param snsCrudPolicy the value to be set.
       */
      public fun snsCrudPolicy(snsCrudPolicy: TopicSAMPTProperty)

      /**
       * @param snsCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c4057c5b0bbab9c1b2ccf03b0d391e72a82373ba995e1c10dd672ca0f9c366e")
      public fun snsCrudPolicy(snsCrudPolicy: TopicSAMPTProperty.Builder.() -> Unit)

      /**
       * @param snsPublishMessagePolicy the value to be set.
       */
      public fun snsPublishMessagePolicy(snsPublishMessagePolicy: IResolvable)

      /**
       * @param snsPublishMessagePolicy the value to be set.
       */
      public fun snsPublishMessagePolicy(snsPublishMessagePolicy: TopicSAMPTProperty)

      /**
       * @param snsPublishMessagePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc55e7590d9b94a5f8c4a2388d03cc95ca0ebed643e7fa78210e83a8e246d861")
      public
          fun snsPublishMessagePolicy(snsPublishMessagePolicy: TopicSAMPTProperty.Builder.() -> Unit)

      /**
       * @param sqsPollerPolicy the value to be set.
       */
      public fun sqsPollerPolicy(sqsPollerPolicy: IResolvable)

      /**
       * @param sqsPollerPolicy the value to be set.
       */
      public fun sqsPollerPolicy(sqsPollerPolicy: QueueSAMPTProperty)

      /**
       * @param sqsPollerPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7101881b6cbe7ba1feac75c8fbcfd98bebf10bcdc75fbfeff55c0e14d906c982")
      public fun sqsPollerPolicy(sqsPollerPolicy: QueueSAMPTProperty.Builder.() -> Unit)

      /**
       * @param sqsSendMessagePolicy the value to be set.
       */
      public fun sqsSendMessagePolicy(sqsSendMessagePolicy: IResolvable)

      /**
       * @param sqsSendMessagePolicy the value to be set.
       */
      public fun sqsSendMessagePolicy(sqsSendMessagePolicy: QueueSAMPTProperty)

      /**
       * @param sqsSendMessagePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ca4acba6248c758a73866e26d1d6a6b6cdf0020ccb8a9a054bd80eb091dd59e")
      public fun sqsSendMessagePolicy(sqsSendMessagePolicy: QueueSAMPTProperty.Builder.() -> Unit)

      /**
       * @param ssmParameterReadPolicy the value to be set.
       */
      public fun ssmParameterReadPolicy(ssmParameterReadPolicy: IResolvable)

      /**
       * @param ssmParameterReadPolicy the value to be set.
       */
      public fun ssmParameterReadPolicy(ssmParameterReadPolicy: ParameterNameSAMPTProperty)

      /**
       * @param ssmParameterReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("231e5ee73bf5944498d6179f6c96904f366b79450c2f757006426f67daee329e")
      public
          fun ssmParameterReadPolicy(ssmParameterReadPolicy: ParameterNameSAMPTProperty.Builder.() -> Unit)

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable)

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      public
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty)

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2c83d3f69a6c1351125785327861aae48077103d1ee36317d2ce12718746ecb")
      public
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty.Builder.() -> Unit)

      /**
       * @param vpcAccessPolicy the value to be set.
       */
      public fun vpcAccessPolicy(vpcAccessPolicy: IResolvable)

      /**
       * @param vpcAccessPolicy the value to be set.
       */
      public fun vpcAccessPolicy(vpcAccessPolicy: EmptySAMPTProperty)

      /**
       * @param vpcAccessPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0617476e5af158f7e65497f2b8d8d8b420129b399f349dc1b88376d3ceb8b976")
      public fun vpcAccessPolicy(vpcAccessPolicy: EmptySAMPTProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty.builder()

      /**
       * @param amiDescribePolicy the value to be set.
       */
      override fun amiDescribePolicy(amiDescribePolicy: IResolvable) {
        cdkBuilder.amiDescribePolicy(amiDescribePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param amiDescribePolicy the value to be set.
       */
      override fun amiDescribePolicy(amiDescribePolicy: EmptySAMPTProperty) {
        cdkBuilder.amiDescribePolicy(amiDescribePolicy.let(EmptySAMPTProperty::unwrap))
      }

      /**
       * @param amiDescribePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ffbd4cd9871a2be4e64ab12e63267fa255c166e0b0d6ef43ecc8cbe033bad09")
      override fun amiDescribePolicy(amiDescribePolicy: EmptySAMPTProperty.Builder.() -> Unit): Unit
          = amiDescribePolicy(EmptySAMPTProperty(amiDescribePolicy))

      /**
       * @param awsSecretsManagerGetSecretValuePolicy the value to be set.
       */
      override
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: IResolvable) {
        cdkBuilder.awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param awsSecretsManagerGetSecretValuePolicy the value to be set.
       */
      override
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: SecretArnSAMPTProperty) {
        cdkBuilder.awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy.let(SecretArnSAMPTProperty::unwrap))
      }

      /**
       * @param awsSecretsManagerGetSecretValuePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a2345d8393a346bbb89efc5395a05f6fe82c03921eaf01f9d006067d67affbe")
      override
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: SecretArnSAMPTProperty.Builder.() -> Unit):
          Unit =
          awsSecretsManagerGetSecretValuePolicy(SecretArnSAMPTProperty(awsSecretsManagerGetSecretValuePolicy))

      /**
       * @param cloudFormationDescribeStacksPolicy the value to be set.
       */
      override
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: IResolvable) {
        cdkBuilder.cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param cloudFormationDescribeStacksPolicy the value to be set.
       */
      override
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: EmptySAMPTProperty) {
        cdkBuilder.cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy.let(EmptySAMPTProperty::unwrap))
      }

      /**
       * @param cloudFormationDescribeStacksPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57b3f53bf1c96447254b75f60d11f92e106e000ca0cacd02c1e0a9d4f88e99a8")
      override
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit =
          cloudFormationDescribeStacksPolicy(EmptySAMPTProperty(cloudFormationDescribeStacksPolicy))

      /**
       * @param cloudWatchPutMetricPolicy the value to be set.
       */
      override fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: IResolvable) {
        cdkBuilder.cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchPutMetricPolicy the value to be set.
       */
      override fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: EmptySAMPTProperty) {
        cdkBuilder.cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy.let(EmptySAMPTProperty::unwrap))
      }

      /**
       * @param cloudWatchPutMetricPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9509da69caaf16883156121d17c04d7a05b63271a89a81c0cc4ba271be1c2c98")
      override
          fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = cloudWatchPutMetricPolicy(EmptySAMPTProperty(cloudWatchPutMetricPolicy))

      /**
       * @param dynamoDbCrudPolicy the value to be set.
       */
      override fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: IResolvable) {
        cdkBuilder.dynamoDbCrudPolicy(dynamoDbCrudPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDbCrudPolicy the value to be set.
       */
      override fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: TableSAMPTProperty) {
        cdkBuilder.dynamoDbCrudPolicy(dynamoDbCrudPolicy.let(TableSAMPTProperty::unwrap))
      }

      /**
       * @param dynamoDbCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("935113a164f96629c0c70d4723120e6b862e21b36e8250e787beac4a4fed1d66")
      override fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: TableSAMPTProperty.Builder.() -> Unit):
          Unit = dynamoDbCrudPolicy(TableSAMPTProperty(dynamoDbCrudPolicy))

      /**
       * @param dynamoDbReadPolicy the value to be set.
       */
      override fun dynamoDbReadPolicy(dynamoDbReadPolicy: IResolvable) {
        cdkBuilder.dynamoDbReadPolicy(dynamoDbReadPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDbReadPolicy the value to be set.
       */
      override fun dynamoDbReadPolicy(dynamoDbReadPolicy: TableSAMPTProperty) {
        cdkBuilder.dynamoDbReadPolicy(dynamoDbReadPolicy.let(TableSAMPTProperty::unwrap))
      }

      /**
       * @param dynamoDbReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df795775dcd23f51c2eb78dea9cb327e0597c5493449edba8fe0fee8d2ac2f6c")
      override fun dynamoDbReadPolicy(dynamoDbReadPolicy: TableSAMPTProperty.Builder.() -> Unit):
          Unit = dynamoDbReadPolicy(TableSAMPTProperty(dynamoDbReadPolicy))

      /**
       * @param dynamoDbStreamReadPolicy the value to be set.
       */
      override fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: IResolvable) {
        cdkBuilder.dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDbStreamReadPolicy the value to be set.
       */
      override fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: TableStreamSAMPTProperty) {
        cdkBuilder.dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy.let(TableStreamSAMPTProperty::unwrap))
      }

      /**
       * @param dynamoDbStreamReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1d54a973657e8451185f807dd630704511afacab8b2bb1b4152eb47dcd38ab4")
      override
          fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: TableStreamSAMPTProperty.Builder.() -> Unit):
          Unit = dynamoDbStreamReadPolicy(TableStreamSAMPTProperty(dynamoDbStreamReadPolicy))

      /**
       * @param dynamoDbWritePolicy the value to be set.
       */
      override fun dynamoDbWritePolicy(dynamoDbWritePolicy: IResolvable) {
        cdkBuilder.dynamoDbWritePolicy(dynamoDbWritePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDbWritePolicy the value to be set.
       */
      override fun dynamoDbWritePolicy(dynamoDbWritePolicy: TableSAMPTProperty) {
        cdkBuilder.dynamoDbWritePolicy(dynamoDbWritePolicy.let(TableSAMPTProperty::unwrap))
      }

      /**
       * @param dynamoDbWritePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eac4f77957069da0c1d7201b01975d528d40209d8ec22ee408099551bbb26235")
      override fun dynamoDbWritePolicy(dynamoDbWritePolicy: TableSAMPTProperty.Builder.() -> Unit):
          Unit = dynamoDbWritePolicy(TableSAMPTProperty(dynamoDbWritePolicy))

      /**
       * @param ec2DescribePolicy the value to be set.
       */
      override fun ec2DescribePolicy(ec2DescribePolicy: IResolvable) {
        cdkBuilder.ec2DescribePolicy(ec2DescribePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param ec2DescribePolicy the value to be set.
       */
      override fun ec2DescribePolicy(ec2DescribePolicy: EmptySAMPTProperty) {
        cdkBuilder.ec2DescribePolicy(ec2DescribePolicy.let(EmptySAMPTProperty::unwrap))
      }

      /**
       * @param ec2DescribePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3358ae2a6b4a141aadf79d37e9687c3ecb3dff683100b85b1fe87d041b849249")
      override fun ec2DescribePolicy(ec2DescribePolicy: EmptySAMPTProperty.Builder.() -> Unit): Unit
          = ec2DescribePolicy(EmptySAMPTProperty(ec2DescribePolicy))

      /**
       * @param elasticsearchHttpPostPolicy the value to be set.
       */
      override fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: IResolvable) {
        cdkBuilder.elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param elasticsearchHttpPostPolicy the value to be set.
       */
      override fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: DomainSAMPTProperty) {
        cdkBuilder.elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy.let(DomainSAMPTProperty::unwrap))
      }

      /**
       * @param elasticsearchHttpPostPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d85413000df607b8481ea8f950f3190dd708f838ccf849964969a6ffdfc3b3a")
      override
          fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: DomainSAMPTProperty.Builder.() -> Unit):
          Unit = elasticsearchHttpPostPolicy(DomainSAMPTProperty(elasticsearchHttpPostPolicy))

      /**
       * @param filterLogEventsPolicy the value to be set.
       */
      override fun filterLogEventsPolicy(filterLogEventsPolicy: IResolvable) {
        cdkBuilder.filterLogEventsPolicy(filterLogEventsPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param filterLogEventsPolicy the value to be set.
       */
      override fun filterLogEventsPolicy(filterLogEventsPolicy: LogGroupSAMPTProperty) {
        cdkBuilder.filterLogEventsPolicy(filterLogEventsPolicy.let(LogGroupSAMPTProperty::unwrap))
      }

      /**
       * @param filterLogEventsPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b037880f8ddba38d13afb75f8992889a5dc271580beda09b797f881a7b168ecb")
      override
          fun filterLogEventsPolicy(filterLogEventsPolicy: LogGroupSAMPTProperty.Builder.() -> Unit):
          Unit = filterLogEventsPolicy(LogGroupSAMPTProperty(filterLogEventsPolicy))

      /**
       * @param kinesisCrudPolicy the value to be set.
       */
      override fun kinesisCrudPolicy(kinesisCrudPolicy: IResolvable) {
        cdkBuilder.kinesisCrudPolicy(kinesisCrudPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisCrudPolicy the value to be set.
       */
      override fun kinesisCrudPolicy(kinesisCrudPolicy: StreamSAMPTProperty) {
        cdkBuilder.kinesisCrudPolicy(kinesisCrudPolicy.let(StreamSAMPTProperty::unwrap))
      }

      /**
       * @param kinesisCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8eb2a5ca2130fbb3f6a2e49cecef8a2bb4dca12059bf88b8ae43d7e4fbac3658")
      override fun kinesisCrudPolicy(kinesisCrudPolicy: StreamSAMPTProperty.Builder.() -> Unit):
          Unit = kinesisCrudPolicy(StreamSAMPTProperty(kinesisCrudPolicy))

      /**
       * @param kinesisStreamReadPolicy the value to be set.
       */
      override fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: IResolvable) {
        cdkBuilder.kinesisStreamReadPolicy(kinesisStreamReadPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisStreamReadPolicy the value to be set.
       */
      override fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: StreamSAMPTProperty) {
        cdkBuilder.kinesisStreamReadPolicy(kinesisStreamReadPolicy.let(StreamSAMPTProperty::unwrap))
      }

      /**
       * @param kinesisStreamReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("978ef2b190e14336006a6f3967e5b88ea48a5ba0f1f65acc399d581b76eb8542")
      override
          fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: StreamSAMPTProperty.Builder.() -> Unit):
          Unit = kinesisStreamReadPolicy(StreamSAMPTProperty(kinesisStreamReadPolicy))

      /**
       * @param kmsDecryptPolicy the value to be set.
       */
      override fun kmsDecryptPolicy(kmsDecryptPolicy: IResolvable) {
        cdkBuilder.kmsDecryptPolicy(kmsDecryptPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param kmsDecryptPolicy the value to be set.
       */
      override fun kmsDecryptPolicy(kmsDecryptPolicy: KeySAMPTProperty) {
        cdkBuilder.kmsDecryptPolicy(kmsDecryptPolicy.let(KeySAMPTProperty::unwrap))
      }

      /**
       * @param kmsDecryptPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7168eccd84da56f444b947c5e61df8d009f286e3dfeb6639ec02e18448b0062b")
      override fun kmsDecryptPolicy(kmsDecryptPolicy: KeySAMPTProperty.Builder.() -> Unit): Unit =
          kmsDecryptPolicy(KeySAMPTProperty(kmsDecryptPolicy))

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      override fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      override fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy.let(FunctionSAMPTProperty::unwrap))
      }

      /**
       * @param lambdaInvokePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70b8621f04d22d6fb0e05b959568232c57dc4031b9d573f85cf08b14099a96b9")
      override fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty.Builder.() -> Unit):
          Unit = lambdaInvokePolicy(FunctionSAMPTProperty(lambdaInvokePolicy))

      /**
       * @param rekognitionDetectOnlyPolicy the value to be set.
       */
      override fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: IResolvable) {
        cdkBuilder.rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param rekognitionDetectOnlyPolicy the value to be set.
       */
      override fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: EmptySAMPTProperty) {
        cdkBuilder.rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy.let(EmptySAMPTProperty::unwrap))
      }

      /**
       * @param rekognitionDetectOnlyPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6afc4b90e6f9b0d3aea86275e2dbdb3b4b413749de97821f3a281f60a9913e35")
      override
          fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = rekognitionDetectOnlyPolicy(EmptySAMPTProperty(rekognitionDetectOnlyPolicy))

      /**
       * @param rekognitionLabelsPolicy the value to be set.
       */
      override fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: IResolvable) {
        cdkBuilder.rekognitionLabelsPolicy(rekognitionLabelsPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param rekognitionLabelsPolicy the value to be set.
       */
      override fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: EmptySAMPTProperty) {
        cdkBuilder.rekognitionLabelsPolicy(rekognitionLabelsPolicy.let(EmptySAMPTProperty::unwrap))
      }

      /**
       * @param rekognitionLabelsPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00868a429833f1f938aecab92ea63af6c38b398667dfc9e694dc40bee5036e5b")
      override
          fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = rekognitionLabelsPolicy(EmptySAMPTProperty(rekognitionLabelsPolicy))

      /**
       * @param rekognitionNoDataAccessPolicy the value to be set.
       */
      override fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: IResolvable) {
        cdkBuilder.rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param rekognitionNoDataAccessPolicy the value to be set.
       */
      override
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CollectionSAMPTProperty) {
        cdkBuilder.rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy.let(CollectionSAMPTProperty::unwrap))
      }

      /**
       * @param rekognitionNoDataAccessPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82d63909262dc296dc91d922790da301248e7ef6a77b9cab6447cedc6a512f7e")
      override
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CollectionSAMPTProperty.Builder.() -> Unit):
          Unit =
          rekognitionNoDataAccessPolicy(CollectionSAMPTProperty(rekognitionNoDataAccessPolicy))

      /**
       * @param rekognitionReadPolicy the value to be set.
       */
      override fun rekognitionReadPolicy(rekognitionReadPolicy: IResolvable) {
        cdkBuilder.rekognitionReadPolicy(rekognitionReadPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param rekognitionReadPolicy the value to be set.
       */
      override fun rekognitionReadPolicy(rekognitionReadPolicy: CollectionSAMPTProperty) {
        cdkBuilder.rekognitionReadPolicy(rekognitionReadPolicy.let(CollectionSAMPTProperty::unwrap))
      }

      /**
       * @param rekognitionReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76955e3338f2d42c224a77804af6c2279ff219c8e3284b60e4b44dbc05e3c493")
      override
          fun rekognitionReadPolicy(rekognitionReadPolicy: CollectionSAMPTProperty.Builder.() -> Unit):
          Unit = rekognitionReadPolicy(CollectionSAMPTProperty(rekognitionReadPolicy))

      /**
       * @param rekognitionWriteOnlyAccessPolicy the value to be set.
       */
      override fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: IResolvable) {
        cdkBuilder.rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param rekognitionWriteOnlyAccessPolicy the value to be set.
       */
      override
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CollectionSAMPTProperty) {
        cdkBuilder.rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy.let(CollectionSAMPTProperty::unwrap))
      }

      /**
       * @param rekognitionWriteOnlyAccessPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dcf824084a195755b530bad0e13ac7ebd83c47a4f7456dbcb1b3726c0abc52b")
      override
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CollectionSAMPTProperty.Builder.() -> Unit):
          Unit =
          rekognitionWriteOnlyAccessPolicy(CollectionSAMPTProperty(rekognitionWriteOnlyAccessPolicy))

      /**
       * @param s3CrudPolicy the value to be set.
       */
      override fun s3CrudPolicy(s3CrudPolicy: IResolvable) {
        cdkBuilder.s3CrudPolicy(s3CrudPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param s3CrudPolicy the value to be set.
       */
      override fun s3CrudPolicy(s3CrudPolicy: BucketSAMPTProperty) {
        cdkBuilder.s3CrudPolicy(s3CrudPolicy.let(BucketSAMPTProperty::unwrap))
      }

      /**
       * @param s3CrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a0aa5c24326aaa2f99289e200cc39d7c3b4711841dee43e06705ed9577a97c")
      override fun s3CrudPolicy(s3CrudPolicy: BucketSAMPTProperty.Builder.() -> Unit): Unit =
          s3CrudPolicy(BucketSAMPTProperty(s3CrudPolicy))

      /**
       * @param s3ReadPolicy the value to be set.
       */
      override fun s3ReadPolicy(s3ReadPolicy: IResolvable) {
        cdkBuilder.s3ReadPolicy(s3ReadPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param s3ReadPolicy the value to be set.
       */
      override fun s3ReadPolicy(s3ReadPolicy: BucketSAMPTProperty) {
        cdkBuilder.s3ReadPolicy(s3ReadPolicy.let(BucketSAMPTProperty::unwrap))
      }

      /**
       * @param s3ReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a30954145aa23934ced20050b142a673ffdecb35052905f4af3e824ba34ecf5")
      override fun s3ReadPolicy(s3ReadPolicy: BucketSAMPTProperty.Builder.() -> Unit): Unit =
          s3ReadPolicy(BucketSAMPTProperty(s3ReadPolicy))

      /**
       * @param s3WritePolicy the value to be set.
       */
      override fun s3WritePolicy(s3WritePolicy: IResolvable) {
        cdkBuilder.s3WritePolicy(s3WritePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param s3WritePolicy the value to be set.
       */
      override fun s3WritePolicy(s3WritePolicy: BucketSAMPTProperty) {
        cdkBuilder.s3WritePolicy(s3WritePolicy.let(BucketSAMPTProperty::unwrap))
      }

      /**
       * @param s3WritePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56ad47ffacff3038b135034d03ac92e054cd8c281fcf23a0ec23ceaebe9ccab9")
      override fun s3WritePolicy(s3WritePolicy: BucketSAMPTProperty.Builder.() -> Unit): Unit =
          s3WritePolicy(BucketSAMPTProperty(s3WritePolicy))

      /**
       * @param sesBulkTemplatedCrudPolicy the value to be set.
       */
      override fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IResolvable) {
        cdkBuilder.sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param sesBulkTemplatedCrudPolicy the value to be set.
       */
      override fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IdentitySAMPTProperty) {
        cdkBuilder.sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy.let(IdentitySAMPTProperty::unwrap))
      }

      /**
       * @param sesBulkTemplatedCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94372465dc46ef31785a5c03336ac051177bd3f352e650439143d72233a164d5")
      override
          fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IdentitySAMPTProperty.Builder.() -> Unit):
          Unit = sesBulkTemplatedCrudPolicy(IdentitySAMPTProperty(sesBulkTemplatedCrudPolicy))

      /**
       * @param sesCrudPolicy the value to be set.
       */
      override fun sesCrudPolicy(sesCrudPolicy: IResolvable) {
        cdkBuilder.sesCrudPolicy(sesCrudPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param sesCrudPolicy the value to be set.
       */
      override fun sesCrudPolicy(sesCrudPolicy: IdentitySAMPTProperty) {
        cdkBuilder.sesCrudPolicy(sesCrudPolicy.let(IdentitySAMPTProperty::unwrap))
      }

      /**
       * @param sesCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44a25b433cf529a3f59b068141b038b318af9e4b8765e69d3bd049f5eda4bcef")
      override fun sesCrudPolicy(sesCrudPolicy: IdentitySAMPTProperty.Builder.() -> Unit): Unit =
          sesCrudPolicy(IdentitySAMPTProperty(sesCrudPolicy))

      /**
       * @param sesEmailTemplateCrudPolicy the value to be set.
       */
      override fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: IResolvable) {
        cdkBuilder.sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param sesEmailTemplateCrudPolicy the value to be set.
       */
      override fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: EmptySAMPTProperty) {
        cdkBuilder.sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy.let(EmptySAMPTProperty::unwrap))
      }

      /**
       * @param sesEmailTemplateCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc0dada99f25e7bcf2339fb0e751e1ad935c49179d4f5bde8500ab67e85ad0ce")
      override
          fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = sesEmailTemplateCrudPolicy(EmptySAMPTProperty(sesEmailTemplateCrudPolicy))

      /**
       * @param sesSendBouncePolicy the value to be set.
       */
      override fun sesSendBouncePolicy(sesSendBouncePolicy: IResolvable) {
        cdkBuilder.sesSendBouncePolicy(sesSendBouncePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param sesSendBouncePolicy the value to be set.
       */
      override fun sesSendBouncePolicy(sesSendBouncePolicy: IdentitySAMPTProperty) {
        cdkBuilder.sesSendBouncePolicy(sesSendBouncePolicy.let(IdentitySAMPTProperty::unwrap))
      }

      /**
       * @param sesSendBouncePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ae1e7a4c749d08f5b447e467c03f1402fb93d49c00957bee69bd2cd34d38ac3")
      override
          fun sesSendBouncePolicy(sesSendBouncePolicy: IdentitySAMPTProperty.Builder.() -> Unit):
          Unit = sesSendBouncePolicy(IdentitySAMPTProperty(sesSendBouncePolicy))

      /**
       * @param snsCrudPolicy the value to be set.
       */
      override fun snsCrudPolicy(snsCrudPolicy: IResolvable) {
        cdkBuilder.snsCrudPolicy(snsCrudPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param snsCrudPolicy the value to be set.
       */
      override fun snsCrudPolicy(snsCrudPolicy: TopicSAMPTProperty) {
        cdkBuilder.snsCrudPolicy(snsCrudPolicy.let(TopicSAMPTProperty::unwrap))
      }

      /**
       * @param snsCrudPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c4057c5b0bbab9c1b2ccf03b0d391e72a82373ba995e1c10dd672ca0f9c366e")
      override fun snsCrudPolicy(snsCrudPolicy: TopicSAMPTProperty.Builder.() -> Unit): Unit =
          snsCrudPolicy(TopicSAMPTProperty(snsCrudPolicy))

      /**
       * @param snsPublishMessagePolicy the value to be set.
       */
      override fun snsPublishMessagePolicy(snsPublishMessagePolicy: IResolvable) {
        cdkBuilder.snsPublishMessagePolicy(snsPublishMessagePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param snsPublishMessagePolicy the value to be set.
       */
      override fun snsPublishMessagePolicy(snsPublishMessagePolicy: TopicSAMPTProperty) {
        cdkBuilder.snsPublishMessagePolicy(snsPublishMessagePolicy.let(TopicSAMPTProperty::unwrap))
      }

      /**
       * @param snsPublishMessagePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc55e7590d9b94a5f8c4a2388d03cc95ca0ebed643e7fa78210e83a8e246d861")
      override
          fun snsPublishMessagePolicy(snsPublishMessagePolicy: TopicSAMPTProperty.Builder.() -> Unit):
          Unit = snsPublishMessagePolicy(TopicSAMPTProperty(snsPublishMessagePolicy))

      /**
       * @param sqsPollerPolicy the value to be set.
       */
      override fun sqsPollerPolicy(sqsPollerPolicy: IResolvable) {
        cdkBuilder.sqsPollerPolicy(sqsPollerPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param sqsPollerPolicy the value to be set.
       */
      override fun sqsPollerPolicy(sqsPollerPolicy: QueueSAMPTProperty) {
        cdkBuilder.sqsPollerPolicy(sqsPollerPolicy.let(QueueSAMPTProperty::unwrap))
      }

      /**
       * @param sqsPollerPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7101881b6cbe7ba1feac75c8fbcfd98bebf10bcdc75fbfeff55c0e14d906c982")
      override fun sqsPollerPolicy(sqsPollerPolicy: QueueSAMPTProperty.Builder.() -> Unit): Unit =
          sqsPollerPolicy(QueueSAMPTProperty(sqsPollerPolicy))

      /**
       * @param sqsSendMessagePolicy the value to be set.
       */
      override fun sqsSendMessagePolicy(sqsSendMessagePolicy: IResolvable) {
        cdkBuilder.sqsSendMessagePolicy(sqsSendMessagePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param sqsSendMessagePolicy the value to be set.
       */
      override fun sqsSendMessagePolicy(sqsSendMessagePolicy: QueueSAMPTProperty) {
        cdkBuilder.sqsSendMessagePolicy(sqsSendMessagePolicy.let(QueueSAMPTProperty::unwrap))
      }

      /**
       * @param sqsSendMessagePolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ca4acba6248c758a73866e26d1d6a6b6cdf0020ccb8a9a054bd80eb091dd59e")
      override
          fun sqsSendMessagePolicy(sqsSendMessagePolicy: QueueSAMPTProperty.Builder.() -> Unit):
          Unit = sqsSendMessagePolicy(QueueSAMPTProperty(sqsSendMessagePolicy))

      /**
       * @param ssmParameterReadPolicy the value to be set.
       */
      override fun ssmParameterReadPolicy(ssmParameterReadPolicy: IResolvable) {
        cdkBuilder.ssmParameterReadPolicy(ssmParameterReadPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param ssmParameterReadPolicy the value to be set.
       */
      override fun ssmParameterReadPolicy(ssmParameterReadPolicy: ParameterNameSAMPTProperty) {
        cdkBuilder.ssmParameterReadPolicy(ssmParameterReadPolicy.let(ParameterNameSAMPTProperty::unwrap))
      }

      /**
       * @param ssmParameterReadPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("231e5ee73bf5944498d6179f6c96904f366b79450c2f757006426f67daee329e")
      override
          fun ssmParameterReadPolicy(ssmParameterReadPolicy: ParameterNameSAMPTProperty.Builder.() -> Unit):
          Unit = ssmParameterReadPolicy(ParameterNameSAMPTProperty(ssmParameterReadPolicy))

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      override fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      override
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.let(StateMachineSAMPTProperty::unwrap))
      }

      /**
       * @param stepFunctionsExecutionPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2c83d3f69a6c1351125785327861aae48077103d1ee36317d2ce12718746ecb")
      override
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty.Builder.() -> Unit):
          Unit =
          stepFunctionsExecutionPolicy(StateMachineSAMPTProperty(stepFunctionsExecutionPolicy))

      /**
       * @param vpcAccessPolicy the value to be set.
       */
      override fun vpcAccessPolicy(vpcAccessPolicy: IResolvable) {
        cdkBuilder.vpcAccessPolicy(vpcAccessPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param vpcAccessPolicy the value to be set.
       */
      override fun vpcAccessPolicy(vpcAccessPolicy: EmptySAMPTProperty) {
        cdkBuilder.vpcAccessPolicy(vpcAccessPolicy.let(EmptySAMPTProperty::unwrap))
      }

      /**
       * @param vpcAccessPolicy the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0617476e5af158f7e65497f2b8d8d8b420129b399f349dc1b88376d3ceb8b976")
      override fun vpcAccessPolicy(vpcAccessPolicy: EmptySAMPTProperty.Builder.() -> Unit): Unit =
          vpcAccessPolicy(EmptySAMPTProperty(vpcAccessPolicy))

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty,
    ) : CdkObject(cdkObject), SAMPolicyTemplateProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-amidescribepolicy)
       */
      override fun amiDescribePolicy(): Any? = unwrap(this).getAmiDescribePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-awssecretsmanagergetsecretvaluepolicy)
       */
      override fun awsSecretsManagerGetSecretValuePolicy(): Any? =
          unwrap(this).getAwsSecretsManagerGetSecretValuePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-cloudformationdescribestackspolicy)
       */
      override fun cloudFormationDescribeStacksPolicy(): Any? =
          unwrap(this).getCloudFormationDescribeStacksPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-cloudwatchputmetricpolicy)
       */
      override fun cloudWatchPutMetricPolicy(): Any? = unwrap(this).getCloudWatchPutMetricPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-dynamodbcrudpolicy)
       */
      override fun dynamoDbCrudPolicy(): Any? = unwrap(this).getDynamoDbCrudPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-dynamodbreadpolicy)
       */
      override fun dynamoDbReadPolicy(): Any? = unwrap(this).getDynamoDbReadPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-dynamodbstreamreadpolicy)
       */
      override fun dynamoDbStreamReadPolicy(): Any? = unwrap(this).getDynamoDbStreamReadPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-dynamodbwritepolicy)
       */
      override fun dynamoDbWritePolicy(): Any? = unwrap(this).getDynamoDbWritePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-ec2describepolicy)
       */
      override fun ec2DescribePolicy(): Any? = unwrap(this).getEc2DescribePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-elasticsearchhttppostpolicy)
       */
      override fun elasticsearchHttpPostPolicy(): Any? =
          unwrap(this).getElasticsearchHttpPostPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-filterlogeventspolicy)
       */
      override fun filterLogEventsPolicy(): Any? = unwrap(this).getFilterLogEventsPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-kinesiscrudpolicy)
       */
      override fun kinesisCrudPolicy(): Any? = unwrap(this).getKinesisCrudPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-kinesisstreamreadpolicy)
       */
      override fun kinesisStreamReadPolicy(): Any? = unwrap(this).getKinesisStreamReadPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-kmsdecryptpolicy)
       */
      override fun kmsDecryptPolicy(): Any? = unwrap(this).getKmsDecryptPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-lambdainvokepolicy)
       */
      override fun lambdaInvokePolicy(): Any? = unwrap(this).getLambdaInvokePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitiondetectonlypolicy)
       */
      override fun rekognitionDetectOnlyPolicy(): Any? =
          unwrap(this).getRekognitionDetectOnlyPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitionlabelspolicy)
       */
      override fun rekognitionLabelsPolicy(): Any? = unwrap(this).getRekognitionLabelsPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitionnodataaccesspolicy)
       */
      override fun rekognitionNoDataAccessPolicy(): Any? =
          unwrap(this).getRekognitionNoDataAccessPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitionreadpolicy)
       */
      override fun rekognitionReadPolicy(): Any? = unwrap(this).getRekognitionReadPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-rekognitionwriteonlyaccesspolicy)
       */
      override fun rekognitionWriteOnlyAccessPolicy(): Any? =
          unwrap(this).getRekognitionWriteOnlyAccessPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-s3crudpolicy)
       */
      override fun s3CrudPolicy(): Any? = unwrap(this).getS3CrudPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-s3readpolicy)
       */
      override fun s3ReadPolicy(): Any? = unwrap(this).getS3ReadPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-s3writepolicy)
       */
      override fun s3WritePolicy(): Any? = unwrap(this).getS3WritePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sesbulktemplatedcrudpolicy)
       */
      override fun sesBulkTemplatedCrudPolicy(): Any? = unwrap(this).getSesBulkTemplatedCrudPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sescrudpolicy)
       */
      override fun sesCrudPolicy(): Any? = unwrap(this).getSesCrudPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sesemailtemplatecrudpolicy)
       */
      override fun sesEmailTemplateCrudPolicy(): Any? = unwrap(this).getSesEmailTemplateCrudPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sessendbouncepolicy)
       */
      override fun sesSendBouncePolicy(): Any? = unwrap(this).getSesSendBouncePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-snscrudpolicy)
       */
      override fun snsCrudPolicy(): Any? = unwrap(this).getSnsCrudPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-snspublishmessagepolicy)
       */
      override fun snsPublishMessagePolicy(): Any? = unwrap(this).getSnsPublishMessagePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sqspollerpolicy)
       */
      override fun sqsPollerPolicy(): Any? = unwrap(this).getSqsPollerPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-sqssendmessagepolicy)
       */
      override fun sqsSendMessagePolicy(): Any? = unwrap(this).getSqsSendMessagePolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-ssmparameterreadpolicy)
       */
      override fun ssmParameterReadPolicy(): Any? = unwrap(this).getSsmParameterReadPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-stepfunctionsexecutionpolicy)
       */
      override fun stepFunctionsExecutionPolicy(): Any? =
          unwrap(this).getStepFunctionsExecutionPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html#cfn-serverless-function-sampolicytemplate-vpcaccesspolicy)
       */
      override fun vpcAccessPolicy(): Any? = unwrap(this).getVpcAccessPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SAMPolicyTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty):
          SAMPolicyTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SAMPolicyTemplateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAMPolicyTemplateProperty):
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * SNSEventProperty sNSEventProperty = SNSEventProperty.builder()
   * .topic("topic")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-snsevent.html)
   */
  public interface SNSEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-snsevent.html#cfn-serverless-function-snsevent-topic)
     */
    public fun topic(): String

    /**
     * A builder for [SNSEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param topic the value to be set. 
       */
      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.builder()

      /**
       * @param topic the value to be set. 
       */
      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty,
    ) : CdkObject(cdkObject), SNSEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-snsevent.html#cfn-serverless-function-snsevent-topic)
       */
      override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SNSEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty):
          SNSEventProperty = CdkObjectWrappers.wrap(cdkObject) as? SNSEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SNSEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * SQSEventProperty sQSEventProperty = SQSEventProperty.builder()
   * .queue("queue")
   * // the properties below are optional
   * .batchSize(123)
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html)
   */
  public interface SQSEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html#cfn-serverless-function-sqsevent-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html#cfn-serverless-function-sqsevent-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html#cfn-serverless-function-sqsevent-queue)
     */
    public fun queue(): String

    /**
     * A builder for [SQSEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize the value to be set.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param queue the value to be set. 
       */
      public fun queue(queue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.builder()

      /**
       * @param batchSize the value to be set.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param queue the value to be set. 
       */
      override fun queue(queue: String) {
        cdkBuilder.queue(queue)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty,
    ) : CdkObject(cdkObject), SQSEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html#cfn-serverless-function-sqsevent-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html#cfn-serverless-function-sqsevent-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html#cfn-serverless-function-sqsevent-queue)
       */
      override fun queue(): String = unwrap(this).getQueue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SQSEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty):
          SQSEventProperty = CdkObjectWrappers.wrap(cdkObject) as? SQSEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SQSEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * ScheduleEventProperty scheduleEventProperty = ScheduleEventProperty.builder()
   * .schedule("schedule")
   * // the properties below are optional
   * .description("description")
   * .enabled(false)
   * .input("input")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html)
   */
  public interface ScheduleEventProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-schedule)
     */
    public fun schedule(): String

    /**
     * A builder for [ScheduleEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description the value to be set.
       */
      public fun description(description: String)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param input the value to be set.
       */
      public fun input(input: String)

      /**
       * @param name the value to be set.
       */
      public fun name(name: String)

      /**
       * @param schedule the value to be set. 
       */
      public fun schedule(schedule: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.builder()

      /**
       * @param description the value to be set.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param input the value to be set.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param schedule the value to be set. 
       */
      override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty,
    ) : CdkObject(cdkObject), ScheduleEventProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html#cfn-serverless-function-scheduleevent-schedule)
       */
      override fun schedule(): String = unwrap(this).getSchedule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty):
          ScheduleEventProperty = CdkObjectWrappers.wrap(cdkObject) as? ScheduleEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * SecretArnSAMPTProperty secretArnSAMPTProperty = SecretArnSAMPTProperty.builder()
   * .secretArn("secretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-secretarnsampt.html)
   */
  public interface SecretArnSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-secretarnsampt.html#cfn-serverless-function-secretarnsampt-secretarn)
     */
    public fun secretArn(): String

    /**
     * A builder for [SecretArnSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretArn the value to be set. 
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty.builder()

      /**
       * @param secretArn the value to be set. 
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty,
    ) : CdkObject(cdkObject), SecretArnSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-secretarnsampt.html#cfn-serverless-function-secretarnsampt-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecretArnSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty):
          SecretArnSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? SecretArnSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretArnSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * StateMachineSAMPTProperty stateMachineSAMPTProperty = StateMachineSAMPTProperty.builder()
   * .stateMachineName("stateMachineName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-statemachinesampt.html)
   */
  public interface StateMachineSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-statemachinesampt.html#cfn-serverless-function-statemachinesampt-statemachinename)
     */
    public fun stateMachineName(): String

    /**
     * A builder for [StateMachineSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stateMachineName the value to be set. 
       */
      public fun stateMachineName(stateMachineName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty.builder()

      /**
       * @param stateMachineName the value to be set. 
       */
      override fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty,
    ) : CdkObject(cdkObject), StateMachineSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-statemachinesampt.html#cfn-serverless-function-statemachinesampt-statemachinename)
       */
      override fun stateMachineName(): String = unwrap(this).getStateMachineName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StateMachineSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty):
          StateMachineSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StateMachineSAMPTProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StateMachineSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * StreamSAMPTProperty streamSAMPTProperty = StreamSAMPTProperty.builder()
   * .streamName("streamName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-streamsampt.html)
   */
  public interface StreamSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-streamsampt.html#cfn-serverless-function-streamsampt-streamname)
     */
    public fun streamName(): String

    /**
     * A builder for [StreamSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param streamName the value to be set. 
       */
      public fun streamName(streamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty.builder()

      /**
       * @param streamName the value to be set. 
       */
      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty,
    ) : CdkObject(cdkObject), StreamSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-streamsampt.html#cfn-serverless-function-streamsampt-streamname)
       */
      override fun streamName(): String = unwrap(this).getStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty):
          StreamSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? StreamSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * TableSAMPTProperty tableSAMPTProperty = TableSAMPTProperty.builder()
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablesampt.html)
   */
  public interface TableSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablesampt.html#cfn-serverless-function-tablesampt-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [TableSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tableName the value to be set. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty.builder()

      /**
       * @param tableName the value to be set. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty,
    ) : CdkObject(cdkObject), TableSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablesampt.html#cfn-serverless-function-tablesampt-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty):
          TableSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? TableSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * TableStreamSAMPTProperty tableStreamSAMPTProperty = TableStreamSAMPTProperty.builder()
   * .streamName("streamName")
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablestreamsampt.html)
   */
  public interface TableStreamSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablestreamsampt.html#cfn-serverless-function-tablestreamsampt-streamname)
     */
    public fun streamName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablestreamsampt.html#cfn-serverless-function-tablestreamsampt-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [TableStreamSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param streamName the value to be set. 
       */
      public fun streamName(streamName: String)

      /**
       * @param tableName the value to be set. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty.builder()

      /**
       * @param streamName the value to be set. 
       */
      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      /**
       * @param tableName the value to be set. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty,
    ) : CdkObject(cdkObject), TableStreamSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablestreamsampt.html#cfn-serverless-function-tablestreamsampt-streamname)
       */
      override fun streamName(): String = unwrap(this).getStreamName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablestreamsampt.html#cfn-serverless-function-tablestreamsampt-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableStreamSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty):
          TableStreamSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? TableStreamSAMPTProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableStreamSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * TopicSAMPTProperty topicSAMPTProperty = TopicSAMPTProperty.builder()
   * .topicName("topicName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-topicsampt.html)
   */
  public interface TopicSAMPTProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-topicsampt.html#cfn-serverless-function-topicsampt-topicname)
     */
    public fun topicName(): String

    /**
     * A builder for [TopicSAMPTProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param topicName the value to be set. 
       */
      public fun topicName(topicName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty.builder()

      /**
       * @param topicName the value to be set. 
       */
      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty,
    ) : CdkObject(cdkObject), TopicSAMPTProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-topicsampt.html#cfn-serverless-function-topicsampt-topicname)
       */
      override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty):
          TopicSAMPTProperty = CdkObjectWrappers.wrap(cdkObject) as? TopicSAMPTProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-vpcconfig.html#cfn-serverless-function-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-vpcconfig.html#cfn-serverless-function-vpcconfig-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds the value to be set. 
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds the value to be set. 
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds the value to be set. 
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds the value to be set. 
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds the value to be set. 
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds the value to be set. 
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds the value to be set. 
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds the value to be set. 
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-vpcconfig.html#cfn-serverless-function-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-vpcconfig.html#cfn-serverless-function-vpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty
    }
  }
}
