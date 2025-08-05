@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A custom Deployment Configuration for a Lambda Deployment Group.
 *
 * Example:
 *
 * ```
 * LambdaApplication application;
 * Alias alias;
 * LambdaDeploymentConfig config = LambdaDeploymentConfig.Builder.create(this, "CustomConfig")
 * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
 * .interval(Duration.minutes(15))
 * .percentage(5)
 * .build())
 * .build();
 * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
 * "BlueGreenDeployment")
 * .application(application)
 * .alias(alias)
 * .deploymentConfig(config)
 * .build();
 * ```
 */
public open class LambdaDeploymentConfig(
  cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig,
) : BaseDeploymentConfig(cdkObject),
    ILambdaDeploymentConfig {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LambdaDeploymentConfigProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(LambdaDeploymentConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LambdaDeploymentConfigProps.Builder.() -> Unit,
  ) : this(scope, id, LambdaDeploymentConfigProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.LambdaDeploymentConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     *
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration. 
     */
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * The configuration that specifies how traffic is shifted from the 'blue' target group to the
     * 'green' target group during a deployment.
     *
     * Default: AllAtOnce
     *
     * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
     * target group to the 'green' target group during a deployment. 
     */
    public fun trafficRouting(trafficRouting: TrafficRouting)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.Builder.create(scope, id)

    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     *
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration. 
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * The configuration that specifies how traffic is shifted from the 'blue' target group to the
     * 'green' target group during a deployment.
     *
     * Default: AllAtOnce
     *
     * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
     * target group to the 'green' target group during a deployment. 
     */
    override fun trafficRouting(trafficRouting: TrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val ALL_AT_ONCE: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.ALL_AT_ONCE)

    public val CANARY_10_PERCENT_10_MINUTES: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.CANARY_10_PERCENT_10_MINUTES)

    public val CANARY_10_PERCENT_15_MINUTES: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.CANARY_10_PERCENT_15_MINUTES)

    public val CANARY_10_PERCENT_30_MINUTES: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.CANARY_10_PERCENT_30_MINUTES)

    public val CANARY_10_PERCENT_5_MINUTES: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.CANARY_10_PERCENT_5_MINUTES)

    public val LINEAR_10_PERCENT_EVERY_10_MINUTES: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.LINEAR_10_PERCENT_EVERY_10_MINUTES)

    public val LINEAR_10_PERCENT_EVERY_1_MINUTE: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.LINEAR_10_PERCENT_EVERY_1_MINUTE)

    public val LINEAR_10_PERCENT_EVERY_2_MINUTES: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.LINEAR_10_PERCENT_EVERY_2_MINUTES)

    public val LINEAR_10_PERCENT_EVERY_3_MINUTES: ILambdaDeploymentConfig =
        ILambdaDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.LINEAR_10_PERCENT_EVERY_3_MINUTES)

    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.PROPERTY_INJECTION_ID

    @Deprecated(message = "deprecated in CDK")
    public fun doImport(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: LambdaDeploymentConfigImportProps,
    ): ILambdaDeploymentConfig =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.doImport(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        props.let(LambdaDeploymentConfigImportProps.Companion::unwrap)).let(ILambdaDeploymentConfig::wrap)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fafbd60daf73a5800337fbe97f5b3805d8c2f09a126c3255cb4bcb3b42d78746")
    public fun doImport(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: LambdaDeploymentConfigImportProps.Builder.() -> Unit,
    ): ILambdaDeploymentConfig = doImport(scope, id, LambdaDeploymentConfigImportProps(props))

    public fun fromLambdaDeploymentConfigName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      lambdaDeploymentConfigName: String,
    ): ILambdaDeploymentConfig =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.fromLambdaDeploymentConfigName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, lambdaDeploymentConfigName).let(ILambdaDeploymentConfig::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaDeploymentConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig):
        LambdaDeploymentConfig = LambdaDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig
  }
}
