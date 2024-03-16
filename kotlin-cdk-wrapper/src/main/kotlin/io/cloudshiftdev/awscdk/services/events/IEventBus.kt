@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IEventBus): IEventBus =
        CdkObjectWrappers.wrap(cdkObject) as IEventBus

    internal fun unwrap(wrapped: IEventBus): software.amazon.awscdk.services.events.IEventBus =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.IEventBus
  }
}
