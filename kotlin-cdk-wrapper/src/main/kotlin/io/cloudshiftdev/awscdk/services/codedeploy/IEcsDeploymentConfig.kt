@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IEcsDeploymentConfig : IBaseDeploymentConfig {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig,
  ) : CdkObject(cdkObject), IEcsDeploymentConfig {
    override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

    override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig):
        IEcsDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig
  }
}
