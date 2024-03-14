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

public open class CfnMesh internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  public open fun attrUid(): String = unwrap(this).getAttrUid()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun meshName(): String? = unwrap(this).getMeshName()

  public open fun meshName(`value`: String) {
    unwrap(this).setMeshName(`value`)
  }

  public open fun spec(): Any? = unwrap(this).getSpec()

  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  public open fun spec(`value`: MeshSpecProperty) {
    unwrap(this).setSpec(`value`.let(MeshSpecProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0d46683ac6ef7bf26443e2dcac127a2d55efc9cfb5f2d52e1662a420e41031eb")
  public open fun spec(`value`: MeshSpecProperty.Builder.() -> Unit): Unit =
      spec(MeshSpecProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun meshName(meshName: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: MeshSpecProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f512b8c042be862110c86fe0886eed35ca758820d713e0f0058dcf407b07ec")
    public fun spec(spec: MeshSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnMesh.Builder =
        software.amazon.awscdk.services.appmesh.CfnMesh.Builder.create(scope, id)

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: MeshSpecProperty) {
      cdkBuilder.spec(spec.let(MeshSpecProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f512b8c042be862110c86fe0886eed35ca758820d713e0f0058dcf407b07ec")
    override fun spec(spec: MeshSpecProperty.Builder.() -> Unit): Unit =
        spec(MeshSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnMesh = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMesh {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMesh(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh): CfnMesh =
        CfnMesh(cdkObject)

    internal fun unwrap(wrapped: CfnMesh): software.amazon.awscdk.services.appmesh.CfnMesh =
        wrapped.cdkObject
  }

  public interface MeshServiceDiscoveryProperty {
    public fun ipPreference(): String? = unwrap(this).getIpPreference()

    public interface Builder {
      public fun ipPreference(ipPreference: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty.builder()

      override fun ipPreference(ipPreference: String) {
        cdkBuilder.ipPreference(ipPreference)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty,
    ) : MeshServiceDiscoveryProperty {
      override fun ipPreference(): String? = unwrap(this).getIpPreference()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MeshServiceDiscoveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty):
          MeshServiceDiscoveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MeshServiceDiscoveryProperty):
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EgressFilterProperty {
    public fun type(): String

    public interface Builder {
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty,
    ) : EgressFilterProperty {
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EgressFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty):
          EgressFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressFilterProperty):
          software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MeshSpecProperty {
    public fun egressFilter(): Any? = unwrap(this).getEgressFilter()

    public fun serviceDiscovery(): Any? = unwrap(this).getServiceDiscovery()

    public interface Builder {
      public fun egressFilter(egressFilter: IResolvable)

      public fun egressFilter(egressFilter: EgressFilterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("434960f3f5302cfc58ecbc63c003e3a27508adf23053398f9d203587f1b2c4b4")
      public fun egressFilter(egressFilter: EgressFilterProperty.Builder.() -> Unit)

      public fun serviceDiscovery(serviceDiscovery: IResolvable)

      public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78908713b26e8e55cd54c92a84f59957af4676699050c81f7f296fc4e8da97fe")
      public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty.builder()

      override fun egressFilter(egressFilter: IResolvable) {
        cdkBuilder.egressFilter(egressFilter.let(IResolvable::unwrap))
      }

      override fun egressFilter(egressFilter: EgressFilterProperty) {
        cdkBuilder.egressFilter(egressFilter.let(EgressFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("434960f3f5302cfc58ecbc63c003e3a27508adf23053398f9d203587f1b2c4b4")
      override fun egressFilter(egressFilter: EgressFilterProperty.Builder.() -> Unit): Unit =
          egressFilter(EgressFilterProperty(egressFilter))

      override fun serviceDiscovery(serviceDiscovery: IResolvable) {
        cdkBuilder.serviceDiscovery(serviceDiscovery.let(IResolvable::unwrap))
      }

      override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryProperty) {
        cdkBuilder.serviceDiscovery(serviceDiscovery.let(MeshServiceDiscoveryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78908713b26e8e55cd54c92a84f59957af4676699050c81f7f296fc4e8da97fe")
      override
          fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryProperty.Builder.() -> Unit):
          Unit = serviceDiscovery(MeshServiceDiscoveryProperty(serviceDiscovery))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty,
    ) : MeshSpecProperty {
      override fun egressFilter(): Any? = unwrap(this).getEgressFilter()

      override fun serviceDiscovery(): Any? = unwrap(this).getServiceDiscovery()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MeshSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty):
          MeshSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MeshSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
