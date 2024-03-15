@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AccessPointAttributes {
  public fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

  public fun accessPointId(): String? = unwrap(this).getAccessPointId()

  public fun fileSystem(): IFileSystem? = unwrap(this).getFileSystem()?.let(IFileSystem::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accessPointArn(accessPointArn: String)

    public fun accessPointId(accessPointId: String)

    public fun fileSystem(fileSystem: IFileSystem)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPointAttributes.Builder =
        software.amazon.awscdk.services.efs.AccessPointAttributes.builder()

    override fun accessPointArn(accessPointArn: String) {
      cdkBuilder.accessPointArn(accessPointArn)
    }

    override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.efs.AccessPointAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.AccessPointAttributes,
  ) : CdkObject(cdkObject), AccessPointAttributes {
    override fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    override fun accessPointId(): String? = unwrap(this).getAccessPointId()

    override fun fileSystem(): IFileSystem? = unwrap(this).getFileSystem()?.let(IFileSystem::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPointAttributes):
        AccessPointAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPointAttributes):
        software.amazon.awscdk.services.efs.AccessPointAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.efs.AccessPointAttributes
  }
}
