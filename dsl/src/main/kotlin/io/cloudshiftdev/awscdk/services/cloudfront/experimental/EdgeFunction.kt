package io.cloudshiftdev.awscdk.services.cloudfront.experimental

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codeguruprofiler.IProfilingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.CompositePrincipal
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.AdotInstrumentationConfig
import io.cloudshiftdev.awscdk.services.lambda.Alias
import io.cloudshiftdev.awscdk.services.lambda.AliasOptions
import io.cloudshiftdev.awscdk.services.lambda.Architecture
import io.cloudshiftdev.awscdk.services.lambda.Code
import io.cloudshiftdev.awscdk.services.lambda.EventInvokeConfigOptions
import io.cloudshiftdev.awscdk.services.lambda.EventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.EventSourceMappingOptions
import io.cloudshiftdev.awscdk.services.lambda.FileSystem
import io.cloudshiftdev.awscdk.services.lambda.FunctionUrl
import io.cloudshiftdev.awscdk.services.lambda.FunctionUrlOptions
import io.cloudshiftdev.awscdk.services.lambda.ICodeSigningConfig
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import io.cloudshiftdev.awscdk.services.lambda.IVersion
import io.cloudshiftdev.awscdk.services.lambda.LambdaInsightsVersion
import io.cloudshiftdev.awscdk.services.lambda.LogRetentionRetryOptions
import io.cloudshiftdev.awscdk.services.lambda.LoggingFormat
import io.cloudshiftdev.awscdk.services.lambda.ParamsAndSecretsLayerVersion
import io.cloudshiftdev.awscdk.services.lambda.Permission
import io.cloudshiftdev.awscdk.services.lambda.Runtime
import io.cloudshiftdev.awscdk.services.lambda.RuntimeManagementMode
import io.cloudshiftdev.awscdk.services.lambda.SnapStartConf
import io.cloudshiftdev.awscdk.services.lambda.Tracing
import io.cloudshiftdev.awscdk.services.lambda.VersionOptions
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Node
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

