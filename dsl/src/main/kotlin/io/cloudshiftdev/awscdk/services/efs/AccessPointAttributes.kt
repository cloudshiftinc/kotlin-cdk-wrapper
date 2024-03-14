package io.cloudshiftdev.awscdk.services.efs

import kotlin.String
import kotlin.Unit

public interface AccessPointAttributes {
  public fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

  public fun accessPointId(): String? = unwrap(this).getAccessPointId()

  public fun fileSystem(): IFileSystem? = unwrap(this).getFileSystem()?.let(IFileSystem::wrap)

  public interface Builder {
    public fun accessPointArn(accessPointArn: String) {
    }

    public fun accessPointId(accessPointId: String) {
    }

    public fun fileSystem(fileSystem: IFileSystem) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPointAttributes.Builder =
        software.amazon.awscdk.services.efs.AccessPointAttributes.builder()

    public override fun accessPointArn(accessPointArn: String) {
      cdkBuilder.accessPointArn(accessPointArn)
    }

    public override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    public override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.efs.AccessPointAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.efs.AccessPointAttributes,
  ) : AccessPointAttributes {
    public override fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    public override fun accessPointId(): String? = unwrap(this).getAccessPointId()

    public override fun fileSystem(): IFileSystem? =
        unwrap(this).getFileSystem()?.let(IFileSystem::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPointAttributes):
        AccessPointAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPointAttributes):
        software.amazon.awscdk.services.efs.AccessPointAttributes = (wrapped as Wrapper).cdkObject
  }
}
