@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configuration of the code class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.synthetics.*;
 * CodeConfig codeConfig = CodeConfig.builder()
 * .inlineCode("inlineCode")
 * .s3Location(Location.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build();
 * ```
 */
public interface CodeConfig {
  /**
   * Inline code (mutually exclusive with `s3Location`).
   *
   * Default: - none
   */
  public fun inlineCode(): String? = unwrap(this).getInlineCode()

  /**
   * The location of the code in S3 (mutually exclusive with `inlineCode`).
   *
   * Default: - none
   */
  public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

  /**
   * A builder for [CodeConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param inlineCode Inline code (mutually exclusive with `s3Location`).
     */
    public fun inlineCode(inlineCode: String)

    /**
     * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`).
     */
    public fun s3Location(s3Location: Location)

    /**
     * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14624bb83a293d56416ee3361f61fcc132656d131fd0fcfbcaad92b0f6264b6")
    public fun s3Location(s3Location: Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CodeConfig.Builder =
        software.amazon.awscdk.services.synthetics.CodeConfig.builder()

    /**
     * @param inlineCode Inline code (mutually exclusive with `s3Location`).
     */
    override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    /**
     * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`).
     */
    override fun s3Location(s3Location: Location) {
      cdkBuilder.s3Location(s3Location.let(Location.Companion::unwrap))
    }

    /**
     * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14624bb83a293d56416ee3361f61fcc132656d131fd0fcfbcaad92b0f6264b6")
    override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
        s3Location(Location(s3Location))

    public fun build(): software.amazon.awscdk.services.synthetics.CodeConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.synthetics.CodeConfig,
  ) : CdkObject(cdkObject),
      CodeConfig {
    /**
     * Inline code (mutually exclusive with `s3Location`).
     *
     * Default: - none
     */
    override fun inlineCode(): String? = unwrap(this).getInlineCode()

    /**
     * The location of the code in S3 (mutually exclusive with `inlineCode`).
     *
     * Default: - none
     */
    override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CodeConfig): CodeConfig
        = CdkObjectWrappers.wrap(cdkObject) as? CodeConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeConfig): software.amazon.awscdk.services.synthetics.CodeConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.synthetics.CodeConfig
  }
}
