@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCanaryProps {
  public fun artifactConfig(): Any? = unwrap(this).getArtifactConfig()

  public fun artifactS3Location(): String

  public fun code(): Any

  @Deprecated(message = "deprecated in CDK")
  public fun deleteLambdaResourcesOnCanaryDeletion(): Any? =
      unwrap(this).getDeleteLambdaResourcesOnCanaryDeletion()

  public fun executionRoleArn(): String

  public fun failureRetentionPeriod(): Number? = unwrap(this).getFailureRetentionPeriod()

  public fun name(): String

  public fun runConfig(): Any? = unwrap(this).getRunConfig()

  public fun runtimeVersion(): String

  public fun schedule(): Any

  public fun startCanaryAfterCreation(): Any? = unwrap(this).getStartCanaryAfterCreation()

  public fun successRetentionPeriod(): Number? = unwrap(this).getSuccessRetentionPeriod()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun visualReference(): Any? = unwrap(this).getVisualReference()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun artifactConfig(artifactConfig: IResolvable)

    public fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9023fcd521a70bff7f30d89364cec6a1defd5536978a80348e8db6bce0364b34")
    public fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty.Builder.() -> Unit)

    public fun artifactS3Location(artifactS3Location: String)

    public fun code(code: IResolvable)

    public fun code(code: CfnCanary.CodeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01b43f122b7425dd79484e68b6cf4dcfeaaa9f061282a09280c00d54fd757432")
    public fun code(code: CfnCanary.CodeProperty.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable)

    public fun executionRoleArn(executionRoleArn: String)

    public fun failureRetentionPeriod(failureRetentionPeriod: Number)

    public fun name(name: String)

    public fun runConfig(runConfig: IResolvable)

    public fun runConfig(runConfig: CfnCanary.RunConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95f2add22a5f361b1ae40d2f5574cb20e8cebf4216aaf41edc9ad2b55203c439")
    public fun runConfig(runConfig: CfnCanary.RunConfigProperty.Builder.() -> Unit)

    public fun runtimeVersion(runtimeVersion: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnCanary.ScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3482ba41884599df1c8c020dc4ddf53c42bf23df0d9fdc1e4699f128f9922250")
    public fun schedule(schedule: CfnCanary.ScheduleProperty.Builder.() -> Unit)

    public fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean)

    public fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable)

    public fun successRetentionPeriod(successRetentionPeriod: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun visualReference(visualReference: IResolvable)

    public fun visualReference(visualReference: CfnCanary.VisualReferenceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f28d0616e5457fd9b52b67cc85a38dbd57a32be581e7414a43fe10e53ea3a854")
    public
        fun visualReference(visualReference: CfnCanary.VisualReferenceProperty.Builder.() -> Unit)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e60142d3e19dbffd9227f65176beee64498ccf695c8a131c34bfb96824cb0bd4")
    public fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CfnCanaryProps.Builder =
        software.amazon.awscdk.services.synthetics.CfnCanaryProps.builder()

    override fun artifactConfig(artifactConfig: IResolvable) {
      cdkBuilder.artifactConfig(artifactConfig.let(IResolvable::unwrap))
    }

    override fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty) {
      cdkBuilder.artifactConfig(artifactConfig.let(CfnCanary.ArtifactConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9023fcd521a70bff7f30d89364cec6a1defd5536978a80348e8db6bce0364b34")
    override
        fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty.Builder.() -> Unit):
        Unit = artifactConfig(CfnCanary.ArtifactConfigProperty(artifactConfig))

    override fun artifactS3Location(artifactS3Location: String) {
      cdkBuilder.artifactS3Location(artifactS3Location)
    }

    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    override fun code(code: CfnCanary.CodeProperty) {
      cdkBuilder.code(code.let(CfnCanary.CodeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01b43f122b7425dd79484e68b6cf4dcfeaaa9f061282a09280c00d54fd757432")
    override fun code(code: CfnCanary.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnCanary.CodeProperty(code))

    @Deprecated(message = "deprecated in CDK")
    override
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean) {
      cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable) {
      cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion.let(IResolvable::unwrap))
    }

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun failureRetentionPeriod(failureRetentionPeriod: Number) {
      cdkBuilder.failureRetentionPeriod(failureRetentionPeriod)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun runConfig(runConfig: IResolvable) {
      cdkBuilder.runConfig(runConfig.let(IResolvable::unwrap))
    }

    override fun runConfig(runConfig: CfnCanary.RunConfigProperty) {
      cdkBuilder.runConfig(runConfig.let(CfnCanary.RunConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95f2add22a5f361b1ae40d2f5574cb20e8cebf4216aaf41edc9ad2b55203c439")
    override fun runConfig(runConfig: CfnCanary.RunConfigProperty.Builder.() -> Unit): Unit =
        runConfig(CfnCanary.RunConfigProperty(runConfig))

    override fun runtimeVersion(runtimeVersion: String) {
      cdkBuilder.runtimeVersion(runtimeVersion)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnCanary.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCanary.ScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3482ba41884599df1c8c020dc4ddf53c42bf23df0d9fdc1e4699f128f9922250")
    override fun schedule(schedule: CfnCanary.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnCanary.ScheduleProperty(schedule))

    override fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean) {
      cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
    }

    override fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable) {
      cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation.let(IResolvable::unwrap))
    }

    override fun successRetentionPeriod(successRetentionPeriod: Number) {
      cdkBuilder.successRetentionPeriod(successRetentionPeriod)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun visualReference(visualReference: IResolvable) {
      cdkBuilder.visualReference(visualReference.let(IResolvable::unwrap))
    }

    override fun visualReference(visualReference: CfnCanary.VisualReferenceProperty) {
      cdkBuilder.visualReference(visualReference.let(CfnCanary.VisualReferenceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f28d0616e5457fd9b52b67cc85a38dbd57a32be581e7414a43fe10e53ea3a854")
    override
        fun visualReference(visualReference: CfnCanary.VisualReferenceProperty.Builder.() -> Unit):
        Unit = visualReference(CfnCanary.VisualReferenceProperty(visualReference))

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnCanary.VPCConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e60142d3e19dbffd9227f65176beee64498ccf695c8a131c34bfb96824cb0bd4")
    override fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnCanary.VPCConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.synthetics.CfnCanaryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.synthetics.CfnCanaryProps,
  ) : CdkObject(cdkObject), CfnCanaryProps {
    override fun artifactConfig(): Any? = unwrap(this).getArtifactConfig()

    override fun artifactS3Location(): String = unwrap(this).getArtifactS3Location()

    override fun code(): Any = unwrap(this).getCode()

    @Deprecated(message = "deprecated in CDK")
    override fun deleteLambdaResourcesOnCanaryDeletion(): Any? =
        unwrap(this).getDeleteLambdaResourcesOnCanaryDeletion()

    override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

    override fun failureRetentionPeriod(): Number? = unwrap(this).getFailureRetentionPeriod()

    override fun name(): String = unwrap(this).getName()

    override fun runConfig(): Any? = unwrap(this).getRunConfig()

    override fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()

    override fun schedule(): Any = unwrap(this).getSchedule()

    override fun startCanaryAfterCreation(): Any? = unwrap(this).getStartCanaryAfterCreation()

    override fun successRetentionPeriod(): Number? = unwrap(this).getSuccessRetentionPeriod()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun visualReference(): Any? = unwrap(this).getVisualReference()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCanaryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanaryProps):
        CfnCanaryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCanaryProps):
        software.amazon.awscdk.services.synthetics.CfnCanaryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.synthetics.CfnCanaryProps
  }
}
