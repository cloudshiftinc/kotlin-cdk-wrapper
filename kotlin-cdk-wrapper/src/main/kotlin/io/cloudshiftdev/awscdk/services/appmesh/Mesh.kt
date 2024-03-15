@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Mesh internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.Mesh,
) : Resource(cdkObject), IMesh {
  public override fun addVirtualGateway(id: String): VirtualGateway =
      unwrap(this).addVirtualGateway(id).let(VirtualGateway::wrap)

  public override fun addVirtualGateway(id: String, props: VirtualGatewayBaseProps): VirtualGateway
      = unwrap(this).addVirtualGateway(id,
      props.let(VirtualGatewayBaseProps::unwrap)).let(VirtualGateway::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("806769f186eaec3fa9e3209acdf24765b05ef2369fd0cab34a25f9215b419f1a")
  public override fun addVirtualGateway(id: String,
      props: VirtualGatewayBaseProps.Builder.() -> Unit): VirtualGateway = addVirtualGateway(id,
      VirtualGatewayBaseProps(props))

  public override fun addVirtualNode(id: String): VirtualNode =
      unwrap(this).addVirtualNode(id).let(VirtualNode::wrap)

  public override fun addVirtualNode(id: String, props: VirtualNodeBaseProps): VirtualNode =
      unwrap(this).addVirtualNode(id,
      props.let(VirtualNodeBaseProps::unwrap)).let(VirtualNode::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("22cc54ebf16a50a601a96aa1328e0f5a527ace6c6fde8555f4d2981b06f92ec2")
  public override fun addVirtualNode(id: String, props: VirtualNodeBaseProps.Builder.() -> Unit):
      VirtualNode = addVirtualNode(id, VirtualNodeBaseProps(props))

  public override fun addVirtualRouter(id: String): VirtualRouter =
      unwrap(this).addVirtualRouter(id).let(VirtualRouter::wrap)

  public override fun addVirtualRouter(id: String, props: VirtualRouterBaseProps): VirtualRouter =
      unwrap(this).addVirtualRouter(id,
      props.let(VirtualRouterBaseProps::unwrap)).let(VirtualRouter::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ef76fc2c94e3105862487f46bac7bb438d623fe852d72b8a9b2f8e55302bff2")
  public override fun addVirtualRouter(id: String,
      props: VirtualRouterBaseProps.Builder.() -> Unit): VirtualRouter = addVirtualRouter(id,
      VirtualRouterBaseProps(props))

  public override fun meshArn(): String = unwrap(this).getMeshArn()

  public override fun meshName(): String = unwrap(this).getMeshName()

  @CdkDslMarker
  public interface Builder {
    public fun egressFilter(egressFilter: MeshFilterType)

    public fun meshName(meshName: String)

    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f46f06016003ebdf0c0bf2751b049660800532528bdd97c5e4a5abda4a0c0df7")
    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.Mesh.Builder =
        software.amazon.awscdk.services.appmesh.Mesh.Builder.create(scope, id)

    override fun egressFilter(egressFilter: MeshFilterType) {
      cdkBuilder.egressFilter(egressFilter.let(MeshFilterType::unwrap))
    }

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery) {
      cdkBuilder.serviceDiscovery(serviceDiscovery.let(MeshServiceDiscovery::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f46f06016003ebdf0c0bf2751b049660800532528bdd97c5e4a5abda4a0c0df7")
    override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery.Builder.() -> Unit): Unit =
        serviceDiscovery(MeshServiceDiscovery(serviceDiscovery))

    public fun build(): software.amazon.awscdk.services.appmesh.Mesh = cdkBuilder.build()
  }

  public companion object {
    public fun fromMeshArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      meshArn: String,
    ): IMesh =
        software.amazon.awscdk.services.appmesh.Mesh.fromMeshArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, meshArn).let(IMesh::wrap)

    public fun fromMeshName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      meshName: String,
    ): IMesh =
        software.amazon.awscdk.services.appmesh.Mesh.fromMeshName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, meshName).let(IMesh::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Mesh {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Mesh(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Mesh): Mesh =
        Mesh(cdkObject)

    internal fun unwrap(wrapped: Mesh): software.amazon.awscdk.services.appmesh.Mesh =
        wrapped.cdkObject
  }
}
