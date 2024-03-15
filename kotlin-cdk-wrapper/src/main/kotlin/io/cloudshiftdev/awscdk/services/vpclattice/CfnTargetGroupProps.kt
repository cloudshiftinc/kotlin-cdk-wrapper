@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTargetGroupProps {
  public fun config(): Any? = unwrap(this).getConfig()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targets(): Any? = unwrap(this).getTargets()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun config(config: IResolvable)

    public fun config(config: CfnTargetGroup.TargetGroupConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fcc5c025da17d7db1d7bba89e77c4b1829c4a87ecb7a618bb3b9b82fdec0b07")
    public fun config(config: CfnTargetGroup.TargetGroupConfigProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps.builder()

    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    override fun config(config: CfnTargetGroup.TargetGroupConfigProperty) {
      cdkBuilder.config(config.let(CfnTargetGroup.TargetGroupConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fcc5c025da17d7db1d7bba89e77c4b1829c4a87ecb7a618bb3b9b82fdec0b07")
    override fun config(config: CfnTargetGroup.TargetGroupConfigProperty.Builder.() -> Unit): Unit =
        config(CfnTargetGroup.TargetGroupConfigProperty(config))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps,
  ) : CdkObject(cdkObject), CfnTargetGroupProps {
    override fun config(): Any? = unwrap(this).getConfig()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targets(): Any? = unwrap(this).getTargets()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTargetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps):
        CfnTargetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTargetGroupProps):
        software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps
  }
}
