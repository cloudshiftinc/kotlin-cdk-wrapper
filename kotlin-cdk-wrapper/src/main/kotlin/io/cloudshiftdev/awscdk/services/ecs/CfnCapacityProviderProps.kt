@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCapacityProviderProps {
  public fun autoScalingGroupProvider(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable)

    public
        fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fc44dc003eac75329c00cde7b7197884272f4d231cfb1a2efc6554d839cd80f")
    public
        fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnCapacityProviderProps.Builder =
        software.amazon.awscdk.services.ecs.CfnCapacityProviderProps.builder()

    override fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable) {
      cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider.let(IResolvable::unwrap))
    }

    override
        fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty) {
      cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider.let(CfnCapacityProvider.AutoScalingGroupProviderProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fc44dc003eac75329c00cde7b7197884272f4d231cfb1a2efc6554d839cd80f")
    override
        fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder.() -> Unit):
        Unit =
        autoScalingGroupProvider(CfnCapacityProvider.AutoScalingGroupProviderProperty(autoScalingGroupProvider))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnCapacityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProviderProps,
  ) : CdkObject(cdkObject), CfnCapacityProviderProps {
    override fun autoScalingGroupProvider(): Any = unwrap(this).getAutoScalingGroupProvider()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapacityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProviderProps):
        CfnCapacityProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityProviderProps):
        software.amazon.awscdk.services.ecs.CfnCapacityProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnCapacityProviderProps
  }
}
