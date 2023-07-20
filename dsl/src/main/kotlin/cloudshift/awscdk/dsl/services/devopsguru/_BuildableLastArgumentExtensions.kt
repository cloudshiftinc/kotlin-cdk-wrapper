@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection

public inline
    fun CfnNotificationChannel.setConfig(block: CfnNotificationChannelNotificationChannelConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNotificationChannelNotificationChannelConfigPropertyDsl()
  builder.apply(block)
  return setConfig(builder.build())
}

public inline
    fun CfnResourceCollection.setResourceCollectionFilter(block: CfnResourceCollectionResourceCollectionFilterPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceCollectionResourceCollectionFilterPropertyDsl()
  builder.apply(block)
  return setResourceCollectionFilter(builder.build())
}
