@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Properties for `LaunchTemplateRequireImdsv2Aspect`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * LaunchTemplateRequireImdsv2AspectProps launchTemplateRequireImdsv2AspectProps =
 * LaunchTemplateRequireImdsv2AspectProps.builder()
 * .suppressWarnings(false)
 * .build();
 * ```
 */
public interface LaunchTemplateRequireImdsv2AspectProps {
  /**
   * Whether warning annotations from this Aspect should be suppressed or not.
   *
   * Default: - false
   */
  public fun suppressWarnings(): Boolean? = unwrap(this).getSuppressWarnings()

  /**
   * A builder for [LaunchTemplateRequireImdsv2AspectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
     * not.
     */
    public fun suppressWarnings(suppressWarnings: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps.builder()

    /**
     * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
     * not.
     */
    override fun suppressWarnings(suppressWarnings: Boolean) {
      cdkBuilder.suppressWarnings(suppressWarnings)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps,
  ) : CdkObject(cdkObject), LaunchTemplateRequireImdsv2AspectProps {
    /**
     * Whether warning annotations from this Aspect should be suppressed or not.
     *
     * Default: - false
     */
    override fun suppressWarnings(): Boolean? = unwrap(this).getSuppressWarnings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        LaunchTemplateRequireImdsv2AspectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps):
        LaunchTemplateRequireImdsv2AspectProps = CdkObjectWrappers.wrap(cdkObject) as?
        LaunchTemplateRequireImdsv2AspectProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateRequireImdsv2AspectProps):
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps
  }
}
