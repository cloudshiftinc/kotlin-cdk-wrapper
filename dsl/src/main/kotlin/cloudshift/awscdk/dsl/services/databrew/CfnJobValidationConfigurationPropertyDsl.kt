@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobValidationConfigurationPropertyDsl {
  private val cdkBuilder: CfnJob.ValidationConfigurationProperty.Builder =
      CfnJob.ValidationConfigurationProperty.builder()

  /**
   * @param rulesetArn The Amazon Resource Name (ARN) for the ruleset to be validated in the profile
   * job. 
   * The TargetArn of the selected ruleset should be the same as the Amazon Resource Name (ARN) of
   * the dataset that is associated with the profile job.
   */
  public fun rulesetArn(rulesetArn: String) {
    cdkBuilder.rulesetArn(rulesetArn)
  }

  /**
   * @param validationMode Mode of data quality validation.
   * Default mode is “CHECK_ALL” which verifies all rules defined in the selected ruleset.
   */
  public fun validationMode(validationMode: String) {
    cdkBuilder.validationMode(validationMode)
  }

  public fun build(): CfnJob.ValidationConfigurationProperty = cdkBuilder.build()
}
