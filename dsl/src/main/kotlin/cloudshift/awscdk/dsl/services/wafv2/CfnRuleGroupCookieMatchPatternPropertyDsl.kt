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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * The filter to use to identify the subset of cookies to inspect in a web request.
 *
 * You must specify exactly one setting: either `All` , `IncludedCookies` , or `ExcludedCookies` .
 *
 * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object all;
 * CookieMatchPatternProperty cookieMatchPatternProperty = CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookiematchpattern.html)
 */
@CdkDslMarker
public class CfnRuleGroupCookieMatchPatternPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.CookieMatchPatternProperty.Builder =
        CfnRuleGroup.CookieMatchPatternProperty.builder()

    private val _excludedCookies: MutableList<String> = mutableListOf()

    private val _includedCookies: MutableList<String> = mutableListOf()

    /** @param all Inspect all cookies. */
    public fun all(all: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(all)
        cdkBuilder.all(builder.map)
    }

    /** @param all Inspect all cookies. */
    public fun all(all: Any) {
        cdkBuilder.all(all)
    }

    /**
     * @param excludedCookies Inspect only the cookies whose keys don't match any of the strings
     *   specified here.
     */
    public fun excludedCookies(vararg excludedCookies: String) {
        _excludedCookies.addAll(listOf(*excludedCookies))
    }

    /**
     * @param excludedCookies Inspect only the cookies whose keys don't match any of the strings
     *   specified here.
     */
    public fun excludedCookies(excludedCookies: Collection<String>) {
        _excludedCookies.addAll(excludedCookies)
    }

    /**
     * @param includedCookies Inspect only the cookies that have a key that matches one of the
     *   strings specified here.
     */
    public fun includedCookies(vararg includedCookies: String) {
        _includedCookies.addAll(listOf(*includedCookies))
    }

    /**
     * @param includedCookies Inspect only the cookies that have a key that matches one of the
     *   strings specified here.
     */
    public fun includedCookies(includedCookies: Collection<String>) {
        _includedCookies.addAll(includedCookies)
    }

    public fun build(): CfnRuleGroup.CookieMatchPatternProperty {
        if (_excludedCookies.isNotEmpty()) cdkBuilder.excludedCookies(_excludedCookies)
        if (_includedCookies.isNotEmpty()) cdkBuilder.includedCookies(_includedCookies)
        return cdkBuilder.build()
    }
}
