package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Number
import kotlin.Unit

public interface Ulimit {
  public fun hardLimit(): Number

  public fun name(): UlimitName

  public fun softLimit(): Number

  public interface Builder {
    public fun hardLimit(hardLimit: Number) {
    }

    public fun name(name: UlimitName) {
    }

    public fun softLimit(softLimit: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ulimit.Builder =
        software.amazon.awscdk.services.ecs.Ulimit.builder()

    public override fun hardLimit(hardLimit: Number) {
      cdkBuilder.hardLimit(hardLimit)
    }

    public override fun name(name: UlimitName) {
      cdkBuilder.name(name.let(UlimitName::unwrap))
    }

    public override fun softLimit(softLimit: Number) {
      cdkBuilder.softLimit(softLimit)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Ulimit = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.Ulimit,
  ) : Ulimit {
    public override fun hardLimit(): Number = unwrap(this).getHardLimit()

    public override fun name(): UlimitName = unwrap(this).getName().let(UlimitName::wrap)

    public override fun softLimit(): Number = unwrap(this).getSoftLimit()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Ulimit {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ulimit): Ulimit =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ulimit): software.amazon.awscdk.services.ecs.Ulimit = (wrapped as
        Wrapper).cdkObject
  }
}
