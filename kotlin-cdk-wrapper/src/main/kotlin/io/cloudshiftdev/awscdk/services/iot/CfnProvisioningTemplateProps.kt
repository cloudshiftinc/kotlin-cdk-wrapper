@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProvisioningTemplateProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun preProvisioningHook(): Any? = unwrap(this).getPreProvisioningHook()

  public fun provisioningRoleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun templateBody(): String

  public fun templateName(): String? = unwrap(this).getTemplateName()

  public fun templateType(): String? = unwrap(this).getTemplateType()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun preProvisioningHook(preProvisioningHook: IResolvable)

    public
        fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1d82b3fb5cabe48f550455e75052ca478eb5ad3f77fab13022554c25ca6af91")
    public
        fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty.Builder.() -> Unit)

    public fun provisioningRoleArn(provisioningRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateBody(templateBody: String)

    public fun templateName(templateName: String)

    public fun templateType(templateType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps.Builder
        = software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun preProvisioningHook(preProvisioningHook: IResolvable) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(IResolvable::unwrap))
    }

    override
        fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(CfnProvisioningTemplate.ProvisioningHookProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1d82b3fb5cabe48f550455e75052ca478eb5ad3f77fab13022554c25ca6af91")
    override
        fun preProvisioningHook(preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty.Builder.() -> Unit):
        Unit =
        preProvisioningHook(CfnProvisioningTemplate.ProvisioningHookProperty(preProvisioningHook))

    override fun provisioningRoleArn(provisioningRoleArn: String) {
      cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    override fun templateType(templateType: String) {
      cdkBuilder.templateType(templateType)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps,
  ) : CdkObject(cdkObject), CfnProvisioningTemplateProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun preProvisioningHook(): Any? = unwrap(this).getPreProvisioningHook()

    override fun provisioningRoleArn(): String = unwrap(this).getProvisioningRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun templateBody(): String = unwrap(this).getTemplateBody()

    override fun templateName(): String? = unwrap(this).getTemplateName()

    override fun templateType(): String? = unwrap(this).getTemplateType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProvisioningTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps):
        CfnProvisioningTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProvisioningTemplateProps):
        software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps
  }
}
