@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options when creating `MultipartBody`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * MultipartBodyOptions multipartBodyOptions = MultipartBodyOptions.builder()
 * .contentType("contentType")
 * // the properties below are optional
 * .body("body")
 * .transferEncoding("transferEncoding")
 * .build();
 * ```
 */
public interface MultipartBodyOptions {
  /**
   * The body of message.
   *
   * Default: undefined - body will not be added to part
   */
  public fun body(): String? = unwrap(this).getBody()

  /**
   * `Content-Type` header of this part.
   *
   * Some examples of content types:
   *
   * * `text/x-shellscript; charset="utf-8"` (shell script)
   * * `text/cloud-boothook; charset="utf-8"` (shell script executed during boot phase)
   *
   * For Linux shell scripts use `text/x-shellscript`.
   */
  public fun contentType(): String

  /**
   * `Content-Transfer-Encoding` header specifying part encoding.
   *
   * Default: undefined - body is not encoded
   */
  public fun transferEncoding(): String? = unwrap(this).getTransferEncoding()

  /**
   * A builder for [MultipartBodyOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param body The body of message.
     */
    public fun body(body: String)

    /**
     * @param contentType `Content-Type` header of this part. 
     * Some examples of content types:
     *
     * * `text/x-shellscript; charset="utf-8"` (shell script)
     * * `text/cloud-boothook; charset="utf-8"` (shell script executed during boot phase)
     *
     * For Linux shell scripts use `text/x-shellscript`.
     */
    public fun contentType(contentType: String)

    /**
     * @param transferEncoding `Content-Transfer-Encoding` header specifying part encoding.
     */
    public fun transferEncoding(transferEncoding: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MultipartBodyOptions.Builder =
        software.amazon.awscdk.services.ec2.MultipartBodyOptions.builder()

    /**
     * @param body The body of message.
     */
    override fun body(body: String) {
      cdkBuilder.body(body)
    }

    /**
     * @param contentType `Content-Type` header of this part. 
     * Some examples of content types:
     *
     * * `text/x-shellscript; charset="utf-8"` (shell script)
     * * `text/cloud-boothook; charset="utf-8"` (shell script executed during boot phase)
     *
     * For Linux shell scripts use `text/x-shellscript`.
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param transferEncoding `Content-Transfer-Encoding` header specifying part encoding.
     */
    override fun transferEncoding(transferEncoding: String) {
      cdkBuilder.transferEncoding(transferEncoding)
    }

    public fun build(): software.amazon.awscdk.services.ec2.MultipartBodyOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.MultipartBodyOptions,
  ) : CdkObject(cdkObject),
      MultipartBodyOptions {
    /**
     * The body of message.
     *
     * Default: undefined - body will not be added to part
     */
    override fun body(): String? = unwrap(this).getBody()

    /**
     * `Content-Type` header of this part.
     *
     * Some examples of content types:
     *
     * * `text/x-shellscript; charset="utf-8"` (shell script)
     * * `text/cloud-boothook; charset="utf-8"` (shell script executed during boot phase)
     *
     * For Linux shell scripts use `text/x-shellscript`.
     */
    override fun contentType(): String = unwrap(this).getContentType()

    /**
     * `Content-Transfer-Encoding` header specifying part encoding.
     *
     * Default: undefined - body is not encoded
     */
    override fun transferEncoding(): String? = unwrap(this).getTransferEncoding()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MultipartBodyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MultipartBodyOptions):
        MultipartBodyOptions = CdkObjectWrappers.wrap(cdkObject) as? MultipartBodyOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultipartBodyOptions):
        software.amazon.awscdk.services.ec2.MultipartBodyOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.MultipartBodyOptions
  }
}
