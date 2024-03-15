@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRotationProps {
  public fun contactIds(): List<String>

  public fun name(): String

  public fun recurrence(): Any

  public fun startTime(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun timeZoneId(): String

  @CdkDslMarker
  public interface Builder {
    public fun contactIds(contactIds: List<String>)

    public fun contactIds(vararg contactIds: String)

    public fun name(name: String)

    public fun recurrence(recurrence: IResolvable)

    public fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("150001fcccc1f907929bee804ff7e0ffc4a525debc807d256dac3114b206b53e")
    public fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty.Builder.() -> Unit)

    public fun startTime(startTime: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeZoneId(timeZoneId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnRotationProps.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnRotationProps.builder()

    override fun contactIds(contactIds: List<String>) {
      cdkBuilder.contactIds(contactIds)
    }

    override fun contactIds(vararg contactIds: String): Unit = contactIds(contactIds.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun recurrence(recurrence: IResolvable) {
      cdkBuilder.recurrence(recurrence.let(IResolvable::unwrap))
    }

    override fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty) {
      cdkBuilder.recurrence(recurrence.let(CfnRotation.RecurrenceSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("150001fcccc1f907929bee804ff7e0ffc4a525debc807d256dac3114b206b53e")
    override fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty.Builder.() -> Unit):
        Unit = recurrence(CfnRotation.RecurrenceSettingsProperty(recurrence))

    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeZoneId(timeZoneId: String) {
      cdkBuilder.timeZoneId(timeZoneId)
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnRotationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotationProps,
  ) : CdkObject(cdkObject), CfnRotationProps {
    override fun contactIds(): List<String> = unwrap(this).getContactIds()

    override fun name(): String = unwrap(this).getName()

    override fun recurrence(): Any = unwrap(this).getRecurrence()

    override fun startTime(): String = unwrap(this).getStartTime()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeZoneId(): String = unwrap(this).getTimeZoneId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRotationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotationProps):
        CfnRotationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRotationProps):
        software.amazon.awscdk.services.ssmcontacts.CfnRotationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmcontacts.CfnRotationProps
  }
}
