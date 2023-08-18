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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

/**
 * A container for resource data, which defines the resource type.
 *
 * The container takes only one of the following supported resource data types:
 * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
 * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
 * `SecretsManagerSecretResourceData` .
 *
 * Only one resource type can be defined for a `ResourceDataContainer` instance.
 *
 * In an AWS CloudFormation template, `ResourceDataContainer` is a property of the
 * [`ResourceInstance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * ResourceDataContainerProperty resourceDataContainerProperty =
 * ResourceDataContainerProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionResourceDataContainerPropertyDsl {
    private val cdkBuilder: CfnResourceDefinition.ResourceDataContainerProperty.Builder =
        CfnResourceDefinition.ResourceDataContainerProperty.builder()

    /** @param localDeviceResourceData Settings for a local device resource. */
    public fun localDeviceResourceData(localDeviceResourceData: IResolvable) {
        cdkBuilder.localDeviceResourceData(localDeviceResourceData)
    }

    /** @param localDeviceResourceData Settings for a local device resource. */
    public fun localDeviceResourceData(
        localDeviceResourceData: CfnResourceDefinition.LocalDeviceResourceDataProperty
    ) {
        cdkBuilder.localDeviceResourceData(localDeviceResourceData)
    }

    /** @param localVolumeResourceData Settings for a local volume resource. */
    public fun localVolumeResourceData(localVolumeResourceData: IResolvable) {
        cdkBuilder.localVolumeResourceData(localVolumeResourceData)
    }

    /** @param localVolumeResourceData Settings for a local volume resource. */
    public fun localVolumeResourceData(
        localVolumeResourceData: CfnResourceDefinition.LocalVolumeResourceDataProperty
    ) {
        cdkBuilder.localVolumeResourceData(localVolumeResourceData)
    }

    /**
     * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored in
     *   Amazon S3 .
     */
    public fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable) {
        cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData)
    }

    /**
     * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored in
     *   Amazon S3 .
     */
    public fun s3MachineLearningModelResourceData(
        s3MachineLearningModelResourceData:
            CfnResourceDefinition.S3MachineLearningModelResourceDataProperty
    ) {
        cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData)
    }

    /**
     * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource
     *   saved as an SageMaker training job.
     */
    public fun sageMakerMachineLearningModelResourceData(
        sageMakerMachineLearningModelResourceData: IResolvable
    ) {
        cdkBuilder.sageMakerMachineLearningModelResourceData(
            sageMakerMachineLearningModelResourceData
        )
    }

    /**
     * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource
     *   saved as an SageMaker training job.
     */
    public fun sageMakerMachineLearningModelResourceData(
        sageMakerMachineLearningModelResourceData:
            CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty
    ) {
        cdkBuilder.sageMakerMachineLearningModelResourceData(
            sageMakerMachineLearningModelResourceData
        )
    }

    /** @param secretsManagerSecretResourceData Settings for a secret resource. */
    public fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable) {
        cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData)
    }

    /** @param secretsManagerSecretResourceData Settings for a secret resource. */
    public fun secretsManagerSecretResourceData(
        secretsManagerSecretResourceData:
            CfnResourceDefinition.SecretsManagerSecretResourceDataProperty
    ) {
        cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData)
    }

    public fun build(): CfnResourceDefinition.ResourceDataContainerProperty = cdkBuilder.build()
}
