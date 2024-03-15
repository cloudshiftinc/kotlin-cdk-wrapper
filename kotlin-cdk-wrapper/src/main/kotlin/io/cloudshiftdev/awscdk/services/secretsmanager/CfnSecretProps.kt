@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSecret`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
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
public interface CfnSecretProps {
  /**
   * The description of the secret.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A structure that specifies how to generate a password to encrypt and store in the secret.
   *
   * To include a specific string in the secret, use `SecretString` instead. If you omit both
   * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change to
   * this property, a new secret version is created.
   *
   * We recommend that you specify the maximum length and include every character type that the
   * system you are generating a password for can support.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-generatesecretstring)
   */
  public fun generateSecretString(): Any? = unwrap(this).getGenerateSecretString()

  /**
   * The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to encrypt the secret
   * value in the secret.
   *
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The name of the new secret.
   *
   * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.&#64;-
   *
   * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk
   * confusion and unexpected results when searching for a secret by partial ARN. Secrets Manager
   * automatically adds a hyphen and six random characters after the secret name at the end of the ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
   */
  public fun replicaRegions(): Any? = unwrap(this).getReplicaRegions()

  /**
   * The text to encrypt and store in the secret.
   *
   * We recommend you use a JSON structure of key/value pairs for your secret value. To generate a
   * random password, use `GenerateSecretString` instead. If you omit both `GenerateSecretString` and
   * `SecretString` , you create an empty secret. When you make a change to this property, a new secret
   * version is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-secretstring)
   */
  public fun secretString(): String? = unwrap(this).getSecretString()

  /**
   * A list of tags to attach to the secret.
   *
   * Each tag is a key and value pair of strings in a JSON text string, for example:
   *
   * `[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]`
   *
   * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag
   * from one with key "abc".
   *
   * Stack-level tags, tags you apply to the CloudFormation stack, are also attached to the secret.
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSecretProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the secret.
     */
    public fun description(description: String)

    /**
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret.
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change
     * to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     */
    public fun generateSecretString(generateSecretString: IResolvable)

    /**
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret.
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change
     * to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     */
    public fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty)

    /**
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret.
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change
     * to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35ff43f4d5ee80c90bc5913c560a812ae2dd2c82b5c1adbeb1f76f152b17850b")
    public
        fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit)

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
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param name The name of the new secret.
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.&#64;-
     *
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk
     * confusion and unexpected results when searching for a secret by partial ARN. Secrets Manager
     * automatically adds a hyphen and six random characters after the secret name at the end of the
     * ARN.
     */
    public fun name(name: String)

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret.
     */
    public fun replicaRegions(replicaRegions: IResolvable)

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret.
     */
    public fun replicaRegions(replicaRegions: List<Any>)

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret.
     */
    public fun replicaRegions(vararg replicaRegions: Any)

    /**
     * @param secretString The text to encrypt and store in the secret.
     * We recommend you use a JSON structure of key/value pairs for your secret value. To generate a
     * random password, use `GenerateSecretString` instead. If you omit both `GenerateSecretString` and
     * `SecretString` , you create an empty secret. When you make a change to this property, a new
     * secret version is created.
     */
    public fun secretString(secretString: String)

    /**
     * @param tags A list of tags to attach to the secret.
     * Each tag is a key and value pair of strings in a JSON text string, for example:
     *
     * `[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]`
     *
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag
     * from one with key "abc".
     *
     * Stack-level tags, tags you apply to the CloudFormation stack, are also attached to the
     * secret.
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in you
     * losing your permissions for this secret, then Secrets Manager blocks the operation and returns
     * an `Access Denied` error. For more information, see [Control access to secrets using
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
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS
     * use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do not
     * count against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     * have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     * numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to attach to the secret.
     * Each tag is a key and value pair of strings in a JSON text string, for example:
     *
     * `[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]`
     *
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag
     * from one with key "abc".
     *
     * Stack-level tags, tags you apply to the CloudFormation stack, are also attached to the
     * secret.
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in you
     * losing your permissions for this secret, then Secrets Manager blocks the operation and returns
     * an `Access Denied` error. For more information, see [Control access to secrets using
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
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS
     * use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do not
     * count against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     * have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     * numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnSecretProps.builder()

    /**
     * @param description The description of the secret.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret.
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change
     * to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     */
    override fun generateSecretString(generateSecretString: IResolvable) {
      cdkBuilder.generateSecretString(generateSecretString.let(IResolvable::unwrap))
    }

    /**
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret.
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change
     * to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     */
    override
        fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty) {
      cdkBuilder.generateSecretString(generateSecretString.let(CfnSecret.GenerateSecretStringProperty::unwrap))
    }

    /**
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret.
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change
     * to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35ff43f4d5ee80c90bc5913c560a812ae2dd2c82b5c1adbeb1f76f152b17850b")
    override
        fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit):
        Unit = generateSecretString(CfnSecret.GenerateSecretStringProperty(generateSecretString))

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
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The name of the new secret.
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.&#64;-
     *
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk
     * confusion and unexpected results when searching for a secret by partial ARN. Secrets Manager
     * automatically adds a hyphen and six random characters after the secret name at the end of the
     * ARN.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret.
     */
    override fun replicaRegions(replicaRegions: IResolvable) {
      cdkBuilder.replicaRegions(replicaRegions.let(IResolvable::unwrap))
    }

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret.
     */
    override fun replicaRegions(replicaRegions: List<Any>) {
      cdkBuilder.replicaRegions(replicaRegions)
    }

    /**
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret.
     */
    override fun replicaRegions(vararg replicaRegions: Any): Unit =
        replicaRegions(replicaRegions.toList())

    /**
     * @param secretString The text to encrypt and store in the secret.
     * We recommend you use a JSON structure of key/value pairs for your secret value. To generate a
     * random password, use `GenerateSecretString` instead. If you omit both `GenerateSecretString` and
     * `SecretString` , you create an empty secret. When you make a change to this property, a new
     * secret version is created.
     */
    override fun secretString(secretString: String) {
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
     * Stack-level tags, tags you apply to the CloudFormation stack, are also attached to the
     * secret.
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in you
     * losing your permissions for this secret, then Secrets Manager blocks the operation and returns
     * an `Access Denied` error. For more information, see [Control access to secrets using
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
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS
     * use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do not
     * count against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     * have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     * numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
     * Stack-level tags, tags you apply to the CloudFormation stack, are also attached to the
     * secret.
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in you
     * losing your permissions for this secret, then Secrets Manager blocks the operation and returns
     * an `Access Denied` error. For more information, see [Control access to secrets using
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
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS
     * use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do not
     * count against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     * have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     * numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnSecretProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretProps,
  ) : CdkObject(cdkObject), CfnSecretProps {
    /**
     * The description of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A structure that specifies how to generate a password to encrypt and store in the secret.
     *
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a change
     * to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-generatesecretstring)
     */
    override fun generateSecretString(): Any? = unwrap(this).getGenerateSecretString()

    /**
     * The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to encrypt the secret
     * value in the secret.
     *
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The name of the new secret.
     *
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.&#64;-
     *
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk
     * confusion and unexpected results when searching for a secret by partial ARN. Secrets Manager
     * automatically adds a hyphen and six random characters after the secret name at the end of the
     * ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     */
    override fun replicaRegions(): Any? = unwrap(this).getReplicaRegions()

    /**
     * The text to encrypt and store in the secret.
     *
     * We recommend you use a JSON structure of key/value pairs for your secret value. To generate a
     * random password, use `GenerateSecretString` instead. If you omit both `GenerateSecretString` and
     * `SecretString` , you create an empty secret. When you make a change to this property, a new
     * secret version is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-secretstring)
     */
    override fun secretString(): String? = unwrap(this).getSecretString()

    /**
     * A list of tags to attach to the secret.
     *
     * Each tag is a key and value pair of strings in a JSON text string, for example:
     *
     * `[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]`
     *
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag
     * from one with key "abc".
     *
     * Stack-level tags, tags you apply to the CloudFormation stack, are also attached to the
     * secret.
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in you
     * losing your permissions for this secret, then Secrets Manager blocks the operation and returns
     * an `Access Denied` error. For more information, see [Control access to secrets using
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
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS
     * use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do not
     * count against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     * have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     * numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecretProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretProps):
        CfnSecretProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecretProps):
        software.amazon.awscdk.services.secretsmanager.CfnSecretProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.CfnSecretProps
  }
}
