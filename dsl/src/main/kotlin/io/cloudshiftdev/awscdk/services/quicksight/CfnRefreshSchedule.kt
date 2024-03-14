package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRefreshSchedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  public open fun dataSetId(): String? = unwrap(this).getDataSetId()

  public open fun dataSetId(`value`: String) {
    unwrap(this).setDataSetId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun schedule(): Any? = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: RefreshScheduleMapProperty) {
    unwrap(this).setSchedule(`value`.let(RefreshScheduleMapProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0893aa94db9f987bd05ebf9223c4225ddc9d57ff94c462efa5a31ae8ae88d70")
  public open fun schedule(`value`: RefreshScheduleMapProperty.Builder.() -> Unit): Unit =
      schedule(RefreshScheduleMapProperty(`value`))

  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun dataSetId(dataSetId: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: RefreshScheduleMapProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52e693c9de60b1b324b06a83450970e99c0a671b7ca88308bc21570e1c0e3734")
    public fun schedule(schedule: RefreshScheduleMapProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.Builder =
        software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.Builder.create(scope, id)

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun dataSetId(dataSetId: String) {
      cdkBuilder.dataSetId(dataSetId)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: RefreshScheduleMapProperty) {
      cdkBuilder.schedule(schedule.let(RefreshScheduleMapProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52e693c9de60b1b324b06a83450970e99c0a671b7ca88308bc21570e1c0e3734")
    override fun schedule(schedule: RefreshScheduleMapProperty.Builder.() -> Unit): Unit =
        schedule(RefreshScheduleMapProperty(schedule))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnRefreshSchedule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRefreshSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRefreshSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule):
        CfnRefreshSchedule = CfnRefreshSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnRefreshSchedule):
        software.amazon.awscdk.services.quicksight.CfnRefreshSchedule = wrapped.cdkObject
  }

  public interface ScheduleFrequencyProperty {
    public fun interval(): String? = unwrap(this).getInterval()

    public fun refreshOnDay(): Any? = unwrap(this).getRefreshOnDay()

    public fun timeOfTheDay(): String? = unwrap(this).getTimeOfTheDay()

    public fun timeZone(): String? = unwrap(this).getTimeZone()

    public interface Builder {
      public fun interval(interval: String)

      public fun refreshOnDay(refreshOnDay: IResolvable)

      public fun refreshOnDay(refreshOnDay: RefreshOnDayProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2aabefabd2b49635906ee287c73e7cab744c88a7bdfcfa93bfe65dda8f54d64e")
      public fun refreshOnDay(refreshOnDay: RefreshOnDayProperty.Builder.() -> Unit)

      public fun timeOfTheDay(timeOfTheDay: String)

      public fun timeZone(timeZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty.builder()

      override fun interval(interval: String) {
        cdkBuilder.interval(interval)
      }

      override fun refreshOnDay(refreshOnDay: IResolvable) {
        cdkBuilder.refreshOnDay(refreshOnDay.let(IResolvable::unwrap))
      }

      override fun refreshOnDay(refreshOnDay: RefreshOnDayProperty) {
        cdkBuilder.refreshOnDay(refreshOnDay.let(RefreshOnDayProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2aabefabd2b49635906ee287c73e7cab744c88a7bdfcfa93bfe65dda8f54d64e")
      override fun refreshOnDay(refreshOnDay: RefreshOnDayProperty.Builder.() -> Unit): Unit =
          refreshOnDay(RefreshOnDayProperty(refreshOnDay))

      override fun timeOfTheDay(timeOfTheDay: String) {
        cdkBuilder.timeOfTheDay(timeOfTheDay)
      }

      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty,
    ) : ScheduleFrequencyProperty {
      override fun interval(): String? = unwrap(this).getInterval()

      override fun refreshOnDay(): Any? = unwrap(this).getRefreshOnDay()

      override fun timeOfTheDay(): String? = unwrap(this).getTimeOfTheDay()

      override fun timeZone(): String? = unwrap(this).getTimeZone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleFrequencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty):
          ScheduleFrequencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleFrequencyProperty):
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.ScheduleFrequencyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RefreshOnDayProperty {
    public fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

    public fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()

    public interface Builder {
      public fun dayOfMonth(dayOfMonth: String)

      public fun dayOfWeek(dayOfWeek: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty.builder()

      override fun dayOfMonth(dayOfMonth: String) {
        cdkBuilder.dayOfMonth(dayOfMonth)
      }

      override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty,
    ) : RefreshOnDayProperty {
      override fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

      override fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshOnDayProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty):
          RefreshOnDayProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshOnDayProperty):
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshOnDayProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RefreshScheduleMapProperty {
    public fun refreshType(): String? = unwrap(this).getRefreshType()

    public fun scheduleFrequency(): Any? = unwrap(this).getScheduleFrequency()

    public fun scheduleId(): String? = unwrap(this).getScheduleId()

    public fun startAfterDateTime(): String? = unwrap(this).getStartAfterDateTime()

    public interface Builder {
      public fun refreshType(refreshType: String)

      public fun scheduleFrequency(scheduleFrequency: IResolvable)

      public fun scheduleFrequency(scheduleFrequency: ScheduleFrequencyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd298fed8f8ced1e9e3f632ed02bbb645481d7e8f484bb4a92d79efaf1a1e651")
      public fun scheduleFrequency(scheduleFrequency: ScheduleFrequencyProperty.Builder.() -> Unit)

      public fun scheduleId(scheduleId: String)

      public fun startAfterDateTime(startAfterDateTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty.builder()

      override fun refreshType(refreshType: String) {
        cdkBuilder.refreshType(refreshType)
      }

      override fun scheduleFrequency(scheduleFrequency: IResolvable) {
        cdkBuilder.scheduleFrequency(scheduleFrequency.let(IResolvable::unwrap))
      }

      override fun scheduleFrequency(scheduleFrequency: ScheduleFrequencyProperty) {
        cdkBuilder.scheduleFrequency(scheduleFrequency.let(ScheduleFrequencyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd298fed8f8ced1e9e3f632ed02bbb645481d7e8f484bb4a92d79efaf1a1e651")
      override
          fun scheduleFrequency(scheduleFrequency: ScheduleFrequencyProperty.Builder.() -> Unit):
          Unit = scheduleFrequency(ScheduleFrequencyProperty(scheduleFrequency))

      override fun scheduleId(scheduleId: String) {
        cdkBuilder.scheduleId(scheduleId)
      }

      override fun startAfterDateTime(startAfterDateTime: String) {
        cdkBuilder.startAfterDateTime(startAfterDateTime)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty,
    ) : RefreshScheduleMapProperty {
      override fun refreshType(): String? = unwrap(this).getRefreshType()

      override fun scheduleFrequency(): Any? = unwrap(this).getScheduleFrequency()

      override fun scheduleId(): String? = unwrap(this).getScheduleId()

      override fun startAfterDateTime(): String? = unwrap(this).getStartAfterDateTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshScheduleMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty):
          RefreshScheduleMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshScheduleMapProperty):
          software.amazon.awscdk.services.quicksight.CfnRefreshSchedule.RefreshScheduleMapProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
