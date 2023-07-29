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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

/**
 * Specifies a limit to how long a model training job or model compilation job can run.
 *
 * It also specifies how long a managed spot training job has to complete. When the job reaches the
 * time limit, SageMaker ends the training or compilation job. Use this API to cap model training
 * costs.
 *
 * To stop a training job, SageMaker sends the algorithm the `SIGTERM` signal, which delays job
 * termination for 120 seconds. Algorithms can use this 120-second window to save the model
 * artifacts, so the results of training are not lost.
 *
 * The training algorithms provided by SageMaker automatically save the intermediate results of a
 * model training job when possible. This attempt to save artifacts is only a best effort case as
 * model might not be in a state from which it can be saved. For example, if training has just
 * started, the model might not be ready to save. When saved, this intermediate data is a valid
 * model artifact. You can use it to create a model with `CreateModel` .
 *
 * The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts. When
 * training NTMs, make sure that the maximum runtime is sufficient for the training job to complete.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * StoppingConditionProperty stoppingConditionProperty = StoppingConditionProperty.builder()
 * .maxRuntimeInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-stoppingcondition.html)
 */
@CdkDslMarker
public class CfnModelQualityJobDefinitionStoppingConditionPropertyDsl {
    private val cdkBuilder: CfnModelQualityJobDefinition.StoppingConditionProperty.Builder =
        CfnModelQualityJobDefinition.StoppingConditionProperty.builder()

    /**
     * @param maxRuntimeInSeconds The maximum length of time, in seconds, that a training or
     *   compilation job can run before it is stopped. For compilation jobs, if the job does not
     *   complete during this time, a `TimeOut` error is generated. We recommend starting with 900
     *   seconds and increasing as necessary based on your model.
     *
     * For all other jobs, if the job does not complete during this time, SageMaker ends the job.
     * When `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the
     * maximum time for all of the attempts in total, not each individual attempt. The default value
     * is 1 day. The maximum value is 28 days.
     *
     * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
     * metrics or archiving and uploading models after it has been stopped, is 30 days.
     */
    public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
    }

    public fun build(): CfnModelQualityJobDefinition.StoppingConditionProperty = cdkBuilder.build()
}
