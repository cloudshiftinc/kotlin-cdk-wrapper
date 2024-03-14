package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CustomAttributeConfig {
  public fun dataType(): String

  public fun mutable(): Boolean? = unwrap(this).getMutable()

  public fun numberConstraints(): NumberAttributeConstraints? =
      unwrap(this).getNumberConstraints()?.let(NumberAttributeConstraints::wrap)

  public fun stringConstraints(): StringAttributeConstraints? =
      unwrap(this).getStringConstraints()?.let(StringAttributeConstraints::wrap)

  public interface Builder {
    public fun dataType(dataType: String) {
    }

    public fun mutable(mutable: Boolean) {
    }

    public fun numberConstraints(numberConstraints: NumberAttributeConstraints) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc1d50c4781e442cfecd0909e70e85a1efb3a024525c42b606ff1cb3dd1d5dab")
    public fun numberConstraints(numberConstraints: NumberAttributeConstraints.Builder.() -> Unit) {
    }

    public fun stringConstraints(stringConstraints: StringAttributeConstraints) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d05d82bd96940c511d159e415cfc197cce046c20e3eb09a0eb49924b42c36577")
    public fun stringConstraints(stringConstraints: StringAttributeConstraints.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CustomAttributeConfig.Builder =
        software.amazon.awscdk.services.cognito.CustomAttributeConfig.builder()

    public override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
    }

    public override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public override fun numberConstraints(numberConstraints: NumberAttributeConstraints) {
      cdkBuilder.numberConstraints(numberConstraints.let(NumberAttributeConstraints::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc1d50c4781e442cfecd0909e70e85a1efb3a024525c42b606ff1cb3dd1d5dab")
    public override
        fun numberConstraints(numberConstraints: NumberAttributeConstraints.Builder.() -> Unit):
        Unit = numberConstraints(NumberAttributeConstraints(numberConstraints))

    public override fun stringConstraints(stringConstraints: StringAttributeConstraints) {
      cdkBuilder.stringConstraints(stringConstraints.let(StringAttributeConstraints::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d05d82bd96940c511d159e415cfc197cce046c20e3eb09a0eb49924b42c36577")
    public override
        fun stringConstraints(stringConstraints: StringAttributeConstraints.Builder.() -> Unit):
        Unit = stringConstraints(StringAttributeConstraints(stringConstraints))

    public fun build(): software.amazon.awscdk.services.cognito.CustomAttributeConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.CustomAttributeConfig,
  ) : CustomAttributeConfig {
    public override fun dataType(): String = unwrap(this).getDataType()

    public override fun mutable(): Boolean? = unwrap(this).getMutable()

    public override fun numberConstraints(): NumberAttributeConstraints? =
        unwrap(this).getNumberConstraints()?.let(NumberAttributeConstraints::wrap)

    public override fun stringConstraints(): StringAttributeConstraints? =
        unwrap(this).getStringConstraints()?.let(StringAttributeConstraints::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CustomAttributeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CustomAttributeConfig):
        CustomAttributeConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomAttributeConfig):
        software.amazon.awscdk.services.cognito.CustomAttributeConfig = (wrapped as
        Wrapper).cdkObject
  }
}
