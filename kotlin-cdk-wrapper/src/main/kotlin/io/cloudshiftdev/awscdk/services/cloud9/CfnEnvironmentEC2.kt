@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloud9

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironmentEC2 internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun automaticStopTimeMinutes(): Number? = unwrap(this).getAutomaticStopTimeMinutes()

  public open fun automaticStopTimeMinutes(`value`: Number) {
    unwrap(this).setAutomaticStopTimeMinutes(`value`)
  }

  public open fun connectionType(): String? = unwrap(this).getConnectionType()

  public open fun connectionType(`value`: String) {
    unwrap(this).setConnectionType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun imageId(): String = unwrap(this).getImageId()

  public open fun imageId(`value`: String) {
    unwrap(this).setImageId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun ownerArn(): String? = unwrap(this).getOwnerArn()

  public open fun ownerArn(`value`: String) {
    unwrap(this).setOwnerArn(`value`)
  }

  public open fun repositories(): Any? = unwrap(this).getRepositories()

  public open fun repositories(`value`: IResolvable) {
    unwrap(this).setRepositories(`value`.let(IResolvable::unwrap))
  }

  public open fun repositories(__idx_ac66f0: List<Any>) {
    unwrap(this).setRepositories(__idx_ac66f0)
  }

  public open fun repositories(vararg __idx_ac66f0: Any): Unit = repositories(__idx_ac66f0.toList())

  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number)

    public fun connectionType(connectionType: String)

    public fun description(description: String)

    public fun imageId(imageId: String)

    public fun instanceType(instanceType: String)

    public fun name(name: String)

    public fun ownerArn(ownerArn: String)

    public fun repositories(repositories: IResolvable)

    public fun repositories(repositories: List<Any>)

    public fun repositories(vararg repositories: Any)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.Builder =
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.Builder.create(scope, id)

    override fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number) {
      cdkBuilder.automaticStopTimeMinutes(automaticStopTimeMinutes)
    }

    override fun connectionType(connectionType: String) {
      cdkBuilder.connectionType(connectionType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ownerArn(ownerArn: String) {
      cdkBuilder.ownerArn(ownerArn)
    }

    override fun repositories(repositories: IResolvable) {
      cdkBuilder.repositories(repositories.let(IResolvable::unwrap))
    }

    override fun repositories(repositories: List<Any>) {
      cdkBuilder.repositories(repositories)
    }

    override fun repositories(vararg repositories: Any): Unit = repositories(repositories.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentEC2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentEC2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2):
        CfnEnvironmentEC2 = CfnEnvironmentEC2(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentEC2):
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2 = wrapped.cdkObject
  }

  public interface RepositoryProperty {
    public fun pathComponent(): String

    public fun repositoryUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun pathComponent(pathComponent: String)

      public fun repositoryUrl(repositoryUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder =
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.builder()

      override fun pathComponent(pathComponent: String) {
        cdkBuilder.pathComponent(pathComponent)
      }

      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public fun build():
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty,
    ) : CdkObject(cdkObject), RepositoryProperty {
      override fun pathComponent(): String = unwrap(this).getPathComponent()

      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty):
          RepositoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryProperty):
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty
    }
  }
}
