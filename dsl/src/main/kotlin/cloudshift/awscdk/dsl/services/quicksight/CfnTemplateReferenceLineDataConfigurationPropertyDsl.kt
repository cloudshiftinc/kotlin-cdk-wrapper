@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateReferenceLineDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ReferenceLineDataConfigurationProperty.Builder =
      CfnTemplate.ReferenceLineDataConfigurationProperty.builder()

  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  public fun dynamicConfiguration(dynamicConfiguration: IResolvable) {
    cdkBuilder.dynamicConfiguration(dynamicConfiguration)
  }

  public
      fun dynamicConfiguration(dynamicConfiguration: CfnTemplate.ReferenceLineDynamicDataConfigurationProperty) {
    cdkBuilder.dynamicConfiguration(dynamicConfiguration)
  }

  public fun staticConfiguration(staticConfiguration: IResolvable) {
    cdkBuilder.staticConfiguration(staticConfiguration)
  }

  public
      fun staticConfiguration(staticConfiguration: CfnTemplate.ReferenceLineStaticDataConfigurationProperty) {
    cdkBuilder.staticConfiguration(staticConfiguration)
  }

  public fun build(): CfnTemplate.ReferenceLineDataConfigurationProperty = cdkBuilder.build()
}
