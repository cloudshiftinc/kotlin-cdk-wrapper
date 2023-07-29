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

package cloudshift.awscdk.dsl.services.cloudfront.origins

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.IOrigin
import software.amazon.awscdk.services.cloudfront.origins.OriginGroup

/**
 * An Origin that represents a group.
 *
 * Consists of a primary Origin, and a fallback Origin called when the primary returns one of the
 * provided HTTP status codes.
 *
 * Example:
 * ```
 * Bucket myBucket = new Bucket(this, "myBucket");
 * Distribution.Builder.create(this, "myDist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(OriginGroup.Builder.create()
 * .primaryOrigin(new S3Origin(myBucket))
 * .fallbackOrigin(new HttpOrigin("www.example.com"))
 * // optional, defaults to: 500, 502, 503 and 504
 * .fallbackStatusCodes(List.of(404))
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class OriginGroupDsl {
    private val cdkBuilder: OriginGroup.Builder = OriginGroup.Builder.create()

    private val _fallbackStatusCodes: MutableList<Number> = mutableListOf()

    /**
     * The fallback origin that should serve requests when the primary fails.
     *
     * @param fallbackOrigin The fallback origin that should serve requests when the primary fails.
     */
    public fun fallbackOrigin(fallbackOrigin: IOrigin) {
        cdkBuilder.fallbackOrigin(fallbackOrigin)
    }

    /**
     * The list of HTTP status codes that, when returned from the primary origin, would cause
     * querying the fallback origin.
     *
     * Default: - 500, 502, 503 and 504
     *
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     *   origin, would cause querying the fallback origin.
     */
    public fun fallbackStatusCodes(vararg fallbackStatusCodes: Number) {
        _fallbackStatusCodes.addAll(listOf(*fallbackStatusCodes))
    }

    /**
     * The list of HTTP status codes that, when returned from the primary origin, would cause
     * querying the fallback origin.
     *
     * Default: - 500, 502, 503 and 504
     *
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     *   origin, would cause querying the fallback origin.
     */
    public fun fallbackStatusCodes(fallbackStatusCodes: Collection<Number>) {
        _fallbackStatusCodes.addAll(fallbackStatusCodes)
    }

    /**
     * The primary origin that should serve requests for this group.
     *
     * @param primaryOrigin The primary origin that should serve requests for this group.
     */
    public fun primaryOrigin(primaryOrigin: IOrigin) {
        cdkBuilder.primaryOrigin(primaryOrigin)
    }

    public fun build(): OriginGroup {
        if (_fallbackStatusCodes.isNotEmpty()) cdkBuilder.fallbackStatusCodes(_fallbackStatusCodes)
        return cdkBuilder.build()
    }
}
