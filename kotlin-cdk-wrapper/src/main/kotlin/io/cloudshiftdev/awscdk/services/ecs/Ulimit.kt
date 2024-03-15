@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface Ulimit {
  public fun hardLimit(): Number

  public fun name(): UlimitName

  public fun softLimit(): Number

  @CdkDslMarker
  public interface Builder {
    public fun hardLimit(hardLimit: Number)

    public fun name(name: UlimitName)

    public fun softLimit(softLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ulimit.Builder =
        software.amazon.awscdk.services.ecs.Ulimit.builder()

    override fun hardLimit(hardLimit: Number) {
      cdkBuilder.hardLimit(hardLimit)
    }

    override fun name(name: UlimitName) {
      cdkBuilder.name(name.let(UlimitName::unwrap))
    }

    override fun softLimit(softLimit: Number) {
      cdkBuilder.softLimit(softLimit)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Ulimit = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Ulimit,
  ) : CdkObject(cdkObject), Ulimit {
    override fun hardLimit(): Number = unwrap(this).getHardLimit()

    override fun name(): UlimitName = unwrap(this).getName().let(UlimitName::wrap)

    override fun softLimit(): Number = unwrap(this).getSoftLimit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ulimit {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ulimit): Ulimit =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ulimit): software.amazon.awscdk.services.ecs.Ulimit = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Ulimit
  }
}
