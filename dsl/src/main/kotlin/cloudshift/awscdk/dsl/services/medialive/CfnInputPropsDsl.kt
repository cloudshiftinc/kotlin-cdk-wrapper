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

  /**
   * @param destinations Settings that apply only if the input is a push type of input.
   */
  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  /**
   * @param destinations Settings that apply only if the input is a push type of input.
   */
  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  /**
   * @param destinations Settings that apply only if the input is a push type of input.
   */
  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * @param inputDevices Settings that apply only if the input is an Elemental Link input.
   */
  public fun inputDevices(vararg inputDevices: Any) {
    _inputDevices.addAll(listOf(*inputDevices))
  }

  /**
   * @param inputDevices Settings that apply only if the input is an Elemental Link input.
   */
  public fun inputDevices(inputDevices: Collection<Any>) {
    _inputDevices.addAll(inputDevices)
  }

  /**
   * @param inputDevices Settings that apply only if the input is an Elemental Link input.
   */
  public fun inputDevices(inputDevices: IResolvable) {
    cdkBuilder.inputDevices(inputDevices)
  }

  /**
   * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
   * the input if the input is a push type.
   */
  public fun inputSecurityGroups(vararg inputSecurityGroups: String) {
    _inputSecurityGroups.addAll(listOf(*inputSecurityGroups))
  }

  /**
   * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
   * the input if the input is a push type.
   */
  public fun inputSecurityGroups(inputSecurityGroups: Collection<String>) {
    _inputSecurityGroups.addAll(inputSecurityGroups)
  }

  /**
   * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
   */
  public fun mediaConnectFlows(vararg mediaConnectFlows: Any) {
    _mediaConnectFlows.addAll(listOf(*mediaConnectFlows))
  }

  /**
   * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
   */
  public fun mediaConnectFlows(mediaConnectFlows: Collection<Any>) {
    _mediaConnectFlows.addAll(mediaConnectFlows)
  }

  /**
   * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
   */
  public fun mediaConnectFlows(mediaConnectFlows: IResolvable) {
    cdkBuilder.mediaConnectFlows(mediaConnectFlows)
  }

  /**
   * @param name A name for the input.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param roleArn The IAM role for MediaLive to assume when creating a MediaConnect input or
   * Amazon VPC input.
   * This doesn't apply to other types of inputs. The role is identified by its ARN.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param sources Settings that apply only if the input is a pull type of input.
   */
  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  /**
   * @param sources Settings that apply only if the input is a pull type of input.
   */
  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  /**
   * @param sources Settings that apply only if the input is a pull type of input.
   */
  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  /**
   * @param tags A collection of tags for this input.
   * Each tag is a key-value pair.
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags A collection of tags for this input.
   * Each tag is a key-value pair.
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param type The type for this input.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param vpc Settings that apply only if the input is an push input where the source is on Amazon
   * VPC.
   */
  public fun vpc(vpc: IResolvable) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * @param vpc Settings that apply only if the input is an push input where the source is on Amazon
   * VPC.
   */
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
