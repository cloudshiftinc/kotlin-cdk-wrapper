@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront.origins

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.IOrigin
import software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps

/**
 * Construction properties for `OriginGroup`.
 *
 * Example:
 *
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
public class OriginGroupPropsDsl {
  private val cdkBuilder: OriginGroupProps.Builder = OriginGroupProps.builder()

  private val _fallbackStatusCodes: MutableList<Number> = mutableListOf()

  /**
   * @param fallbackOrigin The fallback origin that should serve requests when the primary fails. 
   */
  public fun fallbackOrigin(fallbackOrigin: IOrigin) {
    cdkBuilder.fallbackOrigin(fallbackOrigin)
  }

  /**
   * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
   * origin, would cause querying the fallback origin.
   */
  public fun fallbackStatusCodes(vararg fallbackStatusCodes: Number) {
    _fallbackStatusCodes.addAll(listOf(*fallbackStatusCodes))
  }

  /**
   * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
   * origin, would cause querying the fallback origin.
   */
  public fun fallbackStatusCodes(fallbackStatusCodes: Collection<Number>) {
    _fallbackStatusCodes.addAll(fallbackStatusCodes)
  }

  /**
   * @param primaryOrigin The primary origin that should serve requests for this group. 
   */
  public fun primaryOrigin(primaryOrigin: IOrigin) {
    cdkBuilder.primaryOrigin(primaryOrigin)
  }

  public fun build(): OriginGroupProps {
    if(_fallbackStatusCodes.isNotEmpty()) cdkBuilder.fallbackStatusCodes(_fallbackStatusCodes)
    return cdkBuilder.build()
  }
}
