@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * The base class for ServerDeploymentConfig, EcsDeploymentConfig, and LambdaDeploymentConfig
 * deployment configurations.
 */
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
        IBaseDeploymentConfig = CdkObjectWrappers.wrap(cdkObject) as? IBaseDeploymentConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBaseDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig
  }
}
