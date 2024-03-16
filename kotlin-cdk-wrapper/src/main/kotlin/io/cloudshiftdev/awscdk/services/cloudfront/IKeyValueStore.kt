@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A CloudFront Key Value Store.
 */
public interface IKeyValueStore : IResource {
  /**
   * The ARN of the Key Value Store.
   */
  public fun keyValueStoreArn(): String

  /**
   * The Unique ID of the Key Value Store.
   */
  public fun keyValueStoreId(): String

  /**
   * The status of the Key Value Store.
   */
  public fun keyValueStoreStatus(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IKeyValueStore):
        IKeyValueStore = CdkObjectWrappers.wrap(cdkObject) as IKeyValueStore

    internal fun unwrap(wrapped: IKeyValueStore):
        software.amazon.awscdk.services.cloudfront.IKeyValueStore = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.IKeyValueStore
  }
}
