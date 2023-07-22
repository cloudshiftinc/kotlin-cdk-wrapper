@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnParameter
import software.amazon.awscdk.services.lambda.CfnParametersCodeProps

@CdkDslMarker
public class CfnParametersCodePropsDsl {
  private val cdkBuilder: CfnParametersCodeProps.Builder = CfnParametersCodeProps.builder()

  /**
   * @param bucketNameParam The CloudFormation parameter that represents the name of the S3 Bucket
   * where the Lambda code will be located in.
   * Must be of type 'String'.
   */
  public fun bucketNameParam(bucketNameParam: CfnParameter) {
    cdkBuilder.bucketNameParam(bucketNameParam)
  }

  /**
   * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
   * Bucket where the Lambda code will be located at.
   * Must be of type 'String'.
   */
  public fun objectKeyParam(objectKeyParam: CfnParameter) {
    cdkBuilder.objectKeyParam(objectKeyParam)
  }

  public fun build(): CfnParametersCodeProps = cdkBuilder.build()
}
