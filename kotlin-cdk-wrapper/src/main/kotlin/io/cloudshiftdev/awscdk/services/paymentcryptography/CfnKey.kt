@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.paymentcryptography

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an AWS Payment Cryptography key, a logical representation of a cryptographic key, that is
 * unique in your account and AWS Region .
 *
 * You use keys for cryptographic functions such as encryption and decryption.
 *
 * In addition to the key material used in cryptographic operations, an AWS Payment Cryptography key
 * includes metadata such as the key ARN, key usage, key origin, creation date, description, and key
 * state.
 *
 * When you create a key, you specify both immutable and mutable data about the key. The immutable
 * data contains key attributes that define the scope and cryptographic operations that you can perform
 * using the key, for example key class (example: `SYMMETRIC_KEY` ), key algorithm (example:
 * `TDES_2KEY` ), key usage (example: `TR31_P0_PIN_ENCRYPTION_KEY` ) and key modes of use (example:
 * `Encrypt` ). For information about valid combinations of key attributes, see [Understanding key
 * attributes](https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html)
 * in the *AWS Payment Cryptography User Guide* . The mutable data contained within a key includes
 * usage timestamp and key deletion timestamp and can be modified after creation.
 *
 * AWS Payment Cryptography binds key attributes to keys using key blocks when you store or export
 * them. AWS Payment Cryptography stores the key contents wrapped and never stores or transmits them in
 * the clear.
 *
 * *Cross-account use* : This operation can't be used across different AWS accounts.
 *
 * *Related operations:*
 *
 * *
 * [DeleteKey](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_DeleteKey.html)
 * * [GetKey](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetKey.html)
 * *
 * [ListKeys](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ListKeys.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.paymentcryptography.*;
 * CfnKey cfnKey = CfnKey.Builder.create(this, "MyCfnKey")
 * .exportable(false)
 * .keyAttributes(KeyAttributesProperty.builder()
 * .keyAlgorithm("keyAlgorithm")
 * .keyClass("keyClass")
 * .keyModesOfUse(KeyModesOfUseProperty.builder()
 * .decrypt(false)
 * .deriveKey(false)
 * .encrypt(false)
 * .generate(false)
 * .noRestrictions(false)
 * .sign(false)
 * .unwrap(false)
 * .verify(false)
 * .wrap(false)
 * .build())
 * .keyUsage("keyUsage")
 * .build())
 * // the properties below are optional
 * .enabled(false)
 * .keyCheckValueAlgorithm("keyCheckValueAlgorithm")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html)
 */
