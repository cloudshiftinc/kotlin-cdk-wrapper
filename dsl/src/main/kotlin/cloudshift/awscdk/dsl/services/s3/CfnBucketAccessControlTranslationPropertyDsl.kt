@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketAccessControlTranslationPropertyDsl {
  private val cdkBuilder: CfnBucket.AccessControlTranslationProperty.Builder =
      CfnBucket.AccessControlTranslationProperty.builder()

  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  public fun build(): CfnBucket.AccessControlTranslationProperty = cdkBuilder.build()
}
