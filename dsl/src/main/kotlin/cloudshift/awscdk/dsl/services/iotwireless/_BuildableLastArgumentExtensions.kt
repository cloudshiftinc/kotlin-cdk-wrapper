@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iotwireless.CfnDestination
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway

public inline fun CfnDestination.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDeviceProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDeviceProfile.setLoRaWan(block: CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

public inline fun CfnFuotaTask.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFuotaTask.setLoRaWan(block: CfnFuotaTaskLoRaWANPropertyDsl.() -> Unit = {}) {
  val builder = CfnFuotaTaskLoRaWANPropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

public inline fun CfnMulticastGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMulticastGroup.setLoRaWan(block: CfnMulticastGroupLoRaWANPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMulticastGroupLoRaWANPropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

public inline fun CfnNetworkAnalyzerConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPartnerAccount.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPartnerAccount.setSidewalk(block: CfnPartnerAccountSidewalkAccountInfoPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPartnerAccountSidewalkAccountInfoPropertyDsl()
  builder.apply(block)
  return setSidewalk(builder.build())
}

public inline
    fun CfnPartnerAccount.setSidewalkResponse(block: CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl()
  builder.apply(block)
  return setSidewalkResponse(builder.build())
}

public inline
    fun CfnPartnerAccount.setSidewalkUpdate(block: CfnPartnerAccountSidewalkUpdateAccountPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPartnerAccountSidewalkUpdateAccountPropertyDsl()
  builder.apply(block)
  return setSidewalkUpdate(builder.build())
}

public inline fun CfnServiceProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnServiceProfile.setLoRaWan(block: CfnServiceProfileLoRaWANServiceProfilePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceProfileLoRaWANServiceProfilePropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

public inline fun CfnTaskDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTaskDefinition.setLoRaWanUpdateGatewayTaskEntry(block: CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl()
  builder.apply(block)
  return setLoRaWanUpdateGatewayTaskEntry(builder.build())
}

public inline
    fun CfnTaskDefinition.setUpdate(block: CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl()
  builder.apply(block)
  return setUpdate(builder.build())
}

public inline fun CfnWirelessDevice.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnWirelessDevice.setLoRaWan(block: CfnWirelessDeviceLoRaWANDevicePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnWirelessDeviceLoRaWANDevicePropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

public inline fun CfnWirelessDeviceImportTask.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnWirelessDeviceImportTask.setSidewalk(block: CfnWirelessDeviceImportTaskSidewalkPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWirelessDeviceImportTaskSidewalkPropertyDsl()
  builder.apply(block)
  return setSidewalk(builder.build())
}

public inline fun CfnWirelessGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnWirelessGateway.setLoRaWan(block: CfnWirelessGatewayLoRaWANGatewayPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWirelessGatewayLoRaWANGatewayPropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}
