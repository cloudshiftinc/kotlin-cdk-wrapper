package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface AccessPointAttributes {
  /**
   * The ARN of the AccessPoint One of this, or `accessPointId` is required.
   *
   * Default: - determined based on accessPointId
   */
  public fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

  /**
   * The ID of the AccessPoint One of this, or `accessPointArn` is required.
   *
   * Default: - determined based on accessPointArn
   */
  public fun accessPointId(): String? = unwrap(this).getAccessPointId()

  /**
   * The EFS file system.
   *
   * Default: - no EFS file system
   */
  public fun fileSystem(): IFileSystem? = unwrap(this).getFileSystem()?.let(IFileSystem::wrap)

  /**
   * A builder for [AccessPointAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPointArn The ARN of the AccessPoint One of this, or `accessPointId` is required.
     */
    public fun accessPointArn(accessPointArn: String)

    /**
     * @param accessPointId The ID of the AccessPoint One of this, or `accessPointArn` is required.
     */
    public fun accessPointId(accessPointId: String)

    /**
     * @param fileSystem The EFS file system.
     */
    public fun fileSystem(fileSystem: IFileSystem)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPointAttributes.Builder =
        software.amazon.awscdk.services.efs.AccessPointAttributes.builder()

    /**
     * @param accessPointArn The ARN of the AccessPoint One of this, or `accessPointId` is required.
     */
    override fun accessPointArn(accessPointArn: String) {
      cdkBuilder.accessPointArn(accessPointArn)
    }

    /**
     * @param accessPointId The ID of the AccessPoint One of this, or `accessPointArn` is required.
     */
    override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    /**
     * @param fileSystem The EFS file system.
     */
    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.efs.AccessPointAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.efs.AccessPointAttributes,
  ) : AccessPointAttributes {
    /**
     * The ARN of the AccessPoint One of this, or `accessPointId` is required.
     *
     * Default: - determined based on accessPointId
     */
    override fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    /**
     * The ID of the AccessPoint One of this, or `accessPointArn` is required.
     *
     * Default: - determined based on accessPointArn
     */
    override fun accessPointId(): String? = unwrap(this).getAccessPointId()

    /**
     * The EFS file system.
     *
     * Default: - no EFS file system
     */
    override fun fileSystem(): IFileSystem? = unwrap(this).getFileSystem()?.let(IFileSystem::wrap)
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
