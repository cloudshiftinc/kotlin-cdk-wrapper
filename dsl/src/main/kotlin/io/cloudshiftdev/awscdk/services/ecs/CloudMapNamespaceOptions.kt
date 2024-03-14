package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.servicediscovery.NamespaceType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CloudMapNamespaceOptions {
  public fun name(): String

  public fun type(): NamespaceType? = unwrap(this).getType()?.let(NamespaceType::wrap)

  public fun useForServiceConnect(): Boolean? = unwrap(this).getUseForServiceConnect()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public interface Builder {
    public fun name(name: String) {
    }

    public fun type(type: NamespaceType) {
    }

    public fun useForServiceConnect(useForServiceConnect: Boolean) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions.Builder =
        software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions.builder()

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun type(type: NamespaceType) {
      cdkBuilder.type(type.let(NamespaceType::unwrap))
    }

    public override fun useForServiceConnect(useForServiceConnect: Boolean) {
      cdkBuilder.useForServiceConnect(useForServiceConnect)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions,
  ) : CloudMapNamespaceOptions {
    public override fun name(): String = unwrap(this).getName()

    public override fun type(): NamespaceType? = unwrap(this).getType()?.let(NamespaceType::wrap)

    public override fun useForServiceConnect(): Boolean? = unwrap(this).getUseForServiceConnect()

    public override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CloudMapNamespaceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions):
        CloudMapNamespaceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudMapNamespaceOptions):
        software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions = (wrapped as
        Wrapper).cdkObject
  }
}
