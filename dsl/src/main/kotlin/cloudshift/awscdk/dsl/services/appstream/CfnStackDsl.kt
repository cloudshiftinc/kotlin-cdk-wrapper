@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

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
import software.amazon.awscdk.services.appstream.CfnStack
import software.constructs.Construct

@CdkDslMarker
public class CfnStackDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStack.Builder = CfnStack.Builder.create(scope, id)

  private val _accessEndpoints: MutableList<Any> = mutableListOf()

  private val _attributesToDelete: MutableList<String> = mutableListOf()

  private val _embedHostDomains: MutableList<String> = mutableListOf()

  private val _storageConnectors: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _userSettings: MutableList<Any> = mutableListOf()

  public fun accessEndpoints(vararg accessEndpoints: Any) {
    _accessEndpoints.addAll(listOf(*accessEndpoints))
  }

  public fun accessEndpoints(accessEndpoints: Collection<Any>) {
    _accessEndpoints.addAll(accessEndpoints)
  }

  public fun accessEndpoints(accessEndpoints: IResolvable) {
    cdkBuilder.accessEndpoints(accessEndpoints)
  }

  public fun applicationSettings(applicationSettings: IResolvable) {
    cdkBuilder.applicationSettings(applicationSettings)
  }

  public fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty) {
    cdkBuilder.applicationSettings(applicationSettings)
  }

  public fun attributesToDelete(vararg attributesToDelete: String) {
    _attributesToDelete.addAll(listOf(*attributesToDelete))
  }

  public fun attributesToDelete(attributesToDelete: Collection<String>) {
    _attributesToDelete.addAll(attributesToDelete)
  }

  public fun deleteStorageConnectors(deleteStorageConnectors: Boolean) {
    cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
  }

  public fun deleteStorageConnectors(deleteStorageConnectors: IResolvable) {
    cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun embedHostDomains(vararg embedHostDomains: String) {
    _embedHostDomains.addAll(listOf(*embedHostDomains))
  }

  public fun embedHostDomains(embedHostDomains: Collection<String>) {
    _embedHostDomains.addAll(embedHostDomains)
  }

  public fun feedbackUrl(feedbackUrl: String) {
    cdkBuilder.feedbackUrl(feedbackUrl)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun redirectUrl(redirectUrl: String) {
    cdkBuilder.redirectUrl(redirectUrl)
  }

  public fun storageConnectors(vararg storageConnectors: Any) {
    _storageConnectors.addAll(listOf(*storageConnectors))
  }

  public fun storageConnectors(storageConnectors: Collection<Any>) {
    _storageConnectors.addAll(storageConnectors)
  }

  public fun storageConnectors(storageConnectors: IResolvable) {
    cdkBuilder.storageConnectors(storageConnectors)
  }

  public fun streamingExperienceSettings(streamingExperienceSettings: IResolvable) {
    cdkBuilder.streamingExperienceSettings(streamingExperienceSettings)
  }

  public
      fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty) {
    cdkBuilder.streamingExperienceSettings(streamingExperienceSettings)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun userSettings(vararg userSettings: Any) {
    _userSettings.addAll(listOf(*userSettings))
  }

  public fun userSettings(userSettings: Collection<Any>) {
    _userSettings.addAll(userSettings)
  }

  public fun userSettings(userSettings: IResolvable) {
    cdkBuilder.userSettings(userSettings)
  }

  public fun build(): CfnStack {
    if(_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
    if(_attributesToDelete.isNotEmpty()) cdkBuilder.attributesToDelete(_attributesToDelete)
    if(_embedHostDomains.isNotEmpty()) cdkBuilder.embedHostDomains(_embedHostDomains)
    if(_storageConnectors.isNotEmpty()) cdkBuilder.storageConnectors(_storageConnectors)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_userSettings.isNotEmpty()) cdkBuilder.userSettings(_userSettings)
    return cdkBuilder.build()
  }
}
