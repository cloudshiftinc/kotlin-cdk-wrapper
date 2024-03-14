package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit

public interface FileSystemAttributes {
  public fun dnsName(): String

  public fun fileSystemId(): String

  public fun securityGroup(): ISecurityGroup

  public interface Builder {
    public fun dnsName(dnsName: String)

    public fun fileSystemId(fileSystemId: String)

    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.FileSystemAttributes.Builder =
        software.amazon.awscdk.services.fsx.FileSystemAttributes.builder()

    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fsx.FileSystemAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.fsx.FileSystemAttributes,
  ) : FileSystemAttributes {
    override fun dnsName(): String = unwrap(this).getDnsName()

    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    override fun securityGroup(): ISecurityGroup =
        unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.FileSystemAttributes):
        FileSystemAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemAttributes):
        software.amazon.awscdk.services.fsx.FileSystemAttributes = (wrapped as Wrapper).cdkObject
  }
}
