@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupDeploymentPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.DeploymentProperty.Builder =
      CfnDeploymentGroup.DeploymentProperty.builder()

  /**
   * @param description A comment about the deployment.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param ignoreApplicationStopFailures If true, then if an `ApplicationStop` ,
   * `BeforeBlockTraffic` , or `AfterBlockTraffic` deployment lifecycle event to an instance fails,
   * then the deployment continues to the next deployment lifecycle event.
   * For example, if `ApplicationStop` fails, the deployment continues with DownloadBundle. If
   * `BeforeBlockTraffic` fails, the deployment continues with `BlockTraffic` . If `AfterBlockTraffic`
   * fails, the deployment continues with `ApplicationStop` .
   *
   * If false or not specified, then if a lifecycle event fails during a deployment to an instance,
   * that deployment fails. If deployment to that instance is part of an overall deployment and the
   * number of healthy hosts is not less than the minimum number of healthy hosts, then a deployment to
   * the next instance is attempted.
   *
   * During a deployment, the AWS CodeDeploy agent runs the scripts specified for `ApplicationStop`
   * , `BeforeBlockTraffic` , and `AfterBlockTraffic` in the AppSpec file from the previous successful
   * deployment. (All other scripts are run from the AppSpec file in the current deployment.) If one of
   * these scripts contains an error and does not run successfully, the deployment can fail.
   *
   * If the cause of the failure is a script from the last successful deployment that will never run
   * successfully, create a new deployment and use `ignoreApplicationStopFailures` to specify that the
   * `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` failures should be ignored.
   */
  public fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: Boolean) {
    cdkBuilder.ignoreApplicationStopFailures(ignoreApplicationStopFailures)
  }

  /**
   * @param ignoreApplicationStopFailures If true, then if an `ApplicationStop` ,
   * `BeforeBlockTraffic` , or `AfterBlockTraffic` deployment lifecycle event to an instance fails,
   * then the deployment continues to the next deployment lifecycle event.
   * For example, if `ApplicationStop` fails, the deployment continues with DownloadBundle. If
   * `BeforeBlockTraffic` fails, the deployment continues with `BlockTraffic` . If `AfterBlockTraffic`
   * fails, the deployment continues with `ApplicationStop` .
   *
   * If false or not specified, then if a lifecycle event fails during a deployment to an instance,
   * that deployment fails. If deployment to that instance is part of an overall deployment and the
   * number of healthy hosts is not less than the minimum number of healthy hosts, then a deployment to
   * the next instance is attempted.
   *
   * During a deployment, the AWS CodeDeploy agent runs the scripts specified for `ApplicationStop`
   * , `BeforeBlockTraffic` , and `AfterBlockTraffic` in the AppSpec file from the previous successful
   * deployment. (All other scripts are run from the AppSpec file in the current deployment.) If one of
   * these scripts contains an error and does not run successfully, the deployment can fail.
   *
   * If the cause of the failure is a script from the last successful deployment that will never run
   * successfully, create a new deployment and use `ignoreApplicationStopFailures` to specify that the
   * `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` failures should be ignored.
   */
  public fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: IResolvable) {
    cdkBuilder.ignoreApplicationStopFailures(ignoreApplicationStopFailures)
  }

  /**
   * @param revision Information about the location of stored application artifacts and the service
   * from which to retrieve them. 
   */
  public fun revision(revision: IResolvable) {
    cdkBuilder.revision(revision)
  }

  /**
   * @param revision Information about the location of stored application artifacts and the service
   * from which to retrieve them. 
   */
  public fun revision(revision: CfnDeploymentGroup.RevisionLocationProperty) {
    cdkBuilder.revision(revision)
  }

  public fun build(): CfnDeploymentGroup.DeploymentProperty = cdkBuilder.build()
}
