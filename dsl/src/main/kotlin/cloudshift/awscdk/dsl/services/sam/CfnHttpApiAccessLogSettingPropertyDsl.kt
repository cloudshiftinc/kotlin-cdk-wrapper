@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnHttpApi

@CdkDslMarker
public class CfnHttpApiAccessLogSettingPropertyDsl {
  private val cdkBuilder: CfnHttpApi.AccessLogSettingProperty.Builder =
      CfnHttpApi.AccessLogSettingProperty.builder()

  /**
   * @param destinationArn the value to be set.
   */
  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  /**
   * @param format the value to be set.
   */
  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun build(): CfnHttpApi.AccessLogSettingProperty = cdkBuilder.build()
}
