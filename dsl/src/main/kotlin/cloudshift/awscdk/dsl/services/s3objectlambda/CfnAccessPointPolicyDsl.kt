@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnAccessPointPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessPointPolicy.Builder = CfnAccessPointPolicy.Builder.create(scope,
      id)

  /**
   * An access point with an attached AWS Lambda function used to access transformed data from an
   * Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-objectlambdaaccesspoint)
   * @param objectLambdaAccessPoint An access point with an attached AWS Lambda function used to
   * access transformed data from an Amazon S3 bucket. 
   */
  public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
    cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
  }

  /**
   * Object Lambda Access Point resource policy document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-policydocument)
   * @param policyDocument Object Lambda Access Point resource policy document. 
   */
  public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.map)
  }

  /**
   * Object Lambda Access Point resource policy document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-policydocument)
   * @param policyDocument Object Lambda Access Point resource policy document. 
   */
  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  public fun build(): CfnAccessPointPolicy = cdkBuilder.build()
}
