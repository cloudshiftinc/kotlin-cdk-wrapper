@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor

@CdkDslMarker
public class CfnTrustAnchorSourcePropertyDsl {
  private val cdkBuilder: CfnTrustAnchor.SourceProperty.Builder =
      CfnTrustAnchor.SourceProperty.builder()

  /**
   * @param sourceData The data field of the trust anchor depending on its type.
   */
  public fun sourceData(sourceData: IResolvable) {
    cdkBuilder.sourceData(sourceData)
  }

  /**
   * @param sourceData The data field of the trust anchor depending on its type.
   */
  public fun sourceData(sourceData: CfnTrustAnchor.SourceDataProperty) {
    cdkBuilder.sourceData(sourceData)
  }

  /**
   * @param sourceType The type of the TrustAnchor.
   *
   * `AWS_ACM_PCA` is not an allowed value in your region.
   */
  public fun sourceType(sourceType: String) {
    cdkBuilder.sourceType(sourceType)
  }

  public fun build(): CfnTrustAnchor.SourceProperty = cdkBuilder.build()
}
