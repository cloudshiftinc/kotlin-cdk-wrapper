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

  /**
   * @param maxVersions How many versions of dataset contents are kept.
   * The `unlimited` parameter must be `false` .
   */
  public fun maxVersions(maxVersions: Number) {
    cdkBuilder.maxVersions(maxVersions)
  }

  /**
   * @param unlimited If true, unlimited versions of dataset contents are kept.
   */
  public fun unlimited(unlimited: Boolean) {
    cdkBuilder.unlimited(unlimited)
  }

  /**
   * @param unlimited If true, unlimited versions of dataset contents are kept.
   */
  public fun unlimited(unlimited: IResolvable) {
    cdkBuilder.unlimited(unlimited)
  }

  public fun build(): CfnDataset.VersioningConfigurationProperty = cdkBuilder.build()
}
