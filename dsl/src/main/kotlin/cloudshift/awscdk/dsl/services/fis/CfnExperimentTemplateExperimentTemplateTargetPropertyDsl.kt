@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateTargetPropertyDsl {
  private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateTargetProperty.Builder =
      CfnExperimentTemplate.ExperimentTemplateTargetProperty.builder()

  private val _filters: MutableList<Any> = mutableListOf()

  private val _resourceArns: MutableList<String> = mutableListOf()

  /**
   * @param filters The filters to apply to identify target resources using specific attributes.
   */
  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * @param filters The filters to apply to identify target resources using specific attributes.
   */
  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  /**
   * @param filters The filters to apply to identify target resources using specific attributes.
   */
  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  /**
   * @param parameters The parameters for the resource type.
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters The parameters for the resource type.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param resourceArns The Amazon Resource Names (ARNs) of the resources.
   */
  public fun resourceArns(vararg resourceArns: String) {
    _resourceArns.addAll(listOf(*resourceArns))
  }

  /**
   * @param resourceArns The Amazon Resource Names (ARNs) of the resources.
   */
  public fun resourceArns(resourceArns: Collection<String>) {
    _resourceArns.addAll(resourceArns)
  }

  /**
   * @param resourceTags The tags for the target resources.
   */
  public fun resourceTags(resourceTags: Map<String, String>) {
    cdkBuilder.resourceTags(resourceTags)
  }

  /**
   * @param resourceTags The tags for the target resources.
   */
  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  /**
   * @param resourceType The resource type. 
   * The resource type must be supported for the specified action.
   */
  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  /**
   * @param selectionMode Scopes the identified resources to a specific count of the resources at
   * random, or a percentage of the resources. 
   * All identified resources are included in the target.
   *
   * * ALL - Run the action on all identified targets. This is the default.
   * * COUNT(n) - Run the action on the specified number of targets, chosen from the identified
   * targets at random. For example, COUNT(1) selects one of the targets.
   * * PERCENT(n) - Run the action on the specified percentage of targets, chosen from the
   * identified targets at random. For example, PERCENT(25) selects 25% of the targets.
   */
  public fun selectionMode(selectionMode: String) {
    cdkBuilder.selectionMode(selectionMode)
  }

  public fun build(): CfnExperimentTemplate.ExperimentTemplateTargetProperty {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    if(_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
    return cdkBuilder.build()
  }
}
