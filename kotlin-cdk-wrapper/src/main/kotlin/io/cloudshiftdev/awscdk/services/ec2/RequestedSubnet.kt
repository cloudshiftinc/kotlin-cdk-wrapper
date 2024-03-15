@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface RequestedSubnet {
  public fun availabilityZone(): String

  public fun configuration(): SubnetConfiguration

  public fun subnetConstructId(): String

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun configuration(configuration: SubnetConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3f87569b62eacfcfcda010420159d9d3ceee882f942f9f1a29533e4aac952cc")
    override fun configuration(configuration: SubnetConfiguration.Builder.() -> Unit): Unit =
        configuration(SubnetConfiguration(configuration))

    override fun subnetConstructId(subnetConstructId: String) {
      cdkBuilder.subnetConstructId(subnetConstructId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.RequestedSubnet = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.RequestedSubnet,
  ) : CdkObject(cdkObject), RequestedSubnet {
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun configuration(): SubnetConfiguration =
        unwrap(this).getConfiguration().let(SubnetConfiguration::wrap)

    override fun subnetConstructId(): String = unwrap(this).getSubnetConstructId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestedSubnet {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.RequestedSubnet):
        RequestedSubnet = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestedSubnet):
        software.amazon.awscdk.services.ec2.RequestedSubnet = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.RequestedSubnet
  }
}
