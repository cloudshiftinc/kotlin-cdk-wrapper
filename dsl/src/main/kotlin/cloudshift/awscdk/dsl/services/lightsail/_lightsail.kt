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

package cloudshift.awscdk.dsl.services.lightsail

import software.amazon.awscdk.services.lightsail.CfnAlarm
import software.amazon.awscdk.services.lightsail.CfnAlarmProps
import software.amazon.awscdk.services.lightsail.CfnBucket
import software.amazon.awscdk.services.lightsail.CfnBucketProps
import software.amazon.awscdk.services.lightsail.CfnCertificate
import software.amazon.awscdk.services.lightsail.CfnCertificateProps
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.amazon.awscdk.services.lightsail.CfnContainerProps
import software.amazon.awscdk.services.lightsail.CfnDatabase
import software.amazon.awscdk.services.lightsail.CfnDatabaseProps
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.amazon.awscdk.services.lightsail.CfnDiskProps
import software.amazon.awscdk.services.lightsail.CfnDistribution
import software.amazon.awscdk.services.lightsail.CfnDistributionProps
import software.amazon.awscdk.services.lightsail.CfnInstance
import software.amazon.awscdk.services.lightsail.CfnInstanceProps
import software.amazon.awscdk.services.lightsail.CfnLoadBalancer
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps
import software.amazon.awscdk.services.lightsail.CfnStaticIp
import software.amazon.awscdk.services.lightsail.CfnStaticIpProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object lightsail {
    public inline fun cfnAlarm(
        scope: Construct,
        id: String,
        block: CfnAlarmDsl.() -> Unit = {},
    ): CfnAlarm {
        val builder = CfnAlarmDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAlarmProps(block: CfnAlarmPropsDsl.() -> Unit = {}): CfnAlarmProps {
        val builder = CfnAlarmPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBucket(
        scope: Construct,
        id: String,
        block: CfnBucketDsl.() -> Unit = {},
    ): CfnBucket {
        val builder = CfnBucketDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBucketAccessRulesProperty(
        block: CfnBucketAccessRulesPropertyDsl.() -> Unit =
            {},
    ): CfnBucket.AccessRulesProperty {
        val builder = CfnBucketAccessRulesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBucketProps(block: CfnBucketPropsDsl.() -> Unit = {}): CfnBucketProps {
        val builder = CfnBucketPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificate(
        scope: Construct,
        id: String,
        block: CfnCertificateDsl.() -> Unit = {},
    ): CfnCertificate {
        val builder = CfnCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCertificateProps(block: CfnCertificatePropsDsl.() -> Unit = {}): CfnCertificateProps {
        val builder = CfnCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainer(
        scope: Construct,
        id: String,
        block: CfnContainerDsl.() -> Unit = {},
    ): CfnContainer {
        val builder = CfnContainerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerContainerProperty(
        block: CfnContainerContainerPropertyDsl.() -> Unit =
            {},
    ): CfnContainer.ContainerProperty {
        val builder = CfnContainerContainerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerContainerServiceDeploymentProperty(
        block: CfnContainerContainerServiceDeploymentPropertyDsl.() -> Unit =
            {},
    ): CfnContainer.ContainerServiceDeploymentProperty {
        val builder = CfnContainerContainerServiceDeploymentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerEnvironmentVariableProperty(
        block: CfnContainerEnvironmentVariablePropertyDsl.() -> Unit =
            {},
    ): CfnContainer.EnvironmentVariableProperty {
        val builder = CfnContainerEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerHealthCheckConfigProperty(
        block: CfnContainerHealthCheckConfigPropertyDsl.() -> Unit =
            {},
    ): CfnContainer.HealthCheckConfigProperty {
        val builder = CfnContainerHealthCheckConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerPortInfoProperty(
        block: CfnContainerPortInfoPropertyDsl.() -> Unit =
            {},
    ): CfnContainer.PortInfoProperty {
        val builder = CfnContainerPortInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerProps(block: CfnContainerPropsDsl.() -> Unit = {}): CfnContainerProps {
        val builder = CfnContainerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerPublicDomainNameProperty(
        block: CfnContainerPublicDomainNamePropertyDsl.() -> Unit =
            {},
    ): CfnContainer.PublicDomainNameProperty {
        val builder = CfnContainerPublicDomainNamePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerPublicEndpointProperty(
        block: CfnContainerPublicEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnContainer.PublicEndpointProperty {
        val builder = CfnContainerPublicEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabase(
        scope: Construct,
        id: String,
        block: CfnDatabaseDsl.() -> Unit = {},
    ): CfnDatabase {
        val builder = CfnDatabaseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabaseProps(block: CfnDatabasePropsDsl.() -> Unit = {}): CfnDatabaseProps {
        val builder = CfnDatabasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabaseRelationalDatabaseParameterProperty(
        block: CfnDatabaseRelationalDatabaseParameterPropertyDsl.() -> Unit =
            {},
    ): CfnDatabase.RelationalDatabaseParameterProperty {
        val builder = CfnDatabaseRelationalDatabaseParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDisk(
        scope: Construct,
        id: String,
        block: CfnDiskDsl.() -> Unit = {},
    ): CfnDisk {
        val builder = CfnDiskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDiskAddOnProperty(block: CfnDiskAddOnPropertyDsl.() -> Unit = {}): CfnDisk.AddOnProperty {
        val builder = CfnDiskAddOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDiskAutoSnapshotAddOnProperty(
        block: CfnDiskAutoSnapshotAddOnPropertyDsl.() -> Unit =
            {},
    ): CfnDisk.AutoSnapshotAddOnProperty {
        val builder = CfnDiskAutoSnapshotAddOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDiskLocationProperty(block: CfnDiskLocationPropertyDsl.() -> Unit = {}): CfnDisk.LocationProperty {
        val builder = CfnDiskLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDiskProps(block: CfnDiskPropsDsl.() -> Unit = {}): CfnDiskProps {
        val builder = CfnDiskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistribution(
        scope: Construct,
        id: String,
        block: CfnDistributionDsl.() -> Unit = {},
    ): CfnDistribution {
        val builder = CfnDistributionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionCacheBehaviorPerPathProperty(
        block: CfnDistributionCacheBehaviorPerPathPropertyDsl.() -> Unit =
            {},
    ): CfnDistribution.CacheBehaviorPerPathProperty {
        val builder = CfnDistributionCacheBehaviorPerPathPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionCacheBehaviorProperty(
        block: CfnDistributionCacheBehaviorPropertyDsl.() -> Unit =
            {},
    ): CfnDistribution.CacheBehaviorProperty {
        val builder = CfnDistributionCacheBehaviorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionCacheSettingsProperty(
        block: CfnDistributionCacheSettingsPropertyDsl.() -> Unit =
            {},
    ): CfnDistribution.CacheSettingsProperty {
        val builder = CfnDistributionCacheSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionCookieObjectProperty(
        block: CfnDistributionCookieObjectPropertyDsl.() -> Unit =
            {},
    ): CfnDistribution.CookieObjectProperty {
        val builder = CfnDistributionCookieObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionHeaderObjectProperty(
        block: CfnDistributionHeaderObjectPropertyDsl.() -> Unit =
            {},
    ): CfnDistribution.HeaderObjectProperty {
        val builder = CfnDistributionHeaderObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionInputOriginProperty(
        block: CfnDistributionInputOriginPropertyDsl.() -> Unit =
            {},
    ): CfnDistribution.InputOriginProperty {
        val builder = CfnDistributionInputOriginPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionProps(block: CfnDistributionPropsDsl.() -> Unit = {}): CfnDistributionProps {
        val builder = CfnDistributionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionQueryStringObjectProperty(
        block: CfnDistributionQueryStringObjectPropertyDsl.() -> Unit =
            {},
    ): CfnDistribution.QueryStringObjectProperty {
        val builder = CfnDistributionQueryStringObjectPropertyDsl()
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

    public inline fun cfnInstanceAddOnProperty(block: CfnInstanceAddOnPropertyDsl.() -> Unit = {}): CfnInstance.AddOnProperty {
        val builder = CfnInstanceAddOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceAutoSnapshotAddOnProperty(
        block: CfnInstanceAutoSnapshotAddOnPropertyDsl.() -> Unit =
            {},
    ): CfnInstance.AutoSnapshotAddOnProperty {
        val builder = CfnInstanceAutoSnapshotAddOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceDiskProperty(block: CfnInstanceDiskPropertyDsl.() -> Unit = {}): CfnInstance.DiskProperty {
        val builder = CfnInstanceDiskPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceHardwareProperty(
        block: CfnInstanceHardwarePropertyDsl.() -> Unit =
            {},
    ): CfnInstance.HardwareProperty {
        val builder = CfnInstanceHardwarePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceLocationProperty(
        block: CfnInstanceLocationPropertyDsl.() -> Unit =
            {},
    ): CfnInstance.LocationProperty {
        val builder = CfnInstanceLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceMonthlyTransferProperty(
        block: CfnInstanceMonthlyTransferPropertyDsl.() -> Unit =
            {},
    ): CfnInstance.MonthlyTransferProperty {
        val builder = CfnInstanceMonthlyTransferPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceNetworkingProperty(
        block: CfnInstanceNetworkingPropertyDsl.() -> Unit =
            {},
    ): CfnInstance.NetworkingProperty {
        val builder = CfnInstanceNetworkingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstancePortProperty(block: CfnInstancePortPropertyDsl.() -> Unit = {}): CfnInstance.PortProperty {
        val builder = CfnInstancePortPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceProps(block: CfnInstancePropsDsl.() -> Unit = {}): CfnInstanceProps {
        val builder = CfnInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceStateProperty(block: CfnInstanceStatePropertyDsl.() -> Unit = {}): CfnInstance.StateProperty {
        val builder = CfnInstanceStatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoadBalancer(
        scope: Construct,
        id: String,
        block: CfnLoadBalancerDsl.() -> Unit = {},
    ): CfnLoadBalancer {
        val builder = CfnLoadBalancerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoadBalancerProps(block: CfnLoadBalancerPropsDsl.() -> Unit = {}): CfnLoadBalancerProps {
        val builder = CfnLoadBalancerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoadBalancerTlsCertificate(
        scope: Construct,
        id: String,
        block: CfnLoadBalancerTlsCertificateDsl.() -> Unit = {},
    ): CfnLoadBalancerTlsCertificate {
        val builder = CfnLoadBalancerTlsCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoadBalancerTlsCertificateProps(
        block: CfnLoadBalancerTlsCertificatePropsDsl.() -> Unit =
            {},
    ): CfnLoadBalancerTlsCertificateProps {
        val builder = CfnLoadBalancerTlsCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStaticIp(
        scope: Construct,
        id: String,
        block: CfnStaticIpDsl.() -> Unit = {},
    ): CfnStaticIp {
        val builder = CfnStaticIpDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStaticIpProps(block: CfnStaticIpPropsDsl.() -> Unit = {}): CfnStaticIpProps {
        val builder = CfnStaticIpPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
