@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnChannel

@CdkDslMarker
public class CfnChannelChannelStoragePropertyDsl {
  private val cdkBuilder: CfnChannel.ChannelStorageProperty.Builder =
      CfnChannel.ChannelStorageProperty.builder()

  public fun customerManagedS3(customerManagedS3: IResolvable) {
    cdkBuilder.customerManagedS3(customerManagedS3)
  }

  public fun customerManagedS3(customerManagedS3: CfnChannel.CustomerManagedS3Property) {
    cdkBuilder.customerManagedS3(customerManagedS3)
  }

  public fun serviceManagedS3(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.serviceManagedS3(builder.map)
  }

  public fun serviceManagedS3(serviceManagedS3: Any) {
    cdkBuilder.serviceManagedS3(serviceManagedS3)
  }

  public fun build(): CfnChannel.ChannelStorageProperty = cdkBuilder.build()
}
