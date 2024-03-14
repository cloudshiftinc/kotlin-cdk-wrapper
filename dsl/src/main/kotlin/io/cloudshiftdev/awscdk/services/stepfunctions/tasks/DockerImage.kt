package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetProps
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class DockerImage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DockerImage,
) {
  public open fun bind(arg0: ISageMakerTask): DockerImageConfig =
      unwrap(this).bind(arg0.let(ISageMakerTask::unwrap)).let(DockerImageConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DockerImage,
  ) : DockerImage(cdkObject)

  public companion object {
    public open fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps,
    ): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromAsset(scope.let(Construct::unwrap),
        id, props.let(DockerImageAssetProps::unwrap)).let(DockerImage::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eebac7cfc25e6943cb91fedd0dedf1c8ba2f29664fc592ed7c4d764bb1b13634")
    public open fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps.Builder.() -> Unit,
    ): DockerImage = fromAsset(scope, id, DockerImageAssetProps(props))

    public open fun fromEcrRepository(repository: IRepository): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromEcrRepository(repository.let(IRepository::unwrap)).let(DockerImage::wrap)

    public open fun fromEcrRepository(repository: IRepository, tagOrDigest: String): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromEcrRepository(repository.let(IRepository::unwrap),
        tagOrDigest).let(DockerImage::wrap)

    public open fun fromJsonExpression(expression: String): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromJsonExpression(expression).let(DockerImage::wrap)

    public open fun fromJsonExpression(expression: String, allowAnyEcrImagePull: Boolean):
        DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromJsonExpression(expression,
        allowAnyEcrImagePull).let(DockerImage::wrap)

    public open fun fromRegistry(imageUri: String): DockerImage =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage.fromRegistry(imageUri).let(DockerImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DockerImage):
        DockerImage = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImage):
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImage = (wrapped as
        Wrapper).cdkObject
  }
}
