@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for AppSync Source Api Association.
 */
public interface ISourceApiAssociation : IResource {
  /**
   * The association arn.
   */
  public fun associationArn(): String

  /**
   * The association id.
   */
  public fun associationId(): String

  /**
   * The merged api in the association.
   */
  public fun mergedApi(): IGraphqlApi

  /**
   * The source api in the association.
   */
  public fun sourceApi(): IGraphqlApi

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISourceApiAssociation):
        ISourceApiAssociation = CdkObjectWrappers.wrap(cdkObject) as ISourceApiAssociation

    internal fun unwrap(wrapped: ISourceApiAssociation):
        software.amazon.awscdk.services.appsync.ISourceApiAssociation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ISourceApiAssociation
  }
}
