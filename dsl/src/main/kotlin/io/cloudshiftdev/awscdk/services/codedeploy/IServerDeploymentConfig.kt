package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IServerDeploymentConfig : IBaseDeploymentConfig {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig,
  ) : CdkObject(cdkObject), IServerDeploymentConfig {
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
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig):
        IServerDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IServerDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig
  }
}
