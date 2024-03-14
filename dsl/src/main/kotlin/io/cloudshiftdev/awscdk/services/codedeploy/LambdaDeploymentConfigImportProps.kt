package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String
import kotlin.Unit

public interface LambdaDeploymentConfigImportProps {
  public fun deploymentConfigName(): String

  public interface Builder {
    public fun deploymentConfigName(deploymentConfigName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps.builder()

    public override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps,
  ) : LambdaDeploymentConfigImportProps {
    public override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeploymentConfigImportProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps):
        LambdaDeploymentConfigImportProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentConfigImportProps):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps = (wrapped as
        Wrapper).cdkObject
  }
}
