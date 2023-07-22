@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupAclConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.AclConfigurationProperty.Builder =
      CfnWorkGroup.AclConfigurationProperty.builder()

  /**
   * @param s3AclOption The Amazon S3 canned ACL that Athena should specify when storing query
   * results. 
   * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . If a query runs in a
   * workgroup and the workgroup overrides client-side settings, then the Amazon S3 canned ACL
   * specified in the workgroup's settings is used for all queries that run in the workgroup. For more
   * information about Amazon S3 canned ACLs, see [Canned
   * ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) in the
   * *Amazon S3 User Guide* .
   */
  public fun s3AclOption(s3AclOption: String) {
    cdkBuilder.s3AclOption(s3AclOption)
  }

  public fun build(): CfnWorkGroup.AclConfigurationProperty = cdkBuilder.build()
}
