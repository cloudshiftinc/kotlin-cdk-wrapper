@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget

@CdkDslMarker
public class CfnBudgetCostTypesPropertyDsl {
  private val cdkBuilder: CfnBudget.CostTypesProperty.Builder =
      CfnBudget.CostTypesProperty.builder()

  public fun includeCredit(includeCredit: Boolean) {
    cdkBuilder.includeCredit(includeCredit)
  }

  public fun includeCredit(includeCredit: IResolvable) {
    cdkBuilder.includeCredit(includeCredit)
  }

  public fun includeDiscount(includeDiscount: Boolean) {
    cdkBuilder.includeDiscount(includeDiscount)
  }

  public fun includeDiscount(includeDiscount: IResolvable) {
    cdkBuilder.includeDiscount(includeDiscount)
  }

  public fun includeOtherSubscription(includeOtherSubscription: Boolean) {
    cdkBuilder.includeOtherSubscription(includeOtherSubscription)
  }

  public fun includeOtherSubscription(includeOtherSubscription: IResolvable) {
    cdkBuilder.includeOtherSubscription(includeOtherSubscription)
  }

  public fun includeRecurring(includeRecurring: Boolean) {
    cdkBuilder.includeRecurring(includeRecurring)
  }

  public fun includeRecurring(includeRecurring: IResolvable) {
    cdkBuilder.includeRecurring(includeRecurring)
  }

  public fun includeRefund(includeRefund: Boolean) {
    cdkBuilder.includeRefund(includeRefund)
  }

  public fun includeRefund(includeRefund: IResolvable) {
    cdkBuilder.includeRefund(includeRefund)
  }

  public fun includeSubscription(includeSubscription: Boolean) {
    cdkBuilder.includeSubscription(includeSubscription)
  }

  public fun includeSubscription(includeSubscription: IResolvable) {
    cdkBuilder.includeSubscription(includeSubscription)
  }

  public fun includeSupport(includeSupport: Boolean) {
    cdkBuilder.includeSupport(includeSupport)
  }

  public fun includeSupport(includeSupport: IResolvable) {
    cdkBuilder.includeSupport(includeSupport)
  }

  public fun includeTax(includeTax: Boolean) {
    cdkBuilder.includeTax(includeTax)
  }

  public fun includeTax(includeTax: IResolvable) {
    cdkBuilder.includeTax(includeTax)
  }

  public fun includeUpfront(includeUpfront: Boolean) {
    cdkBuilder.includeUpfront(includeUpfront)
  }

  public fun includeUpfront(includeUpfront: IResolvable) {
    cdkBuilder.includeUpfront(includeUpfront)
  }

  public fun useAmortized(useAmortized: Boolean) {
    cdkBuilder.useAmortized(useAmortized)
  }

  public fun useAmortized(useAmortized: IResolvable) {
    cdkBuilder.useAmortized(useAmortized)
  }

  public fun useBlended(useBlended: Boolean) {
    cdkBuilder.useBlended(useBlended)
  }

  public fun useBlended(useBlended: IResolvable) {
    cdkBuilder.useBlended(useBlended)
  }

  public fun build(): CfnBudget.CostTypesProperty = cdkBuilder.build()
}
