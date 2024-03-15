@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.CfnTemplate,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun template(): Any? = unwrap(this).getTemplate()

  public open fun template(`value`: IResolvable) {
    unwrap(this).setTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun template(`value`: TemplateProperty) {
    unwrap(this).setTemplate(`value`.let(TemplateProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("57f6de4491d980050e3f3d30941f0e0f693cabcc717af8906ad79a609cd784fe")
  public open fun template(`value`: TemplateProperty.Builder.() -> Unit): Unit =
      template(TemplateProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun template(template: IResolvable)

    public fun template(template: TemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cddd8ef62379e20dc50fd9f980b0aed4918a48b7c1a2aa51a0ff288116c8f0ff")
    public fun template(template: TemplateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnTemplate.Builder =
        software.amazon.awscdk.services.ses.CfnTemplate.Builder.create(scope, id)

    override fun template(template: IResolvable) {
      cdkBuilder.template(template.let(IResolvable::unwrap))
    }

    override fun template(template: TemplateProperty) {
      cdkBuilder.template(template.let(TemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cddd8ef62379e20dc50fd9f980b0aed4918a48b7c1a2aa51a0ff288116c8f0ff")
    override fun template(template: TemplateProperty.Builder.() -> Unit): Unit =
        template(TemplateProperty(template))

    public fun build(): software.amazon.awscdk.services.ses.CfnTemplate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnTemplate): CfnTemplate =
        CfnTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnTemplate): software.amazon.awscdk.services.ses.CfnTemplate =
        wrapped.cdkObject
  }

  public interface TemplateProperty {
    public fun htmlPart(): String? = unwrap(this).getHtmlPart()

    public fun subjectPart(): String

    public fun templateName(): String? = unwrap(this).getTemplateName()

    public fun textPart(): String? = unwrap(this).getTextPart()

    @CdkDslMarker
    public interface Builder {
      public fun htmlPart(htmlPart: String)

      public fun subjectPart(subjectPart: String)

      public fun templateName(templateName: String)

      public fun textPart(textPart: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty.Builder =
          software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty.builder()

      override fun htmlPart(htmlPart: String) {
        cdkBuilder.htmlPart(htmlPart)
      }

      override fun subjectPart(subjectPart: String) {
        cdkBuilder.subjectPart(subjectPart)
      }

      override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      override fun textPart(textPart: String) {
        cdkBuilder.textPart(textPart)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty,
    ) : CdkObject(cdkObject), TemplateProperty {
      override fun htmlPart(): String? = unwrap(this).getHtmlPart()

      override fun subjectPart(): String = unwrap(this).getSubjectPart()

      override fun templateName(): String? = unwrap(this).getTemplateName()

      override fun textPart(): String? = unwrap(this).getTextPart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty):
          TemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateProperty):
          software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty
    }
  }
}
