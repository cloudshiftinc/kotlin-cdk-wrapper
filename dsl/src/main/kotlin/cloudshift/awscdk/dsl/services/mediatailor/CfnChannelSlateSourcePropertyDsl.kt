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

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnChannel

/**
 * Slate VOD source configuration.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * SlateSourceProperty slateSourceProperty = SlateSourceProperty.builder()
 * .sourceLocationName("sourceLocationName")
 * .vodSourceName("vodSourceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-slatesource.html)
 */
@CdkDslMarker
public class CfnChannelSlateSourcePropertyDsl {
    private val cdkBuilder: CfnChannel.SlateSourceProperty.Builder =
        CfnChannel.SlateSourceProperty.builder()

    /**
     * @param sourceLocationName The name of the source location where the slate VOD source is
     *   stored.</p>.
     */
    public fun sourceLocationName(sourceLocationName: String) {
        cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * @param vodSourceName The slate VOD source name. The VOD source must already exist in a source
     *   location before it can be used for slate.</p>
     */
    public fun vodSourceName(vodSourceName: String) {
        cdkBuilder.vodSourceName(vodSourceName)
    }

    public fun build(): CfnChannel.SlateSourceProperty = cdkBuilder.build()
}
