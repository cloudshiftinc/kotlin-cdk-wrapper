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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for the ad avail setup in the output.
 *
 * The parent of this entity is AvailConfiguration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AvailSettingsProperty availSettingsProperty = AvailSettingsProperty.builder()
 * .esam(EsamProperty.builder()
 * .acquisitionPointId("acquisitionPointId")
 * .adAvailOffset(123)
 * .passwordParam("passwordParam")
 * .poisEndpoint("poisEndpoint")
 * .username("username")
 * .zoneIdentity("zoneIdentity")
 * .build())
 * .scte35SpliceInsert(Scte35SpliceInsertProperty.builder()
 * .adAvailOffset(123)
 * .noRegionalBlackoutFlag("noRegionalBlackoutFlag")
 * .webDeliveryAllowedFlag("webDeliveryAllowedFlag")
 * .build())
 * .scte35TimeSignalApos(Scte35TimeSignalAposProperty.builder()
 * .adAvailOffset(123)
 * .noRegionalBlackoutFlag("noRegionalBlackoutFlag")
 * .webDeliveryAllowedFlag("webDeliveryAllowedFlag")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-availsettings.html)
 */
@CdkDslMarker
public class CfnChannelAvailSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AvailSettingsProperty.Builder =
        CfnChannel.AvailSettingsProperty.builder()

    /** @param esam the value to be set. */
    public fun esam(esam: IResolvable) {
        cdkBuilder.esam(esam)
    }

    /** @param esam the value to be set. */
    public fun esam(esam: CfnChannel.EsamProperty) {
        cdkBuilder.esam(esam)
    }

    /** @param scte35SpliceInsert The setup for SCTE-35 splice insert handling. */
    public fun scte35SpliceInsert(scte35SpliceInsert: IResolvable) {
        cdkBuilder.scte35SpliceInsert(scte35SpliceInsert)
    }

    /** @param scte35SpliceInsert The setup for SCTE-35 splice insert handling. */
    public fun scte35SpliceInsert(scte35SpliceInsert: CfnChannel.Scte35SpliceInsertProperty) {
        cdkBuilder.scte35SpliceInsert(scte35SpliceInsert)
    }

    /** @param scte35TimeSignalApos The setup for SCTE-35 time signal APOS handling. */
    public fun scte35TimeSignalApos(scte35TimeSignalApos: IResolvable) {
        cdkBuilder.scte35TimeSignalApos(scte35TimeSignalApos)
    }

    /** @param scte35TimeSignalApos The setup for SCTE-35 time signal APOS handling. */
    public fun scte35TimeSignalApos(scte35TimeSignalApos: CfnChannel.Scte35TimeSignalAposProperty) {
        cdkBuilder.scte35TimeSignalApos(scte35TimeSignalApos)
    }

    public fun build(): CfnChannel.AvailSettingsProperty = cdkBuilder.build()
}
