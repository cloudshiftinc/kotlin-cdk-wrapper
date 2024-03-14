package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLocationEFS internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFS,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

  public open fun accessPointArn(`value`: String) {
    unwrap(this).setAccessPointArn(`value`)
  }

  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public open fun ec2Config(): Any = unwrap(this).getEc2Config()

  public open fun ec2Config(`value`: IResolvable) {
    unwrap(this).setEc2Config(`value`.let(IResolvable::unwrap))
  }

  public open fun ec2Config(`value`: Ec2ConfigProperty) {
    unwrap(this).setEc2Config(`value`.let(Ec2ConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbd59d3aeac85bfa898c59dabe52bd2b32abca81026060441aa3ba9774e9c603")
  public open fun ec2Config(`value`: Ec2ConfigProperty.Builder.() -> Unit): Unit =
      ec2Config(Ec2ConfigProperty(`value`))

  public open fun efsFilesystemArn(): String? = unwrap(this).getEfsFilesystemArn()

  public open fun efsFilesystemArn(`value`: String) {
    unwrap(this).setEfsFilesystemArn(`value`)
  }

  public open fun fileSystemAccessRoleArn(): String? = unwrap(this).getFileSystemAccessRoleArn()

  public open fun fileSystemAccessRoleArn(`value`: String) {
    unwrap(this).setFileSystemAccessRoleArn(`value`)
  }

  public open fun inTransitEncryption(): String? = unwrap(this).getInTransitEncryption()

  public open fun inTransitEncryption(`value`: String) {
    unwrap(this).setInTransitEncryption(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun accessPointArn(accessPointArn: String)

    public fun ec2Config(ec2Config: IResolvable)

    public fun ec2Config(ec2Config: Ec2ConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b44d49eae9989a9a3a64e1bfb64a4bc4841f8daef030b2d3dd43278f1e25d57a")
    public fun ec2Config(ec2Config: Ec2ConfigProperty.Builder.() -> Unit)

    public fun efsFilesystemArn(efsFilesystemArn: String)

    public fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String)

    public fun inTransitEncryption(inTransitEncryption: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationEFS.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationEFS.Builder.create(scope, id)

    override fun accessPointArn(accessPointArn: String) {
      cdkBuilder.accessPointArn(accessPointArn)
    }

    override fun ec2Config(ec2Config: IResolvable) {
      cdkBuilder.ec2Config(ec2Config.let(IResolvable::unwrap))
    }

    override fun ec2Config(ec2Config: Ec2ConfigProperty) {
      cdkBuilder.ec2Config(ec2Config.let(Ec2ConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b44d49eae9989a9a3a64e1bfb64a4bc4841f8daef030b2d3dd43278f1e25d57a")
    override fun ec2Config(ec2Config: Ec2ConfigProperty.Builder.() -> Unit): Unit =
        ec2Config(Ec2ConfigProperty(ec2Config))

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

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationEFS = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationEFS {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationEFS(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFS):
        CfnLocationEFS = CfnLocationEFS(cdkObject)

    internal fun unwrap(wrapped: CfnLocationEFS):
        software.amazon.awscdk.services.datasync.CfnLocationEFS = wrapped.cdkObject
  }

  public interface Ec2ConfigProperty {
    public fun securityGroupArns(): List<String>

    public fun subnetArn(): String

    public interface Builder {
      public fun securityGroupArns(securityGroupArns: List<String>)

      public fun subnetArn(subnetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty.builder()

      override fun securityGroupArns(securityGroupArns: List<String>) {
        cdkBuilder.securityGroupArns(securityGroupArns)
      }

      override fun subnetArn(subnetArn: String) {
        cdkBuilder.subnetArn(subnetArn)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty,
    ) : Ec2ConfigProperty {
      override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?:
          emptyList()

      override fun subnetArn(): String = unwrap(this).getSubnetArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Ec2ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty):
          Ec2ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ec2ConfigProperty):
          software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
