@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

@CdkDslMarker
public class CfnCloudFormationProductCodeStarParametersPropertyDsl {
  private val cdkBuilder: CfnCloudFormationProduct.CodeStarParametersProperty.Builder =
      CfnCloudFormationProduct.CodeStarParametersProperty.builder()

  /**
   * @param artifactPath The absolute path wehre the artifact resides within the repo and branch,
   * formatted as "folder/file.json.". 
   */
  public fun artifactPath(artifactPath: String) {
    cdkBuilder.artifactPath(artifactPath)
  }

  /**
   * @param branch The specific branch where the artifact resides. 
   */
  public fun branch(branch: String) {
    cdkBuilder.branch(branch)
  }

  /**
   * @param connectionArn The CodeStar ARN, which is the connection between AWS Service Catalog and
   * the external repository. 
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * @param repository The specific repository where the product’s artifact-to-be-synced resides,
   * formatted as "Account/Repo.". 
   */
  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  public fun build(): CfnCloudFormationProduct.CodeStarParametersProperty = cdkBuilder.build()
}
