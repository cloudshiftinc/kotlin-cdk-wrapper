@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DestroyCommand : CdkCommand {
  public fun args(): DestroyOptions? = unwrap(this).getArgs()?.let(DestroyOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun args(args: DestroyOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2116604710cd77aa15306e9dffd03e1a94fd9ae11ce16ff5d7d859163960e26")
    public fun args(args: DestroyOptions.Builder.() -> Unit)

    public fun enabled(enabled: Boolean)

    public fun expectError(expectError: Boolean)

    public fun expectedMessage(expectedMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DestroyCommand.Builder =
        software.amazon.awscdk.cloudassembly.schema.DestroyCommand.builder()

    override fun args(args: DestroyOptions) {
      cdkBuilder.args(args.let(DestroyOptions.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2116604710cd77aa15306e9dffd03e1a94fd9ae11ce16ff5d7d859163960e26")
    override fun args(args: DestroyOptions.Builder.() -> Unit): Unit = args(DestroyOptions(args))

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun expectError(expectError: Boolean) {
      cdkBuilder.expectError(expectError)
    }

    override fun expectedMessage(expectedMessage: String) {
      cdkBuilder.expectedMessage(expectedMessage)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DestroyCommand =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.DestroyCommand,
  ) : CdkObject(cdkObject),
      DestroyCommand {
    override fun args(): DestroyOptions? = unwrap(this).getArgs()?.let(DestroyOptions::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun expectError(): Boolean? = unwrap(this).getExpectError()

    override fun expectedMessage(): String? = unwrap(this).getExpectedMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DestroyCommand {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DestroyCommand):
        DestroyCommand = CdkObjectWrappers.wrap(cdkObject) as? DestroyCommand ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestroyCommand):
        software.amazon.awscdk.cloudassembly.schema.DestroyCommand = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DestroyCommand
  }
}
