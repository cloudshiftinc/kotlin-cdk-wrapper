@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
import software.amazon.awscdk.services.codedeploy.ILambdaApplication
import software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Construction properties for `LambdaDeploymentGroup`.
 *
 * Example:
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
@CdkDslMarker
public class LambdaDeploymentGroupPropsDsl {
    private val cdkBuilder: LambdaDeploymentGroupProps.Builder =
        LambdaDeploymentGroupProps.builder()

    private val _alarms: MutableList<IAlarm> = mutableListOf()

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group. CodeDeploy will
     *   stop (and optionally roll back) a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(vararg alarms: IAlarm) {
        _alarms.addAll(listOf(*alarms))
    }

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group. CodeDeploy will
     *   stop (and optionally roll back) a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(alarms: Collection<IAlarm>) {
        _alarms.addAll(alarms)
    }

    /**
     * @param alias Lambda Alias to shift traffic. Updating the version of the alias will trigger a
     *   CodeDeploy deployment. [disable-awslint:ref-via-interface] since we need to modify the
     *   alias CFN resource update policy
     */
    public fun alias(alias: Alias) {
        cdkBuilder.alias(alias)
    }

    /**
     * @param application The reference to the CodeDeploy Lambda Application that this Deployment
     *   Group belongs to.
     */
    public fun application(application: ILambdaApplication) {
        cdkBuilder.application(application)
    }

    /** @param autoRollback The auto-rollback configuration for this Deployment Group. */
    public fun autoRollback(autoRollback: AutoRollbackConfigDsl.() -> Unit = {}) {
        val builder = AutoRollbackConfigDsl()
        builder.apply(autoRollback)
        cdkBuilder.autoRollback(builder.build())
    }

    /** @param autoRollback The auto-rollback configuration for this Deployment Group. */
    public fun autoRollback(autoRollback: AutoRollbackConfig) {
        cdkBuilder.autoRollback(autoRollback)
    }

    /** @param deploymentConfig The Deployment Configuration this Deployment Group uses. */
    public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     *   Group.
     */
    public fun deploymentGroupName(deploymentGroupName: String) {
        cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     *   status from CloudWatch failed.
     */
    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
        cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    /** @param postHook The Lambda function to run after traffic routing starts. */
    public fun postHook(postHook: IFunction) {
        cdkBuilder.postHook(postHook)
    }

    /** @param preHook The Lambda function to run before traffic routing starts. */
    public fun preHook(preHook: IFunction) {
        cdkBuilder.preHook(preHook)
    }

    /** @param role The service Role of this Deployment Group. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): LambdaDeploymentGroupProps {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        return cdkBuilder.build()
    }
}
