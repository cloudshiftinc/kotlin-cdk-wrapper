@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Code property for the DockerImageFunction construct.
 *
 * Example:
 *
 * ```
 * DockerImageFunction.Builder.create(this, "AssetFunction")
 * .code(DockerImageCode.fromImageAsset(join(__dirname, "docker-handler")))
 * .build();
 * ```
 */
public abstract class DockerImageCode(
  cdkObject: software.amazon.awscdk.services.lambda.DockerImageCode,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.DockerImageCode,
  ) : DockerImageCode(cdkObject)

  public companion object {
    public fun fromEcr(repository: IRepository): DockerImageCode =
        software.amazon.awscdk.services.lambda.DockerImageCode.fromEcr(repository.let(IRepository::unwrap)).let(DockerImageCode::wrap)

    public fun fromEcr(repository: IRepository, props: EcrImageCodeProps): DockerImageCode =
        software.amazon.awscdk.services.lambda.DockerImageCode.fromEcr(repository.let(IRepository::unwrap),
        props.let(EcrImageCodeProps::unwrap)).let(DockerImageCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a068e59d0ef7e88c3a454c3b30641e7c445a629e3f5358d04033959b44107e55")
    public fun fromEcr(repository: IRepository, props: EcrImageCodeProps.Builder.() -> Unit):
        DockerImageCode = fromEcr(repository, EcrImageCodeProps(props))

    public fun fromImageAsset(directory: String): DockerImageCode =
        software.amazon.awscdk.services.lambda.DockerImageCode.fromImageAsset(directory).let(DockerImageCode::wrap)

    public fun fromImageAsset(directory: String, props: AssetImageCodeProps): DockerImageCode =
        software.amazon.awscdk.services.lambda.DockerImageCode.fromImageAsset(directory,
        props.let(AssetImageCodeProps::unwrap)).let(DockerImageCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67c92a6cf6fedc397b1923c153f0cd368aa267b7db106768981b7d93178e52bc")
    public fun fromImageAsset(directory: String, props: AssetImageCodeProps.Builder.() -> Unit):
        DockerImageCode = fromImageAsset(directory, AssetImageCodeProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DockerImageCode):
        DockerImageCode = CdkObjectWrappers.wrap(cdkObject) as? DockerImageCode ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageCode):
        software.amazon.awscdk.services.lambda.DockerImageCode = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.DockerImageCode
  }
}
