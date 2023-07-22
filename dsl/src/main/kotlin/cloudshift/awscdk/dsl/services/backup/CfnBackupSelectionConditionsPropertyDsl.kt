@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection

/**
 * Contains information about which resources to include or exclude from a backup plan using their
 * tags.
 *
 * Conditions are case sensitive.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * ConditionsProperty conditionsProperty = ConditionsProperty.builder()
 * .stringEquals(List.of(ConditionParameterProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionValue("conditionValue")
 * .build()))
 * .stringLike(List.of(ConditionParameterProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionValue("conditionValue")
 * .build()))
 * .stringNotEquals(List.of(ConditionParameterProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionValue("conditionValue")
 * .build()))
 * .stringNotLike(List.of(ConditionParameterProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionValue("conditionValue")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html)
 */
@CdkDslMarker
public class CfnBackupSelectionConditionsPropertyDsl {
  private val cdkBuilder: CfnBackupSelection.ConditionsProperty.Builder =
      CfnBackupSelection.ConditionsProperty.builder()

  private val _stringEquals: MutableList<Any> = mutableListOf()

  private val _stringLike: MutableList<Any> = mutableListOf()

  private val _stringNotEquals: MutableList<Any> = mutableListOf()

  private val _stringNotLike: MutableList<Any> = mutableListOf()

  /**
   * @param stringEquals Filters the values of your tagged resources for only those resources that
   * you tagged with the same value.
   * Also called "exact matching."
   */
  public fun stringEquals(vararg stringEquals: Any) {
    _stringEquals.addAll(listOf(*stringEquals))
  }

  /**
   * @param stringEquals Filters the values of your tagged resources for only those resources that
   * you tagged with the same value.
   * Also called "exact matching."
   */
  public fun stringEquals(stringEquals: Collection<Any>) {
    _stringEquals.addAll(stringEquals)
  }

  /**
   * @param stringEquals Filters the values of your tagged resources for only those resources that
   * you tagged with the same value.
   * Also called "exact matching."
   */
  public fun stringEquals(stringEquals: IResolvable) {
    cdkBuilder.stringEquals(stringEquals)
  }

  /**
   * @param stringLike Filters the values of your tagged resources for matching tag values with the
   * use of a wildcard character (*) anywhere in the string.
   * For example, "prod*" or "*rod*" matches the tag value "production".
   */
  public fun stringLike(vararg stringLike: Any) {
    _stringLike.addAll(listOf(*stringLike))
  }

  /**
   * @param stringLike Filters the values of your tagged resources for matching tag values with the
   * use of a wildcard character (*) anywhere in the string.
   * For example, "prod*" or "*rod*" matches the tag value "production".
   */
  public fun stringLike(stringLike: Collection<Any>) {
    _stringLike.addAll(stringLike)
  }

  /**
   * @param stringLike Filters the values of your tagged resources for matching tag values with the
   * use of a wildcard character (*) anywhere in the string.
   * For example, "prod*" or "*rod*" matches the tag value "production".
   */
  public fun stringLike(stringLike: IResolvable) {
    cdkBuilder.stringLike(stringLike)
  }

  /**
   * @param stringNotEquals Filters the values of your tagged resources for only those resources
   * that you tagged that do not have the same value.
   * Also called "negated matching."
   */
  public fun stringNotEquals(vararg stringNotEquals: Any) {
    _stringNotEquals.addAll(listOf(*stringNotEquals))
  }

  /**
   * @param stringNotEquals Filters the values of your tagged resources for only those resources
   * that you tagged that do not have the same value.
   * Also called "negated matching."
   */
  public fun stringNotEquals(stringNotEquals: Collection<Any>) {
    _stringNotEquals.addAll(stringNotEquals)
  }

  /**
   * @param stringNotEquals Filters the values of your tagged resources for only those resources
   * that you tagged that do not have the same value.
   * Also called "negated matching."
   */
  public fun stringNotEquals(stringNotEquals: IResolvable) {
    cdkBuilder.stringNotEquals(stringNotEquals)
  }

  /**
   * @param stringNotLike Filters the values of your tagged resources for non-matching tag values
   * with the use of a wildcard character (*) anywhere in the string.
   */
  public fun stringNotLike(vararg stringNotLike: Any) {
    _stringNotLike.addAll(listOf(*stringNotLike))
  }

  /**
   * @param stringNotLike Filters the values of your tagged resources for non-matching tag values
   * with the use of a wildcard character (*) anywhere in the string.
   */
  public fun stringNotLike(stringNotLike: Collection<Any>) {
    _stringNotLike.addAll(stringNotLike)
  }

  /**
   * @param stringNotLike Filters the values of your tagged resources for non-matching tag values
   * with the use of a wildcard character (*) anywhere in the string.
   */
  public fun stringNotLike(stringNotLike: IResolvable) {
    cdkBuilder.stringNotLike(stringNotLike)
  }

  public fun build(): CfnBackupSelection.ConditionsProperty {
    if(_stringEquals.isNotEmpty()) cdkBuilder.stringEquals(_stringEquals)
    if(_stringLike.isNotEmpty()) cdkBuilder.stringLike(_stringLike)
    if(_stringNotEquals.isNotEmpty()) cdkBuilder.stringNotEquals(_stringNotEquals)
    if(_stringNotLike.isNotEmpty()) cdkBuilder.stringNotLike(_stringNotLike)
    return cdkBuilder.build()
  }
}
