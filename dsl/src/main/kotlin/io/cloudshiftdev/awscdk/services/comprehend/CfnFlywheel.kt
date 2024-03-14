package io.cloudshiftdev.awscdk.services.comprehend

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFlywheel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun activeModelArn(): String? = unwrap(this).getActiveModelArn()

  public open fun activeModelArn(`value`: String) {
    unwrap(this).setActiveModelArn(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun dataAccessRoleArn(): String = unwrap(this).getDataAccessRoleArn()

  public open fun dataAccessRoleArn(`value`: String) {
    unwrap(this).setDataAccessRoleArn(`value`)
  }

  public open fun dataLakeS3Uri(): String = unwrap(this).getDataLakeS3Uri()

  public open fun dataLakeS3Uri(`value`: String) {
    unwrap(this).setDataLakeS3Uri(`value`)
  }

  public open fun dataSecurityConfig(): Any? = unwrap(this).getDataSecurityConfig()

  public open fun dataSecurityConfig(`value`: IResolvable) {
    unwrap(this).setDataSecurityConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSecurityConfig(`value`: DataSecurityConfigProperty) {
    unwrap(this).setDataSecurityConfig(`value`.let(DataSecurityConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60652ba424b85a3c687981540d3f45905b9e0b96d495ae072544b99069c8f270")
  public open fun dataSecurityConfig(`value`: DataSecurityConfigProperty.Builder.() -> Unit): Unit =
      dataSecurityConfig(DataSecurityConfigProperty(`value`))

  public open fun flywheelName(): String = unwrap(this).getFlywheelName()

  public open fun flywheelName(`value`: String) {
    unwrap(this).setFlywheelName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modelType(): String? = unwrap(this).getModelType()

  public open fun modelType(`value`: String) {
    unwrap(this).setModelType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun taskConfig(): Any? = unwrap(this).getTaskConfig()

  public open fun taskConfig(`value`: IResolvable) {
    unwrap(this).setTaskConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun taskConfig(`value`: TaskConfigProperty) {
    unwrap(this).setTaskConfig(`value`.let(TaskConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e575999d6de8e815b6c32561d2bbcd2405ab783115eaf417cee20f32b680078")
  public open fun taskConfig(`value`: TaskConfigProperty.Builder.() -> Unit): Unit =
      taskConfig(TaskConfigProperty(`value`))

  public interface Builder {
    public fun activeModelArn(activeModelArn: String) {
    }

    public fun dataAccessRoleArn(dataAccessRoleArn: String) {
    }

    public fun dataLakeS3Uri(dataLakeS3Uri: String) {
    }

    public fun dataSecurityConfig(dataSecurityConfig: IResolvable) {
    }

    public fun dataSecurityConfig(dataSecurityConfig: DataSecurityConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817e8a9bad11909e847082d3e9f601041c2aedd678201044b663f0719e9ac320")
    public
        fun dataSecurityConfig(dataSecurityConfig: DataSecurityConfigProperty.Builder.() -> Unit) {
    }

    public fun flywheelName(flywheelName: String) {
    }

    public fun modelType(modelType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun taskConfig(taskConfig: IResolvable) {
    }

    public fun taskConfig(taskConfig: TaskConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09eba78f68059042ae50f73fa7f01f04f82c002aaa4e6cd375b73157c78bcd11")
    public fun taskConfig(taskConfig: TaskConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.comprehend.CfnFlywheel.Builder =
        software.amazon.awscdk.services.comprehend.CfnFlywheel.Builder.create(scope, id)

    public override fun activeModelArn(activeModelArn: String) {
      cdkBuilder.activeModelArn(activeModelArn)
    }

    public override fun dataAccessRoleArn(dataAccessRoleArn: String) {
      cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    public override fun dataLakeS3Uri(dataLakeS3Uri: String) {
      cdkBuilder.dataLakeS3Uri(dataLakeS3Uri)
    }

    public override fun dataSecurityConfig(dataSecurityConfig: IResolvable) {
      cdkBuilder.dataSecurityConfig(dataSecurityConfig.let(IResolvable::unwrap))
    }

    public override fun dataSecurityConfig(dataSecurityConfig: DataSecurityConfigProperty) {
      cdkBuilder.dataSecurityConfig(dataSecurityConfig.let(DataSecurityConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817e8a9bad11909e847082d3e9f601041c2aedd678201044b663f0719e9ac320")
    public override
        fun dataSecurityConfig(dataSecurityConfig: DataSecurityConfigProperty.Builder.() -> Unit):
        Unit = dataSecurityConfig(DataSecurityConfigProperty(dataSecurityConfig))

    public override fun flywheelName(flywheelName: String) {
      cdkBuilder.flywheelName(flywheelName)
    }

    public override fun modelType(modelType: String) {
      cdkBuilder.modelType(modelType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun taskConfig(taskConfig: IResolvable) {
      cdkBuilder.taskConfig(taskConfig.let(IResolvable::unwrap))
    }

    public override fun taskConfig(taskConfig: TaskConfigProperty) {
      cdkBuilder.taskConfig(taskConfig.let(TaskConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09eba78f68059042ae50f73fa7f01f04f82c002aaa4e6cd375b73157c78bcd11")
    public override fun taskConfig(taskConfig: TaskConfigProperty.Builder.() -> Unit): Unit =
        taskConfig(TaskConfigProperty(taskConfig))

    public fun build(): software.amazon.awscdk.services.comprehend.CfnFlywheel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlywheel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlywheel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel):
        CfnFlywheel = CfnFlywheel(cdkObject)

    internal fun unwrap(wrapped: CfnFlywheel):
        software.amazon.awscdk.services.comprehend.CfnFlywheel = wrapped.cdkObject
  }

  public interface TaskConfigProperty {
    public fun documentClassificationConfig(): Any? = unwrap(this).getDocumentClassificationConfig()

    public fun entityRecognitionConfig(): Any? = unwrap(this).getEntityRecognitionConfig()

    public fun languageCode(): String

    public interface Builder {
      public fun documentClassificationConfig(documentClassificationConfig: IResolvable) {
      }

      public
          fun documentClassificationConfig(documentClassificationConfig: DocumentClassificationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c03bf1866fb06a9eeca14958a7d8128b8db4e0beac190da74f07d6dbcd06bd6")
      public
          fun documentClassificationConfig(documentClassificationConfig: DocumentClassificationConfigProperty.Builder.() -> Unit) {
      }

      public fun entityRecognitionConfig(entityRecognitionConfig: IResolvable) {
      }

      public fun entityRecognitionConfig(entityRecognitionConfig: EntityRecognitionConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32aff837a53f4deca6be85f3c340a711b900d2b07ea9f545e6ca3bb8527b7538")
      public
          fun entityRecognitionConfig(entityRecognitionConfig: EntityRecognitionConfigProperty.Builder.() -> Unit) {
      }

      public fun languageCode(languageCode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty.Builder =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty.builder()

      public override fun documentClassificationConfig(documentClassificationConfig: IResolvable) {
        cdkBuilder.documentClassificationConfig(documentClassificationConfig.let(IResolvable::unwrap))
      }

      public override
          fun documentClassificationConfig(documentClassificationConfig: DocumentClassificationConfigProperty) {
        cdkBuilder.documentClassificationConfig(documentClassificationConfig.let(DocumentClassificationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c03bf1866fb06a9eeca14958a7d8128b8db4e0beac190da74f07d6dbcd06bd6")
      public override
          fun documentClassificationConfig(documentClassificationConfig: DocumentClassificationConfigProperty.Builder.() -> Unit):
          Unit =
          documentClassificationConfig(DocumentClassificationConfigProperty(documentClassificationConfig))

      public override fun entityRecognitionConfig(entityRecognitionConfig: IResolvable) {
        cdkBuilder.entityRecognitionConfig(entityRecognitionConfig.let(IResolvable::unwrap))
      }

      public override
          fun entityRecognitionConfig(entityRecognitionConfig: EntityRecognitionConfigProperty) {
        cdkBuilder.entityRecognitionConfig(entityRecognitionConfig.let(EntityRecognitionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32aff837a53f4deca6be85f3c340a711b900d2b07ea9f545e6ca3bb8527b7538")
      public override
          fun entityRecognitionConfig(entityRecognitionConfig: EntityRecognitionConfigProperty.Builder.() -> Unit):
          Unit = entityRecognitionConfig(EntityRecognitionConfigProperty(entityRecognitionConfig))

      public override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      public fun build(): software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty,
    ) : TaskConfigProperty {
      public override fun documentClassificationConfig(): Any? =
          unwrap(this).getDocumentClassificationConfig()

      public override fun entityRecognitionConfig(): Any? =
          unwrap(this).getEntityRecognitionConfig()

      public override fun languageCode(): String = unwrap(this).getLanguageCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TaskConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty):
          TaskConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnets(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnets(subnets: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build(): software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty,
    ) : VpcConfigProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DataSecurityConfigProperty {
    public fun dataLakeKmsKeyId(): String? = unwrap(this).getDataLakeKmsKeyId()

    public fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

    public interface Builder {
      public fun dataLakeKmsKeyId(dataLakeKmsKeyId: String) {
      }

      public fun modelKmsKeyId(modelKmsKeyId: String) {
      }

      public fun volumeKmsKeyId(volumeKmsKeyId: String) {
      }

      public fun vpcConfig(vpcConfig: IResolvable) {
      }

      public fun vpcConfig(vpcConfig: VpcConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad6014fdcd8de69b64beb8facb1fb63a7f13a50ee6e082c13819782318101c13")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty.builder()

      public override fun dataLakeKmsKeyId(dataLakeKmsKeyId: String) {
        cdkBuilder.dataLakeKmsKeyId(dataLakeKmsKeyId)
      }

      public override fun modelKmsKeyId(modelKmsKeyId: String) {
        cdkBuilder.modelKmsKeyId(modelKmsKeyId)
      }

      public override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      public override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      public override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad6014fdcd8de69b64beb8facb1fb63a7f13a50ee6e082c13819782318101c13")
      public override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty,
    ) : DataSecurityConfigProperty {
      public override fun dataLakeKmsKeyId(): String? = unwrap(this).getDataLakeKmsKeyId()

      public override fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

      public override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      public override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSecurityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty):
          DataSecurityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSecurityConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EntityRecognitionConfigProperty {
    public fun entityTypes(): Any? = unwrap(this).getEntityTypes()

    public interface Builder {
      public fun entityTypes(entityTypes: IResolvable) {
      }

      public fun entityTypes(entityTypes: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty.builder()

      public override fun entityTypes(entityTypes: IResolvable) {
        cdkBuilder.entityTypes(entityTypes.let(IResolvable::unwrap))
      }

      public override fun entityTypes(entityTypes: List<Any>) {
        cdkBuilder.entityTypes(entityTypes)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty,
    ) : EntityRecognitionConfigProperty {
      public override fun entityTypes(): Any? = unwrap(this).getEntityTypes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EntityRecognitionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty):
          EntityRecognitionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityRecognitionConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EntityTypesListItemProperty {
    public fun type(): String

    public interface Builder {
      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty,
    ) : EntityTypesListItemProperty {
      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EntityTypesListItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty):
          EntityTypesListItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityTypesListItemProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DocumentClassificationConfigProperty {
    public fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    public fun mode(): String

    public interface Builder {
      public fun labels(labels: List<String>) {
      }

      public fun mode(mode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty.builder()

      public override fun labels(labels: List<String>) {
        cdkBuilder.labels(labels)
      }

      public override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty,
    ) : DocumentClassificationConfigProperty {
      public override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

      public override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentClassificationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty):
          DocumentClassificationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentClassificationConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
