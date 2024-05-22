@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a dedicated IP pool.
 *
 * Example:
 *
 * ```
 * DedicatedIpPool.Builder.create(this, "Pool")
 * .dedicatedIpPoolName("mypool")
 * .scalingMode(ScalingMode.STANDARD)
 * .build();
 * ```
 */
public interface DedicatedIpPoolProps {
  /**
   * A name for the dedicated IP pool.
   *
   * The name must adhere to specific constraints: it can only include
   * lowercase letters (a-z), numbers (0-9), underscores (_), and hyphens (-),
   * and must not exceed 64 characters in length.
   *
   * Default: - a CloudFormation generated name
   */
  public fun dedicatedIpPoolName(): String? = unwrap(this).getDedicatedIpPoolName()

  /**
   * The type of scailing mode to use for this IP pool.
   *
   * Updating ScalingMode doesn't require a replacement if you're updating its value from `STANDARD`
   * to `MANAGED`.
   * However, updating ScalingMode from `MANAGED` to `STANDARD` is not supported.
   *
   * Default: ScalingMode.STANDARD
   */
  public fun scalingMode(): ScalingMode? = unwrap(this).getScalingMode()?.let(ScalingMode::wrap)

  /**
   * A builder for [DedicatedIpPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dedicatedIpPoolName A name for the dedicated IP pool.
     * The name must adhere to specific constraints: it can only include
     * lowercase letters (a-z), numbers (0-9), underscores (_), and hyphens (-),
     * and must not exceed 64 characters in length.
     */
    public fun dedicatedIpPoolName(dedicatedIpPoolName: String)

    /**
     * @param scalingMode The type of scailing mode to use for this IP pool.
     * Updating ScalingMode doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED`.
     * However, updating ScalingMode from `MANAGED` to `STANDARD` is not supported.
     */
    public fun scalingMode(scalingMode: ScalingMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DedicatedIpPoolProps.Builder =
        software.amazon.awscdk.services.ses.DedicatedIpPoolProps.builder()

    /**
     * @param dedicatedIpPoolName A name for the dedicated IP pool.
     * The name must adhere to specific constraints: it can only include
     * lowercase letters (a-z), numbers (0-9), underscores (_), and hyphens (-),
     * and must not exceed 64 characters in length.
     */
    override fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
      cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    /**
     * @param scalingMode The type of scailing mode to use for this IP pool.
     * Updating ScalingMode doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED`.
     * However, updating ScalingMode from `MANAGED` to `STANDARD` is not supported.
     */
    override fun scalingMode(scalingMode: ScalingMode) {
      cdkBuilder.scalingMode(scalingMode.let(ScalingMode.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.DedicatedIpPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.DedicatedIpPoolProps,
  ) : CdkObject(cdkObject), DedicatedIpPoolProps {
    /**
     * A name for the dedicated IP pool.
     *
     * The name must adhere to specific constraints: it can only include
     * lowercase letters (a-z), numbers (0-9), underscores (_), and hyphens (-),
     * and must not exceed 64 characters in length.
     *
     * Default: - a CloudFormation generated name
     */
    override fun dedicatedIpPoolName(): String? = unwrap(this).getDedicatedIpPoolName()

    /**
     * The type of scailing mode to use for this IP pool.
     *
     * Updating ScalingMode doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED`.
     * However, updating ScalingMode from `MANAGED` to `STANDARD` is not supported.
     *
     * Default: ScalingMode.STANDARD
     */
    override fun scalingMode(): ScalingMode? = unwrap(this).getScalingMode()?.let(ScalingMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DedicatedIpPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DedicatedIpPoolProps):
        DedicatedIpPoolProps = CdkObjectWrappers.wrap(cdkObject) as? DedicatedIpPoolProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DedicatedIpPoolProps):
        software.amazon.awscdk.services.ses.DedicatedIpPoolProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.DedicatedIpPoolProps
  }
}
