@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sns.BetweenCondition
import software.amazon.awscdk.services.sns.NumericConditions

@CdkDslMarker
public class NumericConditionsDsl {
  private val cdkBuilder: NumericConditions.Builder = NumericConditions.builder()

  private val _allowlist: MutableList<Number> = mutableListOf()

  public fun allowlist(vararg allowlist: Number) {
    _allowlist.addAll(listOf(*allowlist))
  }

  public fun allowlist(allowlist: Collection<Number>) {
    _allowlist.addAll(allowlist)
  }

  public fun between(block: BetweenConditionDsl.() -> Unit = {}) {
    val builder = BetweenConditionDsl()
    builder.apply(block)
    cdkBuilder.between(builder.build())
  }

  public fun between(between: BetweenCondition) {
    cdkBuilder.between(between)
  }

  public fun betweenStrict(block: BetweenConditionDsl.() -> Unit = {}) {
    val builder = BetweenConditionDsl()
    builder.apply(block)
    cdkBuilder.betweenStrict(builder.build())
  }

  public fun betweenStrict(betweenStrict: BetweenCondition) {
    cdkBuilder.betweenStrict(betweenStrict)
  }

  public fun greaterThan(greaterThan: Number) {
    cdkBuilder.greaterThan(greaterThan)
  }

  public fun greaterThanOrEqualTo(greaterThanOrEqualTo: Number) {
    cdkBuilder.greaterThanOrEqualTo(greaterThanOrEqualTo)
  }

  public fun lessThan(lessThan: Number) {
    cdkBuilder.lessThan(lessThan)
  }

  public fun lessThanOrEqualTo(lessThanOrEqualTo: Number) {
    cdkBuilder.lessThanOrEqualTo(lessThanOrEqualTo)
  }

  public fun build(): NumericConditions {
    if(_allowlist.isNotEmpty()) cdkBuilder.allowlist(_allowlist)
    return cdkBuilder.build()
  }
}
