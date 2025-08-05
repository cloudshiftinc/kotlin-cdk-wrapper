@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * (deprecated) A custom Deployment Configuration for a Lambda Deployment Group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * CustomLambdaDeploymentConfig customLambdaDeploymentConfig =
 * CustomLambdaDeploymentConfig.Builder.create(this, "MyCustomLambdaDeploymentConfig")
 * .interval(Duration.minutes(30))
 * .percentage(123)
 * .type(CustomLambdaDeploymentConfigType.CANARY)
 * // the properties below are optional
 * .deploymentConfigName("deploymentConfigName")
 * .build();
 * ```
 *
 * @deprecated CloudFormation now supports Lambda deployment configurations without custom
 * resources. Use `LambdaDeploymentConfig`.
 */
public open class CustomLambdaDeploymentConfig(
  cdkObject: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig,
) : Resource(cdkObject),
    ILambdaDeploymentConfig {
  @Deprecated(message = "deprecated in CDK")
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CustomLambdaDeploymentConfigProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CustomLambdaDeploymentConfigProps.Companion::unwrap))
  )

  @Deprecated(message = "deprecated in CDK")
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CustomLambdaDeploymentConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CustomLambdaDeploymentConfigProps(props)
  )

  /**
   * (deprecated) The arn of the deployment config.
   *
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

  /**
   * (deprecated) The name of the deployment config.
   *
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()

  /**
   * (deprecated) A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codedeploy.CustomLambdaDeploymentConfig].
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * (deprecated) The verbatim name of the deployment config.
     *
     * Must be unique per account/region.
     * Other parameters cannot be updated if this name is provided.
     *
     * Default: - automatically generated name
     *
     * @deprecated Use `LambdaDeploymentConfig`
     * @param deploymentConfigName The verbatim name of the deployment config. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * (deprecated) The interval, in number of minutes: - For LINEAR, how frequently additional
     * traffic is shifted - For CANARY, how long to shift traffic before the full deployment.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     * @param interval The interval, in number of minutes: - For LINEAR, how frequently additional
     * traffic is shifted - For CANARY, how long to shift traffic before the full deployment. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun interval(interval: Duration)

    /**
     * (deprecated) The integer percentage of traffic to shift: - For LINEAR, the percentage to
     * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
     * full deployment.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     * @param percentage The integer percentage of traffic to shift: - For LINEAR, the percentage to
     * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
     * full deployment. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun percentage(percentage: Number)

    /**
     * (deprecated) The type of deployment config, either CANARY or LINEAR.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     * @param type The type of deployment config, either CANARY or LINEAR. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun type(type: CustomLambdaDeploymentConfigType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig.Builder.create(scope,
        id)

    /**
     * (deprecated) The verbatim name of the deployment config.
     *
     * Must be unique per account/region.
     * Other parameters cannot be updated if this name is provided.
     *
     * Default: - automatically generated name
     *
     * @deprecated Use `LambdaDeploymentConfig`
     * @param deploymentConfigName The verbatim name of the deployment config. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * (deprecated) The interval, in number of minutes: - For LINEAR, how frequently additional
     * traffic is shifted - For CANARY, how long to shift traffic before the full deployment.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     * @param interval The interval, in number of minutes: - For LINEAR, how frequently additional
     * traffic is shifted - For CANARY, how long to shift traffic before the full deployment. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration.Companion::unwrap))
    }

    /**
     * (deprecated) The integer percentage of traffic to shift: - For LINEAR, the percentage to
     * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
     * full deployment.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     * @param percentage The integer percentage of traffic to shift: - For LINEAR, the percentage to
     * shift every interval - For CANARY, the percentage to shift until the interval passes, before the
     * full deployment. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    /**
     * (deprecated) The type of deployment config, either CANARY or LINEAR.
     *
     * @deprecated Use `LambdaDeploymentConfig`
     * @param type The type of deployment config, either CANARY or LINEAR. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun type(type: CustomLambdaDeploymentConfigType) {
      cdkBuilder.type(type.let(CustomLambdaDeploymentConfigType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig.PROPERTY_INJECTION_ID

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomLambdaDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomLambdaDeploymentConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig):
        CustomLambdaDeploymentConfig = CustomLambdaDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: CustomLambdaDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig = wrapped.cdkObject
        as software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig
  }
}
