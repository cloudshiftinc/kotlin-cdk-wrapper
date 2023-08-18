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

package io.cloudshiftdev.awscdkdsl.services.nimblestudio

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps

/**
 * Properties for defining a `CfnStreamingImage`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * CfnStreamingImageProps cfnStreamingImageProps = CfnStreamingImageProps.builder()
 * .ec2ImageId("ec2ImageId")
 * .name("name")
 * .studioId("studioId")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html)
 */
@CdkDslMarker
public class CfnStreamingImagePropsDsl {
    private val cdkBuilder: CfnStreamingImageProps.Builder = CfnStreamingImageProps.builder()

    /** @param description A human-readable description of the streaming image. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param ec2ImageId The ID of an EC2 machine image with which to create the streaming image.
     */
    public fun ec2ImageId(ec2ImageId: String) {
        cdkBuilder.ec2ImageId(ec2ImageId)
    }

    /** @param name A friendly name for a streaming image resource. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param studioId The unique identifier for a studio resource. In Nimble Studio , all other
     *   resources are contained in a studio resource.
     */
    public fun studioId(studioId: String) {
        cdkBuilder.studioId(studioId)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnStreamingImageProps = cdkBuilder.build()
}
