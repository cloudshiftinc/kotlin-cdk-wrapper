@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import software.amazon.awscdk.services.ivschat.CfnRoom

public inline fun CfnLoggingConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnLoggingConfiguration.setDestinationConfiguration(block: CfnLoggingConfigurationDestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoggingConfigurationDestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setDestinationConfiguration(builder.build())
}

public inline fun CfnRoom.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnRoom.setMessageReviewHandler(block: CfnRoomMessageReviewHandlerPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRoomMessageReviewHandlerPropertyDsl()
  builder.apply(block)
  return setMessageReviewHandler(builder.build())
}
