@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineActivityPropertyDsl {
  private val cdkBuilder: CfnPipeline.ActivityProperty.Builder =
      CfnPipeline.ActivityProperty.builder()

  public fun addAttributes(addAttributes: IResolvable) {
    cdkBuilder.addAttributes(addAttributes)
  }

  public fun addAttributes(addAttributes: CfnPipeline.AddAttributesProperty) {
    cdkBuilder.addAttributes(addAttributes)
  }

  public fun channel(channel: IResolvable) {
    cdkBuilder.channel(channel)
  }

  public fun channel(channel: CfnPipeline.ChannelProperty) {
    cdkBuilder.channel(channel)
  }

  public fun datastore(datastore: IResolvable) {
    cdkBuilder.datastore(datastore)
  }

  public fun datastore(datastore: CfnPipeline.DatastoreProperty) {
    cdkBuilder.datastore(datastore)
  }

  public fun deviceRegistryEnrich(deviceRegistryEnrich: IResolvable) {
    cdkBuilder.deviceRegistryEnrich(deviceRegistryEnrich)
  }

  public fun deviceRegistryEnrich(deviceRegistryEnrich: CfnPipeline.DeviceRegistryEnrichProperty) {
    cdkBuilder.deviceRegistryEnrich(deviceRegistryEnrich)
  }

  public fun deviceShadowEnrich(deviceShadowEnrich: IResolvable) {
    cdkBuilder.deviceShadowEnrich(deviceShadowEnrich)
  }

  public fun deviceShadowEnrich(deviceShadowEnrich: CfnPipeline.DeviceShadowEnrichProperty) {
    cdkBuilder.deviceShadowEnrich(deviceShadowEnrich)
  }

  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  public fun filter(filter: CfnPipeline.FilterProperty) {
    cdkBuilder.filter(filter)
  }

  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  public fun lambda(lambda: CfnPipeline.LambdaProperty) {
    cdkBuilder.lambda(lambda)
  }

  public fun math(math: IResolvable) {
    cdkBuilder.math(math)
  }

  public fun math(math: CfnPipeline.MathProperty) {
    cdkBuilder.math(math)
  }

  public fun removeAttributes(removeAttributes: IResolvable) {
    cdkBuilder.removeAttributes(removeAttributes)
  }

  public fun removeAttributes(removeAttributes: CfnPipeline.RemoveAttributesProperty) {
    cdkBuilder.removeAttributes(removeAttributes)
  }

  public fun selectAttributes(selectAttributes: IResolvable) {
    cdkBuilder.selectAttributes(selectAttributes)
  }

  public fun selectAttributes(selectAttributes: CfnPipeline.SelectAttributesProperty) {
    cdkBuilder.selectAttributes(selectAttributes)
  }

  public fun build(): CfnPipeline.ActivityProperty = cdkBuilder.build()
}
