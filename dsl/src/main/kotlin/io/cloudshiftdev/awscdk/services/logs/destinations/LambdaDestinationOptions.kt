package io.cloudshiftdev.awscdk.services.logs.destinations

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface LambdaDestinationOptions {
  /**
   * Whether or not to add Lambda Permissions.
   *
   * Default: true
   */
  public fun addPermissions(): Boolean? = unwrap(this).getAddPermissions()

  /**
   * A builder for [LambdaDestinationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addPermissions Whether or not to add Lambda Permissions.
     */
    public fun addPermissions(addPermissions: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions.Builder =
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions.builder()

    /**
     * @param addPermissions Whether or not to add Lambda Permissions.
     */
    override fun addPermissions(addPermissions: Boolean) {
      cdkBuilder.addPermissions(addPermissions)
    }

    public fun build(): software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions,
  ) : CdkObject(cdkObject), LambdaDestinationOptions {
    /**
     * Whether or not to add Lambda Permissions.
     *
     * Default: true
     */
    override fun addPermissions(): Boolean? = unwrap(this).getAddPermissions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions):
        LambdaDestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDestinationOptions):
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions
  }
}
