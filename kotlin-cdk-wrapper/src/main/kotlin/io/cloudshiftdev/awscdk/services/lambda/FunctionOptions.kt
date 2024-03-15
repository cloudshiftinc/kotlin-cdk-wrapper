@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codeguruprofiler.IProfilingGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface FunctionOptions : EventInvokeConfigOptions {
  public fun adotInstrumentation(): AdotInstrumentationConfig? =
      unwrap(this).getAdotInstrumentation()?.let(AdotInstrumentationConfig::wrap)

  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  public fun allowPublicSubnet(): Boolean? = unwrap(this).getAllowPublicSubnet()

  public fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

  public fun architecture(): Architecture? = unwrap(this).getArchitecture()?.let(Architecture::wrap)

  public fun codeSigningConfig(): ICodeSigningConfig? =
      unwrap(this).getCodeSigningConfig()?.let(ICodeSigningConfig::wrap)

  public fun currentVersionOptions(): VersionOptions? =
      unwrap(this).getCurrentVersionOptions()?.let(VersionOptions::wrap)

  public fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  public fun deadLetterQueueEnabled(): Boolean? = unwrap(this).getDeadLetterQueueEnabled()

  public fun deadLetterTopic(): ITopic? = unwrap(this).getDeadLetterTopic()?.let(ITopic::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun environmentEncryption(): IKey? =
      unwrap(this).getEnvironmentEncryption()?.let(IKey::wrap)

  public fun ephemeralStorageSize(): Size? = unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  public fun events(): List<IEventSource> = unwrap(this).getEvents()?.map(IEventSource::wrap) ?:
      emptyList()

  public fun filesystem(): FileSystem? = unwrap(this).getFilesystem()?.let(FileSystem::wrap)

  public fun functionName(): String? = unwrap(this).getFunctionName()

  public fun initialPolicy(): List<PolicyStatement> =
      unwrap(this).getInitialPolicy()?.map(PolicyStatement::wrap) ?: emptyList()

  public fun insightsVersion(): LambdaInsightsVersion? =
      unwrap(this).getInsightsVersion()?.let(LambdaInsightsVersion::wrap)

  public fun ipv6AllowedForDualStack(): Boolean? = unwrap(this).getIpv6AllowedForDualStack()

  public fun layers(): List<ILayerVersion> = unwrap(this).getLayers()?.map(ILayerVersion::wrap) ?:
      emptyList()

  public fun logFormat(): String? = unwrap(this).getLogFormat()

  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  public fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
      unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

  public fun logRetentionRole(): IRole? = unwrap(this).getLogRetentionRole()?.let(IRole::wrap)

  public fun loggingFormat(): LoggingFormat? =
      unwrap(this).getLoggingFormat()?.let(LoggingFormat::wrap)

  public fun memorySize(): Number? = unwrap(this).getMemorySize()

  public fun paramsAndSecrets(): ParamsAndSecretsLayerVersion? =
      unwrap(this).getParamsAndSecrets()?.let(ParamsAndSecretsLayerVersion::wrap)

  public fun profiling(): Boolean? = unwrap(this).getProfiling()

  public fun profilingGroup(): IProfilingGroup? =
      unwrap(this).getProfilingGroup()?.let(IProfilingGroup::wrap)

  public fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun runtimeManagementMode(): RuntimeManagementMode? =
      unwrap(this).getRuntimeManagementMode()?.let(RuntimeManagementMode::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun snapStart(): SnapStartConf? = unwrap(this).getSnapStart()?.let(SnapStartConf::wrap)

  public fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun tracing(): Tracing? = unwrap(this).getTracing()?.let(Tracing::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c8699e42a90bb9b439e57464cbe2587aafcaaf47feb1136b12e88efcc533873")
    public
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit)

    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun allowPublicSubnet(allowPublicSubnet: Boolean)

    public fun applicationLogLevel(applicationLogLevel: String)

    public fun architecture(architecture: Architecture)

    public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig)

    public fun currentVersionOptions(currentVersionOptions: VersionOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16c65f23dea2c4debc722327e20ec2853e3c3603481f42139296d132e3265930")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3771287004587a937e71351eb562513dd04d3fe3984ff4a4e1afb362a0939497")
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

    public fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun snapStart(snapStart: SnapStartConf)

    public fun systemLogLevel(systemLogLevel: String)

    public fun timeout(timeout: Duration)

    public fun tracing(tracing: Tracing)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d842e45c3ac87b92650bd03edcbc13b517b1dc5db8697b7b2059b937498491f")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionOptions.Builder =
        software.amazon.awscdk.services.lambda.FunctionOptions.builder()

    override fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
      cdkBuilder.adotInstrumentation(adotInstrumentation.let(AdotInstrumentationConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c8699e42a90bb9b439e57464cbe2587aafcaaf47feb1136b12e88efcc533873")
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

    override fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
      cdkBuilder.codeSigningConfig(codeSigningConfig.let(ICodeSigningConfig::unwrap))
    }

    override fun currentVersionOptions(currentVersionOptions: VersionOptions) {
      cdkBuilder.currentVersionOptions(currentVersionOptions.let(VersionOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16c65f23dea2c4debc722327e20ec2853e3c3603481f42139296d132e3265930")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3771287004587a937e71351eb562513dd04d3fe3984ff4a4e1afb362a0939497")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d842e45c3ac87b92650bd03edcbc13b517b1dc5db8697b7b2059b937498491f")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.lambda.FunctionOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.FunctionOptions,
  ) : CdkObject(cdkObject), FunctionOptions {
    override fun adotInstrumentation(): AdotInstrumentationConfig? =
        unwrap(this).getAdotInstrumentation()?.let(AdotInstrumentationConfig::wrap)

    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    override fun allowPublicSubnet(): Boolean? = unwrap(this).getAllowPublicSubnet()

    override fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

    override fun architecture(): Architecture? =
        unwrap(this).getArchitecture()?.let(Architecture::wrap)

    override fun codeSigningConfig(): ICodeSigningConfig? =
        unwrap(this).getCodeSigningConfig()?.let(ICodeSigningConfig::wrap)

    override fun currentVersionOptions(): VersionOptions? =
        unwrap(this).getCurrentVersionOptions()?.let(VersionOptions::wrap)

    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    override fun deadLetterQueueEnabled(): Boolean? = unwrap(this).getDeadLetterQueueEnabled()

    override fun deadLetterTopic(): ITopic? = unwrap(this).getDeadLetterTopic()?.let(ITopic::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun environmentEncryption(): IKey? =
        unwrap(this).getEnvironmentEncryption()?.let(IKey::wrap)

    override fun ephemeralStorageSize(): Size? =
        unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

    override fun events(): List<IEventSource> = unwrap(this).getEvents()?.map(IEventSource::wrap) ?:
        emptyList()

    override fun filesystem(): FileSystem? = unwrap(this).getFilesystem()?.let(FileSystem::wrap)

    override fun functionName(): String? = unwrap(this).getFunctionName()

    override fun initialPolicy(): List<PolicyStatement> =
        unwrap(this).getInitialPolicy()?.map(PolicyStatement::wrap) ?: emptyList()

    override fun insightsVersion(): LambdaInsightsVersion? =
        unwrap(this).getInsightsVersion()?.let(LambdaInsightsVersion::wrap)

    override fun ipv6AllowedForDualStack(): Boolean? = unwrap(this).getIpv6AllowedForDualStack()

    override fun layers(): List<ILayerVersion> = unwrap(this).getLayers()?.map(ILayerVersion::wrap)
        ?: emptyList()

    override fun logFormat(): String? = unwrap(this).getLogFormat()

    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    override fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
        unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

    override fun logRetentionRole(): IRole? = unwrap(this).getLogRetentionRole()?.let(IRole::wrap)

    override fun loggingFormat(): LoggingFormat? =
        unwrap(this).getLoggingFormat()?.let(LoggingFormat::wrap)

    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    override fun memorySize(): Number? = unwrap(this).getMemorySize()

    override fun onFailure(): IDestination? = unwrap(this).getOnFailure()?.let(IDestination::wrap)

    override fun onSuccess(): IDestination? = unwrap(this).getOnSuccess()?.let(IDestination::wrap)

    override fun paramsAndSecrets(): ParamsAndSecretsLayerVersion? =
        unwrap(this).getParamsAndSecrets()?.let(ParamsAndSecretsLayerVersion::wrap)

    override fun profiling(): Boolean? = unwrap(this).getProfiling()

    override fun profilingGroup(): IProfilingGroup? =
        unwrap(this).getProfilingGroup()?.let(IProfilingGroup::wrap)

    override fun reservedConcurrentExecutions(): Number? =
        unwrap(this).getReservedConcurrentExecutions()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runtimeManagementMode(): RuntimeManagementMode? =
        unwrap(this).getRuntimeManagementMode()?.let(RuntimeManagementMode::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun snapStart(): SnapStartConf? = unwrap(this).getSnapStart()?.let(SnapStartConf::wrap)

    override fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun tracing(): Tracing? = unwrap(this).getTracing()?.let(Tracing::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionOptions):
        FunctionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionOptions):
        software.amazon.awscdk.services.lambda.FunctionOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.FunctionOptions
  }
}
