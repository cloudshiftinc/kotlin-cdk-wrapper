@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Result of binding `Code` into a `Function`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CodeConfig codeConfig = CodeConfig.builder()
 * .image(CodeImageConfig.builder()
 * .imageUri("imageUri")
 * // the properties below are optional
 * .cmd(List.of("cmd"))
 * .entrypoint(List.of("entrypoint"))
 * .workingDirectory("workingDirectory")
 * .build())
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
   * Docker image configuration (mutually exclusive with `s3Location` and `inlineCode`).
   *
   * Default: - code is not an ECR container image
   */
  public fun image(): CodeImageConfig? = unwrap(this).getImage()?.let(CodeImageConfig::wrap)

  /**
   * Inline code (mutually exclusive with `s3Location` and `image`).
   *
   * Default: - code is not inline code
   */
  public fun inlineCode(): String? = unwrap(this).getInlineCode()

  /**
   * The location of the code in S3 (mutually exclusive with `inlineCode` and `image`).
   *
   * Default: - code is not an s3 location
   */
  public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

  /**
   * A builder for [CodeConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param image Docker image configuration (mutually exclusive with `s3Location` and
     * `inlineCode`).
     */
    public fun image(image: CodeImageConfig)

    /**
     * @param image Docker image configuration (mutually exclusive with `s3Location` and
     * `inlineCode`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e1e6ade5b3a4b75b92589c86c564d75d189c7cac37b4afc672b5ccd816577f")
    public fun image(image: CodeImageConfig.Builder.() -> Unit)

    /**
     * @param inlineCode Inline code (mutually exclusive with `s3Location` and `image`).
     */
    public fun inlineCode(inlineCode: String)

    /**
     * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode` and
     * `image`).
     */
    public fun s3Location(s3Location: Location)

    /**
     * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode` and
     * `image`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("515247777926bcadf9ef8155d90f499a52f7282a137f4faa241eb4e02d5b0ced")
    public fun s3Location(s3Location: Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeConfig.Builder =
        software.amazon.awscdk.services.lambda.CodeConfig.builder()

    /**
     * @param image Docker image configuration (mutually exclusive with `s3Location` and
     * `inlineCode`).
     */
    override fun image(image: CodeImageConfig) {
      cdkBuilder.image(image.let(CodeImageConfig.Companion::unwrap))
    }

    /**
     * @param image Docker image configuration (mutually exclusive with `s3Location` and
     * `inlineCode`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e1e6ade5b3a4b75b92589c86c564d75d189c7cac37b4afc672b5ccd816577f")
    override fun image(image: CodeImageConfig.Builder.() -> Unit): Unit =
        image(CodeImageConfig(image))

    /**
     * @param inlineCode Inline code (mutually exclusive with `s3Location` and `image`).
     */
    override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    /**
     * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode` and
     * `image`).
     */
    override fun s3Location(s3Location: Location) {
      cdkBuilder.s3Location(s3Location.let(Location.Companion::unwrap))
    }

    /**
     * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode` and
     * `image`).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("515247777926bcadf9ef8155d90f499a52f7282a137f4faa241eb4e02d5b0ced")
    override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
        s3Location(Location(s3Location))

    public fun build(): software.amazon.awscdk.services.lambda.CodeConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CodeConfig,
  ) : CdkObject(cdkObject), CodeConfig {
    /**
     * Docker image configuration (mutually exclusive with `s3Location` and `inlineCode`).
     *
     * Default: - code is not an ECR container image
     */
    override fun image(): CodeImageConfig? = unwrap(this).getImage()?.let(CodeImageConfig::wrap)

    /**
     * Inline code (mutually exclusive with `s3Location` and `image`).
     *
     * Default: - code is not inline code
     */
    override fun inlineCode(): String? = unwrap(this).getInlineCode()

    /**
     * The location of the code in S3 (mutually exclusive with `inlineCode` and `image`).
     *
     * Default: - code is not an s3 location
     */
    override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CodeConfig): CodeConfig =
        CdkObjectWrappers.wrap(cdkObject) as? CodeConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeConfig): software.amazon.awscdk.services.lambda.CodeConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CodeConfig
  }
}
