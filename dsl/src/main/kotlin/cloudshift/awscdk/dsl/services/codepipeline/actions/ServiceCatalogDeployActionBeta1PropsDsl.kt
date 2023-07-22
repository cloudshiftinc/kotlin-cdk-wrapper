@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class ServiceCatalogDeployActionBeta1PropsDsl {
  private val cdkBuilder: ServiceCatalogDeployActionBeta1Props.Builder =
      ServiceCatalogDeployActionBeta1Props.builder()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param productId The identifier of the product in the Service Catalog. 
   * This product must already exist.
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  /**
   * @param productVersionDescription The optional description of this version of the Service
   * Catalog product.
   */
  public fun productVersionDescription(productVersionDescription: String) {
    cdkBuilder.productVersionDescription(productVersionDescription)
  }

  /**
   * @param productVersionName The name of the version of the Service Catalog product to be
   * deployed. 
   */
  public fun productVersionName(productVersionName: String) {
    cdkBuilder.productVersionName(productVersionName)
  }

  /**
   * @param role The Role in which context's this Action will be executing in.
   * The Pipeline's Role will assume this Role
   * (the required permissions for that will be granted automatically)
   * right before executing this Action.
   * This Action will be passed into your `IAction.bind`
   * method in the `ActionBindOptions.role` property.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runOrder The runOrder property for this Action.
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param templatePath The path to the cloudformation artifact. 
   */
  public fun templatePath(templatePath: ArtifactPath) {
    cdkBuilder.templatePath(templatePath)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): ServiceCatalogDeployActionBeta1Props = cdkBuilder.build()
}
