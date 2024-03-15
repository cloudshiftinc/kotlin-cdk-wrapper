@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * CodePipeline action to connect to an existing ServiceCatalog product.
 *
 * **Note**: this class is still experimental, and may have breaking changes in the future!
 *
 * Example:
 *
 * ```
 * Artifact cdkBuildOutput = new Artifact();
 * ServiceCatalogDeployActionBeta1 serviceCatalogDeployAction =
 * ServiceCatalogDeployActionBeta1.Builder.create()
 * .actionName("ServiceCatalogDeploy")
 * .templatePath(cdkBuildOutput.atPath("Sample.template.json"))
 * .productVersionName("Version - " + Date.getNow().getToString())
 * .productVersionDescription("This is a version from the pipeline with a new description.")
 * .productId("prod-XXXXXXXX")
 * .build();
 * ```
 */
public open class ServiceCatalogDeployActionBeta1 internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1,
) : Action(cdkObject) {
  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * The identifier of the product in the Service Catalog.
     *
     * This product must already exist.
     *
     * @param productId The identifier of the product in the Service Catalog. 
     */
    public fun productId(productId: String)

    /**
     * The optional description of this version of the Service Catalog product.
     *
     * Default: ''
     *
     * @param productVersionDescription The optional description of this version of the Service
     * Catalog product. 
     */
    public fun productVersionDescription(productVersionDescription: String)

    /**
     * The name of the version of the Service Catalog product to be deployed.
     *
     * @param productVersionName The name of the version of the Service Catalog product to be
     * deployed. 
     */
    public fun productVersionName(productVersionName: String)

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The path to the cloudformation artifact.
     *
     * @param templatePath The path to the cloudformation artifact. 
     */
    public fun templatePath(templatePath: ArtifactPath)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The identifier of the product in the Service Catalog.
     *
     * This product must already exist.
     *
     * @param productId The identifier of the product in the Service Catalog. 
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * The optional description of this version of the Service Catalog product.
     *
     * Default: ''
     *
     * @param productVersionDescription The optional description of this version of the Service
     * Catalog product. 
     */
    override fun productVersionDescription(productVersionDescription: String) {
      cdkBuilder.productVersionDescription(productVersionDescription)
    }

    /**
     * The name of the version of the Service Catalog product to be deployed.
     *
     * @param productVersionName The name of the version of the Service Catalog product to be
     * deployed. 
     */
    override fun productVersionName(productVersionName: String) {
      cdkBuilder.productVersionName(productVersionName)
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The path to the cloudformation artifact.
     *
     * @param templatePath The path to the cloudformation artifact. 
     */
    override fun templatePath(templatePath: ArtifactPath) {
      cdkBuilder.templatePath(templatePath.let(ArtifactPath::unwrap))
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1 =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceCatalogDeployActionBeta1 {
      val builderImpl = BuilderImpl()
      return ServiceCatalogDeployActionBeta1(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1):
        ServiceCatalogDeployActionBeta1 = ServiceCatalogDeployActionBeta1(cdkObject)

    internal fun unwrap(wrapped: ServiceCatalogDeployActionBeta1):
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1 =
        wrapped.cdkObject
  }
}
