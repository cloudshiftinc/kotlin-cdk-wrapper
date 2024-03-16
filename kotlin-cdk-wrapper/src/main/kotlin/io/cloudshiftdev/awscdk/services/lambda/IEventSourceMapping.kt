@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an event source mapping for a lambda function.
 *
 * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html)
 */
public interface IEventSourceMapping : IResource {
  /**
   * The ARN of the event source mapping (i.e.
   * arn:aws:lambda:region:account-id:event-source-mapping/event-source-mapping-id).
   */
  public fun eventSourceMappingArn(): String

  /**
   * The identifier for this EventSourceMapping.
   */
  public fun eventSourceMappingId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSourceMapping):
        IEventSourceMapping = CdkObjectWrappers.wrap(cdkObject) as IEventSourceMapping

    internal fun unwrap(wrapped: IEventSourceMapping):
        software.amazon.awscdk.services.lambda.IEventSourceMapping = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IEventSourceMapping
  }
}
