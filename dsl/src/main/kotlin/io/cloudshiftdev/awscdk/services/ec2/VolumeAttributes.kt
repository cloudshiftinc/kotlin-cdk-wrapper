package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface VolumeAttributes {
  /**
   * The availability zone that the EBS Volume is contained within (ex: us-west-2a).
   */
  public fun availabilityZone(): String

  /**
   * The customer-managed encryption key that is used to encrypt the Volume.
   *
   * Default: None -- The EBS Volume is not using a customer-managed KMS key for encryption.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The EBS Volume's ID.
   */
  public fun volumeId(): String

  /**
   * A builder for [VolumeAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The availability zone that the EBS Volume is contained within (ex:
     * us-west-2a). 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param encryptionKey The customer-managed encryption key that is used to encrypt the Volume.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param volumeId The EBS Volume's ID. 
     */
    public fun volumeId(volumeId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VolumeAttributes.Builder =
        software.amazon.awscdk.services.ec2.VolumeAttributes.builder()

    /**
     * @param availabilityZone The availability zone that the EBS Volume is contained within (ex:
     * us-west-2a). 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param encryptionKey The customer-managed encryption key that is used to encrypt the Volume.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param volumeId The EBS Volume's ID. 
     */
    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VolumeAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VolumeAttributes,
  ) : VolumeAttributes {
    /**
     * The availability zone that the EBS Volume is contained within (ex: us-west-2a).
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * The customer-managed encryption key that is used to encrypt the Volume.
     *
     * Default: None -- The EBS Volume is not using a customer-managed KMS key for encryption.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The EBS Volume's ID.
     */
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
