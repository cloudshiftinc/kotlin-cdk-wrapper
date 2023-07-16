@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDestination
import software.amazon.awscdk.services.iotwireless.CfnDestinationProps
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway
import software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps
import software.constructs.Construct

public object iotwireless {
  public inline fun cfnDestination(
    scope: Construct,
    id: String,
    block: CfnDestinationDsl.() -> Unit = {},
  ): CfnDestination {
    val builder = CfnDestinationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDestinationProps(block: CfnDestinationPropsDsl.() -> Unit = {}):
      CfnDestinationProps {
    val builder = CfnDestinationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceProfile(
    scope: Construct,
    id: String,
    block: CfnDeviceProfileDsl.() -> Unit = {},
  ): CfnDeviceProfile {
    val builder = CfnDeviceProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeviceProfileLoRaWANDeviceProfileProperty(block: CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl.() -> Unit
      = {}): CfnDeviceProfile.LoRaWANDeviceProfileProperty {
    val builder = CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceProfileProps(block: CfnDeviceProfilePropsDsl.() -> Unit = {}):
      CfnDeviceProfileProps {
    val builder = CfnDeviceProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFuotaTask(
    scope: Construct,
    id: String,
    block: CfnFuotaTaskDsl.() -> Unit = {},
  ): CfnFuotaTask {
    val builder = CfnFuotaTaskDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFuotaTaskLoRaWANProperty(block: CfnFuotaTaskLoRaWANPropertyDsl.() -> Unit =
      {}): CfnFuotaTask.LoRaWANProperty {
    val builder = CfnFuotaTaskLoRaWANPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFuotaTaskProps(block: CfnFuotaTaskPropsDsl.() -> Unit = {}):
      CfnFuotaTaskProps {
    val builder = CfnFuotaTaskPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMulticastGroup(
    scope: Construct,
    id: String,
    block: CfnMulticastGroupDsl.() -> Unit = {},
  ): CfnMulticastGroup {
    val builder = CfnMulticastGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMulticastGroupLoRaWANProperty(block: CfnMulticastGroupLoRaWANPropertyDsl.() -> Unit =
      {}): CfnMulticastGroup.LoRaWANProperty {
    val builder = CfnMulticastGroupLoRaWANPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMulticastGroupProps(block: CfnMulticastGroupPropsDsl.() -> Unit = {}):
      CfnMulticastGroupProps {
    val builder = CfnMulticastGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNetworkAnalyzerConfiguration(
    scope: Construct,
    id: String,
    block: CfnNetworkAnalyzerConfigurationDsl.() -> Unit = {},
  ): CfnNetworkAnalyzerConfiguration {
    val builder = CfnNetworkAnalyzerConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkAnalyzerConfigurationProps(block: CfnNetworkAnalyzerConfigurationPropsDsl.() -> Unit
      = {}): CfnNetworkAnalyzerConfigurationProps {
    val builder = CfnNetworkAnalyzerConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNetworkAnalyzerConfigurationTraceContentProperty(block: CfnNetworkAnalyzerConfigurationTraceContentPropertyDsl.() -> Unit
      = {}): CfnNetworkAnalyzerConfiguration.TraceContentProperty {
    val builder = CfnNetworkAnalyzerConfigurationTraceContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPartnerAccount(
    scope: Construct,
    id: String,
    block: CfnPartnerAccountDsl.() -> Unit = {},
  ): CfnPartnerAccount {
    val builder = CfnPartnerAccountDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPartnerAccountProps(block: CfnPartnerAccountPropsDsl.() -> Unit = {}):
      CfnPartnerAccountProps {
    val builder = CfnPartnerAccountPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPartnerAccountSidewalkAccountInfoProperty(block: CfnPartnerAccountSidewalkAccountInfoPropertyDsl.() -> Unit
      = {}): CfnPartnerAccount.SidewalkAccountInfoProperty {
    val builder = CfnPartnerAccountSidewalkAccountInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPartnerAccountSidewalkAccountInfoWithFingerprintProperty(block: CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl.() -> Unit
      = {}): CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty {
    val builder = CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPartnerAccountSidewalkUpdateAccountProperty(block: CfnPartnerAccountSidewalkUpdateAccountPropertyDsl.() -> Unit
      = {}): CfnPartnerAccount.SidewalkUpdateAccountProperty {
    val builder = CfnPartnerAccountSidewalkUpdateAccountPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceProfile(
    scope: Construct,
    id: String,
    block: CfnServiceProfileDsl.() -> Unit = {},
  ): CfnServiceProfile {
    val builder = CfnServiceProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceProfileLoRaWANServiceProfileProperty(block: CfnServiceProfileLoRaWANServiceProfilePropertyDsl.() -> Unit
      = {}): CfnServiceProfile.LoRaWANServiceProfileProperty {
    val builder = CfnServiceProfileLoRaWANServiceProfilePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceProfileProps(block: CfnServiceProfilePropsDsl.() -> Unit = {}):
      CfnServiceProfileProps {
    val builder = CfnServiceProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTaskDefinition(
    scope: Construct,
    id: String,
    block: CfnTaskDefinitionDsl.() -> Unit = {},
  ): CfnTaskDefinition {
    val builder = CfnTaskDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTaskDefinitionLoRaWANGatewayVersionProperty(block: CfnTaskDefinitionLoRaWANGatewayVersionPropertyDsl.() -> Unit
      = {}): CfnTaskDefinition.LoRaWANGatewayVersionProperty {
    val builder = CfnTaskDefinitionLoRaWANGatewayVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTaskDefinitionLoRaWANUpdateGatewayTaskCreateProperty(block: CfnTaskDefinitionLoRaWANUpdateGatewayTaskCreatePropertyDsl.() -> Unit
      = {}): CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty {
    val builder = CfnTaskDefinitionLoRaWANUpdateGatewayTaskCreatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryProperty(block: CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl.() -> Unit
      = {}): CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty {
    val builder = CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTaskDefinitionProps(block: CfnTaskDefinitionPropsDsl.() -> Unit = {}):
      CfnTaskDefinitionProps {
    val builder = CfnTaskDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTaskDefinitionUpdateWirelessGatewayTaskCreateProperty(block: CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl.() -> Unit
      = {}): CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty {
    val builder = CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWirelessDevice(
    scope: Construct,
    id: String,
    block: CfnWirelessDeviceDsl.() -> Unit = {},
  ): CfnWirelessDevice {
    val builder = CfnWirelessDeviceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceAbpV10xProperty(block: CfnWirelessDeviceAbpV10xPropertyDsl.() -> Unit =
      {}): CfnWirelessDevice.AbpV10xProperty {
    val builder = CfnWirelessDeviceAbpV10xPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceAbpV11Property(block: CfnWirelessDeviceAbpV11PropertyDsl.() -> Unit =
      {}): CfnWirelessDevice.AbpV11Property {
    val builder = CfnWirelessDeviceAbpV11PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWirelessDeviceImportTask(
    scope: Construct,
    id: String,
    block: CfnWirelessDeviceImportTaskDsl.() -> Unit = {},
  ): CfnWirelessDeviceImportTask {
    val builder = CfnWirelessDeviceImportTaskDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceImportTaskProps(block: CfnWirelessDeviceImportTaskPropsDsl.() -> Unit =
      {}): CfnWirelessDeviceImportTaskProps {
    val builder = CfnWirelessDeviceImportTaskPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceImportTaskSidewalkProperty(block: CfnWirelessDeviceImportTaskSidewalkPropertyDsl.() -> Unit
      = {}): CfnWirelessDeviceImportTask.SidewalkProperty {
    val builder = CfnWirelessDeviceImportTaskSidewalkPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceLoRaWANDeviceProperty(block: CfnWirelessDeviceLoRaWANDevicePropertyDsl.() -> Unit
      = {}): CfnWirelessDevice.LoRaWANDeviceProperty {
    val builder = CfnWirelessDeviceLoRaWANDevicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceOtaaV10xProperty(block: CfnWirelessDeviceOtaaV10xPropertyDsl.() -> Unit =
      {}): CfnWirelessDevice.OtaaV10xProperty {
    val builder = CfnWirelessDeviceOtaaV10xPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceOtaaV11Property(block: CfnWirelessDeviceOtaaV11PropertyDsl.() -> Unit =
      {}): CfnWirelessDevice.OtaaV11Property {
    val builder = CfnWirelessDeviceOtaaV11PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWirelessDeviceProps(block: CfnWirelessDevicePropsDsl.() -> Unit = {}):
      CfnWirelessDeviceProps {
    val builder = CfnWirelessDevicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceSessionKeysAbpV10xProperty(block: CfnWirelessDeviceSessionKeysAbpV10xPropertyDsl.() -> Unit
      = {}): CfnWirelessDevice.SessionKeysAbpV10xProperty {
    val builder = CfnWirelessDeviceSessionKeysAbpV10xPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessDeviceSessionKeysAbpV11Property(block: CfnWirelessDeviceSessionKeysAbpV11PropertyDsl.() -> Unit
      = {}): CfnWirelessDevice.SessionKeysAbpV11Property {
    val builder = CfnWirelessDeviceSessionKeysAbpV11PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWirelessGateway(
    scope: Construct,
    id: String,
    block: CfnWirelessGatewayDsl.() -> Unit = {},
  ): CfnWirelessGateway {
    val builder = CfnWirelessGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWirelessGatewayLoRaWANGatewayProperty(block: CfnWirelessGatewayLoRaWANGatewayPropertyDsl.() -> Unit
      = {}): CfnWirelessGateway.LoRaWANGatewayProperty {
    val builder = CfnWirelessGatewayLoRaWANGatewayPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWirelessGatewayProps(block: CfnWirelessGatewayPropsDsl.() -> Unit = {}):
      CfnWirelessGatewayProps {
    val builder = CfnWirelessGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
