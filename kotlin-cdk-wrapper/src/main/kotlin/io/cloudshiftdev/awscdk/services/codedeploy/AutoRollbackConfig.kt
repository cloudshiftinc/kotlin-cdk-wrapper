@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface AutoRollbackConfig {
  public fun deploymentInAlarm(): Boolean? = unwrap(this).getDeploymentInAlarm()

  public fun failedDeployment(): Boolean? = unwrap(this).getFailedDeployment()

  public fun stoppedDeployment(): Boolean? = unwrap(this).getStoppedDeployment()

  @CdkDslMarker
  public interface Builder {
    public fun deploymentInAlarm(deploymentInAlarm: Boolean)

    public fun failedDeployment(failedDeployment: Boolean)

    public fun stoppedDeployment(stoppedDeployment: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.AutoRollbackConfig.Builder =
        software.amazon.awscdk.services.codedeploy.AutoRollbackConfig.builder()

    override fun deploymentInAlarm(deploymentInAlarm: Boolean) {
      cdkBuilder.deploymentInAlarm(deploymentInAlarm)
    }

    override fun failedDeployment(failedDeployment: Boolean) {
      cdkBuilder.failedDeployment(failedDeployment)
    }

    override fun stoppedDeployment(stoppedDeployment: Boolean) {
      cdkBuilder.stoppedDeployment(stoppedDeployment)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.AutoRollbackConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.AutoRollbackConfig,
  ) : CdkObject(cdkObject), AutoRollbackConfig {
    override fun deploymentInAlarm(): Boolean? = unwrap(this).getDeploymentInAlarm()

    override fun failedDeployment(): Boolean? = unwrap(this).getFailedDeployment()

    override fun stoppedDeployment(): Boolean? = unwrap(this).getStoppedDeployment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoRollbackConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.AutoRollbackConfig):
        AutoRollbackConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoRollbackConfig):
        software.amazon.awscdk.services.codedeploy.AutoRollbackConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
  }
}
