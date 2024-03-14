package io.cloudshiftdev.awscdk.services.codegurureviewer

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

public open class CfnRepositoryAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAssociationArn(): String = unwrap(this).getAttrAssociationArn()

  public open fun bucketName(): String? = unwrap(this).getBucketName()

  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  public open fun connectionArn(): String? = unwrap(this).getConnectionArn()

  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun owner(): String? = unwrap(this).getOwner()

  public open fun owner(`value`: String) {
    unwrap(this).setOwner(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun connectionArn(connectionArn: String)

    public fun name(name: String)

    public fun owner(owner: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation.Builder =
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation.Builder.create(scope,
        id)

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepositoryAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepositoryAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation):
        CfnRepositoryAssociation = CfnRepositoryAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryAssociation):
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation =
        wrapped.cdkObject
  }
}
