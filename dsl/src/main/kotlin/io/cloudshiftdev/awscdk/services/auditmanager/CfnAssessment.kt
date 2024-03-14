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

  public open fun delegations(vararg __idx_ac66f0: Any): Unit = delegations(__idx_ac66f0.toList())

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

  public open fun roles(vararg __idx_ac66f0: Any): Unit = roles(__idx_ac66f0.toList())

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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun assessmentReportsDestination(assessmentReportsDestination: IResolvable)

    public
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2291bdad9e377b5b15886106ecdd4ad5cacac6721cc3864c84ce221e4f985f7b")
    public
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty.Builder.() -> Unit)

    public fun awsAccount(awsAccount: IResolvable)

    public fun awsAccount(awsAccount: AWSAccountProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1580483e9c07085cc822510773463770606f203d1f70bd8575549ccf14ef7a91")
    public fun awsAccount(awsAccount: AWSAccountProperty.Builder.() -> Unit)

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

    public fun scope(scope: ScopeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cd79e98afe771933cfa678ad4e6945e8c8b781c2bead15848ae7da762a4a333")
    public fun scope(scope: ScopeProperty.Builder.() -> Unit)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.auditmanager.CfnAssessment.Builder =
        software.amazon.awscdk.services.auditmanager.CfnAssessment.Builder.create(scope, id)

    override fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(IResolvable::unwrap))
    }

    override
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(AssessmentReportsDestinationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2291bdad9e377b5b15886106ecdd4ad5cacac6721cc3864c84ce221e4f985f7b")
    override
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty.Builder.() -> Unit):
        Unit =
        assessmentReportsDestination(AssessmentReportsDestinationProperty(assessmentReportsDestination))

    override fun awsAccount(awsAccount: IResolvable) {
      cdkBuilder.awsAccount(awsAccount.let(IResolvable::unwrap))
    }

    override fun awsAccount(awsAccount: AWSAccountProperty) {
      cdkBuilder.awsAccount(awsAccount.let(AWSAccountProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1580483e9c07085cc822510773463770606f203d1f70bd8575549ccf14ef7a91")
    override fun awsAccount(awsAccount: AWSAccountProperty.Builder.() -> Unit): Unit =
        awsAccount(AWSAccountProperty(awsAccount))

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

    override fun scope(scope: ScopeProperty) {
      cdkBuilder.scope(scope.let(ScopeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cd79e98afe771933cfa678ad4e6945e8c8b781c2bead15848ae7da762a4a333")
    override fun scope(scope: ScopeProperty.Builder.() -> Unit): Unit = scope(ScopeProperty(scope))

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
      public fun emailAddress(emailAddress: String)

      public fun id(id: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty.builder()

      override fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
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
      override fun emailAddress(): String? = unwrap(this).getEmailAddress()

      override fun id(): String? = unwrap(this).getId()

      override fun name(): String? = unwrap(this).getName()
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
      public fun assessmentId(assessmentId: String)

      public fun assessmentName(assessmentName: String)

      public fun comment(comment: String)

      public fun controlSetId(controlSetId: String)

      public fun createdBy(createdBy: String)

      public fun creationTime(creationTime: Number)

      public fun id(id: String)

      public fun lastUpdated(lastUpdated: Number)

      public fun roleArn(roleArn: String)

      public fun roleType(roleType: String)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty.builder()

      override fun assessmentId(assessmentId: String) {
        cdkBuilder.assessmentId(assessmentId)
      }

      override fun assessmentName(assessmentName: String) {
        cdkBuilder.assessmentName(assessmentName)
      }

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun controlSetId(controlSetId: String) {
        cdkBuilder.controlSetId(controlSetId)
      }

      override fun createdBy(createdBy: String) {
        cdkBuilder.createdBy(createdBy)
      }

      override fun creationTime(creationTime: Number) {
        cdkBuilder.creationTime(creationTime)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun lastUpdated(lastUpdated: Number) {
        cdkBuilder.lastUpdated(lastUpdated)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
      }

      override fun status(status: String) {
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
      override fun assessmentId(): String? = unwrap(this).getAssessmentId()

      override fun assessmentName(): String? = unwrap(this).getAssessmentName()

      override fun comment(): String? = unwrap(this).getComment()

      override fun controlSetId(): String? = unwrap(this).getControlSetId()

      override fun createdBy(): String? = unwrap(this).getCreatedBy()

      override fun creationTime(): Number? = unwrap(this).getCreationTime()

      override fun id(): String? = unwrap(this).getId()

      override fun lastUpdated(): Number? = unwrap(this).getLastUpdated()

      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun roleType(): String? = unwrap(this).getRoleType()

      override fun status(): String? = unwrap(this).getStatus()
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
      public fun destination(destination: String)

      public fun destinationType(destinationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty.Builder
          =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty.builder()

      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      override fun destinationType(destinationType: String) {
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
      override fun destination(): String? = unwrap(this).getDestination()

      override fun destinationType(): String? = unwrap(this).getDestinationType()
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
      public fun awsAccounts(awsAccounts: IResolvable)

      public fun awsAccounts(awsAccounts: List<Any>)

      public fun awsAccounts(vararg awsAccounts: Any)

      public fun awsServices(awsServices: IResolvable)

      public fun awsServices(awsServices: List<Any>)

      public fun awsServices(vararg awsServices: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty.builder()

      override fun awsAccounts(awsAccounts: IResolvable) {
        cdkBuilder.awsAccounts(awsAccounts.let(IResolvable::unwrap))
      }

      override fun awsAccounts(awsAccounts: List<Any>) {
        cdkBuilder.awsAccounts(awsAccounts)
      }

      override fun awsAccounts(vararg awsAccounts: Any): Unit = awsAccounts(awsAccounts.toList())

      override fun awsServices(awsServices: IResolvable) {
        cdkBuilder.awsServices(awsServices.let(IResolvable::unwrap))
      }

      override fun awsServices(awsServices: List<Any>) {
        cdkBuilder.awsServices(awsServices)
      }

      override fun awsServices(vararg awsServices: Any): Unit = awsServices(awsServices.toList())

      public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty,
    ) : ScopeProperty {
      override fun awsAccounts(): Any? = unwrap(this).getAwsAccounts()

      override fun awsServices(): Any? = unwrap(this).getAwsServices()
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
      public fun roleArn(roleArn: String)

      public fun roleType(roleType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
      }

      public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty,
    ) : RoleProperty {
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun roleType(): String? = unwrap(this).getRoleType()
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
      public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty.builder()

      override fun serviceName(serviceName: String) {
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
      override fun serviceName(): String? = unwrap(this).getServiceName()
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
