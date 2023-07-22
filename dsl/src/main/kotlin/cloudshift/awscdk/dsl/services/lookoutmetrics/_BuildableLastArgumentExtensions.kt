@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Action that will be triggered when there is an alert.
 */
public inline fun CfnAlert.setAction(block: CfnAlertActionPropertyDsl.() -> Unit = {}) {
  val builder = CfnAlertActionPropertyDsl()
  builder.apply(block)
  return setAction(builder.build())
}

/**
 * Contains information about the configuration of the anomaly detector.
 */
public inline
    fun CfnAnomalyDetector.setAnomalyDetectorConfig(block: CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl()
  builder.apply(block)
  return setAnomalyDetectorConfig(builder.build())
}
