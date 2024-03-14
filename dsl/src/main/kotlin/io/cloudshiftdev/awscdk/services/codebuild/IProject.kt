package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleSource
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IProject : IResource, IGrantable, IConnectable, INotificationRuleSource {
  /**
   * @param policyStatement 
   */
  public fun addToRolePolicy(policyStatement: PolicyStatement)

  /**
   * @param policyStatement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public fun addToRolePolicy(policyStatement: PolicyStatement.Builder.() -> Unit)

  /**
   * Enable batch builds.
   *
   * Returns an object contining the batch service role if batch builds
   * could be enabled.
   */
  public fun enableBatchBuilds(): BatchBuildConfig?

  /**
   * @return a CloudWatch metric associated with this build project.
   * @param metricName The name of the metric. 
   * @param props Customization properties.
   */
  public fun metric(metricName: String): Metric

  /**
   * @return a CloudWatch metric associated with this build project.
   * @param metricName The name of the metric. 
   * @param props Customization properties.
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * @return a CloudWatch metric associated with this build project.
   * @param metricName The name of the metric. 
   * @param props Customization properties.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Measures the number of builds triggered.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricBuilds(): Metric

  /**
   * Measures the number of builds triggered.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricBuilds(props: MetricOptions): Metric

  /**
   * Measures the number of builds triggered.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be10b6ea6c0312aa2056fab98132d61a6bb7f2dc075bb9c159310319b5df338e")
  public fun metricBuilds(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Measures the duration of all builds over time.
   *
   * Units: Seconds
   *
   * Valid CloudWatch statistics: Average (recommended), Maximum, Minimum
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public fun metricDuration(): Metric

  /**
   * Measures the duration of all builds over time.
   *
   * Units: Seconds
   *
   * Valid CloudWatch statistics: Average (recommended), Maximum, Minimum
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public fun metricDuration(props: MetricOptions): Metric

  /**
   * Measures the duration of all builds over time.
   *
   * Units: Seconds
   *
   * Valid CloudWatch statistics: Average (recommended), Maximum, Minimum
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Measures the number of builds that failed because of client error or because of a timeout.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricFailedBuilds(): Metric

  /**
   * Measures the number of builds that failed because of client error or because of a timeout.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricFailedBuilds(props: MetricOptions): Metric

  /**
   * Measures the number of builds that failed because of client error or because of a timeout.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e76329c1f6088e6d3db1035e1618128c61f1efede7ac90f5da71b7dca18bc61d")
  public fun metricFailedBuilds(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Measures the number of successful builds.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricSucceededBuilds(): Metric

  /**
   * Measures the number of successful builds.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricSucceededBuilds(props: MetricOptions): Metric

  /**
   * Measures the number of successful builds.
   *
   * Units: Count
   *
   * Valid CloudWatch statistics: Sum
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9982ac7260f7a0b08fc3b8a431301c15086dcfa3a3f2a592651ec53b4756f34")
  public fun metricSucceededBuilds(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Defines a CodeStar Notification rule triggered when the project events emitted by you
   * specified, it very similar to `onEvent` API.
   *
   * You can also use the methods `notifyOnBuildSucceeded` and
   * `notifyOnBuildFailed` to define rules for these specific event emitted.
   *
   * @return CodeStar Notifications rule associated with this build project.
   * @param id The logical identifier of the CodeStar Notifications rule that will be created. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Customization options for CodeStar Notifications rule. 
   */
  public fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: ProjectNotifyOnOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule triggered when the project events emitted by you
   * specified, it very similar to `onEvent` API.
   *
   * You can also use the methods `notifyOnBuildSucceeded` and
   * `notifyOnBuildFailed` to define rules for these specific event emitted.
   *
   * @return CodeStar Notifications rule associated with this build project.
   * @param id The logical identifier of the CodeStar Notifications rule that will be created. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Customization options for CodeStar Notifications rule. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a64b4355535857ef9549fdd8b1fdd8cf1ffb2fc8fc660b30df90f6f6c101ac2d")
  public fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: ProjectNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar notification rule which triggers when a build fails.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnBuildFailed(id: String, target: INotificationRuleTarget): INotificationRule

  /**
   * Defines a CodeStar notification rule which triggers when a build fails.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnBuildFailed(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar notification rule which triggers when a build fails.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfc453d6402a1247b2eee388a54403513410e804dcd398d8c2b349e3aad48ed0")
  public fun notifyOnBuildFailed(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar notification rule which triggers when a build completes successfully.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnBuildSucceeded(id: String, target: INotificationRuleTarget): INotificationRule

  /**
   * Defines a CodeStar notification rule which triggers when a build completes successfully.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnBuildSucceeded(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar notification rule which triggers when a build completes successfully.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29432c1bcd6aca19ee5dbbee1f0cf9b75b47bff27ca14f76948d4a6b591c1576")
  public fun notifyOnBuildSucceeded(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines an event rule which triggers when a build fails.
   *
   * @param id 
   * @param options
   */
  public fun onBuildFailed(id: String): Rule

  /**
   * Defines an event rule which triggers when a build fails.
   *
   * @param id 
   * @param options
   */
  public fun onBuildFailed(id: String, options: OnEventOptions): Rule

  /**
   * Defines an event rule which triggers when a build fails.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61bac02e7e7dfb811fb89b743d00a7ce9b4f450f7ba7a759ae905840cae795d8")
  public fun onBuildFailed(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines an event rule which triggers when a build starts.
   *
   * @param id 
   * @param options
   */
  public fun onBuildStarted(id: String): Rule

  /**
   * Defines an event rule which triggers when a build starts.
   *
   * @param id 
   * @param options
   */
  public fun onBuildStarted(id: String, options: OnEventOptions): Rule

  /**
   * Defines an event rule which triggers when a build starts.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aa5fd6f3f4fd4c47805120e788079e181682a7808351afdd3a7512094b1f2bca")
  public fun onBuildStarted(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines an event rule which triggers when a build completes successfully.
   *
   * @param id 
   * @param options
   */
  public fun onBuildSucceeded(id: String): Rule

  /**
   * Defines an event rule which triggers when a build completes successfully.
   *
   * @param id 
   * @param options
   */
  public fun onBuildSucceeded(id: String, options: OnEventOptions): Rule

  /**
   * Defines an event rule which triggers when a build completes successfully.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd12eb763bd8f9c97276262cd553c838b005c5207d64b8cfc38b391db01daf8f")
  public fun onBuildSucceeded(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule triggered when something happens with this project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public fun onEvent(id: String): Rule

  /**
   * Defines a CloudWatch event rule triggered when something happens with this project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public fun onEvent(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule triggered when something happens with this project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule that triggers upon phase change of this build project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public fun onPhaseChange(id: String): Rule

  /**
   * Defines a CloudWatch event rule that triggers upon phase change of this build project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public fun onPhaseChange(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule that triggers upon phase change of this build project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04a8a72e3fcbce6b30b4b5a2f8593dbdb3bce672a2f8532868248c61c9aa1473")
  public fun onPhaseChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule triggered when the build project state changes.
   *
   * You can filter specific build status events using an event
   * pattern filter on the `build-status` detail field:
   *
   * const rule = project.onStateChange('OnBuildStarted', { target });
   * rule.addEventPattern({
   * detail: {
   * 'build-status': [
   * "IN_PROGRESS",
   * "SUCCEEDED",
   * "FAILED",
   * "STOPPED"
   * ]
   * }
   * });
   *
   * You can also use the methods `onBuildFailed` and `onBuildSucceeded` to define rules for
   * these specific state changes.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public fun onStateChange(id: String): Rule

  /**
   * Defines a CloudWatch event rule triggered when the build project state changes.
   *
   * You can filter specific build status events using an event
   * pattern filter on the `build-status` detail field:
   *
   * const rule = project.onStateChange('OnBuildStarted', { target });
   * rule.addEventPattern({
   * detail: {
   * 'build-status': [
   * "IN_PROGRESS",
   * "SUCCEEDED",
   * "FAILED",
   * "STOPPED"
   * ]
   * }
   * });
   *
   * You can also use the methods `onBuildFailed` and `onBuildSucceeded` to define rules for
   * these specific state changes.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public fun onStateChange(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule triggered when the build project state changes.
   *
   * You can filter specific build status events using an event
   * pattern filter on the `build-status` detail field:
   *
   * const rule = project.onStateChange('OnBuildStarted', { target });
   * rule.addEventPattern({
   * detail: {
   * 'build-status': [
   * "IN_PROGRESS",
   * "SUCCEEDED",
   * "FAILED",
   * "STOPPED"
   * ]
   * }
   * });
   *
   * You can also use the methods `onBuildFailed` and `onBuildSucceeded` to define rules for
   * these specific state changes.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * The ARN of this Project.
   */
  public fun projectArn(): String

  /**
   * The human-visible name of this Project.
   */
  public fun projectName(): String

  /**
   * The IAM service Role of this Project.
   *
   * Undefined for imported Projects.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.IProject,
  ) : CdkObject(cdkObject), IProject {
    /**
     * @param policyStatement 
     */
    override fun addToRolePolicy(policyStatement: PolicyStatement) {
      unwrap(this).addToRolePolicy(policyStatement.let(PolicyStatement::unwrap))
    }

    /**
     * @param policyStatement 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
    override fun addToRolePolicy(policyStatement: PolicyStatement.Builder.() -> Unit): Unit =
        addToRolePolicy(PolicyStatement(policyStatement))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * Returns a source configuration for notification rule.
     *
     * @param scope 
     */
    override fun bindAsNotificationRuleSource(scope: Construct): NotificationRuleSourceConfig =
        unwrap(this).bindAsNotificationRuleSource(scope.let(Construct::unwrap)).let(NotificationRuleSourceConfig::wrap)

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * Enable batch builds.
     *
     * Returns an object contining the batch service role if batch builds
     * could be enabled.
     */
    override fun enableBatchBuilds(): BatchBuildConfig? =
        unwrap(this).enableBatchBuilds()?.let(BatchBuildConfig::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /**
     * @return a CloudWatch metric associated with this build project.
     * @param metricName The name of the metric. 
     * @param props Customization properties.
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * @return a CloudWatch metric associated with this build project.
     * @param metricName The name of the metric. 
     * @param props Customization properties.
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * @return a CloudWatch metric associated with this build project.
     * @param metricName The name of the metric. 
     * @param props Customization properties.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * Measures the number of builds triggered.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    override fun metricBuilds(): Metric = unwrap(this).metricBuilds().let(Metric::wrap)

    /**
     * Measures the number of builds triggered.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    override fun metricBuilds(props: MetricOptions): Metric =
        unwrap(this).metricBuilds(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Measures the number of builds triggered.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be10b6ea6c0312aa2056fab98132d61a6bb7f2dc075bb9c159310319b5df338e")
    override fun metricBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
        metricBuilds(MetricOptions(props))

    /**
     * Measures the duration of all builds over time.
     *
     * Units: Seconds
     *
     * Valid CloudWatch statistics: Average (recommended), Maximum, Minimum
     *
     * Default: average over 5 minutes
     *
     * @param props
     */
    override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

    /**
     * Measures the duration of all builds over time.
     *
     * Units: Seconds
     *
     * Valid CloudWatch statistics: Average (recommended), Maximum, Minimum
     *
     * Default: average over 5 minutes
     *
     * @param props
     */
    override fun metricDuration(props: MetricOptions): Metric =
        unwrap(this).metricDuration(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Measures the duration of all builds over time.
     *
     * Units: Seconds
     *
     * Valid CloudWatch statistics: Average (recommended), Maximum, Minimum
     *
     * Default: average over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
    override fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDuration(MetricOptions(props))

    /**
     * Measures the number of builds that failed because of client error or because of a timeout.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    override fun metricFailedBuilds(): Metric = unwrap(this).metricFailedBuilds().let(Metric::wrap)

    /**
     * Measures the number of builds that failed because of client error or because of a timeout.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    override fun metricFailedBuilds(props: MetricOptions): Metric =
        unwrap(this).metricFailedBuilds(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Measures the number of builds that failed because of client error or because of a timeout.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e76329c1f6088e6d3db1035e1618128c61f1efede7ac90f5da71b7dca18bc61d")
    override fun metricFailedBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFailedBuilds(MetricOptions(props))

    /**
     * Measures the number of successful builds.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    override fun metricSucceededBuilds(): Metric =
        unwrap(this).metricSucceededBuilds().let(Metric::wrap)

    /**
     * Measures the number of successful builds.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    override fun metricSucceededBuilds(props: MetricOptions): Metric =
        unwrap(this).metricSucceededBuilds(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Measures the number of successful builds.
     *
     * Units: Count
     *
     * Valid CloudWatch statistics: Sum
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9982ac7260f7a0b08fc3b8a431301c15086dcfa3a3f2a592651ec53b4756f34")
    override fun metricSucceededBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSucceededBuilds(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Defines a CodeStar Notification rule triggered when the project events emitted by you
     * specified, it very similar to `onEvent` API.
     *
     * You can also use the methods `notifyOnBuildSucceeded` and
     * `notifyOnBuildFailed` to define rules for these specific event emitted.
     *
     * @return CodeStar Notifications rule associated with this build project.
     * @param id The logical identifier of the CodeStar Notifications rule that will be created. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Customization options for CodeStar Notifications rule. 
     */
    override fun notifyOn(
      id: String,
      target: INotificationRuleTarget,
      options: ProjectNotifyOnOptions,
    ): INotificationRule = unwrap(this).notifyOn(id, target.let(INotificationRuleTarget::unwrap),
        options.let(ProjectNotifyOnOptions::unwrap)).let(INotificationRule::wrap)

    /**
     * Defines a CodeStar Notification rule triggered when the project events emitted by you
     * specified, it very similar to `onEvent` API.
     *
     * You can also use the methods `notifyOnBuildSucceeded` and
     * `notifyOnBuildFailed` to define rules for these specific event emitted.
     *
     * @return CodeStar Notifications rule associated with this build project.
     * @param id The logical identifier of the CodeStar Notifications rule that will be created. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Customization options for CodeStar Notifications rule. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a64b4355535857ef9549fdd8b1fdd8cf1ffb2fc8fc660b30df90f6f6c101ac2d")
    override fun notifyOn(
      id: String,
      target: INotificationRuleTarget,
      options: ProjectNotifyOnOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOn(id, target, ProjectNotifyOnOptions(options))

    /**
     * Defines a CodeStar notification rule which triggers when a build fails.
     *
     * @param id 
     * @param target 
     * @param options
     */
    override fun notifyOnBuildFailed(id: String, target: INotificationRuleTarget): INotificationRule
        = unwrap(this).notifyOnBuildFailed(id,
        target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    /**
     * Defines a CodeStar notification rule which triggers when a build fails.
     *
     * @param id 
     * @param target 
     * @param options
     */
    override fun notifyOnBuildFailed(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnBuildFailed(id,
        target.let(INotificationRuleTarget::unwrap),
        options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    /**
     * Defines a CodeStar notification rule which triggers when a build fails.
     *
     * @param id 
     * @param target 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfc453d6402a1247b2eee388a54403513410e804dcd398d8c2b349e3aad48ed0")
    override fun notifyOnBuildFailed(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnBuildFailed(id, target, NotificationRuleOptions(options))

    /**
     * Defines a CodeStar notification rule which triggers when a build completes successfully.
     *
     * @param id 
     * @param target 
     * @param options
     */
    override fun notifyOnBuildSucceeded(id: String, target: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnBuildSucceeded(id,
        target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    /**
     * Defines a CodeStar notification rule which triggers when a build completes successfully.
     *
     * @param id 
     * @param target 
     * @param options
     */
    override fun notifyOnBuildSucceeded(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnBuildSucceeded(id,
        target.let(INotificationRuleTarget::unwrap),
        options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    /**
     * Defines a CodeStar notification rule which triggers when a build completes successfully.
     *
     * @param id 
     * @param target 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29432c1bcd6aca19ee5dbbee1f0cf9b75b47bff27ca14f76948d4a6b591c1576")
    override fun notifyOnBuildSucceeded(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnBuildSucceeded(id, target, NotificationRuleOptions(options))

    /**
     * Defines an event rule which triggers when a build fails.
     *
     * @param id 
     * @param options
     */
    override fun onBuildFailed(id: String): Rule = unwrap(this).onBuildFailed(id).let(Rule::wrap)

    /**
     * Defines an event rule which triggers when a build fails.
     *
     * @param id 
     * @param options
     */
    override fun onBuildFailed(id: String, options: OnEventOptions): Rule =
        unwrap(this).onBuildFailed(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines an event rule which triggers when a build fails.
     *
     * @param id 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61bac02e7e7dfb811fb89b743d00a7ce9b4f450f7ba7a759ae905840cae795d8")
    override fun onBuildFailed(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onBuildFailed(id, OnEventOptions(options))

    /**
     * Defines an event rule which triggers when a build starts.
     *
     * @param id 
     * @param options
     */
    override fun onBuildStarted(id: String): Rule = unwrap(this).onBuildStarted(id).let(Rule::wrap)

    /**
     * Defines an event rule which triggers when a build starts.
     *
     * @param id 
     * @param options
     */
    override fun onBuildStarted(id: String, options: OnEventOptions): Rule =
        unwrap(this).onBuildStarted(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines an event rule which triggers when a build starts.
     *
     * @param id 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa5fd6f3f4fd4c47805120e788079e181682a7808351afdd3a7512094b1f2bca")
    override fun onBuildStarted(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onBuildStarted(id, OnEventOptions(options))

    /**
     * Defines an event rule which triggers when a build completes successfully.
     *
     * @param id 
     * @param options
     */
    override fun onBuildSucceeded(id: String): Rule =
        unwrap(this).onBuildSucceeded(id).let(Rule::wrap)

    /**
     * Defines an event rule which triggers when a build completes successfully.
     *
     * @param id 
     * @param options
     */
    override fun onBuildSucceeded(id: String, options: OnEventOptions): Rule =
        unwrap(this).onBuildSucceeded(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines an event rule which triggers when a build completes successfully.
     *
     * @param id 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd12eb763bd8f9c97276262cd553c838b005c5207d64b8cfc38b391db01daf8f")
    override fun onBuildSucceeded(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onBuildSucceeded(id, OnEventOptions(options))

    /**
     * Defines a CloudWatch event rule triggered when something happens with this project.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule triggered when something happens with this project.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
        options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule triggered when something happens with this project.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule = onEvent(id,
        OnEventOptions(options))

    /**
     * Defines a CloudWatch event rule that triggers upon phase change of this build project.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    override fun onPhaseChange(id: String): Rule = unwrap(this).onPhaseChange(id).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule that triggers upon phase change of this build project.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    override fun onPhaseChange(id: String, options: OnEventOptions): Rule =
        unwrap(this).onPhaseChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule that triggers upon phase change of this build project.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04a8a72e3fcbce6b30b4b5a2f8593dbdb3bce672a2f8532868248c61c9aa1473")
    override fun onPhaseChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onPhaseChange(id, OnEventOptions(options))

    /**
     * Defines a CloudWatch event rule triggered when the build project state changes.
     *
     * You can filter specific build status events using an event
     * pattern filter on the `build-status` detail field:
     *
     * const rule = project.onStateChange('OnBuildStarted', { target });
     * rule.addEventPattern({
     * detail: {
     * 'build-status': [
     * "IN_PROGRESS",
     * "SUCCEEDED",
     * "FAILED",
     * "STOPPED"
     * ]
     * }
     * });
     *
     * You can also use the methods `onBuildFailed` and `onBuildSucceeded` to define rules for
     * these specific state changes.
     *
     * To access fields from the event in the event target input,
     * use the static fields on the `StateChangeEvent` class.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    override fun onStateChange(id: String): Rule = unwrap(this).onStateChange(id).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule triggered when the build project state changes.
     *
     * You can filter specific build status events using an event
     * pattern filter on the `build-status` detail field:
     *
     * const rule = project.onStateChange('OnBuildStarted', { target });
     * rule.addEventPattern({
     * detail: {
     * 'build-status': [
     * "IN_PROGRESS",
     * "SUCCEEDED",
     * "FAILED",
     * "STOPPED"
     * ]
     * }
     * });
     *
     * You can also use the methods `onBuildFailed` and `onBuildSucceeded` to define rules for
     * these specific state changes.
     *
     * To access fields from the event in the event target input,
     * use the static fields on the `StateChangeEvent` class.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    override fun onStateChange(id: String, options: OnEventOptions): Rule =
        unwrap(this).onStateChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule triggered when the build project state changes.
     *
     * You can filter specific build status events using an event
     * pattern filter on the `build-status` detail field:
     *
     * const rule = project.onStateChange('OnBuildStarted', { target });
     * rule.addEventPattern({
     * detail: {
     * 'build-status': [
     * "IN_PROGRESS",
     * "SUCCEEDED",
     * "FAILED",
     * "STOPPED"
     * ]
     * }
     * });
     *
     * You can also use the methods `onBuildFailed` and `onBuildSucceeded` to define rules for
     * these specific state changes.
     *
     * To access fields from the event in the event target input,
     * use the static fields on the `StateChangeEvent` class.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
     * @param id 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
    override fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onStateChange(id, OnEventOptions(options))

    /**
     * The ARN of this Project.
     */
    override fun projectArn(): String = unwrap(this).getProjectArn()

    /**
     * The human-visible name of this Project.
     */
    override fun projectName(): String = unwrap(this).getProjectName()

    /**
     * The IAM service Role of this Project.
     *
     * Undefined for imported Projects.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IProject): IProject =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IProject): software.amazon.awscdk.services.codebuild.IProject =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IProject
  }
}
