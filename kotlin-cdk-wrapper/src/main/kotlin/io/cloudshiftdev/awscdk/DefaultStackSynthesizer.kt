@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class DefaultStackSynthesizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.DefaultStackSynthesizer,
) : StackSynthesizer(cdkObject), IReusableStackSynthesizer, IBoundStackSynthesizer {
  public override fun addDockerImageAsset(asset: DockerImageAssetSource): DockerImageAssetLocation =
      unwrap(this).addDockerImageAsset(asset.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
  public override fun addDockerImageAsset(asset: DockerImageAssetSource.Builder.() -> Unit):
      DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(asset))

  public override fun addFileAsset(asset: FileAssetSource): FileAssetLocation =
      unwrap(this).addFileAsset(asset.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public override fun addFileAsset(asset: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
      addFileAsset(FileAssetSource(asset))

  public override fun bind(stack: Stack) {
    unwrap(this).bind(stack.let(Stack::unwrap))
  }

  public override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

  public open fun cloudFormationExecutionRoleArn(): String =
      unwrap(this).getCloudFormationExecutionRoleArn()

  public open fun deployRoleArn(): String = unwrap(this).getDeployRoleArn()

  public override fun lookupRole(): String? = unwrap(this).getLookupRole()

  public override fun reusableBind(stack: Stack): IBoundStackSynthesizer =
      unwrap(this).reusableBind(stack.let(Stack::unwrap)).let(IBoundStackSynthesizer::wrap)

  public override fun synthesize(session: ISynthesisSession) {
    unwrap(this).synthesize(session.let(ISynthesisSession::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    public fun bucketPrefix(bucketPrefix: String)

    public fun cloudFormationExecutionRole(cloudFormationExecutionRole: String)

    public fun deployRoleArn(deployRoleArn: String)

    public fun deployRoleExternalId(deployRoleExternalId: String)

    public fun dockerTagPrefix(dockerTagPrefix: String)

    public fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String)

    public fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String)

    public fun fileAssetsBucketName(fileAssetsBucketName: String)

    public fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean)

    public fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String)

    public fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String)

    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    public fun qualifier(qualifier: String)

    public fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DefaultStackSynthesizer.Builder =
        software.amazon.awscdk.DefaultStackSynthesizer.Builder.create()

    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    override fun cloudFormationExecutionRole(cloudFormationExecutionRole: String) {
      cdkBuilder.cloudFormationExecutionRole(cloudFormationExecutionRole)
    }

    override fun deployRoleArn(deployRoleArn: String) {
      cdkBuilder.deployRoleArn(deployRoleArn)
    }

    override fun deployRoleExternalId(deployRoleExternalId: String) {
      cdkBuilder.deployRoleExternalId(deployRoleExternalId)
    }

    override fun dockerTagPrefix(dockerTagPrefix: String) {
      cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    override fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String) {
      cdkBuilder.fileAssetPublishingExternalId(fileAssetPublishingExternalId)
    }

    override fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String) {
      cdkBuilder.fileAssetPublishingRoleArn(fileAssetPublishingRoleArn)
    }

    override fun fileAssetsBucketName(fileAssetsBucketName: String) {
      cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
    }

    override fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean) {
      cdkBuilder.generateBootstrapVersionRule(generateBootstrapVersionRule)
    }

    override fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String) {
      cdkBuilder.imageAssetPublishingExternalId(imageAssetPublishingExternalId)
    }

    override fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String) {
      cdkBuilder.imageAssetPublishingRoleArn(imageAssetPublishingRoleArn)
    }

    override fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
      cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    override fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean) {
      cdkBuilder.useLookupRoleForStackOperations(useLookupRoleForStackOperations)
    }

    public fun build(): software.amazon.awscdk.DefaultStackSynthesizer = cdkBuilder.build()
  }

  public companion object {
    public val DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER

    public val DEFAULT_CLOUDFORMATION_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_CLOUDFORMATION_ROLE_ARN

    public val DEFAULT_DEPLOY_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_DEPLOY_ROLE_ARN

    public val DEFAULT_DOCKER_ASSET_PREFIX: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_DOCKER_ASSET_PREFIX

    public val DEFAULT_FILE_ASSET_KEY_ARN_EXPORT_NAME: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_FILE_ASSET_KEY_ARN_EXPORT_NAME

    public val DEFAULT_FILE_ASSET_PREFIX: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX

    public val DEFAULT_FILE_ASSET_PUBLISHING_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PUBLISHING_ROLE_ARN

    public val DEFAULT_FILE_ASSETS_BUCKET_NAME: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_FILE_ASSETS_BUCKET_NAME

    public val DEFAULT_IMAGE_ASSET_PUBLISHING_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_IMAGE_ASSET_PUBLISHING_ROLE_ARN

    public val DEFAULT_IMAGE_ASSETS_REPOSITORY_NAME: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_IMAGE_ASSETS_REPOSITORY_NAME

    public val DEFAULT_LOOKUP_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_LOOKUP_ROLE_ARN

    public val DEFAULT_QUALIFIER: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_QUALIFIER

    public operator fun invoke(block: Builder.() -> Unit = {}): DefaultStackSynthesizer {
      val builderImpl = BuilderImpl()
      return DefaultStackSynthesizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DefaultStackSynthesizer):
        DefaultStackSynthesizer = DefaultStackSynthesizer(cdkObject)

    internal fun unwrap(wrapped: DefaultStackSynthesizer):
        software.amazon.awscdk.DefaultStackSynthesizer = wrapped.cdkObject
  }
}
