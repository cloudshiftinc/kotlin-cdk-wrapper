@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointPolicyStatusPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.PolicyStatusProperty.Builder =
      CfnAccessPoint.PolicyStatusProperty.builder()

  /**
   * @param isPublic Specifies whether the Object lambda Access Point Policy is Public or not.
   * Object lambda Access Points are private by default.
   */
  public fun isPublic(isPublic: Boolean) {
    cdkBuilder.isPublic(isPublic)
  }

  /**
   * @param isPublic Specifies whether the Object lambda Access Point Policy is Public or not.
   * Object lambda Access Points are private by default.
   */
  public fun isPublic(isPublic: IResolvable) {
    cdkBuilder.isPublic(isPublic)
  }

  public fun build(): CfnAccessPoint.PolicyStatusProperty = cdkBuilder.build()
}
