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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnFleet
import software.amazon.awscdk.services.appstream.CfnFleetProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFleetPropsDsl {
    private val cdkBuilder: CfnFleetProps.Builder = CfnFleetProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _usbDeviceFilterStrings: MutableList<String> = mutableListOf()

    public fun computeCapacity(computeCapacity: IResolvable) {
        cdkBuilder.computeCapacity(computeCapacity)
    }

    public fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty) {
        cdkBuilder.computeCapacity(computeCapacity)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number) {
        cdkBuilder.disconnectTimeoutInSeconds(disconnectTimeoutInSeconds)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun domainJoinInfo(domainJoinInfo: IResolvable) {
        cdkBuilder.domainJoinInfo(domainJoinInfo)
    }

    public fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty) {
        cdkBuilder.domainJoinInfo(domainJoinInfo)
    }

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
        cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
        cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    public fun fleetType(fleetType: String) {
        cdkBuilder.fleetType(fleetType)
    }

    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    public fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number) {
        cdkBuilder.idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds)
    }

    public fun imageArn(imageArn: String) {
        cdkBuilder.imageArn(imageArn)
    }

    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun maxConcurrentSessions(maxConcurrentSessions: Number) {
        cdkBuilder.maxConcurrentSessions(maxConcurrentSessions)
    }

    public fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number) {
        cdkBuilder.maxUserDurationInSeconds(maxUserDurationInSeconds)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    public fun sessionScriptS3Location(sessionScriptS3Location: IResolvable) {
        cdkBuilder.sessionScriptS3Location(sessionScriptS3Location)
    }

    public fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty) {
        cdkBuilder.sessionScriptS3Location(sessionScriptS3Location)
    }

    public fun streamView(streamView: String) {
        cdkBuilder.streamView(streamView)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String) {
        _usbDeviceFilterStrings.addAll(listOf(*usbDeviceFilterStrings))
    }

    public fun usbDeviceFilterStrings(usbDeviceFilterStrings: Collection<String>) {
        _usbDeviceFilterStrings.addAll(usbDeviceFilterStrings)
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnFleetProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_usbDeviceFilterStrings.isNotEmpty()) {
            cdkBuilder.usbDeviceFilterStrings(_usbDeviceFilterStrings)
        }
        return cdkBuilder.build()
    }
}
