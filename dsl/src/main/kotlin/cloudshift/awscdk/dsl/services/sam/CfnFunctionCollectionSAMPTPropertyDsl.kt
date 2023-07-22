@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CollectionSAMPTProperty collectionSAMPTProperty = CollectionSAMPTProperty.builder()
 * .collectionId("collectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-collectionsampt.html)
 */
@CdkDslMarker
public class CfnFunctionCollectionSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.CollectionSAMPTProperty.Builder =
      CfnFunction.CollectionSAMPTProperty.builder()

  /**
   * @param collectionId the value to be set. 
   */
  public fun collectionId(collectionId: String) {
    cdkBuilder.collectionId(collectionId)
  }

  public fun build(): CfnFunction.CollectionSAMPTProperty = cdkBuilder.build()
}
