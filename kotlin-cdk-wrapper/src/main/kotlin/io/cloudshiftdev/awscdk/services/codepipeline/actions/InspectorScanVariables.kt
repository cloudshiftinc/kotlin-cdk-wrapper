@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The CodePipeline variables emitted by the InspectorScan Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * InspectorScanVariables inspectorScanVariables = InspectorScanVariables.builder()
 * .highestScannedSeverity("highestScannedSeverity")
 * .build();
 * ```
 */
public interface InspectorScanVariables {
  /**
   * The highest severity output from the scan.
   *
   * Valid values are medium | high | critical.
   */
  public fun highestScannedSeverity(): String

  /**
   * A builder for [InspectorScanVariables]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param highestScannedSeverity The highest severity output from the scan. 
     * Valid values are medium | high | critical.
     */
    public fun highestScannedSeverity(highestScannedSeverity: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.InspectorScanVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.InspectorScanVariables.builder()

    /**
     * @param highestScannedSeverity The highest severity output from the scan. 
     * Valid values are medium | high | critical.
     */
    override fun highestScannedSeverity(highestScannedSeverity: String) {
      cdkBuilder.highestScannedSeverity(highestScannedSeverity)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.InspectorScanVariables
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorScanVariables,
  ) : CdkObject(cdkObject),
      InspectorScanVariables {
    /**
     * The highest severity output from the scan.
     *
     * Valid values are medium | high | critical.
     */
    override fun highestScannedSeverity(): String = unwrap(this).getHighestScannedSeverity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InspectorScanVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.InspectorScanVariables):
        InspectorScanVariables = CdkObjectWrappers.wrap(cdkObject) as? InspectorScanVariables ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InspectorScanVariables):
        software.amazon.awscdk.services.codepipeline.actions.InspectorScanVariables = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.InspectorScanVariables
  }
}
