@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class ShellStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.ShellStep,
) : Step(cdkObject) {
  public open fun addOutputDirectory(directory: String): FileSet =
      unwrap(this).addOutputDirectory(directory).let(FileSet::wrap)

  public open fun commands(): List<String> = unwrap(this).getCommands()

  public override fun consumedStackOutputs(): List<StackOutputReference> =
      unwrap(this).getConsumedStackOutputs().map(StackOutputReference::wrap)

  public open fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  public open fun envFromCfnOutputs(): Map<String, StackOutputReference> =
      unwrap(this).getEnvFromCfnOutputs().mapValues{StackOutputReference.wrap(it.value)}

  public open fun inputs(): List<FileSetLocation> =
      unwrap(this).getInputs().map(FileSetLocation::wrap)

  public open fun installCommands(): List<String> = unwrap(this).getInstallCommands()

  public open fun outputs(): List<FileSetLocation> =
      unwrap(this).getOutputs().map(FileSetLocation::wrap)

  public open fun primaryOutputDirectory(directory: String): FileSet =
      unwrap(this).primaryOutputDirectory(directory).let(FileSet::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>)

    public fun commands(commands: List<String>)

    public fun commands(vararg commands: String)

    public fun env(env: Map<String, String>)

    public fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>)

    public fun input(input: IFileSetProducer)

    public fun installCommands(installCommands: List<String>)

    public fun installCommands(vararg installCommands: String)

    public fun primaryOutputDirectory(primaryOutputDirectory: String)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ShellStep.Builder =
        software.amazon.awscdk.pipelines.ShellStep.Builder.create(id)

    override fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>) {
      cdkBuilder.additionalInputs(additionalInputs.mapValues{IFileSetProducer.unwrap(it.value)})
    }

    override fun commands(commands: List<String>) {
      cdkBuilder.commands(commands)
    }

    override fun commands(vararg commands: String): Unit = commands(commands.toList())

    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

    override fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>) {
      cdkBuilder.envFromCfnOutputs(envFromCfnOutputs.mapValues{CfnOutput.unwrap(it.value)})
    }

    override fun input(input: IFileSetProducer) {
      cdkBuilder.input(input.let(IFileSetProducer::unwrap))
    }

    override fun installCommands(installCommands: List<String>) {
      cdkBuilder.installCommands(installCommands)
    }

    override fun installCommands(vararg installCommands: String): Unit =
        installCommands(installCommands.toList())

    override fun primaryOutputDirectory(primaryOutputDirectory: String) {
      cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
    }

    public fun build(): software.amazon.awscdk.pipelines.ShellStep = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}): ShellStep {
      val builderImpl = BuilderImpl(id)
      return ShellStep(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ShellStep): ShellStep =
        ShellStep(cdkObject)

    internal fun unwrap(wrapped: ShellStep): software.amazon.awscdk.pipelines.ShellStep =
        wrapped.cdkObject
  }
}
