@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps
import software.amazon.awscdk.services.iotfleetwise.CfnFleet
import software.amazon.awscdk.services.iotfleetwise.CfnFleetProps
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifest
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps
import software.amazon.awscdk.services.iotfleetwise.CfnVehicle
import software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps
import software.constructs.Construct

public object iotfleetwise {
  public inline fun cfnCampaign(
    scope: Construct,
    id: String,
    block: CfnCampaignDsl.() -> Unit = {},
  ): CfnCampaign {
    val builder = CfnCampaignDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignCollectionSchemeProperty(block: CfnCampaignCollectionSchemePropertyDsl.() -> Unit
      = {}): CfnCampaign.CollectionSchemeProperty {
    val builder = CfnCampaignCollectionSchemePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignConditionBasedCollectionSchemeProperty(block: CfnCampaignConditionBasedCollectionSchemePropertyDsl.() -> Unit
      = {}): CfnCampaign.ConditionBasedCollectionSchemeProperty {
    val builder = CfnCampaignConditionBasedCollectionSchemePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignDataDestinationConfigProperty(block: CfnCampaignDataDestinationConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.DataDestinationConfigProperty {
    val builder = CfnCampaignDataDestinationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignProps(block: CfnCampaignPropsDsl.() -> Unit = {}): CfnCampaignProps {
    val builder = CfnCampaignPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignS3ConfigProperty(block: CfnCampaignS3ConfigPropertyDsl.() -> Unit =
      {}): CfnCampaign.S3ConfigProperty {
    val builder = CfnCampaignS3ConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignSignalInformationProperty(block: CfnCampaignSignalInformationPropertyDsl.() -> Unit
      = {}): CfnCampaign.SignalInformationProperty {
    val builder = CfnCampaignSignalInformationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignTimeBasedCollectionSchemeProperty(block: CfnCampaignTimeBasedCollectionSchemePropertyDsl.() -> Unit
      = {}): CfnCampaign.TimeBasedCollectionSchemeProperty {
    val builder = CfnCampaignTimeBasedCollectionSchemePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignTimestreamConfigProperty(block: CfnCampaignTimestreamConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.TimestreamConfigProperty {
    val builder = CfnCampaignTimestreamConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDecoderManifest(
    scope: Construct,
    id: String,
    block: CfnDecoderManifestDsl.() -> Unit = {},
  ): CfnDecoderManifest {
    val builder = CfnDecoderManifestDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestCanInterfaceProperty(block: CfnDecoderManifestCanInterfacePropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.CanInterfaceProperty {
    val builder = CfnDecoderManifestCanInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestCanNetworkInterfaceProperty(block: CfnDecoderManifestCanNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.CanNetworkInterfaceProperty {
    val builder = CfnDecoderManifestCanNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestCanSignalDecoderProperty(block: CfnDecoderManifestCanSignalDecoderPropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.CanSignalDecoderProperty {
    val builder = CfnDecoderManifestCanSignalDecoderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestCanSignalProperty(block: CfnDecoderManifestCanSignalPropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.CanSignalProperty {
    val builder = CfnDecoderManifestCanSignalPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestNetworkInterfacesItemsProperty(block: CfnDecoderManifestNetworkInterfacesItemsPropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.NetworkInterfacesItemsProperty {
    val builder = CfnDecoderManifestNetworkInterfacesItemsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestObdInterfaceProperty(block: CfnDecoderManifestObdInterfacePropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.ObdInterfaceProperty {
    val builder = CfnDecoderManifestObdInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestObdNetworkInterfaceProperty(block: CfnDecoderManifestObdNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.ObdNetworkInterfaceProperty {
    val builder = CfnDecoderManifestObdNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestObdSignalDecoderProperty(block: CfnDecoderManifestObdSignalDecoderPropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.ObdSignalDecoderProperty {
    val builder = CfnDecoderManifestObdSignalDecoderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestObdSignalProperty(block: CfnDecoderManifestObdSignalPropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.ObdSignalProperty {
    val builder = CfnDecoderManifestObdSignalPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDecoderManifestProps(block: CfnDecoderManifestPropsDsl.() -> Unit = {}):
      CfnDecoderManifestProps {
    val builder = CfnDecoderManifestPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDecoderManifestSignalDecodersItemsProperty(block: CfnDecoderManifestSignalDecodersItemsPropertyDsl.() -> Unit
      = {}): CfnDecoderManifest.SignalDecodersItemsProperty {
    val builder = CfnDecoderManifestSignalDecodersItemsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFleet(
    scope: Construct,
    id: String,
    block: CfnFleetDsl.() -> Unit = {},
  ): CfnFleet {
    val builder = CfnFleetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFleetProps(block: CfnFleetPropsDsl.() -> Unit = {}): CfnFleetProps {
    val builder = CfnFleetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelManifest(
    scope: Construct,
    id: String,
    block: CfnModelManifestDsl.() -> Unit = {},
  ): CfnModelManifest {
    val builder = CfnModelManifestDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelManifestProps(block: CfnModelManifestPropsDsl.() -> Unit = {}):
      CfnModelManifestProps {
    val builder = CfnModelManifestPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSignalCatalog(
    scope: Construct,
    id: String,
    block: CfnSignalCatalogDsl.() -> Unit = {},
  ): CfnSignalCatalog {
    val builder = CfnSignalCatalogDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSignalCatalogActuatorProperty(block: CfnSignalCatalogActuatorPropertyDsl.() -> Unit =
      {}): CfnSignalCatalog.ActuatorProperty {
    val builder = CfnSignalCatalogActuatorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSignalCatalogAttributeProperty(block: CfnSignalCatalogAttributePropertyDsl.() -> Unit =
      {}): CfnSignalCatalog.AttributeProperty {
    val builder = CfnSignalCatalogAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSignalCatalogBranchProperty(block: CfnSignalCatalogBranchPropertyDsl.() -> Unit = {}):
      CfnSignalCatalog.BranchProperty {
    val builder = CfnSignalCatalogBranchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSignalCatalogNodeCountsProperty(block: CfnSignalCatalogNodeCountsPropertyDsl.() -> Unit
      = {}): CfnSignalCatalog.NodeCountsProperty {
    val builder = CfnSignalCatalogNodeCountsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSignalCatalogNodeProperty(block: CfnSignalCatalogNodePropertyDsl.() -> Unit =
      {}): CfnSignalCatalog.NodeProperty {
    val builder = CfnSignalCatalogNodePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSignalCatalogProps(block: CfnSignalCatalogPropsDsl.() -> Unit = {}):
      CfnSignalCatalogProps {
    val builder = CfnSignalCatalogPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSignalCatalogSensorProperty(block: CfnSignalCatalogSensorPropertyDsl.() -> Unit = {}):
      CfnSignalCatalog.SensorProperty {
    val builder = CfnSignalCatalogSensorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVehicle(
    scope: Construct,
    id: String,
    block: CfnVehicleDsl.() -> Unit = {},
  ): CfnVehicle {
    val builder = CfnVehicleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVehicleProps(block: CfnVehiclePropsDsl.() -> Unit = {}): CfnVehicleProps {
    val builder = CfnVehiclePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
