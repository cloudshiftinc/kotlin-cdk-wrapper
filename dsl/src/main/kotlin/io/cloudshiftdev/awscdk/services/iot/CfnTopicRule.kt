package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTopicRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ruleName(): String? = unwrap(this).getRuleName()

  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun topicRulePayload(): Any = unwrap(this).getTopicRulePayload()

  public open fun topicRulePayload(`value`: IResolvable) {
    unwrap(this).setTopicRulePayload(`value`.let(IResolvable::unwrap))
  }

  public open fun topicRulePayload(`value`: TopicRulePayloadProperty) {
    unwrap(this).setTopicRulePayload(`value`.let(TopicRulePayloadProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc4cd64f48f8d034f0017e45c5bdf05dfa22a293616bbd9ae8dcd77818bf7c62")
  public open fun topicRulePayload(`value`: TopicRulePayloadProperty.Builder.() -> Unit): Unit =
      topicRulePayload(TopicRulePayloadProperty(`value`))

  public interface Builder {
    public fun ruleName(ruleName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun topicRulePayload(topicRulePayload: IResolvable) {
    }

    public fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc3ff15a9ef1552dc17aebf5e85e502e2b37ca8a82238895047768f6b136511")
    public fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRule.Builder =
        software.amazon.awscdk.services.iot.CfnTopicRule.Builder.create(scope, id)

    public override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun topicRulePayload(topicRulePayload: IResolvable) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(IResolvable::unwrap))
    }

    public override fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(TopicRulePayloadProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc3ff15a9ef1552dc17aebf5e85e502e2b37ca8a82238895047768f6b136511")
    public override
        fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty.Builder.() -> Unit): Unit =
        topicRulePayload(TopicRulePayloadProperty(topicRulePayload))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopicRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopicRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule): CfnTopicRule =
        CfnTopicRule(cdkObject)

    internal fun unwrap(wrapped: CfnTopicRule): software.amazon.awscdk.services.iot.CfnTopicRule =
        wrapped.cdkObject
  }

  public interface TimestreamDimensionProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty,
    ) : TimestreamDimensionProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty):
          TimestreamDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamDimensionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KafkaActionHeaderProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty,
    ) : KafkaActionHeaderProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaActionHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty):
          KafkaActionHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaActionHeaderProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun cloudwatchAlarm(): Any? = unwrap(this).getCloudwatchAlarm()

    public fun cloudwatchLogs(): Any? = unwrap(this).getCloudwatchLogs()

    public fun cloudwatchMetric(): Any? = unwrap(this).getCloudwatchMetric()

    public fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

    public fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

    public fun elasticsearch(): Any? = unwrap(this).getElasticsearch()

    public fun firehose(): Any? = unwrap(this).getFirehose()

    public fun http(): Any? = unwrap(this).getHttp()

    public fun iotAnalytics(): Any? = unwrap(this).getIotAnalytics()

    public fun iotEvents(): Any? = unwrap(this).getIotEvents()

    public fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

    public fun kafka(): Any? = unwrap(this).getKafka()

    public fun kinesis(): Any? = unwrap(this).getKinesis()

    public fun lambda(): Any? = unwrap(this).getLambda()

    public fun location(): Any? = unwrap(this).getLocation()

    public fun openSearch(): Any? = unwrap(this).getOpenSearch()

    public fun republish(): Any? = unwrap(this).getRepublish()

    public fun s3(): Any? = unwrap(this).getS3()

    public fun sns(): Any? = unwrap(this).getSns()

    public fun sqs(): Any? = unwrap(this).getSqs()

    public fun stepFunctions(): Any? = unwrap(this).getStepFunctions()

    public fun timestream(): Any? = unwrap(this).getTimestream()

    public interface Builder {
      public fun cloudwatchAlarm(cloudwatchAlarm: IResolvable) {
      }

      public fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e592d3b9ec58e1e6a0c9604f03fce76e7192a5c832a56e0e896e5aeb025c5136")
      public
          fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty.Builder.() -> Unit) {
      }

      public fun cloudwatchLogs(cloudwatchLogs: IResolvable) {
      }

      public fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37203c2772fa460a8ea92b7903e38c1647bc9fcbe895603b7eb3a2a0c43dfa79")
      public fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty.Builder.() -> Unit) {
      }

      public fun cloudwatchMetric(cloudwatchMetric: IResolvable) {
      }

      public fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7cfa986986a53792b0900a5171b0568c06d1edd655a035e2f19aad202470c2a")
      public
          fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty.Builder.() -> Unit) {
      }

      public fun dynamoDBv2(dynamoDBv2: IResolvable) {
      }

      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59e5c496cd867f4091324ec238030b2fb9ec9fc654ed368a653fc003d437c9a5")
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty.Builder.() -> Unit) {
      }

      public fun dynamoDb(dynamoDb: IResolvable) {
      }

      public fun dynamoDb(dynamoDb: DynamoDBActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be34cb6b6922328cc7edc8d1c4eebff91fc9f9fd2b7cb01f0f79d390cc9ce5")
      public fun dynamoDb(dynamoDb: DynamoDBActionProperty.Builder.() -> Unit) {
      }

      public fun elasticsearch(elasticsearch: IResolvable) {
      }

      public fun elasticsearch(elasticsearch: ElasticsearchActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa7cc1ae368a49a852adba0360258b23811f6fedded9a3d4748262f4eb4bfd3f")
      public fun elasticsearch(elasticsearch: ElasticsearchActionProperty.Builder.() -> Unit) {
      }

      public fun firehose(firehose: IResolvable) {
      }

      public fun firehose(firehose: FirehoseActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf0e7fd3ce39622fd99c5ea349382388654df4b23aa29717914502b8f97096c5")
      public fun firehose(firehose: FirehoseActionProperty.Builder.() -> Unit) {
      }

      public fun http(http: IResolvable) {
      }

      public fun http(http: HttpActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd0498a7b686ba06564c740ce89e23f940a59ace7c38c049d76591918aadf43")
      public fun http(http: HttpActionProperty.Builder.() -> Unit) {
      }

      public fun iotAnalytics(iotAnalytics: IResolvable) {
      }

      public fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457c63ef720d0825a43120a82e6d8743fa21e8392302a073ddf53384a50201f7")
      public fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty.Builder.() -> Unit) {
      }

      public fun iotEvents(iotEvents: IResolvable) {
      }

      public fun iotEvents(iotEvents: IotEventsActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a42cc3ccec03511269f99cb9dc4b2de9d9669b9ca612f5d231c217cdc01d770")
      public fun iotEvents(iotEvents: IotEventsActionProperty.Builder.() -> Unit) {
      }

      public fun iotSiteWise(iotSiteWise: IResolvable) {
      }

      public fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c67675f0ded26c01b390afff37e4fbbe386d71d0bc05069dfe0909718ff796b")
      public fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty.Builder.() -> Unit) {
      }

      public fun kafka(kafka: IResolvable) {
      }

      public fun kafka(kafka: KafkaActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bd0041398399948a6a91cc4beb5c27a2b10c383f2ccc058316107110812a17")
      public fun kafka(kafka: KafkaActionProperty.Builder.() -> Unit) {
      }

      public fun kinesis(kinesis: IResolvable) {
      }

      public fun kinesis(kinesis: KinesisActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7829c2788742161736c7f4f276d2c9ca4a8eb7adc4f0983c9b15a000b1af250e")
      public fun kinesis(kinesis: KinesisActionProperty.Builder.() -> Unit) {
      }

      public fun lambda(lambda: IResolvable) {
      }

      public fun lambda(lambda: LambdaActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cb07553eb70f94d4d0741a88ca3bf21fbdb63c177f55b6d47112f90ea9de592")
      public fun lambda(lambda: LambdaActionProperty.Builder.() -> Unit) {
      }

      public fun location(location: IResolvable) {
      }

      public fun location(location: LocationActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40860c30d9f2428b1ebab0ef4f21b8fc9a5b0ad8ed070f880cc170ac5e542dcc")
      public fun location(location: LocationActionProperty.Builder.() -> Unit) {
      }

      public fun openSearch(openSearch: IResolvable) {
      }

      public fun openSearch(openSearch: OpenSearchActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff32f288dfb924554d6db1aacfcaa2e6b841f8bceae2eb25250c046ba5a2bcd0")
      public fun openSearch(openSearch: OpenSearchActionProperty.Builder.() -> Unit) {
      }

      public fun republish(republish: IResolvable) {
      }

      public fun republish(republish: RepublishActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cff4c9f4f165e6ebf8a1d92707200697b7936100cf640c266bfed5c64224cbc7")
      public fun republish(republish: RepublishActionProperty.Builder.() -> Unit) {
      }

      public fun s3(s3: IResolvable) {
      }

      public fun s3(s3: S3ActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070c5e2e998b45e02dc2bc514fafd0dce57030732a785f0655bf84f88530e751")
      public fun s3(s3: S3ActionProperty.Builder.() -> Unit) {
      }

      public fun sns(sns: IResolvable) {
      }

      public fun sns(sns: SnsActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e336860db8f9171bd843c395083b15e06f348ab6ee03e7aadbb37d2b1f5c7c50")
      public fun sns(sns: SnsActionProperty.Builder.() -> Unit) {
      }

      public fun sqs(sqs: IResolvable) {
      }

      public fun sqs(sqs: SqsActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57ea076cdbbf86399719493cb0eaff62871072cc1f057effda768eae4871d465")
      public fun sqs(sqs: SqsActionProperty.Builder.() -> Unit) {
      }

      public fun stepFunctions(stepFunctions: IResolvable) {
      }

      public fun stepFunctions(stepFunctions: StepFunctionsActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661d098ed0c8cb1e4cc86437072deacf3e3c1f01ef261b1d6f2b9cab7d110c3a")
      public fun stepFunctions(stepFunctions: StepFunctionsActionProperty.Builder.() -> Unit) {
      }

      public fun timestream(timestream: IResolvable) {
      }

      public fun timestream(timestream: TimestreamActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4706a162d3bb7a739fa4cf959252e7009c2f91e0d18e6ea13b7c4f1d153f8a83")
      public fun timestream(timestream: TimestreamActionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.builder()

      public override fun cloudwatchAlarm(cloudwatchAlarm: IResolvable) {
        cdkBuilder.cloudwatchAlarm(cloudwatchAlarm.let(IResolvable::unwrap))
      }

      public override fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty) {
        cdkBuilder.cloudwatchAlarm(cloudwatchAlarm.let(CloudwatchAlarmActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e592d3b9ec58e1e6a0c9604f03fce76e7192a5c832a56e0e896e5aeb025c5136")
      public override
          fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty.Builder.() -> Unit):
          Unit = cloudwatchAlarm(CloudwatchAlarmActionProperty(cloudwatchAlarm))

      public override fun cloudwatchLogs(cloudwatchLogs: IResolvable) {
        cdkBuilder.cloudwatchLogs(cloudwatchLogs.let(IResolvable::unwrap))
      }

      public override fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty) {
        cdkBuilder.cloudwatchLogs(cloudwatchLogs.let(CloudwatchLogsActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37203c2772fa460a8ea92b7903e38c1647bc9fcbe895603b7eb3a2a0c43dfa79")
      public override
          fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty.Builder.() -> Unit): Unit
          = cloudwatchLogs(CloudwatchLogsActionProperty(cloudwatchLogs))

      public override fun cloudwatchMetric(cloudwatchMetric: IResolvable) {
        cdkBuilder.cloudwatchMetric(cloudwatchMetric.let(IResolvable::unwrap))
      }

      public override fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty) {
        cdkBuilder.cloudwatchMetric(cloudwatchMetric.let(CloudwatchMetricActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7cfa986986a53792b0900a5171b0568c06d1edd655a035e2f19aad202470c2a")
      public override
          fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty.Builder.() -> Unit):
          Unit = cloudwatchMetric(CloudwatchMetricActionProperty(cloudwatchMetric))

      public override fun dynamoDBv2(dynamoDBv2: IResolvable) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(IResolvable::unwrap))
      }

      public override fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(DynamoDBv2ActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59e5c496cd867f4091324ec238030b2fb9ec9fc654ed368a653fc003d437c9a5")
      public override fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty.Builder.() -> Unit): Unit
          = dynamoDBv2(DynamoDBv2ActionProperty(dynamoDBv2))

      public override fun dynamoDb(dynamoDb: IResolvable) {
        cdkBuilder.dynamoDb(dynamoDb.let(IResolvable::unwrap))
      }

      public override fun dynamoDb(dynamoDb: DynamoDBActionProperty) {
        cdkBuilder.dynamoDb(dynamoDb.let(DynamoDBActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be34cb6b6922328cc7edc8d1c4eebff91fc9f9fd2b7cb01f0f79d390cc9ce5")
      public override fun dynamoDb(dynamoDb: DynamoDBActionProperty.Builder.() -> Unit): Unit =
          dynamoDb(DynamoDBActionProperty(dynamoDb))

      public override fun elasticsearch(elasticsearch: IResolvable) {
        cdkBuilder.elasticsearch(elasticsearch.let(IResolvable::unwrap))
      }

      public override fun elasticsearch(elasticsearch: ElasticsearchActionProperty) {
        cdkBuilder.elasticsearch(elasticsearch.let(ElasticsearchActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa7cc1ae368a49a852adba0360258b23811f6fedded9a3d4748262f4eb4bfd3f")
      public override
          fun elasticsearch(elasticsearch: ElasticsearchActionProperty.Builder.() -> Unit): Unit =
          elasticsearch(ElasticsearchActionProperty(elasticsearch))

      public override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      public override fun firehose(firehose: FirehoseActionProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf0e7fd3ce39622fd99c5ea349382388654df4b23aa29717914502b8f97096c5")
      public override fun firehose(firehose: FirehoseActionProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseActionProperty(firehose))

      public override fun http(http: IResolvable) {
        cdkBuilder.http(http.let(IResolvable::unwrap))
      }

      public override fun http(http: HttpActionProperty) {
        cdkBuilder.http(http.let(HttpActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd0498a7b686ba06564c740ce89e23f940a59ace7c38c049d76591918aadf43")
      public override fun http(http: HttpActionProperty.Builder.() -> Unit): Unit =
          http(HttpActionProperty(http))

      public override fun iotAnalytics(iotAnalytics: IResolvable) {
        cdkBuilder.iotAnalytics(iotAnalytics.let(IResolvable::unwrap))
      }

      public override fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty) {
        cdkBuilder.iotAnalytics(iotAnalytics.let(IotAnalyticsActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457c63ef720d0825a43120a82e6d8743fa21e8392302a073ddf53384a50201f7")
      public override fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty.Builder.() -> Unit):
          Unit = iotAnalytics(IotAnalyticsActionProperty(iotAnalytics))

      public override fun iotEvents(iotEvents: IResolvable) {
        cdkBuilder.iotEvents(iotEvents.let(IResolvable::unwrap))
      }

      public override fun iotEvents(iotEvents: IotEventsActionProperty) {
        cdkBuilder.iotEvents(iotEvents.let(IotEventsActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a42cc3ccec03511269f99cb9dc4b2de9d9669b9ca612f5d231c217cdc01d770")
      public override fun iotEvents(iotEvents: IotEventsActionProperty.Builder.() -> Unit): Unit =
          iotEvents(IotEventsActionProperty(iotEvents))

      public override fun iotSiteWise(iotSiteWise: IResolvable) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IResolvable::unwrap))
      }

      public override fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IotSiteWiseActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c67675f0ded26c01b390afff37e4fbbe386d71d0bc05069dfe0909718ff796b")
      public override fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty.Builder.() -> Unit):
          Unit = iotSiteWise(IotSiteWiseActionProperty(iotSiteWise))

      public override fun kafka(kafka: IResolvable) {
        cdkBuilder.kafka(kafka.let(IResolvable::unwrap))
      }

      public override fun kafka(kafka: KafkaActionProperty) {
        cdkBuilder.kafka(kafka.let(KafkaActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bd0041398399948a6a91cc4beb5c27a2b10c383f2ccc058316107110812a17")
      public override fun kafka(kafka: KafkaActionProperty.Builder.() -> Unit): Unit =
          kafka(KafkaActionProperty(kafka))

      public override fun kinesis(kinesis: IResolvable) {
        cdkBuilder.kinesis(kinesis.let(IResolvable::unwrap))
      }

      public override fun kinesis(kinesis: KinesisActionProperty) {
        cdkBuilder.kinesis(kinesis.let(KinesisActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7829c2788742161736c7f4f276d2c9ca4a8eb7adc4f0983c9b15a000b1af250e")
      public override fun kinesis(kinesis: KinesisActionProperty.Builder.() -> Unit): Unit =
          kinesis(KinesisActionProperty(kinesis))

      public override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      public override fun lambda(lambda: LambdaActionProperty) {
        cdkBuilder.lambda(lambda.let(LambdaActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cb07553eb70f94d4d0741a88ca3bf21fbdb63c177f55b6d47112f90ea9de592")
      public override fun lambda(lambda: LambdaActionProperty.Builder.() -> Unit): Unit =
          lambda(LambdaActionProperty(lambda))

      public override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable::unwrap))
      }

      public override fun location(location: LocationActionProperty) {
        cdkBuilder.location(location.let(LocationActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40860c30d9f2428b1ebab0ef4f21b8fc9a5b0ad8ed070f880cc170ac5e542dcc")
      public override fun location(location: LocationActionProperty.Builder.() -> Unit): Unit =
          location(LocationActionProperty(location))

      public override fun openSearch(openSearch: IResolvable) {
        cdkBuilder.openSearch(openSearch.let(IResolvable::unwrap))
      }

      public override fun openSearch(openSearch: OpenSearchActionProperty) {
        cdkBuilder.openSearch(openSearch.let(OpenSearchActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff32f288dfb924554d6db1aacfcaa2e6b841f8bceae2eb25250c046ba5a2bcd0")
      public override fun openSearch(openSearch: OpenSearchActionProperty.Builder.() -> Unit): Unit
          = openSearch(OpenSearchActionProperty(openSearch))

      public override fun republish(republish: IResolvable) {
        cdkBuilder.republish(republish.let(IResolvable::unwrap))
      }

      public override fun republish(republish: RepublishActionProperty) {
        cdkBuilder.republish(republish.let(RepublishActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cff4c9f4f165e6ebf8a1d92707200697b7936100cf640c266bfed5c64224cbc7")
      public override fun republish(republish: RepublishActionProperty.Builder.() -> Unit): Unit =
          republish(RepublishActionProperty(republish))

      public override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      public override fun s3(s3: S3ActionProperty) {
        cdkBuilder.s3(s3.let(S3ActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070c5e2e998b45e02dc2bc514fafd0dce57030732a785f0655bf84f88530e751")
      public override fun s3(s3: S3ActionProperty.Builder.() -> Unit): Unit =
          s3(S3ActionProperty(s3))

      public override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      public override fun sns(sns: SnsActionProperty) {
        cdkBuilder.sns(sns.let(SnsActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e336860db8f9171bd843c395083b15e06f348ab6ee03e7aadbb37d2b1f5c7c50")
      public override fun sns(sns: SnsActionProperty.Builder.() -> Unit): Unit =
          sns(SnsActionProperty(sns))

      public override fun sqs(sqs: IResolvable) {
        cdkBuilder.sqs(sqs.let(IResolvable::unwrap))
      }

      public override fun sqs(sqs: SqsActionProperty) {
        cdkBuilder.sqs(sqs.let(SqsActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57ea076cdbbf86399719493cb0eaff62871072cc1f057effda768eae4871d465")
      public override fun sqs(sqs: SqsActionProperty.Builder.() -> Unit): Unit =
          sqs(SqsActionProperty(sqs))

      public override fun stepFunctions(stepFunctions: IResolvable) {
        cdkBuilder.stepFunctions(stepFunctions.let(IResolvable::unwrap))
      }

      public override fun stepFunctions(stepFunctions: StepFunctionsActionProperty) {
        cdkBuilder.stepFunctions(stepFunctions.let(StepFunctionsActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661d098ed0c8cb1e4cc86437072deacf3e3c1f01ef261b1d6f2b9cab7d110c3a")
      public override
          fun stepFunctions(stepFunctions: StepFunctionsActionProperty.Builder.() -> Unit): Unit =
          stepFunctions(StepFunctionsActionProperty(stepFunctions))

      public override fun timestream(timestream: IResolvable) {
        cdkBuilder.timestream(timestream.let(IResolvable::unwrap))
      }

      public override fun timestream(timestream: TimestreamActionProperty) {
        cdkBuilder.timestream(timestream.let(TimestreamActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4706a162d3bb7a739fa4cf959252e7009c2f91e0d18e6ea13b7c4f1d153f8a83")
      public override fun timestream(timestream: TimestreamActionProperty.Builder.() -> Unit): Unit
          = timestream(TimestreamActionProperty(timestream))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty,
    ) : ActionProperty {
      public override fun cloudwatchAlarm(): Any? = unwrap(this).getCloudwatchAlarm()

      public override fun cloudwatchLogs(): Any? = unwrap(this).getCloudwatchLogs()

      public override fun cloudwatchMetric(): Any? = unwrap(this).getCloudwatchMetric()

      public override fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

      public override fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

      public override fun elasticsearch(): Any? = unwrap(this).getElasticsearch()

      public override fun firehose(): Any? = unwrap(this).getFirehose()

      public override fun http(): Any? = unwrap(this).getHttp()

      public override fun iotAnalytics(): Any? = unwrap(this).getIotAnalytics()

      public override fun iotEvents(): Any? = unwrap(this).getIotEvents()

      public override fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

      public override fun kafka(): Any? = unwrap(this).getKafka()

      public override fun kinesis(): Any? = unwrap(this).getKinesis()

      public override fun lambda(): Any? = unwrap(this).getLambda()

      public override fun location(): Any? = unwrap(this).getLocation()

      public override fun openSearch(): Any? = unwrap(this).getOpenSearch()

      public override fun republish(): Any? = unwrap(this).getRepublish()

      public override fun s3(): Any? = unwrap(this).getS3()

      public override fun sns(): Any? = unwrap(this).getSns()

      public override fun sqs(): Any? = unwrap(this).getSqs()

      public override fun stepFunctions(): Any? = unwrap(this).getStepFunctions()

      public override fun timestream(): Any? = unwrap(this).getTimestream()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KinesisActionProperty {
    public fun partitionKey(): String? = unwrap(this).getPartitionKey()

    public fun roleArn(): String

    public fun streamName(): String

    public interface Builder {
      public fun partitionKey(partitionKey: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun streamName(streamName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.builder()

      public override fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty,
    ) : KinesisActionProperty {
      public override fun partitionKey(): String? = unwrap(this).getPartitionKey()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun streamName(): String = unwrap(this).getStreamName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty):
          KinesisActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RepublishActionHeadersProperty {
    public fun contentType(): String? = unwrap(this).getContentType()

    public fun correlationData(): String? = unwrap(this).getCorrelationData()

    public fun messageExpiry(): String? = unwrap(this).getMessageExpiry()

    public fun payloadFormatIndicator(): String? = unwrap(this).getPayloadFormatIndicator()

    public fun responseTopic(): String? = unwrap(this).getResponseTopic()

    public fun userProperties(): Any? = unwrap(this).getUserProperties()

    public interface Builder {
      public fun contentType(contentType: String) {
      }

      public fun correlationData(correlationData: String) {
      }

      public fun messageExpiry(messageExpiry: String) {
      }

      public fun payloadFormatIndicator(payloadFormatIndicator: String) {
      }

      public fun responseTopic(responseTopic: String) {
      }

      public fun userProperties(userProperties: IResolvable) {
      }

      public fun userProperties(userProperties: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty.builder()

      public override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public override fun correlationData(correlationData: String) {
        cdkBuilder.correlationData(correlationData)
      }

      public override fun messageExpiry(messageExpiry: String) {
        cdkBuilder.messageExpiry(messageExpiry)
      }

      public override fun payloadFormatIndicator(payloadFormatIndicator: String) {
        cdkBuilder.payloadFormatIndicator(payloadFormatIndicator)
      }

      public override fun responseTopic(responseTopic: String) {
        cdkBuilder.responseTopic(responseTopic)
      }

      public override fun userProperties(userProperties: IResolvable) {
        cdkBuilder.userProperties(userProperties.let(IResolvable::unwrap))
      }

      public override fun userProperties(userProperties: List<Any>) {
        cdkBuilder.userProperties(userProperties)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty,
    ) : RepublishActionHeadersProperty {
      public override fun contentType(): String? = unwrap(this).getContentType()

      public override fun correlationData(): String? = unwrap(this).getCorrelationData()

      public override fun messageExpiry(): String? = unwrap(this).getMessageExpiry()

      public override fun payloadFormatIndicator(): String? =
          unwrap(this).getPayloadFormatIndicator()

      public override fun responseTopic(): String? = unwrap(this).getResponseTopic()

      public override fun userProperties(): Any? = unwrap(this).getUserProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RepublishActionHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty):
          RepublishActionHeadersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepublishActionHeadersProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PutItemInputProperty {
    public fun tableName(): String

    public interface Builder {
      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.builder()

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty,
    ) : PutItemInputProperty {
      public override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PutItemInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty):
          PutItemInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PutItemInputProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TopicRulePayloadProperty {
    public fun actions(): Any

    public fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

    public fun description(): String? = unwrap(this).getDescription()

    public fun errorAction(): Any? = unwrap(this).getErrorAction()

    public fun ruleDisabled(): Any? = unwrap(this).getRuleDisabled()

    public fun sql(): String

    public interface Builder {
      public fun actions(actions: IResolvable) {
      }

      public fun actions(actions: List<Any>) {
      }

      public fun awsIotSqlVersion(awsIotSqlVersion: String) {
      }

      public fun description(description: String) {
      }

      public fun errorAction(errorAction: IResolvable) {
      }

      public fun errorAction(errorAction: ActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6a7feef4f5e9d29bedaf3b8042ef7b2e98dd59465b5b31492cf2bd7ab98cab6")
      public fun errorAction(errorAction: ActionProperty.Builder.() -> Unit) {
      }

      public fun ruleDisabled(ruleDisabled: Boolean) {
      }

      public fun ruleDisabled(ruleDisabled: IResolvable) {
      }

      public fun sql(sql: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.builder()

      public override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      public override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      public override fun awsIotSqlVersion(awsIotSqlVersion: String) {
        cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun errorAction(errorAction: IResolvable) {
        cdkBuilder.errorAction(errorAction.let(IResolvable::unwrap))
      }

      public override fun errorAction(errorAction: ActionProperty) {
        cdkBuilder.errorAction(errorAction.let(ActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6a7feef4f5e9d29bedaf3b8042ef7b2e98dd59465b5b31492cf2bd7ab98cab6")
      public override fun errorAction(errorAction: ActionProperty.Builder.() -> Unit): Unit =
          errorAction(ActionProperty(errorAction))

      public override fun ruleDisabled(ruleDisabled: Boolean) {
        cdkBuilder.ruleDisabled(ruleDisabled)
      }

      public override fun ruleDisabled(ruleDisabled: IResolvable) {
        cdkBuilder.ruleDisabled(ruleDisabled.let(IResolvable::unwrap))
      }

      public override fun sql(sql: String) {
        cdkBuilder.sql(sql)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty,
    ) : TopicRulePayloadProperty {
      public override fun actions(): Any = unwrap(this).getActions()

      public override fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun errorAction(): Any? = unwrap(this).getErrorAction()

      public override fun ruleDisabled(): Any? = unwrap(this).getRuleDisabled()

      public override fun sql(): String = unwrap(this).getSql()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicRulePayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty):
          TopicRulePayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicRulePayloadProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FirehoseActionProperty {
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    public fun deliveryStreamName(): String

    public fun roleArn(): String

    public fun separator(): String? = unwrap(this).getSeparator()

    public interface Builder {
      public fun batchMode(batchMode: Boolean) {
      }

      public fun batchMode(batchMode: IResolvable) {
      }

      public fun deliveryStreamName(deliveryStreamName: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun separator(separator: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.builder()

      public override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      public override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      public override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun separator(separator: String) {
        cdkBuilder.separator(separator)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty,
    ) : FirehoseActionProperty {
      public override fun batchMode(): Any? = unwrap(this).getBatchMode()

      public override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun separator(): String? = unwrap(this).getSeparator()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty):
          FirehoseActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SqsActionProperty {
    public fun queueUrl(): String

    public fun roleArn(): String

    public fun useBase64(): Any? = unwrap(this).getUseBase64()

    public interface Builder {
      public fun queueUrl(queueUrl: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun useBase64(useBase64: Boolean) {
      }

      public fun useBase64(useBase64: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.builder()

      public override fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
      }

      public override fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty,
    ) : SqsActionProperty {
      public override fun queueUrl(): String = unwrap(this).getQueueUrl()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun useBase64(): Any? = unwrap(this).getUseBase64()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty):
          SqsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OpenSearchActionProperty {
    public fun endpoint(): String

    public fun id(): String

    public fun index(): String

    public fun roleArn(): String

    public fun type(): String

    public interface Builder {
      public fun endpoint(endpoint: String) {
      }

      public fun id(id: String) {
      }

      public fun index(index: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty.builder()

      public override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun index(index: String) {
        cdkBuilder.index(index)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty,
    ) : OpenSearchActionProperty {
      public override fun endpoint(): String = unwrap(this).getEndpoint()

      public override fun id(): String = unwrap(this).getId()

      public override fun index(): String = unwrap(this).getIndex()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OpenSearchActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty):
          OpenSearchActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DynamoDBv2ActionProperty {
    public fun putItem(): Any? = unwrap(this).getPutItem()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public interface Builder {
      public fun putItem(putItem: IResolvable) {
      }

      public fun putItem(putItem: PutItemInputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617e1a58adc917f0156f89c39c5b6b961587d2e600c94285ba7a7cb84c4d68a1")
      public fun putItem(putItem: PutItemInputProperty.Builder.() -> Unit) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.builder()

      public override fun putItem(putItem: IResolvable) {
        cdkBuilder.putItem(putItem.let(IResolvable::unwrap))
      }

      public override fun putItem(putItem: PutItemInputProperty) {
        cdkBuilder.putItem(putItem.let(PutItemInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617e1a58adc917f0156f89c39c5b6b961587d2e600c94285ba7a7cb84c4d68a1")
      public override fun putItem(putItem: PutItemInputProperty.Builder.() -> Unit): Unit =
          putItem(PutItemInputProperty(putItem))

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty,
    ) : DynamoDBv2ActionProperty {
      public override fun putItem(): Any? = unwrap(this).getPutItem()

      public override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBv2ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty):
          DynamoDBv2ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBv2ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KafkaActionProperty {
    public fun clientProperties(): Any

    public fun destinationArn(): String

    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun key(): String? = unwrap(this).getKey()

    public fun partition(): String? = unwrap(this).getPartition()

    public fun topic(): String

    public interface Builder {
      public fun clientProperties(clientProperties: IResolvable) {
      }

      public fun clientProperties(clientProperties: Map<String, String>) {
      }

      public fun destinationArn(destinationArn: String) {
      }

      public fun headers(headers: IResolvable) {
      }

      public fun headers(headers: List<Any>) {
      }

      public fun key(key: String) {
      }

      public fun partition(partition: String) {
      }

      public fun topic(topic: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty.builder()

      public override fun clientProperties(clientProperties: IResolvable) {
        cdkBuilder.clientProperties(clientProperties.let(IResolvable::unwrap))
      }

      public override fun clientProperties(clientProperties: Map<String, String>) {
        cdkBuilder.clientProperties(clientProperties)
      }

      public override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      public override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun partition(partition: String) {
        cdkBuilder.partition(partition)
      }

      public override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty,
    ) : KafkaActionProperty {
      public override fun clientProperties(): Any = unwrap(this).getClientProperties()

      public override fun destinationArn(): String = unwrap(this).getDestinationArn()

      public override fun headers(): Any? = unwrap(this).getHeaders()

      public override fun key(): String? = unwrap(this).getKey()

      public override fun partition(): String? = unwrap(this).getPartition()

      public override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty):
          KafkaActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudwatchLogsActionProperty {
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    public fun logGroupName(): String

    public fun roleArn(): String

    public interface Builder {
      public fun batchMode(batchMode: Boolean) {
      }

      public fun batchMode(batchMode: IResolvable) {
      }

      public fun logGroupName(logGroupName: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty.builder()

      public override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      public override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      public override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty,
    ) : CloudwatchLogsActionProperty {
      public override fun batchMode(): Any? = unwrap(this).getBatchMode()

      public override fun logGroupName(): String = unwrap(this).getLogGroupName()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchLogsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty):
          CloudwatchLogsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchLogsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PutAssetPropertyValueEntryProperty {
    public fun assetId(): String? = unwrap(this).getAssetId()

    public fun entryId(): String? = unwrap(this).getEntryId()

    public fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

    public fun propertyId(): String? = unwrap(this).getPropertyId()

    public fun propertyValues(): Any

    public interface Builder {
      public fun assetId(assetId: String) {
      }

      public fun entryId(entryId: String) {
      }

      public fun propertyAlias(propertyAlias: String) {
      }

      public fun propertyId(propertyId: String) {
      }

      public fun propertyValues(propertyValues: IResolvable) {
      }

      public fun propertyValues(propertyValues: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty.builder()

      public override fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
      }

      public override fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
      }

      public override fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
      }

      public override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      public override fun propertyValues(propertyValues: IResolvable) {
        cdkBuilder.propertyValues(propertyValues.let(IResolvable::unwrap))
      }

      public override fun propertyValues(propertyValues: List<Any>) {
        cdkBuilder.propertyValues(propertyValues)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty,
    ) : PutAssetPropertyValueEntryProperty {
      public override fun assetId(): String? = unwrap(this).getAssetId()

      public override fun entryId(): String? = unwrap(this).getEntryId()

      public override fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

      public override fun propertyId(): String? = unwrap(this).getPropertyId()

      public override fun propertyValues(): Any = unwrap(this).getPropertyValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PutAssetPropertyValueEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty):
          PutAssetPropertyValueEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PutAssetPropertyValueEntryProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AssetPropertyTimestampProperty {
    public fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

    public fun timeInSeconds(): String

    public interface Builder {
      public fun offsetInNanos(offsetInNanos: String) {
      }

      public fun timeInSeconds(timeInSeconds: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty.builder()

      public override fun offsetInNanos(offsetInNanos: String) {
        cdkBuilder.offsetInNanos(offsetInNanos)
      }

      public override fun timeInSeconds(timeInSeconds: String) {
        cdkBuilder.timeInSeconds(timeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty,
    ) : AssetPropertyTimestampProperty {
      public override fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

      public override fun timeInSeconds(): String = unwrap(this).getTimeInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty):
          AssetPropertyTimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyTimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CloudwatchAlarmActionProperty {
    public fun alarmName(): String

    public fun roleArn(): String

    public fun stateReason(): String

    public fun stateValue(): String

    public interface Builder {
      public fun alarmName(alarmName: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun stateReason(stateReason: String) {
      }

      public fun stateValue(stateValue: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.builder()

      public override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun stateReason(stateReason: String) {
        cdkBuilder.stateReason(stateReason)
      }

      public override fun stateValue(stateValue: String) {
        cdkBuilder.stateValue(stateValue)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty,
    ) : CloudwatchAlarmActionProperty {
      public override fun alarmName(): String = unwrap(this).getAlarmName()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun stateReason(): String = unwrap(this).getStateReason()

      public override fun stateValue(): String = unwrap(this).getStateValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchAlarmActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty):
          CloudwatchAlarmActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchAlarmActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RepublishActionProperty {
    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun qos(): Number? = unwrap(this).getQos()

    public fun roleArn(): String

    public fun topic(): String

    public interface Builder {
      public fun headers(headers: IResolvable) {
      }

      public fun headers(headers: RepublishActionHeadersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8509a5f5d564844fd60f047bc4e233b3c06ba3e5ce62199852b89ecc6e93d827")
      public fun headers(headers: RepublishActionHeadersProperty.Builder.() -> Unit) {
      }

      public fun qos(qos: Number) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun topic(topic: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.builder()

      public override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      public override fun headers(headers: RepublishActionHeadersProperty) {
        cdkBuilder.headers(headers.let(RepublishActionHeadersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8509a5f5d564844fd60f047bc4e233b3c06ba3e5ce62199852b89ecc6e93d827")
      public override fun headers(headers: RepublishActionHeadersProperty.Builder.() -> Unit): Unit
          = headers(RepublishActionHeadersProperty(headers))

      public override fun qos(qos: Number) {
        cdkBuilder.qos(qos)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty,
    ) : RepublishActionProperty {
      public override fun headers(): Any? = unwrap(this).getHeaders()

      public override fun qos(): Number? = unwrap(this).getQos()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RepublishActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty):
          RepublishActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepublishActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DynamoDBActionProperty {
    public fun hashKeyField(): String

    public fun hashKeyType(): String? = unwrap(this).getHashKeyType()

    public fun hashKeyValue(): String

    public fun payloadField(): String? = unwrap(this).getPayloadField()

    public fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

    public fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

    public fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

    public fun roleArn(): String

    public fun tableName(): String

    public interface Builder {
      public fun hashKeyField(hashKeyField: String) {
      }

      public fun hashKeyType(hashKeyType: String) {
      }

      public fun hashKeyValue(hashKeyValue: String) {
      }

      public fun payloadField(payloadField: String) {
      }

      public fun rangeKeyField(rangeKeyField: String) {
      }

      public fun rangeKeyType(rangeKeyType: String) {
      }

      public fun rangeKeyValue(rangeKeyValue: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.builder()

      public override fun hashKeyField(hashKeyField: String) {
        cdkBuilder.hashKeyField(hashKeyField)
      }

      public override fun hashKeyType(hashKeyType: String) {
        cdkBuilder.hashKeyType(hashKeyType)
      }

      public override fun hashKeyValue(hashKeyValue: String) {
        cdkBuilder.hashKeyValue(hashKeyValue)
      }

      public override fun payloadField(payloadField: String) {
        cdkBuilder.payloadField(payloadField)
      }

      public override fun rangeKeyField(rangeKeyField: String) {
        cdkBuilder.rangeKeyField(rangeKeyField)
      }

      public override fun rangeKeyType(rangeKeyType: String) {
        cdkBuilder.rangeKeyType(rangeKeyType)
      }

      public override fun rangeKeyValue(rangeKeyValue: String) {
        cdkBuilder.rangeKeyValue(rangeKeyValue)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty,
    ) : DynamoDBActionProperty {
      public override fun hashKeyField(): String = unwrap(this).getHashKeyField()

      public override fun hashKeyType(): String? = unwrap(this).getHashKeyType()

      public override fun hashKeyValue(): String = unwrap(this).getHashKeyValue()

      public override fun payloadField(): String? = unwrap(this).getPayloadField()

      public override fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

      public override fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

      public override fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty):
          DynamoDBActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SigV4AuthorizationProperty {
    public fun roleArn(): String

    public fun serviceName(): String

    public fun signingRegion(): String

    public interface Builder {
      public fun roleArn(roleArn: String) {
      }

      public fun serviceName(serviceName: String) {
      }

      public fun signingRegion(signingRegion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty.builder()

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public override fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty,
    ) : SigV4AuthorizationProperty {
      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun serviceName(): String = unwrap(this).getServiceName()

      public override fun signingRegion(): String = unwrap(this).getSigningRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SigV4AuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty):
          SigV4AuthorizationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SigV4AuthorizationProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpActionProperty {
    public fun auth(): Any? = unwrap(this).getAuth()

    public fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()

    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun url(): String

    public interface Builder {
      public fun auth(auth: IResolvable) {
      }

      public fun auth(auth: HttpAuthorizationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe1895bf141ae6e75841bc4fb2d18f1438b51afa1677a87e878f530a0d045f1d")
      public fun auth(auth: HttpAuthorizationProperty.Builder.() -> Unit) {
      }

      public fun confirmationUrl(confirmationUrl: String) {
      }

      public fun headers(headers: IResolvable) {
      }

      public fun headers(headers: List<Any>) {
      }

      public fun url(url: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty.builder()

      public override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      public override fun auth(auth: HttpAuthorizationProperty) {
        cdkBuilder.auth(auth.let(HttpAuthorizationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe1895bf141ae6e75841bc4fb2d18f1438b51afa1677a87e878f530a0d045f1d")
      public override fun auth(auth: HttpAuthorizationProperty.Builder.() -> Unit): Unit =
          auth(HttpAuthorizationProperty(auth))

      public override fun confirmationUrl(confirmationUrl: String) {
        cdkBuilder.confirmationUrl(confirmationUrl)
      }

      public override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      public override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty,
    ) : HttpActionProperty {
      public override fun auth(): Any? = unwrap(this).getAuth()

      public override fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()

      public override fun headers(): Any? = unwrap(this).getHeaders()

      public override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty):
          HttpActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IotSiteWiseActionProperty {
    public fun putAssetPropertyValueEntries(): Any

    public fun roleArn(): String

    public interface Builder {
      public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable) {
      }

      public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: List<Any>) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty.builder()

      public override fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable) {
        cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries.let(IResolvable::unwrap))
      }

      public override fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: List<Any>) {
        cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty,
    ) : IotSiteWiseActionProperty {
      public override fun putAssetPropertyValueEntries(): Any =
          unwrap(this).getPutAssetPropertyValueEntries()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotSiteWiseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty):
          IotSiteWiseActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotSiteWiseActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AssetPropertyValueProperty {
    public fun quality(): String? = unwrap(this).getQuality()

    public fun timestamp(): Any

    public fun `value`(): Any

    public interface Builder {
      public fun quality(quality: String) {
      }

      public fun timestamp(timestamp: IResolvable) {
      }

      public fun timestamp(timestamp: AssetPropertyTimestampProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe07339b680ef5ffed57cc0c78abbc32650de3539ddbd5dae20830ebdc53cefc")
      public fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit) {
      }

      public fun `value`(`value`: IResolvable) {
      }

      public fun `value`(`value`: AssetPropertyVariantProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc81754749f6a006f434cdbdacbaee93a5a433ffebfb388b8cd34c86c41bcc8")
      public fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty.builder()

      public override fun quality(quality: String) {
        cdkBuilder.quality(quality)
      }

      public override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      public override fun timestamp(timestamp: AssetPropertyTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(AssetPropertyTimestampProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe07339b680ef5ffed57cc0c78abbc32650de3539ddbd5dae20830ebdc53cefc")
      public override fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit):
          Unit = timestamp(AssetPropertyTimestampProperty(timestamp))

      public override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      public override fun `value`(`value`: AssetPropertyVariantProperty) {
        cdkBuilder.`value`(`value`.let(AssetPropertyVariantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc81754749f6a006f434cdbdacbaee93a5a433ffebfb388b8cd34c86c41bcc8")
      public override fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit): Unit =
          `value`(AssetPropertyVariantProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty,
    ) : AssetPropertyValueProperty {
      public override fun quality(): String? = unwrap(this).getQuality()

      public override fun timestamp(): Any = unwrap(this).getTimestamp()

      public override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty):
          AssetPropertyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyValueProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StepFunctionsActionProperty {
    public fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

    public fun roleArn(): String

    public fun stateMachineName(): String

    public interface Builder {
      public fun executionNamePrefix(executionNamePrefix: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun stateMachineName(stateMachineName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.builder()

      public override fun executionNamePrefix(executionNamePrefix: String) {
        cdkBuilder.executionNamePrefix(executionNamePrefix)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty,
    ) : StepFunctionsActionProperty {
      public override fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun stateMachineName(): String = unwrap(this).getStateMachineName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty):
          StepFunctionsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepFunctionsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpAuthorizationProperty {
    public fun sigv4(): Any? = unwrap(this).getSigv4()

    public interface Builder {
      public fun sigv4(sigv4: IResolvable) {
      }

      public fun sigv4(sigv4: SigV4AuthorizationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e279999b2f49cd3bcdd0ef07fb0e9971e7dca036f7344431f823ed7f5b7355fd")
      public fun sigv4(sigv4: SigV4AuthorizationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty.builder()

      public override fun sigv4(sigv4: IResolvable) {
        cdkBuilder.sigv4(sigv4.let(IResolvable::unwrap))
      }

      public override fun sigv4(sigv4: SigV4AuthorizationProperty) {
        cdkBuilder.sigv4(sigv4.let(SigV4AuthorizationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e279999b2f49cd3bcdd0ef07fb0e9971e7dca036f7344431f823ed7f5b7355fd")
      public override fun sigv4(sigv4: SigV4AuthorizationProperty.Builder.() -> Unit): Unit =
          sigv4(SigV4AuthorizationProperty(sigv4))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty,
    ) : HttpAuthorizationProperty {
      public override fun sigv4(): Any? = unwrap(this).getSigv4()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpAuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty):
          HttpAuthorizationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpAuthorizationProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IotEventsActionProperty {
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    public fun inputName(): String

    public fun messageId(): String? = unwrap(this).getMessageId()

    public fun roleArn(): String

    public interface Builder {
      public fun batchMode(batchMode: Boolean) {
      }

      public fun batchMode(batchMode: IResolvable) {
      }

      public fun inputName(inputName: String) {
      }

      public fun messageId(messageId: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty.builder()

      public override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      public override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      public override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      public override fun messageId(messageId: String) {
        cdkBuilder.messageId(messageId)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty,
    ) : IotEventsActionProperty {
      public override fun batchMode(): Any? = unwrap(this).getBatchMode()

      public override fun inputName(): String = unwrap(this).getInputName()

      public override fun messageId(): String? = unwrap(this).getMessageId()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotEventsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty):
          IotEventsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotEventsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IotAnalyticsActionProperty {
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    public fun channelName(): String

    public fun roleArn(): String

    public interface Builder {
      public fun batchMode(batchMode: Boolean) {
      }

      public fun batchMode(batchMode: IResolvable) {
      }

      public fun channelName(channelName: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.builder()

      public override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      public override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      public override fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty,
    ) : IotAnalyticsActionProperty {
      public override fun batchMode(): Any? = unwrap(this).getBatchMode()

      public override fun channelName(): String = unwrap(this).getChannelName()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IotAnalyticsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty):
          IotAnalyticsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotAnalyticsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TimestreamTimestampProperty {
    public fun unit(): String

    public fun `value`(): String

    public interface Builder {
      public fun unit(unit: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty.builder()

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty,
    ) : TimestreamTimestampProperty {
      public override fun unit(): String = unwrap(this).getUnit()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty):
          TimestreamTimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamTimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AssetPropertyVariantProperty {
    public fun booleanValue(): String? = unwrap(this).getBooleanValue()

    public fun doubleValue(): String? = unwrap(this).getDoubleValue()

    public fun integerValue(): String? = unwrap(this).getIntegerValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public interface Builder {
      public fun booleanValue(booleanValue: String) {
      }

      public fun doubleValue(doubleValue: String) {
      }

      public fun integerValue(integerValue: String) {
      }

      public fun stringValue(stringValue: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty.builder()

      public override fun booleanValue(booleanValue: String) {
        cdkBuilder.booleanValue(booleanValue)
      }

      public override fun doubleValue(doubleValue: String) {
        cdkBuilder.doubleValue(doubleValue)
      }

      public override fun integerValue(integerValue: String) {
        cdkBuilder.integerValue(integerValue)
      }

      public override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty,
    ) : AssetPropertyVariantProperty {
      public override fun booleanValue(): String? = unwrap(this).getBooleanValue()

      public override fun doubleValue(): String? = unwrap(this).getDoubleValue()

      public override fun integerValue(): String? = unwrap(this).getIntegerValue()

      public override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty):
          AssetPropertyVariantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyVariantProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface UserPropertyProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty,
    ) : UserPropertyProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty):
          UserPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPropertyProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpActionHeaderProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty,
    ) : HttpActionHeaderProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpActionHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty):
          HttpActionHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpActionHeaderProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SnsActionProperty {
    public fun messageFormat(): String? = unwrap(this).getMessageFormat()

    public fun roleArn(): String

    public fun targetArn(): String

    public interface Builder {
      public fun messageFormat(messageFormat: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun targetArn(targetArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.builder()

      public override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty,
    ) : SnsActionProperty {
      public override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun targetArn(): String = unwrap(this).getTargetArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty):
          SnsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LocationActionProperty {
    public fun deviceId(): String

    public fun latitude(): String

    public fun longitude(): String

    public fun roleArn(): String

    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    public fun trackerName(): String

    public interface Builder {
      public fun deviceId(deviceId: String) {
      }

      public fun latitude(latitude: String) {
      }

      public fun longitude(longitude: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun timestamp(timestamp: IResolvable) {
      }

      public fun timestamp(timestamp: TimestampProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cdab211b27fd2b48d7d3ca9c417d32fd12c724ef5c66ee4e70518fb7204e6e")
      public fun timestamp(timestamp: TimestampProperty.Builder.() -> Unit) {
      }

      public fun trackerName(trackerName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty.builder()

      public override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      public override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      public override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      public override fun timestamp(timestamp: TimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(TimestampProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cdab211b27fd2b48d7d3ca9c417d32fd12c724ef5c66ee4e70518fb7204e6e")
      public override fun timestamp(timestamp: TimestampProperty.Builder.() -> Unit): Unit =
          timestamp(TimestampProperty(timestamp))

      public override fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty,
    ) : LocationActionProperty {
      public override fun deviceId(): String = unwrap(this).getDeviceId()

      public override fun latitude(): String = unwrap(this).getLatitude()

      public override fun longitude(): String = unwrap(this).getLongitude()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun timestamp(): Any? = unwrap(this).getTimestamp()

      public override fun trackerName(): String = unwrap(this).getTrackerName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocationActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty):
          LocationActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3ActionProperty {
    public fun bucketName(): String

    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    public fun key(): String

    public fun roleArn(): String

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun cannedAcl(cannedAcl: String) {
      }

      public fun key(key: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty,
    ) : S3ActionProperty {
      public override fun bucketName(): String = unwrap(this).getBucketName()

      public override fun cannedAcl(): String? = unwrap(this).getCannedAcl()

      public override fun key(): String = unwrap(this).getKey()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty):
          S3ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TimestampProperty {
    public fun unit(): String? = unwrap(this).getUnit()

    public fun `value`(): String

    public interface Builder {
      public fun unit(unit: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty.builder()

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty,
    ) : TimestampProperty {
      public override fun unit(): String? = unwrap(this).getUnit()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty):
          TimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudwatchMetricActionProperty {
    public fun metricName(): String

    public fun metricNamespace(): String

    public fun metricTimestamp(): String? = unwrap(this).getMetricTimestamp()

    public fun metricUnit(): String

    public fun metricValue(): String

    public fun roleArn(): String

    public interface Builder {
      public fun metricName(metricName: String) {
      }

      public fun metricNamespace(metricNamespace: String) {
      }

      public fun metricTimestamp(metricTimestamp: String) {
      }

      public fun metricUnit(metricUnit: String) {
      }

      public fun metricValue(metricValue: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.builder()

      public override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      public override fun metricNamespace(metricNamespace: String) {
        cdkBuilder.metricNamespace(metricNamespace)
      }

      public override fun metricTimestamp(metricTimestamp: String) {
        cdkBuilder.metricTimestamp(metricTimestamp)
      }

      public override fun metricUnit(metricUnit: String) {
        cdkBuilder.metricUnit(metricUnit)
      }

      public override fun metricValue(metricValue: String) {
        cdkBuilder.metricValue(metricValue)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty,
    ) : CloudwatchMetricActionProperty {
      public override fun metricName(): String = unwrap(this).getMetricName()

      public override fun metricNamespace(): String = unwrap(this).getMetricNamespace()

      public override fun metricTimestamp(): String? = unwrap(this).getMetricTimestamp()

      public override fun metricUnit(): String = unwrap(this).getMetricUnit()

      public override fun metricValue(): String = unwrap(this).getMetricValue()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchMetricActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty):
          CloudwatchMetricActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchMetricActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TimestreamActionProperty {
    public fun databaseName(): String

    public fun dimensions(): Any

    public fun roleArn(): String

    public fun tableName(): String

    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    public interface Builder {
      public fun databaseName(databaseName: String) {
      }

      public fun dimensions(dimensions: IResolvable) {
      }

      public fun dimensions(dimensions: List<Any>) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun tableName(tableName: String) {
      }

      public fun timestamp(timestamp: IResolvable) {
      }

      public fun timestamp(timestamp: TimestreamTimestampProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d60eeb5a833c96c0d04ddc520b572e847b707ad1b16fb1d0b9670ae5edd658")
      public fun timestamp(timestamp: TimestreamTimestampProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty.builder()

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      public override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      public override fun timestamp(timestamp: TimestreamTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(TimestreamTimestampProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d60eeb5a833c96c0d04ddc520b572e847b707ad1b16fb1d0b9670ae5edd658")
      public override fun timestamp(timestamp: TimestreamTimestampProperty.Builder.() -> Unit): Unit
          = timestamp(TimestreamTimestampProperty(timestamp))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty,
    ) : TimestreamActionProperty {
      public override fun databaseName(): String = unwrap(this).getDatabaseName()

      public override fun dimensions(): Any = unwrap(this).getDimensions()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun tableName(): String = unwrap(this).getTableName()

      public override fun timestamp(): Any? = unwrap(this).getTimestamp()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty):
          TimestreamActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LambdaActionProperty {
    public fun functionArn(): String? = unwrap(this).getFunctionArn()

    public interface Builder {
      public fun functionArn(functionArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.builder()

      public override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty,
    ) : LambdaActionProperty {
      public override fun functionArn(): String? = unwrap(this).getFunctionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty):
          LambdaActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ElasticsearchActionProperty {
    public fun endpoint(): String

    public fun id(): String

    public fun index(): String

    public fun roleArn(): String

    public fun type(): String

    public interface Builder {
      public fun endpoint(endpoint: String) {
      }

      public fun id(id: String) {
      }

      public fun index(index: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.builder()

      public override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun index(index: String) {
        cdkBuilder.index(index)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty,
    ) : ElasticsearchActionProperty {
      public override fun endpoint(): String = unwrap(this).getEndpoint()

      public override fun id(): String = unwrap(this).getId()

      public override fun index(): String = unwrap(this).getIndex()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticsearchActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty):
          ElasticsearchActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
