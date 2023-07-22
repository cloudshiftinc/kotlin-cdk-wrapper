@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet
import software.constructs.Construct

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
