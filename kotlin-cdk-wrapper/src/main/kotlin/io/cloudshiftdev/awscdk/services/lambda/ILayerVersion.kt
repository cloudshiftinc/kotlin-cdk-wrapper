@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ILayerVersion : IResource {
  public fun addPermission(arg0: String, arg1: LayerVersionPermission)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eec498e4e61d6da6cbaf711269e77f3d0940f81924a2490180fb8f64482ccdbd")
  public fun addPermission(arg0: String, arg1: LayerVersionPermission.Builder.() -> Unit)

  public fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  public fun layerVersionArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.ILayerVersion,
  ) : CdkObject(cdkObject), ILayerVersion {
    override fun addPermission(arg0: String, arg1: LayerVersionPermission) {
      unwrap(this).addPermission(arg0, arg1.let(LayerVersionPermission::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eec498e4e61d6da6cbaf711269e77f3d0940f81924a2490180fb8f64482ccdbd")
    override fun addPermission(arg0: String, arg1: LayerVersionPermission.Builder.() -> Unit): Unit
        = addPermission(arg0, LayerVersionPermission(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun compatibleRuntimes(): List<Runtime> =
        unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ILayerVersion):
        ILayerVersion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILayerVersion):
        software.amazon.awscdk.services.lambda.ILayerVersion = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.ILayerVersion
  }
}
