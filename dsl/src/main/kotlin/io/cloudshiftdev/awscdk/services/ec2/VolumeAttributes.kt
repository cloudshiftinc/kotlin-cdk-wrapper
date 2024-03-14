package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface VolumeAttributes {
  public fun availabilityZone(): String

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun volumeId(): String

  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun encryptionKey(encryptionKey: IKey)

    public fun volumeId(volumeId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VolumeAttributes.Builder =
        software.amazon.awscdk.services.ec2.VolumeAttributes.builder()

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VolumeAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VolumeAttributes,
  ) : VolumeAttributes {
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun volumeId(): String = unwrap(this).getVolumeId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VolumeAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VolumeAttributes):
        VolumeAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VolumeAttributes):
        software.amazon.awscdk.services.ec2.VolumeAttributes = (wrapped as Wrapper).cdkObject
  }
}
