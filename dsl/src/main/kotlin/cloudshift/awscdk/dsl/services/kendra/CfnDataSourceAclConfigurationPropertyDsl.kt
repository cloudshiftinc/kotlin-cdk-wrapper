@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides information about the column that should be used for filtering the query response by
 * groups.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * AclConfigurationProperty aclConfigurationProperty = AclConfigurationProperty.builder()
 * .allowedGroupsColumnName("allowedGroupsColumnName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-aclconfiguration.html)
 */
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
