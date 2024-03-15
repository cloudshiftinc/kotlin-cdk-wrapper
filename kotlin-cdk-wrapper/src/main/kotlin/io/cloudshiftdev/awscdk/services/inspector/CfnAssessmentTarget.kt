@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssessmentTarget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTarget,
) : CfnResource(cdkObject), IInspectable {
  public open fun assessmentTargetName(): String? = unwrap(this).getAssessmentTargetName()

  public open fun assessmentTargetName(`value`: String) {
    unwrap(this).setAssessmentTargetName(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceGroupArn(): String? = unwrap(this).getResourceGroupArn()

  public open fun resourceGroupArn(`value`: String) {
    unwrap(this).setResourceGroupArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun assessmentTargetName(assessmentTargetName: String)

    public fun resourceGroupArn(resourceGroupArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspector.CfnAssessmentTarget.Builder =
        software.amazon.awscdk.services.inspector.CfnAssessmentTarget.Builder.create(scope, id)

    override fun assessmentTargetName(assessmentTargetName: String) {
      cdkBuilder.assessmentTargetName(assessmentTargetName)
    }

    override fun resourceGroupArn(resourceGroupArn: String) {
      cdkBuilder.resourceGroupArn(resourceGroupArn)
    }

    public fun build(): software.amazon.awscdk.services.inspector.CfnAssessmentTarget =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.inspector.CfnAssessmentTarget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssessmentTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssessmentTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTarget):
        CfnAssessmentTarget = CfnAssessmentTarget(cdkObject)

    internal fun unwrap(wrapped: CfnAssessmentTarget):
        software.amazon.awscdk.services.inspector.CfnAssessmentTarget = wrapped.cdkObject
  }
}
