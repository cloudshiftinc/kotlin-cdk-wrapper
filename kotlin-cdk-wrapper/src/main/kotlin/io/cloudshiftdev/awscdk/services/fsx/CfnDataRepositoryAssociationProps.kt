@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDataRepositoryAssociationProps {
  public fun batchImportMetaDataOnCreate(): Any? = unwrap(this).getBatchImportMetaDataOnCreate()

  public fun dataRepositoryPath(): String

  public fun fileSystemId(): String

  public fun fileSystemPath(): String

  public fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

  public fun s3(): Any? = unwrap(this).getS3()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean)

    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable)

    public fun dataRepositoryPath(dataRepositoryPath: String)

    public fun fileSystemId(fileSystemId: String)

    public fun fileSystemPath(fileSystemPath: String)

    public fun importedFileChunkSize(importedFileChunkSize: Number)

    public fun s3(s3: IResolvable)

    public fun s3(s3: CfnDataRepositoryAssociation.S3Property)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5b393c430c9d88d7df5b4cae373fdab299b4e13a8ab124dda7feefcaf8a6884")
    public fun s3(s3: CfnDataRepositoryAssociation.S3Property.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps.Builder =
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps.builder()

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

    override fun s3(s3: CfnDataRepositoryAssociation.S3Property) {
      cdkBuilder.s3(s3.let(CfnDataRepositoryAssociation.S3Property::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5b393c430c9d88d7df5b4cae373fdab299b4e13a8ab124dda7feefcaf8a6884")
    override fun s3(s3: CfnDataRepositoryAssociation.S3Property.Builder.() -> Unit): Unit =
        s3(CfnDataRepositoryAssociation.S3Property(s3))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps,
  ) : CdkObject(cdkObject), CfnDataRepositoryAssociationProps {
    override fun batchImportMetaDataOnCreate(): Any? = unwrap(this).getBatchImportMetaDataOnCreate()

    override fun dataRepositoryPath(): String = unwrap(this).getDataRepositoryPath()

    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    override fun fileSystemPath(): String = unwrap(this).getFileSystemPath()

    override fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

    override fun s3(): Any? = unwrap(this).getS3()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataRepositoryAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps):
        CfnDataRepositoryAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataRepositoryAssociationProps):
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps
  }
}
