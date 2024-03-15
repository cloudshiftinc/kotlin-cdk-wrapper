@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Options for creating `MultipartUserData`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * MultipartUserDataOptions multipartUserDataOptions = MultipartUserDataOptions.builder()
 * .partsSeparator("partsSeparator")
 * .build();
 * ```
 */
public interface MultipartUserDataOptions {
  /**
   * The string used to separate parts in multipart user data archive (it's like MIME boundary).
   *
   * This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and should not be present in
   * any part, or in text content of archive.
   *
   * Default: `+AWS+CDK+User+Data+Separator==`
   */
  public fun partsSeparator(): String? = unwrap(this).getPartsSeparator()

  /**
   * A builder for [MultipartUserDataOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param partsSeparator The string used to separate parts in multipart user data archive (it's
     * like MIME boundary).
     * This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and should not be present
     * in any part, or in text content of archive.
     */
    public fun partsSeparator(partsSeparator: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MultipartUserDataOptions.Builder =
        software.amazon.awscdk.services.ec2.MultipartUserDataOptions.builder()

    /**
     * @param partsSeparator The string used to separate parts in multipart user data archive (it's
     * like MIME boundary).
     * This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and should not be present
     * in any part, or in text content of archive.
     */
    override fun partsSeparator(partsSeparator: String) {
      cdkBuilder.partsSeparator(partsSeparator)
    }

    public fun build(): software.amazon.awscdk.services.ec2.MultipartUserDataOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.MultipartUserDataOptions,
  ) : CdkObject(cdkObject), MultipartUserDataOptions {
    /**
     * The string used to separate parts in multipart user data archive (it's like MIME boundary).
     *
     * This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and should not be present
     * in any part, or in text content of archive.
     *
     * Default: `+AWS+CDK+User+Data+Separator==`
     */
    override fun partsSeparator(): String? = unwrap(this).getPartsSeparator()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MultipartUserDataOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MultipartUserDataOptions):
        MultipartUserDataOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultipartUserDataOptions):
        software.amazon.awscdk.services.ec2.MultipartUserDataOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.MultipartUserDataOptions
  }
}
