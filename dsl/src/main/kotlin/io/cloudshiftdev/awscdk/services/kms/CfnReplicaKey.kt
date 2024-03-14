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

public open class CfnReplicaKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kms.CfnReplicaKey,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the replica key, such as
   * `arn:aws:kms:us-west-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab` .
   *
   * The key ARNs of related multi-Region keys differ only in the Region value. For information
   * about the key ARNs of multi-Region keys, see [How multi-Region keys
   * work](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html#mrk-how-it-works)
   * in the *AWS Key Management Service Developer Guide* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The key ID of the replica key, such as `mrk-1234abcd12ab34cd56ef1234567890ab` .
   *
   * Related multi-Region keys have the same key ID. For information about the key IDs of
   * multi-Region keys, see [How multi-Region keys
   * work](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html#mrk-how-it-works)
   * in the *AWS Key Management Service Developer Guide* .
   */
  public open fun attrKeyId(): String = unwrap(this).getAttrKeyId()

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
   * Specifies whether the replica key is enabled.
   *
   * Disabled KMS keys cannot be used in cryptographic operations.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether the replica key is enabled.
   *
   * Disabled KMS keys cannot be used in cryptographic operations.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether the replica key is enabled.
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
   * The key policy that authorizes use of the replica key.
   */
  public open fun keyPolicy(): Any = unwrap(this).getKeyPolicy()

  /**
   * The key policy that authorizes use of the replica key.
   */
  public open fun keyPolicy(`value`: Any) {
    unwrap(this).setKeyPolicy(`value`)
  }

  /**
   * Specifies the number of days in the waiting period before AWS KMS deletes a replica key that
   * has been removed from a CloudFormation stack.
   */
  public open fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

  /**
   * Specifies the number of days in the waiting period before AWS KMS deletes a replica key that
   * has been removed from a CloudFormation stack.
   */
  public open fun pendingWindowInDays(`value`: Number) {
    unwrap(this).setPendingWindowInDays(`value`)
  }

  /**
   * Specifies the multi-Region primary key to replicate.
   */
  public open fun primaryKeyArn(): String = unwrap(this).getPrimaryKeyArn()

  /**
   * Specifies the multi-Region primary key to replicate.
   */
  public open fun primaryKeyArn(`value`: String) {
    unwrap(this).setPrimaryKeyArn(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kms.CfnReplicaKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the KMS key.
     *
     * The default value is an empty string (no description).
     *
     * The description is not a shared property of multi-Region keys. You can specify the same
     * description or a different description for each key in a set of related multi-Region keys. AWS
     * Key Management Service does not synchronize this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-description)
     * @param description A description of the KMS key. 
     */
    public fun description(description: String)

    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in
     * cryptographic operations.
     *
     * When `Enabled` is `true` , the *key state* of the KMS key is `Enabled` . When `Enabled` is
     * `false` , the key state of the KMS key is `Disabled` . The default value is `true` .
     *
     * The actual key state of the replica might be affected by actions taken outside of
     * CloudFormation, such as running the
     * [EnableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html) ,
     * [DisableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html) , or
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operations. Also, while the replica key is being created, its key state is `Creating` . When the
     * process is complete, the key state of the replica key changes to `Enabled` .
     *
     * For information about the key states of a KMS key, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-enabled)
     * @param enabled Specifies whether the replica key is enabled. Disabled KMS keys cannot be used
     * in cryptographic operations. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in
     * cryptographic operations.
     *
     * When `Enabled` is `true` , the *key state* of the KMS key is `Enabled` . When `Enabled` is
     * `false` , the key state of the KMS key is `Disabled` . The default value is `true` .
     *
     * The actual key state of the replica might be affected by actions taken outside of
     * CloudFormation, such as running the
     * [EnableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html) ,
     * [DisableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html) , or
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operations. Also, while the replica key is being created, its key state is `Creating` . When the
     * process is complete, the key state of the replica key changes to `Enabled` .
     *
     * For information about the key states of a KMS key, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-enabled)
     * @param enabled Specifies whether the replica key is enabled. Disabled KMS keys cannot be used
     * in cryptographic operations. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * The key policy that authorizes use of the replica key.
     *
     * The key policy is not a shared property of multi-Region keys. You can specify the same key
     * policy or a different key policy for each key in a set of related multi-Region keys. AWS KMS
     * does not synchronize this property.
     *
     * The key policy must conform to the following rules.
     *
     * * The key policy must give the caller
     * [PutKeyPolicy](https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html)
     * permission on the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more
     * information, refer to the scenario in the [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam)
     * section of the **AWS Key Management Service Developer Guide** .
     * * Each statement in the key policy must contain one or more principals. The principals in the
     * key policy must exist and be visible to AWS KMS . When you create a new AWS principal (for
     * example, an IAM user or role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be immediately visible to AWS KMS
     * . For more information, see [Changes that I make are not always immediately
     * visible](https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * A key policy document can include only the following characters:
     *
     * * Printable ASCII characters from the space character ( `\u0020` ) through the end of the
     * ASCII character range.
     * * Printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` ).
     * * The tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return ( `\u000D` ) special
     * characters
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `32768`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-keypolicy)
     * @param keyPolicy The key policy that authorizes use of the replica key. 
     */
    public fun keyPolicy(keyPolicy: Any)

    /**
     * Specifies the number of days in the waiting period before AWS KMS deletes a replica key that
     * has been removed from a CloudFormation stack.
     *
     * Enter a value between 7 and 30 days. The default value is 30 days.
     *
     * When you remove a replica key from a CloudFormation stack, AWS KMS schedules the replica key
     * for deletion and starts the mandatory waiting period. The `PendingWindowInDays` property
     * determines the length of waiting period. During the waiting period, the key state of replica key
     * is `Pending Deletion` , which prevents it from being used in cryptographic operations. When the
     * waiting period expires, AWS KMS permanently deletes the replica key.
     *
     * If the KMS key is a multi-Region primary key with replica keys, the waiting period begins
     * when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     *
     * You cannot use a CloudFormation template to cancel deletion of the replica after you remove
     * it from the stack, regardless of the waiting period. However, if you specify a replica key in
     * your template that is based on the same primary key as the original replica key, CloudFormation
     * creates a new replica key with the same key ID, key material, and other shared properties of the
     * original replica key. This new replica key can decrypt ciphertext that was encrypted under the
     * original replica key, or any related multi-Region key.
     *
     * For detailed information about deleting multi-Region keys, see [Deleting multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * For information about the `PendingDeletion` key state, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* . For more information about deleting KMS keys, see the
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operation in the *AWS Key Management Service API Reference* and [Deleting KMS
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-pendingwindowindays)
     * @param pendingWindowInDays Specifies the number of days in the waiting period before AWS KMS
     * deletes a replica key that has been removed from a CloudFormation stack. 
     */
    public fun pendingWindowInDays(pendingWindowInDays: Number)

    /**
     * Specifies the multi-Region primary key to replicate.
     *
     * The primary key must be in a different AWS Region of the same AWS partition. You can create
     * only one replica of a given primary key in each AWS Region .
     *
     *
     * If you change the `PrimaryKeyArn` value of a replica key, the existing replica key is
     * scheduled for deletion and a new replica key is created based on the specified primary key.
     * While it is scheduled for deletion, the existing replica key becomes unusable. You can cancel
     * the scheduled deletion of the key outside of CloudFormation.
     *
     * However, if you inadvertently delete a replica key, you can decrypt ciphertext encrypted by
     * that replica key by using any related multi-Region key. If necessary, you can recreate the
     * replica in the same Region after the previous one is completely deleted. For details, see
     * [Deleting multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html) in
     * the *AWS Key Management Service Developer Guide*
     *
     *
     * Specify the key ARN of an existing multi-Region primary key. For example,
     * `arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-primarykeyarn)
     * @param primaryKeyArn Specifies the multi-Region primary key to replicate. 
     */
    public fun primaryKeyArn(primaryKeyArn: String)

    /**
     * Assigns one or more tags to the replica key.
     *
     *
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see
     * [ABAC for AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/abac.html) in the *AWS
     * Key Management Service Developer Guide* .
     *
     *
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or
     * different tags for each key in a set of related multi-Region keys. AWS KMS does not synchronize
     * this property.
     *
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are
     * required, but the tag value can be an empty (null) string. You cannot have more than one tag on
     * a KMS key with the same tag key. If you specify an existing tag key with a different tag value,
     * AWS KMS replaces the current tag value with the specified one.
     *
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage
     * and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details,
     * see [Tagging keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-tags)
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
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or
     * different tags for each key in a set of related multi-Region keys. AWS KMS does not synchronize
     * this property.
     *
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are
     * required, but the tag value can be an empty (null) string. You cannot have more than one tag on
     * a KMS key with the same tag key. If you specify an existing tag key with a different tag value,
     * AWS KMS replaces the current tag value with the specified one.
     *
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage
     * and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details,
     * see [Tagging keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-tags)
     * @param tags Assigns one or more tags to the replica key. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnReplicaKey.Builder =
        software.amazon.awscdk.services.kms.CfnReplicaKey.Builder.create(scope, id)

    /**
     * A description of the KMS key.
     *
     * The default value is an empty string (no description).
     *
     * The description is not a shared property of multi-Region keys. You can specify the same
     * description or a different description for each key in a set of related multi-Region keys. AWS
     * Key Management Service does not synchronize this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-description)
     * @param description A description of the KMS key. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in
     * cryptographic operations.
     *
     * When `Enabled` is `true` , the *key state* of the KMS key is `Enabled` . When `Enabled` is
     * `false` , the key state of the KMS key is `Disabled` . The default value is `true` .
     *
     * The actual key state of the replica might be affected by actions taken outside of
     * CloudFormation, such as running the
     * [EnableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html) ,
     * [DisableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html) , or
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operations. Also, while the replica key is being created, its key state is `Creating` . When the
     * process is complete, the key state of the replica key changes to `Enabled` .
     *
     * For information about the key states of a KMS key, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-enabled)
     * @param enabled Specifies whether the replica key is enabled. Disabled KMS keys cannot be used
     * in cryptographic operations. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in
     * cryptographic operations.
     *
     * When `Enabled` is `true` , the *key state* of the KMS key is `Enabled` . When `Enabled` is
     * `false` , the key state of the KMS key is `Disabled` . The default value is `true` .
     *
     * The actual key state of the replica might be affected by actions taken outside of
     * CloudFormation, such as running the
     * [EnableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html) ,
     * [DisableKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html) , or
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operations. Also, while the replica key is being created, its key state is `Creating` . When the
     * process is complete, the key state of the replica key changes to `Enabled` .
     *
     * For information about the key states of a KMS key, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-enabled)
     * @param enabled Specifies whether the replica key is enabled. Disabled KMS keys cannot be used
     * in cryptographic operations. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * The key policy that authorizes use of the replica key.
     *
     * The key policy is not a shared property of multi-Region keys. You can specify the same key
     * policy or a different key policy for each key in a set of related multi-Region keys. AWS KMS
     * does not synchronize this property.
     *
     * The key policy must conform to the following rules.
     *
     * * The key policy must give the caller
     * [PutKeyPolicy](https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html)
     * permission on the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more
     * information, refer to the scenario in the [Default key
     * policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam)
     * section of the **AWS Key Management Service Developer Guide** .
     * * Each statement in the key policy must contain one or more principals. The principals in the
     * key policy must exist and be visible to AWS KMS . When you create a new AWS principal (for
     * example, an IAM user or role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be immediately visible to AWS KMS
     * . For more information, see [Changes that I make are not always immediately
     * visible](https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * A key policy document can include only the following characters:
     *
     * * Printable ASCII characters from the space character ( `\u0020` ) through the end of the
     * ASCII character range.
     * * Printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` ).
     * * The tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return ( `\u000D` ) special
     * characters
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `32768`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-keypolicy)
     * @param keyPolicy The key policy that authorizes use of the replica key. 
     */
    override fun keyPolicy(keyPolicy: Any) {
      cdkBuilder.keyPolicy(keyPolicy)
    }

    /**
     * Specifies the number of days in the waiting period before AWS KMS deletes a replica key that
     * has been removed from a CloudFormation stack.
     *
     * Enter a value between 7 and 30 days. The default value is 30 days.
     *
     * When you remove a replica key from a CloudFormation stack, AWS KMS schedules the replica key
     * for deletion and starts the mandatory waiting period. The `PendingWindowInDays` property
     * determines the length of waiting period. During the waiting period, the key state of replica key
     * is `Pending Deletion` , which prevents it from being used in cryptographic operations. When the
     * waiting period expires, AWS KMS permanently deletes the replica key.
     *
     * If the KMS key is a multi-Region primary key with replica keys, the waiting period begins
     * when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     *
     * You cannot use a CloudFormation template to cancel deletion of the replica after you remove
     * it from the stack, regardless of the waiting period. However, if you specify a replica key in
     * your template that is based on the same primary key as the original replica key, CloudFormation
     * creates a new replica key with the same key ID, key material, and other shared properties of the
     * original replica key. This new replica key can decrypt ciphertext that was encrypted under the
     * original replica key, or any related multi-Region key.
     *
     * For detailed information about deleting multi-Region keys, see [Deleting multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * For information about the `PendingDeletion` key state, see [Key state: Effect on your KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html) in the *AWS Key
     * Management Service Developer Guide* . For more information about deleting KMS keys, see the
     * [ScheduleKeyDeletion](https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html)
     * operation in the *AWS Key Management Service API Reference* and [Deleting KMS
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-pendingwindowindays)
     * @param pendingWindowInDays Specifies the number of days in the waiting period before AWS KMS
     * deletes a replica key that has been removed from a CloudFormation stack. 
     */
    override fun pendingWindowInDays(pendingWindowInDays: Number) {
      cdkBuilder.pendingWindowInDays(pendingWindowInDays)
    }

    /**
     * Specifies the multi-Region primary key to replicate.
     *
     * The primary key must be in a different AWS Region of the same AWS partition. You can create
     * only one replica of a given primary key in each AWS Region .
     *
     *
     * If you change the `PrimaryKeyArn` value of a replica key, the existing replica key is
     * scheduled for deletion and a new replica key is created based on the specified primary key.
     * While it is scheduled for deletion, the existing replica key becomes unusable. You can cancel
     * the scheduled deletion of the key outside of CloudFormation.
     *
     * However, if you inadvertently delete a replica key, you can decrypt ciphertext encrypted by
     * that replica key by using any related multi-Region key. If necessary, you can recreate the
     * replica in the same Region after the previous one is completely deleted. For details, see
     * [Deleting multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html) in
     * the *AWS Key Management Service Developer Guide*
     *
     *
     * Specify the key ARN of an existing multi-Region primary key. For example,
     * `arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-primarykeyarn)
     * @param primaryKeyArn Specifies the multi-Region primary key to replicate. 
     */
    override fun primaryKeyArn(primaryKeyArn: String) {
      cdkBuilder.primaryKeyArn(primaryKeyArn)
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
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or
     * different tags for each key in a set of related multi-Region keys. AWS KMS does not synchronize
     * this property.
     *
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are
     * required, but the tag value can be an empty (null) string. You cannot have more than one tag on
     * a KMS key with the same tag key. If you specify an existing tag key with a different tag value,
     * AWS KMS replaces the current tag value with the specified one.
     *
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage
     * and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details,
     * see [Tagging keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-tags)
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
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or
     * different tags for each key in a set of related multi-Region keys. AWS KMS does not synchronize
     * this property.
     *
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are
     * required, but the tag value can be an empty (null) string. You cannot have more than one tag on
     * a KMS key with the same tag key. If you specify an existing tag key with a different tag value,
     * AWS KMS replaces the current tag value with the specified one.
     *
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage
     * and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details,
     * see [Tagging keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-tags)
     * @param tags Assigns one or more tags to the replica key. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kms.CfnReplicaKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kms.CfnReplicaKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicaKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicaKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnReplicaKey): CfnReplicaKey =
        CfnReplicaKey(cdkObject)

    internal fun unwrap(wrapped: CfnReplicaKey): software.amazon.awscdk.services.kms.CfnReplicaKey =
        wrapped.cdkObject
  }
}
