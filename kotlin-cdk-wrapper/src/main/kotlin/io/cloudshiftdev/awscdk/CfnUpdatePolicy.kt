@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
 * AWS::AutoScaling::AutoScalingGroup resource.
 *
 * AWS CloudFormation invokes one of three update policies depending on the type of change you make
 * or whether a
 * scheduled action is associated with the Auto Scaling group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnUpdatePolicy cfnUpdatePolicy = CfnUpdatePolicy.builder()
 * .autoScalingReplacingUpdate(CfnAutoScalingReplacingUpdate.builder()
 * .willReplace(false)
 * .build())
 * .autoScalingRollingUpdate(CfnAutoScalingRollingUpdate.builder()
 * .maxBatchSize(123)
 * .minInstancesInService(123)
 * .minSuccessfulInstancesPercent(123)
 * .pauseTime("pauseTime")
 * .suspendProcesses(List.of("suspendProcesses"))
 * .waitOnResourceSignals(false)
 * .build())
 * .autoScalingScheduledAction(CfnAutoScalingScheduledAction.builder()
 * .ignoreUnmodifiedGroupSizeProperties(false)
 * .build())
 * .codeDeployLambdaAliasUpdate(CfnCodeDeployLambdaAliasUpdate.builder()
 * .applicationName("applicationName")
 * .deploymentGroupName("deploymentGroupName")
 * // the properties below are optional
 * .afterAllowTrafficHook("afterAllowTrafficHook")
 * .beforeAllowTrafficHook("beforeAllowTrafficHook")
 * .build())
 * .enableVersionUpgrade(false)
 * .useOnlineResharding(false)
 * .build();
 * ```
 */
public interface CfnUpdatePolicy {
  /**
   * Specifies whether an Auto Scaling group and the instances it contains are replaced during an
   * update.
   *
   * During replacement,
   * AWS CloudFormation retains the old group until it finishes creating the new one. If the update
   * fails, AWS CloudFormation
   * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
   */
  public fun autoScalingReplacingUpdate(): CfnAutoScalingReplacingUpdate? =
      unwrap(this).getAutoScalingReplacingUpdate()?.let(CfnAutoScalingReplacingUpdate::wrap)

  /**
   * To specify how AWS CloudFormation handles rolling updates for an Auto Scaling group, use the
   * AutoScalingRollingUpdate policy.
   *
   * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are in
   * an Auto Scaling
   * group in batches or all at once.
   */
  public fun autoScalingRollingUpdate(): CfnAutoScalingRollingUpdate? =
      unwrap(this).getAutoScalingRollingUpdate()?.let(CfnAutoScalingRollingUpdate::wrap)

  /**
   * To specify how AWS CloudFormation handles updates for the MinSize, MaxSize, and DesiredCapacity
   * properties when the AWS::AutoScaling::AutoScalingGroup resource has an associated scheduled
   * action, use the AutoScalingScheduledAction policy.
   */
  public fun autoScalingScheduledAction(): CfnAutoScalingScheduledAction? =
      unwrap(this).getAutoScalingScheduledAction()?.let(CfnAutoScalingScheduledAction::wrap)

  /**
   * To perform an AWS CodeDeploy deployment when the version changes on an AWS::Lambda::Alias
   * resource, use the CodeDeployLambdaAliasUpdate update policy.
   */
  public fun codeDeployLambdaAliasUpdate(): CfnCodeDeployLambdaAliasUpdate? =
      unwrap(this).getCodeDeployLambdaAliasUpdate()?.let(CfnCodeDeployLambdaAliasUpdate::wrap)

  /**
   * To upgrade an Amazon ES domain to a new version of Elasticsearch rather than replacing the
   * entire AWS::Elasticsearch::Domain resource, use the EnableVersionUpgrade update policy.
   */
  public fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

  /**
   * To modify a replication group's shards by adding or removing shards, rather than replacing the
   * entire AWS::ElastiCache::ReplicationGroup resource, use the UseOnlineResharding update policy.
   */
  public fun useOnlineResharding(): Boolean? = unwrap(this).getUseOnlineResharding()

  /**
   * A builder for [CfnUpdatePolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingReplacingUpdate Specifies whether an Auto Scaling group and the instances
     * it contains are replaced during an update.
     * During replacement,
     * AWS CloudFormation retains the old group until it finishes creating the new one. If the
     * update fails, AWS CloudFormation
     * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
     */
    public fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate)

    /**
     * @param autoScalingReplacingUpdate Specifies whether an Auto Scaling group and the instances
     * it contains are replaced during an update.
     * During replacement,
     * AWS CloudFormation retains the old group until it finishes creating the new one. If the
     * update fails, AWS CloudFormation
     * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9295028b4bf917f5232bba8d006978ee8d823bd34a1070c622d4bc0f8fcca983")
    public
        fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate.Builder.() -> Unit)

    /**
     * @param autoScalingRollingUpdate To specify how AWS CloudFormation handles rolling updates for
     * an Auto Scaling group, use the AutoScalingRollingUpdate policy.
     * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are
     * in an Auto Scaling
     * group in batches or all at once.
     */
    public fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate)

    /**
     * @param autoScalingRollingUpdate To specify how AWS CloudFormation handles rolling updates for
     * an Auto Scaling group, use the AutoScalingRollingUpdate policy.
     * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are
     * in an Auto Scaling
     * group in batches or all at once.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a9ea3cbec2d08dcf140ff4470c95909986b1874b2511f5c1647775d302e4cec")
    public
        fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate.Builder.() -> Unit)

    /**
     * @param autoScalingScheduledAction To specify how AWS CloudFormation handles updates for the
     * MinSize, MaxSize, and DesiredCapacity properties when the AWS::AutoScaling::AutoScalingGroup
     * resource has an associated scheduled action, use the AutoScalingScheduledAction policy.
     */
    public fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction)

    /**
     * @param autoScalingScheduledAction To specify how AWS CloudFormation handles updates for the
     * MinSize, MaxSize, and DesiredCapacity properties when the AWS::AutoScaling::AutoScalingGroup
     * resource has an associated scheduled action, use the AutoScalingScheduledAction policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1b7d82b3b3d303975d080c4161a14ca8b852707a6a617e4c034961f6c565d17")
    public
        fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction.Builder.() -> Unit)

    /**
     * @param codeDeployLambdaAliasUpdate To perform an AWS CodeDeploy deployment when the version
     * changes on an AWS::Lambda::Alias resource, use the CodeDeployLambdaAliasUpdate update policy.
     */
    public
        fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate)

    /**
     * @param codeDeployLambdaAliasUpdate To perform an AWS CodeDeploy deployment when the version
     * changes on an AWS::Lambda::Alias resource, use the CodeDeployLambdaAliasUpdate update policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a985775f0ad132fa2a452a65d11fcd191a0dd165dd202ba61cb9278ca170ae73")
    public
        fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate.Builder.() -> Unit)

    /**
     * @param enableVersionUpgrade To upgrade an Amazon ES domain to a new version of Elasticsearch
     * rather than replacing the entire AWS::Elasticsearch::Domain resource, use the
     * EnableVersionUpgrade update policy.
     */
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    /**
     * @param useOnlineResharding To modify a replication group's shards by adding or removing
     * shards, rather than replacing the entire AWS::ElastiCache::ReplicationGroup resource, use the
     * UseOnlineResharding update policy.
     */
    public fun useOnlineResharding(useOnlineResharding: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnUpdatePolicy.Builder =
        software.amazon.awscdk.CfnUpdatePolicy.builder()

    /**
     * @param autoScalingReplacingUpdate Specifies whether an Auto Scaling group and the instances
     * it contains are replaced during an update.
     * During replacement,
     * AWS CloudFormation retains the old group until it finishes creating the new one. If the
     * update fails, AWS CloudFormation
     * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
     */
    override
        fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate) {
      cdkBuilder.autoScalingReplacingUpdate(autoScalingReplacingUpdate.let(CfnAutoScalingReplacingUpdate::unwrap))
    }

    /**
     * @param autoScalingReplacingUpdate Specifies whether an Auto Scaling group and the instances
     * it contains are replaced during an update.
     * During replacement,
     * AWS CloudFormation retains the old group until it finishes creating the new one. If the
     * update fails, AWS CloudFormation
     * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9295028b4bf917f5232bba8d006978ee8d823bd34a1070c622d4bc0f8fcca983")
    override
        fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate.Builder.() -> Unit):
        Unit = autoScalingReplacingUpdate(CfnAutoScalingReplacingUpdate(autoScalingReplacingUpdate))

    /**
     * @param autoScalingRollingUpdate To specify how AWS CloudFormation handles rolling updates for
     * an Auto Scaling group, use the AutoScalingRollingUpdate policy.
     * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are
     * in an Auto Scaling
     * group in batches or all at once.
     */
    override fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate) {
      cdkBuilder.autoScalingRollingUpdate(autoScalingRollingUpdate.let(CfnAutoScalingRollingUpdate::unwrap))
    }

    /**
     * @param autoScalingRollingUpdate To specify how AWS CloudFormation handles rolling updates for
     * an Auto Scaling group, use the AutoScalingRollingUpdate policy.
     * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are
     * in an Auto Scaling
     * group in batches or all at once.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a9ea3cbec2d08dcf140ff4470c95909986b1874b2511f5c1647775d302e4cec")
    override
        fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate.Builder.() -> Unit):
        Unit = autoScalingRollingUpdate(CfnAutoScalingRollingUpdate(autoScalingRollingUpdate))

    /**
     * @param autoScalingScheduledAction To specify how AWS CloudFormation handles updates for the
     * MinSize, MaxSize, and DesiredCapacity properties when the AWS::AutoScaling::AutoScalingGroup
     * resource has an associated scheduled action, use the AutoScalingScheduledAction policy.
     */
    override
        fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction) {
      cdkBuilder.autoScalingScheduledAction(autoScalingScheduledAction.let(CfnAutoScalingScheduledAction::unwrap))
    }

    /**
     * @param autoScalingScheduledAction To specify how AWS CloudFormation handles updates for the
     * MinSize, MaxSize, and DesiredCapacity properties when the AWS::AutoScaling::AutoScalingGroup
     * resource has an associated scheduled action, use the AutoScalingScheduledAction policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1b7d82b3b3d303975d080c4161a14ca8b852707a6a617e4c034961f6c565d17")
    override
        fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction.Builder.() -> Unit):
        Unit = autoScalingScheduledAction(CfnAutoScalingScheduledAction(autoScalingScheduledAction))

    /**
     * @param codeDeployLambdaAliasUpdate To perform an AWS CodeDeploy deployment when the version
     * changes on an AWS::Lambda::Alias resource, use the CodeDeployLambdaAliasUpdate update policy.
     */
    override
        fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate) {
      cdkBuilder.codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate.let(CfnCodeDeployLambdaAliasUpdate::unwrap))
    }

    /**
     * @param codeDeployLambdaAliasUpdate To perform an AWS CodeDeploy deployment when the version
     * changes on an AWS::Lambda::Alias resource, use the CodeDeployLambdaAliasUpdate update policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a985775f0ad132fa2a452a65d11fcd191a0dd165dd202ba61cb9278ca170ae73")
    override
        fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate.Builder.() -> Unit):
        Unit =
        codeDeployLambdaAliasUpdate(CfnCodeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate))

    /**
     * @param enableVersionUpgrade To upgrade an Amazon ES domain to a new version of Elasticsearch
     * rather than replacing the entire AWS::Elasticsearch::Domain resource, use the
     * EnableVersionUpgrade update policy.
     */
    override fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
      cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    /**
     * @param useOnlineResharding To modify a replication group's shards by adding or removing
     * shards, rather than replacing the entire AWS::ElastiCache::ReplicationGroup resource, use the
     * UseOnlineResharding update policy.
     */
    override fun useOnlineResharding(useOnlineResharding: Boolean) {
      cdkBuilder.useOnlineResharding(useOnlineResharding)
    }

    public fun build(): software.amazon.awscdk.CfnUpdatePolicy = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnUpdatePolicy,
  ) : CdkObject(cdkObject), CfnUpdatePolicy {
    /**
     * Specifies whether an Auto Scaling group and the instances it contains are replaced during an
     * update.
     *
     * During replacement,
     * AWS CloudFormation retains the old group until it finishes creating the new one. If the
     * update fails, AWS CloudFormation
     * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
     */
    override fun autoScalingReplacingUpdate(): CfnAutoScalingReplacingUpdate? =
        unwrap(this).getAutoScalingReplacingUpdate()?.let(CfnAutoScalingReplacingUpdate::wrap)

    /**
     * To specify how AWS CloudFormation handles rolling updates for an Auto Scaling group, use the
     * AutoScalingRollingUpdate policy.
     *
     * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are
     * in an Auto Scaling
     * group in batches or all at once.
     */
    override fun autoScalingRollingUpdate(): CfnAutoScalingRollingUpdate? =
        unwrap(this).getAutoScalingRollingUpdate()?.let(CfnAutoScalingRollingUpdate::wrap)

    /**
     * To specify how AWS CloudFormation handles updates for the MinSize, MaxSize, and
     * DesiredCapacity properties when the AWS::AutoScaling::AutoScalingGroup resource has an
     * associated scheduled action, use the AutoScalingScheduledAction policy.
     */
    override fun autoScalingScheduledAction(): CfnAutoScalingScheduledAction? =
        unwrap(this).getAutoScalingScheduledAction()?.let(CfnAutoScalingScheduledAction::wrap)

    /**
     * To perform an AWS CodeDeploy deployment when the version changes on an AWS::Lambda::Alias
     * resource, use the CodeDeployLambdaAliasUpdate update policy.
     */
    override fun codeDeployLambdaAliasUpdate(): CfnCodeDeployLambdaAliasUpdate? =
        unwrap(this).getCodeDeployLambdaAliasUpdate()?.let(CfnCodeDeployLambdaAliasUpdate::wrap)

    /**
     * To upgrade an Amazon ES domain to a new version of Elasticsearch rather than replacing the
     * entire AWS::Elasticsearch::Domain resource, use the EnableVersionUpgrade update policy.
     */
    override fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

    /**
     * To modify a replication group's shards by adding or removing shards, rather than replacing
     * the entire AWS::ElastiCache::ReplicationGroup resource, use the UseOnlineResharding update
     * policy.
     */
    override fun useOnlineResharding(): Boolean? = unwrap(this).getUseOnlineResharding()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUpdatePolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnUpdatePolicy): CfnUpdatePolicy =
        CdkObjectWrappers.wrap(cdkObject) as? CfnUpdatePolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUpdatePolicy): software.amazon.awscdk.CfnUpdatePolicy = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.CfnUpdatePolicy
  }
}
