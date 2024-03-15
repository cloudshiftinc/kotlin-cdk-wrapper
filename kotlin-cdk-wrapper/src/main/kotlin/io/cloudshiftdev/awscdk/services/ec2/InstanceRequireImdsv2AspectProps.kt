@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * Properties for `InstanceRequireImdsv2Aspect`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * InstanceRequireImdsv2AspectProps instanceRequireImdsv2AspectProps =
 * InstanceRequireImdsv2AspectProps.builder()
 * .suppressLaunchTemplateWarning(false)
 * .suppressWarnings(false)
 * .build();
 * ```
 */
public interface InstanceRequireImdsv2AspectProps {
  /**
   * Whether warnings that would be raised when an Instance is associated with an existing Launch
   * Template should be suppressed or not.
   *
   * You can set this to `true` if `LaunchTemplateImdsAspect` is being used alongside this Aspect to
   * suppress false-positive warnings because any Launch Templates associated with Instances will
   * still be covered.
   *
   * Default: - false
   */
  public fun suppressLaunchTemplateWarning(): Boolean? =
      unwrap(this).getSuppressLaunchTemplateWarning()

  /**
   * Whether warning annotations from this Aspect should be suppressed or not.
   *
   * Default: - false
   */
  public fun suppressWarnings(): Boolean? = unwrap(this).getSuppressWarnings()

  /**
   * A builder for [InstanceRequireImdsv2AspectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param suppressLaunchTemplateWarning Whether warnings that would be raised when an Instance
     * is associated with an existing Launch Template should be suppressed or not.
     * You can set this to `true` if `LaunchTemplateImdsAspect` is being used alongside this Aspect
     * to
     * suppress false-positive warnings because any Launch Templates associated with Instances will
     * still be covered.
     */
    public fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean)

    /**
     * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
     * not.
     */
    public fun suppressWarnings(suppressWarnings: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps.Builder =
        software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps.builder()

    /**
     * @param suppressLaunchTemplateWarning Whether warnings that would be raised when an Instance
     * is associated with an existing Launch Template should be suppressed or not.
     * You can set this to `true` if `LaunchTemplateImdsAspect` is being used alongside this Aspect
     * to
     * suppress false-positive warnings because any Launch Templates associated with Instances will
     * still be covered.
     */
    override fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean) {
      cdkBuilder.suppressLaunchTemplateWarning(suppressLaunchTemplateWarning)
    }

    /**
     * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
     * not.
     */
    override fun suppressWarnings(suppressWarnings: Boolean) {
      cdkBuilder.suppressWarnings(suppressWarnings)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps,
  ) : CdkObject(cdkObject), InstanceRequireImdsv2AspectProps {
    /**
     * Whether warnings that would be raised when an Instance is associated with an existing Launch
     * Template should be suppressed or not.
     *
     * You can set this to `true` if `LaunchTemplateImdsAspect` is being used alongside this Aspect
     * to
     * suppress false-positive warnings because any Launch Templates associated with Instances will
     * still be covered.
     *
     * Default: - false
     */
    override fun suppressLaunchTemplateWarning(): Boolean? =
        unwrap(this).getSuppressLaunchTemplateWarning()

    /**
     * Whether warning annotations from this Aspect should be suppressed or not.
     *
     * Default: - false
     */
    override fun suppressWarnings(): Boolean? = unwrap(this).getSuppressWarnings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceRequireImdsv2AspectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps):
        InstanceRequireImdsv2AspectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceRequireImdsv2AspectProps):
        software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps
  }
}
