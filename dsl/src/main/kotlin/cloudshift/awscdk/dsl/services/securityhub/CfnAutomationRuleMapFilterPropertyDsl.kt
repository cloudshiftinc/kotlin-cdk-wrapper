@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleMapFilterPropertyDsl {
  private val cdkBuilder: CfnAutomationRule.MapFilterProperty.Builder =
      CfnAutomationRule.MapFilterProperty.builder()

  /**
   * @param comparison The condition to apply to the key value when querying for findings with a map
   * filter. 
   * To search for values that exactly match the filter value, use `EQUALS` . For example, for the
   * `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have the value
   * `Security` for the tag `Department` .
   *
   * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
   * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that do not have
   * the value `Finance` for the tag `Department` .
   *
   * `EQUALS` filters on the same field are joined by `OR` . A finding matches if it matches any one
   * of those filters.
   *
   * `NOT_EQUALS` filters on the same field are joined by `AND` . A finding matches only if it
   * matches all of those filters.
   *
   * You cannot have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
   */
  public fun comparison(comparison: String) {
    cdkBuilder.comparison(comparison)
  }

  /**
   * @param key The key of the map filter. 
   * For example, for `ResourceTags` , `Key` identifies the name of the tag. For `UserDefinedFields`
   * , `Key` is the name of the field.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value for the key in the map filter. 
   * Filter values are case sensitive. For example, one of the values for a tag called `Department`
   * might be `Security` . If you provide `security` as the filter value, then there is no match.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAutomationRule.MapFilterProperty = cdkBuilder.build()
}
