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
import software.constructs.Construct

@CdkDslMarker
public class CfnInputDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInput.Builder = CfnInput.Builder.create(scope, id)

  private val _destinations: MutableList<Any> = mutableListOf()

  private val _inputDevices: MutableList<Any> = mutableListOf()

  private val _inputSecurityGroups: MutableList<String> = mutableListOf()

  private val _mediaConnectFlows: MutableList<Any> = mutableListOf()

  private val _sources: MutableList<Any> = mutableListOf()

  /**
   * Settings that apply only if the input is a push type of input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
   * @param destinations Settings that apply only if the input is a push type of input. 
   */
  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  /**
   * Settings that apply only if the input is a push type of input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
   * @param destinations Settings that apply only if the input is a push type of input. 
   */
  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  /**
   * Settings that apply only if the input is a push type of input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
   * @param destinations Settings that apply only if the input is a push type of input. 
   */
  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * Settings that apply only if the input is an Elemental Link input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
   * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
   */
  public fun inputDevices(vararg inputDevices: Any) {
    _inputDevices.addAll(listOf(*inputDevices))
  }

  /**
   * Settings that apply only if the input is an Elemental Link input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
   * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
   */
  public fun inputDevices(inputDevices: Collection<Any>) {
    _inputDevices.addAll(inputDevices)
  }

  /**
   * Settings that apply only if the input is an Elemental Link input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
   * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
   */
  public fun inputDevices(inputDevices: IResolvable) {
    cdkBuilder.inputDevices(inputDevices)
  }

  /**
   * The list of input security groups (referenced by IDs) to attach to the input if the input is a
   * push type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputsecuritygroups)
   * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
   * the input if the input is a push type. 
   */
  public fun inputSecurityGroups(vararg inputSecurityGroups: String) {
    _inputSecurityGroups.addAll(listOf(*inputSecurityGroups))
  }

  /**
   * The list of input security groups (referenced by IDs) to attach to the input if the input is a
   * push type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputsecuritygroups)
   * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
   * the input if the input is a push type. 
   */
  public fun inputSecurityGroups(inputSecurityGroups: Collection<String>) {
    _inputSecurityGroups.addAll(inputSecurityGroups)
  }

  /**
   * Settings that apply only if the input is a MediaConnect input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
   * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
   */
  public fun mediaConnectFlows(vararg mediaConnectFlows: Any) {
    _mediaConnectFlows.addAll(listOf(*mediaConnectFlows))
  }

  /**
   * Settings that apply only if the input is a MediaConnect input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
   * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
   */
  public fun mediaConnectFlows(mediaConnectFlows: Collection<Any>) {
    _mediaConnectFlows.addAll(mediaConnectFlows)
  }

  /**
   * Settings that apply only if the input is a MediaConnect input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
   * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
   */
  public fun mediaConnectFlows(mediaConnectFlows: IResolvable) {
    cdkBuilder.mediaConnectFlows(mediaConnectFlows)
  }

  /**
   * A name for the input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-name)
   * @param name A name for the input. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The IAM role for MediaLive to assume when creating a MediaConnect input or Amazon VPC input.
   *
   * This doesn't apply to other types of inputs. The role is identified by its ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-rolearn)
   * @param roleArn The IAM role for MediaLive to assume when creating a MediaConnect input or
   * Amazon VPC input. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * Settings that apply only if the input is a pull type of input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
   * @param sources Settings that apply only if the input is a pull type of input. 
   */
  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  /**
   * Settings that apply only if the input is a pull type of input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
   * @param sources Settings that apply only if the input is a pull type of input. 
   */
  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  /**
   * Settings that apply only if the input is a pull type of input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
   * @param sources Settings that apply only if the input is a pull type of input. 
   */
  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  /**
   * A collection of tags for this input.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-tags)
   * @param tags A collection of tags for this input. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * A collection of tags for this input.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-tags)
   * @param tags A collection of tags for this input. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * The type for this input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-type)
   * @param type The type for this input. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * Settings that apply only if the input is an push input where the source is on Amazon VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
   * @param vpc Settings that apply only if the input is an push input where the source is on Amazon
   * VPC. 
   */
  public fun vpc(vpc: IResolvable) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * Settings that apply only if the input is an push input where the source is on Amazon VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
   * @param vpc Settings that apply only if the input is an push input where the source is on Amazon
   * VPC. 
   */
  public fun vpc(vpc: CfnInput.InputVpcRequestProperty) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CfnInput {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    if(_inputDevices.isNotEmpty()) cdkBuilder.inputDevices(_inputDevices)
    if(_inputSecurityGroups.isNotEmpty()) cdkBuilder.inputSecurityGroups(_inputSecurityGroups)
    if(_mediaConnectFlows.isNotEmpty()) cdkBuilder.mediaConnectFlows(_mediaConnectFlows)
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    return cdkBuilder.build()
  }
}
