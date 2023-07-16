@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.docdb.DatabaseInstanceProps
import software.amazon.awscdk.services.docdb.IDatabaseCluster
import software.amazon.awscdk.services.ec2.InstanceType

@CdkDslMarker
public class DatabaseInstancePropsDsl {
  private val cdkBuilder: DatabaseInstanceProps.Builder = DatabaseInstanceProps.builder()

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun cluster(cluster: IDatabaseCluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun dbInstanceName(dbInstanceName: String) {
    cdkBuilder.dbInstanceName(dbInstanceName)
  }

  public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
    cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
  }

  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun build(): DatabaseInstanceProps = cdkBuilder.build()
}
