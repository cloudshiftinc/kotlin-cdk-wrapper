@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamHiveJsonSerDePropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.HiveJsonSerDeProperty.Builder =
      CfnDeliveryStream.HiveJsonSerDeProperty.builder()

  private val _timestampFormats: MutableList<String> = mutableListOf()

  public fun timestampFormats(vararg timestampFormats: String) {
    _timestampFormats.addAll(listOf(*timestampFormats))
  }

  public fun timestampFormats(timestampFormats: Collection<String>) {
    _timestampFormats.addAll(timestampFormats)
  }

  public fun build(): CfnDeliveryStream.HiveJsonSerDeProperty {
    if(_timestampFormats.isNotEmpty()) cdkBuilder.timestampFormats(_timestampFormats)
    return cdkBuilder.build()
  }
}
