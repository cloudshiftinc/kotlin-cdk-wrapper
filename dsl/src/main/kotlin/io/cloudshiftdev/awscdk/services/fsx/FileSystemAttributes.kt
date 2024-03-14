package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit

public interface FileSystemAttributes {
  /**
   * The DNS name assigned to this file system.
   */
  public fun dnsName(): String

  /**
   * The ID of the file system, assigned by Amazon FSx.
   */
  public fun fileSystemId(): String

  /**
   * The security group of the file system.
   */
  public fun securityGroup(): ISecurityGroup

  /**
   * A builder for [FileSystemAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dnsName The DNS name assigned to this file system. 
     */
    public fun dnsName(dnsName: String)

    /**
     * @param fileSystemId The ID of the file system, assigned by Amazon FSx. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param securityGroup The security group of the file system. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.FileSystemAttributes.Builder =
        software.amazon.awscdk.services.fsx.FileSystemAttributes.builder()

    /**
     * @param dnsName The DNS name assigned to this file system. 
     */
    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    /**
     * @param fileSystemId The ID of the file system, assigned by Amazon FSx. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param securityGroup The security group of the file system. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fsx.FileSystemAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.FileSystemAttributes,
  ) : CdkObject(cdkObject), FileSystemAttributes {
    /**
     * The DNS name assigned to this file system.
     */
    override fun dnsName(): String = unwrap(this).getDnsName()

    /**
     * The ID of the file system, assigned by Amazon FSx.
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * The security group of the file system.
     */
    override fun securityGroup(): ISecurityGroup =
        unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.FileSystemAttributes):
        FileSystemAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemAttributes):
        software.amazon.awscdk.services.fsx.FileSystemAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.fsx.FileSystemAttributes
  }
}
