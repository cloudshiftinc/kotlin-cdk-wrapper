@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.Unit

public open class InstanceRequireImdsv2Aspect internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect,
) : CdkObject(cdkObject), IAspect {
  public override fun visit(node: IConstruct) {
    unwrap(this).visit(node.let(IConstruct::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean)

    public fun suppressWarnings(suppressWarnings: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect.Builder
        = software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect.Builder.create()

    override fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean) {
      cdkBuilder.suppressLaunchTemplateWarning(suppressLaunchTemplateWarning)
    }

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
        software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect = wrapped.cdkObject
  }
}
