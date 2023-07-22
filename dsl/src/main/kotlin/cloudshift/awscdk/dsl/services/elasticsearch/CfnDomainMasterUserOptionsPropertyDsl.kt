@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.CfnDomain

/**
 * Specifies information about the master user. Required if you enabled the internal user database.
 *
 *
 * The `AWS::Elasticsearch::Domain` resource is being replaced by the
 * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
 * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
 * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
 * supports both OpenSearch and Elasticsearch. For more information about the service rename, see [New
 * resource
 * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticsearch.*;
 * MasterUserOptionsProperty masterUserOptionsProperty = MasterUserOptionsProperty.builder()
 * .masterUserArn("masterUserArn")
 * .masterUserName("masterUserName")
 * .masterUserPassword("masterUserPassword")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html)
 */
@CdkDslMarker
public class CfnDomainMasterUserOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.MasterUserOptionsProperty.Builder =
      CfnDomain.MasterUserOptionsProperty.builder()

  /**
   * @param masterUserArn ARN for the master user.
   * Only specify if `InternalUserDatabaseEnabled` is false in `AdvancedSecurityOptions` .
   */
  public fun masterUserArn(masterUserArn: String) {
    cdkBuilder.masterUserArn(masterUserArn)
  }

  /**
   * @param masterUserName Username for the master user.
   * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
   */
  public fun masterUserName(masterUserName: String) {
    cdkBuilder.masterUserName(masterUserName)
  }

  /**
   * @param masterUserPassword Password for the master user.
   * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
   */
  public fun masterUserPassword(masterUserPassword: String) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  public fun build(): CfnDomain.MasterUserOptionsProperty = cdkBuilder.build()
}
