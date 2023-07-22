@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mwaa

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mwaa.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnEnvironment.LoggingConfigurationProperty.Builder =
      CfnEnvironment.LoggingConfigurationProperty.builder()

  /**
   * @param dagProcessingLogs Defines the processing logs sent to CloudWatch Logs and the logging
   * level to send.
   */
  public fun dagProcessingLogs(dagProcessingLogs: IResolvable) {
    cdkBuilder.dagProcessingLogs(dagProcessingLogs)
  }

  /**
   * @param dagProcessingLogs Defines the processing logs sent to CloudWatch Logs and the logging
   * level to send.
   */
  public
      fun dagProcessingLogs(dagProcessingLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
    cdkBuilder.dagProcessingLogs(dagProcessingLogs)
  }

  /**
   * @param schedulerLogs Defines the scheduler logs sent to CloudWatch Logs and the logging level
   * to send.
   */
  public fun schedulerLogs(schedulerLogs: IResolvable) {
    cdkBuilder.schedulerLogs(schedulerLogs)
  }

  /**
   * @param schedulerLogs Defines the scheduler logs sent to CloudWatch Logs and the logging level
   * to send.
   */
  public fun schedulerLogs(schedulerLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
    cdkBuilder.schedulerLogs(schedulerLogs)
  }

  /**
   * @param taskLogs Defines the task logs sent to CloudWatch Logs and the logging level to send.
   */
  public fun taskLogs(taskLogs: IResolvable) {
    cdkBuilder.taskLogs(taskLogs)
  }

  /**
   * @param taskLogs Defines the task logs sent to CloudWatch Logs and the logging level to send.
   */
  public fun taskLogs(taskLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
    cdkBuilder.taskLogs(taskLogs)
  }

  /**
   * @param webserverLogs Defines the web server logs sent to CloudWatch Logs and the logging level
   * to send.
   */
  public fun webserverLogs(webserverLogs: IResolvable) {
    cdkBuilder.webserverLogs(webserverLogs)
  }

  /**
   * @param webserverLogs Defines the web server logs sent to CloudWatch Logs and the logging level
   * to send.
   */
  public fun webserverLogs(webserverLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
    cdkBuilder.webserverLogs(webserverLogs)
  }

  /**
   * @param workerLogs Defines the worker logs sent to CloudWatch Logs and the logging level to
   * send.
   */
  public fun workerLogs(workerLogs: IResolvable) {
    cdkBuilder.workerLogs(workerLogs)
  }

  /**
   * @param workerLogs Defines the worker logs sent to CloudWatch Logs and the logging level to
   * send.
   */
  public fun workerLogs(workerLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
    cdkBuilder.workerLogs(workerLogs)
  }

  public fun build(): CfnEnvironment.LoggingConfigurationProperty = cdkBuilder.build()
}
