@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rum

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor
import software.amazon.awscdk.services.rum.CfnAppMonitorProps
import software.constructs.Construct

public object rum {
  public inline fun cfnAppMonitor(
    scope: Construct,
    id: String,
    block: CfnAppMonitorDsl.() -> Unit = {},
  ): CfnAppMonitor {
    val builder = CfnAppMonitorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppMonitorAppMonitorConfigurationProperty(block: CfnAppMonitorAppMonitorConfigurationPropertyDsl.() -> Unit
      = {}): CfnAppMonitor.AppMonitorConfigurationProperty {
    val builder = CfnAppMonitorAppMonitorConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppMonitorCustomEventsProperty(block: CfnAppMonitorCustomEventsPropertyDsl.() -> Unit =
      {}): CfnAppMonitor.CustomEventsProperty {
    val builder = CfnAppMonitorCustomEventsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppMonitorMetricDefinitionProperty(block: CfnAppMonitorMetricDefinitionPropertyDsl.() -> Unit
      = {}): CfnAppMonitor.MetricDefinitionProperty {
    val builder = CfnAppMonitorMetricDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppMonitorMetricDestinationProperty(block: CfnAppMonitorMetricDestinationPropertyDsl.() -> Unit
      = {}): CfnAppMonitor.MetricDestinationProperty {
    val builder = CfnAppMonitorMetricDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppMonitorProps(block: CfnAppMonitorPropsDsl.() -> Unit = {}):
      CfnAppMonitorProps {
    val builder = CfnAppMonitorPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
