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
 * Properties for defining a `CfnContainerRecipe`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnContainerRecipeProps cfnContainerRecipeProps = CfnContainerRecipeProps.builder()
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
public interface CfnContainerRecipeProps {
  /**
   * Build and test components that are included in the container recipe.
   *
   * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
   * components in any combination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
   */
  public fun components(): Any

  /**
   * Specifies the type of container, such as Docker.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-containertype)
   */
  public fun containerType(): String

  /**
   * The description of the container recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Dockerfiles are text documents that are used to build Docker containers, and ensure that they
   * contain all of the elements required by the application running inside.
   *
   * The template data consists of contextual variables where Image Builder places build information
   * or scripts, based on your container image recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplatedata)
   */
  public fun dockerfileTemplateData(): String? = unwrap(this).getDockerfileTemplateData()

  /**
   * The S3 URI for the Dockerfile that will be used to build your container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplateuri)
   */
  public fun dockerfileTemplateUri(): String? = unwrap(this).getDockerfileTemplateUri()

  /**
   * Specifies the operating system version for the base image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-imageosversionoverride)
   */
  public fun imageOsVersionOverride(): String? = unwrap(this).getImageOsVersionOverride()

  /**
   * A group of options that can be used to configure an instance for building and testing container
   * images.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
   */
  public fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

  /**
   * Identifies which KMS key is used to encrypt the container image for distribution to the target
   * Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The name of the container recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-name)
   */
  public fun name(): String

  /**
   * The base image for the container recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-parentimage)
   */
  public fun parentImage(): String

  /**
   * Specifies the operating system platform when you use a custom base image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-platformoverride)
   */
  public fun platformOverride(): String? = unwrap(this).getPlatformOverride()

  /**
   * Tags that are attached to the container recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The destination repository for the container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
   */
  public fun targetRepository(): Any

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
   */
  public fun version(): String

  /**
   * The working directory for use during build and test workflows.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-workingdirectory)
   */
  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * A builder for [CfnContainerRecipeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param components Build and test components that are included in the container recipe. 
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     */
    public fun components(components: IResolvable)

    /**
     * @param components Build and test components that are included in the container recipe. 
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     */
    public fun components(components: List<Any>)

    /**
     * @param components Build and test components that are included in the container recipe. 
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     */
    public fun components(vararg components: Any)

    /**
     * @param containerType Specifies the type of container, such as Docker. 
     */
    public fun containerType(containerType: String)

    /**
     * @param description The description of the container recipe.
     */
    public fun description(description: String)

    /**
     * @param dockerfileTemplateData Dockerfiles are text documents that are used to build Docker
     * containers, and ensure that they contain all of the elements required by the application running
     * inside.
     * The template data consists of contextual variables where Image Builder places build
     * information or scripts, based on your container image recipe.
     */
    public fun dockerfileTemplateData(dockerfileTemplateData: String)

    /**
     * @param dockerfileTemplateUri The S3 URI for the Dockerfile that will be used to build your
     * container image.
     */
    public fun dockerfileTemplateUri(dockerfileTemplateUri: String)

    /**
     * @param imageOsVersionOverride Specifies the operating system version for the base image.
     */
    public fun imageOsVersionOverride(imageOsVersionOverride: String)

    /**
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images.
     */
    public fun instanceConfiguration(instanceConfiguration: IResolvable)

    /**
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images.
     */
    public
        fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty)

    /**
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c363443f4c5d190590bb268b8cb166282a592ababc53d05e1f5d8c1003fc34d4")
    public
        fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId Identifies which KMS key is used to encrypt the container image for
     * distribution to the target Region.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param name The name of the container recipe. 
     */
    public fun name(name: String)

    /**
     * @param parentImage The base image for the container recipe. 
     */
    public fun parentImage(parentImage: String)

    /**
     * @param platformOverride Specifies the operating system platform when you use a custom base
     * image.
     */
    public fun platformOverride(platformOverride: String)

    /**
     * @param tags Tags that are attached to the container recipe.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param targetRepository The destination repository for the container image. 
     */
    public fun targetRepository(targetRepository: IResolvable)

