@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an instance of a DynamoDB table.
 */
public interface ITableV2 : ITable {
  /**
   * The ID of the table.
   */
  public fun tableId(): String? = unwrap(this).getTableId()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ITableV2): ITableV2 =
        CdkObjectWrappers.wrap(cdkObject) as ITableV2

    internal fun unwrap(wrapped: ITableV2): software.amazon.awscdk.services.dynamodb.ITableV2 =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.ITableV2
  }
}
