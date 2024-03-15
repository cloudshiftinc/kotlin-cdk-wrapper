@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun cloudMapNamespace(cloudMapNamespace: INamespace)

    public fun container(container: ContainerDefinition)

    public fun containerPort(containerPort: Number)

    public fun dnsRecordType(dnsRecordType: DnsRecordType)

    public fun dnsTtl(dnsTtl: Duration)

    public fun failureThreshold(failureThreshold: Number)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CloudMapOptions.Builder =
        software.amazon.awscdk.services.ecs.CloudMapOptions.builder()

    override fun cloudMapNamespace(cloudMapNamespace: INamespace) {
      cdkBuilder.cloudMapNamespace(cloudMapNamespace.let(INamespace::unwrap))
    }

    override fun container(container: ContainerDefinition) {
      cdkBuilder.container(container.let(ContainerDefinition::unwrap))
    }

    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType::unwrap))
    }

    override fun dnsTtl(dnsTtl: Duration) {
      cdkBuilder.dnsTtl(dnsTtl.let(Duration::unwrap))
    }

    override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CloudMapOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CloudMapOptions,
  ) : CdkObject(cdkObject), CloudMapOptions {
    override fun cloudMapNamespace(): INamespace? =
        unwrap(this).getCloudMapNamespace()?.let(INamespace::wrap)

    override fun container(): ContainerDefinition? =
        unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

    override fun containerPort(): Number? = unwrap(this).getContainerPort()

    override fun dnsRecordType(): DnsRecordType? =
        unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

    override fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

    override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudMapOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CloudMapOptions):
        CloudMapOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudMapOptions):
        software.amazon.awscdk.services.ecs.CloudMapOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CloudMapOptions
  }
}
