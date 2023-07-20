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

package cloudshift.awscdk.dsl.services.msk

import software.amazon.awscdk.services.msk.CfnBatchScramSecret
import software.amazon.awscdk.services.msk.CfnBatchScramSecretProps
import software.amazon.awscdk.services.msk.CfnCluster
import software.amazon.awscdk.services.msk.CfnClusterPolicy
import software.amazon.awscdk.services.msk.CfnClusterPolicyProps
import software.amazon.awscdk.services.msk.CfnClusterProps
import software.amazon.awscdk.services.msk.CfnConfiguration
import software.amazon.awscdk.services.msk.CfnConfigurationProps
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import software.amazon.awscdk.services.msk.CfnServerlessClusterProps
import software.amazon.awscdk.services.msk.CfnVpcConnection
import software.amazon.awscdk.services.msk.CfnVpcConnectionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object msk {
    public inline fun cfnBatchScramSecret(
        scope: Construct,
        id: String,
        block: CfnBatchScramSecretDsl.() -> Unit = {},
    ): CfnBatchScramSecret {
        val builder = CfnBatchScramSecretDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBatchScramSecretProps(block: CfnBatchScramSecretPropsDsl.() -> Unit = {}): CfnBatchScramSecretProps {
        val builder = CfnBatchScramSecretPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterBrokerLogsProperty(
        block: CfnClusterBrokerLogsPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.BrokerLogsProperty {
        val builder = CfnClusterBrokerLogsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterBrokerNodeGroupInfoProperty(
        block: CfnClusterBrokerNodeGroupInfoPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.BrokerNodeGroupInfoProperty {
        val builder = CfnClusterBrokerNodeGroupInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterClientAuthenticationProperty(
        block: CfnClusterClientAuthenticationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ClientAuthenticationProperty {
        val builder = CfnClusterClientAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterCloudWatchLogsProperty(
        block: CfnClusterCloudWatchLogsPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.CloudWatchLogsProperty {
        val builder = CfnClusterCloudWatchLogsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterConfigurationInfoProperty(
        block: CfnClusterConfigurationInfoPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ConfigurationInfoProperty {
        val builder = CfnClusterConfigurationInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterConnectivityInfoProperty(
        block: CfnClusterConnectivityInfoPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ConnectivityInfoProperty {
        val builder = CfnClusterConnectivityInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterEBSStorageInfoProperty(
        block: CfnClusterEBSStorageInfoPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.EBSStorageInfoProperty {
        val builder = CfnClusterEBSStorageInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterEncryptionAtRestProperty(
        block: CfnClusterEncryptionAtRestPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.EncryptionAtRestProperty {
        val builder = CfnClusterEncryptionAtRestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterEncryptionInTransitProperty(
        block: CfnClusterEncryptionInTransitPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.EncryptionInTransitProperty {
        val builder = CfnClusterEncryptionInTransitPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterEncryptionInfoProperty(
        block: CfnClusterEncryptionInfoPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.EncryptionInfoProperty {
        val builder = CfnClusterEncryptionInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterFirehoseProperty(
        block: CfnClusterFirehosePropertyDsl.() -> Unit =
            {},
    ): CfnCluster.FirehoseProperty {
        val builder = CfnClusterFirehosePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterIamProperty(block: CfnClusterIamPropertyDsl.() -> Unit = {}): CfnCluster.IamProperty {
        val builder = CfnClusterIamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterJmxExporterProperty(
        block: CfnClusterJmxExporterPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.JmxExporterProperty {
        val builder = CfnClusterJmxExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterLoggingInfoProperty(
        block: CfnClusterLoggingInfoPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.LoggingInfoProperty {
        val builder = CfnClusterLoggingInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterNodeExporterProperty(
        block: CfnClusterNodeExporterPropertyDsl.() -> Unit = {
        },
    ): CfnCluster.NodeExporterProperty {
        val builder = CfnClusterNodeExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterOpenMonitoringProperty(
        block: CfnClusterOpenMonitoringPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.OpenMonitoringProperty {
        val builder = CfnClusterOpenMonitoringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterPolicy(
        scope: Construct,
        id: String,
        block: CfnClusterPolicyDsl.() -> Unit = {},
    ): CfnClusterPolicy {
        val builder = CfnClusterPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterPolicyProps(block: CfnClusterPolicyPropsDsl.() -> Unit = {}): CfnClusterPolicyProps {
        val builder = CfnClusterPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterPrometheusProperty(
        block: CfnClusterPrometheusPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.PrometheusProperty {
        val builder = CfnClusterPrometheusPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterProvisionedThroughputProperty(
        block: CfnClusterProvisionedThroughputPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ProvisionedThroughputProperty {
        val builder = CfnClusterProvisionedThroughputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterPublicAccessProperty(
        block: CfnClusterPublicAccessPropertyDsl.() -> Unit = {
        },
    ): CfnCluster.PublicAccessProperty {
        val builder = CfnClusterPublicAccessPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterS3Property(block: CfnClusterS3PropertyDsl.() -> Unit = {}): CfnCluster.S3Property {
        val builder = CfnClusterS3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSaslProperty(block: CfnClusterSaslPropertyDsl.() -> Unit = {}): CfnCluster.SaslProperty {
        val builder = CfnClusterSaslPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterScramProperty(block: CfnClusterScramPropertyDsl.() -> Unit = {}): CfnCluster.ScramProperty {
        val builder = CfnClusterScramPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterStorageInfoProperty(
        block: CfnClusterStorageInfoPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.StorageInfoProperty {
        val builder = CfnClusterStorageInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterTlsProperty(block: CfnClusterTlsPropertyDsl.() -> Unit = {}): CfnCluster.TlsProperty {
        val builder = CfnClusterTlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterUnauthenticatedProperty(
        block: CfnClusterUnauthenticatedPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.UnauthenticatedProperty {
        val builder = CfnClusterUnauthenticatedPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterVpcConnectivityClientAuthenticationProperty(
        block: CfnClusterVpcConnectivityClientAuthenticationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.VpcConnectivityClientAuthenticationProperty {
        val builder = CfnClusterVpcConnectivityClientAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterVpcConnectivityIamProperty(
        block: CfnClusterVpcConnectivityIamPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.VpcConnectivityIamProperty {
        val builder = CfnClusterVpcConnectivityIamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterVpcConnectivityProperty(
        block: CfnClusterVpcConnectivityPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.VpcConnectivityProperty {
        val builder = CfnClusterVpcConnectivityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterVpcConnectivitySaslProperty(
        block: CfnClusterVpcConnectivitySaslPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.VpcConnectivitySaslProperty {
        val builder = CfnClusterVpcConnectivitySaslPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterVpcConnectivityScramProperty(
        block: CfnClusterVpcConnectivityScramPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.VpcConnectivityScramProperty {
        val builder = CfnClusterVpcConnectivityScramPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterVpcConnectivityTlsProperty(
        block: CfnClusterVpcConnectivityTlsPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.VpcConnectivityTlsProperty {
        val builder = CfnClusterVpcConnectivityTlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfiguration(
        scope: Construct,
        id: String,
        block: CfnConfigurationDsl.() -> Unit = {},
    ): CfnConfiguration {
        val builder = CfnConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationProps(block: CfnConfigurationPropsDsl.() -> Unit = {}): CfnConfigurationProps {
        val builder = CfnConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServerlessCluster(
        scope: Construct,
        id: String,
        block: CfnServerlessClusterDsl.() -> Unit = {},
    ): CfnServerlessCluster {
        val builder = CfnServerlessClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServerlessClusterClientAuthenticationProperty(
        block: CfnServerlessClusterClientAuthenticationPropertyDsl.() -> Unit =
            {},
    ): CfnServerlessCluster.ClientAuthenticationProperty {
        val builder = CfnServerlessClusterClientAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServerlessClusterIamProperty(
        block: CfnServerlessClusterIamPropertyDsl.() -> Unit =
            {},
    ): CfnServerlessCluster.IamProperty {
        val builder = CfnServerlessClusterIamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServerlessClusterProps(block: CfnServerlessClusterPropsDsl.() -> Unit = {}): CfnServerlessClusterProps {
        val builder = CfnServerlessClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServerlessClusterSaslProperty(
        block: CfnServerlessClusterSaslPropertyDsl.() -> Unit =
            {},
    ): CfnServerlessCluster.SaslProperty {
        val builder = CfnServerlessClusterSaslPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServerlessClusterVpcConfigProperty(
        block: CfnServerlessClusterVpcConfigPropertyDsl.() -> Unit =
            {},
    ): CfnServerlessCluster.VpcConfigProperty {
        val builder = CfnServerlessClusterVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVpcConnection(
        scope: Construct,
        id: String,
        block: CfnVpcConnectionDsl.() -> Unit = {},
    ): CfnVpcConnection {
        val builder = CfnVpcConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVpcConnectionProps(block: CfnVpcConnectionPropsDsl.() -> Unit = {}): CfnVpcConnectionProps {
        val builder = CfnVpcConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
