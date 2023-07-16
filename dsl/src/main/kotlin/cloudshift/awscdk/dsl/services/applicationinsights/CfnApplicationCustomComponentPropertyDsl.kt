@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationCustomComponentPropertyDsl {
  private val cdkBuilder: CfnApplication.CustomComponentProperty.Builder =
      CfnApplication.CustomComponentProperty.builder()

  private val _resourceList: MutableList<String> = mutableListOf()

  public fun componentName(componentName: String) {
    cdkBuilder.componentName(componentName)
  }

  public fun resourceList(vararg resourceList: String) {
    _resourceList.addAll(listOf(*resourceList))
  }

  public fun resourceList(resourceList: Collection<String>) {
    _resourceList.addAll(resourceList)
  }

  public fun build(): CfnApplication.CustomComponentProperty {
    if(_resourceList.isNotEmpty()) cdkBuilder.resourceList(_resourceList)
    return cdkBuilder.build()
  }
}
