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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The setup of ad avail handling in the output.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AvailConfigurationProperty availConfigurationProperty = AvailConfigurationProperty.builder()
 * .availSettings(AvailSettingsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-availconfiguration.html)
 */
@CdkDslMarker
public class CfnChannelAvailConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.AvailConfigurationProperty.Builder =
        CfnChannel.AvailConfigurationProperty.builder()

    /** @param availSettings The setup of ad avail handling in the output. */
    public fun availSettings(availSettings: IResolvable) {
        cdkBuilder.availSettings(availSettings)
    }

    /** @param availSettings The setup of ad avail handling in the output. */
    public fun availSettings(availSettings: CfnChannel.AvailSettingsProperty) {
        cdkBuilder.availSettings(availSettings)
    }

    public fun build(): CfnChannel.AvailConfigurationProperty = cdkBuilder.build()
}
