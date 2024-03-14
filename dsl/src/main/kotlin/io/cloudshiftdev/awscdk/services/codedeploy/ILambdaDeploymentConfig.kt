package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface ILambdaDeploymentConfig : IBaseDeploymentConfig {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig,
  ) : CdkObject(cdkObject), ILambdaDeploymentConfig {
    /**
     * The ARN of the Deployment Configuration.
     */
    override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

    /**
     * The physical, human-readable name of the Deployment Configuration.
     */
    override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig):
        ILambdaDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILambdaDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig
  }
}
