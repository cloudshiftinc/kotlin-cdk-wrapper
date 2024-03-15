@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface LambdaDeploymentConfigImportProps {
  public fun deploymentConfigName(): String

  @CdkDslMarker
  public interface Builder {
    public fun deploymentConfigName(deploymentConfigName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps.builder()

    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps,
  ) : CdkObject(cdkObject), LambdaDeploymentConfigImportProps {
    override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeploymentConfigImportProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps):
        LambdaDeploymentConfigImportProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentConfigImportProps):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps
  }
}