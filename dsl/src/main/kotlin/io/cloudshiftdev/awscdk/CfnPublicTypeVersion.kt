package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPublicTypeVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnPublicTypeVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Number (ARN) of the extension.
   */
  public open fun arn(): String? = unwrap(this).getArn()

  /**
   * The Amazon Resource Number (ARN) of the extension.
   */
  public open fun arn(`value`: String) {
    unwrap(this).setArn(`value`)
  }

  /**
   * The Amazon Resource Number (ARN) assigned to the public extension upon publication.
   */
  public open fun attrPublicTypeArn(): String = unwrap(this).getAttrPublicTypeArn()

  /**
   * The publisher ID of the extension publisher.
   *
   * This applies only to public third-party extensions. For private registered extensions, and
   * extensions provided by AWS , CloudFormation returns `null` .
   */
  public open fun attrPublisherId(): String = unwrap(this).getAttrPublisherId()

  /**
   * The Amazon Resource Number (ARN) assigned to this version of the extension.
   */
  public open fun attrTypeVersionArn(): String = unwrap(this).getAttrTypeVersionArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The S3 bucket to which CloudFormation delivers the contract test execution logs.
   */
  public open fun logDeliveryBucket(): String? = unwrap(this).getLogDeliveryBucket()

  /**
   * The S3 bucket to which CloudFormation delivers the contract test execution logs.
   */
  public open fun logDeliveryBucket(`value`: String) {
    unwrap(this).setLogDeliveryBucket(`value`)
  }

  /**
   * The version number to assign to this version of the extension.
   */
  public open fun publicVersionNumber(): String? = unwrap(this).getPublicVersionNumber()

  /**
   * The version number to assign to this version of the extension.
   */
  public open fun publicVersionNumber(`value`: String) {
    unwrap(this).setPublicVersionNumber(`value`)
  }

  /**
   * The type of the extension to test.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of the extension to test.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The name of the extension to test.
   */
  public open fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * The name of the extension to test.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnPublicTypeVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Number (ARN) of the extension.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-arn)
     * @param arn The Amazon Resource Number (ARN) of the extension. 
     */
    public fun arn(arn: String)

    /**
     * The S3 bucket to which CloudFormation delivers the contract test execution logs.
     *
     * CloudFormation delivers the logs by the time contract testing has completed and the extension
     * has been assigned a test type status of `PASSED` or `FAILED` .
     *
     * The user initiating the stack operation must be able to access items in the specified S3
     * bucket. Specifically, the user needs the following permissions:
     *
     * * GetObject
     * * PutObject
     *
     * For more information, see [Actions, Resources, and Condition Keys for Amazon
     * S3](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html) in
     * the *AWS Identity and Access Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-logdeliverybucket)
     * @param logDeliveryBucket The S3 bucket to which CloudFormation delivers the contract test
     * execution logs. 
     */
    public fun logDeliveryBucket(logDeliveryBucket: String)

    /**
     * The version number to assign to this version of the extension.
     *
     * Use the following format, and adhere to semantic versioning when assigning a version number
     * to your extension:
     *
     * `MAJOR.MINOR.PATCH`
     *
     * For more information, see [Semantic Versioning
     * 2.0.0](https://docs.aws.amazon.com/https://semver.org/) .
     *
     * If you don't specify a version number, CloudFormation increments the version number by one
     * minor version release.
     *
     * You cannot specify a version number the first time you publish a type. AWS CloudFormation
     * automatically sets the first version number to be `1.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-publicversionnumber)
     * @param publicVersionNumber The version number to assign to this version of the extension. 
     */
    public fun publicVersionNumber(publicVersionNumber: String)

    /**
     * The type of the extension to test.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-type)
     * @param type The type of the extension to test. 
     */
    public fun type(type: String)

    /**
     * The name of the extension to test.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-typename)
     * @param typeName The name of the extension to test. 
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnPublicTypeVersion.Builder =
        software.amazon.awscdk.CfnPublicTypeVersion.Builder.create(scope, id)

    /**
     * The Amazon Resource Number (ARN) of the extension.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-arn)
     * @param arn The Amazon Resource Number (ARN) of the extension. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * The S3 bucket to which CloudFormation delivers the contract test execution logs.
     *
     * CloudFormation delivers the logs by the time contract testing has completed and the extension
     * has been assigned a test type status of `PASSED` or `FAILED` .
     *
     * The user initiating the stack operation must be able to access items in the specified S3
     * bucket. Specifically, the user needs the following permissions:
     *
     * * GetObject
     * * PutObject
     *
     * For more information, see [Actions, Resources, and Condition Keys for Amazon
     * S3](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html) in
     * the *AWS Identity and Access Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-logdeliverybucket)
     * @param logDeliveryBucket The S3 bucket to which CloudFormation delivers the contract test
     * execution logs. 
     */
    override fun logDeliveryBucket(logDeliveryBucket: String) {
      cdkBuilder.logDeliveryBucket(logDeliveryBucket)
    }

    /**
     * The version number to assign to this version of the extension.
     *
     * Use the following format, and adhere to semantic versioning when assigning a version number
     * to your extension:
     *
     * `MAJOR.MINOR.PATCH`
     *
     * For more information, see [Semantic Versioning
     * 2.0.0](https://docs.aws.amazon.com/https://semver.org/) .
     *
     * If you don't specify a version number, CloudFormation increments the version number by one
     * minor version release.
     *
     * You cannot specify a version number the first time you publish a type. AWS CloudFormation
     * automatically sets the first version number to be `1.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-publicversionnumber)
     * @param publicVersionNumber The version number to assign to this version of the extension. 
     */
    override fun publicVersionNumber(publicVersionNumber: String) {
      cdkBuilder.publicVersionNumber(publicVersionNumber)
    }

    /**
     * The type of the extension to test.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-type)
     * @param type The type of the extension to test. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The name of the extension to test.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-typename)
     * @param typeName The name of the extension to test. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnPublicTypeVersion = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublicTypeVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublicTypeVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnPublicTypeVersion): CfnPublicTypeVersion
        = CfnPublicTypeVersion(cdkObject)

    internal fun unwrap(wrapped: CfnPublicTypeVersion): software.amazon.awscdk.CfnPublicTypeVersion
        = wrapped.cdkObject
  }
}
