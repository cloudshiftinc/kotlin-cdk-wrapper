@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps

@CdkDslMarker
public class CfnJobDefinitionPropsDsl {
  private val cdkBuilder: CfnJobDefinitionProps.Builder = CfnJobDefinitionProps.builder()

  private val _platformCapabilities: MutableList<String> = mutableListOf()

  /**
   * @param containerProperties An object with various properties specific to Amazon ECS based jobs.
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   */
  public fun containerProperties(containerProperties: IResolvable) {
    cdkBuilder.containerProperties(containerProperties)
  }

  /**
   * @param containerProperties An object with various properties specific to Amazon ECS based jobs.
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   */
  public
      fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty) {
    cdkBuilder.containerProperties(containerProperties)
  }

  /**
   * @param eksProperties An object with various properties that are specific to Amazon EKS based
   * jobs.
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   */
  public fun eksProperties(eksProperties: IResolvable) {
    cdkBuilder.eksProperties(eksProperties)
  }

  /**
   * @param eksProperties An object with various properties that are specific to Amazon EKS based
   * jobs.
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   */
  public fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty) {
    cdkBuilder.eksProperties(eksProperties)
  }

  /**
   * @param jobDefinitionName The name of the job definition.
   */
  public fun jobDefinitionName(jobDefinitionName: String) {
    cdkBuilder.jobDefinitionName(jobDefinitionName)
  }

  /**
   * @param nodeProperties An object with various properties that are specific to multi-node
   * parallel jobs.
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   *
   *
   * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
   * `containerProperties` instead.
   */
  public fun nodeProperties(nodeProperties: IResolvable) {
    cdkBuilder.nodeProperties(nodeProperties)
  }

  /**
   * @param nodeProperties An object with various properties that are specific to multi-node
   * parallel jobs.
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   *
   *
   * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
   * `containerProperties` instead.
   */
  public fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty) {
    cdkBuilder.nodeProperties(nodeProperties)
  }

  /**
   * @param parameters Default parameters or parameter substitution placeholders that are set in the
   * job definition.
   * Parameters are specified as a key-value pair mapping. Parameters in a `SubmitJob` request
   * override any corresponding parameter defaults from the job definition. For more information about
   * specifying parameters, see [Job definition
   * parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html) in
   * the *AWS Batch User Guide* .
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters Default parameters or parameter substitution placeholders that are set in the
   * job definition.
   * Parameters are specified as a key-value pair mapping. Parameters in a `SubmitJob` request
   * override any corresponding parameter defaults from the job definition. For more information about
   * specifying parameters, see [Job definition
   * parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html) in
   * the *AWS Batch User Guide* .
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param platformCapabilities The platform capabilities required by the job definition.
   * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
   * `FARGATE` .
   */
  public fun platformCapabilities(vararg platformCapabilities: String) {
    _platformCapabilities.addAll(listOf(*platformCapabilities))
  }

  /**
   * @param platformCapabilities The platform capabilities required by the job definition.
   * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
   * `FARGATE` .
   */
  public fun platformCapabilities(platformCapabilities: Collection<String>) {
    _platformCapabilities.addAll(platformCapabilities)
  }

  /**
   * @param propagateTags Specifies whether to propagate the tags from the job or job definition to
   * the corresponding Amazon ECS task.
   * If no value is specified, the tags aren't propagated. Tags can only be propagated to the tasks
   * when the tasks are created. For tags with the same name, job tags are given priority over job
   * definitions tags. If the total number of combined tags from the job and job definition is over 50,
   * the job is moved to the `FAILED` state.
   */
  public fun propagateTags(propagateTags: Boolean) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * @param propagateTags Specifies whether to propagate the tags from the job or job definition to
   * the corresponding Amazon ECS task.
   * If no value is specified, the tags aren't propagated. Tags can only be propagated to the tasks
   * when the tasks are created. For tags with the same name, job tags are given priority over job
   * definitions tags. If the total number of combined tags from the job and job definition is over 50,
   * the job is moved to the `FAILED` state.
   */
  public fun propagateTags(propagateTags: IResolvable) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this job
   * definition.
   */
  public fun retryStrategy(retryStrategy: IResolvable) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  /**
   * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this job
   * definition.
   */
  public fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  /**
   * @param schedulingPriority The scheduling priority of the job definition.
   * This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling
   * priority are scheduled before jobs with a lower scheduling priority.
   */
  public fun schedulingPriority(schedulingPriority: Number) {
    cdkBuilder.schedulingPriority(schedulingPriority)
  }

  /**
   * @param tags The tags that are applied to the job definition.
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags The tags that are applied to the job definition.
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param timeout The timeout time for jobs that are submitted with this job definition.
   * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
   * finished.
   */
  public fun timeout(timeout: IResolvable) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param timeout The timeout time for jobs that are submitted with this job definition.
   * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
   * finished.
   */
  public fun timeout(timeout: CfnJobDefinition.TimeoutProperty) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param type The type of job definition. 
   * For more information about multi-node parallel jobs, see [Creating a multi-node parallel job
   * definition](https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html) in the
   * *AWS Batch User Guide* .
   *
   *
   * If the job is run on Fargate resources, then `multinode` isn't supported.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnJobDefinitionProps {
    if(_platformCapabilities.isNotEmpty()) cdkBuilder.platformCapabilities(_platformCapabilities)
    return cdkBuilder.build()
  }
}
