@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration

public inline fun CfnDataIntegration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDataIntegration.setFileConfiguration(block: CfnDataIntegrationFileConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataIntegrationFileConfigurationPropertyDsl()
  builder.apply(block)
  return setFileConfiguration(builder.build())
}

public inline
    fun CfnDataIntegration.setScheduleConfig(block: CfnDataIntegrationScheduleConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataIntegrationScheduleConfigPropertyDsl()
  builder.apply(block)
  return setScheduleConfig(builder.build())
}

public inline fun CfnEventIntegration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnEventIntegration.setEventFilter(block: CfnEventIntegrationEventFilterPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEventIntegrationEventFilterPropertyDsl()
  builder.apply(block)
  return setEventFilter(builder.build())
}
