package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface SchemaBindOptions {
  /**
   * A builder for [SchemaBindOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SchemaBindOptions.Builder =
        software.amazon.awscdk.services.appsync.SchemaBindOptions.builder()

    public fun build(): software.amazon.awscdk.services.appsync.SchemaBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SchemaBindOptions,
  ) : CdkObject(cdkObject), SchemaBindOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SchemaBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SchemaBindOptions):
        SchemaBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SchemaBindOptions):
        software.amazon.awscdk.services.appsync.SchemaBindOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.SchemaBindOptions
  }
}