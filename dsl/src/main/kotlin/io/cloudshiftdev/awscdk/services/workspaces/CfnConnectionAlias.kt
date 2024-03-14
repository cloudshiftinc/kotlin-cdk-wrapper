package io.cloudshiftdev.awscdk.services.workspaces

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnectionAlias internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAlias,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAliasId(): String = unwrap(this).getAttrAliasId()

  public open fun attrAssociations(): IResolvable =
      unwrap(this).getAttrAssociations().let(IResolvable::wrap)

  public open fun attrConnectionAliasState(): String = unwrap(this).getAttrConnectionAliasState()

  public open fun connectionString(): String = unwrap(this).getConnectionString()

  public open fun connectionString(`value`: String) {
    unwrap(this).setConnectionString(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun connectionString(connectionString: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspaces.CfnConnectionAlias.Builder =
        software.amazon.awscdk.services.workspaces.CfnConnectionAlias.Builder.create(scope, id)

    override fun connectionString(connectionString: String) {
      cdkBuilder.connectionString(connectionString)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.workspaces.CfnConnectionAlias =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectionAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectionAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAlias):
        CfnConnectionAlias = CfnConnectionAlias(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionAlias):
        software.amazon.awscdk.services.workspaces.CfnConnectionAlias = wrapped.cdkObject
  }

  public interface ConnectionAliasAssociationProperty {
    public fun associatedAccountId(): String? = unwrap(this).getAssociatedAccountId()

    public fun associationStatus(): String? = unwrap(this).getAssociationStatus()

    public fun connectionIdentifier(): String? = unwrap(this).getConnectionIdentifier()

    public fun resourceId(): String? = unwrap(this).getResourceId()

    public interface Builder {
      public fun associatedAccountId(associatedAccountId: String)

      public fun associationStatus(associationStatus: String)

      public fun connectionIdentifier(connectionIdentifier: String)

      public fun resourceId(resourceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty.Builder
          =
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty.builder()

      override fun associatedAccountId(associatedAccountId: String) {
        cdkBuilder.associatedAccountId(associatedAccountId)
      }

      override fun associationStatus(associationStatus: String) {
        cdkBuilder.associationStatus(associationStatus)
      }

      override fun connectionIdentifier(connectionIdentifier: String) {
        cdkBuilder.connectionIdentifier(connectionIdentifier)
      }

      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public fun build():
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty,
    ) : ConnectionAliasAssociationProperty {
      override fun associatedAccountId(): String? = unwrap(this).getAssociatedAccountId()

      override fun associationStatus(): String? = unwrap(this).getAssociationStatus()

      override fun connectionIdentifier(): String? = unwrap(this).getConnectionIdentifier()

      override fun resourceId(): String? = unwrap(this).getResourceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionAliasAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty):
          ConnectionAliasAssociationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionAliasAssociationProperty):
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
