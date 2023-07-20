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

  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  public fun excludeLowercase(excludeLowercase: Boolean) {
    cdkBuilder.excludeLowercase(excludeLowercase)
  }

  public fun excludeNumbers(excludeNumbers: Boolean) {
    cdkBuilder.excludeNumbers(excludeNumbers)
  }

  public fun excludePunctuation(excludePunctuation: Boolean) {
    cdkBuilder.excludePunctuation(excludePunctuation)
  }

  public fun excludeUppercase(excludeUppercase: Boolean) {
    cdkBuilder.excludeUppercase(excludeUppercase)
  }

  public fun generateStringKey(generateStringKey: String) {
    cdkBuilder.generateStringKey(generateStringKey)
  }

  public fun includeSpace(includeSpace: Boolean) {
    cdkBuilder.includeSpace(includeSpace)
  }

  public fun passwordLength(passwordLength: Number) {
    cdkBuilder.passwordLength(passwordLength)
  }

  public fun requireEachIncludedType(requireEachIncludedType: Boolean) {
    cdkBuilder.requireEachIncludedType(requireEachIncludedType)
  }

  public fun secretStringTemplate(secretStringTemplate: String) {
    cdkBuilder.secretStringTemplate(secretStringTemplate)
  }

  public fun build(): SecretStringGenerator = cdkBuilder.build()
}
