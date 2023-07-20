@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationTaskPropertiesMapPropertyDsl {
  private val cdkBuilder: CfnIntegration.TaskPropertiesMapProperty.Builder =
      CfnIntegration.TaskPropertiesMapProperty.builder()

  public fun operatorPropertyKey(operatorPropertyKey: String) {
    cdkBuilder.operatorPropertyKey(operatorPropertyKey)
  }

  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  public fun build(): CfnIntegration.TaskPropertiesMapProperty = cdkBuilder.build()
}
