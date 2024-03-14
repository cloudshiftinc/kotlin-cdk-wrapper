package io.cloudshiftdev.awscdk.services.auditmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssessment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun assessmentReportsDestination(): Any? =
      unwrap(this).getAssessmentReportsDestination()

  public open fun assessmentReportsDestination(`value`: IResolvable) {
    unwrap(this).setAssessmentReportsDestination(`value`.let(IResolvable::unwrap))
  }

  public open fun assessmentReportsDestination(`value`: AssessmentReportsDestinationProperty) {
    unwrap(this).setAssessmentReportsDestination(`value`.let(AssessmentReportsDestinationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2787eccfcc4317d2da4bce1af29c28e964f176f12a7eee9c41b942f2ab78976e")
  public open
      fun assessmentReportsDestination(`value`: AssessmentReportsDestinationProperty.Builder.() -> Unit):
      Unit = assessmentReportsDestination(AssessmentReportsDestinationProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrAssessmentId(): String = unwrap(this).getAttrAssessmentId()

  public open fun attrCreationTime(): IResolvable =
      unwrap(this).getAttrCreationTime().let(IResolvable::wrap)

  public open fun awsAccount(): Any? = unwrap(this).getAwsAccount()

  public open fun awsAccount(`value`: IResolvable) {
    unwrap(this).setAwsAccount(`value`.let(IResolvable::unwrap))
  }

  public open fun awsAccount(`value`: AWSAccountProperty) {
    unwrap(this).setAwsAccount(`value`.let(AWSAccountProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfc0f6942aad9e32e254c317a5204fdbbbb760c5770988556472ab851f1f7614")
  public open fun awsAccount(`value`: AWSAccountProperty.Builder.() -> Unit): Unit =
      awsAccount(AWSAccountProperty(`value`))

  public open fun delegations(): Any? = unwrap(this).getDelegations()

  public open fun delegations(`value`: IResolvable) {
    unwrap(this).setDelegations(`value`.let(IResolvable::unwrap))
  }

  public open fun delegations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDelegations(__idx_ac66f0)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun frameworkId(): String? = unwrap(this).getFrameworkId()

  public open fun frameworkId(`value`: String) {
    unwrap(this).setFrameworkId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roles(): Any? = unwrap(this).getRoles()

  public open fun roles(`value`: IResolvable) {
    unwrap(this).setRoles(`value`.let(IResolvable::unwrap))
  }

  public open fun roles(__idx_ac66f0: List<Any>) {
    unwrap(this).setRoles(__idx_ac66f0)
  }

  public open fun scope(): Any? = unwrap(this).getScope()

  public open fun scope(`value`: IResolvable) {
    unwrap(this).setScope(`value`.let(IResolvable::unwrap))
  }

  public open fun scope(`value`: ScopeProperty) {
    unwrap(this).setScope(`value`.let(ScopeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("927ed310f9222539748590577d39de037ad1ff1e8d04b788db09c97045459b17")
  public open fun scope(`value`: ScopeProperty.Builder.() -> Unit): Unit =
      scope(ScopeProperty(`value`))

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
    }

    public
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2291bdad9e377b5b15886106ecdd4ad5cacac6721cc3864c84ce221e4f985f7b")
    public
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty.Builder.() -> Unit) {
    }

    public fun awsAccount(awsAccount: IResolvable) {
    }

    public fun awsAccount(awsAccount: AWSAccountProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1580483e9c07085cc822510773463770606f203d1f70bd8575549ccf14ef7a91")
    public fun awsAccount(awsAccount: AWSAccountProperty.Builder.() -> Unit) {
    }

    public fun delegations(delegations: IResolvable) {
    }

    public fun delegations(delegations: List<Any>) {
    }

    public fun description(description: String) {
    }

    public fun frameworkId(frameworkId: String) {
    }

    public fun name(name: String) {
    }

    public fun roles(roles: IResolvable) {
    }

    public fun roles(roles: List<Any>) {
    }

    public fun scope(scope: IResolvable) {
    }

    public fun scope(scope: ScopeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cd79e98afe771933cfa678ad4e6945e8c8b781c2bead15848ae7da762a4a333")
    public fun scope(scope: ScopeProperty.Builder.() -> Unit) {
    }

    public fun status(status: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.auditmanager.CfnAssessment.Builder =
        software.amazon.awscdk.services.auditmanager.CfnAssessment.Builder.create(scope, id)

    public override fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(IResolvable::unwrap))
    }

    public override
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(AssessmentReportsDestinationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2291bdad9e377b5b15886106ecdd4ad5cacac6721cc3864c84ce221e4f985f7b")
    public override
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty.Builder.() -> Unit):
        Unit =
        assessmentReportsDestination(AssessmentReportsDestinationProperty(assessmentReportsDestination))

    public override fun awsAccount(awsAccount: IResolvable) {
      cdkBuilder.awsAccount(awsAccount.let(IResolvable::unwrap))
    }

    public override fun awsAccount(awsAccount: AWSAccountProperty) {
      cdkBuilder.awsAccount(awsAccount.let(AWSAccountProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1580483e9c07085cc822510773463770606f203d1f70bd8575549ccf14ef7a91")
    public override fun awsAccount(awsAccount: AWSAccountProperty.Builder.() -> Unit): Unit =
        awsAccount(AWSAccountProperty(awsAccount))

    public override fun delegations(delegations: IResolvable) {
      cdkBuilder.delegations(delegations.let(IResolvable::unwrap))
    }

    public override fun delegations(delegations: List<Any>) {
      cdkBuilder.delegations(delegations)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun frameworkId(frameworkId: String) {
      cdkBuilder.frameworkId(frameworkId)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun roles(roles: IResolvable) {
      cdkBuilder.roles(roles.let(IResolvable::unwrap))
    }

    public override fun roles(roles: List<Any>) {
      cdkBuilder.roles(roles)
    }

    public override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable::unwrap))
    }

    public override fun scope(scope: ScopeProperty) {
      cdkBuilder.scope(scope.let(ScopeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cd79e98afe771933cfa678ad4e6945e8c8b781c2bead15848ae7da762a4a333")
    public override fun scope(scope: ScopeProperty.Builder.() -> Unit): Unit =
        scope(ScopeProperty(scope))

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssessment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssessment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment):
        CfnAssessment = CfnAssessment(cdkObject)

    internal fun unwrap(wrapped: CfnAssessment):
        software.amazon.awscdk.services.auditmanager.CfnAssessment = wrapped.cdkObject
  }

  public interface AWSAccountProperty {
    public fun emailAddress(): String? = unwrap(this).getEmailAddress()

    public fun id(): String? = unwrap(this).getId()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun emailAddress(emailAddress: String) {
      }

      public fun id(id: String) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty.builder()

      public override fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty,
    ) : AWSAccountProperty {
      public override fun emailAddress(): String? = unwrap(this).getEmailAddress()

      public override fun id(): String? = unwrap(this).getId()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AWSAccountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty):
          AWSAccountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSAccountProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DelegationProperty {
    public fun assessmentId(): String? = unwrap(this).getAssessmentId()

    public fun assessmentName(): String? = unwrap(this).getAssessmentName()

    public fun comment(): String? = unwrap(this).getComment()

    public fun controlSetId(): String? = unwrap(this).getControlSetId()

    public fun createdBy(): String? = unwrap(this).getCreatedBy()

    public fun creationTime(): Number? = unwrap(this).getCreationTime()

    public fun id(): String? = unwrap(this).getId()

    public fun lastUpdated(): Number? = unwrap(this).getLastUpdated()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun roleType(): String? = unwrap(this).getRoleType()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun assessmentId(assessmentId: String) {
      }

      public fun assessmentName(assessmentName: String) {
      }

      public fun comment(comment: String) {
      }

      public fun controlSetId(controlSetId: String) {
      }

      public fun createdBy(createdBy: String) {
      }

      public fun creationTime(creationTime: Number) {
      }

      public fun id(id: String) {
      }

      public fun lastUpdated(lastUpdated: Number) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun roleType(roleType: String) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty.builder()

      public override fun assessmentId(assessmentId: String) {
        cdkBuilder.assessmentId(assessmentId)
      }

      public override fun assessmentName(assessmentName: String) {
        cdkBuilder.assessmentName(assessmentName)
      }

      public override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      public override fun controlSetId(controlSetId: String) {
        cdkBuilder.controlSetId(controlSetId)
      }

      public override fun createdBy(createdBy: String) {
        cdkBuilder.createdBy(createdBy)
      }

      public override fun creationTime(creationTime: Number) {
        cdkBuilder.creationTime(creationTime)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun lastUpdated(lastUpdated: Number) {
        cdkBuilder.lastUpdated(lastUpdated)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty,
    ) : DelegationProperty {
      public override fun assessmentId(): String? = unwrap(this).getAssessmentId()

      public override fun assessmentName(): String? = unwrap(this).getAssessmentName()

      public override fun comment(): String? = unwrap(this).getComment()

      public override fun controlSetId(): String? = unwrap(this).getControlSetId()

      public override fun createdBy(): String? = unwrap(this).getCreatedBy()

      public override fun creationTime(): Number? = unwrap(this).getCreationTime()

      public override fun id(): String? = unwrap(this).getId()

      public override fun lastUpdated(): Number? = unwrap(this).getLastUpdated()

      public override fun roleArn(): String? = unwrap(this).getRoleArn()

      public override fun roleType(): String? = unwrap(this).getRoleType()

      public override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DelegationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty):
          DelegationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DelegationProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AssessmentReportsDestinationProperty {
    public fun destination(): String? = unwrap(this).getDestination()

    public fun destinationType(): String? = unwrap(this).getDestinationType()

    public interface Builder {
      public fun destination(destination: String) {
      }

      public fun destinationType(destinationType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty.Builder
          =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty.builder()

      public override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public override fun destinationType(destinationType: String) {
        cdkBuilder.destinationType(destinationType)
      }

      public fun build():
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty,
    ) : AssessmentReportsDestinationProperty {
      public override fun destination(): String? = unwrap(this).getDestination()

      public override fun destinationType(): String? = unwrap(this).getDestinationType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AssessmentReportsDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty):
          AssessmentReportsDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssessmentReportsDestinationProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScopeProperty {
    public fun awsAccounts(): Any? = unwrap(this).getAwsAccounts()

    public fun awsServices(): Any? = unwrap(this).getAwsServices()

    public interface Builder {
      public fun awsAccounts(awsAccounts: IResolvable) {
      }

      public fun awsAccounts(awsAccounts: List<Any>) {
      }

      public fun awsServices(awsServices: IResolvable) {
      }

      public fun awsServices(awsServices: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty.builder()

      public override fun awsAccounts(awsAccounts: IResolvable) {
        cdkBuilder.awsAccounts(awsAccounts.let(IResolvable::unwrap))
      }

      public override fun awsAccounts(awsAccounts: List<Any>) {
        cdkBuilder.awsAccounts(awsAccounts)
      }

      public override fun awsServices(awsServices: IResolvable) {
        cdkBuilder.awsServices(awsServices.let(IResolvable::unwrap))
      }

      public override fun awsServices(awsServices: List<Any>) {
        cdkBuilder.awsServices(awsServices)
      }

      public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty,
    ) : ScopeProperty {
      public override fun awsAccounts(): Any? = unwrap(this).getAwsAccounts()

      public override fun awsServices(): Any? = unwrap(this).getAwsServices()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty):
          ScopeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScopeProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RoleProperty {
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun roleType(): String? = unwrap(this).getRoleType()

    public interface Builder {
      public fun roleArn(roleArn: String) {
      }

      public fun roleType(roleType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty.builder()

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
      }

      public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty,
    ) : RoleProperty {
      public override fun roleArn(): String? = unwrap(this).getRoleArn()

      public override fun roleType(): String? = unwrap(this).getRoleType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty):
          RoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoleProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AWSServiceProperty {
    public fun serviceName(): String? = unwrap(this).getServiceName()

    public interface Builder {
      public fun serviceName(serviceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty.builder()

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty,
    ) : AWSServiceProperty {
      public override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AWSServiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty):
          AWSServiceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSServiceProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
