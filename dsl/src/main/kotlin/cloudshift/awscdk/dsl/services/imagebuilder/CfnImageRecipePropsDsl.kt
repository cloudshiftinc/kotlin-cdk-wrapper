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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps

/**
 * Properties for defining a `CfnImageRecipe`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
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
@CdkDslMarker
public class CfnImageRecipePropsDsl {
    private val cdkBuilder: CfnImageRecipeProps.Builder = CfnImageRecipeProps.builder()

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    private val _components: MutableList<Any> = mutableListOf()

    /**
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     *   temporary Amazon EC2 instances to build and test your image configuration. Instance
     *   configuration adds a layer of control over those instances. You can define settings and add
     *   scripts to run when an instance is launched from your AMI.
     */
    public fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable) {
        cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration)
    }

    /**
     * @param additionalInstanceConfiguration Before you create a new AMI, Image Builder launches
     *   temporary Amazon EC2 instances to build and test your image configuration. Instance
     *   configuration adds a layer of control over those instances. You can define settings and add
     *   scripts to run when an instance is launched from your AMI.
     */
    public fun additionalInstanceConfiguration(
        additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty
    ) {
        cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration)
    }

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     *   recipe.
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
        _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
    }

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     *   recipe.
     */
    public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
        _blockDeviceMappings.addAll(blockDeviceMappings)
    }

    /**
     * @param blockDeviceMappings The block device mappings to apply when creating images from this
     *   recipe.
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * @param components The components of the image recipe. Components are orchestration documents
     *   that define a sequence of steps for downloading, installing, configuring, and testing
     *   software packages. They also define validation and security hardening steps. A component is
     *   defined using a YAML document format.
     */
    public fun components(vararg components: Any) {
        _components.addAll(listOf(*components))
    }

    /**
     * @param components The components of the image recipe. Components are orchestration documents
     *   that define a sequence of steps for downloading, installing, configuring, and testing
     *   software packages. They also define validation and security hardening steps. A component is
     *   defined using a YAML document format.
     */
    public fun components(components: Collection<Any>) {
        _components.addAll(components)
    }

    /**
     * @param components The components of the image recipe. Components are orchestration documents
     *   that define a sequence of steps for downloading, installing, configuring, and testing
     *   software packages. They also define validation and security hardening steps. A component is
     *   defined using a YAML document format.
     */
    public fun components(components: IResolvable) {
        cdkBuilder.components(components)
    }

    /** @param description The description of the image recipe. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the image recipe. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param parentImage The parent image of the image recipe. The string must be either an Image
     *   ARN or an AMI ID.
     */
    public fun parentImage(parentImage: String) {
        cdkBuilder.parentImage(parentImage)
    }

    /** @param tags The tags of the image recipe. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param version The semantic version of the image recipe. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    /** @param workingDirectory The working directory to be used during build and test workflows. */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CfnImageRecipeProps {
        if (_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
        if (_components.isNotEmpty()) cdkBuilder.components(_components)
        return cdkBuilder.build()
    }
}
