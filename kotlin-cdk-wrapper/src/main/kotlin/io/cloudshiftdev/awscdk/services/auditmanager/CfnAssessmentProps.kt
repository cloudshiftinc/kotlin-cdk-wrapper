@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.auditmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAssessmentProps {
  public fun assessmentReportsDestination(): Any? = unwrap(this).getAssessmentReportsDestination()

  public fun awsAccount(): Any? = unwrap(this).getAwsAccount()

  public fun delegations(): Any? = unwrap(this).getDelegations()

  public fun description(): String? = unwrap(this).getDescription()

  public fun frameworkId(): String? = unwrap(this).getFrameworkId()

  public fun name(): String? = unwrap(this).getName()

  public fun roles(): Any? = unwrap(this).getRoles()

  public fun scope(): Any? = unwrap(this).getScope()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assessmentReportsDestination(assessmentReportsDestination: IResolvable)

    public
        fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a92590fac480b84e0922f895a54e01613930d1ef6cc7b2fff795eccf9645d")
    public
        fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty.Builder.() -> Unit)

    public fun awsAccount(awsAccount: IResolvable)

    public fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7699628e029d4cb8fa1aec29bfe2fac9952da8caacddbb70958ad6c911c51b8")
    public fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty.Builder.() -> Unit)

    public fun delegations(delegations: IResolvable)

    public fun delegations(delegations: List<Any>)

    public fun delegations(vararg delegations: Any)

    public fun description(description: String)

    public fun frameworkId(frameworkId: String)

    public fun name(name: String)

    public fun roles(roles: IResolvable)

    public fun roles(roles: List<Any>)

    public fun roles(vararg roles: Any)

    public fun scope(scope: IResolvable)

    public fun scope(scope: CfnAssessment.ScopeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33852bce087844d5a53885fcf9e30ac29943c684be5506ee4b355ef1a572015a")
    public fun scope(scope: CfnAssessment.ScopeProperty.Builder.() -> Unit)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.auditmanager.CfnAssessmentProps.Builder
        = software.amazon.awscdk.services.auditmanager.CfnAssessmentProps.builder()

    override fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(IResolvable::unwrap))
    }

    override
        fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(CfnAssessment.AssessmentReportsDestinationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a92590fac480b84e0922f895a54e01613930d1ef6cc7b2fff795eccf9645d")
    override
        fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty.Builder.() -> Unit):
        Unit =
        assessmentReportsDestination(CfnAssessment.AssessmentReportsDestinationProperty(assessmentReportsDestination))

    override fun awsAccount(awsAccount: IResolvable) {
      cdkBuilder.awsAccount(awsAccount.let(IResolvable::unwrap))
    }

    override fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty) {
      cdkBuilder.awsAccount(awsAccount.let(CfnAssessment.AWSAccountProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7699628e029d4cb8fa1aec29bfe2fac9952da8caacddbb70958ad6c911c51b8")
    override fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty.Builder.() -> Unit): Unit =
        awsAccount(CfnAssessment.AWSAccountProperty(awsAccount))

    override fun delegations(delegations: IResolvable) {
      cdkBuilder.delegations(delegations.let(IResolvable::unwrap))
    }

    override fun delegations(delegations: List<Any>) {
      cdkBuilder.delegations(delegations)
    }

    override fun delegations(vararg delegations: Any): Unit = delegations(delegations.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun frameworkId(frameworkId: String) {
      cdkBuilder.frameworkId(frameworkId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roles(roles: IResolvable) {
      cdkBuilder.roles(roles.let(IResolvable::unwrap))
    }

    override fun roles(roles: List<Any>) {
      cdkBuilder.roles(roles)
    }

    override fun roles(vararg roles: Any): Unit = roles(roles.toList())

    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable::unwrap))
    }

    override fun scope(scope: CfnAssessment.ScopeProperty) {
      cdkBuilder.scope(scope.let(CfnAssessment.ScopeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33852bce087844d5a53885fcf9e30ac29943c684be5506ee4b355ef1a572015a")
    override fun scope(scope: CfnAssessment.ScopeProperty.Builder.() -> Unit): Unit =
        scope(CfnAssessment.ScopeProperty(scope))

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessmentProps,
  ) : CdkObject(cdkObject), CfnAssessmentProps {
    override fun assessmentReportsDestination(): Any? =
        unwrap(this).getAssessmentReportsDestination()

    override fun awsAccount(): Any? = unwrap(this).getAwsAccount()

    override fun delegations(): Any? = unwrap(this).getDelegations()

    override fun description(): String? = unwrap(this).getDescription()

    override fun frameworkId(): String? = unwrap(this).getFrameworkId()

    override fun name(): String? = unwrap(this).getName()

    override fun roles(): Any? = unwrap(this).getRoles()

    override fun scope(): Any? = unwrap(this).getScope()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssessmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessmentProps):
        CfnAssessmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssessmentProps):
        software.amazon.awscdk.services.auditmanager.CfnAssessmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.auditmanager.CfnAssessmentProps
  }
}
