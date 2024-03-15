@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface SageMakerCreateTrainingJobProps : TaskStateBaseProps {
  public fun algorithmSpecification(): AlgorithmSpecification

  public fun enableNetworkIsolation(): Boolean? = unwrap(this).getEnableNetworkIsolation()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun hyperparameters(): Map<String, Any> = unwrap(this).getHyperparameters() ?: emptyMap()

  public fun inputDataConfig(): List<Channel>

  public fun outputDataConfig(): OutputDataConfig

  public fun resourceConfig(): ResourceConfig? =
      unwrap(this).getResourceConfig()?.let(ResourceConfig::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun stoppingCondition(): StoppingCondition? =
      unwrap(this).getStoppingCondition()?.let(StoppingCondition::wrap)

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun trainingJobName(): String

  public fun vpcConfig(): VpcConfig? = unwrap(this).getVpcConfig()?.let(VpcConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a62dd329b20c5fbc313a557f900ab6b5335cdee6740df83f0817f71cacd3949f")
    public
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a73eb1e212d218edba51fd72ee2f10c8a7e6b9872a42855d7d8336a02cc0c000")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

    public fun environment(environment: Map<String, String>)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun hyperparameters(hyperparameters: Map<String, Any>)

    public fun inputDataConfig(inputDataConfig: List<Channel>)

    public fun inputDataConfig(vararg inputDataConfig: Channel)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun outputDataConfig(outputDataConfig: OutputDataConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("148eca6aaa48208c1417261edb06299348c8c6d0d05efce1c2a3f52e43b6701f")
    public fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit)

    public fun outputPath(outputPath: String)

    public fun resourceConfig(resourceConfig: ResourceConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e10711462a1cb6a118e39cc90fdfc47378f3c83c3d0c8dc7f016aaed0842f9a")
    public fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun role(role: IRole)

    public fun stateName(stateName: String)

    public fun stoppingCondition(stoppingCondition: StoppingCondition)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("700b01f8c12666b4d5f4b3148047df4df0b6c4b7988d060e067ac919d8fab24f")
    public fun stoppingCondition(stoppingCondition: StoppingCondition.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    public fun trainingJobName(trainingJobName: String)

    public fun vpcConfig(vpcConfig: VpcConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("446ace8c72d501f0e2e095a3266ee045c8ff9481fb95a964796d40a9583dfc38")
    public fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps.builder()

    override fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification) {
      cdkBuilder.algorithmSpecification(algorithmSpecification.let(AlgorithmSpecification::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a62dd329b20c5fbc313a557f900ab6b5335cdee6740df83f0817f71cacd3949f")
    override
        fun algorithmSpecification(algorithmSpecification: AlgorithmSpecification.Builder.() -> Unit):
        Unit = algorithmSpecification(AlgorithmSpecification(algorithmSpecification))

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a73eb1e212d218edba51fd72ee2f10c8a7e6b9872a42855d7d8336a02cc0c000")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun hyperparameters(hyperparameters: Map<String, Any>) {
      cdkBuilder.hyperparameters(hyperparameters)
    }

    override fun inputDataConfig(inputDataConfig: List<Channel>) {
      cdkBuilder.inputDataConfig(inputDataConfig.map(Channel::unwrap))
    }

    override fun inputDataConfig(vararg inputDataConfig: Channel): Unit =
        inputDataConfig(inputDataConfig.toList())

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun outputDataConfig(outputDataConfig: OutputDataConfig) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(OutputDataConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("148eca6aaa48208c1417261edb06299348c8c6d0d05efce1c2a3f52e43b6701f")
    override fun outputDataConfig(outputDataConfig: OutputDataConfig.Builder.() -> Unit): Unit =
        outputDataConfig(OutputDataConfig(outputDataConfig))

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun resourceConfig(resourceConfig: ResourceConfig) {
      cdkBuilder.resourceConfig(resourceConfig.let(ResourceConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e10711462a1cb6a118e39cc90fdfc47378f3c83c3d0c8dc7f016aaed0842f9a")
    override fun resourceConfig(resourceConfig: ResourceConfig.Builder.() -> Unit): Unit =
        resourceConfig(ResourceConfig(resourceConfig))

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun stoppingCondition(stoppingCondition: StoppingCondition) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingCondition::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("700b01f8c12666b4d5f4b3148047df4df0b6c4b7988d060e067ac919d8fab24f")
    override fun stoppingCondition(stoppingCondition: StoppingCondition.Builder.() -> Unit): Unit =
        stoppingCondition(StoppingCondition(stoppingCondition))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun trainingJobName(trainingJobName: String) {
      cdkBuilder.trainingJobName(trainingJobName)
    }

    override fun vpcConfig(vpcConfig: VpcConfig) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("446ace8c72d501f0e2e095a3266ee045c8ff9481fb95a964796d40a9583dfc38")
    override fun vpcConfig(vpcConfig: VpcConfig.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfig(vpcConfig))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps,
  ) : CdkObject(cdkObject), SageMakerCreateTrainingJobProps {
    override fun algorithmSpecification(): AlgorithmSpecification =
        unwrap(this).getAlgorithmSpecification().let(AlgorithmSpecification::wrap)

    override fun comment(): String? = unwrap(this).getComment()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun enableNetworkIsolation(): Boolean? = unwrap(this).getEnableNetworkIsolation()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun hyperparameters(): Map<String, Any> = unwrap(this).getHyperparameters() ?:
        emptyMap()

    override fun inputDataConfig(): List<Channel> =
        unwrap(this).getInputDataConfig().map(Channel::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun outputDataConfig(): OutputDataConfig =
        unwrap(this).getOutputDataConfig().let(OutputDataConfig::wrap)

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun resourceConfig(): ResourceConfig? =
        unwrap(this).getResourceConfig()?.let(ResourceConfig::wrap)

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun stoppingCondition(): StoppingCondition? =
        unwrap(this).getStoppingCondition()?.let(StoppingCondition::wrap)

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun trainingJobName(): String = unwrap(this).getTrainingJobName()

    override fun vpcConfig(): VpcConfig? = unwrap(this).getVpcConfig()?.let(VpcConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SageMakerCreateTrainingJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps):
        SageMakerCreateTrainingJobProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateTrainingJobProps):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps
  }
}
