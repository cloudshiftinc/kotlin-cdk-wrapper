@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import software.amazon.awscdk.services.quicksight.CfnAnalysisProps

@CdkDslMarker
public class CfnAnalysisPropsDsl {
  private val cdkBuilder: CfnAnalysisProps.Builder = CfnAnalysisProps.builder()

  private val _permissions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun analysisId(analysisId: String) {
    cdkBuilder.analysisId(analysisId)
  }

  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  public fun definition(definition: CfnAnalysis.AnalysisDefinitionProperty) {
    cdkBuilder.definition(definition)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun parameters(parameters: CfnAnalysis.ParametersProperty) {
    cdkBuilder.parameters(parameters)
  }

  public fun permissions(vararg permissions: Any) {
    _permissions.addAll(listOf(*permissions))
  }

  public fun permissions(permissions: Collection<Any>) {
    _permissions.addAll(permissions)
  }

  public fun permissions(permissions: IResolvable) {
    cdkBuilder.permissions(permissions)
  }

  public fun sourceEntity(sourceEntity: IResolvable) {
    cdkBuilder.sourceEntity(sourceEntity)
  }

  public fun sourceEntity(sourceEntity: CfnAnalysis.AnalysisSourceEntityProperty) {
    cdkBuilder.sourceEntity(sourceEntity)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun themeArn(themeArn: String) {
    cdkBuilder.themeArn(themeArn)
  }

  public fun build(): CfnAnalysisProps {
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
