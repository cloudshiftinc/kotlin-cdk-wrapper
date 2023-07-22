@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection

/**
 * Specifies an object containing properties used to assign a set of resources to a backup plan.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object conditions;
 * BackupSelectionResourceTypeProperty backupSelectionResourceTypeProperty =
 * BackupSelectionResourceTypeProperty.builder()
 * .iamRoleArn("iamRoleArn")
 * .selectionName("selectionName")
 * // the properties below are optional
 * .conditions(conditions)
 * .listOfTags(List.of(ConditionResourceTypeProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionType("conditionType")
 * .conditionValue("conditionValue")
 * .build()))
 * .notResources(List.of("notResources"))
 * .resources(List.of("resources"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html)
 */
@CdkDslMarker
public class CfnBackupSelectionBackupSelectionResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder =
      CfnBackupSelection.BackupSelectionResourceTypeProperty.builder()

  private val _listOfTags: MutableList<Any> = mutableListOf()

  private val _notResources: MutableList<String> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  /**
   * @param conditions A list of conditions that you define to assign resources to your backup plans
   * using tags.
   * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
   * "ConditionValue": "true" },` . Condition operators are case sensitive.
   *
   * `Conditions` differs from `ListOfTags` as follows:
   *
   * * When you specify more than one condition, you only assign the resources that match ALL
   * conditions (using AND logic).
   * * `Conditions` supports `StringEquals` , `StringLike` , `StringNotEquals` , and `StringNotLike`
   * . `ListOfTags` only supports `StringEquals` .
   */
  public fun conditions(conditions: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(conditions)
    cdkBuilder.conditions(builder.map)
  }

  /**
   * @param conditions A list of conditions that you define to assign resources to your backup plans
   * using tags.
   * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
   * "ConditionValue": "true" },` . Condition operators are case sensitive.
   *
   * `Conditions` differs from `ListOfTags` as follows:
   *
   * * When you specify more than one condition, you only assign the resources that match ALL
   * conditions (using AND logic).
   * * `Conditions` supports `StringEquals` , `StringLike` , `StringNotEquals` , and `StringNotLike`
   * . `ListOfTags` only supports `StringEquals` .
   */
  public fun conditions(conditions: Any) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * @param iamRoleArn The ARN of the IAM role that AWS Backup uses to authenticate when backing up
   * the target resource;. 
   * for example, `arn:aws:iam::123456789012:role/S3Access` .
   */
  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  /**
   * @param listOfTags A list of conditions that you define to assign resources to your backup plans
   * using tags.
   * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
   * "ConditionValue": "true" },` . Condition operators are case sensitive.
   *
   * `ListOfTags` differs from `Conditions` as follows:
   *
   * * When you specify more than one condition, you assign all resources that match AT LEAST ONE
   * condition (using OR logic).
   * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
   * `StringLike` , `StringNotEquals` , and `StringNotLike` .
   */
  public fun listOfTags(vararg listOfTags: Any) {
    _listOfTags.addAll(listOf(*listOfTags))
  }

  /**
   * @param listOfTags A list of conditions that you define to assign resources to your backup plans
   * using tags.
   * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
   * "ConditionValue": "true" },` . Condition operators are case sensitive.
   *
   * `ListOfTags` differs from `Conditions` as follows:
   *
   * * When you specify more than one condition, you assign all resources that match AT LEAST ONE
   * condition (using OR logic).
   * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
   * `StringLike` , `StringNotEquals` , and `StringNotLike` .
   */
  public fun listOfTags(listOfTags: Collection<Any>) {
    _listOfTags.addAll(listOfTags)
  }

  /**
   * @param listOfTags A list of conditions that you define to assign resources to your backup plans
   * using tags.
   * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
   * "ConditionValue": "true" },` . Condition operators are case sensitive.
   *
   * `ListOfTags` differs from `Conditions` as follows:
   *
   * * When you specify more than one condition, you assign all resources that match AT LEAST ONE
   * condition (using OR logic).
   * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
   * `StringLike` , `StringNotEquals` , and `StringNotLike` .
   */
  public fun listOfTags(listOfTags: IResolvable) {
    cdkBuilder.listOfTags(listOfTags)
  }

  /**
   * @param notResources A list of Amazon Resource Names (ARNs) to exclude from a backup plan.
   * The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards.
   *
   * If you need to exclude many resources from a backup plan, consider a different resource
   * selection strategy, such as assigning only one or a few resource types or refining your resource
   * selection using tags.
   */
  public fun notResources(vararg notResources: String) {
    _notResources.addAll(listOf(*notResources))
  }

  /**
   * @param notResources A list of Amazon Resource Names (ARNs) to exclude from a backup plan.
   * The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards.
   *
   * If you need to exclude many resources from a backup plan, consider a different resource
   * selection strategy, such as assigning only one or a few resource types or refining your resource
   * selection using tags.
   */
  public fun notResources(notResources: Collection<String>) {
    _notResources.addAll(notResources)
  }

  /**
   * @param resources An array of strings that contain Amazon Resource Names (ARNs) of resources to
   * assign to a backup plan.
   */
  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources An array of strings that contain Amazon Resource Names (ARNs) of resources to
   * assign to a backup plan.
   */
  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  /**
   * @param selectionName The display name of a resource selection document. 
   */
  public fun selectionName(selectionName: String) {
    cdkBuilder.selectionName(selectionName)
  }

  public fun build(): CfnBackupSelection.BackupSelectionResourceTypeProperty {
    if(_listOfTags.isNotEmpty()) cdkBuilder.listOfTags(_listOfTags)
    if(_notResources.isNotEmpty()) cdkBuilder.notResources(_notResources)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
