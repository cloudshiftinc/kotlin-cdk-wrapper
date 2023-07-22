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
import software.amazon.awscdk.services.medialive.CfnChannel
import software.constructs.Construct

/**
 * The AWS::MediaLive::Channel resource is a MediaLive resource type that creates a channel.
 *
 * A MediaLive channel ingests and transcodes (decodes and encodes) source content from the inputs
 * that are attached to that channel, and packages the new content into outputs.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html)
 */
@CdkDslMarker
public class CfnChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnChannel.Builder = CfnChannel.Builder.create(scope, id)

  private val _destinations: MutableList<Any> = mutableListOf()

  private val _inputAttachments: MutableList<Any> = mutableListOf()

  /**
   * Specification of CDI inputs for this channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-cdiinputspecification)
   * @param cdiInputSpecification Specification of CDI inputs for this channel. 
   */
  public fun cdiInputSpecification(cdiInputSpecification: IResolvable) {
    cdkBuilder.cdiInputSpecification(cdiInputSpecification)
  }

  /**
   * Specification of CDI inputs for this channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-cdiinputspecification)
   * @param cdiInputSpecification Specification of CDI inputs for this channel. 
   */
  public
      fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty) {
    cdkBuilder.cdiInputSpecification(cdiInputSpecification)
  }

  /**
   * The class for this channel.
   *
   * For a channel with two pipelines, the class is STANDARD. For a channel with one pipeline, the
   * class is SINGLE_PIPELINE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelclass)
   * @param channelClass The class for this channel. 
   */
  public fun channelClass(channelClass: String) {
    cdkBuilder.channelClass(channelClass)
  }

  /**
   * The settings that identify the destination for the outputs in this MediaLive output package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations)
   * @param destinations The settings that identify the destination for the outputs in this
   * MediaLive output package. 
   */
  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  /**
   * The settings that identify the destination for the outputs in this MediaLive output package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations)
   * @param destinations The settings that identify the destination for the outputs in this
   * MediaLive output package. 
   */
  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  /**
   * The settings that identify the destination for the outputs in this MediaLive output package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations)
   * @param destinations The settings that identify the destination for the outputs in this
   * MediaLive output package. 
   */
  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * The encoding configuration for the output content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-encodersettings)
   * @param encoderSettings The encoding configuration for the output content. 
   */
  public fun encoderSettings(encoderSettings: IResolvable) {
    cdkBuilder.encoderSettings(encoderSettings)
  }

  /**
   * The encoding configuration for the output content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-encodersettings)
   * @param encoderSettings The encoding configuration for the output content. 
   */
  public fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty) {
    cdkBuilder.encoderSettings(encoderSettings)
  }

  /**
   * The list of input attachments for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments)
   * @param inputAttachments The list of input attachments for the channel. 
   */
  public fun inputAttachments(vararg inputAttachments: Any) {
    _inputAttachments.addAll(listOf(*inputAttachments))
  }

  /**
   * The list of input attachments for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments)
   * @param inputAttachments The list of input attachments for the channel. 
   */
  public fun inputAttachments(inputAttachments: Collection<Any>) {
    _inputAttachments.addAll(inputAttachments)
  }

  /**
   * The list of input attachments for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments)
   * @param inputAttachments The list of input attachments for the channel. 
   */
  public fun inputAttachments(inputAttachments: IResolvable) {
    cdkBuilder.inputAttachments(inputAttachments)
  }

  /**
   * The input specification for this channel.
   *
   * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
   * resolution, and the codec.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputspecification)
   * @param inputSpecification The input specification for this channel. 
   */
  public fun inputSpecification(inputSpecification: IResolvable) {
    cdkBuilder.inputSpecification(inputSpecification)
  }

  /**
   * The input specification for this channel.
   *
   * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
   * resolution, and the codec.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputspecification)
   * @param inputSpecification The input specification for this channel. 
   */
  public fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty) {
    cdkBuilder.inputSpecification(inputSpecification)
  }

  /**
   * The verbosity for logging activity for this channel.
   *
   * Charges for logging (which are generated through Amazon CloudWatch Logging) are higher for
   * higher verbosities.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-loglevel)
   * @param logLevel The verbosity for logging activity for this channel. 
   */
  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-maintenance)
   * @param maintenance 
   */
  public fun maintenance(maintenance: IResolvable) {
    cdkBuilder.maintenance(maintenance)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-maintenance)
   * @param maintenance 
   */
  public fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty) {
    cdkBuilder.maintenance(maintenance)
  }

  /**
   * A name for this audio selector.
   *
   * The AudioDescription (in an output) references this name in order to identify a specific input
   * audio to include in that output.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-name)
   * @param name A name for this audio selector. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The IAM role for MediaLive to assume when running this channel.
   *
   * The role is identified by its ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-rolearn)
   * @param roleArn The IAM role for MediaLive to assume when running this channel. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * A collection of tags for this channel.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-tags)
   * @param tags A collection of tags for this channel. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * A collection of tags for this channel.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-tags)
   * @param tags A collection of tags for this channel. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * Settings to enable VPC mode in the channel, so that the endpoints for all outputs are in your
   * VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-vpc)
   * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
   * are in your VPC. 
   */
  public fun vpc(vpc: IResolvable) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * Settings to enable VPC mode in the channel, so that the endpoints for all outputs are in your
   * VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-vpc)
   * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
   * are in your VPC. 
   */
  public fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CfnChannel {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    if(_inputAttachments.isNotEmpty()) cdkBuilder.inputAttachments(_inputAttachments)
    return cdkBuilder.build()
  }
}
