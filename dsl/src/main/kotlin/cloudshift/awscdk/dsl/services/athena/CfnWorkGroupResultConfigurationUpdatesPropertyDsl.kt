@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup

/**
 * The result configuration information about the queries in this workgroup that will be updated.
 *
 * Includes the updated results location and an updated option for encrypting query results.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * ResultConfigurationUpdatesProperty resultConfigurationUpdatesProperty =
 * ResultConfigurationUpdatesProperty.builder()
 * .aclConfiguration(AclConfigurationProperty.builder()
 * .s3AclOption("s3AclOption")
 * .build())
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .expectedBucketOwner("expectedBucketOwner")
 * .outputLocation("outputLocation")
 * .removeAclConfiguration(false)
 * .removeEncryptionConfiguration(false)
 * .removeExpectedBucketOwner(false)
 * .removeOutputLocation(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html)
 */
@CdkDslMarker
public class CfnWorkGroupResultConfigurationUpdatesPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.ResultConfigurationUpdatesProperty.Builder =
      CfnWorkGroup.ResultConfigurationUpdatesProperty.builder()

  /**
   * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
   * ownership of stored query results.
   */
  public fun aclConfiguration(aclConfiguration: IResolvable) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  /**
   * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
   * ownership of stored query results.
   */
  public fun aclConfiguration(aclConfiguration: CfnWorkGroup.AclConfigurationProperty) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  /**
   * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
   * encryption option used (for example, SSE-KMS or CSE-KMS) and key information.
   */
  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
   * encryption option used (for example, SSE-KMS or CSE-KMS) and key information.
   */
  public
      fun encryptionConfiguration(encryptionConfiguration: CfnWorkGroup.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param expectedBucketOwner The AWS account ID of the owner of S3 bucket where query results are
   * stored.
   */
  public fun expectedBucketOwner(expectedBucketOwner: String) {
    cdkBuilder.expectedBucketOwner(expectedBucketOwner)
  }

  /**
   * @param outputLocation The location in Amazon S3 where your query results are stored, such as
   * s3://path/to/query/bucket/.
   * To run the query, you must specify the query results location using one of the ways: either for
   * individual queries using either this setting (client-side), or in the workgroup, using
   * WorkGroupConfiguration
   */
  public fun outputLocation(outputLocation: String) {
    cdkBuilder.outputLocation(outputLocation)
  }

  /**
   * @param removeAclConfiguration the value to be set.
   */
  public fun removeAclConfiguration(removeAclConfiguration: Boolean) {
    cdkBuilder.removeAclConfiguration(removeAclConfiguration)
  }

  /**
   * @param removeAclConfiguration the value to be set.
   */
  public fun removeAclConfiguration(removeAclConfiguration: IResolvable) {
    cdkBuilder.removeAclConfiguration(removeAclConfiguration)
  }

  /**
   * @param removeEncryptionConfiguration the value to be set.
   */
  public fun removeEncryptionConfiguration(removeEncryptionConfiguration: Boolean) {
    cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration)
  }

  /**
   * @param removeEncryptionConfiguration the value to be set.
   */
  public fun removeEncryptionConfiguration(removeEncryptionConfiguration: IResolvable) {
    cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration)
  }

  /**
   * @param removeExpectedBucketOwner the value to be set.
   */
  public fun removeExpectedBucketOwner(removeExpectedBucketOwner: Boolean) {
    cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner)
  }

  /**
   * @param removeExpectedBucketOwner the value to be set.
   */
  public fun removeExpectedBucketOwner(removeExpectedBucketOwner: IResolvable) {
    cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner)
  }

  /**
   * @param removeOutputLocation the value to be set.
   */
  public fun removeOutputLocation(removeOutputLocation: Boolean) {
    cdkBuilder.removeOutputLocation(removeOutputLocation)
  }

  /**
   * @param removeOutputLocation the value to be set.
   */
  public fun removeOutputLocation(removeOutputLocation: IResolvable) {
    cdkBuilder.removeOutputLocation(removeOutputLocation)
  }

  public fun build(): CfnWorkGroup.ResultConfigurationUpdatesProperty = cdkBuilder.build()
}
