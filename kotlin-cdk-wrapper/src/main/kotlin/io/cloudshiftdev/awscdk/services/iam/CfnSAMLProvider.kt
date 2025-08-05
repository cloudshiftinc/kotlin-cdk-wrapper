@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.
 *
 * The SAML provider resource that you create with this operation can be used as a principal in an
 * IAM role's trust policy. Such a policy can enable federated users who sign in using the SAML IdP to
 * assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS
 * Management Console or one that supports API access to AWS .
 *
 * When you create the SAML provider resource, you upload a SAML metadata document that you get from
 * your IdP. That document includes the issuer's name, expiration information, and keys that can be
 * used to validate the SAML authentication response (assertions) that the IdP sends. You must generate
 * the metadata document using the identity management software that is used as your organization's
 * IdP.
 *
 *
 * This operation requires [Signature Version
 * 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
 *
 *
 * For more information, see [Enabling SAML 2.0 federated users to access the AWS Management
 * Console](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html)
 * and [About SAML 2.0-based
 * federation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html) in the
 * *IAM User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnSAMLProvider cfnSAMLProvider = CfnSAMLProvider.Builder.create(this, "MyCfnSAMLProvider")
 * .addPrivateKey("addPrivateKey")
 * .assertionEncryptionMode("assertionEncryptionMode")
 * .name("name")
 * .privateKeyList(List.of(SAMLPrivateKeyProperty.builder()
 * .keyId("keyId")
 * .timestamp("timestamp")
 * .build()))
 * .removePrivateKey("removePrivateKey")
 * .samlMetadataDocument("samlMetadataDocument")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html)
 */
