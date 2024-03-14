package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit

public interface FileSystemAttributes {
  public fun fileSystemArn(): String? = unwrap(this).getFileSystemArn()

  public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

  public fun securityGroup(): ISecurityGroup

  public interface Builder {
    public fun fileSystemArn(fileSystemArn: String) {
    }

    public fun fileSystemId(fileSystemId: String) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.FileSystemAttributes.Builder =
        software.amazon.awscdk.services.efs.FileSystemAttributes.builder()

    public override fun fileSystemArn(fileSystemArn: String) {
      cdkBuilder.fileSystemArn(fileSystemArn)
    }

    public override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.efs.FileSystemAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.efs.FileSystemAttributes,
  ) : FileSystemAttributes {
    public override fun fileSystemArn(): String? = unwrap(this).getFileSystemArn()

    public override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    public override fun securityGroup(): ISecurityGroup =
        unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.FileSystemAttributes):
        FileSystemAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemAttributes):
        software.amazon.awscdk.services.efs.FileSystemAttributes = (wrapped as Wrapper).cdkObject
  }
}
