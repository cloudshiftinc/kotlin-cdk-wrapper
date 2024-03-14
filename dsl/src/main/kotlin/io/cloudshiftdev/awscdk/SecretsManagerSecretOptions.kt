package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface SecretsManagerSecretOptions {
  public fun jsonField(): String? = unwrap(this).getJsonField()

  public fun versionId(): String? = unwrap(this).getVersionId()

  public fun versionStage(): String? = unwrap(this).getVersionStage()

  public interface Builder {
    public fun jsonField(jsonField: String)

    public fun versionId(versionId: String)

    public fun versionStage(versionStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.SecretsManagerSecretOptions.Builder =
        software.amazon.awscdk.SecretsManagerSecretOptions.builder()

    override fun jsonField(jsonField: String) {
      cdkBuilder.jsonField(jsonField)
    }

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    override fun versionStage(versionStage: String) {
      cdkBuilder.versionStage(versionStage)
    }

    public fun build(): software.amazon.awscdk.SecretsManagerSecretOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.SecretsManagerSecretOptions,
  ) : SecretsManagerSecretOptions {
    override fun jsonField(): String? = unwrap(this).getJsonField()

    override fun versionId(): String? = unwrap(this).getVersionId()

    override fun versionStage(): String? = unwrap(this).getVersionStage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecretsManagerSecretOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SecretsManagerSecretOptions):
        SecretsManagerSecretOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretsManagerSecretOptions):
        software.amazon.awscdk.SecretsManagerSecretOptions = (wrapped as Wrapper).cdkObject
  }
}
