@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class SecretPathVolume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.SecretPathVolume,
) : EksVolume(cdkObject) {
  public open fun optional(): Boolean? = unwrap(this).getOptional()

  public open fun secretName(): String = unwrap(this).getSecretName()

  @CdkDslMarker
  public interface Builder {
    public fun mountPath(mountPath: String)

    public fun name(name: String)

    public fun optional(optional: Boolean)

    public fun readonly(readonly: Boolean)

    public fun secretName(secretName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.SecretPathVolume.Builder =
        software.amazon.awscdk.services.batch.SecretPathVolume.Builder.create()

    override fun mountPath(mountPath: String) {
      cdkBuilder.mountPath(mountPath)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun optional(optional: Boolean) {
      cdkBuilder.optional(optional)
    }

    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    public fun build(): software.amazon.awscdk.services.batch.SecretPathVolume = cdkBuilder.build()
  }

  public companion object {
    public fun isSecretPathVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.SecretPathVolume.isSecretPathVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): SecretPathVolume {
      val builderImpl = BuilderImpl()
      return SecretPathVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.SecretPathVolume):
        SecretPathVolume = SecretPathVolume(cdkObject)

    internal fun unwrap(wrapped: SecretPathVolume):
        software.amazon.awscdk.services.batch.SecretPathVolume = wrapped.cdkObject
  }
}
