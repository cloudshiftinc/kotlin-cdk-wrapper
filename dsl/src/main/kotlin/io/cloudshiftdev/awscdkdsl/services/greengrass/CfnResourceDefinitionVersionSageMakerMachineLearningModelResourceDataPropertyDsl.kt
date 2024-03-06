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
 * Settings for an Secrets Manager machine learning resource.
 *
 * For more information, see
 * [Perform Machine Learning Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, `SageMakerMachineLearningModelResourceData` can be used in the
 * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * SageMakerMachineLearningModelResourceDataProperty
 * sageMakerMachineLearningModelResourceDataProperty =
 * SageMakerMachineLearningModelResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .sageMakerJobArn("sageMakerJobArn")
 * // the properties below are optional
 * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataPropertyDsl {
    private val cdkBuilder:
        CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.Builder =
        CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.builder()

    /**
     * @param destinationPath The absolute local path of the resource inside the Lambda environment.
     */
    public fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
    }

    /**
     * @param ownerSetting The owner setting for the downloaded machine learning resource. For more
     *   information, see
     *   [Access Machine Learning Resources from Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
     *   in the *Developer Guide* .
     */
    public fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting)
    }

    /**
     * @param ownerSetting The owner setting for the downloaded machine learning resource. For more
     *   information, see
     *   [Access Machine Learning Resources from Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
     *   in the *Developer Guide* .
     */
    public fun ownerSetting(
        ownerSetting: CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty
    ) {
        cdkBuilder.ownerSetting(ownerSetting)
    }

    /**
     * @param sageMakerJobArn The Amazon Resource Name (ARN) of the Amazon SageMaker training job
     *   that represents the source model.
     */
    public fun sageMakerJobArn(sageMakerJobArn: String) {
        cdkBuilder.sageMakerJobArn(sageMakerJobArn)
    }

    public fun build():
        CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty =
        cdkBuilder.build()
}
