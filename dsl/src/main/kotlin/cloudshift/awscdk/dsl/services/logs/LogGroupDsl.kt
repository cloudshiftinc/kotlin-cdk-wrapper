@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.DataProtectionPolicy
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.RetentionDays
import software.constructs.Construct

/**
 * Define a CloudWatch Log Group.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.logs.*;
 * LogGroup logGroup = new LogGroup(this, "Log Group");
 * Bucket logBucket = new Bucket(this, "S3 Bucket");
 * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
 * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
 * .releaseLabel(ReleaseLabel.EMR_6_2_0)
 * .jobDriver(JobDriver.builder()
 * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
 * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
 * .sparkSubmitParameters("--conf spark.executor.instances=2 --conf spark.executor.memory=2G --conf
 * spark.executor.cores=2 --conf spark.driver.cores=1")
 * .build())
 * .build())
 * .monitoring(Monitoring.builder()
 * .logGroup(logGroup)
 * .logBucket(logBucket)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class LogGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LogGroup.Builder = LogGroup.Builder.create(scope, id)

  /**
   * Data Protection Policy for this log group.
   *
   * Default: - no data protection policy
   *
   * @param dataProtectionPolicy Data Protection Policy for this log group. 
   */
  public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicyDsl.() -> Unit = {}) {
    val builder = DataProtectionPolicyDsl()
    builder.apply(dataProtectionPolicy)
    cdkBuilder.dataProtectionPolicy(builder.build())
  }

  /**
   * Data Protection Policy for this log group.
   *
   * Default: - no data protection policy
   *
   * @param dataProtectionPolicy Data Protection Policy for this log group. 
   */
  public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy) {
    cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
  }

  /**
   * The KMS customer managed key to encrypt the log group with.
   *
   * Default: Server-side encrpytion managed by the CloudWatch Logs service
   *
   * @param encryptionKey The KMS customer managed key to encrypt the log group with. 
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * Name of the log group.
   *
   * Default: Automatically generated
   *
   * @param logGroupName Name of the log group. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * Determine the removal policy of this log group.
   *
   * Normally you want to retain the log group so you can diagnose issues
   * from logs even after a deployment that no longer includes the log group.
   * In that case, use the normal date-based retention policy to age out your
   * logs.
   *
   * Default: RemovalPolicy.Retain
   *
   * @param removalPolicy Determine the removal policy of this log group. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * How long, in days, the log contents will be retained.
   *
   * To retain all logs, set this value to RetentionDays.INFINITE.
   *
   * Default: RetentionDays.TWO_YEARS
   *
   * @param retention How long, in days, the log contents will be retained. 
   */
  public fun retention(retention: RetentionDays) {
    cdkBuilder.retention(retention)
  }

  public fun build(): LogGroup = cdkBuilder.build()
}
