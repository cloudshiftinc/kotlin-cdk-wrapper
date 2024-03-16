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
 * An Image Builder image recipe is a document that defines the base image and the components to be
 * applied to the base image to produce the desired configuration for the output image.
 *
 * You can use an image recipe to duplicate builds. Image Builder image recipes can be shared,
 * branched, and edited using the console wizard, the AWS CLI , or the API. You can use image recipes
 * with your version control software to maintain shareable versioned image recipes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnImageRecipe cfnImageRecipe = CfnImageRecipe.Builder.create(this, "MyCfnImageRecipe")
 * .components(List.of(ComponentConfigurationProperty.builder()
 * .componentArn("componentArn")
 * .parameters(List.of(ComponentParameterProperty.builder()
 * .name("name")
 * .value(List.of("value"))
 * .build()))
 * .build()))
 * .name("name")
 * .parentImage("parentImage")
 * .version("version")
 * // the properties below are optional
 * .additionalInstanceConfiguration(AdditionalInstanceConfigurationProperty.builder()
 * .systemsManagerAgent(SystemsManagerAgentProperty.builder()
 * .uninstallAfterBuild(false)
 * .build())
 * .userDataOverride("userDataOverride")
 * .build())
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
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html)
 */
public open class CfnImageRecipe internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build and
   * test your image configuration.
   */
  public open fun additionalInstanceConfiguration(): Any? =
      unwrap(this).getAdditionalInstanceConfiguration()

  /**
   * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build and
   * test your image configuration.
   */
  public open fun additionalInstanceConfiguration(`value`: IResolvable) {
    unwrap(this).setAdditionalInstanceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build and
   * test your image configuration.
   */
  public open
      fun additionalInstanceConfiguration(`value`: AdditionalInstanceConfigurationProperty) {
    unwrap(this).setAdditionalInstanceConfiguration(`value`.let(AdditionalInstanceConfigurationProperty::unwrap))
  }

  /**
   * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build and
   * test your image configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("87e1addaa4dd7de53714f1ca031ddec8f55e45491d7d3b3a927f67498a81b892")
  public open
      fun additionalInstanceConfiguration(`value`: AdditionalInstanceConfigurationProperty.Builder.() -> Unit):
      Unit = additionalInstanceConfiguration(AdditionalInstanceConfigurationProperty(`value`))

  /**
   * Returns the Amazon Resource Name (ARN) of the image recipe.
   *
   * For example,
   * `arn:aws:imagebuilder:us-east-1:123456789012:image-recipe/mybasicrecipe/2019.12.03` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the image recipe.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The block device mappings to apply when creating images from this recipe.
   */
  public open fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  /**
   * The block device mappings to apply when creating images from this recipe.
   */
  public open fun blockDeviceMappings(`value`: IResolvable) {
    unwrap(this).setBlockDeviceMappings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The block device mappings to apply when creating images from this recipe.
   */
  public open fun blockDeviceMappings(`value`: List<Any>) {
    unwrap(this).setBlockDeviceMappings(`value`)
  }

  /**
   * The block device mappings to apply when creating images from this recipe.
   */
  public open fun blockDeviceMappings(vararg `value`: Any): Unit =
      blockDeviceMappings(`value`.toList())

  /**
   * The components of the image recipe.
   */
  public open fun components(): Any = unwrap(this).getComponents()

  /**
   * The components of the image recipe.
   */
  public open fun components(`value`: IResolvable) {
    unwrap(this).setComponents(`value`.let(IResolvable::unwrap))
  }

  /**
   * The components of the image recipe.
   */
  public open fun components(`value`: List<Any>) {
    unwrap(this).setComponents(`value`)
  }

  /**
   * The components of the image recipe.
   */
  public open fun components(vararg `value`: Any): Unit = components(`value`.toList())

  /**
   * The description of the image recipe.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the image recipe.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The name of the image recipe.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the image recipe.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The parent image of the image recipe.
   */
  public open fun parentImage(): String = unwrap(this).getParentImage()

  /**
   * The parent image of the image recipe.
   */
  public open fun parentImage(`value`: String) {
    unwrap(this).setParentImage(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of the image recipe.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags of the image recipe.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The semantic version of the image recipe.
   */
  public open fun version(): String = unwrap(this).getVersion()

  /**
   * The semantic version of the image recipe.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * The working directory to be used during build and test workflows.
   */
  public open fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * The working directory to be used during build and test workflows.
   */
  public open fun workingDirectory(`value`: String) {
    unwrap(this).setWorkingDirectory(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.imagebuilder.CfnImageRecipe].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build
     * and test your image configuration.
     *
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration)
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration. 
     */
    public fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable)

    /**
     * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build
     * and test your image configuration.
     *
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration)
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration. 
     */
    public
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: AdditionalInstanceConfigurationProperty)

    /**
     * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build
     * and test your image configuration.
     *
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration)
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c792503db491a17e5a33ca7eff774f01e9559bcbfb437dc2ca9d82c53b23915e")
    public
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: AdditionalInstanceConfigurationProperty.Builder.() -> Unit)

    /**
     * The block device mappings to apply when creating images from this recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-blockdevicemappings)
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe. 
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    /**
     * The block device mappings to apply when creating images from this recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-blockdevicemappings)
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe. 
     */
    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    /**
     * The block device mappings to apply when creating images from this recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-blockdevicemappings)
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe. 
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    /**
     * The components of the image recipe.
     *
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-components)
     * @param components The components of the image recipe. 
     */
    public fun components(components: IResolvable)

    /**
     * The components of the image recipe.
     *
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-components)
     * @param components The components of the image recipe. 
     */
    public fun components(components: List<Any>)

    /**
     * The components of the image recipe.
     *
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-components)
     * @param components The components of the image recipe. 
     */
    public fun components(vararg components: Any)

    /**
     * The description of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-description)
     * @param description The description of the image recipe. 
     */
    public fun description(description: String)

    /**
     * The name of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-name)
     * @param name The name of the image recipe. 
     */
    public fun name(name: String)

    /**
     * The parent image of the image recipe.
     *
     * The string must be either an Image ARN or an AMI ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-parentimage)
     * @param parentImage The parent image of the image recipe. 
     */
    public fun parentImage(parentImage: String)

    /**
     * The tags of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-tags)
     * @param tags The tags of the image recipe. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The semantic version of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-version)
     * @param version The semantic version of the image recipe. 
     */
    public fun version(version: String)

    /**
     * The working directory to be used during build and test workflows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-workingdirectory)
     * @param workingDirectory The working directory to be used during build and test workflows. 
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.Builder.create(scope, id)

    /**
     * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build
     * and test your image configuration.
     *
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration)
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration. 
     */
    override fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable) {
      cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build
     * and test your image configuration.
     *
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration)
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration. 
     */
    override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: AdditionalInstanceConfigurationProperty) {
      cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration.let(AdditionalInstanceConfigurationProperty::unwrap))
    }

    /**
     * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build
     * and test your image configuration.
     *
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration)
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c792503db491a17e5a33ca7eff774f01e9559bcbfb437dc2ca9d82c53b23915e")
    override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: AdditionalInstanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        additionalInstanceConfiguration(AdditionalInstanceConfigurationProperty(additionalInstanceConfiguration))

    /**
     * The block device mappings to apply when creating images from this recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-blockdevicemappings)
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe. 
     */
    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    /**
     * The block device mappings to apply when creating images from this recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-blockdevicemappings)
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe. 
     */
    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * The block device mappings to apply when creating images from this recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-blockdevicemappings)
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe. 
     */
    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    /**
     * The components of the image recipe.
     *
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-components)
     * @param components The components of the image recipe. 
     */
    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    /**
     * The components of the image recipe.
     *
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-components)
     * @param components The components of the image recipe. 
     */
    override fun components(components: List<Any>) {
      cdkBuilder.components(components)
    }

    /**
     * The components of the image recipe.
     *
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-components)
     * @param components The components of the image recipe. 
     */
    override fun components(vararg components: Any): Unit = components(components.toList())

    /**
     * The description of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-description)
     * @param description The description of the image recipe. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-name)
     * @param name The name of the image recipe. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The parent image of the image recipe.
     *
     * The string must be either an Image ARN or an AMI ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-parentimage)
     * @param parentImage The parent image of the image recipe. 
     */
    override fun parentImage(parentImage: String) {
      cdkBuilder.parentImage(parentImage)
    }

    /**
     * The tags of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-tags)
     * @param tags The tags of the image recipe. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The semantic version of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-version)
     * @param version The semantic version of the image recipe. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    /**
     * The working directory to be used during build and test workflows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-workingdirectory)
     * @param workingDirectory The working directory to be used during build and test workflows. 
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImageRecipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImageRecipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe):
        CfnImageRecipe = CfnImageRecipe(cdkObject)

    internal fun unwrap(wrapped: CfnImageRecipe):
        software.amazon.awscdk.services.imagebuilder.CfnImageRecipe = wrapped.cdkObject
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentparameter.html)
   */
  public interface ComponentParameterProperty {
    /**
     * The name of the component parameter to set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentparameter.html#cfn-imagebuilder-imagerecipe-componentparameter-name)
     */
    public fun name(): String

    /**
     * Sets the value for the named component parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentparameter.html#cfn-imagebuilder-imagerecipe-componentparameter-value)
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
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty.builder()

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
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty,
    ) : CdkObject(cdkObject), ComponentParameterProperty {
      /**
       * The name of the component parameter to set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentparameter.html#cfn-imagebuilder-imagerecipe-componentparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Sets the value for the named component parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentparameter.html#cfn-imagebuilder-imagerecipe-componentparameter-value)
       */
      override fun `value`(): List<String> = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty):
          ComponentParameterProperty = CdkObjectWrappers.wrap(cdkObject) as
          ComponentParameterProperty

      internal fun unwrap(wrapped: ComponentParameterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty
    }
  }

  /**
   * In addition to your infrastructure configuration, these settings provide an extra layer of
   * control over your build instances.
   *
   * You can also specify commands to run on launch for all of your build instances.
   *
   * Image Builder does not automatically install the Systems Manager agent on Windows instances. If
   * your base image includes the Systems Manager agent, then the AMI that you create will also include
   * the agent. For Linux instances, if the base image does not already include the Systems Manager
   * agent, Image Builder installs it. For Linux instances where Image Builder installs the Systems
   * Manager agent, you can choose whether to keep it for the AMI that you create.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * AdditionalInstanceConfigurationProperty additionalInstanceConfigurationProperty =
   * AdditionalInstanceConfigurationProperty.builder()
   * .systemsManagerAgent(SystemsManagerAgentProperty.builder()
   * .uninstallAfterBuild(false)
   * .build())
   * .userDataOverride("userDataOverride")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-additionalinstanceconfiguration.html)
   */
  public interface AdditionalInstanceConfigurationProperty {
    /**
     * Contains settings for the Systems Manager agent on your build instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-additionalinstanceconfiguration.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration-systemsmanageragent)
     */
    public fun systemsManagerAgent(): Any? = unwrap(this).getSystemsManagerAgent()

    /**
     * Use this property to provide commands or a command script to run when you launch your build
     * instance.
     *
     * The userDataOverride property replaces any commands that Image Builder might have added to
     * ensure that Systems Manager is installed on your Linux build instance. If you override the user
     * data, make sure that you add commands to install Systems Manager, if it is not pre-installed on
     * your base image.
     *
     *
     * The user data is always base 64 encoded. For example, the following commands are encoded as
     * `IyEvYmluL2Jhc2gKbWtkaXIgLXAgL3Zhci9iYi8KdG91Y2ggL3Zhci$` :
     *
     * *#!/bin/bash*
     *
     * mkdir -p /var/bb/
     *
     * touch /var
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-additionalinstanceconfiguration.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration-userdataoverride)
     */
    public fun userDataOverride(): String? = unwrap(this).getUserDataOverride()

    /**
     * A builder for [AdditionalInstanceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param systemsManagerAgent Contains settings for the Systems Manager agent on your build
       * instance.
       */
      public fun systemsManagerAgent(systemsManagerAgent: IResolvable)

      /**
       * @param systemsManagerAgent Contains settings for the Systems Manager agent on your build
       * instance.
       */
      public fun systemsManagerAgent(systemsManagerAgent: SystemsManagerAgentProperty)

      /**
       * @param systemsManagerAgent Contains settings for the Systems Manager agent on your build
       * instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9103d23f896be0e9de53c701e87aafb2c948661dcff257c9a29cb652d6cb1329")
      public
          fun systemsManagerAgent(systemsManagerAgent: SystemsManagerAgentProperty.Builder.() -> Unit)

      /**
       * @param userDataOverride Use this property to provide commands or a command script to run
       * when you launch your build instance.
       * The userDataOverride property replaces any commands that Image Builder might have added to
       * ensure that Systems Manager is installed on your Linux build instance. If you override the
       * user data, make sure that you add commands to install Systems Manager, if it is not
       * pre-installed on your base image.
       *
       *
       * The user data is always base 64 encoded. For example, the following commands are encoded as
       * `IyEvYmluL2Jhc2gKbWtkaXIgLXAgL3Zhci9iYi8KdG91Y2ggL3Zhci$` :
       *
       * *#!/bin/bash*
       *
       * mkdir -p /var/bb/
       *
       * touch /var
       */
      public fun userDataOverride(userDataOverride: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty.builder()

      /**
       * @param systemsManagerAgent Contains settings for the Systems Manager agent on your build
       * instance.
       */
      override fun systemsManagerAgent(systemsManagerAgent: IResolvable) {
        cdkBuilder.systemsManagerAgent(systemsManagerAgent.let(IResolvable::unwrap))
      }

      /**
       * @param systemsManagerAgent Contains settings for the Systems Manager agent on your build
       * instance.
       */
      override fun systemsManagerAgent(systemsManagerAgent: SystemsManagerAgentProperty) {
        cdkBuilder.systemsManagerAgent(systemsManagerAgent.let(SystemsManagerAgentProperty::unwrap))
      }

      /**
       * @param systemsManagerAgent Contains settings for the Systems Manager agent on your build
       * instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9103d23f896be0e9de53c701e87aafb2c948661dcff257c9a29cb652d6cb1329")
      override
          fun systemsManagerAgent(systemsManagerAgent: SystemsManagerAgentProperty.Builder.() -> Unit):
          Unit = systemsManagerAgent(SystemsManagerAgentProperty(systemsManagerAgent))

      /**
       * @param userDataOverride Use this property to provide commands or a command script to run
       * when you launch your build instance.
       * The userDataOverride property replaces any commands that Image Builder might have added to
       * ensure that Systems Manager is installed on your Linux build instance. If you override the
       * user data, make sure that you add commands to install Systems Manager, if it is not
       * pre-installed on your base image.
       *
       *
       * The user data is always base 64 encoded. For example, the following commands are encoded as
       * `IyEvYmluL2Jhc2gKbWtkaXIgLXAgL3Zhci9iYi8KdG91Y2ggL3Zhci$` :
       *
       * *#!/bin/bash*
       *
       * mkdir -p /var/bb/
       *
       * touch /var
       */
      override fun userDataOverride(userDataOverride: String) {
        cdkBuilder.userDataOverride(userDataOverride)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty,
    ) : CdkObject(cdkObject), AdditionalInstanceConfigurationProperty {
      /**
       * Contains settings for the Systems Manager agent on your build instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-additionalinstanceconfiguration.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration-systemsmanageragent)
       */
      override fun systemsManagerAgent(): Any? = unwrap(this).getSystemsManagerAgent()

      /**
       * Use this property to provide commands or a command script to run when you launch your build
       * instance.
       *
       * The userDataOverride property replaces any commands that Image Builder might have added to
       * ensure that Systems Manager is installed on your Linux build instance. If you override the
       * user data, make sure that you add commands to install Systems Manager, if it is not
       * pre-installed on your base image.
       *
       *
       * The user data is always base 64 encoded. For example, the following commands are encoded as
       * `IyEvYmluL2Jhc2gKbWtkaXIgLXAgL3Zhci9iYi8KdG91Y2ggL3Zhci$` :
       *
       * *#!/bin/bash*
       *
       * mkdir -p /var/bb/
       *
       * touch /var
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-additionalinstanceconfiguration.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration-userdataoverride)
       */
      override fun userDataOverride(): String? = unwrap(this).getUserDataOverride()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdditionalInstanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty):
          AdditionalInstanceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          AdditionalInstanceConfigurationProperty

      internal fun unwrap(wrapped: AdditionalInstanceConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty
    }
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html)
   */
  public interface ComponentConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html#cfn-imagebuilder-imagerecipe-componentconfiguration-componentarn)
     */
    public fun componentArn(): String? = unwrap(this).getComponentArn()

    /**
     * A group of parameter settings that Image Builder uses to configure the component for a
     * specific recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html#cfn-imagebuilder-imagerecipe-componentconfiguration-parameters)
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
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty.builder()

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
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters A group of parameter settings that Image Builder uses to configure the
       * component for a specific recipe.
       */
      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param parameters A group of parameter settings that Image Builder uses to configure the
       * component for a specific recipe.
       */
      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty,
    ) : CdkObject(cdkObject), ComponentConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html#cfn-imagebuilder-imagerecipe-componentconfiguration-componentarn)
       */
      override fun componentArn(): String? = unwrap(this).getComponentArn()

      /**
       * A group of parameter settings that Image Builder uses to configure the component for a
       * specific recipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html#cfn-imagebuilder-imagerecipe-componentconfiguration-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty):
          ComponentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          ComponentConfigurationProperty

      internal fun unwrap(wrapped: ComponentConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty
    }
  }

  /**
   * Contains settings for the Systems Manager agent on your build instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * SystemsManagerAgentProperty systemsManagerAgentProperty = SystemsManagerAgentProperty.builder()
   * .uninstallAfterBuild(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-systemsmanageragent.html)
   */
  public interface SystemsManagerAgentProperty {
    /**
     * Controls whether the Systems Manager agent is removed from your final build image, prior to
     * creating the new AMI.
     *
     * If this is set to true, then the agent is removed from the final image. If it's set to false,
     * then the agent is left in, so that it is included in the new AMI. The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-systemsmanageragent.html#cfn-imagebuilder-imagerecipe-systemsmanageragent-uninstallafterbuild)
     */
    public fun uninstallAfterBuild(): Any? = unwrap(this).getUninstallAfterBuild()

    /**
     * A builder for [SystemsManagerAgentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param uninstallAfterBuild Controls whether the Systems Manager agent is removed from your
       * final build image, prior to creating the new AMI.
       * If this is set to true, then the agent is removed from the final image. If it's set to
       * false, then the agent is left in, so that it is included in the new AMI. The default value is
       * false.
       */
      public fun uninstallAfterBuild(uninstallAfterBuild: Boolean)

      /**
       * @param uninstallAfterBuild Controls whether the Systems Manager agent is removed from your
       * final build image, prior to creating the new AMI.
       * If this is set to true, then the agent is removed from the final image. If it's set to
       * false, then the agent is left in, so that it is included in the new AMI. The default value is
       * false.
       */
      public fun uninstallAfterBuild(uninstallAfterBuild: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty.builder()

      /**
       * @param uninstallAfterBuild Controls whether the Systems Manager agent is removed from your
       * final build image, prior to creating the new AMI.
       * If this is set to true, then the agent is removed from the final image. If it's set to
       * false, then the agent is left in, so that it is included in the new AMI. The default value is
       * false.
       */
      override fun uninstallAfterBuild(uninstallAfterBuild: Boolean) {
        cdkBuilder.uninstallAfterBuild(uninstallAfterBuild)
      }

      /**
       * @param uninstallAfterBuild Controls whether the Systems Manager agent is removed from your
       * final build image, prior to creating the new AMI.
       * If this is set to true, then the agent is removed from the final image. If it's set to
       * false, then the agent is left in, so that it is included in the new AMI. The default value is
       * false.
       */
      override fun uninstallAfterBuild(uninstallAfterBuild: IResolvable) {
        cdkBuilder.uninstallAfterBuild(uninstallAfterBuild.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty,
    ) : CdkObject(cdkObject), SystemsManagerAgentProperty {
      /**
       * Controls whether the Systems Manager agent is removed from your final build image, prior to
       * creating the new AMI.
       *
       * If this is set to true, then the agent is removed from the final image. If it's set to
       * false, then the agent is left in, so that it is included in the new AMI. The default value is
       * false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-systemsmanageragent.html#cfn-imagebuilder-imagerecipe-systemsmanageragent-uninstallafterbuild)
       */
      override fun uninstallAfterBuild(): Any? = unwrap(this).getUninstallAfterBuild()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SystemsManagerAgentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty):
          SystemsManagerAgentProperty = CdkObjectWrappers.wrap(cdkObject) as
          SystemsManagerAgentProperty

      internal fun unwrap(wrapped: SystemsManagerAgentProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html)
   */
  public interface InstanceBlockDeviceMappingProperty {
    /**
     * The device to which these mappings apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html#cfn-imagebuilder-imagerecipe-instanceblockdevicemapping-devicename)
     */
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * Use to manage Amazon EBS-specific configuration for this mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html#cfn-imagebuilder-imagerecipe-instanceblockdevicemapping-ebs)
     */
    public fun ebs(): Any? = unwrap(this).getEbs()

    /**
     * Enter an empty string to remove a mapping from the parent image.
     *
     * The following is an example of an empty string value in the `NoDevice` field.
     *
     * `NoDevice:""`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html#cfn-imagebuilder-imagerecipe-instanceblockdevicemapping-nodevice)
     */
    public fun noDevice(): String? = unwrap(this).getNoDevice()

    /**
     * Manages the instance ephemeral devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html#cfn-imagebuilder-imagerecipe-instanceblockdevicemapping-virtualname)
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
      @JvmName("81df05fefd03046b380ec12ea800dec283d0ed7acb50b2a7b9ce3905e31e3b5e")
      public fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit)

      /**
       * @param noDevice Enter an empty string to remove a mapping from the parent image.
       * The following is an example of an empty string value in the `NoDevice` field.
       *
       * `NoDevice:""`
       */
      public fun noDevice(noDevice: String)

      /**
       * @param virtualName Manages the instance ephemeral devices.
       */
      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty.builder()

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
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      /**
       * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
       */
      override fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty) {
        cdkBuilder.ebs(ebs.let(EbsInstanceBlockDeviceSpecificationProperty::unwrap))
      }

      /**
       * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81df05fefd03046b380ec12ea800dec283d0ed7acb50b2a7b9ce3905e31e3b5e")
      override fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit): Unit =
          ebs(EbsInstanceBlockDeviceSpecificationProperty(ebs))

      /**
       * @param noDevice Enter an empty string to remove a mapping from the parent image.
       * The following is an example of an empty string value in the `NoDevice` field.
       *
       * `NoDevice:""`
       */
      override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      /**
       * @param virtualName Manages the instance ephemeral devices.
       */
      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty,
    ) : CdkObject(cdkObject), InstanceBlockDeviceMappingProperty {
      /**
       * The device to which these mappings apply.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html#cfn-imagebuilder-imagerecipe-instanceblockdevicemapping-devicename)
       */
      override fun deviceName(): String? = unwrap(this).getDeviceName()

      /**
       * Use to manage Amazon EBS-specific configuration for this mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html#cfn-imagebuilder-imagerecipe-instanceblockdevicemapping-ebs)
       */
      override fun ebs(): Any? = unwrap(this).getEbs()

      /**
       * Enter an empty string to remove a mapping from the parent image.
       *
       * The following is an example of an empty string value in the `NoDevice` field.
       *
       * `NoDevice:""`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html#cfn-imagebuilder-imagerecipe-instanceblockdevicemapping-nodevice)
       */
      override fun noDevice(): String? = unwrap(this).getNoDevice()

      /**
       * Manages the instance ephemeral devices.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html#cfn-imagebuilder-imagerecipe-instanceblockdevicemapping-virtualname)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty):
          InstanceBlockDeviceMappingProperty = CdkObjectWrappers.wrap(cdkObject) as
          InstanceBlockDeviceMappingProperty

      internal fun unwrap(wrapped: InstanceBlockDeviceMappingProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty
    }
  }

  /**
   * The image recipe EBS instance block device specification includes the Amazon EBS-specific block
   * device mapping specifications for the image.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html)
   */
  public interface EbsInstanceBlockDeviceSpecificationProperty {
    /**
     * Configures delete on termination of the associated device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * Use to configure device encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * Use to configure device IOPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * Use to configure the KMS key to use when encrypting the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The snapshot that defines the device contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-snapshotid)
     */
    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * *For GP3 volumes only* – The throughput in MiB/s that the volume supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * Overrides the volume size of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * Overrides the volume type of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [EbsInstanceBlockDeviceSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteOnTermination Configures delete on termination of the associated device.
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Configures delete on termination of the associated device.
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
       * @param volumeSize Overrides the volume size of the device.
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType Overrides the volume type of the device.
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty.builder()

      /**
       * @param deleteOnTermination Configures delete on termination of the associated device.
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Configures delete on termination of the associated device.
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
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
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
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
       * @param volumeSize Overrides the volume size of the device.
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType Overrides the volume type of the device.
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty,
    ) : CdkObject(cdkObject), EbsInstanceBlockDeviceSpecificationProperty {
      /**
       * Configures delete on termination of the associated device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * Use to configure device encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * Use to configure device IOPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * Use to configure the KMS key to use when encrypting the device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The snapshot that defines the device contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-snapshotid)
       */
      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      /**
       * *For GP3 volumes only* – The throughput in MiB/s that the volume supports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * Overrides the volume size of the device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * Overrides the volume type of the device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html#cfn-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification-volumetype)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty):
          EbsInstanceBlockDeviceSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as
          EbsInstanceBlockDeviceSpecificationProperty

      internal fun unwrap(wrapped: EbsInstanceBlockDeviceSpecificationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty
    }
  }
}
