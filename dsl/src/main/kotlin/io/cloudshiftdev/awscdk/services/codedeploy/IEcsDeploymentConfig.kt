package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String

public interface IEcsDeploymentConfig : IBaseDeploymentConfig {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig,
  ) : IEcsDeploymentConfig {
    override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

    override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig):
        IEcsDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig = (wrapped as
        Wrapper).cdkObject
  }
}
