package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface EcsDeploymentGroupAttributes {
  /**
   * The reference to the CodeDeploy ECS Application that this Deployment Group belongs to.
   */
  public fun application(): IEcsApplication

  /**
   * The Deployment Configuration this Deployment Group uses.
   *
   * Default: EcsDeploymentConfig.ALL_AT_ONCE
   */
  public fun deploymentConfig(): IEcsDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

  /**
   * The physical, human-readable name of the CodeDeploy ECS Deployment Group that we are
   * referencing.
   */
  public fun deploymentGroupName(): String

  /**
   * A builder for [EcsDeploymentGroupAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The reference to the CodeDeploy ECS Application that this Deployment Group
     * belongs to. 
     */
    public fun application(application: IEcsApplication)

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig)

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy ECS Deployment
     * Group that we are referencing. 
     */
    public fun deploymentGroupName(deploymentGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes.builder()

    /**
     * @param application The reference to the CodeDeploy ECS Application that this Deployment Group
     * belongs to. 
     */
    override fun application(application: IEcsApplication) {
      cdkBuilder.application(application.let(IEcsApplication::unwrap))
    }

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    override fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IEcsDeploymentConfig::unwrap))
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy ECS Deployment
     * Group that we are referencing. 
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes,
  ) : EcsDeploymentGroupAttributes {
    /**
     * The reference to the CodeDeploy ECS Application that this Deployment Group belongs to.
     */
    override fun application(): IEcsApplication =
        unwrap(this).getApplication().let(IEcsApplication::wrap)

    /**
     * The Deployment Configuration this Deployment Group uses.
     *
     * Default: EcsDeploymentConfig.ALL_AT_ONCE
     */
    override fun deploymentConfig(): IEcsDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

    /**
     * The physical, human-readable name of the CodeDeploy ECS Deployment Group that we are
     * referencing.
     */
    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
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
