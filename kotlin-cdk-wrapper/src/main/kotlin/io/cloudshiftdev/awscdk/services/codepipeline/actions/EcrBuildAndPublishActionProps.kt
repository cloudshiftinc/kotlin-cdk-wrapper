@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties of the `EcrBuildAndPublishAction`.
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
public interface EcrBuildAndPublishActionProps : CommonAwsActionProps {
  /**
   * The directory path of Dockerfile used to build the image.
   *
   * Optionally, you can provide an alternate directory path if Dockerfile is not at the root level.
   *
   * Default: - the source repository root level
   */
  public fun dockerfileDirectoryPath(): String? = unwrap(this).getDockerfileDirectoryPath()

  /**
   * The tags used for the image.
   *
   * Default: - latest
   */
  public fun imageTags(): List<String> = unwrap(this).getImageTags() ?: emptyList()

  /**
   * The artifact produced by the source action that contains the Dockerfile needed to build the
   * image.
   */
  public fun input(): Artifact

  /**
   * Specifies whether the repository is public or private.
   *
   * Default: - RegistryType.PRIVATE
   */
  public fun registryType(): RegistryType? = unwrap(this).getRegistryType()?.let(RegistryType::wrap)

  /**
   * The name of the ECR repository where the image is pushed.
   */
  public fun repositoryName(): String

  /**
   * A builder for [EcrBuildAndPublishActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param dockerfileDirectoryPath The directory path of Dockerfile used to build the image.
     * Optionally, you can provide an alternate directory path if Dockerfile is not at the root
     * level.
     */
    public fun dockerfileDirectoryPath(dockerfileDirectoryPath: String)

    /**
     * @param imageTags The tags used for the image.
     */
    public fun imageTags(imageTags: List<String>)

    /**
     * @param imageTags The tags used for the image.
     */
    public fun imageTags(vararg imageTags: String)

    /**
     * @param input The artifact produced by the source action that contains the Dockerfile needed
     * to build the image. 
     */
    public fun input(input: Artifact)

    /**
     * @param registryType Specifies whether the repository is public or private.
     */
    public fun registryType(registryType: RegistryType)

    /**
     * @param repositoryName The name of the ECR repository where the image is pushed. 
     */
    public fun repositoryName(repositoryName: String)

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
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param dockerfileDirectoryPath The directory path of Dockerfile used to build the image.
     * Optionally, you can provide an alternate directory path if Dockerfile is not at the root
     * level.
     */
    override fun dockerfileDirectoryPath(dockerfileDirectoryPath: String) {
      cdkBuilder.dockerfileDirectoryPath(dockerfileDirectoryPath)
    }

    /**
     * @param imageTags The tags used for the image.
     */
    override fun imageTags(imageTags: List<String>) {
      cdkBuilder.imageTags(imageTags)
    }

    /**
     * @param imageTags The tags used for the image.
     */
    override fun imageTags(vararg imageTags: String): Unit = imageTags(imageTags.toList())

    /**
     * @param input The artifact produced by the source action that contains the Dockerfile needed
     * to build the image. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

    /**
     * @param registryType Specifies whether the repository is public or private.
     */
    override fun registryType(registryType: RegistryType) {
      cdkBuilder.registryType(registryType.let(RegistryType.Companion::unwrap))
    }

    /**
     * @param repositoryName The name of the ECR repository where the image is pushed. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
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
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishActionProps,
  ) : CdkObject(cdkObject),
      EcrBuildAndPublishActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The directory path of Dockerfile used to build the image.
     *
     * Optionally, you can provide an alternate directory path if Dockerfile is not at the root
     * level.
     *
     * Default: - the source repository root level
     */
    override fun dockerfileDirectoryPath(): String? = unwrap(this).getDockerfileDirectoryPath()

    /**
     * The tags used for the image.
     *
     * Default: - latest
     */
    override fun imageTags(): List<String> = unwrap(this).getImageTags() ?: emptyList()

    /**
     * The artifact produced by the source action that contains the Dockerfile needed to build the
     * image.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * Specifies whether the repository is public or private.
     *
     * Default: - RegistryType.PRIVATE
     */
    override fun registryType(): RegistryType? =
        unwrap(this).getRegistryType()?.let(RegistryType::wrap)

    /**
     * The name of the ECR repository where the image is pushed.
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrBuildAndPublishActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishActionProps):
        EcrBuildAndPublishActionProps = CdkObjectWrappers.wrap(cdkObject) as?
        EcrBuildAndPublishActionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcrBuildAndPublishActionProps):
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishActionProps
  }
}
