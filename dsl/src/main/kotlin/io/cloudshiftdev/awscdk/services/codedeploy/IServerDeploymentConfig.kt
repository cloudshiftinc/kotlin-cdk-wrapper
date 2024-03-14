package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String

public interface IServerDeploymentConfig : IBaseDeploymentConfig {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig,
  ) : IServerDeploymentConfig {
    public override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

    public override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig):
        IServerDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IServerDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig = (wrapped as
        Wrapper).cdkObject
  }
}
