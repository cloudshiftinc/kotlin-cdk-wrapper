@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetIamInstanceProfileSpecificationPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.IamInstanceProfileSpecificationProperty.Builder =
      CfnSpotFleet.IamInstanceProfileSpecificationProperty.builder()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnSpotFleet.IamInstanceProfileSpecificationProperty = cdkBuilder.build()
}
