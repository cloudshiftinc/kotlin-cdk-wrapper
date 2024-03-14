package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTopic internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sns.CfnTopic,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun archivePolicy(): Any? = unwrap(this).getArchivePolicy()

  public open fun archivePolicy(`value`: Any) {
    unwrap(this).setArchivePolicy(`value`)
  }

  public open fun attrTopicArn(): String = unwrap(this).getAttrTopicArn()

  public open fun attrTopicName(): String = unwrap(this).getAttrTopicName()

  public open fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

  public open fun contentBasedDeduplication(`value`: Boolean) {
    unwrap(this).setContentBasedDeduplication(`value`)
  }

  public open fun contentBasedDeduplication(`value`: IResolvable) {
    unwrap(this).setContentBasedDeduplication(`value`.let(IResolvable::unwrap))
  }

  public open fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

  public open fun dataProtectionPolicy(`value`: Any) {
    unwrap(this).setDataProtectionPolicy(`value`)
  }

  public open fun deliveryStatusLogging(): Any? = unwrap(this).getDeliveryStatusLogging()

  public open fun deliveryStatusLogging(`value`: IResolvable) {
    unwrap(this).setDeliveryStatusLogging(`value`.let(IResolvable::unwrap))
  }

  public open fun deliveryStatusLogging(__idx_ac66f0: List<Any>) {
    unwrap(this).setDeliveryStatusLogging(__idx_ac66f0)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public open fun fifoTopic(): Any? = unwrap(this).getFifoTopic()

  public open fun fifoTopic(`value`: Boolean) {
    unwrap(this).setFifoTopic(`value`)
  }

  public open fun fifoTopic(`value`: IResolvable) {
    unwrap(this).setFifoTopic(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

  public open fun kmsMasterKeyId(`value`: String) {
    unwrap(this).setKmsMasterKeyId(`value`)
  }

  public open fun signatureVersion(): String? = unwrap(this).getSignatureVersion()

  public open fun signatureVersion(`value`: String) {
    unwrap(this).setSignatureVersion(`value`)
  }

  public open fun subscription(): Any? = unwrap(this).getSubscription()

  public open fun subscription(`value`: IResolvable) {
    unwrap(this).setSubscription(`value`.let(IResolvable::unwrap))
  }

  public open fun subscription(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubscription(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun topicName(): String? = unwrap(this).getTopicName()

  public open fun topicName(`value`: String) {
    unwrap(this).setTopicName(`value`)
  }

  public open fun tracingConfig(): String? = unwrap(this).getTracingConfig()

  public open fun tracingConfig(`value`: String) {
    unwrap(this).setTracingConfig(`value`)
  }

  public interface Builder {
    public fun archivePolicy(archivePolicy: Any) {
    }

    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
    }

    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
    }

    public fun dataProtectionPolicy(dataProtectionPolicy: Any) {
    }

    public fun deliveryStatusLogging(deliveryStatusLogging: IResolvable) {
    }

    public fun deliveryStatusLogging(deliveryStatusLogging: List<Any>) {
    }

    public fun displayName(displayName: String) {
    }

    public fun fifoTopic(fifoTopic: Boolean) {
    }

    public fun fifoTopic(fifoTopic: IResolvable) {
    }

    public fun kmsMasterKeyId(kmsMasterKeyId: String) {
    }

    public fun signatureVersion(signatureVersion: String) {
    }

    public fun subscription(subscription: IResolvable) {
    }

    public fun subscription(subscription: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun topicName(topicName: String) {
    }

    public fun tracingConfig(tracingConfig: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopic.Builder =
        software.amazon.awscdk.services.sns.CfnTopic.Builder.create(scope, id)

    public override fun archivePolicy(archivePolicy: Any) {
      cdkBuilder.archivePolicy(archivePolicy)
    }

    public override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    public override fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication.let(IResolvable::unwrap))
    }

    public override fun dataProtectionPolicy(dataProtectionPolicy: Any) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    public override fun deliveryStatusLogging(deliveryStatusLogging: IResolvable) {
      cdkBuilder.deliveryStatusLogging(deliveryStatusLogging.let(IResolvable::unwrap))
    }

    public override fun deliveryStatusLogging(deliveryStatusLogging: List<Any>) {
      cdkBuilder.deliveryStatusLogging(deliveryStatusLogging)
    }

    public override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public override fun fifoTopic(fifoTopic: Boolean) {
      cdkBuilder.fifoTopic(fifoTopic)
    }

    public override fun fifoTopic(fifoTopic: IResolvable) {
      cdkBuilder.fifoTopic(fifoTopic.let(IResolvable::unwrap))
    }

    public override fun kmsMasterKeyId(kmsMasterKeyId: String) {
      cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    public override fun signatureVersion(signatureVersion: String) {
      cdkBuilder.signatureVersion(signatureVersion)
    }

    public override fun subscription(subscription: IResolvable) {
      cdkBuilder.subscription(subscription.let(IResolvable::unwrap))
    }

    public override fun subscription(subscription: List<Any>) {
      cdkBuilder.subscription(subscription)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun topicName(topicName: String) {
      cdkBuilder.topicName(topicName)
    }

    public override fun tracingConfig(tracingConfig: String) {
      cdkBuilder.tracingConfig(tracingConfig)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnTopic = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopic {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopic(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopic): CfnTopic =
        CfnTopic(cdkObject)

    internal fun unwrap(wrapped: CfnTopic): software.amazon.awscdk.services.sns.CfnTopic =
        wrapped.cdkObject
  }

  public interface LoggingConfigProperty {
    public fun failureFeedbackRoleArn(): String? = unwrap(this).getFailureFeedbackRoleArn()

    public fun protocol(): String

    public fun successFeedbackRoleArn(): String? = unwrap(this).getSuccessFeedbackRoleArn()

    public fun successFeedbackSampleRate(): String? = unwrap(this).getSuccessFeedbackSampleRate()

    public interface Builder {
      public fun failureFeedbackRoleArn(failureFeedbackRoleArn: String) {
      }

      public fun protocol(protocol: String) {
      }

      public fun successFeedbackRoleArn(successFeedbackRoleArn: String) {
      }

      public fun successFeedbackSampleRate(successFeedbackSampleRate: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty.Builder =
          software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty.builder()

      public override fun failureFeedbackRoleArn(failureFeedbackRoleArn: String) {
        cdkBuilder.failureFeedbackRoleArn(failureFeedbackRoleArn)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public override fun successFeedbackRoleArn(successFeedbackRoleArn: String) {
        cdkBuilder.successFeedbackRoleArn(successFeedbackRoleArn)
      }

      public override fun successFeedbackSampleRate(successFeedbackSampleRate: String) {
        cdkBuilder.successFeedbackSampleRate(successFeedbackSampleRate)
      }

      public fun build(): software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty,
    ) : LoggingConfigProperty {
      public override fun failureFeedbackRoleArn(): String? =
          unwrap(this).getFailureFeedbackRoleArn()

      public override fun protocol(): String = unwrap(this).getProtocol()

      public override fun successFeedbackRoleArn(): String? =
          unwrap(this).getSuccessFeedbackRoleArn()

      public override fun successFeedbackSampleRate(): String? =
          unwrap(this).getSuccessFeedbackSampleRate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty):
          LoggingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SubscriptionProperty {
    public fun endpoint(): String

    public fun protocol(): String

    public interface Builder {
      public fun endpoint(endpoint: String) {
      }

      public fun protocol(protocol: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder =
          software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.builder()

      public override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty,
    ) : SubscriptionProperty {
      public override fun endpoint(): String = unwrap(this).getEndpoint()

      public override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty):
          SubscriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionProperty):
          software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
