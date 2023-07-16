@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileRedshiftConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.builder()

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  public fun dataApiRoleArn(dataApiRoleArn: String) {
    cdkBuilder.dataApiRoleArn(dataApiRoleArn)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun databaseUrl(databaseUrl: String) {
    cdkBuilder.databaseUrl(databaseUrl)
  }

  public fun isRedshiftServerless(isRedshiftServerless: Boolean) {
    cdkBuilder.isRedshiftServerless(isRedshiftServerless)
  }

  public fun isRedshiftServerless(isRedshiftServerless: IResolvable) {
    cdkBuilder.isRedshiftServerless(isRedshiftServerless)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun workgroupName(workgroupName: String) {
    cdkBuilder.workgroupName(workgroupName)
  }

  public fun build(): CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
