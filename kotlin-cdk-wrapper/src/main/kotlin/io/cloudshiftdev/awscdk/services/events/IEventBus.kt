@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface which all EventBus based classes MUST implement.
 */
public interface IEventBus : IResource {
  /**
   * Create an EventBridge archive to send events to.
   *
   * When you create an archive, incoming events might not immediately start being sent to the
   * archive.
   * Allow a short period of time for changes to take effect.
   *
   * @param id 
   * @param props Properties of the archive. 
   */
  public fun archive(id: String, props: BaseArchiveProps): Archive

  /**
   * Create an EventBridge archive to send events to.
   *
   * When you create an archive, incoming events might not immediately start being sent to the
   * archive.
   * Allow a short period of time for changes to take effect.
   *
   * @param id 
   * @param props Properties of the archive. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("022c3ca8d5890e1ec18db540710cb5526fbb7150a28da5ba76fa1ad5de277488")
  public fun archive(id: String, props: BaseArchiveProps.Builder.() -> Unit): Archive

  /**
   * The ARN of this event bus resource.
   */
  public fun eventBusArn(): String

  /**
   * The physical ID of this event bus resource.
   */
  public fun eventBusName(): String

  /**
   * The JSON policy of this event bus resource.
   */
  public fun eventBusPolicy(): String

  /**
   * The partner event source to associate with this event bus resource.
   */
  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * Grants an IAM Principal to send custom events to the eventBus so that they can be matched to
   * rules.
   *
   * @param grantee The principal (no-op if undefined). 
   */
  public fun grantPutEventsTo(grantee: IGrantable): Grant

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.IEventBus,
  ) : CdkObject(cdkObject),
      IEventBus {
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
     * Create an EventBridge archive to send events to.
     *
     * When you create an archive, incoming events might not immediately start being sent to the
     * archive.
     * Allow a short period of time for changes to take effect.
     *
     * @param id 
     * @param props Properties of the archive. 
     */
    override fun archive(id: String, props: BaseArchiveProps): Archive = unwrap(this).archive(id,
        props.let(BaseArchiveProps.Companion::unwrap)).let(Archive::wrap)

    /**
     * Create an EventBridge archive to send events to.
     *
     * When you create an archive, incoming events might not immediately start being sent to the
     * archive.
     * Allow a short period of time for changes to take effect.
     *
     * @param id 
     * @param props Properties of the archive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("022c3ca8d5890e1ec18db540710cb5526fbb7150a28da5ba76fa1ad5de277488")
    override fun archive(id: String, props: BaseArchiveProps.Builder.() -> Unit): Archive =
        archive(id, BaseArchiveProps(props))

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
     * The ARN of this event bus resource.
     */
    override fun eventBusArn(): String = unwrap(this).getEventBusArn()

    /**
     * The physical ID of this event bus resource.
     */
    override fun eventBusName(): String = unwrap(this).getEventBusName()

    /**
     * The JSON policy of this event bus resource.
     */
    override fun eventBusPolicy(): String = unwrap(this).getEventBusPolicy()

    /**
     * The partner event source to associate with this event bus resource.
     */
    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()

    /**
     * Grants an IAM Principal to send custom events to the eventBus so that they can be matched to
     * rules.
     *
     * @param grantee The principal (no-op if undefined). 
     */
    override fun grantPutEventsTo(grantee: IGrantable): Grant =
        unwrap(this).grantPutEventsTo(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IEventBus): IEventBus =
        CdkObjectWrappers.wrap(cdkObject) as? IEventBus ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventBus): software.amazon.awscdk.services.events.IEventBus =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.IEventBus
  }
}
