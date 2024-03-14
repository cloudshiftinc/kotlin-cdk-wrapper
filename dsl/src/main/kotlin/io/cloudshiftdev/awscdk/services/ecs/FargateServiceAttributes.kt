package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit

public interface FargateServiceAttributes {
  public fun cluster(): ICluster

  public fun serviceArn(): String? = unwrap(this).getServiceArn()

  public fun serviceName(): String? = unwrap(this).getServiceName()

  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun serviceArn(serviceArn: String)

    public fun serviceName(serviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateServiceAttributes.Builder =
        software.amazon.awscdk.services.ecs.FargateServiceAttributes.builder()

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.ecs.FargateServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.FargateServiceAttributes,
  ) : FargateServiceAttributes {
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun serviceArn(): String? = unwrap(this).getServiceArn()

    override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FargateServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateServiceAttributes):
        FargateServiceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateServiceAttributes):
        software.amazon.awscdk.services.ecs.FargateServiceAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
