@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * Parameters for Amazon Athena.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AthenaParametersProperty athenaParametersProperty = AthenaParametersProperty.builder()
 * .roleArn("roleArn")
 * .workGroup("workGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-athenaparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceAthenaParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.AthenaParametersProperty.Builder =
      CfnDataSource.AthenaParametersProperty.builder()

  /**
   * @param roleArn Use the `RoleArn` structure to override an account-wide role for a specific
   * Athena data source.
   * For example, say an account administrator has turned off all Athena access with an account-wide
   * role. The administrator can then use `RoleArn` to bypass the account-wide role and allow Athena
   * access for the single Athena data source that is specified in the structure, even if the
   * account-wide role forbidding Athena access is still active.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param workGroup The workgroup that Amazon Athena uses.
   */
  public fun workGroup(workGroup: String) {
    cdkBuilder.workGroup(workGroup)
  }

  public fun build(): CfnDataSource.AthenaParametersProperty = cdkBuilder.build()
}
