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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * SageMaker training image.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * TrainingEnvironmentProperty trainingEnvironmentProperty = TrainingEnvironmentProperty.builder()
 * .containerImage(List.of("containerImage"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingenvironment.html)
 */
@CdkDslMarker
public class CfnModelCardTrainingEnvironmentPropertyDsl {
    private val cdkBuilder: CfnModelCard.TrainingEnvironmentProperty.Builder =
        CfnModelCard.TrainingEnvironmentProperty.builder()

    private val _containerImage: MutableList<String> = mutableListOf()

    /** @param containerImage SageMaker inference image URI. */
    public fun containerImage(vararg containerImage: String) {
        _containerImage.addAll(listOf(*containerImage))
    }

    /** @param containerImage SageMaker inference image URI. */
    public fun containerImage(containerImage: Collection<String>) {
        _containerImage.addAll(containerImage)
    }

    public fun build(): CfnModelCard.TrainingEnvironmentProperty {
        if (_containerImage.isNotEmpty()) cdkBuilder.containerImage(_containerImage)
        return cdkBuilder.build()
    }
}
