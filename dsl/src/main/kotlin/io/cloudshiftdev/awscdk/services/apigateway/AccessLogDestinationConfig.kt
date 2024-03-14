package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface AccessLogDestinationConfig {
  /**
   * The Amazon Resource Name (ARN) of the destination resource.
   */
  public fun destinationArn(): String

  /**
   * A builder for [AccessLogDestinationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the destination resource. 
     */
    public fun destinationArn(destinationArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig.Builder =
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig.builder()

    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the destination resource. 
     */
    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig,
  ) : AccessLogDestinationConfig {
    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     */
    override fun destinationArn(): String = unwrap(this).getDestinationArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig):
        AccessLogDestinationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLogDestinationConfig):
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
