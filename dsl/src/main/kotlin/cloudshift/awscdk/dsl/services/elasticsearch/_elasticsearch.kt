@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions
import software.amazon.awscdk.services.elasticsearch.CapacityConfig
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import software.amazon.awscdk.services.elasticsearch.CfnDomainProps
import software.amazon.awscdk.services.elasticsearch.CognitoOptions
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions
import software.amazon.awscdk.services.elasticsearch.Domain
import software.amazon.awscdk.services.elasticsearch.DomainAttributes
import software.amazon.awscdk.services.elasticsearch.DomainProps
import software.amazon.awscdk.services.elasticsearch.EbsOptions
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions
import software.amazon.awscdk.services.elasticsearch.LoggingOptions
import software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig
import software.constructs.Construct

public object elasticsearch {
  public inline fun advancedSecurityOptions(block: AdvancedSecurityOptionsDsl.() -> Unit = {}):
      AdvancedSecurityOptions {
    val builder = AdvancedSecurityOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun capacityConfig(block: CapacityConfigDsl.() -> Unit = {}): CapacityConfig {
    val builder = CapacityConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomain(
    scope: Construct,
    id: String,
    block: CfnDomainDsl.() -> Unit = {},
  ): CfnDomain {
    val builder = CfnDomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainAdvancedSecurityOptionsInputProperty(block: CfnDomainAdvancedSecurityOptionsInputPropertyDsl.() -> Unit
      = {}): CfnDomain.AdvancedSecurityOptionsInputProperty {
    val builder = CfnDomainAdvancedSecurityOptionsInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainCognitoOptionsProperty(block: CfnDomainCognitoOptionsPropertyDsl.() -> Unit =
      {}): CfnDomain.CognitoOptionsProperty {
    val builder = CfnDomainCognitoOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainColdStorageOptionsProperty(block: CfnDomainColdStorageOptionsPropertyDsl.() -> Unit
      = {}): CfnDomain.ColdStorageOptionsProperty {
    val builder = CfnDomainColdStorageOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainDomainEndpointOptionsProperty(block: CfnDomainDomainEndpointOptionsPropertyDsl.() -> Unit
      = {}): CfnDomain.DomainEndpointOptionsProperty {
    val builder = CfnDomainDomainEndpointOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainEBSOptionsProperty(block: CfnDomainEBSOptionsPropertyDsl.() -> Unit =
      {}): CfnDomain.EBSOptionsProperty {
    val builder = CfnDomainEBSOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainElasticsearchClusterConfigProperty(block: CfnDomainElasticsearchClusterConfigPropertyDsl.() -> Unit
      = {}): CfnDomain.ElasticsearchClusterConfigProperty {
    val builder = CfnDomainElasticsearchClusterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainEncryptionAtRestOptionsProperty(block: CfnDomainEncryptionAtRestOptionsPropertyDsl.() -> Unit
      = {}): CfnDomain.EncryptionAtRestOptionsProperty {
    val builder = CfnDomainEncryptionAtRestOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainLogPublishingOptionProperty(block: CfnDomainLogPublishingOptionPropertyDsl.() -> Unit
      = {}): CfnDomain.LogPublishingOptionProperty {
    val builder = CfnDomainLogPublishingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainMasterUserOptionsProperty(block: CfnDomainMasterUserOptionsPropertyDsl.() -> Unit
      = {}): CfnDomain.MasterUserOptionsProperty {
    val builder = CfnDomainMasterUserOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainNodeToNodeEncryptionOptionsProperty(block: CfnDomainNodeToNodeEncryptionOptionsPropertyDsl.() -> Unit
      = {}): CfnDomain.NodeToNodeEncryptionOptionsProperty {
    val builder = CfnDomainNodeToNodeEncryptionOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
    val builder = CfnDomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainSnapshotOptionsProperty(block: CfnDomainSnapshotOptionsPropertyDsl.() -> Unit =
      {}): CfnDomain.SnapshotOptionsProperty {
    val builder = CfnDomainSnapshotOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainVPCOptionsProperty(block: CfnDomainVPCOptionsPropertyDsl.() -> Unit =
      {}): CfnDomain.VPCOptionsProperty {
    val builder = CfnDomainVPCOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainZoneAwarenessConfigProperty(block: CfnDomainZoneAwarenessConfigPropertyDsl.() -> Unit
      = {}): CfnDomain.ZoneAwarenessConfigProperty {
    val builder = CfnDomainZoneAwarenessConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cognitoOptions(block: CognitoOptionsDsl.() -> Unit = {}): CognitoOptions {
    val builder = CognitoOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customEndpointOptions(block: CustomEndpointOptionsDsl.() -> Unit = {}):
      CustomEndpointOptions {
    val builder = CustomEndpointOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun domain(
    scope: Construct,
    id: String,
    block: DomainDsl.() -> Unit = {},
  ): Domain {
    val builder = DomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun domainAttributes(block: DomainAttributesDsl.() -> Unit = {}): DomainAttributes {
    val builder = DomainAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun domainProps(block: DomainPropsDsl.() -> Unit = {}): DomainProps {
    val builder = DomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ebsOptions(block: EbsOptionsDsl.() -> Unit = {}): EbsOptions {
    val builder = EbsOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun encryptionAtRestOptions(block: EncryptionAtRestOptionsDsl.() -> Unit = {}):
      EncryptionAtRestOptions {
    val builder = EncryptionAtRestOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loggingOptions(block: LoggingOptionsDsl.() -> Unit = {}): LoggingOptions {
    val builder = LoggingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun zoneAwarenessConfig(block: ZoneAwarenessConfigDsl.() -> Unit = {}):
      ZoneAwarenessConfig {
    val builder = ZoneAwarenessConfigDsl()
    builder.apply(block)
    return builder.build()
  }
}
