@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A rule statement used to search web request components for a match against a single regular
 * expression.
 *
 * Example:
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
 * RegexMatchStatementProperty regexMatchStatementProperty = RegexMatchStatementProperty.builder()
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
 * .regexString("regexString")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexmatchstatement.html)
 */
@CdkDslMarker
public class CfnRuleGroupRegexMatchStatementPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RegexMatchStatementProperty.Builder =
        CfnRuleGroup.RegexMatchStatementProperty.builder()

    private val _textTransformations: MutableList<Any> = mutableListOf()

    /** @param fieldToMatch The part of the web request that you want AWS WAF to inspect. */
    public fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    /** @param fieldToMatch The part of the web request that you want AWS WAF to inspect. */
    public fun fieldToMatch(fieldToMatch: CfnRuleGroup.FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    /** @param regexString The string representing the regular expression. */
    public fun regexString(regexString: String) {
        cdkBuilder.regexString(regexString)
    }

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that
     *   attackers use in web requests in an effort to bypass detection. If you specify one or more
     *   transformations in a rule statement, AWS WAF performs all transformations on the content of
     *   the request component identified by `FieldToMatch` , starting from the lowest priority
     *   setting, before inspecting the content for a match.
     */
    public fun textTransformations(vararg textTransformations: Any) {
        _textTransformations.addAll(listOf(*textTransformations))
    }

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that
     *   attackers use in web requests in an effort to bypass detection. If you specify one or more
     *   transformations in a rule statement, AWS WAF performs all transformations on the content of
     *   the request component identified by `FieldToMatch` , starting from the lowest priority
     *   setting, before inspecting the content for a match.
     */
    public fun textTransformations(textTransformations: Collection<Any>) {
        _textTransformations.addAll(textTransformations)
    }

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that
     *   attackers use in web requests in an effort to bypass detection. If you specify one or more
     *   transformations in a rule statement, AWS WAF performs all transformations on the content of
     *   the request component identified by `FieldToMatch` , starting from the lowest priority
     *   setting, before inspecting the content for a match.
     */
    public fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations)
    }

    public fun build(): CfnRuleGroup.RegexMatchStatementProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
