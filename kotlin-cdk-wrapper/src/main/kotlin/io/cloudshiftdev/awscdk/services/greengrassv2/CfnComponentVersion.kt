@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrassv2

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
 * Creates a component.
 *
 * Components are software that run on AWS IoT Greengrass core devices. After you develop and test a
 * component on your core device, you can use this operation to upload your component to AWS IoT
 * Greengrass . Then, you can deploy the component to other core devices.
 *
 * You can use this operation to do the following:
 *
 * * *Create components from recipes*
 *
 * Create a component from a recipe, which is a file that defines the component's metadata,
 * parameters, dependencies, lifecycle, artifacts, and platform capability. For more information, see
 * [AWS IoT Greengrass component recipe
 * reference](https://docs.aws.amazon.com/greengrass/v2/developerguide/component-recipe-reference.html)
 * in the *AWS IoT Greengrass V2 Developer Guide* .
 *
 * To create a component from a recipe, specify `inlineRecipe` when you call this operation.
 *
 * * *Create components from Lambda functions*
 *
 * Create a component from an AWS Lambda function that runs on AWS IoT Greengrass . This creates a
 * recipe and artifacts from the Lambda function's deployment package. You can use this operation to
 * migrate Lambda functions from AWS IoT Greengrass V1 to AWS IoT Greengrass V2 .
 *
 * This function accepts Lambda functions in all supported versions of Python, Node.js, and Java
 * runtimes. AWS IoT Greengrass doesn't apply any additional restrictions on deprecated Lambda runtime
 * versions.
 *
 * To create a component from a Lambda function, specify `lambdaFunction` when you call this
 * operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
 * CfnComponentVersion cfnComponentVersion = CfnComponentVersion.Builder.create(this,
 * "MyCfnComponentVersion")
 * .inlineRecipe("inlineRecipe")
 * .lambdaFunction(LambdaFunctionRecipeSourceProperty.builder()
 * .componentDependencies(Map.of(
 * "componentDependenciesKey", ComponentDependencyRequirementProperty.builder()
 * .dependencyType("dependencyType")
 * .versionRequirement("versionRequirement")
 * .build()))
 * .componentLambdaParameters(LambdaExecutionParametersProperty.builder()
 * .environmentVariables(Map.of(
 * "environmentVariablesKey", "environmentVariables"))
 * .eventSources(List.of(LambdaEventSourceProperty.builder()
 * .topic("topic")
 * .type("type")
 * .build()))
 * .execArgs(List.of("execArgs"))
 * .inputPayloadEncodingType("inputPayloadEncodingType")
 * .linuxProcessParams(LambdaLinuxProcessParamsProperty.builder()
 * .containerParams(LambdaContainerParamsProperty.builder()
 * .devices(List.of(LambdaDeviceMountProperty.builder()
 * .addGroupOwner(false)
 * .path("path")
 * .permission("permission")
 * .build()))
 * .memorySizeInKb(123)
 * .mountRoSysfs(false)
 * .volumes(List.of(LambdaVolumeMountProperty.builder()
 * .addGroupOwner(false)
 * .destinationPath("destinationPath")
 * .permission("permission")
 * .sourcePath("sourcePath")
 * .build()))
 * .build())
 * .isolationMode("isolationMode")
 * .build())
 * .maxIdleTimeInSeconds(123)
 * .maxInstancesCount(123)
 * .maxQueueSize(123)
 * .pinned(false)
 * .statusTimeoutInSeconds(123)
 * .timeoutInSeconds(123)
 * .build())
 * .componentName("componentName")
 * .componentPlatforms(List.of(ComponentPlatformProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .name("name")
 * .build()))
 * .componentVersion("componentVersion")
 * .lambdaArn("lambdaArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html)
 */
public open class CfnComponentVersion(
  cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.greengrassv2.CfnComponentVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnComponentVersionProps,
  ) :
      this(software.amazon.awscdk.services.greengrassv2.CfnComponentVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnComponentVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnComponentVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnComponentVersionProps(props)
  )

  /**
   * The ARN of the component version.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the component.
   */
  public open fun attrComponentName(): String = unwrap(this).getAttrComponentName()

  /**
   * The version of the component.
   */
  public open fun attrComponentVersion(): String = unwrap(this).getAttrComponentVersion()

  /**
   * The recipe to use to create the component.
   */
  public open fun inlineRecipe(): String? = unwrap(this).getInlineRecipe()

  /**
   * The recipe to use to create the component.
   */
  public open fun inlineRecipe(`value`: String) {
    unwrap(this).setInlineRecipe(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The parameters to create a component from a Lambda function.
   */
  public open fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

  /**
   * The parameters to create a component from a Lambda function.
   */
  public open fun lambdaFunction(`value`: IResolvable) {
    unwrap(this).setLambdaFunction(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The parameters to create a component from a Lambda function.
   */
  public open fun lambdaFunction(`value`: LambdaFunctionRecipeSourceProperty) {
    unwrap(this).setLambdaFunction(`value`.let(LambdaFunctionRecipeSourceProperty.Companion::unwrap))
  }

  /**
   * The parameters to create a component from a Lambda function.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("912ee6c56bce82fb0485702ee19ea7213703738006edcfcf3f479d7751a1fb67")
  public open fun lambdaFunction(`value`: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit):
      Unit = lambdaFunction(LambdaFunctionRecipeSourceProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the component version.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Application-specific metadata to attach to the component version.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrassv2.CfnComponentVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The recipe to use to create the component.
     *
     * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
     * and platform compatibility.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-inlinerecipe)
     * @param inlineRecipe The recipe to use to create the component. 
     */
    public fun inlineRecipe(inlineRecipe: String)

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     * @param lambdaFunction The parameters to create a component from a Lambda function. 
     */
    public fun lambdaFunction(lambdaFunction: IResolvable)

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     * @param lambdaFunction The parameters to create a component from a Lambda function. 
     */
    public fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty)

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     * @param lambdaFunction The parameters to create a component from a Lambda function. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1256639b251728b2059a1b5b692c31dd46259d0bedee6a8d593077e4904deb9")
    public fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit)

    /**
     * Application-specific metadata to attach to the component version.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tag your AWS IoT
     * Greengrass Version 2
     * resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html) in the
     * *AWS IoT Greengrass V2 Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-tags)
     * @param tags Application-specific metadata to attach to the component version. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.Builder
        = software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.Builder.create(scope, id)

    /**
     * The recipe to use to create the component.
     *
     * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
     * and platform compatibility.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-inlinerecipe)
     * @param inlineRecipe The recipe to use to create the component. 
     */
    override fun inlineRecipe(inlineRecipe: String) {
      cdkBuilder.inlineRecipe(inlineRecipe)
    }

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     * @param lambdaFunction The parameters to create a component from a Lambda function. 
     */
    override fun lambdaFunction(lambdaFunction: IResolvable) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IResolvable.Companion::unwrap))
    }

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     * @param lambdaFunction The parameters to create a component from a Lambda function. 
     */
    override fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(LambdaFunctionRecipeSourceProperty.Companion::unwrap))
    }

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     * @param lambdaFunction The parameters to create a component from a Lambda function. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1256639b251728b2059a1b5b692c31dd46259d0bedee6a8d593077e4904deb9")
    override
        fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit):
        Unit = lambdaFunction(LambdaFunctionRecipeSourceProperty(lambdaFunction))

    /**
     * Application-specific metadata to attach to the component version.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tag your AWS IoT
     * Greengrass Version 2
     * resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html) in the
     * *AWS IoT Greengrass V2 Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-tags)
     * @param tags Application-specific metadata to attach to the component version. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponentVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponentVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion):
        CfnComponentVersion = CfnComponentVersion(cdkObject)

    internal fun unwrap(wrapped: CfnComponentVersion):
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
  }

  /**
   * Contains information about a component dependency for a Lambda function component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * ComponentDependencyRequirementProperty componentDependencyRequirementProperty =
   * ComponentDependencyRequirementProperty.builder()
   * .dependencyType("dependencyType")
   * .versionRequirement("versionRequirement")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentdependencyrequirement.html)
   */
  public interface ComponentDependencyRequirementProperty {
    /**
     * The type of this dependency. Choose from the following options:.
     *
     * * `SOFT` – The component doesn't restart if the dependency changes state.
     * * `HARD` – The component restarts if the dependency changes state.
     *
     * Default: `HARD`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentdependencyrequirement.html#cfn-greengrassv2-componentversion-componentdependencyrequirement-dependencytype)
     */
    public fun dependencyType(): String? = unwrap(this).getDependencyType()

    /**
     * The component version requirement for the component dependency.
     *
     * AWS IoT Greengrass uses semantic version constraints. For more information, see [Semantic
     * Versioning](https://docs.aws.amazon.com/https://semver.org/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentdependencyrequirement.html#cfn-greengrassv2-componentversion-componentdependencyrequirement-versionrequirement)
     */
    public fun versionRequirement(): String? = unwrap(this).getVersionRequirement()

    /**
     * A builder for [ComponentDependencyRequirementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dependencyType The type of this dependency. Choose from the following options:.
       * * `SOFT` – The component doesn't restart if the dependency changes state.
       * * `HARD` – The component restarts if the dependency changes state.
       *
       * Default: `HARD`
       */
      public fun dependencyType(dependencyType: String)

      /**
       * @param versionRequirement The component version requirement for the component dependency.
       * AWS IoT Greengrass uses semantic version constraints. For more information, see [Semantic
       * Versioning](https://docs.aws.amazon.com/https://semver.org/) .
       */
      public fun versionRequirement(versionRequirement: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty.builder()

      /**
       * @param dependencyType The type of this dependency. Choose from the following options:.
       * * `SOFT` – The component doesn't restart if the dependency changes state.
       * * `HARD` – The component restarts if the dependency changes state.
       *
       * Default: `HARD`
       */
      override fun dependencyType(dependencyType: String) {
        cdkBuilder.dependencyType(dependencyType)
      }

      /**
       * @param versionRequirement The component version requirement for the component dependency.
       * AWS IoT Greengrass uses semantic version constraints. For more information, see [Semantic
       * Versioning](https://docs.aws.amazon.com/https://semver.org/) .
       */
      override fun versionRequirement(versionRequirement: String) {
        cdkBuilder.versionRequirement(versionRequirement)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty,
    ) : CdkObject(cdkObject), ComponentDependencyRequirementProperty {
      /**
       * The type of this dependency. Choose from the following options:.
       *
       * * `SOFT` – The component doesn't restart if the dependency changes state.
       * * `HARD` – The component restarts if the dependency changes state.
       *
       * Default: `HARD`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentdependencyrequirement.html#cfn-greengrassv2-componentversion-componentdependencyrequirement-dependencytype)
       */
      override fun dependencyType(): String? = unwrap(this).getDependencyType()

      /**
       * The component version requirement for the component dependency.
       *
       * AWS IoT Greengrass uses semantic version constraints. For more information, see [Semantic
       * Versioning](https://docs.aws.amazon.com/https://semver.org/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentdependencyrequirement.html#cfn-greengrassv2-componentversion-componentdependencyrequirement-versionrequirement)
       */
      override fun versionRequirement(): String? = unwrap(this).getVersionRequirement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentDependencyRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty):
          ComponentDependencyRequirementProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentDependencyRequirementProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentDependencyRequirementProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty
    }
  }

  /**
   * Contains information about a platform that a component supports.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * ComponentPlatformProperty componentPlatformProperty = ComponentPlatformProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentplatform.html)
   */
  public interface ComponentPlatformProperty {
    /**
     * A dictionary of attributes for the platform.
     *
     * The AWS IoT Greengrass Core software defines the `os` and `platform` by default. You can
     * specify additional platform attributes for a core device when you deploy the AWS IoT Greengrass
     * nucleus component. For more information, see the [AWS IoT Greengrass nucleus
     * component](https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentplatform.html#cfn-greengrassv2-componentversion-componentplatform-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The friendly name of the platform. This name helps you identify the platform.
     *
     * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the `os` and
     * `architecture` of the platform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentplatform.html#cfn-greengrassv2-componentversion-componentplatform-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [ComponentPlatformProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes A dictionary of attributes for the platform.
       * The AWS IoT Greengrass Core software defines the `os` and `platform` by default. You can
       * specify additional platform attributes for a core device when you deploy the AWS IoT
       * Greengrass nucleus component. For more information, see the [AWS IoT Greengrass nucleus
       * component](https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes A dictionary of attributes for the platform.
       * The AWS IoT Greengrass Core software defines the `os` and `platform` by default. You can
       * specify additional platform attributes for a core device when you deploy the AWS IoT
       * Greengrass nucleus component. For more information, see the [AWS IoT Greengrass nucleus
       * component](https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      public fun attributes(attributes: Map<String, String>)

      /**
       * @param name The friendly name of the platform. This name helps you identify the platform.
       * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the `os` and
       * `architecture` of the platform.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty.builder()

      /**
       * @param attributes A dictionary of attributes for the platform.
       * The AWS IoT Greengrass Core software defines the `os` and `platform` by default. You can
       * specify additional platform attributes for a core device when you deploy the AWS IoT
       * Greengrass nucleus component. For more information, see the [AWS IoT Greengrass nucleus
       * component](https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attributes A dictionary of attributes for the platform.
       * The AWS IoT Greengrass Core software defines the `os` and `platform` by default. You can
       * specify additional platform attributes for a core device when you deploy the AWS IoT
       * Greengrass nucleus component. For more information, see the [AWS IoT Greengrass nucleus
       * component](https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param name The friendly name of the platform. This name helps you identify the platform.
       * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the `os` and
       * `architecture` of the platform.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty,
    ) : CdkObject(cdkObject), ComponentPlatformProperty {
      /**
       * A dictionary of attributes for the platform.
       *
       * The AWS IoT Greengrass Core software defines the `os` and `platform` by default. You can
       * specify additional platform attributes for a core device when you deploy the AWS IoT
       * Greengrass nucleus component. For more information, see the [AWS IoT Greengrass nucleus
       * component](https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentplatform.html#cfn-greengrassv2-componentversion-componentplatform-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()

      /**
       * The friendly name of the platform. This name helps you identify the platform.
       *
       * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the `os` and
       * `architecture` of the platform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentplatform.html#cfn-greengrassv2-componentversion-componentplatform-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentPlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty):
          ComponentPlatformProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentPlatformProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentPlatformProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty
    }
  }

  /**
   * Contains information about a container in which AWS Lambda functions run on AWS IoT Greengrass
   * core devices.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * LambdaContainerParamsProperty lambdaContainerParamsProperty =
   * LambdaContainerParamsProperty.builder()
   * .devices(List.of(LambdaDeviceMountProperty.builder()
   * .addGroupOwner(false)
   * .path("path")
   * .permission("permission")
   * .build()))
   * .memorySizeInKb(123)
   * .mountRoSysfs(false)
   * .volumes(List.of(LambdaVolumeMountProperty.builder()
   * .addGroupOwner(false)
   * .destinationPath("destinationPath")
   * .permission("permission")
   * .sourcePath("sourcePath")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html)
   */
  public interface LambdaContainerParamsProperty {
    /**
     * The list of system devices that the container can access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html#cfn-greengrassv2-componentversion-lambdacontainerparams-devices)
     */
    public fun devices(): Any? = unwrap(this).getDevices()

    /**
     * The memory size of the container, expressed in kilobytes.
     *
     * Default: `16384` (16 MB)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html#cfn-greengrassv2-componentversion-lambdacontainerparams-memorysizeinkb)
     */
    public fun memorySizeInKb(): Number? = unwrap(this).getMemorySizeInKb()

    /**
     * Whether or not the container can read information from the device's `/sys` folder.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html#cfn-greengrassv2-componentversion-lambdacontainerparams-mountrosysfs)
     */
    public fun mountRoSysfs(): Any? = unwrap(this).getMountRoSysfs()

    /**
     * The list of volumes that the container can access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html#cfn-greengrassv2-componentversion-lambdacontainerparams-volumes)
     */
    public fun volumes(): Any? = unwrap(this).getVolumes()

    /**
     * A builder for [LambdaContainerParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param devices The list of system devices that the container can access.
       */
      public fun devices(devices: IResolvable)

      /**
       * @param devices The list of system devices that the container can access.
       */
      public fun devices(devices: List<Any>)

      /**
       * @param devices The list of system devices that the container can access.
       */
      public fun devices(vararg devices: Any)

      /**
       * @param memorySizeInKb The memory size of the container, expressed in kilobytes.
       * Default: `16384` (16 MB)
       */
      public fun memorySizeInKb(memorySizeInKb: Number)

      /**
       * @param mountRoSysfs Whether or not the container can read information from the device's
       * `/sys` folder.
       * Default: `false`
       */
      public fun mountRoSysfs(mountRoSysfs: Boolean)

      /**
       * @param mountRoSysfs Whether or not the container can read information from the device's
       * `/sys` folder.
       * Default: `false`
       */
      public fun mountRoSysfs(mountRoSysfs: IResolvable)

      /**
       * @param volumes The list of volumes that the container can access.
       */
      public fun volumes(volumes: IResolvable)

      /**
       * @param volumes The list of volumes that the container can access.
       */
      public fun volumes(volumes: List<Any>)

      /**
       * @param volumes The list of volumes that the container can access.
       */
      public fun volumes(vararg volumes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty.builder()

      /**
       * @param devices The list of system devices that the container can access.
       */
      override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param devices The list of system devices that the container can access.
       */
      override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param devices The list of system devices that the container can access.
       */
      override fun devices(vararg devices: Any): Unit = devices(devices.toList())

      /**
       * @param memorySizeInKb The memory size of the container, expressed in kilobytes.
       * Default: `16384` (16 MB)
       */
      override fun memorySizeInKb(memorySizeInKb: Number) {
        cdkBuilder.memorySizeInKb(memorySizeInKb)
      }

      /**
       * @param mountRoSysfs Whether or not the container can read information from the device's
       * `/sys` folder.
       * Default: `false`
       */
      override fun mountRoSysfs(mountRoSysfs: Boolean) {
        cdkBuilder.mountRoSysfs(mountRoSysfs)
      }

      /**
       * @param mountRoSysfs Whether or not the container can read information from the device's
       * `/sys` folder.
       * Default: `false`
       */
      override fun mountRoSysfs(mountRoSysfs: IResolvable) {
        cdkBuilder.mountRoSysfs(mountRoSysfs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param volumes The list of volumes that the container can access.
       */
      override fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param volumes The list of volumes that the container can access.
       */
      override fun volumes(volumes: List<Any>) {
        cdkBuilder.volumes(volumes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param volumes The list of volumes that the container can access.
       */
      override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty,
    ) : CdkObject(cdkObject), LambdaContainerParamsProperty {
      /**
       * The list of system devices that the container can access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html#cfn-greengrassv2-componentversion-lambdacontainerparams-devices)
       */
      override fun devices(): Any? = unwrap(this).getDevices()

      /**
       * The memory size of the container, expressed in kilobytes.
       *
       * Default: `16384` (16 MB)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html#cfn-greengrassv2-componentversion-lambdacontainerparams-memorysizeinkb)
       */
      override fun memorySizeInKb(): Number? = unwrap(this).getMemorySizeInKb()

      /**
       * Whether or not the container can read information from the device's `/sys` folder.
       *
       * Default: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html#cfn-greengrassv2-componentversion-lambdacontainerparams-mountrosysfs)
       */
      override fun mountRoSysfs(): Any? = unwrap(this).getMountRoSysfs()

      /**
       * The list of volumes that the container can access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html#cfn-greengrassv2-componentversion-lambdacontainerparams-volumes)
       */
      override fun volumes(): Any? = unwrap(this).getVolumes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaContainerParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty):
          LambdaContainerParamsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaContainerParamsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaContainerParamsProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty
    }
  }

  /**
   * Contains information about a device that Linux processes in a container can access.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * LambdaDeviceMountProperty lambdaDeviceMountProperty = LambdaDeviceMountProperty.builder()
   * .addGroupOwner(false)
   * .path("path")
   * .permission("permission")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html)
   */
  public interface LambdaDeviceMountProperty {
    /**
     * Whether or not to add the component's system user as an owner of the device.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html#cfn-greengrassv2-componentversion-lambdadevicemount-addgroupowner)
     */
    public fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

    /**
     * The mount path for the device in the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html#cfn-greengrassv2-componentversion-lambdadevicemount-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The permission to access the device: read/only ( `ro` ) or read/write ( `rw` ).
     *
     * Default: `ro`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html#cfn-greengrassv2-componentversion-lambdadevicemount-permission)
     */
    public fun permission(): String? = unwrap(this).getPermission()

    /**
     * A builder for [LambdaDeviceMountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addGroupOwner Whether or not to add the component's system user as an owner of the
       * device.
       * Default: `false`
       */
      public fun addGroupOwner(addGroupOwner: Boolean)

      /**
       * @param addGroupOwner Whether or not to add the component's system user as an owner of the
       * device.
       * Default: `false`
       */
      public fun addGroupOwner(addGroupOwner: IResolvable)

      /**
       * @param path The mount path for the device in the file system.
       */
      public fun path(path: String)

      /**
       * @param permission The permission to access the device: read/only ( `ro` ) or read/write (
       * `rw` ).
       * Default: `ro`
       */
      public fun permission(permission: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty.builder()

      /**
       * @param addGroupOwner Whether or not to add the component's system user as an owner of the
       * device.
       * Default: `false`
       */
      override fun addGroupOwner(addGroupOwner: Boolean) {
        cdkBuilder.addGroupOwner(addGroupOwner)
      }

      /**
       * @param addGroupOwner Whether or not to add the component's system user as an owner of the
       * device.
       * Default: `false`
       */
      override fun addGroupOwner(addGroupOwner: IResolvable) {
        cdkBuilder.addGroupOwner(addGroupOwner.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param path The mount path for the device in the file system.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param permission The permission to access the device: read/only ( `ro` ) or read/write (
       * `rw` ).
       * Default: `ro`
       */
      override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty,
    ) : CdkObject(cdkObject), LambdaDeviceMountProperty {
      /**
       * Whether or not to add the component's system user as an owner of the device.
       *
       * Default: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html#cfn-greengrassv2-componentversion-lambdadevicemount-addgroupowner)
       */
      override fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

      /**
       * The mount path for the device in the file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html#cfn-greengrassv2-componentversion-lambdadevicemount-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * The permission to access the device: read/only ( `ro` ) or read/write ( `rw` ).
       *
       * Default: `ro`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html#cfn-greengrassv2-componentversion-lambdadevicemount-permission)
       */
      override fun permission(): String? = unwrap(this).getPermission()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeviceMountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty):
          LambdaDeviceMountProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaDeviceMountProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaDeviceMountProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty
    }
  }

  /**
   * Contains information about an event source for an AWS Lambda function.
   *
   * The event source defines the topics on which this Lambda function subscribes to receive
   * messages that run the function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * LambdaEventSourceProperty lambdaEventSourceProperty = LambdaEventSourceProperty.builder()
   * .topic("topic")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaeventsource.html)
   */
  public interface LambdaEventSourceProperty {
    /**
     * The topic to which to subscribe to receive event messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaeventsource.html#cfn-greengrassv2-componentversion-lambdaeventsource-topic)
     */
    public fun topic(): String? = unwrap(this).getTopic()

    /**
     * The type of event source. Choose from the following options:.
     *
     * * `PUB_SUB` – Subscribe to local publish/subscribe messages. This event source type doesn't
     * support MQTT wildcards ( `+` and `#` ) in the event source topic.
     * * `IOT_CORE` – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT
     * wildcards ( `+` and `#` ) in the event source topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaeventsource.html#cfn-greengrassv2-componentversion-lambdaeventsource-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [LambdaEventSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param topic The topic to which to subscribe to receive event messages.
       */
      public fun topic(topic: String)

      /**
       * @param type The type of event source. Choose from the following options:.
       * * `PUB_SUB` – Subscribe to local publish/subscribe messages. This event source type doesn't
       * support MQTT wildcards ( `+` and `#` ) in the event source topic.
       * * `IOT_CORE` – Subscribe to AWS IoT Core MQTT messages. This event source type supports
       * MQTT wildcards ( `+` and `#` ) in the event source topic.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty.builder()

      /**
       * @param topic The topic to which to subscribe to receive event messages.
       */
      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      /**
       * @param type The type of event source. Choose from the following options:.
       * * `PUB_SUB` – Subscribe to local publish/subscribe messages. This event source type doesn't
       * support MQTT wildcards ( `+` and `#` ) in the event source topic.
       * * `IOT_CORE` – Subscribe to AWS IoT Core MQTT messages. This event source type supports
       * MQTT wildcards ( `+` and `#` ) in the event source topic.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty,
    ) : CdkObject(cdkObject), LambdaEventSourceProperty {
      /**
       * The topic to which to subscribe to receive event messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaeventsource.html#cfn-greengrassv2-componentversion-lambdaeventsource-topic)
       */
      override fun topic(): String? = unwrap(this).getTopic()

      /**
       * The type of event source. Choose from the following options:.
       *
       * * `PUB_SUB` – Subscribe to local publish/subscribe messages. This event source type doesn't
       * support MQTT wildcards ( `+` and `#` ) in the event source topic.
       * * `IOT_CORE` – Subscribe to AWS IoT Core MQTT messages. This event source type supports
       * MQTT wildcards ( `+` and `#` ) in the event source topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaeventsource.html#cfn-greengrassv2-componentversion-lambdaeventsource-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaEventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty):
          LambdaEventSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaEventSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaEventSourceProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty
    }
  }

  /**
   * Contains parameters for a Lambda function that runs on AWS IoT Greengrass .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * LambdaExecutionParametersProperty lambdaExecutionParametersProperty =
   * LambdaExecutionParametersProperty.builder()
   * .environmentVariables(Map.of(
   * "environmentVariablesKey", "environmentVariables"))
   * .eventSources(List.of(LambdaEventSourceProperty.builder()
   * .topic("topic")
   * .type("type")
   * .build()))
   * .execArgs(List.of("execArgs"))
   * .inputPayloadEncodingType("inputPayloadEncodingType")
   * .linuxProcessParams(LambdaLinuxProcessParamsProperty.builder()
   * .containerParams(LambdaContainerParamsProperty.builder()
   * .devices(List.of(LambdaDeviceMountProperty.builder()
   * .addGroupOwner(false)
   * .path("path")
   * .permission("permission")
   * .build()))
   * .memorySizeInKb(123)
   * .mountRoSysfs(false)
   * .volumes(List.of(LambdaVolumeMountProperty.builder()
   * .addGroupOwner(false)
   * .destinationPath("destinationPath")
   * .permission("permission")
   * .sourcePath("sourcePath")
   * .build()))
   * .build())
   * .isolationMode("isolationMode")
   * .build())
   * .maxIdleTimeInSeconds(123)
   * .maxInstancesCount(123)
   * .maxQueueSize(123)
   * .pinned(false)
   * .statusTimeoutInSeconds(123)
   * .timeoutInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html)
   */
  public interface LambdaExecutionParametersProperty {
    /**
     * The map of environment variables that are available to the Lambda function when it runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-environmentvariables)
     */
    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    /**
     * The list of event sources to which to subscribe to receive work messages.
     *
     * The Lambda function runs when it receives a message from an event source. You can subscribe
     * this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-eventsources)
     */
    public fun eventSources(): Any? = unwrap(this).getEventSources()

    /**
     * The list of arguments to pass to the Lambda function when it runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-execargs)
     */
    public fun execArgs(): List<String> = unwrap(this).getExecArgs() ?: emptyList()

    /**
     * The encoding type that the Lambda function supports.
     *
     * Default: `json`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-inputpayloadencodingtype)
     */
    public fun inputPayloadEncodingType(): String? = unwrap(this).getInputPayloadEncodingType()

    /**
     * The parameters for the Linux process that contains the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-linuxprocessparams)
     */
    public fun linuxProcessParams(): Any? = unwrap(this).getLinuxProcessParams()

    /**
     * The maximum amount of time in seconds that a non-pinned Lambda function can idle before the
     * AWS IoT Greengrass Core software stops its process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-maxidletimeinseconds)
     */
    public fun maxIdleTimeInSeconds(): Number? = unwrap(this).getMaxIdleTimeInSeconds()

    /**
     * The maximum number of instances that a non-pinned Lambda function can run at the same time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-maxinstancescount)
     */
    public fun maxInstancesCount(): Number? = unwrap(this).getMaxInstancesCount()

    /**
     * The maximum size of the message queue for the Lambda function component.
     *
     * The AWS IoT Greengrass core device stores messages in a FIFO (first-in-first-out) queue until
     * it can run the Lambda function to consume each message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-maxqueuesize)
     */
    public fun maxQueueSize(): Number? = unwrap(this).getMaxQueueSize()

    /**
     * Whether or not the Lambda function is pinned, or long-lived.
     *
     * * A pinned Lambda function starts when the AWS IoT Greengrass Core starts and keeps running
     * in its own container.
     * * A non-pinned Lambda function starts only when it receives a work item and exists after it
     * idles for `maxIdleTimeInSeconds` . If the function has multiple work items, the AWS IoT
     * Greengrass Core software creates multiple instances of the function.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-pinned)
     */
    public fun pinned(): Any? = unwrap(this).getPinned()

    /**
     * The interval in seconds at which a pinned (also known as long-lived) Lambda function
     * component sends status updates to the Lambda manager component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-statustimeoutinseconds)
     */
    public fun statusTimeoutInSeconds(): Number? = unwrap(this).getStatusTimeoutInSeconds()

    /**
     * The maximum amount of time in seconds that the Lambda function can process a work item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-timeoutinseconds)
     */
    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    /**
     * A builder for [LambdaExecutionParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param environmentVariables The map of environment variables that are available to the
       * Lambda function when it runs.
       */
      public fun environmentVariables(environmentVariables: IResolvable)

      /**
       * @param environmentVariables The map of environment variables that are available to the
       * Lambda function when it runs.
       */
      public fun environmentVariables(environmentVariables: Map<String, String>)

      /**
       * @param eventSources The list of event sources to which to subscribe to receive work
       * messages.
       * The Lambda function runs when it receives a message from an event source. You can subscribe
       * this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
       */
      public fun eventSources(eventSources: IResolvable)

      /**
       * @param eventSources The list of event sources to which to subscribe to receive work
       * messages.
       * The Lambda function runs when it receives a message from an event source. You can subscribe
       * this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
       */
      public fun eventSources(eventSources: List<Any>)

      /**
       * @param eventSources The list of event sources to which to subscribe to receive work
       * messages.
       * The Lambda function runs when it receives a message from an event source. You can subscribe
       * this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
       */
      public fun eventSources(vararg eventSources: Any)

      /**
       * @param execArgs The list of arguments to pass to the Lambda function when it runs.
       */
      public fun execArgs(execArgs: List<String>)

      /**
       * @param execArgs The list of arguments to pass to the Lambda function when it runs.
       */
      public fun execArgs(vararg execArgs: String)

      /**
       * @param inputPayloadEncodingType The encoding type that the Lambda function supports.
       * Default: `json`
       */
      public fun inputPayloadEncodingType(inputPayloadEncodingType: String)

      /**
       * @param linuxProcessParams The parameters for the Linux process that contains the Lambda
       * function.
       */
      public fun linuxProcessParams(linuxProcessParams: IResolvable)

      /**
       * @param linuxProcessParams The parameters for the Linux process that contains the Lambda
       * function.
       */
      public fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty)

      /**
       * @param linuxProcessParams The parameters for the Linux process that contains the Lambda
       * function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d11b929d32a5b083d2f35c3eae03f5233b88cc8fe45bccc391568c97e6ed00")
      public
          fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty.Builder.() -> Unit)

      /**
       * @param maxIdleTimeInSeconds The maximum amount of time in seconds that a non-pinned Lambda
       * function can idle before the AWS IoT Greengrass Core software stops its process.
       */
      public fun maxIdleTimeInSeconds(maxIdleTimeInSeconds: Number)

      /**
       * @param maxInstancesCount The maximum number of instances that a non-pinned Lambda function
       * can run at the same time.
       */
      public fun maxInstancesCount(maxInstancesCount: Number)

      /**
       * @param maxQueueSize The maximum size of the message queue for the Lambda function
       * component.
       * The AWS IoT Greengrass core device stores messages in a FIFO (first-in-first-out) queue
       * until it can run the Lambda function to consume each message.
       */
      public fun maxQueueSize(maxQueueSize: Number)

      /**
       * @param pinned Whether or not the Lambda function is pinned, or long-lived.
       * * A pinned Lambda function starts when the AWS IoT Greengrass Core starts and keeps running
       * in its own container.
       * * A non-pinned Lambda function starts only when it receives a work item and exists after it
       * idles for `maxIdleTimeInSeconds` . If the function has multiple work items, the AWS IoT
       * Greengrass Core software creates multiple instances of the function.
       *
       * Default: `true`
       */
      public fun pinned(pinned: Boolean)

      /**
       * @param pinned Whether or not the Lambda function is pinned, or long-lived.
       * * A pinned Lambda function starts when the AWS IoT Greengrass Core starts and keeps running
       * in its own container.
       * * A non-pinned Lambda function starts only when it receives a work item and exists after it
       * idles for `maxIdleTimeInSeconds` . If the function has multiple work items, the AWS IoT
       * Greengrass Core software creates multiple instances of the function.
       *
       * Default: `true`
       */
      public fun pinned(pinned: IResolvable)

      /**
       * @param statusTimeoutInSeconds The interval in seconds at which a pinned (also known as
       * long-lived) Lambda function component sends status updates to the Lambda manager component.
       */
      public fun statusTimeoutInSeconds(statusTimeoutInSeconds: Number)

      /**
       * @param timeoutInSeconds The maximum amount of time in seconds that the Lambda function can
       * process a work item.
       */
      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty.builder()

      /**
       * @param environmentVariables The map of environment variables that are available to the
       * Lambda function when it runs.
       */
      override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environmentVariables The map of environment variables that are available to the
       * Lambda function when it runs.
       */
      override fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
      }

      /**
       * @param eventSources The list of event sources to which to subscribe to receive work
       * messages.
       * The Lambda function runs when it receives a message from an event source. You can subscribe
       * this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
       */
      override fun eventSources(eventSources: IResolvable) {
        cdkBuilder.eventSources(eventSources.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param eventSources The list of event sources to which to subscribe to receive work
       * messages.
       * The Lambda function runs when it receives a message from an event source. You can subscribe
       * this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
       */
      override fun eventSources(eventSources: List<Any>) {
        cdkBuilder.eventSources(eventSources.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param eventSources The list of event sources to which to subscribe to receive work
       * messages.
       * The Lambda function runs when it receives a message from an event source. You can subscribe
       * this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
       */
      override fun eventSources(vararg eventSources: Any): Unit =
          eventSources(eventSources.toList())

      /**
       * @param execArgs The list of arguments to pass to the Lambda function when it runs.
       */
      override fun execArgs(execArgs: List<String>) {
        cdkBuilder.execArgs(execArgs)
      }

      /**
       * @param execArgs The list of arguments to pass to the Lambda function when it runs.
       */
      override fun execArgs(vararg execArgs: String): Unit = execArgs(execArgs.toList())

      /**
       * @param inputPayloadEncodingType The encoding type that the Lambda function supports.
       * Default: `json`
       */
      override fun inputPayloadEncodingType(inputPayloadEncodingType: String) {
        cdkBuilder.inputPayloadEncodingType(inputPayloadEncodingType)
      }

      /**
       * @param linuxProcessParams The parameters for the Linux process that contains the Lambda
       * function.
       */
      override fun linuxProcessParams(linuxProcessParams: IResolvable) {
        cdkBuilder.linuxProcessParams(linuxProcessParams.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param linuxProcessParams The parameters for the Linux process that contains the Lambda
       * function.
       */
      override fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty) {
        cdkBuilder.linuxProcessParams(linuxProcessParams.let(LambdaLinuxProcessParamsProperty.Companion::unwrap))
      }

      /**
       * @param linuxProcessParams The parameters for the Linux process that contains the Lambda
       * function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d11b929d32a5b083d2f35c3eae03f5233b88cc8fe45bccc391568c97e6ed00")
      override
          fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty.Builder.() -> Unit):
          Unit = linuxProcessParams(LambdaLinuxProcessParamsProperty(linuxProcessParams))

      /**
       * @param maxIdleTimeInSeconds The maximum amount of time in seconds that a non-pinned Lambda
       * function can idle before the AWS IoT Greengrass Core software stops its process.
       */
      override fun maxIdleTimeInSeconds(maxIdleTimeInSeconds: Number) {
        cdkBuilder.maxIdleTimeInSeconds(maxIdleTimeInSeconds)
      }

      /**
       * @param maxInstancesCount The maximum number of instances that a non-pinned Lambda function
       * can run at the same time.
       */
      override fun maxInstancesCount(maxInstancesCount: Number) {
        cdkBuilder.maxInstancesCount(maxInstancesCount)
      }

      /**
       * @param maxQueueSize The maximum size of the message queue for the Lambda function
       * component.
       * The AWS IoT Greengrass core device stores messages in a FIFO (first-in-first-out) queue
       * until it can run the Lambda function to consume each message.
       */
      override fun maxQueueSize(maxQueueSize: Number) {
        cdkBuilder.maxQueueSize(maxQueueSize)
      }

      /**
       * @param pinned Whether or not the Lambda function is pinned, or long-lived.
       * * A pinned Lambda function starts when the AWS IoT Greengrass Core starts and keeps running
       * in its own container.
       * * A non-pinned Lambda function starts only when it receives a work item and exists after it
       * idles for `maxIdleTimeInSeconds` . If the function has multiple work items, the AWS IoT
       * Greengrass Core software creates multiple instances of the function.
       *
       * Default: `true`
       */
      override fun pinned(pinned: Boolean) {
        cdkBuilder.pinned(pinned)
      }

      /**
       * @param pinned Whether or not the Lambda function is pinned, or long-lived.
       * * A pinned Lambda function starts when the AWS IoT Greengrass Core starts and keeps running
       * in its own container.
       * * A non-pinned Lambda function starts only when it receives a work item and exists after it
       * idles for `maxIdleTimeInSeconds` . If the function has multiple work items, the AWS IoT
       * Greengrass Core software creates multiple instances of the function.
       *
       * Default: `true`
       */
      override fun pinned(pinned: IResolvable) {
        cdkBuilder.pinned(pinned.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param statusTimeoutInSeconds The interval in seconds at which a pinned (also known as
       * long-lived) Lambda function component sends status updates to the Lambda manager component.
       */
      override fun statusTimeoutInSeconds(statusTimeoutInSeconds: Number) {
        cdkBuilder.statusTimeoutInSeconds(statusTimeoutInSeconds)
      }

      /**
       * @param timeoutInSeconds The maximum amount of time in seconds that the Lambda function can
       * process a work item.
       */
      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty,
    ) : CdkObject(cdkObject), LambdaExecutionParametersProperty {
      /**
       * The map of environment variables that are available to the Lambda function when it runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-environmentvariables)
       */
      override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      /**
       * The list of event sources to which to subscribe to receive work messages.
       *
       * The Lambda function runs when it receives a message from an event source. You can subscribe
       * this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-eventsources)
       */
      override fun eventSources(): Any? = unwrap(this).getEventSources()

      /**
       * The list of arguments to pass to the Lambda function when it runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-execargs)
       */
      override fun execArgs(): List<String> = unwrap(this).getExecArgs() ?: emptyList()

      /**
       * The encoding type that the Lambda function supports.
       *
       * Default: `json`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-inputpayloadencodingtype)
       */
      override fun inputPayloadEncodingType(): String? = unwrap(this).getInputPayloadEncodingType()

      /**
       * The parameters for the Linux process that contains the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-linuxprocessparams)
       */
      override fun linuxProcessParams(): Any? = unwrap(this).getLinuxProcessParams()

      /**
       * The maximum amount of time in seconds that a non-pinned Lambda function can idle before the
       * AWS IoT Greengrass Core software stops its process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-maxidletimeinseconds)
       */
      override fun maxIdleTimeInSeconds(): Number? = unwrap(this).getMaxIdleTimeInSeconds()

      /**
       * The maximum number of instances that a non-pinned Lambda function can run at the same time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-maxinstancescount)
       */
      override fun maxInstancesCount(): Number? = unwrap(this).getMaxInstancesCount()

      /**
       * The maximum size of the message queue for the Lambda function component.
       *
       * The AWS IoT Greengrass core device stores messages in a FIFO (first-in-first-out) queue
       * until it can run the Lambda function to consume each message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-maxqueuesize)
       */
      override fun maxQueueSize(): Number? = unwrap(this).getMaxQueueSize()

      /**
       * Whether or not the Lambda function is pinned, or long-lived.
       *
       * * A pinned Lambda function starts when the AWS IoT Greengrass Core starts and keeps running
       * in its own container.
       * * A non-pinned Lambda function starts only when it receives a work item and exists after it
       * idles for `maxIdleTimeInSeconds` . If the function has multiple work items, the AWS IoT
       * Greengrass Core software creates multiple instances of the function.
       *
       * Default: `true`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-pinned)
       */
      override fun pinned(): Any? = unwrap(this).getPinned()

      /**
       * The interval in seconds at which a pinned (also known as long-lived) Lambda function
       * component sends status updates to the Lambda manager component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-statustimeoutinseconds)
       */
      override fun statusTimeoutInSeconds(): Number? = unwrap(this).getStatusTimeoutInSeconds()

      /**
       * The maximum amount of time in seconds that the Lambda function can process a work item.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html#cfn-greengrassv2-componentversion-lambdaexecutionparameters-timeoutinseconds)
       */
      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaExecutionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty):
          LambdaExecutionParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaExecutionParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaExecutionParametersProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty
    }
  }

  /**
   * Contains information about an AWS Lambda function to import to create a component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * LambdaFunctionRecipeSourceProperty lambdaFunctionRecipeSourceProperty =
   * LambdaFunctionRecipeSourceProperty.builder()
   * .componentDependencies(Map.of(
   * "componentDependenciesKey", ComponentDependencyRequirementProperty.builder()
   * .dependencyType("dependencyType")
   * .versionRequirement("versionRequirement")
   * .build()))
   * .componentLambdaParameters(LambdaExecutionParametersProperty.builder()
   * .environmentVariables(Map.of(
   * "environmentVariablesKey", "environmentVariables"))
   * .eventSources(List.of(LambdaEventSourceProperty.builder()
   * .topic("topic")
   * .type("type")
   * .build()))
   * .execArgs(List.of("execArgs"))
   * .inputPayloadEncodingType("inputPayloadEncodingType")
   * .linuxProcessParams(LambdaLinuxProcessParamsProperty.builder()
   * .containerParams(LambdaContainerParamsProperty.builder()
   * .devices(List.of(LambdaDeviceMountProperty.builder()
   * .addGroupOwner(false)
   * .path("path")
   * .permission("permission")
   * .build()))
   * .memorySizeInKb(123)
   * .mountRoSysfs(false)
   * .volumes(List.of(LambdaVolumeMountProperty.builder()
   * .addGroupOwner(false)
   * .destinationPath("destinationPath")
   * .permission("permission")
   * .sourcePath("sourcePath")
   * .build()))
   * .build())
   * .isolationMode("isolationMode")
   * .build())
   * .maxIdleTimeInSeconds(123)
   * .maxInstancesCount(123)
   * .maxQueueSize(123)
   * .pinned(false)
   * .statusTimeoutInSeconds(123)
   * .timeoutInSeconds(123)
   * .build())
   * .componentName("componentName")
   * .componentPlatforms(List.of(ComponentPlatformProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .name("name")
   * .build()))
   * .componentVersion("componentVersion")
   * .lambdaArn("lambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html)
   */
  public interface LambdaFunctionRecipeSourceProperty {
    /**
     * The component versions on which this Lambda function component depends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentdependencies)
     */
    public fun componentDependencies(): Any? = unwrap(this).getComponentDependencies()

    /**
     * The system and runtime parameters for the Lambda function as it runs on the AWS IoT
     * Greengrass core device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentlambdaparameters)
     */
    public fun componentLambdaParameters(): Any? = unwrap(this).getComponentLambdaParameters()

    /**
     * The name of the component.
     *
     * Defaults to the name of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentname)
     */
    public fun componentName(): String? = unwrap(this).getComponentName()

    /**
     * The platforms that the component version supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentplatforms)
     */
    public fun componentPlatforms(): Any? = unwrap(this).getComponentPlatforms()

    /**
     * The version of the component.
     *
     * Defaults to the version of the Lambda function as a semantic version. For example, if your
     * function version is `3` , the component version becomes `3.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentversion)
     */
    public fun componentVersion(): String? = unwrap(this).getComponentVersion()

    /**
     * The ARN of the Lambda function.
     *
     * The ARN must include the version of the function to import. You can't use version aliases
     * like `$LATEST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-lambdaarn)
     */
    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    /**
     * A builder for [LambdaFunctionRecipeSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentDependencies The component versions on which this Lambda function component
       * depends.
       */
      public fun componentDependencies(componentDependencies: IResolvable)

      /**
       * @param componentDependencies The component versions on which this Lambda function component
       * depends.
       */
      public fun componentDependencies(componentDependencies: Map<String, Any>)

      /**
       * @param componentLambdaParameters The system and runtime parameters for the Lambda function
       * as it runs on the AWS IoT Greengrass core device.
       */
      public fun componentLambdaParameters(componentLambdaParameters: IResolvable)

      /**
       * @param componentLambdaParameters The system and runtime parameters for the Lambda function
       * as it runs on the AWS IoT Greengrass core device.
       */
      public
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty)

      /**
       * @param componentLambdaParameters The system and runtime parameters for the Lambda function
       * as it runs on the AWS IoT Greengrass core device.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2baaea23fa42a72d73625398b3745773a4ef9501bd5209c28d2a3b7974b71fce")
      public
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty.Builder.() -> Unit)

      /**
       * @param componentName The name of the component.
       * Defaults to the name of the Lambda function.
       */
      public fun componentName(componentName: String)

      /**
       * @param componentPlatforms The platforms that the component version supports.
       */
      public fun componentPlatforms(componentPlatforms: IResolvable)

      /**
       * @param componentPlatforms The platforms that the component version supports.
       */
      public fun componentPlatforms(componentPlatforms: List<Any>)

      /**
       * @param componentPlatforms The platforms that the component version supports.
       */
      public fun componentPlatforms(vararg componentPlatforms: Any)

      /**
       * @param componentVersion The version of the component.
       * Defaults to the version of the Lambda function as a semantic version. For example, if your
       * function version is `3` , the component version becomes `3.0.0` .
       */
      public fun componentVersion(componentVersion: String)

      /**
       * @param lambdaArn The ARN of the Lambda function.
       * The ARN must include the version of the function to import. You can't use version aliases
       * like `$LATEST` .
       */
      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty.builder()

      /**
       * @param componentDependencies The component versions on which this Lambda function component
       * depends.
       */
      override fun componentDependencies(componentDependencies: IResolvable) {
        cdkBuilder.componentDependencies(componentDependencies.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param componentDependencies The component versions on which this Lambda function component
       * depends.
       */
      override fun componentDependencies(componentDependencies: Map<String, Any>) {
        cdkBuilder.componentDependencies(componentDependencies.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      /**
       * @param componentLambdaParameters The system and runtime parameters for the Lambda function
       * as it runs on the AWS IoT Greengrass core device.
       */
      override fun componentLambdaParameters(componentLambdaParameters: IResolvable) {
        cdkBuilder.componentLambdaParameters(componentLambdaParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param componentLambdaParameters The system and runtime parameters for the Lambda function
       * as it runs on the AWS IoT Greengrass core device.
       */
      override
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty) {
        cdkBuilder.componentLambdaParameters(componentLambdaParameters.let(LambdaExecutionParametersProperty.Companion::unwrap))
      }

      /**
       * @param componentLambdaParameters The system and runtime parameters for the Lambda function
       * as it runs on the AWS IoT Greengrass core device.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2baaea23fa42a72d73625398b3745773a4ef9501bd5209c28d2a3b7974b71fce")
      override
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty.Builder.() -> Unit):
          Unit =
          componentLambdaParameters(LambdaExecutionParametersProperty(componentLambdaParameters))

      /**
       * @param componentName The name of the component.
       * Defaults to the name of the Lambda function.
       */
      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      /**
       * @param componentPlatforms The platforms that the component version supports.
       */
      override fun componentPlatforms(componentPlatforms: IResolvable) {
        cdkBuilder.componentPlatforms(componentPlatforms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param componentPlatforms The platforms that the component version supports.
       */
      override fun componentPlatforms(componentPlatforms: List<Any>) {
        cdkBuilder.componentPlatforms(componentPlatforms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param componentPlatforms The platforms that the component version supports.
       */
      override fun componentPlatforms(vararg componentPlatforms: Any): Unit =
          componentPlatforms(componentPlatforms.toList())

      /**
       * @param componentVersion The version of the component.
       * Defaults to the version of the Lambda function as a semantic version. For example, if your
       * function version is `3` , the component version becomes `3.0.0` .
       */
      override fun componentVersion(componentVersion: String) {
        cdkBuilder.componentVersion(componentVersion)
      }

      /**
       * @param lambdaArn The ARN of the Lambda function.
       * The ARN must include the version of the function to import. You can't use version aliases
       * like `$LATEST` .
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty,
    ) : CdkObject(cdkObject), LambdaFunctionRecipeSourceProperty {
      /**
       * The component versions on which this Lambda function component depends.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentdependencies)
       */
      override fun componentDependencies(): Any? = unwrap(this).getComponentDependencies()

      /**
       * The system and runtime parameters for the Lambda function as it runs on the AWS IoT
       * Greengrass core device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentlambdaparameters)
       */
      override fun componentLambdaParameters(): Any? = unwrap(this).getComponentLambdaParameters()

      /**
       * The name of the component.
       *
       * Defaults to the name of the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentname)
       */
      override fun componentName(): String? = unwrap(this).getComponentName()

      /**
       * The platforms that the component version supports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentplatforms)
       */
      override fun componentPlatforms(): Any? = unwrap(this).getComponentPlatforms()

      /**
       * The version of the component.
       *
       * Defaults to the version of the Lambda function as a semantic version. For example, if your
       * function version is `3` , the component version becomes `3.0.0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-componentversion)
       */
      override fun componentVersion(): String? = unwrap(this).getComponentVersion()

      /**
       * The ARN of the Lambda function.
       *
       * The ARN must include the version of the function to import. You can't use version aliases
       * like `$LATEST` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdafunctionrecipesource.html#cfn-greengrassv2-componentversion-lambdafunctionrecipesource-lambdaarn)
       */
      override fun lambdaArn(): String? = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaFunctionRecipeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty):
          LambdaFunctionRecipeSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaFunctionRecipeSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionRecipeSourceProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty
    }
  }

  /**
   * Contains parameters for a Linux process that contains an AWS Lambda function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * LambdaLinuxProcessParamsProperty lambdaLinuxProcessParamsProperty =
   * LambdaLinuxProcessParamsProperty.builder()
   * .containerParams(LambdaContainerParamsProperty.builder()
   * .devices(List.of(LambdaDeviceMountProperty.builder()
   * .addGroupOwner(false)
   * .path("path")
   * .permission("permission")
   * .build()))
   * .memorySizeInKb(123)
   * .mountRoSysfs(false)
   * .volumes(List.of(LambdaVolumeMountProperty.builder()
   * .addGroupOwner(false)
   * .destinationPath("destinationPath")
   * .permission("permission")
   * .sourcePath("sourcePath")
   * .build()))
   * .build())
   * .isolationMode("isolationMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdalinuxprocessparams.html)
   */
  public interface LambdaLinuxProcessParamsProperty {
    /**
     * The parameters for the container in which the Lambda function runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdalinuxprocessparams.html#cfn-greengrassv2-componentversion-lambdalinuxprocessparams-containerparams)
     */
    public fun containerParams(): Any? = unwrap(this).getContainerParams()

    /**
     * The isolation mode for the process that contains the Lambda function.
     *
     * The process can run in an isolated runtime environment inside the AWS IoT Greengrass
     * container, or as a regular process outside any container.
     *
     * Default: `GreengrassContainer`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdalinuxprocessparams.html#cfn-greengrassv2-componentversion-lambdalinuxprocessparams-isolationmode)
     */
    public fun isolationMode(): String? = unwrap(this).getIsolationMode()

    /**
     * A builder for [LambdaLinuxProcessParamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerParams The parameters for the container in which the Lambda function runs.
       */
      public fun containerParams(containerParams: IResolvable)

      /**
       * @param containerParams The parameters for the container in which the Lambda function runs.
       */
      public fun containerParams(containerParams: LambdaContainerParamsProperty)

      /**
       * @param containerParams The parameters for the container in which the Lambda function runs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d50906feca98faf4df750e8c8b2505d20d6d0ec007d1b01d4e003f98aa20d2")
      public fun containerParams(containerParams: LambdaContainerParamsProperty.Builder.() -> Unit)

      /**
       * @param isolationMode The isolation mode for the process that contains the Lambda function.
       * The process can run in an isolated runtime environment inside the AWS IoT Greengrass
       * container, or as a regular process outside any container.
       *
       * Default: `GreengrassContainer`
       */
      public fun isolationMode(isolationMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty.builder()

      /**
       * @param containerParams The parameters for the container in which the Lambda function runs.
       */
      override fun containerParams(containerParams: IResolvable) {
        cdkBuilder.containerParams(containerParams.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containerParams The parameters for the container in which the Lambda function runs.
       */
      override fun containerParams(containerParams: LambdaContainerParamsProperty) {
        cdkBuilder.containerParams(containerParams.let(LambdaContainerParamsProperty.Companion::unwrap))
      }

      /**
       * @param containerParams The parameters for the container in which the Lambda function runs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d50906feca98faf4df750e8c8b2505d20d6d0ec007d1b01d4e003f98aa20d2")
      override
          fun containerParams(containerParams: LambdaContainerParamsProperty.Builder.() -> Unit):
          Unit = containerParams(LambdaContainerParamsProperty(containerParams))

      /**
       * @param isolationMode The isolation mode for the process that contains the Lambda function.
       * The process can run in an isolated runtime environment inside the AWS IoT Greengrass
       * container, or as a regular process outside any container.
       *
       * Default: `GreengrassContainer`
       */
      override fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty,
    ) : CdkObject(cdkObject), LambdaLinuxProcessParamsProperty {
      /**
       * The parameters for the container in which the Lambda function runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdalinuxprocessparams.html#cfn-greengrassv2-componentversion-lambdalinuxprocessparams-containerparams)
       */
      override fun containerParams(): Any? = unwrap(this).getContainerParams()

      /**
       * The isolation mode for the process that contains the Lambda function.
       *
       * The process can run in an isolated runtime environment inside the AWS IoT Greengrass
       * container, or as a regular process outside any container.
       *
       * Default: `GreengrassContainer`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdalinuxprocessparams.html#cfn-greengrassv2-componentversion-lambdalinuxprocessparams-isolationmode)
       */
      override fun isolationMode(): String? = unwrap(this).getIsolationMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaLinuxProcessParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty):
          LambdaLinuxProcessParamsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaLinuxProcessParamsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaLinuxProcessParamsProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty
    }
  }

  /**
   * Contains information about a volume that Linux processes in a container can access.
   *
   * When you define a volume, the AWS IoT Greengrass Core software mounts the source files to the
   * destination inside the container.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * LambdaVolumeMountProperty lambdaVolumeMountProperty = LambdaVolumeMountProperty.builder()
   * .addGroupOwner(false)
   * .destinationPath("destinationPath")
   * .permission("permission")
   * .sourcePath("sourcePath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html)
   */
  public interface LambdaVolumeMountProperty {
    /**
     * Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html#cfn-greengrassv2-componentversion-lambdavolumemount-addgroupowner)
     */
    public fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

    /**
     * The path to the logical volume in the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html#cfn-greengrassv2-componentversion-lambdavolumemount-destinationpath)
     */
    public fun destinationPath(): String? = unwrap(this).getDestinationPath()

    /**
     * The permission to access the volume: read/only ( `ro` ) or read/write ( `rw` ).
     *
     * Default: `ro`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html#cfn-greengrassv2-componentversion-lambdavolumemount-permission)
     */
    public fun permission(): String? = unwrap(this).getPermission()

    /**
     * The path to the physical volume in the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html#cfn-greengrassv2-componentversion-lambdavolumemount-sourcepath)
     */
    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    /**
     * A builder for [LambdaVolumeMountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addGroupOwner Whether or not to add the AWS IoT Greengrass user group as an owner of
       * the volume.
       * Default: `false`
       */
      public fun addGroupOwner(addGroupOwner: Boolean)

      /**
       * @param addGroupOwner Whether or not to add the AWS IoT Greengrass user group as an owner of
       * the volume.
       * Default: `false`
       */
      public fun addGroupOwner(addGroupOwner: IResolvable)

      /**
       * @param destinationPath The path to the logical volume in the file system.
       */
      public fun destinationPath(destinationPath: String)

      /**
       * @param permission The permission to access the volume: read/only ( `ro` ) or read/write (
       * `rw` ).
       * Default: `ro`
       */
      public fun permission(permission: String)

      /**
       * @param sourcePath The path to the physical volume in the file system.
       */
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty.builder()

      /**
       * @param addGroupOwner Whether or not to add the AWS IoT Greengrass user group as an owner of
       * the volume.
       * Default: `false`
       */
      override fun addGroupOwner(addGroupOwner: Boolean) {
        cdkBuilder.addGroupOwner(addGroupOwner)
      }

      /**
       * @param addGroupOwner Whether or not to add the AWS IoT Greengrass user group as an owner of
       * the volume.
       * Default: `false`
       */
      override fun addGroupOwner(addGroupOwner: IResolvable) {
        cdkBuilder.addGroupOwner(addGroupOwner.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinationPath The path to the logical volume in the file system.
       */
      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      /**
       * @param permission The permission to access the volume: read/only ( `ro` ) or read/write (
       * `rw` ).
       * Default: `ro`
       */
      override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      /**
       * @param sourcePath The path to the physical volume in the file system.
       */
      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty,
    ) : CdkObject(cdkObject), LambdaVolumeMountProperty {
      /**
       * Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.
       *
       * Default: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html#cfn-greengrassv2-componentversion-lambdavolumemount-addgroupowner)
       */
      override fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

      /**
       * The path to the logical volume in the file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html#cfn-greengrassv2-componentversion-lambdavolumemount-destinationpath)
       */
      override fun destinationPath(): String? = unwrap(this).getDestinationPath()

      /**
       * The permission to access the volume: read/only ( `ro` ) or read/write ( `rw` ).
       *
       * Default: `ro`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html#cfn-greengrassv2-componentversion-lambdavolumemount-permission)
       */
      override fun permission(): String? = unwrap(this).getPermission()

      /**
       * The path to the physical volume in the file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdavolumemount.html#cfn-greengrassv2-componentversion-lambdavolumemount-sourcepath)
       */
      override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaVolumeMountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty):
          LambdaVolumeMountProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaVolumeMountProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaVolumeMountProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty
    }
  }
}
