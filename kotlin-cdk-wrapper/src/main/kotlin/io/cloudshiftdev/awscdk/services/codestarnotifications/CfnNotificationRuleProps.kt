@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnNotificationRuleProps {
  public fun createdBy(): String? = unwrap(this).getCreatedBy()

  public fun detailType(): String

  public fun eventTypeId(): String? = unwrap(this).getEventTypeId()

  public fun eventTypeIds(): List<String>

  public fun name(): String

  public fun resource(): String

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun targetAddress(): String? = unwrap(this).getTargetAddress()

  public fun targets(): Any

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps.Builder =
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps,
  ) : CdkObject(cdkObject), CfnNotificationRuleProps {
    override fun createdBy(): String? = unwrap(this).getCreatedBy()

    override fun detailType(): String = unwrap(this).getDetailType()

    override fun eventTypeId(): String? = unwrap(this).getEventTypeId()

    override fun eventTypeIds(): List<String> = unwrap(this).getEventTypeIds()

    override fun name(): String = unwrap(this).getName()

    override fun resource(): String = unwrap(this).getResource()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun targetAddress(): String? = unwrap(this).getTargetAddress()

    override fun targets(): Any = unwrap(this).getTargets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotificationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps):
        CfnNotificationRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationRuleProps):
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps
  }
}
