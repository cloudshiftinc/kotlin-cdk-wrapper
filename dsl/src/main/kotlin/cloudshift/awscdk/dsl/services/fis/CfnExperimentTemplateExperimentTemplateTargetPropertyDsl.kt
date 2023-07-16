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

  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun resourceArns(vararg resourceArns: String) {
    _resourceArns.addAll(listOf(*resourceArns))
  }

  public fun resourceArns(resourceArns: Collection<String>) {
    _resourceArns.addAll(resourceArns)
  }

  public fun resourceTags(resourceTags: Map<String, String>) {
    cdkBuilder.resourceTags(resourceTags)
  }

  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun selectionMode(selectionMode: String) {
    cdkBuilder.selectionMode(selectionMode)
  }

  public fun build(): CfnExperimentTemplate.ExperimentTemplateTargetProperty {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    if(_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
    return cdkBuilder.build()
  }
}
