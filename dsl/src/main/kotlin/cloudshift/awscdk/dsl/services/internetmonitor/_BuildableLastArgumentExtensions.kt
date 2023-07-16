@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

public inline fun CfnMonitor.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnMonitor.setInternetMeasurementsLogDelivery(block: CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl()
  builder.apply(block)
  return setInternetMeasurementsLogDelivery(builder.build())
}
