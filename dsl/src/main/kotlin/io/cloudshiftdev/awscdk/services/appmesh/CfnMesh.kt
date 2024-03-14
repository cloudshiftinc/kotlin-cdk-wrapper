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

public open class CfnMesh internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The full Amazon Resource Name (ARN) for the mesh.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the service mesh.
   */
  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  /**
   * The IAM account ID of the service mesh owner.
   *
   * If the account ID is not your own, then it's the ID of the account that shared the mesh with
   * your account. For more information about mesh sharing, see [Working with Shared
   * Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   */
  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  /**
   * The IAM account ID of the resource owner.
   *
   * If the account ID is not your own, then it's the ID of the mesh owner or of another account
   * that the mesh is shared with. For more information about mesh sharing, see [Working with Shared
   * Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   */
  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  /**
   * The unique identifier for the mesh.
   */
  public open fun attrUid(): String = unwrap(this).getAttrUid()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name to use for the service mesh.
   */
  public open fun meshName(): String? = unwrap(this).getMeshName()

  /**
   * The name to use for the service mesh.
   */
  public open fun meshName(`value`: String) {
    unwrap(this).setMeshName(`value`)
  }

  /**
   * The service mesh specification to apply.
   */
  public open fun spec(): Any? = unwrap(this).getSpec()

  /**
   * The service mesh specification to apply.
   */
  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  /**
   * The service mesh specification to apply.
   */
  public open fun spec(`value`: MeshSpecProperty) {
    unwrap(this).setSpec(`value`.let(MeshSpecProperty::unwrap))
  }

  /**
   * The service mesh specification to apply.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0d46683ac6ef7bf26443e2dcac127a2d55efc9cfb5f2d52e1662a420e41031eb")
  public open fun spec(`value`: MeshSpecProperty.Builder.() -> Unit): Unit =
      spec(MeshSpecProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you can apply to the service mesh to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata that you can apply to the service mesh to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Optional metadata that you can apply to the service mesh to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.CfnMesh].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name to use for the service mesh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-meshname)
     * @param meshName The name to use for the service mesh. 
     */
    public fun meshName(meshName: String)

    /**
     * The service mesh specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-spec)
     * @param spec The service mesh specification to apply. 
     */
    public fun spec(spec: IResolvable)

    /**
     * The service mesh specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-spec)
     * @param spec The service mesh specification to apply. 
     */
    public fun spec(spec: MeshSpecProperty)

    /**
     * The service mesh specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-spec)
     * @param spec The service mesh specification to apply. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f512b8c042be862110c86fe0886eed35ca758820d713e0f0058dcf407b07ec")
    public fun spec(spec: MeshSpecProperty.Builder.() -> Unit)

    /**
     * Optional metadata that you can apply to the service mesh to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-tags)
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     * categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata that you can apply to the service mesh to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-tags)
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     * categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnMesh.Builder =
        software.amazon.awscdk.services.appmesh.CfnMesh.Builder.create(scope, id)

    /**
     * The name to use for the service mesh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-meshname)
     * @param meshName The name to use for the service mesh. 
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * The service mesh specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-spec)
     * @param spec The service mesh specification to apply. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * The service mesh specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-spec)
     * @param spec The service mesh specification to apply. 
     */
    override fun spec(spec: MeshSpecProperty) {
      cdkBuilder.spec(spec.let(MeshSpecProperty::unwrap))
    }

    /**
     * The service mesh specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-spec)
     * @param spec The service mesh specification to apply. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f512b8c042be862110c86fe0886eed35ca758820d713e0f0058dcf407b07ec")
    override fun spec(spec: MeshSpecProperty.Builder.() -> Unit): Unit =
        spec(MeshSpecProperty(spec))

    /**
     * Optional metadata that you can apply to the service mesh to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-tags)
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     * categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Optional metadata that you can apply to the service mesh to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-tags)
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     * categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.CfnMesh = cdkBuilder.build()
  }

  public companion object {
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
    /**
     * The IP version to use to control traffic within the mesh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshservicediscovery.html#cfn-appmesh-mesh-meshservicediscovery-ippreference)
     */
    public fun ipPreference(): String? = unwrap(this).getIpPreference()

    /**
     * A builder for [MeshServiceDiscoveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipPreference The IP version to use to control traffic within the mesh.
       */
      public fun ipPreference(ipPreference: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty.builder()

      /**
       * @param ipPreference The IP version to use to control traffic within the mesh.
       */
      override fun ipPreference(ipPreference: String) {
        cdkBuilder.ipPreference(ipPreference)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty,
    ) : CdkObject(cdkObject), MeshServiceDiscoveryProperty {
      /**
       * The IP version to use to control traffic within the mesh.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshservicediscovery.html#cfn-appmesh-mesh-meshservicediscovery-ippreference)
       */
      override fun ipPreference(): String? = unwrap(this).getIpPreference()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MeshServiceDiscoveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty):
          MeshServiceDiscoveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MeshServiceDiscoveryProperty):
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshServiceDiscoveryProperty
    }
  }

  public interface EgressFilterProperty {
    /**
     * The egress filter type.
     *
     * By default, the type is `DROP_ALL` , which allows egress only from virtual nodes to other
     * defined resources in the service mesh (and any traffic to `*.amazonaws.com` for AWS API calls).
     * You can set the egress filter type to `ALLOW_ALL` to allow egress to any endpoint inside or
     * outside of the service mesh.
     *
     *
     * If you specify any backends on a virtual node when using `ALLOW_ALL` , you must specifiy all
     * egress for that virtual node as backends. Otherwise, `ALLOW_ALL` will no longer work for that
     * virtual node.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html#cfn-appmesh-mesh-egressfilter-type)
     */
    public fun type(): String

    /**
     * A builder for [EgressFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The egress filter type. 
       * By default, the type is `DROP_ALL` , which allows egress only from virtual nodes to other
       * defined resources in the service mesh (and any traffic to `*.amazonaws.com` for AWS API
       * calls). You can set the egress filter type to `ALLOW_ALL` to allow egress to any endpoint
       * inside or outside of the service mesh.
       *
       *
       * If you specify any backends on a virtual node when using `ALLOW_ALL` , you must specifiy
       * all egress for that virtual node as backends. Otherwise, `ALLOW_ALL` will no longer work for
       * that virtual node.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty.builder()

      /**
       * @param type The egress filter type. 
       * By default, the type is `DROP_ALL` , which allows egress only from virtual nodes to other
       * defined resources in the service mesh (and any traffic to `*.amazonaws.com` for AWS API
       * calls). You can set the egress filter type to `ALLOW_ALL` to allow egress to any endpoint
       * inside or outside of the service mesh.
       *
       *
       * If you specify any backends on a virtual node when using `ALLOW_ALL` , you must specifiy
       * all egress for that virtual node as backends. Otherwise, `ALLOW_ALL` will no longer work for
       * that virtual node.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty,
    ) : CdkObject(cdkObject), EgressFilterProperty {
      /**
       * The egress filter type.
       *
       * By default, the type is `DROP_ALL` , which allows egress only from virtual nodes to other
       * defined resources in the service mesh (and any traffic to `*.amazonaws.com` for AWS API
       * calls). You can set the egress filter type to `ALLOW_ALL` to allow egress to any endpoint
       * inside or outside of the service mesh.
       *
       *
       * If you specify any backends on a virtual node when using `ALLOW_ALL` , you must specifiy
       * all egress for that virtual node as backends. Otherwise, `ALLOW_ALL` will no longer work for
       * that virtual node.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html#cfn-appmesh-mesh-egressfilter-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EgressFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty):
          EgressFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressFilterProperty):
          software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnMesh.EgressFilterProperty
    }
  }

  public interface MeshSpecProperty {
    /**
     * The egress filter rules for the service mesh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshspec.html#cfn-appmesh-mesh-meshspec-egressfilter)
     */
    public fun egressFilter(): Any? = unwrap(this).getEgressFilter()

    /**
     * An object that represents the service discovery information for a service mesh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshspec.html#cfn-appmesh-mesh-meshspec-servicediscovery)
     */
    public fun serviceDiscovery(): Any? = unwrap(this).getServiceDiscovery()

    /**
     * A builder for [MeshSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param egressFilter The egress filter rules for the service mesh.
       */
      public fun egressFilter(egressFilter: IResolvable)

      /**
       * @param egressFilter The egress filter rules for the service mesh.
       */
      public fun egressFilter(egressFilter: EgressFilterProperty)

      /**
       * @param egressFilter The egress filter rules for the service mesh.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("434960f3f5302cfc58ecbc63c003e3a27508adf23053398f9d203587f1b2c4b4")
      public fun egressFilter(egressFilter: EgressFilterProperty.Builder.() -> Unit)

      /**
       * @param serviceDiscovery An object that represents the service discovery information for a
       * service mesh.
       */
      public fun serviceDiscovery(serviceDiscovery: IResolvable)

      /**
       * @param serviceDiscovery An object that represents the service discovery information for a
       * service mesh.
       */
      public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryProperty)

      /**
       * @param serviceDiscovery An object that represents the service discovery information for a
       * service mesh.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78908713b26e8e55cd54c92a84f59957af4676699050c81f7f296fc4e8da97fe")
      public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty.builder()

      /**
       * @param egressFilter The egress filter rules for the service mesh.
       */
      override fun egressFilter(egressFilter: IResolvable) {
        cdkBuilder.egressFilter(egressFilter.let(IResolvable::unwrap))
      }

      /**
       * @param egressFilter The egress filter rules for the service mesh.
       */
      override fun egressFilter(egressFilter: EgressFilterProperty) {
        cdkBuilder.egressFilter(egressFilter.let(EgressFilterProperty::unwrap))
      }

      /**
       * @param egressFilter The egress filter rules for the service mesh.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("434960f3f5302cfc58ecbc63c003e3a27508adf23053398f9d203587f1b2c4b4")
      override fun egressFilter(egressFilter: EgressFilterProperty.Builder.() -> Unit): Unit =
          egressFilter(EgressFilterProperty(egressFilter))

      /**
       * @param serviceDiscovery An object that represents the service discovery information for a
       * service mesh.
       */
      override fun serviceDiscovery(serviceDiscovery: IResolvable) {
        cdkBuilder.serviceDiscovery(serviceDiscovery.let(IResolvable::unwrap))
      }

      /**
       * @param serviceDiscovery An object that represents the service discovery information for a
       * service mesh.
       */
      override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryProperty) {
        cdkBuilder.serviceDiscovery(serviceDiscovery.let(MeshServiceDiscoveryProperty::unwrap))
      }

      /**
       * @param serviceDiscovery An object that represents the service discovery information for a
       * service mesh.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78908713b26e8e55cd54c92a84f59957af4676699050c81f7f296fc4e8da97fe")
      override
          fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryProperty.Builder.() -> Unit):
          Unit = serviceDiscovery(MeshServiceDiscoveryProperty(serviceDiscovery))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty,
    ) : CdkObject(cdkObject), MeshSpecProperty {
      /**
       * The egress filter rules for the service mesh.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshspec.html#cfn-appmesh-mesh-meshspec-egressfilter)
       */
      override fun egressFilter(): Any? = unwrap(this).getEgressFilter()

      /**
       * An object that represents the service discovery information for a service mesh.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshspec.html#cfn-appmesh-mesh-meshspec-servicediscovery)
       */
      override fun serviceDiscovery(): Any? = unwrap(this).getServiceDiscovery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MeshSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty):
          MeshSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MeshSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty
    }
  }
}
