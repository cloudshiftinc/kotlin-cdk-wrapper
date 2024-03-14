package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRotation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun contactIds(): List<String> = unwrap(this).getContactIds() ?: emptyList()

  public open fun contactIds(`value`: List<String>) {
    unwrap(this).setContactIds(`value`)
  }

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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun timeZoneId(): String = unwrap(this).getTimeZoneId()

  public open fun timeZoneId(`value`: String) {
    unwrap(this).setTimeZoneId(`value`)
  }

  public interface Builder {
    public fun contactIds(contactIds: List<String>) {
    }

    public fun name(name: String) {
    }

    public fun recurrence(recurrence: IResolvable) {
    }

    public fun recurrence(recurrence: RecurrenceSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a473203a88f63c44ef343838ca601eec3316185ba1b92295a7163e73dab0fed3")
    public fun recurrence(recurrence: RecurrenceSettingsProperty.Builder.() -> Unit) {
    }

    public fun startTime(startTime: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun timeZoneId(timeZoneId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnRotation.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnRotation.Builder.create(scope, id)

    public override fun contactIds(contactIds: List<String>) {
      cdkBuilder.contactIds(contactIds)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun recurrence(recurrence: IResolvable) {
      cdkBuilder.recurrence(recurrence.let(IResolvable::unwrap))
    }

    public override fun recurrence(recurrence: RecurrenceSettingsProperty) {
      cdkBuilder.recurrence(recurrence.let(RecurrenceSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a473203a88f63c44ef343838ca601eec3316185ba1b92295a7163e73dab0fed3")
    public override fun recurrence(recurrence: RecurrenceSettingsProperty.Builder.() -> Unit): Unit
        = recurrence(RecurrenceSettingsProperty(recurrence))

    public override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun timeZoneId(timeZoneId: String) {
      cdkBuilder.timeZoneId(timeZoneId)
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnRotation = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun dayOfMonth(dayOfMonth: Number) {
      }

      public fun handOffTime(handOffTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty.builder()

      public override fun dayOfMonth(dayOfMonth: Number) {
        cdkBuilder.dayOfMonth(dayOfMonth)
      }

      public override fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty,
    ) : MonthlySettingProperty {
      public override fun dayOfMonth(): Number = unwrap(this).getDayOfMonth()

      public override fun handOffTime(): String = unwrap(this).getHandOffTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonthlySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty):
          MonthlySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonthlySettingProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CoverageTimeProperty {
    public fun endTime(): String

    public fun startTime(): String

    public interface Builder {
      public fun endTime(endTime: String) {
      }

      public fun startTime(startTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty.builder()

      public override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      public override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty,
    ) : CoverageTimeProperty {
      public override fun endTime(): String = unwrap(this).getEndTime()

      public override fun startTime(): String = unwrap(this).getStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CoverageTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty):
          CoverageTimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoverageTimeProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WeeklySettingProperty {
    public fun dayOfWeek(): String

    public fun handOffTime(): String

    public interface Builder {
      public fun dayOfWeek(dayOfWeek: String) {
      }

      public fun handOffTime(handOffTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty.builder()

      public override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      public override fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty,
    ) : WeeklySettingProperty {
      public override fun dayOfWeek(): String = unwrap(this).getDayOfWeek()

      public override fun handOffTime(): String = unwrap(this).getHandOffTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WeeklySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty):
          WeeklySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeeklySettingProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RecurrenceSettingsProperty {
    public fun dailySettings(): List<String> = unwrap(this).getDailySettings() ?: emptyList()

    public fun monthlySettings(): Any? = unwrap(this).getMonthlySettings()

    public fun numberOfOnCalls(): Number

    public fun recurrenceMultiplier(): Number

    public fun shiftCoverages(): Any? = unwrap(this).getShiftCoverages()

    public fun weeklySettings(): Any? = unwrap(this).getWeeklySettings()

    public interface Builder {
      public fun dailySettings(dailySettings: List<String>) {
      }

      public fun monthlySettings(monthlySettings: IResolvable) {
      }

      public fun monthlySettings(monthlySettings: List<Any>) {
      }

      public fun numberOfOnCalls(numberOfOnCalls: Number) {
      }

      public fun recurrenceMultiplier(recurrenceMultiplier: Number) {
      }

      public fun shiftCoverages(shiftCoverages: IResolvable) {
      }

      public fun shiftCoverages(shiftCoverages: List<Any>) {
      }

      public fun weeklySettings(weeklySettings: IResolvable) {
      }

      public fun weeklySettings(weeklySettings: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty.builder()

      public override fun dailySettings(dailySettings: List<String>) {
        cdkBuilder.dailySettings(dailySettings)
      }

      public override fun monthlySettings(monthlySettings: IResolvable) {
        cdkBuilder.monthlySettings(monthlySettings.let(IResolvable::unwrap))
      }

      public override fun monthlySettings(monthlySettings: List<Any>) {
        cdkBuilder.monthlySettings(monthlySettings)
      }

      public override fun numberOfOnCalls(numberOfOnCalls: Number) {
        cdkBuilder.numberOfOnCalls(numberOfOnCalls)
      }

      public override fun recurrenceMultiplier(recurrenceMultiplier: Number) {
        cdkBuilder.recurrenceMultiplier(recurrenceMultiplier)
      }

      public override fun shiftCoverages(shiftCoverages: IResolvable) {
        cdkBuilder.shiftCoverages(shiftCoverages.let(IResolvable::unwrap))
      }

      public override fun shiftCoverages(shiftCoverages: List<Any>) {
        cdkBuilder.shiftCoverages(shiftCoverages)
      }

      public override fun weeklySettings(weeklySettings: IResolvable) {
        cdkBuilder.weeklySettings(weeklySettings.let(IResolvable::unwrap))
      }

      public override fun weeklySettings(weeklySettings: List<Any>) {
        cdkBuilder.weeklySettings(weeklySettings)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty,
    ) : RecurrenceSettingsProperty {
      public override fun dailySettings(): List<String> = unwrap(this).getDailySettings() ?:
          emptyList()

      public override fun monthlySettings(): Any? = unwrap(this).getMonthlySettings()

      public override fun numberOfOnCalls(): Number = unwrap(this).getNumberOfOnCalls()

      public override fun recurrenceMultiplier(): Number = unwrap(this).getRecurrenceMultiplier()

      public override fun shiftCoverages(): Any? = unwrap(this).getShiftCoverages()

      public override fun weeklySettings(): Any? = unwrap(this).getWeeklySettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecurrenceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty):
          RecurrenceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecurrenceSettingsProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ShiftCoverageProperty {
    public fun coverageTimes(): Any

    public fun dayOfWeek(): String

    public interface Builder {
      public fun coverageTimes(coverageTimes: IResolvable) {
      }

      public fun coverageTimes(coverageTimes: List<Any>) {
      }

      public fun dayOfWeek(dayOfWeek: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty.builder()

      public override fun coverageTimes(coverageTimes: IResolvable) {
        cdkBuilder.coverageTimes(coverageTimes.let(IResolvable::unwrap))
      }

      public override fun coverageTimes(coverageTimes: List<Any>) {
        cdkBuilder.coverageTimes(coverageTimes)
      }

      public override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty,
    ) : ShiftCoverageProperty {
      public override fun coverageTimes(): Any = unwrap(this).getCoverageTimes()

      public override fun dayOfWeek(): String = unwrap(this).getDayOfWeek()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ShiftCoverageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty):
          ShiftCoverageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShiftCoverageProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
