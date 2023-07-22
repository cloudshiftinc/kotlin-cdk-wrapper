@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.timestream.CfnDatabase
import software.constructs.Construct

/**
 * Creates a new Timestream database.
 *
 * If the AWS KMS key is not specified, the database will be encrypted with a Timestream managed AWS
 * KMS key located in your account. Refer to [AWS managed AWS KMS
 * keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) for more
 * info. [Service quotas
 * apply](https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html) . See [code
 * sample](https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-db.html)
 * for details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * CfnDatabase cfnDatabase = CfnDatabase.Builder.create(this, "MyCfnDatabase")
 * .databaseName("databaseName")
 * .kmsKeyId("kmsKeyId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html)
 */
@CdkDslMarker
public class CfnDatabaseDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDatabase.Builder = CfnDatabase.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the Timestream database.
   *
   * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-databasename)
   * @param databaseName The name of the Timestream database. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * The identifier of the AWS KMS key used to encrypt the data stored in the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-kmskeyid)
   * @param kmsKeyId The identifier of the AWS KMS key used to encrypt the data stored in the
   * database. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * The tags to add to the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-tags)
   * @param tags The tags to add to the database. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to add to the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-tags)
   * @param tags The tags to add to the database. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDatabase {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
