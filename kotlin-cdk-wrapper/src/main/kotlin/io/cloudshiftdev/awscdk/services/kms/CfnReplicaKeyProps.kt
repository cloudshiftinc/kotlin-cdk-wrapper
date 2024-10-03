@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnReplicaKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Object keyPolicy;
 * CfnReplicaKeyProps cfnReplicaKeyProps = CfnReplicaKeyProps.builder()
 * .keyPolicy(keyPolicy)
 * .primaryKeyArn("primaryKeyArn")
 * // the properties below are optional
 * .description("description")
 * .enabled(false)
 * .pendingWindowInDays(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html)
 */
public interface CfnReplicaKeyProps {
  /**
   * A description of the KMS key.
   *
   * The default value is an empty string (no description).
   *
   * The description is not a shared property of multi-Region keys. You can specify the same
   * description or a different description for each key in a set of related multi-Region keys. AWS Key
   * Management Service does not synchronize this property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic
   * operations.
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
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The key policy that authorizes use of the replica key.
   *
   * The key policy is not a shared property of multi-Region keys. You can specify the same key
   * policy or a different key policy for each key in a set of related multi-Region keys. AWS KMS does
   * not synchronize this property.
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
   * principal in a key policy because the new principal might not be immediately visible to AWS KMS .
   * For more information, see [Changes that I make are not always immediately
   * visible](https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency)
   * in the *AWS Identity and Access Management User Guide* .
   *
   * A key policy document can include only the following characters:
   *
   * * Printable ASCII characters from the space character ( `\u0020` ) through the end of the ASCII
   * character range.
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
   */
  public fun keyPolicy(): Any

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
   * If the KMS key is a multi-Region primary key with replica keys, the waiting period begins when
   * the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
   *
   * You cannot use a CloudFormation template to cancel deletion of the replica after you remove it
   * from the stack, regardless of the waiting period. However, if you specify a replica key in your
   * template that is based on the same primary key as the original replica key, CloudFormation creates
   * a new replica key with the same key ID, key material, and other shared properties of the original
   * replica key. This new replica key can decrypt ciphertext that was encrypted under the original
   * replica key, or any related multi-Region key.
   *
   * For detailed information about deleting multi-Region keys, see [Deleting multi-Region
   * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html) in the
   * *AWS Key Management Service Developer Guide* .
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
   */
  public fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

  /**
   * Specifies the multi-Region primary key to replicate.
   *
   * The primary key must be in a different AWS Region of the same AWS partition. You can create
   * only one replica of a given primary key in each AWS Region .
   *
   *
   * If you change the `PrimaryKeyArn` value of a replica key, the existing replica key is scheduled
   * for deletion and a new replica key is created based on the specified primary key. While it is
   * scheduled for deletion, the existing replica key becomes unusable. You can cancel the scheduled
   * deletion of the key outside of CloudFormation.
   *
   * However, if you inadvertently delete a replica key, you can decrypt ciphertext encrypted by
   * that replica key by using any related multi-Region key. If necessary, you can recreate the replica
   * in the same Region after the previous one is completely deleted. For details, see [Deleting
   * multi-Region
   * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html) in the
   * *AWS Key Management Service Developer Guide*
   *
   *
   * Specify the key ARN of an existing multi-Region primary key. For example,
   * `arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-primarykeyarn)
   */
  public fun primaryKeyArn(): String

  /**
   * Assigns one or more tags to the replica key.
   *
   *
   * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see
   * [ABAC for AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/abac.html) in the *AWS
   * Key Management Service Developer Guide* .
   *
   *
   * Tags are not a shared property of multi-Region keys. You can specify the same tags or different
   * tags for each key in a set of related multi-Region keys. AWS KMS does not synchronize this
   * property.
   *
   * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are
   * required, but the tag value can be an empty (null) string. You cannot have more than one tag on a
   * KMS key with the same tag key. If you specify an existing tag key with a different tag value, AWS
   * KMS replaces the current tag value with the specified one.
   *
   * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and
   * costs aggregated by tags. Tags can also be used to control access to a KMS key. For details, see
   * [Tagging keys](https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html#cfn-kms-replicakey-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnReplicaKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the KMS key.
     * The default value is an empty string (no description).
     *
     * The description is not a shared property of multi-Region keys. You can specify the same
     * description or a different description for each key in a set of related multi-Region keys. AWS
     * Key Management Service does not synchronize this property.
     */
    public fun description(description: String)

    /**
     * @param enabled Specifies whether the replica key is enabled. Disabled KMS keys cannot be used
     * in cryptographic operations.
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
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether the replica key is enabled. Disabled KMS keys cannot be used
     * in cryptographic operations.
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
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param keyPolicy The key policy that authorizes use of the replica key. 
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
     */
    public fun keyPolicy(keyPolicy: Any)

    /**
     * @param pendingWindowInDays Specifies the number of days in the waiting period before AWS KMS
     * deletes a replica key that has been removed from a CloudFormation stack.
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
     */
    public fun pendingWindowInDays(pendingWindowInDays: Number)

    /**
     * @param primaryKeyArn Specifies the multi-Region primary key to replicate. 
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
     */
    public fun primaryKeyArn(primaryKeyArn: String)

    /**
     * @param tags Assigns one or more tags to the replica key.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Assigns one or more tags to the replica key.
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
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnReplicaKeyProps.Builder =
        software.amazon.awscdk.services.kms.CfnReplicaKeyProps.builder()

    /**
     * @param description A description of the KMS key.
     * The default value is an empty string (no description).
     *
     * The description is not a shared property of multi-Region keys. You can specify the same
     * description or a different description for each key in a set of related multi-Region keys. AWS
     * Key Management Service does not synchronize this property.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enabled Specifies whether the replica key is enabled. Disabled KMS keys cannot be used
     * in cryptographic operations.
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
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether the replica key is enabled. Disabled KMS keys cannot be used
     * in cryptographic operations.
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
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param keyPolicy The key policy that authorizes use of the replica key. 
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
     */
    override fun keyPolicy(keyPolicy: Any) {
      cdkBuilder.keyPolicy(keyPolicy)
    }

    /**
     * @param pendingWindowInDays Specifies the number of days in the waiting period before AWS KMS
     * deletes a replica key that has been removed from a CloudFormation stack.
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
     */
    override fun pendingWindowInDays(pendingWindowInDays: Number) {
      cdkBuilder.pendingWindowInDays(pendingWindowInDays)
    }

    /**
     * @param primaryKeyArn Specifies the multi-Region primary key to replicate. 
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
     */
    override fun primaryKeyArn(primaryKeyArn: String) {
      cdkBuilder.primaryKeyArn(primaryKeyArn)
    }

    /**
     * @param tags Assigns one or more tags to the replica key.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Assigns one or more tags to the replica key.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kms.CfnReplicaKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kms.CfnReplicaKeyProps,
  ) : CdkObject(cdkObject),
      CfnReplicaKeyProps {
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
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

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
     */
    override fun keyPolicy(): Any = unwrap(this).getKeyPolicy()

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
     */
    override fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

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
     */
    override fun primaryKeyArn(): String = unwrap(this).getPrimaryKeyArn()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicaKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnReplicaKeyProps):
        CfnReplicaKeyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnReplicaKeyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicaKeyProps):
        software.amazon.awscdk.services.kms.CfnReplicaKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kms.CfnReplicaKeyProps
  }
}
