@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupResultConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.ResultConfigurationProperty.Builder =
      CfnWorkGroup.ResultConfigurationProperty.builder()

  /**
   * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
   * ownership of stored query results.
   * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a client-side
   * setting. If workgroup settings override client-side settings, then the query uses the ACL
   * configuration that is specified for the workgroup, and also uses the location for storing query
   * results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
   */
  public fun aclConfiguration(aclConfiguration: IResolvable) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  /**
   * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
   * ownership of stored query results.
   * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a client-side
   * setting. If workgroup settings override client-side settings, then the query uses the ACL
   * configuration that is specified for the workgroup, and also uses the location for storing query
   * results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
   */
  public fun aclConfiguration(aclConfiguration: CfnWorkGroup.AclConfigurationProperty) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  /**
   * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
   * encryption option used (for example, `SSE_KMS` or `CSE_KMS` ) and key information.
   * This is a client-side setting. If workgroup settings override client-side settings, then the
   * query uses the encryption configuration that is specified for the workgroup, and also uses the
   * location for storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration`
   * and [Workgroup Settings Override Client-Side
   * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
   */
  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
   * encryption option used (for example, `SSE_KMS` or `CSE_KMS` ) and key information.
   * This is a client-side setting. If workgroup settings override client-side settings, then the
   * query uses the encryption configuration that is specified for the workgroup, and also uses the
   * location for storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration`
   * and [Workgroup Settings Override Client-Side
   * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
   */
  public
      fun encryptionConfiguration(encryptionConfiguration: CfnWorkGroup.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param expectedBucketOwner The account ID that you expect to be the owner of the Amazon S3
   * bucket specified by `ResultConfiguration:OutputLocation` .
   * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to your
   * specified output location. If the `ExpectedBucketOwner` account ID does not match the actual owner
   * of the Amazon S3 bucket, the call fails with a permissions error.
   *
   * This is a client-side setting. If workgroup settings override client-side settings, then the
   * query uses the `ExpectedBucketOwner` setting that is specified for the workgroup, and also uses
   * the location for storing query results specified in the workgroup. See
   * `EnforceWorkGroupConfiguration` .
   */
  public fun expectedBucketOwner(expectedBucketOwner: String) {
    cdkBuilder.expectedBucketOwner(expectedBucketOwner)
  }

  /**
   * @param outputLocation The location in Amazon S3 where your query results are stored, such as
   * `s3://path/to/query/bucket/` .
   * To run a query, you must specify the query results location using either a client-side setting
   * for individual queries or a location specified by the workgroup. If workgroup settings override
   * client-side settings, then the query uses the location specified for the workgroup. If no query
   * location is set, Athena issues an error. For more information, see [Working with Query Results,
   * Output Files, and Query History](https://docs.aws.amazon.com/athena/latest/ug/querying.html) and
   * `EnforceWorkGroupConfiguration` .
   */
  public fun outputLocation(outputLocation: String) {
    cdkBuilder.outputLocation(outputLocation)
  }

  public fun build(): CfnWorkGroup.ResultConfigurationProperty = cdkBuilder.build()
}
