@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSecretGenerateSecretStringPropertyDsl {
    private val cdkBuilder: CfnSecret.GenerateSecretStringProperty.Builder =
        CfnSecret.GenerateSecretStringProperty.builder()

    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public fun excludeLowercase(excludeLowercase: Boolean) {
        cdkBuilder.excludeLowercase(excludeLowercase)
    }

    public fun excludeLowercase(excludeLowercase: IResolvable) {
        cdkBuilder.excludeLowercase(excludeLowercase)
    }

    public fun excludeNumbers(excludeNumbers: Boolean) {
        cdkBuilder.excludeNumbers(excludeNumbers)
    }

    public fun excludeNumbers(excludeNumbers: IResolvable) {
        cdkBuilder.excludeNumbers(excludeNumbers)
    }

    public fun excludePunctuation(excludePunctuation: Boolean) {
        cdkBuilder.excludePunctuation(excludePunctuation)
    }

    public fun excludePunctuation(excludePunctuation: IResolvable) {
        cdkBuilder.excludePunctuation(excludePunctuation)
    }

    public fun excludeUppercase(excludeUppercase: Boolean) {
        cdkBuilder.excludeUppercase(excludeUppercase)
    }

    public fun excludeUppercase(excludeUppercase: IResolvable) {
        cdkBuilder.excludeUppercase(excludeUppercase)
    }

    public fun generateStringKey(generateStringKey: String) {
        cdkBuilder.generateStringKey(generateStringKey)
    }

    public fun includeSpace(includeSpace: Boolean) {
        cdkBuilder.includeSpace(includeSpace)
    }

    public fun includeSpace(includeSpace: IResolvable) {
        cdkBuilder.includeSpace(includeSpace)
    }

    public fun passwordLength(passwordLength: Number) {
        cdkBuilder.passwordLength(passwordLength)
    }

    public fun requireEachIncludedType(requireEachIncludedType: Boolean) {
        cdkBuilder.requireEachIncludedType(requireEachIncludedType)
    }

    public fun requireEachIncludedType(requireEachIncludedType: IResolvable) {
        cdkBuilder.requireEachIncludedType(requireEachIncludedType)
    }

    public fun secretStringTemplate(secretStringTemplate: String) {
        cdkBuilder.secretStringTemplate(secretStringTemplate)
    }

    public fun build(): CfnSecret.GenerateSecretStringProperty = cdkBuilder.build()
}
