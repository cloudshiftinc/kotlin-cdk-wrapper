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

package cloudshift.awscdk.dsl.services.servicediscovery

import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
import software.amazon.awscdk.services.servicediscovery.BaseInstanceProps
import software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps
import software.amazon.awscdk.services.servicediscovery.BaseServiceProps
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnInstance
import software.amazon.awscdk.services.servicediscovery.CfnInstanceProps
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnService
import software.amazon.awscdk.services.servicediscovery.CfnServiceProps
import software.amazon.awscdk.services.servicediscovery.CnameInstance
import software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps
import software.amazon.awscdk.services.servicediscovery.CnameInstanceProps
import software.amazon.awscdk.services.servicediscovery.DnsServiceProps
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
import software.amazon.awscdk.services.servicediscovery.HttpNamespace
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps
import software.amazon.awscdk.services.servicediscovery.IpInstance
import software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps
import software.amazon.awscdk.services.servicediscovery.IpInstanceProps
import software.amazon.awscdk.services.servicediscovery.NonIpInstance
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceAttributes
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.Service
import software.amazon.awscdk.services.servicediscovery.ServiceAttributes
import software.amazon.awscdk.services.servicediscovery.ServiceProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object servicediscovery {
    public inline fun aliasTargetInstance(
        scope: Construct,
        id: String,
        block: AliasTargetInstanceDsl.() -> Unit = {},
    ): AliasTargetInstance {
        val builder = AliasTargetInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun aliasTargetInstanceProps(block: AliasTargetInstancePropsDsl.() -> Unit = {}): AliasTargetInstanceProps {
        val builder = AliasTargetInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseInstanceProps(block: BaseInstancePropsDsl.() -> Unit = {}): BaseInstanceProps {
        val builder = BaseInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseNamespaceProps(block: BaseNamespacePropsDsl.() -> Unit = {}): BaseNamespaceProps {
        val builder = BaseNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseServiceProps(block: BaseServicePropsDsl.() -> Unit = {}): BaseServiceProps {
        val builder = BaseServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHttpNamespace(
        scope: Construct,
        id: String,
        block: CfnHttpNamespaceDsl.() -> Unit = {},
    ): CfnHttpNamespace {
        val builder = CfnHttpNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHttpNamespaceProps(block: CfnHttpNamespacePropsDsl.() -> Unit = {}): CfnHttpNamespaceProps {
        val builder = CfnHttpNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstance(
        scope: Construct,
        id: String,
        block: CfnInstanceDsl.() -> Unit = {},
    ): CfnInstance {
        val builder = CfnInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceProps(block: CfnInstancePropsDsl.() -> Unit = {}): CfnInstanceProps {
        val builder = CfnInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrivateDnsNamespace(
        scope: Construct,
        id: String,
        block: CfnPrivateDnsNamespaceDsl.() -> Unit = {},
    ): CfnPrivateDnsNamespace {
        val builder = CfnPrivateDnsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrivateDnsNamespacePrivateDnsPropertiesMutableProperty(
        block: CfnPrivateDnsNamespacePrivateDnsPropertiesMutablePropertyDsl.() -> Unit =
            {},
    ): CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty {
        val builder = CfnPrivateDnsNamespacePrivateDnsPropertiesMutablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrivateDnsNamespacePropertiesProperty(
        block: CfnPrivateDnsNamespacePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnPrivateDnsNamespace.PropertiesProperty {
        val builder = CfnPrivateDnsNamespacePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrivateDnsNamespaceProps(
        block: CfnPrivateDnsNamespacePropsDsl.() -> Unit =
            {},
    ): CfnPrivateDnsNamespaceProps {
        val builder = CfnPrivateDnsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrivateDnsNamespaceSOAProperty(
        block: CfnPrivateDnsNamespaceSOAPropertyDsl.() -> Unit =
            {},
    ): CfnPrivateDnsNamespace.SOAProperty {
        val builder = CfnPrivateDnsNamespaceSOAPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPublicDnsNamespace(
        scope: Construct,
        id: String,
        block: CfnPublicDnsNamespaceDsl.() -> Unit = {},
    ): CfnPublicDnsNamespace {
        val builder = CfnPublicDnsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPublicDnsNamespacePropertiesProperty(
        block: CfnPublicDnsNamespacePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnPublicDnsNamespace.PropertiesProperty {
        val builder = CfnPublicDnsNamespacePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPublicDnsNamespaceProps(
        block: CfnPublicDnsNamespacePropsDsl.() -> Unit =
            {},
    ): CfnPublicDnsNamespaceProps {
        val builder = CfnPublicDnsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPublicDnsNamespacePublicDnsPropertiesMutableProperty(
        block: CfnPublicDnsNamespacePublicDnsPropertiesMutablePropertyDsl.() -> Unit =
            {},
    ): CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty {
        val builder = CfnPublicDnsNamespacePublicDnsPropertiesMutablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPublicDnsNamespaceSOAProperty(
        block: CfnPublicDnsNamespaceSOAPropertyDsl.() -> Unit =
            {},
    ): CfnPublicDnsNamespace.SOAProperty {
        val builder = CfnPublicDnsNamespaceSOAPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnService(
        scope: Construct,
        id: String,
        block: CfnServiceDsl.() -> Unit = {},
    ): CfnService {
        val builder = CfnServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceDnsConfigProperty(
        block: CfnServiceDnsConfigPropertyDsl.() -> Unit =
            {},
    ): CfnService.DnsConfigProperty {
        val builder = CfnServiceDnsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceDnsRecordProperty(
        block: CfnServiceDnsRecordPropertyDsl.() -> Unit =
            {},
    ): CfnService.DnsRecordProperty {
        val builder = CfnServiceDnsRecordPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceHealthCheckConfigProperty(
        block: CfnServiceHealthCheckConfigPropertyDsl.() -> Unit =
            {},
    ): CfnService.HealthCheckConfigProperty {
        val builder = CfnServiceHealthCheckConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceHealthCheckCustomConfigProperty(
        block: CfnServiceHealthCheckCustomConfigPropertyDsl.() -> Unit =
            {},
    ): CfnService.HealthCheckCustomConfigProperty {
        val builder = CfnServiceHealthCheckCustomConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
        val builder = CfnServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cnameInstance(
        scope: Construct,
        id: String,
        block: CnameInstanceDsl.() -> Unit = {},
    ): CnameInstance {
        val builder = CnameInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cnameInstanceBaseProps(block: CnameInstanceBasePropsDsl.() -> Unit = {}): CnameInstanceBaseProps {
        val builder = CnameInstanceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cnameInstanceProps(block: CnameInstancePropsDsl.() -> Unit = {}): CnameInstanceProps {
        val builder = CnameInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dnsServiceProps(block: DnsServicePropsDsl.() -> Unit = {}): DnsServiceProps {
        val builder = DnsServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun healthCheckConfig(block: HealthCheckConfigDsl.() -> Unit = {}): HealthCheckConfig {
        val builder = HealthCheckConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun healthCheckCustomConfig(block: HealthCheckCustomConfigDsl.() -> Unit = {}): HealthCheckCustomConfig {
        val builder = HealthCheckCustomConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpNamespace(
        scope: Construct,
        id: String,
        block: HttpNamespaceDsl.() -> Unit = {},
    ): HttpNamespace {
        val builder = HttpNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpNamespaceAttributes(block: HttpNamespaceAttributesDsl.() -> Unit = {}): HttpNamespaceAttributes {
        val builder = HttpNamespaceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpNamespaceProps(block: HttpNamespacePropsDsl.() -> Unit = {}): HttpNamespaceProps {
        val builder = HttpNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ipInstance(
        scope: Construct,
        id: String,
        block: IpInstanceDsl.() -> Unit = {},
    ): IpInstance {
        val builder = IpInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun ipInstanceBaseProps(block: IpInstanceBasePropsDsl.() -> Unit = {}): IpInstanceBaseProps {
        val builder = IpInstanceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ipInstanceProps(block: IpInstancePropsDsl.() -> Unit = {}): IpInstanceProps {
        val builder = IpInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun nonIpInstance(
        scope: Construct,
        id: String,
        block: NonIpInstanceDsl.() -> Unit = {},
    ): NonIpInstance {
        val builder = NonIpInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun nonIpInstanceBaseProps(block: NonIpInstanceBasePropsDsl.() -> Unit = {}): NonIpInstanceBaseProps {
        val builder = NonIpInstanceBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun nonIpInstanceProps(block: NonIpInstancePropsDsl.() -> Unit = {}): NonIpInstanceProps {
        val builder = NonIpInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun privateDnsNamespace(
        scope: Construct,
        id: String,
        block: PrivateDnsNamespaceDsl.() -> Unit = {},
    ): PrivateDnsNamespace {
        val builder = PrivateDnsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun privateDnsNamespaceAttributes(
        block: PrivateDnsNamespaceAttributesDsl.() -> Unit =
            {},
    ): PrivateDnsNamespaceAttributes {
        val builder = PrivateDnsNamespaceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun privateDnsNamespaceProps(block: PrivateDnsNamespacePropsDsl.() -> Unit = {}): PrivateDnsNamespaceProps {
        val builder = PrivateDnsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun publicDnsNamespace(
        scope: Construct,
        id: String,
        block: PublicDnsNamespaceDsl.() -> Unit = {},
    ): PublicDnsNamespace {
        val builder = PublicDnsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun publicDnsNamespaceAttributes(
        block: PublicDnsNamespaceAttributesDsl.() -> Unit =
            {},
    ): PublicDnsNamespaceAttributes {
        val builder = PublicDnsNamespaceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun publicDnsNamespaceProps(block: PublicDnsNamespacePropsDsl.() -> Unit = {}): PublicDnsNamespaceProps {
        val builder = PublicDnsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun service(
        scope: Construct,
        id: String,
        block: ServiceDsl.() -> Unit = {},
    ): Service {
        val builder = ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceAttributes(block: ServiceAttributesDsl.() -> Unit = {}): ServiceAttributes {
        val builder = ServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceProps(block: ServicePropsDsl.() -> Unit = {}): ServiceProps {
        val builder = ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
