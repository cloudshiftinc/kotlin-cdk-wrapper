@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options to customize the behaviour of `baseUrl()`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * BaseUrlOptions baseUrlOptions = BaseUrlOptions.builder()
 * .fips(false)
 * .build();
 * ```
 */
public interface BaseUrlOptions {
  /**
   * Whether to return the FIPS-compliant endpoint.
   *
   * Default: return the standard URL
   */
  public fun fips(): Boolean? = unwrap(this).getFips()

  /**
   * A builder for [BaseUrlOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fips Whether to return the FIPS-compliant endpoint.
     */
    public fun fips(fips: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.BaseUrlOptions.Builder =
        software.amazon.awscdk.services.cognito.BaseUrlOptions.builder()

    /**
     * @param fips Whether to return the FIPS-compliant endpoint.
     */
    override fun fips(fips: Boolean) {
      cdkBuilder.fips(fips)
    }

    public fun build(): software.amazon.awscdk.services.cognito.BaseUrlOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.BaseUrlOptions,
  ) : CdkObject(cdkObject), BaseUrlOptions {
    /**
     * Whether to return the FIPS-compliant endpoint.
     *
     * Default: return the standard URL
     */
    override fun fips(): Boolean? = unwrap(this).getFips()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.BaseUrlOptions):
        BaseUrlOptions = CdkObjectWrappers.wrap(cdkObject) as? BaseUrlOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseUrlOptions):
        software.amazon.awscdk.services.cognito.BaseUrlOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.BaseUrlOptions
  }
}
