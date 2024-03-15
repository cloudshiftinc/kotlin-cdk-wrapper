@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resiliencehub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnAppProps {
  public fun appAssessmentSchedule(): String? = unwrap(this).getAppAssessmentSchedule()

  public fun appTemplateBody(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun eventSubscriptions(): Any? = unwrap(this).getEventSubscriptions()

  public fun name(): String

  public fun permissionModel(): Any? = unwrap(this).getPermissionModel()

  public fun resiliencyPolicyArn(): String? = unwrap(this).getResiliencyPolicyArn()

  public fun resourceMappings(): Any

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun appAssessmentSchedule(appAssessmentSchedule: String)

    public fun appTemplateBody(appTemplateBody: String)

    public fun description(description: String)

    public fun eventSubscriptions(eventSubscriptions: IResolvable)

    public fun eventSubscriptions(eventSubscriptions: List<Any>)

    public fun eventSubscriptions(vararg eventSubscriptions: Any)

    public fun name(name: String)

    public fun permissionModel(permissionModel: IResolvable)

    public fun permissionModel(permissionModel: CfnApp.PermissionModelProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b02b544fa5ed4ba64aa9704e58cdb2e7cbbdcc3ea8fbd9ddf6ca6466a8a3a45")
    public fun permissionModel(permissionModel: CfnApp.PermissionModelProperty.Builder.() -> Unit)

    public fun resiliencyPolicyArn(resiliencyPolicyArn: String)

    public fun resourceMappings(resourceMappings: IResolvable)

    public fun resourceMappings(resourceMappings: List<Any>)

    public fun resourceMappings(vararg resourceMappings: Any)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resiliencehub.CfnAppProps.Builder =
        software.amazon.awscdk.services.resiliencehub.CfnAppProps.builder()

    override fun appAssessmentSchedule(appAssessmentSchedule: String) {
      cdkBuilder.appAssessmentSchedule(appAssessmentSchedule)
    }

    override fun appTemplateBody(appTemplateBody: String) {
      cdkBuilder.appTemplateBody(appTemplateBody)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventSubscriptions(eventSubscriptions: IResolvable) {
      cdkBuilder.eventSubscriptions(eventSubscriptions.let(IResolvable::unwrap))
    }

    override fun eventSubscriptions(eventSubscriptions: List<Any>) {
      cdkBuilder.eventSubscriptions(eventSubscriptions)
    }

    override fun eventSubscriptions(vararg eventSubscriptions: Any): Unit =
        eventSubscriptions(eventSubscriptions.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissionModel(permissionModel: IResolvable) {
      cdkBuilder.permissionModel(permissionModel.let(IResolvable::unwrap))
    }

    override fun permissionModel(permissionModel: CfnApp.PermissionModelProperty) {
      cdkBuilder.permissionModel(permissionModel.let(CfnApp.PermissionModelProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b02b544fa5ed4ba64aa9704e58cdb2e7cbbdcc3ea8fbd9ddf6ca6466a8a3a45")
    override
        fun permissionModel(permissionModel: CfnApp.PermissionModelProperty.Builder.() -> Unit):
        Unit = permissionModel(CfnApp.PermissionModelProperty(permissionModel))

    override fun resiliencyPolicyArn(resiliencyPolicyArn: String) {
      cdkBuilder.resiliencyPolicyArn(resiliencyPolicyArn)
    }

    override fun resourceMappings(resourceMappings: IResolvable) {
      cdkBuilder.resourceMappings(resourceMappings.let(IResolvable::unwrap))
    }

    override fun resourceMappings(resourceMappings: List<Any>) {
      cdkBuilder.resourceMappings(resourceMappings)
    }

    override fun resourceMappings(vararg resourceMappings: Any): Unit =
        resourceMappings(resourceMappings.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.resiliencehub.CfnAppProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.resiliencehub.CfnAppProps,
  ) : CdkObject(cdkObject), CfnAppProps {
    override fun appAssessmentSchedule(): String? = unwrap(this).getAppAssessmentSchedule()

    override fun appTemplateBody(): String = unwrap(this).getAppTemplateBody()

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventSubscriptions(): Any? = unwrap(this).getEventSubscriptions()

    override fun name(): String = unwrap(this).getName()

    override fun permissionModel(): Any? = unwrap(this).getPermissionModel()

    override fun resiliencyPolicyArn(): String? = unwrap(this).getResiliencyPolicyArn()

    override fun resourceMappings(): Any = unwrap(this).getResourceMappings()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnAppProps):
        CfnAppProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppProps):
        software.amazon.awscdk.services.resiliencehub.CfnAppProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.resiliencehub.CfnAppProps
  }
}
