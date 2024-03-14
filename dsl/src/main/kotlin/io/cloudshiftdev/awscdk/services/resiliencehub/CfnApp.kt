package io.cloudshiftdev.awscdk.services.resiliencehub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApp internal constructor(
  private val cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appAssessmentSchedule(): String? = unwrap(this).getAppAssessmentSchedule()

  public open fun appAssessmentSchedule(`value`: String) {
    unwrap(this).setAppAssessmentSchedule(`value`)
  }

  public open fun appTemplateBody(): String = unwrap(this).getAppTemplateBody()

  public open fun appTemplateBody(`value`: String) {
    unwrap(this).setAppTemplateBody(`value`)
  }

  public open fun attrAppArn(): String = unwrap(this).getAttrAppArn()

  public open fun attrDriftStatus(): String = unwrap(this).getAttrDriftStatus()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun eventSubscriptions(): Any? = unwrap(this).getEventSubscriptions()

  public open fun eventSubscriptions(`value`: IResolvable) {
    unwrap(this).setEventSubscriptions(`value`.let(IResolvable::unwrap))
  }

  public open fun eventSubscriptions(__idx_ac66f0: List<Any>) {
    unwrap(this).setEventSubscriptions(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun permissionModel(): Any? = unwrap(this).getPermissionModel()

  public open fun permissionModel(`value`: IResolvable) {
    unwrap(this).setPermissionModel(`value`.let(IResolvable::unwrap))
  }

  public open fun permissionModel(`value`: PermissionModelProperty) {
    unwrap(this).setPermissionModel(`value`.let(PermissionModelProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("988833bbbe80c93635949df8398ad51e65c61407395aa2045bd67ce8d5780388")
  public open fun permissionModel(`value`: PermissionModelProperty.Builder.() -> Unit): Unit =
      permissionModel(PermissionModelProperty(`value`))

  public open fun resiliencyPolicyArn(): String? = unwrap(this).getResiliencyPolicyArn()

  public open fun resiliencyPolicyArn(`value`: String) {
    unwrap(this).setResiliencyPolicyArn(`value`)
  }

  public open fun resourceMappings(): Any = unwrap(this).getResourceMappings()

  public open fun resourceMappings(`value`: IResolvable) {
    unwrap(this).setResourceMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setResourceMappings(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun appAssessmentSchedule(appAssessmentSchedule: String) {
    }

    public fun appTemplateBody(appTemplateBody: String) {
    }

    public fun description(description: String) {
    }

    public fun eventSubscriptions(eventSubscriptions: IResolvable) {
    }

    public fun eventSubscriptions(eventSubscriptions: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun permissionModel(permissionModel: IResolvable) {
    }

    public fun permissionModel(permissionModel: PermissionModelProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e918c216fb8f3bf92d254812b276851f7aa4316f4e196983dece2146130f3aca")
    public fun permissionModel(permissionModel: PermissionModelProperty.Builder.() -> Unit) {
    }

    public fun resiliencyPolicyArn(resiliencyPolicyArn: String) {
    }

    public fun resourceMappings(resourceMappings: IResolvable) {
    }

    public fun resourceMappings(resourceMappings: List<Any>) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resiliencehub.CfnApp.Builder =
        software.amazon.awscdk.services.resiliencehub.CfnApp.Builder.create(scope, id)

    public override fun appAssessmentSchedule(appAssessmentSchedule: String) {
      cdkBuilder.appAssessmentSchedule(appAssessmentSchedule)
    }

    public override fun appTemplateBody(appTemplateBody: String) {
      cdkBuilder.appTemplateBody(appTemplateBody)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun eventSubscriptions(eventSubscriptions: IResolvable) {
      cdkBuilder.eventSubscriptions(eventSubscriptions.let(IResolvable::unwrap))
    }

    public override fun eventSubscriptions(eventSubscriptions: List<Any>) {
      cdkBuilder.eventSubscriptions(eventSubscriptions)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun permissionModel(permissionModel: IResolvable) {
      cdkBuilder.permissionModel(permissionModel.let(IResolvable::unwrap))
    }

    public override fun permissionModel(permissionModel: PermissionModelProperty) {
      cdkBuilder.permissionModel(permissionModel.let(PermissionModelProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e918c216fb8f3bf92d254812b276851f7aa4316f4e196983dece2146130f3aca")
    public override
        fun permissionModel(permissionModel: PermissionModelProperty.Builder.() -> Unit): Unit =
        permissionModel(PermissionModelProperty(permissionModel))

    public override fun resiliencyPolicyArn(resiliencyPolicyArn: String) {
      cdkBuilder.resiliencyPolicyArn(resiliencyPolicyArn)
    }

    public override fun resourceMappings(resourceMappings: IResolvable) {
      cdkBuilder.resourceMappings(resourceMappings.let(IResolvable::unwrap))
    }

    public override fun resourceMappings(resourceMappings: List<Any>) {
      cdkBuilder.resourceMappings(resourceMappings)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.resiliencehub.CfnApp = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp): CfnApp =
        CfnApp(cdkObject)

    internal fun unwrap(wrapped: CfnApp): software.amazon.awscdk.services.resiliencehub.CfnApp =
        wrapped.cdkObject
  }

  public interface PhysicalResourceIdProperty {
    public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    public fun identifier(): String

    public fun type(): String

    public interface Builder {
      public fun awsAccountId(awsAccountId: String) {
      }

      public fun awsRegion(awsRegion: String) {
      }

      public fun identifier(identifier: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty.Builder =
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty.builder()

      public override fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
      }

      public override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      public override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty,
    ) : PhysicalResourceIdProperty {
      public override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

      public override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      public override fun identifier(): String = unwrap(this).getIdentifier()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PhysicalResourceIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty):
          PhysicalResourceIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhysicalResourceIdProperty):
          software.amazon.awscdk.services.resiliencehub.CfnApp.PhysicalResourceIdProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PermissionModelProperty {
    public fun crossAccountRoleArns(): List<String> = unwrap(this).getCrossAccountRoleArns() ?:
        emptyList()

    public fun invokerRoleName(): String? = unwrap(this).getInvokerRoleName()

    public fun type(): String

    public interface Builder {
      public fun crossAccountRoleArns(crossAccountRoleArns: List<String>) {
      }

      public fun invokerRoleName(invokerRoleName: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty.Builder =
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty.builder()

      public override fun crossAccountRoleArns(crossAccountRoleArns: List<String>) {
        cdkBuilder.crossAccountRoleArns(crossAccountRoleArns)
      }

      public override fun invokerRoleName(invokerRoleName: String) {
        cdkBuilder.invokerRoleName(invokerRoleName)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty,
    ) : PermissionModelProperty {
      public override fun crossAccountRoleArns(): List<String> =
          unwrap(this).getCrossAccountRoleArns() ?: emptyList()

      public override fun invokerRoleName(): String? = unwrap(this).getInvokerRoleName()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PermissionModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty):
          PermissionModelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PermissionModelProperty):
          software.amazon.awscdk.services.resiliencehub.CfnApp.PermissionModelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResourceMappingProperty {
    public fun eksSourceName(): String? = unwrap(this).getEksSourceName()

    public fun logicalStackName(): String? = unwrap(this).getLogicalStackName()

    public fun mappingType(): String

    public fun physicalResourceId(): Any

    public fun resourceName(): String? = unwrap(this).getResourceName()

    public fun terraformSourceName(): String? = unwrap(this).getTerraformSourceName()

    public interface Builder {
      public fun eksSourceName(eksSourceName: String) {
      }

      public fun logicalStackName(logicalStackName: String) {
      }

      public fun mappingType(mappingType: String) {
      }

      public fun physicalResourceId(physicalResourceId: IResolvable) {
      }

      public fun physicalResourceId(physicalResourceId: PhysicalResourceIdProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c64aca1583c97db6bc67cb6995d70235bf84d03b55a6e55a3704aaba9f51f705")
      public
          fun physicalResourceId(physicalResourceId: PhysicalResourceIdProperty.Builder.() -> Unit) {
      }

      public fun resourceName(resourceName: String) {
      }

      public fun terraformSourceName(terraformSourceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty.Builder =
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty.builder()

      public override fun eksSourceName(eksSourceName: String) {
        cdkBuilder.eksSourceName(eksSourceName)
      }

      public override fun logicalStackName(logicalStackName: String) {
        cdkBuilder.logicalStackName(logicalStackName)
      }

      public override fun mappingType(mappingType: String) {
        cdkBuilder.mappingType(mappingType)
      }

      public override fun physicalResourceId(physicalResourceId: IResolvable) {
        cdkBuilder.physicalResourceId(physicalResourceId.let(IResolvable::unwrap))
      }

      public override fun physicalResourceId(physicalResourceId: PhysicalResourceIdProperty) {
        cdkBuilder.physicalResourceId(physicalResourceId.let(PhysicalResourceIdProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c64aca1583c97db6bc67cb6995d70235bf84d03b55a6e55a3704aaba9f51f705")
      public override
          fun physicalResourceId(physicalResourceId: PhysicalResourceIdProperty.Builder.() -> Unit):
          Unit = physicalResourceId(PhysicalResourceIdProperty(physicalResourceId))

      public override fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
      }

      public override fun terraformSourceName(terraformSourceName: String) {
        cdkBuilder.terraformSourceName(terraformSourceName)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty,
    ) : ResourceMappingProperty {
      public override fun eksSourceName(): String? = unwrap(this).getEksSourceName()

      public override fun logicalStackName(): String? = unwrap(this).getLogicalStackName()

      public override fun mappingType(): String = unwrap(this).getMappingType()

      public override fun physicalResourceId(): Any = unwrap(this).getPhysicalResourceId()

      public override fun resourceName(): String? = unwrap(this).getResourceName()

      public override fun terraformSourceName(): String? = unwrap(this).getTerraformSourceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty):
          ResourceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceMappingProperty):
          software.amazon.awscdk.services.resiliencehub.CfnApp.ResourceMappingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventSubscriptionProperty {
    public fun eventType(): String

    public fun name(): String

    public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    public interface Builder {
      public fun eventType(eventType: String) {
      }

      public fun name(name: String) {
      }

      public fun snsTopicArn(snsTopicArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty.Builder =
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty.builder()

      public override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty,
    ) : EventSubscriptionProperty {
      public override fun eventType(): String = unwrap(this).getEventType()

      public override fun name(): String = unwrap(this).getName()

      public override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventSubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty):
          EventSubscriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSubscriptionProperty):
          software.amazon.awscdk.services.resiliencehub.CfnApp.EventSubscriptionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
