@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotanalytics

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
 * Object serviceManagedS3;
 * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
 * .channelName("channelName")
 * .channelStorage(ChannelStorageProperty.builder()
 * .customerManagedS3(CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .serviceManagedS3(serviceManagedS3)
 * .build())
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html)
 */
public interface CfnChannelProps {
  /**
   * The name of the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname)
   */
  public fun channelName(): String? = unwrap(this).getChannelName()

  /**
   * Where channel data is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
   */
  public fun channelStorage(): Any? = unwrap(this).getChannelStorage()

  /**
   * How long, in days, message data is kept for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
   */
  public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  /**
   * Metadata which can be used to manage the channel.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelName The name of the channel.
     */
    public fun channelName(channelName: String)

    /**
     * @param channelStorage Where channel data is stored.
     */
    public fun channelStorage(channelStorage: IResolvable)

    /**
     * @param channelStorage Where channel data is stored.
     */
    public fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty)

    /**
     * @param channelStorage Where channel data is stored.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bef286a5a68501cc4ba5cef2c5618cffc4851de1468746adb51f2f54c588de")
    public fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty.Builder.() -> Unit)

    /**
     * @param retentionPeriod How long, in days, message data is kept for the channel.
     */
    public fun retentionPeriod(retentionPeriod: IResolvable)

    /**
     * @param retentionPeriod How long, in days, message data is kept for the channel.
     */
    public fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty)

    /**
     * @param retentionPeriod How long, in days, message data is kept for the channel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36e2409666fd5d8c3f185c3ba82e16684880c9649b2f9096b07cf5f5eb1948f4")
    public
        fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata which can be used to manage the channel.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the channel.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnChannelProps.builder()

    /**
     * @param channelName The name of the channel.
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param channelStorage Where channel data is stored.
     */
    override fun channelStorage(channelStorage: IResolvable) {
      cdkBuilder.channelStorage(channelStorage.let(IResolvable::unwrap))
    }

    /**
     * @param channelStorage Where channel data is stored.
     */
    override fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty) {
      cdkBuilder.channelStorage(channelStorage.let(CfnChannel.ChannelStorageProperty::unwrap))
    }

    /**
     * @param channelStorage Where channel data is stored.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bef286a5a68501cc4ba5cef2c5618cffc4851de1468746adb51f2f54c588de")
    override
        fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty.Builder.() -> Unit):
        Unit = channelStorage(CfnChannel.ChannelStorageProperty(channelStorage))

    /**
     * @param retentionPeriod How long, in days, message data is kept for the channel.
     */
    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    /**
     * @param retentionPeriod How long, in days, message data is kept for the channel.
     */
    override fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(CfnChannel.RetentionPeriodProperty::unwrap))
    }

    /**
     * @param retentionPeriod How long, in days, message data is kept for the channel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36e2409666fd5d8c3f185c3ba82e16684880c9649b2f9096b07cf5f5eb1948f4")
    override
        fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty.Builder.() -> Unit):
        Unit = retentionPeriod(CfnChannel.RetentionPeriodProperty(retentionPeriod))

    /**
     * @param tags Metadata which can be used to manage the channel.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the channel.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname)
     */
    override fun channelName(): String? = unwrap(this).getChannelName()

    /**
     * Where channel data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
     */
    override fun channelStorage(): Any? = unwrap(this).getChannelStorage()

    /**
     * How long, in days, message data is kept for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
     */
    override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    /**
     * Metadata which can be used to manage the channel.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannelProps):
        CfnChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.iotanalytics.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotanalytics.CfnChannelProps
  }
}
