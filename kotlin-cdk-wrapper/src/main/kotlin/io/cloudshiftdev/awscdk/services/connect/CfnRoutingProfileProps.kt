@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRoutingProfileProps {
  public fun agentAvailabilityTimer(): String? = unwrap(this).getAgentAvailabilityTimer()

  public fun defaultOutboundQueueArn(): String

  public fun description(): String

  public fun instanceArn(): String

  public fun mediaConcurrencies(): Any

  public fun name(): String

  public fun queueConfigs(): Any? = unwrap(this).getQueueConfigs()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun agentAvailabilityTimer(agentAvailabilityTimer: String)

    public fun defaultOutboundQueueArn(defaultOutboundQueueArn: String)

    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun mediaConcurrencies(mediaConcurrencies: IResolvable)

    public fun mediaConcurrencies(mediaConcurrencies: List<Any>)

    public fun mediaConcurrencies(vararg mediaConcurrencies: Any)

    public fun name(name: String)

    public fun queueConfigs(queueConfigs: IResolvable)

    public fun queueConfigs(queueConfigs: List<Any>)

    public fun queueConfigs(vararg queueConfigs: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRoutingProfileProps.Builder =
        software.amazon.awscdk.services.connect.CfnRoutingProfileProps.builder()

    override fun agentAvailabilityTimer(agentAvailabilityTimer: String) {
      cdkBuilder.agentAvailabilityTimer(agentAvailabilityTimer)
    }

    override fun defaultOutboundQueueArn(defaultOutboundQueueArn: String) {
      cdkBuilder.defaultOutboundQueueArn(defaultOutboundQueueArn)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun mediaConcurrencies(mediaConcurrencies: IResolvable) {
      cdkBuilder.mediaConcurrencies(mediaConcurrencies.let(IResolvable::unwrap))
    }

    override fun mediaConcurrencies(mediaConcurrencies: List<Any>) {
      cdkBuilder.mediaConcurrencies(mediaConcurrencies)
    }

    override fun mediaConcurrencies(vararg mediaConcurrencies: Any): Unit =
        mediaConcurrencies(mediaConcurrencies.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queueConfigs(queueConfigs: IResolvable) {
      cdkBuilder.queueConfigs(queueConfigs.let(IResolvable::unwrap))
    }

    override fun queueConfigs(queueConfigs: List<Any>) {
      cdkBuilder.queueConfigs(queueConfigs)
    }

    override fun queueConfigs(vararg queueConfigs: Any): Unit = queueConfigs(queueConfigs.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnRoutingProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfileProps,
  ) : CdkObject(cdkObject), CfnRoutingProfileProps {
    override fun agentAvailabilityTimer(): String? = unwrap(this).getAgentAvailabilityTimer()

    override fun defaultOutboundQueueArn(): String = unwrap(this).getDefaultOutboundQueueArn()

    override fun description(): String = unwrap(this).getDescription()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun mediaConcurrencies(): Any = unwrap(this).getMediaConcurrencies()

    override fun name(): String = unwrap(this).getName()

    override fun queueConfigs(): Any? = unwrap(this).getQueueConfigs()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoutingProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfileProps):
        CfnRoutingProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingProfileProps):
        software.amazon.awscdk.services.connect.CfnRoutingProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRoutingProfileProps
  }
}
