@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new secret.
 *
 * A *secret* can be a password, a set of credentials such as a user name and password, an OAuth
 * token, or other secret information that you store in an encrypted form in Secrets Manager.
 *
 * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
 * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
 * .
 *
 * To retrieve a secret in a CloudFormation template, use a *dynamic reference* . For more
 * information, see [Retrieve a secret in an AWS CloudFormation
 * resource](https://docs.aws.amazon.com/secretsmanager/latest/userguide/cfn-example_reference-secret.html)
 * .
 *
 * A common scenario is to first create a secret with `GenerateSecretString` , which generates a
 * password, and then use a dynamic reference to retrieve the username and password from the secret to
 * use as credentials for a new database. See the example *Creating a Redshift cluster and a secret for
 * the admin credentials* .
 *
 * For information about creating a secret in the console, see [Create a
 * secret](https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_create-basic-secret.html)
 * . For information about creating a secret using the CLI or SDK, see
 * [CreateSecret](https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html)
 * .
 *
 * For information about retrieving a secret in code, see [Retrieve secrets from Secrets
 * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieving-secrets.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * CfnSecret cfnSecret = CfnSecret.Builder.create(this, "MyCfnSecret")
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
public open class CfnSecret internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecret,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.secretsmanager.CfnSecret(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecretProps,
  ) :
      this(software.amazon.awscdk.services.secretsmanager.CfnSecret(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSecretProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecretProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecretProps(props)
  )

  /**
   * The ARN of the secret.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description of the secret.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the secret.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * A structure that specifies how to generate a password to encrypt and store in the secret.
   */
  public open fun generateSecretString(): Any? = unwrap(this).getGenerateSecretString()

  /**
   * A structure that specifies how to generate a password to encrypt and store in the secret.
   */
  public open fun generateSecretString(`value`: IResolvable) {
    unwrap(this).setGenerateSecretString(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure that specifies how to generate a password to encrypt and store in the secret.
   */
  public open fun generateSecretString(`value`: GenerateSecretStringProperty) {
    unwrap(this).setGenerateSecretString(`value`.let(GenerateSecretStringProperty::unwrap))
  }

  /**
   * A structure that specifies how to generate a password to encrypt and store in the secret.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ce0c9ae0a4a2c3e0961e4898afd7dcf90c753741118fc61870dd5064e7fe9f78")
  public open fun generateSecretString(`value`: GenerateSecretStringProperty.Builder.() -> Unit):
      Unit = generateSecretString(GenerateSecretStringProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to encrypt the secret
   * value in the secret.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to encrypt the secret
   * value in the secret.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The name of the new secret.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the new secret.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
   */
  public open fun replicaRegions(): Any? = unwrap(this).getReplicaRegions()

  /**
   * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
   */
  public open fun replicaRegions(`value`: IResolvable) {
    unwrap(this).setReplicaRegions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
   */
  public open fun replicaRegions(`value`: List<Any>) {
    unwrap(this).setReplicaRegions(`value`)
  }

  /**
   * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
   */
  public open fun replicaRegions(vararg `value`: Any): Unit = replicaRegions(`value`.toList())

  /**
   * The text to encrypt and store in the secret.
   */
  public open fun secretString(): String? = unwrap(this).getSecretString()

  /**
   * The text to encrypt and store in the secret.
   */
  public open fun secretString(`value`: String) {
    unwrap(this).setSecretString(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to attach to the secret.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags to attach to the secret.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags to attach to the secret.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.secretsmanager.CfnSecret].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-description)
     * @param description The description of the secret. 
     */
    public fun description(description: String)

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
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret. 
     */
    public fun generateSecretString(generateSecretString: IResolvable)

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
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret. 
     */
    public fun generateSecretString(generateSecretString: GenerateSecretStringProperty)

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
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e223691f205e021a942110c10c4226c829ebe5305e708ddfa406aedf731c0b9")
    public
        fun generateSecretString(generateSecretString: GenerateSecretStringProperty.Builder.() -> Unit)

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
     * @param kmsKeyId The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to
     * encrypt the secret value in the secret. 
     */
    public fun kmsKeyId(kmsKeyId: String)

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
     * @param name The name of the new secret. 
     */
    public fun name(name: String)

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret. 
     */
    public fun replicaRegions(replicaRegions: IResolvable)

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret. 
     */
    public fun replicaRegions(replicaRegions: List<Any>)

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret. 
     */
    public fun replicaRegions(vararg replicaRegions: Any)

    /**
     * The text to encrypt and store in the secret.
     *
     * We recommend you use a JSON structure of key/value pairs for your secret value. To generate a
     * random password, use `GenerateSecretString` instead. If you omit both `GenerateSecretString` and
     * `SecretString` , you create an empty secret. When you make a change to this property, a new
     * secret version is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-secretstring)
     * @param secretString The text to encrypt and store in the secret. 
     */
    public fun secretString(secretString: String)

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
     * @param tags A list of tags to attach to the secret. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of tags to attach to the secret. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.CfnSecret.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnSecret.Builder.create(scope, id)

    /**
     * The description of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-description)
     * @param description The description of the secret. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret. 
     */
    override fun generateSecretString(generateSecretString: IResolvable) {
      cdkBuilder.generateSecretString(generateSecretString.let(IResolvable::unwrap))
    }

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
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret. 
     */
    override fun generateSecretString(generateSecretString: GenerateSecretStringProperty) {
      cdkBuilder.generateSecretString(generateSecretString.let(GenerateSecretStringProperty::unwrap))
    }

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
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     * and store in the secret. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e223691f205e021a942110c10c4226c829ebe5305e708ddfa406aedf731c0b9")
    override
        fun generateSecretString(generateSecretString: GenerateSecretStringProperty.Builder.() -> Unit):
        Unit = generateSecretString(GenerateSecretStringProperty(generateSecretString))

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
     * @param kmsKeyId The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to
     * encrypt the secret value in the secret. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

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
     * @param name The name of the new secret. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret. 
     */
    override fun replicaRegions(replicaRegions: IResolvable) {
      cdkBuilder.replicaRegions(replicaRegions.let(IResolvable::unwrap))
    }

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret. 
     */
    override fun replicaRegions(replicaRegions: List<Any>) {
      cdkBuilder.replicaRegions(replicaRegions)
    }

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     * replica secret. 
     */
    override fun replicaRegions(vararg replicaRegions: Any): Unit =
        replicaRegions(replicaRegions.toList())

    /**
     * The text to encrypt and store in the secret.
     *
     * We recommend you use a JSON structure of key/value pairs for your secret value. To generate a
     * random password, use `GenerateSecretString` instead. If you omit both `GenerateSecretString` and
     * `SecretString` , you create an empty secret. When you make a change to this property, a new
     * secret version is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-secretstring)
     * @param secretString The text to encrypt and store in the secret. 
     */
    override fun secretString(secretString: String) {
      cdkBuilder.secretString(secretString)
    }

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
     * @param tags A list of tags to attach to the secret. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags A list of tags to attach to the secret. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnSecret =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.secretsmanager.CfnSecret.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecret {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecret(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecret):
        CfnSecret = CfnSecret(cdkObject)

    internal fun unwrap(wrapped: CfnSecret):
        software.amazon.awscdk.services.secretsmanager.CfnSecret = wrapped.cdkObject
  }

  /**
   * Specifies a `Region` and the `KmsKeyId` for a replica secret.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
   * ReplicaRegionProperty replicaRegionProperty = ReplicaRegionProperty.builder()
   * .region("region")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-replicaregion.html)
   */
  public interface ReplicaRegionProperty {
    /**
     * The ARN, key ID, or alias of the KMS key to encrypt the secret.
     *
     * If you don't include this field, Secrets Manager uses `aws/secretsmanager` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-replicaregion.html#cfn-secretsmanager-secret-replicaregion-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A string that represents a `Region` , for example "us-east-1".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-replicaregion.html#cfn-secretsmanager-secret-replicaregion-region)
     */
    public fun region(): String

    /**
     * A builder for [ReplicaRegionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The ARN, key ID, or alias of the KMS key to encrypt the secret.
       * If you don't include this field, Secrets Manager uses `aws/secretsmanager` .
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param region A string that represents a `Region` , for example "us-east-1". 
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty.Builder =
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty.builder()

      /**
       * @param kmsKeyId The ARN, key ID, or alias of the KMS key to encrypt the secret.
       * If you don't include this field, Secrets Manager uses `aws/secretsmanager` .
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param region A string that represents a `Region` , for example "us-east-1". 
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty,
    ) : CdkObject(cdkObject), ReplicaRegionProperty {
      /**
       * The ARN, key ID, or alias of the KMS key to encrypt the secret.
       *
       * If you don't include this field, Secrets Manager uses `aws/secretsmanager` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-replicaregion.html#cfn-secretsmanager-secret-replicaregion-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * A string that represents a `Region` , for example "us-east-1".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-replicaregion.html#cfn-secretsmanager-secret-replicaregion-region)
       */
      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaRegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty):
          ReplicaRegionProperty = CdkObjectWrappers.wrap(cdkObject) as? ReplicaRegionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaRegionProperty):
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty
    }
  }

  /**
   * Generates a random password.
   *
   * We recommend that you specify the maximum length and include every character type that the
   * system you are generating a password for can support.
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
   * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
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
  public interface GenerateSecretStringProperty {
    /**
     * A string of the characters that you don't want in the password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludecharacters)
     */
    public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * Specifies whether to exclude lowercase letters from the password.
     *
     * If you don't include this switch, the password can contain lowercase letters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludelowercase)
     */
    public fun excludeLowercase(): Any? = unwrap(this).getExcludeLowercase()

    /**
     * Specifies whether to exclude numbers from the password.
     *
     * If you don't include this switch, the password can contain numbers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludenumbers)
     */
    public fun excludeNumbers(): Any? = unwrap(this).getExcludeNumbers()

    /**
     * Specifies whether to exclude the following punctuation characters from the password: `!
     *
     * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~` . If you don't
     * include this switch, the password can contain punctuation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludepunctuation)
     */
    public fun excludePunctuation(): Any? = unwrap(this).getExcludePunctuation()

    /**
     * Specifies whether to exclude uppercase letters from the password.
     *
     * If you don't include this switch, the password can contain uppercase letters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludeuppercase)
     */
    public fun excludeUppercase(): Any? = unwrap(this).getExcludeUppercase()

    /**
     * The JSON key name for the key/value pair, where the value is the generated password.
     *
     * This pair is added to the JSON structure specified by the `SecretStringTemplate` parameter.
     * If you specify this parameter, then you must also specify `SecretStringTemplate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-generatestringkey)
     */
    public fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

    /**
     * Specifies whether to include the space character.
     *
     * If you include this switch, the password can contain space characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-includespace)
     */
    public fun includeSpace(): Any? = unwrap(this).getIncludeSpace()

    /**
     * The length of the password.
     *
     * If you don't include this parameter, the default length is 32 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-passwordlength)
     */
    public fun passwordLength(): Number? = unwrap(this).getPasswordLength()

    /**
     * Specifies whether to include at least one upper and lowercase letter, one number, and one
     * punctuation.
     *
     * If you don't include this switch, the password contains at least one of every character type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-requireeachincludedtype)
     */
    public fun requireEachIncludedType(): Any? = unwrap(this).getRequireEachIncludedType()

    /**
     * A template that the generated string must match.
     *
     * When you make a change to this property, a new secret version is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-secretstringtemplate)
     */
    public fun secretStringTemplate(): String? = unwrap(this).getSecretStringTemplate()

    /**
     * A builder for [GenerateSecretStringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludeCharacters A string of the characters that you don't want in the password.
       */
      public fun excludeCharacters(excludeCharacters: String)

      /**
       * @param excludeLowercase Specifies whether to exclude lowercase letters from the password.
       * If you don't include this switch, the password can contain lowercase letters.
       */
      public fun excludeLowercase(excludeLowercase: Boolean)

      /**
       * @param excludeLowercase Specifies whether to exclude lowercase letters from the password.
       * If you don't include this switch, the password can contain lowercase letters.
       */
      public fun excludeLowercase(excludeLowercase: IResolvable)

      /**
       * @param excludeNumbers Specifies whether to exclude numbers from the password.
       * If you don't include this switch, the password can contain numbers.
       */
      public fun excludeNumbers(excludeNumbers: Boolean)

      /**
       * @param excludeNumbers Specifies whether to exclude numbers from the password.
       * If you don't include this switch, the password can contain numbers.
       */
      public fun excludeNumbers(excludeNumbers: IResolvable)

      /**
       * @param excludePunctuation Specifies whether to exclude the following punctuation characters
       * from the password: `!.
       * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~` . If you don't
       * include this switch, the password can contain punctuation.
       */
      public fun excludePunctuation(excludePunctuation: Boolean)

      /**
       * @param excludePunctuation Specifies whether to exclude the following punctuation characters
       * from the password: `!.
       * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~` . If you don't
       * include this switch, the password can contain punctuation.
       */
      public fun excludePunctuation(excludePunctuation: IResolvable)

      /**
       * @param excludeUppercase Specifies whether to exclude uppercase letters from the password.
       * If you don't include this switch, the password can contain uppercase letters.
       */
      public fun excludeUppercase(excludeUppercase: Boolean)

      /**
       * @param excludeUppercase Specifies whether to exclude uppercase letters from the password.
       * If you don't include this switch, the password can contain uppercase letters.
       */
      public fun excludeUppercase(excludeUppercase: IResolvable)

      /**
       * @param generateStringKey The JSON key name for the key/value pair, where the value is the
       * generated password.
       * This pair is added to the JSON structure specified by the `SecretStringTemplate` parameter.
       * If you specify this parameter, then you must also specify `SecretStringTemplate` .
       */
      public fun generateStringKey(generateStringKey: String)

      /**
       * @param includeSpace Specifies whether to include the space character.
       * If you include this switch, the password can contain space characters.
       */
      public fun includeSpace(includeSpace: Boolean)

      /**
       * @param includeSpace Specifies whether to include the space character.
       * If you include this switch, the password can contain space characters.
       */
      public fun includeSpace(includeSpace: IResolvable)

      /**
       * @param passwordLength The length of the password.
       * If you don't include this parameter, the default length is 32 characters.
       */
      public fun passwordLength(passwordLength: Number)

      /**
       * @param requireEachIncludedType Specifies whether to include at least one upper and
       * lowercase letter, one number, and one punctuation.
       * If you don't include this switch, the password contains at least one of every character
       * type.
       */
      public fun requireEachIncludedType(requireEachIncludedType: Boolean)

      /**
       * @param requireEachIncludedType Specifies whether to include at least one upper and
       * lowercase letter, one number, and one punctuation.
       * If you don't include this switch, the password contains at least one of every character
       * type.
       */
      public fun requireEachIncludedType(requireEachIncludedType: IResolvable)

      /**
       * @param secretStringTemplate A template that the generated string must match.
       * When you make a change to this property, a new secret version is created.
       */
      public fun secretStringTemplate(secretStringTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder
          =
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.builder()

      /**
       * @param excludeCharacters A string of the characters that you don't want in the password.
       */
      override fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
      }

      /**
       * @param excludeLowercase Specifies whether to exclude lowercase letters from the password.
       * If you don't include this switch, the password can contain lowercase letters.
       */
      override fun excludeLowercase(excludeLowercase: Boolean) {
        cdkBuilder.excludeLowercase(excludeLowercase)
      }

      /**
       * @param excludeLowercase Specifies whether to exclude lowercase letters from the password.
       * If you don't include this switch, the password can contain lowercase letters.
       */
      override fun excludeLowercase(excludeLowercase: IResolvable) {
        cdkBuilder.excludeLowercase(excludeLowercase.let(IResolvable::unwrap))
      }

      /**
       * @param excludeNumbers Specifies whether to exclude numbers from the password.
       * If you don't include this switch, the password can contain numbers.
       */
      override fun excludeNumbers(excludeNumbers: Boolean) {
        cdkBuilder.excludeNumbers(excludeNumbers)
      }

      /**
       * @param excludeNumbers Specifies whether to exclude numbers from the password.
       * If you don't include this switch, the password can contain numbers.
       */
      override fun excludeNumbers(excludeNumbers: IResolvable) {
        cdkBuilder.excludeNumbers(excludeNumbers.let(IResolvable::unwrap))
      }

      /**
       * @param excludePunctuation Specifies whether to exclude the following punctuation characters
       * from the password: `!.
       * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~` . If you don't
       * include this switch, the password can contain punctuation.
       */
      override fun excludePunctuation(excludePunctuation: Boolean) {
        cdkBuilder.excludePunctuation(excludePunctuation)
      }

      /**
       * @param excludePunctuation Specifies whether to exclude the following punctuation characters
       * from the password: `!.
       * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~` . If you don't
       * include this switch, the password can contain punctuation.
       */
      override fun excludePunctuation(excludePunctuation: IResolvable) {
        cdkBuilder.excludePunctuation(excludePunctuation.let(IResolvable::unwrap))
      }

      /**
       * @param excludeUppercase Specifies whether to exclude uppercase letters from the password.
       * If you don't include this switch, the password can contain uppercase letters.
       */
      override fun excludeUppercase(excludeUppercase: Boolean) {
        cdkBuilder.excludeUppercase(excludeUppercase)
      }

      /**
       * @param excludeUppercase Specifies whether to exclude uppercase letters from the password.
       * If you don't include this switch, the password can contain uppercase letters.
       */
      override fun excludeUppercase(excludeUppercase: IResolvable) {
        cdkBuilder.excludeUppercase(excludeUppercase.let(IResolvable::unwrap))
      }

      /**
       * @param generateStringKey The JSON key name for the key/value pair, where the value is the
       * generated password.
       * This pair is added to the JSON structure specified by the `SecretStringTemplate` parameter.
       * If you specify this parameter, then you must also specify `SecretStringTemplate` .
       */
      override fun generateStringKey(generateStringKey: String) {
        cdkBuilder.generateStringKey(generateStringKey)
      }

      /**
       * @param includeSpace Specifies whether to include the space character.
       * If you include this switch, the password can contain space characters.
       */
      override fun includeSpace(includeSpace: Boolean) {
        cdkBuilder.includeSpace(includeSpace)
      }

      /**
       * @param includeSpace Specifies whether to include the space character.
       * If you include this switch, the password can contain space characters.
       */
      override fun includeSpace(includeSpace: IResolvable) {
        cdkBuilder.includeSpace(includeSpace.let(IResolvable::unwrap))
      }

      /**
       * @param passwordLength The length of the password.
       * If you don't include this parameter, the default length is 32 characters.
       */
      override fun passwordLength(passwordLength: Number) {
        cdkBuilder.passwordLength(passwordLength)
      }

      /**
       * @param requireEachIncludedType Specifies whether to include at least one upper and
       * lowercase letter, one number, and one punctuation.
       * If you don't include this switch, the password contains at least one of every character
       * type.
       */
      override fun requireEachIncludedType(requireEachIncludedType: Boolean) {
        cdkBuilder.requireEachIncludedType(requireEachIncludedType)
      }

      /**
       * @param requireEachIncludedType Specifies whether to include at least one upper and
       * lowercase letter, one number, and one punctuation.
       * If you don't include this switch, the password contains at least one of every character
       * type.
       */
      override fun requireEachIncludedType(requireEachIncludedType: IResolvable) {
        cdkBuilder.requireEachIncludedType(requireEachIncludedType.let(IResolvable::unwrap))
      }

      /**
       * @param secretStringTemplate A template that the generated string must match.
       * When you make a change to this property, a new secret version is created.
       */
      override fun secretStringTemplate(secretStringTemplate: String) {
        cdkBuilder.secretStringTemplate(secretStringTemplate)
      }

      public fun build():
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty,
    ) : CdkObject(cdkObject), GenerateSecretStringProperty {
      /**
       * A string of the characters that you don't want in the password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludecharacters)
       */
      override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

      /**
       * Specifies whether to exclude lowercase letters from the password.
       *
       * If you don't include this switch, the password can contain lowercase letters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludelowercase)
       */
      override fun excludeLowercase(): Any? = unwrap(this).getExcludeLowercase()

      /**
       * Specifies whether to exclude numbers from the password.
       *
       * If you don't include this switch, the password can contain numbers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludenumbers)
       */
      override fun excludeNumbers(): Any? = unwrap(this).getExcludeNumbers()

      /**
       * Specifies whether to exclude the following punctuation characters from the password: `!
       *
       * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~` . If you don't
       * include this switch, the password can contain punctuation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludepunctuation)
       */
      override fun excludePunctuation(): Any? = unwrap(this).getExcludePunctuation()

      /**
       * Specifies whether to exclude uppercase letters from the password.
       *
       * If you don't include this switch, the password can contain uppercase letters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludeuppercase)
       */
      override fun excludeUppercase(): Any? = unwrap(this).getExcludeUppercase()

      /**
       * The JSON key name for the key/value pair, where the value is the generated password.
       *
       * This pair is added to the JSON structure specified by the `SecretStringTemplate` parameter.
       * If you specify this parameter, then you must also specify `SecretStringTemplate` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-generatestringkey)
       */
      override fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

      /**
       * Specifies whether to include the space character.
       *
       * If you include this switch, the password can contain space characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-includespace)
       */
      override fun includeSpace(): Any? = unwrap(this).getIncludeSpace()

      /**
       * The length of the password.
       *
       * If you don't include this parameter, the default length is 32 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-passwordlength)
       */
      override fun passwordLength(): Number? = unwrap(this).getPasswordLength()

      /**
       * Specifies whether to include at least one upper and lowercase letter, one number, and one
       * punctuation.
       *
       * If you don't include this switch, the password contains at least one of every character
       * type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-requireeachincludedtype)
       */
      override fun requireEachIncludedType(): Any? = unwrap(this).getRequireEachIncludedType()

      /**
       * A template that the generated string must match.
       *
       * When you make a change to this property, a new secret version is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-secretstringtemplate)
       */
      override fun secretStringTemplate(): String? = unwrap(this).getSecretStringTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GenerateSecretStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty):
          GenerateSecretStringProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GenerateSecretStringProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GenerateSecretStringProperty):
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty
    }
  }
}
