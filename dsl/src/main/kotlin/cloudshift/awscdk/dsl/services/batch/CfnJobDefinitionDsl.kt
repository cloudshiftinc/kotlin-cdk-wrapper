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
import software.constructs.Construct

@CdkDslMarker
public class CfnJobDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnJobDefinition.Builder = CfnJobDefinition.Builder.create(scope, id)

  private val _platformCapabilities: MutableList<String> = mutableListOf()

  /**
   * An object with various properties specific to Amazon ECS based jobs.
   *
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
   * @param containerProperties An object with various properties specific to Amazon ECS based jobs.
   * 
   */
  public fun containerProperties(containerProperties: IResolvable) {
    cdkBuilder.containerProperties(containerProperties)
  }

  /**
   * An object with various properties specific to Amazon ECS based jobs.
   *
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
   * @param containerProperties An object with various properties specific to Amazon ECS based jobs.
   * 
   */
  public
      fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty) {
    cdkBuilder.containerProperties(containerProperties)
  }

  /**
   * An object with various properties that are specific to Amazon EKS based jobs.
   *
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
   * @param eksProperties An object with various properties that are specific to Amazon EKS based
   * jobs. 
   */
  public fun eksProperties(eksProperties: IResolvable) {
    cdkBuilder.eksProperties(eksProperties)
  }

  /**
   * An object with various properties that are specific to Amazon EKS based jobs.
   *
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-eksproperties)
   * @param eksProperties An object with various properties that are specific to Amazon EKS based
   * jobs. 
   */
  public fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty) {
    cdkBuilder.eksProperties(eksProperties)
  }

  /**
   * The name of the job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname)
   * @param jobDefinitionName The name of the job definition. 
   */
  public fun jobDefinitionName(jobDefinitionName: String) {
    cdkBuilder.jobDefinitionName(jobDefinitionName)
  }

  /**
   * An object with various properties that are specific to multi-node parallel jobs.
   *
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   *
   *
   * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
   * `containerProperties` instead.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-nodeproperties)
   * @param nodeProperties An object with various properties that are specific to multi-node
   * parallel jobs. 
   */
  public fun nodeProperties(nodeProperties: IResolvable) {
    cdkBuilder.nodeProperties(nodeProperties)
  }

  /**
   * An object with various properties that are specific to multi-node parallel jobs.
   *
   * Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` . Only one can
   * be specified.
   *
   *
   * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
   * `containerProperties` instead.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-nodeproperties)
   * @param nodeProperties An object with various properties that are specific to multi-node
   * parallel jobs. 
   */
  public fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty) {
    cdkBuilder.nodeProperties(nodeProperties)
  }

  /**
   * Default parameters or parameter substitution placeholders that are set in the job definition.
   *
   * Parameters are specified as a key-value pair mapping. Parameters in a `SubmitJob` request
   * override any corresponding parameter defaults from the job definition. For more information about
   * specifying parameters, see [Job definition
   * parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html) in
   * the *AWS Batch User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters)
   * @param parameters Default parameters or parameter substitution placeholders that are set in the
   * job definition. 
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * Default parameters or parameter substitution placeholders that are set in the job definition.
   *
   * Parameters are specified as a key-value pair mapping. Parameters in a `SubmitJob` request
   * override any corresponding parameter defaults from the job definition. For more information about
   * specifying parameters, see [Job definition
   * parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html) in
   * the *AWS Batch User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters)
   * @param parameters Default parameters or parameter substitution placeholders that are set in the
   * job definition. 
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * The platform capabilities required by the job definition.
   *
   * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
   * `FARGATE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-platformcapabilities)
   * @param platformCapabilities The platform capabilities required by the job definition. 
   */
  public fun platformCapabilities(vararg platformCapabilities: String) {
    _platformCapabilities.addAll(listOf(*platformCapabilities))
  }

  /**
   * The platform capabilities required by the job definition.
   *
   * If no value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify
   * `FARGATE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-platformcapabilities)
   * @param platformCapabilities The platform capabilities required by the job definition. 
   */
  public fun platformCapabilities(platformCapabilities: Collection<String>) {
    _platformCapabilities.addAll(platformCapabilities)
  }

  /**
   * Specifies whether to propagate the tags from the job or job definition to the corresponding
   * Amazon ECS task.
   *
   * If no value is specified, the tags aren't propagated. Tags can only be propagated to the tasks
   * when the tasks are created. For tags with the same name, job tags are given priority over job
   * definitions tags. If the total number of combined tags from the job and job definition is over 50,
   * the job is moved to the `FAILED` state.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-propagatetags)
   * @param propagateTags Specifies whether to propagate the tags from the job or job definition to
   * the corresponding Amazon ECS task. 
   */
  public fun propagateTags(propagateTags: Boolean) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * Specifies whether to propagate the tags from the job or job definition to the corresponding
   * Amazon ECS task.
   *
   * If no value is specified, the tags aren't propagated. Tags can only be propagated to the tasks
   * when the tasks are created. For tags with the same name, job tags are given priority over job
   * definitions tags. If the total number of combined tags from the job and job definition is over 50,
   * the job is moved to the `FAILED` state.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-propagatetags)
   * @param propagateTags Specifies whether to propagate the tags from the job or job definition to
   * the corresponding Amazon ECS task. 
   */
  public fun propagateTags(propagateTags: IResolvable) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * The retry strategy to use for failed jobs that are submitted with this job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
   * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this job
   * definition. 
   */
  public fun retryStrategy(retryStrategy: IResolvable) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  /**
   * The retry strategy to use for failed jobs that are submitted with this job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
   * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this job
   * definition. 
   */
  public fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty) {
    cdkBuilder.retryStrategy(retryStrategy)
  }

  /**
   * The scheduling priority of the job definition.
   *
   * This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling
   * priority are scheduled before jobs with a lower scheduling priority.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-schedulingpriority)
   * @param schedulingPriority The scheduling priority of the job definition. 
   */
  public fun schedulingPriority(schedulingPriority: Number) {
    cdkBuilder.schedulingPriority(schedulingPriority)
  }

  /**
   * The tags that are applied to the job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-tags)
   * @param tags The tags that are applied to the job definition. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * The tags that are applied to the job definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-tags)
   * @param tags The tags that are applied to the job definition. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * The timeout time for jobs that are submitted with this job definition.
   *
   * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
   * finished.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
   * @param timeout The timeout time for jobs that are submitted with this job definition. 
   */
  public fun timeout(timeout: IResolvable) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * The timeout time for jobs that are submitted with this job definition.
   *
   * After the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
   * finished.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
   * @param timeout The timeout time for jobs that are submitted with this job definition. 
   */
  public fun timeout(timeout: CfnJobDefinition.TimeoutProperty) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * The type of job definition.
   *
   * For more information about multi-node parallel jobs, see [Creating a multi-node parallel job
   * definition](https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html) in the
   * *AWS Batch User Guide* .
   *
   *
   * If the job is run on Fargate resources, then `multinode` isn't supported.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type)
   * @param type The type of job definition. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnJobDefinition {
    if(_platformCapabilities.isNotEmpty()) cdkBuilder.platformCapabilities(_platformCapabilities)
    return cdkBuilder.build()
  }
}
