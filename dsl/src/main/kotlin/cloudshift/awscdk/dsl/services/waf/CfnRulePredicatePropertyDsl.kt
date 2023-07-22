@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnRule

/**
 * Specifies the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet`
 * , `GeoMatchSet` , and `SizeConstraintSet` objects that you want to add to a `Rule` and, for each
 * object, indicates whether you want to negate the settings, for example, requests that do NOT
 * originate from the IP address 192.0.2.44.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * PredicateProperty predicateProperty = PredicateProperty.builder()
 * .dataId("dataId")
 * .negated(false)
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicate.html)
 */
@CdkDslMarker
public class CfnRulePredicatePropertyDsl {
  private val cdkBuilder: CfnRule.PredicateProperty.Builder = CfnRule.PredicateProperty.builder()

  /**
   * @param dataId A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or
   * `IPSetId` . 
   * The ID is returned by the corresponding `Create` or `List` command.
   */
  public fun dataId(dataId: String) {
    cdkBuilder.dataId(dataId)
  }

  /**
   * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count requests
   * based on the settings in the specified `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
   * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . 
   * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or block
   * requests based on that IP address.
   *
   * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the negation
   * of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` , `XssMatchSet` ,
   * `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example, if an `IPSet` includes the
   * IP address `192.0.2.44` , AWS WAF will allow, block, or count requests based on all IP addresses
   * *except* `192.0.2.44` .
   */
  public fun negated(negated: Boolean) {
    cdkBuilder.negated(negated)
  }

  /**
   * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count requests
   * based on the settings in the specified `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
   * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . 
   * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or block
   * requests based on that IP address.
   *
   * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the negation
   * of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` , `XssMatchSet` ,
   * `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example, if an `IPSet` includes the
   * IP address `192.0.2.44` , AWS WAF will allow, block, or count requests based on all IP addresses
   * *except* `192.0.2.44` .
   */
  public fun negated(negated: IResolvable) {
    cdkBuilder.negated(negated)
  }

  /**
   * @param type The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` . 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnRule.PredicateProperty = cdkBuilder.build()
}
