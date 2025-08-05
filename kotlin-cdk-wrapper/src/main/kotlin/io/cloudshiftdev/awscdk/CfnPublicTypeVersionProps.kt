@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPublicTypeVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnPublicTypeVersionProps cfnPublicTypeVersionProps = CfnPublicTypeVersionProps.builder()
 * .arn("arn")
 * .logDeliveryBucket("logDeliveryBucket")
 * .publicVersionNumber("publicVersionNumber")
 * .type("type")
 * .typeName("typeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html)
 */
public interface CfnPublicTypeVersionProps {
  /**
   * The Amazon Resource Number (ARN) of the extension.
   *
   * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-arn)
   */
  public fun arn(): String? = unwrap(this).getArn()

  /**
   * The S3 bucket to which CloudFormation delivers the contract test execution logs.
   *
   * CloudFormation delivers the logs by the time contract testing has completed and the extension
   * has been assigned a test type status of `PASSED` or `FAILED` .
   *
   * The user initiating the stack operation must be able to access items in the specified S3
   * bucket. Specifically, the user needs the following permissions:
   *
   * * s3:GetObject
   * * s3:PutObject
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-logdeliverybucket)
   */
  public fun logDeliveryBucket(): String? = unwrap(this).getLogDeliveryBucket()

  /**
   * The version number to assign to this version of the extension.
   *
   * Use the following format, and adhere to semantic versioning when assigning a version number to
   * your extension:
   *
   * `MAJOR.MINOR.PATCH`
   *
   * For more information, see [Semantic Versioning
   * 2.0.0](https://docs.aws.amazon.com/https://semver.org/) .
   *
   * If you don't specify a version number, CloudFormation increments the version number by one
   * minor version release.
   *
   * You cannot specify a version number the first time you publish a type. CloudFormation
   * automatically sets the first version number to be `1.0.0` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-publicversionnumber)
   */
  public fun publicVersionNumber(): String? = unwrap(this).getPublicVersionNumber()

  /**
   * The type of the extension to test.
   *
   * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * The name of the extension to test.
   *
   * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-typename)
   */
  public fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * A builder for [CfnPublicTypeVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The Amazon Resource Number (ARN) of the extension.
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     */
    public fun arn(arn: String)

    /**
     * @param logDeliveryBucket The S3 bucket to which CloudFormation delivers the contract test
     * execution logs.
     * CloudFormation delivers the logs by the time contract testing has completed and the extension
     * has been assigned a test type status of `PASSED` or `FAILED` .
     *
     * The user initiating the stack operation must be able to access items in the specified S3
     * bucket. Specifically, the user needs the following permissions:
     *
     * * s3:GetObject
     * * s3:PutObject
     */
    public fun logDeliveryBucket(logDeliveryBucket: String)

    /**
     * @param publicVersionNumber The version number to assign to this version of the extension.
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
     * You cannot specify a version number the first time you publish a type. CloudFormation
     * automatically sets the first version number to be `1.0.0` .
     */
    public fun publicVersionNumber(publicVersionNumber: String)

    /**
     * @param type The type of the extension to test.
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     */
    public fun type(type: String)

    /**
     * @param typeName The name of the extension to test.
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnPublicTypeVersionProps.Builder =
        software.amazon.awscdk.CfnPublicTypeVersionProps.builder()

    /**
     * @param arn The Amazon Resource Number (ARN) of the extension.
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param logDeliveryBucket The S3 bucket to which CloudFormation delivers the contract test
     * execution logs.
     * CloudFormation delivers the logs by the time contract testing has completed and the extension
     * has been assigned a test type status of `PASSED` or `FAILED` .
     *
     * The user initiating the stack operation must be able to access items in the specified S3
     * bucket. Specifically, the user needs the following permissions:
     *
     * * s3:GetObject
     * * s3:PutObject
     */
    override fun logDeliveryBucket(logDeliveryBucket: String) {
      cdkBuilder.logDeliveryBucket(logDeliveryBucket)
    }

    /**
     * @param publicVersionNumber The version number to assign to this version of the extension.
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
     * You cannot specify a version number the first time you publish a type. CloudFormation
     * automatically sets the first version number to be `1.0.0` .
     */
    override fun publicVersionNumber(publicVersionNumber: String) {
      cdkBuilder.publicVersionNumber(publicVersionNumber)
    }

    /**
     * @param type The type of the extension to test.
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param typeName The name of the extension to test.
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnPublicTypeVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnPublicTypeVersionProps,
  ) : CdkObject(cdkObject),
      CfnPublicTypeVersionProps {
    /**
     * The Amazon Resource Number (ARN) of the extension.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-arn)
     */
    override fun arn(): String? = unwrap(this).getArn()

    /**
     * The S3 bucket to which CloudFormation delivers the contract test execution logs.
     *
     * CloudFormation delivers the logs by the time contract testing has completed and the extension
     * has been assigned a test type status of `PASSED` or `FAILED` .
     *
     * The user initiating the stack operation must be able to access items in the specified S3
     * bucket. Specifically, the user needs the following permissions:
     *
     * * s3:GetObject
     * * s3:PutObject
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-logdeliverybucket)
     */
    override fun logDeliveryBucket(): String? = unwrap(this).getLogDeliveryBucket()

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
     * You cannot specify a version number the first time you publish a type. CloudFormation
     * automatically sets the first version number to be `1.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-publicversionnumber)
     */
    override fun publicVersionNumber(): String? = unwrap(this).getPublicVersionNumber()

    /**
     * The type of the extension to test.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-type)
     */
    override fun type(): String? = unwrap(this).getType()

    /**
     * The name of the extension to test.
     *
     * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-typename)
     */
    override fun typeName(): String? = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicTypeVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnPublicTypeVersionProps):
        CfnPublicTypeVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPublicTypeVersionProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublicTypeVersionProps):
        software.amazon.awscdk.CfnPublicTypeVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnPublicTypeVersionProps
  }
}
