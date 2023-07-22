@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

/**
 * The AWS Lake Formation principal.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalakeprincipal.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsDataLakePrincipalPropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.DataLakePrincipalProperty.Builder =
      CfnPrincipalPermissions.DataLakePrincipalProperty.builder()

  /**
   * @param dataLakePrincipalIdentifier An identifier for the AWS Lake Formation principal.
   */
  public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
    cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
  }

  public fun build(): CfnPrincipalPermissions.DataLakePrincipalProperty = cdkBuilder.build()
}
