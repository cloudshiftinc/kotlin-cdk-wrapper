@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisvideo

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisvideo.*;
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
public interface CfnStreamProps {
  /**
   * How long the stream retains data, in hours.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-dataretentioninhours)
   */
  public fun dataRetentionInHours(): Number? = unwrap(this).getDataRetentionInHours()

  /**
   * The name of the device that is associated with the stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-devicename)
   */
  public fun deviceName(): String? = unwrap(this).getDeviceName()

  /**
   * The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video Streams uses to
   * encrypt data on the stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The `MediaType` of the stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-mediatype)
   */
  public fun mediaType(): String? = unwrap(this).getMediaType()

  /**
   * The name of the stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataRetentionInHours How long the stream retains data, in hours.
     */
    public fun dataRetentionInHours(dataRetentionInHours: Number)

    /**
     * @param deviceName The name of the device that is associated with the stream.
     */
    public fun deviceName(deviceName: String)

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video
     * Streams uses to encrypt data on the stream.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param mediaType The `MediaType` of the stream.
     */
    public fun mediaType(mediaType: String)

    /**
     * @param name The name of the stream.
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisvideo.CfnStreamProps.Builder =
        software.amazon.awscdk.services.kinesisvideo.CfnStreamProps.builder()

    /**
     * @param dataRetentionInHours How long the stream retains data, in hours.
     */
    override fun dataRetentionInHours(dataRetentionInHours: Number) {
      cdkBuilder.dataRetentionInHours(dataRetentionInHours)
    }

    /**
     * @param deviceName The name of the device that is associated with the stream.
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video
     * Streams uses to encrypt data on the stream.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param mediaType The `MediaType` of the stream.
     */
    override fun mediaType(mediaType: String) {
      cdkBuilder.mediaType(mediaType)
    }

    /**
     * @param name The name of the stream.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisvideo.CfnStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnStreamProps,
  ) : CdkObject(cdkObject), CfnStreamProps {
    /**
     * How long the stream retains data, in hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-dataretentioninhours)
     */
    override fun dataRetentionInHours(): Number? = unwrap(this).getDataRetentionInHours()

    /**
     * The name of the device that is associated with the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-devicename)
     */
    override fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * The ID of the AWS Key Management Service ( AWS KMS ) key that Kinesis Video Streams uses to
     * encrypt data on the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The `MediaType` of the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-mediatype)
     */
    override fun mediaType(): String? = unwrap(this).getMediaType()

    /**
     * The name of the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html#cfn-kinesisvideo-stream-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnStreamProps):
        CfnStreamProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStreamProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamProps):
        software.amazon.awscdk.services.kinesisvideo.CfnStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisvideo.CfnStreamProps
  }
}
