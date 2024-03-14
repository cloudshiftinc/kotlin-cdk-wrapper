package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface RequestedSubnet {
  public fun availabilityZone(): String

  public fun configuration(): SubnetConfiguration

  public fun subnetConstructId(): String

  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun configuration(configuration: SubnetConfiguration)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3f87569b62eacfcfcda010420159d9d3ceee882f942f9f1a29533e4aac952cc")
    public fun configuration(configuration: SubnetConfiguration.Builder.() -> Unit)

    public fun subnetConstructId(subnetConstructId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.RequestedSubnet.Builder =
        software.amazon.awscdk.services.ec2.RequestedSubnet.builder()

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun configuration(configuration: SubnetConfiguration) {
      cdkBuilder.configuration(configuration.let(SubnetConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3f87569b62eacfcfcda010420159d9d3ceee882f942f9f1a29533e4aac952cc")
    override fun configuration(configuration: SubnetConfiguration.Builder.() -> Unit): Unit =
        configuration(SubnetConfiguration(configuration))

    override fun subnetConstructId(subnetConstructId: String) {
      cdkBuilder.subnetConstructId(subnetConstructId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.RequestedSubnet = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.RequestedSubnet,
  ) : RequestedSubnet {
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun configuration(): SubnetConfiguration =
        unwrap(this).getConfiguration().let(SubnetConfiguration::wrap)

    override fun subnetConstructId(): String = unwrap(this).getSubnetConstructId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RequestedSubnet {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.RequestedSubnet):
        RequestedSubnet = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestedSubnet):
        software.amazon.awscdk.services.ec2.RequestedSubnet = (wrapped as Wrapper).cdkObject
  }
}
