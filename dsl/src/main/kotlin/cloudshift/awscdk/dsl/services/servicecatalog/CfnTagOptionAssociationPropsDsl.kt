@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps

@CdkDslMarker
public class CfnTagOptionAssociationPropsDsl {
  private val cdkBuilder: CfnTagOptionAssociationProps.Builder =
      CfnTagOptionAssociationProps.builder()

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun tagOptionId(tagOptionId: String) {
    cdkBuilder.tagOptionId(tagOptionId)
  }

  public fun build(): CfnTagOptionAssociationProps = cdkBuilder.build()
}
