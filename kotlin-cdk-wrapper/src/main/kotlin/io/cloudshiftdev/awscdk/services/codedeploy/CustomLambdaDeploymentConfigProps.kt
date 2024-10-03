@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * (deprecated) Properties of a reference to a CodeDeploy Lambda Deployment Configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * CustomLambdaDeploymentConfigProps customLambdaDeploymentConfigProps =
 * CustomLambdaDeploymentConfigProps.builder()
 * .interval(Duration.minutes(30))
 * .percentage(123)
 * .type(CustomLambdaDeploymentConfigType.CANARY)
 * // the properties below are optional
 * .deploymentConfigName("deploymentConfigName")
 * .build();
 * ```
 *
 * @deprecated Use `LambdaDeploymentConfig`
 */
public interface CustomLambdaDeploymentConfigProps {
  /**
   * (deprecated) The verbatim name of the deployment config.
   *
   * Must be unique per account/region.
   * Other parameters cannot be updated if this name is provided.
   *
   * Default: - automatically generated name
   *
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  /**
   * (deprecated) The interval, in number of minutes: - For LINEAR, how frequently additional
   * traffic is shifted - For CANARY, how long to shift traffic before the full deployment.
   *
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun interval(): Duration

  /**
   * (deprecated) The integer percentage of traffic to shift: - For LINEAR, the percentage to shift
   * every interval - For CANARY, the percentage to shift until the interval passes, before the full
   * deployment.
   *
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun percentage(): Number

  /**
   * (deprecated) The type of deployment config, either CANARY or LINEAR.
   *
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun type(): CustomLambdaDeploymentConfigType

  /**
   * A builder for [CustomLambdaDeploymentConfigProps]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param deploymentConfigName The verbatim name of the deployment config.
     * Must be unique per account/region.
     * Other parameters cannot be updated if this name is provided.
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * @param interval The interval, in number of minutes: - For LINEAR, how frequently additional
     * traffic is shifted - For CANARY, how long to shift traffic before the full deployment. 
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun interval(interval: Duration)

    /**
     * @param percentage The integer percentage of traffic to shift: - For LINEAR, the percentage to
     * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
     * full deployment. 
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun percentage(percentage: Number)

    /**
     * @param type The type of deployment config, either CANARY or LINEAR. 
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun type(type: CustomLambdaDeploymentConfigType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps.builder()

    /**
     * @param deploymentConfigName The verbatim name of the deployment config.
     * Must be unique per account/region.
     * Other parameters cannot be updated if this name is provided.
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * @param interval The interval, in number of minutes: - For LINEAR, how frequently additional
     * traffic is shifted - For CANARY, how long to shift traffic before the full deployment. 
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration.Companion::unwrap))
    }

    /**
     * @param percentage The integer percentage of traffic to shift: - For LINEAR, the percentage to
     * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
     * full deployment. 
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    /**
     * @param type The type of deployment config, either CANARY or LINEAR. 
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun type(type: CustomLambdaDeploymentConfigType) {
      cdkBuilder.type(type.let(CustomLambdaDeploymentConfigType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps,
  ) : CdkObject(cdkObject),
      CustomLambdaDeploymentConfigProps {
    /**
     * (deprecated) The verbatim name of the deployment config.
     *
     * Must be unique per account/region.
     * Other parameters cannot be updated if this name is provided.
     *
     * Default: - automatically generated name
     *
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    /**
     * (deprecated) The interval, in number of minutes: - For LINEAR, how frequently additional
     * traffic is shifted - For CANARY, how long to shift traffic before the full deployment.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    /**
     * (deprecated) The integer percentage of traffic to shift: - For LINEAR, the percentage to
     * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
     * full deployment.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun percentage(): Number = unwrap(this).getPercentage()

    /**
     * (deprecated) The type of deployment config, either CANARY or LINEAR.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun type(): CustomLambdaDeploymentConfigType =
        unwrap(this).getType().let(CustomLambdaDeploymentConfigType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomLambdaDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps):
        CustomLambdaDeploymentConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        CustomLambdaDeploymentConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomLambdaDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
  }
}
