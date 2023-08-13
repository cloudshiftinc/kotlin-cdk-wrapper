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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A rule statement that compares a number of bytes against the size of a request component, using a
 * comparison operator, such as greater than (&gt;) or less than (&lt;).
 *
 * For example, you can use a size constraint statement to look for query strings that are longer
 * than 100 bytes.
 *
 * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of bytes
 * of the body up to the limit for the web ACL. By default, for regional web ACLs, this limit is 8
 * KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes). For CloudFront
 * web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for additional fees. If
 * you know that the request body for your web requests should never exceed the inspection limit,
 * you could use a size constraint statement to block requests that have a larger request body size.
 *
 * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI
 * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
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
 * SizeConstraintStatementProperty sizeConstraintStatementProperty =
 * SizeConstraintStatementProperty.builder()
 * .comparisonOperator("comparisonOperator")
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
 * .size(123)
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html)
 */
@CdkDslMarker
public class CfnRuleGroupSizeConstraintStatementPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.SizeConstraintStatementProperty.Builder =
        CfnRuleGroup.SizeConstraintStatementProperty.builder()

    private val _textTransformations: MutableList<Any> = mutableListOf()

    /**
     * @param comparisonOperator The operator to use to compare the request part to the size
     *   setting.
     */
    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /** @param fieldToMatch The part of the web request that you want AWS WAF to inspect. */
    public fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    /** @param fieldToMatch The part of the web request that you want AWS WAF to inspect. */
    public fun fieldToMatch(fieldToMatch: CfnRuleGroup.FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    /** @param size The size, in byte, to compare to the request part, after any transformations. */
    public fun size(size: Number) {
        cdkBuilder.size(size)
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

    public fun build(): CfnRuleGroup.SizeConstraintStatementProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
