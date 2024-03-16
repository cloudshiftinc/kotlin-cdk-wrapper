@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
   * Te promotion tier the instance was created in.
   */
  public fun tier(): Number

  /**
   * The instance type (provisioned vs serverless v2).
   */
  public fun type(): InstanceType

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IAuroraClusterInstance):
        IAuroraClusterInstance = CdkObjectWrappers.wrap(cdkObject) as IAuroraClusterInstance

    internal fun unwrap(wrapped: IAuroraClusterInstance):
        software.amazon.awscdk.services.rds.IAuroraClusterInstance = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.IAuroraClusterInstance
  }
}
