@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A database instance.
 */
public interface IDatabaseInstance : IResource {
  /**
   * The instance endpoint address.
   */
  public fun dbInstanceEndpointAddress(): String

  /**
   * The instance endpoint port.
   */
  public fun dbInstanceEndpointPort(): String

  /**
   * The instance arn.
   */
  public fun instanceArn(): String

  /**
   * The instance endpoint.
   */
  public fun instanceEndpoint(): Endpoint

  /**
   * The instance identifier.
   */
  public fun instanceIdentifier(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.IDatabaseInstance):
        IDatabaseInstance = CdkObjectWrappers.wrap(cdkObject) as IDatabaseInstance

    internal fun unwrap(wrapped: IDatabaseInstance):
        software.amazon.awscdk.services.docdb.IDatabaseInstance = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.IDatabaseInstance
  }
}
