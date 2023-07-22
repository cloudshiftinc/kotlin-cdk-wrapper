@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceHookConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.HookConfigurationProperty.Builder =
      CfnDataSource.HookConfigurationProperty.builder()

  /**
   * @param invocationCondition The condition used for when a Lambda function should be invoked.
   * For example, you can specify a condition that if there are empty date-time values, then Amazon
   * Kendra should invoke a function that inserts the current date-time.
   */
  public fun invocationCondition(invocationCondition: IResolvable) {
    cdkBuilder.invocationCondition(invocationCondition)
  }

  /**
   * @param invocationCondition The condition used for when a Lambda function should be invoked.
   * For example, you can specify a condition that if there are empty date-time values, then Amazon
   * Kendra should invoke a function that inserts the current date-time.
   */
  public
      fun invocationCondition(invocationCondition: CfnDataSource.DocumentAttributeConditionProperty) {
    cdkBuilder.invocationCondition(invocationCondition)
  }

  /**
   * @param lambdaArn The Amazon Resource Name (ARN) of a role with permission to run a Lambda
   * function during ingestion. 
   * For more information, see [IAM roles for Amazon
   * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
   */
  public fun lambdaArn(lambdaArn: String) {
    cdkBuilder.lambdaArn(lambdaArn)
  }

  /**
   * @param s3Bucket Stores the original, raw documents or the structured, parsed documents before
   * and after altering them. 
   * For more information, see [Data contracts for Lambda
   * functions](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda)
   * .
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun build(): CfnDataSource.HookConfigurationProperty = cdkBuilder.build()
}
