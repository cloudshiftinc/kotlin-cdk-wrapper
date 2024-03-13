package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AclTrafficConfig {
  public fun icmp(): AclIcmp? = unwrap(this).getIcmp()?.let(AclIcmp::wrap)

  public fun portRange(): AclPortRange? = unwrap(this).getPortRange()?.let(AclPortRange::wrap)

  public fun protocol(): Number

  public interface Builder {
    public fun icmp(icmp: AclIcmp) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e56a33d7d345c850354b91021963b4324f6c22151277902bbec3809c06a1abc8")
    public fun icmp(icmp: AclIcmp.Builder.() -> Unit) {
    }

    public fun portRange(portRange: AclPortRange) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ceec31fc9e4e317544e8873943176564916bdb0423ed5677ecab1a5e4f23f2b3")
    public fun portRange(portRange: AclPortRange.Builder.() -> Unit) {
    }

    public fun protocol(protocol: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclTrafficConfig.Builder =
        software.amazon.awscdk.services.ec2.AclTrafficConfig.builder()

    public override fun icmp(icmp: AclIcmp) {
      cdkBuilder.icmp(icmp.let(AclIcmp::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e56a33d7d345c850354b91021963b4324f6c22151277902bbec3809c06a1abc8")
    public override fun icmp(icmp: AclIcmp.Builder.() -> Unit): Unit = icmp(AclIcmp(icmp))

    public override fun portRange(portRange: AclPortRange) {
      cdkBuilder.portRange(portRange.let(AclPortRange::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ceec31fc9e4e317544e8873943176564916bdb0423ed5677ecab1a5e4f23f2b3")
    public override fun portRange(portRange: AclPortRange.Builder.() -> Unit): Unit =
        portRange(AclPortRange(portRange))

    public override fun protocol(protocol: Number) {
      cdkBuilder.protocol(protocol)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclTrafficConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AclTrafficConfig,
  ) : AclTrafficConfig {
    public override fun icmp(): AclIcmp? = unwrap(this).getIcmp()?.let(AclIcmp::wrap)

    public override fun portRange(): AclPortRange? =
        unwrap(this).getPortRange()?.let(AclPortRange::wrap)

    public override fun protocol(): Number = unwrap(this).getProtocol()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AclTrafficConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclTrafficConfig):
        AclTrafficConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclTrafficConfig):
        software.amazon.awscdk.services.ec2.AclTrafficConfig = (wrapped as Wrapper).cdkObject
  }
}
