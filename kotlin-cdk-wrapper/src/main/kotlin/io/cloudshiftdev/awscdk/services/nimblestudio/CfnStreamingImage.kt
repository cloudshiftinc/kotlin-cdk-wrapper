@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
 * CfnStreamingImage cfnStreamingImage = CfnStreamingImage.Builder.create(this,
 * "MyCfnStreamingImage")
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
public open class CfnStreamingImage(
  cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamingImageProps,
  ) :
      this(software.amazon.awscdk.services.nimblestudio.CfnStreamingImage(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStreamingImageProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamingImageProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStreamingImageProps(props)
  )

  /**
   *
   */
  public open fun attrEncryptionConfiguration(): IResolvable =
      unwrap(this).getAttrEncryptionConfiguration().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrEncryptionConfigurationKeyArn(): String =
      unwrap(this).getAttrEncryptionConfigurationKeyArn()

  /**
   *
   */
  public open fun attrEncryptionConfigurationKeyType(): String =
      unwrap(this).getAttrEncryptionConfigurationKeyType()

  /**
   *
   */
  public open fun attrEulaIds(): List<String> = unwrap(this).getAttrEulaIds()

  /**
   *
   */
  public open fun attrOwner(): String = unwrap(this).getAttrOwner()

  /**
   *
   */
  public open fun attrPlatform(): String = unwrap(this).getAttrPlatform()

  /**
   *
   */
  public open fun attrStreamingImageId(): String = unwrap(this).getAttrStreamingImageId()

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun ec2ImageId(): String = unwrap(this).getEc2ImageId()

  /**
   *
   */
  public open fun ec2ImageId(`value`: String) {
    unwrap(this).setEc2ImageId(`value`)
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
   *
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun studioId(): String = unwrap(this).getStudioId()

  /**
   *
   */
  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.nimblestudio.CfnStreamingImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-ec2imageid)
     * @param ec2ImageId 
     */
    public fun ec2ImageId(ec2ImageId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-studioid)
     * @param studioId 
     */
    public fun studioId(studioId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-ec2imageid)
     * @param ec2ImageId 
     */
    override fun ec2ImageId(ec2ImageId: String) {
      cdkBuilder.ec2ImageId(ec2ImageId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-studioid)
     * @param studioId 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStreamingImage =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamingImage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamingImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage):
        CfnStreamingImage = CfnStreamingImage(cdkObject)

    internal fun unwrap(wrapped: CfnStreamingImage):
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImage = wrapped.cdkObject as
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImage
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * StreamingImageEncryptionConfigurationProperty streamingImageEncryptionConfigurationProperty =
   * StreamingImageEncryptionConfigurationProperty.builder()
   * .keyType("keyType")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html)
   */
  public interface StreamingImageEncryptionConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html#cfn-nimblestudio-streamingimage-streamingimageencryptionconfiguration-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html#cfn-nimblestudio-streamingimage-streamingimageencryptionconfiguration-keytype)
     */
    public fun keyType(): String

    /**
     * A builder for [StreamingImageEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyArn the value to be set.
       */
      public fun keyArn(keyArn: String)

      /**
       * @param keyType the value to be set. 
       */
      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.builder()

      /**
       * @param keyArn the value to be set.
       */
      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      /**
       * @param keyType the value to be set. 
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        StreamingImageEncryptionConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html#cfn-nimblestudio-streamingimage-streamingimageencryptionconfiguration-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html#cfn-nimblestudio-streamingimage-streamingimageencryptionconfiguration-keytype)
       */
      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamingImageEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty):
          StreamingImageEncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamingImageEncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingImageEncryptionConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
    }
  }
}
