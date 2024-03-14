package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCanary internal constructor(
  private val cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun artifactConfig(): Any? = unwrap(this).getArtifactConfig()

  public open fun artifactConfig(`value`: IResolvable) {
    unwrap(this).setArtifactConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun artifactConfig(`value`: ArtifactConfigProperty) {
    unwrap(this).setArtifactConfig(`value`.let(ArtifactConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3cb1704f83216a2bfdfbf7cf9496a1793bed3dbae1788e8a7e3f5fd09fa6932")
  public open fun artifactConfig(`value`: ArtifactConfigProperty.Builder.() -> Unit): Unit =
      artifactConfig(ArtifactConfigProperty(`value`))

  public open fun artifactS3Location(): String = unwrap(this).getArtifactS3Location()

  public open fun artifactS3Location(`value`: String) {
    unwrap(this).setArtifactS3Location(`value`)
  }

  public open fun attrCodeSourceLocationArn(): String = unwrap(this).getAttrCodeSourceLocationArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun code(): Any = unwrap(this).getCode()

  public open fun code(`value`: IResolvable) {
    unwrap(this).setCode(`value`.let(IResolvable::unwrap))
  }

  public open fun code(`value`: CodeProperty) {
    unwrap(this).setCode(`value`.let(CodeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4fc5bd083f88ecc4e8524b58bfdd35b15084318d123150fd624c972b2f2b24dc")
  public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(`value`))

  @Deprecated(message = "deprecated in CDK")
  public open fun deleteLambdaResourcesOnCanaryDeletion(): Any? =
      unwrap(this).getDeleteLambdaResourcesOnCanaryDeletion()

  @Deprecated(message = "deprecated in CDK")
  public open fun deleteLambdaResourcesOnCanaryDeletion(`value`: Boolean) {
    unwrap(this).setDeleteLambdaResourcesOnCanaryDeletion(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun deleteLambdaResourcesOnCanaryDeletion(`value`: IResolvable) {
    unwrap(this).setDeleteLambdaResourcesOnCanaryDeletion(`value`.let(IResolvable::unwrap))
  }

  public open fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  public open fun failureRetentionPeriod(): Number? = unwrap(this).getFailureRetentionPeriod()

  public open fun failureRetentionPeriod(`value`: Number) {
    unwrap(this).setFailureRetentionPeriod(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun runConfig(): Any? = unwrap(this).getRunConfig()

  public open fun runConfig(`value`: IResolvable) {
    unwrap(this).setRunConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun runConfig(`value`: RunConfigProperty) {
    unwrap(this).setRunConfig(`value`.let(RunConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb98029d262fc07236f6cc9512e890ef821f4ee256e72cd14c3ea90d56df3429")
  public open fun runConfig(`value`: RunConfigProperty.Builder.() -> Unit): Unit =
      runConfig(RunConfigProperty(`value`))

  public open fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()

  public open fun runtimeVersion(`value`: String) {
    unwrap(this).setRuntimeVersion(`value`)
  }

  public open fun schedule(): Any = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("93aeb981857476ec769a7a2742025af40fef3205942257c7d9ce1c2c6b0c3570")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  public open fun startCanaryAfterCreation(): Any? = unwrap(this).getStartCanaryAfterCreation()

  public open fun startCanaryAfterCreation(`value`: Boolean) {
    unwrap(this).setStartCanaryAfterCreation(`value`)
  }

  public open fun startCanaryAfterCreation(`value`: IResolvable) {
    unwrap(this).setStartCanaryAfterCreation(`value`.let(IResolvable::unwrap))
  }

  public open fun successRetentionPeriod(): Number? = unwrap(this).getSuccessRetentionPeriod()

  public open fun successRetentionPeriod(`value`: Number) {
    unwrap(this).setSuccessRetentionPeriod(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun visualReference(): Any? = unwrap(this).getVisualReference()

  public open fun visualReference(`value`: IResolvable) {
    unwrap(this).setVisualReference(`value`.let(IResolvable::unwrap))
  }

  public open fun visualReference(`value`: VisualReferenceProperty) {
    unwrap(this).setVisualReference(`value`.let(VisualReferenceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97e7c35ac5fac3fde2721d515323f2bf59afca8fb0695744278bdb75b635c8ea")
  public open fun visualReference(`value`: VisualReferenceProperty.Builder.() -> Unit): Unit =
      visualReference(VisualReferenceProperty(`value`))

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VPCConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VPCConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c745b5b442c7930b15a62104ceadf907406274b133cbac468889dd9ce9dde37")
  public open fun vpcConfig(`value`: VPCConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VPCConfigProperty(`value`))

  public interface Builder {
    public fun artifactConfig(artifactConfig: IResolvable) {
    }

    public fun artifactConfig(artifactConfig: ArtifactConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b23f001e2dd8a6cfb00b3131af1425ae09f30fc4cbc4fc44e8f860e9febcc135")
    public fun artifactConfig(artifactConfig: ArtifactConfigProperty.Builder.() -> Unit) {
    }

    public fun artifactS3Location(artifactS3Location: String) {
    }

    public fun code(code: IResolvable) {
    }

    public fun code(code: CodeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c812154cd31e9058f9a59ba258f53c8ba550d96607d8ec454c71346200d4796")
    public fun code(code: CodeProperty.Builder.() -> Unit) {
    }

    @Deprecated(message = "deprecated in CDK")
    public
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean) {
    }

    @Deprecated(message = "deprecated in CDK")
    public
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable) {
    }

    public fun executionRoleArn(executionRoleArn: String) {
    }

    public fun failureRetentionPeriod(failureRetentionPeriod: Number) {
    }

    public fun name(name: String) {
    }

    public fun runConfig(runConfig: IResolvable) {
    }

    public fun runConfig(runConfig: RunConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("593ad653374326f03b8fffc50aebd3f75a0ebf23cee869b1d32c4fbc0ab76399")
    public fun runConfig(runConfig: RunConfigProperty.Builder.() -> Unit) {
    }

    public fun runtimeVersion(runtimeVersion: String) {
    }

    public fun schedule(schedule: IResolvable) {
    }

    public fun schedule(schedule: ScheduleProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fd52bf09f0ec9f283e051ca56ffb048645d905bc4e602bd1a3c9395b5b79ddb")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit) {
    }

    public fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean) {
    }

    public fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable) {
    }

    public fun successRetentionPeriod(successRetentionPeriod: Number) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun visualReference(visualReference: IResolvable) {
    }

    public fun visualReference(visualReference: VisualReferenceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bbb4cbb9894123c40e44079dc0cc74d2f61a18097234b42c75576546fef8718")
    public fun visualReference(visualReference: VisualReferenceProperty.Builder.() -> Unit) {
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
    }

    public fun vpcConfig(vpcConfig: VPCConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42466e6db317ff4a78574c685c398063fd03f17ed16764eba50d382eca61f3d6")
    public fun vpcConfig(vpcConfig: VPCConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CfnCanary.Builder =
        software.amazon.awscdk.services.synthetics.CfnCanary.Builder.create(scope, id)

    public override fun artifactConfig(artifactConfig: IResolvable) {
      cdkBuilder.artifactConfig(artifactConfig.let(IResolvable::unwrap))
    }

    public override fun artifactConfig(artifactConfig: ArtifactConfigProperty) {
      cdkBuilder.artifactConfig(artifactConfig.let(ArtifactConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b23f001e2dd8a6cfb00b3131af1425ae09f30fc4cbc4fc44e8f860e9febcc135")
    public override fun artifactConfig(artifactConfig: ArtifactConfigProperty.Builder.() -> Unit):
        Unit = artifactConfig(ArtifactConfigProperty(artifactConfig))

    public override fun artifactS3Location(artifactS3Location: String) {
      cdkBuilder.artifactS3Location(artifactS3Location)
    }

    public override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    public override fun code(code: CodeProperty) {
      cdkBuilder.code(code.let(CodeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c812154cd31e9058f9a59ba258f53c8ba550d96607d8ec454c71346200d4796")
    public override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

    @Deprecated(message = "deprecated in CDK")
    public override
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean) {
      cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
    }

    @Deprecated(message = "deprecated in CDK")
    public override
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable) {
      cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion.let(IResolvable::unwrap))
    }

    public override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public override fun failureRetentionPeriod(failureRetentionPeriod: Number) {
      cdkBuilder.failureRetentionPeriod(failureRetentionPeriod)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun runConfig(runConfig: IResolvable) {
      cdkBuilder.runConfig(runConfig.let(IResolvable::unwrap))
    }

    public override fun runConfig(runConfig: RunConfigProperty) {
      cdkBuilder.runConfig(runConfig.let(RunConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("593ad653374326f03b8fffc50aebd3f75a0ebf23cee869b1d32c4fbc0ab76399")
    public override fun runConfig(runConfig: RunConfigProperty.Builder.() -> Unit): Unit =
        runConfig(RunConfigProperty(runConfig))

    public override fun runtimeVersion(runtimeVersion: String) {
      cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    public override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fd52bf09f0ec9f283e051ca56ffb048645d905bc4e602bd1a3c9395b5b79ddb")
    public override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    public override fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean) {
      cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
    }

    public override fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable) {
      cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation.let(IResolvable::unwrap))
    }

    public override fun successRetentionPeriod(successRetentionPeriod: Number) {
      cdkBuilder.successRetentionPeriod(successRetentionPeriod)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun visualReference(visualReference: IResolvable) {
      cdkBuilder.visualReference(visualReference.let(IResolvable::unwrap))
    }

    public override fun visualReference(visualReference: VisualReferenceProperty) {
      cdkBuilder.visualReference(visualReference.let(VisualReferenceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bbb4cbb9894123c40e44079dc0cc74d2f61a18097234b42c75576546fef8718")
    public override
        fun visualReference(visualReference: VisualReferenceProperty.Builder.() -> Unit): Unit =
        visualReference(VisualReferenceProperty(visualReference))

    public override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    public override fun vpcConfig(vpcConfig: VPCConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VPCConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42466e6db317ff4a78574c685c398063fd03f17ed16764eba50d382eca61f3d6")
    public override fun vpcConfig(vpcConfig: VPCConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VPCConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCanary {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCanary(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary): CfnCanary =
        CfnCanary(cdkObject)

    internal fun unwrap(wrapped: CfnCanary): software.amazon.awscdk.services.synthetics.CfnCanary =
        wrapped.cdkObject
  }

  public interface ScheduleProperty {
    public fun durationInSeconds(): String? = unwrap(this).getDurationInSeconds()

    public fun expression(): String

    public interface Builder {
      public fun durationInSeconds(durationInSeconds: String) {
      }

      public fun expression(expression: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty.builder()

      public override fun durationInSeconds(durationInSeconds: String) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty,
    ) : ScheduleProperty {
      public override fun durationInSeconds(): String? = unwrap(this).getDurationInSeconds()

      public override fun expression(): String = unwrap(this).getExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3EncryptionProperty {
    public fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public interface Builder {
      public fun encryptionMode(encryptionMode: String) {
      }

      public fun kmsKeyArn(kmsKeyArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty.builder()

      public override fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
      }

      public override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty,
    ) : S3EncryptionProperty {
      public override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

      public override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty):
          S3EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3EncryptionProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VisualReferenceProperty {
    public fun baseCanaryRunId(): String

    public fun baseScreenshots(): Any? = unwrap(this).getBaseScreenshots()

    public interface Builder {
      public fun baseCanaryRunId(baseCanaryRunId: String) {
      }

      public fun baseScreenshots(baseScreenshots: IResolvable) {
      }

      public fun baseScreenshots(baseScreenshots: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty.builder()

      public override fun baseCanaryRunId(baseCanaryRunId: String) {
        cdkBuilder.baseCanaryRunId(baseCanaryRunId)
      }

      public override fun baseScreenshots(baseScreenshots: IResolvable) {
        cdkBuilder.baseScreenshots(baseScreenshots.let(IResolvable::unwrap))
      }

      public override fun baseScreenshots(baseScreenshots: List<Any>) {
        cdkBuilder.baseScreenshots(baseScreenshots)
      }

      public fun build():
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty,
    ) : VisualReferenceProperty {
      public override fun baseCanaryRunId(): String = unwrap(this).getBaseCanaryRunId()

      public override fun baseScreenshots(): Any? = unwrap(this).getBaseScreenshots()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VisualReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty):
          VisualReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VisualReferenceProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BaseScreenshotProperty {
    public fun ignoreCoordinates(): List<String> = unwrap(this).getIgnoreCoordinates() ?:
        emptyList()

    public fun screenshotName(): String

    public interface Builder {
      public fun ignoreCoordinates(ignoreCoordinates: List<String>) {
      }

      public fun screenshotName(screenshotName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty.builder()

      public override fun ignoreCoordinates(ignoreCoordinates: List<String>) {
        cdkBuilder.ignoreCoordinates(ignoreCoordinates)
      }

      public override fun screenshotName(screenshotName: String) {
        cdkBuilder.screenshotName(screenshotName)
      }

      public fun build():
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty,
    ) : BaseScreenshotProperty {
      public override fun ignoreCoordinates(): List<String> = unwrap(this).getIgnoreCoordinates() ?:
          emptyList()

      public override fun screenshotName(): String = unwrap(this).getScreenshotName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BaseScreenshotProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty):
          BaseScreenshotProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaseScreenshotProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RunConfigProperty {
    public fun activeTracing(): Any? = unwrap(this).getActiveTracing()

    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    public fun memoryInMb(): Number? = unwrap(this).getMemoryInMb()

    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    public interface Builder {
      public fun activeTracing(activeTracing: Boolean) {
      }

      public fun activeTracing(activeTracing: IResolvable) {
      }

      public fun environmentVariables(environmentVariables: IResolvable) {
      }

      public fun environmentVariables(environmentVariables: Map<String, String>) {
      }

      public fun memoryInMb(memoryInMb: Number) {
      }

      public fun timeoutInSeconds(timeoutInSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty.builder()

      public override fun activeTracing(activeTracing: Boolean) {
        cdkBuilder.activeTracing(activeTracing)
      }

      public override fun activeTracing(activeTracing: IResolvable) {
        cdkBuilder.activeTracing(activeTracing.let(IResolvable::unwrap))
      }

      public override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
      }

      public override fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
      }

      public override fun memoryInMb(memoryInMb: Number) {
        cdkBuilder.memoryInMb(memoryInMb)
      }

      public override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty,
    ) : RunConfigProperty {
      public override fun activeTracing(): Any? = unwrap(this).getActiveTracing()

      public override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      public override fun memoryInMb(): Number? = unwrap(this).getMemoryInMb()

      public override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RunConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty):
          RunConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunConfigProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ArtifactConfigProperty {
    public fun s3Encryption(): Any? = unwrap(this).getS3Encryption()

    public interface Builder {
      public fun s3Encryption(s3Encryption: IResolvable) {
      }

      public fun s3Encryption(s3Encryption: S3EncryptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c139218594ab3ddb52cd25fe29117d299d2b333cbade9bb9b71aa26d9e27fa73")
      public fun s3Encryption(s3Encryption: S3EncryptionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty.builder()

      public override fun s3Encryption(s3Encryption: IResolvable) {
        cdkBuilder.s3Encryption(s3Encryption.let(IResolvable::unwrap))
      }

      public override fun s3Encryption(s3Encryption: S3EncryptionProperty) {
        cdkBuilder.s3Encryption(s3Encryption.let(S3EncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c139218594ab3ddb52cd25fe29117d299d2b333cbade9bb9b71aa26d9e27fa73")
      public override fun s3Encryption(s3Encryption: S3EncryptionProperty.Builder.() -> Unit): Unit
          = s3Encryption(S3EncryptionProperty(s3Encryption))

      public fun build():
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty,
    ) : ArtifactConfigProperty {
      public override fun s3Encryption(): Any? = unwrap(this).getS3Encryption()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty):
          ArtifactConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactConfigProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VPCConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnetIds(): List<String>

    public fun vpcId(): String? = unwrap(this).getVpcId()

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }

      public fun vpcId(vpcId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty,
    ) : VPCConfigProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      public override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VPCConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty):
          VPCConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VPCConfigProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CodeProperty {
    public fun handler(): String

    public fun s3Bucket(): String? = unwrap(this).getS3Bucket()

    public fun s3Key(): String? = unwrap(this).getS3Key()

    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    public fun script(): String? = unwrap(this).getScript()

    public fun sourceLocationArn(): String? = unwrap(this).getSourceLocationArn()

    public interface Builder {
      public fun handler(handler: String) {
      }

      public fun s3Bucket(s3Bucket: String) {
      }

      public fun s3Key(s3Key: String) {
      }

      public fun s3ObjectVersion(s3ObjectVersion: String) {
      }

      public fun script(script: String) {
      }

      public fun sourceLocationArn(sourceLocationArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty.builder()

      public override fun handler(handler: String) {
        cdkBuilder.handler(handler)
      }

      public override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      public override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public override fun script(script: String) {
        cdkBuilder.script(script)
      }

      public override fun sourceLocationArn(sourceLocationArn: String) {
        cdkBuilder.sourceLocationArn(sourceLocationArn)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty,
    ) : CodeProperty {
      public override fun handler(): String = unwrap(this).getHandler()

      public override fun s3Bucket(): String? = unwrap(this).getS3Bucket()

      public override fun s3Key(): String? = unwrap(this).getS3Key()

      public override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

      public override fun script(): String? = unwrap(this).getScript()

      public override fun sourceLocationArn(): String? = unwrap(this).getSourceLocationArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty):
          CodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
