@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.rum.CfnAppMonitor

public inline fun CfnAppMonitor.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAppMonitor.setAppMonitorConfiguration(block: CfnAppMonitorAppMonitorConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAppMonitorAppMonitorConfigurationPropertyDsl()
  builder.apply(block)
  return setAppMonitorConfiguration(builder.build())
}

public inline
    fun CfnAppMonitor.setCustomEvents(block: CfnAppMonitorCustomEventsPropertyDsl.() -> Unit = {}) {
  val builder = CfnAppMonitorCustomEventsPropertyDsl()
  builder.apply(block)
  return setCustomEvents(builder.build())
}
