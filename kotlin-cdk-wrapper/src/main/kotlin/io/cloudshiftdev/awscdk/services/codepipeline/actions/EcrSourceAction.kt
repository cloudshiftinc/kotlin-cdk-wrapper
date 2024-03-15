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
 * The ECR Repository source CodePipeline Action.
 *
 * Will trigger the pipeline as soon as the target tag in the repository
 * changes, but only if there is a CloudTrail Trail in the account that
 * captures the ECR event.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * Repository ecrRepository;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Artifact sourceOutput = new Artifact();
 * EcrSourceAction sourceAction = EcrSourceAction.Builder.create()
 * .actionName("ECR")
 * .repository(ecrRepository)
 * .imageTag("some-tag") // optional, default: 'latest'
 * .output(sourceOutput)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build());
 * ```
 */
public open class EcrSourceAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction,
) : Action(cdkObject) {
  /**
   * The variables emitted by this action.
   */
  public open fun variables(): EcrSourceVariables =
      unwrap(this).getVariables().let(EcrSourceVariables::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.EcrSourceAction].
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
     * The image tag that will be checked for changes.
     *
     * It is not possible to trigger on changes to more than one tag.
     *
     * Default: 'latest'
     *
     * @param imageTag The image tag that will be checked for changes. 
     */
    public fun imageTag(imageTag: String)

    /**
     * @param output 
     */
    public fun output(output: Artifact)

    /**
     * The repository that will be watched for changes.
     *
     * @param repository The repository that will be watched for changes. 
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
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction.Builder.create()

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
     * The image tag that will be checked for changes.
     *
     * It is not possible to trigger on changes to more than one tag.
     *
     * Default: 'latest'
     *
     * @param imageTag The image tag that will be checked for changes. 
     */
    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    /**
     * @param output 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    /**
     * The repository that will be watched for changes.
     *
     * @param repository The repository that will be watched for changes. 
     */
    override fun repository(repository: IRepository) {
      cdkBuilder.repository(repository.let(IRepository::unwrap))
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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrSourceAction {
      val builderImpl = BuilderImpl()
      return EcrSourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction):
        EcrSourceAction = EcrSourceAction(cdkObject)

    internal fun unwrap(wrapped: EcrSourceAction):
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction = wrapped.cdkObject
  }
}
