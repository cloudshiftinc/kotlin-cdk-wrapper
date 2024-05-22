@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnImageRecipe`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnImageRecipeProps cfnImageRecipeProps = CfnImageRecipeProps.builder()
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
public interface CfnImageRecipeProps {
  /**
   * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build and
   * test your image configuration.
   *
   * Instance configuration adds a layer of control over those instances. You can define settings
   * and add scripts to run when an instance is launched from your AMI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration)
   */
  public fun additionalInstanceConfiguration(): Any? =
      unwrap(this).getAdditionalInstanceConfiguration()

  /**
   * The block device mappings to apply when creating images from this recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-blockdevicemappings)
   */
  public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  /**
   * The components of the image recipe.
   *
   * Components are orchestration documents that define a sequence of steps for downloading,
   * installing, configuring, and testing software packages. They also define validation and security
   * hardening steps. A component is defined using a YAML document format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-components)
   */
  public fun components(): Any

  /**
   * The description of the image recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the image recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-name)
   */
  public fun name(): String

  /**
   * The parent image of the image recipe.
   *
   * The string must be either an Image ARN or an AMI ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-parentimage)
   */
  public fun parentImage(): String

  /**
   * The tags of the image recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The semantic version of the image recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-version)
   */
  public fun version(): String

  /**
   * The working directory to be used during build and test workflows.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-workingdirectory)
   */
  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * A builder for [CfnImageRecipeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration.
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     */
    public fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable)

    /**
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration.
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     */
    public
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty)

    /**
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration.
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f26861944211ab6ad13358f80277d4d681bfe1107e0fde705d6715f76bb9dc9")
    public
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe.
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe.
     */
    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe.
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    /**
     * @param components The components of the image recipe. 
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     */
    public fun components(components: IResolvable)

    /**
     * @param components The components of the image recipe. 
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     */
    public fun components(components: List<Any>)

    /**
     * @param components The components of the image recipe. 
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     */
    public fun components(vararg components: Any)

    /**
     * @param description The description of the image recipe.
     */
    public fun description(description: String)

    /**
     * @param name The name of the image recipe. 
     */
    public fun name(name: String)

    /**
     * @param parentImage The parent image of the image recipe. 
     * The string must be either an Image ARN or an AMI ID.
     */
    public fun parentImage(parentImage: String)

    /**
     * @param tags The tags of the image recipe.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param version The semantic version of the image recipe. 
     */
    public fun version(version: String)

    /**
     * @param workingDirectory The working directory to be used during build and test workflows.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps.Builder
        = software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps.builder()

    /**
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration.
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     */
    override fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable) {
      cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration.
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     */
    override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty) {
      cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration.let(CfnImageRecipe.AdditionalInstanceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     * temporary Amazon EC2 instances to build and test your image configuration.
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f26861944211ab6ad13358f80277d4d681bfe1107e0fde705d6715f76bb9dc9")
    override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        additionalInstanceConfiguration(CfnImageRecipe.AdditionalInstanceConfigurationProperty(additionalInstanceConfiguration))

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe.
     */
    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe.
     */
    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     * recipe.
     */
    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    /**
     * @param components The components of the image recipe. 
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     */
    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param components The components of the image recipe. 
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     */
    override fun components(components: List<Any>) {
      cdkBuilder.components(components.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param components The components of the image recipe. 
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     */
    override fun components(vararg components: Any): Unit = components(components.toList())

    /**
     * @param description The description of the image recipe.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the image recipe. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parentImage The parent image of the image recipe. 
     * The string must be either an Image ARN or an AMI ID.
     */
    override fun parentImage(parentImage: String) {
      cdkBuilder.parentImage(parentImage)
    }

    /**
     * @param tags The tags of the image recipe.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param version The semantic version of the image recipe. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    /**
     * @param workingDirectory The working directory to be used during build and test workflows.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps,
  ) : CdkObject(cdkObject), CfnImageRecipeProps {
    /**
     * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build
     * and test your image configuration.
     *
     * Instance configuration adds a layer of control over those instances. You can define settings
     * and add scripts to run when an instance is launched from your AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-additionalinstanceconfiguration)
     */
    override fun additionalInstanceConfiguration(): Any? =
        unwrap(this).getAdditionalInstanceConfiguration()

    /**
     * The block device mappings to apply when creating images from this recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-blockdevicemappings)
     */
    override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /**
     * The components of the image recipe.
     *
     * Components are orchestration documents that define a sequence of steps for downloading,
     * installing, configuring, and testing software packages. They also define validation and security
     * hardening steps. A component is defined using a YAML document format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-components)
     */
    override fun components(): Any = unwrap(this).getComponents()

    /**
     * The description of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The parent image of the image recipe.
     *
     * The string must be either an Image ARN or an AMI ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-parentimage)
     */
    override fun parentImage(): String = unwrap(this).getParentImage()

    /**
     * The tags of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The semantic version of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-version)
     */
    override fun version(): String = unwrap(this).getVersion()

    /**
     * The working directory to be used during build and test workflows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html#cfn-imagebuilder-imagerecipe-workingdirectory)
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageRecipeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps):
        CfnImageRecipeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnImageRecipeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageRecipeProps):
        software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps
  }
}
