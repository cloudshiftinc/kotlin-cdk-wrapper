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

package cloudshift.awscdk.dsl.services.kinesisvideo

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.kinesisvideo.CfnStreamProps

/**
 * Properties for defining a `CfnStream`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisvideo.*;
 * CfnStreamProps cfnStreamProps = CfnStreamProps.builder()
 * .dataRetentionInHours(123)
 * .deviceName("deviceName")
 * .kmsKeyId("kmsKeyId")
 * .mediaType("mediaType")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html)
 */
@CdkDslMarker
public class CfnStreamPropsDsl {
    private val cdkBuilder: CfnStreamProps.Builder = CfnStreamProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param dataRetentionInHours How long the stream retains data, in hours. */
    public fun dataRetentionInHours(dataRetentionInHours: Number) {
        cdkBuilder.dataRetentionInHours(dataRetentionInHours)
    }

    /** @param deviceName The name of the device that is associated with the stream. */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video
     *   Streams uses to encrypt data on the stream.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param mediaType The `MediaType` of the stream. */
    public fun mediaType(mediaType: String) {
        cdkBuilder.mediaType(mediaType)
    }

    /** @param name The name of the stream. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStreamProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
