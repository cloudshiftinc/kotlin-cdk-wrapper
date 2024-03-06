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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * ColorCorrectionSettingsProperty colorCorrectionSettingsProperty =
 * ColorCorrectionSettingsProperty.builder()
 * .globalColorCorrections(List.of(ColorCorrectionProperty.builder()
 * .inputColorSpace("inputColorSpace")
 * .outputColorSpace("outputColorSpace")
 * .uri("uri")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-colorcorrectionsettings.html)
 */
@CdkDslMarker
public class CfnChannelColorCorrectionSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ColorCorrectionSettingsProperty.Builder =
        CfnChannel.ColorCorrectionSettingsProperty.builder()

    private val _globalColorCorrections: MutableList<Any> = mutableListOf()

    /** @param globalColorCorrections the value to be set. */
    public fun globalColorCorrections(vararg globalColorCorrections: Any) {
        _globalColorCorrections.addAll(listOf(*globalColorCorrections))
    }

    /** @param globalColorCorrections the value to be set. */
    public fun globalColorCorrections(globalColorCorrections: Collection<Any>) {
        _globalColorCorrections.addAll(globalColorCorrections)
    }

    /** @param globalColorCorrections the value to be set. */
    public fun globalColorCorrections(globalColorCorrections: IResolvable) {
        cdkBuilder.globalColorCorrections(globalColorCorrections)
    }

    public fun build(): CfnChannel.ColorCorrectionSettingsProperty {
        if (_globalColorCorrections.isNotEmpty())
            cdkBuilder.globalColorCorrections(_globalColorCorrections)
        return cdkBuilder.build()
    }
}
