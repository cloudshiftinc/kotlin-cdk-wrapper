@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobValidationConfigurationPropertyDsl {
  private val cdkBuilder: CfnJob.ValidationConfigurationProperty.Builder =
      CfnJob.ValidationConfigurationProperty.builder()

  public fun rulesetArn(rulesetArn: String) {
    cdkBuilder.rulesetArn(rulesetArn)
  }

  public fun validationMode(validationMode: String) {
    cdkBuilder.validationMode(validationMode)
  }

  public fun build(): CfnJob.ValidationConfigurationProperty = cdkBuilder.build()
}
