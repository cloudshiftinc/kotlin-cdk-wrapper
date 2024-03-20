@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::KMS::Key` resource specifies an [KMS
 * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys) in AWS Key
 * Management Service . You can use this resource to create symmetric encryption KMS keys, asymmetric
 * KMS keys for encryption or signing, and symmetric HMAC KMS keys. You can use `AWS::KMS::Key` to
 * create [multi-Region primary
 * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html#mrk-primary-key)
 * of all supported types. To replicate a multi-Region key, use the `AWS::KMS::ReplicaKey` resource.
 *
 *
 * If you change the value of the `KeySpec` , `KeyUsage` , `Origin` , or `MultiRegion` properties of
 * an existing KMS key, the update request fails, regardless of the value of the [`UpdateReplacePolicy`
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
 * . This prevents you from accidentally deleting a KMS key by changing any of its immutable property
 * values. &gt; AWS KMS replaced the term *customer master key (CMK)* with *AWS KMS key* and *KMS key*
 * . The concept has not changed. To prevent breaking changes, AWS KMS is keeping some variations of
 * this term.
 *
 *
 * You can use symmetric encryption KMS keys to encrypt and decrypt small amounts of data, but they
 * are more commonly used to generate data keys and data key pairs. You can also use a symmetric
 * encryption KMS key to encrypt data stored in AWS services that are [integrated with AWS
 * KMS](https://docs.aws.amazon.com//kms/features/#AWS_Service_Integration) . For more information, see
 * [Symmetric encryption KMS
 * keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks) in the
 * *AWS Key Management Service Developer Guide* .
 *
 * You can use asymmetric KMS keys to encrypt and decrypt data or sign messages and verify
 * signatures. To create an asymmetric key, you must specify an asymmetric `KeySpec` value and a
 * `KeyUsage` value. For details, see [Asymmetric keys in AWS
 * KMS](https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html) in the *AWS
 * Key Management Service Developer Guide* .
 *
 * You can use HMAC KMS keys (which are also symmetric keys) to generate and verify hash-based
 * message authentication codes. To create an HMAC key, you must specify an HMAC `KeySpec` value and a
 * `KeyUsage` value of `GENERATE_VERIFY_MAC` . For details, see [HMAC keys in AWS
 * KMS](https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html) in the *AWS Key Management
 * Service Developer Guide* .
 *
 * You can also create symmetric encryption, asymmetric, and HMAC multi-Region primary keys. To
 * create a multi-Region primary key, set the `MultiRegion` property to `true` . For information about
 * multi-Region keys, see [Multi-Region keys in AWS
 * KMS](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in the
 * *AWS Key Management Service Developer Guide* .
 *
 * You cannot use the `AWS::KMS::Key` resource to specify a KMS key with [imported key
 * material](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html) or a KMS key in
 * a [custom key
 * store](https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html) .
 *
 * *Regions*
 *
 * AWS KMS CloudFormation resources are available in all Regions in which AWS KMS and AWS
 * CloudFormation are supported. You can use the `AWS::KMS::Key` resource to create and manage all KMS
 * key types that are supported in a Region.
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate;
 * CfnKey cfnKey = (CfnKey)cfnTemplate.getResource("Key");
 * IKey key = Key.fromCfnKey(cfnKey);
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html)
 */
public open class CfnKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kms.CfnKey,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.kms.CfnKey(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeyProps,
  ) :
      this(software.amazon.awscdk.services.kms.CfnKey(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnKeyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnKeyProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the KMS key, such as
   * `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
   *
   * For information about the key ARN of a KMS key, see [Key
   * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN) in the
   * *AWS Key Management Service Developer Guide* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The key ID of the KMS key, such as `1234abcd-12ab-34cd-56ef-1234567890ab` .
   *
   * For information about the key ID of a KMS key, see [Key
   * ID](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id) in the *AWS
   * Key Management Service Developer Guide* .
   */
  public open fun attrKeyId(): String = unwrap(this).getAttrKeyId()

  /**
   * Skips ("bypasses") the key policy lockout safety check.
   *
   * The default value is false.
   */
  public open fun bypassPolicyLockoutSafetyCheck(): Any? =
      unwrap(this).getBypassPolicyLockoutSafetyCheck()

  /**
   * Skips ("bypasses") the key policy lockout safety check.
   *
   * The default value is false.
   */
  public open fun bypassPolicyLockoutSafetyCheck(`value`: Boolean) {
    unwrap(this).setBypassPolicyLockoutSafetyCheck(`value`)
  }

  /**
   * Skips ("bypasses") the key policy lockout safety check.
   *
   * The default value is false.
   */
  public open fun bypassPolicyLockoutSafetyCheck(`value`: IResolvable) {
    unwrap(this).setBypassPolicyLockoutSafetyCheck(`value`.let(IResolvable::unwrap))
  }

  /**
   * A description of the KMS key.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the KMS key.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Enables automatic rotation of the key material for the specified KMS key.
   */
  public open fun enableKeyRotation(): Any? = unwrap(this).getEnableKeyRotation()

  /**
   * Enables automatic rotation of the key material for the specified KMS key.
   */
  public open fun enableKeyRotation(`value`: Boolean) {
    unwrap(this).setEnableKeyRotation(`value`)
  }

  /**
   * Enables automatic rotation of the key material for the specified KMS key.
   */
  public open fun enableKeyRotation(`value`: IResolvable) {
    unwrap(this).setEnableKeyRotation(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether the KMS key is enabled.
   *
   * Disabled KMS keys cannot be used in cryptographic operations.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether the KMS key is enabled.
   *
   * Disabled KMS keys cannot be used in cryptographic operations.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether the KMS key is enabled.
   *
   * Disabled KMS keys cannot be used in cryptographic operations.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The key policy to attach to the KMS key.
   */
  public open fun keyPolicy(): Any? = unwrap(this).getKeyPolicy()

  /**
   * The key policy to attach to the KMS key.
   */
  public open fun keyPolicy(`value`: Any) {
    unwrap(this).setKeyPolicy(`value`)
  }

  /**
   * Specifies the type of KMS key to create.
   */
  public open fun keySpec(): String? = unwrap(this).getKeySpec()

  /**
   * Specifies the type of KMS key to create.
   */
  public open fun keySpec(`value`: String) {
    unwrap(this).setKeySpec(`value`)
  }

  /**
   * Determines the [cryptographic
   * operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations)
   * for which you can use the KMS key. The default value is `ENCRYPT_DECRYPT` . This property is
   * required for asymmetric KMS keys and HMAC KMS keys. You can't change the `KeyUsage` value after
   * the KMS key is created.
   */
  public open fun keyUsage(): String? = unwrap(this).getKeyUsage()

  /**
   * Determines the [cryptographic
   * operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations)
   * for which you can use the KMS key. The default value is `ENCRYPT_DECRYPT` . This property is
   * required for asymmetric KMS keys and HMAC KMS keys. You can't change the `KeyUsage` value after
   * the KMS key is created.
   */
  public open fun keyUsage(`value`: String) {
    unwrap(this).setKeyUsage(`value`)
  }

  /**
   * Creates a multi-Region primary key that you can replicate in other AWS Regions .
   */
  public open fun multiRegion(): Any? = unwrap(this).getMultiRegion()

  /**
   * Creates a multi-Region primary key that you can replicate in other AWS Regions .
   */
  public open fun multiRegion(`value`: Boolean) {
    unwrap(this).setMultiRegion(`value`)
  }

  /**
   * Creates a multi-Region primary key that you can replicate in other AWS Regions .
   */
  public open fun multiRegion(`value`: IResolvable) {
    unwrap(this).setMultiRegion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The source of the key material for the KMS key.
   */
  public open fun origin(): String? = unwrap(this).getOrigin()

  /**
   * The source of the key material for the KMS key.
   */
  public open fun origin(`value`: String) {
    unwrap(this).setOrigin(`value`)
  }

  /**
   * Specifies the number of days in the waiting period before AWS KMS deletes a KMS key that has
   * been removed from a CloudFormation stack.
   */
  public open fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

  /**
   * Specifies the number of days in the waiting period before AWS KMS deletes a KMS key that has
   * been removed from a CloudFormation stack.
   */
  public open fun pendingWindowInDays(`value`: Number) {
    unwrap(this).setPendingWindowInDays(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Assigns one or more tags to the replica key.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Assigns one or more tags to the replica key.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Assigns one or more tags to the replica key.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kms.CfnKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     *
     *
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not
     * set this value to true indiscriminately.
     *
     * For more information, see [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key)
     * in the *AWS Key Management Service Developer Guide* .
     *
     *
     * Use this parameter only when you intend to prevent the principal that is making the request
     * from making a subsequent
     * [PutKeyPolicy](https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html)
     * request on the KMS key.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-bypasspolicylockoutsafetycheck)
     * @param bypassPolicyLockoutSafetyCheck Skips ("bypasses") the key policy lockout safety check.
     * The default value is false. 
     */
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean)

    /**
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     *
     *
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not
     * set this value to true indiscriminately.
     *
     * For more information, see [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key)
     * in the *AWS Key Management Service Developer Guide* .
     *
     *
     * Use this parameter only when you intend to prevent the principal that is making the request
     * from making a subsequent
     * [PutKeyPolicy](https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html)
     * request on the KMS key.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-bypasspolicylockoutsafetycheck)
     * @param bypassPolicyLockoutSafetyCheck Skips ("bypasses") the key policy lockout safety check.
     * The default value is false. 
     */
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable)

    /**
     * A description of the KMS key.
     *
     * Use a description that helps you to distinguish this KMS key from others in the account, such
     * as its intended use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-description)
     * @param description A description of the KMS key. 
     */
    public fun description(description: String)

    /**
     * Enables automatic rotation of the key material for the specified KMS key.
     *
     * By default, automatic key rotation is not enabled.
     *
     * AWS KMS supports automatic rotation only for symmetric encryption KMS keys ( `KeySpec` =
     * `SYMMETRIC_DEFAULT` ). For asymmetric KMS keys, HMAC KMS keys, and KMS keys with Origin
     * `EXTERNAL` , omit the `EnableKeyRotation` property or set it to `false` .
     *
     * To enable automatic key rotation of the key material for a multi-Region KMS key, set
     * `EnableKeyRotation` to `true` on the primary key (created by using `AWS::KMS::Key` ). AWS KMS
     * copies the rotation status to all replica keys. For details, see [Rotating multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * When you enable automatic rotation, AWS KMS automatically creates new key material for the
     * KMS key one year after the enable date and every year thereafter. AWS KMS retains all key
     * material until you delete the KMS key. For detailed information about automatic key rotation,
     * see [Rotating KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enablekeyrotation)
     * @param enableKeyRotation Enables automatic rotation of the key material for the specified KMS
     * key. 
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean)

    /**
     * Enables automatic rotation of the key material for the specified KMS key.
     *
     * By default, automatic key rotation is not enabled.
     *
     * AWS KMS supports automatic rotation only for symmetric encryption KMS keys ( `KeySpec` =
     * `SYMMETRIC_DEFAULT` ). For asymmetric KMS keys, HMAC KMS keys, and KMS keys with Origin
     * `EXTERNAL` , omit the `EnableKeyRotation` property or set it to `false` .
     *
     * To enable automatic key rotation of the key material for a multi-Region KMS key, set
     * `EnableKeyRotation` to `true` on the primary key (created by using `AWS::KMS::Key` ). AWS KMS
     * copies the rotation status to all replica keys. For details, see [Rotating multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * When you enable automatic rotation, AWS KMS automatically creates new key material for the
     * KMS key one year after the enable date and every year thereafter. AWS KMS retains all key
     * material until you delete the KMS key. For detailed information about automatic key rotation,
     * see [Rotating KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enablekeyrotation)
     * @param enableKeyRotation Enables automatic rotation of the key material for the specified KMS
     * key. 
     */
    public fun enableKeyRotation(enableKeyRotation: IResolvable)

    /**
     * Specifies whether the KMS key is enabled. Disabled KMS keys cannot be used in cryptographic
     * operations.
     *
     * When `Enabled` is `true` , the *key state* of the KMS key is `Enabled` . When `Enabled` is
     * `false` , the key state of the KMS key is `Disabled` . The default value is `true` .
     *
     * The actual key state of the KMS key might be affected by actions taken outside of
     * CloudFormation, such as running the
     * [EnableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html) ,
     * [DisableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html) , or
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operations.
     *
     * For information about the key states of a KMS key, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enabled)
     * @param enabled Specifies whether the KMS key is enabled. Disabled KMS keys cannot be used in
     * cryptographic operations. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether the KMS key is enabled. Disabled KMS keys cannot be used in cryptographic
     * operations.
     *
     * When `Enabled` is `true` , the *key state* of the KMS key is `Enabled` . When `Enabled` is
     * `false` , the key state of the KMS key is `Disabled` . The default value is `true` .
     *
     * The actual key state of the KMS key might be affected by actions taken outside of
     * CloudFormation, such as running the
     * [EnableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html) ,
     * [DisableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html) , or
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operations.
     *
     * For information about the key states of a KMS key, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enabled)
     * @param enabled Specifies whether the KMS key is enabled. Disabled KMS keys cannot be used in
     * cryptographic operations. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * The key policy to attach to the KMS key.
     *
     * If you provide a key policy, it must meet the following criteria:
     *
     * * The key policy must allow the caller to make a subsequent
     * [PutKeyPolicy](https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html)
     * request on the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more
     * information, see [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam)
     * in the *AWS Key Management Service Developer Guide* . (To omit this condition, set
     * `BypassPolicyLockoutSafetyCheck` to true.)
     * * Each statement in the key policy must contain one or more principals. The principals in the
     * key policy must exist and be visible to AWS KMS . When you create a new AWS principal (for
     * example, an IAM user or role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be immediately visible to AWS KMS
     * . For more information, see [Changes that I make are not always immediately
     * visible](https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * If you do not provide a key policy, AWS KMS attaches a default key policy to the KMS key. For
     * more information, see [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * A key policy document can include only the following characters:
     *
     * * Printable ASCII characters
     * * Printable characters in the Basic Latin and Latin-1 Supplement character set
     * * The tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return ( `\u000D` ) special
     * characters
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `32768`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keypolicy)
     * @param keyPolicy The key policy to attach to the KMS key. 
     */
    public fun keyPolicy(keyPolicy: Any)

    /**
     * Specifies the type of KMS key to create.
     *
     * The default value, `SYMMETRIC_DEFAULT` , creates a KMS key with a 256-bit symmetric key for
     * encryption and decryption. In China Regions, `SYMMETRIC_DEFAULT` creates a 128-bit symmetric key
     * that uses SM4 encryption. You can't change the `KeySpec` value after the KMS key is created. For
     * help choosing a key spec for your KMS key, see [Choosing a KMS key
     * type](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * The `KeySpec` property determines the type of key material in the KMS key and the algorithms
     * that the KMS key supports. To further restrict the algorithms that can be used with the KMS key,
     * use a condition key in its key policy or IAM policy. For more information, see [AWS KMS
     * condition
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms)
     * in the *AWS Key Management Service Developer Guide* .
     *
     *
     * If you change the value of the `KeySpec` property on an existing KMS key, the update request
     * fails, regardless of the value of the [`UpdateReplacePolicy`
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing an immutable property
     * value. &gt; [AWS services that are integrated with AWS
     * KMS](https://docs.aws.amazon.com/kms/features/#AWS_Service_Integration) use symmetric encryption
     * KMS keys to protect your data. These services do not support encryption with asymmetric KMS
     * keys. For help determining whether a KMS key is asymmetric, see [Identifying asymmetric KMS
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     *
     * AWS KMS supports the following key specs for KMS keys:
     *
     * * Symmetric encryption key (default)
     * * `SYMMETRIC_DEFAULT` (AES-256-GCM)
     * * HMAC keys (symmetric)
     * * `HMAC_224`
     * * `HMAC_256`
     * * `HMAC_384`
     * * `HMAC_512`
     * * Asymmetric RSA key pairs
     * * `RSA_2048`
     * * `RSA_3072`
     * * `RSA_4096`
     * * Asymmetric NIST-recommended elliptic curve key pairs
     * * `ECC_NIST_P256` (secp256r1)
     * * `ECC_NIST_P384` (secp384r1)
     * * `ECC_NIST_P521` (secp521r1)
     * * Other asymmetric elliptic curve key pairs
     * * `ECC_SECG_P256K1` (secp256k1), commonly used for cryptocurrencies.
     * * SM2 key pairs (China Regions only)
     * * `SM2`
     *
     * Default: - "SYMMETRIC_DEFAULT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keyspec)
     * @param keySpec Specifies the type of KMS key to create. 
     */
    public fun keySpec(keySpec: String)

    /**
     * Determines the [cryptographic
     * operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations)
     * for which you can use the KMS key. The default value is `ENCRYPT_DECRYPT` . This property is
     * required for asymmetric KMS keys and HMAC KMS keys. You can't change the `KeyUsage` value after
     * the KMS key is created.
     *
     *
     * If you change the value of the `KeyUsage` property on an existing KMS key, the update request
     * fails, regardless of the value of the [`UpdateReplacePolicy`
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing an immutable property
     * value.
     *
     *
     * Select only one valid value.
     *
     * * For symmetric encryption KMS keys, omit the property or specify `ENCRYPT_DECRYPT` .
     * * For asymmetric KMS keys with RSA key material, specify `ENCRYPT_DECRYPT` or `SIGN_VERIFY` .
     * * For asymmetric KMS keys with ECC key material, specify `SIGN_VERIFY` .
     * * For asymmetric KMS keys with SM2 (China Regions only) key material, specify
     * `ENCRYPT_DECRYPT` or `SIGN_VERIFY` .
     * * For HMAC KMS keys, specify `GENERATE_VERIFY_MAC` .
     *
     * Default: - "ENCRYPT_DECRYPT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keyusage)
     * @param keyUsage Determines the [cryptographic
     * operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations)
     * for which you can use the KMS key. The default value is `ENCRYPT_DECRYPT` . This property is
     * required for asymmetric KMS keys and HMAC KMS keys. You can't change the `KeyUsage` value after
     * the KMS key is created. 
     */
    public fun keyUsage(keyUsage: String)

    /**
     * Creates a multi-Region primary key that you can replicate in other AWS Regions .
     *
     * You can't change the `MultiRegion` value after the KMS key is created.
     *
     * For a list of AWS Regions in which multi-Region keys are supported, see [Multi-Region keys in
     * AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the ** .
     *
     *
     * If you change the value of the `MultiRegion` property on an existing KMS key, the update
     * request fails, regardless of the value of the [`UpdateReplacePolicy`
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing an immutable property
     * value.
     *
     *
     * For a multi-Region key, set to this property to `true` . For a single-Region key, omit this
     * property or set it to `false` . The default value is `false` .
     *
     * *Multi-Region keys* are an AWS KMS feature that lets you create multiple interoperable KMS
     * keys in different AWS Regions . Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them to encrypt data in one AWS Region and decrypt it in a different
     * AWS Region without making a cross-Region call or exposing the plaintext data. For more
     * information, see [Multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can create a symmetric encryption, HMAC, or asymmetric multi-Region KMS key, and you can
     * create a multi-Region key with imported key material. However, you cannot create a multi-Region
     * key in a custom key store.
     *
     * To create a replica of this primary key in a different AWS Region , create an
     * [AWS::KMS::ReplicaKey](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html)
     * resource in a CloudFormation stack in the replica Region. Specify the key ARN of this primary
     * key.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-multiregion)
     * @param multiRegion Creates a multi-Region primary key that you can replicate in other AWS
     * Regions . 
     */
    public fun multiRegion(multiRegion: Boolean)

    /**
     * Creates a multi-Region primary key that you can replicate in other AWS Regions .
     *
     * You can't change the `MultiRegion` value after the KMS key is created.
     *
     * For a list of AWS Regions in which multi-Region keys are supported, see [Multi-Region keys in
     * AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the ** .
     *
     *
     * If you change the value of the `MultiRegion` property on an existing KMS key, the update
     * request fails, regardless of the value of the [`UpdateReplacePolicy`
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing an immutable property
     * value.
     *
     *
     * For a multi-Region key, set to this property to `true` . For a single-Region key, omit this
     * property or set it to `false` . The default value is `false` .
     *
     * *Multi-Region keys* are an AWS KMS feature that lets you create multiple interoperable KMS
     * keys in different AWS Regions . Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them to encrypt data in one AWS Region and decrypt it in a different
     * AWS Region without making a cross-Region call or exposing the plaintext data. For more
     * information, see [Multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can create a symmetric encryption, HMAC, or asymmetric multi-Region KMS key, and you can
     * create a multi-Region key with imported key material. However, you cannot create a multi-Region
     * key in a custom key store.
     *
     * To create a replica of this primary key in a different AWS Region , create an
     * [AWS::KMS::ReplicaKey](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html)
     * resource in a CloudFormation stack in the replica Region. Specify the key ARN of this primary
     * key.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-multiregion)
     * @param multiRegion Creates a multi-Region primary key that you can replicate in other AWS
     * Regions . 
     */
    public fun multiRegion(multiRegion: IResolvable)

    /**
     * The source of the key material for the KMS key.
     *
     * You cannot change the origin after you create the KMS key. The default is `AWS_KMS` , which
     * means that AWS KMS creates the key material.
     *
     * To [create a KMS key with no key
     * material](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html)
     * (for imported key material), set this value to `EXTERNAL` . For more information about importing
     * key material into AWS KMS , see [Importing Key
     * Material](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * You can ignore `ENABLED` when Origin is `EXTERNAL` . When a KMS key with Origin `EXTERNAL` is
     * created, the key state is `PENDING_IMPORT` and `ENABLED` is `false` . After you import the key
     * material, `ENABLED` updated to `true` . The KMS key can then be used for Cryptographic
     * Operations.
     *
     *
     * AWS CloudFormation doesn't support creating an `Origin` parameter of the `AWS_CLOUDHSM` or
     * `EXTERNAL_KEY_STORE` values.
     *
     *
     * Default: - "AWS_KMS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-origin)
     * @param origin The source of the key material for the KMS key. 
     */
    public fun origin(origin: String)

    /**
     * Specifies the number of days in the waiting period before AWS KMS deletes a KMS key that has
     * been removed from a CloudFormation stack.
     *
     * Enter a value between 7 and 30 days. The default value is 30 days.
     *
     * When you remove a KMS key from a CloudFormation stack, AWS KMS schedules the KMS key for
     * deletion and starts the mandatory waiting period. The `PendingWindowInDays` property determines
     * the length of waiting period. During the waiting period, the key state of KMS key is `Pending
     * Deletion` or `Pending Replica Deletion` , which prevents the KMS key from being used in
     * cryptographic operations. When the waiting period expires, AWS KMS permanently deletes the KMS
     * key.
     *
     * AWS KMS will not delete a [multi-Region primary
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) that
     * has replica keys. If you remove a multi-Region primary key from a CloudFormation stack, its key
     * state changes to `PendingReplicaDeletion` so it cannot be replicated or used in cryptographic
     * operations. This state can persist indefinitely. When the last of its replica keys is deleted,
     * the key state of the primary key changes to `PendingDeletion` and the waiting period specified
     * by `PendingWindowInDays` begins. When this waiting period expires, AWS KMS deletes the primary
     * key. For details, see [Deleting multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You cannot use a CloudFormation template to cancel deletion of the KMS key after you remove
     * it from the stack, regardless of the waiting period. If you specify a KMS key in your template,
     * even one with the same name, CloudFormation creates a new KMS key. To cancel deletion of a KMS
     * key, use the AWS KMS console or the
     * [CancelKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_CancelKeyDeletion.html)
     * operation.
     *
     * For information about the `Pending Deletion` and `Pending Replica Deletion` key states, see
     * [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* . For more information about deleting KMS keys, see the
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operation in the *AWS Key Management Service API Reference* and [Deleting KMS
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-pendingwindowindays)
     * @param pendingWindowInDays Specifies the number of days in the waiting period before AWS KMS
     * deletes a KMS key that has been removed from a CloudFormation stack. 
     */
    public fun pendingWindowInDays(pendingWindowInDays: Number)

    /**
     * Assigns one or more tags to the replica key.
     *
     *
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see
     * [ABAC for AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/abac.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     *
     * For information about tags in AWS KMS , see [Tagging
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) in the *AWS Key
     * Management Service Developer Guide* . For information about tags in CloudFormation, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-tags)
     * @param tags Assigns one or more tags to the replica key. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Assigns one or more tags to the replica key.
     *
     *
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see
     * [ABAC for AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/abac.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     *
     * For information about tags in AWS KMS , see [Tagging
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) in the *AWS Key
     * Management Service Developer Guide* . For information about tags in CloudFormation, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-tags)
     * @param tags Assigns one or more tags to the replica key. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnKey.Builder =
        software.amazon.awscdk.services.kms.CfnKey.Builder.create(scope, id)

    /**
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     *
     *
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not
     * set this value to true indiscriminately.
     *
     * For more information, see [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key)
     * in the *AWS Key Management Service Developer Guide* .
     *
     *
     * Use this parameter only when you intend to prevent the principal that is making the request
     * from making a subsequent
     * [PutKeyPolicy](https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html)
     * request on the KMS key.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-bypasspolicylockoutsafetycheck)
     * @param bypassPolicyLockoutSafetyCheck Skips ("bypasses") the key policy lockout safety check.
     * The default value is false. 
     */
    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

    /**
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     *
     *
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not
     * set this value to true indiscriminately.
     *
     * For more information, see [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key)
     * in the *AWS Key Management Service Developer Guide* .
     *
     *
     * Use this parameter only when you intend to prevent the principal that is making the request
     * from making a subsequent
     * [PutKeyPolicy](https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html)
     * request on the KMS key.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-bypasspolicylockoutsafetycheck)
     * @param bypassPolicyLockoutSafetyCheck Skips ("bypasses") the key policy lockout safety check.
     * The default value is false. 
     */
    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck.let(IResolvable::unwrap))
    }

    /**
     * A description of the KMS key.
     *
     * Use a description that helps you to distinguish this KMS key from others in the account, such
     * as its intended use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-description)
     * @param description A description of the KMS key. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Enables automatic rotation of the key material for the specified KMS key.
     *
     * By default, automatic key rotation is not enabled.
     *
     * AWS KMS supports automatic rotation only for symmetric encryption KMS keys ( `KeySpec` =
     * `SYMMETRIC_DEFAULT` ). For asymmetric KMS keys, HMAC KMS keys, and KMS keys with Origin
     * `EXTERNAL` , omit the `EnableKeyRotation` property or set it to `false` .
     *
     * To enable automatic key rotation of the key material for a multi-Region KMS key, set
     * `EnableKeyRotation` to `true` on the primary key (created by using `AWS::KMS::Key` ). AWS KMS
     * copies the rotation status to all replica keys. For details, see [Rotating multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * When you enable automatic rotation, AWS KMS automatically creates new key material for the
     * KMS key one year after the enable date and every year thereafter. AWS KMS retains all key
     * material until you delete the KMS key. For detailed information about automatic key rotation,
     * see [Rotating KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enablekeyrotation)
     * @param enableKeyRotation Enables automatic rotation of the key material for the specified KMS
     * key. 
     */
    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * Enables automatic rotation of the key material for the specified KMS key.
     *
     * By default, automatic key rotation is not enabled.
     *
     * AWS KMS supports automatic rotation only for symmetric encryption KMS keys ( `KeySpec` =
     * `SYMMETRIC_DEFAULT` ). For asymmetric KMS keys, HMAC KMS keys, and KMS keys with Origin
     * `EXTERNAL` , omit the `EnableKeyRotation` property or set it to `false` .
     *
     * To enable automatic key rotation of the key material for a multi-Region KMS key, set
     * `EnableKeyRotation` to `true` on the primary key (created by using `AWS::KMS::Key` ). AWS KMS
     * copies the rotation status to all replica keys. For details, see [Rotating multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * When you enable automatic rotation, AWS KMS automatically creates new key material for the
     * KMS key one year after the enable date and every year thereafter. AWS KMS retains all key
     * material until you delete the KMS key. For detailed information about automatic key rotation,
     * see [Rotating KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enablekeyrotation)
     * @param enableKeyRotation Enables automatic rotation of the key material for the specified KMS
     * key. 
     */
    override fun enableKeyRotation(enableKeyRotation: IResolvable) {
      cdkBuilder.enableKeyRotation(enableKeyRotation.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether the KMS key is enabled. Disabled KMS keys cannot be used in cryptographic
     * operations.
     *
     * When `Enabled` is `true` , the *key state* of the KMS key is `Enabled` . When `Enabled` is
     * `false` , the key state of the KMS key is `Disabled` . The default value is `true` .
     *
     * The actual key state of the KMS key might be affected by actions taken outside of
     * CloudFormation, such as running the
     * [EnableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html) ,
     * [DisableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html) , or
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operations.
     *
     * For information about the key states of a KMS key, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enabled)
     * @param enabled Specifies whether the KMS key is enabled. Disabled KMS keys cannot be used in
     * cryptographic operations. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether the KMS key is enabled. Disabled KMS keys cannot be used in cryptographic
     * operations.
     *
     * When `Enabled` is `true` , the *key state* of the KMS key is `Enabled` . When `Enabled` is
     * `false` , the key state of the KMS key is `Disabled` . The default value is `true` .
     *
     * The actual key state of the KMS key might be affected by actions taken outside of
     * CloudFormation, such as running the
     * [EnableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html) ,
     * [DisableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html) , or
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operations.
     *
     * For information about the key states of a KMS key, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enabled)
     * @param enabled Specifies whether the KMS key is enabled. Disabled KMS keys cannot be used in
     * cryptographic operations. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * The key policy to attach to the KMS key.
     *
     * If you provide a key policy, it must meet the following criteria:
     *
     * * The key policy must allow the caller to make a subsequent
     * [PutKeyPolicy](https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html)
     * request on the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more
     * information, see [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam)
     * in the *AWS Key Management Service Developer Guide* . (To omit this condition, set
     * `BypassPolicyLockoutSafetyCheck` to true.)
     * * Each statement in the key policy must contain one or more principals. The principals in the
     * key policy must exist and be visible to AWS KMS . When you create a new AWS principal (for
     * example, an IAM user or role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be immediately visible to AWS KMS
     * . For more information, see [Changes that I make are not always immediately
     * visible](https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * If you do not provide a key policy, AWS KMS attaches a default key policy to the KMS key. For
     * more information, see [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * A key policy document can include only the following characters:
     *
     * * Printable ASCII characters
     * * Printable characters in the Basic Latin and Latin-1 Supplement character set
     * * The tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return ( `\u000D` ) special
     * characters
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `32768`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keypolicy)
     * @param keyPolicy The key policy to attach to the KMS key. 
     */
    override fun keyPolicy(keyPolicy: Any) {
      cdkBuilder.keyPolicy(keyPolicy)
    }

    /**
     * Specifies the type of KMS key to create.
     *
     * The default value, `SYMMETRIC_DEFAULT` , creates a KMS key with a 256-bit symmetric key for
     * encryption and decryption. In China Regions, `SYMMETRIC_DEFAULT` creates a 128-bit symmetric key
     * that uses SM4 encryption. You can't change the `KeySpec` value after the KMS key is created. For
     * help choosing a key spec for your KMS key, see [Choosing a KMS key
     * type](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * The `KeySpec` property determines the type of key material in the KMS key and the algorithms
     * that the KMS key supports. To further restrict the algorithms that can be used with the KMS key,
     * use a condition key in its key policy or IAM policy. For more information, see [AWS KMS
     * condition
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms)
     * in the *AWS Key Management Service Developer Guide* .
     *
     *
     * If you change the value of the `KeySpec` property on an existing KMS key, the update request
     * fails, regardless of the value of the [`UpdateReplacePolicy`
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing an immutable property
     * value. &gt; [AWS services that are integrated with AWS
     * KMS](https://docs.aws.amazon.com/kms/features/#AWS_Service_Integration) use symmetric encryption
     * KMS keys to protect your data. These services do not support encryption with asymmetric KMS
     * keys. For help determining whether a KMS key is asymmetric, see [Identifying asymmetric KMS
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     *
     * AWS KMS supports the following key specs for KMS keys:
     *
     * * Symmetric encryption key (default)
     * * `SYMMETRIC_DEFAULT` (AES-256-GCM)
     * * HMAC keys (symmetric)
     * * `HMAC_224`
     * * `HMAC_256`
     * * `HMAC_384`
     * * `HMAC_512`
     * * Asymmetric RSA key pairs
     * * `RSA_2048`
     * * `RSA_3072`
     * * `RSA_4096`
     * * Asymmetric NIST-recommended elliptic curve key pairs
     * * `ECC_NIST_P256` (secp256r1)
     * * `ECC_NIST_P384` (secp384r1)
     * * `ECC_NIST_P521` (secp521r1)
     * * Other asymmetric elliptic curve key pairs
     * * `ECC_SECG_P256K1` (secp256k1), commonly used for cryptocurrencies.
     * * SM2 key pairs (China Regions only)
     * * `SM2`
     *
     * Default: - "SYMMETRIC_DEFAULT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keyspec)
     * @param keySpec Specifies the type of KMS key to create. 
     */
    override fun keySpec(keySpec: String) {
      cdkBuilder.keySpec(keySpec)
    }

    /**
     * Determines the [cryptographic
     * operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations)
     * for which you can use the KMS key. The default value is `ENCRYPT_DECRYPT` . This property is
     * required for asymmetric KMS keys and HMAC KMS keys. You can't change the `KeyUsage` value after
     * the KMS key is created.
     *
     *
     * If you change the value of the `KeyUsage` property on an existing KMS key, the update request
     * fails, regardless of the value of the [`UpdateReplacePolicy`
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing an immutable property
     * value.
     *
     *
     * Select only one valid value.
     *
     * * For symmetric encryption KMS keys, omit the property or specify `ENCRYPT_DECRYPT` .
     * * For asymmetric KMS keys with RSA key material, specify `ENCRYPT_DECRYPT` or `SIGN_VERIFY` .
     * * For asymmetric KMS keys with ECC key material, specify `SIGN_VERIFY` .
     * * For asymmetric KMS keys with SM2 (China Regions only) key material, specify
     * `ENCRYPT_DECRYPT` or `SIGN_VERIFY` .
     * * For HMAC KMS keys, specify `GENERATE_VERIFY_MAC` .
     *
     * Default: - "ENCRYPT_DECRYPT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keyusage)
     * @param keyUsage Determines the [cryptographic
     * operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations)
     * for which you can use the KMS key. The default value is `ENCRYPT_DECRYPT` . This property is
     * required for asymmetric KMS keys and HMAC KMS keys. You can't change the `KeyUsage` value after
     * the KMS key is created. 
     */
    override fun keyUsage(keyUsage: String) {
      cdkBuilder.keyUsage(keyUsage)
    }

    /**
     * Creates a multi-Region primary key that you can replicate in other AWS Regions .
     *
     * You can't change the `MultiRegion` value after the KMS key is created.
     *
     * For a list of AWS Regions in which multi-Region keys are supported, see [Multi-Region keys in
     * AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the ** .
     *
     *
     * If you change the value of the `MultiRegion` property on an existing KMS key, the update
     * request fails, regardless of the value of the [`UpdateReplacePolicy`
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing an immutable property
     * value.
     *
     *
     * For a multi-Region key, set to this property to `true` . For a single-Region key, omit this
     * property or set it to `false` . The default value is `false` .
     *
     * *Multi-Region keys* are an AWS KMS feature that lets you create multiple interoperable KMS
     * keys in different AWS Regions . Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them to encrypt data in one AWS Region and decrypt it in a different
     * AWS Region without making a cross-Region call or exposing the plaintext data. For more
     * information, see [Multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can create a symmetric encryption, HMAC, or asymmetric multi-Region KMS key, and you can
     * create a multi-Region key with imported key material. However, you cannot create a multi-Region
     * key in a custom key store.
     *
     * To create a replica of this primary key in a different AWS Region , create an
     * [AWS::KMS::ReplicaKey](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html)
     * resource in a CloudFormation stack in the replica Region. Specify the key ARN of this primary
     * key.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-multiregion)
     * @param multiRegion Creates a multi-Region primary key that you can replicate in other AWS
     * Regions . 
     */
    override fun multiRegion(multiRegion: Boolean) {
      cdkBuilder.multiRegion(multiRegion)
    }

    /**
     * Creates a multi-Region primary key that you can replicate in other AWS Regions .
     *
     * You can't change the `MultiRegion` value after the KMS key is created.
     *
     * For a list of AWS Regions in which multi-Region keys are supported, see [Multi-Region keys in
     * AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the ** .
     *
     *
     * If you change the value of the `MultiRegion` property on an existing KMS key, the update
     * request fails, regardless of the value of the [`UpdateReplacePolicy`
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing an immutable property
     * value.
     *
     *
     * For a multi-Region key, set to this property to `true` . For a single-Region key, omit this
     * property or set it to `false` . The default value is `false` .
     *
     * *Multi-Region keys* are an AWS KMS feature that lets you create multiple interoperable KMS
     * keys in different AWS Regions . Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them to encrypt data in one AWS Region and decrypt it in a different
     * AWS Region without making a cross-Region call or exposing the plaintext data. For more
     * information, see [Multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can create a symmetric encryption, HMAC, or asymmetric multi-Region KMS key, and you can
     * create a multi-Region key with imported key material. However, you cannot create a multi-Region
     * key in a custom key store.
     *
     * To create a replica of this primary key in a different AWS Region , create an
     * [AWS::KMS::ReplicaKey](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html)
     * resource in a CloudFormation stack in the replica Region. Specify the key ARN of this primary
     * key.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-multiregion)
     * @param multiRegion Creates a multi-Region primary key that you can replicate in other AWS
     * Regions . 
     */
    override fun multiRegion(multiRegion: IResolvable) {
      cdkBuilder.multiRegion(multiRegion.let(IResolvable::unwrap))
    }

    /**
     * The source of the key material for the KMS key.
     *
     * You cannot change the origin after you create the KMS key. The default is `AWS_KMS` , which
     * means that AWS KMS creates the key material.
     *
     * To [create a KMS key with no key
     * material](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html)
     * (for imported key material), set this value to `EXTERNAL` . For more information about importing
     * key material into AWS KMS , see [Importing Key
     * Material](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * You can ignore `ENABLED` when Origin is `EXTERNAL` . When a KMS key with Origin `EXTERNAL` is
     * created, the key state is `PENDING_IMPORT` and `ENABLED` is `false` . After you import the key
     * material, `ENABLED` updated to `true` . The KMS key can then be used for Cryptographic
     * Operations.
     *
     *
     * AWS CloudFormation doesn't support creating an `Origin` parameter of the `AWS_CLOUDHSM` or
     * `EXTERNAL_KEY_STORE` values.
     *
     *
     * Default: - "AWS_KMS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-origin)
     * @param origin The source of the key material for the KMS key. 
     */
    override fun origin(origin: String) {
      cdkBuilder.origin(origin)
    }

    /**
     * Specifies the number of days in the waiting period before AWS KMS deletes a KMS key that has
     * been removed from a CloudFormation stack.
     *
     * Enter a value between 7 and 30 days. The default value is 30 days.
     *
     * When you remove a KMS key from a CloudFormation stack, AWS KMS schedules the KMS key for
     * deletion and starts the mandatory waiting period. The `PendingWindowInDays` property determines
     * the length of waiting period. During the waiting period, the key state of KMS key is `Pending
     * Deletion` or `Pending Replica Deletion` , which prevents the KMS key from being used in
     * cryptographic operations. When the waiting period expires, AWS KMS permanently deletes the KMS
     * key.
     *
     * AWS KMS will not delete a [multi-Region primary
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) that
     * has replica keys. If you remove a multi-Region primary key from a CloudFormation stack, its key
     * state changes to `PendingReplicaDeletion` so it cannot be replicated or used in cryptographic
     * operations. This state can persist indefinitely. When the last of its replica keys is deleted,
     * the key state of the primary key changes to `PendingDeletion` and the waiting period specified
     * by `PendingWindowInDays` begins. When this waiting period expires, AWS KMS deletes the primary
     * key. For details, see [Deleting multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You cannot use a CloudFormation template to cancel deletion of the KMS key after you remove
     * it from the stack, regardless of the waiting period. If you specify a KMS key in your template,
     * even one with the same name, CloudFormation creates a new KMS key. To cancel deletion of a KMS
     * key, use the AWS KMS console or the
     * [CancelKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_CancelKeyDeletion.html)
     * operation.
     *
     * For information about the `Pending Deletion` and `Pending Replica Deletion` key states, see
     * [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* . For more information about deleting KMS keys, see the
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operation in the *AWS Key Management Service API Reference* and [Deleting KMS
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-pendingwindowindays)
     * @param pendingWindowInDays Specifies the number of days in the waiting period before AWS KMS
     * deletes a KMS key that has been removed from a CloudFormation stack. 
     */
    override fun pendingWindowInDays(pendingWindowInDays: Number) {
      cdkBuilder.pendingWindowInDays(pendingWindowInDays)
    }

    /**
     * Assigns one or more tags to the replica key.
     *
     *
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see
     * [ABAC for AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/abac.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     *
     * For information about tags in AWS KMS , see [Tagging
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) in the *AWS Key
     * Management Service Developer Guide* . For information about tags in CloudFormation, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-tags)
     * @param tags Assigns one or more tags to the replica key. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Assigns one or more tags to the replica key.
     *
     *
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see
     * [ABAC for AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/abac.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     *
     * For information about tags in AWS KMS , see [Tagging
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) in the *AWS Key
     * Management Service Developer Guide* . For information about tags in CloudFormation, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-tags)
     * @param tags Assigns one or more tags to the replica key. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kms.CfnKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kms.CfnKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnKey): CfnKey =
        CfnKey(cdkObject)

    internal fun unwrap(wrapped: CfnKey): software.amazon.awscdk.services.kms.CfnKey =
        wrapped.cdkObject
  }
}
