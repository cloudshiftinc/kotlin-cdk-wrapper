@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * CodePipeline invoke action that uses AWS InspectorScan for ECR images.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * Pipeline pipeline;
 * IRepository repository;
 * Artifact scanOutput = new Artifact();
 * InspectorEcrImageScanAction scanAction = InspectorEcrImageScanAction.Builder.create()
 * .actionName("InspectorEcrImageScanAction")
 * .output(scanOutput)
 * .repository(repository)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Scan")
 * .actions(List.of(scanAction))
 * .build());
 * ```
 */
public open class InspectorEcrImageScanAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction,
) : InspectorScanActionBase(cdkObject) {
  public constructor(props: InspectorEcrImageScanActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction(props.let(InspectorEcrImageScanActionProps.Companion::unwrap))
  )

  public constructor(props: InspectorEcrImageScanActionProps.Builder.() -> Unit) :
      this(InspectorEcrImageScanActionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction].
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
     * The number of critical severity vulnerabilities found in your source beyond which
     * CodePipeline should fail the action.
     *
     * Default: - no threshold
     *
     * @param criticalThreshold The number of critical severity vulnerabilities found in your source
     * beyond which CodePipeline should fail the action. 
     */
    public fun criticalThreshold(criticalThreshold: Number)

    /**
     * The number of high severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     *
     * @param highThreshold The number of high severity vulnerabilities found in your source beyond
     * which CodePipeline should fail the action. 
     */
    public fun highThreshold(highThreshold: Number)

    /**
     * The tag used for the image.
     *
     * Default: 'latest'
     *
     * @param imageTag The tag used for the image. 
     */
    public fun imageTag(imageTag: String)

    /**
     * The number of low severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     *
     * @param lowThreshold The number of low severity vulnerabilities found in your source beyond
     * which CodePipeline should fail the action. 
     */
    public fun lowThreshold(lowThreshold: Number)

    /**
     * The number of medium severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     *
     * @param mediumThreshold The number of medium severity vulnerabilities found in your source
     * beyond which CodePipeline should fail the action. 
     */
    public fun mediumThreshold(mediumThreshold: Number)

    /**
     * Vulnerability details of your source in the form of a Software Bill of Materials (SBOM) file.
     *
     * @param output Vulnerability details of your source in the form of a Software Bill of
     * Materials (SBOM) file. 
     */
    public fun output(output: Artifact)

    /**
     * The Amazon ECR repository where the image is pushed.
     *
     * @param repository The Amazon ECR repository where the image is pushed. 
     */
    public fun repository(repository: IRepository)

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
        software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction.Builder.create()

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
     * The number of critical severity vulnerabilities found in your source beyond which
     * CodePipeline should fail the action.
     *
     * Default: - no threshold
     *
     * @param criticalThreshold The number of critical severity vulnerabilities found in your source
     * beyond which CodePipeline should fail the action. 
     */
    override fun criticalThreshold(criticalThreshold: Number) {
      cdkBuilder.criticalThreshold(criticalThreshold)
    }

    /**
     * The number of high severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     *
     * @param highThreshold The number of high severity vulnerabilities found in your source beyond
     * which CodePipeline should fail the action. 
     */
    override fun highThreshold(highThreshold: Number) {
      cdkBuilder.highThreshold(highThreshold)
    }

    /**
     * The tag used for the image.
     *
     * Default: 'latest'
     *
     * @param imageTag The tag used for the image. 
     */
    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    /**
     * The number of low severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     *
     * @param lowThreshold The number of low severity vulnerabilities found in your source beyond
     * which CodePipeline should fail the action. 
     */
    override fun lowThreshold(lowThreshold: Number) {
      cdkBuilder.lowThreshold(lowThreshold)
    }

    /**
     * The number of medium severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     *
     * @param mediumThreshold The number of medium severity vulnerabilities found in your source
     * beyond which CodePipeline should fail the action. 
     */
    override fun mediumThreshold(mediumThreshold: Number) {
      cdkBuilder.mediumThreshold(mediumThreshold)
    }

    /**
     * Vulnerability details of your source in the form of a Software Bill of Materials (SBOM) file.
     *
     * @param output Vulnerability details of your source in the form of a Software Bill of
     * Materials (SBOM) file. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
    }

    /**
     * The Amazon ECR repository where the image is pushed.
     *
     * @param repository The Amazon ECR repository where the image is pushed. 
     */
    override fun repository(repository: IRepository) {
      cdkBuilder.repository(repository.let(IRepository.Companion::unwrap))
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
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
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
        software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InspectorEcrImageScanAction {
      val builderImpl = BuilderImpl()
      return InspectorEcrImageScanAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction):
        InspectorEcrImageScanAction = InspectorEcrImageScanAction(cdkObject)

    internal fun unwrap(wrapped: InspectorEcrImageScanAction):
        software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction
  }
}
