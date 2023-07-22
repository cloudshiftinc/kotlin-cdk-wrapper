@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway

/**
 * The LoRaWAN information used with a FUOTA task.
 */
public inline fun CfnFuotaTask.setLoRaWan(block: CfnFuotaTaskLoRaWANPropertyDsl.() -> Unit = {}) {
  val builder = CfnFuotaTaskLoRaWANPropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

/**
 * The gateway configuration information to use to create the wireless gateway.
 */
public inline
    fun CfnWirelessGateway.setLoRaWan(block: CfnWirelessGatewayLoRaWANGatewayPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWirelessGatewayLoRaWANGatewayPropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

/**
 * The Sidewalk account credentials.
 */
public inline
    fun CfnPartnerAccount.setSidewalk(block: CfnPartnerAccountSidewalkAccountInfoPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPartnerAccountSidewalkAccountInfoPropertyDsl()
  builder.apply(block)
  return setSidewalk(builder.build())
}

/**
 *
 */
public inline
    fun CfnPartnerAccount.setSidewalkResponse(block: CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl()
  builder.apply(block)
  return setSidewalkResponse(builder.build())
}

/**
 *
 */
public inline
    fun CfnPartnerAccount.setSidewalkUpdate(block: CfnPartnerAccountSidewalkUpdateAccountPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPartnerAccountSidewalkUpdateAccountPropertyDsl()
  builder.apply(block)
  return setSidewalkUpdate(builder.build())
}

/**
 * The Sidewalk-related information of the wireless device import task.
 */
public inline
    fun CfnWirelessDeviceImportTask.setSidewalk(block: CfnWirelessDeviceImportTaskSidewalkPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWirelessDeviceImportTaskSidewalkPropertyDsl()
  builder.apply(block)
  return setSidewalk(builder.build())
}

/**
 * The LoRaWAN information that is to be used with the multicast group.
 */
public inline fun CfnMulticastGroup.setLoRaWan(block: CfnMulticastGroupLoRaWANPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMulticastGroupLoRaWANPropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

/**
 * LoRaWAN service profile object.
 */
public inline
    fun CfnServiceProfile.setLoRaWan(block: CfnServiceProfileLoRaWANServiceProfilePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceProfileLoRaWANServiceProfilePropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

/**
 *
 */
public inline
    fun CfnTaskDefinition.setLoRaWanUpdateGatewayTaskEntry(block: CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl()
  builder.apply(block)
  return setLoRaWanUpdateGatewayTaskEntry(builder.build())
}

/**
 * Information about the gateways to update.
 */
public inline
    fun CfnTaskDefinition.setUpdate(block: CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl()
  builder.apply(block)
  return setUpdate(builder.build())
}

/**
 * The device configuration information to use to create the wireless device.
 */
public inline
    fun CfnWirelessDevice.setLoRaWan(block: CfnWirelessDeviceLoRaWANDevicePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnWirelessDeviceLoRaWANDevicePropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}

/**
 * LoRaWAN device profile object.
 */
public inline
    fun CfnDeviceProfile.setLoRaWan(block: CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl()
  builder.apply(block)
  return setLoRaWan(builder.build())
}
