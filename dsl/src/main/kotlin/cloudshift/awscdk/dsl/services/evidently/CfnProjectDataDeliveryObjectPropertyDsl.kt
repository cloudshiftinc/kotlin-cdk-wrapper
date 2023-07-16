@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnProject

@CdkDslMarker
public class CfnProjectDataDeliveryObjectPropertyDsl {
  private val cdkBuilder: CfnProject.DataDeliveryObjectProperty.Builder =
      CfnProject.DataDeliveryObjectProperty.builder()

  public fun logGroup(logGroup: String) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  public fun s3(s3: CfnProject.S3DestinationProperty) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnProject.DataDeliveryObjectProperty = cdkBuilder.build()
}
