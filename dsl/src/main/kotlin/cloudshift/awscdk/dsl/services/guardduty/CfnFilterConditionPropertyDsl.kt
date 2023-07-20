@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.guardduty.CfnFilter

@CdkDslMarker
public class CfnFilterConditionPropertyDsl {
  private val cdkBuilder: CfnFilter.ConditionProperty.Builder =
      CfnFilter.ConditionProperty.builder()

  private val _eq: MutableList<String> = mutableListOf()

  private val _equalTo: MutableList<String> = mutableListOf()

  private val _neq: MutableList<String> = mutableListOf()

  private val _notEquals: MutableList<String> = mutableListOf()

  public fun eq(vararg eq: String) {
    _eq.addAll(listOf(*eq))
  }

  public fun eq(eq: Collection<String>) {
    _eq.addAll(eq)
  }

  public fun equalTo(vararg equalTo: String) {
    _equalTo.addAll(listOf(*equalTo))
  }

  public fun equalTo(equalTo: Collection<String>) {
    _equalTo.addAll(equalTo)
  }

  public fun greaterThan(greaterThan: Number) {
    cdkBuilder.greaterThan(greaterThan)
  }

  public fun greaterThanOrEqual(greaterThanOrEqual: Number) {
    cdkBuilder.greaterThanOrEqual(greaterThanOrEqual)
  }

  public fun gt(gt: Number) {
    cdkBuilder.gt(gt)
  }

  public fun gte(gte: Number) {
    cdkBuilder.gte(gte)
  }

  public fun lessThan(lessThan: Number) {
    cdkBuilder.lessThan(lessThan)
  }

  public fun lessThanOrEqual(lessThanOrEqual: Number) {
    cdkBuilder.lessThanOrEqual(lessThanOrEqual)
  }

  public fun lt(lt: Number) {
    cdkBuilder.lt(lt)
  }

  public fun lte(lte: Number) {
    cdkBuilder.lte(lte)
  }

  public fun neq(vararg neq: String) {
    _neq.addAll(listOf(*neq))
  }

  public fun neq(neq: Collection<String>) {
    _neq.addAll(neq)
  }

  public fun notEquals(vararg notEquals: String) {
    _notEquals.addAll(listOf(*notEquals))
  }

  public fun notEquals(notEquals: Collection<String>) {
    _notEquals.addAll(notEquals)
  }

  public fun build(): CfnFilter.ConditionProperty {
    if(_eq.isNotEmpty()) cdkBuilder.eq(_eq)
    if(_equalTo.isNotEmpty()) cdkBuilder.equalTo(_equalTo)
    if(_neq.isNotEmpty()) cdkBuilder.neq(_neq)
    if(_notEquals.isNotEmpty()) cdkBuilder.notEquals(_notEquals)
    return cdkBuilder.build()
  }
}
