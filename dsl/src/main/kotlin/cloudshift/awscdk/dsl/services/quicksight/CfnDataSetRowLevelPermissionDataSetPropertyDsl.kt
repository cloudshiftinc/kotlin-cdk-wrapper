@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetRowLevelPermissionDataSetPropertyDsl {
  private val cdkBuilder: CfnDataSet.RowLevelPermissionDataSetProperty.Builder =
      CfnDataSet.RowLevelPermissionDataSetProperty.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the dataset that contains permissions for RLS. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param formatVersion The user or group rules associated with the dataset that contains
   * permissions for RLS.
   * By default, `FormatVersion` is `VERSION_1` . When `FormatVersion` is `VERSION_1` , `UserName`
   * and `GroupName` are required. When `FormatVersion` is `VERSION_2` , `UserARN` and `GroupARN` are
   * required, and `Namespace` must not exist.
   */
  public fun formatVersion(formatVersion: String) {
    cdkBuilder.formatVersion(formatVersion)
  }

  /**
   * @param namespace The namespace associated with the dataset that contains permissions for RLS.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param permissionPolicy The type of permissions to use when interpreting the permissions for
   * RLS. 
   * `DENY_ACCESS` is included for backward compatibility only.
   */
  public fun permissionPolicy(permissionPolicy: String) {
    cdkBuilder.permissionPolicy(permissionPolicy)
  }

  /**
   * @param status The status of the row-level security permission dataset.
   * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnDataSet.RowLevelPermissionDataSetProperty = cdkBuilder.build()
}
