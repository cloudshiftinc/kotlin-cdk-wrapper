package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.Alias
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LambdaDeploymentGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup,
) : Resource(cdkObject), ILambdaDeploymentGroup {
    /**
     * Associates an additional alarm with this Deployment Group.
     *
     * @param alarm the alarm to associate with this Deployment Group.
     */
    public open fun addAlarm(alarm: IAlarm) {
        unwrap(this).addAlarm(alarm.let(IAlarm::unwrap))
    }

    /**
     * Associate a function to run after deployment completes.
     *
     * @param postHook function to run after deployment completes.
     */
    public open fun addPostHook(postHook: IFunction) {
        unwrap(this).addPostHook(postHook.let(IFunction::unwrap))
    }

    /**
     * Associate a function to run before deployment begins.
     *
     * @param preHook function to run before deployment beings.
     */
    public open fun addPreHook(preHook: IFunction) {
        unwrap(this).addPreHook(preHook.let(IFunction::unwrap))
    }

    /** The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to. */
    public override fun application(): ILambdaApplication =
        unwrap(this).getApplication().let(ILambdaApplication::wrap)

    /** The Deployment Configuration this Group uses. */
    public override fun deploymentConfig(): ILambdaDeploymentConfig =
        unwrap(this).getDeploymentConfig().let(ILambdaDeploymentConfig::wrap)

    /** The ARN of the Deployment Group. */
    public override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

    /** The name of the Deployment Group. */
    public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

    /**
     * Grant a principal permission to codedeploy:PutLifecycleEventHookExecutionStatus on this
     * deployment group resource.
     *
     * @param grantee to grant permission to.
     */
    public open fun grantPutLifecycleEventHookExecutionStatus(grantee: IGrantable): Grant =
        unwrap(this)
            .grantPutLifecycleEventHookExecutionStatus(grantee.let(IGrantable::unwrap))
            .let(Grant::wrap)

    /** The service Role of this Deployment Group. */
    public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.LambdaDeploymentGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The CloudWatch alarms associated with this Deployment Group.
         *
         * CodeDeploy will stop (and optionally roll back) a deployment if during it any of the
         * alarms trigger.
         *
         * Alarms can also be added after the Deployment Group is created using the `#addAlarm`
         * method.
         *
         * Default: []
         *
         * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
         *
         * @param alarms The CloudWatch alarms associated with this Deployment Group.
         */
        public fun alarms(alarms: List<IAlarm>)

        /**
         * The CloudWatch alarms associated with this Deployment Group.
         *
         * CodeDeploy will stop (and optionally roll back) a deployment if during it any of the
         * alarms trigger.
         *
         * Alarms can also be added after the Deployment Group is created using the `#addAlarm`
         * method.
         *
         * Default: []
         *
         * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
         *
         * @param alarms The CloudWatch alarms associated with this Deployment Group.
         */
        public fun alarms(vararg alarms: IAlarm)

        /**
         * Lambda Alias to shift traffic. Updating the version of the alias will trigger a
         * CodeDeploy deployment.
         *
         * [disable-awslint:ref-via-interface] since we need to modify the alias CFN resource update
         * policy
         *
         * @param alias Lambda Alias to shift traffic. Updating the version of the alias will
         *   trigger a CodeDeploy deployment.
         */
        public fun alias(alias: Alias)

        /**
         * The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to.
         *
         * Default: - One will be created for you.
         *
         * @param application The reference to the CodeDeploy Lambda Application that this
         *   Deployment Group belongs to.
         */
        public fun application(application: ILambdaApplication)

        /**
         * The auto-rollback configuration for this Deployment Group.
         *
         * Default: - default AutoRollbackConfig.
         *
         * @param autoRollback The auto-rollback configuration for this Deployment Group.
         */
        public fun autoRollback(autoRollback: AutoRollbackConfig)

        /**
         * The auto-rollback configuration for this Deployment Group.
         *
         * Default: - default AutoRollbackConfig.
         *
         * @param autoRollback The auto-rollback configuration for this Deployment Group.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e1a77b4d1556f08e2a1b224b8abae3c73114c1b48b5174e9c5417dda497e6ab0")
        public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

        /**
         * The Deployment Configuration this Deployment Group uses.
         *
         * Default: LambdaDeploymentConfig.CANARY_10PERCENT_5MINUTES
         *
         * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
         */
        public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig)

        /**
         * The physical, human-readable name of the CodeDeploy Deployment Group.
         *
         * Default: - An auto-generated name will be used.
         *
         * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
         *   Group.
         */
        public fun deploymentGroupName(deploymentGroupName: String)

        /**
         * Whether to skip the step of checking CloudWatch alarms during the deployment process.
         *
         * Default: - false
         *
         * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms
         *   during the deployment process.
         */
        public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

        /**
         * Whether to continue a deployment even if fetching the alarm status from CloudWatch
         * failed.
         *
         * Default: false
         *
         * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the
         *   alarm status from CloudWatch failed.
         */
        public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

        /**
         * The Lambda function to run after traffic routing starts.
         *
         * Default: - None.
         *
         * @param postHook The Lambda function to run after traffic routing starts.
         */
        public fun postHook(postHook: IFunction)

        /**
         * The Lambda function to run before traffic routing starts.
         *
         * Default: - None.
         *
         * @param preHook The Lambda function to run before traffic routing starts.
         */
        public fun preHook(preHook: IFunction)

        /**
         * The service Role of this Deployment Group.
         *
         * Default: - A new Role will be created.
         *
         * @param role The service Role of this Deployment Group.
         */
        public fun role(role: IRole)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup.Builder =
            software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup.Builder.create(
                scope,
                id
            )

        /**
         * The CloudWatch alarms associated with this Deployment Group.
         *
         * CodeDeploy will stop (and optionally roll back) a deployment if during it any of the
         * alarms trigger.
         *
         * Alarms can also be added after the Deployment Group is created using the `#addAlarm`
         * method.
         *
         * Default: []
         *
         * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
         *
         * @param alarms The CloudWatch alarms associated with this Deployment Group.
         */
        override fun alarms(alarms: List<IAlarm>) {
            cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
        }

        /**
         * The CloudWatch alarms associated with this Deployment Group.
         *
         * CodeDeploy will stop (and optionally roll back) a deployment if during it any of the
         * alarms trigger.
         *
         * Alarms can also be added after the Deployment Group is created using the `#addAlarm`
         * method.
         *
         * Default: []
         *
         * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
         *
         * @param alarms The CloudWatch alarms associated with this Deployment Group.
         */
        override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

        /**
         * Lambda Alias to shift traffic. Updating the version of the alias will trigger a
         * CodeDeploy deployment.
         *
         * [disable-awslint:ref-via-interface] since we need to modify the alias CFN resource update
         * policy
         *
         * @param alias Lambda Alias to shift traffic. Updating the version of the alias will
         *   trigger a CodeDeploy deployment.
         */
        override fun alias(alias: Alias) {
            cdkBuilder.alias(alias.let(Alias::unwrap))
        }

        /**
         * The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to.
         *
         * Default: - One will be created for you.
         *
         * @param application The reference to the CodeDeploy Lambda Application that this
         *   Deployment Group belongs to.
         */
        override fun application(application: ILambdaApplication) {
            cdkBuilder.application(application.let(ILambdaApplication::unwrap))
        }

        /**
         * The auto-rollback configuration for this Deployment Group.
         *
         * Default: - default AutoRollbackConfig.
         *
         * @param autoRollback The auto-rollback configuration for this Deployment Group.
         */
        override fun autoRollback(autoRollback: AutoRollbackConfig) {
            cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
        }

        /**
         * The auto-rollback configuration for this Deployment Group.
         *
         * Default: - default AutoRollbackConfig.
         *
         * @param autoRollback The auto-rollback configuration for this Deployment Group.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e1a77b4d1556f08e2a1b224b8abae3c73114c1b48b5174e9c5417dda497e6ab0")
        override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
            autoRollback(AutoRollbackConfig(autoRollback))

        /**
         * The Deployment Configuration this Deployment Group uses.
         *
         * Default: LambdaDeploymentConfig.CANARY_10PERCENT_5MINUTES
         *
         * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
         */
        override fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
            cdkBuilder.deploymentConfig(deploymentConfig.let(ILambdaDeploymentConfig::unwrap))
        }

        /**
         * The physical, human-readable name of the CodeDeploy Deployment Group.
         *
         * Default: - An auto-generated name will be used.
         *
         * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
         *   Group.
         */
        override fun deploymentGroupName(deploymentGroupName: String) {
            cdkBuilder.deploymentGroupName(deploymentGroupName)
        }

        /**
         * Whether to skip the step of checking CloudWatch alarms during the deployment process.
         *
         * Default: - false
         *
         * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms
         *   during the deployment process.
         */
        override fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
            cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
        }

        /**
         * Whether to continue a deployment even if fetching the alarm status from CloudWatch
         * failed.
         *
         * Default: false
         *
         * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the
         *   alarm status from CloudWatch failed.
         */
        override fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
            cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
        }

        /**
         * The Lambda function to run after traffic routing starts.
         *
         * Default: - None.
         *
         * @param postHook The Lambda function to run after traffic routing starts.
         */
        override fun postHook(postHook: IFunction) {
            cdkBuilder.postHook(postHook.let(IFunction::unwrap))
        }

        /**
         * The Lambda function to run before traffic routing starts.
         *
         * Default: - None.
         *
         * @param preHook The Lambda function to run before traffic routing starts.
         */
        override fun preHook(preHook: IFunction) {
            cdkBuilder.preHook(preHook.let(IFunction::unwrap))
        }

        /**
         * The service Role of this Deployment Group.
         *
         * Default: - A new Role will be created.
         *
         * @param role The service Role of this Deployment Group.
         */
        override fun role(role: IRole) {
            cdkBuilder.role(role.let(IRole::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromLambdaDeploymentGroupAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: LambdaDeploymentGroupAttributes,
        ): ILambdaDeploymentGroup =
            software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
                .fromLambdaDeploymentGroupAttributes(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    attrs.let(LambdaDeploymentGroupAttributes::unwrap)
                )
                .let(ILambdaDeploymentGroup::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4ea77b497b67174b52d295c255acd7df97982b2c72bd6820660d6ee02f5380f9")
        public fun fromLambdaDeploymentGroupAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: LambdaDeploymentGroupAttributes.Builder.() -> Unit,
        ): ILambdaDeploymentGroup =
            fromLambdaDeploymentGroupAttributes(scope, id, LambdaDeploymentGroupAttributes(attrs))

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): LambdaDeploymentGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return LambdaDeploymentGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
        ): LambdaDeploymentGroup = LambdaDeploymentGroup(cdkObject)

        internal fun unwrap(
            wrapped: LambdaDeploymentGroup
        ): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup = wrapped.cdkObject
    }
}
