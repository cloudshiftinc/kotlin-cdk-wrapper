@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * Generates a random password.
 *
 * We recommend that you specify the maximum length and include every character type that the system
 * you are generating a password for can support.
 *
 * *Required permissions:* `secretsmanager:GetRandomPassword` . For more information, see [IAM
 * policy actions for Secrets
 * Manager](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awssecretsmanager.html#awssecretsmanager-actions-as-permissions)
 * and [Authentication and access control in Secrets
 * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * GenerateSecretStringProperty generateSecretStringProperty =
 * GenerateSecretStringProperty.builder()
 * .excludeCharacters("excludeCharacters")
 * .excludeLowercase(false)
 * .excludeNumbers(false)
 * .excludePunctuation(false)
 * .excludeUppercase(false)
 * .generateStringKey("generateStringKey")
 * .includeSpace(false)
 * .passwordLength(123)
 * .requireEachIncludedType(false)
 * .secretStringTemplate("secretStringTemplate")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html)
 */
@CdkDslMarker
public class CfnSecretGenerateSecretStringPropertyDsl {
    private val cdkBuilder: CfnSecret.GenerateSecretStringProperty.Builder =
        CfnSecret.GenerateSecretStringProperty.builder()

    /**
     * @param excludeCharacters A string of the characters that you don't want in the password.
     */
    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param excludeLowercase Specifies whether to exclude lowercase letters from the password.
     * If you don't include this switch, the password can contain lowercase letters.
     */
    public fun excludeLowercase(excludeLowercase: Boolean) {
        cdkBuilder.excludeLowercase(excludeLowercase)
    }

    /**
     * @param excludeLowercase Specifies whether to exclude lowercase letters from the password.
     * If you don't include this switch, the password can contain lowercase letters.
     */
    public fun excludeLowercase(excludeLowercase: IResolvable) {
        cdkBuilder.excludeLowercase(excludeLowercase)
    }

    /**
     * @param excludeNumbers Specifies whether to exclude numbers from the password.
     * If you don't include this switch, the password can contain numbers.
     */
    public fun excludeNumbers(excludeNumbers: Boolean) {
        cdkBuilder.excludeNumbers(excludeNumbers)
    }

    /**
     * @param excludeNumbers Specifies whether to exclude numbers from the password.
     * If you don't include this switch, the password can contain numbers.
     */
    public fun excludeNumbers(excludeNumbers: IResolvable) {
        cdkBuilder.excludeNumbers(excludeNumbers)
    }

    /**
     * @param excludePunctuation Specifies whether to exclude the following punctuation characters
     * from the password: `!.
     * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~` . If you don't
     * include this switch, the password can contain punctuation.
     */
    public fun excludePunctuation(excludePunctuation: Boolean) {
        cdkBuilder.excludePunctuation(excludePunctuation)
    }

    /**
     * @param excludePunctuation Specifies whether to exclude the following punctuation characters
     * from the password: `!.
     * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~` . If you don't
     * include this switch, the password can contain punctuation.
     */
    public fun excludePunctuation(excludePunctuation: IResolvable) {
        cdkBuilder.excludePunctuation(excludePunctuation)
    }

    /**
     * @param excludeUppercase Specifies whether to exclude uppercase letters from the password.
     * If you don't include this switch, the password can contain uppercase letters.
     */
    public fun excludeUppercase(excludeUppercase: Boolean) {
        cdkBuilder.excludeUppercase(excludeUppercase)
    }

    /**
     * @param excludeUppercase Specifies whether to exclude uppercase letters from the password.
     * If you don't include this switch, the password can contain uppercase letters.
     */
    public fun excludeUppercase(excludeUppercase: IResolvable) {
        cdkBuilder.excludeUppercase(excludeUppercase)
    }

    /**
     * @param generateStringKey The JSON key name for the key/value pair, where the value is the
     * generated password.
     * This pair is added to the JSON structure specified by the `SecretStringTemplate` parameter. If
     * you specify this parameter, then you must also specify `SecretStringTemplate` .
     */
    public fun generateStringKey(generateStringKey: String) {
        cdkBuilder.generateStringKey(generateStringKey)
    }

    /**
     * @param includeSpace Specifies whether to include the space character.
     * If you include this switch, the password can contain space characters.
     */
    public fun includeSpace(includeSpace: Boolean) {
        cdkBuilder.includeSpace(includeSpace)
    }

    /**
     * @param includeSpace Specifies whether to include the space character.
     * If you include this switch, the password can contain space characters.
     */
    public fun includeSpace(includeSpace: IResolvable) {
        cdkBuilder.includeSpace(includeSpace)
    }

    /**
     * @param passwordLength The length of the password.
     * If you don't include this parameter, the default length is 32 characters.
     */
    public fun passwordLength(passwordLength: Number) {
        cdkBuilder.passwordLength(passwordLength)
    }

    /**
     * @param requireEachIncludedType Specifies whether to include at least one upper and lowercase
     * letter, one number, and one punctuation.
     * If you don't include this switch, the password contains at least one of every character type.
     */
    public fun requireEachIncludedType(requireEachIncludedType: Boolean) {
        cdkBuilder.requireEachIncludedType(requireEachIncludedType)
    }

    /**
     * @param requireEachIncludedType Specifies whether to include at least one upper and lowercase
     * letter, one number, and one punctuation.
     * If you don't include this switch, the password contains at least one of every character type.
     */
    public fun requireEachIncludedType(requireEachIncludedType: IResolvable) {
        cdkBuilder.requireEachIncludedType(requireEachIncludedType)
    }

    /**
     * @param secretStringTemplate A template that the generated string must match.
     * When you make a change to this property, a new secret version is created.
     */
    public fun secretStringTemplate(secretStringTemplate: String) {
        cdkBuilder.secretStringTemplate(secretStringTemplate)
    }

    public fun build(): CfnSecret.GenerateSecretStringProperty = cdkBuilder.build()
}
