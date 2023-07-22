@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties required when using Snowflake.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SnowflakeConnectorProfilePropertiesProperty snowflakeConnectorProfilePropertiesProperty =
 * SnowflakeConnectorProfilePropertiesProperty.builder()
 * .bucketName("bucketName")
 * .stage("stage")
 * .warehouse("warehouse")
 * // the properties below are optional
 * .accountName("accountName")
 * .bucketPrefix("bucketPrefix")
 * .privateLinkServiceName("privateLinkServiceName")
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileSnowflakeConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.builder()

  /**
   * @param accountName The name of the account.
   */
  public fun accountName(accountName: String) {
    cdkBuilder.accountName(accountName)
  }

  /**
   * @param bucketName The name of the Amazon S3 bucket associated with Snowflake. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix The bucket path that refers to the Amazon S3 bucket associated with
   * Snowflake.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param privateLinkServiceName The Snowflake Private Link service name to be used for private
   * data transfers.
   */
  public fun privateLinkServiceName(privateLinkServiceName: String) {
    cdkBuilder.privateLinkServiceName(privateLinkServiceName)
  }

  /**
   * @param region The AWS Region of the Snowflake account.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param stage The name of the Amazon S3 stage that was created while setting up an Amazon S3
   * stage in the Snowflake account. 
   * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;<Stage Name>.
   */
  public fun stage(stage: String) {
    cdkBuilder.stage(stage)
  }

  /**
   * @param warehouse The name of the Snowflake warehouse. 
   */
  public fun warehouse(warehouse: String) {
    cdkBuilder.warehouse(warehouse)
  }

  public fun build(): CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
