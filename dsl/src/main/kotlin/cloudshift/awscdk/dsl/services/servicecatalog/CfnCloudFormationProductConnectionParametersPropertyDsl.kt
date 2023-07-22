@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

@CdkDslMarker
public class CfnCloudFormationProductConnectionParametersPropertyDsl {
  private val cdkBuilder: CfnCloudFormationProduct.ConnectionParametersProperty.Builder =
      CfnCloudFormationProduct.ConnectionParametersProperty.builder()

  /**
   * @param codeStar Provides `ConnectionType` details.
   */
  public fun codeStar(codeStar: IResolvable) {
    cdkBuilder.codeStar(codeStar)
  }

  /**
   * @param codeStar Provides `ConnectionType` details.
   */
  public fun codeStar(codeStar: CfnCloudFormationProduct.CodeStarParametersProperty) {
    cdkBuilder.codeStar(codeStar)
  }

  public fun build(): CfnCloudFormationProduct.ConnectionParametersProperty = cdkBuilder.build()
}
