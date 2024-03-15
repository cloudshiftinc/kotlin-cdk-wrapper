@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Construction properties of `CfnCodeDeployBlueGreenHook`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnCodeDeployBlueGreenHookProps cfnCodeDeployBlueGreenHookProps =
 * CfnCodeDeployBlueGreenHookProps.builder()
 * .applications(List.of(CfnCodeDeployBlueGreenApplication.builder()
 * .ecsAttributes(CfnCodeDeployBlueGreenEcsAttributes.builder()
 * .taskDefinitions(List.of("taskDefinitions"))
 * .taskSets(List.of("taskSets"))
 * .trafficRouting(CfnTrafficRouting.builder()
 * .prodTrafficRoute(CfnTrafficRoute.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .targetGroups(List.of("targetGroups"))
 * .testTrafficRoute(CfnTrafficRoute.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .build())
 * .build())
 * .target(CfnCodeDeployBlueGreenApplicationTarget.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .build()))
 * .serviceRole("serviceRole")
 * // the properties below are optional
 * .additionalOptions(CfnCodeDeployBlueGreenAdditionalOptions.builder()
 * .terminationWaitTimeInMinutes(123)
 * .build())
 * .lifecycleEventHooks(CfnCodeDeployBlueGreenLifecycleEventHooks.builder()
 * .afterAllowTestTraffic("afterAllowTestTraffic")
 * .afterAllowTraffic("afterAllowTraffic")
 * .afterInstall("afterInstall")
 * .beforeAllowTraffic("beforeAllowTraffic")
 * .beforeInstall("beforeInstall")
 * .build())
 * .trafficRoutingConfig(CfnTrafficRoutingConfig.builder()
 * .type(CfnTrafficRoutingType.ALL_AT_ONCE)
 * // the properties below are optional
 * .timeBasedCanary(CfnTrafficRoutingTimeBasedCanary.builder()
 * .bakeTimeMins(123)
 * .stepPercentage(123)
 * .build())
 * .timeBasedLinear(CfnTrafficRoutingTimeBasedLinear.builder()
 * .bakeTimeMins(123)
 * .stepPercentage(123)
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface CfnCodeDeployBlueGreenHookProps {
  /**
   * Additional options for the blue/green deployment.
   *
   * Default: - no additional options
   */
  public fun additionalOptions(): CfnCodeDeployBlueGreenAdditionalOptions? =
      unwrap(this).getAdditionalOptions()?.let(CfnCodeDeployBlueGreenAdditionalOptions::wrap)

  /**
   * Properties of the Amazon ECS applications being deployed.
   */
  public fun applications(): List<CfnCodeDeployBlueGreenApplication>

  /**
   * Use lifecycle event hooks to specify a Lambda function that CodeDeploy can call to validate a
   * deployment.
   *
   * You can use the same function or a different one for deployment lifecycle events.
   * Following completion of the validation tests,
   * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
   * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
   *
   * Default: - no lifecycle event hooks
   */
  public fun lifecycleEventHooks(): CfnCodeDeployBlueGreenLifecycleEventHooks? =
      unwrap(this).getLifecycleEventHooks()?.let(CfnCodeDeployBlueGreenLifecycleEventHooks::wrap)

  /**
   * The IAM Role for CloudFormation to use to perform blue-green deployments.
   */
  public fun serviceRole(): String

  /**
   * Traffic routing configuration settings.
   *
   * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
   * bake time
   */
  public fun trafficRoutingConfig(): CfnTrafficRoutingConfig? =
      unwrap(this).getTrafficRoutingConfig()?.let(CfnTrafficRoutingConfig::wrap)

  /**
   * A builder for [CfnCodeDeployBlueGreenHookProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalOptions Additional options for the blue/green deployment.
     */
    public fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions)

    /**
     * @param additionalOptions Additional options for the blue/green deployment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a7313e2337dbd9bacd0d044add4afffdee0ea9620d1424dbc3c0a272adfd693")
    public
        fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit)

    /**
     * @param applications Properties of the Amazon ECS applications being deployed. 
     */
    public fun applications(applications: List<CfnCodeDeployBlueGreenApplication>)

    /**
     * @param applications Properties of the Amazon ECS applications being deployed. 
     */
    public fun applications(vararg applications: CfnCodeDeployBlueGreenApplication)

    /**
     * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
     * CodeDeploy can call to validate a deployment.
     * You can use the same function or a different one for deployment lifecycle events.
     * Following completion of the validation tests,
     * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
     * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
     */
    public fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks)

    /**
     * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
     * CodeDeploy can call to validate a deployment.
     * You can use the same function or a different one for deployment lifecycle events.
     * Following completion of the validation tests,
     * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
     * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b88c7821b7a74fa6b15da11ee9bc8a34a3824d0679a826156119da744b03403f")
    public
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit)

    /**
     * @param serviceRole The IAM Role for CloudFormation to use to perform blue-green deployments. 
     */
    public fun serviceRole(serviceRole: String)

    /**
     * @param trafficRoutingConfig Traffic routing configuration settings.
     */
    public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig)

    /**
     * @param trafficRoutingConfig Traffic routing configuration settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce22a9dcac098a4f5b940b21a387b71aa7c2916d0f3f6b3ea24b5329fffe3fe5")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps.builder()

    /**
     * @param additionalOptions Additional options for the blue/green deployment.
     */
    override fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions) {
      cdkBuilder.additionalOptions(additionalOptions.let(CfnCodeDeployBlueGreenAdditionalOptions::unwrap))
    }

    /**
     * @param additionalOptions Additional options for the blue/green deployment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a7313e2337dbd9bacd0d044add4afffdee0ea9620d1424dbc3c0a272adfd693")
    override
        fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit):
        Unit = additionalOptions(CfnCodeDeployBlueGreenAdditionalOptions(additionalOptions))

    /**
     * @param applications Properties of the Amazon ECS applications being deployed. 
     */
    override fun applications(applications: List<CfnCodeDeployBlueGreenApplication>) {
      cdkBuilder.applications(applications.map(CfnCodeDeployBlueGreenApplication::unwrap))
    }

    /**
     * @param applications Properties of the Amazon ECS applications being deployed. 
     */
    override fun applications(vararg applications: CfnCodeDeployBlueGreenApplication): Unit =
        applications(applications.toList())

    /**
     * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
     * CodeDeploy can call to validate a deployment.
     * You can use the same function or a different one for deployment lifecycle events.
     * Following completion of the validation tests,
     * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
     * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
     */
    override
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks) {
      cdkBuilder.lifecycleEventHooks(lifecycleEventHooks.let(CfnCodeDeployBlueGreenLifecycleEventHooks::unwrap))
    }

    /**
     * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
     * CodeDeploy can call to validate a deployment.
     * You can use the same function or a different one for deployment lifecycle events.
     * Following completion of the validation tests,
     * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
     * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b88c7821b7a74fa6b15da11ee9bc8a34a3824d0679a826156119da744b03403f")
    override
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit):
        Unit = lifecycleEventHooks(CfnCodeDeployBlueGreenLifecycleEventHooks(lifecycleEventHooks))

    /**
     * @param serviceRole The IAM Role for CloudFormation to use to perform blue-green deployments. 
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * @param trafficRoutingConfig Traffic routing configuration settings.
     */
    override fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(CfnTrafficRoutingConfig::unwrap))
    }

    /**
     * @param trafficRoutingConfig Traffic routing configuration settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce22a9dcac098a4f5b940b21a387b71aa7c2916d0f3f6b3ea24b5329fffe3fe5")
    override
        fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig.Builder.() -> Unit):
        Unit = trafficRoutingConfig(CfnTrafficRoutingConfig(trafficRoutingConfig))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps,
  ) : CdkObject(cdkObject), CfnCodeDeployBlueGreenHookProps {
    /**
     * Additional options for the blue/green deployment.
     *
     * Default: - no additional options
     */
    override fun additionalOptions(): CfnCodeDeployBlueGreenAdditionalOptions? =
        unwrap(this).getAdditionalOptions()?.let(CfnCodeDeployBlueGreenAdditionalOptions::wrap)

    /**
     * Properties of the Amazon ECS applications being deployed.
     */
    override fun applications(): List<CfnCodeDeployBlueGreenApplication> =
        unwrap(this).getApplications().map(CfnCodeDeployBlueGreenApplication::wrap)

    /**
     * Use lifecycle event hooks to specify a Lambda function that CodeDeploy can call to validate a
     * deployment.
     *
     * You can use the same function or a different one for deployment lifecycle events.
     * Following completion of the validation tests,
     * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
     * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
     *
     * Default: - no lifecycle event hooks
     */
    override fun lifecycleEventHooks(): CfnCodeDeployBlueGreenLifecycleEventHooks? =
        unwrap(this).getLifecycleEventHooks()?.let(CfnCodeDeployBlueGreenLifecycleEventHooks::wrap)

    /**
     * The IAM Role for CloudFormation to use to perform blue-green deployments.
     */
    override fun serviceRole(): String = unwrap(this).getServiceRole()

    /**
     * Traffic routing configuration settings.
     *
     * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
     * bake time
     */
    override fun trafficRoutingConfig(): CfnTrafficRoutingConfig? =
        unwrap(this).getTrafficRoutingConfig()?.let(CfnTrafficRoutingConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeDeployBlueGreenHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps):
        CfnCodeDeployBlueGreenHookProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenHookProps):
        software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps
  }
}
