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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import software.constructs.Construct

/**
 * The `AWS::Greengrass::ResourceDefinition` resource represents a resource definition for AWS IoT
 * Greengrass .
 *
 * Resource definitions are used to organize your resource definition versions.
 *
 * Resource definitions can reference multiple resource definition versions. All resource definition
 * versions must be associated with a resource definition. Each resource definition version can
 * contain one or more resources. (In AWS CloudFormation , resources are named *resource instances*
 * .)
 *
 * When you create a resource definition, you can optionally include an initial resource definition
 * version. To associate a resource definition version later, create an
 * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
 * resource and specify the ID of this resource definition.
 *
 * After you create the resource definition version that contains the resources you want to deploy,
 * you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnResourceDefinition cfnResourceDefinition = CfnResourceDefinition.Builder.create(this,
 * "MyCfnResourceDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(ResourceDefinitionVersionProperty.builder()
 * .resources(List.of(ResourceInstanceProperty.builder()
 * .id("id")
 * .name("name")
 * .resourceDataContainer(ResourceDataContainerProperty.builder()
 * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
 * .sourcePath("sourcePath")
 * // the properties below are optional
 * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
 * .autoAddGroupOwner(false)
 * // the properties below are optional
 * .groupOwner("groupOwner")
 * .build())
 * .build())
 * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .sourcePath("sourcePath")
 * // the properties below are optional
 * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
 * .autoAddGroupOwner(false)
 * // the properties below are optional
 * .groupOwner("groupOwner")
 * .build())
 * .build())
 * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build())
 * .build())
 * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .sageMakerJobArn("sageMakerJobArn")
 * // the properties below are optional
 * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build())
 * .build())
 * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
 * .arn("arn")
 * // the properties below are optional
 * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
 * .build())
 * .build())
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourceDefinition.Builder =
        CfnResourceDefinition.Builder.create(scope, id)

    /**
     * The resource definition version to include when the resource definition is created.
     *
     * A resource definition version contains a list of
     * [`resource instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
     *
     * @param initialVersion The resource definition version to include when the resource definition
     *   is created.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The resource definition version to include when the resource definition is created.
     *
     * A resource definition version contains a list of
     * [`resource instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
     *
     * @param initialVersion The resource definition version to include when the resource definition
     *   is created.
     */
    public fun initialVersion(
        initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty
    ) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The name of the resource definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-name)
     *
     * @param name The name of the resource definition.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the resource definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     * in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-tags)
     *
     * @param tags Application-specific metadata to attach to the resource definition.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * Application-specific metadata to attach to the resource definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     * in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-tags)
     *
     * @param tags Application-specific metadata to attach to the resource definition.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnResourceDefinition = cdkBuilder.build()
}
