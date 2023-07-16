@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import software.constructs.Construct

@CdkDslMarker
public class CfnEvaluationFormDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEvaluationForm.Builder = CfnEvaluationForm.Builder.create(scope, id)

  private val _items: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  public fun items(vararg items: Any) {
    _items.addAll(listOf(*items))
  }

  public fun items(items: Collection<Any>) {
    _items.addAll(items)
  }

  public fun items(items: IResolvable) {
    cdkBuilder.items(items)
  }

  public fun scoringStrategy(scoringStrategy: IResolvable) {
    cdkBuilder.scoringStrategy(scoringStrategy)
  }

  public fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty) {
    cdkBuilder.scoringStrategy(scoringStrategy)
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

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnEvaluationForm {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
