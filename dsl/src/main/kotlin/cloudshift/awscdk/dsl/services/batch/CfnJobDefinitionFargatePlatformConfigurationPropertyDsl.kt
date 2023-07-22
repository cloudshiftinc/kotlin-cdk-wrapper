@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The platform configuration for jobs that are running on Fargate resources.
 *
 * Jobs that run on EC2 resources must not specify this parameter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * FargatePlatformConfigurationProperty fargatePlatformConfigurationProperty =
 * FargatePlatformConfigurationProperty.builder()
 * .platformVersion("platformVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-fargateplatformconfiguration.html)
 */
@CdkDslMarker
public class CfnJobDefinitionFargatePlatformConfigurationPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.FargatePlatformConfigurationProperty.Builder =
      CfnJobDefinition.FargatePlatformConfigurationProperty.builder()

  /**
   * @param platformVersion The AWS Fargate platform version where the jobs are running.
   * A platform version is specified only for jobs that are running on Fargate resources. If one
   * isn't specified, the `LATEST` platform version is used by default. This uses a recent, approved
   * version of the AWS Fargate platform for compute resources. For more information, see [AWS Fargate
   * platform
   * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
   * the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun platformVersion(platformVersion: String) {
    cdkBuilder.platformVersion(platformVersion)
  }

  public fun build(): CfnJobDefinition.FargatePlatformConfigurationProperty = cdkBuilder.build()
}
