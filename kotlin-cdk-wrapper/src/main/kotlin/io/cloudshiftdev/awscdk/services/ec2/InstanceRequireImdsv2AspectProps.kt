@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface InstanceRequireImdsv2AspectProps {
  public fun suppressLaunchTemplateWarning(): Boolean? =
      unwrap(this).getSuppressLaunchTemplateWarning()

  public fun suppressWarnings(): Boolean? = unwrap(this).getSuppressWarnings()

  @CdkDslMarker
  public interface Builder {
    public fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean)

    public fun suppressWarnings(suppressWarnings: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps.Builder =
        software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps.builder()

    override fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean) {
      cdkBuilder.suppressLaunchTemplateWarning(suppressLaunchTemplateWarning)
    }

    override fun suppressWarnings(suppressWarnings: Boolean) {
      cdkBuilder.suppressWarnings(suppressWarnings)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps,
  ) : CdkObject(cdkObject), InstanceRequireImdsv2AspectProps {
    override fun suppressLaunchTemplateWarning(): Boolean? =
        unwrap(this).getSuppressLaunchTemplateWarning()

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
