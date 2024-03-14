package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String
import kotlin.Unit

public interface LambdaDeploymentGroupAttributes {
  public fun application(): ILambdaApplication

  public fun deploymentConfig(): ILambdaDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(ILambdaDeploymentConfig::wrap)

  public fun deploymentGroupName(): String

  public interface Builder {
    public fun application(application: ILambdaApplication)

    public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig)

    public fun deploymentGroupName(deploymentGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes.builder()

    override fun application(application: ILambdaApplication) {
      cdkBuilder.application(application.let(ILambdaApplication::unwrap))
    }

    override fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(ILambdaDeploymentConfig::unwrap))
    }

    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes,
  ) : LambdaDeploymentGroupAttributes {
    override fun application(): ILambdaApplication =
        unwrap(this).getApplication().let(ILambdaApplication::wrap)

    override fun deploymentConfig(): ILambdaDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(ILambdaDeploymentConfig::wrap)

    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeploymentGroupAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes):
        LambdaDeploymentGroupAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentGroupAttributes):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
