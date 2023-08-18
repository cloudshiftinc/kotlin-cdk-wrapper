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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

/**
 * Settings for an Amazon S3 machine learning resource.
 *
 * For more information, see
 * [Perform Machine Learning Inference](https://docs.aws.amazon.com/greengrass/latest/developerguide/ml-inference.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, `S3MachineLearningModelResourceData` can be used in the
 * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * S3MachineLearningModelResourceDataProperty s3MachineLearningModelResourceDataProperty =
 * S3MachineLearningModelResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionVersionS3MachineLearningModelResourceDataPropertyDsl {
    private val cdkBuilder:
        CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.Builder =
        CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.builder()

    /**
     * @param destinationPath The absolute local path of the resource inside the Lambda environment.
     */
    public fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
    }

    /**
     * @param ownerSetting The owner setting for the downloaded machine learning resource. For more
     *   information, see
     *   [Access Machine Learning Resources from Lambda Functions](https://docs.aws.amazon.com/greengrass/latest/developerguide/access-ml-resources.html)
     *   in the *Developer Guide* .
     */
    public fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting)
    }

    /**
     * @param ownerSetting The owner setting for the downloaded machine learning resource. For more
     *   information, see
     *   [Access Machine Learning Resources from Lambda Functions](https://docs.aws.amazon.com/greengrass/latest/developerguide/access-ml-resources.html)
     *   in the *Developer Guide* .
     */
    public fun ownerSetting(
        ownerSetting: CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty
    ) {
        cdkBuilder.ownerSetting(ownerSetting)
    }

    /**
     * @param s3Uri The URI of the source model in an Amazon S3 bucket. The model package must be in
     *   `tar.gz` or `.zip` format.
     */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty =
        cdkBuilder.build()
}
