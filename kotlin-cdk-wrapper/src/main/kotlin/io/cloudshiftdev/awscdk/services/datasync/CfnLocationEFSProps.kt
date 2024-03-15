@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLocationEFSProps {
  public fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

  public fun ec2Config(): Any

  public fun efsFilesystemArn(): String? = unwrap(this).getEfsFilesystemArn()

  public fun fileSystemAccessRoleArn(): String? = unwrap(this).getFileSystemAccessRoleArn()

  public fun inTransitEncryption(): String? = unwrap(this).getInTransitEncryption()

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessPointArn(accessPointArn: String)

    public fun ec2Config(ec2Config: IResolvable)

    public fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3af66aa99dca56cb35a3347bb145188a2ff6c86fa7d4f760b1442dcabf27da27")
    public fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty.Builder.() -> Unit)

    public fun efsFilesystemArn(efsFilesystemArn: String)

    public fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String)

    public fun inTransitEncryption(inTransitEncryption: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationEFSProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationEFSProps.builder()

    override fun accessPointArn(accessPointArn: String) {
      cdkBuilder.accessPointArn(accessPointArn)
    }

    override fun ec2Config(ec2Config: IResolvable) {
      cdkBuilder.ec2Config(ec2Config.let(IResolvable::unwrap))
    }

    override fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty) {
      cdkBuilder.ec2Config(ec2Config.let(CfnLocationEFS.Ec2ConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3af66aa99dca56cb35a3347bb145188a2ff6c86fa7d4f760b1442dcabf27da27")
    override fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty.Builder.() -> Unit): Unit =
        ec2Config(CfnLocationEFS.Ec2ConfigProperty(ec2Config))

    override fun efsFilesystemArn(efsFilesystemArn: String) {
      cdkBuilder.efsFilesystemArn(efsFilesystemArn)
    }

    override fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String) {
      cdkBuilder.fileSystemAccessRoleArn(fileSystemAccessRoleArn)
    }

    override fun inTransitEncryption(inTransitEncryption: String) {
      cdkBuilder.inTransitEncryption(inTransitEncryption)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationEFSProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFSProps,
  ) : CdkObject(cdkObject), CfnLocationEFSProps {
    override fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    override fun ec2Config(): Any = unwrap(this).getEc2Config()

    override fun efsFilesystemArn(): String? = unwrap(this).getEfsFilesystemArn()

    override fun fileSystemAccessRoleArn(): String? = unwrap(this).getFileSystemAccessRoleArn()

    override fun inTransitEncryption(): String? = unwrap(this).getInTransitEncryption()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationEFSProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFSProps):
        CfnLocationEFSProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationEFSProps):
        software.amazon.awscdk.services.datasync.CfnLocationEFSProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationEFSProps
  }
}
