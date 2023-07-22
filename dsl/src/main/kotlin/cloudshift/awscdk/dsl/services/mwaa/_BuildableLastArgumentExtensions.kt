@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mwaa

import kotlin.Unit
import software.amazon.awscdk.services.mwaa.CfnEnvironment

/**
 * The Apache Airflow logs being sent to CloudWatch Logs: `DagProcessingLogs` , `SchedulerLogs` ,
 * `TaskLogs` , `WebserverLogs` , `WorkerLogs` .
 */
public inline
    fun CfnEnvironment.setLoggingConfiguration(block: CfnEnvironmentLoggingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEnvironmentLoggingConfigurationPropertyDsl()
  builder.apply(block)
  return setLoggingConfiguration(builder.build())
}

/**
 * The VPC networking components used to secure and enable network traffic between the AWS resources
 * for your environment.
 */
public inline
    fun CfnEnvironment.setNetworkConfiguration(block: CfnEnvironmentNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEnvironmentNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}
