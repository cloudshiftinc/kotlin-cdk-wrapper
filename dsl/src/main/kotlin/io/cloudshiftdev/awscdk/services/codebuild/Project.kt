package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Project internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codebuild.Project,
) : Resource(cdkObject), IProject {
  public open fun addFileSystemLocation(fileSystemLocation: IFileSystemLocation) {
    unwrap(this).addFileSystemLocation(fileSystemLocation.let(IFileSystemLocation::unwrap))
  }

  public open fun addSecondaryArtifact(secondaryArtifact: IArtifacts) {
    unwrap(this).addSecondaryArtifact(secondaryArtifact.let(IArtifacts::unwrap))
  }

  public open fun addSecondarySource(secondarySource: ISource) {
    unwrap(this).addSecondarySource(secondarySource.let(ISource::unwrap))
  }

  public override fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public override fun bindAsNotificationRuleSource(_scope: CloudshiftdevConstructsConstruct):
      NotificationRuleSourceConfig =
      unwrap(this).bindAsNotificationRuleSource(_scope.let(CloudshiftdevConstructsConstruct::unwrap)).let(NotificationRuleSourceConfig::wrap)

  public open fun bindToCodePipeline(_scope: CloudshiftdevConstructsConstruct,
      options: BindToCodePipelineOptions) {
    unwrap(this).bindToCodePipeline(_scope.let(CloudshiftdevConstructsConstruct::unwrap),
        options.let(BindToCodePipelineOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d3776f8844ff84e2cebb59235661bfd8d91aa250665890ca01655160ba79b150")
  public open fun bindToCodePipeline(_scope: CloudshiftdevConstructsConstruct,
      options: BindToCodePipelineOptions.Builder.() -> Unit): Unit = bindToCodePipeline(_scope,
      BindToCodePipelineOptions(options))

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun enableBatchBuilds(): BatchBuildConfig? =
      unwrap(this).enableBatchBuilds()?.let(BatchBuildConfig::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricBuilds(): Metric = unwrap(this).metricBuilds().let(Metric::wrap)

  public override fun metricBuilds(props: MetricOptions): Metric =
      unwrap(this).metricBuilds(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be10b6ea6c0312aa2056fab98132d61a6bb7f2dc075bb9c159310319b5df338e")
  public override fun metricBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
      metricBuilds(MetricOptions(props))

  public override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

  public override fun metricDuration(props: MetricOptions): Metric =
      unwrap(this).metricDuration(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public override fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDuration(MetricOptions(props))

  public override fun metricFailedBuilds(): Metric =
      unwrap(this).metricFailedBuilds().let(Metric::wrap)

  public override fun metricFailedBuilds(props: MetricOptions): Metric =
      unwrap(this).metricFailedBuilds(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e76329c1f6088e6d3db1035e1618128c61f1efede7ac90f5da71b7dca18bc61d")
  public override fun metricFailedBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFailedBuilds(MetricOptions(props))

  public override fun metricSucceededBuilds(): Metric =
      unwrap(this).metricSucceededBuilds().let(Metric::wrap)

  public override fun metricSucceededBuilds(props: MetricOptions): Metric =
      unwrap(this).metricSucceededBuilds(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9982ac7260f7a0b08fc3b8a431301c15086dcfa3a3f2a592651ec53b4756f34")
  public override fun metricSucceededBuilds(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSucceededBuilds(MetricOptions(props))

  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: ProjectNotifyOnOptions,
  ): INotificationRule = unwrap(this).notifyOn(id, target.let(INotificationRuleTarget::unwrap),
      options.let(ProjectNotifyOnOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a64b4355535857ef9549fdd8b1fdd8cf1ffb2fc8fc660b30df90f6f6c101ac2d")
  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: ProjectNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOn(id, target, ProjectNotifyOnOptions(options))

  public override fun notifyOnBuildFailed(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnBuildFailed(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnBuildFailed(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnBuildFailed(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfc453d6402a1247b2eee388a54403513410e804dcd398d8c2b349e3aad48ed0")
  public override fun notifyOnBuildFailed(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnBuildFailed(id, target, NotificationRuleOptions(options))

  public override fun notifyOnBuildSucceeded(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnBuildSucceeded(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnBuildSucceeded(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnBuildSucceeded(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29432c1bcd6aca19ee5dbbee1f0cf9b75b47bff27ca14f76948d4a6b591c1576")
  public override fun notifyOnBuildSucceeded(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnBuildSucceeded(id, target, NotificationRuleOptions(options))

  public override fun onBuildFailed(id: String): Rule =
      unwrap(this).onBuildFailed(id).let(Rule::wrap)

  public override fun onBuildFailed(id: String, options: OnEventOptions): Rule =
      unwrap(this).onBuildFailed(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61bac02e7e7dfb811fb89b743d00a7ce9b4f450f7ba7a759ae905840cae795d8")
  public override fun onBuildFailed(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onBuildFailed(id, OnEventOptions(options))

  public override fun onBuildStarted(id: String): Rule =
      unwrap(this).onBuildStarted(id).let(Rule::wrap)

  public override fun onBuildStarted(id: String, options: OnEventOptions): Rule =
      unwrap(this).onBuildStarted(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aa5fd6f3f4fd4c47805120e788079e181682a7808351afdd3a7512094b1f2bca")
  public override fun onBuildStarted(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onBuildStarted(id, OnEventOptions(options))

  public override fun onBuildSucceeded(id: String): Rule =
      unwrap(this).onBuildSucceeded(id).let(Rule::wrap)

  public override fun onBuildSucceeded(id: String, options: OnEventOptions): Rule =
      unwrap(this).onBuildSucceeded(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd12eb763bd8f9c97276262cd553c838b005c5207d64b8cfc38b391db01daf8f")
  public override fun onBuildSucceeded(id: String, options: OnEventOptions.Builder.() -> Unit): Rule
      = onBuildSucceeded(id, OnEventOptions(options))

  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  public override fun onPhaseChange(id: String): Rule =
      unwrap(this).onPhaseChange(id).let(Rule::wrap)

  public override fun onPhaseChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onPhaseChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04a8a72e3fcbce6b30b4b5a2f8593dbdb3bce672a2f8532868248c61c9aa1473")
  public override fun onPhaseChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onPhaseChange(id, OnEventOptions(options))

  public override fun onStateChange(id: String): Rule =
      unwrap(this).onStateChange(id).let(Rule::wrap)

  public override fun onStateChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onStateChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public override fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onStateChange(id, OnEventOptions(options))

  public override fun projectArn(): String = unwrap(this).getProjectArn()

  public override fun projectName(): String = unwrap(this).getProjectName()

  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public interface Builder {
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun artifacts(artifacts: IArtifacts)

    public fun badge(badge: Boolean)

    public fun buildSpec(buildSpec: BuildSpec)

    public fun cache(cache: Cache)

    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    public fun description(description: String)

    public fun encryptionKey(encryptionKey: IKey)

    public fun environment(environment: BuildEnvironment)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9b405189ec8125da6332d2039023ae77581631d7780135850918fe14ba39083")
    public fun environment(environment: BuildEnvironment.Builder.() -> Unit)

    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean)

    public fun logging(logging: LoggingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d4c534b71f459106a14d2c226f188418e8bcb0f93ce405197b833ae3054d73a")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    public fun projectName(projectName: String)

    public fun queuedTimeout(queuedTimeout: Duration)

    public fun role(role: IRole)

    public fun secondaryArtifacts(secondaryArtifacts: List<IArtifacts>)

    public fun secondaryArtifacts(vararg secondaryArtifacts: IArtifacts)

    public fun secondarySources(secondarySources: List<ISource>)

    public fun secondarySources(vararg secondarySources: ISource)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun source(source: ISource)

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4e46fcbb0d7a00029efbc5ef0f181ab09261a0805bbb68f317cae823c120996")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun timeout(timeout: Duration)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.Project.Builder =
        software.amazon.awscdk.services.codebuild.Project.Builder.create(scope, id)

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun artifacts(artifacts: IArtifacts) {
      cdkBuilder.artifacts(artifacts.let(IArtifacts::unwrap))
    }

    override fun badge(badge: Boolean) {
      cdkBuilder.badge(badge)
    }

    override fun buildSpec(buildSpec: BuildSpec) {
      cdkBuilder.buildSpec(buildSpec.let(BuildSpec::unwrap))
    }

    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
    }

    override fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
      cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
      cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun environment(environment: BuildEnvironment) {
      cdkBuilder.environment(environment.let(BuildEnvironment::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9b405189ec8125da6332d2039023ae77581631d7780135850918fe14ba39083")
    override fun environment(environment: BuildEnvironment.Builder.() -> Unit): Unit =
        environment(BuildEnvironment(environment))

    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
    }

    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
    }

    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    override fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
      cdkBuilder.grantReportGroupPermissions(grantReportGroupPermissions)
    }

    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d4c534b71f459106a14d2c226f188418e8bcb0f93ce405197b833ae3054d73a")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    override fun queuedTimeout(queuedTimeout: Duration) {
      cdkBuilder.queuedTimeout(queuedTimeout.let(Duration::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun secondaryArtifacts(secondaryArtifacts: List<IArtifacts>) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts.map(IArtifacts::unwrap))
    }

    override fun secondaryArtifacts(vararg secondaryArtifacts: IArtifacts): Unit =
        secondaryArtifacts(secondaryArtifacts.toList())

    override fun secondarySources(secondarySources: List<ISource>) {
      cdkBuilder.secondarySources(secondarySources.map(ISource::unwrap))
    }

    override fun secondarySources(vararg secondarySources: ISource): Unit =
        secondarySources(secondarySources.toList())

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun source(source: ISource) {
      cdkBuilder.source(source.let(ISource::unwrap))
    }

    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4e46fcbb0d7a00029efbc5ef0f181ab09261a0805bbb68f317cae823c120996")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.Project = cdkBuilder.build()
  }

  public companion object {
    public open fun fromProjectArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      projectArn: String,
    ): IProject =
        software.amazon.awscdk.services.codebuild.Project.fromProjectArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, projectArn).let(IProject::wrap)

    public open fun fromProjectName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      projectName: String,
    ): IProject =
        software.amazon.awscdk.services.codebuild.Project.fromProjectName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, projectName).let(IProject::wrap)

    public open
        fun serializeEnvVariables(environmentVariables: Map<String, BuildEnvironmentVariable>):
        List<CfnProject.EnvironmentVariableProperty> =
        software.amazon.awscdk.services.codebuild.Project.serializeEnvVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)}).map(CfnProject.EnvironmentVariableProperty::wrap)

    public open
        fun serializeEnvVariables(environmentVariables: Map<String, BuildEnvironmentVariable>,
        validateNoPlainTextSecrets: Boolean): List<CfnProject.EnvironmentVariableProperty> =
        software.amazon.awscdk.services.codebuild.Project.serializeEnvVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)},
        validateNoPlainTextSecrets).map(CfnProject.EnvironmentVariableProperty::wrap)

    public open fun serializeEnvVariables(
      environmentVariables: Map<String, BuildEnvironmentVariable>,
      validateNoPlainTextSecrets: Boolean,
      principal: IGrantable,
    ): List<CfnProject.EnvironmentVariableProperty> =
        software.amazon.awscdk.services.codebuild.Project.serializeEnvVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)},
        validateNoPlainTextSecrets,
        principal.let(IGrantable::unwrap)).map(CfnProject.EnvironmentVariableProperty::wrap)

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
        wrapped.cdkObject
  }
}
