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

import software.amazon.awscdk.services.msk.CfnCluster
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import kotlin.Unit

public inline fun CfnCluster.setBrokerNodeGroupInfo(
    block: CfnClusterBrokerNodeGroupInfoPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterBrokerNodeGroupInfoPropertyDsl()
    builder.apply(block)
    return setBrokerNodeGroupInfo(builder.build())
}

public inline fun CfnCluster.setClientAuthentication(
    block: CfnClusterClientAuthenticationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterClientAuthenticationPropertyDsl()
    builder.apply(block)
    return setClientAuthentication(builder.build())
}

public inline fun CfnCluster.setConfigurationInfo(
    block: CfnClusterConfigurationInfoPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterConfigurationInfoPropertyDsl()
    builder.apply(block)
    return setConfigurationInfo(builder.build())
}

public inline fun CfnCluster.setEncryptionInfo(
    block: CfnClusterEncryptionInfoPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterEncryptionInfoPropertyDsl()
    builder.apply(block)
    return setEncryptionInfo(builder.build())
}

public inline fun CfnCluster.setLoggingInfo(
    block: CfnClusterLoggingInfoPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterLoggingInfoPropertyDsl()
    builder.apply(block)
    return setLoggingInfo(builder.build())
}

public inline fun CfnCluster.setOpenMonitoring(
    block: CfnClusterOpenMonitoringPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterOpenMonitoringPropertyDsl()
    builder.apply(block)
    return setOpenMonitoring(builder.build())
}

public inline fun CfnServerlessCluster.setClientAuthentication(
    block: CfnServerlessClusterClientAuthenticationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnServerlessClusterClientAuthenticationPropertyDsl()
    builder.apply(block)
    return setClientAuthentication(builder.build())
}
