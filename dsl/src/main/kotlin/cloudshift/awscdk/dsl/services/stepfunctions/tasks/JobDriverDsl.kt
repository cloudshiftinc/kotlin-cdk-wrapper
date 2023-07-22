@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver

@CdkDslMarker
public class JobDriverDsl {
  private val cdkBuilder: JobDriver.Builder = JobDriver.builder()

  /**
   * @param sparkSubmitJobDriver The job driver parameters specified for spark submit. 
   */
  public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriverDsl.() -> Unit = {}) {
    val builder = SparkSubmitJobDriverDsl()
    builder.apply(sparkSubmitJobDriver)
    cdkBuilder.sparkSubmitJobDriver(builder.build())
  }

  /**
   * @param sparkSubmitJobDriver The job driver parameters specified for spark submit. 
   */
  public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver) {
    cdkBuilder.sparkSubmitJobDriver(sparkSubmitJobDriver)
  }

  public fun build(): JobDriver = cdkBuilder.build()
}
