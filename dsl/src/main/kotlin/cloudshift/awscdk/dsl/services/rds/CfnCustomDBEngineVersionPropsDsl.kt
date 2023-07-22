@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps

@CdkDslMarker
public class CfnCustomDBEngineVersionPropsDsl {
  private val cdkBuilder: CfnCustomDBEngineVersionProps.Builder =
      CfnCustomDBEngineVersionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param databaseInstallationFilesS3BucketName The name of an Amazon S3 bucket that contains
   * database installation files for your CEV. 
   * For example, a valid bucket name is `my-custom-installation-files` .
   */
  public fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String) {
    cdkBuilder.databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName)
  }

  /**
   * @param databaseInstallationFilesS3Prefix The Amazon S3 directory that contains the database
   * installation files for your CEV.
   * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't specified, no
   * prefix is assumed.
   */
  public fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String) {
    cdkBuilder.databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix)
  }

  /**
   * @param description An optional description of your CEV.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param engine The database engine to use for your custom engine version (CEV). 
   * Valid values:
   *
   * * `custom-oracle-ee`
   * * `custom-oracle-ee-cdb`
   */
  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  /**
   * @param engineVersion The name of your CEV. 
   * The name format is `major version.customized_string` . For example, a valid CEV name is
   * `19.my_cev1` . This setting is required for RDS Custom for Oracle, but optional for Amazon RDS.
   * The combination of `Engine` and `EngineVersion` is unique per customer per Region.
   *
   * *Constraints:* Minimum length is 1. Maximum length is 60.
   *
   * *Pattern:* `^[a-z0-9_.-]{1,60$` }
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param kmsKeyId The AWS KMS key identifier for an encrypted CEV.
   * A symmetric encryption KMS key is required for RDS Custom, but optional for Amazon RDS.
   *
   * If you have an existing symmetric encryption KMS key in your account, you can use it with RDS
   * Custom. No further action is necessary. If you don't already have a symmetric encryption KMS key
   * in your account, follow the instructions in [Creating a symmetric encryption KMS
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk)
   * in the *AWS Key Management Service Developer Guide* .
   *
   * You can choose the same symmetric encryption key when you create a CEV and a DB instance, or
   * choose different keys.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param manifest The CEV manifest, which is a JSON document that describes the installation .zip
   * files stored in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom
   * applies the patches in the order in which they are listed.
   * The following JSON fields are valid:
   *
   * * **MediaImportTemplateVersion** - Version of the CEV manifest. The date is in the format
   * `YYYY-MM-DD` .
   * * **databaseInstallationFileNames** - Ordered list of installation files for the CEV.
   * * **opatchFileNames** - Ordered list of OPatch installers used for the Oracle DB engine.
   * * **psuRuPatchFileNames** - The PSU and RU patches for this CEV.
   * * **OtherPatchFileNames** - The patches that are not in the list of PSU and RU patches. Amazon
   * RDS applies these patches after applying the PSU and RU patches.
   *
   * For more information, see [Creating the CEV
   * manifest](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest)
   * in the *Amazon RDS User Guide* .
   */
  public fun manifest(manifest: String) {
    cdkBuilder.manifest(manifest)
  }

  /**
   * @param status A value that indicates the status of a custom engine version (CEV).
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param tags A list of tags.
   * For more information, see [Tagging Amazon RDS
   * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
   * *Amazon RDS User Guide.*
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of tags.
   * For more information, see [Tagging Amazon RDS
   * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
   * *Amazon RDS User Guide.*
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCustomDBEngineVersionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
