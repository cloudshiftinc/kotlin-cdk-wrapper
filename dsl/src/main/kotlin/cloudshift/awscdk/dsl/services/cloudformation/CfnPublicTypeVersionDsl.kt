@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnPublicTypeVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPublicTypeVersion.Builder = CfnPublicTypeVersion.Builder.create(scope,
      id)

  /**
   * The Amazon Resource Number (ARN) of the extension.
   *
   * Conditional: You must specify `Arn` , or `TypeName` and `Type` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-arn)
   * @param arn The Amazon Resource Number (ARN) of the extension. 
   */
  public fun arn(arn: String) {
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
   * S3](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html) in the
   * *AWS Identity and Access Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-logdeliverybucket)
   * @param logDeliveryBucket The S3 bucket to which CloudFormation delivers the contract test
   * execution logs. 
   */
  public fun logDeliveryBucket(logDeliveryBucket: String) {
    cdkBuilder.logDeliveryBucket(logDeliveryBucket)
  }

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
   * You cannot specify a version number the first time you publish a type. AWS CloudFormation
   * automatically sets the first version number to be `1.0.0` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html#cfn-cloudformation-publictypeversion-publicversionnumber)
   * @param publicVersionNumber The version number to assign to this version of the extension. 
   */
  public fun publicVersionNumber(publicVersionNumber: String) {
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
  public fun type(type: String) {
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
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnPublicTypeVersion = cdkBuilder.build()
}
