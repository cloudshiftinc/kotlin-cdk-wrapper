package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface ReplicaRegion {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun region(): String

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey) {
    }

    public fun region(region: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.ReplicaRegion.Builder =
        software.amazon.awscdk.services.secretsmanager.ReplicaRegion.builder()

    public override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.ReplicaRegion =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.secretsmanager.ReplicaRegion,
  ) : ReplicaRegion {
    public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    public override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaRegion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ReplicaRegion):
        ReplicaRegion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReplicaRegion):
        software.amazon.awscdk.services.secretsmanager.ReplicaRegion = (wrapped as
        Wrapper).cdkObject
  }
}
