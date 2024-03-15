@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRotation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun contactIds(): List<String> = unwrap(this).getContactIds()

  public open fun contactIds(`value`: List<String>) {
    unwrap(this).setContactIds(`value`)
  }

  public open fun contactIds(vararg `value`: String): Unit = contactIds(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun recurrence(): Any = unwrap(this).getRecurrence()

  public open fun recurrence(`value`: IResolvable) {
    unwrap(this).setRecurrence(`value`.let(IResolvable::unwrap))
  }

  public open fun recurrence(`value`: RecurrenceSettingsProperty) {
    unwrap(this).setRecurrence(`value`.let(RecurrenceSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd9e59445e8a5fdfb0b4ca205908549790e053d0a0b7243569cda6fc1ba89631")
  public open fun recurrence(`value`: RecurrenceSettingsProperty.Builder.() -> Unit): Unit =
      recurrence(RecurrenceSettingsProperty(`value`))

  public open fun startTime(): String = unwrap(this).getStartTime()

  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun timeZoneId(): String = unwrap(this).getTimeZoneId()

  public open fun timeZoneId(`value`: String) {
    unwrap(this).setTimeZoneId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun contactIds(contactIds: List<String>)

    public fun contactIds(vararg contactIds: String)

    public fun name(name: String)

    public fun recurrence(recurrence: IResolvable)

    public fun recurrence(recurrence: RecurrenceSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a473203a88f63c44ef343838ca601eec3316185ba1b92295a7163e73dab0fed3")
    public fun recurrence(recurrence: RecurrenceSettingsProperty.Builder.() -> Unit)

    public fun startTime(startTime: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeZoneId(timeZoneId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnRotation.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnRotation.Builder.create(scope, id)

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

    override fun recurrence(recurrence: RecurrenceSettingsProperty) {
      cdkBuilder.recurrence(recurrence.let(RecurrenceSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a473203a88f63c44ef343838ca601eec3316185ba1b92295a7163e73dab0fed3")
    override fun recurrence(recurrence: RecurrenceSettingsProperty.Builder.() -> Unit): Unit =
        recurrence(RecurrenceSettingsProperty(recurrence))

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

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnRotation = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmcontacts.CfnRotation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRotation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRotation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation):
        CfnRotation = CfnRotation(cdkObject)

    internal fun unwrap(wrapped: CfnRotation):
        software.amazon.awscdk.services.ssmcontacts.CfnRotation = wrapped.cdkObject
  }

  public interface MonthlySettingProperty {
    public fun dayOfMonth(): Number

    public fun handOffTime(): String

    @CdkDslMarker
    public interface Builder {
      public fun dayOfMonth(dayOfMonth: Number)

      public fun handOffTime(handOffTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty.builder()

      override fun dayOfMonth(dayOfMonth: Number) {
        cdkBuilder.dayOfMonth(dayOfMonth)
      }

      override fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty,
    ) : CdkObject(cdkObject), MonthlySettingProperty {
      override fun dayOfMonth(): Number = unwrap(this).getDayOfMonth()

      override fun handOffTime(): String = unwrap(this).getHandOffTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonthlySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty):
          MonthlySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonthlySettingProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty
    }
  }

  public interface CoverageTimeProperty {
    public fun endTime(): String

    public fun startTime(): String

    @CdkDslMarker
    public interface Builder {
      public fun endTime(endTime: String)

      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty.builder()

      override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty,
    ) : CdkObject(cdkObject), CoverageTimeProperty {
      override fun endTime(): String = unwrap(this).getEndTime()

      override fun startTime(): String = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoverageTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty):
          CoverageTimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoverageTimeProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty
    }
  }

  public interface WeeklySettingProperty {
    public fun dayOfWeek(): String

    public fun handOffTime(): String

    @CdkDslMarker
    public interface Builder {
      public fun dayOfWeek(dayOfWeek: String)

      public fun handOffTime(handOffTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty.builder()

      override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      override fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty,
    ) : CdkObject(cdkObject), WeeklySettingProperty {
      override fun dayOfWeek(): String = unwrap(this).getDayOfWeek()

      override fun handOffTime(): String = unwrap(this).getHandOffTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WeeklySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty):
          WeeklySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeeklySettingProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty
    }
  }

  public interface RecurrenceSettingsProperty {
    public fun dailySettings(): List<String> = unwrap(this).getDailySettings() ?: emptyList()

    public fun monthlySettings(): Any? = unwrap(this).getMonthlySettings()

    public fun numberOfOnCalls(): Number

    public fun recurrenceMultiplier(): Number

    public fun shiftCoverages(): Any? = unwrap(this).getShiftCoverages()

    public fun weeklySettings(): Any? = unwrap(this).getWeeklySettings()

    @CdkDslMarker
    public interface Builder {
      public fun dailySettings(dailySettings: List<String>)

      public fun dailySettings(vararg dailySettings: String)

      public fun monthlySettings(monthlySettings: IResolvable)

      public fun monthlySettings(monthlySettings: List<Any>)

      public fun monthlySettings(vararg monthlySettings: Any)

      public fun numberOfOnCalls(numberOfOnCalls: Number)

      public fun recurrenceMultiplier(recurrenceMultiplier: Number)

      public fun shiftCoverages(shiftCoverages: IResolvable)

      public fun shiftCoverages(shiftCoverages: List<Any>)

      public fun shiftCoverages(vararg shiftCoverages: Any)

      public fun weeklySettings(weeklySettings: IResolvable)

      public fun weeklySettings(weeklySettings: List<Any>)

      public fun weeklySettings(vararg weeklySettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty.builder()

      override fun dailySettings(dailySettings: List<String>) {
        cdkBuilder.dailySettings(dailySettings)
      }

      override fun dailySettings(vararg dailySettings: String): Unit =
          dailySettings(dailySettings.toList())

      override fun monthlySettings(monthlySettings: IResolvable) {
        cdkBuilder.monthlySettings(monthlySettings.let(IResolvable::unwrap))
      }

      override fun monthlySettings(monthlySettings: List<Any>) {
        cdkBuilder.monthlySettings(monthlySettings)
      }

      override fun monthlySettings(vararg monthlySettings: Any): Unit =
          monthlySettings(monthlySettings.toList())

      override fun numberOfOnCalls(numberOfOnCalls: Number) {
        cdkBuilder.numberOfOnCalls(numberOfOnCalls)
      }

      override fun recurrenceMultiplier(recurrenceMultiplier: Number) {
        cdkBuilder.recurrenceMultiplier(recurrenceMultiplier)
      }

      override fun shiftCoverages(shiftCoverages: IResolvable) {
        cdkBuilder.shiftCoverages(shiftCoverages.let(IResolvable::unwrap))
      }

      override fun shiftCoverages(shiftCoverages: List<Any>) {
        cdkBuilder.shiftCoverages(shiftCoverages)
      }

      override fun shiftCoverages(vararg shiftCoverages: Any): Unit =
          shiftCoverages(shiftCoverages.toList())

      override fun weeklySettings(weeklySettings: IResolvable) {
        cdkBuilder.weeklySettings(weeklySettings.let(IResolvable::unwrap))
      }

      override fun weeklySettings(weeklySettings: List<Any>) {
        cdkBuilder.weeklySettings(weeklySettings)
      }

      override fun weeklySettings(vararg weeklySettings: Any): Unit =
          weeklySettings(weeklySettings.toList())

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty,
    ) : CdkObject(cdkObject), RecurrenceSettingsProperty {
      override fun dailySettings(): List<String> = unwrap(this).getDailySettings() ?: emptyList()

      override fun monthlySettings(): Any? = unwrap(this).getMonthlySettings()

      override fun numberOfOnCalls(): Number = unwrap(this).getNumberOfOnCalls()

      override fun recurrenceMultiplier(): Number = unwrap(this).getRecurrenceMultiplier()

      override fun shiftCoverages(): Any? = unwrap(this).getShiftCoverages()

      override fun weeklySettings(): Any? = unwrap(this).getWeeklySettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecurrenceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty):
          RecurrenceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecurrenceSettingsProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty
    }
  }

  public interface ShiftCoverageProperty {
    public fun coverageTimes(): Any

    public fun dayOfWeek(): String

    @CdkDslMarker
    public interface Builder {
      public fun coverageTimes(coverageTimes: IResolvable)

      public fun coverageTimes(coverageTimes: List<Any>)

      public fun coverageTimes(vararg coverageTimes: Any)

      public fun dayOfWeek(dayOfWeek: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty.builder()

      override fun coverageTimes(coverageTimes: IResolvable) {
        cdkBuilder.coverageTimes(coverageTimes.let(IResolvable::unwrap))
      }

      override fun coverageTimes(coverageTimes: List<Any>) {
        cdkBuilder.coverageTimes(coverageTimes)
      }

      override fun coverageTimes(vararg coverageTimes: Any): Unit =
          coverageTimes(coverageTimes.toList())

      override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty,
    ) : CdkObject(cdkObject), ShiftCoverageProperty {
      override fun coverageTimes(): Any = unwrap(this).getCoverageTimes()

      override fun dayOfWeek(): String = unwrap(this).getDayOfWeek()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShiftCoverageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty):
          ShiftCoverageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShiftCoverageProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty
    }
  }
}
