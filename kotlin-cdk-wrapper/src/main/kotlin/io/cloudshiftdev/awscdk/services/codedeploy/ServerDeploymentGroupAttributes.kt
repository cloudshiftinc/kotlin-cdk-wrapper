@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties of a reference to a CodeDeploy EC2/on-premise Deployment Group.
 *
 * Example:
 *
 * ```
 * ServerApplication application;
 * IServerDeploymentGroup deploymentGroup =
 * ServerDeploymentGroup.fromServerDeploymentGroupAttributes(this, "ExistingCodeDeployDeploymentGroup",
 * ServerDeploymentGroupAttributes.builder()
 * .application(application)
 * .deploymentGroupName("MyExistingDeploymentGroup")
 * .build());
 * ```
 *
 * [Documentation](ServerDeploymentGroup# import)
 */
public interface ServerDeploymentGroupAttributes {
  /**
   * The reference to the CodeDeploy EC2/on-premise Application that this Deployment Group belongs
   * to.
   */
  public fun application(): IServerApplication

  /**
   * The Deployment Configuration this Deployment Group uses.
   *
   * Default: ServerDeploymentConfig#OneAtATime
   */
  public fun deploymentConfig(): IServerDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IServerDeploymentConfig::wrap)

  /**
   * The physical, human-readable name of the CodeDeploy EC2/on-premise Deployment Group that we are
   * referencing.
   */
  public fun deploymentGroupName(): String

  /**
   * A builder for [ServerDeploymentGroupAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The reference to the CodeDeploy EC2/on-premise Application that this
     * Deployment Group belongs to. 
     */
    public fun application(application: IServerApplication)

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig)

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy EC2/on-premise
     * Deployment Group that we are referencing. 
     */
    public fun deploymentGroupName(deploymentGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes.Builder =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes.builder()

    /**
     * @param application The reference to the CodeDeploy EC2/on-premise Application that this
     * Deployment Group belongs to. 
     */
    override fun application(application: IServerApplication) {
      cdkBuilder.application(application.let(IServerApplication::unwrap))
    }

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    override fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IServerDeploymentConfig::unwrap))
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy EC2/on-premise
     * Deployment Group that we are referencing. 
     */
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
    /**
     * The reference to the CodeDeploy EC2/on-premise Application that this Deployment Group belongs
     * to.
     */
    override fun application(): IServerApplication =
        unwrap(this).getApplication().let(IServerApplication::wrap)

    /**
     * The Deployment Configuration this Deployment Group uses.
     *
     * Default: ServerDeploymentConfig#OneAtATime
     */
    override fun deploymentConfig(): IServerDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IServerDeploymentConfig::wrap)

    /**
     * The physical, human-readable name of the CodeDeploy EC2/on-premise Deployment Group that we
     * are referencing.
     */
    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerDeploymentGroupAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes):
        ServerDeploymentGroupAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        ServerDeploymentGroupAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentGroupAttributes):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes
  }
}
