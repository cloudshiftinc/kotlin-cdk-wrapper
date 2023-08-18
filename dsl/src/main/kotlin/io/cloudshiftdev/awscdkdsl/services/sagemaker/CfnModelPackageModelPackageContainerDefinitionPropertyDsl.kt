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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Describes the Docker container for the model package.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object modelInput;
 * ModelPackageContainerDefinitionProperty modelPackageContainerDefinitionProperty =
 * ModelPackageContainerDefinitionProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .containerHostname("containerHostname")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .framework("framework")
 * .frameworkVersion("frameworkVersion")
 * .imageDigest("imageDigest")
 * .modelDataUrl("modelDataUrl")
 * .modelInput(modelInput)
 * .nearestModelName("nearestModelName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html)
 */
@CdkDslMarker
public class CfnModelPackageModelPackageContainerDefinitionPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ModelPackageContainerDefinitionProperty.Builder =
        CfnModelPackage.ModelPackageContainerDefinitionProperty.builder()

    /** @param containerHostname The DNS host name for the Docker container. */
    public fun containerHostname(containerHostname: String) {
        cdkBuilder.containerHostname(containerHostname)
    }

    /**
     * @param environment The environment variables to set in the Docker container. Each key and
     *   value in the `Environment` string to string map can have length of up to 1024. We support
     *   up to 16 entries in the map.
     */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param environment The environment variables to set in the Docker container. Each key and
     *   value in the `Environment` string to string map can have length of up to 1024. We support
     *   up to 16 entries in the map.
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /** @param framework The machine learning framework of the model package container image. */
    public fun framework(framework: String) {
        cdkBuilder.framework(framework)
    }

    /** @param frameworkVersion The framework version of the Model Package Container Image. */
    public fun frameworkVersion(frameworkVersion: String) {
        cdkBuilder.frameworkVersion(frameworkVersion)
    }

    /**
     * @param image The Amazon EC2 Container Registry (Amazon ECR) path where inference code is
     *   stored. If you are using your own custom algorithm instead of an algorithm provided by
     *   SageMaker, the inference code must meet SageMaker requirements. SageMaker supports both
     *   `registry/repository[:tag]` and `registry/repository[&#64;digest]` image path formats. For
     *   more information, see
     *   [Using Your Own Algorithms with Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html)
     *   .
     */
    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    /**
     * @param imageDigest An MD5 hash of the training algorithm that identifies the Docker image
     *   used for training.
     */
    public fun imageDigest(imageDigest: String) {
        cdkBuilder.imageDigest(imageDigest)
    }

    /**
     * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
     *   training, are stored. This path must point to a single `gzip` compressed tar archive (
     *   `.tar.gz` suffix).
     *
     * The model artifacts must be in an S3 bucket that is in the same region as the model package.
     */
    public fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
    }

    /** @param modelInput A structure with Model Input details. */
    public fun modelInput(modelInput: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(modelInput)
        cdkBuilder.modelInput(builder.map)
    }

    /** @param modelInput A structure with Model Input details. */
    public fun modelInput(modelInput: Any) {
        cdkBuilder.modelInput(modelInput)
    }

    /**
     * @param nearestModelName The name of a pre-trained machine learning benchmarked by Amazon
     *   SageMaker Inference Recommender model that matches your model. You can find a list of
     *   benchmarked models by calling `ListModelMetadata` .
     */
    public fun nearestModelName(nearestModelName: String) {
        cdkBuilder.nearestModelName(nearestModelName)
    }

    public fun build(): CfnModelPackage.ModelPackageContainerDefinitionProperty = cdkBuilder.build()
}
