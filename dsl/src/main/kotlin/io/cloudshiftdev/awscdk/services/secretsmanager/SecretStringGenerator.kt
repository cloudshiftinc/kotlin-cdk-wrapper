package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface SecretStringGenerator {
  /**
   * A string that includes characters that shouldn't be included in the generated password.
   *
   * The string can be a minimum
   * of `0` and a maximum of `4096` characters long.
   *
   * Default: no exclusions
   */
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * Specifies that the generated password shouldn't include lowercase letters.
   *
   * Default: false
   */
  public fun excludeLowercase(): Boolean? = unwrap(this).getExcludeLowercase()

  /**
   * Specifies that the generated password shouldn't include digits.
   *
   * Default: false
   */
  public fun excludeNumbers(): Boolean? = unwrap(this).getExcludeNumbers()

  /**
   * Specifies that the generated password shouldn't include punctuation characters.
   *
   * Default: false
   */
  public fun excludePunctuation(): Boolean? = unwrap(this).getExcludePunctuation()

  /**
   * Specifies that the generated password shouldn't include uppercase letters.
   *
   * Default: false
   */
  public fun excludeUppercase(): Boolean? = unwrap(this).getExcludeUppercase()

  /**
   * The JSON key name that's used to add the generated password to the JSON structure specified by
   * the `secretStringTemplate` parameter.
   *
   * If you specify `generateStringKey` then `secretStringTemplate`
   * must be also be specified.
   */
  public fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

  /**
   * Specifies that the generated password can include the space character.
   *
   * Default: false
   */
  public fun includeSpace(): Boolean? = unwrap(this).getIncludeSpace()

  /**
   * The desired length of the generated password.
   *
   * Default: 32
   */
  public fun passwordLength(): Number? = unwrap(this).getPasswordLength()

  /**
   * Specifies whether the generated password must include at least one of every allowed character
   * type.
   *
   * Default: true
   */
  public fun requireEachIncludedType(): Boolean? = unwrap(this).getRequireEachIncludedType()

  /**
   * A properly structured JSON string that the generated password can be added to.
   *
   * The `generateStringKey` is
   * combined with the generated random string and inserted into the JSON structure that's specified
   * by this parameter.
   * The merged JSON string is returned as the completed SecretString of the secret. If you specify
   * `secretStringTemplate`
   * then `generateStringKey` must be also be specified.
   */
  public fun secretStringTemplate(): String? = unwrap(this).getSecretStringTemplate()

  /**
   * A builder for [SecretStringGenerator]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludeCharacters A string that includes characters that shouldn't be included in the
     * generated password.
     * The string can be a minimum
     * of `0` and a maximum of `4096` characters long.
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * @param excludeLowercase Specifies that the generated password shouldn't include lowercase
     * letters.
     */
    public fun excludeLowercase(excludeLowercase: Boolean)

    /**
     * @param excludeNumbers Specifies that the generated password shouldn't include digits.
     */
    public fun excludeNumbers(excludeNumbers: Boolean)

    /**
     * @param excludePunctuation Specifies that the generated password shouldn't include punctuation
     * characters.
     */
    public fun excludePunctuation(excludePunctuation: Boolean)

    /**
     * @param excludeUppercase Specifies that the generated password shouldn't include uppercase
     * letters.
     */
    public fun excludeUppercase(excludeUppercase: Boolean)

    /**
     * @param generateStringKey The JSON key name that's used to add the generated password to the
     * JSON structure specified by the `secretStringTemplate` parameter.
     * If you specify `generateStringKey` then `secretStringTemplate`
     * must be also be specified.
     */
    public fun generateStringKey(generateStringKey: String)

    /**
     * @param includeSpace Specifies that the generated password can include the space character.
     */
    public fun includeSpace(includeSpace: Boolean)

    /**
     * @param passwordLength The desired length of the generated password.
     */
    public fun passwordLength(passwordLength: Number)

    /**
     * @param requireEachIncludedType Specifies whether the generated password must include at least
     * one of every allowed character type.
     */
    public fun requireEachIncludedType(requireEachIncludedType: Boolean)

    /**
     * @param secretStringTemplate A properly structured JSON string that the generated password can
     * be added to.
     * The `generateStringKey` is
     * combined with the generated random string and inserted into the JSON structure that's
     * specified by this parameter.
     * The merged JSON string is returned as the completed SecretString of the secret. If you
     * specify `secretStringTemplate`
     * then `generateStringKey` must be also be specified.
     */
    public fun secretStringTemplate(secretStringTemplate: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.builder()

    /**
     * @param excludeCharacters A string that includes characters that shouldn't be included in the
     * generated password.
     * The string can be a minimum
     * of `0` and a maximum of `4096` characters long.
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param excludeLowercase Specifies that the generated password shouldn't include lowercase
     * letters.
     */
    override fun excludeLowercase(excludeLowercase: Boolean) {
      cdkBuilder.excludeLowercase(excludeLowercase)
    }

    /**
     * @param excludeNumbers Specifies that the generated password shouldn't include digits.
     */
    override fun excludeNumbers(excludeNumbers: Boolean) {
      cdkBuilder.excludeNumbers(excludeNumbers)
    }

    /**
     * @param excludePunctuation Specifies that the generated password shouldn't include punctuation
     * characters.
     */
    override fun excludePunctuation(excludePunctuation: Boolean) {
      cdkBuilder.excludePunctuation(excludePunctuation)
    }

    /**
     * @param excludeUppercase Specifies that the generated password shouldn't include uppercase
     * letters.
     */
    override fun excludeUppercase(excludeUppercase: Boolean) {
      cdkBuilder.excludeUppercase(excludeUppercase)
    }

    /**
     * @param generateStringKey The JSON key name that's used to add the generated password to the
     * JSON structure specified by the `secretStringTemplate` parameter.
     * If you specify `generateStringKey` then `secretStringTemplate`
     * must be also be specified.
     */
    override fun generateStringKey(generateStringKey: String) {
      cdkBuilder.generateStringKey(generateStringKey)
    }

    /**
     * @param includeSpace Specifies that the generated password can include the space character.
     */
    override fun includeSpace(includeSpace: Boolean) {
      cdkBuilder.includeSpace(includeSpace)
    }

    /**
     * @param passwordLength The desired length of the generated password.
     */
    override fun passwordLength(passwordLength: Number) {
      cdkBuilder.passwordLength(passwordLength)
    }

    /**
     * @param requireEachIncludedType Specifies whether the generated password must include at least
     * one of every allowed character type.
     */
    override fun requireEachIncludedType(requireEachIncludedType: Boolean) {
      cdkBuilder.requireEachIncludedType(requireEachIncludedType)
    }

    /**
     * @param secretStringTemplate A properly structured JSON string that the generated password can
     * be added to.
     * The `generateStringKey` is
     * combined with the generated random string and inserted into the JSON structure that's
     * specified by this parameter.
     * The merged JSON string is returned as the completed SecretString of the secret. If you
     * specify `secretStringTemplate`
     * then `generateStringKey` must be also be specified.
     */
    override fun secretStringTemplate(secretStringTemplate: String) {
      cdkBuilder.secretStringTemplate(secretStringTemplate)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretStringGenerator =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretStringGenerator,
  ) : CdkObject(cdkObject), SecretStringGenerator {
    /**
     * A string that includes characters that shouldn't be included in the generated password.
     *
     * The string can be a minimum
     * of `0` and a maximum of `4096` characters long.
     *
     * Default: no exclusions
     */
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * Specifies that the generated password shouldn't include lowercase letters.
     *
     * Default: false
     */
    override fun excludeLowercase(): Boolean? = unwrap(this).getExcludeLowercase()

    /**
     * Specifies that the generated password shouldn't include digits.
     *
     * Default: false
     */
    override fun excludeNumbers(): Boolean? = unwrap(this).getExcludeNumbers()

    /**
     * Specifies that the generated password shouldn't include punctuation characters.
     *
     * Default: false
     */
    override fun excludePunctuation(): Boolean? = unwrap(this).getExcludePunctuation()

    /**
     * Specifies that the generated password shouldn't include uppercase letters.
     *
     * Default: false
     */
    override fun excludeUppercase(): Boolean? = unwrap(this).getExcludeUppercase()

    /**
     * The JSON key name that's used to add the generated password to the JSON structure specified
     * by the `secretStringTemplate` parameter.
     *
     * If you specify `generateStringKey` then `secretStringTemplate`
     * must be also be specified.
     */
    override fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

    /**
     * Specifies that the generated password can include the space character.
     *
     * Default: false
     */
    override fun includeSpace(): Boolean? = unwrap(this).getIncludeSpace()

    /**
     * The desired length of the generated password.
     *
     * Default: 32
     */
    override fun passwordLength(): Number? = unwrap(this).getPasswordLength()

    /**
     * Specifies whether the generated password must include at least one of every allowed character
     * type.
     *
     * Default: true
     */
    override fun requireEachIncludedType(): Boolean? = unwrap(this).getRequireEachIncludedType()

    /**
     * A properly structured JSON string that the generated password can be added to.
     *
     * The `generateStringKey` is
     * combined with the generated random string and inserted into the JSON structure that's
     * specified by this parameter.
     * The merged JSON string is returned as the completed SecretString of the secret. If you
     * specify `secretStringTemplate`
     * then `generateStringKey` must be also be specified.
     */
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
