@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetActionPropertyDsl {
  private val cdkBuilder: CfnDataset.ActionProperty.Builder = CfnDataset.ActionProperty.builder()

  /**
   * @param actionName The name of the data set action by which data set contents are automatically
   * created. 
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param containerAction Information which allows the system to run a containerized application
   * in order to create the data set contents.
   * The application must be in a Docker container along with any needed support libraries.
   */
  public fun containerAction(containerAction: IResolvable) {
    cdkBuilder.containerAction(containerAction)
  }

  /**
   * @param containerAction Information which allows the system to run a containerized application
   * in order to create the data set contents.
   * The application must be in a Docker container along with any needed support libraries.
   */
  public fun containerAction(containerAction: CfnDataset.ContainerActionProperty) {
    cdkBuilder.containerAction(containerAction)
  }

  /**
   * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to automatically
   * create data set contents.
   */
  public fun queryAction(queryAction: IResolvable) {
    cdkBuilder.queryAction(queryAction)
  }

  /**
   * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to automatically
   * create data set contents.
   */
  public fun queryAction(queryAction: CfnDataset.QueryActionProperty) {
    cdkBuilder.queryAction(queryAction)
  }

  public fun build(): CfnDataset.ActionProperty = cdkBuilder.build()
}
