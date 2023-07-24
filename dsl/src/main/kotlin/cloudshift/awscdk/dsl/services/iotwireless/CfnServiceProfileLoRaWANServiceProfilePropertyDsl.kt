@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * LoRaWANServiceProfile object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * LoRaWANServiceProfileProperty loRaWANServiceProfileProperty =
 * LoRaWANServiceProfileProperty.builder()
 * .addGwMetadata(false)
 * .channelMask("channelMask")
 * .devStatusReqFreq(123)
 * .dlBucketSize(123)
 * .dlRate(123)
 * .dlRatePolicy("dlRatePolicy")
 * .drMax(123)
 * .drMin(123)
 * .hrAllowed(false)
 * .minGwDiversity(123)
 * .nwkGeoLoc(false)
 * .prAllowed(false)
 * .raAllowed(false)
 * .reportDevStatusBattery(false)
 * .reportDevStatusMargin(false)
 * .targetPer(123)
 * .ulBucketSize(123)
 * .ulRate(123)
 * .ulRatePolicy("ulRatePolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html)
 */
@CdkDslMarker
public class CfnServiceProfileLoRaWANServiceProfilePropertyDsl {
    private val cdkBuilder: CfnServiceProfile.LoRaWANServiceProfileProperty.Builder =
        CfnServiceProfile.LoRaWANServiceProfileProperty.builder()

    /**
     * @param addGwMetadata The AddGWMetaData value.
     */
    public fun addGwMetadata(addGwMetadata: Boolean) {
        cdkBuilder.addGwMetadata(addGwMetadata)
    }

    /**
     * @param addGwMetadata The AddGWMetaData value.
     */
    public fun addGwMetadata(addGwMetadata: IResolvable) {
        cdkBuilder.addGwMetadata(addGwMetadata)
    }

    /**
     * @param channelMask The ChannelMask value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun channelMask(channelMask: String) {
        cdkBuilder.channelMask(channelMask)
    }

    /**
     * @param devStatusReqFreq The DevStatusReqFreq value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun devStatusReqFreq(devStatusReqFreq: Number) {
        cdkBuilder.devStatusReqFreq(devStatusReqFreq)
    }

    /**
     * @param dlBucketSize The DLBucketSize value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun dlBucketSize(dlBucketSize: Number) {
        cdkBuilder.dlBucketSize(dlBucketSize)
    }

    /**
     * @param dlRate The DLRate value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun dlRate(dlRate: Number) {
        cdkBuilder.dlRate(dlRate)
    }

    /**
     * @param dlRatePolicy The DLRatePolicy value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun dlRatePolicy(dlRatePolicy: String) {
        cdkBuilder.dlRatePolicy(dlRatePolicy)
    }

    /**
     * @param drMax The DRMax value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun drMax(drMax: Number) {
        cdkBuilder.drMax(drMax)
    }

    /**
     * @param drMin The DRMin value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun drMin(drMin: Number) {
        cdkBuilder.drMin(drMin)
    }

    /**
     * @param hrAllowed The HRAllowed value that describes whether handover roaming is allowed.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun hrAllowed(hrAllowed: Boolean) {
        cdkBuilder.hrAllowed(hrAllowed)
    }

    /**
     * @param hrAllowed The HRAllowed value that describes whether handover roaming is allowed.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun hrAllowed(hrAllowed: IResolvable) {
        cdkBuilder.hrAllowed(hrAllowed)
    }

    /**
     * @param minGwDiversity The MinGwDiversity value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun minGwDiversity(minGwDiversity: Number) {
        cdkBuilder.minGwDiversity(minGwDiversity)
    }

    /**
     * @param nwkGeoLoc The NwkGeoLoc value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun nwkGeoLoc(nwkGeoLoc: Boolean) {
        cdkBuilder.nwkGeoLoc(nwkGeoLoc)
    }

    /**
     * @param nwkGeoLoc The NwkGeoLoc value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun nwkGeoLoc(nwkGeoLoc: IResolvable) {
        cdkBuilder.nwkGeoLoc(nwkGeoLoc)
    }

    /**
     * @param prAllowed The PRAllowed value that describes whether passive roaming is allowed.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun prAllowed(prAllowed: Boolean) {
        cdkBuilder.prAllowed(prAllowed)
    }

    /**
     * @param prAllowed The PRAllowed value that describes whether passive roaming is allowed.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun prAllowed(prAllowed: IResolvable) {
        cdkBuilder.prAllowed(prAllowed)
    }

    /**
     * @param raAllowed The RAAllowed value that describes whether roaming activation is allowed.
     */
    public fun raAllowed(raAllowed: Boolean) {
        cdkBuilder.raAllowed(raAllowed)
    }

    /**
     * @param raAllowed The RAAllowed value that describes whether roaming activation is allowed.
     */
    public fun raAllowed(raAllowed: IResolvable) {
        cdkBuilder.raAllowed(raAllowed)
    }

    /**
     * @param reportDevStatusBattery The ReportDevStatusBattery value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun reportDevStatusBattery(reportDevStatusBattery: Boolean) {
        cdkBuilder.reportDevStatusBattery(reportDevStatusBattery)
    }

    /**
     * @param reportDevStatusBattery The ReportDevStatusBattery value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun reportDevStatusBattery(reportDevStatusBattery: IResolvable) {
        cdkBuilder.reportDevStatusBattery(reportDevStatusBattery)
    }

    /**
     * @param reportDevStatusMargin The ReportDevStatusMargin value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun reportDevStatusMargin(reportDevStatusMargin: Boolean) {
        cdkBuilder.reportDevStatusMargin(reportDevStatusMargin)
    }

    /**
     * @param reportDevStatusMargin The ReportDevStatusMargin value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun reportDevStatusMargin(reportDevStatusMargin: IResolvable) {
        cdkBuilder.reportDevStatusMargin(reportDevStatusMargin)
    }

    /**
     * @param targetPer The TargetPer value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun targetPer(targetPer: Number) {
        cdkBuilder.targetPer(targetPer)
    }

    /**
     * @param ulBucketSize The UlBucketSize value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun ulBucketSize(ulBucketSize: Number) {
        cdkBuilder.ulBucketSize(ulBucketSize)
    }

    /**
     * @param ulRate The ULRate value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun ulRate(ulRate: Number) {
        cdkBuilder.ulRate(ulRate)
    }

    /**
     * @param ulRatePolicy The ULRatePolicy value.
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     */
    public fun ulRatePolicy(ulRatePolicy: String) {
        cdkBuilder.ulRatePolicy(ulRatePolicy)
    }

    public fun build(): CfnServiceProfile.LoRaWANServiceProfileProperty = cdkBuilder.build()
}
