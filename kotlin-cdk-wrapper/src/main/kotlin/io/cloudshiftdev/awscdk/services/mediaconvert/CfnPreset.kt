@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::MediaConvert::Preset resource is an AWS Elemental MediaConvert resource type that you
 * can use to specify encoding settings for a single output in a transcoding job.
 *
 * When you declare this entity in your AWS CloudFormation template, you pass in your transcoding
 * job settings in JSON or YAML format. This settings specification must be formed in a particular way
 * that conforms to AWS Elemental MediaConvert job validation. For more information about creating an
 * output preset model for the `SettingsJson` property, see the Remarks section later in this topic.
 *
 * For more information about output MediaConvert presets, see [Working with AWS Elemental
 * MediaConvert Output
 * Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html) in the ** .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconvert.*;
 * Object settingsJson;
 * Object tags;
 * CfnPreset cfnPreset = CfnPreset.Builder.create(this, "MyCfnPreset")
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
public open class CfnPreset(
  cdkObject: software.amazon.awscdk.services.mediaconvert.CfnPreset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPresetProps,
  ) :
      this(software.amazon.awscdk.services.mediaconvert.CfnPreset(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPresetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPresetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPresetProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the output preset, such as
   * `arn:aws:mediaconvert:us-west-2:123456789012` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the output preset, such as `HEVC high res` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The new category for the preset, if you are changing it.
   */
  public open fun category(): String? = unwrap(this).getCategory()

  /**
   * The new category for the preset, if you are changing it.
   */
  public open fun category(`value`: String) {
    unwrap(this).setCategory(`value`)
  }

  /**
   * The new description for the preset, if you are changing it.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The new description for the preset, if you are changing it.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the preset that you are modifying.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the preset that you are modifying.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specify, in JSON format, the transcoding job settings for this output preset.
   */
  public open fun settingsJson(): Any = unwrap(this).getSettingsJson()

  /**
   * Specify, in JSON format, the transcoding job settings for this output preset.
   */
  public open fun settingsJson(`value`: Any) {
    unwrap(this).setSettingsJson(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconvert.CfnPreset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The new category for the preset, if you are changing it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-category)
     * @param category The new category for the preset, if you are changing it. 
     */
    public fun category(category: String)

    /**
     * The new description for the preset, if you are changing it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-description)
     * @param description The new description for the preset, if you are changing it. 
     */
    public fun description(description: String)

    /**
     * The name of the preset that you are modifying.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-name)
     * @param name The name of the preset that you are modifying. 
     */
    public fun name(name: String)

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
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this output
     * preset. 
     */
    public fun settingsJson(settingsJson: Any)

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
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnPreset.Builder =
        software.amazon.awscdk.services.mediaconvert.CfnPreset.Builder.create(scope, id)

    /**
     * The new category for the preset, if you are changing it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-category)
     * @param category The new category for the preset, if you are changing it. 
     */
    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    /**
     * The new description for the preset, if you are changing it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-description)
     * @param description The new description for the preset, if you are changing it. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the preset that you are modifying.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-name)
     * @param name The name of the preset that you are modifying. 
     */
    override fun name(name: String) {
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
     * Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html) in the **
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html#cfn-mediaconvert-preset-settingsjson)
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this output
     * preset. 
     */
    override fun settingsJson(settingsJson: Any) {
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
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnPreset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconvert.CfnPreset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPreset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPreset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnPreset): CfnPreset
        = CfnPreset(cdkObject)

    internal fun unwrap(wrapped: CfnPreset): software.amazon.awscdk.services.mediaconvert.CfnPreset
        = wrapped.cdkObject as software.amazon.awscdk.services.mediaconvert.CfnPreset
  }
}
