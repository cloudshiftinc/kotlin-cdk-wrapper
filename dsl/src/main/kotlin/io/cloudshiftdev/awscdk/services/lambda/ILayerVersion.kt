package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ILayerVersion : IResource {
  public fun addPermission(arg0: String, arg1: LayerVersionPermission)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eec498e4e61d6da6cbaf711269e77f3d0940f81924a2490180fb8f64482ccdbd")
  public fun addPermission(arg0: String, arg1: LayerVersionPermission.Builder.() -> Unit)

  public fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  public fun layerVersionArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.ILayerVersion,
  ) : ILayerVersion {
    public override fun addPermission(arg0: String, arg1: LayerVersionPermission) {
      unwrap(this).addPermission(arg0, arg1.let(LayerVersionPermission::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eec498e4e61d6da6cbaf711269e77f3d0940f81924a2490180fb8f64482ccdbd")
    public override fun addPermission(arg0: String,
        arg1: LayerVersionPermission.Builder.() -> Unit): Unit = addPermission(arg0,
        LayerVersionPermission(arg1))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun compatibleRuntimes(): List<Runtime> =
        unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ILayerVersion):
        ILayerVersion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILayerVersion):
        software.amazon.awscdk.services.lambda.ILayerVersion = (wrapped as Wrapper).cdkObject
  }
}
