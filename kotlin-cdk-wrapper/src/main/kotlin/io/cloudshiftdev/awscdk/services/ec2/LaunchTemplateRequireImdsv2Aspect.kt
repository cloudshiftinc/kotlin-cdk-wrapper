@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.Unit

/**
 * Aspect that applies IMDS configuration on EC2 Launch Template constructs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * LaunchTemplateRequireImdsv2Aspect launchTemplateRequireImdsv2Aspect =
 * LaunchTemplateRequireImdsv2Aspect.Builder.create()
 * .suppressWarnings(false)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html)
 */
public open class LaunchTemplateRequireImdsv2Aspect(
  cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect,
) : CdkObject(cdkObject),
    IAspect {
  public constructor() :
      this(software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect()
  )

  public constructor(props: LaunchTemplateRequireImdsv2AspectProps) :
      this(software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect(props.let(LaunchTemplateRequireImdsv2AspectProps.Companion::unwrap))
  )

  public constructor(props: LaunchTemplateRequireImdsv2AspectProps.Builder.() -> Unit) :
      this(LaunchTemplateRequireImdsv2AspectProps(props)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect].
   */
  @CdkDslMarker
  public interface Builder {
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
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateRequireImdsv2Aspect {
      val builderImpl = BuilderImpl()
      return LaunchTemplateRequireImdsv2Aspect(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect):
        LaunchTemplateRequireImdsv2Aspect = LaunchTemplateRequireImdsv2Aspect(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateRequireImdsv2Aspect):
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect
  }
}
