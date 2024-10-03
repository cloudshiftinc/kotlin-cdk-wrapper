@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The attributes used to import existing Stage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * StageAttributes stageAttributes = StageAttributes.builder()
 * .stageName("stageName")
 * .build();
 * ```
 */
public interface StageAttributes {
  /**
   * The name of the stage.
   */
  public fun stageName(): String

  /**
   * A builder for [StageAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param stageName The name of the stage. 
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.StageAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.StageAttributes.builder()

    /**
     * @param stageName The name of the stage. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.StageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.StageAttributes,
  ) : CdkObject(cdkObject),
      StageAttributes {
    /**
     * The name of the stage.
     */
    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.StageAttributes):
        StageAttributes = CdkObjectWrappers.wrap(cdkObject) as? StageAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageAttributes):
        software.amazon.awscdk.services.apigatewayv2.StageAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.StageAttributes
  }
}
