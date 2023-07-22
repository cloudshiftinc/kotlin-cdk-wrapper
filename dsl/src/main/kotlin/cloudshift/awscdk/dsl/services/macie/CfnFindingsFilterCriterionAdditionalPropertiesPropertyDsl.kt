@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.macie.CfnFindingsFilter

/**
 * Specifies a condition that defines the property, operator, and one or more values to use in a
 * findings filter.
 *
 * A *findings filter* , also referred to as a *filter rule* , is a set of custom criteria that
 * specifies which findings to include or exclude from the results of a query for findings. You can
 * also configure a findings filter to suppress (automatically archive) findings that match the
 * filter's criteria. For more information, see [Filtering
 * findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html) in the
 * *Amazon Macie User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CriterionAdditionalPropertiesProperty criterionAdditionalPropertiesProperty =
 * CriterionAdditionalPropertiesProperty.builder()
 * .eq(List.of("eq"))
 * .gt(123)
 * .gte(123)
 * .lt(123)
 * .lte(123)
 * .neq(List.of("neq"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html)
 */
@CdkDslMarker
public class CfnFindingsFilterCriterionAdditionalPropertiesPropertyDsl {
  private val cdkBuilder: CfnFindingsFilter.CriterionAdditionalPropertiesProperty.Builder =
      CfnFindingsFilter.CriterionAdditionalPropertiesProperty.builder()

  private val _eq: MutableList<String> = mutableListOf()

  private val _neq: MutableList<String> = mutableListOf()

  /**
   * @param eq The value for the specified property matches (equals) the specified value.
   * If you specify multiple values, Amazon Macie uses OR logic to join the values.
   */
  public fun eq(vararg eq: String) {
    _eq.addAll(listOf(*eq))
  }

  /**
   * @param eq The value for the specified property matches (equals) the specified value.
   * If you specify multiple values, Amazon Macie uses OR logic to join the values.
   */
  public fun eq(eq: Collection<String>) {
    _eq.addAll(eq)
  }

  /**
   * @param gt The value for the specified property is greater than the specified value.
   */
  public fun gt(gt: Number) {
    cdkBuilder.gt(gt)
  }

  /**
   * @param gte The value for the specified property is greater than or equal to the specified
   * value.
   */
  public fun gte(gte: Number) {
    cdkBuilder.gte(gte)
  }

  /**
   * @param lt The value for the specified property is less than the specified value.
   */
  public fun lt(lt: Number) {
    cdkBuilder.lt(lt)
  }

  /**
   * @param lte The value for the specified property is less than or equal to the specified value.
   */
  public fun lte(lte: Number) {
    cdkBuilder.lte(lte)
  }

  /**
   * @param neq The value for the specified property doesn't match (doesn't equal) the specified
   * value.
   * If you specify multiple values, Amazon Macie uses OR logic to join the values.
   */
  public fun neq(vararg neq: String) {
    _neq.addAll(listOf(*neq))
  }

  /**
   * @param neq The value for the specified property doesn't match (doesn't equal) the specified
   * value.
   * If you specify multiple values, Amazon Macie uses OR logic to join the values.
   */
  public fun neq(neq: Collection<String>) {
    _neq.addAll(neq)
  }

  public fun build(): CfnFindingsFilter.CriterionAdditionalPropertiesProperty {
    if(_eq.isNotEmpty()) cdkBuilder.eq(_eq)
    if(_neq.isNotEmpty()) cdkBuilder.neq(_neq)
    return cdkBuilder.build()
  }
}
