@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1
import software.amazon.awscdk.services.iam.IRole

/**
 * CodePipeline action to connect to an existing ServiceCatalog product.
 *
 * **Note**: this class is still experimental, and may have breaking changes in the future!
 *
 * Example:
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
@CdkDslMarker
public class ServiceCatalogDeployActionBeta1Dsl {
    private val cdkBuilder: ServiceCatalogDeployActionBeta1.Builder =
        ServiceCatalogDeployActionBeta1.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * The identifier of the product in the Service Catalog.
     *
     * This product must already exist.
     *
     * @param productId The identifier of the product in the Service Catalog.
     */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /**
     * The optional description of this version of the Service Catalog product.
     *
     * Default: ''
     *
     * @param productVersionDescription The optional description of this version of the Service
     *   Catalog product.
     */
    public fun productVersionDescription(productVersionDescription: String) {
        cdkBuilder.productVersionDescription(productVersionDescription)
    }

    /**
     * The name of the version of the Service Catalog product to be deployed.
     *
     * @param productVersionName The name of the version of the Service Catalog product to be
     *   deployed.
     */
    public fun productVersionName(productVersionName: String) {
        cdkBuilder.productVersionName(productVersionName)
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role (the required permissions for that will be granted
     * automatically) right before executing this Action. This Action will be passed into your
     * `IAction.bind` method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     *
     * @param runOrder The runOrder property for this Action.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * The path to the cloudformation artifact.
     *
     * @param templatePath The path to the cloudformation artifact.
     */
    public fun templatePath(templatePath: ArtifactPath) {
        cdkBuilder.templatePath(templatePath)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names, if any of the
     * action's variables were referenced - otherwise, no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): ServiceCatalogDeployActionBeta1 = cdkBuilder.build()
}
