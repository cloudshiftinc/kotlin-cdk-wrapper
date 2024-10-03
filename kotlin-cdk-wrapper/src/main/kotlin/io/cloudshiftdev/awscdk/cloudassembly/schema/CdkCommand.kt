@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CdkCommand {
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun expectError(): Boolean? = unwrap(this).getExpectError()

  public fun expectedMessage(): String? = unwrap(this).getExpectedMessage()

  @CdkDslMarker
  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun expectError(expectError: Boolean)

    public fun expectedMessage(expectedMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.CdkCommand.Builder =
        software.amazon.awscdk.cloudassembly.schema.CdkCommand.builder()

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun expectError(expectError: Boolean) {
      cdkBuilder.expectError(expectError)
    }

    override fun expectedMessage(expectedMessage: String) {
      cdkBuilder.expectedMessage(expectedMessage)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.CdkCommand = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.CdkCommand,
  ) : CdkObject(cdkObject),
      CdkCommand {
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun expectError(): Boolean? = unwrap(this).getExpectError()

    override fun expectedMessage(): String? = unwrap(this).getExpectedMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CdkCommand {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.CdkCommand): CdkCommand
        = CdkObjectWrappers.wrap(cdkObject) as? CdkCommand ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CdkCommand): software.amazon.awscdk.cloudassembly.schema.CdkCommand
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.CdkCommand
  }
}
