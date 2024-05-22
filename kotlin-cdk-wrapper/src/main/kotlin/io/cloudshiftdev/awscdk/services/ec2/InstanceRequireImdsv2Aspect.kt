@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.Unit

/**
 * Aspect that applies IMDS configuration on EC2 Instance constructs.
 *
 * This aspect configures IMDS on an EC2 instance by creating a Launch Template with the
 * IMDS configuration and associating that Launch Template with the instance. If an Instance
 * is already associated with a Launch Template, a warning will (optionally) be added to the
 * construct node and it will be skipped.
 *
 * To cover Instances already associated with Launch Templates, use `LaunchTemplateImdsAspect`.
 *
 * Example:
 *
 * ```
 * InstanceRequireImdsv2Aspect aspect = new InstanceRequireImdsv2Aspect();
 * Aspects.of(this).add(aspect);
 * ```
 */
public open class InstanceRequireImdsv2Aspect(
  cdkObject: software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect,
) : CdkObject(cdkObject), IAspect {
  public constructor() : this(software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect()
  )

  public constructor(props: InstanceRequireImdsv2AspectProps) :
      this(software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect(props.let(InstanceRequireImdsv2AspectProps.Companion::unwrap))
  )

  public constructor(props: InstanceRequireImdsv2AspectProps.Builder.() -> Unit) :
      this(InstanceRequireImdsv2AspectProps(props)
  )

  /**
   * All aspects can visit an IConstruct.
   *
   * @param node 
   */
  public override fun visit(node: IConstruct) {
    unwrap(this).visit(node.let(IConstruct.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.InstanceRequireImdsv2Aspect].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param suppressLaunchTemplateWarning Whether warnings that would be raised when an Instance
     * is associated with an existing Launch Template should be suppressed or not. 
     */
    public fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean)

    /**
     * Whether warning annotations from this Aspect should be suppressed or not.
     *
     * Default: - false
     *
     * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
     * not. 
     */
    public fun suppressWarnings(suppressWarnings: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect.Builder
        = software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect.Builder.create()

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
     *
     * @param suppressLaunchTemplateWarning Whether warnings that would be raised when an Instance
     * is associated with an existing Launch Template should be suppressed or not. 
     */
    override fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean) {
      cdkBuilder.suppressLaunchTemplateWarning(suppressLaunchTemplateWarning)
    }

    /**
     * Whether warning annotations from this Aspect should be suppressed or not.
     *
     * Default: - false
     *
     * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
     * not. 
     */
    override fun suppressWarnings(suppressWarnings: Boolean) {
      cdkBuilder.suppressWarnings(suppressWarnings)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceRequireImdsv2Aspect {
      val builderImpl = BuilderImpl()
      return InstanceRequireImdsv2Aspect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect):
        InstanceRequireImdsv2Aspect = InstanceRequireImdsv2Aspect(cdkObject)

    internal fun unwrap(wrapped: InstanceRequireImdsv2Aspect):
        software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect
  }
}
