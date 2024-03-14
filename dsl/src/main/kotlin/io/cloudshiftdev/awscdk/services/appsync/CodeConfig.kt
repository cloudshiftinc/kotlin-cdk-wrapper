package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface CodeConfig {
  public fun inlineCode(): String? = unwrap(this).getInlineCode()

  public fun s3Location(): String? = unwrap(this).getS3Location()

  public interface Builder {
    public fun inlineCode(inlineCode: String)

    public fun s3Location(s3Location: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CodeConfig.Builder =
        software.amazon.awscdk.services.appsync.CodeConfig.builder()

    override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    override fun s3Location(s3Location: String) {
      cdkBuilder.s3Location(s3Location)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CodeConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.CodeConfig,
  ) : CodeConfig {
    override fun inlineCode(): String? = unwrap(this).getInlineCode()

    override fun s3Location(): String? = unwrap(this).getS3Location()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CodeConfig): CodeConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeConfig): software.amazon.awscdk.services.appsync.CodeConfig =
        (wrapped as Wrapper).cdkObject
  }
}
