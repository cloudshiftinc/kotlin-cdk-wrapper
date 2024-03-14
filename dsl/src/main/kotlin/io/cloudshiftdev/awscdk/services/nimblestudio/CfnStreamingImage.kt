package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStreamingImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * TODO</p>.
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
   * The list of IDs of EULAs that must be accepted before a streaming session can be started using
   * this streaming image.
   */
  public open fun attrEulaIds(): List<String> = unwrap(this).getAttrEulaIds()

  /**
   * The owner of the streaming image, either the studioId that contains the streaming image or
   * 'amazon' for images that are provided by  .
   */
  public open fun attrOwner(): String = unwrap(this).getAttrOwner()

  /**
   * The platform of the streaming image, either WINDOWS or LINUX.
   */
  public open fun attrPlatform(): String = unwrap(this).getAttrPlatform()

  /**
   * The unique identifier for the streaming image resource.
   */
  public open fun attrStreamingImageId(): String = unwrap(this).getAttrStreamingImageId()

  /**
   * A human-readable description of the streaming image.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A human-readable description of the streaming image.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of an EC2 machine image with which to create the streaming image.
   */
  public open fun ec2ImageId(): String = unwrap(this).getEc2ImageId()

  /**
   * The ID of an EC2 machine image with which to create the streaming image.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A friendly name for a streaming image resource.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name for a streaming image resource.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The unique identifier for a studio resource.
   */
  public open fun studioId(): String = unwrap(this).getStudioId()

  /**
   * The unique identifier for a studio resource.
   */
  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * An array of key-value pairs to apply to this resource.
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
     * A human-readable description of the streaming image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-description)
     * @param description A human-readable description of the streaming image. 
     */
    public fun description(description: String)

    /**
     * The ID of an EC2 machine image with which to create the streaming image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-ec2imageid)
     * @param ec2ImageId The ID of an EC2 machine image with which to create the streaming image. 
     */
    public fun ec2ImageId(ec2ImageId: String)

    /**
     * A friendly name for a streaming image resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-name)
     * @param name A friendly name for a streaming image resource. 
     */
    public fun name(name: String)

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio , all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-studioid)
     * @param studioId The unique identifier for a studio resource. 
     */
    public fun studioId(studioId: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
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
     * A human-readable description of the streaming image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-description)
     * @param description A human-readable description of the streaming image. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of an EC2 machine image with which to create the streaming image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-ec2imageid)
     * @param ec2ImageId The ID of an EC2 machine image with which to create the streaming image. 
     */
    override fun ec2ImageId(ec2ImageId: String) {
      cdkBuilder.ec2ImageId(ec2ImageId)
    }

    /**
     * A friendly name for a streaming image resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-name)
     * @param name A friendly name for a streaming image resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio , all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-studioid)
     * @param studioId The unique identifier for a studio resource. 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStreamingImage =
        cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImage = wrapped.cdkObject
  }

  public interface StreamingImageEncryptionConfigurationProperty {
    /**
     * The ARN for a KMS key that is used to encrypt studio data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html#cfn-nimblestudio-streamingimage-streamingimageencryptionconfiguration-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * The type of KMS key that is used to encrypt studio data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html#cfn-nimblestudio-streamingimage-streamingimageencryptionconfiguration-keytype)
     */
    public fun keyType(): String

    /**
     * A builder for [StreamingImageEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyArn The ARN for a KMS key that is used to encrypt studio data.
       */
      public fun keyArn(keyArn: String)

      /**
       * @param keyType The type of KMS key that is used to encrypt studio data. 
       */
      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.builder()

      /**
       * @param keyArn The ARN for a KMS key that is used to encrypt studio data.
       */
      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      /**
       * @param keyType The type of KMS key that is used to encrypt studio data. 
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), StreamingImageEncryptionConfigurationProperty {
      /**
       * The ARN for a KMS key that is used to encrypt studio data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html#cfn-nimblestudio-streamingimage-streamingimageencryptionconfiguration-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * The type of KMS key that is used to encrypt studio data.
       *
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
          StreamingImageEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingImageEncryptionConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
    }
  }
}