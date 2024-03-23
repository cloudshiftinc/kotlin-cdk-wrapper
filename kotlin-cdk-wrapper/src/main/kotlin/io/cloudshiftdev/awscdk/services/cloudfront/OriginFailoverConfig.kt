@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * The failover configuration used for Origin Groups, returned in `OriginBindConfig.failoverConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * IOrigin origin;
 * OriginFailoverConfig originFailoverConfig = OriginFailoverConfig.builder()
 * .failoverOrigin(origin)
 * // the properties below are optional
 * .statusCodes(List.of(123))
 * .build();
 * ```
 */
public interface OriginFailoverConfig {
  /**
   * The origin to use as the fallback origin.
   */
  public fun failoverOrigin(): IOrigin

  /**
   * The HTTP status codes of the response that trigger querying the failover Origin.
   *
   * Default: - 500, 502, 503 and 504
   */
  public fun statusCodes(): List<Number> = unwrap(this).getStatusCodes() ?: emptyList()

  /**
   * A builder for [OriginFailoverConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param failoverOrigin The origin to use as the fallback origin. 
     */
    public fun failoverOrigin(failoverOrigin: IOrigin)

    /**
     * @param statusCodes The HTTP status codes of the response that trigger querying the failover
     * Origin.
     */
    public fun statusCodes(statusCodes: List<Number>)

    /**
     * @param statusCodes The HTTP status codes of the response that trigger querying the failover
     * Origin.
     */
    public fun statusCodes(vararg statusCodes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.Builder
        = software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.builder()

    /**
     * @param failoverOrigin The origin to use as the fallback origin. 
     */
    override fun failoverOrigin(failoverOrigin: IOrigin) {
      cdkBuilder.failoverOrigin(failoverOrigin.let(IOrigin::unwrap))
    }

    /**
     * @param statusCodes The HTTP status codes of the response that trigger querying the failover
     * Origin.
     */
    override fun statusCodes(statusCodes: List<Number>) {
      cdkBuilder.statusCodes(statusCodes)
    }

    /**
     * @param statusCodes The HTTP status codes of the response that trigger querying the failover
     * Origin.
     */
    override fun statusCodes(vararg statusCodes: Number): Unit = statusCodes(statusCodes.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginFailoverConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig,
  ) : CdkObject(cdkObject), OriginFailoverConfig {
    /**
     * The origin to use as the fallback origin.
     */
    override fun failoverOrigin(): IOrigin = unwrap(this).getFailoverOrigin().let(IOrigin::wrap)

    /**
     * The HTTP status codes of the response that trigger querying the failover Origin.
     *
     * Default: - 500, 502, 503 and 504
     */
    override fun statusCodes(): List<Number> = unwrap(this).getStatusCodes() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginFailoverConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig):
        OriginFailoverConfig = CdkObjectWrappers.wrap(cdkObject) as? OriginFailoverConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginFailoverConfig):
        software.amazon.awscdk.services.cloudfront.OriginFailoverConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginFailoverConfig
  }
}
