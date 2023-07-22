@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnConfigRule

/**
 * Defines which resources trigger an evaluation for an AWS Config rule.
 *
 * The scope can include one or more resource types, a combination of a tag key and value, or a
 * combination of one resource type and one resource ID. Specify a scope to constrain which resources
 * trigger an evaluation for a rule. Otherwise, evaluations for the rule are triggered when any
 * resource in your recording group changes in configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * ScopeProperty scopeProperty = ScopeProperty.builder()
 * .complianceResourceId("complianceResourceId")
 * .complianceResourceTypes(List.of("complianceResourceTypes"))
 * .tagKey("tagKey")
 * .tagValue("tagValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html)
 */
@CdkDslMarker
public class CfnConfigRuleScopePropertyDsl {
  private val cdkBuilder: CfnConfigRule.ScopeProperty.Builder =
      CfnConfigRule.ScopeProperty.builder()

  private val _complianceResourceTypes: MutableList<String> = mutableListOf()

  /**
   * @param complianceResourceId The ID of the only AWS resource that you want to trigger an
   * evaluation for the rule.
   * If you specify a resource ID, you must specify one resource type for `ComplianceResourceTypes`
   * .
   */
  public fun complianceResourceId(complianceResourceId: String) {
    cdkBuilder.complianceResourceId(complianceResourceId)
  }

  /**
   * @param complianceResourceTypes The resource types of only those AWS resources that you want to
   * trigger an evaluation for the rule.
   * You can only specify one type if you also specify a resource ID for `ComplianceResourceId` .
   */
  public fun complianceResourceTypes(vararg complianceResourceTypes: String) {
    _complianceResourceTypes.addAll(listOf(*complianceResourceTypes))
  }

  /**
   * @param complianceResourceTypes The resource types of only those AWS resources that you want to
   * trigger an evaluation for the rule.
   * You can only specify one type if you also specify a resource ID for `ComplianceResourceId` .
   */
  public fun complianceResourceTypes(complianceResourceTypes: Collection<String>) {
    _complianceResourceTypes.addAll(complianceResourceTypes)
  }

  /**
   * @param tagKey The tag key that is applied to only those AWS resources that you want to trigger
   * an evaluation for the rule.
   */
  public fun tagKey(tagKey: String) {
    cdkBuilder.tagKey(tagKey)
  }

  /**
   * @param tagValue The tag value applied to only those AWS resources that you want to trigger an
   * evaluation for the rule.
   * If you specify a value for `TagValue` , you must also specify a value for `TagKey` .
   */
  public fun tagValue(tagValue: String) {
    cdkBuilder.tagValue(tagValue)
  }

  public fun build(): CfnConfigRule.ScopeProperty {
    if(_complianceResourceTypes.isNotEmpty())
        cdkBuilder.complianceResourceTypes(_complianceResourceTypes)
    return cdkBuilder.build()
  }
}