public open class CfnKey(
  cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnKey,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeyProps,
  ) :
      this(software.amazon.awscdk.services.paymentcryptography.CfnKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnKeyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnKeyProps(props)
  )

  /**
   *
   */
  public open fun attrKeyIdentifier(): String = unwrap(this).getAttrKeyIdentifier()

  /**
   * The source of the key material.
   *
   * For keys created within AWS Payment Cryptography, the value is `AWS_PAYMENT_CRYPTOGRAPHY` . For
   * keys imported into AWS Payment Cryptography, the value is `EXTERNAL` .
   */
  public open fun attrKeyOrigin(): String = unwrap(this).getAttrKeyOrigin()

  /**
   * The state of key that is being created or deleted.
   */
  public open fun attrKeyState(): String = unwrap(this).getAttrKeyState()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Specifies whether the key is enabled.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether the key is enabled.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether the key is enabled.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether the key is exportable.
   */
  public open fun exportable(): Any = unwrap(this).getExportable()

  /**
   * Specifies whether the key is exportable.
   */
  public open fun exportable(`value`: Boolean) {
    unwrap(this).setExportable(`value`)
  }

  /**
   * Specifies whether the key is exportable.
   */
  public open fun exportable(`value`: IResolvable) {
    unwrap(this).setExportable(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
   * the key.
   */
  public open fun keyAttributes(): Any = unwrap(this).getKeyAttributes()

  /**
   * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
   * the key.
   */
  public open fun keyAttributes(`value`: IResolvable) {
    unwrap(this).setKeyAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
   * the key.
   */
  public open fun keyAttributes(`value`: KeyAttributesProperty) {
    unwrap(this).setKeyAttributes(`value`.let(KeyAttributesProperty.Companion::unwrap))
  }

  /**
   * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
   * the key.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92c53be8bb2fec5bbae813ef55007c1591af4a8722538629ae756d6c153e5646")
  public open fun keyAttributes(`value`: KeyAttributesProperty.Builder.() -> Unit): Unit =
      keyAttributes(KeyAttributesProperty(`value`))

  /**
   * The algorithm that AWS Payment Cryptography uses to calculate the key check value (KCV).
   */
  public open fun keyCheckValueAlgorithm(): String? = unwrap(this).getKeyCheckValueAlgorithm()

  /**
   * The algorithm that AWS Payment Cryptography uses to calculate the key check value (KCV).
   */
  public open fun keyCheckValueAlgorithm(`value`: String) {
    unwrap(this).setKeyCheckValueAlgorithm(`value`)
  }

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.paymentcryptography.CfnKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether the key is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-enabled)
     * @param enabled Specifies whether the key is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether the key is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-enabled)
     * @param enabled Specifies whether the key is enabled. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * Specifies whether the key is exportable.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-exportable)
     * @param exportable Specifies whether the key is exportable. 
     */
    public fun exportable(exportable: Boolean)

    /**
     * Specifies whether the key is exportable.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-exportable)
     * @param exportable Specifies whether the key is exportable. 
     */
    public fun exportable(exportable: IResolvable)

    /**
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
     * the key.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keyattributes)
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     */
    public fun keyAttributes(keyAttributes: IResolvable)

    /**
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
     * the key.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keyattributes)
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     */
    public fun keyAttributes(keyAttributes: KeyAttributesProperty)

    /**
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
     * the key.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keyattributes)
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b714e115fede5ef3cfc396081ec9e7e8a294e32945c0ebcf6fea9f595646bc32")
    public fun keyAttributes(keyAttributes: KeyAttributesProperty.Builder.() -> Unit)

    /**
     * The algorithm that AWS Payment Cryptography uses to calculate the key check value (KCV).
     *
     * It is used to validate the key integrity.
     *
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the
     * key to be checked and retaining the 3 highest order bytes of the encrypted result. For AES keys,
     * the KCV is computed using a CMAC algorithm where the input data is 16 bytes of zero and
     * retaining the 3 highest order bytes of the encrypted result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keycheckvaluealgorithm)
     * @param keyCheckValueAlgorithm The algorithm that AWS Payment Cryptography uses to calculate
     * the key check value (KCV). 
     */
    public fun keyCheckValueAlgorithm(keyCheckValueAlgorithm: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.paymentcryptography.CfnKey.Builder =
        software.amazon.awscdk.services.paymentcryptography.CfnKey.Builder.create(scope, id)

    /**
     * Specifies whether the key is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-enabled)
     * @param enabled Specifies whether the key is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether the key is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-enabled)
     * @param enabled Specifies whether the key is enabled. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether the key is exportable.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-exportable)
     * @param exportable Specifies whether the key is exportable. 
     */
    override fun exportable(exportable: Boolean) {
      cdkBuilder.exportable(exportable)
    }

    /**
     * Specifies whether the key is exportable.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-exportable)
     * @param exportable Specifies whether the key is exportable. 
     */
    override fun exportable(exportable: IResolvable) {
      cdkBuilder.exportable(exportable.let(IResolvable.Companion::unwrap))
    }

    /**
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
     * the key.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keyattributes)
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     */
    override fun keyAttributes(keyAttributes: IResolvable) {
      cdkBuilder.keyAttributes(keyAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
     * the key.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keyattributes)
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     */
    override fun keyAttributes(keyAttributes: KeyAttributesProperty) {
      cdkBuilder.keyAttributes(keyAttributes.let(KeyAttributesProperty.Companion::unwrap))
    }

    /**
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
     * the key.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keyattributes)
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b714e115fede5ef3cfc396081ec9e7e8a294e32945c0ebcf6fea9f595646bc32")
    override fun keyAttributes(keyAttributes: KeyAttributesProperty.Builder.() -> Unit): Unit =
        keyAttributes(KeyAttributesProperty(keyAttributes))

    /**
     * The algorithm that AWS Payment Cryptography uses to calculate the key check value (KCV).
     *
     * It is used to validate the key integrity.
     *
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the
     * key to be checked and retaining the 3 highest order bytes of the encrypted result. For AES keys,
     * the KCV is computed using a CMAC algorithm where the input data is 16 bytes of zero and
     * retaining the 3 highest order bytes of the encrypted result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keycheckvaluealgorithm)
     * @param keyCheckValueAlgorithm The algorithm that AWS Payment Cryptography uses to calculate
     * the key check value (KCV). 
     */
    override fun keyCheckValueAlgorithm(keyCheckValueAlgorithm: String) {
      cdkBuilder.keyCheckValueAlgorithm(keyCheckValueAlgorithm)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.paymentcryptography.CfnKey =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.paymentcryptography.CfnKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnKey): CfnKey
        = CfnKey(cdkObject)

    internal fun unwrap(wrapped: CfnKey): software.amazon.awscdk.services.paymentcryptography.CfnKey
        = wrapped.cdkObject as software.amazon.awscdk.services.paymentcryptography.CfnKey
  }

  /**
   * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
   * the key.
   *
   * This data is immutable after the key is created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.paymentcryptography.*;
   * KeyAttributesProperty keyAttributesProperty = KeyAttributesProperty.builder()
   * .keyAlgorithm("keyAlgorithm")
   * .keyClass("keyClass")
   * .keyModesOfUse(KeyModesOfUseProperty.builder()
   * .decrypt(false)
   * .deriveKey(false)
   * .encrypt(false)
   * .generate(false)
   * .noRestrictions(false)
   * .sign(false)
   * .unwrap(false)
   * .verify(false)
   * .wrap(false)
   * .build())
   * .keyUsage("keyUsage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html)
   */
  public interface KeyAttributesProperty {
    /**
     * The key algorithm to be use during creation of an AWS Payment Cryptography key.
     *
     * For symmetric keys, AWS Payment Cryptography supports `AES` and `TDES` algorithms. For
     * asymmetric keys, AWS Payment Cryptography supports `RSA` and `ECC_NIST` algorithms.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html#cfn-paymentcryptography-key-keyattributes-keyalgorithm)
     */
    public fun keyAlgorithm(): String

    /**
     * The type of AWS Payment Cryptography key to create, which determines the classiﬁcation of the
     * cryptographic method and whether AWS Payment Cryptography key contains a symmetric key or an
     * asymmetric key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html#cfn-paymentcryptography-key-keyattributes-keyclass)
     */
    public fun keyClass(): String

    /**
     * The list of cryptographic operations that you can perform using the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html#cfn-paymentcryptography-key-keyattributes-keymodesofuse)
     */
    public fun keyModesOfUse(): Any

    /**
     * The cryptographic usage of an AWS Payment Cryptography key as deﬁned in section A.5.2 of the
     * TR-31 spec.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html#cfn-paymentcryptography-key-keyattributes-keyusage)
     */
    public fun keyUsage(): String

    /**
     * A builder for [KeyAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyAlgorithm The key algorithm to be use during creation of an AWS Payment
       * Cryptography key. 
       * For symmetric keys, AWS Payment Cryptography supports `AES` and `TDES` algorithms. For
       * asymmetric keys, AWS Payment Cryptography supports `RSA` and `ECC_NIST` algorithms.
       */
      public fun keyAlgorithm(keyAlgorithm: String)

      /**
       * @param keyClass The type of AWS Payment Cryptography key to create, which determines the
       * classiﬁcation of the cryptographic method and whether AWS Payment Cryptography key contains a
       * symmetric key or an asymmetric key pair. 
       */
      public fun keyClass(keyClass: String)

      /**
       * @param keyModesOfUse The list of cryptographic operations that you can perform using the
       * key. 
       */
      public fun keyModesOfUse(keyModesOfUse: IResolvable)

      /**
       * @param keyModesOfUse The list of cryptographic operations that you can perform using the
       * key. 
       */
      public fun keyModesOfUse(keyModesOfUse: KeyModesOfUseProperty)

      /**
       * @param keyModesOfUse The list of cryptographic operations that you can perform using the
       * key. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25a602ed6f1cd3a1ce5e2f351feb461dfef93b682f0079085cb41723ee28bb1a")
      public fun keyModesOfUse(keyModesOfUse: KeyModesOfUseProperty.Builder.() -> Unit)

      /**
       * @param keyUsage The cryptographic usage of an AWS Payment Cryptography key as deﬁned in
       * section A.5.2 of the TR-31 spec. 
       */
      public fun keyUsage(keyUsage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyAttributesProperty.Builder =
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyAttributesProperty.builder()

      /**
       * @param keyAlgorithm The key algorithm to be use during creation of an AWS Payment
       * Cryptography key. 
       * For symmetric keys, AWS Payment Cryptography supports `AES` and `TDES` algorithms. For
       * asymmetric keys, AWS Payment Cryptography supports `RSA` and `ECC_NIST` algorithms.
       */
      override fun keyAlgorithm(keyAlgorithm: String) {
        cdkBuilder.keyAlgorithm(keyAlgorithm)
      }

      /**
       * @param keyClass The type of AWS Payment Cryptography key to create, which determines the
       * classiﬁcation of the cryptographic method and whether AWS Payment Cryptography key contains a
       * symmetric key or an asymmetric key pair. 
       */
      override fun keyClass(keyClass: String) {
        cdkBuilder.keyClass(keyClass)
      }

      /**
       * @param keyModesOfUse The list of cryptographic operations that you can perform using the
       * key. 
       */
      override fun keyModesOfUse(keyModesOfUse: IResolvable) {
        cdkBuilder.keyModesOfUse(keyModesOfUse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param keyModesOfUse The list of cryptographic operations that you can perform using the
       * key. 
       */
      override fun keyModesOfUse(keyModesOfUse: KeyModesOfUseProperty) {
        cdkBuilder.keyModesOfUse(keyModesOfUse.let(KeyModesOfUseProperty.Companion::unwrap))
      }

      /**
       * @param keyModesOfUse The list of cryptographic operations that you can perform using the
       * key. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25a602ed6f1cd3a1ce5e2f351feb461dfef93b682f0079085cb41723ee28bb1a")
      override fun keyModesOfUse(keyModesOfUse: KeyModesOfUseProperty.Builder.() -> Unit): Unit =
          keyModesOfUse(KeyModesOfUseProperty(keyModesOfUse))

      /**
       * @param keyUsage The cryptographic usage of an AWS Payment Cryptography key as deﬁned in
       * section A.5.2 of the TR-31 spec. 
       */
      override fun keyUsage(keyUsage: String) {
        cdkBuilder.keyUsage(keyUsage)
      }

      public fun build():
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyAttributesProperty,
    ) : CdkObject(cdkObject), KeyAttributesProperty {
      /**
       * The key algorithm to be use during creation of an AWS Payment Cryptography key.
       *
       * For symmetric keys, AWS Payment Cryptography supports `AES` and `TDES` algorithms. For
       * asymmetric keys, AWS Payment Cryptography supports `RSA` and `ECC_NIST` algorithms.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html#cfn-paymentcryptography-key-keyattributes-keyalgorithm)
       */
      override fun keyAlgorithm(): String = unwrap(this).getKeyAlgorithm()

      /**
       * The type of AWS Payment Cryptography key to create, which determines the classiﬁcation of
       * the cryptographic method and whether AWS Payment Cryptography key contains a symmetric key or
       * an asymmetric key pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html#cfn-paymentcryptography-key-keyattributes-keyclass)
       */
      override fun keyClass(): String = unwrap(this).getKeyClass()

      /**
       * The list of cryptographic operations that you can perform using the key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html#cfn-paymentcryptography-key-keyattributes-keymodesofuse)
       */
      override fun keyModesOfUse(): Any = unwrap(this).getKeyModesOfUse()

      /**
       * The cryptographic usage of an AWS Payment Cryptography key as deﬁned in section A.5.2 of
       * the TR-31 spec.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keyattributes.html#cfn-paymentcryptography-key-keyattributes-keyusage)
       */
      override fun keyUsage(): String = unwrap(this).getKeyUsage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyAttributesProperty):
          KeyAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? KeyAttributesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyAttributesProperty):
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyAttributesProperty
    }
  }

  /**
   * The list of cryptographic operations that you can perform using the key.
   *
   * The modes of use are deﬁned in section A.5.3 of the TR-31 spec.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.paymentcryptography.*;
   * KeyModesOfUseProperty keyModesOfUseProperty = KeyModesOfUseProperty.builder()
   * .decrypt(false)
   * .deriveKey(false)
   * .encrypt(false)
   * .generate(false)
   * .noRestrictions(false)
   * .sign(false)
   * .unwrap(false)
   * .verify(false)
   * .wrap(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html)
   */
  public interface KeyModesOfUseProperty {
    /**
     * Speciﬁes whether an AWS Payment Cryptography key can be used to decrypt data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-decrypt)
     */
    public fun decrypt(): Any? = unwrap(this).getDecrypt()

    /**
     * Speciﬁes whether an AWS Payment Cryptography key can be used to derive new keys.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-derivekey)
     */
    public fun deriveKey(): Any? = unwrap(this).getDeriveKey()

    /**
     * Speciﬁes whether an AWS Payment Cryptography key can be used to encrypt data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-encrypt)
     */
    public fun encrypt(): Any? = unwrap(this).getEncrypt()

    /**
     * Speciﬁes whether an AWS Payment Cryptography key can be used to generate and verify other
     * card and PIN verification keys.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-generate)
     */
    public fun generate(): Any? = unwrap(this).getGenerate()

    /**
     * Speciﬁes whether an AWS Payment Cryptography key has no special restrictions other than the
     * restrictions implied by `KeyUsage` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-norestrictions)
     */
    public fun noRestrictions(): Any? = unwrap(this).getNoRestrictions()

    /**
     * Speciﬁes whether an AWS Payment Cryptography key can be used for signing.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-sign)
     */
    public fun sign(): Any? = unwrap(this).getSign()

    /**
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-unwrap)
     */
    public fun unwrap(): Any? = unwrap(this).getUnwrap()

    /**
     * Speciﬁes whether an AWS Payment Cryptography key can be used to verify signatures.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-verify)
     */
    public fun verify(): Any? = unwrap(this).getVerify()

    /**
     * Speciﬁes whether an AWS Payment Cryptography key can be used to wrap other keys.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-wrap)
     */
    public fun wrap(): Any? = unwrap(this).getWrap()

    /**
     * A builder for [KeyModesOfUseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param decrypt Speciﬁes whether an AWS Payment Cryptography key can be used to decrypt
       * data.
       */
      public fun decrypt(decrypt: Boolean)

      /**
       * @param decrypt Speciﬁes whether an AWS Payment Cryptography key can be used to decrypt
       * data.
       */
      public fun decrypt(decrypt: IResolvable)

      /**
       * @param deriveKey Speciﬁes whether an AWS Payment Cryptography key can be used to derive new
       * keys.
       */
      public fun deriveKey(deriveKey: Boolean)

      /**
       * @param deriveKey Speciﬁes whether an AWS Payment Cryptography key can be used to derive new
       * keys.
       */
      public fun deriveKey(deriveKey: IResolvable)

      /**
       * @param encrypt Speciﬁes whether an AWS Payment Cryptography key can be used to encrypt
       * data.
       */
      public fun encrypt(encrypt: Boolean)

      /**
       * @param encrypt Speciﬁes whether an AWS Payment Cryptography key can be used to encrypt
       * data.
       */
      public fun encrypt(encrypt: IResolvable)

      /**
       * @param generate Speciﬁes whether an AWS Payment Cryptography key can be used to generate
       * and verify other card and PIN verification keys.
       */
      public fun generate(generate: Boolean)

      /**
       * @param generate Speciﬁes whether an AWS Payment Cryptography key can be used to generate
       * and verify other card and PIN verification keys.
       */
      public fun generate(generate: IResolvable)

      /**
       * @param noRestrictions Speciﬁes whether an AWS Payment Cryptography key has no special
       * restrictions other than the restrictions implied by `KeyUsage` .
       */
      public fun noRestrictions(noRestrictions: Boolean)

      /**
       * @param noRestrictions Speciﬁes whether an AWS Payment Cryptography key has no special
       * restrictions other than the restrictions implied by `KeyUsage` .
       */
      public fun noRestrictions(noRestrictions: IResolvable)

      /**
       * @param sign Speciﬁes whether an AWS Payment Cryptography key can be used for signing.
       */
      public fun sign(sign: Boolean)

      /**
       * @param sign Speciﬁes whether an AWS Payment Cryptography key can be used for signing.
       */
      public fun sign(sign: IResolvable)

      /**
       * @param unwrap the value to be set.
       */
      public fun unwrap(unwrap: Boolean)

      /**
       * @param unwrap the value to be set.
       */
      public fun unwrap(unwrap: IResolvable)

      /**
       * @param verify Speciﬁes whether an AWS Payment Cryptography key can be used to verify
       * signatures.
       */
      public fun verify(verify: Boolean)

      /**
       * @param verify Speciﬁes whether an AWS Payment Cryptography key can be used to verify
       * signatures.
       */
      public fun verify(verify: IResolvable)

      /**
       * @param wrap Speciﬁes whether an AWS Payment Cryptography key can be used to wrap other
       * keys.
       */
      public fun wrap(wrap: Boolean)

      /**
       * @param wrap Speciﬁes whether an AWS Payment Cryptography key can be used to wrap other
       * keys.
       */
      public fun wrap(wrap: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyModesOfUseProperty.Builder =
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyModesOfUseProperty.builder()

      /**
       * @param decrypt Speciﬁes whether an AWS Payment Cryptography key can be used to decrypt
       * data.
       */
      override fun decrypt(decrypt: Boolean) {
        cdkBuilder.decrypt(decrypt)
      }

      /**
       * @param decrypt Speciﬁes whether an AWS Payment Cryptography key can be used to decrypt
       * data.
       */
      override fun decrypt(decrypt: IResolvable) {
        cdkBuilder.decrypt(decrypt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deriveKey Speciﬁes whether an AWS Payment Cryptography key can be used to derive new
       * keys.
       */
      override fun deriveKey(deriveKey: Boolean) {
        cdkBuilder.deriveKey(deriveKey)
      }

      /**
       * @param deriveKey Speciﬁes whether an AWS Payment Cryptography key can be used to derive new
       * keys.
       */
      override fun deriveKey(deriveKey: IResolvable) {
        cdkBuilder.deriveKey(deriveKey.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encrypt Speciﬁes whether an AWS Payment Cryptography key can be used to encrypt
       * data.
       */
      override fun encrypt(encrypt: Boolean) {
        cdkBuilder.encrypt(encrypt)
      }

      /**
       * @param encrypt Speciﬁes whether an AWS Payment Cryptography key can be used to encrypt
       * data.
       */
      override fun encrypt(encrypt: IResolvable) {
        cdkBuilder.encrypt(encrypt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param generate Speciﬁes whether an AWS Payment Cryptography key can be used to generate
       * and verify other card and PIN verification keys.
       */
      override fun generate(generate: Boolean) {
        cdkBuilder.generate(generate)
      }

      /**
       * @param generate Speciﬁes whether an AWS Payment Cryptography key can be used to generate
       * and verify other card and PIN verification keys.
       */
      override fun generate(generate: IResolvable) {
        cdkBuilder.generate(generate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param noRestrictions Speciﬁes whether an AWS Payment Cryptography key has no special
       * restrictions other than the restrictions implied by `KeyUsage` .
       */
      override fun noRestrictions(noRestrictions: Boolean) {
        cdkBuilder.noRestrictions(noRestrictions)
      }

      /**
       * @param noRestrictions Speciﬁes whether an AWS Payment Cryptography key has no special
       * restrictions other than the restrictions implied by `KeyUsage` .
       */
      override fun noRestrictions(noRestrictions: IResolvable) {
        cdkBuilder.noRestrictions(noRestrictions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sign Speciﬁes whether an AWS Payment Cryptography key can be used for signing.
       */
      override fun sign(sign: Boolean) {
        cdkBuilder.sign(sign)
      }

      /**
       * @param sign Speciﬁes whether an AWS Payment Cryptography key can be used for signing.
       */
      override fun sign(sign: IResolvable) {
        cdkBuilder.sign(sign.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param unwrap the value to be set.
       */
      override fun unwrap(unwrap: Boolean) {
        cdkBuilder.unwrap(unwrap)
      }

      /**
       * @param unwrap the value to be set.
       */
      override fun unwrap(unwrap: IResolvable) {
        cdkBuilder.unwrap(unwrap.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param verify Speciﬁes whether an AWS Payment Cryptography key can be used to verify
       * signatures.
       */
      override fun verify(verify: Boolean) {
        cdkBuilder.verify(verify)
      }

      /**
       * @param verify Speciﬁes whether an AWS Payment Cryptography key can be used to verify
       * signatures.
       */
      override fun verify(verify: IResolvable) {
        cdkBuilder.verify(verify.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param wrap Speciﬁes whether an AWS Payment Cryptography key can be used to wrap other
       * keys.
       */
      override fun wrap(wrap: Boolean) {
        cdkBuilder.wrap(wrap)
      }

      /**
       * @param wrap Speciﬁes whether an AWS Payment Cryptography key can be used to wrap other
       * keys.
       */
      override fun wrap(wrap: IResolvable) {
        cdkBuilder.wrap(wrap.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyModesOfUseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyModesOfUseProperty,
    ) : CdkObject(cdkObject), KeyModesOfUseProperty {
      /**
       * Speciﬁes whether an AWS Payment Cryptography key can be used to decrypt data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-decrypt)
       */
      override fun decrypt(): Any? = unwrap(this).getDecrypt()

      /**
       * Speciﬁes whether an AWS Payment Cryptography key can be used to derive new keys.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-derivekey)
       */
      override fun deriveKey(): Any? = unwrap(this).getDeriveKey()

      /**
       * Speciﬁes whether an AWS Payment Cryptography key can be used to encrypt data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-encrypt)
       */
      override fun encrypt(): Any? = unwrap(this).getEncrypt()

      /**
       * Speciﬁes whether an AWS Payment Cryptography key can be used to generate and verify other
       * card and PIN verification keys.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-generate)
       */
      override fun generate(): Any? = unwrap(this).getGenerate()

      /**
       * Speciﬁes whether an AWS Payment Cryptography key has no special restrictions other than the
       * restrictions implied by `KeyUsage` .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-norestrictions)
       */
      override fun noRestrictions(): Any? = unwrap(this).getNoRestrictions()

      /**
       * Speciﬁes whether an AWS Payment Cryptography key can be used for signing.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-sign)
       */
      override fun sign(): Any? = unwrap(this).getSign()

      /**
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-unwrap)
       */
      override fun unwrap(): Any? = unwrap(this).getUnwrap()

      /**
       * Speciﬁes whether an AWS Payment Cryptography key can be used to verify signatures.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-verify)
       */
      override fun verify(): Any? = unwrap(this).getVerify()

      /**
       * Speciﬁes whether an AWS Payment Cryptography key can be used to wrap other keys.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-paymentcryptography-key-keymodesofuse.html#cfn-paymentcryptography-key-keymodesofuse-wrap)
       */
      override fun wrap(): Any? = unwrap(this).getWrap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyModesOfUseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyModesOfUseProperty):
          KeyModesOfUseProperty = CdkObjectWrappers.wrap(cdkObject) as? KeyModesOfUseProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyModesOfUseProperty):
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyModesOfUseProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.paymentcryptography.CfnKey.KeyModesOfUseProperty
    }
  }
}
