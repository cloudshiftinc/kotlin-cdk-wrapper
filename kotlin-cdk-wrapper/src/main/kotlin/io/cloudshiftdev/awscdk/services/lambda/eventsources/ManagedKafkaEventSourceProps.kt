@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ManagedKafkaEventSourceProps : KafkaEventSourceProps {
  public fun clusterArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun batchSize(batchSize: Number)

    public fun clusterArn(clusterArn: String)

    public fun consumerGroupId(consumerGroupId: String)

    public fun enabled(enabled: Boolean)

    public fun filters(filters: List<Map<String, Any>>)

    public fun filters(vararg filters: Map<String, Any>)

    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    public fun onFailure(onFailure: IEventSourceDlq)

    public fun secret(secret: ISecret)

    public fun startingPosition(startingPosition: StartingPosition)

    public fun topic(topic: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps.builder()

    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    override fun consumerGroupId(consumerGroupId: String) {
      cdkBuilder.consumerGroupId(consumerGroupId)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq::unwrap))
    }

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    override fun topic(topic: String) {
      cdkBuilder.topic(topic)
    }

    public fun build():
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps,
  ) : CdkObject(cdkObject), ManagedKafkaEventSourceProps {
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    override fun clusterArn(): String = unwrap(this).getClusterArn()

    override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    override fun onFailure(): IEventSourceDlq? =
        unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

    override fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

    override fun startingPosition(): StartingPosition =
        unwrap(this).getStartingPosition().let(StartingPosition::wrap)

    override fun topic(): String = unwrap(this).getTopic()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManagedKafkaEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps):
        ManagedKafkaEventSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManagedKafkaEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps
  }
}
