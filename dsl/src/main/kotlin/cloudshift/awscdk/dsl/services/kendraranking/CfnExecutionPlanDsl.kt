@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendraranking

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan
import software.constructs.Construct

@CdkDslMarker
public class CfnExecutionPlanDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnExecutionPlan.Builder = CfnExecutionPlan.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * You can set additional capacity units to meet the needs of your rescore execution plan.
   *
   * You are given a single capacity unit by default. If you want to use the default capacity, you
   * don't set additional capacity units. For more information on the default capacity and additional
   * capacity units, see [Adjusting
   * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
   * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
   * execution plan. 
   */
  public fun capacityUnits(capacityUnits: IResolvable) {
    cdkBuilder.capacityUnits(capacityUnits)
  }

  /**
   * You can set additional capacity units to meet the needs of your rescore execution plan.
   *
   * You are given a single capacity unit by default. If you want to use the default capacity, you
   * don't set additional capacity units. For more information on the default capacity and additional
   * capacity units, see [Adjusting
   * capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-capacityunits)
   * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
   * execution plan. 
   */
  public fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty) {
    cdkBuilder.capacityUnits(capacityUnits)
  }

  /**
   * A description for the rescore execution plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-description)
   * @param description A description for the rescore execution plan. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A name for the rescore execution plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-name)
   * @param name A name for the rescore execution plan. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A list of key-value pairs that identify or categorize your rescore execution plan.
   *
   * You can also use tags to help control access to the rescore execution plan. Tag keys and values
   * can consist of Unicode letters, digits, white space. They can also consist of underscore, period,
   * colon, equal, plus, and asperand.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-tags)
   * @param tags A list of key-value pairs that identify or categorize your rescore execution plan. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of key-value pairs that identify or categorize your rescore execution plan.
   *
   * You can also use tags to help control access to the rescore execution plan. Tag keys and values
   * can consist of Unicode letters, digits, white space. They can also consist of underscore, period,
   * colon, equal, plus, and asperand.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html#cfn-kendraranking-executionplan-tags)
   * @param tags A list of key-value pairs that identify or categorize your rescore execution plan. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnExecutionPlan {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
