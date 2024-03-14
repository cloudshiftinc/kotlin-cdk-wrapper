package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String
import kotlin.Unit

public interface EcsDeploymentGroupAttributes {
  public fun application(): IEcsApplication

  public fun deploymentConfig(): IEcsDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

  public fun deploymentGroupName(): String

  public interface Builder {
    public fun application(application: IEcsApplication) {
    }

    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
    }

    public fun deploymentGroupName(deploymentGroupName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes.builder()

    public override fun application(application: IEcsApplication) {
      cdkBuilder.application(application.let(IEcsApplication::unwrap))
    }

    public override fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IEcsDeploymentConfig::unwrap))
    }

    public override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes,
  ) : EcsDeploymentGroupAttributes {
    public override fun application(): IEcsApplication =
        unwrap(this).getApplication().let(IEcsApplication::wrap)

    public override fun deploymentConfig(): IEcsDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

    public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeploymentGroupAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes):
        EcsDeploymentGroupAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsDeploymentGroupAttributes):
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
