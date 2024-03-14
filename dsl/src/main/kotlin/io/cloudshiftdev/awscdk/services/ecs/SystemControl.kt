package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit

public interface SystemControl {
  public fun namespace(): String

  public fun `value`(): String

  public interface Builder {
    public fun namespace(namespace: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SystemControl.Builder =
        software.amazon.awscdk.services.ecs.SystemControl.builder()

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SystemControl = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.SystemControl,
  ) : SystemControl {
    override fun namespace(): String = unwrap(this).getNamespace()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SystemControl {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SystemControl): SystemControl =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SystemControl): software.amazon.awscdk.services.ecs.SystemControl =
        (wrapped as Wrapper).cdkObject
  }
}
