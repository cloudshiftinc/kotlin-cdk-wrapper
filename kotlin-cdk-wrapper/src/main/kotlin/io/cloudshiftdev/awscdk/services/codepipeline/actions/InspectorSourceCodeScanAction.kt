@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * CodePipeline invoke action that uses AWS InspectorScan for source code.
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
public open class InspectorSourceCodeScanAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction,
) : InspectorScanActionBase(cdkObject) {
  public constructor(props: InspectorSourceCodeScanActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction(props.let(InspectorSourceCodeScanActionProps.Companion::unwrap))
  )

  public constructor(props: InspectorSourceCodeScanActionProps.Builder.() -> Unit) :
      this(InspectorSourceCodeScanActionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction].
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
     * The source code to scan for vulnerabilities.
     *
     * @param input The source code to scan for vulnerabilities. 
     */
    public fun input(input: Artifact)

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
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction.Builder.create()

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
     * The source code to scan for vulnerabilities.
     *
     * @param input The source code to scan for vulnerabilities. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
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
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InspectorSourceCodeScanAction {
      val builderImpl = BuilderImpl()
      return InspectorSourceCodeScanAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction):
        InspectorSourceCodeScanAction = InspectorSourceCodeScanAction(cdkObject)

    internal fun unwrap(wrapped: InspectorSourceCodeScanAction):
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction
  }
}
