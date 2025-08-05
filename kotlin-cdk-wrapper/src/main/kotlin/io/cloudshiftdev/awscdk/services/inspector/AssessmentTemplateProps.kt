@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for creating an Inspector Assessment Template TODO: Add properties and remove
 * "props-physical-name:aws-cdk-lib.aws_inspector.AssessmentTemplateProps" from `awslint.json` when
 * implementing the L2 construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.inspector.*;
 * AssessmentTemplateProps assessmentTemplateProps = AssessmentTemplateProps.builder().build();
 * ```
 */
public interface AssessmentTemplateProps {
  /**
   * A builder for [AssessmentTemplateProps]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspector.AssessmentTemplateProps.Builder =
        software.amazon.awscdk.services.inspector.AssessmentTemplateProps.builder()

    public fun build(): software.amazon.awscdk.services.inspector.AssessmentTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.inspector.AssessmentTemplateProps,
  ) : CdkObject(cdkObject),
      AssessmentTemplateProps

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssessmentTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspector.AssessmentTemplateProps):
        AssessmentTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? AssessmentTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssessmentTemplateProps):
        software.amazon.awscdk.services.inspector.AssessmentTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspector.AssessmentTemplateProps
  }
}
