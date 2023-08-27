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

package io.cloudshiftdev.awscdkdsl.services.ivs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

/**
 * The RenditionConfiguration property type describes which renditions should be recorded for a
 * stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivs.*;
 * RenditionConfigurationProperty renditionConfigurationProperty =
 * RenditionConfigurationProperty.builder()
 * .renditions(List.of("renditions"))
 * .renditionSelection("renditionSelection")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-renditionconfiguration.html)
 */
@CdkDslMarker
public class CfnRecordingConfigurationRenditionConfigurationPropertyDsl {
    private val cdkBuilder: CfnRecordingConfiguration.RenditionConfigurationProperty.Builder =
        CfnRecordingConfiguration.RenditionConfigurationProperty.builder()

    private val _renditions: MutableList<String> = mutableListOf()

    /**
     * @param renditionSelection The set of renditions are recorded for a stream. For `BASIC`
     *   channels, the `CUSTOM` value has no effect. If `CUSTOM` is specified, a set of renditions
     *   can be specified in the `renditions` field. Default: `ALL` .
     */
    public fun renditionSelection(renditionSelection: String) {
        cdkBuilder.renditionSelection(renditionSelection)
    }

    /**
     * @param renditions A list of which renditions are recorded for a stream, if
     *   `renditionSelection` is `CUSTOM` ;. otherwise, this field is irrelevant. The selected
     *   renditions are recorded if they are available during the stream. If a selected rendition is
     *   unavailable, the best available rendition is recorded. For details on the resolution
     *   dimensions of each rendition, see
     *   [Auto-Record to Amazon S3](https://docs.aws.amazon.com//ivs/latest/userguide/record-to-s3.html)
     *   .
     */
    public fun renditions(vararg renditions: String) {
        _renditions.addAll(listOf(*renditions))
    }

    /**
     * @param renditions A list of which renditions are recorded for a stream, if
     *   `renditionSelection` is `CUSTOM` ;. otherwise, this field is irrelevant. The selected
     *   renditions are recorded if they are available during the stream. If a selected rendition is
     *   unavailable, the best available rendition is recorded. For details on the resolution
     *   dimensions of each rendition, see
     *   [Auto-Record to Amazon S3](https://docs.aws.amazon.com//ivs/latest/userguide/record-to-s3.html)
     *   .
     */
    public fun renditions(renditions: Collection<String>) {
        _renditions.addAll(renditions)
    }

    public fun build(): CfnRecordingConfiguration.RenditionConfigurationProperty {
        if (_renditions.isNotEmpty()) cdkBuilder.renditions(_renditions)
        return cdkBuilder.build()
    }
}
