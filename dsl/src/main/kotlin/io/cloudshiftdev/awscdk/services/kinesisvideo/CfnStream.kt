package io.cloudshiftdev.awscdk.services.kinesisvideo

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStream internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the stream.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * How long the stream retains data, in hours.
   */
  public open fun dataRetentionInHours(): Number? = unwrap(this).getDataRetentionInHours()

  /**
   * How long the stream retains data, in hours.
   */
  public open fun dataRetentionInHours(`value`: Number) {
    unwrap(this).setDataRetentionInHours(`value`)
  }

  /**
   * The name of the device that is associated with the stream.
   */
  public open fun deviceName(): String? = unwrap(this).getDeviceName()

  /**
   * The name of the device that is associated with the stream.
   */
  public open fun deviceName(`value`: String) {
    unwrap(this).setDeviceName(`value`)
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
   * The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video Streams uses to
   * encrypt data on the stream.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video Streams uses to
   * encrypt data on the stream.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The `MediaType` of the stream.
   */
  public open fun mediaType(): String? = unwrap(this).getMediaType()

  /**
   * The `MediaType` of the stream.
   */
  public open fun mediaType(`value`: String) {
    unwrap(this).setMediaType(`value`)
  }

  /**
   * The name of the stream.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the stream.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisvideo.CfnStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * How long the stream retains data, in hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-dataretentioninhours)
     * @param dataRetentionInHours How long the stream retains data, in hours. 
     */
    public fun dataRetentionInHours(dataRetentionInHours: Number)

    /**
     * The name of the device that is associated with the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-devicename)
     * @param deviceName The name of the device that is associated with the stream. 
     */
    public fun deviceName(deviceName: String)

    /**
     * The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video Streams uses to
     * encrypt data on the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video
     * Streams uses to encrypt data on the stream. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The `MediaType` of the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-mediatype)
     * @param mediaType The `MediaType` of the stream. 
     */
    public fun mediaType(mediaType: String)

    /**
     * The name of the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-name)
     * @param name The name of the stream. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisvideo.CfnStream.Builder =
        software.amazon.awscdk.services.kinesisvideo.CfnStream.Builder.create(scope, id)

    /**
     * How long the stream retains data, in hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-dataretentioninhours)
     * @param dataRetentionInHours How long the stream retains data, in hours. 
     */
    override fun dataRetentionInHours(dataRetentionInHours: Number) {
      cdkBuilder.dataRetentionInHours(dataRetentionInHours)
    }

    /**
     * The name of the device that is associated with the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-devicename)
     * @param deviceName The name of the device that is associated with the stream. 
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video Streams uses to
     * encrypt data on the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video
     * Streams uses to encrypt data on the stream. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The `MediaType` of the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-mediatype)
     * @param mediaType The `MediaType` of the stream. 
     */
    override fun mediaType(mediaType: String) {
      cdkBuilder.mediaType(mediaType)
    }

    /**
     * The name of the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-name)
     * @param name The name of the stream. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisvideo.CfnStream = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisvideo.CfnStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnStream): CfnStream
        = CfnStream(cdkObject)

    internal fun unwrap(wrapped: CfnStream): software.amazon.awscdk.services.kinesisvideo.CfnStream
        = wrapped.cdkObject
  }
}
