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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent

/**
 * Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted in
 * this
 * [ProductionVariant](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ProductionVariant.html)
 * .
 *
 * If you used the `registry/repository[:tag]` form to specify the image path of the primary
 * container when you created the model hosted in this `ProductionVariant` , the path resolves to a
 * path of the form `registry/repository[&#64;digest]` . A digest is a hash value that identifies a
 * specific version of an image. For information about Amazon ECR paths, see
 * [Pulling an Image](https://docs.aws.amazon.com//AmazonECR/latest/userguide/docker-pull-ecr-image.html)
 * in the *Amazon ECR User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DeployedImageProperty deployedImageProperty = DeployedImageProperty.builder()
 * .resolutionTime("resolutionTime")
 * .resolvedImage("resolvedImage")
 * .specifiedImage("specifiedImage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html)
 */
@CdkDslMarker
public class CfnInferenceComponentDeployedImagePropertyDsl {
    private val cdkBuilder: CfnInferenceComponent.DeployedImageProperty.Builder =
        CfnInferenceComponent.DeployedImageProperty.builder()

    /**
     * @param resolutionTime The date and time when the image path for the model resolved to the
     *   `ResolvedImage`.
     */
    public fun resolutionTime(resolutionTime: String) {
        cdkBuilder.resolutionTime(resolutionTime)
    }

    /**
     * @param resolvedImage The specific digest path of the image hosted in this `ProductionVariant`
     *   .
     */
    public fun resolvedImage(resolvedImage: String) {
        cdkBuilder.resolvedImage(resolvedImage)
    }

    /** @param specifiedImage The image path you specified when you created the model. */
    public fun specifiedImage(specifiedImage: String) {
        cdkBuilder.specifiedImage(specifiedImage)
    }

    public fun build(): CfnInferenceComponent.DeployedImageProperty = cdkBuilder.build()
}
