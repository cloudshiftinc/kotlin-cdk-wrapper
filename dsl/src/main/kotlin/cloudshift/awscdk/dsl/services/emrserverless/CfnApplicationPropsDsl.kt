@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication
import software.amazon.awscdk.services.emrserverless.CfnApplicationProps

@CdkDslMarker
public class CfnApplicationPropsDsl {
  private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

  private val _initialCapacity: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun architecture(architecture: String) {
    cdkBuilder.architecture(architecture)
  }

  public fun autoStartConfiguration(autoStartConfiguration: IResolvable) {
    cdkBuilder.autoStartConfiguration(autoStartConfiguration)
  }

  public
      fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty) {
    cdkBuilder.autoStartConfiguration(autoStartConfiguration)
  }

  public fun autoStopConfiguration(autoStopConfiguration: IResolvable) {
    cdkBuilder.autoStopConfiguration(autoStopConfiguration)
  }

  public
      fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty) {
    cdkBuilder.autoStopConfiguration(autoStopConfiguration)
  }

  public fun imageConfiguration(imageConfiguration: IResolvable) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  public
      fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  public fun initialCapacity(vararg initialCapacity: Any) {
    _initialCapacity.addAll(listOf(*initialCapacity))
  }

  public fun initialCapacity(initialCapacity: Collection<Any>) {
    _initialCapacity.addAll(initialCapacity)
  }

  public fun initialCapacity(initialCapacity: IResolvable) {
    cdkBuilder.initialCapacity(initialCapacity)
  }

  public fun maximumCapacity(maximumCapacity: IResolvable) {
    cdkBuilder.maximumCapacity(maximumCapacity)
  }

  public fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty) {
    cdkBuilder.maximumCapacity(maximumCapacity)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  public
      fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  public fun releaseLabel(releaseLabel: String) {
    cdkBuilder.releaseLabel(releaseLabel)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun workerTypeSpecifications(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.workerTypeSpecifications(builder.map)
  }

  public fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>) {
    cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
  }

  public fun workerTypeSpecifications(workerTypeSpecifications: IResolvable) {
    cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
  }

  public fun build(): CfnApplicationProps {
    if(_initialCapacity.isNotEmpty()) cdkBuilder.initialCapacity(_initialCapacity)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
