@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnDetector

/**
 * A rule.
 *
 * Rule is a condition that tells Amazon Fraud Detector how to interpret variables values during a
 * fraud prediction.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
 * RuleProperty ruleProperty = RuleProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .detectorId("detectorId")
 * .expression("expression")
 * .language("language")
 * .lastUpdatedTime("lastUpdatedTime")
 * .outcomes(List.of(OutcomeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .ruleId("ruleId")
 * .ruleVersion("ruleVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html)
 */
@CdkDslMarker
public class CfnDetectorRulePropertyDsl {
  private val cdkBuilder: CfnDetector.RuleProperty.Builder = CfnDetector.RuleProperty.builder()

  private val _outcomes: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param arn The rule ARN.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param createdTime Timestamp for when the rule was created.
   */
  public fun createdTime(createdTime: String) {
    cdkBuilder.createdTime(createdTime)
  }

  /**
   * @param description The rule description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param detectorId The detector for which the rule is associated.
   */
  public fun detectorId(detectorId: String) {
    cdkBuilder.detectorId(detectorId)
  }

  /**
   * @param expression The rule expression.
   * A rule expression captures the business logic. For more information, see [Rule language
   * reference](https://docs.aws.amazon.com/frauddetector/latest/ug/rule-language-reference.html) .
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param language The rule language.
   */
  public fun language(language: String) {
    cdkBuilder.language(language)
  }

  /**
   * @param lastUpdatedTime Timestamp for when the rule was last updated.
   */
  public fun lastUpdatedTime(lastUpdatedTime: String) {
    cdkBuilder.lastUpdatedTime(lastUpdatedTime)
  }

  /**
   * @param outcomes The rule outcome.
   */
  public fun outcomes(vararg outcomes: Any) {
    _outcomes.addAll(listOf(*outcomes))
  }

  /**
   * @param outcomes The rule outcome.
   */
  public fun outcomes(outcomes: Collection<Any>) {
    _outcomes.addAll(outcomes)
  }

  /**
   * @param outcomes The rule outcome.
   */
  public fun outcomes(outcomes: IResolvable) {
    cdkBuilder.outcomes(outcomes)
  }

  /**
   * @param ruleId The rule ID.
   */
  public fun ruleId(ruleId: String) {
    cdkBuilder.ruleId(ruleId)
  }

  /**
   * @param ruleVersion The rule version.
   */
  public fun ruleVersion(ruleVersion: String) {
    cdkBuilder.ruleVersion(ruleVersion)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDetector.RuleProperty {
    if(_outcomes.isNotEmpty()) cdkBuilder.outcomes(_outcomes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
