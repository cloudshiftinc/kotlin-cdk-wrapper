@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnFaq

@CdkDslMarker
public class CfnFaqS3PathPropertyDsl {
  private val cdkBuilder: CfnFaq.S3PathProperty.Builder = CfnFaq.S3PathProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnFaq.S3PathProperty = cdkBuilder.build()
}
