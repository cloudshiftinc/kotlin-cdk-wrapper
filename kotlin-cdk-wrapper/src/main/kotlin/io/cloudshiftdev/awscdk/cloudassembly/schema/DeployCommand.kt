@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DeployCommand : CdkCommand {
  public fun args(): DeployOptions? = unwrap(this).getArgs()?.let(DeployOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun args(args: DeployOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8f9b2cbe8868946722f2598a0cf02dea231caa7b9e25e519c97fb88051665f4")
    public fun args(args: DeployOptions.Builder.() -> Unit)

    public fun enabled(enabled: Boolean)

    public fun expectError(expectError: Boolean)

    public fun expectedMessage(expectedMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DeployCommand.Builder =
        software.amazon.awscdk.cloudassembly.schema.DeployCommand.builder()

    override fun args(args: DeployOptions) {
      cdkBuilder.args(args.let(DeployOptions.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8f9b2cbe8868946722f2598a0cf02dea231caa7b9e25e519c97fb88051665f4")
    override fun args(args: DeployOptions.Builder.() -> Unit): Unit = args(DeployOptions(args))

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun expectError(expectError: Boolean) {
      cdkBuilder.expectError(expectError)
    }

    override fun expectedMessage(expectedMessage: String) {
      cdkBuilder.expectedMessage(expectedMessage)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DeployCommand =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.DeployCommand,
  ) : CdkObject(cdkObject),
      DeployCommand {
    override fun args(): DeployOptions? = unwrap(this).getArgs()?.let(DeployOptions::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun expectError(): Boolean? = unwrap(this).getExpectError()

    override fun expectedMessage(): String? = unwrap(this).getExpectedMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeployCommand {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DeployCommand):
        DeployCommand = CdkObjectWrappers.wrap(cdkObject) as? DeployCommand ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeployCommand):
        software.amazon.awscdk.cloudassembly.schema.DeployCommand = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.DeployCommand
  }
}
