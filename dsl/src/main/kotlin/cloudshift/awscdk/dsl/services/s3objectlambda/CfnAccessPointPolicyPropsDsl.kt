@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps

@CdkDslMarker
public class CfnAccessPointPolicyPropsDsl {
  private val cdkBuilder: CfnAccessPointPolicyProps.Builder = CfnAccessPointPolicyProps.builder()

  /**
   * @param objectLambdaAccessPoint An access point with an attached AWS Lambda function used to
   * access transformed data from an Amazon S3 bucket. 
   */
  public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
    cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
  }

  /**
   * @param policyDocument Object Lambda Access Point resource policy document. 
   */
  public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.map)
  }

  /**
   * @param policyDocument Object Lambda Access Point resource policy document. 
   */
  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  public fun build(): CfnAccessPointPolicyProps = cdkBuilder.build()
}
