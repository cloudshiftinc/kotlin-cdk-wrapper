@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.internetmonitor

import kotlin.Unit
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

public inline
    fun CfnMonitor.setInternetMeasurementsLogDelivery(block: CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl()
  builder.apply(block)
  return setInternetMeasurementsLogDelivery(builder.build())
}
