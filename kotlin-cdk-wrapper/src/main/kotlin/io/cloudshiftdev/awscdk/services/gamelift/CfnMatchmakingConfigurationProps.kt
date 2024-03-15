@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMatchmakingConfigurationProps {
  public fun acceptanceRequired(): Any

  public fun acceptanceTimeoutSeconds(): Number? = unwrap(this).getAcceptanceTimeoutSeconds()

  public fun additionalPlayerCount(): Number? = unwrap(this).getAdditionalPlayerCount()

  public fun backfillMode(): String? = unwrap(this).getBackfillMode()

  public fun creationTime(): String? = unwrap(this).getCreationTime()

  public fun customEventData(): String? = unwrap(this).getCustomEventData()

  public fun description(): String? = unwrap(this).getDescription()

  public fun flexMatchMode(): String? = unwrap(this).getFlexMatchMode()

  public fun gameProperties(): Any? = unwrap(this).getGameProperties()

  public fun gameSessionData(): String? = unwrap(this).getGameSessionData()

  public fun gameSessionQueueArns(): List<String> = unwrap(this).getGameSessionQueueArns() ?:
      emptyList()

  public fun name(): String

  public fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

  public fun requestTimeoutSeconds(): Number

  public fun ruleSetArn(): String? = unwrap(this).getRuleSetArn()

  public fun ruleSetName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    public fun acceptanceRequired(acceptanceRequired: IResolvable)

    public fun acceptanceTimeoutSeconds(acceptanceTimeoutSeconds: Number)

    public fun additionalPlayerCount(additionalPlayerCount: Number)

    public fun backfillMode(backfillMode: String)

    public fun creationTime(creationTime: String)

    public fun customEventData(customEventData: String)

    public fun description(description: String)

    public fun flexMatchMode(flexMatchMode: String)

    public fun gameProperties(gameProperties: IResolvable)

    public fun gameProperties(gameProperties: List<Any>)

    public fun gameProperties(vararg gameProperties: Any)

    public fun gameSessionData(gameSessionData: String)

    public fun gameSessionQueueArns(gameSessionQueueArns: List<String>)

    public fun gameSessionQueueArns(vararg gameSessionQueueArns: String)

    public fun name(name: String)

    public fun notificationTarget(notificationTarget: String)

    public fun requestTimeoutSeconds(requestTimeoutSeconds: Number)

    public fun ruleSetArn(ruleSetArn: String)

    public fun ruleSetName(ruleSetName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps.builder()

    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    override fun acceptanceRequired(acceptanceRequired: IResolvable) {
      cdkBuilder.acceptanceRequired(acceptanceRequired.let(IResolvable::unwrap))
    }

    override fun acceptanceTimeoutSeconds(acceptanceTimeoutSeconds: Number) {
      cdkBuilder.acceptanceTimeoutSeconds(acceptanceTimeoutSeconds)
    }

    override fun additionalPlayerCount(additionalPlayerCount: Number) {
      cdkBuilder.additionalPlayerCount(additionalPlayerCount)
    }

    override fun backfillMode(backfillMode: String) {
      cdkBuilder.backfillMode(backfillMode)
    }

    override fun creationTime(creationTime: String) {
      cdkBuilder.creationTime(creationTime)
    }

    override fun customEventData(customEventData: String) {
      cdkBuilder.customEventData(customEventData)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun flexMatchMode(flexMatchMode: String) {
      cdkBuilder.flexMatchMode(flexMatchMode)
    }

    override fun gameProperties(gameProperties: IResolvable) {
      cdkBuilder.gameProperties(gameProperties.let(IResolvable::unwrap))
    }

    override fun gameProperties(gameProperties: List<Any>) {
      cdkBuilder.gameProperties(gameProperties)
    }

    override fun gameProperties(vararg gameProperties: Any): Unit =
        gameProperties(gameProperties.toList())

    override fun gameSessionData(gameSessionData: String) {
      cdkBuilder.gameSessionData(gameSessionData)
    }

    override fun gameSessionQueueArns(gameSessionQueueArns: List<String>) {
      cdkBuilder.gameSessionQueueArns(gameSessionQueueArns)
    }

    override fun gameSessionQueueArns(vararg gameSessionQueueArns: String): Unit =
        gameSessionQueueArns(gameSessionQueueArns.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun notificationTarget(notificationTarget: String) {
      cdkBuilder.notificationTarget(notificationTarget)
    }

    override fun requestTimeoutSeconds(requestTimeoutSeconds: Number) {
      cdkBuilder.requestTimeoutSeconds(requestTimeoutSeconds)
    }

    override fun ruleSetArn(ruleSetArn: String) {
      cdkBuilder.ruleSetArn(ruleSetArn)
    }

    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps,
  ) : CdkObject(cdkObject), CfnMatchmakingConfigurationProps {
    override fun acceptanceRequired(): Any = unwrap(this).getAcceptanceRequired()

    override fun acceptanceTimeoutSeconds(): Number? = unwrap(this).getAcceptanceTimeoutSeconds()

    override fun additionalPlayerCount(): Number? = unwrap(this).getAdditionalPlayerCount()

    override fun backfillMode(): String? = unwrap(this).getBackfillMode()

    override fun creationTime(): String? = unwrap(this).getCreationTime()

    override fun customEventData(): String? = unwrap(this).getCustomEventData()

    override fun description(): String? = unwrap(this).getDescription()

    override fun flexMatchMode(): String? = unwrap(this).getFlexMatchMode()

    override fun gameProperties(): Any? = unwrap(this).getGameProperties()

    override fun gameSessionData(): String? = unwrap(this).getGameSessionData()

    override fun gameSessionQueueArns(): List<String> = unwrap(this).getGameSessionQueueArns() ?:
        emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

    override fun requestTimeoutSeconds(): Number = unwrap(this).getRequestTimeoutSeconds()

    override fun ruleSetArn(): String? = unwrap(this).getRuleSetArn()

    override fun ruleSetName(): String = unwrap(this).getRuleSetName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMatchmakingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps):
        CfnMatchmakingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMatchmakingConfigurationProps):
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps
  }
}
