@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.DataIdentifier
import software.amazon.awscdk.services.logs.DataProtectionPolicyProps
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class DataProtectionPolicyPropsDsl {
  private val cdkBuilder: DataProtectionPolicyProps.Builder = DataProtectionPolicyProps.builder()

  private val _identifiers: MutableList<DataIdentifier> = mutableListOf()

  /**
   * @param deliveryStreamNameAuditDestination Amazon Kinesis Data Firehose delivery stream to send
   * audit findings to.
   * The delivery stream must already exist.
   */
  public fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String) {
    cdkBuilder.deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination)
  }

  /**
   * @param description Description of the data protection policy.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param identifiers List of data protection identifiers. 
   * Must be in the following list:
   * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/protect-sensitive-log-data-types.html
   */
  public fun identifiers(vararg identifiers: DataIdentifier) {
    _identifiers.addAll(listOf(*identifiers))
  }

  /**
   * @param identifiers List of data protection identifiers. 
   * Must be in the following list:
   * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/protect-sensitive-log-data-types.html
   */
  public fun identifiers(identifiers: Collection<DataIdentifier>) {
    _identifiers.addAll(identifiers)
  }

  /**
   * @param logGroupAuditDestination CloudWatch Logs log group to send audit findings to.
   * The log group must already exist prior to creating the data protection policy.
   */
  public fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup) {
    cdkBuilder.logGroupAuditDestination(logGroupAuditDestination)
  }

  /**
   * @param name Name of the data protection policy.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param s3BucketAuditDestination S3 bucket to send audit findings to.
   * The bucket must already exist.
   */
  public fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket) {
    cdkBuilder.s3BucketAuditDestination(s3BucketAuditDestination)
  }

  public fun build(): DataProtectionPolicyProps {
    if(_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
    return cdkBuilder.build()
  }
}
