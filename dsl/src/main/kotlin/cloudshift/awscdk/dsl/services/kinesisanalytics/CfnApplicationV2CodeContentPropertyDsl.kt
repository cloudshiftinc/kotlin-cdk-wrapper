@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2CodeContentPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.CodeContentProperty.Builder =
      CfnApplicationV2.CodeContentProperty.builder()

  public fun s3ContentLocation(s3ContentLocation: IResolvable) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  public fun s3ContentLocation(s3ContentLocation: CfnApplicationV2.S3ContentLocationProperty) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  public fun textContent(textContent: String) {
    cdkBuilder.textContent(textContent)
  }

  public fun zipFileContent(zipFileContent: String) {
    cdkBuilder.zipFileContent(zipFileContent)
  }

  public fun build(): CfnApplicationV2.CodeContentProperty = cdkBuilder.build()
}
