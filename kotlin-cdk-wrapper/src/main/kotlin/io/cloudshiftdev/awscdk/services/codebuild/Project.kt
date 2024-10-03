@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A representation of a CodeBuild Project.
 *
 * Example:
 *
 * ```
 * Repository ecrRepository;
 * Project.Builder.create(this, "Project")
 * .environment(BuildEnvironment.builder()
 * .buildImage(WindowsBuildImage.fromEcrRepository(ecrRepository, "v1.0",
 * WindowsImageType.SERVER_2019))
 * // optional certificate to include in the build image
 * .certificate(BuildEnvironmentCertificate.builder()
 * .bucket(Bucket.fromBucketName(this, "Bucket", "my-bucket"))
 * .objectKey("path/to/cert.pem")
 * .build())
 * .build())
 * .build();
 * ```
 */
public open class Project(
  cdkObject: software.amazon.awscdk.services.codebuild.Project,
) : Resource(cdkObject),
    IProject {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ProjectProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.Project(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ProjectProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ProjectProps.Builder.() -> Unit,
  ) : this(scope, id, ProjectProps(props)
  )

  /**
   * Adds a fileSystemLocation to the Project.
   *
   * @param fileSystemLocation the fileSystemLocation to add. 
   */
  public open fun addFileSystemLocation(fileSystemLocation: IFileSystemLocation) {
    unwrap(this).addFileSystemLocation(fileSystemLocation.let(IFileSystemLocation.Companion::unwrap))
  }

  /**
   * Adds a secondary artifact to the Project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
   * @param secondaryArtifact the artifact to add as a secondary artifact. 
   */
  public open fun addSecondaryArtifact(secondaryArtifact: IArtifacts) {
    unwrap(this).addSecondaryArtifact(secondaryArtifact.let(IArtifacts.Companion::unwrap))
  }

  /**
   * Adds a secondary source to the Project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
   * @param secondarySource the source to add as a secondary source. 
   */
  public open fun addSecondarySource(secondarySource: ISource) {
    unwrap(this).addSecondarySource(secondarySource.let(ISource.Companion::unwrap))
  }

  /**
   * Add a permission only if there's a policy attached.
   *
   * @param statement The permissions statement to add. 
   */
  public override fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement.Companion::unwrap))
  }

  /**
   * Add a permission only if there's a policy attached.
   *
   * @param statement The permissions statement to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  /**
   * Returns a source configuration for notification rule.
   *
   * @param _scope 
   */
  public override fun bindAsNotificationRuleSource(scope: CloudshiftdevConstructsConstruct):
      NotificationRuleSourceConfig =
      unwrap(this).bindAsNotificationRuleSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap)).let(NotificationRuleSourceConfig::wrap)

  /**
   * A callback invoked when the given project is added to a CodePipeline.
   *
   * @param _scope the construct the binding is taking place in. 
   * @param options additional options for the binding. 
   */
  public open fun bindToCodePipeline(scope: CloudshiftdevConstructsConstruct,
      options: BindToCodePipelineOptions) {
    unwrap(this).bindToCodePipeline(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        options.let(BindToCodePipelineOptions.Companion::unwrap))
  }

  /**
   * A callback invoked when the given project is added to a CodePipeline.
   *
   * @param _scope the construct the binding is taking place in. 
   * @param options additional options for the binding. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d3776f8844ff84e2cebb59235661bfd8d91aa250665890ca01655160ba79b150")
  public open fun bindToCodePipeline(scope: CloudshiftdevConstructsConstruct,
      options: BindToCodePipelineOptions.Builder.() -> Unit): Unit = bindToCodePipeline(scope,
      BindToCodePipelineOptions(options))

  /**
   * Access the Connections object.
   *
   * Will fail if this Project does not have a VPC set.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Enable batch builds.
   *
   * Returns an object contining the batch service role if batch builds
   * could be enabled.
   */
  public override fun enableBatchBuilds(): BatchBuildConfig? =
      unwrap(this).enableBatchBuilds()?.let(BatchBuildConfig::wrap)

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * @return a CloudWatch metric associated with this build project.
   * @param metricName The name of the metric. 
   * @param props Customization properties.
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * @return a CloudWatch metric associated with this build project.
   * @param metricName The name of the metric. 
   * @param props Customization properties.
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * @return a CloudWatch metric associated with this build project.
   * @param metricName The name of the metric. 
   * @param props Customization properties.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricBuilds(): Metric = unwrap(this).metricBuilds().let(Metric::wrap)

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
  public override fun metricBuilds(props: MetricOptions): Metric =
      unwrap(this).metricBuilds(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be10b6ea6c0312aa2056fab98132d61a6bb7f2dc075bb9c159310319b5df338e")
  public override fun metricBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

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
  public override fun metricDuration(props: MetricOptions): Metric =
      unwrap(this).metricDuration(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public override fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricFailedBuilds(): Metric =
      unwrap(this).metricFailedBuilds().let(Metric::wrap)

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
  public override fun metricFailedBuilds(props: MetricOptions): Metric =
      unwrap(this).metricFailedBuilds(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e76329c1f6088e6d3db1035e1618128c61f1efede7ac90f5da71b7dca18bc61d")
  public override fun metricFailedBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricSucceededBuilds(): Metric =
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
  public override fun metricSucceededBuilds(props: MetricOptions): Metric =
      unwrap(this).metricSucceededBuilds(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9982ac7260f7a0b08fc3b8a431301c15086dcfa3a3f2a592651ec53b4756f34")
  public override fun metricSucceededBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSucceededBuilds(MetricOptions(props))

  /**
   * Defines a CodeStar Notification rule triggered when the project events emitted by you
   * specified, it very similar to `onEvent` API.
   *
   * You can also use the methods `notifyOnBuildSucceeded` and
   * `notifyOnBuildFailed` to define rules for these specific event emitted.
   *
   * @param id 
   * @param target 
   * @param options 
   */
  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: ProjectNotifyOnOptions,
  ): INotificationRule = unwrap(this).notifyOn(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(ProjectNotifyOnOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule triggered when the project events emitted by you
   * specified, it very similar to `onEvent` API.
   *
   * You can also use the methods `notifyOnBuildSucceeded` and
   * `notifyOnBuildFailed` to define rules for these specific event emitted.
   *
   * @param id 
   * @param target 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a64b4355535857ef9549fdd8b1fdd8cf1ffb2fc8fc660b30df90f6f6c101ac2d")
  public override fun notifyOn(
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
  public override fun notifyOnBuildFailed(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnBuildFailed(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar notification rule which triggers when a build fails.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnBuildFailed(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnBuildFailed(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar notification rule which triggers when a build fails.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfc453d6402a1247b2eee388a54403513410e804dcd398d8c2b349e3aad48ed0")
  public override fun notifyOnBuildFailed(
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
  public override fun notifyOnBuildSucceeded(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnBuildSucceeded(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar notification rule which triggers when a build completes successfully.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnBuildSucceeded(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnBuildSucceeded(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar notification rule which triggers when a build completes successfully.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29432c1bcd6aca19ee5dbbee1f0cf9b75b47bff27ca14f76948d4a6b591c1576")
  public override fun notifyOnBuildSucceeded(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnBuildSucceeded(id, target, NotificationRuleOptions(options))

  /**
   * Defines an event rule which triggers when a build fails.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  public override fun onBuildFailed(id: String): Rule =
      unwrap(this).onBuildFailed(id).let(Rule::wrap)

  /**
   * Defines an event rule which triggers when a build fails.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  public override fun onBuildFailed(id: String, options: OnEventOptions): Rule =
      unwrap(this).onBuildFailed(id, options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines an event rule which triggers when a build fails.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61bac02e7e7dfb811fb89b743d00a7ce9b4f450f7ba7a759ae905840cae795d8")
  public override fun onBuildFailed(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onBuildFailed(id, OnEventOptions(options))

  /**
   * Defines an event rule which triggers when a build starts.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  public override fun onBuildStarted(id: String): Rule =
      unwrap(this).onBuildStarted(id).let(Rule::wrap)

  /**
   * Defines an event rule which triggers when a build starts.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  public override fun onBuildStarted(id: String, options: OnEventOptions): Rule =
      unwrap(this).onBuildStarted(id, options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines an event rule which triggers when a build starts.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aa5fd6f3f4fd4c47805120e788079e181682a7808351afdd3a7512094b1f2bca")
  public override fun onBuildStarted(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onBuildStarted(id, OnEventOptions(options))

  /**
   * Defines an event rule which triggers when a build completes successfully.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  public override fun onBuildSucceeded(id: String): Rule =
      unwrap(this).onBuildSucceeded(id).let(Rule::wrap)

  /**
   * Defines an event rule which triggers when a build completes successfully.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  public override fun onBuildSucceeded(id: String, options: OnEventOptions): Rule =
      unwrap(this).onBuildSucceeded(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines an event rule which triggers when a build completes successfully.
   *
   * To access fields from the event in the event target input,
   * use the static fields on the `StateChangeEvent` class.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd12eb763bd8f9c97276262cd553c838b005c5207d64b8cfc38b391db01daf8f")
  public override fun onBuildSucceeded(id: String, options: OnEventOptions.Builder.() -> Unit): Rule
      = onBuildSucceeded(id, OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule triggered when something happens with this project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule triggered when something happens with this project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule triggered when something happens with this project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule that triggers upon phase change of this build project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public override fun onPhaseChange(id: String): Rule =
      unwrap(this).onPhaseChange(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule that triggers upon phase change of this build project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  public override fun onPhaseChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onPhaseChange(id, options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule that triggers upon phase change of this build project.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04a8a72e3fcbce6b30b4b5a2f8593dbdb3bce672a2f8532868248c61c9aa1473")
  public override fun onPhaseChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
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
  public override fun onStateChange(id: String): Rule =
      unwrap(this).onStateChange(id).let(Rule::wrap)

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
  public override fun onStateChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onStateChange(id, options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public override fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onStateChange(id, OnEventOptions(options))

  /**
   * The ARN of the project.
   */
  public override fun projectArn(): String = unwrap(this).getProjectArn()

  /**
   * The name of the project.
   */
  public override fun projectName(): String = unwrap(this).getProjectName()

  /**
   * The IAM role for this project.
   */
  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.Project].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to allow the CodeBuild to send all network traffic.
     *
     * If set to false, you must individually add traffic rules to allow the
     * CodeBuild project to connect to network targets.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether to allow the CodeBuild to send all network traffic. 
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * Defines where build artifacts will be stored.
     *
     * Could be: PipelineBuildArtifacts, NoArtifacts and S3Artifacts.
     *
     * Default: NoArtifacts
     *
     * @param artifacts Defines where build artifacts will be stored. 
     */
    public fun artifacts(artifacts: IArtifacts)

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see Build Badges Sample
     * in the AWS CodeBuild User Guide.
     *
     * Default: false
     *
     * @param badge Indicates whether AWS CodeBuild generates a publicly accessible URL for your
     * project's build badge. 
     */
    public fun badge(badge: Boolean)

    /**
     * Filename or contents of buildspec in JSON format.
     *
     * Default: - Empty buildspec.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
     * @param buildSpec Filename or contents of buildspec in JSON format. 
     */
    public fun buildSpec(buildSpec: BuildSpec)

    /**
     * Caching strategy to use.
     *
     * Default: Cache.none
     *
     * @param cache Caching strategy to use. 
     */
    public fun cache(cache: Cache)

    /**
     * Whether to check for the presence of any secrets in the environment variables of the default
     * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
     * variable would result in it being displayed in plain text in the AWS Console, the construct will
     * throw an exception if it detects a secret was passed there. Pass this property as false if you
     * want to skip this validation, and keep using a secret in a plain text environment variable.
     *
     * Default: true
     *
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     * in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since
     * using a secret for the value of that kind of variable would result in it being displayed in
     * plain text in the AWS Console, the construct will throw an exception if it detects a secret was
     * passed there. Pass this property as false if you want to skip this validation, and keep using a
     * secret in a plain text environment variable. 
     */
    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    /**
     * Maximum number of concurrent builds.
     *
     * Minimum value is 1 and maximum is account build limit.
     *
     * Default: - no explicit limit is set
     *
     * @param concurrentBuildLimit Maximum number of concurrent builds. 
     */
    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    /**
     * A description of the project.
     *
     * Use the description to identify the purpose
     * of the project.
     *
     * Default: - No description.
     *
     * @param description A description of the project. 
     */
    public fun description(description: String)

    /**
     * Encryption key to use to read and write artifacts.
     *
     * Default: - The AWS-managed CMK for Amazon Simple Storage Service (Amazon S3) is used.
     *
     * @param encryptionKey Encryption key to use to read and write artifacts. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     *
     * @param environment Build environment to use for the build. 
     */
    public fun environment(environment: BuildEnvironment)

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     *
     * @param environment Build environment to use for the build. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9b405189ec8125da6332d2039023ae77581631d7780135850918fe14ba39083")
    public fun environment(environment: BuildEnvironment.Builder.() -> Unit)

    /**
     * Additional environment variables to add to the build environment.
     *
     * Default: - No additional environment variables are specified.
     *
     * @param environmentVariables Additional environment variables to add to the build environment.
     * 
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    /**
     * An  ProjectFileSystemLocation objects for a CodeBuild build project.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project. 
     */
    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    /**
     * An  ProjectFileSystemLocation objects for a CodeBuild build project.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project. 
     */
    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    /**
     * Add permissions to this project's role to create and use test report groups with name
     * starting with the name of this project.
     *
     * That is the standard report group that gets created when a simple name
     * (in contrast to an ARN)
     * is used in the 'reports' section of the buildspec of this project.
     * This is usually harmless, but you can turn these off if you don't plan on using test
     * reports in this project.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/test-report-group-naming.html)
     * @param grantReportGroupPermissions Add permissions to this project's role to create and use
     * test report groups with name starting with the name of this project. 
     */
    public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean)

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for the build project. 
     */
    public fun logging(logging: LoggingOptions)

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for the build project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d4c534b71f459106a14d2c226f188418e8bcb0f93ce405197b833ae3054d73a")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    /**
     * The physical, human-readable name of the CodeBuild Project.
     *
     * Default: - Name is automatically generated.
     *
     * @param projectName The physical, human-readable name of the CodeBuild Project. 
     */
    public fun projectName(projectName: String)

    /**
     * The number of minutes after which AWS CodeBuild stops the build if it's still in queue.
     *
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     *
     * Default: - no queue timeout is set
     *
     * @param queuedTimeout The number of minutes after which AWS CodeBuild stops the build if it's
     * still in queue. 
     */
    public fun queuedTimeout(queuedTimeout: Duration)

    /**
     * Service Role to assume while running the build.
     *
     * Default: - A role will be created.
     *
     * @param role Service Role to assume while running the build. 
     */
    public fun role(role: IRole)

    /**
     * The secondary artifacts for the Project.
     *
     * Can also be added after the Project has been created by using the
     * `Project#addSecondaryArtifact` method.
     *
     * Default: - No secondary artifacts.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
     * @param secondaryArtifacts The secondary artifacts for the Project. 
     */
    public fun secondaryArtifacts(secondaryArtifacts: List<IArtifacts>)

    /**
     * The secondary artifacts for the Project.
     *
     * Can also be added after the Project has been created by using the
     * `Project#addSecondaryArtifact` method.
     *
     * Default: - No secondary artifacts.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
     * @param secondaryArtifacts The secondary artifacts for the Project. 
     */
    public fun secondaryArtifacts(vararg secondaryArtifacts: IArtifacts)

    /**
     * The secondary sources for the Project.
     *
     * Can be also added after the Project has been created by using the
     * `Project#addSecondarySource` method.
     *
     * Default: - No secondary sources.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
     * @param secondarySources The secondary sources for the Project. 
     */
    public fun secondarySources(secondarySources: List<ISource>)

    /**
     * The secondary sources for the Project.
     *
     * Can be also added after the Project has been created by using the
     * `Project#addSecondarySource` method.
     *
     * Default: - No secondary sources.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
     * @param secondarySources The secondary sources for the Project. 
     */
    public fun secondarySources(vararg secondarySources: ISource)

    /**
     * What security group to associate with the codebuild project's network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     *
     * @param securityGroups What security group to associate with the codebuild project's network
     * interfaces. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * What security group to associate with the codebuild project's network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     *
     * @param securityGroups What security group to associate with the codebuild project's network
     * interfaces. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * The source of the build.
     *
     * *Note*: if `NoSource` is given as the source,
     * then you need to provide an explicit `buildSpec`.
     *
     * Default: - NoSource
     *
     * @param source The source of the build. 
     */
    public fun source(source: ISource)

    /**
     * Add the permissions necessary for debugging builds with SSM Session Manager.
     *
     * If the following prerequisites have been met:
     *
     * * The necessary permissions have been added by setting this flag to true.
     * * The build image has the SSM agent installed (true for default CodeBuild images).
     * * The build is started with
     * [debugSessionEnabled](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_StartBuild.html#CodeBuild-StartBuild-request-debugSessionEnabled)
     * set to true.
     *
     * Then the build container can be paused and inspected using Session Manager
     * by invoking the `codebuild-breakpoint` command somewhere during the build.
     *
     * `codebuild-breakpoint` commands will be ignored if the build is not started
     * with `debugSessionEnabled=true`.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html)
     * @param ssmSessionPermissions Add the permissions necessary for debugging builds with SSM
     * Session Manager. 
     */
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    /**
     * Where to place the network interfaces within the VPC.
     *
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     *
     * Default: - private subnets if available else public subnets
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html)
     * @param subnetSelection Where to place the network interfaces within the VPC. 
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * Where to place the network interfaces within the VPC.
     *
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     *
     * Default: - private subnets if available else public subnets
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html)
     * @param subnetSelection Where to place the network interfaces within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4e46fcbb0d7a00029efbc5ef0f181ab09261a0805bbb68f317cae823c120996")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * The number of minutes after which AWS CodeBuild stops the build if it's not complete.
     *
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     *
     * Default: Duration.hours(1)
     *
     * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
     * complete. 
     */
    public fun timeout(timeout: Duration)

    /**
     * Specifies the visibility of the project's builds.
     *
     * Default: - no visibility is set
     *
     * @param visibility Specifies the visibility of the project's builds. 
     */
    public fun visibility(visibility: ProjectVisibility)

    /**
     * VPC network to place codebuild network interfaces.
     *
     * Specify this if the codebuild project needs to access resources in a VPC.
     *
     * Default: - No VPC is specified.
     *
     * @param vpc VPC network to place codebuild network interfaces. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.Project.Builder =
        software.amazon.awscdk.services.codebuild.Project.Builder.create(scope, id)

    /**
     * Whether to allow the CodeBuild to send all network traffic.
     *
     * If set to false, you must individually add traffic rules to allow the
     * CodeBuild project to connect to network targets.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether to allow the CodeBuild to send all network traffic. 
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * Defines where build artifacts will be stored.
     *
     * Could be: PipelineBuildArtifacts, NoArtifacts and S3Artifacts.
     *
     * Default: NoArtifacts
     *
     * @param artifacts Defines where build artifacts will be stored. 
     */
    override fun artifacts(artifacts: IArtifacts) {
      cdkBuilder.artifacts(artifacts.let(IArtifacts.Companion::unwrap))
    }

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see Build Badges Sample
     * in the AWS CodeBuild User Guide.
     *
     * Default: false
     *
     * @param badge Indicates whether AWS CodeBuild generates a publicly accessible URL for your
     * project's build badge. 
     */
    override fun badge(badge: Boolean) {
      cdkBuilder.badge(badge)
    }

    /**
     * Filename or contents of buildspec in JSON format.
     *
     * Default: - Empty buildspec.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
     * @param buildSpec Filename or contents of buildspec in JSON format. 
     */
    override fun buildSpec(buildSpec: BuildSpec) {
      cdkBuilder.buildSpec(buildSpec.let(BuildSpec.Companion::unwrap))
    }

    /**
     * Caching strategy to use.
     *
     * Default: Cache.none
     *
     * @param cache Caching strategy to use. 
     */
    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache.Companion::unwrap))
    }

    /**
     * Whether to check for the presence of any secrets in the environment variables of the default
     * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
     * variable would result in it being displayed in plain text in the AWS Console, the construct will
     * throw an exception if it detects a secret was passed there. Pass this property as false if you
     * want to skip this validation, and keep using a secret in a plain text environment variable.
     *
     * Default: true
     *
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     * in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since
     * using a secret for the value of that kind of variable would result in it being displayed in
     * plain text in the AWS Console, the construct will throw an exception if it detects a secret was
     * passed there. Pass this property as false if you want to skip this validation, and keep using a
     * secret in a plain text environment variable. 
     */
    override fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
      cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    /**
     * Maximum number of concurrent builds.
     *
     * Minimum value is 1 and maximum is account build limit.
     *
     * Default: - no explicit limit is set
     *
     * @param concurrentBuildLimit Maximum number of concurrent builds. 
     */
    override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
      cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    /**
     * A description of the project.
     *
     * Use the description to identify the purpose
     * of the project.
     *
     * Default: - No description.
     *
     * @param description A description of the project. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Encryption key to use to read and write artifacts.
     *
     * Default: - The AWS-managed CMK for Amazon Simple Storage Service (Amazon S3) is used.
     *
     * @param encryptionKey Encryption key to use to read and write artifacts. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     *
     * @param environment Build environment to use for the build. 
     */
    override fun environment(environment: BuildEnvironment) {
      cdkBuilder.environment(environment.let(BuildEnvironment.Companion::unwrap))
    }

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     *
     * @param environment Build environment to use for the build. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9b405189ec8125da6332d2039023ae77581631d7780135850918fe14ba39083")
    override fun environment(environment: BuildEnvironment.Builder.() -> Unit): Unit =
        environment(BuildEnvironment(environment))

    /**
     * Additional environment variables to add to the build environment.
     *
     * Default: - No additional environment variables are specified.
     *
     * @param environmentVariables Additional environment variables to add to the build environment.
     * 
     */
    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
    }

    /**
     * An  ProjectFileSystemLocation objects for a CodeBuild build project.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project. 
     */
    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation.Companion::unwrap))
    }

    /**
     * An  ProjectFileSystemLocation objects for a CodeBuild build project.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project. 
     */
    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * Add permissions to this project's role to create and use test report groups with name
     * starting with the name of this project.
     *
     * That is the standard report group that gets created when a simple name
     * (in contrast to an ARN)
     * is used in the 'reports' section of the buildspec of this project.
     * This is usually harmless, but you can turn these off if you don't plan on using test
     * reports in this project.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/test-report-group-naming.html)
     * @param grantReportGroupPermissions Add permissions to this project's role to create and use
     * test report groups with name starting with the name of this project. 
     */
    override fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
      cdkBuilder.grantReportGroupPermissions(grantReportGroupPermissions)
    }

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for the build project. 
     */
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions.Companion::unwrap))
    }

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for the build project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d4c534b71f459106a14d2c226f188418e8bcb0f93ce405197b833ae3054d73a")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    /**
     * The physical, human-readable name of the CodeBuild Project.
     *
     * Default: - Name is automatically generated.
     *
     * @param projectName The physical, human-readable name of the CodeBuild Project. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * The number of minutes after which AWS CodeBuild stops the build if it's still in queue.
     *
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     *
     * Default: - no queue timeout is set
     *
     * @param queuedTimeout The number of minutes after which AWS CodeBuild stops the build if it's
     * still in queue. 
     */
    override fun queuedTimeout(queuedTimeout: Duration) {
      cdkBuilder.queuedTimeout(queuedTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * Service Role to assume while running the build.
     *
     * Default: - A role will be created.
     *
     * @param role Service Role to assume while running the build. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The secondary artifacts for the Project.
     *
     * Can also be added after the Project has been created by using the
     * `Project#addSecondaryArtifact` method.
     *
     * Default: - No secondary artifacts.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
     * @param secondaryArtifacts The secondary artifacts for the Project. 
     */
    override fun secondaryArtifacts(secondaryArtifacts: List<IArtifacts>) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts.map(IArtifacts.Companion::unwrap))
    }

    /**
     * The secondary artifacts for the Project.
     *
     * Can also be added after the Project has been created by using the
     * `Project#addSecondaryArtifact` method.
     *
     * Default: - No secondary artifacts.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
     * @param secondaryArtifacts The secondary artifacts for the Project. 
     */
    override fun secondaryArtifacts(vararg secondaryArtifacts: IArtifacts): Unit =
        secondaryArtifacts(secondaryArtifacts.toList())

    /**
     * The secondary sources for the Project.
     *
     * Can be also added after the Project has been created by using the
     * `Project#addSecondarySource` method.
     *
     * Default: - No secondary sources.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
     * @param secondarySources The secondary sources for the Project. 
     */
    override fun secondarySources(secondarySources: List<ISource>) {
      cdkBuilder.secondarySources(secondarySources.map(ISource.Companion::unwrap))
    }

    /**
     * The secondary sources for the Project.
     *
     * Can be also added after the Project has been created by using the
     * `Project#addSecondarySource` method.
     *
     * Default: - No secondary sources.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
     * @param secondarySources The secondary sources for the Project. 
     */
    override fun secondarySources(vararg secondarySources: ISource): Unit =
        secondarySources(secondarySources.toList())

    /**
     * What security group to associate with the codebuild project's network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     *
     * @param securityGroups What security group to associate with the codebuild project's network
     * interfaces. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * What security group to associate with the codebuild project's network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     *
     * @param securityGroups What security group to associate with the codebuild project's network
     * interfaces. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * The source of the build.
     *
     * *Note*: if `NoSource` is given as the source,
     * then you need to provide an explicit `buildSpec`.
     *
     * Default: - NoSource
     *
     * @param source The source of the build. 
     */
    override fun source(source: ISource) {
      cdkBuilder.source(source.let(ISource.Companion::unwrap))
    }

    /**
     * Add the permissions necessary for debugging builds with SSM Session Manager.
     *
     * If the following prerequisites have been met:
     *
     * * The necessary permissions have been added by setting this flag to true.
     * * The build image has the SSM agent installed (true for default CodeBuild images).
     * * The build is started with
     * [debugSessionEnabled](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_StartBuild.html#CodeBuild-StartBuild-request-debugSessionEnabled)
     * set to true.
     *
     * Then the build container can be paused and inspected using Session Manager
     * by invoking the `codebuild-breakpoint` command somewhere during the build.
     *
     * `codebuild-breakpoint` commands will be ignored if the build is not started
     * with `debugSessionEnabled=true`.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html)
     * @param ssmSessionPermissions Add the permissions necessary for debugging builds with SSM
     * Session Manager. 
     */
    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    /**
     * Where to place the network interfaces within the VPC.
     *
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     *
     * Default: - private subnets if available else public subnets
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html)
     * @param subnetSelection Where to place the network interfaces within the VPC. 
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Where to place the network interfaces within the VPC.
     *
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     *
     * Default: - private subnets if available else public subnets
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html)
     * @param subnetSelection Where to place the network interfaces within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4e46fcbb0d7a00029efbc5ef0f181ab09261a0805bbb68f317cae823c120996")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * The number of minutes after which AWS CodeBuild stops the build if it's not complete.
     *
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     *
     * Default: Duration.hours(1)
     *
     * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
     * complete. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * Specifies the visibility of the project's builds.
     *
     * Default: - no visibility is set
     *
     * @param visibility Specifies the visibility of the project's builds. 
     */
    override fun visibility(visibility: ProjectVisibility) {
      cdkBuilder.visibility(visibility.let(ProjectVisibility.Companion::unwrap))
    }

    /**
     * VPC network to place codebuild network interfaces.
     *
     * Specify this if the codebuild project needs to access resources in a VPC.
     *
     * Default: - No VPC is specified.
     *
     * @param vpc VPC network to place codebuild network interfaces. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.Project = cdkBuilder.build()
  }

  public companion object {
    public fun fromProjectArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      projectArn: String,
    ): IProject =
        software.amazon.awscdk.services.codebuild.Project.fromProjectArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, projectArn).let(IProject::wrap)

    public fun fromProjectName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      projectName: String,
    ): IProject =
        software.amazon.awscdk.services.codebuild.Project.fromProjectName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, projectName).let(IProject::wrap)

    public fun serializeEnvVariables(environmentVariables: Map<String, BuildEnvironmentVariable>):
        List<CfnProject.EnvironmentVariableProperty> =
        software.amazon.awscdk.services.codebuild.Project.serializeEnvVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)}).map(CfnProject.EnvironmentVariableProperty::wrap)

    public fun serializeEnvVariables(environmentVariables: Map<String, BuildEnvironmentVariable>,
        validateNoPlainTextSecrets: Boolean): List<CfnProject.EnvironmentVariableProperty> =
        software.amazon.awscdk.services.codebuild.Project.serializeEnvVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)},
        validateNoPlainTextSecrets).map(CfnProject.EnvironmentVariableProperty::wrap)

    public fun serializeEnvVariables(
      environmentVariables: Map<String, BuildEnvironmentVariable>,
      validateNoPlainTextSecrets: Boolean,
      principal: IGrantable,
    ): List<CfnProject.EnvironmentVariableProperty> =
        software.amazon.awscdk.services.codebuild.Project.serializeEnvVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)},
        validateNoPlainTextSecrets,
        principal.let(IGrantable.Companion::unwrap)).map(CfnProject.EnvironmentVariableProperty::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Project {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Project(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.Project): Project =
        Project(cdkObject)

    internal fun unwrap(wrapped: Project): software.amazon.awscdk.services.codebuild.Project =
        wrapped.cdkObject as software.amazon.awscdk.services.codebuild.Project
  }
}
