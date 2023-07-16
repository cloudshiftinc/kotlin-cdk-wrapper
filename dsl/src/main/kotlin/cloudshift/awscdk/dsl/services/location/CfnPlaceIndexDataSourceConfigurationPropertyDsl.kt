@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnPlaceIndex

@CdkDslMarker
public class CfnPlaceIndexDataSourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnPlaceIndex.DataSourceConfigurationProperty.Builder =
      CfnPlaceIndex.DataSourceConfigurationProperty.builder()

  public fun intendedUse(intendedUse: String) {
    cdkBuilder.intendedUse(intendedUse)
  }

  public fun build(): CfnPlaceIndex.DataSourceConfigurationProperty = cdkBuilder.build()
}
