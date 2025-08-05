@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of the `InspectorSourceCodeScanAction`.
 *
 * Example:
 *
 * ```
 * Pipeline pipeline;
 * Artifact sourceOutput = new Artifact();
 * CodeStarConnectionsSourceAction sourceAction = CodeStarConnectionsSourceAction.Builder.create()
 * .actionName("CodeStarConnectionsSourceAction")
 * .output(sourceOutput)
 * .connectionArn("your-connection-arn")
 * .owner("your-owner")
 * .repo("your-repo")
 * .build();
 * Artifact scanOutput = new Artifact();
 * InspectorSourceCodeScanAction scanAction = InspectorSourceCodeScanAction.Builder.create()
 * .actionName("InspectorSourceCodeScanAction")
 * .input(sourceOutput)
 * .output(scanOutput)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build());
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Scan")
 * .actions(List.of(scanAction))
 * .build());
 * ```
 */
public interface InspectorSourceCodeScanActionProps : InspectorScanActionBaseProps {
  /**
   * The source code to scan for vulnerabilities.
   */
  public fun input(): Artifact

  /**
   * A builder for [InspectorSourceCodeScanActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param criticalThreshold The number of critical severity vulnerabilities found in your source
     * beyond which CodePipeline should fail the action.
     */
    public fun criticalThreshold(criticalThreshold: Number)

    /**
     * @param highThreshold The number of high severity vulnerabilities found in your source beyond
     * which CodePipeline should fail the action.
     */
    public fun highThreshold(highThreshold: Number)

    /**
     * @param input The source code to scan for vulnerabilities. 
     */
    public fun input(input: Artifact)

    /**
     * @param lowThreshold The number of low severity vulnerabilities found in your source beyond
     * which CodePipeline should fail the action.
     */
    public fun lowThreshold(lowThreshold: Number)

    /**
     * @param mediumThreshold The number of medium severity vulnerabilities found in your source
     * beyond which CodePipeline should fail the action.
     */
    public fun mediumThreshold(mediumThreshold: Number)

    /**
     * @param output Vulnerability details of your source in the form of a Software Bill of
     * Materials (SBOM) file. 
     */
    public fun output(output: Artifact)

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
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param criticalThreshold The number of critical severity vulnerabilities found in your source
     * beyond which CodePipeline should fail the action.
     */
    override fun criticalThreshold(criticalThreshold: Number) {
      cdkBuilder.criticalThreshold(criticalThreshold)
    }

    /**
     * @param highThreshold The number of high severity vulnerabilities found in your source beyond
     * which CodePipeline should fail the action.
     */
    override fun highThreshold(highThreshold: Number) {
      cdkBuilder.highThreshold(highThreshold)
    }

    /**
     * @param input The source code to scan for vulnerabilities. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

    /**
     * @param lowThreshold The number of low severity vulnerabilities found in your source beyond
     * which CodePipeline should fail the action.
     */
    override fun lowThreshold(lowThreshold: Number) {
      cdkBuilder.lowThreshold(lowThreshold)
    }

    /**
     * @param mediumThreshold The number of medium severity vulnerabilities found in your source
     * beyond which CodePipeline should fail the action.
     */
    override fun mediumThreshold(mediumThreshold: Number) {
      cdkBuilder.mediumThreshold(mediumThreshold)
    }

    /**
     * @param output Vulnerability details of your source in the form of a Software Bill of
     * Materials (SBOM) file. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
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
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanActionProps,
  ) : CdkObject(cdkObject),
      InspectorSourceCodeScanActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The number of critical severity vulnerabilities found in your source beyond which
     * CodePipeline should fail the action.
     *
     * Default: - no threshold
     */
    override fun criticalThreshold(): Number? = unwrap(this).getCriticalThreshold()

    /**
     * The number of high severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     */
    override fun highThreshold(): Number? = unwrap(this).getHighThreshold()

    /**
     * The source code to scan for vulnerabilities.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * The number of low severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     */
    override fun lowThreshold(): Number? = unwrap(this).getLowThreshold()

    /**
     * The number of medium severity vulnerabilities found in your source beyond which CodePipeline
     * should fail the action.
     *
     * Default: - no threshold
     */
    override fun mediumThreshold(): Number? = unwrap(this).getMediumThreshold()

    /**
     * Vulnerability details of your source in the form of a Software Bill of Materials (SBOM) file.
     */
    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

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
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InspectorSourceCodeScanActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanActionProps):
        InspectorSourceCodeScanActionProps = CdkObjectWrappers.wrap(cdkObject) as?
        InspectorSourceCodeScanActionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InspectorSourceCodeScanActionProps):
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanActionProps
  }
}
