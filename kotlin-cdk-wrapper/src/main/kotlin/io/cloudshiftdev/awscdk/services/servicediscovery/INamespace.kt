@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface INamespace : IResource {
  /**
   * Namespace ARN for the Namespace.
   */
  public fun namespaceArn(): String

  /**
   * Namespace Id for the Namespace.
   */
  public fun namespaceId(): String

  /**
   * A name for the Namespace.
   */
  public fun namespaceName(): String

  /**
   * Type of Namespace.
   */
  public fun type(): NamespaceType

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.INamespace):
        INamespace = CdkObjectWrappers.wrap(cdkObject) as INamespace

    internal fun unwrap(wrapped: INamespace):
        software.amazon.awscdk.services.servicediscovery.INamespace = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.INamespace
  }
}
