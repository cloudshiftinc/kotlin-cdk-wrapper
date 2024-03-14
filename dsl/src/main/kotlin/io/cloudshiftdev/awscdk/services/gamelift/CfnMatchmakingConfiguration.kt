package io.cloudshiftdev.awscdk.services.gamelift

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

public open class CfnMatchmakingConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun acceptanceRequired(): Any = unwrap(this).getAcceptanceRequired()

  public open fun acceptanceRequired(`value`: Boolean) {
    unwrap(this).setAcceptanceRequired(`value`)
  }

  public open fun acceptanceRequired(`value`: IResolvable) {
    unwrap(this).setAcceptanceRequired(`value`.let(IResolvable::unwrap))
  }

  public open fun acceptanceTimeoutSeconds(): Number? = unwrap(this).getAcceptanceTimeoutSeconds()

  public open fun acceptanceTimeoutSeconds(`value`: Number) {
    unwrap(this).setAcceptanceTimeoutSeconds(`value`)
  }

  public open fun additionalPlayerCount(): Number? = unwrap(this).getAdditionalPlayerCount()

  public open fun additionalPlayerCount(`value`: Number) {
    unwrap(this).setAdditionalPlayerCount(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun backfillMode(): String? = unwrap(this).getBackfillMode()

  public open fun backfillMode(`value`: String) {
    unwrap(this).setBackfillMode(`value`)
  }

  public open fun creationTime(): String? = unwrap(this).getCreationTime()

  public open fun creationTime(`value`: String) {
    unwrap(this).setCreationTime(`value`)
  }

  public open fun customEventData(): String? = unwrap(this).getCustomEventData()

  public open fun customEventData(`value`: String) {
    unwrap(this).setCustomEventData(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun flexMatchMode(): String? = unwrap(this).getFlexMatchMode()

  public open fun flexMatchMode(`value`: String) {
    unwrap(this).setFlexMatchMode(`value`)
  }

  public open fun gameProperties(): Any? = unwrap(this).getGameProperties()

  public open fun gameProperties(`value`: IResolvable) {
    unwrap(this).setGameProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun gameProperties(__idx_ac66f0: List<Any>) {
    unwrap(this).setGameProperties(__idx_ac66f0)
  }

  public open fun gameProperties(vararg __idx_ac66f0: Any): Unit =
      gameProperties(__idx_ac66f0.toList())

  public open fun gameSessionData(): String? = unwrap(this).getGameSessionData()

  public open fun gameSessionData(`value`: String) {
    unwrap(this).setGameSessionData(`value`)
  }

  public open fun gameSessionQueueArns(): List<String> = unwrap(this).getGameSessionQueueArns() ?:
      emptyList()

  public open fun gameSessionQueueArns(`value`: List<String>) {
    unwrap(this).setGameSessionQueueArns(`value`)
  }

  public open fun gameSessionQueueArns(vararg `value`: String): Unit =
      gameSessionQueueArns(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

  public open fun notificationTarget(`value`: String) {
    unwrap(this).setNotificationTarget(`value`)
  }

  public open fun requestTimeoutSeconds(): Number = unwrap(this).getRequestTimeoutSeconds()

  public open fun requestTimeoutSeconds(`value`: Number) {
    unwrap(this).setRequestTimeoutSeconds(`value`)
  }

  public open fun ruleSetArn(): String? = unwrap(this).getRuleSetArn()

  public open fun ruleSetArn(`value`: String) {
    unwrap(this).setRuleSetArn(`value`)
  }

  public open fun ruleSetName(): String = unwrap(this).getRuleSetName()

  public open fun ruleSetName(`value`: String) {
    unwrap(this).setRuleSetName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.Builder =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMatchmakingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMatchmakingConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration):
        CfnMatchmakingConfiguration = CfnMatchmakingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnMatchmakingConfiguration):
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration = wrapped.cdkObject
  }

  public interface GamePropertyProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty,
    ) : GamePropertyProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GamePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty):
          GamePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GamePropertyProperty):
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
