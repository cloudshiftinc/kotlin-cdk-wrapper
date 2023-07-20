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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver
import kotlin.String

@CdkDslMarker
public class SparkSubmitJobDriverDsl {
    private val cdkBuilder: SparkSubmitJobDriver.Builder = SparkSubmitJobDriver.builder()

    public fun entryPoint(entryPoint: TaskInput) {
        cdkBuilder.entryPoint(entryPoint)
    }

    public fun entryPointArguments(entryPointArguments: TaskInput) {
        cdkBuilder.entryPointArguments(entryPointArguments)
    }

    public fun sparkSubmitParameters(sparkSubmitParameters: String) {
        cdkBuilder.sparkSubmitParameters(sparkSubmitParameters)
    }

    public fun build(): SparkSubmitJobDriver = cdkBuilder.build()
}
