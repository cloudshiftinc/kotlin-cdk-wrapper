@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CodeConfig {
  public fun image(): CodeImageConfig? = unwrap(this).getImage()?.let(CodeImageConfig::wrap)

  public fun inlineCode(): String? = unwrap(this).getInlineCode()

  public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun image(image: CodeImageConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e1e6ade5b3a4b75b92589c86c564d75d189c7cac37b4afc672b5ccd816577f")
    public fun image(image: CodeImageConfig.Builder.() -> Unit)

    public fun inlineCode(inlineCode: String)

    public fun s3Location(s3Location: Location)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("515247777926bcadf9ef8155d90f499a52f7282a137f4faa241eb4e02d5b0ced")
    public fun s3Location(s3Location: Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeConfig.Builder =
        software.amazon.awscdk.services.lambda.CodeConfig.builder()

    override fun image(image: CodeImageConfig) {
      cdkBuilder.image(image.let(CodeImageConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e1e6ade5b3a4b75b92589c86c564d75d189c7cac37b4afc672b5ccd816577f")
    override fun image(image: CodeImageConfig.Builder.() -> Unit): Unit =
        image(CodeImageConfig(image))

    override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    override fun s3Location(s3Location: Location) {
      cdkBuilder.s3Location(s3Location.let(Location::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("515247777926bcadf9ef8155d90f499a52f7282a137f4faa241eb4e02d5b0ced")
    override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
        s3Location(Location(s3Location))

    public fun build(): software.amazon.awscdk.services.lambda.CodeConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CodeConfig,
  ) : CdkObject(cdkObject), CodeConfig {
    override fun image(): CodeImageConfig? = unwrap(this).getImage()?.let(CodeImageConfig::wrap)

    override fun inlineCode(): String? = unwrap(this).getInlineCode()

    override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CodeConfig): CodeConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeConfig): software.amazon.awscdk.services.lambda.CodeConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CodeConfig
  }
}
