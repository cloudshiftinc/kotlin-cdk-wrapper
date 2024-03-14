package io.cloudshiftdev.awscdk.services.appmesh

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

public open class CfnVirtualService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  public open fun attrUid(): String = unwrap(this).getAttrUid()

  public open fun attrVirtualServiceName(): String = unwrap(this).getAttrVirtualServiceName()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun meshName(): String = unwrap(this).getMeshName()

  public open fun meshName(`value`: String) {
    unwrap(this).setMeshName(`value`)
  }

  public open fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public open fun meshOwner(`value`: String) {
    unwrap(this).setMeshOwner(`value`)
  }

  public open fun spec(): Any = unwrap(this).getSpec()

  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  public open fun spec(`value`: VirtualServiceSpecProperty) {
    unwrap(this).setSpec(`value`.let(VirtualServiceSpecProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e70aa239f79e959975f761f57d10fec0394e3384d5ca0e82354ba396f8c04bd")
  public open fun spec(`value`: VirtualServiceSpecProperty.Builder.() -> Unit): Unit =
      spec(VirtualServiceSpecProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()

  public open fun virtualServiceName(`value`: String) {
    unwrap(this).setVirtualServiceName(`value`)
  }

  public interface Builder {
    public fun meshName(meshName: String) {
    }

    public fun meshOwner(meshOwner: String) {
    }

    public fun spec(spec: IResolvable) {
    }

    public fun spec(spec: VirtualServiceSpecProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("725d27703784655cbab56a5a6c4a42f43b35da8e5395db2235e44a653e109ec7")
    public fun spec(spec: VirtualServiceSpecProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun virtualServiceName(virtualServiceName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualService.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualService.Builder.create(scope, id)

    public override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    public override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    public override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    public override fun spec(spec: VirtualServiceSpecProperty) {
      cdkBuilder.spec(spec.let(VirtualServiceSpecProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("725d27703784655cbab56a5a6c4a42f43b35da8e5395db2235e44a653e109ec7")
    public override fun spec(spec: VirtualServiceSpecProperty.Builder.() -> Unit): Unit =
        spec(VirtualServiceSpecProperty(spec))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService):
        CfnVirtualService = CfnVirtualService(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualService):
        software.amazon.awscdk.services.appmesh.CfnVirtualService = wrapped.cdkObject
  }

  public interface VirtualRouterServiceProviderProperty {
    public fun virtualRouterName(): String

    public interface Builder {
      public fun virtualRouterName(virtualRouterName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty.builder()

      public override fun virtualRouterName(virtualRouterName: String) {
        cdkBuilder.virtualRouterName(virtualRouterName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty,
    ) : VirtualRouterServiceProviderProperty {
      public override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualRouterServiceProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty):
          VirtualRouterServiceProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualRouterServiceProviderProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualServiceSpecProperty {
    public fun provider(): Any? = unwrap(this).getProvider()

    public interface Builder {
      public fun provider(provider: IResolvable) {
      }

      public fun provider(provider: VirtualServiceProviderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be125943c2d263251b9970832fd54b9bf6428012a7cd8159bb29b0ff201dec")
      public fun provider(provider: VirtualServiceProviderProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty.builder()

      public override fun provider(provider: IResolvable) {
        cdkBuilder.provider(provider.let(IResolvable::unwrap))
      }

      public override fun provider(provider: VirtualServiceProviderProperty) {
        cdkBuilder.provider(provider.let(VirtualServiceProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be125943c2d263251b9970832fd54b9bf6428012a7cd8159bb29b0ff201dec")
      public override fun provider(provider: VirtualServiceProviderProperty.Builder.() -> Unit):
          Unit = provider(VirtualServiceProviderProperty(provider))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty,
    ) : VirtualServiceSpecProperty {
      public override fun provider(): Any? = unwrap(this).getProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty):
          VirtualServiceSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualServiceSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualServiceProviderProperty {
    public fun virtualNode(): Any? = unwrap(this).getVirtualNode()

    public fun virtualRouter(): Any? = unwrap(this).getVirtualRouter()

    public interface Builder {
      public fun virtualNode(virtualNode: IResolvable) {
      }

      public fun virtualNode(virtualNode: VirtualNodeServiceProviderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c36e41f187199632cbbeaf4e501f3881b630db774fa0a5a47e343bf0db68c4b")
      public fun virtualNode(virtualNode: VirtualNodeServiceProviderProperty.Builder.() -> Unit) {
      }

      public fun virtualRouter(virtualRouter: IResolvable) {
      }

      public fun virtualRouter(virtualRouter: VirtualRouterServiceProviderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bffc8c5e4d3b4fc7ba849b41ba9f285e4cfa816dd9b4ed70c273c9de61860507")
      public
          fun virtualRouter(virtualRouter: VirtualRouterServiceProviderProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty.builder()

      public override fun virtualNode(virtualNode: IResolvable) {
        cdkBuilder.virtualNode(virtualNode.let(IResolvable::unwrap))
      }

      public override fun virtualNode(virtualNode: VirtualNodeServiceProviderProperty) {
        cdkBuilder.virtualNode(virtualNode.let(VirtualNodeServiceProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c36e41f187199632cbbeaf4e501f3881b630db774fa0a5a47e343bf0db68c4b")
      public override
          fun virtualNode(virtualNode: VirtualNodeServiceProviderProperty.Builder.() -> Unit): Unit
          = virtualNode(VirtualNodeServiceProviderProperty(virtualNode))

      public override fun virtualRouter(virtualRouter: IResolvable) {
        cdkBuilder.virtualRouter(virtualRouter.let(IResolvable::unwrap))
      }

      public override fun virtualRouter(virtualRouter: VirtualRouterServiceProviderProperty) {
        cdkBuilder.virtualRouter(virtualRouter.let(VirtualRouterServiceProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bffc8c5e4d3b4fc7ba849b41ba9f285e4cfa816dd9b4ed70c273c9de61860507")
      public override
          fun virtualRouter(virtualRouter: VirtualRouterServiceProviderProperty.Builder.() -> Unit):
          Unit = virtualRouter(VirtualRouterServiceProviderProperty(virtualRouter))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty,
    ) : VirtualServiceProviderProperty {
      public override fun virtualNode(): Any? = unwrap(this).getVirtualNode()

      public override fun virtualRouter(): Any? = unwrap(this).getVirtualRouter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty):
          VirtualServiceProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualServiceProviderProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualNodeServiceProviderProperty {
    public fun virtualNodeName(): String

    public interface Builder {
      public fun virtualNodeName(virtualNodeName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty.builder()

      public override fun virtualNodeName(virtualNodeName: String) {
        cdkBuilder.virtualNodeName(virtualNodeName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty,
    ) : VirtualNodeServiceProviderProperty {
      public override fun virtualNodeName(): String = unwrap(this).getVirtualNodeName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeServiceProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty):
          VirtualNodeServiceProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeServiceProviderProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
