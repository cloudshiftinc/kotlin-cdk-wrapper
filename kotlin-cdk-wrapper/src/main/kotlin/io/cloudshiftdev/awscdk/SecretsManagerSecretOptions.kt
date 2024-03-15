@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SecretsManagerSecretOptions {
  public fun jsonField(): String? = unwrap(this).getJsonField()

  public fun versionId(): String? = unwrap(this).getVersionId()

  public fun versionStage(): String? = unwrap(this).getVersionStage()

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.SecretsManagerSecretOptions,
  ) : CdkObject(cdkObject), SecretsManagerSecretOptions {
    override fun jsonField(): String? = unwrap(this).getJsonField()

    override fun versionId(): String? = unwrap(this).getVersionId()

    override fun versionStage(): String? = unwrap(this).getVersionStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretsManagerSecretOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SecretsManagerSecretOptions):
        SecretsManagerSecretOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretsManagerSecretOptions):
        software.amazon.awscdk.SecretsManagerSecretOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.SecretsManagerSecretOptions
  }
}
