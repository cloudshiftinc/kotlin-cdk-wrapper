@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Represents a cdk command i.e. `synth`, `deploy`, &amp; `destroy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * CdkCommand cdkCommand = CdkCommand.builder()
 * .enabled(false)
 * .expectedMessage("expectedMessage")
 * .expectError(false)
 * .build();
 * ```
 */
public interface CdkCommand {
  /**
   * Whether or not to run this command as part of the workflow This can be used if you only want to
   * test some of the workflow for example enable `synth` and disable `deploy` &amp; `destroy` in order
   * to limit the test to synthesis.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * If the runner should expect this command to fail.
   *
   * Default: false
   */
  public fun expectError(): Boolean? = unwrap(this).getExpectError()

  /**
   * This can be used in combination with `expectedError` to validate that a specific message is
   * returned.
   *
   * Default: - do not validate message
   */
  public fun expectedMessage(): String? = unwrap(this).getExpectedMessage()

  /**
   * A builder for [CdkCommand]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Whether or not to run this command as part of the workflow This can be used if
     * you only want to test some of the workflow for example enable `synth` and disable `deploy` &amp;
     * `destroy` in order to limit the test to synthesis.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param expectError If the runner should expect this command to fail.
     */
    public fun expectError(expectError: Boolean)

    /**
     * @param expectedMessage This can be used in combination with `expectedError` to validate that
     * a specific message is returned.
     */
    public fun expectedMessage(expectedMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.CdkCommand.Builder =
        software.amazon.awscdk.cloudassembly.schema.CdkCommand.builder()

    /**
     * @param enabled Whether or not to run this command as part of the workflow This can be used if
     * you only want to test some of the workflow for example enable `synth` and disable `deploy` &amp;
     * `destroy` in order to limit the test to synthesis.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param expectError If the runner should expect this command to fail.
     */
    override fun expectError(expectError: Boolean) {
      cdkBuilder.expectError(expectError)
    }

    /**
     * @param expectedMessage This can be used in combination with `expectedError` to validate that
     * a specific message is returned.
     */
    override fun expectedMessage(expectedMessage: String) {
      cdkBuilder.expectedMessage(expectedMessage)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.CdkCommand = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.CdkCommand,
  ) : CdkObject(cdkObject), CdkCommand {
    /**
     * Whether or not to run this command as part of the workflow This can be used if you only want
     * to test some of the workflow for example enable `synth` and disable `deploy` &amp; `destroy` in
     * order to limit the test to synthesis.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * If the runner should expect this command to fail.
     *
     * Default: false
     */
    override fun expectError(): Boolean? = unwrap(this).getExpectError()

    /**
     * This can be used in combination with `expectedError` to validate that a specific message is
     * returned.
     *
     * Default: - do not validate message
     */
    override fun expectedMessage(): String? = unwrap(this).getExpectedMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CdkCommand {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.CdkCommand): CdkCommand
        = CdkObjectWrappers.wrap(cdkObject) as CdkCommand

    internal fun unwrap(wrapped: CdkCommand): software.amazon.awscdk.cloudassembly.schema.CdkCommand
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.CdkCommand
  }
}
