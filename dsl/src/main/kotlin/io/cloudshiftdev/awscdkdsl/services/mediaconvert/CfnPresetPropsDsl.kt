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

package io.cloudshiftdev.awscdkdsl.services.mediaconvert

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnPresetProps

/**
 * Properties for defining a `CfnPreset`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconvert.*;
 * Object settingsJson;
 * Object tags;
 * CfnPresetProps cfnPresetProps = CfnPresetProps.builder()
 * .settingsJson(settingsJson)
 * // the properties below are optional
 * .category("category")
 * .description("description")
 * .name("name")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html)
 */
@CdkDslMarker
public class CfnPresetPropsDsl {
    private val cdkBuilder: CfnPresetProps.Builder = CfnPresetProps.builder()

    /** @param category The new category for the preset, if you are changing it. */
    public fun category(category: String) {
        cdkBuilder.category(category)
    }

    /** @param description The new description for the preset, if you are changing it. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the preset that you are modifying. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this output
     *   preset. This specification must conform to the AWS Elemental MediaConvert job validation.
     *   For information about forming this specification, see the Remarks section later in this
     *   topic.
     *
     * For more information about MediaConvert output presets, see
     * [Working with AWS Elemental MediaConvert Output Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html)
     * in the ** .
     */
    public fun settingsJson(settingsJson: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(settingsJson)
        cdkBuilder.settingsJson(builder.map)
    }

    /**
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this output
     *   preset. This specification must conform to the AWS Elemental MediaConvert job validation.
     *   For information about forming this specification, see the Remarks section later in this
     *   topic.
     *
     * For more information about MediaConvert output presets, see
     * [Working with AWS Elemental MediaConvert Output Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html)
     * in the ** .
     */
    public fun settingsJson(settingsJson: Any) {
        cdkBuilder.settingsJson(settingsJson)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnPresetProps = cdkBuilder.build()
}
