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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies the request's URI path as an aggregate key for a rate-based rule.
 *
 * Each distinct URI path contributes to the aggregation instance. If you use just the URI path as
 * your custom key, then each URI path fully defines an aggregation instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RateLimitUriPathProperty rateLimitUriPathProperty = RateLimitUriPathProperty.builder()
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimituripath.html)
 */
@CdkDslMarker
public class CfnWebACLRateLimitUriPathPropertyDsl {
    private val cdkBuilder: CfnWebACL.RateLimitUriPathProperty.Builder =
        CfnWebACL.RateLimitUriPathProperty.builder()

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

    public fun build(): CfnWebACL.RateLimitUriPathProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
