@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.qldb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.qldb.CfnLedger
import software.constructs.Construct

/**
 * The `AWS::QLDB::Ledger` resource specifies a new Amazon Quantum Ledger Database (Amazon QLDB)
 * ledger in your AWS account .
 *
 * Amazon QLDB is a fully managed ledger database that provides a transparent, immutable, and
 * cryptographically verifiable transaction log owned by a central trusted authority. You can use QLDB
 * to track all application data changes, and maintain a complete and verifiable history of changes
 * over time.
 *
 * For more information, see
 * [CreateLedger](https://docs.aws.amazon.com/qldb/latest/developerguide/API_CreateLedger.html) in the
 * *Amazon QLDB API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.qldb.*;
 * CfnLedger cfnLedger = CfnLedger.Builder.create(this, "MyCfnLedger")
 * .permissionsMode("permissionsMode")
 * // the properties below are optional
 * .deletionProtection(false)
 * .kmsKey("kmsKey")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html)
 */
@CdkDslMarker
public class CfnLedgerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLedger.Builder = CfnLedger.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies whether the ledger is protected from being deleted by any user.
   *
   * If not defined during ledger creation, this feature is enabled ( `true` ) by default.
   *
   * If deletion protection is enabled, you must first disable it before you can delete the ledger.
   * You can disable it by calling the `UpdateLedger` operation to set this parameter to `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-deletionprotection)
   * @param deletionProtection Specifies whether the ledger is protected from being deleted by any
   * user. 
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * Specifies whether the ledger is protected from being deleted by any user.
   *
   * If not defined during ledger creation, this feature is enabled ( `true` ) by default.
   *
   * If deletion protection is enabled, you must first disable it before you can delete the ledger.
   * You can disable it by calling the `UpdateLedger` operation to set this parameter to `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-deletionprotection)
   * @param deletionProtection Specifies whether the ledger is protected from being deleted by any
   * user. 
   */
  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * The key in AWS Key Management Service ( AWS KMS ) to use for encryption of data at rest in the
   * ledger.
   *
   * For more information, see [Encryption at
   * rest](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html) in the
   * *Amazon QLDB Developer Guide* .
   *
   * Use one of the following options to specify this parameter:
   *
   * * `AWS_OWNED_KMS_KEY` : Use an AWS KMS key that is owned and managed by AWS on your behalf.
   * * *Undefined* : By default, use an AWS owned KMS key.
   * * *A valid symmetric customer managed KMS key* : Use the specified symmetric encryption KMS key
   * in your account that you create, own, and manage.
   *
   * Amazon QLDB does not support asymmetric keys. For more information, see [Using symmetric and
   * asymmetric keys](https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html)
   * in the *AWS Key Management Service Developer Guide* .
   *
   * To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN),
   * alias name, or alias ARN. When using an alias name, prefix it with `"alias/"` . To specify a key
   * in a different AWS account , you must use the key ARN or alias ARN.
   *
   * For example:
   *
   * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
   * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
   * * Alias name: `alias/ExampleAlias`
   * * Alias ARN: `arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias`
   *
   * For more information, see [Key identifiers
   * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
   * Key Management Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-kmskey)
   * @param kmsKey The key in AWS Key Management Service ( AWS KMS ) to use for encryption of data
   * at rest in the ledger. 
   */
  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  /**
   * The name of the ledger that you want to create.
   *
   * The name must be unique among all of the ledgers in your AWS account in the current Region.
   *
   * Naming constraints for ledger names are defined in [Quotas in Amazon
   * QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming) in the
   * *Amazon QLDB Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-name)
   * @param name The name of the ledger that you want to create. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The permissions mode to assign to the ledger that you want to create.
   *
   * This parameter can have one of the following values:
   *
   * * `ALLOW_ALL` : A legacy permissions mode that enables access control with API-level
   * granularity for ledgers.
   *
   * This mode allows users who have the `SendCommand` API permission for this ledger to run all
   * PartiQL commands (hence, `ALLOW_ALL` ) on any tables in the specified ledger. This mode disregards
   * any table-level or command-level IAM permissions policies that you create for the ledger.
   *
   * * `STANDARD` : ( *Recommended* ) A permissions mode that enables access control with finer
   * granularity for ledgers, tables, and PartiQL commands.
   *
   * By default, this mode denies all user requests to run any PartiQL commands on any tables in
   * this ledger. To allow PartiQL commands to run, you must create IAM permissions policies for
   * specific table resources and PartiQL actions, in addition to the `SendCommand` API permission for
   * the ledger. For information, see [Getting started with the standard permissions
   * mode](https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html)
   * in the *Amazon QLDB Developer Guide* .
   *
   *
   * We strongly recommend using the `STANDARD` permissions mode to maximize the security of your
   * ledger data.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-permissionsmode)
   * @param permissionsMode The permissions mode to assign to the ledger that you want to create. 
   */
  public fun permissionsMode(permissionsMode: String) {
    cdkBuilder.permissionsMode(permissionsMode)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLedger {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
