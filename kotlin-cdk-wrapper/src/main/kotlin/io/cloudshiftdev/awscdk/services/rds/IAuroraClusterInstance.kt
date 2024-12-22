@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * An Aurora Cluster Instance.
 */
public interface IAuroraClusterInstance : IResource {
  /**
   * The instance ARN.
   */
  public fun dbInstanceArn(): String

  /**
   * The instance endpoint address.
   */
  public fun dbInstanceEndpointAddress(): String

  /**
   * The instance resource ID.
   */
  public fun dbiResourceId(): String

  /**
   * The instance identifier.
   */
  public fun instanceIdentifier(): String

  /**
   * The instance size if the instance is a provisioned type.
   */
  public fun instanceSize(): String? = unwrap(this).getInstanceSize()

  /**
   * The AWS KMS key for encryption of Performance Insights data.
   */
  public fun performanceInsightEncryptionKey(): IKey? =
      unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

  /**
   * The amount of time, in days, to retain Performance Insights data.
   */
  public fun performanceInsightRetention(): PerformanceInsightRetention? =
      unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

  /**
   * Whether Performance Insights is enabled.
   */
  public fun performanceInsightsEnabled(): Boolean? = unwrap(this).getPerformanceInsightsEnabled()

  /**
   * The promotion tier the instance was created in.
   */
  public fun tier(): Number

  /**
   * The instance type (provisioned vs serverless v2).
   */
  public fun type(): InstanceType

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.IAuroraClusterInstance,
  ) : CdkObject(cdkObject),
      IAuroraClusterInstance {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The instance ARN.
     */
    override fun dbInstanceArn(): String = unwrap(this).getDbInstanceArn()

    /**
     * The instance endpoint address.
     */
    override fun dbInstanceEndpointAddress(): String = unwrap(this).getDbInstanceEndpointAddress()

    /**
     * The instance resource ID.
     */
    override fun dbiResourceId(): String = unwrap(this).getDbiResourceId()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The instance identifier.
     */
    override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    /**
     * The instance size if the instance is a provisioned type.
     */
    override fun instanceSize(): String? = unwrap(this).getInstanceSize()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The AWS KMS key for encryption of Performance Insights data.
     */
    override fun performanceInsightEncryptionKey(): IKey? =
        unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

    /**
     * The amount of time, in days, to retain Performance Insights data.
     */
    override fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

    /**
     * Whether Performance Insights is enabled.
     */
    override fun performanceInsightsEnabled(): Boolean? =
        unwrap(this).getPerformanceInsightsEnabled()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The promotion tier the instance was created in.
     */
    override fun tier(): Number = unwrap(this).getTier()

    /**
     * The instance type (provisioned vs serverless v2).
     */
    override fun type(): InstanceType = unwrap(this).getType().let(InstanceType::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IAuroraClusterInstance):
        IAuroraClusterInstance = CdkObjectWrappers.wrap(cdkObject) as? IAuroraClusterInstance ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAuroraClusterInstance):
        software.amazon.awscdk.services.rds.IAuroraClusterInstance = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.IAuroraClusterInstance
  }
}
