package io.cloudshiftdev.awscdk.services.budgets

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBudget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.budgets.CfnBudget,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun budget(): Any = unwrap(this).getBudget()

  public open fun budget(`value`: IResolvable) {
    unwrap(this).setBudget(`value`.let(IResolvable::unwrap))
  }

  public open fun budget(`value`: BudgetDataProperty) {
    unwrap(this).setBudget(`value`.let(BudgetDataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec15b9885e0b46bad7ec5e25e4e8f0e45f5a7eb32cc6100ea7e4859e06bd94c6")
  public open fun budget(`value`: BudgetDataProperty.Builder.() -> Unit): Unit =
      budget(BudgetDataProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun notificationsWithSubscribers(): Any? =
      unwrap(this).getNotificationsWithSubscribers()

  public open fun notificationsWithSubscribers(`value`: IResolvable) {
    unwrap(this).setNotificationsWithSubscribers(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationsWithSubscribers(__idx_ac66f0: List<Any>) {
    unwrap(this).setNotificationsWithSubscribers(__idx_ac66f0)
  }

  public interface Builder {
    public fun budget(budget: IResolvable) {
    }

    public fun budget(budget: BudgetDataProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("805381e53d3bae26faaf147ecc7138d323f4e3bcc3f9e783f86d2f96395ae6d3")
    public fun budget(budget: BudgetDataProperty.Builder.() -> Unit) {
    }

    public fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable) {
    }

    public fun notificationsWithSubscribers(notificationsWithSubscribers: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.budgets.CfnBudget.Builder =
        software.amazon.awscdk.services.budgets.CfnBudget.Builder.create(scope, id)

    public override fun budget(budget: IResolvable) {
      cdkBuilder.budget(budget.let(IResolvable::unwrap))
    }

    public override fun budget(budget: BudgetDataProperty) {
      cdkBuilder.budget(budget.let(BudgetDataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("805381e53d3bae26faaf147ecc7138d323f4e3bcc3f9e783f86d2f96395ae6d3")
    public override fun budget(budget: BudgetDataProperty.Builder.() -> Unit): Unit =
        budget(BudgetDataProperty(budget))

    public override fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable) {
      cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers.let(IResolvable::unwrap))
    }

    public override fun notificationsWithSubscribers(notificationsWithSubscribers: List<Any>) {
      cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers)
    }

    public fun build(): software.amazon.awscdk.services.budgets.CfnBudget = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBudget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBudget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget): CfnBudget =
        CfnBudget(cdkObject)

    internal fun unwrap(wrapped: CfnBudget): software.amazon.awscdk.services.budgets.CfnBudget =
        wrapped.cdkObject
  }

  public interface BudgetDataProperty {
    public fun autoAdjustData(): Any? = unwrap(this).getAutoAdjustData()

    public fun budgetLimit(): Any? = unwrap(this).getBudgetLimit()

    public fun budgetName(): String? = unwrap(this).getBudgetName()

    public fun budgetType(): String

    public fun costFilters(): Any? = unwrap(this).getCostFilters()

    public fun costTypes(): Any? = unwrap(this).getCostTypes()

    public fun plannedBudgetLimits(): Any? = unwrap(this).getPlannedBudgetLimits()

    public fun timePeriod(): Any? = unwrap(this).getTimePeriod()

    public fun timeUnit(): String

    public interface Builder {
      public fun autoAdjustData(autoAdjustData: IResolvable) {
      }

      public fun autoAdjustData(autoAdjustData: AutoAdjustDataProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88da46d360439fbdd476f26c072bc4756180ee7bf65db6f45bcaf700dd1a5cc2")
      public fun autoAdjustData(autoAdjustData: AutoAdjustDataProperty.Builder.() -> Unit) {
      }

      public fun budgetLimit(budgetLimit: IResolvable) {
      }

      public fun budgetLimit(budgetLimit: SpendProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9929afba155990a7b3a96b9693be190ec7ff27cc990634ebd7d705d12c04bd3")
      public fun budgetLimit(budgetLimit: SpendProperty.Builder.() -> Unit) {
      }

      public fun budgetName(budgetName: String) {
      }

      public fun budgetType(budgetType: String) {
      }

      public fun costFilters(costFilters: Any) {
      }

      public fun costTypes(costTypes: IResolvable) {
      }

      public fun costTypes(costTypes: CostTypesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cf7f848834fde77eaa0b63ed9552ca5b82e3a0feebc0022953f77cb7a7d5f2d")
      public fun costTypes(costTypes: CostTypesProperty.Builder.() -> Unit) {
      }

      public fun plannedBudgetLimits(plannedBudgetLimits: Any) {
      }

      public fun timePeriod(timePeriod: IResolvable) {
      }

      public fun timePeriod(timePeriod: TimePeriodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f58d149cd4e7598ae6a77dfe53d7eda6c7ebed8332b42d73fc1aba4117073fc")
      public fun timePeriod(timePeriod: TimePeriodProperty.Builder.() -> Unit) {
      }

      public fun timeUnit(timeUnit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.builder()

      public override fun autoAdjustData(autoAdjustData: IResolvable) {
        cdkBuilder.autoAdjustData(autoAdjustData.let(IResolvable::unwrap))
      }

      public override fun autoAdjustData(autoAdjustData: AutoAdjustDataProperty) {
        cdkBuilder.autoAdjustData(autoAdjustData.let(AutoAdjustDataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88da46d360439fbdd476f26c072bc4756180ee7bf65db6f45bcaf700dd1a5cc2")
      public override fun autoAdjustData(autoAdjustData: AutoAdjustDataProperty.Builder.() -> Unit):
          Unit = autoAdjustData(AutoAdjustDataProperty(autoAdjustData))

      public override fun budgetLimit(budgetLimit: IResolvable) {
        cdkBuilder.budgetLimit(budgetLimit.let(IResolvable::unwrap))
      }

      public override fun budgetLimit(budgetLimit: SpendProperty) {
        cdkBuilder.budgetLimit(budgetLimit.let(SpendProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9929afba155990a7b3a96b9693be190ec7ff27cc990634ebd7d705d12c04bd3")
      public override fun budgetLimit(budgetLimit: SpendProperty.Builder.() -> Unit): Unit =
          budgetLimit(SpendProperty(budgetLimit))

      public override fun budgetName(budgetName: String) {
        cdkBuilder.budgetName(budgetName)
      }

      public override fun budgetType(budgetType: String) {
        cdkBuilder.budgetType(budgetType)
      }

      public override fun costFilters(costFilters: Any) {
        cdkBuilder.costFilters(costFilters)
      }

      public override fun costTypes(costTypes: IResolvable) {
        cdkBuilder.costTypes(costTypes.let(IResolvable::unwrap))
      }

      public override fun costTypes(costTypes: CostTypesProperty) {
        cdkBuilder.costTypes(costTypes.let(CostTypesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cf7f848834fde77eaa0b63ed9552ca5b82e3a0feebc0022953f77cb7a7d5f2d")
      public override fun costTypes(costTypes: CostTypesProperty.Builder.() -> Unit): Unit =
          costTypes(CostTypesProperty(costTypes))

      public override fun plannedBudgetLimits(plannedBudgetLimits: Any) {
        cdkBuilder.plannedBudgetLimits(plannedBudgetLimits)
      }

      public override fun timePeriod(timePeriod: IResolvable) {
        cdkBuilder.timePeriod(timePeriod.let(IResolvable::unwrap))
      }

      public override fun timePeriod(timePeriod: TimePeriodProperty) {
        cdkBuilder.timePeriod(timePeriod.let(TimePeriodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f58d149cd4e7598ae6a77dfe53d7eda6c7ebed8332b42d73fc1aba4117073fc")
      public override fun timePeriod(timePeriod: TimePeriodProperty.Builder.() -> Unit): Unit =
          timePeriod(TimePeriodProperty(timePeriod))

      public override fun timeUnit(timeUnit: String) {
        cdkBuilder.timeUnit(timeUnit)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty,
    ) : BudgetDataProperty {
      public override fun autoAdjustData(): Any? = unwrap(this).getAutoAdjustData()

      public override fun budgetLimit(): Any? = unwrap(this).getBudgetLimit()

      public override fun budgetName(): String? = unwrap(this).getBudgetName()

      public override fun budgetType(): String = unwrap(this).getBudgetType()

      public override fun costFilters(): Any? = unwrap(this).getCostFilters()

      public override fun costTypes(): Any? = unwrap(this).getCostTypes()

      public override fun plannedBudgetLimits(): Any? = unwrap(this).getPlannedBudgetLimits()

      public override fun timePeriod(): Any? = unwrap(this).getTimePeriod()

      public override fun timeUnit(): String = unwrap(this).getTimeUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BudgetDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty):
          BudgetDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BudgetDataProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AutoAdjustDataProperty {
    public fun autoAdjustType(): String

    public fun historicalOptions(): Any? = unwrap(this).getHistoricalOptions()

    public interface Builder {
      public fun autoAdjustType(autoAdjustType: String) {
      }

      public fun historicalOptions(historicalOptions: IResolvable) {
      }

      public fun historicalOptions(historicalOptions: HistoricalOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5eceb443e67551a23c0248352444c86100f311f34ebddb20ea68d14d5ad8abaf")
      public
          fun historicalOptions(historicalOptions: HistoricalOptionsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty.builder()

      public override fun autoAdjustType(autoAdjustType: String) {
        cdkBuilder.autoAdjustType(autoAdjustType)
      }

      public override fun historicalOptions(historicalOptions: IResolvable) {
        cdkBuilder.historicalOptions(historicalOptions.let(IResolvable::unwrap))
      }

      public override fun historicalOptions(historicalOptions: HistoricalOptionsProperty) {
        cdkBuilder.historicalOptions(historicalOptions.let(HistoricalOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5eceb443e67551a23c0248352444c86100f311f34ebddb20ea68d14d5ad8abaf")
      public override
          fun historicalOptions(historicalOptions: HistoricalOptionsProperty.Builder.() -> Unit):
          Unit = historicalOptions(HistoricalOptionsProperty(historicalOptions))

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty,
    ) : AutoAdjustDataProperty {
      public override fun autoAdjustType(): String = unwrap(this).getAutoAdjustType()

      public override fun historicalOptions(): Any? = unwrap(this).getHistoricalOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoAdjustDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty):
          AutoAdjustDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoAdjustDataProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TimePeriodProperty {
    public fun end(): String? = unwrap(this).getEnd()

    public fun start(): String? = unwrap(this).getStart()

    public interface Builder {
      public fun end(end: String) {
      }

      public fun start(start: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.builder()

      public override fun end(end: String) {
        cdkBuilder.end(end)
      }

      public override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty,
    ) : TimePeriodProperty {
      public override fun end(): String? = unwrap(this).getEnd()

      public override fun start(): String? = unwrap(this).getStart()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimePeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty):
          TimePeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimePeriodProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SpendProperty {
    public fun amount(): Number

    public fun unit(): String

    public interface Builder {
      public fun amount(amount: Number) {
      }

      public fun unit(unit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.builder()

      public override fun amount(amount: Number) {
        cdkBuilder.amount(amount)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty,
    ) : SpendProperty {
      public override fun amount(): Number = unwrap(this).getAmount()

      public override fun unit(): String = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpendProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty):
          SpendProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpendProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HistoricalOptionsProperty {
    public fun budgetAdjustmentPeriod(): Number

    public interface Builder {
      public fun budgetAdjustmentPeriod(budgetAdjustmentPeriod: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty.builder()

      public override fun budgetAdjustmentPeriod(budgetAdjustmentPeriod: Number) {
        cdkBuilder.budgetAdjustmentPeriod(budgetAdjustmentPeriod)
      }

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty,
    ) : HistoricalOptionsProperty {
      public override fun budgetAdjustmentPeriod(): Number =
          unwrap(this).getBudgetAdjustmentPeriod()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HistoricalOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty):
          HistoricalOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HistoricalOptionsProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SubscriberProperty {
    public fun address(): String

    public fun subscriptionType(): String

    public interface Builder {
      public fun address(address: String) {
      }

      public fun subscriptionType(subscriptionType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.builder()

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public override fun subscriptionType(subscriptionType: String) {
        cdkBuilder.subscriptionType(subscriptionType)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty,
    ) : SubscriberProperty {
      public override fun address(): String = unwrap(this).getAddress()

      public override fun subscriptionType(): String = unwrap(this).getSubscriptionType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty):
          SubscriberProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriberProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NotificationWithSubscribersProperty {
    public fun notification(): Any

    public fun subscribers(): Any

    public interface Builder {
      public fun notification(notification: IResolvable) {
      }

      public fun notification(notification: NotificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be7d8f7c6331b0786274de1d180bb75d8b3e99b34d49f0a476f95488bf96d55b")
      public fun notification(notification: NotificationProperty.Builder.() -> Unit) {
      }

      public fun subscribers(subscribers: IResolvable) {
      }

      public fun subscribers(subscribers: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder
          =
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.builder()

      public override fun notification(notification: IResolvable) {
        cdkBuilder.notification(notification.let(IResolvable::unwrap))
      }

      public override fun notification(notification: NotificationProperty) {
        cdkBuilder.notification(notification.let(NotificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be7d8f7c6331b0786274de1d180bb75d8b3e99b34d49f0a476f95488bf96d55b")
      public override fun notification(notification: NotificationProperty.Builder.() -> Unit): Unit
          = notification(NotificationProperty(notification))

      public override fun subscribers(subscribers: IResolvable) {
        cdkBuilder.subscribers(subscribers.let(IResolvable::unwrap))
      }

      public override fun subscribers(subscribers: List<Any>) {
        cdkBuilder.subscribers(subscribers)
      }

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty,
    ) : NotificationWithSubscribersProperty {
      public override fun notification(): Any = unwrap(this).getNotification()

      public override fun subscribers(): Any = unwrap(this).getSubscribers()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationWithSubscribersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty):
          NotificationWithSubscribersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationWithSubscribersProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotificationProperty {
    public fun comparisonOperator(): String

    public fun notificationType(): String

    public fun threshold(): Number

    public fun thresholdType(): String? = unwrap(this).getThresholdType()

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String) {
      }

      public fun notificationType(notificationType: String) {
      }

      public fun threshold(threshold: Number) {
      }

      public fun thresholdType(thresholdType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.builder()

      public override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      public override fun notificationType(notificationType: String) {
        cdkBuilder.notificationType(notificationType)
      }

      public override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      public override fun thresholdType(thresholdType: String) {
        cdkBuilder.thresholdType(thresholdType)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty,
    ) : NotificationProperty {
      public override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      public override fun notificationType(): String = unwrap(this).getNotificationType()

      public override fun threshold(): Number = unwrap(this).getThreshold()

      public override fun thresholdType(): String? = unwrap(this).getThresholdType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty):
          NotificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CostTypesProperty {
    public fun includeCredit(): Any? = unwrap(this).getIncludeCredit()

    public fun includeDiscount(): Any? = unwrap(this).getIncludeDiscount()

    public fun includeOtherSubscription(): Any? = unwrap(this).getIncludeOtherSubscription()

    public fun includeRecurring(): Any? = unwrap(this).getIncludeRecurring()

    public fun includeRefund(): Any? = unwrap(this).getIncludeRefund()

    public fun includeSubscription(): Any? = unwrap(this).getIncludeSubscription()

    public fun includeSupport(): Any? = unwrap(this).getIncludeSupport()

    public fun includeTax(): Any? = unwrap(this).getIncludeTax()

    public fun includeUpfront(): Any? = unwrap(this).getIncludeUpfront()

    public fun useAmortized(): Any? = unwrap(this).getUseAmortized()

    public fun useBlended(): Any? = unwrap(this).getUseBlended()

    public interface Builder {
      public fun includeCredit(includeCredit: Boolean) {
      }

      public fun includeCredit(includeCredit: IResolvable) {
      }

      public fun includeDiscount(includeDiscount: Boolean) {
      }

      public fun includeDiscount(includeDiscount: IResolvable) {
      }

      public fun includeOtherSubscription(includeOtherSubscription: Boolean) {
      }

      public fun includeOtherSubscription(includeOtherSubscription: IResolvable) {
      }

      public fun includeRecurring(includeRecurring: Boolean) {
      }

      public fun includeRecurring(includeRecurring: IResolvable) {
      }

      public fun includeRefund(includeRefund: Boolean) {
      }

      public fun includeRefund(includeRefund: IResolvable) {
      }

      public fun includeSubscription(includeSubscription: Boolean) {
      }

      public fun includeSubscription(includeSubscription: IResolvable) {
      }

      public fun includeSupport(includeSupport: Boolean) {
      }

      public fun includeSupport(includeSupport: IResolvable) {
      }

      public fun includeTax(includeTax: Boolean) {
      }

      public fun includeTax(includeTax: IResolvable) {
      }

      public fun includeUpfront(includeUpfront: Boolean) {
      }

      public fun includeUpfront(includeUpfront: IResolvable) {
      }

      public fun useAmortized(useAmortized: Boolean) {
      }

      public fun useAmortized(useAmortized: IResolvable) {
      }

      public fun useBlended(useBlended: Boolean) {
      }

      public fun useBlended(useBlended: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.builder()

      public override fun includeCredit(includeCredit: Boolean) {
        cdkBuilder.includeCredit(includeCredit)
      }

      public override fun includeCredit(includeCredit: IResolvable) {
        cdkBuilder.includeCredit(includeCredit.let(IResolvable::unwrap))
      }

      public override fun includeDiscount(includeDiscount: Boolean) {
        cdkBuilder.includeDiscount(includeDiscount)
      }

      public override fun includeDiscount(includeDiscount: IResolvable) {
        cdkBuilder.includeDiscount(includeDiscount.let(IResolvable::unwrap))
      }

      public override fun includeOtherSubscription(includeOtherSubscription: Boolean) {
        cdkBuilder.includeOtherSubscription(includeOtherSubscription)
      }

      public override fun includeOtherSubscription(includeOtherSubscription: IResolvable) {
        cdkBuilder.includeOtherSubscription(includeOtherSubscription.let(IResolvable::unwrap))
      }

      public override fun includeRecurring(includeRecurring: Boolean) {
        cdkBuilder.includeRecurring(includeRecurring)
      }

      public override fun includeRecurring(includeRecurring: IResolvable) {
        cdkBuilder.includeRecurring(includeRecurring.let(IResolvable::unwrap))
      }

      public override fun includeRefund(includeRefund: Boolean) {
        cdkBuilder.includeRefund(includeRefund)
      }

      public override fun includeRefund(includeRefund: IResolvable) {
        cdkBuilder.includeRefund(includeRefund.let(IResolvable::unwrap))
      }

      public override fun includeSubscription(includeSubscription: Boolean) {
        cdkBuilder.includeSubscription(includeSubscription)
      }

      public override fun includeSubscription(includeSubscription: IResolvable) {
        cdkBuilder.includeSubscription(includeSubscription.let(IResolvable::unwrap))
      }

      public override fun includeSupport(includeSupport: Boolean) {
        cdkBuilder.includeSupport(includeSupport)
      }

      public override fun includeSupport(includeSupport: IResolvable) {
        cdkBuilder.includeSupport(includeSupport.let(IResolvable::unwrap))
      }

      public override fun includeTax(includeTax: Boolean) {
        cdkBuilder.includeTax(includeTax)
      }

      public override fun includeTax(includeTax: IResolvable) {
        cdkBuilder.includeTax(includeTax.let(IResolvable::unwrap))
      }

      public override fun includeUpfront(includeUpfront: Boolean) {
        cdkBuilder.includeUpfront(includeUpfront)
      }

      public override fun includeUpfront(includeUpfront: IResolvable) {
        cdkBuilder.includeUpfront(includeUpfront.let(IResolvable::unwrap))
      }

      public override fun useAmortized(useAmortized: Boolean) {
        cdkBuilder.useAmortized(useAmortized)
      }

      public override fun useAmortized(useAmortized: IResolvable) {
        cdkBuilder.useAmortized(useAmortized.let(IResolvable::unwrap))
      }

      public override fun useBlended(useBlended: Boolean) {
        cdkBuilder.useBlended(useBlended)
      }

      public override fun useBlended(useBlended: IResolvable) {
        cdkBuilder.useBlended(useBlended.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty,
    ) : CostTypesProperty {
      public override fun includeCredit(): Any? = unwrap(this).getIncludeCredit()

      public override fun includeDiscount(): Any? = unwrap(this).getIncludeDiscount()

      public override fun includeOtherSubscription(): Any? =
          unwrap(this).getIncludeOtherSubscription()

      public override fun includeRecurring(): Any? = unwrap(this).getIncludeRecurring()

      public override fun includeRefund(): Any? = unwrap(this).getIncludeRefund()

      public override fun includeSubscription(): Any? = unwrap(this).getIncludeSubscription()

      public override fun includeSupport(): Any? = unwrap(this).getIncludeSupport()

      public override fun includeTax(): Any? = unwrap(this).getIncludeTax()

      public override fun includeUpfront(): Any? = unwrap(this).getIncludeUpfront()

      public override fun useAmortized(): Any? = unwrap(this).getUseAmortized()

      public override fun useBlended(): Any? = unwrap(this).getUseBlended()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CostTypesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty):
          CostTypesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CostTypesProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
