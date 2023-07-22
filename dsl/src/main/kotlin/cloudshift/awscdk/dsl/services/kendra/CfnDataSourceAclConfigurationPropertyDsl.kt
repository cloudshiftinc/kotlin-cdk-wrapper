@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceAclConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.AclConfigurationProperty.Builder =
      CfnDataSource.AclConfigurationProperty.builder()

  /**
   * @param allowedGroupsColumnName A list of groups, separated by semi-colons, that filters a query
   * response based on user context. 
   * The document is only returned to users that are in one of the groups specified in the
   * `UserContext` field of the [Query](https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html)
   * operation.
   */
  public fun allowedGroupsColumnName(allowedGroupsColumnName: String) {
    cdkBuilder.allowedGroupsColumnName(allowedGroupsColumnName)
  }

  public fun build(): CfnDataSource.AclConfigurationProperty = cdkBuilder.build()
}
