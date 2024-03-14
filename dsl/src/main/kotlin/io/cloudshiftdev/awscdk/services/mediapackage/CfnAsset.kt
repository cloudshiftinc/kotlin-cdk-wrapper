package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAsset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackage.CfnAsset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun egressEndpoints(): Any? = unwrap(this).getEgressEndpoints()

  public open fun egressEndpoints(`value`: IResolvable) {
    unwrap(this).setEgressEndpoints(`value`.let(IResolvable::unwrap))
  }

  public open fun egressEndpoints(__idx_ac66f0: List<Any>) {
    unwrap(this).setEgressEndpoints(__idx_ac66f0)
  }

  public open fun id(): String = unwrap(this).getId()

  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun packagingGroupId(): String = unwrap(this).getPackagingGroupId()

  public open fun packagingGroupId(`value`: String) {
    unwrap(this).setPackagingGroupId(`value`)
  }

  public open fun resourceId(): String? = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  public open fun sourceArn(): String = unwrap(this).getSourceArn()

  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  public open fun sourceRoleArn(): String = unwrap(this).getSourceRoleArn()

  public open fun sourceRoleArn(`value`: String) {
    unwrap(this).setSourceRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun egressEndpoints(egressEndpoints: IResolvable)

    public fun egressEndpoints(egressEndpoints: List<Any>)

    public fun id(id: String)

    public fun packagingGroupId(packagingGroupId: String)

    public fun resourceId(resourceId: String)

    public fun sourceArn(sourceArn: String)

    public fun sourceRoleArn(sourceRoleArn: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnAsset.Builder =
        software.amazon.awscdk.services.mediapackage.CfnAsset.Builder.create(scope, id)

    override fun egressEndpoints(egressEndpoints: IResolvable) {
      cdkBuilder.egressEndpoints(egressEndpoints.let(IResolvable::unwrap))
    }

    override fun egressEndpoints(egressEndpoints: List<Any>) {
      cdkBuilder.egressEndpoints(egressEndpoints)
    }

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun packagingGroupId(packagingGroupId: String) {
      cdkBuilder.packagingGroupId(packagingGroupId)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    override fun sourceRoleArn(sourceRoleArn: String) {
      cdkBuilder.sourceRoleArn(sourceRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnAsset = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAsset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAsset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnAsset): CfnAsset =
        CfnAsset(cdkObject)

    internal fun unwrap(wrapped: CfnAsset): software.amazon.awscdk.services.mediapackage.CfnAsset =
        wrapped.cdkObject
  }

  public interface EgressEndpointProperty {
    public fun packagingConfigurationId(): String

    public fun url(): String

    public interface Builder {
      public fun packagingConfigurationId(packagingConfigurationId: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty.Builder =
          software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty.builder()

      override fun packagingConfigurationId(packagingConfigurationId: String) {
        cdkBuilder.packagingConfigurationId(packagingConfigurationId)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty,
    ) : EgressEndpointProperty {
      override fun packagingConfigurationId(): String = unwrap(this).getPackagingConfigurationId()

      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EgressEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty):
          EgressEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressEndpointProperty):
          software.amazon.awscdk.services.mediapackage.CfnAsset.EgressEndpointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
