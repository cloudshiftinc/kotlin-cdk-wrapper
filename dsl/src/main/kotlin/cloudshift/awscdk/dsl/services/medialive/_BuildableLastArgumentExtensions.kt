@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.medialive.CfnChannel
import software.amazon.awscdk.services.medialive.CfnInput
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup

public inline fun CfnChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnChannel.setCdiInputSpecification(block: CfnChannelCdiInputSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnChannelCdiInputSpecificationPropertyDsl()
  builder.apply(block)
  return setCdiInputSpecification(builder.build())
}

public inline
    fun CfnChannel.setEncoderSettings(block: CfnChannelEncoderSettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnChannelEncoderSettingsPropertyDsl()
  builder.apply(block)
  return setEncoderSettings(builder.build())
}

public inline
    fun CfnChannel.setInputSpecification(block: CfnChannelInputSpecificationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnChannelInputSpecificationPropertyDsl()
  builder.apply(block)
  return setInputSpecification(builder.build())
}

public inline
    fun CfnChannel.setMaintenance(block: CfnChannelMaintenanceCreateSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnChannelMaintenanceCreateSettingsPropertyDsl()
  builder.apply(block)
  return setMaintenance(builder.build())
}

public inline fun CfnChannel.setVpc(block: CfnChannelVpcOutputSettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnChannelVpcOutputSettingsPropertyDsl()
  builder.apply(block)
  return setVpc(builder.build())
}

public inline fun CfnInput.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnInput.setVpc(block: CfnInputInputVpcRequestPropertyDsl.() -> Unit = {}) {
  val builder = CfnInputInputVpcRequestPropertyDsl()
  builder.apply(block)
  return setVpc(builder.build())
}

public inline fun CfnInputSecurityGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
