package io.cloudshiftdev.awscdk.services.servicecatalog

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CloudFormationProductVersion {
  public fun cloudFormationTemplate(): CloudFormationTemplate

  public fun description(): String? = unwrap(this).getDescription()

  public fun productVersionName(): String? = unwrap(this).getProductVersionName()

  public fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()

  public interface Builder {
    public fun cloudFormationTemplate(cloudFormationTemplate: CloudFormationTemplate) {
    }

    public fun description(description: String) {
    }

    public fun productVersionName(productVersionName: String) {
    }

    public fun validateTemplate(validateTemplate: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion.builder()

    public override fun cloudFormationTemplate(cloudFormationTemplate: CloudFormationTemplate) {
      cdkBuilder.cloudFormationTemplate(cloudFormationTemplate.let(CloudFormationTemplate::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun productVersionName(productVersionName: String) {
      cdkBuilder.productVersionName(productVersionName)
    }

    public override fun validateTemplate(validateTemplate: Boolean) {
      cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion,
  ) : CloudFormationProductVersion {
    public override fun cloudFormationTemplate(): CloudFormationTemplate =
        unwrap(this).getCloudFormationTemplate().let(CloudFormationTemplate::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun productVersionName(): String? = unwrap(this).getProductVersionName()

    public override fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationProductVersion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion):
        CloudFormationProductVersion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationProductVersion):
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion = (wrapped as
        Wrapper).cdkObject
  }
}
