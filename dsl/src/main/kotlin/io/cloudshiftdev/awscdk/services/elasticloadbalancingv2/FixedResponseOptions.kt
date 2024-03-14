package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface FixedResponseOptions {
  /**
   * Content Type of the response.
   *
   * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
   *
   * Default: - Automatically determined
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The response body.
   *
   * Default: - No body
   */
  public fun messageBody(): String? = unwrap(this).getMessageBody()

  /**
   * A builder for [FixedResponseOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentType Content Type of the response.
     * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     */
    public fun contentType(contentType: String)

    /**
     * @param messageBody The response body.
     */
    public fun messageBody(messageBody: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions.builder()

    /**
     * @param contentType Content Type of the response.
     * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param messageBody The response body.
     */
    override fun messageBody(messageBody: String) {
      cdkBuilder.messageBody(messageBody)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions,
  ) : CdkObject(cdkObject), FixedResponseOptions {
    /**
     * Content Type of the response.
     *
     * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     *
     * Default: - Automatically determined
     */
    override fun contentType(): String? = unwrap(this).getContentType()

    /**
     * The response body.
     *
     * Default: - No body
     */
    override fun messageBody(): String? = unwrap(this).getMessageBody()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions):
        FixedResponseOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FixedResponseOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions
  }
}
