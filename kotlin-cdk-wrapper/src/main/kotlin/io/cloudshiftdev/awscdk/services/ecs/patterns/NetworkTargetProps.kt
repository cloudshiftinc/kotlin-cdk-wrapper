@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface NetworkTargetProps {
  public fun containerPort(): Number

  public fun listener(): String? = unwrap(this).getListener()

  @CdkDslMarker
  public interface Builder {
    public fun containerPort(containerPort: Number)

    public fun listener(listener: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps.Builder
        = software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps.builder()

    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    override fun listener(listener: String) {
      cdkBuilder.listener(listener)
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps,
  ) : CdkObject(cdkObject), NetworkTargetProps {
    override fun containerPort(): Number = unwrap(this).getContainerPort()

    override fun listener(): String? = unwrap(this).getListener()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps):
        NetworkTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkTargetProps):
        software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps
  }
}
