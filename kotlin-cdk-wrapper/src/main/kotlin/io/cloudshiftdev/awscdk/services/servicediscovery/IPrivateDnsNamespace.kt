@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 *
 */
public interface IPrivateDnsNamespace : INamespace {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IPrivateDnsNamespace):
        IPrivateDnsNamespace = CdkObjectWrappers.wrap(cdkObject) as IPrivateDnsNamespace

    internal fun unwrap(wrapped: IPrivateDnsNamespace):
        software.amazon.awscdk.services.servicediscovery.IPrivateDnsNamespace = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.IPrivateDnsNamespace
  }
}