public open class EdgeFunction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction,
) : Resource(cdkObject), IVersion {
  public override fun addAlias(aliasName: String): Alias =
      unwrap(this).addAlias(aliasName).let(Alias::wrap)

  public override fun addAlias(aliasName: String, options: AliasOptions): Alias =
      unwrap(this).addAlias(aliasName, options.let(AliasOptions::unwrap)).let(Alias::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ff57343b4e1566ac76515fa826125e96564152d30ba0ef3d24569a9cf452484")
  public override fun addAlias(aliasName: String, options: AliasOptions.Builder.() -> Unit): Alias =
      addAlias(aliasName, AliasOptions(options))

  public override fun addEventSource(source: IEventSource) {
    unwrap(this).addEventSource(source.let(IEventSource::unwrap))
  }

  public override fun addEventSourceMapping(id: String, options: EventSourceMappingOptions):
      EventSourceMapping = unwrap(this).addEventSourceMapping(id,
      options.let(EventSourceMappingOptions::unwrap)).let(EventSourceMapping::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1a42ee4d3635728f011b89020cb9e266d5ec086cc3638388b952c384adc89b9")
  public override fun addEventSourceMapping(id: String,
      options: EventSourceMappingOptions.Builder.() -> Unit): EventSourceMapping =
      addEventSourceMapping(id, EventSourceMappingOptions(options))

  public override fun addFunctionUrl(): FunctionUrl =
      unwrap(this).addFunctionUrl().let(FunctionUrl::wrap)

  public override fun addFunctionUrl(options: FunctionUrlOptions): FunctionUrl =
      unwrap(this).addFunctionUrl(options.let(FunctionUrlOptions::unwrap)).let(FunctionUrl::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc489a994cc127e25ae321702e1246a654ec80f2c2c2c9c9399e6bdb53dab162")
  public override fun addFunctionUrl(options: FunctionUrlOptions.Builder.() -> Unit): FunctionUrl =
      addFunctionUrl(FunctionUrlOptions(options))

  public override fun addPermission(id: String, permission: Permission) {
    unwrap(this).addPermission(id, permission.let(Permission::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab1e13b50521b14748449d1cedaddd4f97568ffa4bbbeb7d2cea25e84b0ce6c2")
  public override fun addPermission(id: String, permission: Permission.Builder.() -> Unit): Unit =
      addPermission(id, Permission(permission))

  public override fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public override fun architecture(): Architecture =
      unwrap(this).getArchitecture().let(Architecture::wrap)

  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions) {
    unwrap(this).configureAsyncInvoke(options.let(EventInvokeConfigOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b85c1a6f6a657150d5fca517e75d094e687b3217c04d318f2be78e23e7c059ee")
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions.Builder.() -> Unit):
      Unit = configureAsyncInvoke(EventInvokeConfigOptions(options))

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun currentVersion(): IVersion = unwrap(this).getCurrentVersion().let(IVersion::wrap)

  public override fun edgeArn(): String = unwrap(this).getEdgeArn()

  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  public override fun functionName(): String = unwrap(this).getFunctionName()

  public override fun grantInvoke(identity: IGrantable): Grant =
      unwrap(this).grantInvoke(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantInvokeCompositePrincipal(compositePrincipal: CompositePrincipal):
      List<Grant> =
      unwrap(this).grantInvokeCompositePrincipal(compositePrincipal.let(CompositePrincipal::unwrap)).map(Grant::wrap)

  public override fun grantInvokeUrl(identity: IGrantable): Grant =
      unwrap(this).grantInvokeUrl(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun isBoundToVpc(): Boolean = unwrap(this).getIsBoundToVpc()

  public override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

  public override fun latestVersion(): IVersion =
      unwrap(this).getLatestVersion().let(IVersion::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

  public override fun metricDuration(props: MetricOptions): Metric =
      unwrap(this).metricDuration(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public override fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDuration(MetricOptions(props))

  public override fun metricErrors(): Metric = unwrap(this).metricErrors().let(Metric::wrap)

  public override fun metricErrors(props: MetricOptions): Metric =
      unwrap(this).metricErrors(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35a6413eeb4163b1b71b829794e56c9dcdd5a733bbb4fad94ee2cb3a0267d941")
  public override fun metricErrors(props: MetricOptions.Builder.() -> Unit): Metric =
      metricErrors(MetricOptions(props))

  public override fun metricInvocations(): Metric =
      unwrap(this).metricInvocations().let(Metric::wrap)

  public override fun metricInvocations(props: MetricOptions): Metric =
      unwrap(this).metricInvocations(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6a03faa9f4e6ab06d879372d43628c35937b122c9853c734195167cad56a2614")
  public override fun metricInvocations(props: MetricOptions.Builder.() -> Unit): Metric =
      metricInvocations(MetricOptions(props))

  public override fun metricThrottles(): Metric = unwrap(this).metricThrottles().let(Metric::wrap)

  public override fun metricThrottles(props: MetricOptions): Metric =
      unwrap(this).metricThrottles(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c66b543d0ee791c9157b75f01987fb80ab6ef611d23006ace8925909dc84e3f")
  public override fun metricThrottles(props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottles(MetricOptions(props))

  public override fun permissionsNode(): Node = unwrap(this).getPermissionsNode().let(Node::wrap)

  public override fun resourceArnsForGrantInvoke(): List<String> =
      unwrap(this).getResourceArnsForGrantInvoke()

  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public override fun version(): String = unwrap(this).getVersion()

  public interface Builder {
    public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11afc5224e0d8b34bdea940ce497bf0fb2e2d0c9c657e024f606318e82f06bfa")
    public
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit)

    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun allowPublicSubnet(allowPublicSubnet: Boolean)

    public fun applicationLogLevel(applicationLogLevel: String)

    public fun architecture(architecture: Architecture)

    public fun code(code: Code)

    public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig)

    public fun currentVersionOptions(currentVersionOptions: VersionOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa807d37f25a69a10159f145b1c872cfc34de53a224f8161fe2e617ce59dea30")
    public fun currentVersionOptions(currentVersionOptions: VersionOptions.Builder.() -> Unit)

    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean)

    public fun deadLetterTopic(deadLetterTopic: ITopic)

    public fun description(description: String)

    public fun environment(environment: Map<String, String>)

    public fun environmentEncryption(environmentEncryption: IKey)

    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    public fun events(events: List<IEventSource>)

    public fun events(vararg events: IEventSource)

    public fun filesystem(filesystem: FileSystem)

    public fun functionName(functionName: String)

    public fun handler(handler: String)

    public fun initialPolicy(initialPolicy: List<PolicyStatement>)

    public fun initialPolicy(vararg initialPolicy: PolicyStatement)

    public fun insightsVersion(insightsVersion: LambdaInsightsVersion)

    public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean)

    public fun layers(layers: List<ILayerVersion>)

    public fun layers(vararg layers: ILayerVersion)

    public fun logFormat(logFormat: String)

    public fun logGroup(logGroup: ILogGroup)

    public fun logRetention(logRetention: RetentionDays)

    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b2d86c2ccaf3f195f0f2849426d47e7323bbe5c1c0b223944e7e281d8fb4629")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    public fun logRetentionRole(logRetentionRole: IRole)

    public fun loggingFormat(loggingFormat: LoggingFormat)

    public fun maxEventAge(maxEventAge: Duration)

    public fun memorySize(memorySize: Number)

    public fun onFailure(onFailure: IDestination)

    public fun onSuccess(onSuccess: IDestination)

    public fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion)

    public fun profiling(profiling: Boolean)

    public fun profilingGroup(profilingGroup: IProfilingGroup)

    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    public fun retryAttempts(retryAttempts: Number)

    public fun role(role: IRole)

    public fun runtime(runtime: Runtime)

    public fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun snapStart(snapStart: SnapStartConf)

    public fun stackId(stackId: String)

    public fun systemLogLevel(systemLogLevel: String)

    public fun timeout(timeout: Duration)

    public fun tracing(tracing: Tracing)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c19505a61d3eceb02b57a086ff4393c8f46f9c59acbf9f7480ca6486d3836854")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction.Builder =
        software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction.Builder.create(scope,
        id)

    override fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
      cdkBuilder.adotInstrumentation(adotInstrumentation.let(AdotInstrumentationConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11afc5224e0d8b34bdea940ce497bf0fb2e2d0c9c657e024f606318e82f06bfa")
    override
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit):
        Unit = adotInstrumentation(AdotInstrumentationConfig(adotInstrumentation))

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun allowPublicSubnet(allowPublicSubnet: Boolean) {
      cdkBuilder.allowPublicSubnet(allowPublicSubnet)
    }

    override fun applicationLogLevel(applicationLogLevel: String) {
      cdkBuilder.applicationLogLevel(applicationLogLevel)
    }

    override fun architecture(architecture: Architecture) {
      cdkBuilder.architecture(architecture.let(Architecture::unwrap))
    }

    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    override fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
      cdkBuilder.codeSigningConfig(codeSigningConfig.let(ICodeSigningConfig::unwrap))
    }

    override fun currentVersionOptions(currentVersionOptions: VersionOptions) {
      cdkBuilder.currentVersionOptions(currentVersionOptions.let(VersionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa807d37f25a69a10159f145b1c872cfc34de53a224f8161fe2e617ce59dea30")
    override fun currentVersionOptions(currentVersionOptions: VersionOptions.Builder.() -> Unit):
        Unit = currentVersionOptions(VersionOptions(currentVersionOptions))

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean) {
      cdkBuilder.deadLetterQueueEnabled(deadLetterQueueEnabled)
    }

    override fun deadLetterTopic(deadLetterTopic: ITopic) {
      cdkBuilder.deadLetterTopic(deadLetterTopic.let(ITopic::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun environmentEncryption(environmentEncryption: IKey) {
      cdkBuilder.environmentEncryption(environmentEncryption.let(IKey::unwrap))
    }

    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

    override fun events(events: List<IEventSource>) {
      cdkBuilder.events(events.map(IEventSource::unwrap))
    }

    override fun events(vararg events: IEventSource): Unit = events(events.toList())

    override fun filesystem(filesystem: FileSystem) {
      cdkBuilder.filesystem(filesystem.let(FileSystem::unwrap))
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    override fun initialPolicy(initialPolicy: List<PolicyStatement>) {
      cdkBuilder.initialPolicy(initialPolicy.map(PolicyStatement::unwrap))
    }

    override fun initialPolicy(vararg initialPolicy: PolicyStatement): Unit =
        initialPolicy(initialPolicy.toList())

    override fun insightsVersion(insightsVersion: LambdaInsightsVersion) {
      cdkBuilder.insightsVersion(insightsVersion.let(LambdaInsightsVersion::unwrap))
    }

    override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean) {
      cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack)
    }

    override fun layers(layers: List<ILayerVersion>) {
      cdkBuilder.layers(layers.map(ILayerVersion::unwrap))
    }

    override fun layers(vararg layers: ILayerVersion): Unit = layers(layers.toList())

    override fun logFormat(logFormat: String) {
      cdkBuilder.logFormat(logFormat)
    }

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b2d86c2ccaf3f195f0f2849426d47e7323bbe5c1c0b223944e7e281d8fb4629")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    override fun logRetentionRole(logRetentionRole: IRole) {
      cdkBuilder.logRetentionRole(logRetentionRole.let(IRole::unwrap))
    }

    override fun loggingFormat(loggingFormat: LoggingFormat) {
      cdkBuilder.loggingFormat(loggingFormat.let(LoggingFormat::unwrap))
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
    }

    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
    }

    override fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion) {
      cdkBuilder.paramsAndSecrets(paramsAndSecrets.let(ParamsAndSecretsLayerVersion::unwrap))
    }

    override fun profiling(profiling: Boolean) {
      cdkBuilder.profiling(profiling)
    }

    override fun profilingGroup(profilingGroup: IProfilingGroup) {
      cdkBuilder.profilingGroup(profilingGroup.let(IProfilingGroup::unwrap))
    }

    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runtime(runtime: Runtime) {
      cdkBuilder.runtime(runtime.let(Runtime::unwrap))
    }

    override fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode) {
      cdkBuilder.runtimeManagementMode(runtimeManagementMode.let(RuntimeManagementMode::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun snapStart(snapStart: SnapStartConf) {
      cdkBuilder.snapStart(snapStart.let(SnapStartConf::unwrap))
    }

    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    override fun systemLogLevel(systemLogLevel: String) {
      cdkBuilder.systemLogLevel(systemLogLevel)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun tracing(tracing: Tracing) {
      cdkBuilder.tracing(tracing.let(Tracing::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c19505a61d3eceb02b57a086ff4393c8f46f9c59acbf9f7480ca6486d3836854")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EdgeFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EdgeFunction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction):
        EdgeFunction = EdgeFunction(cdkObject)

    internal fun unwrap(wrapped: EdgeFunction):
        software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction = wrapped.cdkObject
  }
}
