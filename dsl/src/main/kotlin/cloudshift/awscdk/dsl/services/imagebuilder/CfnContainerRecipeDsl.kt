@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.imagebuilder.*;
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
@CdkDslMarker
public class CfnContainerRecipeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnContainerRecipe.Builder = CfnContainerRecipe.Builder.create(scope, id)

  private val _components: MutableList<Any> = mutableListOf()

  /**
   * Build and test components that are included in the container recipe.
   *
   * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
   * components in any combination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
   * @param components Build and test components that are included in the container recipe. 
   */
  public fun components(vararg components: Any) {
    _components.addAll(listOf(*components))
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
  public fun components(components: Collection<Any>) {
    _components.addAll(components)
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
  public fun components(components: IResolvable) {
    cdkBuilder.components(components)
  }

  /**
   * Specifies the type of container, such as Docker.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-containertype)
   * @param containerType Specifies the type of container, such as Docker. 
   */
  public fun containerType(containerType: String) {
    cdkBuilder.containerType(containerType)
  }

  /**
   * The description of the container recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-description)
   * @param description The description of the container recipe. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Dockerfiles are text documents that are used to build Docker containers, and ensure that they
   * contain all of the elements required by the application running inside.
   *
   * The template data consists of contextual variables where Image Builder places build information
   * or scripts, based on your container image recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplatedata)
   * @param dockerfileTemplateData Dockerfiles are text documents that are used to build Docker
   * containers, and ensure that they contain all of the elements required by the application running
   * inside. 
   */
  public fun dockerfileTemplateData(dockerfileTemplateData: String) {
    cdkBuilder.dockerfileTemplateData(dockerfileTemplateData)
  }

  /**
   * The S3 URI for the Dockerfile that will be used to build your container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplateuri)
   * @param dockerfileTemplateUri The S3 URI for the Dockerfile that will be used to build your
   * container image. 
   */
  public fun dockerfileTemplateUri(dockerfileTemplateUri: String) {
    cdkBuilder.dockerfileTemplateUri(dockerfileTemplateUri)
  }

  /**
   * Specifies the operating system version for the base image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-imageosversionoverride)
   * @param imageOsVersionOverride Specifies the operating system version for the base image. 
   */
  public fun imageOsVersionOverride(imageOsVersionOverride: String) {
    cdkBuilder.imageOsVersionOverride(imageOsVersionOverride)
  }

  /**
   * A group of options that can be used to configure an instance for building and testing container
   * images.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
   * @param instanceConfiguration A group of options that can be used to configure an instance for
   * building and testing container images. 
   */
  public fun instanceConfiguration(instanceConfiguration: IResolvable) {
    cdkBuilder.instanceConfiguration(instanceConfiguration)
  }

  /**
   * A group of options that can be used to configure an instance for building and testing container
   * images.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
   * @param instanceConfiguration A group of options that can be used to configure an instance for
   * building and testing container images. 
   */
  public
      fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty) {
    cdkBuilder.instanceConfiguration(instanceConfiguration)
  }

  /**
   * Identifies which KMS key is used to encrypt the container image for distribution to the target
   * Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-kmskeyid)
   * @param kmsKeyId Identifies which KMS key is used to encrypt the container image for
   * distribution to the target Region. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * The name of the container recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-name)
   * @param name The name of the container recipe. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The base image for the container recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-parentimage)
   * @param parentImage The base image for the container recipe. 
   */
  public fun parentImage(parentImage: String) {
    cdkBuilder.parentImage(parentImage)
  }

  /**
   * Specifies the operating system platform when you use a custom base image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-platformoverride)
   * @param platformOverride Specifies the operating system platform when you use a custom base
   * image. 
   */
  public fun platformOverride(platformOverride: String) {
    cdkBuilder.platformOverride(platformOverride)
  }

  /**
   * Tags that are attached to the container recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-tags)
   * @param tags Tags that are attached to the container recipe. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * The destination repository for the container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
   * @param targetRepository The destination repository for the container image. 
   */
  public fun targetRepository(targetRepository: IResolvable) {
    cdkBuilder.targetRepository(targetRepository)
  }

  /**
   * The destination repository for the container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
   * @param targetRepository The destination repository for the container image. 
   */
  public
      fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty) {
    cdkBuilder.targetRepository(targetRepository)
  }

  /**
   * The semantic version of the container recipe.
   *
   *
   * The semantic version has four nodes: <major>.<minor>.<patch>/<build>. You can assign values for
   * the first three, and can filter on all of them.
   *
   * *Assignment:* For the first three nodes you can assign any positive integer value, including
   * zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically
   * assigns the build number to the fourth node.
   *
   * *Patterns:* You can use any numeric pattern that adheres to the assignment requirements for the
   * nodes that you can assign. For example, you might choose a software version pattern, such as
   * 1.0.0, or a date, such as 2021.01.01.
   *
   * *Filtering:* With semantic versioning, you have the flexibility to use wildcards (x) to specify
   * the most recent versions or nodes when selecting the base image or components for your recipe.
   * When you use a wildcard in any node, all nodes to the right of the first wildcard must also be
   * wildcards.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-version)
   * @param version The semantic version of the container recipe. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  /**
   * The working directory for use during build and test workflows.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-workingdirectory)
   * @param workingDirectory The working directory for use during build and test workflows. 
   */
  public fun workingDirectory(workingDirectory: String) {
    cdkBuilder.workingDirectory(workingDirectory)
  }

  public fun build(): CfnContainerRecipe {
    if(_components.isNotEmpty()) cdkBuilder.components(_components)
    return cdkBuilder.build()
  }
}
