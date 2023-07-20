@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetVersioningConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataset.VersioningConfigurationProperty.Builder =
      CfnDataset.VersioningConfigurationProperty.builder()

  public fun maxVersions(maxVersions: Number) {
    cdkBuilder.maxVersions(maxVersions)
  }

  public fun unlimited(unlimited: Boolean) {
    cdkBuilder.unlimited(unlimited)
  }

  public fun unlimited(unlimited: IResolvable) {
    cdkBuilder.unlimited(unlimited)
  }

  public fun build(): CfnDataset.VersioningConfigurationProperty = cdkBuilder.build()
}
