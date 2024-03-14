package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CustomTestOptions {
  /**
   * The code of the canary script.
   */
  public fun code(): Code

  /**
   * The handler for the code.
   *
   * Must end with `.handler`.
   */
  public fun handler(): String

  /**
   * A builder for [CustomTestOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code The code of the canary script. 
     */
    public fun code(code: Code)

    /**
     * @param handler The handler for the code. 
     * Must end with `.handler`.
     */
    public fun handler(handler: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CustomTestOptions.Builder =
        software.amazon.awscdk.services.synthetics.CustomTestOptions.builder()

    /**
     * @param code The code of the canary script. 
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * @param handler The handler for the code. 
     * Must end with `.handler`.
     */
    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    public fun build(): software.amazon.awscdk.services.synthetics.CustomTestOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.synthetics.CustomTestOptions,
  ) : CustomTestOptions {
    /**
     * The code of the canary script.
     */
    override fun code(): Code = unwrap(this).getCode().let(Code::wrap)

    /**
     * The handler for the code.
     *
     * Must end with `.handler`.
     */
    override fun handler(): String = unwrap(this).getHandler()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CustomTestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CustomTestOptions):
        CustomTestOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomTestOptions):
        software.amazon.awscdk.services.synthetics.CustomTestOptions = (wrapped as
        Wrapper).cdkObject
  }
}
