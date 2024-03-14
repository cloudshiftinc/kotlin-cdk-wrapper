package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.services.ecr.IRepository
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TarballImageAsset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAsset,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun assetHash(): String = unwrap(this).getAssetHash()

  public open fun imageTag(): String = unwrap(this).getImageTag()

  public open fun imageUri(): String = unwrap(this).getImageUri()

  public open fun imageUri(`value`: String) {
    unwrap(this).setImageUri(`value`)
  }

  public open fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)

  public open fun repository(`value`: IRepository) {
    unwrap(this).setRepository(`value`.let(IRepository::unwrap))
  }

  public interface Builder {
    public fun tarballFile(tarballFile: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.TarballImageAsset.Builder =
        software.amazon.awscdk.services.ecr.assets.TarballImageAsset.Builder.create(scope, id)

    override fun tarballFile(tarballFile: String) {
      cdkBuilder.tarballFile(tarballFile)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.TarballImageAsset =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TarballImageAsset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TarballImageAsset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAsset):
        TarballImageAsset = TarballImageAsset(cdkObject)

    internal fun unwrap(wrapped: TarballImageAsset):
        software.amazon.awscdk.services.ecr.assets.TarballImageAsset = wrapped.cdkObject
  }
}
