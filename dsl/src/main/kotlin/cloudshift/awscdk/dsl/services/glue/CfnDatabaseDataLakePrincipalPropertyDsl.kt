@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDatabase

@CdkDslMarker
public class CfnDatabaseDataLakePrincipalPropertyDsl {
  private val cdkBuilder: CfnDatabase.DataLakePrincipalProperty.Builder =
      CfnDatabase.DataLakePrincipalProperty.builder()

  /**
   * @param dataLakePrincipalIdentifier An identifier for the AWS Lake Formation principal.
   */
  public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
    cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
  }

  public fun build(): CfnDatabase.DataLakePrincipalProperty = cdkBuilder.build()
}
