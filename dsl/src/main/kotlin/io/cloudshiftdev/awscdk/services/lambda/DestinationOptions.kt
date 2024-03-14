package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface DestinationOptions {
  /**
   * The destination type.
   */
  public fun type(): DestinationType

  /**
   * A builder for [DestinationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param type The destination type. 
     */
    public fun type(type: DestinationType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DestinationOptions.Builder =
        software.amazon.awscdk.services.lambda.DestinationOptions.builder()

    /**
     * @param type The destination type. 
     */
    override fun type(type: DestinationType) {
      cdkBuilder.type(type.let(DestinationType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.DestinationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.DestinationOptions,
  ) : CdkObject(cdkObject), DestinationOptions {
    /**
     * The destination type.
     */
    override fun type(): DestinationType = unwrap(this).getType().let(DestinationType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DestinationOptions):
        DestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestinationOptions):
        software.amazon.awscdk.services.lambda.DestinationOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.DestinationOptions
  }
}
