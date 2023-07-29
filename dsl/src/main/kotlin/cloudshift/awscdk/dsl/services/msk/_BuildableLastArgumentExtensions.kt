@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.msk

import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster
import software.amazon.awscdk.services.msk.CfnServerlessCluster

/** Information about the broker nodes in the cluster. */
public inline fun CfnCluster.setBrokerNodeGroupInfo(
    block: CfnClusterBrokerNodeGroupInfoPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClusterBrokerNodeGroupInfoPropertyDsl()
    builder.apply(block)
    return setBrokerNodeGroupInfo(builder.build())
}

/** Includes all client authentication related information. */
public inline fun CfnCluster.setClientAuthentication(
    block: CfnClusterClientAuthenticationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClusterClientAuthenticationPropertyDsl()
    builder.apply(block)
    return setClientAuthentication(builder.build())
}

/** Represents the configuration that you want MSK to use for the cluster. */
public inline fun CfnCluster.setConfigurationInfo(
    block: CfnClusterConfigurationInfoPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClusterConfigurationInfoPropertyDsl()
    builder.apply(block)
    return setConfigurationInfo(builder.build())
}

/** Includes all encryption-related information. */
public inline fun CfnCluster.setEncryptionInfo(
    block: CfnClusterEncryptionInfoPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClusterEncryptionInfoPropertyDsl()
    builder.apply(block)
    return setEncryptionInfo(builder.build())
}

/** Logging Info details. */
public inline fun CfnCluster.setLoggingInfo(
    block: CfnClusterLoggingInfoPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClusterLoggingInfoPropertyDsl()
    builder.apply(block)
    return setLoggingInfo(builder.build())
}

/** The settings for open monitoring. */
public inline fun CfnCluster.setOpenMonitoring(
    block: CfnClusterOpenMonitoringPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClusterOpenMonitoringPropertyDsl()
    builder.apply(block)
    return setOpenMonitoring(builder.build())
}

/**  */
public inline fun CfnServerlessCluster.setClientAuthentication(
    block: CfnServerlessClusterClientAuthenticationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServerlessClusterClientAuthenticationPropertyDsl()
    builder.apply(block)
    return setClientAuthentication(builder.build())
}
