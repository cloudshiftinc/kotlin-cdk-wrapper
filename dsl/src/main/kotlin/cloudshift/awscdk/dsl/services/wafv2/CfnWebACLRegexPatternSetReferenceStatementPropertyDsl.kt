@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * A rule statement used to search web request components for matches with regular expressions.
 *
 * To use this, create a `RegexPatternSet` that specifies the expressions that you want to detect,
 * then use that set in this statement. A web request matches the pattern set rule statement if the
 * request component matches any of the patterns in the set.
 *
 * Each regex pattern set rule statement references a regex pattern set. You create and maintain the
 * set independent of your rules. This allows you to use the single set in multiple rules. When you
 * update the referenced set, AWS WAF automatically updates all rules that reference it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object all;
 * Object allQueryArguments;
 * Object method;
 * Object queryString;
 * Object singleHeader;
 * Object singleQueryArgument;
 * Object uriPath;
 * RegexPatternSetReferenceStatementProperty regexPatternSetReferenceStatementProperty =
 * RegexPatternSetReferenceStatementProperty.builder()
 * .arn("arn")
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html)
 */
@CdkDslMarker
public class CfnWebACLRegexPatternSetReferenceStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.RegexPatternSetReferenceStatementProperty.Builder =
      CfnWebACL.RegexPatternSetReferenceStatementProperty.builder()

  private val _textTransformations: MutableList<Any> = mutableListOf()

  /**
   * @param arn The Amazon Resource Name (ARN) of the `RegexPatternSet` that this statement
   * references. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
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
  public fun fieldToMatch(fieldToMatch: CfnWebACL.FieldToMatchProperty) {
    cdkBuilder.fieldToMatch(fieldToMatch)
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

  public fun build(): CfnWebACL.RegexPatternSetReferenceStatementProperty {
    if(_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
    return cdkBuilder.build()
  }
}
