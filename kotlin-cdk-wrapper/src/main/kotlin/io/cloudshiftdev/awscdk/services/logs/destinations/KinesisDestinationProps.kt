@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

public interface KinesisDestinationProps {
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps.Builder =
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps.builder()

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps,
  ) : CdkObject(cdkObject), KinesisDestinationProps {
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KinesisDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps):
        KinesisDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisDestinationProps):
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps
  }
}
