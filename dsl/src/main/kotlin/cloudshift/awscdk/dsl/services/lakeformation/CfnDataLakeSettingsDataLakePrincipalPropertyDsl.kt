@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings

@CdkDslMarker
public class CfnDataLakeSettingsDataLakePrincipalPropertyDsl {
  private val cdkBuilder: CfnDataLakeSettings.DataLakePrincipalProperty.Builder =
      CfnDataLakeSettings.DataLakePrincipalProperty.builder()

  /**
   * @param dataLakePrincipalIdentifier An identifier for the Lake Formation principal. 
   */
  public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
    cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
  }

  public fun build(): CfnDataLakeSettings.DataLakePrincipalProperty = cdkBuilder.build()
}
