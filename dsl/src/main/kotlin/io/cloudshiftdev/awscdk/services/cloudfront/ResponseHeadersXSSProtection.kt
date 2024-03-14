package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ResponseHeadersXSSProtection {
  /**
   * A Boolean that determines whether CloudFront includes the mode=block directive in the
   * X-XSS-Protection header.
   *
   * Default: false
   */
  public fun modeBlock(): Boolean? = unwrap(this).getModeBlock()

  /**
   * A Boolean that determines whether CloudFront overrides the X-XSS-Protection HTTP response
   * header received from the origin with the one specified in this response headers policy.
   */
  public fun `override`(): Boolean

  /**
   * A Boolean that determines the value of the X-XSS-Protection HTTP response header.
   *
   * When this setting is true, the value of the X-XSS-Protection header is 1.
   * When this setting is false, the value of the X-XSS-Protection header is 0.
   */
  public fun protection(): Boolean

  /**
   * A reporting URI, which CloudFront uses as the value of the report directive in the
   * X-XSS-Protection header.
   *
   * You cannot specify a ReportUri when ModeBlock is true.
   *
   * Default: - no report uri
   */
  public fun reportUri(): String? = unwrap(this).getReportUri()

  /**
   * A builder for [ResponseHeadersXSSProtection]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param modeBlock A Boolean that determines whether CloudFront includes the mode=block
     * directive in the X-XSS-Protection header.
     */
    public fun modeBlock(modeBlock: Boolean)

    /**
     * @param override A Boolean that determines whether CloudFront overrides the X-XSS-Protection
     * HTTP response header received from the origin with the one specified in this response headers
     * policy. 
     */
    public fun `override`(`override`: Boolean)

    /**
     * @param protection A Boolean that determines the value of the X-XSS-Protection HTTP response
     * header. 
     * When this setting is true, the value of the X-XSS-Protection header is 1.
     * When this setting is false, the value of the X-XSS-Protection header is 0.
     */
    public fun protection(protection: Boolean)

    /**
     * @param reportUri A reporting URI, which CloudFront uses as the value of the report directive
     * in the X-XSS-Protection header.
     * You cannot specify a ReportUri when ModeBlock is true.
     */
    public fun reportUri(reportUri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection.builder()

    /**
     * @param modeBlock A Boolean that determines whether CloudFront includes the mode=block
     * directive in the X-XSS-Protection header.
     */
    override fun modeBlock(modeBlock: Boolean) {
      cdkBuilder.modeBlock(modeBlock)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the X-XSS-Protection
     * HTTP response header received from the origin with the one specified in this response headers
     * policy. 
     */
    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    /**
     * @param protection A Boolean that determines the value of the X-XSS-Protection HTTP response
     * header. 
     * When this setting is true, the value of the X-XSS-Protection header is 1.
     * When this setting is false, the value of the X-XSS-Protection header is 0.
     */
    override fun protection(protection: Boolean) {
      cdkBuilder.protection(protection)
    }

    /**
     * @param reportUri A reporting URI, which CloudFront uses as the value of the report directive
     * in the X-XSS-Protection header.
     * You cannot specify a ReportUri when ModeBlock is true.
     */
    override fun reportUri(reportUri: String) {
      cdkBuilder.reportUri(reportUri)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection,
  ) : ResponseHeadersXSSProtection {
    /**
     * A Boolean that determines whether CloudFront includes the mode=block directive in the
     * X-XSS-Protection header.
     *
     * Default: false
     */
    override fun modeBlock(): Boolean? = unwrap(this).getModeBlock()

    /**
     * A Boolean that determines whether CloudFront overrides the X-XSS-Protection HTTP response
     * header received from the origin with the one specified in this response headers policy.
     */
    override fun `override`(): Boolean = unwrap(this).getOverride()

    /**
     * A Boolean that determines the value of the X-XSS-Protection HTTP response header.
     *
     * When this setting is true, the value of the X-XSS-Protection header is 1.
     * When this setting is false, the value of the X-XSS-Protection header is 0.
     */
    override fun protection(): Boolean = unwrap(this).getProtection()

    /**
     * A reporting URI, which CloudFront uses as the value of the report directive in the
     * X-XSS-Protection header.
     *
     * You cannot specify a ReportUri when ModeBlock is true.
     *
     * Default: - no report uri
     */
    override fun reportUri(): String? = unwrap(this).getReportUri()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersXSSProtection {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection):
        ResponseHeadersXSSProtection = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersXSSProtection):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection = (wrapped as
        Wrapper).cdkObject
  }
}
