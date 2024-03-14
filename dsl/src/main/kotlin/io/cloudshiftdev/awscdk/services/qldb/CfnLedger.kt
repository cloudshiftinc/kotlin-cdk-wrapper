package io.cloudshiftdev.awscdk.services.qldb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLedger internal constructor(
  private val cdkObject: software.amazon.awscdk.services.qldb.CfnLedger,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKey(): String? = unwrap(this).getKmsKey()

  public open fun kmsKey(`value`: String) {
    unwrap(this).setKmsKey(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun permissionsMode(): String = unwrap(this).getPermissionsMode()

  public open fun permissionsMode(`value`: String) {
    unwrap(this).setPermissionsMode(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun kmsKey(kmsKey: String)

    public fun name(name: String)

    public fun permissionsMode(permissionsMode: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qldb.CfnLedger.Builder =
        software.amazon.awscdk.services.qldb.CfnLedger.Builder.create(scope, id)

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissionsMode(permissionsMode: String) {
      cdkBuilder.permissionsMode(permissionsMode)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.qldb.CfnLedger = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLedger {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLedger(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnLedger): CfnLedger =
        CfnLedger(cdkObject)

    internal fun unwrap(wrapped: CfnLedger): software.amazon.awscdk.services.qldb.CfnLedger =
        wrapped.cdkObject
  }
}
