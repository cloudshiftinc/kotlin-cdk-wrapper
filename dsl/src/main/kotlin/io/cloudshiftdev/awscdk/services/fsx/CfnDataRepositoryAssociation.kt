package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataRepositoryAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun batchImportMetaDataOnCreate(): Any? =
      unwrap(this).getBatchImportMetaDataOnCreate()

  public open fun batchImportMetaDataOnCreate(`value`: Boolean) {
    unwrap(this).setBatchImportMetaDataOnCreate(`value`)
  }

  public open fun batchImportMetaDataOnCreate(`value`: IResolvable) {
    unwrap(this).setBatchImportMetaDataOnCreate(`value`.let(IResolvable::unwrap))
  }

  public open fun dataRepositoryPath(): String = unwrap(this).getDataRepositoryPath()

  public open fun dataRepositoryPath(`value`: String) {
    unwrap(this).setDataRepositoryPath(`value`)
  }

  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
  }

  public open fun fileSystemPath(): String = unwrap(this).getFileSystemPath()

  public open fun fileSystemPath(`value`: String) {
    unwrap(this).setFileSystemPath(`value`)
  }

  public open fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

  public open fun importedFileChunkSize(`value`: Number) {
    unwrap(this).setImportedFileChunkSize(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun s3(): Any? = unwrap(this).getS3()

  public open fun s3(`value`: IResolvable) {
    unwrap(this).setS3(`value`.let(IResolvable::unwrap))
  }

  public open fun s3(`value`: S3Property) {
    unwrap(this).setS3(`value`.let(S3Property::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("434be3d797254fdc2361f6d8152b5729f357e3967f52aff0704464c7797a3784")
  public open fun s3(`value`: S3Property.Builder.() -> Unit): Unit = s3(S3Property(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean)

    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable)

    public fun dataRepositoryPath(dataRepositoryPath: String)

    public fun fileSystemId(fileSystemId: String)

    public fun fileSystemPath(fileSystemPath: String)

    public fun importedFileChunkSize(importedFileChunkSize: Number)

    public fun s3(s3: IResolvable)

    public fun s3(s3: S3Property)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d155d31be96a96ecab728e3679af95e4339d6701004028ec9b5e310c7bafa495")
    public fun s3(s3: S3Property.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.Builder
        = software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.Builder.create(scope, id)

    override fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean) {
      cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
    }

    override fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable) {
      cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate.let(IResolvable::unwrap))
    }

    override fun dataRepositoryPath(dataRepositoryPath: String) {
      cdkBuilder.dataRepositoryPath(dataRepositoryPath)
    }

    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    override fun fileSystemPath(fileSystemPath: String) {
      cdkBuilder.fileSystemPath(fileSystemPath)
    }

    override fun importedFileChunkSize(importedFileChunkSize: Number) {
      cdkBuilder.importedFileChunkSize(importedFileChunkSize)
    }

    override fun s3(s3: IResolvable) {
      cdkBuilder.s3(s3.let(IResolvable::unwrap))
    }

    override fun s3(s3: S3Property) {
      cdkBuilder.s3(s3.let(S3Property::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d155d31be96a96ecab728e3679af95e4339d6701004028ec9b5e310c7bafa495")
    override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataRepositoryAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataRepositoryAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation):
        CfnDataRepositoryAssociation = CfnDataRepositoryAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnDataRepositoryAssociation):
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation = wrapped.cdkObject
  }

  public interface S3Property {
    public fun autoExportPolicy(): Any? = unwrap(this).getAutoExportPolicy()

    public fun autoImportPolicy(): Any? = unwrap(this).getAutoImportPolicy()

    public interface Builder {
      public fun autoExportPolicy(autoExportPolicy: IResolvable)

      public fun autoExportPolicy(autoExportPolicy: AutoExportPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b9826f5d10b18cf60f54bde89d04930731d9424654a56ed546a396e95f7425a")
      public fun autoExportPolicy(autoExportPolicy: AutoExportPolicyProperty.Builder.() -> Unit)

      public fun autoImportPolicy(autoImportPolicy: IResolvable)

      public fun autoImportPolicy(autoImportPolicy: AutoImportPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a4e991b05f37673588ed1ea38a16225162101dc2acdb79159dffcf913a5171f")
      public fun autoImportPolicy(autoImportPolicy: AutoImportPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property.Builder =
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property.builder()

      override fun autoExportPolicy(autoExportPolicy: IResolvable) {
        cdkBuilder.autoExportPolicy(autoExportPolicy.let(IResolvable::unwrap))
      }

      override fun autoExportPolicy(autoExportPolicy: AutoExportPolicyProperty) {
        cdkBuilder.autoExportPolicy(autoExportPolicy.let(AutoExportPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b9826f5d10b18cf60f54bde89d04930731d9424654a56ed546a396e95f7425a")
      override fun autoExportPolicy(autoExportPolicy: AutoExportPolicyProperty.Builder.() -> Unit):
          Unit = autoExportPolicy(AutoExportPolicyProperty(autoExportPolicy))

      override fun autoImportPolicy(autoImportPolicy: IResolvable) {
        cdkBuilder.autoImportPolicy(autoImportPolicy.let(IResolvable::unwrap))
      }

      override fun autoImportPolicy(autoImportPolicy: AutoImportPolicyProperty) {
        cdkBuilder.autoImportPolicy(autoImportPolicy.let(AutoImportPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a4e991b05f37673588ed1ea38a16225162101dc2acdb79159dffcf913a5171f")
      override fun autoImportPolicy(autoImportPolicy: AutoImportPolicyProperty.Builder.() -> Unit):
          Unit = autoImportPolicy(AutoImportPolicyProperty(autoImportPolicy))

      public fun build():
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property,
    ) : S3Property {
      override fun autoExportPolicy(): Any? = unwrap(this).getAutoExportPolicy()

      override fun autoImportPolicy(): Any? = unwrap(this).getAutoImportPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property):
          S3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AutoImportPolicyProperty {
    public fun events(): List<String>

    public interface Builder {
      public fun events(events: List<String>)

      public fun events(vararg events: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty.builder()

      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      override fun events(vararg events: String): Unit = events(events.toList())

      public fun build():
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty,
    ) : AutoImportPolicyProperty {
      override fun events(): List<String> = unwrap(this).getEvents()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoImportPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty):
          AutoImportPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoImportPolicyProperty):
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoExportPolicyProperty {
    public fun events(): List<String>

    public interface Builder {
      public fun events(events: List<String>)

      public fun events(vararg events: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty.builder()

      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      override fun events(vararg events: String): Unit = events(events.toList())

      public fun build():
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty,
    ) : AutoExportPolicyProperty {
      override fun events(): List<String> = unwrap(this).getEvents()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoExportPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty):
          AutoExportPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoExportPolicyProperty):
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
