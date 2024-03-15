@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetProps
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class LinuxBuildImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.LinuxBuildImage,
) : CdkObject(cdkObject), IBuildImage {
  public override fun defaultComputeType(): ComputeType =
      unwrap(this).getDefaultComputeType().let(ComputeType::wrap)

  public override fun imageId(): String = unwrap(this).getImageId()

  public override fun imagePullPrincipalType(): ImagePullPrincipalType? =
      unwrap(this).getImagePullPrincipalType()?.let(ImagePullPrincipalType::wrap)

  public override fun repository(): IRepository? =
      unwrap(this).getRepository()?.let(IRepository::wrap)

  public override fun runScriptBuildspec(entrypoint: String): BuildSpec =
      unwrap(this).runScriptBuildspec(entrypoint).let(BuildSpec::wrap)

  public override fun secretsManagerCredentials(): ISecret? =
      unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)

  public override fun type(): String = unwrap(this).getType()

  public override fun validate(env: BuildEnvironment): List<String> =
      unwrap(this).validate(env.let(BuildEnvironment::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
  public override fun validate(env: BuildEnvironment.Builder.() -> Unit): List<String> =
      validate(BuildEnvironment(env))

  public companion object {
    public val AMAZON_LINUX_2: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2)

    public val AMAZON_LINUX_2_2: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_2)

    public val AMAZON_LINUX_2_3: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_3)

    public val AMAZON_LINUX_2_4: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_4)

    public val AMAZON_LINUX_2_5: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_5)

    public val AMAZON_LINUX_2_ARM: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_ARM)

    public val AMAZON_LINUX_2_ARM_2: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_ARM_2)

    public val AMAZON_LINUX_2_ARM_3: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_ARM_3)

    public val STANDARD_1_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_1_0)

    public val STANDARD_2_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_2_0)

    public val STANDARD_3_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_3_0)

    public val STANDARD_4_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_4_0)

    public val STANDARD_5_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_5_0)

    public val STANDARD_6_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_6_0)

    public val STANDARD_7_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_7_0)

    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps,
    ): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromAsset(scope.let(Construct::unwrap),
        id, props.let(DockerImageAssetProps::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66f4338ab15382a1d0a2efb8183796cd48bca3922530d07a2c878008262c08ef")
    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps.Builder.() -> Unit,
    ): IBuildImage = fromAsset(scope, id, DockerImageAssetProps(props))

    public fun fromCodeBuildImageId(id: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromCodeBuildImageId(id).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromDockerRegistry(name).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String, options: DockerImageOptions): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromDockerRegistry(name,
        options.let(DockerImageOptions::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9dfa00b9fda484ff06b60ab8b92ae7805fa8054bf1b7155a5e6cb7e59c4680f")
    public fun fromDockerRegistry(name: String, options: DockerImageOptions.Builder.() -> Unit):
        IBuildImage = fromDockerRegistry(name, DockerImageOptions(options))

    public fun fromEcrRepository(repository: IRepository): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromEcrRepository(repository.let(IRepository::unwrap)).let(IBuildImage::wrap)

    public fun fromEcrRepository(repository: IRepository, tagOrDigest: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromEcrRepository(repository.let(IRepository::unwrap),
        tagOrDigest).let(IBuildImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.LinuxBuildImage):
        LinuxBuildImage = LinuxBuildImage(cdkObject)

    internal fun unwrap(wrapped: LinuxBuildImage):
        software.amazon.awscdk.services.codebuild.LinuxBuildImage = wrapped.cdkObject
  }
}
