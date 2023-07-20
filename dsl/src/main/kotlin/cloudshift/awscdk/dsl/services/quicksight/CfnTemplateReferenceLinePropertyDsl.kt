@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateReferenceLinePropertyDsl {
  private val cdkBuilder: CfnTemplate.ReferenceLineProperty.Builder =
      CfnTemplate.ReferenceLineProperty.builder()

  public fun dataConfiguration(dataConfiguration: IResolvable) {
    cdkBuilder.dataConfiguration(dataConfiguration)
  }

  public
      fun dataConfiguration(dataConfiguration: CfnTemplate.ReferenceLineDataConfigurationProperty) {
    cdkBuilder.dataConfiguration(dataConfiguration)
  }

  public fun labelConfiguration(labelConfiguration: IResolvable) {
    cdkBuilder.labelConfiguration(labelConfiguration)
  }

  public
      fun labelConfiguration(labelConfiguration: CfnTemplate.ReferenceLineLabelConfigurationProperty) {
    cdkBuilder.labelConfiguration(labelConfiguration)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun styleConfiguration(styleConfiguration: IResolvable) {
    cdkBuilder.styleConfiguration(styleConfiguration)
  }

  public
      fun styleConfiguration(styleConfiguration: CfnTemplate.ReferenceLineStyleConfigurationProperty) {
    cdkBuilder.styleConfiguration(styleConfiguration)
  }

  public fun build(): CfnTemplate.ReferenceLineProperty = cdkBuilder.build()
}
