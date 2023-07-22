@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator

@CdkDslMarker
public class SecretStringGeneratorDsl {
  private val cdkBuilder: SecretStringGenerator.Builder = SecretStringGenerator.builder()

  /**
   * @param excludeCharacters A string that includes characters that shouldn't be included in the
   * generated password.
   * The string can be a minimum
   * of `0` and a maximum of `4096` characters long.
   */
  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  /**
   * @param excludeLowercase Specifies that the generated password shouldn't include lowercase
   * letters.
   */
  public fun excludeLowercase(excludeLowercase: Boolean) {
    cdkBuilder.excludeLowercase(excludeLowercase)
  }

  /**
   * @param excludeNumbers Specifies that the generated password shouldn't include digits.
   */
  public fun excludeNumbers(excludeNumbers: Boolean) {
    cdkBuilder.excludeNumbers(excludeNumbers)
  }

  /**
   * @param excludePunctuation Specifies that the generated password shouldn't include punctuation
   * characters.
   */
  public fun excludePunctuation(excludePunctuation: Boolean) {
    cdkBuilder.excludePunctuation(excludePunctuation)
  }

  /**
   * @param excludeUppercase Specifies that the generated password shouldn't include uppercase
   * letters.
   */
  public fun excludeUppercase(excludeUppercase: Boolean) {
    cdkBuilder.excludeUppercase(excludeUppercase)
  }

  /**
   * @param generateStringKey The JSON key name that's used to add the generated password to the
   * JSON structure specified by the `secretStringTemplate` parameter.
   * If you specify `generateStringKey` then `secretStringTemplate`
   * must be also be specified.
   */
  public fun generateStringKey(generateStringKey: String) {
    cdkBuilder.generateStringKey(generateStringKey)
  }

  /**
   * @param includeSpace Specifies that the generated password can include the space character.
   */
  public fun includeSpace(includeSpace: Boolean) {
    cdkBuilder.includeSpace(includeSpace)
  }

  /**
   * @param passwordLength The desired length of the generated password.
   */
  public fun passwordLength(passwordLength: Number) {
    cdkBuilder.passwordLength(passwordLength)
  }

  /**
   * @param requireEachIncludedType Specifies whether the generated password must include at least
   * one of every allowed character type.
   */
  public fun requireEachIncludedType(requireEachIncludedType: Boolean) {
    cdkBuilder.requireEachIncludedType(requireEachIncludedType)
  }

  /**
   * @param secretStringTemplate A properly structured JSON string that the generated password can
   * be added to.
   * The `generateStringKey` is
   * combined with the generated random string and inserted into the JSON structure that's specified
   * by this parameter.
   * The merged JSON string is returned as the completed SecretString of the secret. If you specify
   * `secretStringTemplate`
   * then `generateStringKey` must be also be specified.
   */
  public fun secretStringTemplate(secretStringTemplate: String) {
    cdkBuilder.secretStringTemplate(secretStringTemplate)
  }

  public fun build(): SecretStringGenerator = cdkBuilder.build()
}
