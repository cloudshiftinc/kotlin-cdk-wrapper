package io.cloudshiftdev.awscdk.services.codecommit

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CodeConfig {
  public fun code(): CfnRepository.CodeProperty

  public interface Builder {
    public fun code(code: CfnRepository.CodeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e320a191f788d17c4e1cbebe454745d4d9c634022f63c5d114285817aaf6830")
    public fun code(code: CfnRepository.CodeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.CodeConfig.Builder =
        software.amazon.awscdk.services.codecommit.CodeConfig.builder()

    override fun code(code: CfnRepository.CodeProperty) {
      cdkBuilder.code(code.let(CfnRepository.CodeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e320a191f788d17c4e1cbebe454745d4d9c634022f63c5d114285817aaf6830")
    override fun code(code: CfnRepository.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnRepository.CodeProperty(code))

    public fun build(): software.amazon.awscdk.services.codecommit.CodeConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codecommit.CodeConfig,
  ) : CodeConfig {
    override fun code(): CfnRepository.CodeProperty =
        unwrap(this).getCode().let(CfnRepository.CodeProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CodeConfig): CodeConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeConfig): software.amazon.awscdk.services.codecommit.CodeConfig
        = (wrapped as Wrapper).cdkObject
  }
}
