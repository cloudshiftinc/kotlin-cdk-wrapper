@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Used for configuring schema bind behavior.
 *
 * This is intended to prevent breaking changes to implementors of ISchema
 * if needing to add new behavior.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * SchemaBindOptions schemaBindOptions = SchemaBindOptions.builder().build();
 * ```
 */
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
        SchemaBindOptions = CdkObjectWrappers.wrap(cdkObject) as? SchemaBindOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SchemaBindOptions):
        software.amazon.awscdk.services.appsync.SchemaBindOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.SchemaBindOptions
  }
}
