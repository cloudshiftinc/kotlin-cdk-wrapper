@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnDistributionConfigurationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun distributions(): Any

  public fun name(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun distributions(distributions: IResolvable)

    public fun distributions(distributions: List<Any>)

    public fun distributions(vararg distributions: Any)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun distributions(distributions: IResolvable) {
      cdkBuilder.distributions(distributions.let(IResolvable::unwrap))
    }

    override fun distributions(distributions: List<Any>) {
      cdkBuilder.distributions(distributions)
    }

    override fun distributions(vararg distributions: Any): Unit =
        distributions(distributions.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build():
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps,
  ) : CdkObject(cdkObject), CfnDistributionConfigurationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun distributions(): Any = unwrap(this).getDistributions()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDistributionConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps):
        CfnDistributionConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionConfigurationProps):
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps
  }
}
