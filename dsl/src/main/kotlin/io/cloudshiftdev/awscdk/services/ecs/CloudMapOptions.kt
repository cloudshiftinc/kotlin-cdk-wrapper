package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.servicediscovery.DnsRecordType
import io.cloudshiftdev.awscdk.services.servicediscovery.INamespace
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CloudMapOptions {
  public fun cloudMapNamespace(): INamespace? =
      unwrap(this).getCloudMapNamespace()?.let(INamespace::wrap)

  public fun container(): ContainerDefinition? =
      unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  public fun dnsRecordType(): DnsRecordType? =
      unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

  public fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  public fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun cloudMapNamespace(cloudMapNamespace: INamespace) {
    }

    public fun container(container: ContainerDefinition) {
    }

    public fun containerPort(containerPort: Number) {
    }

    public fun dnsRecordType(dnsRecordType: DnsRecordType) {
    }

    public fun dnsTtl(dnsTtl: Duration) {
    }

    public fun failureThreshold(failureThreshold: Number) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CloudMapOptions.Builder =
        software.amazon.awscdk.services.ecs.CloudMapOptions.builder()

    public override fun cloudMapNamespace(cloudMapNamespace: INamespace) {
      cdkBuilder.cloudMapNamespace(cloudMapNamespace.let(INamespace::unwrap))
    }

    public override fun container(container: ContainerDefinition) {
      cdkBuilder.container(container.let(ContainerDefinition::unwrap))
    }

    public override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    public override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType::unwrap))
    }

    public override fun dnsTtl(dnsTtl: Duration) {
      cdkBuilder.dnsTtl(dnsTtl.let(Duration::unwrap))
    }

    public override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CloudMapOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.CloudMapOptions,
  ) : CloudMapOptions {
    public override fun cloudMapNamespace(): INamespace? =
        unwrap(this).getCloudMapNamespace()?.let(INamespace::wrap)

    public override fun container(): ContainerDefinition? =
        unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

    public override fun containerPort(): Number? = unwrap(this).getContainerPort()

    public override fun dnsRecordType(): DnsRecordType? =
        unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

    public override fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

    public override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    public override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CloudMapOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CloudMapOptions):
        CloudMapOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudMapOptions):
        software.amazon.awscdk.services.ecs.CloudMapOptions = (wrapped as Wrapper).cdkObject
  }
}
