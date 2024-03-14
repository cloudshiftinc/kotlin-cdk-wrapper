package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DockerImageFunction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.DockerImageFunction,
) : Function(cdkObject) {
  public interface Builder {
    public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("472174091f97e68a8d2946adcb1ec74e01aaab7f5aba74c9e2d3dbbe276ff010")
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

    public fun code(code: DockerImageCode) {
    }

    public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
    }

    public fun currentVersionOptions(currentVersionOptions: VersionOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d263a4a89aa43d109a53ce62273a92f506752abf67bf6e0b360365553608abaa")
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
    @JvmName("06e5a1ecc5c5ec4420a79407a42d18e93559619f170f3fc849fb2fcce216cddd")
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
    @JvmName("e3ff5ff56911d0947ea6e5e54f14d5269f22c491140dda049d3f3955e02fe9f3")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DockerImageFunction.Builder =
        software.amazon.awscdk.services.lambda.DockerImageFunction.Builder.create(scope, id)

    public override fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
      cdkBuilder.adotInstrumentation(adotInstrumentation.let(AdotInstrumentationConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("472174091f97e68a8d2946adcb1ec74e01aaab7f5aba74c9e2d3dbbe276ff010")
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

    public override fun code(code: DockerImageCode) {
      cdkBuilder.code(code.let(DockerImageCode::unwrap))
    }

    public override fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
      cdkBuilder.codeSigningConfig(codeSigningConfig.let(ICodeSigningConfig::unwrap))
    }

    public override fun currentVersionOptions(currentVersionOptions: VersionOptions) {
      cdkBuilder.currentVersionOptions(currentVersionOptions.let(VersionOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d263a4a89aa43d109a53ce62273a92f506752abf67bf6e0b360365553608abaa")
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
    @JvmName("06e5a1ecc5c5ec4420a79407a42d18e93559619f170f3fc849fb2fcce216cddd")
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
    @JvmName("e3ff5ff56911d0947ea6e5e54f14d5269f22c491140dda049d3f3955e02fe9f3")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.lambda.DockerImageFunction =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DockerImageFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DockerImageFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DockerImageFunction):
        DockerImageFunction = DockerImageFunction(cdkObject)

    internal fun unwrap(wrapped: DockerImageFunction):
        software.amazon.awscdk.services.lambda.DockerImageFunction = wrapped.cdkObject
  }
}
