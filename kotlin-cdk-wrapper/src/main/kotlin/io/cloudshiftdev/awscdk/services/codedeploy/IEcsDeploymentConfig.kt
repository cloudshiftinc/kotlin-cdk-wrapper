@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * The Deployment Configuration of an ECS Deployment Group.
 *
 * If you're managing the Deployment Configuration alongside the rest of your CDK resources,
 * use the `EcsDeploymentConfig` class.
 *
 * If you want to reference an already existing deployment configuration,
 * or one defined in a different CDK Stack,
 * use the `EcsDeploymentConfig#fromEcsDeploymentConfigName` method.
 *
 * The default, pre-defined Configurations are available as constants on the `EcsDeploymentConfig`
 * class
 * (for example, `EcsDeploymentConfig.AllAtOnce`).
 */
public interface IEcsDeploymentConfig : IBaseDeploymentConfig {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig,
  ) : CdkObject(cdkObject), IEcsDeploymentConfig {
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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig):
        IEcsDeploymentConfig = CdkObjectWrappers.wrap(cdkObject) as? IEcsDeploymentConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig
  }
}
