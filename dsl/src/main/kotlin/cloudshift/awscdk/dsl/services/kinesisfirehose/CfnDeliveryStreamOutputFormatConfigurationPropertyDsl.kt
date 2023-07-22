@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamOutputFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.OutputFormatConfigurationProperty.Builder =
      CfnDeliveryStream.OutputFormatConfigurationProperty.builder()

  /**
   * @param serializer Specifies which serializer to use.
   * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
   * rejects the request.
   */
  public fun serializer(serializer: IResolvable) {
    cdkBuilder.serializer(serializer)
  }

  /**
   * @param serializer Specifies which serializer to use.
   * You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server
   * rejects the request.
   */
  public fun serializer(serializer: CfnDeliveryStream.SerializerProperty) {
    cdkBuilder.serializer(serializer)
  }

  public fun build(): CfnDeliveryStream.OutputFormatConfigurationProperty = cdkBuilder.build()
}
