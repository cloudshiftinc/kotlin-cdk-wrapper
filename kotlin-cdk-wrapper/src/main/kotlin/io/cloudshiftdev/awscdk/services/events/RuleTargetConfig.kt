@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface RuleTargetConfig {
  public fun arn(): String

  public fun batchParameters(): CfnRule.BatchParametersProperty? =
      unwrap(this).getBatchParameters()?.let(CfnRule.BatchParametersProperty::wrap)

  public fun deadLetterConfig(): CfnRule.DeadLetterConfigProperty? =
      unwrap(this).getDeadLetterConfig()?.let(CfnRule.DeadLetterConfigProperty::wrap)

  public fun ecsParameters(): CfnRule.EcsParametersProperty? =
      unwrap(this).getEcsParameters()?.let(CfnRule.EcsParametersProperty::wrap)

  public fun httpParameters(): CfnRule.HttpParametersProperty? =
      unwrap(this).getHttpParameters()?.let(CfnRule.HttpParametersProperty::wrap)

  public fun input(): RuleTargetInput? = unwrap(this).getInput()?.let(RuleTargetInput::wrap)

  public fun kinesisParameters(): CfnRule.KinesisParametersProperty? =
      unwrap(this).getKinesisParameters()?.let(CfnRule.KinesisParametersProperty::wrap)

  public fun retryPolicy(): CfnRule.RetryPolicyProperty? =
      unwrap(this).getRetryPolicy()?.let(CfnRule.RetryPolicyProperty::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun runCommandParameters(): CfnRule.RunCommandParametersProperty? =
      unwrap(this).getRunCommandParameters()?.let(CfnRule.RunCommandParametersProperty::wrap)

  public fun sqsParameters(): CfnRule.SqsParametersProperty? =
      unwrap(this).getSqsParameters()?.let(CfnRule.SqsParametersProperty::wrap)

  public fun targetResource(): IConstruct? = unwrap(this).getTargetResource()?.let(IConstruct::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun arn(arn: String)

    public fun batchParameters(batchParameters: CfnRule.BatchParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63ec4b492a7ecc4ffc75ff86a19ed85df2f7928dff75bfb7e04d982245b1b6d")
    public fun batchParameters(batchParameters: CfnRule.BatchParametersProperty.Builder.() -> Unit)

    public fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e85270536d14505fffe54178fc689971246bb6af00e0bf77a81426c326ea2f53")
    public
        fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty.Builder.() -> Unit)

    public fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e382588b69af319bc8e83624e4b365cd953acb2ecdcab7643a26876e2a9505a8")
    public fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty.Builder.() -> Unit)

    public fun httpParameters(httpParameters: CfnRule.HttpParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ab52d3b2b121f8e9656cbc4a686a0ed0fe3de9a6fc1f225654bdba6e4b28a5b")
    public fun httpParameters(httpParameters: CfnRule.HttpParametersProperty.Builder.() -> Unit)

    public fun input(input: RuleTargetInput)

    public fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d24b7ccb7ef0d1fda33628839d220084ce7edb8bc579e0255a35223090460ca")
    public
        fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty.Builder.() -> Unit)

    public fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea96da985dcfdae3bbd951b9d559960c1d091aebcbdd7f43f257e4d8561e7fc1")
    public fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty.Builder.() -> Unit)

    public fun role(role: IRole)

    public fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd68e36e648c69e036435592fe1bbacfdcdb423fec12e5f023408f1dcead1261")
    public
        fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty.Builder.() -> Unit)

    public fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5fd422ee2361c2f24a7267a88879f53fe0943b76d7e4c15360aff71c078ae02")
    public fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty.Builder.() -> Unit)

    public fun targetResource(targetResource: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.RuleTargetConfig.Builder =
        software.amazon.awscdk.services.events.RuleTargetConfig.builder()

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun batchParameters(batchParameters: CfnRule.BatchParametersProperty) {
      cdkBuilder.batchParameters(batchParameters.let(CfnRule.BatchParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63ec4b492a7ecc4ffc75ff86a19ed85df2f7928dff75bfb7e04d982245b1b6d")
    override
        fun batchParameters(batchParameters: CfnRule.BatchParametersProperty.Builder.() -> Unit):
        Unit = batchParameters(CfnRule.BatchParametersProperty(batchParameters))

    override fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(CfnRule.DeadLetterConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e85270536d14505fffe54178fc689971246bb6af00e0bf77a81426c326ea2f53")
    override
        fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(CfnRule.DeadLetterConfigProperty(deadLetterConfig))

    override fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty) {
      cdkBuilder.ecsParameters(ecsParameters.let(CfnRule.EcsParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e382588b69af319bc8e83624e4b365cd953acb2ecdcab7643a26876e2a9505a8")
    override fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty.Builder.() -> Unit):
        Unit = ecsParameters(CfnRule.EcsParametersProperty(ecsParameters))

    override fun httpParameters(httpParameters: CfnRule.HttpParametersProperty) {
      cdkBuilder.httpParameters(httpParameters.let(CfnRule.HttpParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ab52d3b2b121f8e9656cbc4a686a0ed0fe3de9a6fc1f225654bdba6e4b28a5b")
    override fun httpParameters(httpParameters: CfnRule.HttpParametersProperty.Builder.() -> Unit):
        Unit = httpParameters(CfnRule.HttpParametersProperty(httpParameters))

    override fun input(input: RuleTargetInput) {
      cdkBuilder.input(input.let(RuleTargetInput::unwrap))
    }

    override fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty) {
      cdkBuilder.kinesisParameters(kinesisParameters.let(CfnRule.KinesisParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d24b7ccb7ef0d1fda33628839d220084ce7edb8bc579e0255a35223090460ca")
    override
        fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty.Builder.() -> Unit):
        Unit = kinesisParameters(CfnRule.KinesisParametersProperty(kinesisParameters))

    override fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty) {
      cdkBuilder.retryPolicy(retryPolicy.let(CfnRule.RetryPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea96da985dcfdae3bbd951b9d559960c1d091aebcbdd7f43f257e4d8561e7fc1")
    override fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty.Builder.() -> Unit): Unit =
        retryPolicy(CfnRule.RetryPolicyProperty(retryPolicy))

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty) {
      cdkBuilder.runCommandParameters(runCommandParameters.let(CfnRule.RunCommandParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd68e36e648c69e036435592fe1bbacfdcdb423fec12e5f023408f1dcead1261")
    override
        fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty.Builder.() -> Unit):
        Unit = runCommandParameters(CfnRule.RunCommandParametersProperty(runCommandParameters))

    override fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty) {
      cdkBuilder.sqsParameters(sqsParameters.let(CfnRule.SqsParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5fd422ee2361c2f24a7267a88879f53fe0943b76d7e4c15360aff71c078ae02")
    override fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty.Builder.() -> Unit):
        Unit = sqsParameters(CfnRule.SqsParametersProperty(sqsParameters))

    override fun targetResource(targetResource: IConstruct) {
      cdkBuilder.targetResource(targetResource.let(IConstruct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.RuleTargetConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.RuleTargetConfig,
  ) : CdkObject(cdkObject), RuleTargetConfig {
    override fun arn(): String = unwrap(this).getArn()

    override fun batchParameters(): CfnRule.BatchParametersProperty? =
        unwrap(this).getBatchParameters()?.let(CfnRule.BatchParametersProperty::wrap)

    override fun deadLetterConfig(): CfnRule.DeadLetterConfigProperty? =
        unwrap(this).getDeadLetterConfig()?.let(CfnRule.DeadLetterConfigProperty::wrap)

    override fun ecsParameters(): CfnRule.EcsParametersProperty? =
        unwrap(this).getEcsParameters()?.let(CfnRule.EcsParametersProperty::wrap)

    override fun httpParameters(): CfnRule.HttpParametersProperty? =
        unwrap(this).getHttpParameters()?.let(CfnRule.HttpParametersProperty::wrap)

    override fun input(): RuleTargetInput? = unwrap(this).getInput()?.let(RuleTargetInput::wrap)

    override fun kinesisParameters(): CfnRule.KinesisParametersProperty? =
        unwrap(this).getKinesisParameters()?.let(CfnRule.KinesisParametersProperty::wrap)

    override fun retryPolicy(): CfnRule.RetryPolicyProperty? =
        unwrap(this).getRetryPolicy()?.let(CfnRule.RetryPolicyProperty::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runCommandParameters(): CfnRule.RunCommandParametersProperty? =
        unwrap(this).getRunCommandParameters()?.let(CfnRule.RunCommandParametersProperty::wrap)

    override fun sqsParameters(): CfnRule.SqsParametersProperty? =
        unwrap(this).getSqsParameters()?.let(CfnRule.SqsParametersProperty::wrap)

    override fun targetResource(): IConstruct? =
        unwrap(this).getTargetResource()?.let(IConstruct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleTargetConfig):
        RuleTargetConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleTargetConfig):
        software.amazon.awscdk.services.events.RuleTargetConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.RuleTargetConfig
  }
}
