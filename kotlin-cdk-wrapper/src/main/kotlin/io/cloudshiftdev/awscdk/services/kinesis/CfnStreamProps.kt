@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * CfnStreamProps cfnStreamProps = CfnStreamProps.builder()
 * .name("name")
 * .retentionPeriodHours(123)
 * .shardCount(123)
 * .streamEncryption(StreamEncryptionProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build())
 * .streamModeDetails(StreamModeDetailsProperty.builder()
 * .streamMode("streamMode")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html)
 */
public interface CfnStreamProps {
  /**
   * The name of the Kinesis stream.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the stream name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The number of hours for the data records that are stored in shards to remain accessible.
   *
   * The default value is 24. For more information about the stream retention period, see [Changing
   * the Data Retention
   * Period](https://docs.aws.amazon.com/streams/latest/dev/kinesis-extended-retention.html) in the
   * Amazon Kinesis Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours)
   */
  public fun retentionPeriodHours(): Number? = unwrap(this).getRetentionPeriodHours()

  /**
   * The number of shards that the stream uses.
   *
   * For greater provisioned throughput, increase the number of shards.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount)
   */
  public fun shardCount(): Number? = unwrap(this).getShardCount()

  /**
   * When specified, enables or updates server-side encryption using an AWS KMS key for a specified
   * stream.
   *
   * Removing this property from your stack template and updating your stack disables encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
   */
  public fun streamEncryption(): Any? = unwrap(this).getStreamEncryption()

  /**
   * Specifies the capacity mode to which you want to set your data stream.
   *
   * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
   * *provisioned* capacity mode for your data streams.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
   */
  public fun streamModeDetails(): Any? = unwrap(this).getStreamModeDetails()

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
   *
   * For information about constraints for this property, see [Tag
   * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions) in
   * the *Amazon Kinesis Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the Kinesis stream.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the stream name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun name(name: String)

    /**
     * @param retentionPeriodHours The number of hours for the data records that are stored in
     * shards to remain accessible.
     * The default value is 24. For more information about the stream retention period, see
     * [Changing the Data Retention
     * Period](https://docs.aws.amazon.com/streams/latest/dev/kinesis-extended-retention.html) in the
     * Amazon Kinesis Developer Guide.
     */
    public fun retentionPeriodHours(retentionPeriodHours: Number)

    /**
     * @param shardCount The number of shards that the stream uses.
     * For greater provisioned throughput, increase the number of shards.
     */
    public fun shardCount(shardCount: Number)

    /**
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream.
     * Removing this property from your stack template and updating your stack disables encryption.
     */
    public fun streamEncryption(streamEncryption: IResolvable)

    /**
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream.
     * Removing this property from your stack template and updating your stack disables encryption.
     */
    public fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty)

    /**
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream.
     * Removing this property from your stack template and updating your stack disables encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdf51d1415dc44e499dbae10cfe631ffec347afa7ada4864fc25cffc9e8ed3f5")
    public
        fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty.Builder.() -> Unit)

    /**
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    public fun streamModeDetails(streamModeDetails: IResolvable)

    /**
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    public fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty)

    /**
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e439b8711b2ef7f9de0737140b05bc0b62bb5c9b30ddd28fb06858f30d580d1a")
    public
        fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty.Builder.() -> Unit)

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder =
        software.amazon.awscdk.services.kinesis.CfnStreamProps.builder()

    /**
     * @param name The name of the Kinesis stream.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the stream name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param retentionPeriodHours The number of hours for the data records that are stored in
     * shards to remain accessible.
     * The default value is 24. For more information about the stream retention period, see
     * [Changing the Data Retention
     * Period](https://docs.aws.amazon.com/streams/latest/dev/kinesis-extended-retention.html) in the
     * Amazon Kinesis Developer Guide.
     */
    override fun retentionPeriodHours(retentionPeriodHours: Number) {
      cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    /**
     * @param shardCount The number of shards that the stream uses.
     * For greater provisioned throughput, increase the number of shards.
     */
    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    /**
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream.
     * Removing this property from your stack template and updating your stack disables encryption.
     */
    override fun streamEncryption(streamEncryption: IResolvable) {
      cdkBuilder.streamEncryption(streamEncryption.let(IResolvable::unwrap))
    }

    /**
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream.
     * Removing this property from your stack template and updating your stack disables encryption.
     */
    override fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty) {
      cdkBuilder.streamEncryption(streamEncryption.let(CfnStream.StreamEncryptionProperty::unwrap))
    }

    /**
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream.
     * Removing this property from your stack template and updating your stack disables encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdf51d1415dc44e499dbae10cfe631ffec347afa7ada4864fc25cffc9e8ed3f5")
    override
        fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty.Builder.() -> Unit):
        Unit = streamEncryption(CfnStream.StreamEncryptionProperty(streamEncryption))

    /**
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    override fun streamModeDetails(streamModeDetails: IResolvable) {
      cdkBuilder.streamModeDetails(streamModeDetails.let(IResolvable::unwrap))
    }

    /**
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    override fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty) {
      cdkBuilder.streamModeDetails(streamModeDetails.let(CfnStream.StreamModeDetailsProperty::unwrap))
    }

    /**
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e439b8711b2ef7f9de0737140b05bc0b62bb5c9b30ddd28fb06858f30d580d1a")
    override
        fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty.Builder.() -> Unit):
        Unit = streamModeDetails(CfnStream.StreamModeDetailsProperty(streamModeDetails))

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamProps,
  ) : CdkObject(cdkObject), CfnStreamProps {
    /**
     * The name of the Kinesis stream.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the stream name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     *
     * The default value is 24. For more information about the stream retention period, see
     * [Changing the Data Retention
     * Period](https://docs.aws.amazon.com/streams/latest/dev/kinesis-extended-retention.html) in the
     * Amazon Kinesis Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours)
     */
    override fun retentionPeriodHours(): Number? = unwrap(this).getRetentionPeriodHours()

    /**
     * The number of shards that the stream uses.
     *
     * For greater provisioned throughput, increase the number of shards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount)
     */
    override fun shardCount(): Number? = unwrap(this).getShardCount()

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     */
    override fun streamEncryption(): Any? = unwrap(this).getStreamEncryption()

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     */
    override fun streamModeDetails(): Any? = unwrap(this).getStreamModeDetails()

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     *
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamProps):
        CfnStreamProps = CdkObjectWrappers.wrap(cdkObject) as CfnStreamProps

    internal fun unwrap(wrapped: CfnStreamProps):
        software.amazon.awscdk.services.kinesis.CfnStreamProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesis.CfnStreamProps
  }
}
