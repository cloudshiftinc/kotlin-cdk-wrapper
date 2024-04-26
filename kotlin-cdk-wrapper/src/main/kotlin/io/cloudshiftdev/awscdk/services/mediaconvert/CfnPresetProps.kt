@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPreset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconvert.*;
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
public interface CfnPresetProps {
  /**
   * The new category for the preset, if you are changing it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-category)
   */
  public fun category(): String? = unwrap(this).getCategory()

  /**
   * The new description for the preset, if you are changing it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the preset that you are modifying.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-name)
   */
  public fun name(): String? = unwrap(this).getName()

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
   */
  public fun settingsJson(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnPresetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param category The new category for the preset, if you are changing it.
     */
    public fun category(category: String)

    /**
     * @param description The new description for the preset, if you are changing it.
     */
    public fun description(description: String)

    /**
     * @param name The name of the preset that you are modifying.
     */
    public fun name(name: String)

    /**
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this output
     * preset. 
     * This specification must conform to the AWS Elemental MediaConvert job validation. For
     * information about forming this specification, see the Remarks section later in this topic.
     *
     * For more information about MediaConvert output presets, see [Working with AWS Elemental
     * MediaConvert Output
     * Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html) in the **
     * .
     */
    public fun settingsJson(settingsJson: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnPresetProps.Builder =
        software.amazon.awscdk.services.mediaconvert.CfnPresetProps.builder()

    /**
     * @param category The new category for the preset, if you are changing it.
     */
    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    /**
     * @param description The new description for the preset, if you are changing it.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the preset that you are modifying.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this output
     * preset. 
     * This specification must conform to the AWS Elemental MediaConvert job validation. For
     * information about forming this specification, see the Remarks section later in this topic.
     *
     * For more information about MediaConvert output presets, see [Working with AWS Elemental
     * MediaConvert Output
     * Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html) in the **
     * .
     */
    override fun settingsJson(settingsJson: Any) {
      cdkBuilder.settingsJson(settingsJson)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnPresetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediaconvert.CfnPresetProps,
  ) : CdkObject(cdkObject), CfnPresetProps {
    /**
     * The new category for the preset, if you are changing it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-category)
     */
    override fun category(): String? = unwrap(this).getCategory()

    /**
     * The new description for the preset, if you are changing it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the preset that you are modifying.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specify, in JSON format, the transcoding job settings for this output preset.
     *
     * This specification must conform to the AWS Elemental MediaConvert job validation. For
     * information about forming this specification, see the Remarks section later in this topic.
     *
     * For more information about MediaConvert output presets, see [Working with AWS Elemental
     * MediaConvert Output
     * Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html) in the **
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-settingsjson)
     */
    override fun settingsJson(): Any = unwrap(this).getSettingsJson()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPresetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnPresetProps):
        CfnPresetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPresetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPresetProps):
        software.amazon.awscdk.services.mediaconvert.CfnPresetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconvert.CfnPresetProps
  }
}
