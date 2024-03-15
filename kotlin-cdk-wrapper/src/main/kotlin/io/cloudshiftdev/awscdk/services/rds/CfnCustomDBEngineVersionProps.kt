@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCustomDBEngineVersionProps {
  public fun databaseInstallationFilesS3BucketName(): String

  public fun databaseInstallationFilesS3Prefix(): String? =
      unwrap(this).getDatabaseInstallationFilesS3Prefix()

  public fun description(): String? = unwrap(this).getDescription()

  public fun engine(): String

  public fun engineVersion(): String

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun manifest(): String? = unwrap(this).getManifest()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String)

    public fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String)

    public fun description(description: String)

    public fun engine(engine: String)

    public fun engineVersion(engineVersion: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun manifest(manifest: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps.Builder =
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps.builder()

    override
        fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String) {
      cdkBuilder.databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName)
    }

    override fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String) {
      cdkBuilder.databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun manifest(manifest: String) {
      cdkBuilder.manifest(manifest)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps,
  ) : CdkObject(cdkObject), CfnCustomDBEngineVersionProps {
    override fun databaseInstallationFilesS3BucketName(): String =
        unwrap(this).getDatabaseInstallationFilesS3BucketName()

    override fun databaseInstallationFilesS3Prefix(): String? =
        unwrap(this).getDatabaseInstallationFilesS3Prefix()

    override fun description(): String? = unwrap(this).getDescription()

    override fun engine(): String = unwrap(this).getEngine()

    override fun engineVersion(): String = unwrap(this).getEngineVersion()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun manifest(): String? = unwrap(this).getManifest()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomDBEngineVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps):
        CfnCustomDBEngineVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomDBEngineVersionProps):
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps
  }
}
