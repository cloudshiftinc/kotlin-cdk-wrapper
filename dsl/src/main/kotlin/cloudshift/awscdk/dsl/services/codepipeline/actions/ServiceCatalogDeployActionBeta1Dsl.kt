@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class ServiceCatalogDeployActionBeta1Dsl {
  private val cdkBuilder: ServiceCatalogDeployActionBeta1.Builder =
      ServiceCatalogDeployActionBeta1.Builder.create()

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  public fun productVersionDescription(productVersionDescription: String) {
    cdkBuilder.productVersionDescription(productVersionDescription)
  }

  public fun productVersionName(productVersionName: String) {
    cdkBuilder.productVersionName(productVersionName)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  public fun templatePath(templatePath: ArtifactPath) {
    cdkBuilder.templatePath(templatePath)
  }

  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): ServiceCatalogDeployActionBeta1 = cdkBuilder.build()
}
