@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options passed to Origin.bind().
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * OriginBindOptions originBindOptions = OriginBindOptions.builder()
 * .originId("originId")
 * // the properties below are optional
 * .distributionId("distributionId")
 * .build();
 * ```
 */
public interface OriginBindOptions {
  /**
   * The identifier of the Distribution this Origin is used for.
   *
   * This is used to grant origin access permissions to the distribution for origin access control.
   *
   * Default: - no distribution id
   */
  public fun distributionId(): String? = unwrap(this).getDistributionId()

  /**
   * The identifier of this Origin, as assigned by the Distribution this Origin has been used added
   * to.
   */
  public fun originId(): String

  /**
   * A builder for [OriginBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param distributionId The identifier of the Distribution this Origin is used for.
     * This is used to grant origin access permissions to the distribution for origin access
     * control.
     */
    public fun distributionId(distributionId: String)

    /**
     * @param originId The identifier of this Origin, as assigned by the Distribution this Origin
     * has been used added to. 
     */
    public fun originId(originId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginBindOptions.Builder =
        software.amazon.awscdk.services.cloudfront.OriginBindOptions.builder()

    /**
     * @param distributionId The identifier of the Distribution this Origin is used for.
     * This is used to grant origin access permissions to the distribution for origin access
     * control.
     */
    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    /**
     * @param originId The identifier of this Origin, as assigned by the Distribution this Origin
     * has been used added to. 
     */
    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindOptions,
  ) : CdkObject(cdkObject),
      OriginBindOptions {
    /**
     * The identifier of the Distribution this Origin is used for.
     *
     * This is used to grant origin access permissions to the distribution for origin access
     * control.
     *
     * Default: - no distribution id
     */
    override fun distributionId(): String? = unwrap(this).getDistributionId()

    /**
     * The identifier of this Origin, as assigned by the Distribution this Origin has been used
     * added to.
     */
    override fun originId(): String = unwrap(this).getOriginId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindOptions):
        OriginBindOptions = CdkObjectWrappers.wrap(cdkObject) as? OriginBindOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginBindOptions):
        software.amazon.awscdk.services.cloudfront.OriginBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginBindOptions
  }
}
