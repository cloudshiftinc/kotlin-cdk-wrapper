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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * A DVB Service Description Table (SDT).
 *
 * The parent of this entity is M2tsSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * DvbSdtSettingsProperty dvbSdtSettingsProperty = DvbSdtSettingsProperty.builder()
 * .outputSdt("outputSdt")
 * .repInterval(123)
 * .serviceName("serviceName")
 * .serviceProviderName("serviceProviderName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsdtsettings.html)
 */
@CdkDslMarker
public class CfnChannelDvbSdtSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DvbSdtSettingsProperty.Builder =
        CfnChannel.DvbSdtSettingsProperty.builder()

    /**
     * @param outputSdt Selects a method of inserting SDT information into an output stream. The
     *   sdtFollow setting copies SDT information from input stream to output stream. The
     *   sdtFollowIfPresent setting copies SDT information from input stream to output stream if SDT
     *   information is present in the input. Otherwise, it falls back on the user-defined values.
     *   The sdtManual setting means that the user will enter the SDT information. The sdtNone
     *   setting means that the output stream will not contain SDT information.
     */
    public fun outputSdt(outputSdt: String) {
        cdkBuilder.outputSdt(outputSdt)
    }

    /**
     * @param repInterval The number of milliseconds between instances of this table in the output
     *   transport stream.
     */
    public fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
    }

    /**
     * @param serviceName The service name placed in the serviceDescriptor in the Service
     *   Description Table (SDT). The maximum length is 256 characters.
     */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param serviceProviderName The service provider name placed in the serviceDescriptor in the
     *   Service Description Table (SDT). The maximum length is 256 characters.
     */
    public fun serviceProviderName(serviceProviderName: String) {
        cdkBuilder.serviceProviderName(serviceProviderName)
    }

    public fun build(): CfnChannel.DvbSdtSettingsProperty = cdkBuilder.build()
}
