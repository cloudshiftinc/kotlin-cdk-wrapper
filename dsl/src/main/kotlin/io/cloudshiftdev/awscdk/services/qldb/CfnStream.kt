package io.cloudshiftdev.awscdk.services.qldb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStream internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.qldb.CfnStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the QLDB journal stream.
   *
   * For example: `arn:aws:qldb:us-east-1:123456789012:stream/exampleLedger/IiPT4brpZCqCq3f4MTHbYy`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique ID that QLDB assigns to each QLDB journal stream.
   *
   * For example: `IiPT4brpZCqCq3f4MTHbYy` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The exclusive date and time that specifies when the stream ends.
   */
  public open fun exclusiveEndTime(): String? = unwrap(this).getExclusiveEndTime()

  /**
   * The exclusive date and time that specifies when the stream ends.
   */
  public open fun exclusiveEndTime(`value`: String) {
    unwrap(this).setExclusiveEndTime(`value`)
  }

  /**
   * The inclusive start date and time from which to start streaming journal data.
   */
  public open fun inclusiveStartTime(): String = unwrap(this).getInclusiveStartTime()

  /**
   * The inclusive start date and time from which to start streaming journal data.
   */
  public open fun inclusiveStartTime(`value`: String) {
    unwrap(this).setInclusiveStartTime(`value`)
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
   * The configuration settings of the Kinesis Data Streams destination for your stream request.
   */
  public open fun kinesisConfiguration(): Any = unwrap(this).getKinesisConfiguration()

  /**
   * The configuration settings of the Kinesis Data Streams destination for your stream request.
   */
  public open fun kinesisConfiguration(`value`: IResolvable) {
    unwrap(this).setKinesisConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration settings of the Kinesis Data Streams destination for your stream request.
   */
  public open fun kinesisConfiguration(`value`: KinesisConfigurationProperty) {
    unwrap(this).setKinesisConfiguration(`value`.let(KinesisConfigurationProperty::unwrap))
  }

  /**
   * The configuration settings of the Kinesis Data Streams destination for your stream request.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08861cbd6bc608e967eb9c1f5fc67639c441789b62f572ddf864bec2691e5c0c")
  public open fun kinesisConfiguration(`value`: KinesisConfigurationProperty.Builder.() -> Unit):
      Unit = kinesisConfiguration(KinesisConfigurationProperty(`value`))

  /**
   * The name of the ledger.
   */
  public open fun ledgerName(): String = unwrap(this).getLedgerName()

  /**
   * The name of the ledger.
   */
  public open fun ledgerName(`value`: String) {
    unwrap(this).setLedgerName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal
   * stream to write data records to a Kinesis Data Streams resource.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal
   * stream to write data records to a Kinesis Data Streams resource.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The name that you want to assign to the QLDB journal stream.
   */
  public open fun streamName(): String = unwrap(this).getStreamName()

  /**
   * The name that you want to assign to the QLDB journal stream.
   */
  public open fun streamName(`value`: String) {
    unwrap(this).setStreamName(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qldb.CfnStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The exclusive date and time that specifies when the stream ends.
     *
     * If you don't define this parameter, the stream runs indefinitely until you cancel it.
     *
     * The `ExclusiveEndTime` must be in `ISO 8601` date and time format and in Universal
     * Coordinated Time (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-exclusiveendtime)
     * @param exclusiveEndTime The exclusive date and time that specifies when the stream ends. 
     */
    public fun exclusiveEndTime(exclusiveEndTime: String)

    /**
     * The inclusive start date and time from which to start streaming journal data.
     *
     * This parameter must be in `ISO 8601` date and time format and in Universal Coordinated Time
     * (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * The `InclusiveStartTime` cannot be in the future and must be before `ExclusiveEndTime` .
     *
     * If you provide an `InclusiveStartTime` that is before the ledger's `CreationDateTime` , QLDB
     * effectively defaults it to the ledger's `CreationDateTime` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-inclusivestarttime)
     * @param inclusiveStartTime The inclusive start date and time from which to start streaming
     * journal data. 
     */
    public fun inclusiveStartTime(inclusiveStartTime: String)

    /**
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-kinesisconfiguration)
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    public fun kinesisConfiguration(kinesisConfiguration: IResolvable)

    /**
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-kinesisconfiguration)
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    public fun kinesisConfiguration(kinesisConfiguration: KinesisConfigurationProperty)

    /**
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-kinesisconfiguration)
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6eb11e9ed469570ba3bc97103edbb5bf655976e20a4082a43e3f442faa9ecb7")
    public
        fun kinesisConfiguration(kinesisConfiguration: KinesisConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the ledger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-ledgername)
     * @param ledgerName The name of the ledger. 
     */
    public fun ledgerName(ledgerName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal
     * stream to write data records to a Kinesis Data Streams resource.
     *
     * To pass a role to QLDB when requesting a journal stream, you must have permissions to perform
     * the `iam:PassRole` action on the IAM role resource. This is required for all journal stream
     * requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions
     * for a journal stream to write data records to a Kinesis Data Streams resource. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The name that you want to assign to the QLDB journal stream.
     *
     * User-defined names can help identify and indicate the purpose of a stream.
     *
     * Your stream name must be unique among other *active* streams for a given ledger. Stream names
     * have the same naming constraints as ledger names, as defined in [Quotas in Amazon
     * QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming) in the
     * *Amazon QLDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-streamname)
     * @param streamName The name that you want to assign to the QLDB journal stream. 
     */
    public fun streamName(streamName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qldb.CfnStream.Builder =
        software.amazon.awscdk.services.qldb.CfnStream.Builder.create(scope, id)

    /**
     * The exclusive date and time that specifies when the stream ends.
     *
     * If you don't define this parameter, the stream runs indefinitely until you cancel it.
     *
     * The `ExclusiveEndTime` must be in `ISO 8601` date and time format and in Universal
     * Coordinated Time (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-exclusiveendtime)
     * @param exclusiveEndTime The exclusive date and time that specifies when the stream ends. 
     */
    override fun exclusiveEndTime(exclusiveEndTime: String) {
      cdkBuilder.exclusiveEndTime(exclusiveEndTime)
    }

    /**
     * The inclusive start date and time from which to start streaming journal data.
     *
     * This parameter must be in `ISO 8601` date and time format and in Universal Coordinated Time
     * (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * The `InclusiveStartTime` cannot be in the future and must be before `ExclusiveEndTime` .
     *
     * If you provide an `InclusiveStartTime` that is before the ledger's `CreationDateTime` , QLDB
     * effectively defaults it to the ledger's `CreationDateTime` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-inclusivestarttime)
     * @param inclusiveStartTime The inclusive start date and time from which to start streaming
     * journal data. 
     */
    override fun inclusiveStartTime(inclusiveStartTime: String) {
      cdkBuilder.inclusiveStartTime(inclusiveStartTime)
    }

    /**
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-kinesisconfiguration)
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    override fun kinesisConfiguration(kinesisConfiguration: IResolvable) {
      cdkBuilder.kinesisConfiguration(kinesisConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-kinesisconfiguration)
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    override fun kinesisConfiguration(kinesisConfiguration: KinesisConfigurationProperty) {
      cdkBuilder.kinesisConfiguration(kinesisConfiguration.let(KinesisConfigurationProperty::unwrap))
    }

    /**
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-kinesisconfiguration)
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6eb11e9ed469570ba3bc97103edbb5bf655976e20a4082a43e3f442faa9ecb7")
    override
        fun kinesisConfiguration(kinesisConfiguration: KinesisConfigurationProperty.Builder.() -> Unit):
        Unit = kinesisConfiguration(KinesisConfigurationProperty(kinesisConfiguration))

    /**
     * The name of the ledger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-ledgername)
     * @param ledgerName The name of the ledger. 
     */
    override fun ledgerName(ledgerName: String) {
      cdkBuilder.ledgerName(ledgerName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal
     * stream to write data records to a Kinesis Data Streams resource.
     *
     * To pass a role to QLDB when requesting a journal stream, you must have permissions to perform
     * the `iam:PassRole` action on the IAM role resource. This is required for all journal stream
     * requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions
     * for a journal stream to write data records to a Kinesis Data Streams resource. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The name that you want to assign to the QLDB journal stream.
     *
     * User-defined names can help identify and indicate the purpose of a stream.
     *
     * Your stream name must be unique among other *active* streams for a given ledger. Stream names
     * have the same naming constraints as ledger names, as defined in [Quotas in Amazon
     * QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming) in the
     * *Amazon QLDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-streamname)
     * @param streamName The name that you want to assign to the QLDB journal stream. 
     */
    override fun streamName(streamName: String) {
      cdkBuilder.streamName(streamName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.qldb.CfnStream = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnStream): CfnStream =
        CfnStream(cdkObject)

    internal fun unwrap(wrapped: CfnStream): software.amazon.awscdk.services.qldb.CfnStream =
        wrapped.cdkObject
  }

  public interface KinesisConfigurationProperty {
    /**
     * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record,
     * increasing the number of records sent per API call.
     *
     * Default: `True`
     *
     *
     * Record aggregation has important implications for processing records and requires
     * de-aggregation in your stream consumer. To learn more, see [KPL Key
     * Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html) and
     * [Consumer
     * De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
     * in the *Amazon Kinesis Data Streams Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qldb-stream-kinesisconfiguration.html#cfn-qldb-stream-kinesisconfiguration-aggregationenabled)
     */
    public fun aggregationEnabled(): Any? = unwrap(this).getAggregationEnabled()

    /**
     * The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qldb-stream-kinesisconfiguration.html#cfn-qldb-stream-kinesisconfiguration-streamarn)
     */
    public fun streamArn(): String? = unwrap(this).getStreamArn()

    /**
     * A builder for [KinesisConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregationEnabled Enables QLDB to publish multiple data records in a single Kinesis
       * Data Streams record, increasing the number of records sent per API call.
       * Default: `True`
       *
       *
       * Record aggregation has important implications for processing records and requires
       * de-aggregation in your stream consumer. To learn more, see [KPL Key
       * Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html) and
       * [Consumer
       * De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
       * in the *Amazon Kinesis Data Streams Developer Guide* .
       */
      public fun aggregationEnabled(aggregationEnabled: Boolean)

      /**
       * @param aggregationEnabled Enables QLDB to publish multiple data records in a single Kinesis
       * Data Streams record, increasing the number of records sent per API call.
       * Default: `True`
       *
       *
       * Record aggregation has important implications for processing records and requires
       * de-aggregation in your stream consumer. To learn more, see [KPL Key
       * Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html) and
       * [Consumer
       * De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
       * in the *Amazon Kinesis Data Streams Developer Guide* .
       */
      public fun aggregationEnabled(aggregationEnabled: IResolvable)

      /**
       * @param streamArn The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
       */
      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty.Builder =
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty.builder()

      /**
       * @param aggregationEnabled Enables QLDB to publish multiple data records in a single Kinesis
       * Data Streams record, increasing the number of records sent per API call.
       * Default: `True`
       *
       *
       * Record aggregation has important implications for processing records and requires
       * de-aggregation in your stream consumer. To learn more, see [KPL Key
       * Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html) and
       * [Consumer
       * De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
       * in the *Amazon Kinesis Data Streams Developer Guide* .
       */
      override fun aggregationEnabled(aggregationEnabled: Boolean) {
        cdkBuilder.aggregationEnabled(aggregationEnabled)
      }

      /**
       * @param aggregationEnabled Enables QLDB to publish multiple data records in a single Kinesis
       * Data Streams record, increasing the number of records sent per API call.
       * Default: `True`
       *
       *
       * Record aggregation has important implications for processing records and requires
       * de-aggregation in your stream consumer. To learn more, see [KPL Key
       * Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html) and
       * [Consumer
       * De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
       * in the *Amazon Kinesis Data Streams Developer Guide* .
       */
      override fun aggregationEnabled(aggregationEnabled: IResolvable) {
        cdkBuilder.aggregationEnabled(aggregationEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param streamArn The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
       */
      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty,
    ) : CdkObject(cdkObject), KinesisConfigurationProperty {
      /**
       * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record,
       * increasing the number of records sent per API call.
       *
       * Default: `True`
       *
       *
       * Record aggregation has important implications for processing records and requires
       * de-aggregation in your stream consumer. To learn more, see [KPL Key
       * Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html) and
       * [Consumer
       * De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
       * in the *Amazon Kinesis Data Streams Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qldb-stream-kinesisconfiguration.html#cfn-qldb-stream-kinesisconfiguration-aggregationenabled)
       */
      override fun aggregationEnabled(): Any? = unwrap(this).getAggregationEnabled()

      /**
       * The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qldb-stream-kinesisconfiguration.html#cfn-qldb-stream-kinesisconfiguration-streamarn)
       */
      override fun streamArn(): String? = unwrap(this).getStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty):
          KinesisConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisConfigurationProperty):
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty
    }
  }
}
