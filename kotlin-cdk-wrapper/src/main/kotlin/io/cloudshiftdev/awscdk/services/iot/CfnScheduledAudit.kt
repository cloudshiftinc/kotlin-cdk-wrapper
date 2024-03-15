@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScheduledAudit internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnScheduledAudit,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrScheduledAuditArn(): String = unwrap(this).getAttrScheduledAuditArn()

  public open fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

  public open fun dayOfMonth(`value`: String) {
    unwrap(this).setDayOfMonth(`value`)
  }

  public open fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()

  public open fun dayOfWeek(`value`: String) {
    unwrap(this).setDayOfWeek(`value`)
  }

  public open fun frequency(): String = unwrap(this).getFrequency()

  public open fun frequency(`value`: String) {
    unwrap(this).setFrequency(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun scheduledAuditName(): String? = unwrap(this).getScheduledAuditName()

  public open fun scheduledAuditName(`value`: String) {
    unwrap(this).setScheduledAuditName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun targetCheckNames(): List<String> = unwrap(this).getTargetCheckNames()

  public open fun targetCheckNames(`value`: List<String>) {
    unwrap(this).setTargetCheckNames(`value`)
  }

  public open fun targetCheckNames(vararg `value`: String): Unit =
      targetCheckNames(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun dayOfMonth(dayOfMonth: String)

    public fun dayOfWeek(dayOfWeek: String)

    public fun frequency(frequency: String)

    public fun scheduledAuditName(scheduledAuditName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetCheckNames(targetCheckNames: List<String>)

    public fun targetCheckNames(vararg targetCheckNames: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnScheduledAudit.Builder =
        software.amazon.awscdk.services.iot.CfnScheduledAudit.Builder.create(scope, id)

    override fun dayOfMonth(dayOfMonth: String) {
      cdkBuilder.dayOfMonth(dayOfMonth)
    }

    override fun dayOfWeek(dayOfWeek: String) {
      cdkBuilder.dayOfWeek(dayOfWeek)
    }

    override fun frequency(frequency: String) {
      cdkBuilder.frequency(frequency)
    }

    override fun scheduledAuditName(scheduledAuditName: String) {
      cdkBuilder.scheduledAuditName(scheduledAuditName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetCheckNames(targetCheckNames: List<String>) {
      cdkBuilder.targetCheckNames(targetCheckNames)
    }

    override fun targetCheckNames(vararg targetCheckNames: String): Unit =
        targetCheckNames(targetCheckNames.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnScheduledAudit = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnScheduledAudit.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScheduledAudit {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScheduledAudit(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnScheduledAudit):
        CfnScheduledAudit = CfnScheduledAudit(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledAudit):
        software.amazon.awscdk.services.iot.CfnScheduledAudit = wrapped.cdkObject
  }
}
