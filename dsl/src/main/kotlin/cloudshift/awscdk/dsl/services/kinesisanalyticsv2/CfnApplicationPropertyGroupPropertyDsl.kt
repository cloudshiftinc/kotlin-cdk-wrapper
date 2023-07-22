@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationPropertyGroupPropertyDsl {
  private val cdkBuilder: CfnApplication.PropertyGroupProperty.Builder =
      CfnApplication.PropertyGroupProperty.builder()

  /**
   * @param propertyGroupId Describes the key of an application execution property key-value pair.
   */
  public fun propertyGroupId(propertyGroupId: String) {
    cdkBuilder.propertyGroupId(propertyGroupId)
  }

  /**
   * @param propertyMap Describes the value of an application execution property key-value pair.
   */
  public fun propertyMap(propertyMap: Map<String, String>) {
    cdkBuilder.propertyMap(propertyMap)
  }

  /**
   * @param propertyMap Describes the value of an application execution property key-value pair.
   */
  public fun propertyMap(propertyMap: IResolvable) {
    cdkBuilder.propertyMap(propertyMap)
  }

  public fun build(): CfnApplication.PropertyGroupProperty = cdkBuilder.build()
}
