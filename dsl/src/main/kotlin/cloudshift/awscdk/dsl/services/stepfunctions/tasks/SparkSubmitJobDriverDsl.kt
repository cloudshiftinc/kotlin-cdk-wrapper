@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver

@CdkDslMarker
public class SparkSubmitJobDriverDsl {
  private val cdkBuilder: SparkSubmitJobDriver.Builder = SparkSubmitJobDriver.builder()

  /**
   * @param entryPoint The entry point of job application. 
   * Length Constraints: Minimum length of 1. Maximum length of 256.
   */
  public fun entryPoint(entryPoint: TaskInput) {
    cdkBuilder.entryPoint(entryPoint)
  }

  /**
   * @param entryPointArguments The arguments for a job application in a task input object
   * containing an array of strings.
   * Length Constraints: Minimum length of 1. Maximum length of 10280.
   */
  public fun entryPointArguments(entryPointArguments: TaskInput) {
    cdkBuilder.entryPointArguments(entryPointArguments)
  }

  /**
   * @param sparkSubmitParameters The Spark submit parameters that are used for job runs.
   * Length Constraints: Minimum length of 1. Maximum length of 102400.
   */
  public fun sparkSubmitParameters(sparkSubmitParameters: String) {
    cdkBuilder.sparkSubmitParameters(sparkSubmitParameters)
  }

  public fun build(): SparkSubmitJobDriver = cdkBuilder.build()
}
