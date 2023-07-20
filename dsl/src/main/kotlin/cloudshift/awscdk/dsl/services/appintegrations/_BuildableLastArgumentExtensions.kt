@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration

public inline
    fun CfnEventIntegration.setEventFilter(block: CfnEventIntegrationEventFilterPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventIntegrationEventFilterPropertyDsl()
  builder.apply(block)
  return setEventFilter(builder.build())
}

public inline
    fun CfnDataIntegration.setScheduleConfig(block: CfnDataIntegrationScheduleConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataIntegrationScheduleConfigPropertyDsl()
  builder.apply(block)
  return setScheduleConfig(builder.build())
}

public inline
    fun CfnDataIntegration.setFileConfiguration(block: CfnDataIntegrationFileConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataIntegrationFileConfigurationPropertyDsl()
  builder.apply(block)
  return setFileConfiguration(builder.build())
}
