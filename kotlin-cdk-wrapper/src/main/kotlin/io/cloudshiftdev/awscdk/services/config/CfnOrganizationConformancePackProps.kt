@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnOrganizationConformancePack`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnOrganizationConformancePackProps cfnOrganizationConformancePackProps =
 * CfnOrganizationConformancePackProps.builder()
 * .organizationConformancePackName("organizationConformancePackName")
 * // the properties below are optional
 * .conformancePackInputParameters(List.of(ConformancePackInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .deliveryS3Bucket("deliveryS3Bucket")
 * .deliveryS3KeyPrefix("deliveryS3KeyPrefix")
 * .excludedAccounts(List.of("excludedAccounts"))
 * .templateBody("templateBody")
 * .templateS3Uri("templateS3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html)
 */
public interface CfnOrganizationConformancePackProps {
  /**
   * A list of `ConformancePackInputParameter` objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
   */
  public fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  /**
   * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
   *
   *
   * This field is optional.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket)
   */
  public fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

  /**
   * Any folder structure you want to add to an Amazon S3 bucket.
   *
   *
   * This field is optional.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix)
   */
  public fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

  /**
   * A comma-separated list of accounts excluded from organization conformance pack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts)
   */
  public fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?: emptyList()

  /**
   * The name you assign to an organization conformance pack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname)
   */
  public fun organizationConformancePackName(): String

  /**
   * A string containing full conformance pack template body.
   *
   * Structure containing the template body with a minimum length of 1 byte and a maximum length of
   * 51,200 bytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody)
   */
  public fun templateBody(): String? = unwrap(this).getTemplateBody()

  /**
   * Location of file containing the template body.
   *
   * The uri must point to the conformance pack template (max size: 300 KB).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri)
   */
  public fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  /**
   * A builder for [CfnOrganizationConformancePackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects.
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable)

    /**
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects.
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: List<Any>)

    /**
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects.
     */
    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any)

    /**
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     * pack templates.
     *
     * This field is optional.
     */
    public fun deliveryS3Bucket(deliveryS3Bucket: String)

    /**
     * @param deliveryS3KeyPrefix Any folder structure you want to add to an Amazon S3 bucket.
     *
     * This field is optional.
     */
    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String)

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     * conformance pack.
     */
    public fun excludedAccounts(excludedAccounts: List<String>)

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     * conformance pack.
     */
    public fun excludedAccounts(vararg excludedAccounts: String)

    /**
     * @param organizationConformancePackName The name you assign to an organization conformance
     * pack. 
     */
    public fun organizationConformancePackName(organizationConformancePackName: String)

    /**
     * @param templateBody A string containing full conformance pack template body.
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     */
    public fun templateBody(templateBody: String)

    /**
     * @param templateS3Uri Location of file containing the template body.
     * The uri must point to the conformance pack template (max size: 300 KB).
     */
    public fun templateS3Uri(templateS3Uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps.Builder =
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps.builder()

    /**
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects.
     */
    override fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters.let(IResolvable::unwrap))
    }

    /**
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects.
     */
    override fun conformancePackInputParameters(conformancePackInputParameters: List<Any>) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    /**
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects.
     */
    override fun conformancePackInputParameters(vararg conformancePackInputParameters: Any): Unit =
        conformancePackInputParameters(conformancePackInputParameters.toList())

    /**
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     * pack templates.
     *
     * This field is optional.
     */
    override fun deliveryS3Bucket(deliveryS3Bucket: String) {
      cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    /**
     * @param deliveryS3KeyPrefix Any folder structure you want to add to an Amazon S3 bucket.
     *
     * This field is optional.
     */
    override fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
      cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     * conformance pack.
     */
    override fun excludedAccounts(excludedAccounts: List<String>) {
      cdkBuilder.excludedAccounts(excludedAccounts)
    }

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     * conformance pack.
     */
    override fun excludedAccounts(vararg excludedAccounts: String): Unit =
        excludedAccounts(excludedAccounts.toList())

    /**
     * @param organizationConformancePackName The name you assign to an organization conformance
     * pack. 
     */
    override fun organizationConformancePackName(organizationConformancePackName: String) {
      cdkBuilder.organizationConformancePackName(organizationConformancePackName)
    }

    /**
     * @param templateBody A string containing full conformance pack template body.
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     */
    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    /**
     * @param templateS3Uri Location of file containing the template body.
     * The uri must point to the conformance pack template (max size: 300 KB).
     */
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
    /**
     * A list of `ConformancePackInputParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
     */
    override fun conformancePackInputParameters(): Any? =
        unwrap(this).getConformancePackInputParameters()

    /**
     * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
     *
     *
     * This field is optional.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket)
     */
    override fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

    /**
     * Any folder structure you want to add to an Amazon S3 bucket.
     *
     *
     * This field is optional.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix)
     */
    override fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

    /**
     * A comma-separated list of accounts excluded from organization conformance pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts)
     */
    override fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?:
        emptyList()

    /**
     * The name you assign to an organization conformance pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname)
     */
    override fun organizationConformancePackName(): String =
        unwrap(this).getOrganizationConformancePackName()

    /**
     * A string containing full conformance pack template body.
     *
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody)
     */
    override fun templateBody(): String? = unwrap(this).getTemplateBody()

    /**
     * Location of file containing the template body.
     *
     * The uri must point to the conformance pack template (max size: 300 KB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri)
     */
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
        CfnOrganizationConformancePackProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnOrganizationConformancePackProps

    internal fun unwrap(wrapped: CfnOrganizationConformancePackProps):
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps
  }
}
