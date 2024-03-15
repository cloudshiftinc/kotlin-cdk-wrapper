@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProvisioningTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrTemplateArn(): String = unwrap(this).getAttrTemplateArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun preProvisioningHook(): Any? = unwrap(this).getPreProvisioningHook()

  public open fun preProvisioningHook(`value`: IResolvable) {
    unwrap(this).setPreProvisioningHook(`value`.let(IResolvable::unwrap))
  }

  public open fun preProvisioningHook(`value`: ProvisioningHookProperty) {
    unwrap(this).setPreProvisioningHook(`value`.let(ProvisioningHookProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4397a2302134e730129d46ccc8332a13ce0e6443f8af54eebcb65f57e5ec8146")
  public open fun preProvisioningHook(`value`: ProvisioningHookProperty.Builder.() -> Unit): Unit =
      preProvisioningHook(ProvisioningHookProperty(`value`))

  public open fun provisioningRoleArn(): String = unwrap(this).getProvisioningRoleArn()

  public open fun provisioningRoleArn(`value`: String) {
    unwrap(this).setProvisioningRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun templateBody(): String = unwrap(this).getTemplateBody()

  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  public open fun templateName(): String? = unwrap(this).getTemplateName()

  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  public open fun templateType(): String? = unwrap(this).getTemplateType()

  public open fun templateType(`value`: String) {
    unwrap(this).setTemplateType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun preProvisioningHook(preProvisioningHook: IResolvable)

    public fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859854171f55f7301674cd68e0ca7c8cae08b6697bf440a98b5295633c0c207e")
    public fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty.Builder.() -> Unit)

    public fun provisioningRoleArn(provisioningRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateBody(templateBody: String)

    public fun templateName(templateName: String)

    public fun templateType(templateType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnProvisioningTemplate.Builder =
        software.amazon.awscdk.services.iot.CfnProvisioningTemplate.Builder.create(scope, id)

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

    override fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(ProvisioningHookProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859854171f55f7301674cd68e0ca7c8cae08b6697bf440a98b5295633c0c207e")
    override
        fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty.Builder.() -> Unit):
        Unit = preProvisioningHook(ProvisioningHookProperty(preProvisioningHook))

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

    public fun build(): software.amazon.awscdk.services.iot.CfnProvisioningTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnProvisioningTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProvisioningTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProvisioningTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate):
        CfnProvisioningTemplate = CfnProvisioningTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnProvisioningTemplate):
        software.amazon.awscdk.services.iot.CfnProvisioningTemplate = wrapped.cdkObject
  }

  public interface ProvisioningHookProperty {
    public fun payloadVersion(): String? = unwrap(this).getPayloadVersion()

    public fun targetArn(): String? = unwrap(this).getTargetArn()

    @CdkDslMarker
    public interface Builder {
      public fun payloadVersion(payloadVersion: String)

      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty.builder()

      override fun payloadVersion(payloadVersion: String) {
        cdkBuilder.payloadVersion(payloadVersion)
      }

      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty,
    ) : CdkObject(cdkObject), ProvisioningHookProperty {
      override fun payloadVersion(): String? = unwrap(this).getPayloadVersion()

      override fun targetArn(): String? = unwrap(this).getTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty):
          ProvisioningHookProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningHookProperty):
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty
    }
  }
}
