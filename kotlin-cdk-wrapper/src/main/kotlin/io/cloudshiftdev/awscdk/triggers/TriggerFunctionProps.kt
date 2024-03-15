@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.triggers

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
import io.cloudshiftdev.awscdk.services.lambda.AdotInstrumentationConfig
import io.cloudshiftdev.awscdk.services.lambda.Architecture
import io.cloudshiftdev.awscdk.services.lambda.Code
import io.cloudshiftdev.awscdk.services.lambda.FileSystem
import io.cloudshiftdev.awscdk.services.lambda.FunctionProps
import io.cloudshiftdev.awscdk.services.lambda.ICodeSigningConfig
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import io.cloudshiftdev.awscdk.services.lambda.LambdaInsightsVersion
import io.cloudshiftdev.awscdk.services.lambda.LogRetentionRetryOptions
import io.cloudshiftdev.awscdk.services.lambda.LoggingFormat
import io.cloudshiftdev.awscdk.services.lambda.ParamsAndSecretsLayerVersion
import io.cloudshiftdev.awscdk.services.lambda.Runtime
import io.cloudshiftdev.awscdk.services.lambda.RuntimeManagementMode
import io.cloudshiftdev.awscdk.services.lambda.SnapStartConf
import io.cloudshiftdev.awscdk.services.lambda.Tracing
import io.cloudshiftdev.awscdk.services.lambda.VersionOptions
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface TriggerFunctionProps : FunctionProps, TriggerOptions {
  @CdkDslMarker
  public interface Builder {
    public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e363b4b037af32d705205f86bc60a771e978dc278a4a5dfbcd2afb3fd563e78")
    public
        fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig.Builder.() -> Unit)

    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun allowPublicSubnet(allowPublicSubnet: Boolean)

    public fun applicationLogLevel(applicationLogLevel: String)

    public fun architecture(architecture: Architecture)

    public fun code(code: Code)

    public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig)

    public fun currentVersionOptions(currentVersionOptions: VersionOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad75f93c7c714da448574e5e7559476bb4db98b92933b2ad79475be701531e38")
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

    public fun executeAfter(executeAfter: List<Construct>)

    public fun executeAfter(vararg executeAfter: Construct)

    public fun executeBefore(executeBefore: List<Construct>)

    public fun executeBefore(vararg executeBefore: Construct)

    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean)

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf316952d9ce591a9bfa4025bf6204704f6128b7134c254ec6a2ae72017e2b9e")
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

    public fun systemLogLevel(systemLogLevel: String)

    public fun timeout(timeout: Duration)

    public fun tracing(tracing: Tracing)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379492f3d958a9e4b7a01a11d0bbec3cd2cc0f8fb12d8a23395c38ee793242cc")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.triggers.TriggerFunctionProps.Builder =
        software.amazon.awscdk.triggers.TriggerFunctionProps.builder()

    override fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
      cdkBuilder.adotInstrumentation(adotInstrumentation.let(AdotInstrumentationConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e363b4b037af32d705205f86bc60a771e978dc278a4a5dfbcd2afb3fd563e78")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad75f93c7c714da448574e5e7559476bb4db98b92933b2ad79475be701531e38")
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

    override fun executeAfter(executeAfter: List<Construct>) {
      cdkBuilder.executeAfter(executeAfter.map(Construct::unwrap))
    }

    override fun executeAfter(vararg executeAfter: Construct): Unit =
        executeAfter(executeAfter.toList())

    override fun executeBefore(executeBefore: List<Construct>) {
      cdkBuilder.executeBefore(executeBefore.map(Construct::unwrap))
    }

    override fun executeBefore(vararg executeBefore: Construct): Unit =
        executeBefore(executeBefore.toList())

    override fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
      cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf316952d9ce591a9bfa4025bf6204704f6128b7134c254ec6a2ae72017e2b9e")
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
    @JvmName("379492f3d958a9e4b7a01a11d0bbec3cd2cc0f8fb12d8a23395c38ee793242cc")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.triggers.TriggerFunctionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.triggers.TriggerFunctionProps,
  ) : CdkObject(cdkObject), TriggerFunctionProps {
    override fun adotInstrumentation(): AdotInstrumentationConfig? =
        unwrap(this).getAdotInstrumentation()?.let(AdotInstrumentationConfig::wrap)

    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    override fun allowPublicSubnet(): Boolean? = unwrap(this).getAllowPublicSubnet()

    override fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

    override fun architecture(): Architecture? =
        unwrap(this).getArchitecture()?.let(Architecture::wrap)

    override fun code(): Code = unwrap(this).getCode().let(Code::wrap)

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

    override fun executeAfter(): List<Construct> =
        unwrap(this).getExecuteAfter()?.map(Construct::wrap) ?: emptyList()

    override fun executeBefore(): List<Construct> =
        unwrap(this).getExecuteBefore()?.map(Construct::wrap) ?: emptyList()

    override fun executeOnHandlerChange(): Boolean? = unwrap(this).getExecuteOnHandlerChange()

    override fun filesystem(): FileSystem? = unwrap(this).getFilesystem()?.let(FileSystem::wrap)

    override fun functionName(): String? = unwrap(this).getFunctionName()

    override fun handler(): String = unwrap(this).getHandler()

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

    override fun runtime(): Runtime = unwrap(this).getRuntime().let(Runtime::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): TriggerFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.TriggerFunctionProps):
        TriggerFunctionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TriggerFunctionProps):
        software.amazon.awscdk.triggers.TriggerFunctionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.triggers.TriggerFunctionProps
  }
}