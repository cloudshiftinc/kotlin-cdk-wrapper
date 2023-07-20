@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.String

@CdkDslMarker
public class CfnModelCardTrainingDetailsPropertyDsl {
    private val cdkBuilder: CfnModelCard.TrainingDetailsProperty.Builder =
        CfnModelCard.TrainingDetailsProperty.builder()

    public fun objectiveFunction(objectiveFunction: IResolvable) {
        cdkBuilder.objectiveFunction(objectiveFunction)
    }

    public fun objectiveFunction(objectiveFunction: CfnModelCard.ObjectiveFunctionProperty) {
        cdkBuilder.objectiveFunction(objectiveFunction)
    }

    public fun trainingJobDetails(trainingJobDetails: IResolvable) {
        cdkBuilder.trainingJobDetails(trainingJobDetails)
    }

    public fun trainingJobDetails(trainingJobDetails: CfnModelCard.TrainingJobDetailsProperty) {
        cdkBuilder.trainingJobDetails(trainingJobDetails)
    }

    public fun trainingObservations(trainingObservations: String) {
        cdkBuilder.trainingObservations(trainingObservations)
    }

    public fun build(): CfnModelCard.TrainingDetailsProperty = cdkBuilder.build()
}
