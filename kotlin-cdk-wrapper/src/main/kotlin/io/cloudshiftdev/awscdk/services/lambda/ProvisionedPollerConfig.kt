@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the event
 * source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * ProvisionedPollerConfig provisionedPollerConfig = ProvisionedPollerConfig.builder()
 * .maximumPollers(123)
 * .minimumPollers(123)
 * .build();
 * ```
 */
public interface ProvisionedPollerConfig {
  /**
   * The maximum number of pollers that can be provisioned.
   *
   * Default: - 200
   */
  public fun maximumPollers(): Number? = unwrap(this).getMaximumPollers()

  /**
   * The minimum number of pollers that should be provisioned.
   *
   * Default: - 1
   */
  public fun minimumPollers(): Number? = unwrap(this).getMinimumPollers()

  /**
   * A builder for [ProvisionedPollerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maximumPollers The maximum number of pollers that can be provisioned.
     */
    public fun maximumPollers(maximumPollers: Number)

    /**
     * @param minimumPollers The minimum number of pollers that should be provisioned.
     */
    public fun minimumPollers(minimumPollers: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.ProvisionedPollerConfig.Builder =
        software.amazon.awscdk.services.lambda.ProvisionedPollerConfig.builder()

    /**
     * @param maximumPollers The maximum number of pollers that can be provisioned.
     */
    override fun maximumPollers(maximumPollers: Number) {
      cdkBuilder.maximumPollers(maximumPollers)
    }

    /**
     * @param minimumPollers The minimum number of pollers that should be provisioned.
     */
    override fun minimumPollers(minimumPollers: Number) {
      cdkBuilder.minimumPollers(minimumPollers)
    }

    public fun build(): software.amazon.awscdk.services.lambda.ProvisionedPollerConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.ProvisionedPollerConfig,
  ) : CdkObject(cdkObject),
      ProvisionedPollerConfig {
    /**
     * The maximum number of pollers that can be provisioned.
     *
     * Default: - 200
     */
    override fun maximumPollers(): Number? = unwrap(this).getMaximumPollers()

    /**
     * The minimum number of pollers that should be provisioned.
     *
     * Default: - 1
     */
    override fun minimumPollers(): Number? = unwrap(this).getMinimumPollers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedPollerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ProvisionedPollerConfig):
        ProvisionedPollerConfig = CdkObjectWrappers.wrap(cdkObject) as? ProvisionedPollerConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProvisionedPollerConfig):
        software.amazon.awscdk.services.lambda.ProvisionedPollerConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.ProvisionedPollerConfig
  }
}
