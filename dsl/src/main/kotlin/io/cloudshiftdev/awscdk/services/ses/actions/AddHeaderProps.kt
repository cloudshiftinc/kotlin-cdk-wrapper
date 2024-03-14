package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface AddHeaderProps {
  /**
   * The name of the header to add.
   *
   * Must be between 1 and 50 characters,
   * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters
   * and dashes only.
   */
  public fun name(): String

  /**
   * The value of the header to add.
   *
   * Must be less than 2048 characters,
   * and must not contain newline characters ("\r" or "\n").
   */
  public fun `value`(): String

  /**
   * A builder for [AddHeaderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the header to add. 
     * Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters
     * and dashes only.
     */
    public fun name(name: String)

    /**
     * @param value The value of the header to add. 
     * Must be less than 2048 characters,
     * and must not contain newline characters ("\r" or "\n").
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.AddHeaderProps.Builder =
        software.amazon.awscdk.services.ses.actions.AddHeaderProps.builder()

    /**
     * @param name The name of the header to add. 
     * Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters
     * and dashes only.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param value The value of the header to add. 
     * Must be less than 2048 characters,
     * and must not contain newline characters ("\r" or "\n").
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.AddHeaderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.AddHeaderProps,
  ) : CdkObject(cdkObject), AddHeaderProps {
    /**
     * The name of the header to add.
     *
     * Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters
     * and dashes only.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The value of the header to add.
     *
     * Must be less than 2048 characters,
     * and must not contain newline characters ("\r" or "\n").
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddHeaderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.AddHeaderProps):
        AddHeaderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddHeaderProps):
        software.amazon.awscdk.services.ses.actions.AddHeaderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.AddHeaderProps
  }
}
