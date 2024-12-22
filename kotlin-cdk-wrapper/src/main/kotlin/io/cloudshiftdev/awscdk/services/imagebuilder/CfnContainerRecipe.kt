@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

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
 * Creates a new container recipe.
 *
 * Container recipes define how images are configured, tested, and assessed.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnContainerRecipe cfnContainerRecipe = CfnContainerRecipe.Builder.create(this,
 * "MyCfnContainerRecipe")
 * .components(List.of(ComponentConfigurationProperty.builder()
 * .componentArn("componentArn")
 * .parameters(List.of(ComponentParameterProperty.builder()
 * .name("name")
 * .value(List.of("value"))
 * .build()))
 * .build()))
 * .containerType("containerType")
 * .name("name")
 * .parentImage("parentImage")
 * .targetRepository(TargetContainerRepositoryProperty.builder()
 * .repositoryName("repositoryName")
 * .service("service")
 * .build())
 * .version("version")
 * // the properties below are optional
 * .description("description")
 * .dockerfileTemplateData("dockerfileTemplateData")
 * .dockerfileTemplateUri("dockerfileTemplateUri")
 * .imageOsVersionOverride("imageOsVersionOverride")
 * .instanceConfiguration(InstanceConfigurationProperty.builder()
 * .blockDeviceMappings(List.of(InstanceBlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice("noDevice")
 * .virtualName("virtualName")
 * .build()))
 * .image("image")
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .platformOverride("platformOverride")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html)
 */
