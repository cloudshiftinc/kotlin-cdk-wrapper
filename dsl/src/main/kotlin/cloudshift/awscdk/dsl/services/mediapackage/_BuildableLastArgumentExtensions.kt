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

package cloudshift.awscdk.dsl.services.mediapackage

import software.amazon.awscdk.services.mediapackage.CfnChannel
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
import kotlin.Unit

public inline fun CfnPackagingGroup.setAuthorization(
    block: CfnPackagingGroupAuthorizationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPackagingGroupAuthorizationPropertyDsl()
    builder.apply(block)
    return setAuthorization(builder.build())
}

public inline fun CfnPackagingGroup.setEgressAccessLogs(
    block: CfnPackagingGroupLogConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPackagingGroupLogConfigurationPropertyDsl()
    builder.apply(block)
    return setEgressAccessLogs(builder.build())
}

public inline fun CfnPackagingConfiguration.setCmafPackage(
    block: CfnPackagingConfigurationCmafPackagePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPackagingConfigurationCmafPackagePropertyDsl()
    builder.apply(block)
    return setCmafPackage(builder.build())
}

public inline fun CfnPackagingConfiguration.setDashPackage(
    block: CfnPackagingConfigurationDashPackagePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPackagingConfigurationDashPackagePropertyDsl()
    builder.apply(block)
    return setDashPackage(builder.build())
}

public inline fun CfnPackagingConfiguration.setHlsPackage(
    block: CfnPackagingConfigurationHlsPackagePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPackagingConfigurationHlsPackagePropertyDsl()
    builder.apply(block)
    return setHlsPackage(builder.build())
}

public inline fun CfnPackagingConfiguration.setMssPackage(
    block: CfnPackagingConfigurationMssPackagePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPackagingConfigurationMssPackagePropertyDsl()
    builder.apply(block)
    return setMssPackage(builder.build())
}

public inline fun CfnChannel.setEgressAccessLogs(
    block: CfnChannelLogConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnChannelLogConfigurationPropertyDsl()
    builder.apply(block)
    return setEgressAccessLogs(builder.build())
}

public inline fun CfnChannel.setHlsIngest(block: CfnChannelHlsIngestPropertyDsl.() -> Unit = {}) {
    val builder = CfnChannelHlsIngestPropertyDsl()
    builder.apply(block)
    return setHlsIngest(builder.build())
}

public inline fun CfnChannel.setIngressAccessLogs(
    block: CfnChannelLogConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnChannelLogConfigurationPropertyDsl()
    builder.apply(block)
    return setIngressAccessLogs(builder.build())
}

public inline fun CfnOriginEndpoint.setAuthorization(
    block: CfnOriginEndpointAuthorizationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnOriginEndpointAuthorizationPropertyDsl()
    builder.apply(block)
    return setAuthorization(builder.build())
}

public inline fun CfnOriginEndpoint.setCmafPackage(
    block: CfnOriginEndpointCmafPackagePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnOriginEndpointCmafPackagePropertyDsl()
    builder.apply(block)
    return setCmafPackage(builder.build())
}

public inline fun CfnOriginEndpoint.setDashPackage(
    block: CfnOriginEndpointDashPackagePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnOriginEndpointDashPackagePropertyDsl()
    builder.apply(block)
    return setDashPackage(builder.build())
}

public inline fun CfnOriginEndpoint.setHlsPackage(
    block: CfnOriginEndpointHlsPackagePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnOriginEndpointHlsPackagePropertyDsl()
    builder.apply(block)
    return setHlsPackage(builder.build())
}

public inline fun CfnOriginEndpoint.setMssPackage(
    block: CfnOriginEndpointMssPackagePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnOriginEndpointMssPackagePropertyDsl()
    builder.apply(block)
    return setMssPackage(builder.build())
}
