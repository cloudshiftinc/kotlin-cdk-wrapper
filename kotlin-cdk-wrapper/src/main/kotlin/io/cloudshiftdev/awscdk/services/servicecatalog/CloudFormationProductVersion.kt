@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties of product version (also known as a provisioning artifact).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CloudFormationTemplate cloudFormationTemplate;
 * CloudFormationProductVersion cloudFormationProductVersion =
 * CloudFormationProductVersion.builder()
 * .cloudFormationTemplate(cloudFormationTemplate)
 * // the properties below are optional
 * .description("description")
 * .productVersionName("productVersionName")
 * .validateTemplate(false)
 * .build();
 * ```
 */
public interface CloudFormationProductVersion {
  /**
   * The S3 template that points to the provisioning version template.
   */
  public fun cloudFormationTemplate(): CloudFormationTemplate

  /**
   * The description of the product version.
   *
   * Default: - No description provided
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the product version.
   *
   * Default: - No product version name provided
   */
  public fun productVersionName(): String? = unwrap(this).getProductVersionName()

  /**
   * Whether the specified product template will be validated by CloudFormation.
   *
   * If turned off, an invalid template configuration can be stored.
   *
   * Default: true
   */
  public fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()

  /**
   * A builder for [CloudFormationProductVersion]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudFormationTemplate The S3 template that points to the provisioning version
     * template. 
     */
    public fun cloudFormationTemplate(cloudFormationTemplate: CloudFormationTemplate)

    /**
     * @param description The description of the product version.
     */
    public fun description(description: String)

    /**
     * @param productVersionName The name of the product version.
     */
    public fun productVersionName(productVersionName: String)

    /**
     * @param validateTemplate Whether the specified product template will be validated by
     * CloudFormation.
     * If turned off, an invalid template configuration can be stored.
     */
    public fun validateTemplate(validateTemplate: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion.builder()

    /**
     * @param cloudFormationTemplate The S3 template that points to the provisioning version
     * template. 
     */
    override fun cloudFormationTemplate(cloudFormationTemplate: CloudFormationTemplate) {
      cdkBuilder.cloudFormationTemplate(cloudFormationTemplate.let(CloudFormationTemplate.Companion::unwrap))
    }

    /**
     * @param description The description of the product version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param productVersionName The name of the product version.
     */
    override fun productVersionName(productVersionName: String) {
      cdkBuilder.productVersionName(productVersionName)
    }

    /**
     * @param validateTemplate Whether the specified product template will be validated by
     * CloudFormation.
     * If turned off, an invalid template configuration can be stored.
     */
    override fun validateTemplate(validateTemplate: Boolean) {
      cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion,
  ) : CdkObject(cdkObject),
      CloudFormationProductVersion {
    /**
     * The S3 template that points to the provisioning version template.
     */
    override fun cloudFormationTemplate(): CloudFormationTemplate =
        unwrap(this).getCloudFormationTemplate().let(CloudFormationTemplate::wrap)

    /**
     * The description of the product version.
     *
     * Default: - No description provided
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the product version.
     *
     * Default: - No product version name provided
     */
    override fun productVersionName(): String? = unwrap(this).getProductVersionName()

    /**
     * Whether the specified product template will be validated by CloudFormation.
     *
     * If turned off, an invalid template configuration can be stored.
     *
     * Default: true
     */
    override fun validateTemplate(): Boolean? = unwrap(this).getValidateTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationProductVersion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion):
        CloudFormationProductVersion = CdkObjectWrappers.wrap(cdkObject) as?
        CloudFormationProductVersion ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationProductVersion):
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
  }
}
