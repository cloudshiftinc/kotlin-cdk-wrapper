@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * The Deployment Configuration of a Lambda Deployment Group.
 *
 * If you're managing the Deployment Configuration alongside the rest of your CDK resources,
 * use the `LambdaDeploymentConfig` class.
 *
 * If you want to reference an already existing deployment configuration,
 * or one defined in a different CDK Stack,
 * use the `LambdaDeploymentConfig#fromLambdaDeploymentConfigName` method.
 *
 * The default, pre-defined Configurations are available as constants on the
 * `LambdaDeploymentConfig` class
 * (`LambdaDeploymentConfig.AllAtOnce`, `LambdaDeploymentConfig.Canary10Percent30Minutes`, etc.).
 */
public interface ILambdaDeploymentConfig : IBaseDeploymentConfig {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig,
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
        ILambdaDeploymentConfig = CdkObjectWrappers.wrap(cdkObject) as? ILambdaDeploymentConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILambdaDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig
  }
}
