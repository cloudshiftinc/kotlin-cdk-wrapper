@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using an AWS Batch job as a target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetBatchJobParametersProperty pipeTargetBatchJobParametersProperty =
 * PipeTargetBatchJobParametersProperty.builder()
 * .jobDefinition("jobDefinition")
 * .jobName("jobName")
 * // the properties below are optional
 * .arrayProperties(BatchArrayPropertiesProperty.builder()
 * .size(123)
 * .build())
 * .containerOverrides(BatchContainerOverridesProperty.builder()
 * .command(List.of("command"))
 * .environment(List.of(BatchEnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .instanceType("instanceType")
 * .resourceRequirements(List.of(BatchResourceRequirementProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build())
 * .dependsOn(List.of(BatchJobDependencyProperty.builder()
 * .jobId("jobId")
 * .type("type")
 * .build()))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .retryStrategy(BatchRetryStrategyProperty.builder()
 * .attempts(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetBatchJobParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetBatchJobParametersProperty.Builder =
      CfnPipe.PipeTargetBatchJobParametersProperty.builder()

  private val _dependsOn: MutableList<Any> = mutableListOf()

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
  public fun arrayProperties(arrayProperties: CfnPipe.BatchArrayPropertiesProperty) {
    cdkBuilder.arrayProperties(arrayProperties)
  }

  /**
   * @param containerOverrides The overrides that are sent to a container.
   */
  public fun containerOverrides(containerOverrides: IResolvable) {
    cdkBuilder.containerOverrides(containerOverrides)
  }

  /**
   * @param containerOverrides The overrides that are sent to a container.
   */
  public fun containerOverrides(containerOverrides: CfnPipe.BatchContainerOverridesProperty) {
    cdkBuilder.containerOverrides(containerOverrides)
  }

  /**
   * @param dependsOn A list of dependencies for the job.
   * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
   * without specifying a job ID for array jobs so that each child array job completes sequentially,
   * starting at index 0. You can also specify an `N_TO_N` type dependency with a job ID for array
   * jobs. In that case, each index child of this job must wait for the corresponding index child of
   * each dependency to complete before it can begin.
   */
  public fun dependsOn(vararg dependsOn: Any) {
    _dependsOn.addAll(listOf(*dependsOn))
  }

  /**
   * @param dependsOn A list of dependencies for the job.
   * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
   * without specifying a job ID for array jobs so that each child array job completes sequentially,
   * starting at index 0. You can also specify an `N_TO_N` type dependency with a job ID for array
   * jobs. In that case, each index child of this job must wait for the corresponding index child of
   * each dependency to complete before it can begin.
   */
  public fun dependsOn(dependsOn: Collection<Any>) {
    _dependsOn.addAll(dependsOn)
  }

  /**
   * @param dependsOn A list of dependencies for the job.
   * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
   * without specifying a job ID for array jobs so that each child array job completes sequentially,
   * starting at index 0. You can also specify an `N_TO_N` type dependency with a job ID for array
   * jobs. In that case, each index child of this job must wait for the corresponding index child of
   * each dependency to complete before it can begin.
   */
  public fun dependsOn(dependsOn: IResolvable) {
    cdkBuilder.dependsOn(dependsOn)
  }

  /**
   * @param jobDefinition The job definition used by this job. 
   * This value can be one of `name` , `name:revision` , or the Amazon Resource Name (ARN) for the
   * job definition. If name is specified without a revision then the latest active revision is used.
   */
  public fun jobDefinition(jobDefinition: String) {
    cdkBuilder.jobDefinition(jobDefinition)
  }

  /**
   * @param jobName The name of the job. 
   * It can be up to 128 letters long. The first character must be alphanumeric, can contain
   * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
   */
  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  /**
   * @param parameters Additional parameters passed to the job that replace parameter substitution
   * placeholders that are set in the job definition.
   * Parameters are specified as a key and value pair mapping. Parameters included here override any
   * corresponding parameter defaults from the job definition.
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters Additional parameters passed to the job that replace parameter substitution
   * placeholders that are set in the job definition.
   * Parameters are specified as a key and value pair mapping. Parameters included here override any
   * corresponding parameter defaults from the job definition.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param retryStrategy The retry strategy to use for failed jobs.
   * When a retry strategy is specified here, it overrides the retry strategy defined in the job
   * definition.
   */
  public fun retryStrategy(retryStrategy: IResolvable) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  /**
   * @param retryStrategy The retry strategy to use for failed jobs.
   * When a retry strategy is specified here, it overrides the retry strategy defined in the job
   * definition.
   */
  public fun retryStrategy(retryStrategy: CfnPipe.BatchRetryStrategyProperty) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  public fun build(): CfnPipe.PipeTargetBatchJobParametersProperty {
    if(_dependsOn.isNotEmpty()) cdkBuilder.dependsOn(_dependsOn)
    return cdkBuilder.build()
  }
}
