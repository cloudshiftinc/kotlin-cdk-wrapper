@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.Alias
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Construction properties for `LambdaDeploymentGroup`.
 *
 * Example:
 *
 * ```
 * LambdaApplication myApplication;
 * Function func;
 * Version version = func.getCurrentVersion();
 * Alias version1Alias = Alias.Builder.create(this, "alias")
 * .aliasName("prod")
 * .version(version)
 * .build();
 * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
 * "BlueGreenDeployment")
 * .application(myApplication) // optional property: one will be created for you if not provided
 * .alias(version1Alias)
 * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
 * .build();
 * ```
 */
public interface LambdaDeploymentGroupProps {
  /**
   * The CloudWatch alarms associated with this Deployment Group.
   *
   * CodeDeploy will stop (and optionally roll back)
   * a deployment if during it any of the alarms trigger.
   *
   * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
   *
   * Default: []
   *
   * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
   */
  public fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

  /**
   * Lambda Alias to shift traffic. Updating the version of the alias will trigger a CodeDeploy
   * deployment.
   *
   * [disable-awslint:ref-via-interface] since we need to modify the alias CFN resource update
   * policy
   */
  public fun alias(): Alias

  /**
   * The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to.
   *
   * Default: - One will be created for you.
   */
  public fun application(): ILambdaApplication? =
      unwrap(this).getApplication()?.let(ILambdaApplication::wrap)

  /**
   * The auto-rollback configuration for this Deployment Group.
   *
   * Default: - default AutoRollbackConfig.
   */
  public fun autoRollback(): AutoRollbackConfig? =
      unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

  /**
   * The Deployment Configuration this Deployment Group uses.
   *
   * Default: LambdaDeploymentConfig.CANARY_10PERCENT_5MINUTES
   */
  public fun deploymentConfig(): ILambdaDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(ILambdaDeploymentConfig::wrap)

  /**
   * The physical, human-readable name of the CodeDeploy Deployment Group.
   *
   * Default: - An auto-generated name will be used.
   */
  public fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  /**
   * Whether to skip the step of checking CloudWatch alarms during the deployment process.
   *
   * Default: - false
   */
  public fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

  /**
   * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
   *
   * Default: false
   */
  public fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

  /**
   * The Lambda function to run after traffic routing starts.
   *
   * Default: - None.
   */
  public fun postHook(): IFunction? = unwrap(this).getPostHook()?.let(IFunction::wrap)

  /**
   * The Lambda function to run before traffic routing starts.
   *
   * Default: - None.
   */
  public fun preHook(): IFunction? = unwrap(this).getPreHook()?.let(IFunction::wrap)

  /**
   * The service Role of this Deployment Group.
   *
   * Default: - A new Role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [LambdaDeploymentGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(alarms: List<IAlarm>)

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(vararg alarms: IAlarm)

    /**
     * @param alias Lambda Alias to shift traffic. Updating the version of the alias will trigger a
     * CodeDeploy deployment. 
     * [disable-awslint:ref-via-interface] since we need to modify the alias CFN resource update
     * policy
     */
    public fun alias(alias: Alias)

    /**
     * @param application The reference to the CodeDeploy Lambda Application that this Deployment
     * Group belongs to.
     */
    public fun application(application: ILambdaApplication)

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    public fun autoRollback(autoRollback: AutoRollbackConfig)

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e92422702b869d68af2098de02b3d9ca5ef912330c758253bdeb193c9cf92d03")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig)

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group.
     */
    public fun deploymentGroupName(deploymentGroupName: String)

    /**
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process.
     */
    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    /**
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed.
     */
    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    /**
     * @param postHook The Lambda function to run after traffic routing starts.
     */
    public fun postHook(postHook: IFunction)

    /**
     * @param preHook The Lambda function to run before traffic routing starts.
     */
    public fun preHook(preHook: IFunction)

    /**
     * @param role The service Role of this Deployment Group.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps.builder()

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
    }

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    /**
     * @param alias Lambda Alias to shift traffic. Updating the version of the alias will trigger a
     * CodeDeploy deployment. 
     * [disable-awslint:ref-via-interface] since we need to modify the alias CFN resource update
     * policy
     */
    override fun alias(alias: Alias) {
      cdkBuilder.alias(alias.let(Alias::unwrap))
    }

    /**
     * @param application The reference to the CodeDeploy Lambda Application that this Deployment
     * Group belongs to.
     */
    override fun application(application: ILambdaApplication) {
      cdkBuilder.application(application.let(ILambdaApplication::unwrap))
    }

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
    }

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e92422702b869d68af2098de02b3d9ca5ef912330c758253bdeb193c9cf92d03")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    override fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(ILambdaDeploymentConfig::unwrap))
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group.
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process.
     */
    override fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
      cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
    }

    /**
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed.
     */
    override fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
      cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    /**
     * @param postHook The Lambda function to run after traffic routing starts.
     */
    override fun postHook(postHook: IFunction) {
      cdkBuilder.postHook(postHook.let(IFunction::unwrap))
    }

    /**
     * @param preHook The Lambda function to run before traffic routing starts.
     */
    override fun preHook(preHook: IFunction) {
      cdkBuilder.preHook(preHook.let(IFunction::unwrap))
    }

    /**
     * @param role The service Role of this Deployment Group.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps,
  ) : CdkObject(cdkObject), LambdaDeploymentGroupProps {
    /**
     * The CloudWatch alarms associated with this Deployment Group.
     *
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     *
     * Default: []
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
     */
    override fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

    /**
     * Lambda Alias to shift traffic. Updating the version of the alias will trigger a CodeDeploy
     * deployment.
     *
     * [disable-awslint:ref-via-interface] since we need to modify the alias CFN resource update
     * policy
     */
    override fun alias(): Alias = unwrap(this).getAlias().let(Alias::wrap)

    /**
     * The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to.
     *
     * Default: - One will be created for you.
     */
    override fun application(): ILambdaApplication? =
        unwrap(this).getApplication()?.let(ILambdaApplication::wrap)

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     */
    override fun autoRollback(): AutoRollbackConfig? =
        unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

    /**
     * The Deployment Configuration this Deployment Group uses.
     *
     * Default: LambdaDeploymentConfig.CANARY_10PERCENT_5MINUTES
     */
    override fun deploymentConfig(): ILambdaDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(ILambdaDeploymentConfig::wrap)

    /**
     * The physical, human-readable name of the CodeDeploy Deployment Group.
     *
     * Default: - An auto-generated name will be used.
     */
    override fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

    /**
     * Whether to skip the step of checking CloudWatch alarms during the deployment process.
     *
     * Default: - false
     */
    override fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

    /**
     * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
     *
     * Default: false
     */
    override fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

    /**
     * The Lambda function to run after traffic routing starts.
     *
     * Default: - None.
     */
    override fun postHook(): IFunction? = unwrap(this).getPostHook()?.let(IFunction::wrap)

    /**
     * The Lambda function to run before traffic routing starts.
     *
     * Default: - None.
     */
    override fun preHook(): IFunction? = unwrap(this).getPreHook()?.let(IFunction::wrap)

    /**
     * The service Role of this Deployment Group.
     *
     * Default: - A new Role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeploymentGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps):
        LambdaDeploymentGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        LambdaDeploymentGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentGroupProps):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
  }
}
