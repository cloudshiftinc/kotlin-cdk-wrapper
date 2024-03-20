@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a virtual router within a service mesh.
 *
 * Specify a `listener` for any inbound traffic that your virtual router receives. Create a virtual
 * router for each protocol and port that you need to route. Virtual routers handle traffic for one or
 * more virtual services within your mesh. After you create your virtual router, create and associate
 * routes for your virtual router that direct incoming requests to different virtual nodes.
 *
 * For more information about virtual routers, see [Virtual
 * routers](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_routers.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * CfnVirtualRouter cfnVirtualRouter = CfnVirtualRouter.Builder.create(this, "MyCfnVirtualRouter")
 * .meshName("meshName")
 * .spec(VirtualRouterSpecProperty.builder()
 * .listeners(List.of(VirtualRouterListenerProperty.builder()
 * .portMapping(PortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build()))
 * .build())
 * // the properties below are optional
 * .meshOwner("meshOwner")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .virtualRouterName("virtualRouterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html)
 */
public open class CfnVirtualRouter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVirtualRouterProps,
  ) :
      this(software.amazon.awscdk.services.appmesh.CfnVirtualRouter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnVirtualRouterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVirtualRouterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVirtualRouterProps(props)
  )

  /**
   * The full Amazon Resource Name (ARN) for the virtual router.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the service mesh that the virtual router resides in.
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
   * The unique identifier for the virtual router.
   */
  public open fun attrUid(): String = unwrap(this).getAttrUid()

  /**
   * The name of the virtual router.
   */
  public open fun attrVirtualRouterName(): String = unwrap(this).getAttrVirtualRouterName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the service mesh to create the virtual router in.
   */
  public open fun meshName(): String = unwrap(this).getMeshName()

  /**
   * The name of the service mesh to create the virtual router in.
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
   * The virtual router specification to apply.
   */
  public open fun spec(): Any = unwrap(this).getSpec()

  /**
   * The virtual router specification to apply.
   */
  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  /**
   * The virtual router specification to apply.
   */
  public open fun spec(`value`: VirtualRouterSpecProperty) {
    unwrap(this).setSpec(`value`.let(VirtualRouterSpecProperty::unwrap))
  }

  /**
   * The virtual router specification to apply.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("614f3bb2c4544dc6f7fa0ced8b25da933abd3e3b21800f970d645a38eeda9bb6")
  public open fun spec(`value`: VirtualRouterSpecProperty.Builder.() -> Unit): Unit =
      spec(VirtualRouterSpecProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you can apply to the virtual router to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata that you can apply to the virtual router to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Optional metadata that you can apply to the virtual router to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name to use for the virtual router.
   */
  public open fun virtualRouterName(): String? = unwrap(this).getVirtualRouterName()

  /**
   * The name to use for the virtual router.
   */
  public open fun virtualRouterName(`value`: String) {
    unwrap(this).setVirtualRouterName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.CfnVirtualRouter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the service mesh to create the virtual router in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshname)
     * @param meshName The name of the service mesh to create the virtual router in. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    public fun meshOwner(meshOwner: String)

    /**
     * The virtual router specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-spec)
     * @param spec The virtual router specification to apply. 
     */
    public fun spec(spec: IResolvable)

    /**
     * The virtual router specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-spec)
     * @param spec The virtual router specification to apply. 
     */
    public fun spec(spec: VirtualRouterSpecProperty)

    /**
     * The virtual router specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-spec)
     * @param spec The virtual router specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4adab77e464f114a3a2b32d80657205875f60e4232a06251eff7019e7d50b4ea")
    public fun spec(spec: VirtualRouterSpecProperty.Builder.() -> Unit)

    /**
     * Optional metadata that you can apply to the virtual router to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags)
     * @param tags Optional metadata that you can apply to the virtual router to assist with
     * categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata that you can apply to the virtual router to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags)
     * @param tags Optional metadata that you can apply to the virtual router to assist with
     * categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name to use for the virtual router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-virtualroutername)
     * @param virtualRouterName The name to use for the virtual router. 
     */
    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualRouter.Builder.create(scope, id)

    /**
     * The name of the service mesh to create the virtual router in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshname)
     * @param meshName The name of the service mesh to create the virtual router in. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * The virtual router specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-spec)
     * @param spec The virtual router specification to apply. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * The virtual router specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-spec)
     * @param spec The virtual router specification to apply. 
     */
    override fun spec(spec: VirtualRouterSpecProperty) {
      cdkBuilder.spec(spec.let(VirtualRouterSpecProperty::unwrap))
    }

    /**
     * The virtual router specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-spec)
     * @param spec The virtual router specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4adab77e464f114a3a2b32d80657205875f60e4232a06251eff7019e7d50b4ea")
    override fun spec(spec: VirtualRouterSpecProperty.Builder.() -> Unit): Unit =
        spec(VirtualRouterSpecProperty(spec))

    /**
     * Optional metadata that you can apply to the virtual router to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags)
     * @param tags Optional metadata that you can apply to the virtual router to assist with
     * categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Optional metadata that you can apply to the virtual router to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags)
     * @param tags Optional metadata that you can apply to the virtual router to assist with
     * categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name to use for the virtual router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-virtualroutername)
     * @param virtualRouterName The name to use for the virtual router. 
     */
    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualRouter =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appmesh.CfnVirtualRouter.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualRouter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualRouter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter):
        CfnVirtualRouter = CfnVirtualRouter(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualRouter):
        software.amazon.awscdk.services.appmesh.CfnVirtualRouter = wrapped.cdkObject
  }

  /**
   * An object that represents the specification of a virtual router.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualRouterSpecProperty virtualRouterSpecProperty = VirtualRouterSpecProperty.builder()
   * .listeners(List.of(VirtualRouterListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html)
   */
  public interface VirtualRouterSpecProperty {
    /**
     * The listeners that the virtual router is expected to receive inbound traffic from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners)
     */
    public fun listeners(): Any

    /**
     * A builder for [VirtualRouterSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param listeners The listeners that the virtual router is expected to receive inbound
       * traffic from. 
       */
      public fun listeners(listeners: IResolvable)

      /**
       * @param listeners The listeners that the virtual router is expected to receive inbound
       * traffic from. 
       */
      public fun listeners(listeners: List<Any>)

      /**
       * @param listeners The listeners that the virtual router is expected to receive inbound
       * traffic from. 
       */
      public fun listeners(vararg listeners: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty.builder()

      /**
       * @param listeners The listeners that the virtual router is expected to receive inbound
       * traffic from. 
       */
      override fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners.let(IResolvable::unwrap))
      }

      /**
       * @param listeners The listeners that the virtual router is expected to receive inbound
       * traffic from. 
       */
      override fun listeners(listeners: List<Any>) {
        cdkBuilder.listeners(listeners)
      }

      /**
       * @param listeners The listeners that the virtual router is expected to receive inbound
       * traffic from. 
       */
      override fun listeners(vararg listeners: Any): Unit = listeners(listeners.toList())

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty,
    ) : CdkObject(cdkObject), VirtualRouterSpecProperty {
      /**
       * The listeners that the virtual router is expected to receive inbound traffic from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners)
       */
      override fun listeners(): Any = unwrap(this).getListeners()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty):
          VirtualRouterSpecProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VirtualRouterSpecProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualRouterSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty
    }
  }

  /**
   * An object representing a virtual router listener port mapping.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * PortMappingProperty portMappingProperty = PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html)
   */
  public interface PortMappingProperty {
    /**
     * The port used for the port mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html#cfn-appmesh-virtualrouter-portmapping-port)
     */
    public fun port(): Number

    /**
     * The protocol used for the port mapping.
     *
     * Specify one protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html#cfn-appmesh-virtualrouter-portmapping-protocol)
     */
    public fun protocol(): String

    /**
     * A builder for [PortMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param port The port used for the port mapping. 
       */
      public fun port(port: Number)

      /**
       * @param protocol The protocol used for the port mapping. 
       * Specify one protocol.
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty.builder()

      /**
       * @param port The port used for the port mapping. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The protocol used for the port mapping. 
       * Specify one protocol.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty,
    ) : CdkObject(cdkObject), PortMappingProperty {
      /**
       * The port used for the port mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html#cfn-appmesh-virtualrouter-portmapping-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The protocol used for the port mapping.
       *
       * Specify one protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html#cfn-appmesh-virtualrouter-portmapping-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty):
          PortMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? PortMappingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortMappingProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty
    }
  }

  /**
   * An object that represents a virtual router listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualRouterListenerProperty virtualRouterListenerProperty =
   * VirtualRouterListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterlistener.html)
   */
  public interface VirtualRouterListenerProperty {
    /**
     * The port mapping information for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterlistener.html#cfn-appmesh-virtualrouter-virtualrouterlistener-portmapping)
     */
    public fun portMapping(): Any

    /**
     * A builder for [VirtualRouterListenerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param portMapping The port mapping information for the listener. 
       */
      public fun portMapping(portMapping: IResolvable)

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      public fun portMapping(portMapping: PortMappingProperty)

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("259fa42bf718471f6642c0dbaf6dbebf61498fe145bb69ea893b2762040d3d80")
      public fun portMapping(portMapping: PortMappingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty.builder()

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      override fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping.let(IResolvable::unwrap))
      }

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      override fun portMapping(portMapping: PortMappingProperty) {
        cdkBuilder.portMapping(portMapping.let(PortMappingProperty::unwrap))
      }

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("259fa42bf718471f6642c0dbaf6dbebf61498fe145bb69ea893b2762040d3d80")
      override fun portMapping(portMapping: PortMappingProperty.Builder.() -> Unit): Unit =
          portMapping(PortMappingProperty(portMapping))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty,
    ) : CdkObject(cdkObject), VirtualRouterListenerProperty {
      /**
       * The port mapping information for the listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterlistener.html#cfn-appmesh-virtualrouter-virtualrouterlistener-portmapping)
       */
      override fun portMapping(): Any = unwrap(this).getPortMapping()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterListenerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty):
          VirtualRouterListenerProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VirtualRouterListenerProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualRouterListenerProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty
    }
  }
}
