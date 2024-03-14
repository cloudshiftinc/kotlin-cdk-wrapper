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

public open class CfnOrganizationConformancePack internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConformancePack,
) : CfnResource(cdkObject), IInspectable {
  public open fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  public open fun conformancePackInputParameters(`value`: IResolvable) {
    unwrap(this).setConformancePackInputParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun conformancePackInputParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setConformancePackInputParameters(__idx_ac66f0)
  }

  public open fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

  public open fun deliveryS3Bucket(`value`: String) {
    unwrap(this).setDeliveryS3Bucket(`value`)
  }

  public open fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

  public open fun deliveryS3KeyPrefix(`value`: String) {
    unwrap(this).setDeliveryS3KeyPrefix(`value`)
  }

  public open fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?:
      emptyList()

  public open fun excludedAccounts(`value`: List<String>) {
    unwrap(this).setExcludedAccounts(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun organizationConformancePackName(): String =
      unwrap(this).getOrganizationConformancePackName()

  public open fun organizationConformancePackName(`value`: String) {
    unwrap(this).setOrganizationConformancePackName(`value`)
  }

  public open fun templateBody(): String? = unwrap(this).getTemplateBody()

  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  public open fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  public open fun templateS3Uri(`value`: String) {
    unwrap(this).setTemplateS3Uri(`value`)
  }

  public interface Builder {
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable)

    public fun conformancePackInputParameters(conformancePackInputParameters: List<Any>)

    public fun deliveryS3Bucket(deliveryS3Bucket: String)

    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String)

    public fun excludedAccounts(excludedAccounts: List<String>)

    public fun organizationConformancePackName(organizationConformancePackName: String)

    public fun templateBody(templateBody: String)

    public fun templateS3Uri(templateS3Uri: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnOrganizationConformancePack.Builder =
        software.amazon.awscdk.services.config.CfnOrganizationConformancePack.Builder.create(scope,
        id)

    override fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters.let(IResolvable::unwrap))
    }

    override fun conformancePackInputParameters(conformancePackInputParameters: List<Any>) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    override fun deliveryS3Bucket(deliveryS3Bucket: String) {
      cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    override fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
      cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    override fun excludedAccounts(excludedAccounts: List<String>) {
      cdkBuilder.excludedAccounts(excludedAccounts)
    }

    override fun organizationConformancePackName(organizationConformancePackName: String) {
      cdkBuilder.organizationConformancePackName(organizationConformancePackName)
    }

    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    override fun templateS3Uri(templateS3Uri: String) {
      cdkBuilder.templateS3Uri(templateS3Uri)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnOrganizationConformancePack =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganizationConformancePack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganizationConformancePack(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConformancePack):
        CfnOrganizationConformancePack = CfnOrganizationConformancePack(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationConformancePack):
        software.amazon.awscdk.services.config.CfnOrganizationConformancePack = wrapped.cdkObject
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
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty.builder()

      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty):
          ConformancePackInputParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConformancePackInputParameterProperty):
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
