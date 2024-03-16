@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The Deployment Configuration of an EC2/on-premise Deployment Group.
 *
 * The default, pre-defined Configurations are available as constants on the
 * `ServerDeploymentConfig` class
 * (`ServerDeploymentConfig.HALF_AT_A_TIME`, `ServerDeploymentConfig.ALL_AT_ONCE`, etc.).
 * To create a custom Deployment Configuration,
 * instantiate the `ServerDeploymentConfig` Construct.
 */
public interface IServerDeploymentConfig : IBaseDeploymentConfig {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig):
        IServerDeploymentConfig = CdkObjectWrappers.wrap(cdkObject) as IServerDeploymentConfig

    internal fun unwrap(wrapped: IServerDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig
  }
}
