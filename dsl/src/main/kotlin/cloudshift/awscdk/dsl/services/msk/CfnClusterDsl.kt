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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
        cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo)
    }

    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty) {
        cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo)
    }

    public fun clientAuthentication(clientAuthentication: IResolvable) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    public fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun configurationInfo(configurationInfo: IResolvable) {
        cdkBuilder.configurationInfo(configurationInfo)
    }

    public fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty) {
        cdkBuilder.configurationInfo(configurationInfo)
    }

    public fun currentVersion(currentVersion: String) {
        cdkBuilder.currentVersion(currentVersion)
    }

    public fun encryptionInfo(encryptionInfo: IResolvable) {
        cdkBuilder.encryptionInfo(encryptionInfo)
    }

    public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty) {
        cdkBuilder.encryptionInfo(encryptionInfo)
    }

    public fun enhancedMonitoring(enhancedMonitoring: String) {
        cdkBuilder.enhancedMonitoring(enhancedMonitoring)
    }

    public fun kafkaVersion(kafkaVersion: String) {
        cdkBuilder.kafkaVersion(kafkaVersion)
    }

    public fun loggingInfo(loggingInfo: IResolvable) {
        cdkBuilder.loggingInfo(loggingInfo)
    }

    public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty) {
        cdkBuilder.loggingInfo(loggingInfo)
    }

    public fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
        cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
    }

    public fun openMonitoring(openMonitoring: IResolvable) {
        cdkBuilder.openMonitoring(openMonitoring)
    }

    public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty) {
        cdkBuilder.openMonitoring(openMonitoring)
    }

    public fun storageMode(storageMode: String) {
        cdkBuilder.storageMode(storageMode)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnCluster = cdkBuilder.build()
}
