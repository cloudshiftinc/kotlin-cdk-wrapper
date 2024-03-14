package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SageMakerCreateTrainingJob internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob,
) : TaskStateBase(cdkObject), IGrantable, IConnectable {
  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup::unwrap))
  }

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public interface Builder {
    public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85e6251e82851749ffbb8345476f4721b28659397b56857d25217c9023ed399d")
    public
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit) {
    }

    public fun comment(comment: String) {
    }

    public fun credentials(credentials: Credentials) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57a80a54a6aa13b345116065e55b816be8e93d9b56a8dbdba0d9da02f889cf4c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit) {
    }

    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    }

    public fun hyperparameters(hyperparameters: Map<String, Any>) {
    }

    public fun inputDataConfig(inputDataConfig: List<Channel>) {
    }

    public fun inputPath(inputPath: String) {
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
    }

    public fun outputDataConfig(outputDataConfig: OutputDataConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a76625af5b8863792b712fd8fd4cd0a98d17fffb031e83ee24c0ddc8f8a4d265")
    public fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun resourceConfig(resourceConfig: ResourceConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed81f6461e3639fa414b47bfe6ba51f523e2f2a8c294a32a70435e43ae4f8094")
    public fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit) {
    }

    public fun resultPath(resultPath: String) {
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
    }

    public fun role(role: IRole) {
    }

    public fun stateName(stateName: String) {
    }

    public fun stoppingCondition(stoppingCondition: StoppingCondition) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed05c1496d0f9c6d41b71d78070b05fc0dafae22a382a628e3bfb389053ea333")
    public fun stoppingCondition(stoppingCondition: StoppingCondition.Builder.() -> Unit) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun taskTimeout(taskTimeout: Timeout) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
    }

    public fun trainingJobName(trainingJobName: String) {
    }

    public fun vpcConfig(vpcConfig: VpcConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f26418b73714fcc10e47b401365b2ecfc3c6a844dac0a52fe3e248eec3c5a157")
    public fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob.Builder.create(scope,
        id)

    public override fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification) {
      cdkBuilder.algorithmSpecification(algorithmSpecification.let(AlgorithmSpecification::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85e6251e82851749ffbb8345476f4721b28659397b56857d25217c9023ed399d")
    public override
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit):
        Unit = algorithmSpecification(AlgorithmSpecification(algorithmSpecification))

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57a80a54a6aa13b345116065e55b816be8e93d9b56a8dbdba0d9da02f889cf4c")
    public override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    public override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    public override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    public override fun hyperparameters(hyperparameters: Map<String, Any>) {
      cdkBuilder.hyperparameters(hyperparameters)
    }

    public override fun inputDataConfig(inputDataConfig: List<Channel>) {
      cdkBuilder.inputDataConfig(inputDataConfig.map(Channel::unwrap))
    }

    public override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    public override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    public override fun outputDataConfig(outputDataConfig: OutputDataConfig) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(OutputDataConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a76625af5b8863792b712fd8fd4cd0a98d17fffb031e83ee24c0ddc8f8a4d265")
    public override fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit):
        Unit = outputDataConfig(OutputDataConfig(outputDataConfig))

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun resourceConfig(resourceConfig: ResourceConfig) {
      cdkBuilder.resourceConfig(resourceConfig.let(ResourceConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed81f6461e3639fa414b47bfe6ba51f523e2f2a8c294a32a70435e43ae4f8094")
    public override fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit): Unit =
        resourceConfig(ResourceConfig(resourceConfig))

    public override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public override fun stoppingCondition(stoppingCondition: StoppingCondition) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingCondition::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed05c1496d0f9c6d41b71d78070b05fc0dafae22a382a628e3bfb389053ea333")
    public override fun stoppingCondition(stoppingCondition: StoppingCondition.Builder.() -> Unit):
        Unit = stoppingCondition(StoppingCondition(stoppingCondition))

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun trainingJobName(trainingJobName: String) {
      cdkBuilder.trainingJobName(trainingJobName)
    }

    public override fun vpcConfig(vpcConfig: VpcConfig) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f26418b73714fcc10e47b401365b2ecfc3c6a844dac0a52fe3e248eec3c5a157")
    public override fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfig(vpcConfig))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SageMakerCreateTrainingJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SageMakerCreateTrainingJob(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob):
        SageMakerCreateTrainingJob = SageMakerCreateTrainingJob(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTrainingJob):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob =
        wrapped.cdkObject
  }
}