public open class CfnContainerRecipe(
  cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContainerRecipeProps,
  ) :
      this(software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnContainerRecipeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContainerRecipeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContainerRecipeProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of the container recipe.
   *
   * For example,
   * `arn:aws:imagebuilder:us-east-1:123456789012:container-recipe/mybasicrecipe/2020.12.17` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the name of the container recipe.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Build and test components that are included in the container recipe.
   */
  public open fun components(): Any = unwrap(this).getComponents()

  /**
   * Build and test components that are included in the container recipe.
   */
  public open fun components(`value`: IResolvable) {
    unwrap(this).setComponents(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Build and test components that are included in the container recipe.
   */
  public open fun components(`value`: List<Any>) {
    unwrap(this).setComponents(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Build and test components that are included in the container recipe.
   */
  public open fun components(vararg `value`: Any): Unit = components(`value`.toList())

  /**
   * Specifies the type of container, such as Docker.
   */
  public open fun containerType(): String = unwrap(this).getContainerType()

  /**
   * Specifies the type of container, such as Docker.
   */
  public open fun containerType(`value`: String) {
    unwrap(this).setContainerType(`value`)
  }

  /**
   * The description of the container recipe.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the container recipe.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Dockerfiles are text documents that are used to build Docker containers, and ensure that they
   * contain all of the elements required by the application running inside.
   */
  public open fun dockerfileTemplateData(): String? = unwrap(this).getDockerfileTemplateData()

  /**
   * Dockerfiles are text documents that are used to build Docker containers, and ensure that they
   * contain all of the elements required by the application running inside.
   */
  public open fun dockerfileTemplateData(`value`: String) {
    unwrap(this).setDockerfileTemplateData(`value`)
  }

  /**
   * The S3 URI for the Dockerfile that will be used to build your container image.
   */
  public open fun dockerfileTemplateUri(): String? = unwrap(this).getDockerfileTemplateUri()

  /**
   * The S3 URI for the Dockerfile that will be used to build your container image.
   */
  public open fun dockerfileTemplateUri(`value`: String) {
    unwrap(this).setDockerfileTemplateUri(`value`)
  }

  /**
   * Specifies the operating system version for the base image.
   */
  public open fun imageOsVersionOverride(): String? = unwrap(this).getImageOsVersionOverride()

  /**
   * Specifies the operating system version for the base image.
   */
  public open fun imageOsVersionOverride(`value`: String) {
    unwrap(this).setImageOsVersionOverride(`value`)
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
   * A group of options that can be used to configure an instance for building and testing container
   * images.
   */
  public open fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

  /**
   * A group of options that can be used to configure an instance for building and testing container
   * images.
   */
  public open fun instanceConfiguration(`value`: IResolvable) {
    unwrap(this).setInstanceConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A group of options that can be used to configure an instance for building and testing container
   * images.
   */
  public open fun instanceConfiguration(`value`: InstanceConfigurationProperty) {
    unwrap(this).setInstanceConfiguration(`value`.let(InstanceConfigurationProperty.Companion::unwrap))
  }

  /**
   * A group of options that can be used to configure an instance for building and testing container
   * images.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec0928d99e8483af1b55a56acd0433fb7078d6ed031b5cb1f61f9f5f8aa09bec")
  public open fun instanceConfiguration(`value`: InstanceConfigurationProperty.Builder.() -> Unit):
      Unit = instanceConfiguration(InstanceConfigurationProperty(`value`))

  /**
   * Identifies which KMS key is used to encrypt the container image for distribution to the target
   * Region.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Identifies which KMS key is used to encrypt the container image for distribution to the target
   * Region.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The name of the container recipe.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the container recipe.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The base image for the container recipe.
   */
  public open fun parentImage(): String = unwrap(this).getParentImage()

  /**
   * The base image for the container recipe.
   */
  public open fun parentImage(`value`: String) {
    unwrap(this).setParentImage(`value`)
  }

  /**
   * Specifies the operating system platform when you use a custom base image.
   */
  public open fun platformOverride(): String? = unwrap(this).getPlatformOverride()

  /**
   * Specifies the operating system platform when you use a custom base image.
   */
  public open fun platformOverride(`value`: String) {
    unwrap(this).setPlatformOverride(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags that are attached to the container recipe.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Tags that are attached to the container recipe.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The destination repository for the container image.
   */
  public open fun targetRepository(): Any = unwrap(this).getTargetRepository()

  /**
   * The destination repository for the container image.
   */
  public open fun targetRepository(`value`: IResolvable) {
    unwrap(this).setTargetRepository(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The destination repository for the container image.
   */
  public open fun targetRepository(`value`: TargetContainerRepositoryProperty) {
    unwrap(this).setTargetRepository(`value`.let(TargetContainerRepositoryProperty.Companion::unwrap))
  }

  /**
   * The destination repository for the container image.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad6a49bfdd1913b405ff2399336a97538d670e1fbba894655ad550d2f1118d11")
  public open fun targetRepository(`value`: TargetContainerRepositoryProperty.Builder.() -> Unit):
      Unit = targetRepository(TargetContainerRepositoryProperty(`value`))

  /**
   * The semantic version of the container recipe.
   */
  public open fun version(): String = unwrap(this).getVersion()

  /**
   * The semantic version of the container recipe.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * The working directory for use during build and test workflows.
   */
  public open fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * The working directory for use during build and test workflows.
   */
  public open fun workingDirectory(`value`: String) {
    unwrap(this).setWorkingDirectory(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.imagebuilder.CfnContainerRecipe].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Build and test components that are included in the container recipe.
     *
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
     * @param components Build and test components that are included in the container recipe. 
     */
    public fun components(components: IResolvable)

    /**
     * Build and test components that are included in the container recipe.
     *
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
     * @param components Build and test components that are included in the container recipe. 
     */
    public fun components(components: List<Any>)

    /**
     * Build and test components that are included in the container recipe.
     *
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
     * @param components Build and test components that are included in the container recipe. 
     */
    public fun components(vararg components: Any)

    /**
     * Specifies the type of container, such as Docker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-containertype)
     * @param containerType Specifies the type of container, such as Docker. 
     */
    public fun containerType(containerType: String)

    /**
     * The description of the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-description)
     * @param description The description of the container recipe. 
     */
    public fun description(description: String)

    /**
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they
     * contain all of the elements required by the application running inside.
     *
     * The template data consists of contextual variables where Image Builder places build
     * information or scripts, based on your container image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplatedata)
     * @param dockerfileTemplateData Dockerfiles are text documents that are used to build Docker
     * containers, and ensure that they contain all of the elements required by the application running
     * inside. 
     */
    public fun dockerfileTemplateData(dockerfileTemplateData: String)

    /**
     * The S3 URI for the Dockerfile that will be used to build your container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplateuri)
     * @param dockerfileTemplateUri The S3 URI for the Dockerfile that will be used to build your
     * container image. 
     */
    public fun dockerfileTemplateUri(dockerfileTemplateUri: String)

    /**
     * Specifies the operating system version for the base image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-imageosversionoverride)
     * @param imageOsVersionOverride Specifies the operating system version for the base image. 
     */
    public fun imageOsVersionOverride(imageOsVersionOverride: String)

    /**
     * A group of options that can be used to configure an instance for building and testing
     * container images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images. 
     */
    public fun instanceConfiguration(instanceConfiguration: IResolvable)

    /**
     * A group of options that can be used to configure an instance for building and testing
     * container images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images. 
     */
    public fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty)

    /**
     * A group of options that can be used to configure an instance for building and testing
     * container images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09e62bcc17da358c8cd2d05f7835b4ebe7211154b004e920f5cfc1cd52cb988a")
    public
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty.Builder.() -> Unit)

    /**
     * Identifies which KMS key is used to encrypt the container image for distribution to the
     * target Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-kmskeyid)
     * @param kmsKeyId Identifies which KMS key is used to encrypt the container image for
     * distribution to the target Region. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The name of the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-name)
     * @param name The name of the container recipe. 
     */
    public fun name(name: String)

    /**
     * The base image for the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-parentimage)
     * @param parentImage The base image for the container recipe. 
     */
    public fun parentImage(parentImage: String)

    /**
     * Specifies the operating system platform when you use a custom base image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-platformoverride)
     * @param platformOverride Specifies the operating system platform when you use a custom base
     * image. 
     */
    public fun platformOverride(platformOverride: String)

    /**
     * Tags that are attached to the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-tags)
     * @param tags Tags that are attached to the container recipe. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The destination repository for the container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
     * @param targetRepository The destination repository for the container image. 
     */
    public fun targetRepository(targetRepository: IResolvable)

    /**
     * The destination repository for the container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
     * @param targetRepository The destination repository for the container image. 
     */
    public fun targetRepository(targetRepository: TargetContainerRepositoryProperty)

    /**
     * The destination repository for the container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
     * @param targetRepository The destination repository for the container image. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d659bd845247566ecc8c19a97fcb38f2cc4de18b9b4117e2a1abb2c46a37fe8e")
    public
        fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit)

    /**
     * The semantic version of the container recipe.
     *
     *
     * The semantic version has four nodes: <major>.<minor>.<patch>/<build>. You can assign values
     * for the first three, and can filter on all of them.
     *
     * *Assignment:* For the first three nodes you can assign any positive integer value, including
     * zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically
     * assigns the build number to the fourth node.
     *
     * *Patterns:* You can use any numeric pattern that adheres to the assignment requirements for
     * the nodes that you can assign. For example, you might choose a software version pattern, such as
     * 1.0.0, or a date, such as 2021.01.01.
     *
     * *Filtering:* With semantic versioning, you have the flexibility to use wildcards (x) to
     * specify the most recent versions or nodes when selecting the base image or components for your
     * recipe. When you use a wildcard in any node, all nodes to the right of the first wildcard must
     * also be wildcards.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-version)
     * @param version The semantic version of the container recipe. 
     */
    public fun version(version: String)

    /**
     * The working directory for use during build and test workflows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-workingdirectory)
     * @param workingDirectory The working directory for use during build and test workflows. 
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.Builder
        = software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.Builder.create(scope, id)

    /**
     * Build and test components that are included in the container recipe.
     *
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
     * @param components Build and test components that are included in the container recipe. 
     */
    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable.Companion::unwrap))
    }

    /**
     * Build and test components that are included in the container recipe.
     *
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
     * @param components Build and test components that are included in the container recipe. 
     */
    override fun components(components: List<Any>) {
      cdkBuilder.components(components.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Build and test components that are included in the container recipe.
     *
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
     * @param components Build and test components that are included in the container recipe. 
     */
    override fun components(vararg components: Any): Unit = components(components.toList())

    /**
     * Specifies the type of container, such as Docker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-containertype)
     * @param containerType Specifies the type of container, such as Docker. 
     */
    override fun containerType(containerType: String) {
      cdkBuilder.containerType(containerType)
    }

    /**
     * The description of the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-description)
     * @param description The description of the container recipe. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they
     * contain all of the elements required by the application running inside.
     *
     * The template data consists of contextual variables where Image Builder places build
     * information or scripts, based on your container image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplatedata)
     * @param dockerfileTemplateData Dockerfiles are text documents that are used to build Docker
     * containers, and ensure that they contain all of the elements required by the application running
     * inside. 
     */
    override fun dockerfileTemplateData(dockerfileTemplateData: String) {
      cdkBuilder.dockerfileTemplateData(dockerfileTemplateData)
    }

    /**
     * The S3 URI for the Dockerfile that will be used to build your container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplateuri)
     * @param dockerfileTemplateUri The S3 URI for the Dockerfile that will be used to build your
     * container image. 
     */
    override fun dockerfileTemplateUri(dockerfileTemplateUri: String) {
      cdkBuilder.dockerfileTemplateUri(dockerfileTemplateUri)
    }

    /**
     * Specifies the operating system version for the base image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-imageosversionoverride)
     * @param imageOsVersionOverride Specifies the operating system version for the base image. 
     */
    override fun imageOsVersionOverride(imageOsVersionOverride: String) {
      cdkBuilder.imageOsVersionOverride(imageOsVersionOverride)
    }

    /**
     * A group of options that can be used to configure an instance for building and testing
     * container images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images. 
     */
    override fun instanceConfiguration(instanceConfiguration: IResolvable) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A group of options that can be used to configure an instance for building and testing
     * container images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images. 
     */
    override fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(InstanceConfigurationProperty.Companion::unwrap))
    }

    /**
     * A group of options that can be used to configure an instance for building and testing
     * container images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09e62bcc17da358c8cd2d05f7835b4ebe7211154b004e920f5cfc1cd52cb988a")
    override
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty.Builder.() -> Unit):
        Unit = instanceConfiguration(InstanceConfigurationProperty(instanceConfiguration))

    /**
     * Identifies which KMS key is used to encrypt the container image for distribution to the
     * target Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-kmskeyid)
     * @param kmsKeyId Identifies which KMS key is used to encrypt the container image for
     * distribution to the target Region. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-name)
     * @param name The name of the container recipe. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The base image for the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-parentimage)
     * @param parentImage The base image for the container recipe. 
     */
    override fun parentImage(parentImage: String) {
      cdkBuilder.parentImage(parentImage)
    }

    /**
     * Specifies the operating system platform when you use a custom base image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-platformoverride)
     * @param platformOverride Specifies the operating system platform when you use a custom base
     * image. 
     */
    override fun platformOverride(platformOverride: String) {
      cdkBuilder.platformOverride(platformOverride)
    }

    /**
     * Tags that are attached to the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-tags)
     * @param tags Tags that are attached to the container recipe. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The destination repository for the container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
     * @param targetRepository The destination repository for the container image. 
     */
    override fun targetRepository(targetRepository: IResolvable) {
      cdkBuilder.targetRepository(targetRepository.let(IResolvable.Companion::unwrap))
    }

    /**
     * The destination repository for the container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
     * @param targetRepository The destination repository for the container image. 
     */
    override fun targetRepository(targetRepository: TargetContainerRepositoryProperty) {
      cdkBuilder.targetRepository(targetRepository.let(TargetContainerRepositoryProperty.Companion::unwrap))
    }

    /**
     * The destination repository for the container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
     * @param targetRepository The destination repository for the container image. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d659bd845247566ecc8c19a97fcb38f2cc4de18b9b4117e2a1abb2c46a37fe8e")
    override
        fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit):
        Unit = targetRepository(TargetContainerRepositoryProperty(targetRepository))

    /**
     * The semantic version of the container recipe.
     *
     *
     * The semantic version has four nodes: <major>.<minor>.<patch>/<build>. You can assign values
     * for the first three, and can filter on all of them.
     *
     * *Assignment:* For the first three nodes you can assign any positive integer value, including
     * zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically
     * assigns the build number to the fourth node.
     *
     * *Patterns:* You can use any numeric pattern that adheres to the assignment requirements for
     * the nodes that you can assign. For example, you might choose a software version pattern, such as
     * 1.0.0, or a date, such as 2021.01.01.
     *
     * *Filtering:* With semantic versioning, you have the flexibility to use wildcards (x) to
     * specify the most recent versions or nodes when selecting the base image or components for your
     * recipe. When you use a wildcard in any node, all nodes to the right of the first wildcard must
     * also be wildcards.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-version)
     * @param version The semantic version of the container recipe. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    /**
     * The working directory for use during build and test workflows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-workingdirectory)
     * @param workingDirectory The working directory for use during build and test workflows. 
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContainerRecipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContainerRecipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe):
        CfnContainerRecipe = CfnContainerRecipe(cdkObject)

    internal fun unwrap(wrapped: CfnContainerRecipe):
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe = wrapped.cdkObject as
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
  }

  /**
   * Configuration details of the component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * ComponentConfigurationProperty componentConfigurationProperty =
   * ComponentConfigurationProperty.builder()
   * .componentArn("componentArn")
   * .parameters(List.of(ComponentParameterProperty.builder()
   * .name("name")
   * .value(List.of("value"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentconfiguration.html)
   */
  public interface ComponentConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentconfiguration.html#cfn-imagebuilder-containerrecipe-componentconfiguration-componentarn)
     */
    public fun componentArn(): String? = unwrap(this).getComponentArn()

    /**
     * A group of parameter settings that Image Builder uses to configure the component for a
     * specific recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentconfiguration.html#cfn-imagebuilder-containerrecipe-componentconfiguration-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A builder for [ComponentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentArn The Amazon Resource Name (ARN) of the component.
       */
      public fun componentArn(componentArn: String)

      /**
       * @param parameters A group of parameter settings that Image Builder uses to configure the
       * component for a specific recipe.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters A group of parameter settings that Image Builder uses to configure the
       * component for a specific recipe.
       */
      public fun parameters(parameters: List<Any>)

      /**
       * @param parameters A group of parameter settings that Image Builder uses to configure the
       * component for a specific recipe.
       */
      public fun parameters(vararg parameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty.builder()

      /**
       * @param componentArn The Amazon Resource Name (ARN) of the component.
       */
      override fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
      }

      /**
       * @param parameters A group of parameter settings that Image Builder uses to configure the
       * component for a specific recipe.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameters A group of parameter settings that Image Builder uses to configure the
       * component for a specific recipe.
       */
      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param parameters A group of parameter settings that Image Builder uses to configure the
       * component for a specific recipe.
       */
      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty,
    ) : CdkObject(cdkObject),
        ComponentConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentconfiguration.html#cfn-imagebuilder-containerrecipe-componentconfiguration-componentarn)
       */
      override fun componentArn(): String? = unwrap(this).getComponentArn()

      /**
       * A group of parameter settings that Image Builder uses to configure the component for a
       * specific recipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentconfiguration.html#cfn-imagebuilder-containerrecipe-componentconfiguration-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty):
          ComponentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty
    }
  }

  /**
   * Contains a key/value pair that sets the named component parameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * ComponentParameterProperty componentParameterProperty = ComponentParameterProperty.builder()
   * .name("name")
   * .value(List.of("value"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentparameter.html)
   */
  public interface ComponentParameterProperty {
    /**
     * The name of the component parameter to set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentparameter.html#cfn-imagebuilder-containerrecipe-componentparameter-name)
     */
    public fun name(): String

    /**
     * Sets the value for the named component parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentparameter.html#cfn-imagebuilder-containerrecipe-componentparameter-value)
     */
    public fun `value`(): List<String>

    /**
     * A builder for [ComponentParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the component parameter to set. 
       */
      public fun name(name: String)

      /**
       * @param value Sets the value for the named component parameter. 
       */
      public fun `value`(`value`: List<String>)

      /**
       * @param value Sets the value for the named component parameter. 
       */
      public fun `value`(vararg `value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty.builder()

      /**
       * @param name The name of the component parameter to set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value Sets the value for the named component parameter. 
       */
      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param value Sets the value for the named component parameter. 
       */
      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty,
    ) : CdkObject(cdkObject),
        ComponentParameterProperty {
      /**
       * The name of the component parameter to set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentparameter.html#cfn-imagebuilder-containerrecipe-componentparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Sets the value for the named component parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentparameter.html#cfn-imagebuilder-containerrecipe-componentparameter-value)
       */
      override fun `value`(): List<String> = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty):
          ComponentParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentParameterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty
    }
  }

  /**
   * Amazon EBS-specific block device mapping specifications.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * EbsInstanceBlockDeviceSpecificationProperty ebsInstanceBlockDeviceSpecificationProperty =
   * EbsInstanceBlockDeviceSpecificationProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .snapshotId("snapshotId")
   * .throughput(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html)
   */
  public interface EbsInstanceBlockDeviceSpecificationProperty {
    /**
     * Use to configure delete on termination of the associated device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * Use to configure device encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * Use to configure device IOPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * Use to configure the KMS key to use when encrypting the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The snapshot that defines the device contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-snapshotid)
     */
    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * *For GP3 volumes only* – The throughput in MiB/s that the volume supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * Use to override the device's volume size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * Use to override the device's volume type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [EbsInstanceBlockDeviceSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteOnTermination Use to configure delete on termination of the associated device.
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Use to configure delete on termination of the associated device.
       */
      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      /**
       * @param encrypted Use to configure device encryption.
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted Use to configure device encryption.
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param iops Use to configure device IOPS.
       */
      public fun iops(iops: Number)

      /**
       * @param kmsKeyId Use to configure the KMS key to use when encrypting the device.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param snapshotId The snapshot that defines the device contents.
       */
      public fun snapshotId(snapshotId: String)

      /**
       * @param throughput *For GP3 volumes only* – The throughput in MiB/s that the volume
       * supports.
       */
      public fun throughput(throughput: Number)

      /**
       * @param volumeSize Use to override the device's volume size.
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType Use to override the device's volume type.
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty.builder()

      /**
       * @param deleteOnTermination Use to configure delete on termination of the associated device.
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Use to configure delete on termination of the associated device.
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encrypted Use to configure device encryption.
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted Use to configure device encryption.
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iops Use to configure device IOPS.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param kmsKeyId Use to configure the KMS key to use when encrypting the device.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param snapshotId The snapshot that defines the device contents.
       */
      override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      /**
       * @param throughput *For GP3 volumes only* – The throughput in MiB/s that the volume
       * supports.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      /**
       * @param volumeSize Use to override the device's volume size.
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType Use to override the device's volume type.
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty,
    ) : CdkObject(cdkObject),
        EbsInstanceBlockDeviceSpecificationProperty {
      /**
       * Use to configure delete on termination of the associated device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * Use to configure device encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * Use to configure device IOPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * Use to configure the KMS key to use when encrypting the device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The snapshot that defines the device contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-snapshotid)
       */
      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      /**
       * *For GP3 volumes only* – The throughput in MiB/s that the volume supports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * Use to override the device's volume size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * Use to override the device's volume type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EbsInstanceBlockDeviceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty):
          EbsInstanceBlockDeviceSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EbsInstanceBlockDeviceSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsInstanceBlockDeviceSpecificationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty
    }
  }

  /**
   * Defines block device mappings for the instance used to configure your image.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * InstanceBlockDeviceMappingProperty instanceBlockDeviceMappingProperty =
   * InstanceBlockDeviceMappingProperty.builder()
   * .deviceName("deviceName")
   * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .snapshotId("snapshotId")
   * .throughput(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build())
   * .noDevice("noDevice")
   * .virtualName("virtualName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html)
   */
  public interface InstanceBlockDeviceMappingProperty {
    /**
     * The device to which these mappings apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html#cfn-imagebuilder-containerrecipe-instanceblockdevicemapping-devicename)
     */
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * Use to manage Amazon EBS-specific configuration for this mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html#cfn-imagebuilder-containerrecipe-instanceblockdevicemapping-ebs)
     */
    public fun ebs(): Any? = unwrap(this).getEbs()

    /**
     * Use to remove a mapping from the base image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html#cfn-imagebuilder-containerrecipe-instanceblockdevicemapping-nodevice)
     */
    public fun noDevice(): String? = unwrap(this).getNoDevice()

    /**
     * Use to manage instance ephemeral devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html#cfn-imagebuilder-containerrecipe-instanceblockdevicemapping-virtualname)
     */
    public fun virtualName(): String? = unwrap(this).getVirtualName()

    /**
     * A builder for [InstanceBlockDeviceMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceName The device to which these mappings apply.
       */
      public fun deviceName(deviceName: String)

      /**
       * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
       */
      public fun ebs(ebs: IResolvable)

      /**
       * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
       */
      public fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty)

      /**
       * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d805bca8ddeaeb2aace425ac7d011fce15357f0cc16a2c00a08c218985ec5a3a")
      public fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit)

      /**
       * @param noDevice Use to remove a mapping from the base image.
       */
      public fun noDevice(noDevice: String)

      /**
       * @param virtualName Use to manage instance ephemeral devices.
       */
      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty.builder()

      /**
       * @param deviceName The device to which these mappings apply.
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
       */
      override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
       */
      override fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty) {
        cdkBuilder.ebs(ebs.let(EbsInstanceBlockDeviceSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d805bca8ddeaeb2aace425ac7d011fce15357f0cc16a2c00a08c218985ec5a3a")
      override fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit): Unit =
          ebs(EbsInstanceBlockDeviceSpecificationProperty(ebs))

      /**
       * @param noDevice Use to remove a mapping from the base image.
       */
      override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      /**
       * @param virtualName Use to manage instance ephemeral devices.
       */
      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty,
    ) : CdkObject(cdkObject),
        InstanceBlockDeviceMappingProperty {
      /**
       * The device to which these mappings apply.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html#cfn-imagebuilder-containerrecipe-instanceblockdevicemapping-devicename)
       */
      override fun deviceName(): String? = unwrap(this).getDeviceName()

      /**
       * Use to manage Amazon EBS-specific configuration for this mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html#cfn-imagebuilder-containerrecipe-instanceblockdevicemapping-ebs)
       */
      override fun ebs(): Any? = unwrap(this).getEbs()

      /**
       * Use to remove a mapping from the base image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html#cfn-imagebuilder-containerrecipe-instanceblockdevicemapping-nodevice)
       */
      override fun noDevice(): String? = unwrap(this).getNoDevice()

      /**
       * Use to manage instance ephemeral devices.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html#cfn-imagebuilder-containerrecipe-instanceblockdevicemapping-virtualname)
       */
      override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceBlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty):
          InstanceBlockDeviceMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceBlockDeviceMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceBlockDeviceMappingProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty
    }
  }

  /**
   * Defines a custom base AMI and block device mapping configurations of an instance used for
   * building and testing container images.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * InstanceConfigurationProperty instanceConfigurationProperty =
   * InstanceConfigurationProperty.builder()
   * .blockDeviceMappings(List.of(InstanceBlockDeviceMappingProperty.builder()
   * .deviceName("deviceName")
   * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .snapshotId("snapshotId")
   * .throughput(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build())
   * .noDevice("noDevice")
   * .virtualName("virtualName")
   * .build()))
   * .image("image")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceconfiguration.html)
   */
  public interface InstanceConfigurationProperty {
    /**
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceconfiguration.html#cfn-imagebuilder-containerrecipe-instanceconfiguration-blockdevicemappings)
     */
    public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /**
     * The AMI ID to use as the base image for a container build and test instance.
     *
     * If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceconfiguration.html#cfn-imagebuilder-containerrecipe-instanceconfiguration-image)
     */
    public fun image(): String? = unwrap(this).getImage()

    /**
     * A builder for [InstanceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockDeviceMappings Defines the block devices to attach for building an instance
       * from this Image Builder AMI.
       */
      public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

      /**
       * @param blockDeviceMappings Defines the block devices to attach for building an instance
       * from this Image Builder AMI.
       */
      public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

      /**
       * @param blockDeviceMappings Defines the block devices to attach for building an instance
       * from this Image Builder AMI.
       */
      public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

      /**
       * @param image The AMI ID to use as the base image for a container build and test instance.
       * If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
       */
      public fun image(image: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty.builder()

      /**
       * @param blockDeviceMappings Defines the block devices to attach for building an instance
       * from this Image Builder AMI.
       */
      override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blockDeviceMappings Defines the block devices to attach for building an instance
       * from this Image Builder AMI.
       */
      override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param blockDeviceMappings Defines the block devices to attach for building an instance
       * from this Image Builder AMI.
       */
      override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
          blockDeviceMappings(blockDeviceMappings.toList())

      /**
       * @param image The AMI ID to use as the base image for a container build and test instance.
       * If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty,
    ) : CdkObject(cdkObject),
        InstanceConfigurationProperty {
      /**
       * Defines the block devices to attach for building an instance from this Image Builder AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceconfiguration.html#cfn-imagebuilder-containerrecipe-instanceconfiguration-blockdevicemappings)
       */
      override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

      /**
       * The AMI ID to use as the base image for a container build and test instance.
       *
       * If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceconfiguration.html#cfn-imagebuilder-containerrecipe-instanceconfiguration-image)
       */
      override fun image(): String? = unwrap(this).getImage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty):
          InstanceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty
    }
  }

  /**
   * The container repository where the output container image is stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * TargetContainerRepositoryProperty targetContainerRepositoryProperty =
   * TargetContainerRepositoryProperty.builder()
   * .repositoryName("repositoryName")
   * .service("service")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-targetcontainerrepository.html)
   */
  public interface TargetContainerRepositoryProperty {
    /**
     * The name of the container repository where the output container image is stored.
     *
     * This name is prefixed by the repository location. For example, `&lt;repository location
     * url&gt;/repository_name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-targetcontainerrepository.html#cfn-imagebuilder-containerrecipe-targetcontainerrepository-repositoryname)
     */
    public fun repositoryName(): String? = unwrap(this).getRepositoryName()

    /**
     * Specifies the service in which this image was registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-targetcontainerrepository.html#cfn-imagebuilder-containerrecipe-targetcontainerrepository-service)
     */
    public fun service(): String? = unwrap(this).getService()

    /**
     * A builder for [TargetContainerRepositoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param repositoryName The name of the container repository where the output container image
       * is stored.
       * This name is prefixed by the repository location. For example, `&lt;repository location
       * url&gt;/repository_name` .
       */
      public fun repositoryName(repositoryName: String)

      /**
       * @param service Specifies the service in which this image was registered.
       */
      public fun service(service: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty.builder()

      /**
       * @param repositoryName The name of the container repository where the output container image
       * is stored.
       * This name is prefixed by the repository location. For example, `&lt;repository location
       * url&gt;/repository_name` .
       */
      override fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
      }

      /**
       * @param service Specifies the service in which this image was registered.
       */
      override fun service(service: String) {
        cdkBuilder.service(service)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty,
    ) : CdkObject(cdkObject),
        TargetContainerRepositoryProperty {
      /**
       * The name of the container repository where the output container image is stored.
       *
       * This name is prefixed by the repository location. For example, `&lt;repository location
       * url&gt;/repository_name` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-targetcontainerrepository.html#cfn-imagebuilder-containerrecipe-targetcontainerrepository-repositoryname)
       */
      override fun repositoryName(): String? = unwrap(this).getRepositoryName()

      /**
       * Specifies the service in which this image was registered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-targetcontainerrepository.html#cfn-imagebuilder-containerrecipe-targetcontainerrepository-service)
       */
      override fun service(): String? = unwrap(this).getService()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetContainerRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty):
          TargetContainerRepositoryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetContainerRepositoryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetContainerRepositoryProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty
    }
  }
}
