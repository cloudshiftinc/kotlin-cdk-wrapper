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

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnServiceProfileLoRaWANServiceProfilePropertyDsl {
    private val cdkBuilder: CfnServiceProfile.LoRaWANServiceProfileProperty.Builder =
        CfnServiceProfile.LoRaWANServiceProfileProperty.builder()

    public fun addGwMetadata(addGwMetadata: Boolean) {
        cdkBuilder.addGwMetadata(addGwMetadata)
    }

    public fun addGwMetadata(addGwMetadata: IResolvable) {
        cdkBuilder.addGwMetadata(addGwMetadata)
    }

    public fun channelMask(channelMask: String) {
        cdkBuilder.channelMask(channelMask)
    }

    public fun devStatusReqFreq(devStatusReqFreq: Number) {
        cdkBuilder.devStatusReqFreq(devStatusReqFreq)
    }

    public fun dlBucketSize(dlBucketSize: Number) {
        cdkBuilder.dlBucketSize(dlBucketSize)
    }

    public fun dlRate(dlRate: Number) {
        cdkBuilder.dlRate(dlRate)
    }

    public fun dlRatePolicy(dlRatePolicy: String) {
        cdkBuilder.dlRatePolicy(dlRatePolicy)
    }

    public fun drMax(drMax: Number) {
        cdkBuilder.drMax(drMax)
    }

    public fun drMin(drMin: Number) {
        cdkBuilder.drMin(drMin)
    }

    public fun hrAllowed(hrAllowed: Boolean) {
        cdkBuilder.hrAllowed(hrAllowed)
    }

    public fun hrAllowed(hrAllowed: IResolvable) {
        cdkBuilder.hrAllowed(hrAllowed)
    }

    public fun minGwDiversity(minGwDiversity: Number) {
        cdkBuilder.minGwDiversity(minGwDiversity)
    }

    public fun nwkGeoLoc(nwkGeoLoc: Boolean) {
        cdkBuilder.nwkGeoLoc(nwkGeoLoc)
    }

    public fun nwkGeoLoc(nwkGeoLoc: IResolvable) {
        cdkBuilder.nwkGeoLoc(nwkGeoLoc)
    }

    public fun prAllowed(prAllowed: Boolean) {
        cdkBuilder.prAllowed(prAllowed)
    }

    public fun prAllowed(prAllowed: IResolvable) {
        cdkBuilder.prAllowed(prAllowed)
    }

    public fun raAllowed(raAllowed: Boolean) {
        cdkBuilder.raAllowed(raAllowed)
    }

    public fun raAllowed(raAllowed: IResolvable) {
        cdkBuilder.raAllowed(raAllowed)
    }

    public fun reportDevStatusBattery(reportDevStatusBattery: Boolean) {
        cdkBuilder.reportDevStatusBattery(reportDevStatusBattery)
    }

    public fun reportDevStatusBattery(reportDevStatusBattery: IResolvable) {
        cdkBuilder.reportDevStatusBattery(reportDevStatusBattery)
    }

    public fun reportDevStatusMargin(reportDevStatusMargin: Boolean) {
        cdkBuilder.reportDevStatusMargin(reportDevStatusMargin)
    }

    public fun reportDevStatusMargin(reportDevStatusMargin: IResolvable) {
        cdkBuilder.reportDevStatusMargin(reportDevStatusMargin)
    }

    public fun targetPer(targetPer: Number) {
        cdkBuilder.targetPer(targetPer)
    }

    public fun ulBucketSize(ulBucketSize: Number) {
        cdkBuilder.ulBucketSize(ulBucketSize)
    }

    public fun ulRate(ulRate: Number) {
        cdkBuilder.ulRate(ulRate)
    }

    public fun ulRatePolicy(ulRatePolicy: String) {
        cdkBuilder.ulRatePolicy(ulRatePolicy)
    }

    public fun build(): CfnServiceProfile.LoRaWANServiceProfileProperty = cdkBuilder.build()
}
