package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ResponseCustomHeader {
  /**
   * The HTTP response header name.
   */
  public fun `header`(): String

  /**
   * A Boolean that determines whether CloudFront overrides a response header with the same name
   * received from the origin with the header specified here.
   */
  public fun `override`(): Boolean

  /**
   * The value for the HTTP response header.
   */
  public fun `value`(): String

  /**
   * A builder for [ResponseCustomHeader]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param header The HTTP response header name. 
     */
    public fun `header`(`header`: String)

    /**
     * @param override A Boolean that determines whether CloudFront overrides a response header with
     * the same name received from the origin with the header specified here. 
     */
    public fun `override`(`override`: Boolean)

    /**
     * @param value The value for the HTTP response header. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.ResponseCustomHeader.Builder
        = software.amazon.awscdk.services.cloudfront.ResponseCustomHeader.builder()

    /**
     * @param header The HTTP response header name. 
     */
    override fun `header`(`header`: String) {
      cdkBuilder.`header`(`header`)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides a response header with
     * the same name received from the origin with the header specified here. 
     */
    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    /**
     * @param value The value for the HTTP response header. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseCustomHeader =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseCustomHeader,
  ) : CdkObject(cdkObject), ResponseCustomHeader {
    /**
     * The HTTP response header name.
     */
    override fun `header`(): String = unwrap(this).getHeader()

    /**
     * A Boolean that determines whether CloudFront overrides a response header with the same name
     * received from the origin with the header specified here.
     */
    override fun `override`(): Boolean = unwrap(this).getOverride()

    /**
     * The value for the HTTP response header.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseCustomHeader {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseCustomHeader):
        ResponseCustomHeader = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseCustomHeader):
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeader = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.ResponseCustomHeader
  }
}
