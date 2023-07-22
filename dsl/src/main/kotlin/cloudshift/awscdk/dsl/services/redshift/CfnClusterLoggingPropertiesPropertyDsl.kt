@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnCluster

@CdkDslMarker
public class CfnClusterLoggingPropertiesPropertyDsl {
  private val cdkBuilder: CfnCluster.LoggingPropertiesProperty.Builder =
      CfnCluster.LoggingPropertiesProperty.builder()

  /**
   * @param bucketName The name of an existing S3 bucket where the log files are to be stored. 
   * Constraints:
   *
   * * Must be in the same region as the cluster
   * * The cluster must have read bucket and put object permissions
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param s3KeyPrefix The prefix applied to the log file names.
   * Constraints:
   *
   * * Cannot exceed 512 characters
   * * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (), or control
   * characters. The hexadecimal codes for invalid characters are:
   * * x00 to x20
   * * x22
   * * x27
   * * x5c
   * * x7f or larger
   */
  public fun s3KeyPrefix(s3KeyPrefix: String) {
    cdkBuilder.s3KeyPrefix(s3KeyPrefix)
  }

  public fun build(): CfnCluster.LoggingPropertiesProperty = cdkBuilder.build()
}
