@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.omics.CfnAnnotationStore

@CdkDslMarker
public class CfnAnnotationStoreReferenceItemPropertyDsl {
  private val cdkBuilder: CfnAnnotationStore.ReferenceItemProperty.Builder =
      CfnAnnotationStore.ReferenceItemProperty.builder()

  public fun referenceArn(referenceArn: String) {
    cdkBuilder.referenceArn(referenceArn)
  }

  public fun build(): CfnAnnotationStore.ReferenceItemProperty = cdkBuilder.build()
}
