@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CloudFormationProductVersion {
  public fun cloudFormationTemplate(): CloudFormationTemplate

  public fun description(): String? = unwrap(this).getDescription()

  public fun productVersionName(): String? = unwrap(this).getProductVersionName()

  public fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()

  @CdkDslMarker
  public interface Builder {
    public fun cloudFormationTemplate(cloudFormationTemplate: CloudFormationTemplate)

    public fun description(description: String)

    public fun productVersionName(productVersionName: String)

    public fun validateTemplate(validateTemplate: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion.builder()

    override fun cloudFormationTemplate(cloudFormationTemplate: CloudFormationTemplate) {
      cdkBuilder.cloudFormationTemplate(cloudFormationTemplate.let(CloudFormationTemplate::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun productVersionName(productVersionName: String) {
      cdkBuilder.productVersionName(productVersionName)
    }

    override fun validateTemplate(validateTemplate: Boolean) {
      cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion,
  ) : CdkObject(cdkObject), CloudFormationProductVersion {
    override fun cloudFormationTemplate(): CloudFormationTemplate =
        unwrap(this).getCloudFormationTemplate().let(CloudFormationTemplate::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun productVersionName(): String? = unwrap(this).getProductVersionName()

    override fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationProductVersion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion):
        CloudFormationProductVersion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationProductVersion):
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
  }
}
