package io.cloudshiftdev.awscdk.services.batch

import kotlin.String
import kotlin.Unit

public interface SecretVersionInfo {
  public fun versionId(): String? = unwrap(this).getVersionId()

  public fun versionStage(): String? = unwrap(this).getVersionStage()

  public interface Builder {
    public fun versionId(versionId: String)

    public fun versionStage(versionStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.SecretVersionInfo.Builder =
        software.amazon.awscdk.services.batch.SecretVersionInfo.builder()

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    override fun versionStage(versionStage: String) {
      cdkBuilder.versionStage(versionStage)
    }

    public fun build(): software.amazon.awscdk.services.batch.SecretVersionInfo = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.SecretVersionInfo,
  ) : SecretVersionInfo {
    override fun versionId(): String? = unwrap(this).getVersionId()

    override fun versionStage(): String? = unwrap(this).getVersionStage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecretVersionInfo {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.SecretVersionInfo):
        SecretVersionInfo = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretVersionInfo):
        software.amazon.awscdk.services.batch.SecretVersionInfo = (wrapped as Wrapper).cdkObject
  }
}
