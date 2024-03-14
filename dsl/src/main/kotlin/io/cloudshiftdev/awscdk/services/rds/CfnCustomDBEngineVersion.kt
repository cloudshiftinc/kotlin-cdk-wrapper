package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomDBEngineVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrDbEngineVersionArn(): String = unwrap(this).getAttrDbEngineVersionArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun databaseInstallationFilesS3BucketName(): String =
      unwrap(this).getDatabaseInstallationFilesS3BucketName()

  public open fun databaseInstallationFilesS3BucketName(`value`: String) {
    unwrap(this).setDatabaseInstallationFilesS3BucketName(`value`)
  }

  public open fun databaseInstallationFilesS3Prefix(): String? =
      unwrap(this).getDatabaseInstallationFilesS3Prefix()

  public open fun databaseInstallationFilesS3Prefix(`value`: String) {
    unwrap(this).setDatabaseInstallationFilesS3Prefix(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun engine(): String = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public open fun engineVersion(): String = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun manifest(): String? = unwrap(this).getManifest()

  public open fun manifest(`value`: String) {
    unwrap(this).setManifest(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public
        fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String) {
    }

    public fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String) {
    }

    public fun description(description: String) {
    }

    public fun engine(engine: String) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun manifest(manifest: String) {
    }

    public fun status(status: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion.Builder =
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion.Builder.create(scope, id)

    public override
        fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String) {
      cdkBuilder.databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName)
    }

    public override
        fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String) {
      cdkBuilder.databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun manifest(manifest: String) {
      cdkBuilder.manifest(manifest)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomDBEngineVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomDBEngineVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion):
        CfnCustomDBEngineVersion = CfnCustomDBEngineVersion(cdkObject)

    internal fun unwrap(wrapped: CfnCustomDBEngineVersion):
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion = wrapped.cdkObject
  }
}
