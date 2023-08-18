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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A rule statement that inspects for malicious SQL code.
 *
 * Attackers insert malicious SQL code into web requests to do things like modify your database or
 * extract data from it.
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
 * SqliMatchStatementProperty sqliMatchStatementProperty = SqliMatchStatementProperty.builder()
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
 * // the properties below are optional
 * .sensitivityLevel("sensitivityLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html)
 */
@CdkDslMarker
public class CfnRuleGroupSqliMatchStatementPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.SqliMatchStatementProperty.Builder =
        CfnRuleGroup.SqliMatchStatementProperty.builder()

    private val _textTransformations: MutableList<Any> = mutableListOf()

    /** @param fieldToMatch The part of the web request that you want AWS WAF to inspect. */
    public fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    /** @param fieldToMatch The part of the web request that you want AWS WAF to inspect. */
    public fun fieldToMatch(fieldToMatch: CfnRuleGroup.FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    /**
     * @param sensitivityLevel The sensitivity that you want AWS WAF to use to inspect for SQL
     *   injection attacks. `HIGH` detects more attacks, but might generate more false positives,
     *   especially if your web requests frequently contain unusual strings. For information about
     *   identifying and mitigating false positives, see
     *   [Testing and tuning](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html)
     *   in the *AWS WAF Developer Guide* .
     *
     * `LOW` is generally a better choice for resources that already have other protections against
     * SQL injection attacks or that have a low tolerance for false positives.
     *
     * Default: `LOW`
     */
    public fun sensitivityLevel(sensitivityLevel: String) {
        cdkBuilder.sensitivityLevel(sensitivityLevel)
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

    public fun build(): CfnRuleGroup.SqliMatchStatementProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
