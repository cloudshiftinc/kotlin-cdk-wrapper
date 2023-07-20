@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.internetmonitor

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.internetmonitor.CfnMonitor
import software.amazon.awscdk.services.internetmonitor.CfnMonitorProps
import software.constructs.Construct

public object internetmonitor {
  public inline fun cfnMonitor(
    scope: Construct,
    id: String,
    block: CfnMonitorDsl.() -> Unit = {},
  ): CfnMonitor {
    val builder = CfnMonitorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitorHealthEventsConfigProperty(block: CfnMonitorHealthEventsConfigPropertyDsl.() -> Unit
      = {}): CfnMonitor.HealthEventsConfigProperty {
    val builder = CfnMonitorHealthEventsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitorInternetMeasurementsLogDeliveryProperty(block: CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl.() -> Unit
      = {}): CfnMonitor.InternetMeasurementsLogDeliveryProperty {
    val builder = CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMonitorProps(block: CfnMonitorPropsDsl.() -> Unit = {}): CfnMonitorProps {
    val builder = CfnMonitorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMonitorS3ConfigProperty(block: CfnMonitorS3ConfigPropertyDsl.() -> Unit =
      {}): CfnMonitor.S3ConfigProperty {
    val builder = CfnMonitorS3ConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
