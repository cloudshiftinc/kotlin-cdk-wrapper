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

package cloudshift.awscdk.dsl.services.mediapackage

import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnChannel
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup

/** Configures egress access logs. */
public inline fun CfnChannel.setEgressAccessLogs(
    block: CfnChannelLogConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelLogConfigurationPropertyDsl()
    builder.apply(block)
    return setEgressAccessLogs(builder.build())
}

/** The input URL where the source stream should be sent. */
public inline fun CfnChannel.setHlsIngest(block: CfnChannelHlsIngestPropertyDsl.() -> Unit = {}) {
    val builder = CfnChannelHlsIngestPropertyDsl()
    builder.apply(block)
    return setHlsIngest(builder.build())
}

/** Configures ingress access logs. */
public inline fun CfnChannel.setIngressAccessLogs(
    block: CfnChannelLogConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelLogConfigurationPropertyDsl()
    builder.apply(block)
    return setIngressAccessLogs(builder.build())
}

/** Parameters for CDN authorization. */
public inline fun CfnOriginEndpoint.setAuthorization(
    block: CfnOriginEndpointAuthorizationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnOriginEndpointAuthorizationPropertyDsl()
    builder.apply(block)
    return setAuthorization(builder.build())
}

/** Parameters for Common Media Application Format (CMAF) packaging. */
public inline fun CfnOriginEndpoint.setCmafPackage(
    block: CfnOriginEndpointCmafPackagePropertyDsl.() -> Unit = {}
) {
    val builder = CfnOriginEndpointCmafPackagePropertyDsl()
    builder.apply(block)
    return setCmafPackage(builder.build())
}

/** Parameters for DASH packaging. */
public inline fun CfnOriginEndpoint.setDashPackage(
    block: CfnOriginEndpointDashPackagePropertyDsl.() -> Unit = {}
) {
    val builder = CfnOriginEndpointDashPackagePropertyDsl()
    builder.apply(block)
    return setDashPackage(builder.build())
}

/** Parameters for Apple HLS packaging. */
public inline fun CfnOriginEndpoint.setHlsPackage(
    block: CfnOriginEndpointHlsPackagePropertyDsl.() -> Unit = {}
) {
    val builder = CfnOriginEndpointHlsPackagePropertyDsl()
    builder.apply(block)
    return setHlsPackage(builder.build())
}

/** Parameters for Microsoft Smooth Streaming packaging. */
public inline fun CfnOriginEndpoint.setMssPackage(
    block: CfnOriginEndpointMssPackagePropertyDsl.() -> Unit = {}
) {
    val builder = CfnOriginEndpointMssPackagePropertyDsl()
    builder.apply(block)
    return setMssPackage(builder.build())
}

/** Parameters for CMAF packaging. */
public inline fun CfnPackagingConfiguration.setCmafPackage(
    block: CfnPackagingConfigurationCmafPackagePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPackagingConfigurationCmafPackagePropertyDsl()
    builder.apply(block)
    return setCmafPackage(builder.build())
}

/** Parameters for DASH-ISO packaging. */
public inline fun CfnPackagingConfiguration.setDashPackage(
    block: CfnPackagingConfigurationDashPackagePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPackagingConfigurationDashPackagePropertyDsl()
    builder.apply(block)
    return setDashPackage(builder.build())
}

/** Parameters for Apple HLS packaging. */
public inline fun CfnPackagingConfiguration.setHlsPackage(
    block: CfnPackagingConfigurationHlsPackagePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPackagingConfigurationHlsPackagePropertyDsl()
    builder.apply(block)
    return setHlsPackage(builder.build())
}

/** Parameters for Microsoft Smooth Streaming packaging. */
public inline fun CfnPackagingConfiguration.setMssPackage(
    block: CfnPackagingConfigurationMssPackagePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPackagingConfigurationMssPackagePropertyDsl()
    builder.apply(block)
    return setMssPackage(builder.build())
}

/** Parameters for CDN authorization. */
public inline fun CfnPackagingGroup.setAuthorization(
    block: CfnPackagingGroupAuthorizationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPackagingGroupAuthorizationPropertyDsl()
    builder.apply(block)
    return setAuthorization(builder.build())
}

/** The configuration parameters for egress access logging. */
public inline fun CfnPackagingGroup.setEgressAccessLogs(
    block: CfnPackagingGroupLogConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPackagingGroupLogConfigurationPropertyDsl()
    builder.apply(block)
    return setEgressAccessLogs(builder.build())
}
