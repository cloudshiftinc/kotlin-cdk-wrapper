@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A record set.
 */
public interface IRecordSet : IResource {
  /**
   * The domain name of the record.
   */
  public fun domainName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IRecordSet): IRecordSet =
        CdkObjectWrappers.wrap(cdkObject) as IRecordSet

    internal fun unwrap(wrapped: IRecordSet): software.amazon.awscdk.services.route53.IRecordSet =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.route53.IRecordSet
  }
}
