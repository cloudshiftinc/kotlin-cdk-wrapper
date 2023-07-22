@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import software.amazon.awscdk.CfnAutoScalingReplacingUpdate
import software.amazon.awscdk.CfnAutoScalingRollingUpdate
import software.amazon.awscdk.CfnAutoScalingScheduledAction
import software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate
import software.amazon.awscdk.CfnUpdatePolicy

@CdkDslMarker
public class CfnUpdatePolicyDsl {
  private val cdkBuilder: CfnUpdatePolicy.Builder = CfnUpdatePolicy.builder()

  /**
   * @param autoScalingReplacingUpdate Specifies whether an Auto Scaling group and the instances it
   * contains are replaced during an update.
   * During replacement,
   * AWS CloudFormation retains the old group until it finishes creating the new one. If the update
   * fails, AWS CloudFormation
   * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
   */
  public
      fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdateDsl.() -> Unit
      = {}) {
    val builder = CfnAutoScalingReplacingUpdateDsl()
    builder.apply(autoScalingReplacingUpdate)
    cdkBuilder.autoScalingReplacingUpdate(builder.build())
  }

  /**
   * @param autoScalingReplacingUpdate Specifies whether an Auto Scaling group and the instances it
   * contains are replaced during an update.
   * During replacement,
   * AWS CloudFormation retains the old group until it finishes creating the new one. If the update
   * fails, AWS CloudFormation
   * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
   */
  public fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate) {
    cdkBuilder.autoScalingReplacingUpdate(autoScalingReplacingUpdate)
  }

  /**
   * @param autoScalingRollingUpdate To specify how AWS CloudFormation handles rolling updates for
   * an Auto Scaling group, use the AutoScalingRollingUpdate policy.
   * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are in
   * an Auto Scaling
   * group in batches or all at once.
   */
  public
      fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdateDsl.() -> Unit
      = {}) {
    val builder = CfnAutoScalingRollingUpdateDsl()
    builder.apply(autoScalingRollingUpdate)
    cdkBuilder.autoScalingRollingUpdate(builder.build())
  }

  /**
   * @param autoScalingRollingUpdate To specify how AWS CloudFormation handles rolling updates for
   * an Auto Scaling group, use the AutoScalingRollingUpdate policy.
   * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are in
   * an Auto Scaling
   * group in batches or all at once.
   */
  public fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate) {
    cdkBuilder.autoScalingRollingUpdate(autoScalingRollingUpdate)
  }

  /**
   * @param autoScalingScheduledAction To specify how AWS CloudFormation handles updates for the
   * MinSize, MaxSize, and DesiredCapacity properties when the AWS::AutoScaling::AutoScalingGroup
   * resource has an associated scheduled action, use the AutoScalingScheduledAction policy.
   */
  public
      fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledActionDsl.() -> Unit
      = {}) {
    val builder = CfnAutoScalingScheduledActionDsl()
    builder.apply(autoScalingScheduledAction)
    cdkBuilder.autoScalingScheduledAction(builder.build())
  }

  /**
   * @param autoScalingScheduledAction To specify how AWS CloudFormation handles updates for the
   * MinSize, MaxSize, and DesiredCapacity properties when the AWS::AutoScaling::AutoScalingGroup
   * resource has an associated scheduled action, use the AutoScalingScheduledAction policy.
   */
  public fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction) {
    cdkBuilder.autoScalingScheduledAction(autoScalingScheduledAction)
  }

  /**
   * @param codeDeployLambdaAliasUpdate To perform an AWS CodeDeploy deployment when the version
   * changes on an AWS::Lambda::Alias resource, use the CodeDeployLambdaAliasUpdate update policy.
   */
  public
      fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdateDsl.() -> Unit
      = {}) {
    val builder = CfnCodeDeployLambdaAliasUpdateDsl()
    builder.apply(codeDeployLambdaAliasUpdate)
    cdkBuilder.codeDeployLambdaAliasUpdate(builder.build())
  }

  /**
   * @param codeDeployLambdaAliasUpdate To perform an AWS CodeDeploy deployment when the version
   * changes on an AWS::Lambda::Alias resource, use the CodeDeployLambdaAliasUpdate update policy.
   */
  public
      fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate) {
    cdkBuilder.codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate)
  }

  /**
   * @param enableVersionUpgrade To upgrade an Amazon ES domain to a new version of Elasticsearch
   * rather than replacing the entire AWS::Elasticsearch::Domain resource, use the EnableVersionUpgrade
   * update policy.
   */
  public fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
    cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
  }

  /**
   * @param useOnlineResharding To modify a replication group's shards by adding or removing shards,
   * rather than replacing the entire AWS::ElastiCache::ReplicationGroup resource, use the
   * UseOnlineResharding update policy.
   */
  public fun useOnlineResharding(useOnlineResharding: Boolean) {
    cdkBuilder.useOnlineResharding(useOnlineResharding)
  }

  public fun build(): CfnUpdatePolicy = cdkBuilder.build()
}
