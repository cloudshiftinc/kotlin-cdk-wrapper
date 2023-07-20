@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.synthetics.CfnCanary

@CdkDslMarker
public class CfnCanaryBaseScreenshotPropertyDsl {
  private val cdkBuilder: CfnCanary.BaseScreenshotProperty.Builder =
      CfnCanary.BaseScreenshotProperty.builder()

  private val _ignoreCoordinates: MutableList<String> = mutableListOf()

  public fun ignoreCoordinates(vararg ignoreCoordinates: String) {
    _ignoreCoordinates.addAll(listOf(*ignoreCoordinates))
  }

  public fun ignoreCoordinates(ignoreCoordinates: Collection<String>) {
    _ignoreCoordinates.addAll(ignoreCoordinates)
  }

  public fun screenshotName(screenshotName: String) {
    cdkBuilder.screenshotName(screenshotName)
  }

  public fun build(): CfnCanary.BaseScreenshotProperty {
    if(_ignoreCoordinates.isNotEmpty()) cdkBuilder.ignoreCoordinates(_ignoreCoordinates)
    return cdkBuilder.build()
  }
}
