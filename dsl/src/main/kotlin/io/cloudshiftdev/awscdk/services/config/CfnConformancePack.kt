package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConformancePack internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnConformancePack,
) : CfnResource(cdkObject), IInspectable {
  public open fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  public open fun conformancePackInputParameters(`value`: IResolvable) {
    unwrap(this).setConformancePackInputParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun conformancePackInputParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setConformancePackInputParameters(__idx_ac66f0)
  }

  public open fun conformancePackName(): String = unwrap(this).getConformancePackName()

  public open fun conformancePackName(`value`: String) {
    unwrap(this).setConformancePackName(`value`)
  }

  public open fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

  public open fun deliveryS3Bucket(`value`: String) {
    unwrap(this).setDeliveryS3Bucket(`value`)
  }

  public open fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

  public open fun deliveryS3KeyPrefix(`value`: String) {
    unwrap(this).setDeliveryS3KeyPrefix(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun templateBody(): String? = unwrap(this).getTemplateBody()

  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  public open fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  public open fun templateS3Uri(`value`: String) {
    unwrap(this).setTemplateS3Uri(`value`)
  }

  public open fun templateSsmDocumentDetails(): Any? = unwrap(this).getTemplateSsmDocumentDetails()

  public open fun templateSsmDocumentDetails(`value`: Any) {
    unwrap(this).setTemplateSsmDocumentDetails(`value`)
  }

  public interface Builder {
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable)

    public fun conformancePackInputParameters(conformancePackInputParameters: List<Any>)

    public fun conformancePackName(conformancePackName: String)

    public fun deliveryS3Bucket(deliveryS3Bucket: String)

    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String)

    public fun templateBody(templateBody: String)

    public fun templateS3Uri(templateS3Uri: String)

    public fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConformancePack.Builder =
        software.amazon.awscdk.services.config.CfnConformancePack.Builder.create(scope, id)

    override fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters.let(IResolvable::unwrap))
    }

    override fun conformancePackInputParameters(conformancePackInputParameters: List<Any>) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    override fun conformancePackName(conformancePackName: String) {
      cdkBuilder.conformancePackName(conformancePackName)
    }

    override fun deliveryS3Bucket(deliveryS3Bucket: String) {
      cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    override fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
      cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    override fun templateS3Uri(templateS3Uri: String) {
      cdkBuilder.templateS3Uri(templateS3Uri)
    }

    override fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any) {
      cdkBuilder.templateSsmDocumentDetails(templateSsmDocumentDetails)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnConformancePack =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConformancePack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConformancePack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConformancePack):
        CfnConformancePack = CfnConformancePack(cdkObject)

    internal fun unwrap(wrapped: CfnConformancePack):
        software.amazon.awscdk.services.config.CfnConformancePack = wrapped.cdkObject
  }

  public interface TemplateSSMDocumentDetailsProperty {
    public fun documentName(): String? = unwrap(this).getDocumentName()

    public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    public interface Builder {
      public fun documentName(documentName: String)

      public fun documentVersion(documentVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty.builder()

      override fun documentName(documentName: String) {
        cdkBuilder.documentName(documentName)
      }

      override fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty,
    ) : TemplateSSMDocumentDetailsProperty {
      override fun documentName(): String? = unwrap(this).getDocumentName()

      override fun documentVersion(): String? = unwrap(this).getDocumentVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TemplateSSMDocumentDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty):
          TemplateSSMDocumentDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateSSMDocumentDetailsProperty):
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConformancePackInputParameterProperty {
    public fun parameterName(): String

    public fun parameterValue(): String

    public interface Builder {
      public fun parameterName(parameterName: String)

      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty.builder()

      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty,
    ) : ConformancePackInputParameterProperty {
      override fun parameterName(): String = unwrap(this).getParameterName()

      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConformancePackInputParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty):
          ConformancePackInputParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConformancePackInputParameterProperty):
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
