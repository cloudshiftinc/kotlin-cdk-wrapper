package io.cloudshiftdev.awscdk.services.inspectorv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCisScanConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun scanName(): String? = unwrap(this).getScanName()

  public open fun scanName(`value`: String) {
    unwrap(this).setScanName(`value`)
  }

  public open fun schedule(): Any? = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f4cb37b509e18b9f8f071d4885d2b7ab5f21b36cfcfed84e222bb3bc8a42251")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  public open fun securityLevel(): String? = unwrap(this).getSecurityLevel()

  public open fun securityLevel(`value`: String) {
    unwrap(this).setSecurityLevel(`value`)
  }

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  public open fun targets(): Any? = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(`value`: CisTargetsProperty) {
    unwrap(this).setTargets(`value`.let(CisTargetsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1738ad6f34319272993c32033b26e4829b2955e31d2fb4bfeb3f9b34ec45fee5")
  public open fun targets(`value`: CisTargetsProperty.Builder.() -> Unit): Unit =
      targets(CisTargetsProperty(`value`))

  public interface Builder {
    public fun scanName(scanName: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: ScheduleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("087890ce049c3c54ba2a05cc12f6345cf444a0b3a6db8abfeb68dba1e3a48026")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    public fun securityLevel(securityLevel: String)

    public fun tags(tags: Map<String, String>)

    public fun targets(targets: IResolvable)

    public fun targets(targets: CisTargetsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("429b28facd46c566f4bbc99bc7960628d2f124321a27058539f46067105ca654")
    public fun targets(targets: CisTargetsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.Builder.create(scope,
        id)

    override fun scanName(scanName: String) {
      cdkBuilder.scanName(scanName)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("087890ce049c3c54ba2a05cc12f6345cf444a0b3a6db8abfeb68dba1e3a48026")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    override fun securityLevel(securityLevel: String) {
      cdkBuilder.securityLevel(securityLevel)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: CisTargetsProperty) {
      cdkBuilder.targets(targets.let(CisTargetsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("429b28facd46c566f4bbc99bc7960628d2f124321a27058539f46067105ca654")
    override fun targets(targets: CisTargetsProperty.Builder.() -> Unit): Unit =
        targets(CisTargetsProperty(targets))

    public fun build(): software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCisScanConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCisScanConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration):
        CfnCisScanConfiguration = CfnCisScanConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnCisScanConfiguration):
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration = wrapped.cdkObject
  }

  public interface TimeProperty {
    public fun timeOfDay(): String

    public fun timeZone(): String

    public interface Builder {
      public fun timeOfDay(timeOfDay: String)

      public fun timeZone(timeZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty.builder()

      override fun timeOfDay(timeOfDay: String) {
        cdkBuilder.timeOfDay(timeOfDay)
      }

      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty,
    ) : TimeProperty {
      override fun timeOfDay(): String = unwrap(this).getTimeOfDay()

      override fun timeZone(): String = unwrap(this).getTimeZone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty):
          TimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonthlyScheduleProperty {
    public fun day(): String

    public fun startTime(): Any

    public interface Builder {
      public fun day(day: String)

      public fun startTime(startTime: IResolvable)

      public fun startTime(startTime: TimeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02a94c74313d25d651b578e331fa7369d1eccc96782f339006dde9639857382a")
      public fun startTime(startTime: TimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty.builder()

      override fun day(day: String) {
        cdkBuilder.day(day)
      }

      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable::unwrap))
      }

      override fun startTime(startTime: TimeProperty) {
        cdkBuilder.startTime(startTime.let(TimeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02a94c74313d25d651b578e331fa7369d1eccc96782f339006dde9639857382a")
      override fun startTime(startTime: TimeProperty.Builder.() -> Unit): Unit =
          startTime(TimeProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty,
    ) : MonthlyScheduleProperty {
      override fun day(): String = unwrap(this).getDay()

      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonthlyScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty):
          MonthlyScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonthlyScheduleProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DailyScheduleProperty {
    public fun startTime(): Any

    public interface Builder {
      public fun startTime(startTime: IResolvable)

      public fun startTime(startTime: TimeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb09ecf9eef1da4425c5f6eca151395af85b7ba72e73f27c8eba0e8630743065")
      public fun startTime(startTime: TimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty.builder()

      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable::unwrap))
      }

      override fun startTime(startTime: TimeProperty) {
        cdkBuilder.startTime(startTime.let(TimeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb09ecf9eef1da4425c5f6eca151395af85b7ba72e73f27c8eba0e8630743065")
      override fun startTime(startTime: TimeProperty.Builder.() -> Unit): Unit =
          startTime(TimeProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty,
    ) : DailyScheduleProperty {
      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DailyScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty):
          DailyScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DailyScheduleProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScheduleProperty {
    public fun daily(): Any? = unwrap(this).getDaily()

    public fun monthly(): Any? = unwrap(this).getMonthly()

    public fun oneTime(): Any? = unwrap(this).getOneTime()

    public fun weekly(): Any? = unwrap(this).getWeekly()

    public interface Builder {
      public fun daily(daily: IResolvable)

      public fun daily(daily: DailyScheduleProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a793aa2bb18b17772304b6daaa4b7513a0e99e5257ea2be2acf1b1aa9ae4ee7")
      public fun daily(daily: DailyScheduleProperty.Builder.() -> Unit)

      public fun monthly(monthly: IResolvable)

      public fun monthly(monthly: MonthlyScheduleProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f22f866af9e8b921eeaa34e2e060a32bcb0bb634a972233bfda7dfc2b9bfa58")
      public fun monthly(monthly: MonthlyScheduleProperty.Builder.() -> Unit)

      public fun oneTime(oneTime: Any)

      public fun weekly(weekly: IResolvable)

      public fun weekly(weekly: WeeklyScheduleProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfc2208bc417831b944346733777cf29fde0f8583c5a4c0b66486a503067b3ea")
      public fun weekly(weekly: WeeklyScheduleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty.builder()

      override fun daily(daily: IResolvable) {
        cdkBuilder.daily(daily.let(IResolvable::unwrap))
      }

      override fun daily(daily: DailyScheduleProperty) {
        cdkBuilder.daily(daily.let(DailyScheduleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a793aa2bb18b17772304b6daaa4b7513a0e99e5257ea2be2acf1b1aa9ae4ee7")
      override fun daily(daily: DailyScheduleProperty.Builder.() -> Unit): Unit =
          daily(DailyScheduleProperty(daily))

      override fun monthly(monthly: IResolvable) {
        cdkBuilder.monthly(monthly.let(IResolvable::unwrap))
      }

      override fun monthly(monthly: MonthlyScheduleProperty) {
        cdkBuilder.monthly(monthly.let(MonthlyScheduleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f22f866af9e8b921eeaa34e2e060a32bcb0bb634a972233bfda7dfc2b9bfa58")
      override fun monthly(monthly: MonthlyScheduleProperty.Builder.() -> Unit): Unit =
          monthly(MonthlyScheduleProperty(monthly))

      override fun oneTime(oneTime: Any) {
        cdkBuilder.oneTime(oneTime)
      }

      override fun weekly(weekly: IResolvable) {
        cdkBuilder.weekly(weekly.let(IResolvable::unwrap))
      }

      override fun weekly(weekly: WeeklyScheduleProperty) {
        cdkBuilder.weekly(weekly.let(WeeklyScheduleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfc2208bc417831b944346733777cf29fde0f8583c5a4c0b66486a503067b3ea")
      override fun weekly(weekly: WeeklyScheduleProperty.Builder.() -> Unit): Unit =
          weekly(WeeklyScheduleProperty(weekly))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty,
    ) : ScheduleProperty {
      override fun daily(): Any? = unwrap(this).getDaily()

      override fun monthly(): Any? = unwrap(this).getMonthly()

      override fun oneTime(): Any? = unwrap(this).getOneTime()

      override fun weekly(): Any? = unwrap(this).getWeekly()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CisTargetsProperty {
    public fun accountIds(): List<String>

    public fun targetResourceTags(): Any? = unwrap(this).getTargetResourceTags()

    public interface Builder {
      public fun accountIds(accountIds: List<String>)

      public fun targetResourceTags(targetResourceTags: IResolvable)

      public fun targetResourceTags(targetResourceTags: Map<String, List<String>>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty.builder()

      override fun accountIds(accountIds: List<String>) {
        cdkBuilder.accountIds(accountIds)
      }

      override fun targetResourceTags(targetResourceTags: IResolvable) {
        cdkBuilder.targetResourceTags(targetResourceTags.let(IResolvable::unwrap))
      }

      override fun targetResourceTags(targetResourceTags: Map<String, List<String>>) {
        cdkBuilder.targetResourceTags(targetResourceTags)
      }

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty,
    ) : CisTargetsProperty {
      override fun accountIds(): List<String> = unwrap(this).getAccountIds() ?: emptyList()

      override fun targetResourceTags(): Any? = unwrap(this).getTargetResourceTags()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CisTargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty):
          CisTargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CisTargetsProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WeeklyScheduleProperty {
    public fun days(): List<String>

    public fun startTime(): Any

    public interface Builder {
      public fun days(days: List<String>)

      public fun startTime(startTime: IResolvable)

      public fun startTime(startTime: TimeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5839391f6d62e041410bbc3948120e80475604f77c8619dc36f9491ea588fc32")
      public fun startTime(startTime: TimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty.builder()

      override fun days(days: List<String>) {
        cdkBuilder.days(days)
      }

      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable::unwrap))
      }

      override fun startTime(startTime: TimeProperty) {
        cdkBuilder.startTime(startTime.let(TimeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5839391f6d62e041410bbc3948120e80475604f77c8619dc36f9491ea588fc32")
      override fun startTime(startTime: TimeProperty.Builder.() -> Unit): Unit =
          startTime(TimeProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty,
    ) : WeeklyScheduleProperty {
      override fun days(): List<String> = unwrap(this).getDays() ?: emptyList()

      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WeeklyScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty):
          WeeklyScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeeklyScheduleProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
