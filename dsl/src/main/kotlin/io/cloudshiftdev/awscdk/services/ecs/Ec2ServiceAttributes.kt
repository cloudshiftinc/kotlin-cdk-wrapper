package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit

public interface Ec2ServiceAttributes {
  public fun cluster(): ICluster

  public fun serviceArn(): String? = unwrap(this).getServiceArn()

  public fun serviceName(): String? = unwrap(this).getServiceName()

  public interface Builder {
    public fun cluster(cluster: ICluster) {
    }

    public fun serviceArn(serviceArn: String) {
    }

    public fun serviceName(serviceName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2ServiceAttributes.Builder =
        software.amazon.awscdk.services.ecs.Ec2ServiceAttributes.builder()

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Ec2ServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.Ec2ServiceAttributes,
  ) : Ec2ServiceAttributes {
    public override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    public override fun serviceArn(): String? = unwrap(this).getServiceArn()

    public override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2ServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2ServiceAttributes):
        Ec2ServiceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2ServiceAttributes):
        software.amazon.awscdk.services.ecs.Ec2ServiceAttributes = (wrapped as Wrapper).cdkObject
  }
}
