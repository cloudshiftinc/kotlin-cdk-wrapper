@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * The `Predicate` property specifies information for generating Amplify DataStore queries.
 *
 * Use `Predicate` to retrieve a subset of the data in a collection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * PredicateProperty predicateProperty_;
 * PredicateProperty predicateProperty = PredicateProperty.builder()
 * .and(List.of(predicateProperty_))
 * .field("field")
 * .operand("operand")
 * .operator("operator")
 * .or(List.of(predicateProperty_))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html)
 */
@CdkDslMarker
public class CfnComponentPredicatePropertyDsl {
  private val cdkBuilder: CfnComponent.PredicateProperty.Builder =
      CfnComponent.PredicateProperty.builder()

  private val _and: MutableList<Any> = mutableListOf()

  private val _or: MutableList<Any> = mutableListOf()

  /**
   * @param and A list of predicates to combine logically.
   */
  public fun and(vararg and: Any) {
    _and.addAll(listOf(*and))
  }

  /**
   * @param and A list of predicates to combine logically.
   */
  public fun and(and: Collection<Any>) {
    _and.addAll(and)
  }

  /**
   * @param and A list of predicates to combine logically.
   */
  public fun and(and: IResolvable) {
    cdkBuilder.and(and)
  }

  /**
   * @param field The field to query.
   */
  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  /**
   * @param operand The value to use when performing the evaluation.
   */
  public fun operand(operand: String) {
    cdkBuilder.operand(operand)
  }

  /**
   * @param operator The operator to use to perform the evaluation.
   */
  public fun `operator`(`operator`: String) {
    cdkBuilder.`operator`(`operator`)
  }

  /**
   * @param or A list of predicates to combine logically.
   */
  public fun or(vararg or: Any) {
    _or.addAll(listOf(*or))
  }

  /**
   * @param or A list of predicates to combine logically.
   */
  public fun or(or: Collection<Any>) {
    _or.addAll(or)
  }

  /**
   * @param or A list of predicates to combine logically.
   */
  public fun or(or: IResolvable) {
    cdkBuilder.or(or)
  }

  public fun build(): CfnComponent.PredicateProperty {
    if(_and.isNotEmpty()) cdkBuilder.and(_and)
    if(_or.isNotEmpty()) cdkBuilder.or(_or)
    return cdkBuilder.build()
  }
}
