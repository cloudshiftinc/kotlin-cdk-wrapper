@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointPublicAccessBlockConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder =
      CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder()

  public fun blockPublicAcls(blockPublicAcls: Boolean) {
    cdkBuilder.blockPublicAcls(blockPublicAcls)
  }

  public fun blockPublicAcls(blockPublicAcls: IResolvable) {
    cdkBuilder.blockPublicAcls(blockPublicAcls)
  }

  public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
    cdkBuilder.blockPublicPolicy(blockPublicPolicy)
  }

  public fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
    cdkBuilder.blockPublicPolicy(blockPublicPolicy)
  }

  public fun ignorePublicAcls(ignorePublicAcls: Boolean) {
    cdkBuilder.ignorePublicAcls(ignorePublicAcls)
  }

  public fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
    cdkBuilder.ignorePublicAcls(ignorePublicAcls)
  }

  public fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
    cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
  }

  public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
    cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
  }

  public fun build(): CfnAccessPoint.PublicAccessBlockConfigurationProperty = cdkBuilder.build()
}
