@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.constructs.Construct

@CdkDslMarker
public class CfnCampaignDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCampaign.Builder = CfnCampaign.Builder.create(scope, id)

  private val _dataDestinationConfigs: MutableList<Any> = mutableListOf()

  private val _dataExtraDimensions: MutableList<String> = mutableListOf()

  private val _signalsToCollect: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun collectionScheme(collectionScheme: IResolvable) {
    cdkBuilder.collectionScheme(collectionScheme)
  }

  public fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty) {
    cdkBuilder.collectionScheme(collectionScheme)
  }

  public fun compression(compression: String) {
    cdkBuilder.compression(compression)
  }

  public fun dataDestinationConfigs(vararg dataDestinationConfigs: Any) {
    _dataDestinationConfigs.addAll(listOf(*dataDestinationConfigs))
  }

  public fun dataDestinationConfigs(dataDestinationConfigs: Collection<Any>) {
    _dataDestinationConfigs.addAll(dataDestinationConfigs)
  }

  public fun dataDestinationConfigs(dataDestinationConfigs: IResolvable) {
    cdkBuilder.dataDestinationConfigs(dataDestinationConfigs)
  }

  public fun dataExtraDimensions(vararg dataExtraDimensions: String) {
    _dataExtraDimensions.addAll(listOf(*dataExtraDimensions))
  }

  public fun dataExtraDimensions(dataExtraDimensions: Collection<String>) {
    _dataExtraDimensions.addAll(dataExtraDimensions)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun diagnosticsMode(diagnosticsMode: String) {
    cdkBuilder.diagnosticsMode(diagnosticsMode)
  }

  public fun expiryTime(expiryTime: String) {
    cdkBuilder.expiryTime(expiryTime)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number) {
    cdkBuilder.postTriggerCollectionDuration(postTriggerCollectionDuration)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun signalCatalogArn(signalCatalogArn: String) {
    cdkBuilder.signalCatalogArn(signalCatalogArn)
  }

  public fun signalsToCollect(vararg signalsToCollect: Any) {
    _signalsToCollect.addAll(listOf(*signalsToCollect))
  }

  public fun signalsToCollect(signalsToCollect: Collection<Any>) {
    _signalsToCollect.addAll(signalsToCollect)
  }

  public fun signalsToCollect(signalsToCollect: IResolvable) {
    cdkBuilder.signalsToCollect(signalsToCollect)
  }

  public fun spoolingMode(spoolingMode: String) {
    cdkBuilder.spoolingMode(spoolingMode)
  }

  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CfnCampaign {
    if(_dataDestinationConfigs.isNotEmpty())
        cdkBuilder.dataDestinationConfigs(_dataDestinationConfigs)
    if(_dataExtraDimensions.isNotEmpty()) cdkBuilder.dataExtraDimensions(_dataExtraDimensions)
    if(_signalsToCollect.isNotEmpty()) cdkBuilder.signalsToCollect(_signalsToCollect)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
