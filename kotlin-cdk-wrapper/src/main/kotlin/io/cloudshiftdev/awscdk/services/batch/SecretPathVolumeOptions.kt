@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SecretPathVolumeOptions : EksVolumeOptions {
  public fun optional(): Boolean? = unwrap(this).getOptional()

  public fun secretName(): String

  @CdkDslMarker
  public interface Builder {
    public fun mountPath(mountPath: String)

    public fun name(name: String)

    public fun optional(optional: Boolean)

    public fun readonly(readonly: Boolean)

    public fun secretName(secretName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.SecretPathVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.SecretPathVolumeOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.batch.SecretPathVolumeOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.SecretPathVolumeOptions,
  ) : CdkObject(cdkObject), SecretPathVolumeOptions {
    override fun mountPath(): String? = unwrap(this).getMountPath()

    override fun name(): String = unwrap(this).getName()

    override fun optional(): Boolean? = unwrap(this).getOptional()

    override fun readonly(): Boolean? = unwrap(this).getReadonly()

    override fun secretName(): String = unwrap(this).getSecretName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretPathVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.SecretPathVolumeOptions):
        SecretPathVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretPathVolumeOptions):
        software.amazon.awscdk.services.batch.SecretPathVolumeOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.SecretPathVolumeOptions
  }
}