    /**
     * @param targetRepository The destination repository for the container image. 
     */
    public
        fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty)

    /**
     * @param targetRepository The destination repository for the container image. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46103ec57bebb1c59f28d3780e9eca353223a04ba2896eb2016694a825a86fa3")
    public
        fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty.Builder.() -> Unit)

    /**
     * @param version The semantic version of the container recipe. 
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
     */
    public fun version(version: String)

    /**
     * @param workingDirectory The working directory for use during build and test workflows.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps.builder()

    /**
     * @param components Build and test components that are included in the container recipe. 
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     */
    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    /**
     * @param components Build and test components that are included in the container recipe. 
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     */
    override fun components(components: List<Any>) {
      cdkBuilder.components(components.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param components Build and test components that are included in the container recipe. 
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     */
    override fun components(vararg components: Any): Unit = components(components.toList())

    /**
     * @param containerType Specifies the type of container, such as Docker. 
     */
    override fun containerType(containerType: String) {
      cdkBuilder.containerType(containerType)
    }

    /**
     * @param description The description of the container recipe.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param dockerfileTemplateData Dockerfiles are text documents that are used to build Docker
     * containers, and ensure that they contain all of the elements required by the application running
     * inside.
     * The template data consists of contextual variables where Image Builder places build
     * information or scripts, based on your container image recipe.
     */
    override fun dockerfileTemplateData(dockerfileTemplateData: String) {
      cdkBuilder.dockerfileTemplateData(dockerfileTemplateData)
    }

    /**
     * @param dockerfileTemplateUri The S3 URI for the Dockerfile that will be used to build your
     * container image.
     */
    override fun dockerfileTemplateUri(dockerfileTemplateUri: String) {
      cdkBuilder.dockerfileTemplateUri(dockerfileTemplateUri)
    }

    /**
     * @param imageOsVersionOverride Specifies the operating system version for the base image.
     */
    override fun imageOsVersionOverride(imageOsVersionOverride: String) {
      cdkBuilder.imageOsVersionOverride(imageOsVersionOverride)
    }

    /**
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images.
     */
    override fun instanceConfiguration(instanceConfiguration: IResolvable) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images.
     */
    override
        fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(CfnContainerRecipe.InstanceConfigurationProperty::unwrap))
    }

    /**
     * @param instanceConfiguration A group of options that can be used to configure an instance for
     * building and testing container images.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c363443f4c5d190590bb268b8cb166282a592ababc53d05e1f5d8c1003fc34d4")
    override
        fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceConfiguration(CfnContainerRecipe.InstanceConfigurationProperty(instanceConfiguration))

    /**
     * @param kmsKeyId Identifies which KMS key is used to encrypt the container image for
     * distribution to the target Region.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The name of the container recipe. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parentImage The base image for the container recipe. 
     */
    override fun parentImage(parentImage: String) {
      cdkBuilder.parentImage(parentImage)
    }

    /**
     * @param platformOverride Specifies the operating system platform when you use a custom base
     * image.
     */
    override fun platformOverride(platformOverride: String) {
      cdkBuilder.platformOverride(platformOverride)
    }

    /**
     * @param tags Tags that are attached to the container recipe.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targetRepository The destination repository for the container image. 
     */
    override fun targetRepository(targetRepository: IResolvable) {
      cdkBuilder.targetRepository(targetRepository.let(IResolvable::unwrap))
    }

    /**
     * @param targetRepository The destination repository for the container image. 
     */
    override
        fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty) {
      cdkBuilder.targetRepository(targetRepository.let(CfnContainerRecipe.TargetContainerRepositoryProperty::unwrap))
    }

    /**
     * @param targetRepository The destination repository for the container image. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46103ec57bebb1c59f28d3780e9eca353223a04ba2896eb2016694a825a86fa3")
    override
        fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty.Builder.() -> Unit):
        Unit =
        targetRepository(CfnContainerRecipe.TargetContainerRepositoryProperty(targetRepository))

    /**
     * @param version The semantic version of the container recipe. 
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
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    /**
     * @param workingDirectory The working directory for use during build and test workflows.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps,
  ) : CdkObject(cdkObject), CfnContainerRecipeProps {
    /**
     * Build and test components that are included in the container recipe.
     *
     * Recipes require a minimum of one build component, and can have a maximum of 20 build and test
     * components in any combination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-components)
     */
    override fun components(): Any = unwrap(this).getComponents()

    /**
     * Specifies the type of container, such as Docker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-containertype)
     */
    override fun containerType(): String = unwrap(this).getContainerType()

    /**
     * The description of the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they
     * contain all of the elements required by the application running inside.
     *
     * The template data consists of contextual variables where Image Builder places build
     * information or scripts, based on your container image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplatedata)
     */
    override fun dockerfileTemplateData(): String? = unwrap(this).getDockerfileTemplateData()

    /**
     * The S3 URI for the Dockerfile that will be used to build your container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-dockerfiletemplateuri)
     */
    override fun dockerfileTemplateUri(): String? = unwrap(this).getDockerfileTemplateUri()

    /**
     * Specifies the operating system version for the base image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-imageosversionoverride)
     */
    override fun imageOsVersionOverride(): String? = unwrap(this).getImageOsVersionOverride()

    /**
     * A group of options that can be used to configure an instance for building and testing
     * container images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-instanceconfiguration)
     */
    override fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

    /**
     * Identifies which KMS key is used to encrypt the container image for distribution to the
     * target Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The name of the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The base image for the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-parentimage)
     */
    override fun parentImage(): String = unwrap(this).getParentImage()

    /**
     * Specifies the operating system platform when you use a custom base image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-platformoverride)
     */
    override fun platformOverride(): String? = unwrap(this).getPlatformOverride()

    /**
     * Tags that are attached to the container recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The destination repository for the container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-targetrepository)
     */
    override fun targetRepository(): Any = unwrap(this).getTargetRepository()

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
     */
    override fun version(): String = unwrap(this).getVersion()

    /**
     * The working directory for use during build and test workflows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html#cfn-imagebuilder-containerrecipe-workingdirectory)
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContainerRecipeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps):
        CfnContainerRecipeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnContainerRecipeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContainerRecipeProps):
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps
  }
}
