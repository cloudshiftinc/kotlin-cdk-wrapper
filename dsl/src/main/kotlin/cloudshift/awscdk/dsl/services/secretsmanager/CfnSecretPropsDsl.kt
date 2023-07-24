@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.amazon.awscdk.services.secretsmanager.CfnSecretProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnSecret`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * CfnSecretProps cfnSecretProps = CfnSecretProps.builder()
 * .description("description")
 * .generateSecretString(GenerateSecretStringProperty.builder()
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
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .name("name")
 * .replicaRegions(List.of(ReplicaRegionProperty.builder()
 * .region("region")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build()))
 * .secretString("secretString")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html)
 */
@CdkDslMarker
public class CfnSecretPropsDsl {
    private val cdkBuilder: CfnSecretProps.Builder = CfnSecretProps.builder()

    private val _replicaRegions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param description The description of the secret.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret.
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change to
     * this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     */
    public fun generateSecretString(generateSecretString: IResolvable) {
        cdkBuilder.generateSecretString(generateSecretString)
    }

    /**
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret.
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change to
     * this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     */
    public fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty) {
        cdkBuilder.generateSecretString(generateSecretString)
    }

    /**
     * @param kmsKeyId The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to
     * encrypt the secret value in the secret.
     * An alias is always prefixed by `alias/` , for example `alias/aws/secretsmanager` . For more
     * information, see [About
   * aliases](https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html) .
     *
     * To use a AWS KMS key in a different account, use the key ARN or the alias ARN.
     *
     * If you don't specify this value, then Secrets Manager uses the key `aws/secretsmanager` . If
     * that key doesn't yet exist, then Secrets Manager creates it for you automatically the first time
     * it encrypts the secret value.
     *
     * If the secret is in a different AWS account from the credentials calling the API, then you
     * can't use `aws/secretsmanager` to encrypt the secret, and you must create and use a customer
     * managed AWS KMS key.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The name of the new secret.
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.&#64;-
     *
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk
     * confusion and unexpected results when searching for a secret by partial ARN. Secrets Manager
     * automatically adds a hyphen and six random characters after the secret name at the end of the ARN.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a replica
     * secret.
     */
    public fun replicaRegions(vararg replicaRegions: Any) {
        _replicaRegions.addAll(listOf(*replicaRegions))
    }

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a replica
     * secret.
     */
    public fun replicaRegions(replicaRegions: Collection<Any>) {
        _replicaRegions.addAll(replicaRegions)
    }

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a replica
     * secret.
     */
    public fun replicaRegions(replicaRegions: IResolvable) {
        cdkBuilder.replicaRegions(replicaRegions)
    }

    /**
     * @param secretString The text to encrypt and store in the secret.
     * We recommend you use a JSON structure of key/value pairs for your secret value. To generate a
     * random password, use `GenerateSecretString` instead. If you omit both `GenerateSecretString` and
     * `SecretString` , you create an empty secret. When you make a change to this property, a new secret
     * version is created.
     */
    public fun secretString(secretString: String) {
        cdkBuilder.secretString(secretString)
    }

    /**
     * @param tags A list of tags to attach to the secret.
     * Each tag is a key and value pair of strings in a JSON text string, for example:
     *
     * `[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]`
     *
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag
     * from one with key "abc".
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in you
     * losing your permissions for this secret, then Secrets Manager blocks the operation and returns an
     * `Access Denied` error. For more information, see [Control access to secrets using
   * tags](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac)
     * and [Limit access to identities with tags that match secrets'
   * tags](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2)
     * .
     *
     * For information about how to format a JSON parameter for the various command line tool
     * environments, see [Using JSON for
   * Parameters](https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json)
     * . If your command-line tool or SDK requires quotation marks around the parameter, you should use
     * single quotes to avoid confusion with the double quotes required in the JSON text.
     *
     * The following restrictions apply to tags:
     *
     * * Maximum number of tags per secret: 50
     * * Maximum key length: 127 Unicode characters in UTF-8
     * * Maximum value length: 255 Unicode characters in UTF-8
     * * Tag keys and values are case sensitive.
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS use.
     * You can't edit or delete tag names or values with this prefix. Tags with this prefix do not count
     * against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     * have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     * numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags to attach to the secret.
     * Each tag is a key and value pair of strings in a JSON text string, for example:
     *
     * `[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]`
     *
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag
     * from one with key "abc".
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in you
     * losing your permissions for this secret, then Secrets Manager blocks the operation and returns an
     * `Access Denied` error. For more information, see [Control access to secrets using
   * tags](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac)
     * and [Limit access to identities with tags that match secrets'
   * tags](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2)
     * .
     *
     * For information about how to format a JSON parameter for the various command line tool
     * environments, see [Using JSON for
   * Parameters](https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json)
     * . If your command-line tool or SDK requires quotation marks around the parameter, you should use
     * single quotes to avoid confusion with the double quotes required in the JSON text.
     *
     * The following restrictions apply to tags:
     *
     * * Maximum number of tags per secret: 50
     * * Maximum key length: 127 Unicode characters in UTF-8
     * * Maximum value length: 255 Unicode characters in UTF-8
     * * Tag keys and values are case sensitive.
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS use.
     * You can't edit or delete tag names or values with this prefix. Tags with this prefix do not count
     * against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     * have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     * numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSecretProps {
        if (_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
