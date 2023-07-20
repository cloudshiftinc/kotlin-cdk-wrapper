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
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver
import kotlin.Unit

@CdkDslMarker
public class JobDriverDsl {
    private val cdkBuilder: JobDriver.Builder = JobDriver.builder()

    public fun sparkSubmitJobDriver(block: SparkSubmitJobDriverDsl.() -> Unit = {}) {
        val builder = SparkSubmitJobDriverDsl()
        builder.apply(block)
        cdkBuilder.sparkSubmitJobDriver(builder.build())
    }

    public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver) {
        cdkBuilder.sparkSubmitJobDriver(sparkSubmitJobDriver)
    }

    public fun build(): JobDriver = cdkBuilder.build()
}
