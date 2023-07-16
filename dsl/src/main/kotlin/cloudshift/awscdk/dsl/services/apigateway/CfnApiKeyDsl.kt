@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnApiKey
import software.constructs.Construct

@CdkDslMarker
public class CfnApiKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApiKey.Builder = CfnApiKey.Builder.create(scope, id)

  private val _stageKeys: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun customerId(customerId: String) {
    cdkBuilder.customerId(customerId)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun generateDistinctId(generateDistinctId: Boolean) {
    cdkBuilder.generateDistinctId(generateDistinctId)
  }

  public fun generateDistinctId(generateDistinctId: IResolvable) {
    cdkBuilder.generateDistinctId(generateDistinctId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun stageKeys(vararg stageKeys: Any) {
    _stageKeys.addAll(listOf(*stageKeys))
  }

  public fun stageKeys(stageKeys: Collection<Any>) {
    _stageKeys.addAll(stageKeys)
  }

  public fun stageKeys(stageKeys: IResolvable) {
    cdkBuilder.stageKeys(stageKeys)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnApiKey {
    if(_stageKeys.isNotEmpty()) cdkBuilder.stageKeys(_stageKeys)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
