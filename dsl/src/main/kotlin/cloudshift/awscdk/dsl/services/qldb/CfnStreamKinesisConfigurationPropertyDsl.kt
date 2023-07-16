@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.qldb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.qldb.CfnStream

@CdkDslMarker
public class CfnStreamKinesisConfigurationPropertyDsl {
  private val cdkBuilder: CfnStream.KinesisConfigurationProperty.Builder =
      CfnStream.KinesisConfigurationProperty.builder()

  public fun aggregationEnabled(aggregationEnabled: Boolean) {
    cdkBuilder.aggregationEnabled(aggregationEnabled)
  }

  public fun aggregationEnabled(aggregationEnabled: IResolvable) {
    cdkBuilder.aggregationEnabled(aggregationEnabled)
  }

  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnStream.KinesisConfigurationProperty = cdkBuilder.build()
}
