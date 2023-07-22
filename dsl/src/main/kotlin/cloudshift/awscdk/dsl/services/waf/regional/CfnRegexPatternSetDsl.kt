@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet
import software.constructs.Construct

/**
 * The `RegexPatternSet` specifies the regular expression (regex) pattern that you want AWS WAF to
 * search for, such as `B[a&#64;]dB[o0]t` .
 *
 * You can then configure AWS WAF to reject those requests.
 *
 * Note that you can only create regex pattern sets using a AWS CloudFormation template. To add the
 * regex pattern sets created through AWS CloudFormation to a RegexMatchSet, use the AWS WAF console,
 * API, or command line interface (CLI). For more information, see
 * [UpdateRegexMatchSet](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateRegexMatchSet.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnRegexPatternSet cfnRegexPatternSet = CfnRegexPatternSet.Builder.create(this,
 * "MyCfnRegexPatternSet")
 * .name("name")
 * .regexPatternStrings(List.of("regexPatternStrings"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html)
 */
@CdkDslMarker
public class CfnRegexPatternSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRegexPatternSet.Builder = CfnRegexPatternSet.Builder.create(scope, id)

  private val _regexPatternStrings: MutableList<String> = mutableListOf()

  /**
   * A friendly name or description of the `RegexPatternSet` .
   *
   * You can't change `Name` after you create a `RegexPatternSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-name)
   * @param name A friendly name or description of the `RegexPatternSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as
   * `B[a&#64;]dB[o0]t` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-regexpatternstrings)
   * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want AWS
   * WAF to search for, such as `B[a&#64;]dB[o0]t` . 
   */
  public fun regexPatternStrings(vararg regexPatternStrings: String) {
    _regexPatternStrings.addAll(listOf(*regexPatternStrings))
  }

  /**
   * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as
   * `B[a&#64;]dB[o0]t` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-regexpatternstrings)
   * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want AWS
   * WAF to search for, such as `B[a&#64;]dB[o0]t` . 
   */
  public fun regexPatternStrings(regexPatternStrings: Collection<String>) {
    _regexPatternStrings.addAll(regexPatternStrings)
  }

  public fun build(): CfnRegexPatternSet {
    if(_regexPatternStrings.isNotEmpty()) cdkBuilder.regexPatternStrings(_regexPatternStrings)
    return cdkBuilder.build()
  }
}
