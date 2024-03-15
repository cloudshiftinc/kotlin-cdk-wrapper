@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun excludeCharacters(excludeCharacters: String)

    public fun excludeLowercase(excludeLowercase: Boolean)

    public fun excludeNumbers(excludeNumbers: Boolean)

    public fun excludePunctuation(excludePunctuation: Boolean)

    public fun excludeUppercase(excludeUppercase: Boolean)

    public fun generateStringKey(generateStringKey: String)

    public fun includeSpace(includeSpace: Boolean)

    public fun passwordLength(passwordLength: Number)

    public fun requireEachIncludedType(requireEachIncludedType: Boolean)

    public fun secretStringTemplate(secretStringTemplate: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.builder()

    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    override fun excludeLowercase(excludeLowercase: Boolean) {
      cdkBuilder.excludeLowercase(excludeLowercase)
    }

    override fun excludeNumbers(excludeNumbers: Boolean) {
      cdkBuilder.excludeNumbers(excludeNumbers)
    }

    override fun excludePunctuation(excludePunctuation: Boolean) {
      cdkBuilder.excludePunctuation(excludePunctuation)
    }

    override fun excludeUppercase(excludeUppercase: Boolean) {
      cdkBuilder.excludeUppercase(excludeUppercase)
    }

    override fun generateStringKey(generateStringKey: String) {
      cdkBuilder.generateStringKey(generateStringKey)
    }

    override fun includeSpace(includeSpace: Boolean) {
      cdkBuilder.includeSpace(includeSpace)
    }

    override fun passwordLength(passwordLength: Number) {
      cdkBuilder.passwordLength(passwordLength)
    }

    override fun requireEachIncludedType(requireEachIncludedType: Boolean) {
      cdkBuilder.requireEachIncludedType(requireEachIncludedType)
    }

    override fun secretStringTemplate(secretStringTemplate: String) {
      cdkBuilder.secretStringTemplate(secretStringTemplate)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretStringGenerator =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretStringGenerator,
  ) : CdkObject(cdkObject), SecretStringGenerator {
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun excludeLowercase(): Boolean? = unwrap(this).getExcludeLowercase()

    override fun excludeNumbers(): Boolean? = unwrap(this).getExcludeNumbers()

    override fun excludePunctuation(): Boolean? = unwrap(this).getExcludePunctuation()

    override fun excludeUppercase(): Boolean? = unwrap(this).getExcludeUppercase()

    override fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

    override fun includeSpace(): Boolean? = unwrap(this).getIncludeSpace()

    override fun passwordLength(): Number? = unwrap(this).getPasswordLength()

    override fun requireEachIncludedType(): Boolean? = unwrap(this).getRequireEachIncludedType()

    override fun secretStringTemplate(): String? = unwrap(this).getSecretStringTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretStringGenerator {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretStringGenerator):
        SecretStringGenerator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretStringGenerator):
        software.amazon.awscdk.services.secretsmanager.SecretStringGenerator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.SecretStringGenerator
  }
}
