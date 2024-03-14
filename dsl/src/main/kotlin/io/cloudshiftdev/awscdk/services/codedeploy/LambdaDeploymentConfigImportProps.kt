package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface LambdaDeploymentConfigImportProps {
  /**
   * The physical, human-readable name of the custom CodeDeploy Lambda Deployment Configuration that
   * we are referencing.
   */
  public fun deploymentConfigName(): String

  /**
   * A builder for [LambdaDeploymentConfigImportProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentConfigName The physical, human-readable name of the custom CodeDeploy Lambda
     * Deployment Configuration that we are referencing. 
     */
    public fun deploymentConfigName(deploymentConfigName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps.builder()

    /**
     * @param deploymentConfigName The physical, human-readable name of the custom CodeDeploy Lambda
     * Deployment Configuration that we are referencing. 
     */
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
    /**
     * The physical, human-readable name of the custom CodeDeploy Lambda Deployment Configuration
     * that we are referencing.
     */
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
