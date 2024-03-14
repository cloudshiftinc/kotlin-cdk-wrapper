package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CodeConfig {
  public fun inlineCode(): String? = unwrap(this).getInlineCode()

  public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

  public interface Builder {
    public fun inlineCode(inlineCode: String) {
    }

    public fun s3Location(s3Location: Location) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14624bb83a293d56416ee3361f61fcc132656d131fd0fcfbcaad92b0f6264b6")
    public fun s3Location(s3Location: Location.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CodeConfig.Builder =
        software.amazon.awscdk.services.synthetics.CodeConfig.builder()

    public override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    public override fun s3Location(s3Location: Location) {
      cdkBuilder.s3Location(s3Location.let(Location::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14624bb83a293d56416ee3361f61fcc132656d131fd0fcfbcaad92b0f6264b6")
    public override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
        s3Location(Location(s3Location))

    public fun build(): software.amazon.awscdk.services.synthetics.CodeConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.synthetics.CodeConfig,
  ) : CodeConfig {
    public override fun inlineCode(): String? = unwrap(this).getInlineCode()

    public override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CodeConfig): CodeConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeConfig): software.amazon.awscdk.services.synthetics.CodeConfig
        = (wrapped as Wrapper).cdkObject
  }
}
