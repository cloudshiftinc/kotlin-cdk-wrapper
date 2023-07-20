@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnInput
import software.amazon.awscdk.services.medialive.CfnInputProps

@CdkDslMarker
public class CfnInputPropsDsl {
  private val cdkBuilder: CfnInputProps.Builder = CfnInputProps.builder()

  private val _destinations: MutableList<Any> = mutableListOf()

  private val _inputDevices: MutableList<Any> = mutableListOf()

  private val _inputSecurityGroups: MutableList<String> = mutableListOf()

  private val _mediaConnectFlows: MutableList<Any> = mutableListOf()

  private val _sources: MutableList<Any> = mutableListOf()

  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  public fun inputDevices(vararg inputDevices: Any) {
    _inputDevices.addAll(listOf(*inputDevices))
  }

  public fun inputDevices(inputDevices: Collection<Any>) {
    _inputDevices.addAll(inputDevices)
  }

  public fun inputDevices(inputDevices: IResolvable) {
    cdkBuilder.inputDevices(inputDevices)
  }

  public fun inputSecurityGroups(vararg inputSecurityGroups: String) {
    _inputSecurityGroups.addAll(listOf(*inputSecurityGroups))
  }

  public fun inputSecurityGroups(inputSecurityGroups: Collection<String>) {
    _inputSecurityGroups.addAll(inputSecurityGroups)
  }

  public fun mediaConnectFlows(vararg mediaConnectFlows: Any) {
    _mediaConnectFlows.addAll(listOf(*mediaConnectFlows))
  }

  public fun mediaConnectFlows(mediaConnectFlows: Collection<Any>) {
    _mediaConnectFlows.addAll(mediaConnectFlows)
  }

  public fun mediaConnectFlows(mediaConnectFlows: IResolvable) {
    cdkBuilder.mediaConnectFlows(mediaConnectFlows)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun vpc(vpc: IResolvable) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpc(vpc: CfnInput.InputVpcRequestProperty) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CfnInputProps {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    if(_inputDevices.isNotEmpty()) cdkBuilder.inputDevices(_inputDevices)
    if(_inputSecurityGroups.isNotEmpty()) cdkBuilder.inputSecurityGroups(_inputSecurityGroups)
    if(_mediaConnectFlows.isNotEmpty()) cdkBuilder.mediaConnectFlows(_mediaConnectFlows)
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    return cdkBuilder.build()
  }
}
