@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EcsDeploymentGroupAttributes {
  public fun application(): IEcsApplication

  public fun deploymentConfig(): IEcsDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

  public fun deploymentGroupName(): String

  @CdkDslMarker
  public interface Builder {
    public fun application(application: IEcsApplication)

    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig)

    public fun deploymentGroupName(deploymentGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes.builder()

    override fun application(application: IEcsApplication) {
      cdkBuilder.application(application.let(IEcsApplication::unwrap))
    }

    override fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IEcsDeploymentConfig::unwrap))
    }

    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes,
  ) : CdkObject(cdkObject), EcsDeploymentGroupAttributes {
    override fun application(): IEcsApplication =
        unwrap(this).getApplication().let(IEcsApplication::wrap)

    override fun deploymentConfig(): IEcsDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeploymentGroupAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes):
        EcsDeploymentGroupAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsDeploymentGroupAttributes):
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes
  }
}
