@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface LaunchTemplateRequireImdsv2AspectProps {
  public fun suppressWarnings(): Boolean? = unwrap(this).getSuppressWarnings()

  @CdkDslMarker
  public interface Builder {
    public fun suppressWarnings(suppressWarnings: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps.builder()

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
        LaunchTemplateRequireImdsv2AspectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateRequireImdsv2AspectProps):
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps
  }
}
