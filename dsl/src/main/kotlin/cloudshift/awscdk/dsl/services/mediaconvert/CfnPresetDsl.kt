@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnPreset
import software.constructs.Construct

@CdkDslMarker
public class CfnPresetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPreset.Builder = CfnPreset.Builder.create(scope, id)

  /**
   * The new category for the preset, if you are changing it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-category)
   * @param category The new category for the preset, if you are changing it. 
   */
  public fun category(category: String) {
    cdkBuilder.category(category)
  }

  /**
   * The new description for the preset, if you are changing it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-description)
   * @param description The new description for the preset, if you are changing it. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the preset that you are modifying.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-name)
   * @param name The name of the preset that you are modifying. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specify, in JSON format, the transcoding job settings for this output preset.
   *
   * This specification must conform to the AWS Elemental MediaConvert job validation. For
   * information about forming this specification, see the Remarks section later in this topic.
   *
   * For more information about MediaConvert output presets, see [Working with AWS Elemental
   * MediaConvert Output
   * Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html) in the ** .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-settingsjson)
   * @param settingsJson Specify, in JSON format, the transcoding job settings for this output
   * preset. 
   */
  public fun settingsJson(settingsJson: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(settingsJson)
    cdkBuilder.settingsJson(builder.map)
  }

  /**
   * Specify, in JSON format, the transcoding job settings for this output preset.
   *
   * This specification must conform to the AWS Elemental MediaConvert job validation. For
   * information about forming this specification, see the Remarks section later in this topic.
   *
   * For more information about MediaConvert output presets, see [Working with AWS Elemental
   * MediaConvert Output
   * Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html) in the ** .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-settingsjson)
   * @param settingsJson Specify, in JSON format, the transcoding job settings for this output
   * preset. 
   */
  public fun settingsJson(settingsJson: Any) {
    cdkBuilder.settingsJson(settingsJson)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnPreset = cdkBuilder.build()
}
