@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringJobDefinitionPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.MonitoringJobDefinitionProperty.Builder =
      CfnMonitoringSchedule.MonitoringJobDefinitionProperty.builder()

  private val _monitoringInputs: MutableList<Any> = mutableListOf()

  /**
   * @param baselineConfig Baseline configuration used to validate that the data conforms to the
   * specified constraints and statistics.
   */
  public fun baselineConfig(baselineConfig: IResolvable) {
    cdkBuilder.baselineConfig(baselineConfig)
  }

  /**
   * @param baselineConfig Baseline configuration used to validate that the data conforms to the
   * specified constraints and statistics.
   */
  public fun baselineConfig(baselineConfig: CfnMonitoringSchedule.BaselineConfigProperty) {
    cdkBuilder.baselineConfig(baselineConfig)
  }

  /**
   * @param environment Sets the environment variables in the Docker container.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param environment Sets the environment variables in the Docker container.
   */
  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
   * container image. 
   */
  public fun monitoringAppSpecification(monitoringAppSpecification: IResolvable) {
    cdkBuilder.monitoringAppSpecification(monitoringAppSpecification)
  }

  /**
   * @param monitoringAppSpecification Configures the monitoring job to run a specified Docker
   * container image. 
   */
  public
      fun monitoringAppSpecification(monitoringAppSpecification: CfnMonitoringSchedule.MonitoringAppSpecificationProperty) {
    cdkBuilder.monitoringAppSpecification(monitoringAppSpecification)
  }

  /**
   * @param monitoringInputs The array of inputs for the monitoring job. 
   * Currently we support monitoring an Amazon SageMaker Endpoint.
   */
  public fun monitoringInputs(vararg monitoringInputs: Any) {
    _monitoringInputs.addAll(listOf(*monitoringInputs))
  }

  /**
   * @param monitoringInputs The array of inputs for the monitoring job. 
   * Currently we support monitoring an Amazon SageMaker Endpoint.
   */
  public fun monitoringInputs(monitoringInputs: Collection<Any>) {
    _monitoringInputs.addAll(monitoringInputs)
  }

  /**
   * @param monitoringInputs The array of inputs for the monitoring job. 
   * Currently we support monitoring an Amazon SageMaker Endpoint.
   */
  public fun monitoringInputs(monitoringInputs: IResolvable) {
    cdkBuilder.monitoringInputs(monitoringInputs)
  }

  /**
   * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded to
   * Amazon Simple Storage Service (Amazon S3). 
   */
  public fun monitoringOutputConfig(monitoringOutputConfig: IResolvable) {
    cdkBuilder.monitoringOutputConfig(monitoringOutputConfig)
  }

  /**
   * @param monitoringOutputConfig The array of outputs from the monitoring job to be uploaded to
   * Amazon Simple Storage Service (Amazon S3). 
   */
  public
      fun monitoringOutputConfig(monitoringOutputConfig: CfnMonitoringSchedule.MonitoringOutputConfigProperty) {
    cdkBuilder.monitoringOutputConfig(monitoringOutputConfig)
  }

  /**
   * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
   * volumes to deploy for a monitoring job. 
   * In distributed processing, you specify more than one instance.
   */
  public fun monitoringResources(monitoringResources: IResolvable) {
    cdkBuilder.monitoringResources(monitoringResources)
  }

  /**
   * @param monitoringResources Identifies the resources, ML compute instances, and ML storage
   * volumes to deploy for a monitoring job. 
   * In distributed processing, you specify more than one instance.
   */
  public
      fun monitoringResources(monitoringResources: CfnMonitoringSchedule.MonitoringResourcesProperty) {
    cdkBuilder.monitoringResources(monitoringResources)
  }

  /**
   * @param networkConfig Specifies networking options for an monitoring job.
   */
  public fun networkConfig(networkConfig: IResolvable) {
    cdkBuilder.networkConfig(networkConfig)
  }

  /**
   * @param networkConfig Specifies networking options for an monitoring job.
   */
  public fun networkConfig(networkConfig: CfnMonitoringSchedule.NetworkConfigProperty) {
    cdkBuilder.networkConfig(networkConfig)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
   * to perform tasks on your behalf. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed to
   * run.
   */
  public fun stoppingCondition(stoppingCondition: IResolvable) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  /**
   * @param stoppingCondition Specifies a time limit for how long the monitoring job is allowed to
   * run.
   */
  public fun stoppingCondition(stoppingCondition: CfnMonitoringSchedule.StoppingConditionProperty) {
    cdkBuilder.stoppingCondition(stoppingCondition)
  }

  public fun build(): CfnMonitoringSchedule.MonitoringJobDefinitionProperty {
    if(_monitoringInputs.isNotEmpty()) cdkBuilder.monitoringInputs(_monitoringInputs)
    return cdkBuilder.build()
  }
}
