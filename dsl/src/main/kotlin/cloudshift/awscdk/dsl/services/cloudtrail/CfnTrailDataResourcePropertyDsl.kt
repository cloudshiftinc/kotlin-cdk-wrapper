@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@CdkDslMarker
public class CfnTrailDataResourcePropertyDsl {
  private val cdkBuilder: CfnTrail.DataResourceProperty.Builder =
      CfnTrail.DataResourceProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param type The resource type in which you want to log data events. 
   * You can specify the following *basic* event selector resource types:
   *
   * * `AWS::S3::Object`
   * * `AWS::Lambda::Function`
   * * `AWS::DynamoDB::Table`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param values An array of Amazon Resource Name (ARN) strings or partial ARN strings for the
   * specified objects.
   * * To log data events for all objects in all S3 buckets in your AWS account , specify the prefix
   * as `arn:aws:s3` .
   *
   *
   * This also enables logging of data event activity performed by any user or role in your AWS
   * account , even if that activity is performed on a bucket that belongs to another AWS account .
   *
   *
   * * To log data events for all objects in an S3 bucket, specify the bucket and an empty object
   * prefix such as `arn:aws:s3:::bucket-1/` . The trail logs data events for all objects in this S3
   * bucket.
   * * To log data events for specific objects, specify the S3 bucket and object prefix such as
   * `arn:aws:s3:::bucket-1/example-images` . The trail logs data events for objects in this S3 bucket
   * that match the prefix.
   * * To log data events for all Lambda functions in your AWS account , specify the prefix as
   * `arn:aws:lambda` .
   *
   *
   * This also enables logging of `Invoke` activity performed by any user or role in your AWS
   * account , even if that activity is performed on a function that belongs to another AWS account .
   *
   *
   * * To log data events for a specific Lambda function, specify the function ARN.
   *
   *
   * Lambda function ARNs are exact. For example, if you specify a function ARN
   * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* , data events will only be logged for
   * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* . They will not be logged for
   * *arn:aws:lambda:us-west-2:111111111111:function:helloworld2* .
   *
   *
   * * To log data events for all DynamoDB tables in your AWS account , specify the prefix as
   * `arn:aws:dynamodb` .
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values An array of Amazon Resource Name (ARN) strings or partial ARN strings for the
   * specified objects.
   * * To log data events for all objects in all S3 buckets in your AWS account , specify the prefix
   * as `arn:aws:s3` .
   *
   *
   * This also enables logging of data event activity performed by any user or role in your AWS
   * account , even if that activity is performed on a bucket that belongs to another AWS account .
   *
   *
   * * To log data events for all objects in an S3 bucket, specify the bucket and an empty object
   * prefix such as `arn:aws:s3:::bucket-1/` . The trail logs data events for all objects in this S3
   * bucket.
   * * To log data events for specific objects, specify the S3 bucket and object prefix such as
   * `arn:aws:s3:::bucket-1/example-images` . The trail logs data events for objects in this S3 bucket
   * that match the prefix.
   * * To log data events for all Lambda functions in your AWS account , specify the prefix as
   * `arn:aws:lambda` .
   *
   *
   * This also enables logging of `Invoke` activity performed by any user or role in your AWS
   * account , even if that activity is performed on a function that belongs to another AWS account .
   *
   *
   * * To log data events for a specific Lambda function, specify the function ARN.
   *
   *
   * Lambda function ARNs are exact. For example, if you specify a function ARN
   * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* , data events will only be logged for
   * *arn:aws:lambda:us-west-2:111111111111:function:helloworld* . They will not be logged for
   * *arn:aws:lambda:us-west-2:111111111111:function:helloworld2* .
   *
   *
   * * To log data events for all DynamoDB tables in your AWS account , specify the prefix as
   * `arn:aws:dynamodb` .
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnTrail.DataResourceProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
