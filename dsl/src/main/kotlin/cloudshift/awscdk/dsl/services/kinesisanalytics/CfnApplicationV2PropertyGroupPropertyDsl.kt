@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2PropertyGroupPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.PropertyGroupProperty.Builder =
      CfnApplicationV2.PropertyGroupProperty.builder()

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

  public fun build(): CfnApplicationV2.PropertyGroupProperty = cdkBuilder.build()
}
