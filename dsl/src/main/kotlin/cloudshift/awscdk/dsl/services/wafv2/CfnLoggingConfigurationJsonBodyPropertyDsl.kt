@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationJsonBodyPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.JsonBodyProperty.Builder =
      CfnLoggingConfiguration.JsonBodyProperty.builder()

  /**
   * @param invalidFallbackBehavior What AWS WAF should do if it fails to completely parse the JSON
   * body. The options are the following:.
   * * `EVALUATE_AS_STRING` - Inspect the body as plain text. AWS WAF applies the text
   * transformations and inspection criteria that you defined for the JSON inspection to the body text
   * string.
   * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
   * action to the request.
   * * `NO_MATCH` - Treat the web request as not matching the rule statement.
   *
   * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the
   * first parsing failure that it encounters.
   *
   * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons
   * such as invalid characters, duplicate keys, truncation, and any content whose root node isn't an
   * object or an array.
   *
   * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
   *
   * * Missing comma: `{"key1":"value1""key2":"value2"}`
   * * Missing colon: `{"key1":"value1","key2""value2"}`
   * * Extra colons: `{"key1"::"value1","key2""value2"}`
   */
  public fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
    cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
  }

  /**
   * @param matchPattern The patterns to look for in the JSON body. 
   * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
   */
  public fun matchPattern(matchPattern: IResolvable) {
    cdkBuilder.matchPattern(matchPattern)
  }

  /**
   * @param matchPattern The patterns to look for in the JSON body. 
   * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
   */
  public fun matchPattern(matchPattern: CfnLoggingConfiguration.MatchPatternProperty) {
    cdkBuilder.matchPattern(matchPattern)
  }

  /**
   * @param matchScope The parts of the JSON to match against using the `MatchPattern` . 
   * If you specify `All` , AWS WAF matches against keys and values.
   */
  public fun matchScope(matchScope: String) {
    cdkBuilder.matchScope(matchScope)
  }

  public fun build(): CfnLoggingConfiguration.JsonBodyProperty = cdkBuilder.build()
}
