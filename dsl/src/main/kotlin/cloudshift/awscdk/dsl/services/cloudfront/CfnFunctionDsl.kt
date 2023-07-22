@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnFunction
import software.constructs.Construct

@CdkDslMarker
public class CfnFunctionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFunction.Builder = CfnFunction.Builder.create(scope, id)

  /**
   * A flag that determines whether to automatically publish the function to the `LIVE` stage when
   * it’s created.
   *
   * To automatically publish to the `LIVE` stage, set this property to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
   * @param autoPublish A flag that determines whether to automatically publish the function to the
   * `LIVE` stage when it’s created. 
   */
  public fun autoPublish(autoPublish: Boolean) {
    cdkBuilder.autoPublish(autoPublish)
  }

  /**
   * A flag that determines whether to automatically publish the function to the `LIVE` stage when
   * it’s created.
   *
   * To automatically publish to the `LIVE` stage, set this property to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
   * @param autoPublish A flag that determines whether to automatically publish the function to the
   * `LIVE` stage when it’s created. 
   */
  public fun autoPublish(autoPublish: IResolvable) {
    cdkBuilder.autoPublish(autoPublish)
  }

  /**
   * The function code.
   *
   * For more information about writing a CloudFront function, see [Writing function code for
   * CloudFront
   * Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functioncode)
   * @param functionCode The function code. 
   */
  public fun functionCode(functionCode: String) {
    cdkBuilder.functionCode(functionCode)
  }

  /**
   * Contains configuration information about a CloudFront function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
   * @param functionConfig Contains configuration information about a CloudFront function. 
   */
  public fun functionConfig(functionConfig: IResolvable) {
    cdkBuilder.functionConfig(functionConfig)
  }

  /**
   * Contains configuration information about a CloudFront function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
   * @param functionConfig Contains configuration information about a CloudFront function. 
   */
  public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty) {
    cdkBuilder.functionConfig(functionConfig)
  }

  /**
   * Contains metadata about a CloudFront function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
   * @param functionMetadata Contains metadata about a CloudFront function. 
   */
  public fun functionMetadata(functionMetadata: IResolvable) {
    cdkBuilder.functionMetadata(functionMetadata)
  }

  /**
   * Contains metadata about a CloudFront function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
   * @param functionMetadata Contains metadata about a CloudFront function. 
   */
  public fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty) {
    cdkBuilder.functionMetadata(functionMetadata)
  }

  /**
   * A name to identify the function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-name)
   * @param name A name to identify the function. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnFunction = cdkBuilder.build()
}
