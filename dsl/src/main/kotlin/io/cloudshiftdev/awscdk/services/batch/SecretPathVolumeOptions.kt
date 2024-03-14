package io.cloudshiftdev.awscdk.services.batch

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SecretPathVolumeOptions : EksVolumeOptions {
  public fun optional(): Boolean? = unwrap(this).getOptional()

  public fun secretName(): String

  public interface Builder {
    public fun mountPath(mountPath: String) {
    }

    public fun name(name: String) {
    }

    public fun optional(optional: Boolean) {
    }

    public fun readonly(readonly: Boolean) {
    }

    public fun secretName(secretName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.SecretPathVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.SecretPathVolumeOptions.builder()

    public override fun mountPath(mountPath: String) {
      cdkBuilder.mountPath(mountPath)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun optional(optional: Boolean) {
      cdkBuilder.optional(optional)
    }

    public override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    public fun build(): software.amazon.awscdk.services.batch.SecretPathVolumeOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.SecretPathVolumeOptions,
  ) : SecretPathVolumeOptions {
    public override fun mountPath(): String? = unwrap(this).getMountPath()

    public override fun name(): String = unwrap(this).getName()

    public override fun optional(): Boolean? = unwrap(this).getOptional()

    public override fun readonly(): Boolean? = unwrap(this).getReadonly()

    public override fun secretName(): String = unwrap(this).getSecretName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecretPathVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.SecretPathVolumeOptions):
        SecretPathVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretPathVolumeOptions):
        software.amazon.awscdk.services.batch.SecretPathVolumeOptions = (wrapped as
        Wrapper).cdkObject
  }
}
