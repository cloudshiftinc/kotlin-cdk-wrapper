package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReportGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun deleteReports(): Any? = unwrap(this).getDeleteReports()

  public open fun deleteReports(`value`: Boolean) {
    unwrap(this).setDeleteReports(`value`)
  }

  public open fun deleteReports(`value`: IResolvable) {
    unwrap(this).setDeleteReports(`value`.let(IResolvable::unwrap))
  }

  public open fun exportConfig(): Any = unwrap(this).getExportConfig()

  public open fun exportConfig(`value`: IResolvable) {
    unwrap(this).setExportConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun exportConfig(`value`: ReportExportConfigProperty) {
    unwrap(this).setExportConfig(`value`.let(ReportExportConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("48dc81ef0ab5217e42e049cc5656a0c665d853122980e339160b77c3a7d532fa")
  public open fun exportConfig(`value`: ReportExportConfigProperty.Builder.() -> Unit): Unit =
      exportConfig(ReportExportConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun deleteReports(deleteReports: Boolean)

    public fun deleteReports(deleteReports: IResolvable)

    public fun exportConfig(exportConfig: IResolvable)

    public fun exportConfig(exportConfig: ReportExportConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa6125674745828975a38ffec20be585fad7e9227e52c899bf030b971cac495")
    public fun exportConfig(exportConfig: ReportExportConfigProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnReportGroup.Builder =
        software.amazon.awscdk.services.codebuild.CfnReportGroup.Builder.create(scope, id)

    override fun deleteReports(deleteReports: Boolean) {
      cdkBuilder.deleteReports(deleteReports)
    }

    override fun deleteReports(deleteReports: IResolvable) {
      cdkBuilder.deleteReports(deleteReports.let(IResolvable::unwrap))
    }

    override fun exportConfig(exportConfig: IResolvable) {
      cdkBuilder.exportConfig(exportConfig.let(IResolvable::unwrap))
    }

    override fun exportConfig(exportConfig: ReportExportConfigProperty) {
      cdkBuilder.exportConfig(exportConfig.let(ReportExportConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa6125674745828975a38ffec20be585fad7e9227e52c899bf030b971cac495")
    override fun exportConfig(exportConfig: ReportExportConfigProperty.Builder.() -> Unit): Unit =
        exportConfig(ReportExportConfigProperty(exportConfig))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CfnReportGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReportGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReportGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroup):
        CfnReportGroup = CfnReportGroup(cdkObject)

    internal fun unwrap(wrapped: CfnReportGroup):
        software.amazon.awscdk.services.codebuild.CfnReportGroup = wrapped.cdkObject
  }

  public interface ReportExportConfigProperty {
    public fun exportConfigType(): String

    public fun s3Destination(): Any? = unwrap(this).getS3Destination()

    public interface Builder {
      public fun exportConfigType(exportConfigType: String)

      public fun s3Destination(s3Destination: IResolvable)

      public fun s3Destination(s3Destination: S3ReportExportConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29c4a28a99304714e987aae310598437035e5dbf4ed325d630307bf19085cf04")
      public fun s3Destination(s3Destination: S3ReportExportConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty.builder()

      override fun exportConfigType(exportConfigType: String) {
        cdkBuilder.exportConfigType(exportConfigType)
      }

      override fun s3Destination(s3Destination: IResolvable) {
        cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
      }

      override fun s3Destination(s3Destination: S3ReportExportConfigProperty) {
        cdkBuilder.s3Destination(s3Destination.let(S3ReportExportConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29c4a28a99304714e987aae310598437035e5dbf4ed325d630307bf19085cf04")
      override fun s3Destination(s3Destination: S3ReportExportConfigProperty.Builder.() -> Unit):
          Unit = s3Destination(S3ReportExportConfigProperty(s3Destination))

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty,
    ) : ReportExportConfigProperty {
      override fun exportConfigType(): String = unwrap(this).getExportConfigType()

      override fun s3Destination(): Any? = unwrap(this).getS3Destination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReportExportConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty):
          ReportExportConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReportExportConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ReportExportConfigProperty {
    public fun bucket(): String

    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    public fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

    public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    public fun packaging(): String? = unwrap(this).getPackaging()

    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun bucketOwner(bucketOwner: String)

      public fun encryptionDisabled(encryptionDisabled: Boolean)

      public fun encryptionDisabled(encryptionDisabled: IResolvable)

      public fun encryptionKey(encryptionKey: String)

      public fun packaging(packaging: String)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      override fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
      }

      override fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled.let(IResolvable::unwrap))
      }

      override fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
      }

      override fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty,
    ) : S3ReportExportConfigProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      override fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

      override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

      override fun packaging(): String? = unwrap(this).getPackaging()

      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ReportExportConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty):
          S3ReportExportConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ReportExportConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnReportGroup.S3ReportExportConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
