@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Environment

/**
 * The deployment environment for a stack.
 *
 * Example:
 *
 * ```
 * // Passing a replication bucket created in a different stack.
 * App app = new App();
 * Stack replicationStack = Stack.Builder.create(app, "ReplicationStack")
 * .env(Environment.builder()
 * .region("us-west-1")
 * .build())
 * .build();
 * Key key = new Key(replicationStack, "ReplicationKey");
 * Bucket replicationBucket = Bucket.Builder.create(replicationStack, "ReplicationBucket")
 * // like was said above - replication buckets need a set physical name
 * .bucketName(PhysicalName.GENERATE_IF_NEEDED)
 * .encryptionKey(key)
 * .build();
 * // later...
 * // later...
 * Pipeline.Builder.create(replicationStack, "Pipeline")
 * .crossRegionReplicationBuckets(Map.of(
 * "us-west-1", replicationBucket))
 * .build();
 * ```
 */
@CdkDslMarker
public class EnvironmentDsl {
  private val cdkBuilder: Environment.Builder = Environment.builder()

  /**
   * @param account The AWS account ID for this environment.
   * This can be either a concrete value such as `585191031104` or `Aws.ACCOUNT_ID` which
   * indicates that account ID will only be determined during deployment (it
   * will resolve to the CloudFormation intrinsic `{"Ref":"AWS::AccountId"}`).
   * Note that certain features, such as cross-stack references and
   * environmental context providers require concrete region information and
   * will cause this stack to emit synthesis errors.
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param region The AWS region for this environment.
   * This can be either a concrete value such as `eu-west-2` or `Aws.REGION`
   * which indicates that account ID will only be determined during deployment
   * (it will resolve to the CloudFormation intrinsic `{"Ref":"AWS::Region"}`).
   * Note that certain features, such as cross-stack references and
   * environmental context providers require concrete region information and
   * will cause this stack to emit synthesis errors.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): Environment = cdkBuilder.build()
}
