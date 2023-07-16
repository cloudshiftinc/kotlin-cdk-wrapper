@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnAssociation

@CdkDslMarker
public class CfnAssociationInstanceAssociationOutputLocationPropertyDsl {
  private val cdkBuilder: CfnAssociation.InstanceAssociationOutputLocationProperty.Builder =
      CfnAssociation.InstanceAssociationOutputLocationProperty.builder()

  public fun s3Location(s3Location: IResolvable) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun s3Location(s3Location: CfnAssociation.S3OutputLocationProperty) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): CfnAssociation.InstanceAssociationOutputLocationProperty = cdkBuilder.build()
}
