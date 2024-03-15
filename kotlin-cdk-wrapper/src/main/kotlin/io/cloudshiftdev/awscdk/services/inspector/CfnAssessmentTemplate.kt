@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssessmentTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTemplate,
) : CfnResource(cdkObject), IInspectable {
  public open fun assessmentTargetArn(): String = unwrap(this).getAssessmentTargetArn()

  public open fun assessmentTargetArn(`value`: String) {
    unwrap(this).setAssessmentTargetArn(`value`)
  }

  public open fun assessmentTemplateName(): String? = unwrap(this).getAssessmentTemplateName()

  public open fun assessmentTemplateName(`value`: String) {
    unwrap(this).setAssessmentTemplateName(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun durationInSeconds(): Number = unwrap(this).getDurationInSeconds()

  public open fun durationInSeconds(`value`: Number) {
    unwrap(this).setDurationInSeconds(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun rulesPackageArns(): List<String> = unwrap(this).getRulesPackageArns()

  public open fun rulesPackageArns(`value`: List<String>) {
    unwrap(this).setRulesPackageArns(`value`)
  }

  public open fun rulesPackageArns(vararg `value`: String): Unit =
      rulesPackageArns(`value`.toList())

  public open fun userAttributesForFindings(): Any? = unwrap(this).getUserAttributesForFindings()

  public open fun userAttributesForFindings(`value`: IResolvable) {
    unwrap(this).setUserAttributesForFindings(`value`.let(IResolvable::unwrap))
  }

  public open fun userAttributesForFindings(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserAttributesForFindings(__idx_ac66f0)
  }

  public open fun userAttributesForFindings(vararg __idx_ac66f0: Any): Unit =
      userAttributesForFindings(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun assessmentTargetArn(assessmentTargetArn: String)

    public fun assessmentTemplateName(assessmentTemplateName: String)

    public fun durationInSeconds(durationInSeconds: Number)

    public fun rulesPackageArns(rulesPackageArns: List<String>)

    public fun rulesPackageArns(vararg rulesPackageArns: String)

    public fun userAttributesForFindings(userAttributesForFindings: IResolvable)

    public fun userAttributesForFindings(userAttributesForFindings: List<Any>)

    public fun userAttributesForFindings(vararg userAttributesForFindings: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspector.CfnAssessmentTemplate.Builder
        = software.amazon.awscdk.services.inspector.CfnAssessmentTemplate.Builder.create(scope, id)

    override fun assessmentTargetArn(assessmentTargetArn: String) {
      cdkBuilder.assessmentTargetArn(assessmentTargetArn)
    }

    override fun assessmentTemplateName(assessmentTemplateName: String) {
      cdkBuilder.assessmentTemplateName(assessmentTemplateName)
    }

    override fun durationInSeconds(durationInSeconds: Number) {
      cdkBuilder.durationInSeconds(durationInSeconds)
    }

    override fun rulesPackageArns(rulesPackageArns: List<String>) {
      cdkBuilder.rulesPackageArns(rulesPackageArns)
    }

    override fun rulesPackageArns(vararg rulesPackageArns: String): Unit =
        rulesPackageArns(rulesPackageArns.toList())

    override fun userAttributesForFindings(userAttributesForFindings: IResolvable) {
      cdkBuilder.userAttributesForFindings(userAttributesForFindings.let(IResolvable::unwrap))
    }

    override fun userAttributesForFindings(userAttributesForFindings: List<Any>) {
      cdkBuilder.userAttributesForFindings(userAttributesForFindings)
    }

    override fun userAttributesForFindings(vararg userAttributesForFindings: Any): Unit =
        userAttributesForFindings(userAttributesForFindings.toList())

    public fun build(): software.amazon.awscdk.services.inspector.CfnAssessmentTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.inspector.CfnAssessmentTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssessmentTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssessmentTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTemplate):
        CfnAssessmentTemplate = CfnAssessmentTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnAssessmentTemplate):
        software.amazon.awscdk.services.inspector.CfnAssessmentTemplate = wrapped.cdkObject
  }
}
