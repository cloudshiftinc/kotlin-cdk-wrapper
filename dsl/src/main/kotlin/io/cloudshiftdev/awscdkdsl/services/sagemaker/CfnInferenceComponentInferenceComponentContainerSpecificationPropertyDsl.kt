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
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent

/**
 * Defines a container that provides the runtime environment for a model that you deploy with an
 * inference component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceComponentContainerSpecificationProperty inferenceComponentContainerSpecificationProperty
 * = InferenceComponentContainerSpecificationProperty.builder()
 * .artifactUrl("artifactUrl")
 * .deployedImage(DeployedImageProperty.builder()
 * .resolutionTime("resolutionTime")
 * .resolvedImage("resolvedImage")
 * .specifiedImage("specifiedImage")
 * .build())
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .image("image")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html)
 */
@CdkDslMarker
public class CfnInferenceComponentInferenceComponentContainerSpecificationPropertyDsl {
    private val cdkBuilder:
        CfnInferenceComponent.InferenceComponentContainerSpecificationProperty.Builder =
        CfnInferenceComponent.InferenceComponentContainerSpecificationProperty.builder()

    /**
     * @param artifactUrl The Amazon S3 path where the model artifacts, which result from model
     *   training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz
     *   suffix).
     */
    public fun artifactUrl(artifactUrl: String) {
        cdkBuilder.artifactUrl(artifactUrl)
    }

    /** @param deployedImage the value to be set. */
    public fun deployedImage(deployedImage: IResolvable) {
        cdkBuilder.deployedImage(deployedImage)
    }

    /** @param deployedImage the value to be set. */
    public fun deployedImage(deployedImage: CfnInferenceComponent.DeployedImageProperty) {
        cdkBuilder.deployedImage(deployedImage)
    }

    /**
     * @param environment The environment variables to set in the Docker container. Each key and
     *   value in the Environment string-to-string map can have length of up to 1024. We support up
     *   to 16 entries in the map.
     */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param environment The environment variables to set in the Docker container. Each key and
     *   value in the Environment string-to-string map can have length of up to 1024. We support up
     *   to 16 entries in the map.
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param image The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image
     *   for the model is stored.
     */
    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    public fun build(): CfnInferenceComponent.InferenceComponentContainerSpecificationProperty =
        cdkBuilder.build()
}
