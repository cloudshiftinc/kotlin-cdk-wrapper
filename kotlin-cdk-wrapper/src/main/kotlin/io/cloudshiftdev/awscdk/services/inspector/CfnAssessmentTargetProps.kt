@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnAssessmentTargetProps {
  public fun assessmentTargetName(): String? = unwrap(this).getAssessmentTargetName()

  public fun resourceGroupArn(): String? = unwrap(this).getResourceGroupArn()

  @CdkDslMarker
  public interface Builder {
    public fun assessmentTargetName(assessmentTargetName: String)

    public fun resourceGroupArn(resourceGroupArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder =
        software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.builder()

    override fun assessmentTargetName(assessmentTargetName: String) {
      cdkBuilder.assessmentTargetName(assessmentTargetName)
    }

    override fun resourceGroupArn(resourceGroupArn: String) {
      cdkBuilder.resourceGroupArn(resourceGroupArn)
    }

    public fun build(): software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps,
  ) : CdkObject(cdkObject), CfnAssessmentTargetProps {
    override fun assessmentTargetName(): String? = unwrap(this).getAssessmentTargetName()

    override fun resourceGroupArn(): String? = unwrap(this).getResourceGroupArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssessmentTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps):
        CfnAssessmentTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssessmentTargetProps):
        software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps
  }
}
