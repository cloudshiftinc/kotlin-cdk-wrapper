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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies the request's query string as an aggregate key for a rate-based rule.
 *
 * Each distinct string contributes to the aggregation instance. If you use just the query string as
 * your custom key, then each string fully defines an aggregation instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RateLimitQueryStringProperty rateLimitQueryStringProperty =
 * RateLimitQueryStringProperty.builder()
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitquerystring.html)
 */
@CdkDslMarker
public class CfnWebACLRateLimitQueryStringPropertyDsl {
    private val cdkBuilder: CfnWebACL.RateLimitQueryStringProperty.Builder =
        CfnWebACL.RateLimitQueryStringProperty.builder()

    private val _textTransformations: MutableList<Any> = mutableListOf()

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that
     *   attackers use in web requests in an effort to bypass detection. Text transformations are
     *   used in rule match statements, to transform the `FieldToMatch` request component before
     *   inspecting it, and they're used in rate-based rule statements, to transform request
     *   components before using them as custom aggregation keys. If you specify one or more
     *   transformations to apply, AWS WAF performs all transformations on the specified content,
     *   starting from the lowest priority setting, and then uses the component contents.
     */
    public fun textTransformations(vararg textTransformations: Any) {
        _textTransformations.addAll(listOf(*textTransformations))
    }

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that
     *   attackers use in web requests in an effort to bypass detection. Text transformations are
     *   used in rule match statements, to transform the `FieldToMatch` request component before
     *   inspecting it, and they're used in rate-based rule statements, to transform request
     *   components before using them as custom aggregation keys. If you specify one or more
     *   transformations to apply, AWS WAF performs all transformations on the specified content,
     *   starting from the lowest priority setting, and then uses the component contents.
     */
    public fun textTransformations(textTransformations: Collection<Any>) {
        _textTransformations.addAll(textTransformations)
    }

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that
     *   attackers use in web requests in an effort to bypass detection. Text transformations are
     *   used in rule match statements, to transform the `FieldToMatch` request component before
     *   inspecting it, and they're used in rate-based rule statements, to transform request
     *   components before using them as custom aggregation keys. If you specify one or more
     *   transformations to apply, AWS WAF performs all transformations on the specified content,
     *   starting from the lowest priority setting, and then uses the component contents.
     */
    public fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations)
    }

    public fun build(): CfnWebACL.RateLimitQueryStringProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
