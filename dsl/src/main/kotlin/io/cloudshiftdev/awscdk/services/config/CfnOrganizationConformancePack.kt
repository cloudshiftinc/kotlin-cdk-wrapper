package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOrganizationConformancePack internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConformancePack,
) : CfnResource(cdkObject), IInspectable {
  /**
   * A list of `ConformancePackInputParameter` objects.
   */
  public open fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  /**
   * A list of `ConformancePackInputParameter` objects.
   */
  public open fun conformancePackInputParameters(`value`: IResolvable) {
    unwrap(this).setConformancePackInputParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `ConformancePackInputParameter` objects.
   */
  public open fun conformancePackInputParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setConformancePackInputParameters(__idx_ac66f0)
  }

  /**
   * A list of `ConformancePackInputParameter` objects.
   */
  public open fun conformancePackInputParameters(vararg __idx_ac66f0: Any): Unit =
      conformancePackInputParameters(__idx_ac66f0.toList())

  /**
   * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
   */
  public open fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

  /**
   * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
   */
  public open fun deliveryS3Bucket(`value`: String) {
    unwrap(this).setDeliveryS3Bucket(`value`)
  }

  /**
   * Any folder structure you want to add to an Amazon S3 bucket.
   */
  public open fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

  /**
   * Any folder structure you want to add to an Amazon S3 bucket.
   */
  public open fun deliveryS3KeyPrefix(`value`: String) {
    unwrap(this).setDeliveryS3KeyPrefix(`value`)
  }

  /**
   * A comma-separated list of accounts excluded from organization conformance pack.
   */
  public open fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?:
      emptyList()

  /**
   * A comma-separated list of accounts excluded from organization conformance pack.
   */
  public open fun excludedAccounts(`value`: List<String>) {
    unwrap(this).setExcludedAccounts(`value`)
  }

  /**
   * A comma-separated list of accounts excluded from organization conformance pack.
   */
  public open fun excludedAccounts(vararg `value`: String): Unit =
      excludedAccounts(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name you assign to an organization conformance pack.
   */
  public open fun organizationConformancePackName(): String =
      unwrap(this).getOrganizationConformancePackName()

  /**
   * The name you assign to an organization conformance pack.
   */
  public open fun organizationConformancePackName(`value`: String) {
    unwrap(this).setOrganizationConformancePackName(`value`)
  }

  /**
   * A string containing full conformance pack template body.
   */
  public open fun templateBody(): String? = unwrap(this).getTemplateBody()

  /**
   * A string containing full conformance pack template body.
   */
  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  /**
   * Location of file containing the template body.
   */
  public open fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  /**
   * Location of file containing the template body.
   */
  public open fun templateS3Uri(`value`: String) {
    unwrap(this).setTemplateS3Uri(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnOrganizationConformancePack].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of `ConformancePackInputParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable)

    /**
     * A list of `ConformancePackInputParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: List<Any>)

    /**
     * A list of `ConformancePackInputParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
     */
    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any)

    /**
     * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
     *
     *
     * This field is optional.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket)
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     * pack templates. 
     */
    public fun deliveryS3Bucket(deliveryS3Bucket: String)

    /**
     * Any folder structure you want to add to an Amazon S3 bucket.
     *
     *
     * This field is optional.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix)
     * @param deliveryS3KeyPrefix Any folder structure you want to add to an Amazon S3 bucket. 
     */
    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String)

    /**
     * A comma-separated list of accounts excluded from organization conformance pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts)
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     * conformance pack. 
     */
    public fun excludedAccounts(excludedAccounts: List<String>)

    /**
     * A comma-separated list of accounts excluded from organization conformance pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts)
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     * conformance pack. 
     */
    public fun excludedAccounts(vararg excludedAccounts: String)

    /**
     * The name you assign to an organization conformance pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname)
     * @param organizationConformancePackName The name you assign to an organization conformance
     * pack. 
     */
    public fun organizationConformancePackName(organizationConformancePackName: String)

    /**
     * A string containing full conformance pack template body.
     *
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody)
     * @param templateBody A string containing full conformance pack template body. 
     */
    public fun templateBody(templateBody: String)

    /**
     * Location of file containing the template body.
     *
     * The uri must point to the conformance pack template (max size: 300 KB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri)
     * @param templateS3Uri Location of file containing the template body. 
     */
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

    /**
     * A list of `ConformancePackInputParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
     */
    override fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters.let(IResolvable::unwrap))
    }

    /**
     * A list of `ConformancePackInputParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
     */
    override fun conformancePackInputParameters(conformancePackInputParameters: List<Any>) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    /**
     * A list of `ConformancePackInputParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
     */
    override fun conformancePackInputParameters(vararg conformancePackInputParameters: Any): Unit =
        conformancePackInputParameters(conformancePackInputParameters.toList())

    /**
     * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
     *
     *
     * This field is optional.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket)
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     * pack templates. 
     */
    override fun deliveryS3Bucket(deliveryS3Bucket: String) {
      cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    /**
     * Any folder structure you want to add to an Amazon S3 bucket.
     *
     *
     * This field is optional.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix)
     * @param deliveryS3KeyPrefix Any folder structure you want to add to an Amazon S3 bucket. 
     */
    override fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
      cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    /**
     * A comma-separated list of accounts excluded from organization conformance pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts)
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     * conformance pack. 
     */
    override fun excludedAccounts(excludedAccounts: List<String>) {
      cdkBuilder.excludedAccounts(excludedAccounts)
    }

    /**
     * A comma-separated list of accounts excluded from organization conformance pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts)
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     * conformance pack. 
     */
    override fun excludedAccounts(vararg excludedAccounts: String): Unit =
        excludedAccounts(excludedAccounts.toList())

    /**
     * The name you assign to an organization conformance pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname)
     * @param organizationConformancePackName The name you assign to an organization conformance
     * pack. 
     */
    override fun organizationConformancePackName(organizationConformancePackName: String) {
      cdkBuilder.organizationConformancePackName(organizationConformancePackName)
    }

    /**
     * A string containing full conformance pack template body.
     *
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody)
     * @param templateBody A string containing full conformance pack template body. 
     */
    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    /**
     * Location of file containing the template body.
     *
     * The uri must point to the conformance pack template (max size: 300 KB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri)
     * @param templateS3Uri Location of file containing the template body. 
     */
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
    /**
     * One part of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconformancepack-conformancepackinputparameter.html#cfn-config-organizationconformancepack-conformancepackinputparameter-parametername)
     */
    public fun parameterName(): String

    /**
     * One part of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconformancepack-conformancepackinputparameter.html#cfn-config-organizationconformancepack-conformancepackinputparameter-parametervalue)
     */
    public fun parameterValue(): String

    /**
     * A builder for [ConformancePackInputParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterName One part of a key-value pair. 
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue One part of a key-value pair. 
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty.builder()

      /**
       * @param parameterName One part of a key-value pair. 
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue One part of a key-value pair. 
       */
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
      /**
       * One part of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconformancepack-conformancepackinputparameter.html#cfn-config-organizationconformancepack-conformancepackinputparameter-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()

      /**
       * One part of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconformancepack-conformancepackinputparameter.html#cfn-config-organizationconformancepack-conformancepackinputparameter-parametervalue)
       */
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
