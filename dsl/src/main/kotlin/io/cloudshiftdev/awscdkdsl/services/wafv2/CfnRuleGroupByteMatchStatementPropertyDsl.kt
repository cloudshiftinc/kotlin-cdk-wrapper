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
 * A rule statement that defines a string match search for AWS WAF to apply to web requests.
 *
 * The byte match statement provides the bytes to search for, the location in requests that you want
 * AWS WAF to search, and other settings. The bytes to search for are typically a string that
 * corresponds with ASCII characters. In the AWS WAF console and the developer guide, this is called
 * a string match statement.
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
 * ByteMatchStatementProperty byteMatchStatementProperty = ByteMatchStatementProperty.builder()
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
 * .positionalConstraint("positionalConstraint")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .searchString("searchString")
 * .searchStringBase64("searchStringBase64")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html)
 */
@CdkDslMarker
public class CfnRuleGroupByteMatchStatementPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.ByteMatchStatementProperty.Builder =
        CfnRuleGroup.ByteMatchStatementProperty.builder()

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
     * @param positionalConstraint The area within the portion of the web request that you want AWS
     *   WAF to search for `SearchString` . Valid values include the following:
     *
     * *CONTAINS*
     *
     * The specified part of the web request must include the value of `SearchString` , but the
     * location doesn't matter.
     *
     * *CONTAINS_WORD*
     *
     * The specified part of the web request must include the value of `SearchString` , and
     * `SearchString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     * In addition, `SearchString` must be a word, which means that both of the following are true:
     * * `SearchString` is at the beginning of the specified part of the web request or is preceded
     *   by a character other than an alphanumeric character or underscore (_). Examples include the
     *   value of a header and `;BadBot` .
     * * `SearchString` is at the end of the specified part of the web request or is followed by a
     *   character other than an alphanumeric character or underscore (_), for example, `BadBot;`
     *   and `-BadBot;` .
     *
     * *EXACTLY*
     *
     * The value of the specified part of the web request must exactly match the value of
     * `SearchString` .
     *
     * *STARTS_WITH*
     *
     * The value of `SearchString` must appear at the beginning of the specified part of the web
     * request.
     *
     * *ENDS_WITH*
     *
     * The value of `SearchString` must appear at the end of the specified part of the web request.
     */
    public fun positionalConstraint(positionalConstraint: String) {
        cdkBuilder.positionalConstraint(positionalConstraint)
    }

    /**
     * @param searchString A string value that you want AWS WAF to search for. AWS WAF searches only
     *   in the part of web requests that you designate for inspection in `FieldToMatch` . The
     *   maximum length of the value is 200 bytes. For alphabetic characters A-Z and a-z, the value
     *   is case sensitive.
     *
     * Don't encode this string. Provide the value that you want AWS WAF to search for. AWS
     * CloudFormation automatically base64 encodes the value for you.
     *
     * For example, suppose the value of `Type` is `HEADER` and the value of `Data` is `User-Agent`
     * . If you want to search the `User-Agent` header for the value `BadBot` , you provide the
     * string `BadBot` in the value of `SearchString` .
     *
     * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
     */
    public fun searchString(searchString: String) {
        cdkBuilder.searchString(searchString)
    }

    /**
     * @param searchStringBase64 String to search for in a web request component, base64-encoded. If
     *   you don't want to encode the string, specify the unencoded value in `SearchString` instead.
     *
     * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
     */
    public fun searchStringBase64(searchStringBase64: String) {
        cdkBuilder.searchStringBase64(searchStringBase64)
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

    public fun build(): CfnRuleGroup.ByteMatchStatementProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
