@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateRelativeDateTimeControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.RelativeDateTimeControlDisplayOptionsProperty.Builder =
      CfnTemplate.RelativeDateTimeControlDisplayOptionsProperty.builder()

  public fun dateTimeFormat(dateTimeFormat: String) {
    cdkBuilder.dateTimeFormat(dateTimeFormat)
  }

  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun titleOptions(titleOptions: CfnTemplate.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnTemplate.RelativeDateTimeControlDisplayOptionsProperty = cdkBuilder.build()
}
