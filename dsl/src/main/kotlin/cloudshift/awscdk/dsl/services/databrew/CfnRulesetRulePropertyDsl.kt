@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRuleset

@CdkDslMarker
public class CfnRulesetRulePropertyDsl {
  private val cdkBuilder: CfnRuleset.RuleProperty.Builder = CfnRuleset.RuleProperty.builder()

  private val _columnSelectors: MutableList<Any> = mutableListOf()

  private val _substitutionMap: MutableList<Any> = mutableListOf()

  /**
   * @param checkExpression The expression which includes column references, condition names
   * followed by variable references, possibly grouped and combined with other conditions. 
   * For example, `(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with
   * :suffix1 or :col1 ends_with :suffix2)` . Column and value references are substitution variables
   * that should start with the ':' symbol. Depending on the context, substitution variables' values
   * can be either an actual value or a column name. These values are defined in the SubstitutionMap.
   * If a CheckExpression starts with a column reference, then ColumnSelectors in the rule should be
   * null. If ColumnSelectors has been defined, then there should be no columnn reference in the left
   * side of a condition, for example, `is_between :val1 and :val2` .
   */
  public fun checkExpression(checkExpression: String) {
    cdkBuilder.checkExpression(checkExpression)
  }

  /**
   * @param columnSelectors List of column selectors.
   * Selectors can be used to select columns using a name or regular expression from the dataset.
   * Rule will be applied to selected columns.
   */
  public fun columnSelectors(vararg columnSelectors: Any) {
    _columnSelectors.addAll(listOf(*columnSelectors))
  }

  /**
   * @param columnSelectors List of column selectors.
   * Selectors can be used to select columns using a name or regular expression from the dataset.
   * Rule will be applied to selected columns.
   */
  public fun columnSelectors(columnSelectors: Collection<Any>) {
    _columnSelectors.addAll(columnSelectors)
  }

  /**
   * @param columnSelectors List of column selectors.
   * Selectors can be used to select columns using a name or regular expression from the dataset.
   * Rule will be applied to selected columns.
   */
  public fun columnSelectors(columnSelectors: IResolvable) {
    cdkBuilder.columnSelectors(columnSelectors)
  }

  /**
   * @param disabled A value that specifies whether the rule is disabled.
   * Once a rule is disabled, a profile job will not validate it during a job run. Default value is
   * false.
   */
  public fun disabled(disabled: Boolean) {
    cdkBuilder.disabled(disabled)
  }

  /**
   * @param disabled A value that specifies whether the rule is disabled.
   * Once a rule is disabled, a profile job will not validate it during a job run. Default value is
   * false.
   */
  public fun disabled(disabled: IResolvable) {
    cdkBuilder.disabled(disabled)
  }

  /**
   * @param name The name of the rule. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param substitutionMap The map of substitution variable names to their values used in a check
   * expression.
   * Variable names should start with a ':' (colon). Variable values can either be actual values or
   * column names. To differentiate between the two, column names should be enclosed in backticks, for
   * example, `":col1": "`Column A`".`
   */
  public fun substitutionMap(vararg substitutionMap: Any) {
    _substitutionMap.addAll(listOf(*substitutionMap))
  }

  /**
   * @param substitutionMap The map of substitution variable names to their values used in a check
   * expression.
   * Variable names should start with a ':' (colon). Variable values can either be actual values or
   * column names. To differentiate between the two, column names should be enclosed in backticks, for
   * example, `":col1": "`Column A`".`
   */
  public fun substitutionMap(substitutionMap: Collection<Any>) {
    _substitutionMap.addAll(substitutionMap)
  }

  /**
   * @param substitutionMap The map of substitution variable names to their values used in a check
   * expression.
   * Variable names should start with a ':' (colon). Variable values can either be actual values or
   * column names. To differentiate between the two, column names should be enclosed in backticks, for
   * example, `":col1": "`Column A`".`
   */
  public fun substitutionMap(substitutionMap: IResolvable) {
    cdkBuilder.substitutionMap(substitutionMap)
  }

  /**
   * @param threshold The threshold used with a non-aggregate check expression.
   * Non-aggregate check expressions will be applied to each row in a specific column, and the
   * threshold will be used to determine whether the validation succeeds.
   */
  public fun threshold(threshold: IResolvable) {
    cdkBuilder.threshold(threshold)
  }

  /**
   * @param threshold The threshold used with a non-aggregate check expression.
   * Non-aggregate check expressions will be applied to each row in a specific column, and the
   * threshold will be used to determine whether the validation succeeds.
   */
  public fun threshold(threshold: CfnRuleset.ThresholdProperty) {
    cdkBuilder.threshold(threshold)
  }

  public fun build(): CfnRuleset.RuleProperty {
    if(_columnSelectors.isNotEmpty()) cdkBuilder.columnSelectors(_columnSelectors)
    if(_substitutionMap.isNotEmpty()) cdkBuilder.substitutionMap(_substitutionMap)
    return cdkBuilder.build()
  }
}
