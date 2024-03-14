package io.cloudshiftdev.awscdk.services.sqs

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
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnQueue internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sqs.CfnQueue,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrQueueName(): String = unwrap(this).getAttrQueueName()

  public open fun attrQueueUrl(): String = unwrap(this).getAttrQueueUrl()

  public open fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

  public open fun contentBasedDeduplication(`value`: Boolean) {
    unwrap(this).setContentBasedDeduplication(`value`)
  }

  public open fun contentBasedDeduplication(`value`: IResolvable) {
    unwrap(this).setContentBasedDeduplication(`value`.let(IResolvable::unwrap))
  }

  public open fun deduplicationScope(): String? = unwrap(this).getDeduplicationScope()

  public open fun deduplicationScope(`value`: String) {
    unwrap(this).setDeduplicationScope(`value`)
  }

  public open fun delaySeconds(): Number? = unwrap(this).getDelaySeconds()

  public open fun delaySeconds(`value`: Number) {
    unwrap(this).setDelaySeconds(`value`)
  }

  public open fun fifoQueue(): Any? = unwrap(this).getFifoQueue()

  public open fun fifoQueue(`value`: Boolean) {
    unwrap(this).setFifoQueue(`value`)
  }

  public open fun fifoQueue(`value`: IResolvable) {
    unwrap(this).setFifoQueue(`value`.let(IResolvable::unwrap))
  }

  public open fun fifoThroughputLimit(): String? = unwrap(this).getFifoThroughputLimit()

  public open fun fifoThroughputLimit(`value`: String) {
    unwrap(this).setFifoThroughputLimit(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsDataKeyReusePeriodSeconds(): Number? =
      unwrap(this).getKmsDataKeyReusePeriodSeconds()

  public open fun kmsDataKeyReusePeriodSeconds(`value`: Number) {
    unwrap(this).setKmsDataKeyReusePeriodSeconds(`value`)
  }

  public open fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

  public open fun kmsMasterKeyId(`value`: String) {
    unwrap(this).setKmsMasterKeyId(`value`)
  }

  public open fun maximumMessageSize(): Number? = unwrap(this).getMaximumMessageSize()

  public open fun maximumMessageSize(`value`: Number) {
    unwrap(this).setMaximumMessageSize(`value`)
  }

  public open fun messageRetentionPeriod(): Number? = unwrap(this).getMessageRetentionPeriod()

  public open fun messageRetentionPeriod(`value`: Number) {
    unwrap(this).setMessageRetentionPeriod(`value`)
  }

  public open fun queueName(): String? = unwrap(this).getQueueName()

  public open fun queueName(`value`: String) {
    unwrap(this).setQueueName(`value`)
  }

  public open fun receiveMessageWaitTimeSeconds(): Number? =
      unwrap(this).getReceiveMessageWaitTimeSeconds()

  public open fun receiveMessageWaitTimeSeconds(`value`: Number) {
    unwrap(this).setReceiveMessageWaitTimeSeconds(`value`)
  }

  public open fun redriveAllowPolicy(): Any? = unwrap(this).getRedriveAllowPolicy()

  public open fun redriveAllowPolicy(`value`: Any) {
    unwrap(this).setRedriveAllowPolicy(`value`)
  }

  public open fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

  public open fun redrivePolicy(`value`: Any) {
    unwrap(this).setRedrivePolicy(`value`)
  }

  public open fun sqsManagedSseEnabled(): Any? = unwrap(this).getSqsManagedSseEnabled()

  public open fun sqsManagedSseEnabled(`value`: Boolean) {
    unwrap(this).setSqsManagedSseEnabled(`value`)
  }

  public open fun sqsManagedSseEnabled(`value`: IResolvable) {
    unwrap(this).setSqsManagedSseEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun visibilityTimeout(): Number? = unwrap(this).getVisibilityTimeout()

  public open fun visibilityTimeout(`value`: Number) {
    unwrap(this).setVisibilityTimeout(`value`)
  }

  public interface Builder {
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable)

    public fun deduplicationScope(deduplicationScope: String)

    public fun delaySeconds(delaySeconds: Number)

    public fun fifoQueue(fifoQueue: Boolean)

    public fun fifoQueue(fifoQueue: IResolvable)

    public fun fifoThroughputLimit(fifoThroughputLimit: String)

    public fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number)

    public fun kmsMasterKeyId(kmsMasterKeyId: String)

    public fun maximumMessageSize(maximumMessageSize: Number)

    public fun messageRetentionPeriod(messageRetentionPeriod: Number)

    public fun queueName(queueName: String)

    public fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number)

    public fun redriveAllowPolicy(redriveAllowPolicy: Any)

    public fun redrivePolicy(redrivePolicy: Any)

    public fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean)

    public fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun visibilityTimeout(visibilityTimeout: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueue.Builder =
        software.amazon.awscdk.services.sqs.CfnQueue.Builder.create(scope, id)

    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    override fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication.let(IResolvable::unwrap))
    }

    override fun deduplicationScope(deduplicationScope: String) {
      cdkBuilder.deduplicationScope(deduplicationScope)
    }

    override fun delaySeconds(delaySeconds: Number) {
      cdkBuilder.delaySeconds(delaySeconds)
    }

    override fun fifoQueue(fifoQueue: Boolean) {
      cdkBuilder.fifoQueue(fifoQueue)
    }

    override fun fifoQueue(fifoQueue: IResolvable) {
      cdkBuilder.fifoQueue(fifoQueue.let(IResolvable::unwrap))
    }

    override fun fifoThroughputLimit(fifoThroughputLimit: String) {
      cdkBuilder.fifoThroughputLimit(fifoThroughputLimit)
    }

    override fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number) {
      cdkBuilder.kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds)
    }

    override fun kmsMasterKeyId(kmsMasterKeyId: String) {
      cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    override fun maximumMessageSize(maximumMessageSize: Number) {
      cdkBuilder.maximumMessageSize(maximumMessageSize)
    }

    override fun messageRetentionPeriod(messageRetentionPeriod: Number) {
      cdkBuilder.messageRetentionPeriod(messageRetentionPeriod)
    }

    override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    override fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number) {
      cdkBuilder.receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds)
    }

    override fun redriveAllowPolicy(redriveAllowPolicy: Any) {
      cdkBuilder.redriveAllowPolicy(redriveAllowPolicy)
    }

    override fun redrivePolicy(redrivePolicy: Any) {
      cdkBuilder.redrivePolicy(redrivePolicy)
    }

    override fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean) {
      cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled)
    }

    override fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable) {
      cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun visibilityTimeout(visibilityTimeout: Number) {
      cdkBuilder.visibilityTimeout(visibilityTimeout)
    }

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueue = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueue): CfnQueue =
        CfnQueue(cdkObject)

    internal fun unwrap(wrapped: CfnQueue): software.amazon.awscdk.services.sqs.CfnQueue =
        wrapped.cdkObject
  }
}
