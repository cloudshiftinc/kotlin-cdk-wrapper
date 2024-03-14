package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import kotlin.String

public abstract class BaseDeploymentConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig,
) : Resource(cdkObject), IBaseDeploymentConfig {
  public override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

  public override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig,
  ) : BaseDeploymentConfig(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig):
        BaseDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig = (wrapped as
        Wrapper).cdkObject
  }
}
