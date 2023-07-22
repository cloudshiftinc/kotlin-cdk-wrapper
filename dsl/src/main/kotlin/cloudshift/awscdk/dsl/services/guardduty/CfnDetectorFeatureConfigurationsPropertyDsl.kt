@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

@CdkDslMarker
public class CfnDetectorFeatureConfigurationsPropertyDsl {
  private val cdkBuilder: CfnDetector.FeatureConfigurationsProperty.Builder =
      CfnDetector.FeatureConfigurationsProperty.builder()

  private val _additionalConfiguration: MutableList<Any> = mutableListOf()

  /**
   * @param additionalConfiguration Additional configuration of the feature.
   */
  public fun additionalConfiguration(vararg additionalConfiguration: Any) {
    _additionalConfiguration.addAll(listOf(*additionalConfiguration))
  }

  /**
   * @param additionalConfiguration Additional configuration of the feature.
   */
  public fun additionalConfiguration(additionalConfiguration: Collection<Any>) {
    _additionalConfiguration.addAll(additionalConfiguration)
  }

  /**
   * @param additionalConfiguration Additional configuration of the feature.
   */
  public fun additionalConfiguration(additionalConfiguration: IResolvable) {
    cdkBuilder.additionalConfiguration(additionalConfiguration)
  }

  /**
   * @param name Name of the feature.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param status Status of the feature.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnDetector.FeatureConfigurationsProperty {
    if(_additionalConfiguration.isNotEmpty())
        cdkBuilder.additionalConfiguration(_additionalConfiguration)
    return cdkBuilder.build()
  }
}
