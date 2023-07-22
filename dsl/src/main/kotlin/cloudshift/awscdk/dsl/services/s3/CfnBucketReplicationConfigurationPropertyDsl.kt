@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketReplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.ReplicationConfigurationProperty.Builder =
      CfnBucket.ReplicationConfigurationProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role
   * that Amazon S3 assumes when replicating objects. 
   * For more information, see [How to Set Up
   * Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html) in the
   * *Amazon S3 User Guide* .
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  /**
   * @param rules A container for one or more replication rules. 
   * A replication configuration must have at least one rule and can contain a maximum of 1,000
   * rules.
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules A container for one or more replication rules. 
   * A replication configuration must have at least one rule and can contain a maximum of 1,000
   * rules.
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules A container for one or more replication rules. 
   * A replication configuration must have at least one rule and can contain a maximum of 1,000
   * rules.
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnBucket.ReplicationConfigurationProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
