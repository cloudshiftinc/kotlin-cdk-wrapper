@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

  public open fun parallelismConfiguration(`value`: Any) {
    unwrap(this).setParallelismConfiguration(`value`)
  }

  public open fun pipelineDefinition(): Any = unwrap(this).getPipelineDefinition()

  public open fun pipelineDefinition(`value`: Any) {
    unwrap(this).setPipelineDefinition(`value`)
  }

  public open fun pipelineDescription(): String? = unwrap(this).getPipelineDescription()

  public open fun pipelineDescription(`value`: String) {
    unwrap(this).setPipelineDescription(`value`)
  }

  public open fun pipelineDisplayName(): String? = unwrap(this).getPipelineDisplayName()

  public open fun pipelineDisplayName(`value`: String) {
    unwrap(this).setPipelineDisplayName(`value`)
  }

  public open fun pipelineName(): String = unwrap(this).getPipelineName()

  public open fun pipelineName(`value`: String) {
    unwrap(this).setPipelineName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun parallelismConfiguration(parallelismConfiguration: Any)

    public fun pipelineDefinition(pipelineDefinition: Any)

    public fun pipelineDescription(pipelineDescription: String)

    public fun pipelineDisplayName(pipelineDisplayName: String)

    public fun pipelineName(pipelineName: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnPipeline.Builder =
        software.amazon.awscdk.services.sagemaker.CfnPipeline.Builder.create(scope, id)

    override fun parallelismConfiguration(parallelismConfiguration: Any) {
      cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    override fun pipelineDefinition(pipelineDefinition: Any) {
      cdkBuilder.pipelineDefinition(pipelineDefinition)
    }

    override fun pipelineDescription(pipelineDescription: String) {
      cdkBuilder.pipelineDescription(pipelineDescription)
    }

    override fun pipelineDisplayName(pipelineDisplayName: String) {
      cdkBuilder.pipelineDisplayName(pipelineDisplayName)
    }

    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnPipeline = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnPipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline): CfnPipeline
        = CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline): software.amazon.awscdk.services.sagemaker.CfnPipeline
        = wrapped.cdkObject
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun eTag(): String? = unwrap(this).getETag()

    public fun key(): String

    public fun version(): String? = unwrap(this).getVersion()

    @CdkDslMarker
    public interface Builder {
      public fun bucket(bucket: String)

      public fun eTag(eTag: String)

      public fun key(key: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun eTag(): String? = unwrap(this).getETag()

      override fun key(): String = unwrap(this).getKey()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty
    }
  }

  public interface PipelineDefinitionProperty {
    public fun pipelineDefinitionBody(): String

    public fun pipelineDefinitionS3Location(): Any? = unwrap(this).getPipelineDefinitionS3Location()

    @CdkDslMarker
    public interface Builder {
      public fun pipelineDefinitionBody(pipelineDefinitionBody: String)

      public fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: IResolvable)

      public fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: S3LocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1df0e687c3066c62629cdd1b718c8d4ebdc9be95b8c663f15f623c857c772010")
      public
          fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty.builder()

      override fun pipelineDefinitionBody(pipelineDefinitionBody: String) {
        cdkBuilder.pipelineDefinitionBody(pipelineDefinitionBody)
      }

      override fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: IResolvable) {
        cdkBuilder.pipelineDefinitionS3Location(pipelineDefinitionS3Location.let(IResolvable::unwrap))
      }

      override fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: S3LocationProperty) {
        cdkBuilder.pipelineDefinitionS3Location(pipelineDefinitionS3Location.let(S3LocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1df0e687c3066c62629cdd1b718c8d4ebdc9be95b8c663f15f623c857c772010")
      override
          fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: S3LocationProperty.Builder.() -> Unit):
          Unit = pipelineDefinitionS3Location(S3LocationProperty(pipelineDefinitionS3Location))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty,
    ) : CdkObject(cdkObject), PipelineDefinitionProperty {
      override fun pipelineDefinitionBody(): String = unwrap(this).getPipelineDefinitionBody()

      override fun pipelineDefinitionS3Location(): Any? =
          unwrap(this).getPipelineDefinitionS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipelineDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty):
          PipelineDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipelineDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty
    }
  }

  public interface ParallelismConfigurationProperty {
    public fun maxParallelExecutionSteps(): Number

    @CdkDslMarker
    public interface Builder {
      public fun maxParallelExecutionSteps(maxParallelExecutionSteps: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty.builder()

      override fun maxParallelExecutionSteps(maxParallelExecutionSteps: Number) {
        cdkBuilder.maxParallelExecutionSteps(maxParallelExecutionSteps)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty,
    ) : CdkObject(cdkObject), ParallelismConfigurationProperty {
      override fun maxParallelExecutionSteps(): Number = unwrap(this).getMaxParallelExecutionSteps()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParallelismConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty):
          ParallelismConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParallelismConfigurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty
    }
  }
}
