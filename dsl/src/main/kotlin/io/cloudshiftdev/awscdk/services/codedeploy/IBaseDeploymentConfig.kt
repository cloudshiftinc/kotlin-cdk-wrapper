package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IBaseDeploymentConfig {
  /**
   * The ARN of the Deployment Configuration.
   */
  public fun deploymentConfigArn(): String

  /**
   * The physical, human-readable name of the Deployment Configuration.
   */
  public fun deploymentConfigName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig,
  ) : CdkObject(cdkObject), IBaseDeploymentConfig {
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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig):
        IBaseDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBaseDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig
  }
}
