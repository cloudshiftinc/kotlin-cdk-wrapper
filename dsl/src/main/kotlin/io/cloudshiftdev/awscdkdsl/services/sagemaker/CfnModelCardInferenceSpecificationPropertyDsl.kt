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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Defines how to perform inference generation after a training job is run.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceSpecificationProperty inferenceSpecificationProperty =
 * InferenceSpecificationProperty.builder()
 * .containers(List.of(ContainerProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .nearestModelName("nearestModelName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferencespecification.html)
 */
@CdkDslMarker
public class CfnModelCardInferenceSpecificationPropertyDsl {
    private val cdkBuilder: CfnModelCard.InferenceSpecificationProperty.Builder =
        CfnModelCard.InferenceSpecificationProperty.builder()

    private val _containers: MutableList<Any> = mutableListOf()

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(vararg containers: Any) {
        _containers.addAll(listOf(*containers))
    }

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(containers: Collection<Any>) {
        _containers.addAll(containers)
    }

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers)
    }

    public fun build(): CfnModelCard.InferenceSpecificationProperty {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        return cdkBuilder.build()
    }
}
