package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String

public interface IBaseDeploymentConfig {
  public fun deploymentConfigArn(): String

  public fun deploymentConfigName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig,
  ) : IBaseDeploymentConfig {
    public override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

    public override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig):
        IBaseDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBaseDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.IBaseDeploymentConfig = (wrapped as
        Wrapper).cdkObject
  }
}
