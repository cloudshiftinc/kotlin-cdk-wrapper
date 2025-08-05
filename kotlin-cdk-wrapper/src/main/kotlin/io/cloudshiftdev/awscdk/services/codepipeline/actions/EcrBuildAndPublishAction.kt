@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * CodePipeline build action that uses AWS EcrBuildAndPublish.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * Pipeline pipeline;
 * IRepository repository;
 * Artifact sourceOutput = new Artifact();
 * // your source repository
 * CodeStarConnectionsSourceAction sourceAction = CodeStarConnectionsSourceAction.Builder.create()
 * .actionName("CodeStarConnectionsSourceAction")
 * .output(sourceOutput)
 * .connectionArn("your-connection-arn")
 * .owner("your-owner")
 * .repo("your-repo")
 * .build();
 * EcrBuildAndPublishAction buildAction = EcrBuildAndPublishAction.Builder.create()
 * .actionName("EcrBuildAndPublishAction")
 * .repositoryName(repository.getRepositoryName())
 * .registryType(RegistryType.PRIVATE)
 * .dockerfileDirectoryPath("./my-dir") // The path indicates ./my-dir/Dockerfile in the source
 * repository
 * .imageTags(List.of("my-tag-1", "my-tag-2"))
 * .input(sourceOutput)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build());
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Build")
 * .actions(List.of(buildAction))
 * .build());
 * ```
 */
public open class EcrBuildAndPublishAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction,
) : Action(cdkObject) {
  public constructor(props: EcrBuildAndPublishActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction(props.let(EcrBuildAndPublishActionProps.Companion::unwrap))
  )

  public constructor(props: EcrBuildAndPublishActionProps.Builder.() -> Unit) :
      this(EcrBuildAndPublishActionProps(props)
  )

  /**
   * The variables emitted by this action.
   */
  public open fun variables(): EcrBuildAndPublishVariables =
      unwrap(this).getVariables().let(EcrBuildAndPublishVariables::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction].
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
     * The directory path of Dockerfile used to build the image.
     *
     * Optionally, you can provide an alternate directory path if Dockerfile is not at the root
     * level.
     *
     * Default: - the source repository root level
     *
     * @param dockerfileDirectoryPath The directory path of Dockerfile used to build the image. 
     */
    public fun dockerfileDirectoryPath(dockerfileDirectoryPath: String)

    /**
     * The tags used for the image.
     *
     * Default: - latest
     *
     * @param imageTags The tags used for the image. 
     */
    public fun imageTags(imageTags: List<String>)

    /**
     * The tags used for the image.
     *
     * Default: - latest
     *
     * @param imageTags The tags used for the image. 
     */
    public fun imageTags(vararg imageTags: String)

    /**
     * The artifact produced by the source action that contains the Dockerfile needed to build the
     * image.
     *
     * @param input The artifact produced by the source action that contains the Dockerfile needed
     * to build the image. 
     */
    public fun input(input: Artifact)

    /**
     * Specifies whether the repository is public or private.
     *
     * Default: - RegistryType.PRIVATE
     *
     * @param registryType Specifies whether the repository is public or private. 
     */
    public fun registryType(registryType: RegistryType)

    /**
     * The name of the ECR repository where the image is pushed.
     *
     * @param repositoryName The name of the ECR repository where the image is pushed. 
     */
    public fun repositoryName(repositoryName: String)

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
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction.Builder.create()

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
     * The directory path of Dockerfile used to build the image.
     *
     * Optionally, you can provide an alternate directory path if Dockerfile is not at the root
     * level.
     *
     * Default: - the source repository root level
     *
     * @param dockerfileDirectoryPath The directory path of Dockerfile used to build the image. 
     */
    override fun dockerfileDirectoryPath(dockerfileDirectoryPath: String) {
      cdkBuilder.dockerfileDirectoryPath(dockerfileDirectoryPath)
    }

    /**
     * The tags used for the image.
     *
     * Default: - latest
     *
     * @param imageTags The tags used for the image. 
     */
    override fun imageTags(imageTags: List<String>) {
      cdkBuilder.imageTags(imageTags)
    }

    /**
     * The tags used for the image.
     *
     * Default: - latest
     *
     * @param imageTags The tags used for the image. 
     */
    override fun imageTags(vararg imageTags: String): Unit = imageTags(imageTags.toList())

    /**
     * The artifact produced by the source action that contains the Dockerfile needed to build the
     * image.
     *
     * @param input The artifact produced by the source action that contains the Dockerfile needed
     * to build the image. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

    /**
     * Specifies whether the repository is public or private.
     *
     * Default: - RegistryType.PRIVATE
     *
     * @param registryType Specifies whether the repository is public or private. 
     */
    override fun registryType(registryType: RegistryType) {
      cdkBuilder.registryType(registryType.let(RegistryType.Companion::unwrap))
    }

    /**
     * The name of the ECR repository where the image is pushed.
     *
     * @param repositoryName The name of the ECR repository where the image is pushed. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
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
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrBuildAndPublishAction {
      val builderImpl = BuilderImpl()
      return EcrBuildAndPublishAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction):
        EcrBuildAndPublishAction = EcrBuildAndPublishAction(cdkObject)

    internal fun unwrap(wrapped: EcrBuildAndPublishAction):
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishAction
  }
}
