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

package io.cloudshiftdev.awscdkdsl.services.waf.regional

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps

/**
 * Properties for defining a `CfnRegexPatternSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnRegexPatternSetProps cfnRegexPatternSetProps = CfnRegexPatternSetProps.builder()
 * .name("name")
 * .regexPatternStrings(List.of("regexPatternStrings"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html)
 */
@CdkDslMarker
public class CfnRegexPatternSetPropsDsl {
    private val cdkBuilder: CfnRegexPatternSetProps.Builder = CfnRegexPatternSetProps.builder()

    private val _regexPatternStrings: MutableList<String> = mutableListOf()

    /**
     * @param name A friendly name or description of the `RegexPatternSet` . You can't change `Name`
     *   after you create a `RegexPatternSet` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     *   AWS WAF to search for, such as `B[a&#64;]dB[o0]t` .
     */
    public fun regexPatternStrings(vararg regexPatternStrings: String) {
        _regexPatternStrings.addAll(listOf(*regexPatternStrings))
    }

    /**
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     *   AWS WAF to search for, such as `B[a&#64;]dB[o0]t` .
     */
    public fun regexPatternStrings(regexPatternStrings: Collection<String>) {
        _regexPatternStrings.addAll(regexPatternStrings)
    }

    public fun build(): CfnRegexPatternSetProps {
        if (_regexPatternStrings.isNotEmpty()) cdkBuilder.regexPatternStrings(_regexPatternStrings)
        return cdkBuilder.build()
    }
}
