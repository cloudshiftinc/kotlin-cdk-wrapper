@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface BootstraplessSynthesizerProps {
  public fun cloudFormationExecutionRoleArn(): String? =
      unwrap(this).getCloudFormationExecutionRoleArn()

  public fun deployRoleArn(): String? = unwrap(this).getDeployRoleArn()

  @CdkDslMarker
  public interface Builder {
    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String)

    public fun deployRoleArn(deployRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.BootstraplessSynthesizerProps.Builder =
        software.amazon.awscdk.BootstraplessSynthesizerProps.builder()

    override fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
      cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    override fun deployRoleArn(deployRoleArn: String) {
      cdkBuilder.deployRoleArn(deployRoleArn)
    }

    public fun build(): software.amazon.awscdk.BootstraplessSynthesizerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.BootstraplessSynthesizerProps,
  ) : CdkObject(cdkObject), BootstraplessSynthesizerProps {
    override fun cloudFormationExecutionRoleArn(): String? =
        unwrap(this).getCloudFormationExecutionRoleArn()

    override fun deployRoleArn(): String? = unwrap(this).getDeployRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BootstraplessSynthesizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.BootstraplessSynthesizerProps):
        BootstraplessSynthesizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BootstraplessSynthesizerProps):
        software.amazon.awscdk.BootstraplessSynthesizerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.BootstraplessSynthesizerProps
  }
}
