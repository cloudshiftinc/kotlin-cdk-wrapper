package io.cloudshiftdev.awscdk.services.secretsmanager

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface SecretStringGenerator {
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public fun excludeLowercase(): Boolean? = unwrap(this).getExcludeLowercase()

  public fun excludeNumbers(): Boolean? = unwrap(this).getExcludeNumbers()

  public fun excludePunctuation(): Boolean? = unwrap(this).getExcludePunctuation()

  public fun excludeUppercase(): Boolean? = unwrap(this).getExcludeUppercase()

  public fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

  public fun includeSpace(): Boolean? = unwrap(this).getIncludeSpace()

  public fun passwordLength(): Number? = unwrap(this).getPasswordLength()

  public fun requireEachIncludedType(): Boolean? = unwrap(this).getRequireEachIncludedType()

  public fun secretStringTemplate(): String? = unwrap(this).getSecretStringTemplate()

  public interface Builder {
    public fun excludeCharacters(excludeCharacters: String) {
    }

    public fun excludeLowercase(excludeLowercase: Boolean) {
    }

    public fun excludeNumbers(excludeNumbers: Boolean) {
    }

    public fun excludePunctuation(excludePunctuation: Boolean) {
    }

    public fun excludeUppercase(excludeUppercase: Boolean) {
    }

    public fun generateStringKey(generateStringKey: String) {
    }

    public fun includeSpace(includeSpace: Boolean) {
    }

    public fun passwordLength(passwordLength: Number) {
    }

    public fun requireEachIncludedType(requireEachIncludedType: Boolean) {
    }

    public fun secretStringTemplate(secretStringTemplate: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.builder()

    public override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public override fun excludeLowercase(excludeLowercase: Boolean) {
      cdkBuilder.excludeLowercase(excludeLowercase)
    }

    public override fun excludeNumbers(excludeNumbers: Boolean) {
      cdkBuilder.excludeNumbers(excludeNumbers)
    }

    public override fun excludePunctuation(excludePunctuation: Boolean) {
      cdkBuilder.excludePunctuation(excludePunctuation)
    }

    public override fun excludeUppercase(excludeUppercase: Boolean) {
      cdkBuilder.excludeUppercase(excludeUppercase)
    }

    public override fun generateStringKey(generateStringKey: String) {
      cdkBuilder.generateStringKey(generateStringKey)
    }

    public override fun includeSpace(includeSpace: Boolean) {
      cdkBuilder.includeSpace(includeSpace)
    }

    public override fun passwordLength(passwordLength: Number) {
      cdkBuilder.passwordLength(passwordLength)
    }

    public override fun requireEachIncludedType(requireEachIncludedType: Boolean) {
      cdkBuilder.requireEachIncludedType(requireEachIncludedType)
    }

    public override fun secretStringTemplate(secretStringTemplate: String) {
      cdkBuilder.secretStringTemplate(secretStringTemplate)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretStringGenerator =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretStringGenerator,
  ) : SecretStringGenerator {
    public override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    public override fun excludeLowercase(): Boolean? = unwrap(this).getExcludeLowercase()

    public override fun excludeNumbers(): Boolean? = unwrap(this).getExcludeNumbers()

    public override fun excludePunctuation(): Boolean? = unwrap(this).getExcludePunctuation()

    public override fun excludeUppercase(): Boolean? = unwrap(this).getExcludeUppercase()

    public override fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

    public override fun includeSpace(): Boolean? = unwrap(this).getIncludeSpace()

    public override fun passwordLength(): Number? = unwrap(this).getPasswordLength()

    public override fun requireEachIncludedType(): Boolean? =
        unwrap(this).getRequireEachIncludedType()

    public override fun secretStringTemplate(): String? = unwrap(this).getSecretStringTemplate()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecretStringGenerator {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretStringGenerator):
        SecretStringGenerator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretStringGenerator):
        software.amazon.awscdk.services.secretsmanager.SecretStringGenerator = (wrapped as
        Wrapper).cdkObject
  }
}
