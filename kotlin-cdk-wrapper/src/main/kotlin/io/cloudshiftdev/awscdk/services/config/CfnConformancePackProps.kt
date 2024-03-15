@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConformancePackProps {
  public fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  public fun conformancePackName(): String

  public fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

  public fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

  public fun templateBody(): String? = unwrap(this).getTemplateBody()

  public fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  public fun templateSsmDocumentDetails(): Any? = unwrap(this).getTemplateSsmDocumentDetails()

  @CdkDslMarker
  public interface Builder {
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable)

    public fun conformancePackInputParameters(conformancePackInputParameters: List<Any>)

    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any)

    public fun conformancePackName(conformancePackName: String)

    public fun deliveryS3Bucket(deliveryS3Bucket: String)

    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String)

    public fun templateBody(templateBody: String)

    public fun templateS3Uri(templateS3Uri: String)

    public fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConformancePackProps.Builder =
        software.amazon.awscdk.services.config.CfnConformancePackProps.builder()

    override fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters.let(IResolvable::unwrap))
    }

    override fun conformancePackInputParameters(conformancePackInputParameters: List<Any>) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    override fun conformancePackInputParameters(vararg conformancePackInputParameters: Any): Unit =
        conformancePackInputParameters(conformancePackInputParameters.toList())

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

    public fun build(): software.amazon.awscdk.services.config.CfnConformancePackProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnConformancePackProps,
  ) : CdkObject(cdkObject), CfnConformancePackProps {
    override fun conformancePackInputParameters(): Any? =
        unwrap(this).getConformancePackInputParameters()

    override fun conformancePackName(): String = unwrap(this).getConformancePackName()

    override fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

    override fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

    override fun templateBody(): String? = unwrap(this).getTemplateBody()

    override fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

    override fun templateSsmDocumentDetails(): Any? = unwrap(this).getTemplateSsmDocumentDetails()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConformancePackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConformancePackProps):
        CfnConformancePackProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConformancePackProps):
        software.amazon.awscdk.services.config.CfnConformancePackProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.CfnConformancePackProps
  }
}
