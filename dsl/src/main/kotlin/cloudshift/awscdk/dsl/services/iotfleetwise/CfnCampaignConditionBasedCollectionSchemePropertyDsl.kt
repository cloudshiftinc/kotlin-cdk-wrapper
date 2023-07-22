@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

/**
 * Information about a collection scheme that uses a simple logical expression to recognize what
 * data to collect.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * ConditionBasedCollectionSchemeProperty conditionBasedCollectionSchemeProperty =
 * ConditionBasedCollectionSchemeProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .conditionLanguageVersion(123)
 * .minimumTriggerIntervalMs(123)
 * .triggerMode("triggerMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html)
 */
@CdkDslMarker
public class CfnCampaignConditionBasedCollectionSchemePropertyDsl {
  private val cdkBuilder: CfnCampaign.ConditionBasedCollectionSchemeProperty.Builder =
      CfnCampaign.ConditionBasedCollectionSchemeProperty.builder()

  /**
   * @param conditionLanguageVersion (Optional) Specifies the version of the conditional expression
   * language.
   */
  public fun conditionLanguageVersion(conditionLanguageVersion: Number) {
    cdkBuilder.conditionLanguageVersion(conditionLanguageVersion)
  }

  /**
   * @param expression The logical expression used to recognize what data to collect. 
   * For example, `$variable.Vehicle.OutsideAirTemperature &gt;= 105.0` .
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param minimumTriggerIntervalMs (Optional) The minimum duration of time between two triggering
   * events to collect data, in milliseconds.
   *
   * If a signal changes often, you might want to collect data at a slower rate.
   */
  public fun minimumTriggerIntervalMs(minimumTriggerIntervalMs: Number) {
    cdkBuilder.minimumTriggerIntervalMs(minimumTriggerIntervalMs)
  }

  /**
   * @param triggerMode (Optional) Whether to collect data for all triggering events ( `ALWAYS` ).
   * Specify ( `RISING_EDGE` ), or specify only when the condition first evaluates to false. For
   * example, triggering on "AirbagDeployed"; Users aren't interested on triggering when the airbag is
   * already exploded; they only care about the change from not deployed =&gt; deployed.
   */
  public fun triggerMode(triggerMode: String) {
    cdkBuilder.triggerMode(triggerMode)
  }

  public fun build(): CfnCampaign.ConditionBasedCollectionSchemeProperty = cdkBuilder.build()
}
