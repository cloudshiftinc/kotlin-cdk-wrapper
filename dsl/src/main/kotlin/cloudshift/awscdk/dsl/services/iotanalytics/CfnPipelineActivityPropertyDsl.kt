@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineActivityPropertyDsl {
  private val cdkBuilder: CfnPipeline.ActivityProperty.Builder =
      CfnPipeline.ActivityProperty.builder()

  /**
   * @param addAttributes Adds other attributes based on existing attributes in the message.
   */
  public fun addAttributes(addAttributes: IResolvable) {
    cdkBuilder.addAttributes(addAttributes)
  }

  /**
   * @param addAttributes Adds other attributes based on existing attributes in the message.
   */
  public fun addAttributes(addAttributes: CfnPipeline.AddAttributesProperty) {
    cdkBuilder.addAttributes(addAttributes)
  }

  /**
   * @param channel Determines the source of the messages to be processed.
   */
  public fun channel(channel: IResolvable) {
    cdkBuilder.channel(channel)
  }

  /**
   * @param channel Determines the source of the messages to be processed.
   */
  public fun channel(channel: CfnPipeline.ChannelProperty) {
    cdkBuilder.channel(channel)
  }

  /**
   * @param datastore Specifies where to store the processed message data.
   */
  public fun datastore(datastore: IResolvable) {
    cdkBuilder.datastore(datastore)
  }

  /**
   * @param datastore Specifies where to store the processed message data.
   */
  public fun datastore(datastore: CfnPipeline.DatastoreProperty) {
    cdkBuilder.datastore(datastore)
  }

  /**
   * @param deviceRegistryEnrich Adds data from the AWS IoT device registry to your message.
   */
  public fun deviceRegistryEnrich(deviceRegistryEnrich: IResolvable) {
    cdkBuilder.deviceRegistryEnrich(deviceRegistryEnrich)
  }

  /**
   * @param deviceRegistryEnrich Adds data from the AWS IoT device registry to your message.
   */
  public fun deviceRegistryEnrich(deviceRegistryEnrich: CfnPipeline.DeviceRegistryEnrichProperty) {
    cdkBuilder.deviceRegistryEnrich(deviceRegistryEnrich)
  }

  /**
   * @param deviceShadowEnrich Adds information from the AWS IoT Device Shadows service to a
   * message.
   */
  public fun deviceShadowEnrich(deviceShadowEnrich: IResolvable) {
    cdkBuilder.deviceShadowEnrich(deviceShadowEnrich)
  }

  /**
   * @param deviceShadowEnrich Adds information from the AWS IoT Device Shadows service to a
   * message.
   */
  public fun deviceShadowEnrich(deviceShadowEnrich: CfnPipeline.DeviceShadowEnrichProperty) {
    cdkBuilder.deviceShadowEnrich(deviceShadowEnrich)
  }

  /**
   * @param filter Filters a message based on its attributes.
   */
  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param filter Filters a message based on its attributes.
   */
  public fun filter(filter: CfnPipeline.FilterProperty) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param lambda Runs a Lambda function to modify the message.
   */
  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param lambda Runs a Lambda function to modify the message.
   */
  public fun lambda(lambda: CfnPipeline.LambdaProperty) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param math Computes an arithmetic expression using the message's attributes and adds it to the
   * message.
   */
  public fun math(math: IResolvable) {
    cdkBuilder.math(math)
  }

  /**
   * @param math Computes an arithmetic expression using the message's attributes and adds it to the
   * message.
   */
  public fun math(math: CfnPipeline.MathProperty) {
    cdkBuilder.math(math)
  }

  /**
   * @param removeAttributes Removes attributes from a message.
   */
  public fun removeAttributes(removeAttributes: IResolvable) {
    cdkBuilder.removeAttributes(removeAttributes)
  }

  /**
   * @param removeAttributes Removes attributes from a message.
   */
  public fun removeAttributes(removeAttributes: CfnPipeline.RemoveAttributesProperty) {
    cdkBuilder.removeAttributes(removeAttributes)
  }

  /**
   * @param selectAttributes Creates a new message using only the specified attributes from the
   * original message.
   */
  public fun selectAttributes(selectAttributes: IResolvable) {
    cdkBuilder.selectAttributes(selectAttributes)
  }

  /**
   * @param selectAttributes Creates a new message using only the specified attributes from the
   * original message.
   */
  public fun selectAttributes(selectAttributes: CfnPipeline.SelectAttributesProperty) {
    cdkBuilder.selectAttributes(selectAttributes)
  }

  public fun build(): CfnPipeline.ActivityProperty = cdkBuilder.build()
}
