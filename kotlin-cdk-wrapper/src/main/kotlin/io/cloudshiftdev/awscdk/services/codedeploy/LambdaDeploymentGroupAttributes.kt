@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties of a reference to a CodeDeploy Lambda Deployment Group.
 *
 * Example:
 *
 * ```
 * LambdaApplication application;
 * ILambdaDeploymentGroup deploymentGroup =
 * LambdaDeploymentGroup.fromLambdaDeploymentGroupAttributes(this, "ExistingCodeDeployDeploymentGroup",
 * LambdaDeploymentGroupAttributes.builder()
 * .application(application)
 * .deploymentGroupName("MyExistingDeploymentGroup")
 * .build());
 * ```
 *
 * [Documentation](LambdaDeploymentGroup#fromLambdaDeploymentGroupAttributes)
 */
public interface LambdaDeploymentGroupAttributes {
  /**
   * The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to.
   */
  public fun application(): ILambdaApplication

  /**
   * The Deployment Configuration this Deployment Group uses.
   *
   * Default: LambdaDeploymentConfig.CANARY_10PERCENT_5MINUTES
   */
  public fun deploymentConfig(): ILambdaDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(ILambdaDeploymentConfig::wrap)

  /**
   * The physical, human-readable name of the CodeDeploy Lambda Deployment Group that we are
   * referencing.
   */
  public fun deploymentGroupName(): String

  /**
   * A builder for [LambdaDeploymentGroupAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The reference to the CodeDeploy Lambda Application that this Deployment
     * Group belongs to. 
     */
    public fun application(application: ILambdaApplication)

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig)

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Lambda
     * Deployment Group that we are referencing. 
     */
    public fun deploymentGroupName(deploymentGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes.builder()

    /**
     * @param application The reference to the CodeDeploy Lambda Application that this Deployment
     * Group belongs to. 
     */
    override fun application(application: ILambdaApplication) {
      cdkBuilder.application(application.let(ILambdaApplication::unwrap))
    }

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    override fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(ILambdaDeploymentConfig::unwrap))
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Lambda
     * Deployment Group that we are referencing. 
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes,
  ) : CdkObject(cdkObject), LambdaDeploymentGroupAttributes {
    /**
     * The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to.
     */
    override fun application(): ILambdaApplication =
        unwrap(this).getApplication().let(ILambdaApplication::wrap)

    /**
     * The Deployment Configuration this Deployment Group uses.
     *
     * Default: LambdaDeploymentConfig.CANARY_10PERCENT_5MINUTES
     */
    override fun deploymentConfig(): ILambdaDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(ILambdaDeploymentConfig::wrap)

    /**
     * The physical, human-readable name of the CodeDeploy Lambda Deployment Group that we are
     * referencing.
     */
    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeploymentGroupAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes):
        LambdaDeploymentGroupAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        LambdaDeploymentGroupAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentGroupAttributes):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes
  }
}
