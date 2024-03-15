@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface DefaultStackSynthesizerProps {
  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  public fun cloudFormationExecutionRole(): String? = unwrap(this).getCloudFormationExecutionRole()

  public fun deployRoleArn(): String? = unwrap(this).getDeployRoleArn()

  public fun deployRoleExternalId(): String? = unwrap(this).getDeployRoleExternalId()

  public fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

  public fun fileAssetPublishingExternalId(): String? =
      unwrap(this).getFileAssetPublishingExternalId()

  public fun fileAssetPublishingRoleArn(): String? = unwrap(this).getFileAssetPublishingRoleArn()

  public fun fileAssetsBucketName(): String? = unwrap(this).getFileAssetsBucketName()

  public fun generateBootstrapVersionRule(): Boolean? =
      unwrap(this).getGenerateBootstrapVersionRule()

  public fun imageAssetPublishingExternalId(): String? =
      unwrap(this).getImageAssetPublishingExternalId()

  public fun imageAssetPublishingRoleArn(): String? = unwrap(this).getImageAssetPublishingRoleArn()

  public fun imageAssetsRepositoryName(): String? = unwrap(this).getImageAssetsRepositoryName()

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

  public fun qualifier(): String? = unwrap(this).getQualifier()

  public fun useLookupRoleForStackOperations(): Boolean? =
      unwrap(this).getUseLookupRoleForStackOperations()

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
    private val cdkBuilder: software.amazon.awscdk.DefaultStackSynthesizerProps.Builder =
        software.amazon.awscdk.DefaultStackSynthesizerProps.builder()

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

    public fun build(): software.amazon.awscdk.DefaultStackSynthesizerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.DefaultStackSynthesizerProps,
  ) : CdkObject(cdkObject), DefaultStackSynthesizerProps {
    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    override fun cloudFormationExecutionRole(): String? =
        unwrap(this).getCloudFormationExecutionRole()

    override fun deployRoleArn(): String? = unwrap(this).getDeployRoleArn()

    override fun deployRoleExternalId(): String? = unwrap(this).getDeployRoleExternalId()

    override fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

    override fun fileAssetPublishingExternalId(): String? =
        unwrap(this).getFileAssetPublishingExternalId()

    override fun fileAssetPublishingRoleArn(): String? =
        unwrap(this).getFileAssetPublishingRoleArn()

    override fun fileAssetsBucketName(): String? = unwrap(this).getFileAssetsBucketName()

    override fun generateBootstrapVersionRule(): Boolean? =
        unwrap(this).getGenerateBootstrapVersionRule()

    override fun imageAssetPublishingExternalId(): String? =
        unwrap(this).getImageAssetPublishingExternalId()

    override fun imageAssetPublishingRoleArn(): String? =
        unwrap(this).getImageAssetPublishingRoleArn()

    override fun imageAssetsRepositoryName(): String? = unwrap(this).getImageAssetsRepositoryName()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

    override fun qualifier(): String? = unwrap(this).getQualifier()

    override fun useLookupRoleForStackOperations(): Boolean? =
        unwrap(this).getUseLookupRoleForStackOperations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DefaultStackSynthesizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DefaultStackSynthesizerProps):
        DefaultStackSynthesizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DefaultStackSynthesizerProps):
        software.amazon.awscdk.DefaultStackSynthesizerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.DefaultStackSynthesizerProps
  }
}
