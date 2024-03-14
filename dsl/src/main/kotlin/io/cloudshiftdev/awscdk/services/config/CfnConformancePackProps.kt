package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConformancePackProps {
  /**
   * A list of ConformancePackInputParameter objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
   */
  public fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  /**
   * Name of the conformance pack you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname)
   */
  public fun conformancePackName(): String

  /**
   * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket)
   */
  public fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

  /**
   * The prefix for the Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix)
   */
  public fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

  /**
   * A string containing full conformance pack template body.
   *
   * Structure containing the template body with a minimum length of 1 byte and a maximum length of
   * 51,200 bytes.
   *
   *
   * You can only use a YAML template with two resource types: config rule (
   * `AWS::Config::ConfigRule` ) and a remediation action ( `AWS::Config::RemediationConfiguration` ).
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody)
   */
  public fun templateBody(): String? = unwrap(this).getTemplateBody()

  /**
   * Location of file containing the template body (s3://bucketname/prefix).
   *
   * The uri must point to the conformance pack template (max size: 300 KB) that is located in an
   * Amazon S3 bucket.
   *
   *
   * You must have access to read Amazon S3 bucket.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri)
   */
  public fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  /**
   * An object that contains the name or Amazon Resource Name (ARN) of the AWS Systems Manager
   * document (SSM document) and the version of the SSM document that is used to create a conformance
   * pack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatessmdocumentdetails)
   */
  public fun templateSsmDocumentDetails(): Any? = unwrap(this).getTemplateSsmDocumentDetails()

  /**
   * A builder for [CfnConformancePackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable)

    /**
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: List<Any>)

    /**
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any)

    /**
     * @param conformancePackName Name of the conformance pack you want to create. 
     */
    public fun conformancePackName(conformancePackName: String)

    /**
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     * pack templates.
     */
    public fun deliveryS3Bucket(deliveryS3Bucket: String)

    /**
     * @param deliveryS3KeyPrefix The prefix for the Amazon S3 bucket.
     */
    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String)

    /**
     * @param templateBody A string containing full conformance pack template body.
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     *
     * You can only use a YAML template with two resource types: config rule (
     * `AWS::Config::ConfigRule` ) and a remediation action ( `AWS::Config::RemediationConfiguration`
     * ).
     */
    public fun templateBody(templateBody: String)

    /**
     * @param templateS3Uri Location of file containing the template body (s3://bucketname/prefix).
     * The uri must point to the conformance pack template (max size: 300 KB) that is located in an
     * Amazon S3 bucket.
     *
     *
     * You must have access to read Amazon S3 bucket.
     */
    public fun templateS3Uri(templateS3Uri: String)

    /**
     * @param templateSsmDocumentDetails An object that contains the name or Amazon Resource Name
     * (ARN) of the AWS Systems Manager document (SSM document) and the version of the SSM document
     * that is used to create a conformance pack.
     */
    public fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConformancePackProps.Builder =
        software.amazon.awscdk.services.config.CfnConformancePackProps.builder()

    /**
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    override fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters.let(IResolvable::unwrap))
    }

    /**
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    override fun conformancePackInputParameters(conformancePackInputParameters: List<Any>) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    /**
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    override fun conformancePackInputParameters(vararg conformancePackInputParameters: Any): Unit =
        conformancePackInputParameters(conformancePackInputParameters.toList())

    /**
     * @param conformancePackName Name of the conformance pack you want to create. 
     */
    override fun conformancePackName(conformancePackName: String) {
      cdkBuilder.conformancePackName(conformancePackName)
    }

    /**
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     * pack templates.
     */
    override fun deliveryS3Bucket(deliveryS3Bucket: String) {
      cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    /**
     * @param deliveryS3KeyPrefix The prefix for the Amazon S3 bucket.
     */
    override fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
      cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    /**
     * @param templateBody A string containing full conformance pack template body.
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     *
     * You can only use a YAML template with two resource types: config rule (
     * `AWS::Config::ConfigRule` ) and a remediation action ( `AWS::Config::RemediationConfiguration`
     * ).
     */
    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    /**
     * @param templateS3Uri Location of file containing the template body (s3://bucketname/prefix).
     * The uri must point to the conformance pack template (max size: 300 KB) that is located in an
     * Amazon S3 bucket.
     *
     *
     * You must have access to read Amazon S3 bucket.
     */
    override fun templateS3Uri(templateS3Uri: String) {
      cdkBuilder.templateS3Uri(templateS3Uri)
    }

    /**
     * @param templateSsmDocumentDetails An object that contains the name or Amazon Resource Name
     * (ARN) of the AWS Systems Manager document (SSM document) and the version of the SSM document
     * that is used to create a conformance pack.
     */
    override fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any) {
      cdkBuilder.templateSsmDocumentDetails(templateSsmDocumentDetails)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnConformancePackProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnConformancePackProps,
  ) : CdkObject(cdkObject), CfnConformancePackProps {
    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     */
    override fun conformancePackInputParameters(): Any? =
        unwrap(this).getConformancePackInputParameters()

    /**
     * Name of the conformance pack you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname)
     */
    override fun conformancePackName(): String = unwrap(this).getConformancePackName()

    /**
     * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket)
     */
    override fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

    /**
     * The prefix for the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix)
     */
    override fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

    /**
     * A string containing full conformance pack template body.
     *
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     *
     * You can only use a YAML template with two resource types: config rule (
     * `AWS::Config::ConfigRule` ) and a remediation action ( `AWS::Config::RemediationConfiguration`
     * ).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody)
     */
    override fun templateBody(): String? = unwrap(this).getTemplateBody()

    /**
     * Location of file containing the template body (s3://bucketname/prefix).
     *
     * The uri must point to the conformance pack template (max size: 300 KB) that is located in an
     * Amazon S3 bucket.
     *
     *
     * You must have access to read Amazon S3 bucket.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri)
     */
    override fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

    /**
     * An object that contains the name or Amazon Resource Name (ARN) of the AWS Systems Manager
     * document (SSM document) and the version of the SSM document that is used to create a conformance
     * pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatessmdocumentdetails)
     */
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
