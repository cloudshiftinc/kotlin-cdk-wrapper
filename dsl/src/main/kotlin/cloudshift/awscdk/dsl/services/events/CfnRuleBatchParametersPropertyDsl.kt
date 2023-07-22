@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleBatchParametersPropertyDsl {
  private val cdkBuilder: CfnRule.BatchParametersProperty.Builder =
      CfnRule.BatchParametersProperty.builder()

  /**
   * @param arrayProperties The array properties for the submitted job, such as the size of the
   * array.
   * The array size can be between 2 and 10,000. If you specify array properties for a job, it
   * becomes an array job. This parameter is used only if the target is an AWS Batch job.
   */
  public fun arrayProperties(arrayProperties: IResolvable) {
    cdkBuilder.arrayProperties(arrayProperties)
  }

  /**
   * @param arrayProperties The array properties for the submitted job, such as the size of the
   * array.
   * The array size can be between 2 and 10,000. If you specify array properties for a job, it
   * becomes an array job. This parameter is used only if the target is an AWS Batch job.
   */
  public fun arrayProperties(arrayProperties: CfnRule.BatchArrayPropertiesProperty) {
    cdkBuilder.arrayProperties(arrayProperties)
  }

  /**
   * @param jobDefinition The ARN or name of the job definition to use if the event target is an AWS
   * Batch job. 
   * This job definition must already exist.
   */
  public fun jobDefinition(jobDefinition: String) {
    cdkBuilder.jobDefinition(jobDefinition)
  }

  /**
   * @param jobName The name to use for this execution of the job, if the target is an AWS Batch
   * job. 
   */
  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  /**
   * @param retryStrategy The retry strategy to use for failed jobs, if the target is an AWS Batch
   * job.
   * The retry strategy is the number of times to retry the failed job execution. Valid values are
   * 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in the job
   * definition.
   */
  public fun retryStrategy(retryStrategy: IResolvable) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  /**
   * @param retryStrategy The retry strategy to use for failed jobs, if the target is an AWS Batch
   * job.
   * The retry strategy is the number of times to retry the failed job execution. Valid values are
   * 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in the job
   * definition.
   */
  public fun retryStrategy(retryStrategy: CfnRule.BatchRetryStrategyProperty) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  public fun build(): CfnRule.BatchParametersProperty = cdkBuilder.build()
}
