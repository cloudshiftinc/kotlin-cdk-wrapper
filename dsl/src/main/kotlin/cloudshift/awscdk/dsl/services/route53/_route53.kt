@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.route53

import software.amazon.awscdk.services.route53.ARecord
import software.amazon.awscdk.services.route53.ARecordProps
import software.amazon.awscdk.services.route53.AaaaRecord
import software.amazon.awscdk.services.route53.AaaaRecordProps
import software.amazon.awscdk.services.route53.AliasRecordTargetConfig
import software.amazon.awscdk.services.route53.CaaAmazonRecord
import software.amazon.awscdk.services.route53.CaaAmazonRecordProps
import software.amazon.awscdk.services.route53.CaaRecord
import software.amazon.awscdk.services.route53.CaaRecordProps
import software.amazon.awscdk.services.route53.CaaRecordValue
import software.amazon.awscdk.services.route53.CfnCidrCollection
import software.amazon.awscdk.services.route53.CfnCidrCollectionProps
import software.amazon.awscdk.services.route53.CfnDNSSEC
import software.amazon.awscdk.services.route53.CfnDNSSECProps
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHealthCheckProps
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.amazon.awscdk.services.route53.CfnHostedZoneProps
import software.amazon.awscdk.services.route53.CfnKeySigningKey
import software.amazon.awscdk.services.route53.CfnKeySigningKeyProps
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import software.amazon.awscdk.services.route53.CfnRecordSetGroupProps
import software.amazon.awscdk.services.route53.CfnRecordSetProps
import software.amazon.awscdk.services.route53.CnameRecord
import software.amazon.awscdk.services.route53.CnameRecordProps
import software.amazon.awscdk.services.route53.CommonHostedZoneProps
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps
import software.amazon.awscdk.services.route53.DsRecord
import software.amazon.awscdk.services.route53.DsRecordProps
import software.amazon.awscdk.services.route53.HostedZone
import software.amazon.awscdk.services.route53.HostedZoneAttributes
import software.amazon.awscdk.services.route53.HostedZoneProps
import software.amazon.awscdk.services.route53.HostedZoneProviderProps
import software.amazon.awscdk.services.route53.MxRecord
import software.amazon.awscdk.services.route53.MxRecordProps
import software.amazon.awscdk.services.route53.MxRecordValue
import software.amazon.awscdk.services.route53.NsRecord
import software.amazon.awscdk.services.route53.NsRecordProps
import software.amazon.awscdk.services.route53.PrivateHostedZone
import software.amazon.awscdk.services.route53.PrivateHostedZoneProps
import software.amazon.awscdk.services.route53.PublicHostedZone
import software.amazon.awscdk.services.route53.PublicHostedZoneAttributes
import software.amazon.awscdk.services.route53.PublicHostedZoneProps
import software.amazon.awscdk.services.route53.RecordSet
import software.amazon.awscdk.services.route53.RecordSetOptions
import software.amazon.awscdk.services.route53.RecordSetProps
import software.amazon.awscdk.services.route53.SrvRecord
import software.amazon.awscdk.services.route53.SrvRecordProps
import software.amazon.awscdk.services.route53.SrvRecordValue
import software.amazon.awscdk.services.route53.TxtRecord
import software.amazon.awscdk.services.route53.TxtRecordProps
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps
import software.amazon.awscdk.services.route53.ZoneDelegationOptions
import software.amazon.awscdk.services.route53.ZoneDelegationRecord
import software.amazon.awscdk.services.route53.ZoneDelegationRecordProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object route53 {
    public inline fun aRecord(
        scope: Construct,
        id: String,
        block: ARecordDsl.() -> Unit = {},
    ): ARecord {
        val builder = ARecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun aRecordProps(block: ARecordPropsDsl.() -> Unit = {}): ARecordProps {
        val builder = ARecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun aaaaRecord(
        scope: Construct,
        id: String,
        block: AaaaRecordDsl.() -> Unit = {},
    ): AaaaRecord {
        val builder = AaaaRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun aaaaRecordProps(block: AaaaRecordPropsDsl.() -> Unit = {}): AaaaRecordProps {
        val builder = AaaaRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun aliasRecordTargetConfig(block: AliasRecordTargetConfigDsl.() -> Unit = {}): AliasRecordTargetConfig {
        val builder = AliasRecordTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun caaAmazonRecord(
        scope: Construct,
        id: String,
        block: CaaAmazonRecordDsl.() -> Unit = {},
    ): CaaAmazonRecord {
        val builder = CaaAmazonRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun caaAmazonRecordProps(block: CaaAmazonRecordPropsDsl.() -> Unit = {}): CaaAmazonRecordProps {
        val builder = CaaAmazonRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun caaRecord(
        scope: Construct,
        id: String,
        block: CaaRecordDsl.() -> Unit = {},
    ): CaaRecord {
        val builder = CaaRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun caaRecordProps(block: CaaRecordPropsDsl.() -> Unit = {}): CaaRecordProps {
        val builder = CaaRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun caaRecordValue(block: CaaRecordValueDsl.() -> Unit = {}): CaaRecordValue {
        val builder = CaaRecordValueDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCidrCollection(
        scope: Construct,
        id: String,
        block: CfnCidrCollectionDsl.() -> Unit = {},
    ): CfnCidrCollection {
        val builder = CfnCidrCollectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCidrCollectionLocationProperty(
        block: CfnCidrCollectionLocationPropertyDsl.() -> Unit =
            {},
    ): CfnCidrCollection.LocationProperty {
        val builder = CfnCidrCollectionLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCidrCollectionProps(block: CfnCidrCollectionPropsDsl.() -> Unit = {}): CfnCidrCollectionProps {
        val builder = CfnCidrCollectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDNSSEC(
        scope: Construct,
        id: String,
        block: CfnDNSSECDsl.() -> Unit = {},
    ): CfnDNSSEC {
        val builder = CfnDNSSECDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDNSSECProps(block: CfnDNSSECPropsDsl.() -> Unit = {}): CfnDNSSECProps {
        val builder = CfnDNSSECPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHealthCheck(
        scope: Construct,
        id: String,
        block: CfnHealthCheckDsl.() -> Unit = {},
    ): CfnHealthCheck {
        val builder = CfnHealthCheckDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHealthCheckAlarmIdentifierProperty(
        block: CfnHealthCheckAlarmIdentifierPropertyDsl.() -> Unit =
            {},
    ): CfnHealthCheck.AlarmIdentifierProperty {
        val builder = CfnHealthCheckAlarmIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHealthCheckHealthCheckConfigProperty(
        block: CfnHealthCheckHealthCheckConfigPropertyDsl.() -> Unit =
            {},
    ): CfnHealthCheck.HealthCheckConfigProperty {
        val builder = CfnHealthCheckHealthCheckConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHealthCheckHealthCheckTagProperty(
        block: CfnHealthCheckHealthCheckTagPropertyDsl.() -> Unit =
            {},
    ): CfnHealthCheck.HealthCheckTagProperty {
        val builder = CfnHealthCheckHealthCheckTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHealthCheckProps(block: CfnHealthCheckPropsDsl.() -> Unit = {}): CfnHealthCheckProps {
        val builder = CfnHealthCheckPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHostedZone(
        scope: Construct,
        id: String,
        block: CfnHostedZoneDsl.() -> Unit = {},
    ): CfnHostedZone {
        val builder = CfnHostedZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHostedZoneHostedZoneConfigProperty(
        block: CfnHostedZoneHostedZoneConfigPropertyDsl.() -> Unit =
            {},
    ): CfnHostedZone.HostedZoneConfigProperty {
        val builder = CfnHostedZoneHostedZoneConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHostedZoneHostedZoneTagProperty(
        block: CfnHostedZoneHostedZoneTagPropertyDsl.() -> Unit =
            {},
    ): CfnHostedZone.HostedZoneTagProperty {
        val builder = CfnHostedZoneHostedZoneTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHostedZoneProps(block: CfnHostedZonePropsDsl.() -> Unit = {}): CfnHostedZoneProps {
        val builder = CfnHostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHostedZoneQueryLoggingConfigProperty(
        block: CfnHostedZoneQueryLoggingConfigPropertyDsl.() -> Unit =
            {},
    ): CfnHostedZone.QueryLoggingConfigProperty {
        val builder = CfnHostedZoneQueryLoggingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHostedZoneVPCProperty(block: CfnHostedZoneVPCPropertyDsl.() -> Unit = {}): CfnHostedZone.VPCProperty {
        val builder = CfnHostedZoneVPCPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKeySigningKey(
        scope: Construct,
        id: String,
        block: CfnKeySigningKeyDsl.() -> Unit = {},
    ): CfnKeySigningKey {
        val builder = CfnKeySigningKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKeySigningKeyProps(block: CfnKeySigningKeyPropsDsl.() -> Unit = {}): CfnKeySigningKeyProps {
        val builder = CfnKeySigningKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSet(
        scope: Construct,
        id: String,
        block: CfnRecordSetDsl.() -> Unit = {},
    ): CfnRecordSet {
        val builder = CfnRecordSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetAliasTargetProperty(
        block: CfnRecordSetAliasTargetPropertyDsl.() -> Unit =
            {},
    ): CfnRecordSet.AliasTargetProperty {
        val builder = CfnRecordSetAliasTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetCidrRoutingConfigProperty(
        block: CfnRecordSetCidrRoutingConfigPropertyDsl.() -> Unit =
            {},
    ): CfnRecordSet.CidrRoutingConfigProperty {
        val builder = CfnRecordSetCidrRoutingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetGeoLocationProperty(
        block: CfnRecordSetGeoLocationPropertyDsl.() -> Unit =
            {},
    ): CfnRecordSet.GeoLocationProperty {
        val builder = CfnRecordSetGeoLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetGroup(
        scope: Construct,
        id: String,
        block: CfnRecordSetGroupDsl.() -> Unit = {},
    ): CfnRecordSetGroup {
        val builder = CfnRecordSetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetGroupAliasTargetProperty(
        block: CfnRecordSetGroupAliasTargetPropertyDsl.() -> Unit =
            {},
    ): CfnRecordSetGroup.AliasTargetProperty {
        val builder = CfnRecordSetGroupAliasTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetGroupCidrRoutingConfigProperty(
        block: CfnRecordSetGroupCidrRoutingConfigPropertyDsl.() -> Unit =
            {},
    ): CfnRecordSetGroup.CidrRoutingConfigProperty {
        val builder = CfnRecordSetGroupCidrRoutingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetGroupGeoLocationProperty(
        block: CfnRecordSetGroupGeoLocationPropertyDsl.() -> Unit =
            {},
    ): CfnRecordSetGroup.GeoLocationProperty {
        val builder = CfnRecordSetGroupGeoLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetGroupProps(block: CfnRecordSetGroupPropsDsl.() -> Unit = {}): CfnRecordSetGroupProps {
        val builder = CfnRecordSetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetGroupRecordSetProperty(
        block: CfnRecordSetGroupRecordSetPropertyDsl.() -> Unit =
            {},
    ): CfnRecordSetGroup.RecordSetProperty {
        val builder = CfnRecordSetGroupRecordSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecordSetProps(block: CfnRecordSetPropsDsl.() -> Unit = {}): CfnRecordSetProps {
        val builder = CfnRecordSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cnameRecord(
        scope: Construct,
        id: String,
        block: CnameRecordDsl.() -> Unit = {},
    ): CnameRecord {
        val builder = CnameRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cnameRecordProps(block: CnameRecordPropsDsl.() -> Unit = {}): CnameRecordProps {
        val builder = CnameRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonHostedZoneProps(block: CommonHostedZonePropsDsl.() -> Unit = {}): CommonHostedZoneProps {
        val builder = CommonHostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun crossAccountZoneDelegationRecord(
        scope: Construct,
        id: String,
        block: CrossAccountZoneDelegationRecordDsl.() -> Unit = {},
    ): CrossAccountZoneDelegationRecord {
        val builder = CrossAccountZoneDelegationRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun crossAccountZoneDelegationRecordProps(
        block: CrossAccountZoneDelegationRecordPropsDsl.() -> Unit =
            {},
    ): CrossAccountZoneDelegationRecordProps {
        val builder = CrossAccountZoneDelegationRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dsRecord(
        scope: Construct,
        id: String,
        block: DsRecordDsl.() -> Unit = {},
    ): DsRecord {
        val builder = DsRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun dsRecordProps(block: DsRecordPropsDsl.() -> Unit = {}): DsRecordProps {
        val builder = DsRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun hostedZone(
        scope: Construct,
        id: String,
        block: HostedZoneDsl.() -> Unit = {},
    ): HostedZone {
        val builder = HostedZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun hostedZoneAttributes(block: HostedZoneAttributesDsl.() -> Unit = {}): HostedZoneAttributes {
        val builder = HostedZoneAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun hostedZoneProps(block: HostedZonePropsDsl.() -> Unit = {}): HostedZoneProps {
        val builder = HostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun hostedZoneProviderProps(block: HostedZoneProviderPropsDsl.() -> Unit = {}): HostedZoneProviderProps {
        val builder = HostedZoneProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun mxRecord(
        scope: Construct,
        id: String,
        block: MxRecordDsl.() -> Unit = {},
    ): MxRecord {
        val builder = MxRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun mxRecordProps(block: MxRecordPropsDsl.() -> Unit = {}): MxRecordProps {
        val builder = MxRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun mxRecordValue(block: MxRecordValueDsl.() -> Unit = {}): MxRecordValue {
        val builder = MxRecordValueDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun nsRecord(
        scope: Construct,
        id: String,
        block: NsRecordDsl.() -> Unit = {},
    ): NsRecord {
        val builder = NsRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun nsRecordProps(block: NsRecordPropsDsl.() -> Unit = {}): NsRecordProps {
        val builder = NsRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun privateHostedZone(
        scope: Construct,
        id: String,
        block: PrivateHostedZoneDsl.() -> Unit = {},
    ): PrivateHostedZone {
        val builder = PrivateHostedZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun privateHostedZoneProps(block: PrivateHostedZonePropsDsl.() -> Unit = {}): PrivateHostedZoneProps {
        val builder = PrivateHostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun publicHostedZone(
        scope: Construct,
        id: String,
        block: PublicHostedZoneDsl.() -> Unit = {},
    ): PublicHostedZone {
        val builder = PublicHostedZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun publicHostedZoneAttributes(
        block: PublicHostedZoneAttributesDsl.() -> Unit =
            {},
    ): PublicHostedZoneAttributes {
        val builder = PublicHostedZoneAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun publicHostedZoneProps(block: PublicHostedZonePropsDsl.() -> Unit = {}): PublicHostedZoneProps {
        val builder = PublicHostedZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun recordSet(
        scope: Construct,
        id: String,
        block: RecordSetDsl.() -> Unit = {},
    ): RecordSet {
        val builder = RecordSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun recordSetOptions(block: RecordSetOptionsDsl.() -> Unit = {}): RecordSetOptions {
        val builder = RecordSetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun recordSetProps(block: RecordSetPropsDsl.() -> Unit = {}): RecordSetProps {
        val builder = RecordSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun srvRecord(
        scope: Construct,
        id: String,
        block: SrvRecordDsl.() -> Unit = {},
    ): SrvRecord {
        val builder = SrvRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun srvRecordProps(block: SrvRecordPropsDsl.() -> Unit = {}): SrvRecordProps {
        val builder = SrvRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun srvRecordValue(block: SrvRecordValueDsl.() -> Unit = {}): SrvRecordValue {
        val builder = SrvRecordValueDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun txtRecord(
        scope: Construct,
        id: String,
        block: TxtRecordDsl.() -> Unit = {},
    ): TxtRecord {
        val builder = TxtRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun txtRecordProps(block: TxtRecordPropsDsl.() -> Unit = {}): TxtRecordProps {
        val builder = TxtRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun vpcEndpointServiceDomainName(
        scope: Construct,
        id: String,
        block: VpcEndpointServiceDomainNameDsl.() -> Unit = {},
    ): VpcEndpointServiceDomainName {
        val builder = VpcEndpointServiceDomainNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun vpcEndpointServiceDomainNameProps(
        block: VpcEndpointServiceDomainNamePropsDsl.() -> Unit =
            {},
    ): VpcEndpointServiceDomainNameProps {
        val builder = VpcEndpointServiceDomainNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun zoneDelegationOptions(block: ZoneDelegationOptionsDsl.() -> Unit = {}): ZoneDelegationOptions {
        val builder = ZoneDelegationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun zoneDelegationRecord(
        scope: Construct,
        id: String,
        block: ZoneDelegationRecordDsl.() -> Unit = {},
    ): ZoneDelegationRecord {
        val builder = ZoneDelegationRecordDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun zoneDelegationRecordProps(block: ZoneDelegationRecordPropsDsl.() -> Unit = {}): ZoneDelegationRecordProps {
        val builder = ZoneDelegationRecordPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
