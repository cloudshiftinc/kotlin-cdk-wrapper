@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAssessmentTemplateProps {
  public fun assessmentTargetArn(): String

  public fun assessmentTemplateName(): String? = unwrap(this).getAssessmentTemplateName()

  public fun durationInSeconds(): Number

  public fun rulesPackageArns(): List<String>

  public fun userAttributesForFindings(): Any? = unwrap(this).getUserAttributesForFindings()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder =
        software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.builder()

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

    public fun build(): software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps,
  ) : CdkObject(cdkObject), CfnAssessmentTemplateProps {
    override fun assessmentTargetArn(): String = unwrap(this).getAssessmentTargetArn()

    override fun assessmentTemplateName(): String? = unwrap(this).getAssessmentTemplateName()

    override fun durationInSeconds(): Number = unwrap(this).getDurationInSeconds()

    override fun rulesPackageArns(): List<String> = unwrap(this).getRulesPackageArns()

    override fun userAttributesForFindings(): Any? = unwrap(this).getUserAttributesForFindings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssessmentTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps):
        CfnAssessmentTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssessmentTemplateProps):
        software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps
  }
}
