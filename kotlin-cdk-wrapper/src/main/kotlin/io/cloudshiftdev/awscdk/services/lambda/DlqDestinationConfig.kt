@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A destination configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * DlqDestinationConfig dlqDestinationConfig = DlqDestinationConfig.builder()
 * .destination("destination")
 * .build();
 * ```
 */
public interface DlqDestinationConfig {
  /**
   * The Amazon Resource Name (ARN) of the destination resource.
   */
  public fun destination(): String

  /**
   * A builder for [DlqDestinationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination The Amazon Resource Name (ARN) of the destination resource. 
     */
    public fun destination(destination: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DlqDestinationConfig.Builder =
        software.amazon.awscdk.services.lambda.DlqDestinationConfig.builder()

    /**
     * @param destination The Amazon Resource Name (ARN) of the destination resource. 
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    public fun build(): software.amazon.awscdk.services.lambda.DlqDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.DlqDestinationConfig,
  ) : CdkObject(cdkObject),
      DlqDestinationConfig {
    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     */
    override fun destination(): String = unwrap(this).getDestination()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DlqDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DlqDestinationConfig):
        DlqDestinationConfig = CdkObjectWrappers.wrap(cdkObject) as? DlqDestinationConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DlqDestinationConfig):
        software.amazon.awscdk.services.lambda.DlqDestinationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.DlqDestinationConfig
  }
}
