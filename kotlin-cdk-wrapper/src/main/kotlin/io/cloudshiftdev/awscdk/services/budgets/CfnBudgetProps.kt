@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.budgets

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBudgetProps {
  public fun budget(): Any

  public fun notificationsWithSubscribers(): Any? = unwrap(this).getNotificationsWithSubscribers()

  @CdkDslMarker
  public interface Builder {
    public fun budget(budget: IResolvable)

    public fun budget(budget: CfnBudget.BudgetDataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4934b00ace1fddd3bdf38d9af5920b5480ab1e28ba84c56df3b4e0575ad1e34c")
    public fun budget(budget: CfnBudget.BudgetDataProperty.Builder.() -> Unit)

    public fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable)

    public fun notificationsWithSubscribers(notificationsWithSubscribers: List<Any>)

    public fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder =
        software.amazon.awscdk.services.budgets.CfnBudgetProps.builder()

    override fun budget(budget: IResolvable) {
      cdkBuilder.budget(budget.let(IResolvable::unwrap))
    }

    override fun budget(budget: CfnBudget.BudgetDataProperty) {
      cdkBuilder.budget(budget.let(CfnBudget.BudgetDataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4934b00ace1fddd3bdf38d9af5920b5480ab1e28ba84c56df3b4e0575ad1e34c")
    override fun budget(budget: CfnBudget.BudgetDataProperty.Builder.() -> Unit): Unit =
        budget(CfnBudget.BudgetDataProperty(budget))

    override fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable) {
      cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers.let(IResolvable::unwrap))
    }

    override fun notificationsWithSubscribers(notificationsWithSubscribers: List<Any>) {
      cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers)
    }

    override fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any): Unit =
        notificationsWithSubscribers(notificationsWithSubscribers.toList())

    public fun build(): software.amazon.awscdk.services.budgets.CfnBudgetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetProps,
  ) : CdkObject(cdkObject), CfnBudgetProps {
    override fun budget(): Any = unwrap(this).getBudget()

    override fun notificationsWithSubscribers(): Any? =
        unwrap(this).getNotificationsWithSubscribers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBudgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetProps):
        CfnBudgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBudgetProps):
        software.amazon.awscdk.services.budgets.CfnBudgetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.budgets.CfnBudgetProps
  }
}
