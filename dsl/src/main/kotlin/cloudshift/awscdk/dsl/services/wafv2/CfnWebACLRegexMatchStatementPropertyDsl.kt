@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLRegexMatchStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.RegexMatchStatementProperty.Builder =
      CfnWebACL.RegexMatchStatementProperty.builder()

  private val _textTransformations: MutableList<Any> = mutableListOf()

  /**
   * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
   */
  public fun fieldToMatch(fieldToMatch: IResolvable) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  /**
   * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
   */
  public fun fieldToMatch(fieldToMatch: CfnWebACL.FieldToMatchProperty) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  /**
   * @param regexString The string representing the regular expression. 
   */
  public fun regexString(regexString: String) {
    cdkBuilder.regexString(regexString)
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

  public fun build(): CfnWebACL.RegexMatchStatementProperty {
    if(_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
    return cdkBuilder.build()
  }
}
