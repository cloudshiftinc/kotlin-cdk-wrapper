@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationEnvironmentPropertiesPropertyDsl {
  private val cdkBuilder: CfnApplication.EnvironmentPropertiesProperty.Builder =
      CfnApplication.EnvironmentPropertiesProperty.builder()

  private val _propertyGroups: MutableList<Any> = mutableListOf()

  /**
   * @param propertyGroups Describes the execution property groups.
   */
  public fun propertyGroups(vararg propertyGroups: Any) {
    _propertyGroups.addAll(listOf(*propertyGroups))
  }

  /**
   * @param propertyGroups Describes the execution property groups.
   */
  public fun propertyGroups(propertyGroups: Collection<Any>) {
    _propertyGroups.addAll(propertyGroups)
  }

  /**
   * @param propertyGroups Describes the execution property groups.
   */
  public fun propertyGroups(propertyGroups: IResolvable) {
    cdkBuilder.propertyGroups(propertyGroups)
  }

  public fun build(): CfnApplication.EnvironmentPropertiesProperty {
    if(_propertyGroups.isNotEmpty()) cdkBuilder.propertyGroups(_propertyGroups)
    return cdkBuilder.build()
  }
}
