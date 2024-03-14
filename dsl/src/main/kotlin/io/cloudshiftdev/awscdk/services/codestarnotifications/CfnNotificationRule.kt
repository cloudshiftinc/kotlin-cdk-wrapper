package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNotificationRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun createdBy(): String? = unwrap(this).getCreatedBy()

  public open fun createdBy(`value`: String) {
    unwrap(this).setCreatedBy(`value`)
  }

  public open fun detailType(): String = unwrap(this).getDetailType()

  public open fun detailType(`value`: String) {
    unwrap(this).setDetailType(`value`)
  }

  public open fun eventTypeId(): String? = unwrap(this).getEventTypeId()

  public open fun eventTypeId(`value`: String) {
    unwrap(this).setEventTypeId(`value`)
  }

  public open fun eventTypeIds(): List<String> = unwrap(this).getEventTypeIds()

  public open fun eventTypeIds(`value`: List<String>) {
    unwrap(this).setEventTypeIds(`value`)
  }

  public open fun eventTypeIds(vararg `value`: String): Unit = eventTypeIds(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun resource(): String = unwrap(this).getResource()

  public open fun resource(`value`: String) {
    unwrap(this).setResource(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun targetAddress(): String? = unwrap(this).getTargetAddress()

  public open fun targetAddress(`value`: String) {
    unwrap(this).setTargetAddress(`value`)
  }

  public open fun targets(): Any = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  public open fun targets(vararg __idx_ac66f0: Any): Unit = targets(__idx_ac66f0.toList())

  public interface Builder {
    public fun createdBy(createdBy: String)

    public fun detailType(detailType: String)

    public fun eventTypeId(eventTypeId: String)

    public fun eventTypeIds(eventTypeIds: List<String>)

    public fun eventTypeIds(vararg eventTypeIds: String)

    public fun name(name: String)

    public fun resource(resource: String)

    public fun status(status: String)

    public fun tags(tags: Map<String, String>)

    public fun targetAddress(targetAddress: String)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.Builder =
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.Builder.create(scope,
        id)

    override fun createdBy(createdBy: String) {
      cdkBuilder.createdBy(createdBy)
    }

    override fun detailType(detailType: String) {
      cdkBuilder.detailType(detailType)
    }

    override fun eventTypeId(eventTypeId: String) {
      cdkBuilder.eventTypeId(eventTypeId)
    }

    override fun eventTypeIds(eventTypeIds: List<String>) {
      cdkBuilder.eventTypeIds(eventTypeIds)
    }

    override fun eventTypeIds(vararg eventTypeIds: String): Unit =
        eventTypeIds(eventTypeIds.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resource(resource: String) {
      cdkBuilder.resource(resource)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targetAddress(targetAddress: String) {
      cdkBuilder.targetAddress(targetAddress)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotificationRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotificationRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule):
        CfnNotificationRule = CfnNotificationRule(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationRule):
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule =
        wrapped.cdkObject
  }

  public interface TargetProperty {
    public fun targetAddress(): String

    public fun targetType(): String

    public interface Builder {
      public fun targetAddress(targetAddress: String)

      public fun targetType(targetType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty.Builder
          =
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty.builder()

      override fun targetAddress(targetAddress: String) {
        cdkBuilder.targetAddress(targetAddress)
      }

      override fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
      }

      public fun build():
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty,
    ) : TargetProperty {
      override fun targetAddress(): String = unwrap(this).getTargetAddress()

      override fun targetType(): String = unwrap(this).getTargetType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
