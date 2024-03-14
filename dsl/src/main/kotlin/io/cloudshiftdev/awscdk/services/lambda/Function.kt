package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codeguruprofiler.IProfilingGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
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

public open class Function internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.Function,
) : FunctionBase(cdkObject) {
  public open fun addAlias(aliasName: String): Alias =
      unwrap(this).addAlias(aliasName).let(Alias::wrap)

  public open fun addAlias(aliasName: String, options: AliasOptions): Alias =
      unwrap(this).addAlias(aliasName, options.let(AliasOptions::unwrap)).let(Alias::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ff57343b4e1566ac76515fa826125e96564152d30ba0ef3d24569a9cf452484")
  public open fun addAlias(aliasName: String, options: AliasOptions.Builder.() -> Unit): Alias =
      addAlias(aliasName, AliasOptions(options))

  public open fun addEnvironment(key: String, `value`: String): Function =
      unwrap(this).addEnvironment(key, `value`).let(Function::wrap)

  public open fun addEnvironment(
    key: String,
    `value`: String,
    options: EnvironmentOptions,
  ): Function = unwrap(this).addEnvironment(key, `value`,
      options.let(EnvironmentOptions::unwrap)).let(Function::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4da36124bfe11c4b783fc150ea410c6e7e61abc26488b264c97cc7911fc239ee")
  public open fun addEnvironment(
    key: String,
    `value`: String,
    options: EnvironmentOptions.Builder.() -> Unit,
  ): Function = addEnvironment(key, `value`, EnvironmentOptions(options))

  public open fun addLayers(layers: ILayerVersion) {
    unwrap(this).addLayers(layers.let(ILayerVersion::unwrap))
  }

  public override fun architecture(): Architecture =
      unwrap(this).getArchitecture().let(Architecture::wrap)

  public open fun currentVersion(): Version = unwrap(this).getCurrentVersion().let(Version::wrap)

  public open fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  public open fun deadLetterTopic(): ITopic? = unwrap(this).getDeadLetterTopic()?.let(ITopic::wrap)

  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  public override fun functionName(): String = unwrap(this).getFunctionName()

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun invalidateVersionBasedOn(x: String) {
    unwrap(this).invalidateVersionBasedOn(x)
  }

  public open fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)

  public override fun permissionsNode(): Node = unwrap(this).getPermissionsNode().let(Node::wrap)

  public override fun resourceArnsForGrantInvoke(): List<String> =
      unwrap(this).getResourceArnsForGrantInvoke() ?: emptyList()

  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public open fun runtime(): Runtime = unwrap(this).getRuntime().let(Runtime::wrap)

  public open fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public interface Builder {
    public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4764e4d9e828b7cd732d664fa1d778954b45cc3bccec1851d3f02556688e0988")
    public
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit) {
    }

    public fun allowAllOutbound(allowAllOutbound: Boolean) {
    }

    public fun allowPublicSubnet(allowPublicSubnet: Boolean) {
    }

    public fun applicationLogLevel(applicationLogLevel: String) {
    }

    public fun architecture(architecture: Architecture) {
    }

    public fun code(code: Code) {
    }

    public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
    }

    public fun currentVersionOptions(currentVersionOptions: VersionOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4abcc311dfa47bc240d258c435bc91c731f5942b6e6343ff379490176270ddb7")
    public fun currentVersionOptions(currentVersionOptions: VersionOptions.Builder.() -> Unit) {
    }

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
    }

    public fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean) {
    }

    public fun deadLetterTopic(deadLetterTopic: ITopic) {
    }

    public fun description(description: String) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun environmentEncryption(environmentEncryption: IKey) {
    }

    public fun ephemeralStorageSize(ephemeralStorageSize: Size) {
    }

    public fun events(events: List<IEventSource>) {
    }

    public fun filesystem(filesystem: FileSystem) {
    }

    public fun functionName(functionName: String) {
    }

    public fun handler(handler: String) {
    }

    public fun initialPolicy(initialPolicy: List<PolicyStatement>) {
    }

    public fun insightsVersion(insightsVersion: LambdaInsightsVersion) {
    }

    public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean) {
    }

    public fun layers(layers: List<ILayerVersion>) {
    }

    public fun logFormat(logFormat: String) {
    }

    public fun logGroup(logGroup: ILogGroup) {
    }

    public fun logRetention(logRetention: RetentionDays) {
    }

    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("088bdc15b3a181940514d32cdcebb40d7221395edfb1fa50b7faea2eaa9d8b8f")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit) {
    }

    public fun logRetentionRole(logRetentionRole: IRole) {
    }

    public fun loggingFormat(loggingFormat: LoggingFormat) {
    }

    public fun maxEventAge(maxEventAge: Duration) {
    }

    public fun memorySize(memorySize: Number) {
    }

    public fun onFailure(onFailure: IDestination) {
    }

    public fun onSuccess(onSuccess: IDestination) {
    }

    public fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion) {
    }

    public fun profiling(profiling: Boolean) {
    }

    public fun profilingGroup(profilingGroup: IProfilingGroup) {
    }

    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
    }

    public fun retryAttempts(retryAttempts: Number) {
    }

    public fun role(role: IRole) {
    }

    public fun runtime(runtime: Runtime) {
    }

    public fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun snapStart(snapStart: SnapStartConf) {
    }

    public fun systemLogLevel(systemLogLevel: String) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun tracing(tracing: Tracing) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("631d3ec4a0e7d0f4307af3b095b14f14e04491a13c22d3163e9c7bb909e2e7a0")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Function.Builder =
        software.amazon.awscdk.services.lambda.Function.Builder.create(scope, id)

    public override fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
      cdkBuilder.adotInstrumentation(adotInstrumentation.let(AdotInstrumentationConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4764e4d9e828b7cd732d664fa1d778954b45cc3bccec1851d3f02556688e0988")
    public override
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit):
        Unit = adotInstrumentation(AdotInstrumentationConfig(adotInstrumentation))

    public override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    public override fun allowPublicSubnet(allowPublicSubnet: Boolean) {
      cdkBuilder.allowPublicSubnet(allowPublicSubnet)
    }

    public override fun applicationLogLevel(applicationLogLevel: String) {
      cdkBuilder.applicationLogLevel(applicationLogLevel)
    }

    public override fun architecture(architecture: Architecture) {
      cdkBuilder.architecture(architecture.let(Architecture::unwrap))
    }

    public override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    public override fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
      cdkBuilder.codeSigningConfig(codeSigningConfig.let(ICodeSigningConfig::unwrap))
    }

    public override fun currentVersionOptions(currentVersionOptions: VersionOptions) {
      cdkBuilder.currentVersionOptions(currentVersionOptions.let(VersionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4abcc311dfa47bc240d258c435bc91c731f5942b6e6343ff379490176270ddb7")
    public override
        fun currentVersionOptions(currentVersionOptions: VersionOptions.Builder.() -> Unit): Unit =
        currentVersionOptions(VersionOptions(currentVersionOptions))

    public override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    public override fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean) {
      cdkBuilder.deadLetterQueueEnabled(deadLetterQueueEnabled)
    }

    public override fun deadLetterTopic(deadLetterTopic: ITopic) {
      cdkBuilder.deadLetterTopic(deadLetterTopic.let(ITopic::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    public override fun environmentEncryption(environmentEncryption: IKey) {
      cdkBuilder.environmentEncryption(environmentEncryption.let(IKey::unwrap))
    }

    public override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

    public override fun events(events: List<IEventSource>) {
      cdkBuilder.events(events.map(IEventSource::unwrap))
    }

    public override fun filesystem(filesystem: FileSystem) {
      cdkBuilder.filesystem(filesystem.let(FileSystem::unwrap))
    }

    public override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    public override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    public override fun initialPolicy(initialPolicy: List<PolicyStatement>) {
      cdkBuilder.initialPolicy(initialPolicy.map(PolicyStatement::unwrap))
    }

    public override fun insightsVersion(insightsVersion: LambdaInsightsVersion) {
      cdkBuilder.insightsVersion(insightsVersion.let(LambdaInsightsVersion::unwrap))
    }

    public override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean) {
      cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack)
    }

    public override fun layers(layers: List<ILayerVersion>) {
      cdkBuilder.layers(layers.map(ILayerVersion::unwrap))
    }

    public override fun logFormat(logFormat: String) {
      cdkBuilder.logFormat(logFormat)
    }

    public override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    public override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("088bdc15b3a181940514d32cdcebb40d7221395edfb1fa50b7faea2eaa9d8b8f")
    public override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    public override fun logRetentionRole(logRetentionRole: IRole) {
      cdkBuilder.logRetentionRole(logRetentionRole.let(IRole::unwrap))
    }

    public override fun loggingFormat(loggingFormat: LoggingFormat) {
      cdkBuilder.loggingFormat(loggingFormat.let(LoggingFormat::unwrap))
    }

    public override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    public override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    public override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
    }

    public override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
    }

    public override fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion) {
      cdkBuilder.paramsAndSecrets(paramsAndSecrets.let(ParamsAndSecretsLayerVersion::unwrap))
    }

    public override fun profiling(profiling: Boolean) {
      cdkBuilder.profiling(profiling)
    }

    public override fun profilingGroup(profilingGroup: IProfilingGroup) {
      cdkBuilder.profilingGroup(profilingGroup.let(IProfilingGroup::unwrap))
    }

    public override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    public override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun runtime(runtime: Runtime) {
      cdkBuilder.runtime(runtime.let(Runtime::unwrap))
    }

    public override fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode) {
      cdkBuilder.runtimeManagementMode(runtimeManagementMode.let(RuntimeManagementMode::unwrap))
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun snapStart(snapStart: SnapStartConf) {
      cdkBuilder.snapStart(snapStart.let(SnapStartConf::unwrap))
    }

    public override fun systemLogLevel(systemLogLevel: String) {
      cdkBuilder.systemLogLevel(systemLogLevel)
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun tracing(tracing: Tracing) {
      cdkBuilder.tracing(tracing.let(Tracing::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("631d3ec4a0e7d0f4307af3b095b14f14e04491a13c22d3163e9c7bb909e2e7a0")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.lambda.Function = cdkBuilder.build()
  }

  public companion object {
    public open fun classifyVersionProperty(propertyName: String, locked: Boolean) {
      software.amazon.awscdk.services.lambda.Function.classifyVersionProperty(propertyName, locked)
    }

    public open fun fromFunctionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      functionArn: String,
    ): IFunction =
        software.amazon.awscdk.services.lambda.Function.fromFunctionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, functionArn).let(IFunction::wrap)

    public open fun fromFunctionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FunctionAttributes,
    ): IFunction =
        software.amazon.awscdk.services.lambda.Function.fromFunctionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FunctionAttributes::unwrap)).let(IFunction::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be73894ee09aa9caa0361125d5fc80897d26f578cd7cc02648549c1d0b1062bb")
    public open fun fromFunctionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FunctionAttributes.Builder.() -> Unit,
    ): IFunction = fromFunctionAttributes(scope, id, FunctionAttributes(attrs))

    public open fun fromFunctionName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      functionName: String,
    ): IFunction =
        software.amazon.awscdk.services.lambda.Function.fromFunctionName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, functionName).let(IFunction::wrap)

    public open fun metricAll(metricName: String): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAll(metricName).let(Metric::wrap)

    public open fun metricAll(metricName: String, props: MetricOptions): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAll(metricName,
        props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc2edb7e8860d33b2c02a5d62b7557e31ca2fd399a100f3532bebaf81fa8a856")
    public open fun metricAll(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metricAll(metricName, MetricOptions(props))

    public open fun metricAllConcurrentExecutions(): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllConcurrentExecutions().let(Metric::wrap)

    public open fun metricAllConcurrentExecutions(props: MetricOptions): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllConcurrentExecutions(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c4f98f397f9a528f3388c2a99ef50c82f09977adaf6d2cc196e75e535b501e0")
    public open fun metricAllConcurrentExecutions(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllConcurrentExecutions(MetricOptions(props))

    public open fun metricAllDuration(): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllDuration().let(Metric::wrap)

    public open fun metricAllDuration(props: MetricOptions): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllDuration(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47fd8d126b0111e98cdf43dde6835e8bceb9ef2c0f487ac419b338f7d817d29f")
    public open fun metricAllDuration(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllDuration(MetricOptions(props))

    public open fun metricAllErrors(): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllErrors().let(Metric::wrap)

    public open fun metricAllErrors(props: MetricOptions): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllErrors(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02be5d5e0904f3b9e8a88bd3aba46ee0a0c7ae74c34a034662cd2afa9629a23f")
    public open fun metricAllErrors(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllErrors(MetricOptions(props))

    public open fun metricAllInvocations(): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllInvocations().let(Metric::wrap)

    public open fun metricAllInvocations(props: MetricOptions): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllInvocations(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("655b160f930dfc7a9874974090aa0355284c47d29be0a6dcdf7107d153996012")
    public open fun metricAllInvocations(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllInvocations(MetricOptions(props))

    public open fun metricAllThrottles(): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllThrottles().let(Metric::wrap)

    public open fun metricAllThrottles(props: MetricOptions): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllThrottles(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53d24ce3db7105fd145260702132bfd8014bc9d60943ee0d52b1547b7eaf4376")
    public open fun metricAllThrottles(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAllThrottles(MetricOptions(props))

    public open fun metricAllUnreservedConcurrentExecutions(): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllUnreservedConcurrentExecutions().let(Metric::wrap)

    public open fun metricAllUnreservedConcurrentExecutions(props: MetricOptions): Metric =
        software.amazon.awscdk.services.lambda.Function.metricAllUnreservedConcurrentExecutions(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07312553e32196b14ef74d9016b038298257d2df593e24775dc700b269a65e87")
    public open
        fun metricAllUnreservedConcurrentExecutions(props: MetricOptions.Builder.() -> Unit): Metric
        = metricAllUnreservedConcurrentExecutions(MetricOptions(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Function {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Function(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Function): Function =
        Function(cdkObject)

    internal fun unwrap(wrapped: Function): software.amazon.awscdk.services.lambda.Function =
        wrapped.cdkObject
  }
}
