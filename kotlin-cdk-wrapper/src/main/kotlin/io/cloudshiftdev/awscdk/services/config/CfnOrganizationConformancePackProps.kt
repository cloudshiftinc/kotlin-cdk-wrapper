@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnOrganizationConformancePackProps {
  public fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  public fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

  public fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

  public fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?: emptyList()

  public fun organizationConformancePackName(): String

  public fun templateBody(): String? = unwrap(this).getTemplateBody()

  public fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps.Builder =
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps.builder()

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

    public fun build(): software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps,
  ) : CdkObject(cdkObject), CfnOrganizationConformancePackProps {
    override fun conformancePackInputParameters(): Any? =
        unwrap(this).getConformancePackInputParameters()

    override fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

    override fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

    override fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?:
        emptyList()

    override fun organizationConformancePackName(): String =
        unwrap(this).getOrganizationConformancePackName()

    override fun templateBody(): String? = unwrap(this).getTemplateBody()

    override fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnOrganizationConformancePackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps):
        CfnOrganizationConformancePackProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationConformancePackProps):
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps
  }
}
