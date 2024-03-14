package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVirtualService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The full Amazon Resource Name (ARN) for the virtual service.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the service mesh that the virtual service resides in.
   */
  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  /**
   * The AWS IAM account ID of the service mesh owner.
   *
   * If the account ID is not your own, then it's the ID of the account that shared the mesh with
   * your account. For more information about mesh sharing, see [Working with Shared
   * Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   */
  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  /**
   * The AWS IAM account ID of the resource owner.
   *
   * If the account ID is not your own, then it's the ID of the mesh owner or of another account
   * that the mesh is shared with. For more information about mesh sharing, see [Working with Shared
   * Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   */
  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  /**
   * The unique identifier for the virtual service.
   */
  public open fun attrUid(): String = unwrap(this).getAttrUid()

  /**
   * The name of the virtual service.
   */
  public open fun attrVirtualServiceName(): String = unwrap(this).getAttrVirtualServiceName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the service mesh to create the virtual service in.
   */
  public open fun meshName(): String = unwrap(this).getMeshName()

  /**
   * The name of the service mesh to create the virtual service in.
   */
  public open fun meshName(`value`: String) {
    unwrap(this).setMeshName(`value`)
  }

  /**
   * The AWS IAM account ID of the service mesh owner.
   */
  public open fun meshOwner(): String? = unwrap(this).getMeshOwner()

  /**
   * The AWS IAM account ID of the service mesh owner.
   */
  public open fun meshOwner(`value`: String) {
    unwrap(this).setMeshOwner(`value`)
  }

  /**
   * The virtual service specification to apply.
   */
  public open fun spec(): Any = unwrap(this).getSpec()

  /**
   * The virtual service specification to apply.
   */
  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  /**
   * The virtual service specification to apply.
   */
  public open fun spec(`value`: VirtualServiceSpecProperty) {
    unwrap(this).setSpec(`value`.let(VirtualServiceSpecProperty::unwrap))
  }

  /**
   * The virtual service specification to apply.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e70aa239f79e959975f761f57d10fec0394e3384d5ca0e82354ba396f8c04bd")
  public open fun spec(`value`: VirtualServiceSpecProperty.Builder.() -> Unit): Unit =
      spec(VirtualServiceSpecProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you can apply to the virtual service to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata that you can apply to the virtual service to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Optional metadata that you can apply to the virtual service to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name to use for the virtual service.
   */
  public open fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()

  /**
   * The name to use for the virtual service.
   */
  public open fun virtualServiceName(`value`: String) {
    unwrap(this).setVirtualServiceName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.CfnVirtualService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the service mesh to create the virtual service in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshname)
     * @param meshName The name of the service mesh to create the virtual service in. 
     */
    public fun meshName(meshName: String)

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    public fun meshOwner(meshOwner: String)

    /**
     * The virtual service specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-spec)
     * @param spec The virtual service specification to apply. 
     */
    public fun spec(spec: IResolvable)

    /**
     * The virtual service specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-spec)
     * @param spec The virtual service specification to apply. 
     */
    public fun spec(spec: VirtualServiceSpecProperty)

    /**
     * The virtual service specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-spec)
     * @param spec The virtual service specification to apply. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("725d27703784655cbab56a5a6c4a42f43b35da8e5395db2235e44a653e109ec7")
    public fun spec(spec: VirtualServiceSpecProperty.Builder.() -> Unit)

    /**
     * Optional metadata that you can apply to the virtual service to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags)
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     * categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata that you can apply to the virtual service to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags)
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     * categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name to use for the virtual service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-virtualservicename)
     * @param virtualServiceName The name to use for the virtual service. 
     */
    public fun virtualServiceName(virtualServiceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualService.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualService.Builder.create(scope, id)

    /**
     * The name of the service mesh to create the virtual service in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshname)
     * @param meshName The name of the service mesh to create the virtual service in. 
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * The virtual service specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-spec)
     * @param spec The virtual service specification to apply. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * The virtual service specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-spec)
     * @param spec The virtual service specification to apply. 
     */
    override fun spec(spec: VirtualServiceSpecProperty) {
      cdkBuilder.spec(spec.let(VirtualServiceSpecProperty::unwrap))
    }

    /**
     * The virtual service specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-spec)
     * @param spec The virtual service specification to apply. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("725d27703784655cbab56a5a6c4a42f43b35da8e5395db2235e44a653e109ec7")
    override fun spec(spec: VirtualServiceSpecProperty.Builder.() -> Unit): Unit =
        spec(VirtualServiceSpecProperty(spec))

    /**
     * Optional metadata that you can apply to the virtual service to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags)
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     * categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Optional metadata that you can apply to the virtual service to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags)
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     * categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name to use for the virtual service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-virtualservicename)
     * @param virtualServiceName The name to use for the virtual service. 
     */
    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualService =
        cdkBuilder.build()
  }

  public companion object {
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
    /**
     * The name of the virtual router that is acting as a service provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html#cfn-appmesh-virtualservice-virtualrouterserviceprovider-virtualroutername)
     */
    public fun virtualRouterName(): String

    /**
     * A builder for [VirtualRouterServiceProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param virtualRouterName The name of the virtual router that is acting as a service
       * provider. 
       */
      public fun virtualRouterName(virtualRouterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty.builder()

      /**
       * @param virtualRouterName The name of the virtual router that is acting as a service
       * provider. 
       */
      override fun virtualRouterName(virtualRouterName: String) {
        cdkBuilder.virtualRouterName(virtualRouterName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty,
    ) : CdkObject(cdkObject), VirtualRouterServiceProviderProperty {
      /**
       * The name of the virtual router that is acting as a service provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html#cfn-appmesh-virtualservice-virtualrouterserviceprovider-virtualroutername)
       */
      override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualRouterServiceProviderProperty
    }
  }

  public interface VirtualServiceSpecProperty {
    /**
     * The App Mesh object that is acting as the provider for a virtual service.
     *
     * You can specify a single virtual node or virtual router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html#cfn-appmesh-virtualservice-virtualservicespec-provider)
     */
    public fun provider(): Any? = unwrap(this).getProvider()

    /**
     * A builder for [VirtualServiceSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provider The App Mesh object that is acting as the provider for a virtual service.
       * You can specify a single virtual node or virtual router.
       */
      public fun provider(provider: IResolvable)

      /**
       * @param provider The App Mesh object that is acting as the provider for a virtual service.
       * You can specify a single virtual node or virtual router.
       */
      public fun provider(provider: VirtualServiceProviderProperty)

      /**
       * @param provider The App Mesh object that is acting as the provider for a virtual service.
       * You can specify a single virtual node or virtual router.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be125943c2d263251b9970832fd54b9bf6428012a7cd8159bb29b0ff201dec")
      public fun provider(provider: VirtualServiceProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty.builder()

      /**
       * @param provider The App Mesh object that is acting as the provider for a virtual service.
       * You can specify a single virtual node or virtual router.
       */
      override fun provider(provider: IResolvable) {
        cdkBuilder.provider(provider.let(IResolvable::unwrap))
      }

      /**
       * @param provider The App Mesh object that is acting as the provider for a virtual service.
       * You can specify a single virtual node or virtual router.
       */
      override fun provider(provider: VirtualServiceProviderProperty) {
        cdkBuilder.provider(provider.let(VirtualServiceProviderProperty::unwrap))
      }

      /**
       * @param provider The App Mesh object that is acting as the provider for a virtual service.
       * You can specify a single virtual node or virtual router.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be125943c2d263251b9970832fd54b9bf6428012a7cd8159bb29b0ff201dec")
      override fun provider(provider: VirtualServiceProviderProperty.Builder.() -> Unit): Unit =
          provider(VirtualServiceProviderProperty(provider))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty,
    ) : CdkObject(cdkObject), VirtualServiceSpecProperty {
      /**
       * The App Mesh object that is acting as the provider for a virtual service.
       *
       * You can specify a single virtual node or virtual router.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html#cfn-appmesh-virtualservice-virtualservicespec-provider)
       */
      override fun provider(): Any? = unwrap(this).getProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty):
          VirtualServiceSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualServiceSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty
    }
  }

  public interface VirtualServiceProviderProperty {
    /**
     * The virtual node associated with a virtual service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html#cfn-appmesh-virtualservice-virtualserviceprovider-virtualnode)
     */
    public fun virtualNode(): Any? = unwrap(this).getVirtualNode()

    /**
     * The virtual router associated with a virtual service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html#cfn-appmesh-virtualservice-virtualserviceprovider-virtualrouter)
     */
    public fun virtualRouter(): Any? = unwrap(this).getVirtualRouter()

    /**
     * A builder for [VirtualServiceProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param virtualNode The virtual node associated with a virtual service.
       */
      public fun virtualNode(virtualNode: IResolvable)

      /**
       * @param virtualNode The virtual node associated with a virtual service.
       */
      public fun virtualNode(virtualNode: VirtualNodeServiceProviderProperty)

      /**
       * @param virtualNode The virtual node associated with a virtual service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c36e41f187199632cbbeaf4e501f3881b630db774fa0a5a47e343bf0db68c4b")
      public fun virtualNode(virtualNode: VirtualNodeServiceProviderProperty.Builder.() -> Unit)

      /**
       * @param virtualRouter The virtual router associated with a virtual service.
       */
      public fun virtualRouter(virtualRouter: IResolvable)

      /**
       * @param virtualRouter The virtual router associated with a virtual service.
       */
      public fun virtualRouter(virtualRouter: VirtualRouterServiceProviderProperty)

      /**
       * @param virtualRouter The virtual router associated with a virtual service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bffc8c5e4d3b4fc7ba849b41ba9f285e4cfa816dd9b4ed70c273c9de61860507")
      public
          fun virtualRouter(virtualRouter: VirtualRouterServiceProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty.builder()

      /**
       * @param virtualNode The virtual node associated with a virtual service.
       */
      override fun virtualNode(virtualNode: IResolvable) {
        cdkBuilder.virtualNode(virtualNode.let(IResolvable::unwrap))
      }

      /**
       * @param virtualNode The virtual node associated with a virtual service.
       */
      override fun virtualNode(virtualNode: VirtualNodeServiceProviderProperty) {
        cdkBuilder.virtualNode(virtualNode.let(VirtualNodeServiceProviderProperty::unwrap))
      }

      /**
       * @param virtualNode The virtual node associated with a virtual service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c36e41f187199632cbbeaf4e501f3881b630db774fa0a5a47e343bf0db68c4b")
      override fun virtualNode(virtualNode: VirtualNodeServiceProviderProperty.Builder.() -> Unit):
          Unit = virtualNode(VirtualNodeServiceProviderProperty(virtualNode))

      /**
       * @param virtualRouter The virtual router associated with a virtual service.
       */
      override fun virtualRouter(virtualRouter: IResolvable) {
        cdkBuilder.virtualRouter(virtualRouter.let(IResolvable::unwrap))
      }

      /**
       * @param virtualRouter The virtual router associated with a virtual service.
       */
      override fun virtualRouter(virtualRouter: VirtualRouterServiceProviderProperty) {
        cdkBuilder.virtualRouter(virtualRouter.let(VirtualRouterServiceProviderProperty::unwrap))
      }

      /**
       * @param virtualRouter The virtual router associated with a virtual service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bffc8c5e4d3b4fc7ba849b41ba9f285e4cfa816dd9b4ed70c273c9de61860507")
      override
          fun virtualRouter(virtualRouter: VirtualRouterServiceProviderProperty.Builder.() -> Unit):
          Unit = virtualRouter(VirtualRouterServiceProviderProperty(virtualRouter))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty,
    ) : CdkObject(cdkObject), VirtualServiceProviderProperty {
      /**
       * The virtual node associated with a virtual service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html#cfn-appmesh-virtualservice-virtualserviceprovider-virtualnode)
       */
      override fun virtualNode(): Any? = unwrap(this).getVirtualNode()

      /**
       * The virtual router associated with a virtual service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html#cfn-appmesh-virtualservice-virtualserviceprovider-virtualrouter)
       */
      override fun virtualRouter(): Any? = unwrap(this).getVirtualRouter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty):
          VirtualServiceProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualServiceProviderProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty
    }
  }

  public interface VirtualNodeServiceProviderProperty {
    /**
     * The name of the virtual node that is acting as a service provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html#cfn-appmesh-virtualservice-virtualnodeserviceprovider-virtualnodename)
     */
    public fun virtualNodeName(): String

    /**
     * A builder for [VirtualNodeServiceProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param virtualNodeName The name of the virtual node that is acting as a service provider. 
       */
      public fun virtualNodeName(virtualNodeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty.builder()

      /**
       * @param virtualNodeName The name of the virtual node that is acting as a service provider. 
       */
      override fun virtualNodeName(virtualNodeName: String) {
        cdkBuilder.virtualNodeName(virtualNodeName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty,
    ) : CdkObject(cdkObject), VirtualNodeServiceProviderProperty {
      /**
       * The name of the virtual node that is acting as a service provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html#cfn-appmesh-virtualservice-virtualnodeserviceprovider-virtualnodename)
       */
      override fun virtualNodeName(): String = unwrap(this).getVirtualNodeName()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualNodeServiceProviderProperty
    }
  }
}
