@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IBaseDeploymentConfig {
  public fun deploymentConfigArn(): String

  public fun deploymentConfigName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig,
  ) : CdkObject(cdkObject), IBaseDeploymentConfig {
    override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

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
