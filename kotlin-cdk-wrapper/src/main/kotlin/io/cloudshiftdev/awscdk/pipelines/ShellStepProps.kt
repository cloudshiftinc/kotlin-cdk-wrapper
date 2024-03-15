@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ShellStepProps {
  public fun additionalInputs(): Map<String, IFileSetProducer> =
      unwrap(this).getAdditionalInputs()?.mapValues{IFileSetProducer.wrap(it.value)} ?: emptyMap()

  public fun commands(): List<String>

  public fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  public fun envFromCfnOutputs(): Map<String, CfnOutput> =
      unwrap(this).getEnvFromCfnOutputs()?.mapValues{CfnOutput.wrap(it.value)} ?: emptyMap()

  public fun input(): IFileSetProducer? = unwrap(this).getInput()?.let(IFileSetProducer::wrap)

  public fun installCommands(): List<String> = unwrap(this).getInstallCommands() ?: emptyList()

  public fun primaryOutputDirectory(): String? = unwrap(this).getPrimaryOutputDirectory()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ShellStepProps.Builder =
        software.amazon.awscdk.pipelines.ShellStepProps.builder()

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

    public fun build(): software.amazon.awscdk.pipelines.ShellStepProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ShellStepProps,
  ) : CdkObject(cdkObject), ShellStepProps {
    override fun additionalInputs(): Map<String, IFileSetProducer> =
        unwrap(this).getAdditionalInputs()?.mapValues{IFileSetProducer.wrap(it.value)} ?: emptyMap()

    override fun commands(): List<String> = unwrap(this).getCommands()

    override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

    override fun envFromCfnOutputs(): Map<String, CfnOutput> =
        unwrap(this).getEnvFromCfnOutputs()?.mapValues{CfnOutput.wrap(it.value)} ?: emptyMap()

    override fun input(): IFileSetProducer? = unwrap(this).getInput()?.let(IFileSetProducer::wrap)

    override fun installCommands(): List<String> = unwrap(this).getInstallCommands() ?: emptyList()

    override fun primaryOutputDirectory(): String? = unwrap(this).getPrimaryOutputDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ShellStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ShellStepProps): ShellStepProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ShellStepProps): software.amazon.awscdk.pipelines.ShellStepProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.ShellStepProps
  }
}
