@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupSizeConstraintStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.SizeConstraintStatementProperty.Builder =
      CfnRuleGroup.SizeConstraintStatementProperty.builder()

  private val _textTransformations: MutableList<Any> = mutableListOf()

  /**
   * @param comparisonOperator The operator to use to compare the request part to the size setting. 
   */
  public fun comparisonOperator(comparisonOperator: String) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  /**
   * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
   */
  public fun fieldToMatch(fieldToMatch: IResolvable) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  /**
   * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
   */
  public fun fieldToMatch(fieldToMatch: CfnRuleGroup.FieldToMatchProperty) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  /**
   * @param size The size, in byte, to compare to the request part, after any transformations. 
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  /**
   * @param textTransformations Text transformations eliminate some of the unusual formatting that
   * attackers use in web requests in an effort to bypass detection. 
   * If you specify one or more transformations in a rule statement, AWS WAF performs all
   * transformations on the content of the request component identified by `FieldToMatch` , starting
   * from the lowest priority setting, before inspecting the content for a match.
   */
  public fun textTransformations(vararg textTransformations: Any) {
    _textTransformations.addAll(listOf(*textTransformations))
  }

  /**
   * @param textTransformations Text transformations eliminate some of the unusual formatting that
   * attackers use in web requests in an effort to bypass detection. 
   * If you specify one or more transformations in a rule statement, AWS WAF performs all
   * transformations on the content of the request component identified by `FieldToMatch` , starting
   * from the lowest priority setting, before inspecting the content for a match.
   */
  public fun textTransformations(textTransformations: Collection<Any>) {
    _textTransformations.addAll(textTransformations)
  }

  /**
   * @param textTransformations Text transformations eliminate some of the unusual formatting that
   * attackers use in web requests in an effort to bypass detection. 
   * If you specify one or more transformations in a rule statement, AWS WAF performs all
   * transformations on the content of the request component identified by `FieldToMatch` , starting
   * from the lowest priority setting, before inspecting the content for a match.
   */
  public fun textTransformations(textTransformations: IResolvable) {
    cdkBuilder.textTransformations(textTransformations)
  }

  public fun build(): CfnRuleGroup.SizeConstraintStatementProperty {
    if(_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
    return cdkBuilder.build()
  }
}
