@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Kinesis stream that captures and transports data records that are emitted from data
 * sources.
 *
 * For information about creating streams, see
 * [CreateStream](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_CreateStream.html) in the
 * Amazon Kinesis API Reference.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * CfnStream cfnStream = CfnStream.Builder.create(this, "MyCfnStream")
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
public open class CfnStream(
  cdkObject: software.amazon.awscdk.services.kinesis.CfnStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.kinesis.CfnStream(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamProps,
  ) :
      this(software.amazon.awscdk.services.kinesis.CfnStream(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnStreamProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStreamProps(props)
  )

  /**
   * The Amazon resource name (ARN) of the Kinesis stream, such as
   * `arn:aws:kinesis:us-east-2:123456789012:stream/mystream` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the Kinesis stream.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the Kinesis stream.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The number of hours for the data records that are stored in shards to remain accessible.
   */
  public open fun retentionPeriodHours(): Number? = unwrap(this).getRetentionPeriodHours()

  /**
   * The number of hours for the data records that are stored in shards to remain accessible.
   */
  public open fun retentionPeriodHours(`value`: Number) {
    unwrap(this).setRetentionPeriodHours(`value`)
  }

  /**
   * The number of shards that the stream uses.
   */
  public open fun shardCount(): Number? = unwrap(this).getShardCount()

  /**
   * The number of shards that the stream uses.
   */
  public open fun shardCount(`value`: Number) {
    unwrap(this).setShardCount(`value`)
  }

  /**
   * When specified, enables or updates server-side encryption using an AWS KMS key for a specified
   * stream.
   */
  public open fun streamEncryption(): Any? = unwrap(this).getStreamEncryption()

  /**
   * When specified, enables or updates server-side encryption using an AWS KMS key for a specified
   * stream.
   */
  public open fun streamEncryption(`value`: IResolvable) {
    unwrap(this).setStreamEncryption(`value`.let(IResolvable::unwrap))
  }

  /**
   * When specified, enables or updates server-side encryption using an AWS KMS key for a specified
   * stream.
   */
  public open fun streamEncryption(`value`: StreamEncryptionProperty) {
    unwrap(this).setStreamEncryption(`value`.let(StreamEncryptionProperty::unwrap))
  }

  /**
   * When specified, enables or updates server-side encryption using an AWS KMS key for a specified
   * stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54f1667151efeab12661cd89c473fe61606299a374291b0b28b42608ef7b2a4d")
  public open fun streamEncryption(`value`: StreamEncryptionProperty.Builder.() -> Unit): Unit =
      streamEncryption(StreamEncryptionProperty(`value`))

  /**
   * Specifies the capacity mode to which you want to set your data stream.
   */
  public open fun streamModeDetails(): Any? = unwrap(this).getStreamModeDetails()

  /**
   * Specifies the capacity mode to which you want to set your data stream.
   */
  public open fun streamModeDetails(`value`: IResolvable) {
    unwrap(this).setStreamModeDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the capacity mode to which you want to set your data stream.
   */
  public open fun streamModeDetails(`value`: StreamModeDetailsProperty) {
    unwrap(this).setStreamModeDetails(`value`.let(StreamModeDetailsProperty::unwrap))
  }

  /**
   * Specifies the capacity mode to which you want to set your data stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("378fd36c3cd99313e05dd397ed480ede6103160f38b7c4109968393e32667b2d")
  public open fun streamModeDetails(`value`: StreamModeDetailsProperty.Builder.() -> Unit): Unit =
      streamModeDetails(StreamModeDetailsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesis.CfnStream].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param name The name of the Kinesis stream. 
     */
    public fun name(name: String)

    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     *
     * The default value is 24. For more information about the stream retention period, see
     * [Changing the Data Retention
     * Period](https://docs.aws.amazon.com/streams/latest/dev/kinesis-extended-retention.html) in the
     * Amazon Kinesis Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours)
     * @param retentionPeriodHours The number of hours for the data records that are stored in
     * shards to remain accessible. 
     */
    public fun retentionPeriodHours(retentionPeriodHours: Number)

    /**
     * The number of shards that the stream uses.
     *
     * For greater provisioned throughput, increase the number of shards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount)
     * @param shardCount The number of shards that the stream uses. 
     */
    public fun shardCount(shardCount: Number)

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream. 
     */
    public fun streamEncryption(streamEncryption: IResolvable)

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream. 
     */
    public fun streamEncryption(streamEncryption: StreamEncryptionProperty)

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13144c49d575e3934185ca810fda708916113c21ab18297ad3c3810ee15617ff")
    public fun streamEncryption(streamEncryption: StreamEncryptionProperty.Builder.() -> Unit)

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream. 
     */
    public fun streamModeDetails(streamModeDetails: IResolvable)

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream. 
     */
    public fun streamModeDetails(streamModeDetails: StreamModeDetailsProperty)

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c9ad7dc25f819c3732b2119e267de19d8b6b442bcabf2ab6ed2ae9a306d457")
    public fun streamModeDetails(streamModeDetails: StreamModeDetailsProperty.Builder.() -> Unit)

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     *
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     *
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnStream.Builder =
        software.amazon.awscdk.services.kinesis.CfnStream.Builder.create(scope, id)

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
     * @param name The name of the Kinesis stream. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     *
     * The default value is 24. For more information about the stream retention period, see
     * [Changing the Data Retention
     * Period](https://docs.aws.amazon.com/streams/latest/dev/kinesis-extended-retention.html) in the
     * Amazon Kinesis Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours)
     * @param retentionPeriodHours The number of hours for the data records that are stored in
     * shards to remain accessible. 
     */
    override fun retentionPeriodHours(retentionPeriodHours: Number) {
      cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    /**
     * The number of shards that the stream uses.
     *
     * For greater provisioned throughput, increase the number of shards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount)
     * @param shardCount The number of shards that the stream uses. 
     */
    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream. 
     */
    override fun streamEncryption(streamEncryption: IResolvable) {
      cdkBuilder.streamEncryption(streamEncryption.let(IResolvable::unwrap))
    }

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream. 
     */
    override fun streamEncryption(streamEncryption: StreamEncryptionProperty) {
      cdkBuilder.streamEncryption(streamEncryption.let(StreamEncryptionProperty::unwrap))
    }

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     * AWS KMS key for a specified stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13144c49d575e3934185ca810fda708916113c21ab18297ad3c3810ee15617ff")
    override fun streamEncryption(streamEncryption: StreamEncryptionProperty.Builder.() -> Unit):
        Unit = streamEncryption(StreamEncryptionProperty(streamEncryption))

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream. 
     */
    override fun streamModeDetails(streamModeDetails: IResolvable) {
      cdkBuilder.streamModeDetails(streamModeDetails.let(IResolvable::unwrap))
    }

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream. 
     */
    override fun streamModeDetails(streamModeDetails: StreamModeDetailsProperty) {
      cdkBuilder.streamModeDetails(streamModeDetails.let(StreamModeDetailsProperty::unwrap))
    }

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     * stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c9ad7dc25f819c3732b2119e267de19d8b6b442bcabf2ab6ed2ae9a306d457")
    override fun streamModeDetails(streamModeDetails: StreamModeDetailsProperty.Builder.() -> Unit):
        Unit = streamModeDetails(StreamModeDetailsProperty(streamModeDetails))

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     *
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     *
     * For information about constraints for this property, see [Tag
     * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStream = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesis.CfnStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStream): CfnStream =
        CfnStream(cdkObject)

    internal fun unwrap(wrapped: CfnStream): software.amazon.awscdk.services.kinesis.CfnStream =
        wrapped.cdkObject as software.amazon.awscdk.services.kinesis.CfnStream
  }

  /**
   * Enables or updates server-side encryption using an AWS KMS key for a specified stream.
   *
   *
   * When invoking this API, you must use either the `StreamARN` or the `StreamName` parameter, or
   * both. It is recommended that you use the `StreamARN` input parameter when you invoke this API.
   *
   *
   * Starting encryption is an asynchronous operation. Upon receiving the request, Kinesis Data
   * Streams returns immediately and sets the status of the stream to `UPDATING` . After the update is
   * complete, Kinesis Data Streams sets the status of the stream back to `ACTIVE` . Updating or
   * applying encryption normally takes a few seconds to complete, but it can take minutes. You can
   * continue to read and write data to your stream while its status is `UPDATING` . Once the status of
   * the stream is `ACTIVE` , encryption begins for records written to the stream.
   *
   * API Limits: You can successfully apply a new AWS KMS key for server-side encryption 25 times in
   * a rolling 24-hour period.
   *
   * Note: It can take up to 5 seconds after the stream is in an `ACTIVE` status before all records
   * written to the stream are encrypted. After you enable encryption, you can verify that encryption
   * is applied by inspecting the API response from `PutRecord` or `PutRecords` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesis.*;
   * StreamEncryptionProperty streamEncryptionProperty = StreamEncryptionProperty.builder()
   * .encryptionType("encryptionType")
   * .keyId("keyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html)
   */
  public interface StreamEncryptionProperty {
    /**
     * The encryption type to use.
     *
     * The only valid value is `KMS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-encryptiontype)
     */
    public fun encryptionType(): String

    /**
     * The GUID for the customer-managed AWS KMS key to use for encryption.
     *
     * This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN)
     * to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key
     * owned by Kinesis Data Streams by specifying the alias `aws/kinesis` .
     *
     * * Key ARN example:
     * `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012`
     * * Alias ARN example: `arn:aws:kms:us-east-1:123456789012:alias/MyAliasName`
     * * Globally unique key ID example: `12345678-1234-1234-1234-123456789012`
     * * Alias name example: `alias/MyAliasName`
     * * Master key owned by Kinesis Data Streams: `alias/aws/kinesis`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-keyid)
     */
    public fun keyId(): String

    /**
     * A builder for [StreamEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionType The encryption type to use. 
       * The only valid value is `KMS` .
       */
      public fun encryptionType(encryptionType: String)

      /**
       * @param keyId The GUID for the customer-managed AWS KMS key to use for encryption. 
       * This value can be a globally unique identifier, a fully specified Amazon Resource Name
       * (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a
       * master key owned by Kinesis Data Streams by specifying the alias `aws/kinesis` .
       *
       * * Key ARN example:
       * `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012`
       * * Alias ARN example: `arn:aws:kms:us-east-1:123456789012:alias/MyAliasName`
       * * Globally unique key ID example: `12345678-1234-1234-1234-123456789012`
       * * Alias name example: `alias/MyAliasName`
       * * Master key owned by Kinesis Data Streams: `alias/aws/kinesis`
       */
      public fun keyId(keyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder =
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.builder()

      /**
       * @param encryptionType The encryption type to use. 
       * The only valid value is `KMS` .
       */
      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      /**
       * @param keyId The GUID for the customer-managed AWS KMS key to use for encryption. 
       * This value can be a globally unique identifier, a fully specified Amazon Resource Name
       * (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a
       * master key owned by Kinesis Data Streams by specifying the alias `aws/kinesis` .
       *
       * * Key ARN example:
       * `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012`
       * * Alias ARN example: `arn:aws:kms:us-east-1:123456789012:alias/MyAliasName`
       * * Globally unique key ID example: `12345678-1234-1234-1234-123456789012`
       * * Alias name example: `alias/MyAliasName`
       * * Master key owned by Kinesis Data Streams: `alias/aws/kinesis`
       */
      override fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
      }

      public fun build(): software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty,
    ) : CdkObject(cdkObject), StreamEncryptionProperty {
      /**
       * The encryption type to use.
       *
       * The only valid value is `KMS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-encryptiontype)
       */
      override fun encryptionType(): String = unwrap(this).getEncryptionType()

      /**
       * The GUID for the customer-managed AWS KMS key to use for encryption.
       *
       * This value can be a globally unique identifier, a fully specified Amazon Resource Name
       * (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a
       * master key owned by Kinesis Data Streams by specifying the alias `aws/kinesis` .
       *
       * * Key ARN example:
       * `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012`
       * * Alias ARN example: `arn:aws:kms:us-east-1:123456789012:alias/MyAliasName`
       * * Globally unique key ID example: `12345678-1234-1234-1234-123456789012`
       * * Alias name example: `alias/MyAliasName`
       * * Master key owned by Kinesis Data Streams: `alias/aws/kinesis`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-keyid)
       */
      override fun keyId(): String = unwrap(this).getKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty):
          StreamEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? StreamEncryptionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamEncryptionProperty):
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty
    }
  }

  /**
   * Specifies the capacity mode to which you want to set your data stream.
   *
   * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
   * *provisioned* capacity mode for your data streams.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesis.*;
   * StreamModeDetailsProperty streamModeDetailsProperty = StreamModeDetailsProperty.builder()
   * .streamMode("streamMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streammodedetails.html)
   */
  public interface StreamModeDetailsProperty {
    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streammodedetails.html#cfn-kinesis-stream-streammodedetails-streammode)
     */
    public fun streamMode(): String

    /**
     * A builder for [StreamModeDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param streamMode Specifies the capacity mode to which you want to set your data stream. 
       * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and
       * a *provisioned* capacity mode for your data streams.
       */
      public fun streamMode(streamMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty.Builder =
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty.builder()

      /**
       * @param streamMode Specifies the capacity mode to which you want to set your data stream. 
       * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and
       * a *provisioned* capacity mode for your data streams.
       */
      override fun streamMode(streamMode: String) {
        cdkBuilder.streamMode(streamMode)
      }

      public fun build():
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty,
    ) : CdkObject(cdkObject), StreamModeDetailsProperty {
      /**
       * Specifies the capacity mode to which you want to set your data stream.
       *
       * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and
       * a *provisioned* capacity mode for your data streams.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streammodedetails.html#cfn-kinesis-stream-streammodedetails-streammode)
       */
      override fun streamMode(): String = unwrap(this).getStreamMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamModeDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty):
          StreamModeDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamModeDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamModeDetailsProperty):
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty
    }
  }
}
