@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDevice
import software.constructs.Construct

@CdkDslMarker
public class CfnDeviceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDevice.Builder = CfnDevice.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun device(device: IResolvable) {
    cdkBuilder.device(device)
  }

  public fun device(device: CfnDevice.DeviceProperty) {
    cdkBuilder.device(device)
  }

  public fun deviceFleetName(deviceFleetName: String) {
    cdkBuilder.deviceFleetName(deviceFleetName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDevice {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
