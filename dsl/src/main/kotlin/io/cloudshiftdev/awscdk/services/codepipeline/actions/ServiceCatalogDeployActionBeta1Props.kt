package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ServiceCatalogDeployActionBeta1Props : CommonAwsActionProps {
  /**
   * The identifier of the product in the Service Catalog.
   *
   * This product must already exist.
   */
  public fun productId(): String

  /**
   * The optional description of this version of the Service Catalog product.
   *
   * Default: ''
   */
  public fun productVersionDescription(): String? = unwrap(this).getProductVersionDescription()

  /**
   * The name of the version of the Service Catalog product to be deployed.
   */
  public fun productVersionName(): String

  /**
   * The path to the cloudformation artifact.
   */
  public fun templatePath(): ArtifactPath

  /**
   * A builder for [ServiceCatalogDeployActionBeta1Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param productId The identifier of the product in the Service Catalog. 
     * This product must already exist.
     */
    public fun productId(productId: String)

    /**
     * @param productVersionDescription The optional description of this version of the Service
     * Catalog product.
     */
    public fun productVersionDescription(productVersionDescription: String)

    /**
     * @param productVersionName The name of the version of the Service Catalog product to be
     * deployed. 
     */
    public fun productVersionName(productVersionName: String)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param templatePath The path to the cloudformation artifact. 
     */
    public fun templatePath(templatePath: ArtifactPath)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param productId The identifier of the product in the Service Catalog. 
     * This product must already exist.
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * @param productVersionDescription The optional description of this version of the Service
     * Catalog product.
     */
    override fun productVersionDescription(productVersionDescription: String) {
      cdkBuilder.productVersionDescription(productVersionDescription)
    }

    /**
     * @param productVersionName The name of the version of the Service Catalog product to be
     * deployed. 
     */
    override fun productVersionName(productVersionName: String) {
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
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param templatePath The path to the cloudformation artifact. 
     */
    override fun templatePath(templatePath: ArtifactPath) {
      cdkBuilder.templatePath(templatePath.let(ArtifactPath::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props,
  ) : CdkObject(cdkObject), ServiceCatalogDeployActionBeta1Props {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The identifier of the product in the Service Catalog.
     *
     * This product must already exist.
     */
    override fun productId(): String = unwrap(this).getProductId()

    /**
     * The optional description of this version of the Service Catalog product.
     *
     * Default: ''
     */
    override fun productVersionDescription(): String? = unwrap(this).getProductVersionDescription()

    /**
     * The name of the version of the Service Catalog product to be deployed.
     */
    override fun productVersionName(): String = unwrap(this).getProductVersionName()

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The path to the cloudformation artifact.
     */
    override fun templatePath(): ArtifactPath =
        unwrap(this).getTemplatePath().let(ArtifactPath::wrap)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ServiceCatalogDeployActionBeta1Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props):
        ServiceCatalogDeployActionBeta1Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceCatalogDeployActionBeta1Props):
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props
  }
}
