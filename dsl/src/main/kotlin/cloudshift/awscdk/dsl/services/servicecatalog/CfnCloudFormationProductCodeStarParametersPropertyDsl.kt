@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

@CdkDslMarker
public class CfnCloudFormationProductCodeStarParametersPropertyDsl {
  private val cdkBuilder: CfnCloudFormationProduct.CodeStarParametersProperty.Builder =
      CfnCloudFormationProduct.CodeStarParametersProperty.builder()

  public fun artifactPath(artifactPath: String) {
    cdkBuilder.artifactPath(artifactPath)
  }

  public fun branch(branch: String) {
    cdkBuilder.branch(branch)
  }

  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  public fun build(): CfnCloudFormationProduct.CodeStarParametersProperty = cdkBuilder.build()
}
