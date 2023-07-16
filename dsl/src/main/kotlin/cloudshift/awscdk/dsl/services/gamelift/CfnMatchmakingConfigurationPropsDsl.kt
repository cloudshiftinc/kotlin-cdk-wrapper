@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps

@CdkDslMarker
public class CfnMatchmakingConfigurationPropsDsl {
  private val cdkBuilder: CfnMatchmakingConfigurationProps.Builder =
      CfnMatchmakingConfigurationProps.builder()

  private val _gameProperties: MutableList<Any> = mutableListOf()

  private val _gameSessionQueueArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun acceptanceRequired(acceptanceRequired: Boolean) {
    cdkBuilder.acceptanceRequired(acceptanceRequired)
  }

  public fun acceptanceRequired(acceptanceRequired: IResolvable) {
    cdkBuilder.acceptanceRequired(acceptanceRequired)
  }

  public fun acceptanceTimeoutSeconds(acceptanceTimeoutSeconds: Number) {
    cdkBuilder.acceptanceTimeoutSeconds(acceptanceTimeoutSeconds)
  }

  public fun additionalPlayerCount(additionalPlayerCount: Number) {
    cdkBuilder.additionalPlayerCount(additionalPlayerCount)
  }

  public fun backfillMode(backfillMode: String) {
    cdkBuilder.backfillMode(backfillMode)
  }

  public fun customEventData(customEventData: String) {
    cdkBuilder.customEventData(customEventData)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun flexMatchMode(flexMatchMode: String) {
    cdkBuilder.flexMatchMode(flexMatchMode)
  }

  public fun gameProperties(vararg gameProperties: Any) {
    _gameProperties.addAll(listOf(*gameProperties))
  }

  public fun gameProperties(gameProperties: Collection<Any>) {
    _gameProperties.addAll(gameProperties)
  }

  public fun gameProperties(gameProperties: IResolvable) {
    cdkBuilder.gameProperties(gameProperties)
  }

  public fun gameSessionData(gameSessionData: String) {
    cdkBuilder.gameSessionData(gameSessionData)
  }

  public fun gameSessionQueueArns(vararg gameSessionQueueArns: String) {
    _gameSessionQueueArns.addAll(listOf(*gameSessionQueueArns))
  }

  public fun gameSessionQueueArns(gameSessionQueueArns: Collection<String>) {
    _gameSessionQueueArns.addAll(gameSessionQueueArns)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun notificationTarget(notificationTarget: String) {
    cdkBuilder.notificationTarget(notificationTarget)
  }

  public fun requestTimeoutSeconds(requestTimeoutSeconds: Number) {
    cdkBuilder.requestTimeoutSeconds(requestTimeoutSeconds)
  }

  public fun ruleSetName(ruleSetName: String) {
    cdkBuilder.ruleSetName(ruleSetName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMatchmakingConfigurationProps {
    if(_gameProperties.isNotEmpty()) cdkBuilder.gameProperties(_gameProperties)
    if(_gameSessionQueueArns.isNotEmpty()) cdkBuilder.gameSessionQueueArns(_gameSessionQueueArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
