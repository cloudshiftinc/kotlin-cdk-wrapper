@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTopicRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule,
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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun topicRulePayload(): Any = unwrap(this).getTopicRulePayload()

  public open fun topicRulePayload(`value`: IResolvable) {
    unwrap(this).setTopicRulePayload(`value`.let(IResolvable::unwrap))
  }

  public open fun topicRulePayload(`value`: TopicRulePayloadProperty) {
    unwrap(this).setTopicRulePayload(`value`.let(TopicRulePayloadProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc4cd64f48f8d034f0017e45c5bdf05dfa22a293616bbd9ae8dcd77818bf7c62")
  public open fun topicRulePayload(`value`: TopicRulePayloadProperty.Builder.() -> Unit): Unit =
      topicRulePayload(TopicRulePayloadProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun ruleName(ruleName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun topicRulePayload(topicRulePayload: IResolvable)

    public fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc3ff15a9ef1552dc17aebf5e85e502e2b37ca8a82238895047768f6b136511")
    public fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRule.Builder =
        software.amazon.awscdk.services.iot.CfnTopicRule.Builder.create(scope, id)

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun topicRulePayload(topicRulePayload: IResolvable) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(IResolvable::unwrap))
    }

    override fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(TopicRulePayloadProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc3ff15a9ef1552dc17aebf5e85e502e2b37ca8a82238895047768f6b136511")
    override fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty.Builder.() -> Unit):
        Unit = topicRulePayload(TopicRulePayloadProperty(topicRulePayload))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnTopicRule.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty,
    ) : CdkObject(cdkObject), TimestreamDimensionProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty):
          TimestreamDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamDimensionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty
    }
  }

  public interface KafkaActionHeaderProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty,
    ) : CdkObject(cdkObject), KafkaActionHeaderProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaActionHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty):
          KafkaActionHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaActionHeaderProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun cloudwatchAlarm(cloudwatchAlarm: IResolvable)

      public fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e592d3b9ec58e1e6a0c9604f03fce76e7192a5c832a56e0e896e5aeb025c5136")
      public fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty.Builder.() -> Unit)

      public fun cloudwatchLogs(cloudwatchLogs: IResolvable)

      public fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37203c2772fa460a8ea92b7903e38c1647bc9fcbe895603b7eb3a2a0c43dfa79")
      public fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty.Builder.() -> Unit)

      public fun cloudwatchMetric(cloudwatchMetric: IResolvable)

      public fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7cfa986986a53792b0900a5171b0568c06d1edd655a035e2f19aad202470c2a")
      public
          fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty.Builder.() -> Unit)

      public fun dynamoDBv2(dynamoDBv2: IResolvable)

      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59e5c496cd867f4091324ec238030b2fb9ec9fc654ed368a653fc003d437c9a5")
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty.Builder.() -> Unit)

      public fun dynamoDb(dynamoDb: IResolvable)

      public fun dynamoDb(dynamoDb: DynamoDBActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be34cb6b6922328cc7edc8d1c4eebff91fc9f9fd2b7cb01f0f79d390cc9ce5")
      public fun dynamoDb(dynamoDb: DynamoDBActionProperty.Builder.() -> Unit)

      public fun elasticsearch(elasticsearch: IResolvable)

      public fun elasticsearch(elasticsearch: ElasticsearchActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa7cc1ae368a49a852adba0360258b23811f6fedded9a3d4748262f4eb4bfd3f")
      public fun elasticsearch(elasticsearch: ElasticsearchActionProperty.Builder.() -> Unit)

      public fun firehose(firehose: IResolvable)

      public fun firehose(firehose: FirehoseActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf0e7fd3ce39622fd99c5ea349382388654df4b23aa29717914502b8f97096c5")
      public fun firehose(firehose: FirehoseActionProperty.Builder.() -> Unit)

      public fun http(http: IResolvable)

      public fun http(http: HttpActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd0498a7b686ba06564c740ce89e23f940a59ace7c38c049d76591918aadf43")
      public fun http(http: HttpActionProperty.Builder.() -> Unit)

      public fun iotAnalytics(iotAnalytics: IResolvable)

      public fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457c63ef720d0825a43120a82e6d8743fa21e8392302a073ddf53384a50201f7")
      public fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty.Builder.() -> Unit)

      public fun iotEvents(iotEvents: IResolvable)

      public fun iotEvents(iotEvents: IotEventsActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a42cc3ccec03511269f99cb9dc4b2de9d9669b9ca612f5d231c217cdc01d770")
      public fun iotEvents(iotEvents: IotEventsActionProperty.Builder.() -> Unit)

      public fun iotSiteWise(iotSiteWise: IResolvable)

      public fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c67675f0ded26c01b390afff37e4fbbe386d71d0bc05069dfe0909718ff796b")
      public fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty.Builder.() -> Unit)

      public fun kafka(kafka: IResolvable)

      public fun kafka(kafka: KafkaActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bd0041398399948a6a91cc4beb5c27a2b10c383f2ccc058316107110812a17")
      public fun kafka(kafka: KafkaActionProperty.Builder.() -> Unit)

      public fun kinesis(kinesis: IResolvable)

      public fun kinesis(kinesis: KinesisActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7829c2788742161736c7f4f276d2c9ca4a8eb7adc4f0983c9b15a000b1af250e")
      public fun kinesis(kinesis: KinesisActionProperty.Builder.() -> Unit)

      public fun lambda(lambda: IResolvable)

      public fun lambda(lambda: LambdaActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cb07553eb70f94d4d0741a88ca3bf21fbdb63c177f55b6d47112f90ea9de592")
      public fun lambda(lambda: LambdaActionProperty.Builder.() -> Unit)

      public fun location(location: IResolvable)

      public fun location(location: LocationActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40860c30d9f2428b1ebab0ef4f21b8fc9a5b0ad8ed070f880cc170ac5e542dcc")
      public fun location(location: LocationActionProperty.Builder.() -> Unit)

      public fun openSearch(openSearch: IResolvable)

      public fun openSearch(openSearch: OpenSearchActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff32f288dfb924554d6db1aacfcaa2e6b841f8bceae2eb25250c046ba5a2bcd0")
      public fun openSearch(openSearch: OpenSearchActionProperty.Builder.() -> Unit)

      public fun republish(republish: IResolvable)

      public fun republish(republish: RepublishActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cff4c9f4f165e6ebf8a1d92707200697b7936100cf640c266bfed5c64224cbc7")
      public fun republish(republish: RepublishActionProperty.Builder.() -> Unit)

      public fun s3(s3: IResolvable)

      public fun s3(s3: S3ActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070c5e2e998b45e02dc2bc514fafd0dce57030732a785f0655bf84f88530e751")
      public fun s3(s3: S3ActionProperty.Builder.() -> Unit)

      public fun sns(sns: IResolvable)

      public fun sns(sns: SnsActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e336860db8f9171bd843c395083b15e06f348ab6ee03e7aadbb37d2b1f5c7c50")
      public fun sns(sns: SnsActionProperty.Builder.() -> Unit)

      public fun sqs(sqs: IResolvable)

      public fun sqs(sqs: SqsActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57ea076cdbbf86399719493cb0eaff62871072cc1f057effda768eae4871d465")
      public fun sqs(sqs: SqsActionProperty.Builder.() -> Unit)

      public fun stepFunctions(stepFunctions: IResolvable)

      public fun stepFunctions(stepFunctions: StepFunctionsActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661d098ed0c8cb1e4cc86437072deacf3e3c1f01ef261b1d6f2b9cab7d110c3a")
      public fun stepFunctions(stepFunctions: StepFunctionsActionProperty.Builder.() -> Unit)

      public fun timestream(timestream: IResolvable)

      public fun timestream(timestream: TimestreamActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4706a162d3bb7a739fa4cf959252e7009c2f91e0d18e6ea13b7c4f1d153f8a83")
      public fun timestream(timestream: TimestreamActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.builder()

      override fun cloudwatchAlarm(cloudwatchAlarm: IResolvable) {
        cdkBuilder.cloudwatchAlarm(cloudwatchAlarm.let(IResolvable::unwrap))
      }

      override fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty) {
        cdkBuilder.cloudwatchAlarm(cloudwatchAlarm.let(CloudwatchAlarmActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e592d3b9ec58e1e6a0c9604f03fce76e7192a5c832a56e0e896e5aeb025c5136")
      override
          fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty.Builder.() -> Unit):
          Unit = cloudwatchAlarm(CloudwatchAlarmActionProperty(cloudwatchAlarm))

      override fun cloudwatchLogs(cloudwatchLogs: IResolvable) {
        cdkBuilder.cloudwatchLogs(cloudwatchLogs.let(IResolvable::unwrap))
      }

      override fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty) {
        cdkBuilder.cloudwatchLogs(cloudwatchLogs.let(CloudwatchLogsActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37203c2772fa460a8ea92b7903e38c1647bc9fcbe895603b7eb3a2a0c43dfa79")
      override fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty.Builder.() -> Unit):
          Unit = cloudwatchLogs(CloudwatchLogsActionProperty(cloudwatchLogs))

      override fun cloudwatchMetric(cloudwatchMetric: IResolvable) {
        cdkBuilder.cloudwatchMetric(cloudwatchMetric.let(IResolvable::unwrap))
      }

      override fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty) {
        cdkBuilder.cloudwatchMetric(cloudwatchMetric.let(CloudwatchMetricActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7cfa986986a53792b0900a5171b0568c06d1edd655a035e2f19aad202470c2a")
      override
          fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty.Builder.() -> Unit):
          Unit = cloudwatchMetric(CloudwatchMetricActionProperty(cloudwatchMetric))

      override fun dynamoDBv2(dynamoDBv2: IResolvable) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(IResolvable::unwrap))
      }

      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(DynamoDBv2ActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59e5c496cd867f4091324ec238030b2fb9ec9fc654ed368a653fc003d437c9a5")
      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty.Builder.() -> Unit): Unit =
          dynamoDBv2(DynamoDBv2ActionProperty(dynamoDBv2))

      override fun dynamoDb(dynamoDb: IResolvable) {
        cdkBuilder.dynamoDb(dynamoDb.let(IResolvable::unwrap))
      }

      override fun dynamoDb(dynamoDb: DynamoDBActionProperty) {
        cdkBuilder.dynamoDb(dynamoDb.let(DynamoDBActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be34cb6b6922328cc7edc8d1c4eebff91fc9f9fd2b7cb01f0f79d390cc9ce5")
      override fun dynamoDb(dynamoDb: DynamoDBActionProperty.Builder.() -> Unit): Unit =
          dynamoDb(DynamoDBActionProperty(dynamoDb))

      override fun elasticsearch(elasticsearch: IResolvable) {
        cdkBuilder.elasticsearch(elasticsearch.let(IResolvable::unwrap))
      }

      override fun elasticsearch(elasticsearch: ElasticsearchActionProperty) {
        cdkBuilder.elasticsearch(elasticsearch.let(ElasticsearchActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa7cc1ae368a49a852adba0360258b23811f6fedded9a3d4748262f4eb4bfd3f")
      override fun elasticsearch(elasticsearch: ElasticsearchActionProperty.Builder.() -> Unit):
          Unit = elasticsearch(ElasticsearchActionProperty(elasticsearch))

      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      override fun firehose(firehose: FirehoseActionProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf0e7fd3ce39622fd99c5ea349382388654df4b23aa29717914502b8f97096c5")
      override fun firehose(firehose: FirehoseActionProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseActionProperty(firehose))

      override fun http(http: IResolvable) {
        cdkBuilder.http(http.let(IResolvable::unwrap))
      }

      override fun http(http: HttpActionProperty) {
        cdkBuilder.http(http.let(HttpActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd0498a7b686ba06564c740ce89e23f940a59ace7c38c049d76591918aadf43")
      override fun http(http: HttpActionProperty.Builder.() -> Unit): Unit =
          http(HttpActionProperty(http))

      override fun iotAnalytics(iotAnalytics: IResolvable) {
        cdkBuilder.iotAnalytics(iotAnalytics.let(IResolvable::unwrap))
      }

      override fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty) {
        cdkBuilder.iotAnalytics(iotAnalytics.let(IotAnalyticsActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457c63ef720d0825a43120a82e6d8743fa21e8392302a073ddf53384a50201f7")
      override fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty.Builder.() -> Unit): Unit =
          iotAnalytics(IotAnalyticsActionProperty(iotAnalytics))

      override fun iotEvents(iotEvents: IResolvable) {
        cdkBuilder.iotEvents(iotEvents.let(IResolvable::unwrap))
      }

      override fun iotEvents(iotEvents: IotEventsActionProperty) {
        cdkBuilder.iotEvents(iotEvents.let(IotEventsActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a42cc3ccec03511269f99cb9dc4b2de9d9669b9ca612f5d231c217cdc01d770")
      override fun iotEvents(iotEvents: IotEventsActionProperty.Builder.() -> Unit): Unit =
          iotEvents(IotEventsActionProperty(iotEvents))

      override fun iotSiteWise(iotSiteWise: IResolvable) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IResolvable::unwrap))
      }

      override fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IotSiteWiseActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c67675f0ded26c01b390afff37e4fbbe386d71d0bc05069dfe0909718ff796b")
      override fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty.Builder.() -> Unit): Unit =
          iotSiteWise(IotSiteWiseActionProperty(iotSiteWise))

      override fun kafka(kafka: IResolvable) {
        cdkBuilder.kafka(kafka.let(IResolvable::unwrap))
      }

      override fun kafka(kafka: KafkaActionProperty) {
        cdkBuilder.kafka(kafka.let(KafkaActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bd0041398399948a6a91cc4beb5c27a2b10c383f2ccc058316107110812a17")
      override fun kafka(kafka: KafkaActionProperty.Builder.() -> Unit): Unit =
          kafka(KafkaActionProperty(kafka))

      override fun kinesis(kinesis: IResolvable) {
        cdkBuilder.kinesis(kinesis.let(IResolvable::unwrap))
      }

      override fun kinesis(kinesis: KinesisActionProperty) {
        cdkBuilder.kinesis(kinesis.let(KinesisActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7829c2788742161736c7f4f276d2c9ca4a8eb7adc4f0983c9b15a000b1af250e")
      override fun kinesis(kinesis: KinesisActionProperty.Builder.() -> Unit): Unit =
          kinesis(KinesisActionProperty(kinesis))

      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      override fun lambda(lambda: LambdaActionProperty) {
        cdkBuilder.lambda(lambda.let(LambdaActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cb07553eb70f94d4d0741a88ca3bf21fbdb63c177f55b6d47112f90ea9de592")
      override fun lambda(lambda: LambdaActionProperty.Builder.() -> Unit): Unit =
          lambda(LambdaActionProperty(lambda))

      override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable::unwrap))
      }

      override fun location(location: LocationActionProperty) {
        cdkBuilder.location(location.let(LocationActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40860c30d9f2428b1ebab0ef4f21b8fc9a5b0ad8ed070f880cc170ac5e542dcc")
      override fun location(location: LocationActionProperty.Builder.() -> Unit): Unit =
          location(LocationActionProperty(location))

      override fun openSearch(openSearch: IResolvable) {
        cdkBuilder.openSearch(openSearch.let(IResolvable::unwrap))
      }

      override fun openSearch(openSearch: OpenSearchActionProperty) {
        cdkBuilder.openSearch(openSearch.let(OpenSearchActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff32f288dfb924554d6db1aacfcaa2e6b841f8bceae2eb25250c046ba5a2bcd0")
      override fun openSearch(openSearch: OpenSearchActionProperty.Builder.() -> Unit): Unit =
          openSearch(OpenSearchActionProperty(openSearch))

      override fun republish(republish: IResolvable) {
        cdkBuilder.republish(republish.let(IResolvable::unwrap))
      }

      override fun republish(republish: RepublishActionProperty) {
        cdkBuilder.republish(republish.let(RepublishActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cff4c9f4f165e6ebf8a1d92707200697b7936100cf640c266bfed5c64224cbc7")
      override fun republish(republish: RepublishActionProperty.Builder.() -> Unit): Unit =
          republish(RepublishActionProperty(republish))

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: S3ActionProperty) {
        cdkBuilder.s3(s3.let(S3ActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070c5e2e998b45e02dc2bc514fafd0dce57030732a785f0655bf84f88530e751")
      override fun s3(s3: S3ActionProperty.Builder.() -> Unit): Unit = s3(S3ActionProperty(s3))

      override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      override fun sns(sns: SnsActionProperty) {
        cdkBuilder.sns(sns.let(SnsActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e336860db8f9171bd843c395083b15e06f348ab6ee03e7aadbb37d2b1f5c7c50")
      override fun sns(sns: SnsActionProperty.Builder.() -> Unit): Unit =
          sns(SnsActionProperty(sns))

      override fun sqs(sqs: IResolvable) {
        cdkBuilder.sqs(sqs.let(IResolvable::unwrap))
      }

      override fun sqs(sqs: SqsActionProperty) {
        cdkBuilder.sqs(sqs.let(SqsActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57ea076cdbbf86399719493cb0eaff62871072cc1f057effda768eae4871d465")
      override fun sqs(sqs: SqsActionProperty.Builder.() -> Unit): Unit =
          sqs(SqsActionProperty(sqs))

      override fun stepFunctions(stepFunctions: IResolvable) {
        cdkBuilder.stepFunctions(stepFunctions.let(IResolvable::unwrap))
      }

      override fun stepFunctions(stepFunctions: StepFunctionsActionProperty) {
        cdkBuilder.stepFunctions(stepFunctions.let(StepFunctionsActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661d098ed0c8cb1e4cc86437072deacf3e3c1f01ef261b1d6f2b9cab7d110c3a")
      override fun stepFunctions(stepFunctions: StepFunctionsActionProperty.Builder.() -> Unit):
          Unit = stepFunctions(StepFunctionsActionProperty(stepFunctions))

      override fun timestream(timestream: IResolvable) {
        cdkBuilder.timestream(timestream.let(IResolvable::unwrap))
      }

      override fun timestream(timestream: TimestreamActionProperty) {
        cdkBuilder.timestream(timestream.let(TimestreamActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4706a162d3bb7a739fa4cf959252e7009c2f91e0d18e6ea13b7c4f1d153f8a83")
      override fun timestream(timestream: TimestreamActionProperty.Builder.() -> Unit): Unit =
          timestream(TimestreamActionProperty(timestream))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      override fun cloudwatchAlarm(): Any? = unwrap(this).getCloudwatchAlarm()

      override fun cloudwatchLogs(): Any? = unwrap(this).getCloudwatchLogs()

      override fun cloudwatchMetric(): Any? = unwrap(this).getCloudwatchMetric()

      override fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

      override fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

      override fun elasticsearch(): Any? = unwrap(this).getElasticsearch()

      override fun firehose(): Any? = unwrap(this).getFirehose()

      override fun http(): Any? = unwrap(this).getHttp()

      override fun iotAnalytics(): Any? = unwrap(this).getIotAnalytics()

      override fun iotEvents(): Any? = unwrap(this).getIotEvents()

      override fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

      override fun kafka(): Any? = unwrap(this).getKafka()

      override fun kinesis(): Any? = unwrap(this).getKinesis()

      override fun lambda(): Any? = unwrap(this).getLambda()

      override fun location(): Any? = unwrap(this).getLocation()

      override fun openSearch(): Any? = unwrap(this).getOpenSearch()

      override fun republish(): Any? = unwrap(this).getRepublish()

      override fun s3(): Any? = unwrap(this).getS3()

      override fun sns(): Any? = unwrap(this).getSns()

      override fun sqs(): Any? = unwrap(this).getSqs()

      override fun stepFunctions(): Any? = unwrap(this).getStepFunctions()

      override fun timestream(): Any? = unwrap(this).getTimestream()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty
    }
  }

  public interface KinesisActionProperty {
    public fun partitionKey(): String? = unwrap(this).getPartitionKey()

    public fun roleArn(): String

    public fun streamName(): String

    @CdkDslMarker
    public interface Builder {
      public fun partitionKey(partitionKey: String)

      public fun roleArn(roleArn: String)

      public fun streamName(streamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.builder()

      override fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty,
    ) : CdkObject(cdkObject), KinesisActionProperty {
      override fun partitionKey(): String? = unwrap(this).getPartitionKey()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun streamName(): String = unwrap(this).getStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty):
          KinesisActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty
    }
  }

  public interface RepublishActionHeadersProperty {
    public fun contentType(): String? = unwrap(this).getContentType()

    public fun correlationData(): String? = unwrap(this).getCorrelationData()

    public fun messageExpiry(): String? = unwrap(this).getMessageExpiry()

    public fun payloadFormatIndicator(): String? = unwrap(this).getPayloadFormatIndicator()

    public fun responseTopic(): String? = unwrap(this).getResponseTopic()

    public fun userProperties(): Any? = unwrap(this).getUserProperties()

    @CdkDslMarker
    public interface Builder {
      public fun contentType(contentType: String)

      public fun correlationData(correlationData: String)

      public fun messageExpiry(messageExpiry: String)

      public fun payloadFormatIndicator(payloadFormatIndicator: String)

      public fun responseTopic(responseTopic: String)

      public fun userProperties(userProperties: IResolvable)

      public fun userProperties(userProperties: List<Any>)

      public fun userProperties(vararg userProperties: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty.builder()

      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      override fun correlationData(correlationData: String) {
        cdkBuilder.correlationData(correlationData)
      }

      override fun messageExpiry(messageExpiry: String) {
        cdkBuilder.messageExpiry(messageExpiry)
      }

      override fun payloadFormatIndicator(payloadFormatIndicator: String) {
        cdkBuilder.payloadFormatIndicator(payloadFormatIndicator)
      }

      override fun responseTopic(responseTopic: String) {
        cdkBuilder.responseTopic(responseTopic)
      }

      override fun userProperties(userProperties: IResolvable) {
        cdkBuilder.userProperties(userProperties.let(IResolvable::unwrap))
      }

      override fun userProperties(userProperties: List<Any>) {
        cdkBuilder.userProperties(userProperties)
      }

      override fun userProperties(vararg userProperties: Any): Unit =
          userProperties(userProperties.toList())

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty,
    ) : CdkObject(cdkObject), RepublishActionHeadersProperty {
      override fun contentType(): String? = unwrap(this).getContentType()

      override fun correlationData(): String? = unwrap(this).getCorrelationData()

      override fun messageExpiry(): String? = unwrap(this).getMessageExpiry()

      override fun payloadFormatIndicator(): String? = unwrap(this).getPayloadFormatIndicator()

      override fun responseTopic(): String? = unwrap(this).getResponseTopic()

      override fun userProperties(): Any? = unwrap(this).getUserProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepublishActionHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty):
          RepublishActionHeadersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepublishActionHeadersProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty
    }
  }

  public interface PutItemInputProperty {
    public fun tableName(): String

    @CdkDslMarker
    public interface Builder {
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.builder()

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty,
    ) : CdkObject(cdkObject), PutItemInputProperty {
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PutItemInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty):
          PutItemInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PutItemInputProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty
    }
  }

  public interface TopicRulePayloadProperty {
    public fun actions(): Any

    public fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

    public fun description(): String? = unwrap(this).getDescription()

    public fun errorAction(): Any? = unwrap(this).getErrorAction()

    public fun ruleDisabled(): Any? = unwrap(this).getRuleDisabled()

    public fun sql(): String

    @CdkDslMarker
    public interface Builder {
      public fun actions(actions: IResolvable)

      public fun actions(actions: List<Any>)

      public fun actions(vararg actions: Any)

      public fun awsIotSqlVersion(awsIotSqlVersion: String)

      public fun description(description: String)

      public fun errorAction(errorAction: IResolvable)

      public fun errorAction(errorAction: ActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6a7feef4f5e9d29bedaf3b8042ef7b2e98dd59465b5b31492cf2bd7ab98cab6")
      public fun errorAction(errorAction: ActionProperty.Builder.() -> Unit)

      public fun ruleDisabled(ruleDisabled: Boolean)

      public fun ruleDisabled(ruleDisabled: IResolvable)

      public fun sql(sql: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.builder()

      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      override fun awsIotSqlVersion(awsIotSqlVersion: String) {
        cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun errorAction(errorAction: IResolvable) {
        cdkBuilder.errorAction(errorAction.let(IResolvable::unwrap))
      }

      override fun errorAction(errorAction: ActionProperty) {
        cdkBuilder.errorAction(errorAction.let(ActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6a7feef4f5e9d29bedaf3b8042ef7b2e98dd59465b5b31492cf2bd7ab98cab6")
      override fun errorAction(errorAction: ActionProperty.Builder.() -> Unit): Unit =
          errorAction(ActionProperty(errorAction))

      override fun ruleDisabled(ruleDisabled: Boolean) {
        cdkBuilder.ruleDisabled(ruleDisabled)
      }

      override fun ruleDisabled(ruleDisabled: IResolvable) {
        cdkBuilder.ruleDisabled(ruleDisabled.let(IResolvable::unwrap))
      }

      override fun sql(sql: String) {
        cdkBuilder.sql(sql)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty,
    ) : CdkObject(cdkObject), TopicRulePayloadProperty {
      override fun actions(): Any = unwrap(this).getActions()

      override fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

      override fun description(): String? = unwrap(this).getDescription()

      override fun errorAction(): Any? = unwrap(this).getErrorAction()

      override fun ruleDisabled(): Any? = unwrap(this).getRuleDisabled()

      override fun sql(): String = unwrap(this).getSql()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicRulePayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty):
          TopicRulePayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicRulePayloadProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty
    }
  }

  public interface FirehoseActionProperty {
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    public fun deliveryStreamName(): String

    public fun roleArn(): String

    public fun separator(): String? = unwrap(this).getSeparator()

    @CdkDslMarker
    public interface Builder {
      public fun batchMode(batchMode: Boolean)

      public fun batchMode(batchMode: IResolvable)

      public fun deliveryStreamName(deliveryStreamName: String)

      public fun roleArn(roleArn: String)

      public fun separator(separator: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.builder()

      override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun separator(separator: String) {
        cdkBuilder.separator(separator)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty,
    ) : CdkObject(cdkObject), FirehoseActionProperty {
      override fun batchMode(): Any? = unwrap(this).getBatchMode()

      override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun separator(): String? = unwrap(this).getSeparator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty):
          FirehoseActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty
    }
  }

  public interface SqsActionProperty {
    public fun queueUrl(): String

    public fun roleArn(): String

    public fun useBase64(): Any? = unwrap(this).getUseBase64()

    @CdkDslMarker
    public interface Builder {
      public fun queueUrl(queueUrl: String)

      public fun roleArn(roleArn: String)

      public fun useBase64(useBase64: Boolean)

      public fun useBase64(useBase64: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.builder()

      override fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
      }

      override fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty,
    ) : CdkObject(cdkObject), SqsActionProperty {
      override fun queueUrl(): String = unwrap(this).getQueueUrl()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun useBase64(): Any? = unwrap(this).getUseBase64()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty):
          SqsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty
    }
  }

  public interface OpenSearchActionProperty {
    public fun endpoint(): String

    public fun id(): String

    public fun index(): String

    public fun roleArn(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun endpoint(endpoint: String)

      public fun id(id: String)

      public fun index(index: String)

      public fun roleArn(roleArn: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty.builder()

      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun index(index: String) {
        cdkBuilder.index(index)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty,
    ) : CdkObject(cdkObject), OpenSearchActionProperty {
      override fun endpoint(): String = unwrap(this).getEndpoint()

      override fun id(): String = unwrap(this).getId()

      override fun index(): String = unwrap(this).getIndex()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenSearchActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty):
          OpenSearchActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty
    }
  }

  public interface DynamoDBv2ActionProperty {
    public fun putItem(): Any? = unwrap(this).getPutItem()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun putItem(putItem: IResolvable)

      public fun putItem(putItem: PutItemInputProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617e1a58adc917f0156f89c39c5b6b961587d2e600c94285ba7a7cb84c4d68a1")
      public fun putItem(putItem: PutItemInputProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.builder()

      override fun putItem(putItem: IResolvable) {
        cdkBuilder.putItem(putItem.let(IResolvable::unwrap))
      }

      override fun putItem(putItem: PutItemInputProperty) {
        cdkBuilder.putItem(putItem.let(PutItemInputProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617e1a58adc917f0156f89c39c5b6b961587d2e600c94285ba7a7cb84c4d68a1")
      override fun putItem(putItem: PutItemInputProperty.Builder.() -> Unit): Unit =
          putItem(PutItemInputProperty(putItem))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty,
    ) : CdkObject(cdkObject), DynamoDBv2ActionProperty {
      override fun putItem(): Any? = unwrap(this).getPutItem()

      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBv2ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty):
          DynamoDBv2ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBv2ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty
    }
  }

  public interface KafkaActionProperty {
    public fun clientProperties(): Any

    public fun destinationArn(): String

    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun key(): String? = unwrap(this).getKey()

    public fun partition(): String? = unwrap(this).getPartition()

    public fun topic(): String

    @CdkDslMarker
    public interface Builder {
      public fun clientProperties(clientProperties: IResolvable)

      public fun clientProperties(clientProperties: Map<String, String>)

      public fun destinationArn(destinationArn: String)

      public fun headers(headers: IResolvable)

      public fun headers(headers: List<Any>)

      public fun headers(vararg headers: Any)

      public fun key(key: String)

      public fun partition(partition: String)

      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty.builder()

      override fun clientProperties(clientProperties: IResolvable) {
        cdkBuilder.clientProperties(clientProperties.let(IResolvable::unwrap))
      }

      override fun clientProperties(clientProperties: Map<String, String>) {
        cdkBuilder.clientProperties(clientProperties)
      }

      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      override fun headers(vararg headers: Any): Unit = headers(headers.toList())

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun partition(partition: String) {
        cdkBuilder.partition(partition)
      }

      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty,
    ) : CdkObject(cdkObject), KafkaActionProperty {
      override fun clientProperties(): Any = unwrap(this).getClientProperties()

      override fun destinationArn(): String = unwrap(this).getDestinationArn()

      override fun headers(): Any? = unwrap(this).getHeaders()

      override fun key(): String? = unwrap(this).getKey()

      override fun partition(): String? = unwrap(this).getPartition()

      override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty):
          KafkaActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty
    }
  }

  public interface CloudwatchLogsActionProperty {
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    public fun logGroupName(): String

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun batchMode(batchMode: Boolean)

      public fun batchMode(batchMode: IResolvable)

      public fun logGroupName(logGroupName: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty.builder()

      override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty,
    ) : CdkObject(cdkObject), CloudwatchLogsActionProperty {
      override fun batchMode(): Any? = unwrap(this).getBatchMode()

      override fun logGroupName(): String = unwrap(this).getLogGroupName()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchLogsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty):
          CloudwatchLogsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchLogsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty
    }
  }

  public interface PutAssetPropertyValueEntryProperty {
    public fun assetId(): String? = unwrap(this).getAssetId()

    public fun entryId(): String? = unwrap(this).getEntryId()

    public fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

    public fun propertyId(): String? = unwrap(this).getPropertyId()

    public fun propertyValues(): Any

    @CdkDslMarker
    public interface Builder {
      public fun assetId(assetId: String)

      public fun entryId(entryId: String)

      public fun propertyAlias(propertyAlias: String)

      public fun propertyId(propertyId: String)

      public fun propertyValues(propertyValues: IResolvable)

      public fun propertyValues(propertyValues: List<Any>)

      public fun propertyValues(vararg propertyValues: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty.builder()

      override fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
      }

      override fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
      }

      override fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
      }

      override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      override fun propertyValues(propertyValues: IResolvable) {
        cdkBuilder.propertyValues(propertyValues.let(IResolvable::unwrap))
      }

      override fun propertyValues(propertyValues: List<Any>) {
        cdkBuilder.propertyValues(propertyValues)
      }

      override fun propertyValues(vararg propertyValues: Any): Unit =
          propertyValues(propertyValues.toList())

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty,
    ) : CdkObject(cdkObject), PutAssetPropertyValueEntryProperty {
      override fun assetId(): String? = unwrap(this).getAssetId()

      override fun entryId(): String? = unwrap(this).getEntryId()

      override fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

      override fun propertyId(): String? = unwrap(this).getPropertyId()

      override fun propertyValues(): Any = unwrap(this).getPropertyValues()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty
    }
  }

  public interface AssetPropertyTimestampProperty {
    public fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

    public fun timeInSeconds(): String

    @CdkDslMarker
    public interface Builder {
      public fun offsetInNanos(offsetInNanos: String)

      public fun timeInSeconds(timeInSeconds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty.builder()

      override fun offsetInNanos(offsetInNanos: String) {
        cdkBuilder.offsetInNanos(offsetInNanos)
      }

      override fun timeInSeconds(timeInSeconds: String) {
        cdkBuilder.timeInSeconds(timeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty,
    ) : CdkObject(cdkObject), AssetPropertyTimestampProperty {
      override fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

      override fun timeInSeconds(): String = unwrap(this).getTimeInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty):
          AssetPropertyTimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyTimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty
    }
  }

  public interface CloudwatchAlarmActionProperty {
    public fun alarmName(): String

    public fun roleArn(): String

    public fun stateReason(): String

    public fun stateValue(): String

    @CdkDslMarker
    public interface Builder {
      public fun alarmName(alarmName: String)

      public fun roleArn(roleArn: String)

      public fun stateReason(stateReason: String)

      public fun stateValue(stateValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.builder()

      override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun stateReason(stateReason: String) {
        cdkBuilder.stateReason(stateReason)
      }

      override fun stateValue(stateValue: String) {
        cdkBuilder.stateValue(stateValue)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty,
    ) : CdkObject(cdkObject), CloudwatchAlarmActionProperty {
      override fun alarmName(): String = unwrap(this).getAlarmName()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun stateReason(): String = unwrap(this).getStateReason()

      override fun stateValue(): String = unwrap(this).getStateValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchAlarmActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty):
          CloudwatchAlarmActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchAlarmActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty
    }
  }

  public interface RepublishActionProperty {
    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun qos(): Number? = unwrap(this).getQos()

    public fun roleArn(): String

    public fun topic(): String

    @CdkDslMarker
    public interface Builder {
      public fun headers(headers: IResolvable)

      public fun headers(headers: RepublishActionHeadersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8509a5f5d564844fd60f047bc4e233b3c06ba3e5ce62199852b89ecc6e93d827")
      public fun headers(headers: RepublishActionHeadersProperty.Builder.() -> Unit)

      public fun qos(qos: Number)

      public fun roleArn(roleArn: String)

      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.builder()

      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      override fun headers(headers: RepublishActionHeadersProperty) {
        cdkBuilder.headers(headers.let(RepublishActionHeadersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8509a5f5d564844fd60f047bc4e233b3c06ba3e5ce62199852b89ecc6e93d827")
      override fun headers(headers: RepublishActionHeadersProperty.Builder.() -> Unit): Unit =
          headers(RepublishActionHeadersProperty(headers))

      override fun qos(qos: Number) {
        cdkBuilder.qos(qos)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty,
    ) : CdkObject(cdkObject), RepublishActionProperty {
      override fun headers(): Any? = unwrap(this).getHeaders()

      override fun qos(): Number? = unwrap(this).getQos()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepublishActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty):
          RepublishActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepublishActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun hashKeyField(hashKeyField: String)

      public fun hashKeyType(hashKeyType: String)

      public fun hashKeyValue(hashKeyValue: String)

      public fun payloadField(payloadField: String)

      public fun rangeKeyField(rangeKeyField: String)

      public fun rangeKeyType(rangeKeyType: String)

      public fun rangeKeyValue(rangeKeyValue: String)

      public fun roleArn(roleArn: String)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.builder()

      override fun hashKeyField(hashKeyField: String) {
        cdkBuilder.hashKeyField(hashKeyField)
      }

      override fun hashKeyType(hashKeyType: String) {
        cdkBuilder.hashKeyType(hashKeyType)
      }

      override fun hashKeyValue(hashKeyValue: String) {
        cdkBuilder.hashKeyValue(hashKeyValue)
      }

      override fun payloadField(payloadField: String) {
        cdkBuilder.payloadField(payloadField)
      }

      override fun rangeKeyField(rangeKeyField: String) {
        cdkBuilder.rangeKeyField(rangeKeyField)
      }

      override fun rangeKeyType(rangeKeyType: String) {
        cdkBuilder.rangeKeyType(rangeKeyType)
      }

      override fun rangeKeyValue(rangeKeyValue: String) {
        cdkBuilder.rangeKeyValue(rangeKeyValue)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty,
    ) : CdkObject(cdkObject), DynamoDBActionProperty {
      override fun hashKeyField(): String = unwrap(this).getHashKeyField()

      override fun hashKeyType(): String? = unwrap(this).getHashKeyType()

      override fun hashKeyValue(): String = unwrap(this).getHashKeyValue()

      override fun payloadField(): String? = unwrap(this).getPayloadField()

      override fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

      override fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

      override fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty):
          DynamoDBActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty
    }
  }

  public interface SigV4AuthorizationProperty {
    public fun roleArn(): String

    public fun serviceName(): String

    public fun signingRegion(): String

    @CdkDslMarker
    public interface Builder {
      public fun roleArn(roleArn: String)

      public fun serviceName(serviceName: String)

      public fun signingRegion(signingRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      override fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty,
    ) : CdkObject(cdkObject), SigV4AuthorizationProperty {
      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun serviceName(): String = unwrap(this).getServiceName()

      override fun signingRegion(): String = unwrap(this).getSigningRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SigV4AuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty):
          SigV4AuthorizationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SigV4AuthorizationProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty
    }
  }

  public interface HttpActionProperty {
    public fun auth(): Any? = unwrap(this).getAuth()

    public fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()

    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun url(): String

    @CdkDslMarker
    public interface Builder {
      public fun auth(auth: IResolvable)

      public fun auth(auth: HttpAuthorizationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe1895bf141ae6e75841bc4fb2d18f1438b51afa1677a87e878f530a0d045f1d")
      public fun auth(auth: HttpAuthorizationProperty.Builder.() -> Unit)

      public fun confirmationUrl(confirmationUrl: String)

      public fun headers(headers: IResolvable)

      public fun headers(headers: List<Any>)

      public fun headers(vararg headers: Any)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty.builder()

      override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      override fun auth(auth: HttpAuthorizationProperty) {
        cdkBuilder.auth(auth.let(HttpAuthorizationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe1895bf141ae6e75841bc4fb2d18f1438b51afa1677a87e878f530a0d045f1d")
      override fun auth(auth: HttpAuthorizationProperty.Builder.() -> Unit): Unit =
          auth(HttpAuthorizationProperty(auth))

      override fun confirmationUrl(confirmationUrl: String) {
        cdkBuilder.confirmationUrl(confirmationUrl)
      }

      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      override fun headers(vararg headers: Any): Unit = headers(headers.toList())

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty,
    ) : CdkObject(cdkObject), HttpActionProperty {
      override fun auth(): Any? = unwrap(this).getAuth()

      override fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()

      override fun headers(): Any? = unwrap(this).getHeaders()

      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty):
          HttpActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty
    }
  }

  public interface IotSiteWiseActionProperty {
    public fun putAssetPropertyValueEntries(): Any

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable)

      public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: List<Any>)

      public fun putAssetPropertyValueEntries(vararg putAssetPropertyValueEntries: Any)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty.builder()

      override fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable) {
        cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries.let(IResolvable::unwrap))
      }

      override fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: List<Any>) {
        cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries)
      }

      override fun putAssetPropertyValueEntries(vararg putAssetPropertyValueEntries: Any): Unit =
          putAssetPropertyValueEntries(putAssetPropertyValueEntries.toList())

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty,
    ) : CdkObject(cdkObject), IotSiteWiseActionProperty {
      override fun putAssetPropertyValueEntries(): Any =
          unwrap(this).getPutAssetPropertyValueEntries()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotSiteWiseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty):
          IotSiteWiseActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotSiteWiseActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty
    }
  }

  public interface AssetPropertyValueProperty {
    public fun quality(): String? = unwrap(this).getQuality()

    public fun timestamp(): Any

    public fun `value`(): Any

    @CdkDslMarker
    public interface Builder {
      public fun quality(quality: String)

      public fun timestamp(timestamp: IResolvable)

      public fun timestamp(timestamp: AssetPropertyTimestampProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe07339b680ef5ffed57cc0c78abbc32650de3539ddbd5dae20830ebdc53cefc")
      public fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: AssetPropertyVariantProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc81754749f6a006f434cdbdacbaee93a5a433ffebfb388b8cd34c86c41bcc8")
      public fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty.builder()

      override fun quality(quality: String) {
        cdkBuilder.quality(quality)
      }

      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      override fun timestamp(timestamp: AssetPropertyTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(AssetPropertyTimestampProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe07339b680ef5ffed57cc0c78abbc32650de3539ddbd5dae20830ebdc53cefc")
      override fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit): Unit =
          timestamp(AssetPropertyTimestampProperty(timestamp))

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: AssetPropertyVariantProperty) {
        cdkBuilder.`value`(`value`.let(AssetPropertyVariantProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc81754749f6a006f434cdbdacbaee93a5a433ffebfb388b8cd34c86c41bcc8")
      override fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit): Unit =
          `value`(AssetPropertyVariantProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty,
    ) : CdkObject(cdkObject), AssetPropertyValueProperty {
      override fun quality(): String? = unwrap(this).getQuality()

      override fun timestamp(): Any = unwrap(this).getTimestamp()

      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty):
          AssetPropertyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyValueProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty
    }
  }

  public interface StepFunctionsActionProperty {
    public fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

    public fun roleArn(): String

    public fun stateMachineName(): String

    @CdkDslMarker
    public interface Builder {
      public fun executionNamePrefix(executionNamePrefix: String)

      public fun roleArn(roleArn: String)

      public fun stateMachineName(stateMachineName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.builder()

      override fun executionNamePrefix(executionNamePrefix: String) {
        cdkBuilder.executionNamePrefix(executionNamePrefix)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty,
    ) : CdkObject(cdkObject), StepFunctionsActionProperty {
      override fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun stateMachineName(): String = unwrap(this).getStateMachineName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty):
          StepFunctionsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepFunctionsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty
    }
  }

  public interface HttpAuthorizationProperty {
    public fun sigv4(): Any? = unwrap(this).getSigv4()

    @CdkDslMarker
    public interface Builder {
      public fun sigv4(sigv4: IResolvable)

      public fun sigv4(sigv4: SigV4AuthorizationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e279999b2f49cd3bcdd0ef07fb0e9971e7dca036f7344431f823ed7f5b7355fd")
      public fun sigv4(sigv4: SigV4AuthorizationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty.builder()

      override fun sigv4(sigv4: IResolvable) {
        cdkBuilder.sigv4(sigv4.let(IResolvable::unwrap))
      }

      override fun sigv4(sigv4: SigV4AuthorizationProperty) {
        cdkBuilder.sigv4(sigv4.let(SigV4AuthorizationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e279999b2f49cd3bcdd0ef07fb0e9971e7dca036f7344431f823ed7f5b7355fd")
      override fun sigv4(sigv4: SigV4AuthorizationProperty.Builder.() -> Unit): Unit =
          sigv4(SigV4AuthorizationProperty(sigv4))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty,
    ) : CdkObject(cdkObject), HttpAuthorizationProperty {
      override fun sigv4(): Any? = unwrap(this).getSigv4()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpAuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty):
          HttpAuthorizationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpAuthorizationProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty
    }
  }

  public interface IotEventsActionProperty {
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    public fun inputName(): String

    public fun messageId(): String? = unwrap(this).getMessageId()

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun batchMode(batchMode: Boolean)

      public fun batchMode(batchMode: IResolvable)

      public fun inputName(inputName: String)

      public fun messageId(messageId: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty.builder()

      override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      override fun messageId(messageId: String) {
        cdkBuilder.messageId(messageId)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty,
    ) : CdkObject(cdkObject), IotEventsActionProperty {
      override fun batchMode(): Any? = unwrap(this).getBatchMode()

      override fun inputName(): String = unwrap(this).getInputName()

      override fun messageId(): String? = unwrap(this).getMessageId()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotEventsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty):
          IotEventsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotEventsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty
    }
  }

  public interface IotAnalyticsActionProperty {
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    public fun channelName(): String

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun batchMode(batchMode: Boolean)

      public fun batchMode(batchMode: IResolvable)

      public fun channelName(channelName: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.builder()

      override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      override fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty,
    ) : CdkObject(cdkObject), IotAnalyticsActionProperty {
      override fun batchMode(): Any? = unwrap(this).getBatchMode()

      override fun channelName(): String = unwrap(this).getChannelName()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotAnalyticsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty):
          IotAnalyticsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotAnalyticsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty
    }
  }

  public interface TimestreamTimestampProperty {
    public fun unit(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun unit(unit: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty.builder()

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty,
    ) : CdkObject(cdkObject), TimestreamTimestampProperty {
      override fun unit(): String = unwrap(this).getUnit()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty):
          TimestreamTimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamTimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty
    }
  }

  public interface AssetPropertyVariantProperty {
    public fun booleanValue(): String? = unwrap(this).getBooleanValue()

    public fun doubleValue(): String? = unwrap(this).getDoubleValue()

    public fun integerValue(): String? = unwrap(this).getIntegerValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    @CdkDslMarker
    public interface Builder {
      public fun booleanValue(booleanValue: String)

      public fun doubleValue(doubleValue: String)

      public fun integerValue(integerValue: String)

      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty.builder()

      override fun booleanValue(booleanValue: String) {
        cdkBuilder.booleanValue(booleanValue)
      }

      override fun doubleValue(doubleValue: String) {
        cdkBuilder.doubleValue(doubleValue)
      }

      override fun integerValue(integerValue: String) {
        cdkBuilder.integerValue(integerValue)
      }

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty,
    ) : CdkObject(cdkObject), AssetPropertyVariantProperty {
      override fun booleanValue(): String? = unwrap(this).getBooleanValue()

      override fun doubleValue(): String? = unwrap(this).getDoubleValue()

      override fun integerValue(): String? = unwrap(this).getIntegerValue()

      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty):
          AssetPropertyVariantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyVariantProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty
    }
  }

  public interface UserPropertyProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty,
    ) : CdkObject(cdkObject), UserPropertyProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty):
          UserPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPropertyProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty
    }
  }

  public interface HttpActionHeaderProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty,
    ) : CdkObject(cdkObject), HttpActionHeaderProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpActionHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty):
          HttpActionHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpActionHeaderProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty
    }
  }

  public interface SnsActionProperty {
    public fun messageFormat(): String? = unwrap(this).getMessageFormat()

    public fun roleArn(): String

    public fun targetArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun messageFormat(messageFormat: String)

      public fun roleArn(roleArn: String)

      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.builder()

      override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty,
    ) : CdkObject(cdkObject), SnsActionProperty {
      override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun targetArn(): String = unwrap(this).getTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty):
          SnsActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty
    }
  }

  public interface LocationActionProperty {
    public fun deviceId(): String

    public fun latitude(): String

    public fun longitude(): String

    public fun roleArn(): String

    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    public fun trackerName(): String

    @CdkDslMarker
    public interface Builder {
      public fun deviceId(deviceId: String)

      public fun latitude(latitude: String)

      public fun longitude(longitude: String)

      public fun roleArn(roleArn: String)

      public fun timestamp(timestamp: IResolvable)

      public fun timestamp(timestamp: TimestampProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cdab211b27fd2b48d7d3ca9c417d32fd12c724ef5c66ee4e70518fb7204e6e")
      public fun timestamp(timestamp: TimestampProperty.Builder.() -> Unit)

      public fun trackerName(trackerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty.builder()

      override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      override fun timestamp(timestamp: TimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(TimestampProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cdab211b27fd2b48d7d3ca9c417d32fd12c724ef5c66ee4e70518fb7204e6e")
      override fun timestamp(timestamp: TimestampProperty.Builder.() -> Unit): Unit =
          timestamp(TimestampProperty(timestamp))

      override fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty,
    ) : CdkObject(cdkObject), LocationActionProperty {
      override fun deviceId(): String = unwrap(this).getDeviceId()

      override fun latitude(): String = unwrap(this).getLatitude()

      override fun longitude(): String = unwrap(this).getLongitude()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun timestamp(): Any? = unwrap(this).getTimestamp()

      override fun trackerName(): String = unwrap(this).getTrackerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty):
          LocationActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty
    }
  }

  public interface S3ActionProperty {
    public fun bucketName(): String

    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    public fun key(): String

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun cannedAcl(cannedAcl: String)

      public fun key(key: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty,
    ) : CdkObject(cdkObject), S3ActionProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun cannedAcl(): String? = unwrap(this).getCannedAcl()

      override fun key(): String = unwrap(this).getKey()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty):
          S3ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty
    }
  }

  public interface TimestampProperty {
    public fun unit(): String? = unwrap(this).getUnit()

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun unit(unit: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty.builder()

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty,
    ) : CdkObject(cdkObject), TimestampProperty {
      override fun unit(): String? = unwrap(this).getUnit()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty):
          TimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty
    }
  }

  public interface CloudwatchMetricActionProperty {
    public fun metricName(): String

    public fun metricNamespace(): String

    public fun metricTimestamp(): String? = unwrap(this).getMetricTimestamp()

    public fun metricUnit(): String

    public fun metricValue(): String

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun metricName(metricName: String)

      public fun metricNamespace(metricNamespace: String)

      public fun metricTimestamp(metricTimestamp: String)

      public fun metricUnit(metricUnit: String)

      public fun metricValue(metricValue: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.builder()

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun metricNamespace(metricNamespace: String) {
        cdkBuilder.metricNamespace(metricNamespace)
      }

      override fun metricTimestamp(metricTimestamp: String) {
        cdkBuilder.metricTimestamp(metricTimestamp)
      }

      override fun metricUnit(metricUnit: String) {
        cdkBuilder.metricUnit(metricUnit)
      }

      override fun metricValue(metricValue: String) {
        cdkBuilder.metricValue(metricValue)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty,
    ) : CdkObject(cdkObject), CloudwatchMetricActionProperty {
      override fun metricName(): String = unwrap(this).getMetricName()

      override fun metricNamespace(): String = unwrap(this).getMetricNamespace()

      override fun metricTimestamp(): String? = unwrap(this).getMetricTimestamp()

      override fun metricUnit(): String = unwrap(this).getMetricUnit()

      override fun metricValue(): String = unwrap(this).getMetricValue()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchMetricActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty):
          CloudwatchMetricActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchMetricActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty
    }
  }

  public interface TimestreamActionProperty {
    public fun databaseName(): String

    public fun dimensions(): Any

    public fun roleArn(): String

    public fun tableName(): String

    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    @CdkDslMarker
    public interface Builder {
      public fun databaseName(databaseName: String)

      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun dimensions(vararg dimensions: Any)

      public fun roleArn(roleArn: String)

      public fun tableName(tableName: String)

      public fun timestamp(timestamp: IResolvable)

      public fun timestamp(timestamp: TimestreamTimestampProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d60eeb5a833c96c0d04ddc520b572e847b707ad1b16fb1d0b9670ae5edd658")
      public fun timestamp(timestamp: TimestreamTimestampProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty.builder()

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      override fun timestamp(timestamp: TimestreamTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(TimestreamTimestampProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d60eeb5a833c96c0d04ddc520b572e847b707ad1b16fb1d0b9670ae5edd658")
      override fun timestamp(timestamp: TimestreamTimestampProperty.Builder.() -> Unit): Unit =
          timestamp(TimestreamTimestampProperty(timestamp))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty,
    ) : CdkObject(cdkObject), TimestreamActionProperty {
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun dimensions(): Any = unwrap(this).getDimensions()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun tableName(): String = unwrap(this).getTableName()

      override fun timestamp(): Any? = unwrap(this).getTimestamp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty):
          TimestreamActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty
    }
  }

  public interface LambdaActionProperty {
    public fun functionArn(): String? = unwrap(this).getFunctionArn()

    @CdkDslMarker
    public interface Builder {
      public fun functionArn(functionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.builder()

      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty,
    ) : CdkObject(cdkObject), LambdaActionProperty {
      override fun functionArn(): String? = unwrap(this).getFunctionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty):
          LambdaActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty
    }
  }

  public interface ElasticsearchActionProperty {
    public fun endpoint(): String

    public fun id(): String

    public fun index(): String

    public fun roleArn(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun endpoint(endpoint: String)

      public fun id(id: String)

      public fun index(index: String)

      public fun roleArn(roleArn: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.builder()

      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun index(index: String) {
        cdkBuilder.index(index)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty,
    ) : CdkObject(cdkObject), ElasticsearchActionProperty {
      override fun endpoint(): String = unwrap(this).getEndpoint()

      override fun id(): String = unwrap(this).getId()

      override fun index(): String = unwrap(this).getIndex()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticsearchActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty):
          ElasticsearchActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty
    }
  }
}
