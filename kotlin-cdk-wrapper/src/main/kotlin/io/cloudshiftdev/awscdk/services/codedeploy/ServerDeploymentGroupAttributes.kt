@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ServerDeploymentGroupAttributes {
  public fun application(): IServerApplication

  public fun deploymentConfig(): IServerDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IServerDeploymentConfig::wrap)

  public fun deploymentGroupName(): String

  @CdkDslMarker
  public interface Builder {
    public fun application(application: IServerApplication)

    public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig)

    public fun deploymentGroupName(deploymentGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes.Builder =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes.builder()

    override fun application(application: IServerApplication) {
      cdkBuilder.application(application.let(IServerApplication::unwrap))
    }

    override fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IServerDeploymentConfig::unwrap))
    }

    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes,
  ) : CdkObject(cdkObject), ServerDeploymentGroupAttributes {
    override fun application(): IServerApplication =
        unwrap(this).getApplication().let(IServerApplication::wrap)

    override fun deploymentConfig(): IServerDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IServerDeploymentConfig::wrap)

    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerDeploymentGroupAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes):
        ServerDeploymentGroupAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentGroupAttributes):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes
  }
}
