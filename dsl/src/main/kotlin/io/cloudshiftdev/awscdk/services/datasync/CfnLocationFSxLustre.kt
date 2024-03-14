package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLocationFSxLustre internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxLustre,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public open fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  public open fun fsxFilesystemArn(`value`: String) {
    unwrap(this).setFsxFilesystemArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?:
      emptyList()

  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
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
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    public fun securityGroupArns(securityGroupArns: List<String>)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationFSxLustre.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustre.Builder.create(scope, id)

    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxLustre =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationFSxLustre {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationFSxLustre(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxLustre):
        CfnLocationFSxLustre = CfnLocationFSxLustre(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxLustre):
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustre = wrapped.cdkObject
  }
}
