@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.FirelensConfigFileType
import software.amazon.awscdk.services.ecs.FirelensOptions

@CdkDslMarker
public class FirelensOptionsDsl {
  private val cdkBuilder: FirelensOptions.Builder = FirelensOptions.builder()

  public fun configFileType(configFileType: FirelensConfigFileType) {
    cdkBuilder.configFileType(configFileType)
  }

  public fun configFileValue(configFileValue: String) {
    cdkBuilder.configFileValue(configFileValue)
  }

  public fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean) {
    cdkBuilder.enableEcsLogMetadata(enableEcsLogMetadata)
  }

  public fun build(): FirelensOptions = cdkBuilder.build()
}
