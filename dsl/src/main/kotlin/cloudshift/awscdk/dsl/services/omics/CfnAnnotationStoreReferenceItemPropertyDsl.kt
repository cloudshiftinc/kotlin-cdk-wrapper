@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.omics.CfnAnnotationStore

/**
 * A genome reference.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * ReferenceItemProperty referenceItemProperty = ReferenceItemProperty.builder()
 * .referenceArn("referenceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-referenceitem.html)
 */
@CdkDslMarker
public class CfnAnnotationStoreReferenceItemPropertyDsl {
  private val cdkBuilder: CfnAnnotationStore.ReferenceItemProperty.Builder =
      CfnAnnotationStore.ReferenceItemProperty.builder()

  /**
   * @param referenceArn The reference's ARN. 
   */
  public fun referenceArn(referenceArn: String) {
    cdkBuilder.referenceArn(referenceArn)
  }

  public fun build(): CfnAnnotationStore.ReferenceItemProperty = cdkBuilder.build()
}
