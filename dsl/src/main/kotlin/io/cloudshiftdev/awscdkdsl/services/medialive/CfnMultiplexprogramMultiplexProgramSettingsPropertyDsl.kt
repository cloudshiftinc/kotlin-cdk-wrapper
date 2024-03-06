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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram

/**
 * Multiplex Program settings configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexProgramSettingsProperty multiplexProgramSettingsProperty =
 * MultiplexProgramSettingsProperty.builder()
 * .programNumber(123)
 * // the properties below are optional
 * .preferredChannelPipeline("preferredChannelPipeline")
 * .serviceDescriptor(MultiplexProgramServiceDescriptorProperty.builder()
 * .providerName("providerName")
 * .serviceName("serviceName")
 * .build())
 * .videoSettings(MultiplexVideoSettingsProperty.builder()
 * .constantBitrate(123)
 * .statmuxSettings(MultiplexStatmuxVideoSettingsProperty.builder()
 * .maximumBitrate(123)
 * .minimumBitrate(123)
 * .priority(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html)
 */
@CdkDslMarker
public class CfnMultiplexprogramMultiplexProgramSettingsPropertyDsl {
    private val cdkBuilder: CfnMultiplexprogram.MultiplexProgramSettingsProperty.Builder =
        CfnMultiplexprogram.MultiplexProgramSettingsProperty.builder()

    /**
     * @param preferredChannelPipeline Indicates which pipeline is preferred by the multiplex for
     *   program ingest.
     */
    public fun preferredChannelPipeline(preferredChannelPipeline: String) {
        cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
    }

    /** @param programNumber Unique program number. */
    public fun programNumber(programNumber: Number) {
        cdkBuilder.programNumber(programNumber)
    }

    /**
     * @param serviceDescriptor Transport stream service descriptor configuration for the Multiplex
     *   program.
     */
    public fun serviceDescriptor(serviceDescriptor: IResolvable) {
        cdkBuilder.serviceDescriptor(serviceDescriptor)
    }

    /**
     * @param serviceDescriptor Transport stream service descriptor configuration for the Multiplex
     *   program.
     */
    public fun serviceDescriptor(
        serviceDescriptor: CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty
    ) {
        cdkBuilder.serviceDescriptor(serviceDescriptor)
    }

    /** @param videoSettings Program video settings configuration. */
    public fun videoSettings(videoSettings: IResolvable) {
        cdkBuilder.videoSettings(videoSettings)
    }

    /** @param videoSettings Program video settings configuration. */
    public fun videoSettings(videoSettings: CfnMultiplexprogram.MultiplexVideoSettingsProperty) {
        cdkBuilder.videoSettings(videoSettings)
    }

    public fun build(): CfnMultiplexprogram.MultiplexProgramSettingsProperty = cdkBuilder.build()
}
