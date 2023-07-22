@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Configuration for data quality validation.
 *
 * Used to select the Rulesets and Validation Mode to be used in the profile job. When
 * ValidationConfiguration is null, the profile job will run without data quality validation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * ValidationConfigurationProperty validationConfigurationProperty =
 * ValidationConfigurationProperty.builder()
 * .rulesetArn("rulesetArn")
 * // the properties below are optional
 * .validationMode("validationMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-validationconfiguration.html)
 */
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
