@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetProps
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Creates `IDockerImage` instances.
 *
 * Example:
 *
 * ```
 * SageMakerCreateModel.Builder.create(this, "Sagemaker")
 * .modelName("MyModel")
 * .primaryContainer(ContainerDefinition.Builder.create()
 * .image(DockerImage.fromJsonExpression(JsonPath.stringAt("$.Model.imageName")))
 * .mode(Mode.SINGLE_MODEL)
 * .modelS3Location(S3Location.fromJsonExpression("$.TrainingJob.ModelArtifacts.S3ModelArtifacts"))
 * .build())
 * .build();
 * ```
 */
public abstract class DockerImage(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DockerImage,
) : CdkObject(cdkObject) {
  /**
   * Called when the image is used by a SageMaker task.
   *
   * @param task 
   */
  public open fun bind(task: ISageMakerTask): DockerImageConfig =
      unwrap(this).bind(task.let(ISageMakerTask.Companion::unwrap)).let(DockerImageConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DockerImage,
  ) : DockerImage(cdkObject)

  public companion object {
    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps,
    ): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromAsset(scope.let(Construct.Companion::unwrap),
        id, props.let(DockerImageAssetProps.Companion::unwrap)).let(DockerImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eebac7cfc25e6943cb91fedd0dedf1c8ba2f29664fc592ed7c4d764bb1b13634")
    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps.Builder.() -> Unit,
    ): DockerImage = fromAsset(scope, id, DockerImageAssetProps(props))

    public fun fromEcrRepository(repository: IRepository): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap)).let(DockerImage::wrap)

    public fun fromEcrRepository(repository: IRepository, tagOrDigest: String): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap),
        tagOrDigest).let(DockerImage::wrap)

    public fun fromJsonExpression(expression: String): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromJsonExpression(expression).let(DockerImage::wrap)

    public fun fromJsonExpression(expression: String, allowAnyEcrImagePull: Boolean): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromJsonExpression(expression,
        allowAnyEcrImagePull).let(DockerImage::wrap)

    public fun fromRegistry(imageUri: String): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromRegistry(imageUri).let(DockerImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DockerImage):
        DockerImage = CdkObjectWrappers.wrap(cdkObject) as? DockerImage ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImage):
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.DockerImage
  }
}
