@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPermissions

@CdkDslMarker
public class CfnPermissionsDataLocationResourcePropertyDsl {
  private val cdkBuilder: CfnPermissions.DataLocationResourceProperty.Builder =
      CfnPermissions.DataLocationResourceProperty.builder()

  /**
   * @param catalogId The identifier for the Data Catalog .
   * By default, it is the account ID of the caller.
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param s3Resource The Amazon Resource Name (ARN) that uniquely identifies the data location
   * resource.
   */
  public fun s3Resource(s3Resource: String) {
    cdkBuilder.s3Resource(s3Resource)
  }

  public fun build(): CfnPermissions.DataLocationResourceProperty = cdkBuilder.build()
}
