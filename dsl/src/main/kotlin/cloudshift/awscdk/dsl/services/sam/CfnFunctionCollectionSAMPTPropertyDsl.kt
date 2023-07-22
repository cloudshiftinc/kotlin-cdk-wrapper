@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

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
