@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CloudFormation Hook for CodeDeploy blue-green ECS deployments.
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate;
 * // mutating the hook
 * Role myRole;
 * CfnHook hook = cfnTemplate.getHook("MyOutput");
 * CfnCodeDeployBlueGreenHook codeDeployHook = (CfnCodeDeployBlueGreenHook)hook;
 * codeDeployHook.getServiceRole() = myRole.getRoleArn();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html#blue-green-template-reference)
 */
public open class CfnCodeDeployBlueGreenHook internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenHook,
) : CfnHook(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCodeDeployBlueGreenHookProps,
  ) :
      this(software.amazon.awscdk.CfnCodeDeployBlueGreenHook(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCodeDeployBlueGreenHookProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCodeDeployBlueGreenHookProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCodeDeployBlueGreenHookProps(props)
  )

  /**
   * Additional options for the blue/green deployment.
   *
   * Default: - no additional options
   */
  public open fun additionalOptions(): CfnCodeDeployBlueGreenAdditionalOptions? =
      unwrap(this).getAdditionalOptions()?.let(CfnCodeDeployBlueGreenAdditionalOptions::wrap)

  /**
   * Additional options for the blue/green deployment.
   *
   * Default: - no additional options
   */
  public open fun additionalOptions(`value`: CfnCodeDeployBlueGreenAdditionalOptions) {
    unwrap(this).setAdditionalOptions(`value`.let(CfnCodeDeployBlueGreenAdditionalOptions::unwrap))
  }

  /**
   * Additional options for the blue/green deployment.
   *
   * Default: - no additional options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51269bf776d795345066a2d1089e48ffdd80ff6456dcbb4f03ed70bf516a2d25")
  public open
      fun additionalOptions(`value`: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit):
      Unit = additionalOptions(CfnCodeDeployBlueGreenAdditionalOptions(`value`))

  /**
   * Properties of the Amazon ECS applications being deployed.
   */
  public open fun applications(): List<CfnCodeDeployBlueGreenApplication> =
      unwrap(this).getApplications().map(CfnCodeDeployBlueGreenApplication::wrap)

  /**
   * Properties of the Amazon ECS applications being deployed.
   */
  public open fun applications(`value`: List<CfnCodeDeployBlueGreenApplication>) {
    unwrap(this).setApplications(`value`.map(CfnCodeDeployBlueGreenApplication::unwrap))
  }

  /**
   * Properties of the Amazon ECS applications being deployed.
   */
  public open fun applications(vararg `value`: CfnCodeDeployBlueGreenApplication): Unit =
      applications(`value`.toList())

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
  public open fun lifecycleEventHooks(): CfnCodeDeployBlueGreenLifecycleEventHooks? =
      unwrap(this).getLifecycleEventHooks()?.let(CfnCodeDeployBlueGreenLifecycleEventHooks::wrap)

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
  public open fun lifecycleEventHooks(`value`: CfnCodeDeployBlueGreenLifecycleEventHooks) {
    unwrap(this).setLifecycleEventHooks(`value`.let(CfnCodeDeployBlueGreenLifecycleEventHooks::unwrap))
  }

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e09225660029a1b22f7ba904f5c6d9410a4da9e4e04d128b4b89fc3ba2d129a7")
  public open
      fun lifecycleEventHooks(`value`: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit):
      Unit = lifecycleEventHooks(CfnCodeDeployBlueGreenLifecycleEventHooks(`value`))

  /**
   * The IAM Role for CloudFormation to use to perform blue-green deployments.
   */
  public open fun serviceRole(): String = unwrap(this).getServiceRole()

  /**
   * The IAM Role for CloudFormation to use to perform blue-green deployments.
   */
  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  /**
   * Traffic routing configuration settings.
   *
   * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
   * bake time
   */
  public open fun trafficRoutingConfig(): CfnTrafficRoutingConfig? =
      unwrap(this).getTrafficRoutingConfig()?.let(CfnTrafficRoutingConfig::wrap)

  /**
   * Traffic routing configuration settings.
   *
   * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
   * bake time
   */
  public open fun trafficRoutingConfig(`value`: CfnTrafficRoutingConfig) {
    unwrap(this).setTrafficRoutingConfig(`value`.let(CfnTrafficRoutingConfig::unwrap))
  }

  /**
   * Traffic routing configuration settings.
   *
   * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
   * bake time
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("317837bc71e11a366dde8d80b18e85dd22c3bb45d5f78683a8607315bfd85523")
  public open fun trafficRoutingConfig(`value`: CfnTrafficRoutingConfig.Builder.() -> Unit): Unit =
      trafficRoutingConfig(CfnTrafficRoutingConfig(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnCodeDeployBlueGreenHook].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Additional options for the blue/green deployment.
     *
     * Default: - no additional options
     *
     * @param additionalOptions Additional options for the blue/green deployment. 
     */
    public fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions)

    /**
     * Additional options for the blue/green deployment.
     *
     * Default: - no additional options
     *
     * @param additionalOptions Additional options for the blue/green deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2942ee11ea6a57ebe0c2645198c9fb7a2b6814640b751575ce2816ffb3a970cd")
    public
        fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit)

    /**
     * Properties of the Amazon ECS applications being deployed.
     *
     * @param applications Properties of the Amazon ECS applications being deployed. 
     */
    public fun applications(applications: List<CfnCodeDeployBlueGreenApplication>)

    /**
     * Properties of the Amazon ECS applications being deployed.
     *
     * @param applications Properties of the Amazon ECS applications being deployed. 
     */
    public fun applications(vararg applications: CfnCodeDeployBlueGreenApplication)

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
     *
     * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
     * CodeDeploy can call to validate a deployment. 
     */
    public fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks)

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
     *
     * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
     * CodeDeploy can call to validate a deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35bbc097d9e2b40b18625b08e25f624da081705f1612bef8803388ecfbcaffaf")
    public
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit)

    /**
     * The IAM Role for CloudFormation to use to perform blue-green deployments.
     *
     * @param serviceRole The IAM Role for CloudFormation to use to perform blue-green deployments. 
     */
    public fun serviceRole(serviceRole: String)

    /**
     * Traffic routing configuration settings.
     *
     * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
     * bake time
     *
     * @param trafficRoutingConfig Traffic routing configuration settings. 
     */
    public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig)

    /**
     * Traffic routing configuration settings.
     *
     * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
     * bake time
     *
     * @param trafficRoutingConfig Traffic routing configuration settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b8b7a942d34f0b578b07c9f5b5b9cb941a8181809736d58b79a15c1dd7c0e61")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenHook.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenHook.Builder.create(scope, id)

    /**
     * Additional options for the blue/green deployment.
     *
     * Default: - no additional options
     *
     * @param additionalOptions Additional options for the blue/green deployment. 
     */
    override fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions) {
      cdkBuilder.additionalOptions(additionalOptions.let(CfnCodeDeployBlueGreenAdditionalOptions::unwrap))
    }

    /**
     * Additional options for the blue/green deployment.
     *
     * Default: - no additional options
     *
     * @param additionalOptions Additional options for the blue/green deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2942ee11ea6a57ebe0c2645198c9fb7a2b6814640b751575ce2816ffb3a970cd")
    override
        fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit):
        Unit = additionalOptions(CfnCodeDeployBlueGreenAdditionalOptions(additionalOptions))

    /**
     * Properties of the Amazon ECS applications being deployed.
     *
     * @param applications Properties of the Amazon ECS applications being deployed. 
     */
    override fun applications(applications: List<CfnCodeDeployBlueGreenApplication>) {
      cdkBuilder.applications(applications.map(CfnCodeDeployBlueGreenApplication::unwrap))
    }

    /**
     * Properties of the Amazon ECS applications being deployed.
     *
     * @param applications Properties of the Amazon ECS applications being deployed. 
     */
    override fun applications(vararg applications: CfnCodeDeployBlueGreenApplication): Unit =
        applications(applications.toList())

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
     *
     * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
     * CodeDeploy can call to validate a deployment. 
     */
    override
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks) {
      cdkBuilder.lifecycleEventHooks(lifecycleEventHooks.let(CfnCodeDeployBlueGreenLifecycleEventHooks::unwrap))
    }

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
     *
     * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
     * CodeDeploy can call to validate a deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35bbc097d9e2b40b18625b08e25f624da081705f1612bef8803388ecfbcaffaf")
    override
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit):
        Unit = lifecycleEventHooks(CfnCodeDeployBlueGreenLifecycleEventHooks(lifecycleEventHooks))

    /**
     * The IAM Role for CloudFormation to use to perform blue-green deployments.
     *
     * @param serviceRole The IAM Role for CloudFormation to use to perform blue-green deployments. 
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * Traffic routing configuration settings.
     *
     * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
     * bake time
     *
     * @param trafficRoutingConfig Traffic routing configuration settings. 
     */
    override fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(CfnTrafficRoutingConfig::unwrap))
    }

    /**
     * Traffic routing configuration settings.
     *
     * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
     * bake time
     *
     * @param trafficRoutingConfig Traffic routing configuration settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b8b7a942d34f0b578b07c9f5b5b9cb941a8181809736d58b79a15c1dd7c0e61")
    override
        fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig.Builder.() -> Unit):
        Unit = trafficRoutingConfig(CfnTrafficRoutingConfig(trafficRoutingConfig))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenHook = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCodeDeployBlueGreenHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCodeDeployBlueGreenHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenHook):
        CfnCodeDeployBlueGreenHook = CfnCodeDeployBlueGreenHook(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenHook):
        software.amazon.awscdk.CfnCodeDeployBlueGreenHook = wrapped.cdkObject
  }
}
