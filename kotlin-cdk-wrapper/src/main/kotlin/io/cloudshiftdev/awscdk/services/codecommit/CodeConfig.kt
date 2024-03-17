@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the structure to pass into the underlying CfnRepository class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codecommit.*;
 * CodeConfig codeConfig = CodeConfig.builder()
 * .code(CodeProperty.builder()
 * .s3(S3Property.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * // the properties below are optional
 * .branchName("branchName")
 * .build())
 * .build();
 * ```
 */
public interface CodeConfig {
  /**
   * represents the underlying code structure.
   */
  public fun code(): CfnRepository.CodeProperty

  /**
   * A builder for [CodeConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code represents the underlying code structure. 
     */
    public fun code(code: CfnRepository.CodeProperty)

    /**
     * @param code represents the underlying code structure. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e320a191f788d17c4e1cbebe454745d4d9c634022f63c5d114285817aaf6830")
    public fun code(code: CfnRepository.CodeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.CodeConfig.Builder =
        software.amazon.awscdk.services.codecommit.CodeConfig.builder()

    /**
     * @param code represents the underlying code structure. 
     */
    override fun code(code: CfnRepository.CodeProperty) {
      cdkBuilder.code(code.let(CfnRepository.CodeProperty::unwrap))
    }

    /**
     * @param code represents the underlying code structure. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e320a191f788d17c4e1cbebe454745d4d9c634022f63c5d114285817aaf6830")
    override fun code(code: CfnRepository.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnRepository.CodeProperty(code))

    public fun build(): software.amazon.awscdk.services.codecommit.CodeConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codecommit.CodeConfig,
  ) : CdkObject(cdkObject), CodeConfig {
    /**
     * represents the underlying code structure.
     */
    override fun code(): CfnRepository.CodeProperty =
        unwrap(this).getCode().let(CfnRepository.CodeProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CodeConfig): CodeConfig
        = CdkObjectWrappers.wrap(cdkObject) as? CodeConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeConfig): software.amazon.awscdk.services.codecommit.CodeConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.CodeConfig
  }
}
