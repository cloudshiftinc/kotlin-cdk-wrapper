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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * A list of HTTP header names that CloudFront removes from HTTP responses to requests that match
 * the cache behavior that this response headers policy is attached to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * RemoveHeadersConfigProperty removeHeadersConfigProperty = RemoveHeadersConfigProperty.builder()
 * .items(List.of(RemoveHeaderProperty.builder()
 * .header("header")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheadersconfig.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyRemoveHeadersConfigPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.Builder =
        CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.builder()

    private val _items: MutableList<Any> = mutableListOf()

    /** @param items The list of HTTP header names. */
    public fun items(vararg items: Any) {
        _items.addAll(listOf(*items))
    }

    /** @param items The list of HTTP header names. */
    public fun items(items: Collection<Any>) {
        _items.addAll(items)
    }

    /** @param items The list of HTTP header names. */
    public fun items(items: IResolvable) {
        cdkBuilder.items(items)
    }

    public fun build(): CfnResponseHeadersPolicy.RemoveHeadersConfigProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
