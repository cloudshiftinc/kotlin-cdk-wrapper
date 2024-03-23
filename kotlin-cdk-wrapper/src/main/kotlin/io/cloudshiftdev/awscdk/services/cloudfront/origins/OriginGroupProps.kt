@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudfront.IOrigin
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

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
public interface OriginGroupProps {
  /**
   * The fallback origin that should serve requests when the primary fails.
   */
  public fun fallbackOrigin(): IOrigin

  /**
   * The list of HTTP status codes that, when returned from the primary origin, would cause querying
   * the fallback origin.
   *
   * Default: - 500, 502, 503 and 504
   */
  public fun fallbackStatusCodes(): List<Number> = unwrap(this).getFallbackStatusCodes() ?:
      emptyList()

  /**
   * The primary origin that should serve requests for this group.
   */
  public fun primaryOrigin(): IOrigin

  /**
   * A builder for [OriginGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fallbackOrigin The fallback origin that should serve requests when the primary fails. 
     */
    public fun fallbackOrigin(fallbackOrigin: IOrigin)

    /**
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     * origin, would cause querying the fallback origin.
     */
    public fun fallbackStatusCodes(fallbackStatusCodes: List<Number>)

    /**
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     * origin, would cause querying the fallback origin.
     */
    public fun fallbackStatusCodes(vararg fallbackStatusCodes: Number)

    /**
     * @param primaryOrigin The primary origin that should serve requests for this group. 
     */
    public fun primaryOrigin(primaryOrigin: IOrigin)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps.Builder =
        software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps.builder()

    /**
     * @param fallbackOrigin The fallback origin that should serve requests when the primary fails. 
     */
    override fun fallbackOrigin(fallbackOrigin: IOrigin) {
      cdkBuilder.fallbackOrigin(fallbackOrigin.let(IOrigin::unwrap))
    }

    /**
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     * origin, would cause querying the fallback origin.
     */
    override fun fallbackStatusCodes(fallbackStatusCodes: List<Number>) {
      cdkBuilder.fallbackStatusCodes(fallbackStatusCodes)
    }

    /**
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     * origin, would cause querying the fallback origin.
     */
    override fun fallbackStatusCodes(vararg fallbackStatusCodes: Number): Unit =
        fallbackStatusCodes(fallbackStatusCodes.toList())

    /**
     * @param primaryOrigin The primary origin that should serve requests for this group. 
     */
    override fun primaryOrigin(primaryOrigin: IOrigin) {
      cdkBuilder.primaryOrigin(primaryOrigin.let(IOrigin::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps,
  ) : CdkObject(cdkObject), OriginGroupProps {
    /**
     * The fallback origin that should serve requests when the primary fails.
     */
    override fun fallbackOrigin(): IOrigin = unwrap(this).getFallbackOrigin().let(IOrigin::wrap)

    /**
     * The list of HTTP status codes that, when returned from the primary origin, would cause
     * querying the fallback origin.
     *
     * Default: - 500, 502, 503 and 504
     */
    override fun fallbackStatusCodes(): List<Number> = unwrap(this).getFallbackStatusCodes() ?:
        emptyList()

    /**
     * The primary origin that should serve requests for this group.
     */
    override fun primaryOrigin(): IOrigin = unwrap(this).getPrimaryOrigin().let(IOrigin::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps):
        OriginGroupProps = CdkObjectWrappers.wrap(cdkObject) as? OriginGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginGroupProps):
        software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps
  }
}
