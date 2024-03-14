package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface Credentials {
  /**
   * The role to be assumed for executing the Task.
   */
  public fun role(): TaskRole

  /**
   * A builder for [Credentials]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param role The role to be assumed for executing the Task. 
     */
    public fun role(role: TaskRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Credentials.Builder =
        software.amazon.awscdk.services.stepfunctions.Credentials.builder()

    /**
     * @param role The role to be assumed for executing the Task. 
     */
    override fun role(role: TaskRole) {
      cdkBuilder.role(role.let(TaskRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Credentials =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.Credentials,
  ) : CdkObject(cdkObject), Credentials {
    /**
     * The role to be assumed for executing the Task.
     */
    override fun role(): TaskRole = unwrap(this).getRole().let(TaskRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Credentials {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Credentials):
        Credentials = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Credentials):
        software.amazon.awscdk.services.stepfunctions.Credentials = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.stepfunctions.Credentials
  }
}
