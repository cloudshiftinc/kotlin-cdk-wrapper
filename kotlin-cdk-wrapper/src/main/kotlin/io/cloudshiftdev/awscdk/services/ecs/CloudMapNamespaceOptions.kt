@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun type(type: NamespaceType)

    public fun useForServiceConnect(useForServiceConnect: Boolean)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions.Builder =
        software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun type(type: NamespaceType) {
      cdkBuilder.type(type.let(NamespaceType::unwrap))
    }

    override fun useForServiceConnect(useForServiceConnect: Boolean) {
      cdkBuilder.useForServiceConnect(useForServiceConnect)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions,
  ) : CdkObject(cdkObject), CloudMapNamespaceOptions {
    override fun name(): String = unwrap(this).getName()

    override fun type(): NamespaceType? = unwrap(this).getType()?.let(NamespaceType::wrap)

    override fun useForServiceConnect(): Boolean? = unwrap(this).getUseForServiceConnect()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudMapNamespaceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions):
        CloudMapNamespaceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudMapNamespaceOptions):
        software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions
  }
}
