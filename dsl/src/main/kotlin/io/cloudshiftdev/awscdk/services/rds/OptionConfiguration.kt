package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface OptionConfiguration {
  public fun name(): String

  public fun port(): Number? = unwrap(this).getPort()

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun settings(): Map<String, String> = unwrap(this).getSettings() ?: emptyMap()

  public fun version(): String? = unwrap(this).getVersion()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public interface Builder {
    public fun name(name: String)

    public fun port(port: Number)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun tings(settings: Map<String, String>)

    public fun version(version: String)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OptionConfiguration.Builder =
        software.amazon.awscdk.services.rds.OptionConfiguration.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun tings(settings: Map<String, String>) {
      cdkBuilder.settings(settings)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OptionConfiguration = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.OptionConfiguration,
  ) : OptionConfiguration {
    override fun name(): String = unwrap(this).getName()

    override fun port(): Number? = unwrap(this).getPort()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun settings(): Map<String, String> = unwrap(this).getSettings() ?: emptyMap()

    override fun version(): String? = unwrap(this).getVersion()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OptionConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OptionConfiguration):
        OptionConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OptionConfiguration):
        software.amazon.awscdk.services.rds.OptionConfiguration = (wrapped as Wrapper).cdkObject
  }
}
