package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit

public interface AuthorizationConfig {
  public fun accessPointId(): String? = unwrap(this).getAccessPointId()

  public fun iam(): String? = unwrap(this).getIam()

  public interface Builder {
    public fun accessPointId(accessPointId: String) {
    }

    public fun iam(iam: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AuthorizationConfig.Builder =
        software.amazon.awscdk.services.ecs.AuthorizationConfig.builder()

    public override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    public override fun iam(iam: String) {
      cdkBuilder.iam(iam)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AuthorizationConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.AuthorizationConfig,
  ) : AuthorizationConfig {
    public override fun accessPointId(): String? = unwrap(this).getAccessPointId()

    public override fun iam(): String? = unwrap(this).getIam()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AuthorizationConfig):
        AuthorizationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthorizationConfig):
        software.amazon.awscdk.services.ecs.AuthorizationConfig = (wrapped as Wrapper).cdkObject
  }
}
