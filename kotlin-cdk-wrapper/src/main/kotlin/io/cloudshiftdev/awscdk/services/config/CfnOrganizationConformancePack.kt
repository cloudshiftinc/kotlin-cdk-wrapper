@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOrganizationConformancePack internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.config.CfnOrganizationConformancePack,
) : CfnResource(cdkObject), IInspectable {
  public open fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  public open fun conformancePackInputParameters(`value`: IResolvable) {
    unwrap(this).setConformancePackInputParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun conformancePackInputParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setConformancePackInputParameters(__idx_ac66f0)
  }

  public open fun conformancePackInputParameters(vararg __idx_ac66f0: Any): Unit =
      conformancePackInputParameters(__idx_ac66f0.toList())

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

  public open fun excludedAccounts(vararg `value`: String): Unit =
      excludedAccounts(`value`.toList())

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

  @CdkDslMarker
  public interface Builder {
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable)

    public fun conformancePackInputParameters(conformancePackInputParameters: List<Any>)

    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any)

    public fun deliveryS3Bucket(deliveryS3Bucket: String)

    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String)

    public fun excludedAccounts(excludedAccounts: List<String>)

    public fun excludedAccounts(vararg excludedAccounts: String)

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

    override fun conformancePackInputParameters(vararg conformancePackInputParameters: Any): Unit =
        conformancePackInputParameters(conformancePackInputParameters.toList())

    override fun deliveryS3Bucket(deliveryS3Bucket: String) {
      cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    override fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
      cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    override fun excludedAccounts(excludedAccounts: List<String>) {
      cdkBuilder.excludedAccounts(excludedAccounts)
    }

    override fun excludedAccounts(vararg excludedAccounts: String): Unit =
        excludedAccounts(excludedAccounts.toList())

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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnOrganizationConformancePack.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty,
    ) : CdkObject(cdkObject), ConformancePackInputParameterProperty {
      override fun parameterName(): String = unwrap(this).getParameterName()

      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty
    }
  }
}