public open class CfnSAMLProvider(
  cdkObject: software.amazon.awscdk.services.iam.CfnSAMLProvider,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iam.CfnSAMLProvider(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSAMLProviderProps,
  ) :
      this(software.amazon.awscdk.services.iam.CfnSAMLProvider(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSAMLProviderProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSAMLProviderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSAMLProviderProps(props)
  )

  /**
   * Specifies the new private key from your external identity provider.
   */
  public open fun addPrivateKey(): String? = unwrap(this).getAddPrivateKey()

  /**
   * Specifies the new private key from your external identity provider.
   */
  public open fun addPrivateKey(`value`: String) {
    unwrap(this).setAddPrivateKey(`value`)
  }

  /**
   * Specifies the encryption setting for the SAML provider.
   */
  public open fun assertionEncryptionMode(): String? = unwrap(this).getAssertionEncryptionMode()

  /**
   * Specifies the encryption setting for the SAML provider.
   */
  public open fun assertionEncryptionMode(`value`: String) {
    unwrap(this).setAssertionEncryptionMode(`value`)
  }

  /**
   * Returns the Amazon Resource Name (ARN) for the specified `AWS::IAM::SAMLProvider` resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier assigned to the SAML provider.
   */
  public open fun attrSamlProviderUuid(): String = unwrap(this).getAttrSamlProviderUuid()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the provider to create.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the provider to create.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The private key metadata for the SAML provider.
   */
  public open fun privateKeyList(): Any? = unwrap(this).getPrivateKeyList()

  /**
   * The private key metadata for the SAML provider.
   */
  public open fun privateKeyList(`value`: IResolvable) {
    unwrap(this).setPrivateKeyList(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The private key metadata for the SAML provider.
   */
  public open fun privateKeyList(`value`: List<Any>) {
    unwrap(this).setPrivateKeyList(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The private key metadata for the SAML provider.
   */
  public open fun privateKeyList(vararg `value`: Any): Unit = privateKeyList(`value`.toList())

  /**
   * The Key ID of the private key to remove.
   */
  public open fun removePrivateKey(): String? = unwrap(this).getRemovePrivateKey()

  /**
   * The Key ID of the private key to remove.
   */
  public open fun removePrivateKey(`value`: String) {
    unwrap(this).setRemovePrivateKey(`value`)
  }

  /**
   * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document
   * includes the issuer's name, expiration information, and keys that can be used to validate the SAML
   * authentication response (assertions) that are received from the IdP. You must generate the
   * metadata document using the identity management software that is used as your organization's IdP.
   */
  public open fun samlMetadataDocument(): String? = unwrap(this).getSamlMetadataDocument()

  /**
   * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document
   * includes the issuer's name, expiration information, and keys that can be used to validate the SAML
   * authentication response (assertions) that are received from the IdP. You must generate the
   * metadata document using the identity management software that is used as your organization's IdP.
   */
  public open fun samlMetadataDocument(`value`: String) {
    unwrap(this).setSamlMetadataDocument(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags that you want to attach to the new IAM SAML provider.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that you want to attach to the new IAM SAML provider.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags that you want to attach to the new IAM SAML provider.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnSAMLProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the new private key from your external identity provider.
     *
     * The private key must be a .pem file that uses AES-GCM or AES-CBC encryption algorithm to
     * decrypt SAML assertions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-addprivatekey)
     * @param addPrivateKey Specifies the new private key from your external identity provider. 
     */
    public fun addPrivateKey(addPrivateKey: String)

    /**
     * Specifies the encryption setting for the SAML provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-assertionencryptionmode)
     * @param assertionEncryptionMode Specifies the encryption setting for the SAML provider. 
     */
    public fun assertionEncryptionMode(assertionEncryptionMode: String)

    /**
     * The name of the provider to create.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-name)
     * @param name The name of the provider to create. 
     */
    public fun name(name: String)

    /**
     * The private key metadata for the SAML provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-privatekeylist)
     * @param privateKeyList The private key metadata for the SAML provider. 
     */
    public fun privateKeyList(privateKeyList: IResolvable)

    /**
     * The private key metadata for the SAML provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-privatekeylist)
     * @param privateKeyList The private key metadata for the SAML provider. 
     */
    public fun privateKeyList(privateKeyList: List<Any>)

    /**
     * The private key metadata for the SAML provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-privatekeylist)
     * @param privateKeyList The private key metadata for the SAML provider. 
     */
    public fun privateKeyList(vararg privateKeyList: Any)

    /**
     * The Key ID of the private key to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-removeprivatekey)
     * @param removePrivateKey The Key ID of the private key to remove. 
     */
    public fun removePrivateKey(removePrivateKey: String)

    /**
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document
     * includes the issuer's name, expiration information, and keys that can be used to validate the
     * SAML authentication response (assertions) that are received from the IdP. You must generate the
     * metadata document using the identity management software that is used as your organization's
     * IdP.
     *
     * For more information, see [About SAML 2.0-based
     * federation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html) in
     * the *IAM User Guide*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-samlmetadatadocument)
     * @param samlMetadataDocument An XML document generated by an identity provider (IdP) that
     * supports SAML 2.0. The document includes the issuer's name, expiration information, and keys
     * that can be used to validate the SAML authentication response (assertions) that are received
     * from the IdP. You must generate the metadata document using the identity management software
     * that is used as your organization's IdP. 
     */
    public fun samlMetadataDocument(samlMetadataDocument: String)

    /**
     * A list of tags that you want to attach to the new IAM SAML provider.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-tags)
     * @param tags A list of tags that you want to attach to the new IAM SAML provider. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags that you want to attach to the new IAM SAML provider.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-tags)
     * @param tags A list of tags that you want to attach to the new IAM SAML provider. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnSAMLProvider.Builder =
        software.amazon.awscdk.services.iam.CfnSAMLProvider.Builder.create(scope, id)

    /**
     * Specifies the new private key from your external identity provider.
     *
     * The private key must be a .pem file that uses AES-GCM or AES-CBC encryption algorithm to
     * decrypt SAML assertions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-addprivatekey)
     * @param addPrivateKey Specifies the new private key from your external identity provider. 
     */
    override fun addPrivateKey(addPrivateKey: String) {
      cdkBuilder.addPrivateKey(addPrivateKey)
    }

    /**
     * Specifies the encryption setting for the SAML provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-assertionencryptionmode)
     * @param assertionEncryptionMode Specifies the encryption setting for the SAML provider. 
     */
    override fun assertionEncryptionMode(assertionEncryptionMode: String) {
      cdkBuilder.assertionEncryptionMode(assertionEncryptionMode)
    }

    /**
     * The name of the provider to create.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-name)
     * @param name The name of the provider to create. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The private key metadata for the SAML provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-privatekeylist)
     * @param privateKeyList The private key metadata for the SAML provider. 
     */
    override fun privateKeyList(privateKeyList: IResolvable) {
      cdkBuilder.privateKeyList(privateKeyList.let(IResolvable.Companion::unwrap))
    }

    /**
     * The private key metadata for the SAML provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-privatekeylist)
     * @param privateKeyList The private key metadata for the SAML provider. 
     */
    override fun privateKeyList(privateKeyList: List<Any>) {
      cdkBuilder.privateKeyList(privateKeyList.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The private key metadata for the SAML provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-privatekeylist)
     * @param privateKeyList The private key metadata for the SAML provider. 
     */
    override fun privateKeyList(vararg privateKeyList: Any): Unit =
        privateKeyList(privateKeyList.toList())

    /**
     * The Key ID of the private key to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-removeprivatekey)
     * @param removePrivateKey The Key ID of the private key to remove. 
     */
    override fun removePrivateKey(removePrivateKey: String) {
      cdkBuilder.removePrivateKey(removePrivateKey)
    }

    /**
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document
     * includes the issuer's name, expiration information, and keys that can be used to validate the
     * SAML authentication response (assertions) that are received from the IdP. You must generate the
     * metadata document using the identity management software that is used as your organization's
     * IdP.
     *
     * For more information, see [About SAML 2.0-based
     * federation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html) in
     * the *IAM User Guide*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-samlmetadatadocument)
     * @param samlMetadataDocument An XML document generated by an identity provider (IdP) that
     * supports SAML 2.0. The document includes the issuer's name, expiration information, and keys
     * that can be used to validate the SAML authentication response (assertions) that are received
     * from the IdP. You must generate the metadata document using the identity management software
     * that is used as your organization's IdP. 
     */
    override fun samlMetadataDocument(samlMetadataDocument: String) {
      cdkBuilder.samlMetadataDocument(samlMetadataDocument)
    }

    /**
     * A list of tags that you want to attach to the new IAM SAML provider.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-tags)
     * @param tags A list of tags that you want to attach to the new IAM SAML provider. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags that you want to attach to the new IAM SAML provider.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-tags)
     * @param tags A list of tags that you want to attach to the new IAM SAML provider. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnSAMLProvider = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnSAMLProvider.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSAMLProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSAMLProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnSAMLProvider):
        CfnSAMLProvider = CfnSAMLProvider(cdkObject)

    internal fun unwrap(wrapped: CfnSAMLProvider):
        software.amazon.awscdk.services.iam.CfnSAMLProvider = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.CfnSAMLProvider
  }

  /**
   * Contains the private keys for the SAML provider.
   *
   * This data type is used as a response element in the
   * [GetSAMLProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetSAMLProvider.html)
   * operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iam.*;
   * SAMLPrivateKeyProperty sAMLPrivateKeyProperty = SAMLPrivateKeyProperty.builder()
   * .keyId("keyId")
   * .timestamp("timestamp")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-samlprovider-samlprivatekey.html)
   */
  public interface SAMLPrivateKeyProperty {
    /**
     * The unique identifier for the SAML private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-samlprovider-samlprivatekey.html#cfn-iam-samlprovider-samlprivatekey-keyid)
     */
    public fun keyId(): String

    /**
     * The date and time, in [ISO 8601
     * date-time](https://docs.aws.amazon.com/http://www.iso.org/iso/iso8601) format, when the private
     * key was uploaded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-samlprovider-samlprivatekey.html#cfn-iam-samlprovider-samlprivatekey-timestamp)
     */
    public fun timestamp(): String

    /**
     * A builder for [SAMLPrivateKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyId The unique identifier for the SAML private key. 
       */
      public fun keyId(keyId: String)

      /**
       * @param timestamp The date and time, in [ISO 8601
       * date-time](https://docs.aws.amazon.com/http://www.iso.org/iso/iso8601) format, when the
       * private key was uploaded. 
       */
      public fun timestamp(timestamp: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iam.CfnSAMLProvider.SAMLPrivateKeyProperty.Builder =
          software.amazon.awscdk.services.iam.CfnSAMLProvider.SAMLPrivateKeyProperty.builder()

      /**
       * @param keyId The unique identifier for the SAML private key. 
       */
      override fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
      }

      /**
       * @param timestamp The date and time, in [ISO 8601
       * date-time](https://docs.aws.amazon.com/http://www.iso.org/iso/iso8601) format, when the
       * private key was uploaded. 
       */
      override fun timestamp(timestamp: String) {
        cdkBuilder.timestamp(timestamp)
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnSAMLProvider.SAMLPrivateKeyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iam.CfnSAMLProvider.SAMLPrivateKeyProperty,
    ) : CdkObject(cdkObject),
        SAMLPrivateKeyProperty {
      /**
       * The unique identifier for the SAML private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-samlprovider-samlprivatekey.html#cfn-iam-samlprovider-samlprivatekey-keyid)
       */
      override fun keyId(): String = unwrap(this).getKeyId()

      /**
       * The date and time, in [ISO 8601
       * date-time](https://docs.aws.amazon.com/http://www.iso.org/iso/iso8601) format, when the
       * private key was uploaded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-samlprovider-samlprivatekey.html#cfn-iam-samlprovider-samlprivatekey-timestamp)
       */
      override fun timestamp(): String = unwrap(this).getTimestamp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SAMLPrivateKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnSAMLProvider.SAMLPrivateKeyProperty):
          SAMLPrivateKeyProperty = CdkObjectWrappers.wrap(cdkObject) as? SAMLPrivateKeyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAMLPrivateKeyProperty):
          software.amazon.awscdk.services.iam.CfnSAMLProvider.SAMLPrivateKeyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iam.CfnSAMLProvider.SAMLPrivateKeyProperty
    }
  }
}
